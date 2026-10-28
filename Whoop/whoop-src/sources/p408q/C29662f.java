package p408q;

import a30.C0332w0;
import af3.AbstractC0829e;
import af3.AbstractC0830f;
import af3.AbstractC0844t;
import af3.C0823a0;
import af3.C0824b;
import af3.C0825b0;
import af3.C0826c;
import af3.C0828d;
import af3.C0831g;
import af3.C0832h;
import af3.C0833i;
import af3.C0834j;
import af3.C0835k;
import af3.C0836l;
import af3.C0837m;
import af3.C0838n;
import af3.C0839o;
import af3.C0840p;
import af3.C0841q;
import af3.C0843s;
import af3.C0846v;
import af3.C0847w;
import af3.C0848x;
import af3.C0850z;
import af3.InterfaceC0827c0;
import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Pair;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import androidx.health.platform.client.proto.C1533u;
import androidx.lifecycle.C1601k1;
import androidx.room.AbstractC1772c1;
import ao.C1863a;
import b10.C2222b;
import b10.C2225c;
import b10.C2273z0;
import b10.EnumC2228d;
import b20.C2326f;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import b30.C2570m;
import bz.C3709h;
import bz.InterfaceC3704c;
import c20.C3879g;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.mapbox.bindgen.Value;
import com.mapbox.geojson.Point;
import com.mapbox.maps.ImageHolder;
import com.mapbox.maps.MapboxLogger;
import com.mapbox.maps.MapboxStyleManager;
import com.mapbox.maps.Style;
import com.nimbusds.jose.JOSEException;
import com.stripe.android.p056ui.core.elements.DropdownItemSpec;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseParseException;
import e20.C12593a;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import g40.C15393n0;
import g40.InterfaceC15398o0;
import g40.InterfaceC15403p0;
import gw.AbstractC16256g;
import gw.C16255f;
import gw.C16260k;
import gw.C16261l;
import gw.C16267r;
import h20.C16651f;
import io.getstream.android.video.generated.models.VideoEvent;
import io.getstream.chat.android.client.extensions.AttachmentExtensionsKt;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.zip.Inflater;
import javax.crypto.SecretKey;
import l83.C23465k;
import l83.C23468n;
import l83.C23470p;
import le3.C23886g;
import m83.AbstractC25247g0;
import m83.AbstractC25267u;
import m83.C25235a0;
import m83.C25272z;
import n20.C26166a;
import n30.InterfaceC26213d;
import ne3.C26624l;
import ng3.C26701n;
import o20.C27456a;
import o30.C27504b;
import o30.InterfaceC27506d;
import o73.C27648a;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p002a0.C0021f1;
import p026b2.C2320z;
import p031b9.AbstractC2875y;
import p031b9.C2819b1;
import p127ev.C13662c;
import p133f1.C13968p1;
import p167g5.C15486e;
import p171g9.C15594k;
import p202hw.C17690a;
import p299l9.C23537y;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p412q3.C29875i;
import p442qy.C30765d;
import p444r.MenuC30804a0;
import p444r.MenuC30818l;
import p444r.MenuItemC30825s;
import p465rm.C31521c0;
import p465rm.C31570t0;
import p470rv.AbstractC31834n;
import p470rv.C31835o;
import p470rv.InterfaceC31836p;
import p499t9.C33623c0;
import p499t9.C33647p;
import p499t9.C33652u;
import p503tp.AbstractC34036g;
import p503tp.AbstractC34051v;
import p503tp.InterfaceC34050u;
import p505ts.AbstractC34132o;
import p512u2.AbstractC34454d0;
import p512u2.C34465k;
import p512u2.C34472r;
import p512u2.C34478x;
import p512u2.C34479y;
import p512u2.EnumC34466l;
import p512u2.EnumC34477w;
import p556vm.InterfaceC36138e;
import p566vz.InterfaceC36611c;
import p576w8.C36932b;
import p604x4.InterfaceMenuItemC37950a;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p607x8.InterfaceC38049d;
import p628xw.C38672b;
import p635y2.InterfaceC39147y;
import p643ya.C39354a;
import p664yy.C39865j;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p696zy.C41210b;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.time.Duration;
import p715kotlin.time.DurationUnit;
import q30.C29919n;
import q30.C29938w0;
import q83.AbstractC30060g;
import q83.InterfaceC30063j;
import qa.C30096a;
import qa.C30106k;
import qa.InterfaceC30107l;
import r30.C30897b;
import r30.C30902g;
import r30.EnumC30901f;
import r30.EnumC30904i;
import rb3.AbstractC31199g;
import re.AbstractC31268f;
import re.AbstractC31309z;
import re.C31286n0;
import re.C31294r0;
import sn.AbstractC32735h;
import sn.C32745m;
import sn.C32763v;
import sn.C32768x0;
import sn.C32770z;
import sn.InterfaceC32722a0;
import so.C32800q;
import u00.C34377e;
import u10.C34416d;
import ud3.C34826l0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.InterfaceC34811e1;
import uy.C35373a;
import v00.C35459c0;
import v03.C35516c;
import v03.C35518e;
import v03.InterfaceC35521h;
import vv1.C36532c;
import wb3.AbstractC37056f;
import x10.AbstractC37826a;
import x33.C37949a;
import x43.C37980l;
import x43.InterfaceC37973e;
import y00.C38951s4;
import z10.AbstractC39982e;
import z40.C40062i;
import z63.C40136h;
import z63.InterfaceC40130b;
import z63.InterfaceC40133e;

