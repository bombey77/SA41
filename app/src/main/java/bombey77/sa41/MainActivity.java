package bombey77.sa41;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String[] name = {"Aaron","Adaline","Adkyn","Alexis","Barbie","Elden","Laquisha","Nellie","Romeo","Walford"};
    private final String[] position = {"Recruitment Consultant","IT/Data Analytics Recruitment Consultant","Financial Services Recruitment Consultant","Accountancy/Finance Recruitment Consultant","Technology Recruitment Consultant","Risk and Compliance Recruitment Consultant","Financial Services Recruitment Consultant","IT Recruitment Manager (temp)","Project Manager, Connectivity XML","Recruitment Consultant"};
    private final int[] salary = {2500, 2600, 2100, 5300, 4500, 3300, 4200, 3500, 4600, 3400};

    TextView tvName, tvPosition, tvSalary;

    int[] colors = new int[2];


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        colors[0] = Color.parseColor("#e8d5f9");
        colors[1] = Color.WHITE;

        LayoutInflater layoutInflater = getLayoutInflater();

        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linLayout);

        for (int i = 0; i <name.length; i++) {
            View view = layoutInflater.inflate(R.layout.text, linearLayout, false);
            tvName = (TextView) view.findViewById(R.id.tvName);
            tvName.setText(name[i]);
            tvPosition = (TextView) view.findViewById(R.id.tvPosition);
            tvPosition.setText(position[i]);
            tvSalary = (TextView) view.findViewById(R.id.tvSalary);
            tvSalary.setText(String.valueOf(salary[i]));
            view.getLayoutParams().width = ViewGroup.LayoutParams.MATCH_PARENT;
            linearLayout.addView(view);
            view.setBackgroundColor(colors[i%2]);

        }


    }
}
