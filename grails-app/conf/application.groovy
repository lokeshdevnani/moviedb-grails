grails {
    plugin {
        springsecurity {

            rest {

                oauth {

                    frontendCallbackUrl = { String tokenValue -> "http://requestb.in/z0mtwoz0=${tokenValue}" }

                    facebook {

                        client = org.pac4j.oauth.client.FacebookClient
                        key = '247357032373109'
                        secret = '37332ea09efa9e4be3e4374da66f1be1'
                        scope = 'email,user_location'
                        fields = 'id,name,first_name,middle_name,last_name'
                        defaultRoles = ['ROLE_USER', 'ROLE_FACEBOOK']
                    }
                }
            }
        }
    }
}