package sg.edu.rp.c346.id18015059.mymovies;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends ArrayAdapter {

    Context parent_context;
    int layout_id;
    ArrayList<Movie> movieList;
    ArrayList<Movie> alMovie;

    public CustomAdapter(Context context, int resource, ArrayList<Movie> objects, ArrayList<Movie> objects2){
        super(context, resource, objects);
        parent_context = context;
        layout_id = resource;
        movieList = objects;
        alMovie = objects2;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id, parent, false);

        TextView tvTitle = rowView.findViewById(R.id.textViewTitle);
        TextView tvYear = rowView.findViewById(R.id.textViewYear);
        TextView tvGenre = rowView.findViewById(R.id.textViewGenre);
        ImageView ivMovie = rowView.findViewById(R.id.imageViewMovie);

        // Obtain the Android Version information based on the position
        Movie currentMovie = movieList.get(position);

        // Set values to the TextView to display the corresponding information
        tvTitle.setText(currentMovie.getTitle());
        tvYear.setText(""+currentMovie.getYear());
        tvGenre.setText(currentMovie.getGenre());

        Movie x = alMovie.get(position);

        if(x.getRated() == "g"){
            ivMovie.setImageResource(R.drawable.rating_g);
        }
        else if (x.getRated() == "pg"){
            ivMovie.setImageResource(R.drawable.rating_pg);
        }
        else if (x.getRated() == "pg13"){
            ivMovie.setImageResource(R.drawable.rating_pg13);
        }
        else if (x.getRated() == "nc16"){
            ivMovie.setImageResource(R.drawable.rating_nc16);
        }
        else if (x.getRated() == "m18"){
            ivMovie.setImageResource(R.drawable.rating_m18);
        }
        else{
            ivMovie.setImageResource(R.drawable.rating_r21);
        }


        return rowView;
    }


}
