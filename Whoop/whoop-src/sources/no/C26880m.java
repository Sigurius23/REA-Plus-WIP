package no;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.view.Surface;
import android.view.View;
import android.view.WindowManager;
import java.util.concurrent.CopyOnWriteArrayList;
import lr.RunnableC24693e;
import mo.InterfaceC25730k;
import p309lo.AbstractC24567y;

/* JADX INFO: renamed from: no.m */
/* JADX INFO: loaded from: classes6.dex */
public final class C26880m extends GLSurfaceView {

    /* JADX INFO: renamed from: E */
    public final Handler f107281E;

    /* JADX INFO: renamed from: F */
    public final C26878k f107282F;

    /* JADX INFO: renamed from: G */
    public SurfaceTexture f107283G;

    /* JADX INFO: renamed from: H */
    public Surface f107284H;

    /* JADX INFO: renamed from: I */
    public boolean f107285I;

    /* JADX INFO: renamed from: J */
    public boolean f107286J;

    /* JADX INFO: renamed from: K */
    public boolean f107287K;

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArrayList f107288w;

    /* JADX INFO: renamed from: x */
    public final SensorManager f107289x;

    /* JADX INFO: renamed from: y */
    public final Sensor f107290y;

    /* JADX INFO: renamed from: z */
    public final C26871d f107291z;

    public C26880m(Context context) {
        super(context, null);
        this.f107288w = new CopyOnWriteArrayList();
        this.f107281E = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f107289x = sensorManager;
        Sensor defaultSensor = AbstractC24567y.f95875a >= 18 ? sensorManager.getDefaultSensor(15) : null;
        this.f107290y = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C26878k c26878k = new C26878k();
        this.f107282F = c26878k;
        C26879l c26879l = new C26879l(this, c26878k);
        View.OnTouchListener viewOnTouchListenerC26881n = new ViewOnTouchListenerC26881n(context, c26879l);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f107291z = new C26871d(windowManager.getDefaultDisplay(), new InterfaceC26870c[]{viewOnTouchListenerC26881n, c26879l});
        this.f107285I = true;
        setEGLContextClientVersion(2);
        setRenderer(c26879l);
        setOnTouchListener(viewOnTouchListenerC26881n);
    }

    /* JADX INFO: renamed from: a */
    public final void m80229a() {
        boolean z4 = this.f107285I && this.f107286J;
        Sensor sensor = this.f107290y;
        if (sensor == null || z4 == this.f107287K) {
            return;
        }
        C26871d c26871d = this.f107291z;
        SensorManager sensorManager = this.f107289x;
        if (z4) {
            sensorManager.registerListener(c26871d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c26871d);
        }
        this.f107287K = z4;
    }

    public InterfaceC26868a getCameraMotionListener() {
        return this.f107282F;
    }

    public InterfaceC25730k getVideoFrameMetadataListener() {
        return this.f107282F;
    }

    public Surface getVideoSurface() {
        return this.f107284H;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f107281E.post(new RunnableC24693e(this, 3));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f107286J = false;
        m80229a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f107286J = true;
        m80229a();
    }

    public void setDefaultStereoMode(int i13) {
        this.f107282F.f107262K = i13;
    }

    public void setUseSensorRotation(boolean z4) {
        this.f107285I = z4;
        m80229a();
    }
}
