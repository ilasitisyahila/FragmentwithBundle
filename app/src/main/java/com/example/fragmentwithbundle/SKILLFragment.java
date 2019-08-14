package com.example.fragmentwithbundle;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.fragmentwithbundle.Pegawai;
import com.example.fragmentwithbundle.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class SKILLFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawaiNyaa;
    private TextView txtNama3,txtAsalSekolah,txtKompetensi;


    public SKILLFragment() {
        // Required empty public constructor
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState){
     super.onCreate(savedInstanceState);
     bundle=getArguments();
        pegawaiNyaa= (Pegawai) bundle.getSerializable("bungkus3");
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_skill,container,false);
        txtNama3 = (TextView)view2.findViewById(R.id.txt_nama3);
        txtAsalSekolah = (TextView)view2.findViewById(R.id.txt_asal);
        txtKompetensi = (TextView)view2.findViewById(R.id.txt_kompetensi);
        return view2;
    }
    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama3.setText(pegawaiNyaa.getNama());
        txtAsalSekolah.setText(pegawaiNyaa.getAsalSekolah());
        txtKompetensi.setText(pegawaiNyaa.getKompetensi());
    }


    }
