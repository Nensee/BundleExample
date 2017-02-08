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
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nensee on 2/7/17.
 */
public class SecondPage extends Fragment
{
     Button btn1;
     EditText editText1;
     TextView txtvw;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.second_page,container,false);

        btn1= (Button) view.findViewById(R.id.button2);

        editText1=(EditText)view.findViewById(R.id.edtvw1);

        txtvw=(TextView)view.findViewById(R.id.txtvw1);


        final String  scnd = getArguments().getString("Key");

        txtvw.setText(scnd);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                final String thrd=editText1.getText().toString();

                ThirdPage t=new ThirdPage();

                FragmentManager fm = getFragmentManager();
                Bundle args = new Bundle();
                FragmentTransaction ft = fm.beginTransaction();

                args.putString("Keyy", thrd);
                args.putString("Key",scnd);
                t.setArguments(args);


                editText1.setText("");
                ft.replace(R.id.rltv,t);
                ft.addToBackStack("");
                ft.commit();
                //fm.popBackStack();

            }
        });

        return view;
    }
}

