package t23;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import androidx.room.AbstractC1772c1;
import b23.C2343i;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import bc3.AbstractC3006f0;
import bc3.C2996c2;
import bc3.C3033m;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ge3.AbstractC15751g;
import io.getstream.android.video.generated.models.CallSettingsResponse;
import io.getstream.android.video.generated.models.TargetResolution;
import io.getstream.android.video.generated.models.VideoSettingsResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23470p;
import m83.AbstractC25265s;
import m83.C25271y;
import n53.C26318e;
import ng3.C26701n;
import org.webrtc.Camera2Capturer;
import org.webrtc.Camera2Enumerator;
import org.webrtc.CameraEnumerationAndroid;
import org.webrtc.EglBase;
import org.webrtc.SurfaceTextureHelper;
import p000.AbstractC11266d;
import p441qx.C30706d0;
import p479s4.AbstractC32122c;
import p505ts.AbstractC34132o;
import p715kotlin.jvm.internal.AbstractC22676k;
import r83.EnumC31071a;
import x30.AbstractC37926s0;

/* JADX INFO: renamed from: t23.e1 */
/* JADX INFO: loaded from: classes3.dex */
public final class C33381e1 {

    /* JADX INFO: renamed from: a */
    public final C33476x1 f139344a;

    /* JADX INFO: renamed from: b */
    public final EglBase.Context f139345b;

    /* JADX INFO: renamed from: c */
    public SurfaceTextureHelper f139346c;

    /* JADX INFO: renamed from: d */
    public List f139347d;

    /* JADX INFO: renamed from: e */
    public boolean f139348e;

    /* JADX INFO: renamed from: f */
    public Camera2Capturer f139349f;

    /* JADX INFO: renamed from: g */
    public Camera2Enumerator f139350g;

    /* JADX INFO: renamed from: h */
    public CameraManager f139351h;

    /* JADX INFO: renamed from: i */
    public final C23470p f139352i = AbstractC1772c1.m5382S(this, "Media:CameraManager");

    /* JADX INFO: renamed from: j */
    public final C13045h2 f139353j;

    /* JADX INFO: renamed from: k */
    public final C13045h2 f139354k;

    /* JADX INFO: renamed from: l */
    public final C26318e f139355l;

    /* JADX INFO: renamed from: m */
    public final C13045h2 f139356m;

    /* JADX INFO: renamed from: n */
    public final C13045h2 f139357n;

    /* JADX INFO: renamed from: o */
    public final C13045h2 f139358o;

    /* JADX INFO: renamed from: p */
    public final C13045h2 f139359p;

    /* JADX INFO: renamed from: q */
    public final C13045h2 f139360q;

    /* JADX INFO: renamed from: r */
    public final C13045h2 f139361r;

    /* JADX INFO: renamed from: s */
    public final C13045h2 f139362s;

    /* JADX INFO: renamed from: t */
    public C2996c2 f139363t;

    /* JADX INFO: renamed from: u */
    public boolean f139364u;

    public C33381e1(C33476x1 c33476x1, EglBase.Context context, C26701n c26701n) {
        this.f139344a = c33476x1;
        this.f139345b = context;
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(C33436p1.f139584a);
        this.f139353j = c13045h2M36593c;
        this.f139354k = c13045h2M36593c;
        this.f139355l = AbstractC37926s0.m121484x(c13045h2M36593c, C33363b1.f139227w);
        this.f139356m = AbstractC13091v.m36593c(C33475x0.f139752a);
        C13045h2 c13045h2M36593c2 = AbstractC13091v.m36593c(null);
        this.f139357n = c13045h2M36593c2;
        this.f139358o = c13045h2M36593c2;
        C13045h2 c13045h2M36593c3 = AbstractC13091v.m36593c(null);
        this.f139359p = c13045h2M36593c3;
        this.f139360q = c13045h2M36593c3;
        C13045h2 c13045h2M36593c4 = AbstractC13091v.m36593c(C25271y.f99162w);
        this.f139361r = c13045h2M36593c4;
        this.f139362s = c13045h2M36593c4;
    }

