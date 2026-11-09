package pkg;

public class Movie {
        private String movie;
        private double rating;
        private int ratingsnum;
        private int revenue;
    public Movie(){
        movie = "Avengers";
        rating = 8.0;
        ratingsnum = 33;
        revenue = 623357910;
    }
    public Movie(String Movie, double Rating, int ratingnums, int Revenue){
        movie = Movie;
        rating = Rating;
        ratingsnum = ratingnums;
        revenue = Revenue; // could also do This.revenue = revenue and set Revenue as revenue, This.___ chooses global.
    }

    public void movieToString(){
        System.out.println("Movie : " + movie);
        System.out.println("Rating : " + rating);
        System.out.println("Number of Ratings : " + ratingsnum);
        System.out.println("Revenue : " + revenue);
        System.out.println();
    }

    public String getMovieName(){
        return movie;
    }

    public double getRating(){
        return rating;
    }

    public int getRevenue(){
        return revenue;
    }
    public void addRating(double rate){
       rating = ((ratingsnum * rating) + rate) / ++ratingsnum;
    }
    public boolean compareRatings(Movie movieB){
        if (rating > movieB.getRating()){
           return true;
        } else {
            return false;
        }
    }

    
}