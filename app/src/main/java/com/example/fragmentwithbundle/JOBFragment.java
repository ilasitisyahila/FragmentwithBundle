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
public class JOBFragment extends Fragment {
    private Bundle bundle;
    private Pegawai pegawainyaa;
    private TextView txtPekerjaan,txtLamaKerja,txtNama2;


    public JOBFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        bundle=getArguments();
        pegawainyaa= (Pegawai) bundle.getSerializable("bungkus2");
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view2 = inflater.inflate(R.layout.fragment_job, container, false);
        txtNama2 = (TextView)view2.findViewById(R.id.txt_nama2);
        txtPekerjaan = (TextView)view2.findViewById(R.id.txt_pekerjaan);
        txtLamaKerja = (TextView)view2.findViewById(R.id.txt_lama);
        return view2;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        txtNama2.setText(pegawainyaa.getNama());
        txtPekerjaan.setText(pegawainyaa.getPekerjaan());
        txtLamaKerja.setText(pegawainyaa.getLamaKerja());

    }

}
