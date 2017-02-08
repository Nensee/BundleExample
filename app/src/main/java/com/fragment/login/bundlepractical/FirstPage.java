package com.fragment.login.bundlepractical;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by nensee on 2/7/17.
 */
public class FirstPage extends Fragment {
    private Button btn1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.first_page,container,false);
        btn1= (Button) view.findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondPage s=new SecondPage();

                FragmentManager fm = getFragmentManager();
                Bundle args = new Bundle();



                FragmentTransaction ft = fm.beginTransaction();
                args.putString("Key", "edtvw");
                s.setArguments(args);
                ft.replace(R.id.rltv,s);
                ft.addToBackStack("");
                ft.commit();
                //fm.popBackStack();

            }
        });

        return view;
    }
}
