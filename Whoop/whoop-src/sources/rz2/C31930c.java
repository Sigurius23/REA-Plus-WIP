package rz2;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.widget.Toast;
import androidx.fragment.app.AbstractActivityC1340r0;
import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.whooplive.live.views.WhoopRecordableSurfaceView;
import e50.C12723b;
import ge3.AbstractC15751g;
import ih0.AbstractC18489d0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import p031b9.AbstractC2875y;
import qr2.AbstractC30556a;
import sz2.AbstractC33240b;
import tr2.C34117o;
import u92.C34660d;
import vf3.C35953c;
import vz2.AbstractC36615a;
import vz2.C36622h;

/* JADX INFO: renamed from: rz2.c */
/* JADX INFO: loaded from: classes11.dex */
public class C31930c extends AbstractComponentCallbacksC1320m0 implements AbstractC33240b.a {

    /* JADX INFO: renamed from: V */
    private static C31930c f132597V;

    /* JADX INFO: renamed from: W */
    private static C34117o f132598W;

    /* JADX INFO: renamed from: E */
    private CameraCaptureSession f132599E;

    /* JADX INFO: renamed from: F */
    private int f132600F;

    /* JADX INFO: renamed from: G */
    private CaptureRequest.Builder f132601G;

    /* JADX INFO: renamed from: H */
    private HandlerThread f132602H;

    /* JADX INFO: renamed from: I */
    private Handler f132603I;

    /* JADX INFO: renamed from: J */
    private SurfaceTexture f132604J;

    /* JADX INFO: renamed from: T */
    private List<Surface> f132614T;

    /* JADX INFO: renamed from: x */
    private WhoopRecordableSurfaceView f132617x;

    /* JADX INFO: renamed from: y */
    private AbstractC33240b f132618y;

    /* JADX INFO: renamed from: z */
    private CameraDevice f132619z;

    /* JADX INFO: renamed from: w */
    private final C34660d f132616w = (C34660d) AbstractC15751g.m44472y(C34660d.class, new C35953c("mainPrefs"), null);

    /* JADX INFO: renamed from: K */
    protected int f132605K = 0;

    /* JADX INFO: renamed from: L */
    private final Semaphore f132606L = new Semaphore(1);

    /* JADX INFO: renamed from: M */
    private boolean f132607M = false;

    /* JADX INFO: renamed from: N */
    private boolean f132608N = false;

    /* JADX INFO: renamed from: O */
    private boolean f132609O = false;

    /* JADX INFO: renamed from: P */
    private boolean f132610P = true;

    /* JADX INFO: renamed from: Q */
    private final LinkedList<C36622h> f132611Q = new LinkedList<>();

    /* JADX INFO: renamed from: R */
    private final CameraCaptureSession.StateCallback f132612R = new a();

    /* JADX INFO: renamed from: S */
    private final CameraDevice.StateCallback f132613S = new b();

    /* JADX INFO: renamed from: U */
    private final CameraCaptureSession.CaptureCallback f132615U = new c();

