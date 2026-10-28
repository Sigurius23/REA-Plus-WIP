package vz2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.Looper;
import android.util.Size;
import android.view.Surface;
import com.whoop.data.local.prefs.SharedPreferenceConstants;
import com.whoop.whooplive.selfie.camera.TextureViewPreview;
import ge3.AbstractC15751g;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import lh3.C24079b;
import lh3.C24082e;
import mh3.C25566c;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u92.C34660d;
import uz2.EnumC35444a;
import vf3.C35953c;
import wz2.C37783b;
import xg3.C38280g;
import zg3.C40634a;

/* JADX INFO: renamed from: vz2.e */
/* JADX INFO: loaded from: classes11.dex */
public class C36619e {

    /* JADX INFO: renamed from: A */
    private final ImageReader.OnImageAvailableListener f156898A;

    /* JADX INFO: renamed from: B */
    private final CameraDevice.StateCallback f156899B;

    /* JADX INFO: renamed from: C */
    private final CameraCaptureSession.StateCallback f156900C;

    /* JADX INFO: renamed from: a */
    private final Context f156901a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC34116n f156902b;

    /* JADX INFO: renamed from: c */
    private final C34660d f156903c;

    /* JADX INFO: renamed from: d */
    private final CameraManager f156904d;

    /* JADX INFO: renamed from: e */
    private CameraDevice f156905e;

    /* JADX INFO: renamed from: f */
    private String f156906f;

    /* JADX INFO: renamed from: g */
    private int f156907g;

    /* JADX INFO: renamed from: h */
    private CameraCharacteristics f156908h;

    /* JADX INFO: renamed from: i */
    private boolean f156909i;

    /* JADX INFO: renamed from: j */
    private ImageReader f156910j;

    /* JADX INFO: renamed from: k */
    private CaptureRequest.Builder f156911k;

    /* JADX INFO: renamed from: l */
    private CameraCaptureSession f156912l;

    /* JADX INFO: renamed from: m */
    private final d f156913m;

    /* JADX INFO: renamed from: n */
    private final TextureViewPreview f156914n;

    /* JADX INFO: renamed from: o */
    private final LinkedList<C36622h> f156915o;

    /* JADX INFO: renamed from: p */
    private final LinkedList<C36622h> f156916p;

    /* JADX INFO: renamed from: q */
    private final C24082e f156917q;

    /* JADX INFO: renamed from: r */
    private final C24082e f156918r;

    /* JADX INFO: renamed from: s */
    private final C24082e f156919s;

    /* JADX INFO: renamed from: t */
    private final C25566c f156920t;

    /* JADX INFO: renamed from: u */
    private final C24079b f156921u;

    /* JADX INFO: renamed from: v */
    private final C24079b f156922v;

    /* JADX INFO: renamed from: w */
    private final C38280g<Integer> f156923w;

    /* JADX INFO: renamed from: x */
    private final C38280g<EnumC35444a> f156924x;

    /* JADX INFO: renamed from: y */
    private boolean f156925y;

    /* JADX INFO: renamed from: z */
    private C37783b f156926z;

    /* JADX INFO: renamed from: vz2.e$a */
    public class a extends CameraDevice.StateCallback {
        public a() {
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            C36619e.this.f156919s.onNext(Boolean.TRUE);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            C36619e.this.f156905e = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i13) {
            C36619e.this.f156902b.mo85222m("CameraDevice.StateCallback.onError: " + cameraDevice.getId() + " (" + i13 + ")", new AbstractC30556a.a[0]);
            C36619e.this.f156905e = null;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            C36619e.this.f156905e = cameraDevice;
            C36619e.this.f156918r.onNext(Boolean.TRUE);
            C36619e.this.m117641Y();
        }
    }

