package sg.edu.rp.c346.id18015059.mymovies;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<Movie> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calendar date1 = Calendar.getInstance();
        date1.set(2020,07,14);

        lvMovie = findViewById(R.id.listViewMovies);
        alMovieList = new ArrayList<>();
        Movie item1 = new Movie("Avengers", 2012, "pg", "Action | Sci-Fi", date1 , "Golden Village - Bishan" );
        alMovieList.add(item1);


        caMovie = new CustomAdapter(this, R.layout.row,alMovieList, alMovieList);
        lvMovie.setAdapter(caMovie);

    }
}
