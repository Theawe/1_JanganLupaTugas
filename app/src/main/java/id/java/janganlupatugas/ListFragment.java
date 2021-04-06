package id.java.janganlupatugas;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import id.java.janganlupatugas.MyAdapter;
import id.java.janganlupatugas.R;


public class ListFragment extends Fragment {

    String s1[], s2[],s3[];
    RecyclerView recyclerview;

    public ListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        s1 = getResources().getStringArray(R.array.list_tugas);
        s2 = getResources().getStringArray(R.array.deskripsi);
        s3 = getResources().getStringArray(R.array.tanggal);
        View view = inflater.inflate(R.layout.fragment_list, container, false);
        MyAdapter myAdapter = new MyAdapter(getContext(), s1,s2,s3);
        recyclerview = view.findViewById(R.id.recyclerView);
        recyclerview.setAdapter(myAdapter);
        recyclerview.setLayoutManager(new LinearLayoutManager(getContext()));
        return view;
    }
}