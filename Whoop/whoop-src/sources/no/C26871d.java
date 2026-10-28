package no;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.opengl.Matrix;
import android.view.Display;
import p031b9.C2817b;
import p484s9.InterfaceC32278c;

/* JADX INFO: renamed from: no.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C26871d implements SensorEventListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f107222a;

    /* JADX INFO: renamed from: b */
    public final float[] f107223b;

    /* JADX INFO: renamed from: c */
    public final float[] f107224c;

    /* JADX INFO: renamed from: d */
    public final float[] f107225d;

    /* JADX INFO: renamed from: e */
    public final float[] f107226e;

    /* JADX INFO: renamed from: f */
    public final Display f107227f;

    /* JADX INFO: renamed from: g */
    public boolean f107228g;

    /* JADX INFO: renamed from: h */
    public final Object[] f107229h;

    public C26871d(Display display, InterfaceC26870c[] interfaceC26870cArr) {
        this.f107222a = 0;
        this.f107223b = new float[16];
        this.f107224c = new float[16];
        this.f107225d = new float[16];
        this.f107226e = new float[3];
        this.f107227f = display;
        this.f107229h = interfaceC26870cArr;
    }

    /* JADX INFO: renamed from: a */
    private final void m80224a(Sensor sensor, int i13) {
    }

    /* JADX INFO: renamed from: b */
    private final void m80225b(Sensor sensor, int i13) {
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i13) {
        int i14 = this.f107222a;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        int i13;
        int i14;
        switch (this.f107222a) {
            case 0:
                float[] fArr = sensorEvent.values;
                float[] fArr2 = this.f107223b;
                SensorManager.getRotationMatrixFromVector(fArr2, fArr);
                int rotation = this.f107227f.getRotation();
                float[] fArr3 = this.f107224c;
                if (rotation != 0) {
                    int i15 = 129;
                    if (rotation != 1) {
                        i13 = 130;
                        if (rotation != 2) {
                            if (rotation != 3) {
                                throw new IllegalStateException();
                            }
                            i15 = 130;
                            i13 = 1;
                        }
                    } else {
                        i13 = 129;
                        i15 = 2;
                    }
                    System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                    SensorManager.remapCoordinateSystem(fArr3, i15, i13, fArr2);
                }
                SensorManager.remapCoordinateSystem(fArr2, 1, 131, fArr3);
                float[] fArr4 = this.f107226e;
                SensorManager.getOrientation(fArr3, fArr4);
                float f13 = fArr4[2];
                Matrix.rotateM(fArr2, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                boolean z4 = this.f107228g;
                float[] fArr5 = this.f107225d;
                if (!z4) {
                    C2817b.m8002g(fArr5, fArr2);
                    this.f107228g = true;
                }
                System.arraycopy(fArr2, 0, fArr3, 0, fArr3.length);
                Matrix.multiplyMM(fArr2, 0, fArr3, 0, fArr5, 0);
                InterfaceC26870c[] interfaceC26870cArr = (InterfaceC26870c[]) this.f107229h;
                for (int i16 = 0; i16 < 2; i16++) {
                    interfaceC26870cArr[i16].mo80223a(fArr2, f13);
                }
                return;
            default:
                float[] fArr6 = sensorEvent.values;
                float[] fArr7 = this.f107223b;
                SensorManager.getRotationMatrixFromVector(fArr7, fArr6);
                int rotation2 = this.f107227f.getRotation();
                float[] fArr8 = this.f107224c;
                if (rotation2 != 0) {
                    int i17 = 129;
                    if (rotation2 != 1) {
                        i14 = 130;
                        if (rotation2 != 2) {
                            if (rotation2 != 3) {
                                throw new IllegalStateException();
                            }
                            i17 = 130;
                            i14 = 1;
                        }
                    } else {
                        i14 = 129;
                        i17 = 2;
                    }
                    System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                    SensorManager.remapCoordinateSystem(fArr8, i17, i14, fArr7);
                }
                SensorManager.remapCoordinateSystem(fArr7, 1, 131, fArr8);
                float[] fArr9 = this.f107226e;
                SensorManager.getOrientation(fArr8, fArr9);
                float f14 = fArr9[2];
                Matrix.rotateM(fArr7, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                boolean z13 = this.f107228g;
                float[] fArr10 = this.f107225d;
                if (!z13) {
                    C2817b.m8003h(fArr10, fArr7);
                    this.f107228g = true;
                }
                System.arraycopy(fArr7, 0, fArr8, 0, fArr8.length);
                Matrix.multiplyMM(fArr7, 0, fArr8, 0, fArr10, 0);
                InterfaceC32278c[] interfaceC32278cArr = (InterfaceC32278c[]) this.f107229h;
                for (int i18 = 0; i18 < 2; i18++) {
                    interfaceC32278cArr[i18].mo80223a(fArr7, f14);
                }
                return;
        }
    }

    public C26871d(Display display, InterfaceC32278c[] interfaceC32278cArr) {
        this.f107222a = 1;
        this.f107223b = new float[16];
        this.f107224c = new float[16];
        this.f107225d = new float[16];
        this.f107226e = new float[3];
        this.f107227f = display;
        this.f107229h = interfaceC32278cArr;
    }
}
