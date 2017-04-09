package mdluex.smartx;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Set;
import java.util.UUID;


public class SplashScreen extends AppCompatActivity {

    public static String deviceAddress = "20:16:07:25:13:60";
    public static BluetoothDevice result = null;
    public static BluetoothAdapter bluetoothAdapter=BluetoothAdapter.getDefaultAdapter();
    public static BluetoothSocket socket;
    public static OutputStream outputStream;
    public static InputStream inputStream;
    public static final UUID PORT_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");//Serial Port Service ID

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        final RelativeLayout conn_ttl = (RelativeLayout) this.findViewById(R.id.conn_ttl);
        final RelativeLayout srch_ttl = (RelativeLayout) this.findViewById(R.id.srch_ttl);
        final Button splash_btn=(Button)findViewById(R.id.splash_btn);
        splash_btn.setEnabled(false);

        getWindow().getDecorView().post(new Runnable() {

            @Override
            public void run() {
                final Handler handler = new Handler();
                handler.postDelayed(new Runnable() {
                    @Override
                    public void run() {

                        Set<BluetoothDevice> devices = bluetoothAdapter.getBondedDevices();
                        if (devices != null) {
                            for (BluetoothDevice device : devices) {
                                if (deviceAddress.equals(device.getAddress())) {
                                    Toast.makeText(getApplicationContext(),"SamrtX is available ",Toast.LENGTH_SHORT).show();
                                    result = device;
                                    boolean connected=true;
                                    try {
                                        socket = result.createRfcommSocketToServiceRecord(PORT_UUID);
                                        socket.connect();
                                        Toast.makeText(getApplicationContext(),"Connected",Toast.LENGTH_SHORT).show();
                                    } catch (IOException e) {
                                        e.printStackTrace();
                                        connected=false;
                                        Toast.makeText(getApplicationContext(),"Connection Error",Toast.LENGTH_SHORT).show();
                                    }
                                    if(connected)
                                    {
                                        conn_ttl.setVisibility(View.VISIBLE);
                                        srch_ttl.setVisibility(View.INVISIBLE);
                                        splash_btn.setEnabled(true);
                                        splash_btn.setBackgroundResource(R.drawable.btn_splash_nor);
                                        try {
                                            outputStream=socket.getOutputStream();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                        try {
                                            inputStream=socket.getInputStream();
                                        } catch (IOException e) {
                                            e.printStackTrace();
                                        }
                                    }
                                    break;
                                }
                            }
                        }
                    }
                }, 1500);

                splash_btn.setOnClickListener(new View.OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        Intent acc=new Intent(getApplicationContext(),ActivityControlCenter.class);
                        startActivity(acc);
                        appopn();
                    }
                });
            }

        });

    }

    public static void appopn(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("9".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void appcls(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("0".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

        public static void room1ON(){
            if (socket!=null)
            {
                try
                {
                    socket.getOutputStream().write("5".toString().getBytes());
                }
                catch (IOException e)
                {
                    //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
                }
            }
        }

        public static void room1OFF(){
            if (socket!=null)
            {
                try
                {
                    socket.getOutputStream().write("6".toString().getBytes());
                }
                catch (IOException e)
                {
                    //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
                }
            }
        }

    public static void room2ON(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("e".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room2OFF(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("r".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room3ON(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("1".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room3OFF(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("2".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room4ON(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("m".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room4OFF(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("t".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room5ON(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("3".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room5OFF(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("4".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room6ON(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("7".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    public static void room6OFF(){
        if (socket!=null)
        {
            try
            {
                socket.getOutputStream().write("8".toString().getBytes());
            }
            catch (IOException e)
            {
                //Toast.makeText(getApplicationContext(),"Post Error",Toast.LENGTH_SHORT).show();
            }
        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Intent.ACTION_MAIN);
        intent.addCategory(Intent.CATEGORY_HOME);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
        appcls();
    }
    @Override
    public void onDestroy() {
        super.onDestroy();
        appcls();
    }
}