    /* JADX INFO: renamed from: rz2.c$a */
    public class a extends CameraCaptureSession.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            super.onClosed(cameraCaptureSession);
            Log.e("WhoopVideoFragment", "onClosed: " + cameraCaptureSession);
            C31930c.f132598W.mo85216g("onClosed " + cameraCaptureSession, new AbstractC30556a.a[0]);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            AbstractActivityC1340r0 activity = C31930c.this.getActivity();
            Log.e("WhoopVideoFragment", "config failed: " + cameraCaptureSession);
            if (activity != null) {
                C31930c.f132598W.mo85222m("CaptureSession Config Failed " + cameraCaptureSession, new AbstractC30556a.a[0]);
            }
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C31930c.this.f132599E = cameraCaptureSession;
            Log.e("WhoopVideoFragment", "CaptureSession Configured: " + cameraCaptureSession);
            C31930c.f132598W.mo85216g("CaptureSession Configured: " + cameraCaptureSession, new AbstractC30556a.a[0]);
            C31930c.this.m99404V();
        }
    }

    /* JADX INFO: renamed from: rz2.c$b */
    public class b extends CameraDevice.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C31930c.this.f132606L.release();
            cameraDevice.close();
            C31930c.this.f132619z = null;
            C31930c.this.f132607M = false;
            C31930c.f132598W.mo85216g("DISCONNECTED FROM CAMERA " + cameraDevice, new AbstractC30556a.a[0]);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            C31930c.this.f132606L.release();
            cameraDevice.close();
            C31930c.this.f132619z = null;
            C31930c.this.f132607M = false;
            C31930c.f132598W.mo85222m(AbstractC2875y.m8295h(i13, "CameraDevice.StateCallback onError() "), new AbstractC30556a.a[0]);
            AbstractActivityC1340r0 activity = C31930c.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C31930c.this.f132606L.release();
            C31930c.this.f132619z = cameraDevice;
            C31930c.this.f132607M = true;
            C31930c.f132598W.mo85216g("onOpened " + cameraDevice, new AbstractC30556a.a[0]);
            C31930c.this.m99402S();
        }
    }

    /* JADX INFO: renamed from: rz2.c$c */
    public class c extends CameraCaptureSession.CaptureCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }
    }

    /* JADX INFO: renamed from: rz2.c$d */
    public class d implements Runnable {
        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C31930c.this.m99410L();
        }
    }

    /* JADX INFO: renamed from: F */
    private C36622h m99397F() {
        int width = this.f132617x.getWidth();
        int height = this.f132617x.getHeight();
        if (width < height) {
            height = width;
            width = height;
        }
        for (C36622h c36622h : this.f132611Q) {
            if (c36622h.m117693c() >= width && c36622h.m117692b() >= height) {
                return c36622h;
            }
        }
        return this.f132611Q.getLast();
    }

    /* JADX INFO: renamed from: H */
    private void m99398H(LinkedList<C36622h> linkedList, Size[] sizeArr, int i13, int i14) {
        linkedList.clear();
        for (Size size : sizeArr) {
            int width = size.getWidth();
            int height = size.getHeight();
            if (AbstractC36615a.m117628c(width, height) && width <= i13 && height <= i14) {
                linkedList.add(new C36622h(size.getWidth(), size.getHeight()));
            }
        }
        if (linkedList.isEmpty() && sizeArr.length > 0) {
            Size size2 = sizeArr[0];
            linkedList.add(new C36622h(size2.getWidth(), size2.getHeight()));
        }
        Collections.sort(linkedList);
    }

    /* JADX INFO: renamed from: J */
    public static C31930c m99399J() {
        if (f132597V == null) {
            f132598W = new C34117o(C12723b.m35566a().m35569d(), "WhoopVideoFragment");
            C31930c c31930c = new C31930c();
            f132597V = c31930c;
            c31930c.setRetainInstance(true);
        }
        return f132597V;
    }

    /* JADX INFO: renamed from: Q */
    private void m99400Q(int i13, int i14) {
        if (this.f132614T == null) {
            this.f132614T = new ArrayList();
        }
        if (this.f132600F == -1) {
            this.f132600F = this.f132618y.m105465l();
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f132600F);
        this.f132604J = surfaceTexture;
        this.f132618y.m105472x(surfaceTexture);
        if (this.f132614T.size() != 0) {
            Iterator<Surface> it = this.f132614T.iterator();
            while (it.hasNext()) {
                it.next().release();
            }
            this.f132614T.clear();
        }
        this.f132604J.setDefaultBufferSize(i13, i14);
        this.f132614T.add(new Surface(this.f132604J));
    }

    /* JADX INFO: renamed from: R */
    private void m99401R() {
        f132598W.mo85216g("Starting background thread", new AbstractC30556a.a[0]);
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.f132602H = handlerThread;
        handlerThread.start();
        this.f132603I = new Handler(this.f132602H.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m99402S() {
        CameraDevice cameraDevice = this.f132619z;
        if (cameraDevice == null) {
            return;
        }
        try {
            this.f132601G = cameraDevice.createCaptureRequest(3);
            CameraManager cameraManager = (CameraManager) getActivity().getSystemService("camera");
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraManager.getCameraCharacteristics(cameraManager.getCameraIdList()[this.f132605K]).get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            if (streamConfigurationMap != null) {
                m99398H(this.f132611Q, streamConfigurationMap.getOutputSizes(SurfaceTexture.class), 1920, 1080);
            }
            C36622h c36622hM99397F = m99397F();
            int iM117693c = c36622hM99397F.m117693c();
            int iM117692b = c36622hM99397F.m117692b();
            f132598W.mo85216g("Preview Height " + iM117692b + " Preview Width: " + iM117693c, new AbstractC30556a.a[0]);
            if (this.f132610P) {
                m99400Q(iM117693c, iM117692b);
                this.f132610P = true;
            }
            f132598W.mo85216g("Setting up surfaces " + this.f132610P, new AbstractC30556a.a[0]);
            SurfaceTexture surfaceTexture = this.f132604J;
            if (surfaceTexture != null) {
                surfaceTexture.setDefaultBufferSize(c36622hM99397F.m117693c(), c36622hM99397F.m117692b());
            } else {
                f132598W.mo85216g("Surface texture is null while setting up default buffer size  " + this.f132604J, new AbstractC30556a.a[0]);
            }
            this.f132618y.m105470u(((this.f132617x.getWidth() * 1.0f) / this.f132617x.getHeight()) / ((c36622hM99397F.m117692b() * 1.0f) / c36622hM99397F.m117693c()));
            this.f132601G.addTarget(this.f132614T.get(0));
            this.f132619z.createCaptureSession(this.f132614T, this.f132612R, this.f132603I);
        } catch (CameraAccessException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: T */
    private void m99403T() {
        Log.e("WhoopVideoFragment", "RELEASE TEXTURE");
        f132598W.mo85216g("Stopping background thread and releasing surface texture", new AbstractC30556a.a[0]);
        SurfaceTexture surfaceTexture = this.f132604J;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.f132604J = null;
            this.f132610P = true;
            this.f132614T.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public void m99404V() {
        if (this.f132619z == null) {
            return;
        }
        try {
            this.f132601G.set(CaptureRequest.CONTROL_MODE, 1);
            if (this.f132605K == 0 && this.f132608N) {
                this.f132601G.set(CaptureRequest.FLASH_MODE, 2);
            } else {
                this.f132601G.set(CaptureRequest.FLASH_MODE, 0);
            }
            this.f132599E.setRepeatingRequest(this.f132601G.build(), this.f132615U, this.f132603I);
            this.f132604J.setOnFrameAvailableListener(this.f132618y);
        } catch (CameraAccessException e5) {
            e5.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: G */
    public void m99407G() {
        try {
            try {
                this.f132606L.acquire();
                if (this.f132619z != null) {
                    this.f132599E.stopRepeating();
                    this.f132619z.close();
                    this.f132619z = null;
                    this.f132607M = false;
                }
            } catch (CameraAccessException e5) {
                f132598W.mo85222m("Failed to stop repeaing preview request  " + e5, new AbstractC30556a.a[0]);
                Log.e("WhoopVideoFragment", "Failed to stop repeaing preview request", e5);
            } catch (InterruptedException e13) {
                f132598W.mo85222m("Interrupted while trying to lock camera closing.  " + e13.getLocalizedMessage(), new AbstractC30556a.a[0]);
                throw new RuntimeException("Interrupted while trying to lock camera closing.");
            }
            this.f132606L.release();
        } catch (Throwable th3) {
            this.f132606L.release();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: I */
    public int m99408I() {
        return this.f132605K;
    }

    /* JADX INFO: renamed from: K */
    public SurfaceTexture m99409K() {
        return this.f132604J;
    }

    /* JADX INFO: renamed from: L */
    public void m99410L() {
        AbstractActivityC1340r0 activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (this.f132619z == null || !this.f132607M) {
            CameraManager cameraManager = (CameraManager) activity.getSystemService("camera");
            try {
                if (!this.f132606L.tryAcquire(2500L, TimeUnit.MILLISECONDS)) {
                    throw new RuntimeException("Time out waiting to lock camera opening.");
                }
                String[] cameraIdList = cameraManager.getCameraIdList();
                if (this.f132605K >= cameraIdList.length) {
                    this.f132605K = 0;
                }
                cameraManager.openCamera(cameraIdList[this.f132605K], this.f132613S, (Handler) null);
            } catch (CameraAccessException unused) {
                Toast.makeText(activity, "Cannot access the camera.", 0).show();
                activity.finish();
            } catch (InterruptedException unused2) {
                throw new RuntimeException("Interrupted while trying to lock camera opening.");
            } catch (NullPointerException e5) {
                e5.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m99411M(int i13) {
        this.f132605K = i13;
    }

    /* JADX INFO: renamed from: N */
    public void m99412N(int i13) {
        this.f132600F = i13;
    }

    /* JADX INFO: renamed from: O */
    public void m99413O(WhoopRecordableSurfaceView whoopRecordableSurfaceView) {
        this.f132617x = whoopRecordableSurfaceView;
    }

    /* JADX INFO: renamed from: P */
    public void m99414P(AbstractC33240b abstractC33240b) {
        this.f132617x.setVisibility(0);
        this.f132618y = abstractC33240b;
        if (abstractC33240b == null) {
            return;
        }
        abstractC33240b.m105471w(this);
        this.f132618y.m105473z(this);
        this.f132617x.setRendererCallbacks(this.f132618y);
        int iM117627b = AbstractC36615a.m117627b(this.f132617x.getHeight());
        int iM117626a = AbstractC36615a.m117626a(this.f132617x.getWidth());
        int width = this.f132617x.getWidth();
        int height = this.f132617x.getHeight();
        if (iM117627b <= this.f132617x.getWidth()) {
            iM117627b = width;
        }
        if (iM117626a <= this.f132617x.getHeight()) {
            iM117626a = height;
        }
        this.f132618y.onSurfaceChanged(iM117627b, iM117626a);
    }

    /* JADX INFO: renamed from: U */
    public void m99415U() {
        if (this.f132605K == 1) {
            this.f132605K = 0;
            this.f132616w.m109538q(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, false);
        } else {
            this.f132605K = 1;
            this.f132616w.m109538q(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, true);
        }
        f132598W.mo85216g(AbstractC18489d0.m53371l(new StringBuilder("Swap Camera clicked setting up "), this.f132605K, " to use"), new AbstractC30556a.a[0]);
        if (this.f132607M) {
            f132598W.mo85216g("Closing camera and setting up surface to false and opening camera again", new AbstractC30556a.a[0]);
            m99407G();
            this.f132610P = false;
            m99410L();
        }
    }

    @Override // sz2.AbstractC33240b.a
    /* JADX INFO: renamed from: n */
    public void mo99416n() {
        AbstractActivityC1340r0 activity;
        if (!this.f132609O || (activity = getActivity()) == null) {
            return;
        }
        activity.runOnUiThread(new d());
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onPause() {
        super.onPause();
        m99407G();
        m99403T();
        this.f132617x.setVisibility(8);
        this.f132617x.setRendererCallbacks(null);
    }

    @Override // androidx.fragment.app.AbstractComponentCallbacksC1320m0
    public void onResume() {
        super.onResume();
        m99401R();
    }
}
