package ru.androidschool.intensiv.data

object MockRepository {

    fun getMovies(): List<Movie> {

        val moviesList = mutableListOf<Movie>()
        for (x in 0..10) {
            val movie = Movie(
                title = "Spider-Man $x",
                voteAverage = 10.0 - x
            )
            moviesList.add(movie)
        }

        return moviesList
    }

    fun getMovieDetails(): MovieDetails = MovieDetails(
        Movie(
            title = "Aquaman",
            voteAverage = 8.7
        ),
        description = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat."
    )

    fun getTvShows(): List<TvShow> {

        val tvShowsList = mutableListOf<TvShow>()
        for (x in 0..10) {
            val tvShow = TvShow(
                title = "Two pair of legs",
                voteAverage = 10.0 - x
            )
            tvShowsList.add(tvShow)
        }
        return tvShowsList
    }
}
