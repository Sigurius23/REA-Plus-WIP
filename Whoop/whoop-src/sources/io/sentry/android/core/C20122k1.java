package io.sentry.android.core;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.EnumC20436n5;
import io.sentry.InterfaceC20602v0;
import io.sentry.RunnableC20277c7;

/* JADX INFO: renamed from: io.sentry.android.core.k1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C20122k1 implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public SensorManager f75592a;

    /* JADX INFO: renamed from: b */
    public Sensor f75593b;

    /* JADX INFO: renamed from: c */
    public HandlerThread f75594c;

    /* JADX INFO: renamed from: d */
    public Handler f75595d;

    /* JADX INFO: renamed from: e */
    public volatile InterfaceC20081h1 f75596e;

    /* JADX INFO: renamed from: f */
    public InterfaceC20602v0 f75597f;

    /* JADX INFO: renamed from: g */
    public final C20119j1 f75598g;

    public C20122k1(InterfaceC20602v0 interfaceC20602v0) {
        C20119j1 c20119j1 = new C20119j1();
        c20119j1.f75586c = new C20121k0();
        this.f75598g = c20119j1;
        this.f75597f = interfaceC20602v0;
    }

    /* JADX INFO: renamed from: a */
    public final void m56023a(Context context) {
        if (this.f75592a == null) {
            this.f75592a = (SensorManager) context.getSystemService("sensor");
        }
        SensorManager sensorManager = this.f75592a;
        if (sensorManager != null && this.f75593b == null) {
            this.f75593b = sensorManager.getDefaultSensor(1, false);
        }
        if (this.f75593b == null || this.f75594c != null) {
            return;
        }
        HandlerThread handlerThread = new HandlerThread("sentry-shake");
        this.f75594c = handlerThread;
        handlerThread.start();
        this.f75595d = new Handler(this.f75594c.getLooper());
    }

    /* JADX INFO: renamed from: b */
    public final void m56024b(Activity activity, InterfaceC20081h1 interfaceC20081h1) {
        this.f75596e = interfaceC20081h1;
        m56023a(activity);
        SensorManager sensorManager = this.f75592a;
        if (sensorManager == null) {
            this.f75597f.mo16066m(EnumC20436n5.WARNING, "SensorManager is not available. Shake detection disabled.", new Object[0]);
            return;
        }
        Sensor sensor = this.f75593b;
        if (sensor == null) {
            this.f75597f.mo16066m(EnumC20436n5.WARNING, "Accelerometer sensor not available. Shake detection disabled.", new Object[0]);
        } else {
            sensorManager.registerListener(this, sensor, 3, this.f75595d);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m56025c() {
        this.f75596e = null;
        SensorManager sensorManager = this.f75592a;
        if (sensorManager != null) {
            sensorManager.unregisterListener(this);
        }
        Handler handler = this.f75595d;
        if (handler != null) {
            handler.post(new RunnableC20277c7(this, 6));
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i13;
        int i14;
        C20084i1 c20084i1;
        int i15;
        C20084i1 c20084i2;
        int i16 = 1;
        if (sensorEvent.sensor.getType() != 1) {
            return;
        }
        float[] fArr = sensorEvent.values;
        float f13 = fArr[0];
        float f14 = fArr[1];
        float f15 = fArr[2];
        boolean z4 = Math.sqrt((double) ((f15 * f15) + ((f14 * f14) + (f13 * f13)))) > 13.0d;
        C20119j1 c20119j1 = this.f75598g;
        long j7 = sensorEvent.timestamp;
        C20121k0 c20121k0 = (C20121k0) c20119j1.f75586c;
        long j13 = j7 - 500000000;
        while (true) {
            i13 = c20119j1.f75584a;
            if (i13 >= 4 && (c20084i2 = (C20084i1) c20119j1.f75587d) != null) {
                i14 = i16;
                if (j13 - c20084i2.f75445a <= 0) {
                    break;
                }
                if (c20084i2.f75446b) {
                    c20119j1.f75585b -= i14;
                }
                c20119j1.f75584a = i13 - 1;
                C20084i1 c20084i3 = c20084i2.f75447c;
                c20119j1.f75587d = c20084i3;
                if (c20084i3 == null) {
                    c20119j1.f75588e = null;
                }
                c20084i2.f75447c = (C20084i1) c20121k0.f75591a;
                c20121k0.f75591a = c20084i2;
                i16 = i14;
            } else {
                i14 = i16;
                break;
            }
        }
        C20084i1 c20084i4 = (C20084i1) c20121k0.f75591a;
        if (c20084i4 == null) {
            c20084i4 = new C20084i1();
        } else {
            c20121k0.f75591a = c20084i4.f75447c;
        }
        c20084i4.f75445a = j7;
        c20084i4.f75446b = z4;
        c20084i4.f75447c = null;
        C20084i1 c20084i5 = (C20084i1) c20119j1.f75588e;
        if (c20084i5 != null) {
            c20084i5.f75447c = c20084i4;
        }
        c20119j1.f75588e = c20084i4;
        if (((C20084i1) c20119j1.f75587d) == null) {
            c20119j1.f75587d = c20084i4;
        }
        c20119j1.f75584a = i13 + i14;
        if (z4) {
            c20119j1.f75585b += i14;
        }
        C20119j1 c20119j2 = this.f75598g;
        C20084i1 c20084i6 = (C20084i1) c20119j2.f75588e;
        if (c20084i6 == null || (c20084i1 = (C20084i1) c20119j2.f75587d) == null || (i15 = c20119j2.f75584a) < 4 || c20084i6.f75445a - c20084i1.f75445a < 250000000 || c20119j2.f75585b < (i15 >> 1) + (i15 >> 2)) {
            return;
        }
        while (true) {
            C20084i1 c20084i7 = (C20084i1) c20119j2.f75587d;
            if (c20084i7 == null) {
                break;
            }
            c20119j2.f75587d = c20084i7.f75447c;
            C20121k0 c20121k1 = (C20121k0) c20119j2.f75586c;
            c20084i7.f75447c = (C20084i1) c20121k1.f75591a;
            c20121k1.f75591a = c20084i7;
        }
        c20119j2.f75588e = null;
        c20119j2.f75584a = 0;
        c20119j2.f75585b = 0;
        InterfaceC20081h1 interfaceC20081h1 = this.f75596e;
        if (interfaceC20081h1 != null) {
            interfaceC20081h1.mo13593e();
        }
    }
}