    /* JADX INFO: renamed from: vz2.e$b */
    public class b extends CameraCaptureSession.StateCallback {
        public b() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onClosed(CameraCaptureSession cameraCaptureSession) {
            if (C36619e.this.f156912l == null || !C36619e.this.f156912l.equals(cameraCaptureSession)) {
                return;
            }
            C36619e.this.f156912l = null;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C36619e.this.f156902b.mo85222m("Failed to configure capture session", new AbstractC30556a.a[0]);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
        public void onConfigured(CameraCaptureSession cameraCaptureSession) {
            if (C36619e.this.f156905e == null) {
                return;
            }
            C36619e.this.f156912l = cameraCaptureSession;
            C36619e.this.m117638S();
            C36619e c36619e = C36619e.this;
            c36619e.m117647d0((EnumC36621g) c36619e.f156921u.m70997Z());
            try {
                if (C36619e.this.f156912l != null) {
                    C36619e.this.f156912l.setRepeatingRequest(C36619e.this.f156911k.build(), C36619e.this.f156913m, null);
                }
            } catch (CameraAccessException e5) {
                C36619e.this.f156902b.mo85230v("Could not access camera", e5, new AbstractC30556a.a[0]);
                C36619e.this.f156918r.onError(e5);
            } catch (IllegalStateException e13) {
                C36619e.this.f156902b.mo85230v("Failed to start camera preview", e13, new AbstractC30556a.a[0]);
                C36619e.this.f156918r.onError(e13);
            }
        }
    }

    /* JADX INFO: renamed from: vz2.e$c */
    public class c extends CameraCaptureSession.CaptureCallback {
        public c() {
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            C36619e.this.m117629A();
        }
    }

    /* JADX INFO: renamed from: vz2.e$d */
    public class d extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        private e f156930a;

        public /* synthetic */ d(C36619e c36619e, int i13) {
            this();
        }

