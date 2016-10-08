package ak.andro.app.akuhsampleapp;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import ak.andro.app.akuhsampleapp.samples.DeviceStatsActivity;
import ak.andro.app.akuhsampleapp.samples.LogMessagesActivity;

public class MainActivity extends AppCompatActivity {
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;
    }

    public void ActionClick(View view) {
        switch(view.getId())
        {
            case R.id.btn_log:
                startActivity(new Intent(mContext, LogMessagesActivity.class));
                break;
            case R.id.btn_device_stats:
                startActivity(new Intent(mContext, DeviceStatsActivity.class));
                break;
        }
    }
}