package mdb

class BootStrap {

    def init = { servletContext ->
        Movies movies = new Movies(
                userId: 1,
                title: "Interstellar",
                releaseYear : 2014,
                summary : "In the future, Earth is slowly becoming uninhabitable. Ex-NASA pilot Cooper, along with a team of researchers, is sent on a planet exploration mission to report which planet can sustain life.",
                genre : [ id: 18, name : "Sci-Fi" ],
                director : [ name: "Christopher Nolan" ]
        ).save();
        movies = new Movies(
                userId: 1,
                title: "Inception",
                releaseYear : 2010,
                summary : "Cobb steals information from his targets by entering their dreams. He is wanted for his alleged role in his wife's murder and his only chance at redemption is to perform the impossible, an inception.",
                genre : [ id: 18, name : "Sci-Fi" ],
                director : [ name: "Christopher Nolan" ]
        ).save();
        movies = new Movies(
                userId: 1,
                title: "Shawshank Redemption",
                releaseYear : 1994,
                summary : "Andy Dufresne, a successful banker, is arrested for the murders of his wife and her lover, and is sentenced to life imprisonment at the Shawshank prison. He becomes the most unconventional prisoner.",
                genre : [ id: 5, name : "Crime" ],
                director : [ name: "Frank Darabont" ]
        ).save();
        movies = new Movies(
                userId: 1,
                title: "Shooter",
                releaseYear : 2007,
                summary : "Bob Lee Swagger, one of the world's greatest marksmen, is recruited by a colonel to protect the president, but finds himself on the run when he is framed for the president's murder.",
                genre : [ id: 19, name : "Thriller" ],
                director : [ name: " Antoine Fuqua" ]
        ).save();
        movies = new Movies(
                userId: 1,
                title: "The Departed",
                releaseYear : 2006,
                summary : "An undercover agent and an espionage agent try to counter-attack each other in order to save themselves from being exposed in front of the authorities.",
                genre : [ id: 5, name : "Crime" ],
                director : [ name: "Martin Scorsese" ]
        ).save();

    };
    def destroy = {
    }
}