        /* JADX INFO: renamed from: c */
        private void m117685c(CaptureResult captureResult) {
            e eVar = this.f156930a;
            if (eVar == e.LOCKING) {
                Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num2 == null || num2.intValue() == 2) {
                        m117688d(e.CAPTURING);
                        m117687b();
                        return;
                    } else {
                        m117688d(e.LOCKED);
                        m117686a();
                        return;
                    }
                }
                return;
            }
            if (eVar == e.PRECAPTURE) {
                Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num3 == null || num3.intValue() == 5 || num3.intValue() == 4 || num3.intValue() == 2) {
                    m117688d(e.WAITING);
                    return;
                }
                return;
            }
            if (eVar == e.WAITING) {
                Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num4 == null || num4.intValue() != 5) {
                    m117688d(e.CAPTURING);
                    m117687b();
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m117686a() {
            CaptureRequest.Builder builder = C36619e.this.f156911k;
            CaptureRequest.Key key = CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER;
            builder.set(key, 1);
            m117688d(e.PRECAPTURE);
            try {
                if (C36619e.this.f156912l != null) {
                    C36619e.this.f156912l.capture(C36619e.this.f156911k.build(), this, null);
                    C36619e.this.f156911k.set(key, 0);
                }
            } catch (CameraAccessException e5) {
                C36619e.this.f156902b.mo85230v("Failed to run precapture sequence.", e5, new AbstractC30556a.a[0]);
            }
        }

        /* JADX INFO: renamed from: b */
        public void m117687b() {
            C36619e.this.m117664v();
        }

        /* JADX INFO: renamed from: d */
        public void m117688d(e eVar) {
            this.f156930a = eVar;
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m117685c(totalCaptureResult);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m117685c(captureResult);
        }

        private d() {
            this.f156930a = e.PREVIEW;
        }
    }

    /* JADX INFO: renamed from: vz2.e$e */
    public enum e {
        PREVIEW,
        LOCKING,
        LOCKED,
        PRECAPTURE,
        WAITING,
        CAPTURING
    }

    public C36619e(TextureViewPreview textureViewPreview, Context context, C38280g<EnumC35444a> c38280g, C38280g<Integer> c38280g2) {
        C34660d c34660d = (C34660d) AbstractC15751g.m44472y(C34660d.class, new C35953c("mainPrefs"), null);
        this.f156903c = c34660d;
        this.f156907g = 0;
        this.f156909i = true;
        this.f156913m = new d(this, 0);
        this.f156915o = new LinkedList<>();
        this.f156916p = new LinkedList<>();
        this.f156917q = C24082e.m71000Y();
        this.f156918r = C24082e.m71000Y();
        this.f156919s = C24082e.m71000Y();
        C25566c c25566c = new C25566c();
        this.f156920t = c25566c;
        this.f156921u = C24079b.m70996Y(EnumC36621g.OFF, true);
        this.f156922v = C24079b.m70996Y(new C36620f(true, true), true);
        this.f156898A = new ImageReader.OnImageAvailableListener() { // from class: vz2.c
            @Override // android.media.ImageReader.OnImageAvailableListener
            public final void onImageAvailable(ImageReader imageReader) {
                this.f156895a.m117635J(imageReader);
            }
        };
        this.f156899B = new a();
        this.f156900C = new b();
        this.f156901a = context;
        this.f156902b = InterfaceC34116n.m107846d("Selfie.CameraApi");
        this.f156914n = textureViewPreview;
        this.f156904d = (CameraManager) context.getSystemService("camera");
        this.f156923w = c38280g2;
        this.f156924x = c38280g;
        this.f156925y = c34660d.m109528e(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, this.f156925y);
        c25566c.m75179c(textureViewPreview.m28918b().m122652B(C40634a.m131874a()).m122661K(new C36618d(this, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A */
    public void m117629A() {
        this.f156926z.m121271i().post(new RunnableC36616b(this, 1));
    }

    /* JADX INFO: renamed from: C */
    private boolean m117630C() {
        return this.f156925y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m117631F(Boolean bool) {
        if (bool.booleanValue()) {
            m117642Z();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m117632G() {
        this.f156926z.m121274w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m117633H() {
        this.f156926z.m121274w();
        m117668z();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m117634I(Boolean bool) {
        m117672L();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m117635J(ImageReader imageReader) {
        Image imageAcquireNextImage = imageReader.acquireNextImage();
        try {
            Image.Plane[] planes = imageAcquireNextImage.getPlanes();
            if (planes.length > 0) {
                ByteBuffer buffer = planes[0].getBuffer();
                byte[] bArr = new byte[buffer.remaining()];
                buffer.get(bArr);
                this.f156917q.onNext(bArr);
            }
            imageAcquireNextImage.close();
        } catch (Throwable th3) {
            if (imageAcquireNextImage != null) {
                try {
                    imageAcquireNextImage.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }

    /* JADX INFO: renamed from: K */
    private void m117636K() {
        CaptureRequest.Builder builder = this.f156911k;
        if (builder != null) {
            builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
            try {
                this.f156913m.m117688d(e.LOCKING);
                CameraCaptureSession cameraCaptureSession = this.f156912l;
                if (cameraCaptureSession != null) {
                    cameraCaptureSession.capture(this.f156911k.build(), this.f156913m, null);
                }
            } catch (CameraAccessException e5) {
                this.f156902b.mo85230v("Failed to lock focus.", e5, new AbstractC30556a.a[0]);
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    private void m117637Q() {
        ImageReader imageReader = this.f156910j;
        if (imageReader != null) {
            imageReader.close();
        }
        LinkedList<C36622h> linkedList = this.f156916p;
        if (linkedList == null || linkedList.isEmpty()) {
            return;
        }
        C36622h last = this.f156916p.getLast();
        ImageReader imageReaderNewInstance = ImageReader.newInstance(last.m117693c(), last.m117692b(), 256, 2);
        this.f156910j = imageReaderNewInstance;
        imageReaderNewInstance.setOnImageAvailableListener(this.f156898A, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public void m117638S() {
        int[] iArr = (int[]) this.f156908h.get(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null || iArr.length == 0 || (iArr.length == 1 && iArr[0] == 0)) {
            this.f156909i = false;
            this.f156911k.set(CaptureRequest.CONTROL_AF_MODE, 0);
        } else {
            this.f156909i = true;
            this.f156911k.set(CaptureRequest.CONTROL_AF_MODE, 4);
        }
    }

    /* JADX INFO: renamed from: T */
    private void m117639T() throws Throwable {
        Throwable th3;
        boolean z4;
        CameraAccessException e5;
        boolean z13;
        boolean z14;
        this.f156906f = null;
        this.f156908h = null;
        boolean zBooleanValue = false;
        boolean z15 = true;
        try {
            String[] cameraIdList = this.f156904d.getCameraIdList();
            if (cameraIdList.length == 0) {
                RuntimeException runtimeException = new RuntimeException("No camera found");
                this.f156902b.mo85230v("No camera found.", runtimeException, new AbstractC30556a.a[0]);
                try {
                    try {
                        this.f156918r.onError(runtimeException);
                        z14 = false;
                        this.f156922v.onNext(new C36620f(zBooleanValue, z14));
                        return;
                    } catch (CameraAccessException e13) {
                        e5 = e13;
                        z13 = false;
                        z4 = false;
                        try {
                            this.f156902b.mo85230v("Could not retrieve camera devices", e5, new AbstractC30556a.a[0]);
                            this.f156918r.onError(e5);
                            this.f156922v.onNext(new C36620f(false, false));
                            return;
                        } catch (Throwable th4) {
                            zBooleanValue = z13;
                            th3 = th4;
                            z15 = z4;
                        }
                    }
                } catch (Throwable th5) {
                    th3 = th5;
                    z15 = false;
                }
            } else {
                this.f156907g = 0;
                HashSet<String> hashSet = new HashSet();
                for (String str : cameraIdList) {
                    hashSet.add(((Integer) this.f156904d.getCameraCharacteristics(str).get(CameraCharacteristics.LENS_FACING)).toString());
                }
                int i13 = 0;
                for (String str2 : hashSet) {
                    CameraCharacteristics cameraCharacteristics = this.f156904d.getCameraCharacteristics(str2);
                    Integer num = (Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
                    if (num != null && num.intValue() != 2) {
                        if (this.f156925y && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 0) {
                            this.f156906f = str2;
                            this.f156907g = i13;
                            this.f156908h = cameraCharacteristics;
                        }
                        if (!this.f156925y && ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue() == 1) {
                            this.f156906f = str2;
                            this.f156907g = i13;
                            this.f156908h = cameraCharacteristics;
                        }
                        i13++;
                    }
                }
                if (this.f156906f == null) {
                    String str3 = cameraIdList[0];
                    this.f156906f = str3;
                    this.f156908h = this.f156904d.getCameraCharacteristics(str3);
                    z14 = false;
                } else {
                    z14 = true;
                }
                try {
                    Boolean bool = (Boolean) this.f156908h.get(CameraCharacteristics.FLASH_INFO_AVAILABLE);
                    if (bool != null) {
                        zBooleanValue = bool.booleanValue();
                    }
                    this.f156922v.onNext(new C36620f(zBooleanValue, z14));
                    return;
                } catch (CameraAccessException e14) {
                    boolean z16 = z14;
                    z13 = true;
                    e5 = e14;
                    z4 = z16;
                    this.f156902b.mo85230v("Could not retrieve camera devices", e5, new AbstractC30556a.a[0]);
                    this.f156918r.onError(e5);
                    this.f156922v.onNext(new C36620f(false, false));
                    return;
                } catch (Throwable th6) {
                    boolean z17 = z14;
                    th3 = th6;
                    zBooleanValue = true;
                    z15 = z17;
                }
            }
        } catch (CameraAccessException e15) {
            z4 = true;
            e5 = e15;
            z13 = true;
        } catch (Throwable th7) {
            th3 = th7;
            zBooleanValue = true;
        }
        this.f156922v.onNext(new C36620f(zBooleanValue, z15));
        throw th3;
    }

    /* JADX INFO: renamed from: V */
    private void m117640V(boolean z4) throws Throwable {
        this.f156903c.m109538q(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, z4);
        if (z4 != this.f156925y && m117670D()) {
            this.f156925y = z4;
            m117682b0();
            m117680X();
            m117672L();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public void m117641Y() {
        if (!m117670D() || this.f156910j == null) {
            return;
        }
        C36622h c36622hM117665w = m117665w();
        SurfaceTexture surfaceTextureM121272j = this.f156926z.m121272j();
        surfaceTextureM121272j.setDefaultBufferSize(c36622hM117665w.m117693c(), c36622hM117665w.m117692b());
        Surface surface = new Surface(surfaceTextureM121272j);
        try {
            CaptureRequest.Builder builderCreateCaptureRequest = this.f156905e.createCaptureRequest(1);
            this.f156911k = builderCreateCaptureRequest;
            builderCreateCaptureRequest.addTarget(surface);
            this.f156905e.createCaptureSession(Arrays.asList(surface, this.f156910j.getSurface()), this.f156900C, null);
        } catch (CameraAccessException e5) {
            this.f156902b.mo85222m("Failed to start camera session", new AbstractC30556a.a[0]);
            this.f156918r.onError(e5);
        }
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: Z */
    private void m117642Z() {
        try {
            this.f156904d.openCamera(this.f156906f, this.f156899B, new Handler(Looper.getMainLooper()));
        } catch (CameraAccessException e5) {
            this.f156902b.mo85230v("Failed to open camera: " + this.f156906f, e5, new AbstractC30556a.a[0]);
            this.f156918r.onError(e5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public void m117647d0(EnumC36621g enumC36621g) {
        this.f156911k.set(CaptureRequest.FLASH_MODE, 0);
        if (enumC36621g == EnumC36621g.OFF) {
            this.f156911k.set(CaptureRequest.CONTROL_AE_MODE, 1);
        } else if (enumC36621g == EnumC36621g.ON) {
            this.f156911k.set(CaptureRequest.CONTROL_AE_MODE, 3);
        } else {
            this.f156911k.set(CaptureRequest.CONTROL_AE_MODE, 2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m117664v() {
        try {
            if (m117670D()) {
                CaptureRequest.Builder builderCreateCaptureRequest = this.f156905e.createCaptureRequest(2);
                builderCreateCaptureRequest.addTarget(this.f156910j.getSurface());
                CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
                builderCreateCaptureRequest.set(key, (Integer) this.f156911k.get(key));
                EnumC36621g enumC36621g = (EnumC36621g) this.f156921u.m70997Z();
                if (enumC36621g == EnumC36621g.OFF) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 1);
                    builderCreateCaptureRequest.set(CaptureRequest.FLASH_MODE, 0);
                } else if (enumC36621g == EnumC36621g.ON) {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 3);
                } else {
                    builderCreateCaptureRequest.set(CaptureRequest.CONTROL_AE_MODE, 2);
                }
                builderCreateCaptureRequest.set(CaptureRequest.JPEG_ORIENTATION, Integer.valueOf((((Integer) this.f156908h.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue() + 360) % 360));
                this.f156912l.stopRepeating();
                this.f156912l.capture(builderCreateCaptureRequest.build(), new c(), null);
            }
        } catch (CameraAccessException e5) {
            this.f156902b.mo85230v("Cannot capture a still picture.", e5, new AbstractC30556a.a[0]);
            this.f156917q.onError(e5);
        }
    }

    /* JADX INFO: renamed from: w */
    private C36622h m117665w() {
        int width = this.f156914n.getWidth();
        int height = this.f156914n.getHeight();
        if (width < height) {
            height = width;
            width = height;
        }
        for (C36622h c36622h : this.f156915o) {
            if (c36622h.m117693c() >= width && c36622h.m117692b() >= height) {
                return c36622h;
            }
        }
        return this.f156915o.getLast();
    }

    /* JADX INFO: renamed from: x */
    private void m117666x() {
        CameraCharacteristics cameraCharacteristics = this.f156908h;
        if (cameraCharacteristics == null) {
            return;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            IllegalStateException illegalStateException = new IllegalStateException("Failed to get configuration map for camera" + this.f156906f);
            this.f156902b.mo85222m("Failed to get configuration map for camera " + this.f156906f, new AbstractC30556a.a[0]);
            this.f156918r.onError(illegalStateException);
            return;
        }
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
        if (outputSizes == null || outputSizes.length == 0) {
            IllegalStateException illegalStateException2 = new IllegalStateException("no surface texture output sizes");
            this.f156902b.mo85230v("Failed to collect camera info", illegalStateException2, new AbstractC30556a.a[0]);
            this.f156918r.onError(illegalStateException2);
            return;
        }
        m117667y(this.f156915o, outputSizes, 1920, 1080);
        Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(256);
        if (outputSizes2 != null) {
            m117667y(this.f156916p, outputSizes2, 1920, 1080);
            return;
        }
        IllegalStateException illegalStateException3 = new IllegalStateException("no jpg output sizes");
        this.f156902b.mo85230v("Failed to collect camera info", illegalStateException3, new AbstractC30556a.a[0]);
        this.f156918r.onError(illegalStateException3);
    }

    /* JADX INFO: renamed from: y */
    private void m117667y(LinkedList<C36622h> linkedList, Size[] sizeArr, int i13, int i14) {
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

    /* JADX INFO: renamed from: z */
    private void m117668z() {
        C37783b c37783b = new C37783b(this.f156901a, this.f156914n.getSurfaceTexture(), this.f156914n.getMeasuredWidth(), this.f156914n.getMeasuredHeight(), this.f156924x, this.f156923w);
        this.f156926z = c37783b;
        this.f156920t.m75179c(c37783b.m121273p().m122665P(C40634a.m131874a()).m122661K(new C36618d(this, 1)));
        this.f156926z.start();
    }

    /* JADX INFO: renamed from: B */
    public int m117669B() {
        return this.f156907g;
    }

    /* JADX INFO: renamed from: D */
    public boolean m117670D() {
        return this.f156905e != null;
    }

    /* JADX INFO: renamed from: E */
    public boolean m117671E() {
        return this.f156925y;
    }

    /* JADX INFO: renamed from: L */
    public void m117672L() {
        C37783b c37783b = this.f156926z;
        if (c37783b != null && c37783b.isAlive()) {
            this.f156926z.m121271i().post(new RunnableC36616b(this, 0));
            return;
        }
        String str = new String[]{this.f156906f}[0];
        if (str == null || str.equals("") || str.equals("null")) {
            return;
        }
        m117668z();
    }

    /* JADX INFO: renamed from: M */
    public C38280g<Boolean> m117673M() {
        return this.f156918r;
    }

    /* JADX INFO: renamed from: N */
    public C38280g<C36620f> m117674N() {
        return this.f156922v;
    }

    /* JADX INFO: renamed from: O */
    public C38280g<EnumC36621g> m117675O() {
        return this.f156921u;
    }

    /* JADX INFO: renamed from: P */
    public C38280g<byte[]> m117676P() {
        return this.f156917q;
    }

    /* JADX INFO: renamed from: R */
    public void m117677R() {
        this.f156920t.m75180d();
    }

    /* JADX INFO: renamed from: U */
    public void m117678U() {
        this.f156925y = this.f156903c.m109528e(SharedPreferenceConstants.KEY_CAMERA_FACING_FRONT, this.f156925y);
    }

    /* JADX INFO: renamed from: W */
    public void m117679W(EnumC36621g enumC36621g) {
        EnumC36621g enumC36621g2 = (EnumC36621g) this.f156921u.m70997Z();
        if (enumC36621g2 == enumC36621g) {
            return;
        }
        this.f156921u.onNext(enumC36621g);
        if (this.f156911k != null) {
            m117647d0(enumC36621g);
            CameraCaptureSession cameraCaptureSession = this.f156912l;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.setRepeatingRequest(this.f156911k.build(), this.f156913m, null);
                } catch (CameraAccessException e5) {
                    this.f156902b.mo85213c("Could not update flash for capture", e5, new AbstractC30556a.a[0]);
                    this.f156921u.onNext(enumC36621g2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: X */
    public void m117680X() throws Throwable {
        m117639T();
        m117666x();
        m117637Q();
    }

    /* JADX INFO: renamed from: a0 */
    public void m117681a0() {
        if (this.f156909i) {
            m117636K();
        } else {
            m117664v();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void m117682b0() {
        CameraCaptureSession cameraCaptureSession = this.f156912l;
        if (cameraCaptureSession != null) {
            cameraCaptureSession.close();
            this.f156912l = null;
        }
        CameraDevice cameraDevice = this.f156905e;
        if (cameraDevice != null) {
            cameraDevice.close();
            this.f156905e = null;
        }
        ImageReader imageReader = this.f156910j;
        if (imageReader != null) {
            imageReader.close();
            this.f156910j = null;
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m117683c0() throws Throwable {
        m117640V(!m117630C());
    }

    /* JADX INFO: renamed from: u */
    public void m117684u() {
        if (this.f156926z != null) {
            m117672L();
        }
    }
}
