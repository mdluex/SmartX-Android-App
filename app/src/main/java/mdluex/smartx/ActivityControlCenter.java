package mdluex.smartx;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;


public class ActivityControlCenter extends AppCompatActivity {

    private int room1_str = 1;
    private int room2_str = 0;
    private int room3_str = 1;
    private int room4_str = 1;
    private int room5_str = 1;
    private int room6_str = 1;
    String deviceName = "HC-05";
    BluetoothDevice result = null;
    BluetoothAdapter bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_control_center);

        if (bluetoothAdapter == null) {
            Toast.makeText(getApplicationContext(),"Device doesnt Support Bluetooth",Toast.LENGTH_SHORT).show();
        }
        if(!bluetoothAdapter.isEnabled())
        {
            Intent enableAdapter = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableAdapter, 0);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Set<BluetoothDevice> devices = bluetoothAdapter.getBondedDevices();
        if (devices != null) {
            for (BluetoothDevice device : devices) {
                if (deviceName.equals(device.getName())) {
                    result = device;
                    break;
                }
            }
        }

        final RelativeLayout room1_btn = (RelativeLayout) this.findViewById(R.id.room1_btn);
        final TextView room1_st = (TextView) this.findViewById(R.id.room1_st);
        final ImageView room1_img = (ImageView) this.findViewById(R.id.room1_img);
        room1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (room1_str == 0){
                    room1_str = 1;
                    room1_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room1_st.setText("ON");
                    room1_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room1_str = 0;
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
                    room2_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room2_st.setText("ON");
                    room2_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room2_str = 0;
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
                    room3_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room3_st.setText("ON");
                    room3_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room3_str = 0;
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
                    room4_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room4_st.setText("ON");
                    room4_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room4_str = 0;
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
                    room5_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room5_st.setText("ON");
                    room5_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room5_str = 0;
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
                    room6_btn.setBackgroundResource(R.drawable.btn_grid_nor);
                    room6_st.setText("ON");
                    room6_img.setImageResource(R.drawable.lamp_on);
                }
                else {
                    room6_str = 0;
                    room6_btn.setBackgroundResource(R.drawable.btn_grid_off);
                    room6_st.setText("OFF");
                    room6_img.setImageResource(R.drawable.lamp_off);
                }
            }
        });
    }
}

