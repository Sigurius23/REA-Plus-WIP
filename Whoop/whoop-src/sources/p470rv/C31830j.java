package p470rv;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.SystemClock;
import android.view.WindowManager;
import com.mapbox.maps.MapboxLogger;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p550vd.AbstractC35903f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: rv.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C31830j implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final WindowManager f131866a;

    /* JADX INFO: renamed from: b */
    public final SensorManager f131867b;

    /* JADX INFO: renamed from: c */
    public final LinkedHashSet f131868c;

    /* JADX INFO: renamed from: d */
    public final LinkedHashSet f131869d;

    /* JADX INFO: renamed from: e */
    public final Sensor f131870e;

    /* JADX INFO: renamed from: f */
    public final Sensor f131871f;

    /* JADX INFO: renamed from: g */
    public final Sensor f131872g;

    /* JADX INFO: renamed from: h */
    public final float[] f131873h;

    /* JADX INFO: renamed from: i */
    public float[] f131874i;

    /* JADX INFO: renamed from: j */
    public long f131875j;

    /* JADX INFO: renamed from: k */
    public float[] f131876k;

    /* JADX INFO: renamed from: l */
    public float[] f131877l;

    /* JADX INFO: renamed from: m */
    public final float[] f131878m;

    public C31830j(Context context) {
        Object systemService = context.getApplicationContext().getSystemService("window");
        AbstractC22676k.m65748h(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f131866a = (WindowManager) systemService;
        Object systemService2 = context.getApplicationContext().getSystemService("sensor");
        AbstractC22676k.m65748h(systemService2, "null cannot be cast to non-null type android.hardware.SensorManager");
        SensorManager sensorManager = (SensorManager) systemService2;
        this.f131867b = sensorManager;
        this.f131868c = new LinkedHashSet();
        this.f131869d = new LinkedHashSet();
        this.f131873h = new float[9];
        this.f131876k = new float[3];
        this.f131877l = new float[3];
        this.f131878m = new float[3];
        Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        this.f131870e = defaultSensor;
        if (defaultSensor == null) {
            MapboxLogger.logW("LocationCompassProvider", "Rotation vector sensor not supported on device, falling back to accelerometer and magnetic field.");
            this.f131871f = sensorManager.getDefaultSensor(1);
            this.f131872g = sensorManager.getDefaultSensor(2);
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        if (i13 == 0) {
            MapboxLogger.logW("LocationCompassProvider", "Compass sensor is unreliable, device calibration is needed.");
            Iterator it = this.f131869d.iterator();
            if (it.hasNext()) {
                throw AbstractC11266d.m30454h(it);
            }
        }
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent event) {
        int i13;
        int i14;
        AbstractC22676k.m65750j(event, "event");
        int type = event.sensor.getType();
        int i15 = 2;
        int i16 = 1;
        if (type == 1) {
            float[] fArr = event.values;
            AbstractC22676k.m65749i(fArr, "event.values");
            float[] fArr2 = this.f131876k;
            if (fArr2 != null) {
                int length = fArr.length;
                for (int i17 = 0; i17 < length; i17++) {
                    float f13 = fArr2[i17];
                    fArr2[i17] = AbstractC2875y.m8288a(fArr[i17], f13, 0.45f, f13);
                }
                fArr = fArr2;
            }
            this.f131876k = fArr;
        } else if (type == 2) {
            float[] fArr3 = event.values;
            AbstractC22676k.m65749i(fArr3, "event.values");
            float[] fArr4 = this.f131877l;
            if (fArr4 != null) {
                int length2 = fArr3.length;
                for (int i18 = 0; i18 < length2; i18++) {
                    float f14 = fArr4[i18];
                    fArr4[i18] = AbstractC2875y.m8288a(fArr3[i18], f14, 0.45f, f14);
                }
                fArr3 = fArr4;
            }
            this.f131877l = fArr3;
        } else if (type == 11) {
            this.f131874i = event.values;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime < this.f131875j) {
            return;
        }
        float[] fArr5 = this.f131874i;
        float[] fArr6 = this.f131873h;
        if (fArr5 != null) {
            SensorManager.getRotationMatrixFromVector(fArr6, fArr5);
        } else {
            SensorManager.getRotationMatrix(fArr6, null, this.f131876k, this.f131877l);
        }
        WindowManager windowManager = this.f131866a;
        int rotation = windowManager.getDefaultDisplay().getRotation();
        if (rotation == 1) {
            i13 = 2;
            i14 = 129;
        } else if (rotation == 2) {
            i13 = 129;
            i14 = 130;
        } else if (rotation != 3) {
            i14 = 2;
            i13 = 1;
        } else {
            i14 = 1;
            i13 = 130;
        }
        float[] fArr7 = new float[9];
        SensorManager.remapCoordinateSystem(fArr6, i13, i14, fArr7);
        float[] fArr8 = this.f131878m;
        SensorManager.getOrientation(fArr7, fArr8);
        double d3 = fArr8[1];
        if (d3 < -0.7853981633974483d) {
            int rotation2 = windowManager.getDefaultDisplay().getRotation();
            if (rotation2 == 1) {
                i15 = 3;
                i16 = 129;
            } else if (rotation2 == 2) {
                i16 = 131;
                i15 = 129;
            } else if (rotation2 != 3) {
                i15 = 1;
                i16 = 3;
            } else {
                i15 = 131;
            }
        } else if (d3 > 0.7853981633974483d) {
            int rotation3 = windowManager.getDefaultDisplay().getRotation();
            if (rotation3 == 1) {
                i15 = 131;
                i16 = 129;
            } else if (rotation3 == 2) {
                i16 = 3;
                i15 = 129;
            } else if (rotation3 != 3) {
                i15 = 1;
                i16 = 131;
            } else {
                i15 = 3;
            }
        } else if (Math.abs(fArr8[2]) > 1.5707963267948966d) {
            int rotation4 = windowManager.getDefaultDisplay().getRotation();
            if (rotation4 == 1) {
                i15 = 130;
                i16 = 129;
            } else if (rotation4 == 2) {
                i16 = 2;
                i15 = 129;
            } else if (rotation4 != 3) {
                i15 = 1;
                i16 = 130;
            }
        } else {
            i15 = i13;
            i16 = i14;
        }
        SensorManager.remapCoordinateSystem(fArr6, i15, i16, fArr7);
        SensorManager.getOrientation(fArr7, fArr8);
        float degrees = (float) Math.toDegrees(fArr8[0]);
        Iterator it = this.f131868c.iterator();
        while (it.hasNext()) {
            AbstractC35903f.m114004X(((C31828h) it.next()).f131862a, Double.valueOf(degrees));
        }
        this.f131875j = jElapsedRealtime + 500;
    }
}
