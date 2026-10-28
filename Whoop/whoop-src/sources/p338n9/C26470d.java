package p338n9;

import aa3.C0656u0;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import androidx.media3.extractor.text.SubtitleDecoderException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Objects;
import la.C23548b;
import live.hms.video.factories.C24148c;
import ng3.C26702o;
import p000.AbstractC11266d;
import p010a9.C0580e;
import p012ab.C0680g0;
import p031b9.AbstractC2829f;
import p031b9.C2815a0;
import p031b9.C2830f0;
import p031b9.SurfaceHolderCallbackC2821c0;
import p187h9.C17018b;
import p249jc.C21567b;
import p299l9.C23488c0;
import p299l9.InterfaceC23540z0;
import p455ra.C31172c;
import p455ra.C31175f;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p576w8.C36933c;
import p607x8.AbstractC38046a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41060w0;
import qa.C30096a;
import qa.C30099d;
import qa.C30104i;
import qa.InterfaceC30101f;
import qa.InterfaceC30107l;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: n9.d */
/* JADX INFO: loaded from: classes5.dex */
public final class C26470d extends AbstractC2829f implements Handler.Callback {

    /* JADX INFO: renamed from: R */
    public final C26702o f105124R;

    /* JADX INFO: renamed from: S */
    public final C0580e f105125S;

    /* JADX INFO: renamed from: T */
    public InterfaceC26467a f105126T;

    /* JADX INFO: renamed from: U */
    public final InterfaceC26469c f105127U;

    /* JADX INFO: renamed from: V */
    public boolean f105128V;

    /* JADX INFO: renamed from: W */
    public int f105129W;

    /* JADX INFO: renamed from: X */
    public InterfaceC30101f f105130X;

    /* JADX INFO: renamed from: Y */
    public C30104i f105131Y;

    /* JADX INFO: renamed from: Z */
    public C30099d f105132Z;

    /* JADX INFO: renamed from: a0 */
    public C30099d f105133a0;

    /* JADX INFO: renamed from: b0 */
    public int f105134b0;

    /* JADX INFO: renamed from: c0 */
    public final Handler f105135c0;

    /* JADX INFO: renamed from: d0 */
    public final SurfaceHolderCallbackC2821c0 f105136d0;

    /* JADX INFO: renamed from: e0 */
    public final C30352d f105137e0;

    /* JADX INFO: renamed from: f0 */
    public boolean f105138f0;

    /* JADX INFO: renamed from: g0 */
    public boolean f105139g0;

    /* JADX INFO: renamed from: h0 */
    public C34610p f105140h0;

    /* JADX INFO: renamed from: i0 */
    public long f105141i0;

    /* JADX INFO: renamed from: j0 */
    public long f105142j0;

