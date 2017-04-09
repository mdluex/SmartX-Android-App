package mdluex.smartx;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.io.IOException;




public class ActivityControlCenter extends AppCompatActivity {

    private int room1_str = 0;
    private int room2_str = 0;
    private int room3_str = 0;
    private int room4_str = 0;
    private int room5_str = 0;
    private int room6_str = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_center);

        final RelativeLayout room1_btn = (RelativeLayout) this.findViewById(R.id.room1_btn);
        final TextView room1_st = (TextView) this.findViewById(R.id.room1_st);
        final ImageView room1_img = (ImageView) this.findViewById(R.id.room1_img);
        room1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room1_str == 0){
                    room1_str = 1;
                    SplashScreen.room1ON();
                    room1_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room1_st.setText("ON");
                    room1_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room1_str = 0;
                    SplashScreen.room1OFF();
                    room1_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room1_st.setText("OFF");
                    room1_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        final RelativeLayout room2_btn = (RelativeLayout) this.findViewById(R.id.room2_btn);
        final TextView room2_st = (TextView) this.findViewById(R.id.room2_st);
        final ImageView room2_img = (ImageView) this.findViewById(R.id.room2_img);
        room2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room2_str == 0){
                    room2_str = 1;
                    SplashScreen.room2ON();
                    room2_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room2_st.setText("ON");
                    room2_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room2_str = 0;
                    SplashScreen.room2OFF();
                    room2_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room2_st.setText("OFF");
                    room2_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        final RelativeLayout room3_btn = (RelativeLayout) this.findViewById(R.id.room3_btn);
        final TextView room3_st = (TextView) this.findViewById(R.id.room3_st);
        final ImageView room3_img = (ImageView) this.findViewById(R.id.room3_img);
        room3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room3_str == 0){
                    room3_str = 1;
                    SplashScreen.room3ON();
                    room3_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room3_st.setText("ON");
                    room3_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room3_str = 0;
                    SplashScreen.room3OFF();
                    room3_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room3_st.setText("OFF");
                    room3_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        final RelativeLayout room4_btn = (RelativeLayout) this.findViewById(R.id.room4_btn);
        final TextView room4_st = (TextView) this.findViewById(R.id.room4_st);
        final ImageView room4_img = (ImageView) this.findViewById(R.id.room4_img);
        room4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room4_str == 0){
                    room4_str = 1;
                    SplashScreen.room4ON();
                    room4_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room4_st.setText("ON");
                    room4_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room4_str = 0;
                    SplashScreen.room4OFF();
                    room4_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room4_st.setText("OFF");
                    room4_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        final RelativeLayout room5_btn = (RelativeLayout) this.findViewById(R.id.room5_btn);
        final TextView room5_st = (TextView) this.findViewById(R.id.room5_st);
        final ImageView room5_img = (ImageView) this.findViewById(R.id.room5_img);
        room5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room5_str == 0){
                    room5_str = 1;
                    SplashScreen.room5ON();
                    room5_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room5_st.setText("ON");
                    room5_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room5_str = 0;
                    SplashScreen.room5OFF();
                    room5_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room5_st.setText("OFF");
                    room5_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        final RelativeLayout room6_btn = (RelativeLayout) this.findViewById(R.id.room6_btn);
        final TextView room6_st = (TextView) this.findViewById(R.id.room6_st);
        final ImageView room6_img = (ImageView) this.findViewById(R.id.room6_img);
        room6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room6_str == 0){
                    room6_str = 1;
                    SplashScreen.room6ON();
                    room6_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room6_st.setText("ON");
                    room6_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room6_str = 0;
                    SplashScreen.room6OFF();
                    room6_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room6_st.setText("OFF");
                    room6_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });

        if (room1_str == 0){
            room1_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room1_st.setText("OFF");
            room1_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room1_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room1_st.setText("ON");
            room1_img.setImageResource(R.drawable.lamp_on);
        }

        if (room2_str == 0){
            room2_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room2_st.setText("OFF");
            room2_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room2_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room2_st.setText("ON");
            room2_img.setImageResource(R.drawable.lamp_on);
        }

        if (room3_str == 0){
            room3_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room3_st.setText("OFF");
            room3_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room3_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room3_st.setText("ON");
            room3_img.setImageResource(R.drawable.lamp_on);
        }

        if (room4_str == 0){
            room4_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room4_st.setText("OFF");
            room4_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room4_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room4_st.setText("ON");
            room4_img.setImageResource(R.drawable.lamp_on);
        }

        if (room5_str == 0){
            room5_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room5_st.setText("OFF");
            room5_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room5_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room5_st.setText("ON");
            room5_img.setImageResource(R.drawable.lamp_on);
        }

        if (room6_str == 0){
            room6_btn.setBackgroundResource(R.drawable.btn_grid_off);
            room6_st.setText("OFF");
            room6_img.setImageResource(R.drawable.lamp_off);
        }
        else {
            room6_btn.setBackgroundResource(R.drawable.btn_grid_nor);
            room6_st.setText("ON");
            room6_img.setImageResource(R.drawable.lamp_on);
        }

    }
    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        SplashScreen.appcls();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        SplashScreen.appcls();
    }
}

