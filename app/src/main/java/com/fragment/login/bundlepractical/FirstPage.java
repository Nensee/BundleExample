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

/**
 * Created by nensee on 2/7/17.
 */
public class FirstPage extends Fragment {
    private Button btn;
    private EditText editText;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view =inflater.inflate(R.layout.first_page,container,false);
        btn= (Button) view.findViewById(R.id.button1);
        editText=(EditText)view.findViewById(R.id.edtvw);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                SecondPage s=new SecondPage();
                String str=editText.getText().toString();

                FragmentManager fm = getFragmentManager();
                Bundle args = new Bundle();
                FragmentTransaction ft = fm.beginTransaction();
                args.putString("Key",str);
                s.setArguments(args);

                editText.setText("");
                ft.replace(R.id.rltv,s);
                ft.addToBackStack("");
                ft.commit();
                //fm.popBackStack();

            }
        });

        return view;
    }
}
