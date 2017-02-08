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
public class ThirdPage extends Fragment {

    private Button btn1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.third_page,container,false);
        btn1= (Button) view.findViewById(R.id.button3);
        btn1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                FirstPage f=new FirstPage();
                FragmentManager fm = getFragmentManager();

                //Bundle bundle = this.getArguments();
                //String value = bundle.getString("Key");

                String value = getArguments().getString("Key");
                String valuee = getArguments().getString("Keyy");
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.rltv,f);

                fm.popBackStack();
                ft.commit();


            }
        });

        return view;
    }
}