    /* JADX INFO: renamed from: k0 */
    public IOException f105143k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26470d(SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0, Looper looper) {
        super(3);
        C23548b c23548b = InterfaceC26469c.f105123n;
        this.f105136d0 = surfaceHolderCallbackC2821c0;
        this.f105135c0 = looper == null ? null : new Handler(looper, this);
        this.f105127U = c23548b;
        this.f105124R = new C26702o(17, false);
        this.f105125S = new C0580e(1);
        this.f105137e0 = new C30352d(4, (char) 0);
        this.f105142j0 = -9223372036854775807L;
        this.f105141i0 = -9223372036854775807L;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: A */
    public final int mo8057A(C34610p c34610p) {
        boolean zEquals = Objects.equals(c34610p.f145783n, "application/x-media3-cues");
        String str = c34610p.f145783n;
        if (!zEquals) {
            C23548b c23548b = (C23548b) this.f105127U;
            c23548b.getClass();
            if (!((C21567b) c23548b.f93280x).mo60610g(c34610p) && !Objects.equals(str, "application/cea-608") && !Objects.equals(str, "application/x-mp4-cea-608") && !Objects.equals(str, "application/cea-708")) {
                return AbstractC34587d0.m109380m(str) ? AbstractC2829f.m8055f(1, 0, 0, 0) : AbstractC2829f.m8055f(0, 0, 0, 0);
            }
        }
        return AbstractC2829f.m8055f(c34610p.f145768M == 0 ? 4 : 2, 0, 0, 0);
    }

    /* JADX INFO: renamed from: C */
    public final void m78391C() {
        AbstractC35849g.m113806h("Legacy decoding is disabled, can't handle " + this.f105140h0.f145783n + " samples (expected application/x-media3-cues).", Objects.equals(this.f105140h0.f145783n, "application/cea-608") || Objects.equals(this.f105140h0.f145783n, "application/x-mp4-cea-608") || Objects.equals(this.f105140h0.f145783n, "application/cea-708"));
    }

    /* JADX INFO: renamed from: D */
    public final long m78392D() {
        if (this.f105134b0 == -1) {
            return Long.MAX_VALUE;
        }
        this.f105132Z.getClass();
        if (this.f105134b0 >= this.f105132Z.mo1676j()) {
            return Long.MAX_VALUE;
        }
        return this.f105132Z.mo1675h(this.f105134b0);
    }

    /* JADX INFO: renamed from: E */
    public final long m78393E(long j7) {
        AbstractC35849g.m113807i(j7 != -9223372036854775807L);
        return j7 - this.f11087K;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0050  */
    /* JADX WARN: Code duplicated, block: B:24:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX INFO: renamed from: F */
    public final void m78394F() {
        InterfaceC30101f c17018b;
        byte b = 1;
        this.f105128V = true;
        C34610p c34610p = this.f105140h0;
        c34610p.getClass();
        C21567b c21567b = (C21567b) ((C23548b) this.f105127U).f93280x;
        String str = c34610p.f145783n;
        int i13 = c34610p.f145764I;
        if (str != null) {
            switch (str.hashCode()) {
                case 930165504:
                    b = !str.equals("application/x-mp4-cea-608") ? (byte) -1 : (byte) 0;
                    break;
                case 1566015601:
                    if (!str.equals("application/cea-608")) {
                        b = -1;
                    }
                    break;
                case 1566016562:
                    b = !str.equals("application/cea-708") ? (byte) -1 : (byte) 2;
                    break;
                default:
                    b = -1;
                    break;
            }
            switch (b) {
                case 0:
                case 1:
                    c17018b = new C31172c(str, i13);
                    break;
                case 2:
                    c17018b = new C31175f(i13, c34610p.f145786q);
                    break;
                default:
                    if (c21567b.mo60610g(c34610p)) {
                        throw new IllegalArgumentException(AbstractC11266d.m30461o("Attempted to create decoder for unsupported MIME type: ", str));
                    }
                    InterfaceC30107l interfaceC30107lMo60611h = c21567b.mo60611h(c34610p);
                    interfaceC30107lMo60611h.getClass().getSimpleName().concat("Decoder");
                    c17018b = new C17018b(interfaceC30107lMo60611h);
                    break;
                    break;
            }
        } else {
            if (c21567b.mo60610g(c34610p)) {
                throw new IllegalArgumentException(AbstractC11266d.m30461o("Attempted to create decoder for unsupported MIME type: ", str));
            }
            InterfaceC30107l interfaceC30107lMo60611h2 = c21567b.mo60611h(c34610p);
            interfaceC30107lMo60611h2.getClass().getSimpleName().concat("Decoder");
            c17018b = new C17018b(interfaceC30107lMo60611h2);
        }
        this.f105130X = c17018b;
        c17018b.mo1504d(this.f11088L);
    }

    /* JADX INFO: renamed from: G */
    public final void m78395G(C36933c c36933c) {
        AbstractC41023g0 abstractC41023g0 = c36933c.f158063a;
        SurfaceHolderCallbackC2821c0 surfaceHolderCallbackC2821c0 = this.f105136d0;
        surfaceHolderCallbackC2821c0.f11043w.f11118N.m121835e(27, new C2815a0(abstractC41023g0, 0));
        C2830f0 c2830f0 = surfaceHolderCallbackC2821c0.f11043w;
        c2830f0.f11099B0 = c36933c;
        c2830f0.f11118N.m121835e(27, new C0680g0(c36933c, 7));
    }

    /* JADX INFO: renamed from: H */
    public final void m78396H() {
        this.f105131Y = null;
        this.f105134b0 = -1;
        C30099d c30099d = this.f105132Z;
        if (c30099d != null) {
            c30099d.mo1511p();
            this.f105132Z = null;
        }
        C30099d c30099d2 = this.f105133a0;
        if (c30099d2 != null) {
            c30099d2.mo1511p();
            this.f105133a0 = null;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 1) {
            throw new IllegalStateException();
        }
        m78395G((C36933c) message.obj);
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: j */
    public final String mo8062j() {
        return "TextRenderer";
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: l */
    public final boolean mo8064l() {
        return this.f105139g0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public final boolean mo8065n() {
        if (this.f105140h0 != null) {
            if (this.f105143k0 == null) {
                try {
                    InterfaceC23540z0 interfaceC23540z0 = this.f11085I;
                    interfaceC23540z0.getClass();
                    interfaceC23540z0.mo36170c();
                } catch (IOException e5) {
                    this.f105143k0 = e5;
                }
            }
            if (this.f105143k0 != null) {
                C34610p c34610p = this.f105140h0;
                c34610p.getClass();
                if (Objects.equals(c34610p.f145783n, "application/x-media3-cues")) {
                    InterfaceC26467a interfaceC26467a = this.f105126T;
                    interfaceC26467a.getClass();
                    return interfaceC26467a.mo1634c(this.f105141i0) != Long.MIN_VALUE;
                }
                if (!this.f105139g0) {
                    if (this.f105138f0) {
                        C30099d c30099d = this.f105132Z;
                        long j7 = this.f105141i0;
                        if (c30099d == null || c30099d.mo1675h(c30099d.mo1676j() - 1) <= j7) {
                            C30099d c30099d2 = this.f105133a0;
                            long j13 = this.f105141i0;
                            if ((c30099d2 == null || c30099d2.mo1675h(c30099d2.mo1676j() - 1) <= j13) && this.f105131Y != null) {
                            }
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public final void mo8066o() {
        this.f105140h0 = null;
        this.f105142j0 = -9223372036854775807L;
        C41060w0 c41060w0 = C41060w0.f177067E;
        m78393E(this.f105141i0);
        C36933c c36933c = new C36933c(c41060w0);
        Handler handler = this.f105135c0;
        if (handler != null) {
            handler.obtainMessage(1, c36933c).sendToTarget();
        } else {
            m78395G(c36933c);
        }
        this.f105141i0 = -9223372036854775807L;
        if (this.f105130X != null) {
            m78396H();
            InterfaceC30101f interfaceC30101f = this.f105130X;
            interfaceC30101f.getClass();
            interfaceC30101f.release();
            this.f105130X = null;
            this.f105129W = 0;
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public final void mo8068q(long j7, boolean z4) {
        this.f105141i0 = j7;
        InterfaceC26467a interfaceC26467a = this.f105126T;
        if (interfaceC26467a != null) {
            interfaceC26467a.clear();
        }
        C41060w0 c41060w0 = C41060w0.f177067E;
        m78393E(this.f105141i0);
        C36933c c36933c = new C36933c(c41060w0);
        Handler handler = this.f105135c0;
        if (handler != null) {
            handler.obtainMessage(1, c36933c).sendToTarget();
        } else {
            m78395G(c36933c);
        }
        this.f105138f0 = false;
        this.f105139g0 = false;
        this.f105142j0 = -9223372036854775807L;
        C34610p c34610p = this.f105140h0;
        if (c34610p == null || Objects.equals(c34610p.f145783n, "application/x-media3-cues")) {
            return;
        }
        if (this.f105129W == 0) {
            m78396H();
            InterfaceC30101f interfaceC30101f = this.f105130X;
            interfaceC30101f.getClass();
            interfaceC30101f.flush();
            interfaceC30101f.mo1504d(this.f11088L);
            return;
        }
        m78396H();
        InterfaceC30101f interfaceC30101f2 = this.f105130X;
        interfaceC30101f2.getClass();
        interfaceC30101f2.release();
        this.f105130X = null;
        this.f105129W = 0;
        m78394F();
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: v */
    public final void mo8073v(C34610p[] c34610pArr, long j7, long j13, C23488c0 c23488c0) {
        C34610p c34610p = c34610pArr[0];
        this.f105140h0 = c34610p;
        if (Objects.equals(c34610p.f145783n, "application/x-media3-cues")) {
            this.f105126T = this.f105140h0.f145765J == 1 ? new C26468b() : new C0656u0(4);
            return;
        }
        m78391C();
        if (this.f105130X != null) {
            this.f105129W = 1;
        } else {
            m78394F();
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public final void mo8075x(long j7, long j13) {
        boolean z4;
        C30352d c30352d;
        boolean z13;
        long jMo1675h;
        if (this.f11090N) {
            long j14 = this.f105142j0;
            if (j14 != -9223372036854775807L && j7 >= j14) {
                m78396H();
                this.f105139g0 = true;
            }
        }
        if (this.f105139g0) {
            return;
        }
        C34610p c34610p = this.f105140h0;
        c34610p.getClass();
        boolean zEquals = Objects.equals(c34610p.f145783n, "application/x-media3-cues");
        Handler handler = this.f105135c0;
        C30352d c30352d2 = this.f105137e0;
        boolean zMo1636e = false;
        zMo1636e = false;
        zMo1636e = false;
        if (zEquals) {
            this.f105126T.getClass();
            if (!this.f105138f0) {
                C0580e c0580e = this.f105125S;
                if (m8074w(c30352d2, c0580e, 0) == -4) {
                    if (c0580e.m1496f(4)) {
                        this.f105138f0 = true;
                    } else {
                        c0580e.m1509r();
                        ByteBuffer byteBuffer = c0580e.f2063E;
                        byteBuffer.getClass();
                        long j15 = c0580e.f2065G;
                        byte[] bArrArray = byteBuffer.array();
                        int iArrayOffset = byteBuffer.arrayOffset();
                        int iLimit = byteBuffer.limit();
                        this.f105124R.getClass();
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.unmarshall(bArrArray, iArrayOffset, iLimit);
                        parcelObtain.setDataPosition(0);
                        Bundle bundle = parcelObtain.readBundle(Bundle.class.getClassLoader());
                        parcelObtain.recycle();
                        ArrayList parcelableArrayList = bundle.getParcelableArrayList("c");
                        parcelableArrayList.getClass();
                        C24148c c24148c = new C24148c(28);
                        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
                        for (int i13 = 0; i13 < parcelableArrayList.size(); i13++) {
                            Bundle bundle2 = (Bundle) parcelableArrayList.get(i13);
                            bundle2.getClass();
                            c41014d0M133251l.m133222a(c24148c.apply(bundle2));
                        }
                        C30096a c30096a = new C30096a(c41014d0M133251l.m133239f(), j15, bundle.getLong("d"));
                        c0580e.mo1506o();
                        zMo1636e = this.f105126T.mo1636e(c30096a, j7);
                    }
                }
            }
            long jMo1634c = this.f105126T.mo1634c(this.f105141i0);
            if (jMo1634c == Long.MIN_VALUE && this.f105138f0 && !zMo1636e) {
                this.f105139g0 = true;
            }
            if (jMo1634c != Long.MIN_VALUE && jMo1634c <= j7) {
                zMo1636e = true;
            }
            if (zMo1636e) {
                AbstractC41023g0 abstractC41023g0Mo1632a = this.f105126T.mo1632a(j7);
                long jMo1633b = this.f105126T.mo1633b(j7);
                m78393E(jMo1633b);
                C36933c c36933c = new C36933c(abstractC41023g0Mo1632a);
                if (handler != null) {
                    handler.obtainMessage(1, c36933c).sendToTarget();
                } else {
                    m78395G(c36933c);
                }
                this.f105126T.mo1635d(jMo1633b);
            }
            this.f105141i0 = j7;
            return;
        }
        m78391C();
        this.f105141i0 = j7;
        if (this.f105133a0 == null) {
            InterfaceC30101f interfaceC30101f = this.f105130X;
            interfaceC30101f.getClass();
            interfaceC30101f.mo47995a(j7);
            try {
                InterfaceC30101f interfaceC30101f2 = this.f105130X;
                interfaceC30101f2.getClass();
                this.f105133a0 = (C30099d) interfaceC30101f2.mo1502b();
            } catch (SubtitleDecoderException e5) {
                AbstractC38046a.m121813h("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f105140h0, e5);
                C41060w0 c41060w0 = C41060w0.f177067E;
                m78393E(this.f105141i0);
                C36933c c36933c2 = new C36933c(c41060w0);
                if (handler != null) {
                    handler.obtainMessage(1, c36933c2).sendToTarget();
                } else {
                    m78395G(c36933c2);
                }
                m78396H();
                InterfaceC30101f interfaceC30101f3 = this.f105130X;
                interfaceC30101f3.getClass();
                interfaceC30101f3.release();
                this.f105130X = null;
                this.f105129W = 0;
                m78394F();
                return;
            }
        }
        if (this.f11084H != 2) {
            return;
        }
        if (this.f105132Z != null) {
            long jM78392D = m78392D();
            z4 = false;
            while (jM78392D <= j7) {
                this.f105134b0++;
                jM78392D = m78392D();
                z4 = true;
            }
        } else {
            z4 = false;
        }
        C30099d c30099d = this.f105133a0;
        if (c30099d == null) {
            c30352d = c30352d2;
            z13 = z4;
        } else if (c30099d.m1496f(4)) {
            if (!z4 && m78392D() == Long.MAX_VALUE) {
                if (this.f105129W == 2) {
                    m78396H();
                    InterfaceC30101f interfaceC30101f4 = this.f105130X;
                    interfaceC30101f4.getClass();
                    interfaceC30101f4.release();
                    this.f105130X = null;
                    this.f105129W = 0;
                    m78394F();
                } else {
                    m78396H();
                    this.f105139g0 = true;
                }
            }
            c30352d = c30352d2;
            z13 = z4;
        } else {
            c30352d = c30352d2;
            if (c30099d.f2070y <= j7) {
                C30099d c30099d2 = this.f105132Z;
                if (c30099d2 != null) {
                    z13 = z4;
                    c30099d2.mo1511p();
                }
                z13 = z4;
                this.f105134b0 = c30099d.mo1673b(j7);
                this.f105132Z = c30099d;
                this.f105133a0 = null;
                z13 = true;
            }
        }
        if (z13) {
            this.f105132Z.getClass();
            int iMo1673b = this.f105132Z.mo1673b(j7);
            if (iMo1673b == 0 || this.f105132Z.mo1676j() == 0) {
                jMo1675h = this.f105132Z.f2070y;
            } else if (iMo1673b == -1) {
                C30099d c30099d3 = this.f105132Z;
                jMo1675h = c30099d3.mo1675h(c30099d3.mo1676j() - 1);
            } else {
                jMo1675h = this.f105132Z.mo1675h(iMo1673b - 1);
            }
            m78393E(jMo1675h);
            C36933c c36933c3 = new C36933c(this.f105132Z.mo1674d(j7));
            if (handler != null) {
                handler.obtainMessage(1, c36933c3).sendToTarget();
            } else {
                m78395G(c36933c3);
            }
        }
        if (this.f105129W == 2) {
            return;
        }
        while (!this.f105138f0) {
            try {
                C30104i c30104i = this.f105131Y;
                if (c30104i == null) {
                    InterfaceC30101f interfaceC30101f5 = this.f105130X;
                    interfaceC30101f5.getClass();
                    c30104i = (C30104i) interfaceC30101f5.mo1503c();
                    if (c30104i == null) {
                        return;
                    } else {
                        this.f105131Y = c30104i;
                    }
                }
                if (this.f105129W == 1) {
                    c30104i.f2052x = 4;
                    InterfaceC30101f interfaceC30101f6 = this.f105130X;
                    interfaceC30101f6.getClass();
                    interfaceC30101f6.mo1505e(c30104i);
                    this.f105131Y = null;
                    this.f105129W = 2;
                    return;
                }
                int iM8074w = m8074w(c30352d, c30104i, 0);
                if (iM8074w == -4) {
                    if (c30104i.m1496f(4)) {
                        this.f105138f0 = true;
                        this.f105128V = false;
                    } else {
                        C34610p c34610p2 = (C34610p) c30352d.f124536y;
                        if (c34610p2 == null) {
                            return;
                        }
                        c30104i.f122842J = c34610p2.f145788s;
                        c30104i.m1509r();
                        this.f105128V &= !c30104i.m1496f(1);
                    }
                    if (!this.f105128V) {
                        InterfaceC30101f interfaceC30101f7 = this.f105130X;
                        interfaceC30101f7.getClass();
                        interfaceC30101f7.mo1505e(c30104i);
                        this.f105131Y = null;
                    }
                } else if (iM8074w == -3) {
                    return;
                }
            } catch (SubtitleDecoderException e13) {
                AbstractC38046a.m121813h("TextRenderer", "Subtitle decoding failed. streamFormat=" + this.f105140h0, e13);
                C41060w0 c41060w1 = C41060w0.f177067E;
                m78393E(this.f105141i0);
                C36933c c36933c4 = new C36933c(c41060w1);
                if (handler != null) {
                    handler.obtainMessage(1, c36933c4).sendToTarget();
                } else {
                    m78395G(c36933c4);
                }
                m78396H();
                InterfaceC30101f interfaceC30101f8 = this.f105130X;
                interfaceC30101f8.getClass();
                interfaceC30101f8.release();
                this.f105130X = null;
                this.f105129W = 0;
                m78394F();
                return;
            }
        }
    }
}