    /* JADX INFO: renamed from: a */
    public static final Object m105830a(C33381e1 c33381e1, C33485z0 c33485z0) {
        C3033m c3033m = new C3033m(1, AbstractC15751g.m44424D(c33485z0));
        c3033m.m8774s();
        Camera2Capturer camera2Capturer = c33381e1.f139349f;
        if (camera2Capturer == null) {
            AbstractC22676k.m65757q("videoCapturer");
            throw null;
        }
        camera2Capturer.switchCamera(new C33357a1(c3033m));
        c3033m.m8776u(C33415l0.f139527N);
        Object objM8773r = c3033m.m8773r();
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        return objM8773r;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX INFO: renamed from: f */
    public static List m105832f(List list, AbstractC33480y0 abstractC33480y0) {
        Iterable iterable = (Iterable) list;
        if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                if (AbstractC22676k.m65745e(((C33465v0) it.next()).f139737e, abstractC33480y0)) {
                    list = new ArrayList();
                    for (Object obj : iterable) {
                        if (AbstractC22676k.m65745e(((C33465v0) obj).f139737e, abstractC33480y0)) {
                            list.add(obj);
                        }
                    }
                    break;
                }
            }
        }
        return list;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0073  */
    /* JADX WARN: Code duplicated, block: B:33:0x0079  */
    /* JADX WARN: Code duplicated, block: B:35:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:59:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:62:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:72:0x006f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:74:0x0054 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00d7, code lost:
    
        if (r9.intValue() == 6) goto L37;
     */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t23.C33465v0 m105833b(java.lang.String r8, android.hardware.camera2.CameraManager r9, org.webrtc.Camera2Enumerator r10) {
        /*
            Method dump skipped, instruction units count: 255
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t23.C33381e1.m105833b(java.lang.String, android.hardware.camera2.CameraManager, org.webrtc.Camera2Enumerator):t23.v0");
    }

    /* JADX INFO: renamed from: c */
    public final void m105834c() {
        C13045h2 c13045h2 = this.f139353j;
        c13045h2.getClass();
        c13045h2.m36571k(null, C33426n1.f139555a);
        if (this.f139348e) {
            this.f139344a.m105876e(C33415l0.f139525L);
            Camera2Capturer camera2Capturer = this.f139349f;
            if (camera2Capturer == null) {
                AbstractC22676k.m65757q("videoCapturer");
                throw null;
            }
            camera2Capturer.stopCapture();
            this.f139348e = false;
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m105835e(boolean z4) {
        C33476x1 c33476x1 = this.f139344a;
        C13045h2 c13045h2 = this.f139359p;
        try {
            if (!this.f139364u) {
                m105837h();
                List list = this.f139347d;
                if (list == null) {
                    AbstractC22676k.m65757q("devices");
                    throw null;
                }
                C33465v0 c33465v0 = (C33465v0) AbstractC25265s.m74100H0(m105832f(list, (AbstractC33480y0) this.f139356m.getValue()));
                if (c33465v0 != null) {
                    List list2 = c33465v0.f139735c;
                    C13045h2 c13045h3 = this.f139357n;
                    c13045h3.getClass();
                    c13045h3.m36571k(null, c33465v0);
                    CallSettingsResponse callSettingsResponse = (CallSettingsResponse) c33476x1.f139754b.f139302p.f139621J.getValue();
                    c13045h2.m36570j(m105838i(list2, callSettingsResponse != null ? callSettingsResponse.getVideo() : null));
                    if (c13045h2.getValue() == null) {
                        AbstractC3006f0.m8732z(c33476x1.f139755c, null, null, new C33369c1(this, null), 3);
                    }
                    C13045h2 c13045h4 = this.f139361r;
                    Object objM74093D1 = list2 != null ? AbstractC25265s.m74093D1(list2) : C25271y.f99162w;
                    c13045h4.getClass();
                    c13045h4.m36571k(null, objM74093D1);
                    SurfaceTextureHelper surfaceTextureHelperCreate = SurfaceTextureHelper.create("CaptureThread", this.f139345b);
                    AbstractC22676k.m65749i(surfaceTextureHelperCreate, "create(...)");
                    this.f139346c = surfaceTextureHelperCreate;
                    this.f139364u = true;
                }
            }
        } catch (Throwable th3) {
            AbstractC34132o.m107888l(th3);
        }
        if (z4) {
            C13045h2 c13045h5 = this.f139353j;
            c13045h5.getClass();
            c13045h5.m36571k(null, C33431o1.f139566a);
        }
        c33476x1.m105876e(C33415l0.f139526M);
        m105839j();
    }

    /* JADX INFO: renamed from: g */
    public final C2345k m105836g() {
        return (C2345k) this.f139352i.getValue();
    }

    /* JADX INFO: renamed from: h */
    public final void m105837h() {
        Context context = this.f139344a.f139753a;
        this.f139351h = (CameraManager) AbstractC32122c.getSystemService(context, CameraManager.class);
        this.f139350g = new Camera2Enumerator(context);
        CameraManager cameraManager = this.f139351h;
        String[] cameraIdList = cameraManager != null ? cameraManager.getCameraIdList() : null;
        if (cameraIdList == null) {
            cameraIdList = new String[0];
        }
        CameraManager cameraManager2 = this.f139351h;
        Camera2Enumerator camera2Enumerator = this.f139350g;
        if (camera2Enumerator == null) {
            AbstractC22676k.m65757q("enumerator");
            throw null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : cameraIdList) {
            try {
                C33465v0 c33465v0M105833b = m105833b(str, cameraManager2, camera2Enumerator);
                if (c33465v0M105833b != null) {
                    arrayList.add(c33465v0M105833b);
                }
            } catch (Throwable th3) {
                C2345k c2345kM105836g = m105836g();
                InterfaceC2339e interfaceC2339e = c2345kM105836g.f9275c;
                String str2 = c2345kM105836g.f9273a;
                EnumC2341g enumC2341g = EnumC2341g.ERROR;
                if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
                    c2345kM105836g.f9274b.log(enumC2341g, str2, AbstractC11266d.m30461o("Could not create camera device for camera with id: ", str), th3);
                }
            }
        }
        this.f139347d = AbstractC25265s.m74152u1(arrayList, new C30706d0(4));
    }

    /* JADX INFO: renamed from: i */
    public final CameraEnumerationAndroid.CaptureFormat m105838i(List list, VideoSettingsResponse videoSettingsResponse) {
        TargetResolution targetResolution;
        TargetResolution targetResolution2;
        List listM74152u1 = list != null ? AbstractC25265s.m74152u1(AbstractC25265s.m74093D1(list), new C33375d1((videoSettingsResponse == null || (targetResolution = videoSettingsResponse.getTargetResolution()) == null) ? 720 : targetResolution.getHeight(), (videoSettingsResponse == null || (targetResolution2 = videoSettingsResponse.getTargetResolution()) == null) ? 1280 : targetResolution2.getWidth())) : null;
        CameraEnumerationAndroid.CaptureFormat captureFormat = listM74152u1 != null ? (CameraEnumerationAndroid.CaptureFormat) AbstractC25265s.m74100H0(listM74152u1) : null;
        C2345k c2345kM105836g = m105836g();
        InterfaceC2339e interfaceC2339e = c2345kM105836g.f9275c;
        String str = c2345kM105836g.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM105836g.f9274b.log(enumC2341g, str, "selectDesiredResolution: " + captureFormat, null);
        }
        return captureFormat;
    }

    /* JADX INFO: renamed from: j */
    public final void m105839j() {
        synchronized (this) {
            try {
                try {
                    if (this.f139348e) {
                        m105840k();
                    }
                    C33465v0 c33465v0 = (C33465v0) this.f139357n.getValue();
                    if (c33465v0 == null) {
                        return;
                    }
                    CameraEnumerationAndroid.CaptureFormat captureFormat = (CameraEnumerationAndroid.CaptureFormat) this.f139360q.getValue();
                    if (captureFormat == null) {
                        return;
                    }
                    Camera2Capturer camera2Capturer = new Camera2Capturer(this.f139344a.f139753a, c33465v0.f139733a, null);
                    this.f139349f = camera2Capturer;
                    SurfaceTextureHelper surfaceTextureHelper = this.f139346c;
                    if (surfaceTextureHelper == null) {
                        AbstractC22676k.m65757q("surfaceTextureHelper");
                        throw null;
                    }
                    C33476x1 c33476x1 = this.f139344a;
                    camera2Capturer.initialize(surfaceTextureHelper, c33476x1.f139753a, c33476x1.m105874c().getCapturerObserver());
                    Camera2Capturer camera2Capturer2 = this.f139349f;
                    if (camera2Capturer2 == null) {
                        AbstractC22676k.m65757q("videoCapturer");
                        throw null;
                    }
                    camera2Capturer2.startCapture(captureFormat.width, captureFormat.height, captureFormat.framerate.max);
                    this.f139348e = true;
                } catch (Exception e5) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g, "SafeCall", "Exception occurred: " + e5.getMessage(), e5);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m105840k() {
        synchronized (this) {
            try {
                try {
                    if (this.f139348e) {
                        Camera2Capturer camera2Capturer = this.f139349f;
                        if (camera2Capturer == null) {
                            AbstractC22676k.m65757q("videoCapturer");
                            throw null;
                        }
                        camera2Capturer.stopCapture();
                        this.f139348e = false;
                    }
                } catch (Exception e5) {
                    C2343i c2343i = C2343i.f9269a;
                    InterfaceC2339e interfaceC2339e = C2343i.f9272d;
                    EnumC2341g enumC2341g = EnumC2341g.ERROR;
                    if (interfaceC2339e.isLoggable(enumC2341g, "SafeCall")) {
                        C2343i.f9271c.log(enumC2341g, "SafeCall", "Exception occurred: " + e5.getMessage(), e5);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
