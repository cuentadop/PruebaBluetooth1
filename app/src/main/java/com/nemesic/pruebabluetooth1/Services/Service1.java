package com.nemesic.pruebabluetooth1.Services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class Service1 extends Service {
    public Service1() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
