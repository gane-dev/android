package com.example.ganesh.myapplication
import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.support.annotation.Nullable
import android.widget.Toast

/**
 * Created by ganesh on 7/19/2017.
 */
class MyService {

    class MyService : Service() {
       override  fun  onBind( intent:Intent?):IBinder? {
           val b: IBinder? = null
           return b
        }

        override onStartCommand( intent:Intent?,  flags: Int? , startId: Int? ): Int {
            // Let it continue running until it is stopped.
            Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show()
            return START_STICKY
        }

        @Override
        public void onDestroy() {
            super.onDestroy();
            Toast.makeText(this, "Service Destroyed", Toast.LENGTH_LONG).show();
        }
}