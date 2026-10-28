package p484s9;

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
import no.C26871d;
import no.C26879l;
import no.ViewOnTouchListenerC26881n;
import p454r9.InterfaceC31088m;

/* JADX INFO: renamed from: s9.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C32284i extends GLSurfaceView {

    /* JADX INFO: renamed from: L */
    public static final /* synthetic */ int f133607L = 0;

    /* JADX INFO: renamed from: E */
    public final Handler f133608E;

    /* JADX INFO: renamed from: F */
    public final C32283h f133609F;

    /* JADX INFO: renamed from: G */
    public SurfaceTexture f133610G;

    /* JADX INFO: renamed from: H */
    public Surface f133611H;

    /* JADX INFO: renamed from: I */
    public boolean f133612I;

    /* JADX INFO: renamed from: J */
    public boolean f133613J;

    /* JADX INFO: renamed from: K */
    public boolean f133614K;

    /* JADX INFO: renamed from: w */
    public final CopyOnWriteArrayList f133615w;

    /* JADX INFO: renamed from: x */
    public final SensorManager f133616x;

    /* JADX INFO: renamed from: y */
    public final Sensor f133617y;

    /* JADX INFO: renamed from: z */
    public final C26871d f133618z;

    public C32284i(Context context) {
        super(context, null);
        this.f133615w = new CopyOnWriteArrayList();
        this.f133608E = new Handler(Looper.getMainLooper());
        Object systemService = context.getSystemService("sensor");
        systemService.getClass();
        SensorManager sensorManager = (SensorManager) systemService;
        this.f133616x = sensorManager;
        Sensor defaultSensor = sensorManager.getDefaultSensor(15);
        this.f133617y = defaultSensor == null ? sensorManager.getDefaultSensor(11) : defaultSensor;
        C32283h c32283h = new C32283h();
        this.f133609F = c32283h;
        C26879l c26879l = new C26879l(this, c32283h);
        View.OnTouchListener viewOnTouchListenerC26881n = new ViewOnTouchListenerC26881n(context, c26879l, (byte) 0);
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.f133618z = new C26871d(windowManager.getDefaultDisplay(), new InterfaceC32278c[]{viewOnTouchListenerC26881n, c26879l});
        this.f133612I = true;
        setEGLContextClientVersion(2);
        setRenderer(c26879l);
        setOnTouchListener(viewOnTouchListenerC26881n);
    }

    /* JADX INFO: renamed from: a */
    public final void m100461a() {
        boolean z4 = this.f133612I && this.f133613J;
        Sensor sensor = this.f133617y;
        if (sensor == null || z4 == this.f133614K) {
            return;
        }
        C26871d c26871d = this.f133618z;
        SensorManager sensorManager = this.f133616x;
        if (z4) {
            sensorManager.registerListener(c26871d, sensor, 0);
        } else {
            sensorManager.unregisterListener(c26871d);
        }
        this.f133614K = z4;
    }

    public InterfaceC32276a getCameraMotionListener() {
        return this.f133609F;
    }

    public InterfaceC31088m getVideoFrameMetadataListener() {
        return this.f133609F;
    }

    public Surface getVideoSurface() {
        return this.f133611H;
    }

    @Override // android.opengl.GLSurfaceView, android.view.SurfaceView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f133608E.post(new RunnableC24693e(this, 18));
    }

    @Override // android.opengl.GLSurfaceView
    public final void onPause() {
        this.f133613J = false;
        m100461a();
        super.onPause();
    }

    @Override // android.opengl.GLSurfaceView
    public final void onResume() {
        super.onResume();
        this.f133613J = true;
        m100461a();
    }

    public void setDefaultStereoMode(int i13) {
        this.f133609F.f133600K = i13;
    }

    public void setUseSensorRotation(boolean z4) {
        this.f133612I = z4;
        m100461a();
    }
}