/* JADX INFO: renamed from: q.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C29662f implements InterfaceC29657a, InterfaceC32722a0, InterfaceC36138e, InterfaceC31836p, InterfaceC30107l, InterfaceC34050u, InterfaceC15403p0, InterfaceC0827c0 {

    /* JADX INFO: renamed from: E */
    public Object f121228E;

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f121229w;

    /* JADX INFO: renamed from: x */
    public Object f121230x;

    /* JADX INFO: renamed from: y */
    public Object f121231y;

    /* JADX INFO: renamed from: z */
    public Object f121232z;

    public /* synthetic */ C29662f(int i13, boolean z4) {
        this.f121229w = i13;
    }

    /* JADX INFO: renamed from: m0 */
    public static C30902g m91073m0(C30897b c30897b, int i13, String str, String str2) {
        String strValueOf = String.valueOf(i13);
        C26701n c26701n = EnumC30901f.f127432x;
        return new C30902g(c30897b.f127394x, c30897b.f127395y, strValueOf, str, str2, "CRes", c30897b.f127393w, c30897b.f127396z, 4);
    }

    /* JADX INFO: renamed from: q0 */
    public static Map m91074q0(Duration duration) {
        return duration != null ? AbstractC25247g0.m73989X(new C23465k(AttachmentExtensionsKt.EXTRA_DURATION, Float.valueOf((float) Duration.m134298toDoubleimpl(duration.getRawValue(), DurationUnit.MILLISECONDS)))) : C25272z.f99163w;
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: A */
    public void mo91075A(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y, IOException iOException, boolean z4) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102766h(c32745m, c23537y, iOException, z4);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102766h(c32745m, m91137z0(c23537y), iOException, z4);
                }
                break;
        }
    }

    /* JADX INFO: renamed from: A0 */
    public void m91076A0() {
        C34479y c34479y = (C34479y) this.f121228E;
        if (((EnumC34477w) this.f121231y) == EnumC34477w.f144845x) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            C34478x c34478x = new C34478x(c34479y, 0);
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            motionEventObtain.setSource(0);
            c34478x.invoke(motionEventObtain);
            motionEventObtain.recycle();
            this.f121231y = EnumC34477w.f144844w;
            c34479y.f144852y = false;
            this.f121232z = null;
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: B */
    public void mo2031B(C0843s c0843s) {
        m91101U0(c0843s);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: B0 */
    public void m91077B0(C34465k c34465k, EnumC34466l enumC34466l) {
        boolean z4;
        boolean z13;
        boolean z14;
        C34479y c34479y = (C34479y) this.f121228E;
        ?? r10 = c34465k.f144800a;
        Collection collection = (Collection) r10;
        int size = collection.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size) {
                z4 = true;
                break;
            }
            C34472r c34472r = (C34472r) r10.get(i13);
            if (AbstractC34454d0.m108912c(c34472r) || AbstractC34454d0.m108914e(c34472r)) {
                z4 = false;
                break;
            }
            i13++;
        }
        if (!z4) {
            z13 = false;
            break;
        }
        int size2 = collection.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size2) {
                z13 = true;
                break;
            } else {
                if (((C34472r) r10.get(i14)).m108956l()) {
                    z13 = false;
                    break;
                }
                i14++;
            }
        }
        if (c34479y.f144852y) {
            z14 = true;
            break;
        }
        int size3 = collection.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                if (!z13) {
                    z14 = false;
                    break;
                }
                break;
            } else {
                C34472r c34472r2 = (C34472r) r10.get(i15);
                if (!AbstractC34454d0.m108912c(c34472r2) && !AbstractC34454d0.m108914e(c34472r2)) {
                    i15++;
                }
            }
            z14 = true;
            break;
        }
        if (((EnumC34477w) this.f121231y) != EnumC34477w.f144846y) {
            if (enumC34466l == EnumC34466l.f144806w && z14) {
                this.f121232z = c34465k;
                m91127p0(c34465k, !z4 || c34479y.f144852y);
            }
            if (enumC34466l == EnumC34466l.f144807x && z4 && c34465k.equals((C34465k) this.f121232z) && c34479y.f144852y) {
                int size4 = collection.size();
                for (int i16 = 0; i16 < size4; i16++) {
                    ((C34472r) r10.get(i16)).m108946a();
                }
            }
            if (enumC34466l == EnumC34466l.f144808y && !z14 && !c34465k.equals((C34465k) this.f121232z)) {
                m91127p0(c34465k, true);
            }
        }
        if (enumC34466l == EnumC34466l.f144808y) {
            int size5 = collection.size();
            int i17 = 0;
            while (true) {
                if (i17 >= size5) {
                    this.f121231y = EnumC34477w.f144844w;
                    c34479y.f144852y = false;
                    this.f121232z = null;
                    break;
                } else if (!AbstractC34454d0.m108914e((C34472r) r10.get(i17))) {
                    break;
                } else {
                    i17++;
                }
            }
            if (c34465k.equals((C34465k) this.f121232z) && z4) {
                int size6 = collection.size();
                for (int i18 = 0; i18 < size6; i18++) {
                    if (((C34472r) r10.get(i18)).m108956l()) {
                        if (c34479y.f144852y) {
                            break;
                        }
                        m91098S0(c34465k);
                        return;
                    }
                }
                int size7 = collection.size();
                for (int i19 = 0; i19 < size7; i19++) {
                    ((C34472r) r10.get(i19)).m108946a();
                }
            }
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: C */
    public void mo91078C(C29938w0 c29938w0) {
        c29938w0.m91558b((C31835o) this.f121232z);
    }

    /* JADX INFO: renamed from: C0 */
    public boolean m91079C0(VideoEvent videoEvent) {
        C2345k c2345kM91131u0 = m91131u0();
        InterfaceC2339e interfaceC2339e = c2345kM91131u0.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = c2345kM91131u0.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            c2345kM91131u0.f9274b.log(enumC2341g, str, "[send] event: `" + videoEvent + "`", null);
        }
        C26624l bytes = ((InterfaceC37973e) this.f121230x).mo30747q(videoEvent);
        C23886g c23886g = (C23886g) ((InterfaceC34811e1) this.f121228E);
        c23886g.getClass();
        AbstractC22676k.m65750j(bytes, "bytes");
        return c23886g.m70165g(2, bytes);
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: D */
    public void mo91067D(AbstractC29658b abstractC29658b) {
        ((ActionMode.Callback) this.f121230x).onDestroyActionMode(m91130t0(abstractC29658b));
    }

    /* JADX INFO: renamed from: D0 */
    public void m91080D0(AbstractC31268f abstractC31268f) {
        this.f121230x = abstractC31268f;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: E */
    public void mo91081E(int i13, int i14) {
        float[] fArrM98898g = AbstractC31834n.m98898g(i13);
        float[] fArrM98898g2 = AbstractC31834n.m98898g(i14);
        ArrayList arrayListM98895d = AbstractC31834n.m98895d(fArrM98898g);
        ArrayList arrayListM98895d2 = AbstractC31834n.m98895d(fArrM98898g2);
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("accuracy-radius-color", new Value((List<Value>) arrayListM98895d));
        c31835o.m98907d("accuracy-radius-border-color", new Value((List<Value>) arrayListM98895d2));
    }

    /* JADX INFO: renamed from: E0 */
    public void m91082E0(Map map) {
        this.f121231y = map;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: F */
    public void mo2032F(C0837m c0837m) {
        m91101U0(c0837m);
    }

    /* JADX INFO: renamed from: F0 */
    public void m91083F0(AbstractC31309z abstractC31309z) {
        this.f121230x = abstractC31309z;
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: G */
    public void mo91084G(int i13, C32763v c32763v, C23537y c23537y) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102769k(c23537y);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102769k(m91137z0(c23537y));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public void m91085G0(Map map) {
        this.f121231y = map;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: H */
    public boolean mo845H() {
        return false;
    }

    /* JADX INFO: renamed from: H0 */
    public void m91086H0() {
        this.f121232z = "5311fm7hqak9lrnpht6kp2p5uh";
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: I */
    public void mo2033I(C0826c c0826c) {
        m91101U0(c0826c);
    }

    /* JADX INFO: renamed from: I0 */
    public void m91087I0(String str) {
        this.f121232z = str;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: J */
    public void mo2034J(C0839o c0839o) {
        m91101U0(c0839o);
    }

    /* JADX INFO: renamed from: J0 */
    public void m91088J0(Map map) {
        this.f121228E = map;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: K */
    public void mo91089K(Value value) {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("shadow-image-size", value);
        c31835o.m98907d("bearing-image-size", value);
        c31835o.m98907d("top-image-size", value);
    }

    /* JADX INFO: renamed from: K0 */
    public void m91090K0(String str) {
        this.f121228E = str;
    }

    /* JADX INFO: renamed from: L0 */
    public void m91091L0(Integer num) {
        this.f121231y = num;
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: M */
    public ArrayList mo849M() {
        return (ArrayList) this.f121228E;
    }

    /* JADX INFO: renamed from: M0 */
    public void m91092M0(Integer num) {
        this.f121232z = num;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: N */
    public void mo2035N(C0847w c0847w) {
        m91101U0(c0847w);
    }

    /* JADX INFO: renamed from: N0 */
    public void m91093N0(InterfaceC39147y interfaceC39147y) {
        this.f121230x = interfaceC39147y;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: O */
    public void mo2036O(C0846v c0846v) {
        m91101U0(c0846v);
    }

    /* JADX INFO: renamed from: O0 */
    public void m91094O0(String str) {
        this.f121230x = str;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: P */
    public void mo2037P(C0832h c0832h) {
        m91101U0(c0832h);
    }

    /* JADX INFO: renamed from: P0 */
    public void m91095P0(String str) {
        this.f121228E = str;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: Q */
    public void mo2038Q(C0836l c0836l) {
        m91101U0(c0836l);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m91096Q0(int i13, Object obj) {
        C40136h c40136h = (C40136h) this.f121232z;
        StringBuilder sb4 = c40136h.f173190w;
        int length = sb4.length();
        if (obj != null) {
            int length2 = sb4.length();
            if (length <= i13 || i13 < 0 || length > length2) {
                return;
            }
            C40136h.m128678c(c40136h, obj, i13, length);
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: R */
    public void mo2039R(C0848x c0848x) {
        m91101U0(c0848x);
    }

    /* JADX INFO: renamed from: R0 */
    public void m91097R0(AbstractC0844t abstractC0844t, int i13) {
        Class<?> cls = abstractC0844t.getClass();
        C2570m c2570m = (C2570m) this.f121230x;
        InterfaceC40133e interfaceC40133e = (InterfaceC40133e) ((C27456a) c2570m.f9985F).f110654a.get(cls);
        if (interfaceC40133e != null) {
            m91096Q0(i13, interfaceC40133e.mo7932a(c2570m, (C15594k) this.f121231y));
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: S */
    public void mo2040S(C0825b0 c0825b0) {
        m91101U0(c0825b0);
    }

    /* JADX INFO: renamed from: S0 */
    public void m91098S0(C34465k c34465k) {
        if (((EnumC34477w) this.f121231y) == EnumC34477w.f144845x) {
            InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f121230x;
            if (interfaceC39147y == null) {
                throw new IllegalStateException("layoutCoordinates not set");
            }
            AbstractC34454d0.m108923n(c34465k, interfaceC39147y.mo3523Z(0L), new C34478x((C34479y) this.f121228E, 1), true);
        }
        this.f121231y = EnumC34477w.f144846y;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: T */
    public void mo91099T(Point latLng) {
        AbstractC22676k.m65750j(latLng, "latLng");
        List listM118959K = AbstractC37056f.m118959K(Double.valueOf(latLng.latitude()), Double.valueOf(latLng.longitude()), Double.valueOf(0.0d));
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        List list = listM118959K;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Value(((Number) it.next()).doubleValue()));
        }
        c31835o.m98907d("location", new Value((List<Value>) arrayList));
    }

    /* JADX INFO: renamed from: T0 */
    public C2273z0 m91100T0() {
        Application application = (Application) this.f121231y;
        AbstractC39982e abstractC39982e = (AbstractC39982e) this.f121230x;
        C36532c c36532c = new C36532c(abstractC39982e, 19);
        EnumC2228d enumC2228d = EnumC2228d.PaymentElement;
        InterfaceC30063j interfaceC30063j = (InterfaceC30063j) ((InterfaceC35521h) this.f121232z).get();
        C36532c c36532c2 = new C36532c(abstractC39982e, 19);
        C25235a0 c25235a0 = C25235a0.f99113w;
        return new C2273z0(application, c36532c, enumC2228d, interfaceC30063j, c25235a0, new C2222b(application, c25235a0, c36532c2), new C39865j((C30765d) ((InterfaceC35521h) this.f121228E).get(), (InterfaceC30063j) ((InterfaceC35521h) this.f121232z).get()), (C30765d) ((InterfaceC35521h) this.f121228E).get());
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: U */
    public void mo2041U(AbstractC0829e abstractC0829e) {
        m91101U0(abstractC0829e);
    }

    /* JADX INFO: renamed from: U0 */
    public void m91101U0(AbstractC0844t abstractC0844t) {
        InterfaceC40130b interfaceC40130b = (InterfaceC40130b) ((Map) this.f121228E).get(abstractC0844t.getClass());
        if (interfaceC40130b != null) {
            interfaceC40130b.mo1291a(this, abstractC0844t);
        } else {
            m91103V0(abstractC0844t);
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: V */
    public void mo91102V(String str) {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        if (str == null) {
            str = "";
        }
        c31835o.m98907d("slot", new Value(str));
    }

    /* JADX INFO: renamed from: V0 */
    public void m91103V0(AbstractC0844t abstractC0844t) {
        AbstractC0844t abstractC0844t2 = abstractC0844t.f3039b;
        while (abstractC0844t2 != null) {
            AbstractC0844t abstractC0844t3 = abstractC0844t2.f3042e;
            abstractC0844t2.mo2029a(this);
            abstractC0844t2 = abstractC0844t3;
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: W */
    public void mo2042W(AbstractC0830f abstractC0830f) {
        m91101U0(abstractC0830f);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: X */
    public void mo91104X() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f121228E;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleLayer(((C31835o) this.f121232z).f131895a);
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: Y */
    public void mo91105Y(MapboxStyleManager style) {
        AbstractC22676k.m65750j(style, "style");
        this.f121228E = style;
        C13662c c13662c = (C13662c) this.f121230x;
        m91115g0(style, "mapbox-location-top-icon", c13662c.f48419w);
        m91115g0(style, "mapbox-location-bearing-icon", c13662c.f48420x);
        m91115g0(style, "mapbox-location-shadow-icon", c13662c.f48421y);
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("top-image", new Value("mapbox-location-top-icon"));
        c31835o.m98907d("bearing-image", new Value("mapbox-location-bearing-icon"));
        c31835o.m98907d("shadow-image", new Value("mapbox-location-shadow-icon"));
        c31835o.m98907d("location-indicator-opacity", new Value(c13662c.f48418E));
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: Z */
    public void mo91106Z(Style style) {
        this.f121228E = style;
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.f131897c = style;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: a */
    public void mo2043a(C0833i c0833i) {
        m91101U0(c0833i);
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: a0 */
    public void mo91107a0(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102762d(c32745m, c23537y);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102762d(c32745m, m91137z0(c23537y));
                }
                break;
        }
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: b */
    public String mo853b(String rawValue) {
        Object next;
        String displayText;
        AbstractC22676k.m65750j(rawValue, "rawValue");
        List list = (List) this.f121231y;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!AbstractC22676k.m65745e(((DropdownItemSpec) next).getApiValue(), rawValue));
        DropdownItemSpec dropdownItemSpec = (DropdownItemSpec) next;
        return (dropdownItemSpec == null || (displayText = dropdownItemSpec.getDisplayText()) == null) ? ((DropdownItemSpec) list.get(0)).getDisplayText() : displayText;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: b0 */
    public void mo91108b0() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f121228E;
        if (mapboxStyleManager != null) {
            mapboxStyleManager.removeStyleImage("mapbox-location-top-icon");
        }
        MapboxStyleManager mapboxStyleManager2 = (MapboxStyleManager) this.f121228E;
        if (mapboxStyleManager2 != null) {
            mapboxStyleManager2.removeStyleImage("mapbox-location-bearing-icon");
        }
        MapboxStyleManager mapboxStyleManager3 = (MapboxStyleManager) this.f121228E;
        if (mapboxStyleManager3 != null) {
            mapboxStyleManager3.removeStyleImage("mapbox-location-shadow-icon");
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: c */
    public void mo91109c() {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("visibility", new Value("visible"));
    }

    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: c0 */
    public int mo91110c0() {
        switch (this.f121229w) {
        }
        return 2;
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: d */
    public void mo91111d(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102768j(c32745m, c23537y);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102768j(c32745m, m91137z0(c23537y));
                }
                break;
        }
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: d0 */
    public void mo91112d0(float f13) {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("accuracy-radius", new Value(f13));
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: e */
    public String mo855e(int i13) {
        return (String) ((ArrayList) this.f121228E).get(i13);
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: e0 */
    public void mo2044e0(C0850z c0850z) {
        m91101U0(c0850z);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: f */
    public boolean mo91113f() {
        MapboxStyleManager mapboxStyleManager = (MapboxStyleManager) this.f121228E;
        if (mapboxStyleManager != null) {
            return mapboxStyleManager.styleLayerExists("mapbox-location-indicator-layer");
        }
        return false;
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: f0 */
    public void mo91114f0() {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("visibility", new Value("none"));
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: g */
    public InterfaceC15398o0 mo857g() {
        return new C15393n0(true);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002d  */
    /* JADX INFO: renamed from: g0 */
    public void m91115g0(MapboxStyleManager mapboxStyleManager, String str, ImageHolder imageHolder) {
        Integer drawableId;
        Bitmap bitmap;
        Bitmap bitmap2;
        if (imageHolder != null && (bitmap2 = imageHolder.getBitmap()) != null) {
            mapboxStyleManager.addImage(str, bitmap2);
            return;
        }
        Context context = (Context) ((WeakReference) this.f121231y).get();
        if (context == null) {
            MapboxLogger.logE("LocationPuck2D", "Could not set 2D puck image as drawable for " + str + " because there is no Android Context!");
            return;
        }
        if (imageHolder != null && (drawableId = imageHolder.getDrawableId()) != null) {
            Drawable drawableM92133x = AbstractC30060g.m92133x(context, drawableId.intValue());
            if (drawableM92133x == null) {
                bitmap = null;
            } else if (drawableM92133x instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawableM92133x).getBitmap();
            } else {
                Drawable.ConstantState constantState = drawableM92133x.getConstantState();
                if (constantState == null) {
                    bitmap = null;
                } else {
                    Drawable drawableMutate = constantState.newDrawable().mutate();
                    AbstractC22676k.m65749i(drawableMutate, "constantState.newDrawable().mutate()");
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawableMutate.getIntrinsicWidth(), drawableMutate.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas = new Canvas(bitmapCreateBitmap);
                    drawableMutate.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
                    drawableMutate.draw(canvas);
                    bitmap = bitmapCreateBitmap;
                }
            }
            if ((bitmap != null ? mapboxStyleManager.addImage(str, bitmap) : null) != null) {
                return;
            }
        }
        MapboxLogger.logE("LocationPuck2D", "No image holder data for " + str + '!');
    }

    @Override // g40.InterfaceC15403p0
    public InterfaceC41211c getLabel() {
        return (C41210b) this.f121230x;
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: h */
    public void mo91116h(int i13, C32763v c32763v, C23537y c23537y) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102760b(c23537y);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102760b(m91137z0(c23537y));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public void m91117h0(AbstractC0844t abstractC0844t) {
        if (abstractC0844t.f3042e != null) {
            m91128r0();
            ((C40136h) this.f121232z).m128679a('\n');
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: i */
    public void mo2045i(C0834j c0834j) {
        m91101U0(c0834j);
    }

    /* JADX INFO: renamed from: i0 */
    public C31286n0 m91118i0() {
        return new C31286n0(this);
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: j */
    public void mo2046j(C0823a0 c0823a0) {
        m91101U0(c0823a0);
    }

    /* JADX INFO: renamed from: j0 */
    public C31294r0 m91119j0() {
        return new C31294r0(this);
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0207  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v29 */
    @Override // qa.InterfaceC30107l
    /* JADX INFO: renamed from: k */
    public void mo91120k(byte[] bArr, int i13, int i14, C30106k c30106k, InterfaceC38049d interfaceC38049d) {
        int[] iArr;
        char c3;
        boolean z4;
        C36932b c36932b;
        int i15;
        int i16;
        int iM121867t;
        C36932b c36932b2;
        int iM121870w;
        C36932b c36932b3;
        C41060w0 c41060w0M133256r;
        Rect rect;
        int i17 = 4;
        char c7 = 255;
        int i18 = 0;
        int i19 = 2;
        boolean z13 = true;
        switch (this.f121229w) {
            case 11:
                C1863a c1863a = (C1863a) this.f121232z;
                C38059n c38059n = (C38059n) this.f121231y;
                C38059n c38059n2 = (C38059n) this.f121230x;
                c38059n2.m121844D(i13 + i14, bArr);
                c38059n2.m121846F(i13);
                if (((Inflater) this.f121228E) == null) {
                    this.f121228E = new Inflater();
                }
                Inflater inflater = (Inflater) this.f121228E;
                int i24 = AbstractC38065t.f163031a;
                if (c38059n2.m121848a() > 0 && (c38059n2.f163017a[c38059n2.f163018b] & 255) == 120 && AbstractC38065t.m121891E(c38059n2, c38059n, inflater)) {
                    c38059n2.m121844D(c38059n.f163019c, c38059n.f163017a);
                }
                c1863a.f7366c = 0;
                int[] iArr2 = c1863a.f7364a;
                C38059n c38059n3 = (C38059n) c1863a.f7372i;
                c1863a.f7367d = 0;
                c1863a.f7368e = 0;
                c1863a.f7369f = 0;
                c1863a.f7370g = 0;
                c1863a.f7371h = 0;
                c38059n3.m121843C(0);
                c1863a.f7365b = false;
                ArrayList arrayList = new ArrayList();
                for (int i25 = 3; c38059n2.m121848a() >= i25; i25 = 3) {
                    int i26 = c38059n2.f163019c;
                    int iM121867t2 = c38059n2.m121867t();
                    int iM121873z = c38059n2.m121873z();
                    int i27 = c38059n2.f163018b + iM121873z;
                    if (i27 > i26) {
                        c38059n2.m121846F(i26);
                        iArr = iArr2;
                        i15 = i18;
                        z4 = z13;
                        c36932b2 = null;
                        c3 = c7;
                    } else {
                        char c14 = 128;
                        if (iM121867t2 != 128) {
                            switch (iM121867t2) {
                                case 20:
                                    if (iM121873z % 5 != i19) {
                                        iArr = iArr2;
                                        c3 = c7;
                                        z4 = z13;
                                    } else {
                                        c38059n2.m121847G(i19);
                                        Arrays.fill(iArr2, i18);
                                        int i28 = iM121873z / 5;
                                        int i29 = i18;
                                        while (i29 < i28) {
                                            int iM121867t3 = c38059n2.m121867t();
                                            char c15 = c14;
                                            double dM121867t = c38059n2.m121867t();
                                            double dM121867t2 = c38059n2.m121867t() - 128;
                                            int[] iArr3 = iArr2;
                                            double dM121867t3 = c38059n2.m121867t() - 128;
                                            iArr3[iM121867t3] = (AbstractC38065t.m121914g((int) ((1.402d * dM121867t2) + dM121867t), 0, 255) << 16) | (c38059n2.m121867t() << 24) | (AbstractC38065t.m121914g((int) ((dM121867t - (0.34414d * dM121867t3)) - (dM121867t2 * 0.71414d)), 0, 255) << 8) | AbstractC38065t.m121914g((int) ((1.772d * dM121867t3) + dM121867t), 0, 255);
                                            i29++;
                                            c14 = c15;
                                            iArr2 = iArr3;
                                            c7 = 255;
                                            z13 = true;
                                        }
                                        iArr = iArr2;
                                        c3 = c7;
                                        z4 = z13;
                                        c1863a.f7365b = z4;
                                    }
                                    break;
                                case 21:
                                    if (iM121873z >= 4) {
                                        c38059n2.m121847G(3);
                                        int i34 = iM121873z - 4;
                                        if (((128 & c38059n2.m121867t()) != 0 ? z13 : i18) != 0) {
                                            if (i34 >= 7 && (iM121870w = c38059n2.m121870w()) >= 4) {
                                                c1863a.f7370g = c38059n2.m121873z();
                                                c1863a.f7371h = c38059n2.m121873z();
                                                c38059n3.m121843C(iM121870w - 4);
                                                i34 = iM121873z - 11;
                                            }
                                        }
                                        int i35 = c38059n3.f163018b;
                                        int i36 = c38059n3.f163019c;
                                        if (i35 < i36 && i34 > 0) {
                                            int iMin = Math.min(i34, i36 - i35);
                                            c38059n2.m121852e(c38059n3.f163017a, i35, iMin);
                                            c38059n3.m121846F(i35 + iMin);
                                        }
                                    }
                                    iArr = iArr2;
                                    c3 = c7;
                                    z4 = z13;
                                    break;
                                case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                    if (iM121873z >= 19) {
                                        c1863a.f7366c = c38059n2.m121873z();
                                        c1863a.f7367d = c38059n2.m121873z();
                                        c38059n2.m121847G(11);
                                        c1863a.f7368e = c38059n2.m121873z();
                                        c1863a.f7369f = c38059n2.m121873z();
                                        break;
                                    }
                                default:
                                    iArr = iArr2;
                                    c3 = c7;
                                    z4 = z13;
                                    break;
                            }
                            i15 = 0;
                            c36932b = null;
                        } else {
                            iArr = iArr2;
                            c3 = c7;
                            z4 = z13;
                            if (c1863a.f7366c == 0 || c1863a.f7367d == 0 || c1863a.f7370g == 0 || c1863a.f7371h == 0 || (i16 = c38059n3.f163019c) == 0 || c38059n3.f163018b != i16 || !c1863a.f7365b) {
                                c36932b = null;
                            } else {
                                c38059n3.m121846F(0);
                                int i37 = c1863a.f7370g * c1863a.f7371h;
                                int[] iArr4 = new int[i37];
                                int i38 = 0;
                                while (i38 < i37) {
                                    int iM121867t4 = c38059n3.m121867t();
                                    if (iM121867t4 != 0) {
                                        iM121867t = i38 + 1;
                                        iArr4[i38] = iArr[iM121867t4];
                                    } else {
                                        int iM121867t5 = c38059n3.m121867t();
                                        if (iM121867t5 != 0) {
                                            iM121867t = ((iM121867t5 & 64) == 0 ? iM121867t5 & 63 : ((iM121867t5 & 63) << 8) | c38059n3.m121867t()) + i38;
                                            Arrays.fill(iArr4, i38, iM121867t, (iM121867t5 & 128) == 0 ? iArr[0] : iArr[c38059n3.m121867t()]);
                                        }
                                    }
                                    i38 = iM121867t;
                                }
                                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iArr4, c1863a.f7370g, c1863a.f7371h, Bitmap.Config.ARGB_8888);
                                float f13 = c1863a.f7368e;
                                float f14 = c1863a.f7366c;
                                float f15 = f13 / f14;
                                float f16 = c1863a.f7369f;
                                float f17 = c1863a.f7367d;
                                c36932b = new C36932b(null, null, null, bitmapCreateBitmap, f16 / f17, 0, 0, f15, 0, Integer.MIN_VALUE, -3.4028235E38f, c1863a.f7370g / f14, c1863a.f7371h / f17, false, -16777216, Integer.MIN_VALUE, 0.0f);
                            }
                            i15 = 0;
                            c1863a.f7366c = 0;
                            c1863a.f7367d = 0;
                            c1863a.f7368e = 0;
                            c1863a.f7369f = 0;
                            c1863a.f7370g = 0;
                            c1863a.f7371h = 0;
                            c38059n3.m121843C(0);
                            c1863a.f7365b = false;
                        }
                        c38059n2.m121846F(i27);
                        c36932b2 = c36932b;
                    }
                    if (c36932b2 != null) {
                        arrayList.add(c36932b2);
                    }
                    iArr2 = iArr;
                    z13 = z4;
                    c7 = c3;
                    i18 = i15;
                    i19 = 2;
                }
                interfaceC38049d.accept(new C30096a(arrayList, -9223372036854775807L, -9223372036854775807L));
                break;
            default:
                C38059n c38059n4 = (C38059n) this.f121230x;
                c38059n4.m121844D(i13 + i14, bArr);
                c38059n4.m121846F(i13);
                C38059n c38059n5 = (C38059n) this.f121231y;
                C39354a c39354a = (C39354a) this.f121232z;
                if (((Inflater) this.f121228E) == null) {
                    this.f121228E = new Inflater();
                }
                Inflater inflater2 = (Inflater) this.f121228E;
                int i39 = AbstractC38065t.f163031a;
                if (c38059n4.m121848a() > 0 && (255 & c38059n4.f163017a[c38059n4.f163018b]) == 120 && AbstractC38065t.m121891E(c38059n4, c38059n5, inflater2)) {
                    c38059n4.m121844D(c38059n5.f163019c, c38059n5.f163017a);
                }
                c39354a.f169398c = false;
                c39354a.f169402g = null;
                c39354a.f169403h = -1;
                c39354a.f169404i = -1;
                int iM121848a = c38059n4.m121848a();
                if (iM121848a < 2 || c38059n4.m121873z() != iM121848a) {
                    c36932b3 = null;
                } else {
                    int[] iArr5 = c39354a.f169399d;
                    if (iArr5 != null && c39354a.f169397b) {
                        c38059n4.m121847G(c38059n4.m121873z() - 2);
                        int iM121873z2 = c38059n4.m121873z();
                        int[] iArr6 = c39354a.f169396a;
                        while (c38059n4.f163018b < iM121873z2 && c38059n4.m121848a() > 0) {
                            switch (c38059n4.m121867t()) {
                                case 0:
                                case 1:
                                case 2:
                                    break;
                                case 3:
                                    if (c38059n4.m121848a() >= 2) {
                                        int iM121867t6 = c38059n4.m121867t();
                                        int iM121867t7 = c38059n4.m121867t();
                                        iArr6[3] = C39354a.m125488a(iArr5, iM121867t6 >> 4);
                                        iArr6[2] = C39354a.m125488a(iArr5, iM121867t6 & 15);
                                        iArr6[1] = C39354a.m125488a(iArr5, iM121867t7 >> 4);
                                        iArr6[0] = C39354a.m125488a(iArr5, iM121867t7 & 15);
                                        c39354a.f169398c = true;
                                        i17 = 4;
                                    }
                                    break;
                                case 4:
                                    if (c38059n4.m121848a() >= 2 && c39354a.f169398c) {
                                        int iM121867t8 = c38059n4.m121867t();
                                        int iM121867t9 = c38059n4.m121867t();
                                        iArr6[3] = C39354a.m125489c(iArr6[3], iM121867t8 >> 4);
                                        iArr6[2] = C39354a.m125489c(iArr6[2], iM121867t8 & 15);
                                        iArr6[1] = C39354a.m125489c(iArr6[1], iM121867t9 >> 4);
                                        iArr6[0] = C39354a.m125489c(iArr6[0], iM121867t9 & 15);
                                        i17 = 4;
                                    }
                                    break;
                                case 5:
                                    if (c38059n4.m121848a() >= 6) {
                                        int iM121867t10 = c38059n4.m121867t();
                                        int iM121867t11 = c38059n4.m121867t();
                                        int i44 = (iM121867t10 << i17) | (iM121867t11 >> 4);
                                        int iM121867t12 = ((iM121867t11 & 15) << 8) | c38059n4.m121867t();
                                        int iM121867t13 = c38059n4.m121867t();
                                        int iM121867t14 = c38059n4.m121867t();
                                        c39354a.f169402g = new Rect(i44, (iM121867t13 << 4) | (iM121867t14 >> 4), iM121867t12 + 1, (((iM121867t14 & 15) << 8) | c38059n4.m121867t()) + 1);
                                        i17 = 4;
                                    }
                                    break;
                                case 6:
                                    if (c38059n4.m121848a() >= i17) {
                                        c39354a.f169403h = c38059n4.m121873z();
                                        c39354a.f169404i = c38059n4.m121873z();
                                    }
                                    break;
                            }
                        }
                    }
                    if (c39354a.f169399d == null || !c39354a.f169397b || !c39354a.f169398c || (rect = c39354a.f169402g) == null || c39354a.f169403h == -1 || c39354a.f169404i == -1 || rect.width() < 2 || c39354a.f169402g.height() < 2) {
                        c36932b3 = null;
                    } else {
                        Rect rect2 = c39354a.f169402g;
                        int[] iArr7 = new int[rect2.height() * rect2.width()];
                        C24561s c24561s = new C24561s(5);
                        c38059n4.m121846F(c39354a.f169403h);
                        c24561s.m71639p(c38059n4);
                        c39354a.m125490b(c24561s, true, rect2, iArr7);
                        c38059n4.m121846F(c39354a.f169404i);
                        c24561s.m71639p(c38059n4);
                        c39354a.m125490b(c24561s, false, rect2, iArr7);
                        c36932b3 = new C36932b(null, null, null, Bitmap.createBitmap(iArr7, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888), rect2.top / c39354a.f169401f, 0, 0, rect2.left / c39354a.f169400e, 0, Integer.MIN_VALUE, -3.4028235E38f, rect2.width() / c39354a.f169400e, rect2.height() / c39354a.f169401f, false, -16777216, Integer.MIN_VALUE, 0.0f);
                    }
                }
                if (c36932b3 != null) {
                    c41060w0M133256r = AbstractC41023g0.m133256r(c36932b3);
                } else {
                    C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                    c41060w0M133256r = C41060w0.f177067E;
                }
                interfaceC38049d.accept(new C30096a(c41060w0M133256r, -9223372036854775807L, 5000000L));
                break;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public C38951s4 m91121k0() {
        return new C38951s4((String) this.f121230x, (Integer) this.f121231y, (Integer) this.f121232z, (String) this.f121228E, null, null, null, 48);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: l */
    public void mo91122l(int i13, float f13, Float f14) {
        C31835o c31835o = (C31835o) this.f121232z;
        float[] fArrM98898g = AbstractC31834n.m98898g(i13);
        fArrM98898g[3] = f14.floatValue();
        c31835o.getClass();
        c31835o.m98907d("emphasis-circle-radius", new Value(f13));
        c31835o.m98907d("emphasis-circle-color", new Value((List<Value>) AbstractC31834n.m98895d(fArrM98898g)));
    }

    /* JADX INFO: renamed from: l0 */
    public boolean m91123l0(int i13, String str, String str2) {
        C2345k c2345kM91131u0 = m91131u0();
        InterfaceC2339e interfaceC2339e = c2345kM91131u0.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str3 = c2345kM91131u0.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
            InterfaceC2344j interfaceC2344j = c2345kM91131u0.f9274b;
            StringBuilder sbM30467u = AbstractC11266d.m30467u(i13, "[close], source:", str, ", code: ", ", reason: ");
            sbM30467u.append(str2);
            interfaceC2344j.log(enumC2341g, str3, sbM30467u.toString(), null);
        }
        return ((C23886g) ((InterfaceC34811e1) this.f121228E)).m70161b(i13, str2);
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: m */
    public void mo2047m(C0835k c0835k) {
        m91101U0(c0835k);
    }

    @Override // p470rv.InterfaceC31836p
    /* JADX INFO: renamed from: n */
    public void mo91124n(double d3) {
        C31835o c31835o = (C31835o) this.f121232z;
        c31835o.getClass();
        c31835o.m98907d("bearing", new Value(d3));
    }

    /* JADX INFO: renamed from: n0 */
    public C29662f m91125n0(AbstractC31199g connectionConf, String str) {
        AbstractC22676k.m65750j(connectionConf, "connectionConf");
        C34830n0 c34830n0 = new C34830n0();
        c34830n0.m109905f(connectionConf.mo96150a());
        c34830n0.m109900a("Connection", "Upgrade");
        c34830n0.m109900a("Upgrade", "websocket");
        ((C37949a) this.f121228E).getClass();
        c34830n0.m109900a("X-Stream-Client", C37949a.m121544a());
        C34832o0 c34832o0 = new C34832o0(c34830n0);
        C2345k c2345k = (C2345k) ((C23470p) this.f121232z).getValue();
        InterfaceC2339e interfaceC2339e = c2345k.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.INFO;
        String str2 = c2345k.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str2)) {
            c2345k.f9274b.log(enumC2341g, str2, "[createSocket] new web socket: " + c34832o0.f146712a, null);
        }
        return new C29662f(str, (InterfaceC37973e) this.f121230x, new C2320z(25, this, c34832o0));
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: o */
    public boolean mo91068o(AbstractC29658b abstractC29658b, MenuItem menuItem) {
        return ((ActionMode.Callback) this.f121230x).onActionItemClicked(m91130t0(abstractC29658b), new MenuItemC30825s((Context) this.f121231y, (InterfaceMenuItemC37950a) menuItem));
    }

    /* JADX INFO: renamed from: o0 */
    public void m91126o0(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) ((C0021f1) this.f121228E).get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i13 = 0; i13 < size; i13++) {
                m91126o0(arrayList2.get(i13), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: p */
    public void mo2048p(C0831g c0831g) {
        m91101U0(c0831g);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, java.util.List] */
    /* JADX INFO: renamed from: p0 */
    public void m91127p0(C34465k c34465k, boolean z4) {
        C34479y c34479y = (C34479y) this.f121228E;
        ?? r10 = c34465k.f144800a;
        Collection collection = (Collection) r10;
        int size = collection.size();
        for (int i13 = 0; i13 < size; i13++) {
            if (((C34472r) r10.get(i13)).m108956l()) {
                m91098S0(c34465k);
                return;
            }
        }
        InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f121230x;
        if (interfaceC39147y == null) {
            throw new IllegalStateException("layoutCoordinates not set");
        }
        AbstractC34454d0.m108923n(c34465k, interfaceC39147y.mo3523Z(0L), new C2320z(24, this, c34479y), false);
        if (((EnumC34477w) this.f121231y) == EnumC34477w.f144845x) {
            if (z4) {
                int size2 = collection.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    ((C34472r) r10.get(i14)).m108946a();
                }
            }
            C13968p1 c13968p1 = c34465k.f144801b;
            if (c13968p1 != null) {
                c13968p1.f49807x = !c34479y.f144852y;
            }
        }
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: q */
    public void mo2049q(C0838n c0838n) {
        m91101U0(c0838n);
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: r */
    public void mo2050r(C0840p c0840p) {
        m91101U0(c0840p);
    }

    /* JADX INFO: renamed from: r0 */
    public void m91128r0() {
        C40136h c40136h = (C40136h) this.f121232z;
        StringBuilder sb4 = c40136h.f173190w;
        if (sb4.length() <= 0 || '\n' == sb4.charAt(sb4.length() - 1)) {
            return;
        }
        c40136h.m128679a('\n');
    }

    @Override // p503tp.InterfaceC34050u
    /* JADX INFO: renamed from: s */
    public void mo29698s() {
        FusedLocationProviderClient fusedLocationProviderClient = (FusedLocationProviderClient) this.f121230x;
        AbstractC34051v abstractC34051v = (AbstractC34051v) this.f121231y;
        AbstractC34036g abstractC34036g = (AbstractC34036g) this.f121232z;
        InterfaceC34050u interfaceC34050u = (InterfaceC34050u) this.f121228E;
        abstractC34051v.f142729w = false;
        fusedLocationProviderClient.removeLocationUpdates(abstractC34036g);
        if (interfaceC34050u != null) {
            interfaceC34050u.mo29698s();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m91129s0(InterfaceC36611c interfaceC36611c, Map map) {
        ((C39865j) this.f121230x).m127938a(((C2222b) this.f121231y).mo7052a(interfaceC36611c, AbstractC25247g0.m73995d0(interfaceC36611c.getParams(), map)));
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: t */
    public boolean mo91069t(AbstractC29658b abstractC29658b, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f121230x;
        C29663g c29663gM91130t0 = m91130t0(abstractC29658b);
        C0021f1 c0021f1 = (C0021f1) this.f121228E;
        Menu menuC30804a0 = (Menu) c0021f1.get(menu);
        if (menuC30804a0 == null) {
            menuC30804a0 = new MenuC30804a0((Context) this.f121231y, (MenuC30818l) menu);
            c0021f1.put(menu, menuC30804a0);
        }
        return callback.onCreateActionMode(c29663gM91130t0, menuC30804a0);
    }

    /* JADX INFO: renamed from: t0 */
    public C29663g m91130t0(AbstractC29658b abstractC29658b) {
        ArrayList arrayList = (ArrayList) this.f121232z;
        int size = arrayList.size();
        for (int i13 = 0; i13 < size; i13++) {
            C29663g c29663g = (C29663g) arrayList.get(i13);
            if (c29663g != null && c29663g.f121234b == abstractC29658b) {
                return c29663g;
            }
        }
        C29663g c29663g2 = new C29663g((Context) this.f121231y, abstractC29658b);
        arrayList.add(c29663g2);
        return c29663g2;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: u */
    public void mo2051u(C0828d c0828d) {
        m91101U0(c0828d);
    }

    /* JADX INFO: renamed from: u0 */
    public C2345k m91131u0() {
        return (C2345k) ((C23470p) this.f121231y).getValue();
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: v */
    public void mo2052v(C0841q c0841q) {
        m91101U0(c0841q);
    }

    /* JADX INFO: renamed from: v0 */
    public JSONObject m91132v0(String str) throws ChallengeResponseParseException, ParseException {
        Object objM107888l;
        InterfaceC27506d interfaceC27506d = (InterfaceC27506d) this.f121230x;
        SecretKey secretKey = (SecretKey) this.f121231y;
        C27504b c27504b = (C27504b) interfaceC27506d;
        c27504b.getClass();
        C38672b[] c38672bArrM46077a = AbstractC16256g.m46077a(str);
        if (c38672bArrM46077a.length != 5) {
            throw new ParseException("Unexpected number of Base64URL parts, must be five", 0);
        }
        C38672b c38672b = c38672bArrM46077a[0];
        C38672b c38672b2 = c38672bArrM46077a[1];
        C38672b c38672b3 = c38672bArrM46077a[2];
        C38672b c38672b4 = c38672bArrM46077a[3];
        C38672b c38672b5 = c38672bArrM46077a[4];
        C16261l c16261l = new C16261l();
        try {
            Objects.requireNonNull(c38672b);
            c16261l.f61846x = C16260k.m46080c(c38672b);
            if (c38672b2 == null || c38672b2.f166476w.isEmpty()) {
                c16261l.f61847y = null;
            } else {
                c16261l.f61847y = c38672b2;
            }
            if (c38672b3 == null || c38672b3.f166476w.isEmpty()) {
                c16261l.f61848z = null;
            } else {
                c16261l.f61848z = c38672b3;
            }
            Objects.requireNonNull(c38672b4);
            c16261l.f61843E = c38672b4;
            if (c38672b5 == null || c38672b5.f166476w.isEmpty()) {
                c16261l.f61844F = null;
            } else {
                c16261l.f61844F = c38672b5;
            }
            c16261l.f61845G = 2;
            C16255f c16255f = c16261l.f61846x.f61830O;
            AbstractC22676k.m65749i(c16255f, "getEncryptionMethod(...)");
            byte[] encoded = secretKey.getEncoded();
            C16255f c16255f2 = C16255f.f61798I;
            if (c16255f2 == c16255f) {
                encoded = Arrays.copyOfRange(encoded, encoded.length - (c16255f2.f61803y / 8), encoded.length);
                AbstractC22676k.m65747g(encoded);
            } else {
                AbstractC22676k.m65747g(encoded);
            }
            C17690a c17690a = new C17690a(encoded);
            synchronized (c16261l) {
                if (c16261l.f61845G != 2) {
                    throw new IllegalStateException("The JWE object must be in an encrypted state");
                }
                if (c16261l.f61846x.f61832Q != null && c16261l.f61843E.f166476w.length() > 100000) {
                    throw new JOSEException("The JWE compressed cipher text exceeds the maximum allowed length of 100000 characters");
                }
                try {
                    C16260k c16260k = c16261l.f61846x;
                    c16261l.f61804w = new C16267r(c17690a.m50563c(c16260k, c16261l.f61847y, c16261l.f61848z, c16261l.f61843E, c16261l.f61844F, c16260k.m46075a().f166476w.getBytes(StandardCharsets.US_ASCII)));
                    c16261l.f61845G = 3;
                } catch (JOSEException e5) {
                    throw e5;
                } catch (Exception e13) {
                    throw new JOSEException(e13.getMessage(), e13);
                }
            }
            String string = c16261l.f61846x.toString();
            AbstractC22676k.m65749i(string, "toString(...)");
            if (C27504b.m82919a(string)) {
                String str2 = c16261l.f61848z.f166476w;
                AbstractC22676k.m65749i(str2, "toString(...)");
                if (C27504b.m82919a(str2)) {
                    String str3 = c16261l.f61843E.f166476w;
                    AbstractC22676k.m65749i(str3, "toString(...)");
                    if (C27504b.m82919a(str3)) {
                        String str4 = c16261l.f61844F.f166476w;
                        AbstractC22676k.m65749i(str4, "toString(...)");
                        if (C27504b.m82919a(str4)) {
                            JSONObject jSONObject = new JSONObject(c16261l.f61804w.toString());
                            if (c27504b.f110771w) {
                                if (!jSONObject.has("acsCounterAtoS")) {
                                    int i13 = ChallengeResponseParseException.f22419z;
                                    throw C27648a.m83601x("acsCounterAtoS");
                                }
                                try {
                                    String string2 = jSONObject.getString("acsCounterAtoS");
                                    AbstractC22676k.m65749i(string2, "getString(...)");
                                    objM107888l = Byte.valueOf(Byte.parseByte(string2));
                                } catch (Throwable th3) {
                                    objM107888l = AbstractC34132o.m107888l(th3);
                                }
                                if (C23468n.m68037a(objM107888l) != null) {
                                    int i14 = ChallengeResponseParseException.f22419z;
                                    throw C27648a.m83600w("acsCounterAtoS");
                                }
                                byte bByteValue = ((Number) objM107888l).byteValue();
                                if (c27504b.f110773y != bByteValue) {
                                    throw new ChallengeResponseParseException(EnumC30904i.DataDecryptionFailure, AbstractC2875y.m8294g(c27504b.f110773y, bByteValue, "Counters are not equal. SDK counter: ", ", ACS counter: "));
                                }
                            }
                            byte b = (byte) (c27504b.f110773y + 1);
                            c27504b.f110773y = b;
                            if (b != 0) {
                                return jSONObject;
                            }
                            throw new IllegalArgumentException("ACS to SDK counter is zero");
                        }
                    }
                }
            }
            throw new ChallengeResponseParseException(EnumC30904i.DataDecryptionFailure, "Invalid encryption.");
        } catch (ParseException e14) {
            throw new ParseException("Invalid JWE header: " + e14.getMessage(), 0);
        }
    }

    @Override // g40.InterfaceC15403p0
    /* JADX INFO: renamed from: w */
    public List mo865w() {
        return (ArrayList) this.f121232z;
    }

    /* JADX INFO: renamed from: w0 */
    public int m91133w0() {
        return ((C40136h) this.f121232z).f173190w.length();
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: x */
    public void mo91134x(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        switch (this.f121229w) {
            case 6:
                if (m91135x0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102764f(c32745m, c23537y);
                }
                break;
            default:
                if (m91136y0(i13, c32763v)) {
                    ((C32770z) this.f121231y).m102764f(c32745m, m91137z0(c23537y));
                }
                break;
        }
    }

    /* JADX INFO: renamed from: x0 */
    public boolean m91135x0(int i13, C32763v c32763v) {
        C2819b1 c2819b1 = (C2819b1) this.f121228E;
        C31570t0 c31570t0 = (C31570t0) this.f121230x;
        C32763v c32763vM102755b = null;
        if (c32763v != null) {
            for (int i14 = 0; i14 < c31570t0.f130372c.size(); i14++) {
                if (((C32763v) c31570t0.f130372c.get(i14)).f136241d == c32763v.f136241d) {
                    c32763vM102755b = c32763v.m102755b(Pair.create(c31570t0.f130371b, c32763v.f136238a));
                    break;
                }
            }
            if (c32763vM102755b == null) {
                return false;
            }
        }
        int i15 = i13 + c31570t0.f130373d;
        C32770z c32770z = (C32770z) this.f121231y;
        if (c32770z.f136275a != i15 || !AbstractC24567y.m71670a(c32770z.f136276b, c32763vM102755b)) {
            this.f121231y = new C32770z(((C32770z) c2819b1.f11037j).f136277c, i15, c32763vM102755b);
        }
        C32770z c32770z2 = (C32770z) this.f121232z;
        if (c32770z2.f136275a == i15 && AbstractC24567y.m71670a(c32770z2.f136276b, c32763vM102755b)) {
            return true;
        }
        this.f121232z = new C32770z(((C32770z) c2819b1.f11038k).f136277c, i15, c32763vM102755b);
        return true;
    }

    @Override // af3.InterfaceC0827c0
    /* JADX INFO: renamed from: y */
    public void mo2053y(C0824b c0824b) {
        m91101U0(c0824b);
    }

    /* JADX INFO: renamed from: y0 */
    public boolean m91136y0(int i13, C32763v c32763v) {
        C32763v c32763vMo102710p;
        AbstractC32735h abstractC32735h = (AbstractC32735h) this.f121228E;
        if (c32763v != null) {
            c32763vMo102710p = abstractC32735h.mo102710p(this.f121230x, c32763v);
            if (c32763vMo102710p == null) {
                return false;
            }
        } else {
            c32763vMo102710p = null;
        }
        C32770z c32770z = (C32770z) this.f121231y;
        if (c32770z.f136275a != i13 || !AbstractC24567y.m71670a(c32770z.f136276b, c32763vMo102710p)) {
            this.f121231y = new C32770z(abstractC32735h.f136027c.f136277c, i13, c32763vMo102710p);
        }
        C32770z c32770z2 = (C32770z) this.f121232z;
        if (c32770z2.f136275a == i13 && AbstractC24567y.m71670a(c32770z2.f136276b, c32763vMo102710p)) {
            return true;
        }
        this.f121232z = new C32770z(abstractC32735h.f136028d.f136277c, i13, c32763vMo102710p);
        return true;
    }

    @Override // p408q.InterfaceC29657a
    /* JADX INFO: renamed from: z */
    public boolean mo91070z(AbstractC29658b abstractC29658b, Menu menu) {
        ActionMode.Callback callback = (ActionMode.Callback) this.f121230x;
        C29663g c29663gM91130t0 = m91130t0(abstractC29658b);
        C0021f1 c0021f1 = (C0021f1) this.f121228E;
        Menu menuC30804a0 = (Menu) c0021f1.get(menu);
        if (menuC30804a0 == null) {
            menuC30804a0 = new MenuC30804a0((Context) this.f121231y, (MenuC30818l) menu);
            c0021f1.put(menu, menuC30804a0);
        }
        return callback.onPrepareActionMode(c29663gM91130t0, menuC30804a0);
    }

    /* JADX INFO: renamed from: z0 */
    public C23537y m91137z0(C23537y c23537y) {
        long j7 = c23537y.f93210e;
        long j13 = c23537y.f93211f;
        return (j7 == j7 && j13 == j13) ? c23537y : new C23537y(c23537y.f93206a, c23537y.f93207b, (C31521c0) c23537y.f93212g, c23537y.f93208c, c23537y.f93209d, j7, j13);
    }

    public C29662f(FusedLocationProviderClient fusedLocationProviderClient, AbstractC34051v abstractC34051v, AbstractC34036g abstractC34036g, InterfaceC34050u interfaceC34050u) {
        this.f121229w = 12;
        this.f121230x = fusedLocationProviderClient;
        this.f121231y = abstractC34051v;
        this.f121232z = abstractC34036g;
        this.f121228E = interfaceC34050u;
    }

    public C29662f(C41210b c41210b, List items) {
        this.f121229w = 20;
        AbstractC22676k.m65750j(items, "items");
        this.f121230x = c41210b;
        this.f121231y = items;
        List list = items;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((DropdownItemSpec) it.next()).getApiValue());
        }
        this.f121232z = arrayList;
        List list2 = (List) this.f121231y;
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((DropdownItemSpec) it3.next()).getDisplayText());
        }
        this.f121228E = arrayList2;
    }

    public C29662f(C16651f customerStateHolder, C35459c0 paymentMethodMetadata, C34416d updateScreenInteractorFactory, C0332w0 manageInteractorFactory) {
        this.f121229w = 13;
        AbstractC22676k.m65750j(customerStateHolder, "customerStateHolder");
        AbstractC22676k.m65750j(paymentMethodMetadata, "paymentMethodMetadata");
        AbstractC22676k.m65750j(updateScreenInteractorFactory, "updateScreenInteractorFactory");
        AbstractC22676k.m65750j(manageInteractorFactory, "manageInteractorFactory");
        this.f121230x = customerStateHolder;
        this.f121231y = paymentMethodMetadata;
        this.f121232z = updateScreenInteractorFactory;
        this.f121228E = manageInteractorFactory;
    }

    public C29662f(C39865j c39865j, C2222b c2222b, InterfaceC3704c durationProvider, C2326f c2326f) {
        this.f121229w = 18;
        AbstractC22676k.m65750j(durationProvider, "durationProvider");
        this.f121230x = c39865j;
        this.f121231y = c2222b;
        this.f121232z = durationProvider;
        this.f121228E = c2326f;
    }

    public C29662f(Context context) {
        this.f121229w = 26;
        String str = C3709h.f15162a;
        str = str == null ? "native" : str;
        AbstractC22676k.m65750j(context, "context");
        this.f121230x = "stripe-mobile-sdk";
        this.f121232z = "stripe-mobile-sdk-android";
        this.f121228E = str;
        this.f121231y = context.getApplicationContext();
    }

    public C29662f(InterfaceC37973e interfaceC37973e, C34826l0 c34826l0) {
        this.f121229w = 21;
        this.f121230x = interfaceC37973e;
        this.f121231y = c34826l0;
        this.f121232z = AbstractC1772c1.m5382S(this, "Video:SocketFactory");
        this.f121228E = new C37949a();
    }

    public C29662f(InterfaceC27506d messageTransformer, SecretKey secretKey, InterfaceC26213d errorReporter, C29919n creqExecutorConfig) {
        this.f121229w = 1;
        AbstractC22676k.m65750j(messageTransformer, "messageTransformer");
        AbstractC22676k.m65750j(errorReporter, "errorReporter");
        AbstractC22676k.m65750j(creqExecutorConfig, "creqExecutorConfig");
        this.f121230x = messageTransformer;
        this.f121231y = secretKey;
        this.f121232z = errorReporter;
        this.f121228E = creqExecutorConfig;
    }

    public C29662f(String str, InterfaceC37973e interfaceC37973e, C2320z c2320z) {
        this.f121229w = 22;
        this.f121230x = interfaceC37973e;
        this.f121231y = AbstractC1772c1.m5382S(this, "Video:Events".concat(str));
        this.f121232z = AbstractC13091v.m36592b(0, 100, null, 5);
        this.f121228E = (InterfaceC34811e1) c2320z.invoke(new C37980l(this));
    }

    public C29662f(int i13) {
        this.f121229w = i13;
        switch (i13) {
            case 11:
                this.f121230x = new C38059n();
                this.f121231y = new C38059n();
                this.f121232z = new C1863a(1);
                break;
            default:
                this.f121230x = new C15486e(10);
                this.f121228E = new C0021f1(0);
                this.f121232z = new ArrayList();
                this.f121231y = new HashSet();
                break;
        }
    }

    public C29662f(C34479y c34479y) {
        this.f121229w = 14;
        this.f121228E = c34479y;
        this.f121231y = EnumC34477w.f144844w;
    }

    public C29662f(C13662c puckOptions, WeakReference weakContext) {
        this.f121229w = 7;
        C31835o c31835o = new C31835o("mapbox-location-indicator-layer");
        c31835o.f131896b.put("id", new Value("mapbox-location-indicator-layer"));
        c31835o.f131896b.put("type", new Value("location-indicator"));
        c31835o.f131896b.put("location-transition", C31835o.m98904b());
        c31835o.f131896b.put("bearing-transition", C31835o.m98904b());
        c31835o.f131896b.put("perspective-compensation", new Value(0.9d));
        c31835o.f131896b.put("image-pitch-displacement", new Value(4.0d));
        AbstractC22676k.m65750j(puckOptions, "puckOptions");
        AbstractC22676k.m65750j(weakContext, "weakContext");
        this.f121230x = puckOptions;
        this.f121231y = weakContext;
        this.f121232z = c31835o;
    }

    public C29662f(C2570m c2570m, C15594k c15594k, C40136h c40136h, Map map, C40062i c40062i) {
        this.f121229w = 27;
        this.f121230x = c2570m;
        this.f121231y = c15594k;
        this.f121232z = c40136h;
        this.f121228E = map;
    }

    public C29662f(List list) {
        int i13;
        this.f121229w = 25;
        this.f121230x = new C38059n();
        this.f121231y = new C38059n();
        C39354a c39354a = new C39354a();
        this.f121232z = c39354a;
        String strTrim = new String((byte[]) list.get(0), StandardCharsets.UTF_8).trim();
        int i14 = AbstractC38065t.f163031a;
        for (String str : strTrim.split("\\r?\\n", -1)) {
            if (str.startsWith("palette: ")) {
                String[] strArrSplit = str.substring(9).split(",", -1);
                c39354a.f169399d = new int[strArrSplit.length];
                for (int i15 = 0; i15 < strArrSplit.length; i15++) {
                    int[] iArr = c39354a.f169399d;
                    try {
                        i13 = Integer.parseInt(strArrSplit[i15].trim(), 16);
                    } catch (RuntimeException unused) {
                        i13 = 0;
                    }
                    iArr[i15] = i13;
                }
            } else if (str.startsWith("size: ")) {
                String[] strArrSplit2 = str.substring(6).trim().split("x", -1);
                if (strArrSplit2.length == 2) {
                    try {
                        c39354a.f169400e = Integer.parseInt(strArrSplit2[0]);
                        c39354a.f169401f = Integer.parseInt(strArrSplit2[1]);
                        c39354a.f169397b = true;
                    } catch (RuntimeException e5) {
                        AbstractC38046a.m121827v("VobsubParser", "Parsing IDX failed", e5);
                    }
                }
            }
        }
    }

    public C29662f(C33623c0 c33623c0, C34377e c34377e, C33647p c33647p, Application application, C13096w1 c13096w1, C1601k1 c1601k1, AbstractC39982e abstractC39982e) {
        this.f121229w = 19;
        this.f121230x = abstractC39982e;
        this.f121231y = application;
        this.f121232z = C35516c.m112678b(new C35373a(c33623c0, 1));
        this.f121228E = C35516c.m112678b(new C12593a(c33647p, AbstractC37826a.f161983a, 5));
    }

    public C29662f(C33623c0 c33623c0, Application application) {
        this.f121229w = 15;
        this.f121231y = this;
        this.f121230x = application;
        this.f121232z = new C26166a(this, 2);
        this.f121228E = new C2225c(c33623c0, new C3879g(c33623c0, C35518e.m112679a(application), 15), 12);
    }

    public C29662f(Context context, ActionMode.Callback callback) {
        this.f121229w = 0;
        this.f121231y = context;
        this.f121230x = callback;
        this.f121232z = new ArrayList();
        this.f121228E = new C0021f1(0);
    }

    public C29662f(AbstractC32735h abstractC32735h, Object obj) {
        this.f121229w = 8;
        this.f121228E = abstractC32735h;
        int i13 = 0;
        C32763v c32763v = null;
        this.f121231y = new C32770z(abstractC32735h.f136027c.f136277c, i13, c32763v);
        this.f121232z = new C32770z(abstractC32735h.f136028d.f136277c, i13, c32763v);
        this.f121230x = obj;
    }

    public C29662f(C41060w0 c41060w0, C29875i c29875i, C32800q c32800q, C33652u c33652u) {
        Object objM133252m;
        this.f121229w = 24;
        if (c41060w0 != null) {
            objM133252m = AbstractC41023g0.m133252m(c41060w0);
        } else {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            objM133252m = C41060w0.f177067E;
        }
        this.f121230x = objM133252m;
        this.f121231y = c29875i;
        this.f121232z = c32800q;
        this.f121228E = c33652u;
    }

    public C29662f(C2819b1 c2819b1, C31570t0 c31570t0) {
        this.f121229w = 6;
        this.f121228E = c2819b1;
        this.f121231y = (C32770z) c2819b1.f11037j;
        this.f121232z = (C32770z) c2819b1.f11038k;
        this.f121230x = c31570t0;
    }

    public C29662f(C32768x0 c32768x0, boolean[] zArr) {
        this.f121229w = 9;
        this.f121230x = c32768x0;
        this.f121231y = zArr;
        int i13 = c32768x0.f136270w;
        this.f121232z = new boolean[i13];
        this.f121228E = new boolean[i13];
    }
}
