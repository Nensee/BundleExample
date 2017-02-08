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
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by nensee on 2/7/17.
 */
public class ThirdPage extends Fragment {

    private Button btn2;
    TextView textv,textv1;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.third_page,container,false);

        btn2= (Button) view.findViewById(R.id.button3);

        textv=(TextView) view.findViewById(R.id.txtvw2);
        textv1=(TextView) view.findViewById(R.id.txtvw3);

        String value = getArguments().getString("Key");
        String valuee = getArguments().getString("Keyy");

        textv.setText(value);
        textv1.setText(valuee);

        btn2.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                FirstPage f=new FirstPage();
                FragmentManager fm = getFragmentManager();

                //Bundle bundle = this.getArguments();
                //String value = bundle.getString("Key");



                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.rltv,f);

                fm.popBackStack();
                ft.commit();


            }
        });

        return view;
    }
}
