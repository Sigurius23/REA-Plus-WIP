package io.seon.androidsdk.service;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;

/* JADX INFO: renamed from: io.seon.androidsdk.service.y0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20705y0 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C20654c1 f77518a;

    public C20705y0(C20654c1 c20654c1) {
        this.f77518a = c20654c1;
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr == null || fArr.length == 0) {
            return;
        }
        int type = sensorEvent.sensor.getType();
        C20654c1 c20654c1 = this.f77518a;
        if (type == 1) {
            c20654c1.f77259j.mo56787a(fArr);
            return;
        }
        if (type == 2) {
            c20654c1.f77263n.mo56787a(fArr);
            return;
        }
        if (type == 4) {
            c20654c1.f77260k.mo56787a(fArr);
        } else if (type == 5) {
            c20654c1.f77261l.mo56787a(fArr);
        } else {
            if (type != 8) {
                return;
            }
            c20654c1.f77262m.mo56787a(fArr);
        }
    }
}
