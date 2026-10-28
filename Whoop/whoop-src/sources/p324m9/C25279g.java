package p324m9;

import a00.C0072g;
import android.net.Uri;
import android.os.SystemClock;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import androidx.media3.datasource.HttpDataSource$CleartextNotPermittedException;
import androidx.media3.datasource.HttpDataSource$InvalidResponseCodeException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.source.BehindLiveWindowException;
import androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException;
import bb.C2919f;
import com.iterable.iterableapi.C5327g1;
import e10.C12554k0;
import g73.C15553a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import live.hms.video.error.ErrorCodes;
import p000.AbstractC11266d;
import p010a9.C0580e;
import p016an.C1053d;
import p031b9.C2856o0;
import p032bc.C2953i;
import p112e9.C12863b;
import p112e9.C12865d;
import p112e9.C12869h;
import p112e9.C12871j;
import p112e9.C12872k;
import p112e9.C12873l;
import p112e9.C12876o;
import p112e9.C12877p;
import p112e9.InterfaceC12870i;
import p141f9.AbstractC14271m;
import p141f9.C14260b;
import p141f9.C14261c;
import p141f9.C14268j;
import p171g9.C15587d;
import p171g9.InterfaceC15591h;
import p249jc.C21567b;
import p284ko.C22631o;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;
import p299l9.C23538y0;
import p299l9.InterfaceC23486b1;
import p299l9.InterfaceC23540z0;
import p319m4.AbstractC25012a;
import p361o9.InterfaceC27679s;
import p398p9.C28987k;
import p398p9.HandlerC28984h;
import p398p9.InterfaceC28983g;
import p398p9.InterfaceC28985i;
import p398p9.InterfaceC28986j;
import p499t9.C33634i;
import p499t9.InterfaceC33627e0;
import p516u8.AbstractC34587d0;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import p619xl.C38445a;
import p674z8.C40171g;
import p674z8.C40177m;
import p674z8.InterfaceC40170f;
import p690zr.AbstractC41023g0;
import qg3.C30352d;
import se.AbstractC32410a;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: m9.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C25279g implements InterfaceC23540z0, InterfaceC23486b1, InterfaceC28983g, InterfaceC28986j {

    /* JADX INFO: renamed from: E */
    public final C12873l f99199E;

    /* JADX INFO: renamed from: F */
    public final C12863b f99200F;

    /* JADX INFO: renamed from: G */
    public final C15587d f99201G;

    /* JADX INFO: renamed from: H */
    public final C21567b f99202H;

    /* JADX INFO: renamed from: I */
    public final C28987k f99203I = new C28987k("ChunkSampleStream");

    /* JADX INFO: renamed from: J */
    public final C5327g1 f99204J = new C5327g1();

    /* JADX INFO: renamed from: K */
    public final ArrayList f99205K;

    /* JADX INFO: renamed from: L */
    public final List f99206L;

    /* JADX INFO: renamed from: M */
    public final C23538y0 f99207M;

    /* JADX INFO: renamed from: N */
    public final C23538y0[] f99208N;

    /* JADX INFO: renamed from: O */
    public final C38445a f99209O;

    /* JADX INFO: renamed from: P */
    public AbstractC25276d f99210P;

    /* JADX INFO: renamed from: Q */
    public C34610p f99211Q;

    /* JADX INFO: renamed from: R */
    public InterfaceC25278f f99212R;

    /* JADX INFO: renamed from: S */
    public long f99213S;

    /* JADX INFO: renamed from: T */
    public long f99214T;

    /* JADX INFO: renamed from: U */
    public int f99215U;

    /* JADX INFO: renamed from: V */
    public AbstractC25273a f99216V;

    /* JADX INFO: renamed from: W */
    public boolean f99217W;

    /* JADX INFO: renamed from: X */
    public boolean f99218X;

    /* JADX INFO: renamed from: Y */
    public boolean f99219Y;

    /* JADX INFO: renamed from: w */
    public final int f99220w;

    /* JADX INFO: renamed from: x */
    public final int[] f99221x;

    /* JADX INFO: renamed from: y */
    public final C34610p[] f99222y;

    /* JADX INFO: renamed from: z */
    public final boolean[] f99223z;

    public C25279g(int i13, int[] iArr, C34610p[] c34610pArr, C12873l c12873l, C12863b c12863b, C22631o c22631o, long j7, InterfaceC15591h interfaceC15591h, C15587d c15587d, C21567b c21567b, C15587d c15587d2, boolean z4) {
        this.f99220w = i13;
        this.f99221x = iArr;
        this.f99222y = c34610pArr;
        this.f99199E = c12873l;
        this.f99200F = c12863b;
        this.f99201G = c15587d2;
        this.f99202H = c21567b;
        this.f99217W = z4;
        ArrayList arrayList = new ArrayList();
        this.f99205K = arrayList;
        this.f99206L = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f99208N = new C23538y0[length];
        this.f99223z = new boolean[length];
        int i14 = length + 1;
        int[] iArr2 = new int[i14];
        C23538y0[] c23538y0Arr = new C23538y0[i14];
        interfaceC15591h.getClass();
        C23538y0 c23538y0 = new C23538y0(c22631o, interfaceC15591h, c15587d);
        this.f99207M = c23538y0;
        int i15 = 0;
        iArr2[0] = i13;
        c23538y0Arr[0] = c23538y0;
        while (i15 < length) {
            C23538y0 c23538y1 = new C23538y0(c22631o, null, null);
            this.f99208N[i15] = c23538y1;
            int i16 = i15 + 1;
            c23538y0Arr[i16] = c23538y1;
            iArr2[i16] = this.f99221x[i15];
            i15 = i16;
        }
        this.f99209O = new C38445a(20, iArr2, c23538y0Arr);
        this.f99213S = j7;
        this.f99214T = j7;
    }

    /* JADX INFO: renamed from: A */
    public final void m74172A() {
        int iM74173B = m74173B(this.f99207M.m68129l(), this.f99215U - 1);
        while (true) {
            int i13 = this.f99215U;
            if (i13 > iM74173B) {
                return;
            }
            this.f99215U = i13 + 1;
            AbstractC25273a abstractC25273a = (AbstractC25273a) this.f99205K.get(i13);
            C34610p c34610p = abstractC25273a.f99193z;
            if (!c34610p.equals(this.f99211Q)) {
                this.f99201G.m43884b(this.f99220w, c34610p, abstractC25273a.f99185E, abstractC25273a.f99186F, abstractC25273a.f99187G);
            }
            this.f99211Q = c34610p;
        }
    }

    /* JADX INFO: renamed from: B */
    public final int m74173B(int i13, int i14) {
        ArrayList arrayList;
        do {
            i14++;
            arrayList = this.f99205K;
            if (i14 >= arrayList.size()) {
                return arrayList.size() - 1;
            }
        } while (((AbstractC25273a) arrayList.get(i14)).m74167a(0) <= i13);
        return i14 - 1;
    }

    /* JADX INFO: renamed from: C */
    public final void m74174C(C12863b c12863b) {
        this.f99212R = c12863b;
        C23538y0 c23538y0 = this.f99207M;
        c23538y0.m68124g();
        C12554k0 c12554k0 = c23538y0.f93225h;
        if (c12554k0 != null) {
            c12554k0.m35222K(c23538y0.f93222e);
            c23538y0.f93225h = null;
            c23538y0.f93224g = null;
        }
        for (C23538y0 c23538y1 : this.f99208N) {
            c23538y1.m68124g();
            C12554k0 c12554k1 = c23538y1.f93225h;
            if (c12554k1 != null) {
                c12554k1.m35222K(c23538y1.f93222e);
                c23538y1.f93225h = null;
                c23538y1.f93224g = null;
            }
        }
        this.f99203I.m88008b(this);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: a */
    public final boolean mo36121a() {
        return this.f99203I.m88007a();
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: b */
    public final boolean mo36169b() {
        return !m74178z() && this.f99207M.m68132o(this.f99219Y);
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: c */
    public final void mo36170c() throws IOException {
        C28987k c28987k = this.f99203I;
        c28987k.mo36136c();
        C23538y0 c23538y0 = this.f99207M;
        C12554k0 c12554k0 = c23538y0.f93225h;
        if (c12554k0 != null && c12554k0.m35220G() == 1) {
            DrmSession$DrmSessionException drmSession$DrmSessionExceptionM35217C = c23538y0.f93225h.m35217C();
            drmSession$DrmSessionExceptionM35217C.getClass();
            throw drmSession$DrmSessionExceptionM35217C;
        }
        if (c28987k.m88007a()) {
            return;
        }
        C12873l c12873l = this.f99199E;
        BehindLiveWindowException behindLiveWindowException = c12873l.f44309m;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        c12873l.f44297a.mo36136c();
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: d */
    public final long mo36122d() {
        if (m74178z()) {
            return this.f99213S;
        }
        if (this.f99219Y) {
            return Long.MIN_VALUE;
        }
        return m74176v().f99188H;
    }

    @Override // p398p9.InterfaceC28986j
    /* JADX INFO: renamed from: g */
    public final void mo68103g() {
        C23538y0 c23538y0 = this.f99207M;
        c23538y0.m68136s(true);
        C12554k0 c12554k0 = c23538y0.f93225h;
        if (c12554k0 != null) {
            c12554k0.m35222K(c23538y0.f93222e);
            c23538y0.f93225h = null;
            c23538y0.f93224g = null;
        }
        for (C23538y0 c23538y1 : this.f99208N) {
            c23538y1.m68136s(true);
            C12554k0 c12554k1 = c23538y1.f93225h;
            if (c12554k1 != null) {
                c12554k1.m35222K(c23538y1.f93222e);
                c23538y1.f93225h = null;
                c23538y1.f93224g = null;
            }
        }
        for (C12871j c12871j : this.f99199E.f44305i) {
            C25275c c25275c = c12871j.f44286a;
            if (c25275c != null) {
                c25275c.f99181w.release();
            }
        }
        InterfaceC25278f interfaceC25278f = this.f99212R;
        if (interfaceC25278f != null) {
            C12863b c12863b = (C12863b) interfaceC25278f;
            synchronized (c12863b) {
                C12876o c12876o = (C12876o) c12863b.f44219N.remove(this);
                if (c12876o != null) {
                    C23538y0 c23538y2 = c12876o.f44321a;
                    c23538y2.m68136s(true);
                    C12554k0 c12554k2 = c23538y2.f93225h;
                    if (c12554k2 != null) {
                        c12554k2.m35222K(c23538y2.f93222e);
                        c23538y2.f93225h = null;
                        c23538y2.f93224g = null;
                    }
                }
            }
        }
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: j */
    public final int mo36171j(long j7) {
        if (m74178z()) {
            return 0;
        }
        boolean z4 = this.f99219Y;
        C23538y0 c23538y0 = this.f99207M;
        int iM68131n = c23538y0.m68131n(j7, z4);
        AbstractC25273a abstractC25273a = this.f99216V;
        if (abstractC25273a != null) {
            iM68131n = Math.min(iM68131n, abstractC25273a.m74167a(0) - c23538y0.m68129l());
        }
        c23538y0.m68139v(iM68131n);
        m74172A();
        return iM68131n;
    }

    @Override // p299l9.InterfaceC23540z0
    /* JADX INFO: renamed from: l */
    public final int mo36172l(C30352d c30352d, C0580e c0580e, int i13) {
        if (m74178z()) {
            return -3;
        }
        AbstractC25273a abstractC25273a = this.f99216V;
        C23538y0 c23538y0 = this.f99207M;
        if (abstractC25273a != null && abstractC25273a.m74167a(0) <= c23538y0.m68129l()) {
            return -3;
        }
        m74172A();
        return c23538y0.m68135r(c30352d, c0580e, i13, this.f99219Y);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: m */
    public final long mo36129m() {
        long j7;
        ArrayList arrayList = this.f99205K;
        if (this.f99219Y) {
            return Long.MIN_VALUE;
        }
        if (m74178z()) {
            return this.f99213S;
        }
        long jMax = this.f99214T;
        AbstractC25273a abstractC25273aM74176v = m74176v();
        if (!abstractC25273aM74176v.mo74169e()) {
            abstractC25273aM74176v = arrayList.size() > 1 ? (AbstractC25273a) AbstractC25012a.m73371d(arrayList, 2) : null;
        }
        if (abstractC25273aM74176v != null) {
            jMax = Math.max(jMax, abstractC25273aM74176v.f99188H);
        }
        C23538y0 c23538y0 = this.f99207M;
        synchronized (c23538y0) {
            j7 = c23538y0.f93239v;
        }
        return Math.max(jMax, j7);
    }

    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: n */
    public final void mo36130n(long j7) {
        C28987k c28987k = this.f99203I;
        if (c28987k.f117259y == null && !m74178z()) {
            boolean zM88007a = c28987k.m88007a();
            List list = this.f99206L;
            C12873l c12873l = this.f99199E;
            ArrayList arrayList = this.f99205K;
            if (zM88007a) {
                AbstractC25276d abstractC25276d = this.f99210P;
                abstractC25276d.getClass();
                boolean z4 = abstractC25276d instanceof AbstractC25273a;
                if (z4 && m74177y(arrayList.size() - 1)) {
                    return;
                }
                if (c12873l.f44309m != null ? false : c12873l.f44306j.mo68089u(j7, abstractC25276d, list)) {
                    HandlerC28984h handlerC28984h = c28987k.f117258x;
                    AbstractC35849g.m113808j(handlerC28984h);
                    handlerC28984h.m88005a(false);
                    if (z4) {
                        this.f99216V = (AbstractC25273a) abstractC25276d;
                        return;
                    }
                    return;
                }
                return;
            }
            int size = (c12873l.f44309m != null || c12873l.f44306j.length() < 2) ? list.size() : c12873l.f44306j.mo68080l(j7, list);
            if (size < arrayList.size()) {
                AbstractC35849g.m113807i(!c28987k.m88007a());
                int size2 = arrayList.size();
                while (true) {
                    if (size >= size2) {
                        size = -1;
                        break;
                    } else if (!m74177y(size)) {
                        break;
                    } else {
                        size++;
                    }
                }
                if (size == -1) {
                    return;
                }
                long j13 = m74176v().f99188H;
                AbstractC25273a abstractC25273aM74175o = m74175o(size);
                if (arrayList.isEmpty()) {
                    this.f99213S = this.f99214T;
                }
                this.f99219Y = false;
                C23537y c23537y = new C23537y(1, this.f99220w, null, 3, null, AbstractC38065t.m121907U(abstractC25273aM74175o.f99187G), AbstractC38065t.m121907U(j13));
                C15587d c15587d = this.f99201G;
                C23488c0 c23488c0 = c15587d.f58538b;
                c23488c0.getClass();
                c15587d.m43883a(new C2953i(c15587d, c23488c0, c23537y, 8));
            }
        }
    }

    /* JADX INFO: renamed from: o */
    public final AbstractC25273a m74175o(int i13) {
        ArrayList arrayList = this.f99205K;
        AbstractC25273a abstractC25273a = (AbstractC25273a) arrayList.get(i13);
        int size = arrayList.size();
        int i14 = AbstractC38065t.f163031a;
        if (i13 < 0 || size > arrayList.size() || i13 > size) {
            throw new IllegalArgumentException();
        }
        if (i13 != size) {
            arrayList.subList(i13, size).clear();
        }
        this.f99215U = Math.max(this.f99215U, arrayList.size());
        int i15 = 0;
        this.f99207M.m68126i(abstractC25273a.m74167a(0));
        while (true) {
            C23538y0[] c23538y0Arr = this.f99208N;
            if (i15 >= c23538y0Arr.length) {
                return abstractC25273a;
            }
            C23538y0 c23538y0 = c23538y0Arr[i15];
            i15++;
            c23538y0.m68126i(abstractC25273a.m74167a(i15));
        }
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: p */
    public final void mo36137p(InterfaceC28985i interfaceC28985i, long j7, long j13) {
        AbstractC25276d abstractC25276d = (AbstractC25276d) interfaceC28985i;
        this.f99210P = null;
        C12873l c12873l = this.f99199E;
        C12871j[] c12871jArr = c12873l.f44305i;
        if (abstractC25276d instanceof C25281i) {
            int iMo68087s = c12873l.f44306j.mo68087s(((C25281i) abstractC25276d).f99193z);
            C12871j c12871j = c12871jArr[iMo68087s];
            if (c12871j.f44289d == null) {
                C25275c c25275c = c12871j.f44286a;
                AbstractC35849g.m113808j(c25275c);
                InterfaceC33627e0 interfaceC33627e0 = c25275c.f99179H;
                C33634i c33634i = interfaceC33627e0 instanceof C33634i ? (C33634i) interfaceC33627e0 : null;
                if (c33634i != null) {
                    AbstractC14271m abstractC14271m = c12871j.f44287b;
                    c12871jArr[iMo68087s] = new C12871j(c12871j.f44290e, abstractC14271m, c12871j.f44288c, c12871j.f44286a, c12871j.f44291f, new C1053d(c33634i, abstractC14271m.f52113y, 7));
                }
            }
        }
        C12876o c12876o = c12873l.f44304h;
        if (c12876o != null) {
            long j14 = c12876o.f44324d;
            if (j14 == -9223372036854775807L || abstractC25276d.f99188H > j14) {
                c12876o.f44324d = abstractC25276d.f99188H;
            }
            c12876o.f44325e.f44328G = true;
        }
        long j15 = abstractC25276d.f99190w;
        Uri uri = abstractC25276d.f99189I.f173387y;
        C23527t c23527t = new C23527t();
        this.f99202H.getClass();
        this.f99201G.m43886d(c23527t, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H);
        this.f99200F.mo8198b(this);
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: q */
    public final void mo36138q(InterfaceC28985i interfaceC28985i, long j7, long j13, boolean z4) {
        AbstractC25276d abstractC25276d = (AbstractC25276d) interfaceC28985i;
        this.f99210P = null;
        this.f99216V = null;
        long j14 = abstractC25276d.f99190w;
        Uri uri = abstractC25276d.f99189I.f173387y;
        C23527t c23527t = new C23527t();
        this.f99202H.getClass();
        this.f99201G.m43885c(c23527t, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H);
        if (z4) {
            return;
        }
        if (m74178z()) {
            this.f99207M.m68136s(false);
            for (C23538y0 c23538y0 : this.f99208N) {
                c23538y0.m68136s(false);
            }
        } else if (abstractC25276d instanceof AbstractC25273a) {
            ArrayList arrayList = this.f99205K;
            m74175o(arrayList.size() - 1);
            if (arrayList.isEmpty()) {
                this.f99213S = this.f99214T;
            }
        }
        this.f99200F.mo8198b(this);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:102:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:104:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:107:0x01e3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x0250 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0252  */
    /* JADX WARN: Code duplicated, block: B:125:0x0254  */
    /* JADX WARN: Code duplicated, block: B:127:0x025a  */
    /* JADX WARN: Code duplicated, block: B:128:0x025c  */
    /* JADX WARN: Code duplicated, block: B:131:0x0266  */
    /* JADX WARN: Code duplicated, block: B:133:0x026d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0274  */
    /* JADX WARN: Code duplicated, block: B:136:0x0277  */
    /* JADX WARN: Code duplicated, block: B:138:0x027e  */
    /* JADX WARN: Code duplicated, block: B:148:0x029f  */
    /* JADX WARN: Code duplicated, block: B:151:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:152:0x02ad  */
    /* JADX WARN: Code duplicated, block: B:154:0x02b2  */
    /* JADX WARN: Code duplicated, block: B:157:0x02b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:160:0x02be  */
    /* JADX WARN: Code duplicated, block: B:163:0x02db  */
    /* JADX WARN: Code duplicated, block: B:167:0x012f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0127  */
    /* JADX WARN: Code duplicated, block: B:62:0x012d  */
    /* JADX WARN: Code duplicated, block: B:67:0x013e A[LOOP:1: B:65:0x0138->B:67:0x013e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x0164 A[LOOP:2: B:69:0x015e->B:71:0x0164, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x0186  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:97:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c5  */
    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: r */
    public final C2919f mo36139r(InterfaceC28985i interfaceC28985i, IOException iOException, int i13) {
        C23527t c23527t;
        C23527t c23527t2;
        C14260b c14260bM167C;
        InterfaceC27679s interfaceC27679s;
        AbstractC41023g0 abstractC41023g0;
        boolean z4;
        C21567b c21567b;
        long jElapsedRealtime;
        ArrayList arrayList;
        int length;
        C23527t c23527t3;
        int i14;
        int i15;
        HashSet hashSet;
        int i16;
        int size;
        HashSet hashSet2;
        ArrayList arrayListM187e;
        int i17;
        int size2;
        int i18;
        int i19;
        int i24;
        C2919f c2919f;
        int i25;
        long jMax;
        boolean zMo68088t;
        int i26;
        C2919f c2919f2;
        boolean z13;
        int i27;
        boolean z14;
        long jMin;
        boolean z15;
        AbstractC25276d abstractC25276d = (AbstractC25276d) interfaceC28985i;
        C40177m c40177m = abstractC25276d.f99189I;
        long j7 = abstractC25276d.f99187G;
        C34610p c34610p = abstractC25276d.f99193z;
        long j13 = c40177m.f173386x;
        boolean z16 = abstractC25276d instanceof AbstractC25273a;
        ArrayList arrayList2 = this.f99205K;
        int size3 = arrayList2.size() - 1;
        boolean z17 = (j13 != 0 && z16 && m74177y(size3)) ? false : true;
        Uri uri = abstractC25276d.f99189I.f173387y;
        C23527t c23527t4 = new C23527t();
        int i28 = AbstractC38065t.f163031a;
        C12873l c12873l = this.f99199E;
        C12871j[] c12871jArr = c12873l.f44305i;
        C0072g c0072g = c12873l.f44298b;
        C21567b c21567b2 = this.f99202H;
        if (z17) {
            C12876o c12876o = c12873l.f44304h;
            if (c12876o != null) {
                c23527t = c23527t4;
                long j14 = c12876o.f44324d;
                boolean z18 = j14 != -9223372036854775807L && j14 < j7;
                C12877p c12877p = c12876o.f44325e;
                if (c12877p.f44327F.f52065d) {
                    if (!c12877p.f44329H) {
                        if (z18) {
                            if (c12877p.f44328G) {
                                c12877p.f44329H = true;
                                c12877p.f44328G = false;
                                C12869h c12869h = c12877p.f44332x.f44237w;
                                c12869h.f44254D.removeCallbacks(c12869h.f44282w);
                                c12869h.m36156y();
                            }
                        }
                    }
                    c23527t3 = c23527t;
                    z4 = z17;
                    c21567b = c21567b2;
                    arrayList = arrayList2;
                    zMo68088t = true;
                }
                if (!zMo68088t) {
                    c2919f2 = null;
                } else if (z4) {
                    if (z16) {
                        if (m74175o(size3) == abstractC25276d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        AbstractC35849g.m113807i(z15);
                        if (arrayList.isEmpty()) {
                            this.f99213S = this.f99214T;
                        }
                    }
                    c2919f2 = C28987k.f117256z;
                } else {
                    AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    c2919f2 = null;
                }
                if (c2919f2 == null) {
                    c21567b.getClass();
                    if (!(iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof HttpDataSource$CleartextNotPermittedException) || (iOException instanceof Loader$UnexpectedLoaderException) || DataSourceException.m5052a(iOException)) {
                        jMin = -9223372036854775807L;
                    } else {
                        jMin = Math.min((i13 - 1) * 1000, ErrorCodes.WebsocketMethodErrors.cServerErrors);
                    }
                    if (jMin != -9223372036854775807L) {
                        z13 = false;
                        c2919f2 = new C2919f(0, jMin, (byte) 0);
                    } else {
                        z13 = false;
                        c2919f2 = C28987k.f117255E;
                    }
                } else {
                    z13 = false;
                }
                C2919f c2919f3 = c2919f2;
                i27 = c2919f3.f11740a;
                if (i27 != 0 || i27 == 1) {
                    z14 = true;
                } else {
                    z14 = z13;
                }
                this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
                if (!z14) {
                    this.f99210P = null;
                    c21567b.getClass();
                    this.f99200F.mo8198b(this);
                }
                return c2919f3;
            }
            c23527t = c23527t4;
            if (!c12873l.f44307k.f52065d && z16 && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((HttpDataSource$InvalidResponseCodeException) iOException).f6370y == 404) {
                C12871j c12871j = c12871jArr[c12873l.f44306j.mo68087s(c34610p)];
                long jM36160d = c12871j.m36160d();
                if (jM36160d == -1 || jM36160d == 0) {
                    c23527t2 = c23527t;
                } else {
                    InterfaceC12870i interfaceC12870i = c12871j.f44289d;
                    AbstractC35849g.m113808j(interfaceC12870i);
                    long jMo3077B = interfaceC12870i.mo3077B();
                    c23527t2 = c23527t;
                    if (((AbstractC25273a) abstractC25276d).mo74168d() > ((jMo3077B + c12871j.f44291f) + jM36160d) - 1) {
                        c12873l.f44310n = true;
                    }
                }
                C12871j c12871j2 = c12871jArr[c12873l.f44306j.mo68087s(c34610p)];
                AbstractC14271m abstractC14271m = c12871j2.f44287b;
                C14260b c14260b = c12871j2.f44288c;
                c14260bM167C = c0072g.m167C(abstractC14271m.f52112x);
                if (c14260bM167C != null) {
                }
                interfaceC27679s = c12873l.f44306j;
                abstractC41023g0 = c12871j2.f44287b.f52112x;
                z4 = z17;
                c21567b = c21567b2;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = interfaceC27679s.length();
                c23527t3 = c23527t2;
                i15 = 0;
                for (i14 = 0; i14 < length; i14++) {
                    if (interfaceC27679s.mo68085q(i14, jElapsedRealtime)) {
                        i15++;
                    }
                }
                hashSet = new HashSet();
                for (i16 = 0; i16 < abstractC41023g0.size(); i16++) {
                    hashSet.add(Integer.valueOf(((C14260b) abstractC41023g0.get(i16)).f52060c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListM187e = c0072g.m187e(abstractC41023g0);
                for (i17 = 0; i17 < arrayListM187e.size(); i17++) {
                    hashSet2.add(Integer.valueOf(((C14260b) arrayListM187e.get(i17)).f52060c));
                }
                size2 = size - hashSet2.size();
                i18 = length - i15;
                if (i18 <= 1) {
                    c21567b.getClass();
                    if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException)) {
                        i19 = size2;
                        i24 = size;
                        c2919f = null;
                    } else if (size - size2 > 1) {
                        i19 = size2;
                        i24 = size;
                        c2919f = new C2919f(1, 300000L, 4);
                    } else {
                        i19 = size2;
                        i24 = size;
                        if (i18 > 1) {
                            c2919f = new C2919f(2, 60000L, 4);
                        } else {
                            c2919f = null;
                        }
                    }
                    if (c2919f != null) {
                        long j15 = c2919f.f11741b;
                        i25 = c2919f.f11740a;
                        if (i25 == 1) {
                        }
                    }
                }
                if (!zMo68088t) {
                    c2919f2 = null;
                } else if (z4) {
                    if (z16) {
                        if (m74175o(size3) == abstractC25276d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        AbstractC35849g.m113807i(z15);
                        if (arrayList.isEmpty()) {
                            this.f99213S = this.f99214T;
                        }
                    }
                    c2919f2 = C28987k.f117256z;
                } else {
                    AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    c2919f2 = null;
                }
                if (c2919f2 == null) {
                    c21567b.getClass();
                    if (iOException instanceof ParserException) {
                        jMin = -9223372036854775807L;
                    } else {
                        jMin = -9223372036854775807L;
                    }
                    if (jMin != -9223372036854775807L) {
                        z13 = false;
                        c2919f2 = new C2919f(0, jMin, (byte) 0);
                    } else {
                        z13 = false;
                        c2919f2 = C28987k.f117255E;
                    }
                } else {
                    z13 = false;
                }
                C2919f c2919f4 = c2919f2;
                i27 = c2919f4.f11740a;
                if (i27 != 0) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
                if (!z14) {
                    this.f99210P = null;
                    c21567b.getClass();
                    this.f99200F.mo8198b(this);
                }
                return c2919f4;
            }
            c23527t2 = c23527t;
            C12871j c12871j3 = c12871jArr[c12873l.f44306j.mo68087s(c34610p)];
            AbstractC14271m abstractC14271m2 = c12871j3.f44287b;
            C14260b c14260b2 = c12871j3.f44288c;
            c14260bM167C = c0072g.m167C(abstractC14271m2.f52112x);
            if (c14260bM167C != null || c14260b2.equals(c14260bM167C)) {
                interfaceC27679s = c12873l.f44306j;
                abstractC41023g0 = c12871j3.f44287b.f52112x;
                z4 = z17;
                c21567b = c21567b2;
                jElapsedRealtime = SystemClock.elapsedRealtime();
                arrayList = arrayList2;
                length = interfaceC27679s.length();
                c23527t3 = c23527t2;
                i15 = 0;
                while (i14 < length) {
                    if (interfaceC27679s.mo68085q(i14, jElapsedRealtime)) {
                        i15++;
                    }
                }
                hashSet = new HashSet();
                while (i16 < abstractC41023g0.size()) {
                    hashSet.add(Integer.valueOf(((C14260b) abstractC41023g0.get(i16)).f52060c));
                }
                size = hashSet.size();
                hashSet2 = new HashSet();
                arrayListM187e = c0072g.m187e(abstractC41023g0);
                while (i17 < arrayListM187e.size()) {
                    hashSet2.add(Integer.valueOf(((C14260b) arrayListM187e.get(i17)).f52060c));
                }
                size2 = size - hashSet2.size();
                i18 = length - i15;
                if (i18 <= 1 || size - size2 > 1) {
                    c21567b.getClass();
                    if (!(iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i26 = ((HttpDataSource$InvalidResponseCodeException) iOException).f6370y) == 403 || i26 == 404 || i26 == 410 || i26 == 416 || i26 == 500 || i26 == 503)) {
                        if (size - size2 > 1) {
                            i19 = size2;
                            i24 = size;
                            c2919f = new C2919f(1, 300000L, 4);
                        } else {
                            i19 = size2;
                            i24 = size;
                            if (i18 > 1) {
                                c2919f = new C2919f(2, 60000L, 4);
                            }
                        }
                        if (c2919f != null) {
                            long j16 = c2919f.f11741b;
                            i25 = c2919f.f11740a;
                            if (i25 == 1 ? i18 > 1 : i24 - i19 > 1) {
                                if (i25 == 2) {
                                    InterfaceC27679s interfaceC27679s2 = c12873l.f44306j;
                                    zMo68088t = interfaceC27679s2.mo68088t(interfaceC27679s2.mo68087s(c34610p), j16);
                                } else if (i25 == 1) {
                                    long jElapsedRealtime2 = SystemClock.elapsedRealtime() + j16;
                                    String str = c14260b2.f52059b;
                                    HashMap map = (HashMap) c0072g.f223x;
                                    if (map.containsKey(str)) {
                                        Long l7 = (Long) map.get(str);
                                        int i29 = AbstractC38065t.f163031a;
                                        jMax = Math.max(jElapsedRealtime2, l7.longValue());
                                    } else {
                                        jMax = jElapsedRealtime2;
                                    }
                                    map.put(str, Long.valueOf(jMax));
                                    int i34 = c14260b2.f52060c;
                                    if (i34 != Integer.MIN_VALUE) {
                                        Integer numValueOf = Integer.valueOf(i34);
                                        HashMap map2 = (HashMap) c0072g.f224y;
                                        if (map2.containsKey(numValueOf)) {
                                            Long l12 = (Long) map2.get(numValueOf);
                                            int i35 = AbstractC38065t.f163031a;
                                            jElapsedRealtime2 = Math.max(jElapsedRealtime2, l12.longValue());
                                        }
                                        map2.put(numValueOf, Long.valueOf(jElapsedRealtime2));
                                    }
                                }
                            }
                        }
                    } else {
                        i19 = size2;
                        i24 = size;
                    }
                    c2919f = null;
                    if (c2919f != null) {
                        long j17 = c2919f.f11741b;
                        i25 = c2919f.f11740a;
                        if (i25 == 1) {
                        }
                    }
                }
                if (!zMo68088t) {
                    c2919f2 = null;
                } else if (z4) {
                    if (z16) {
                        if (m74175o(size3) == abstractC25276d) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        AbstractC35849g.m113807i(z15);
                        if (arrayList.isEmpty()) {
                            this.f99213S = this.f99214T;
                        }
                    }
                    c2919f2 = C28987k.f117256z;
                } else {
                    AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                    c2919f2 = null;
                }
                if (c2919f2 == null) {
                    c21567b.getClass();
                    if (iOException instanceof ParserException) {
                        jMin = -9223372036854775807L;
                    } else {
                        jMin = -9223372036854775807L;
                    }
                    if (jMin != -9223372036854775807L) {
                        z13 = false;
                        c2919f2 = new C2919f(0, jMin, (byte) 0);
                    } else {
                        z13 = false;
                        c2919f2 = C28987k.f117255E;
                    }
                } else {
                    z13 = false;
                }
                C2919f c2919f5 = c2919f2;
                i27 = c2919f5.f11740a;
                if (i27 != 0) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
                if (!z14) {
                    this.f99210P = null;
                    c21567b.getClass();
                    this.f99200F.mo8198b(this);
                }
                return c2919f5;
            }
            zMo68088t = true;
            if (!zMo68088t) {
                c2919f2 = null;
            } else if (z4) {
                if (z16) {
                    if (m74175o(size3) == abstractC25276d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    AbstractC35849g.m113807i(z15);
                    if (arrayList.isEmpty()) {
                        this.f99213S = this.f99214T;
                    }
                }
                c2919f2 = C28987k.f117256z;
            } else {
                AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                c2919f2 = null;
            }
            if (c2919f2 == null) {
                c21567b.getClass();
                if (iOException instanceof ParserException) {
                    jMin = -9223372036854775807L;
                } else {
                    jMin = -9223372036854775807L;
                }
                if (jMin != -9223372036854775807L) {
                    z13 = false;
                    c2919f2 = new C2919f(0, jMin, (byte) 0);
                } else {
                    z13 = false;
                    c2919f2 = C28987k.f117255E;
                }
            } else {
                z13 = false;
            }
            C2919f c2919f6 = c2919f2;
            i27 = c2919f6.f11740a;
            if (i27 != 0) {
                z14 = true;
            } else {
                z14 = true;
            }
            this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
            if (!z14) {
                this.f99210P = null;
                c21567b.getClass();
                this.f99200F.mo8198b(this);
            }
            return c2919f6;
            z4 = z17;
            c21567b = c21567b2;
            arrayList = arrayList2;
            c23527t3 = c23527t2;
            zMo68088t = true;
            if (!zMo68088t) {
                c2919f2 = null;
            } else if (z4) {
                if (z16) {
                    if (m74175o(size3) == abstractC25276d) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    AbstractC35849g.m113807i(z15);
                    if (arrayList.isEmpty()) {
                        this.f99213S = this.f99214T;
                    }
                }
                c2919f2 = C28987k.f117256z;
            } else {
                AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
                c2919f2 = null;
            }
            if (c2919f2 == null) {
                c21567b.getClass();
                if (iOException instanceof ParserException) {
                    jMin = -9223372036854775807L;
                } else {
                    jMin = -9223372036854775807L;
                }
                if (jMin != -9223372036854775807L) {
                    z13 = false;
                    c2919f2 = new C2919f(0, jMin, (byte) 0);
                } else {
                    z13 = false;
                    c2919f2 = C28987k.f117255E;
                }
            } else {
                z13 = false;
            }
            C2919f c2919f7 = c2919f2;
            i27 = c2919f7.f11740a;
            if (i27 != 0) {
                z14 = true;
            } else {
                z14 = true;
            }
            this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
            if (!z14) {
                this.f99210P = null;
                c21567b.getClass();
                this.f99200F.mo8198b(this);
            }
            return c2919f7;
        }
        c23527t3 = c23527t4;
        z4 = z17;
        c21567b = c21567b2;
        arrayList = arrayList2;
        zMo68088t = false;
        if (!zMo68088t) {
            c2919f2 = null;
        } else if (z4) {
            if (z16) {
                if (m74175o(size3) == abstractC25276d) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                AbstractC35849g.m113807i(z15);
                if (arrayList.isEmpty()) {
                    this.f99213S = this.f99214T;
                }
            }
            c2919f2 = C28987k.f117256z;
        } else {
            AbstractC38046a.m121826u("ChunkSampleStream", "Ignoring attempt to cancel non-cancelable load.");
            c2919f2 = null;
        }
        if (c2919f2 == null) {
            c21567b.getClass();
            if (iOException instanceof ParserException) {
                jMin = -9223372036854775807L;
            } else {
                jMin = -9223372036854775807L;
            }
            if (jMin != -9223372036854775807L) {
                z13 = false;
                c2919f2 = new C2919f(0, jMin, (byte) 0);
            } else {
                z13 = false;
                c2919f2 = C28987k.f117255E;
            }
        } else {
            z13 = false;
        }
        C2919f c2919f8 = c2919f2;
        i27 = c2919f8.f11740a;
        if (i27 != 0) {
            z14 = true;
        } else {
            z14 = true;
        }
        this.f99201G.m43887e(c23527t3, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, iOException, !z14);
        if (!z14) {
            this.f99210P = null;
            c21567b.getClass();
            this.f99200F.mo8198b(this);
        }
        return c2919f8;
    }

    /* JADX INFO: renamed from: v */
    public final AbstractC25273a m74176v() {
        return (AbstractC25273a) AbstractC25012a.m73371d(this.f99205K, 1);
    }

    @Override // p398p9.InterfaceC28983g
    /* JADX INFO: renamed from: w */
    public final void mo36140w(InterfaceC28985i interfaceC28985i, long j7, int i13) {
        C23527t c23527t;
        AbstractC25276d abstractC25276d = (AbstractC25276d) interfaceC28985i;
        if (i13 == 0) {
            long j13 = abstractC25276d.f99190w;
            c23527t = new C23527t(abstractC25276d.f99191x);
        } else {
            long j14 = abstractC25276d.f99190w;
            Uri uri = abstractC25276d.f99189I.f173387y;
            c23527t = new C23527t();
        }
        C23527t c23527t2 = c23527t;
        this.f99201G.m43888f(c23527t2, abstractC25276d.f99192y, this.f99220w, abstractC25276d.f99193z, abstractC25276d.f99185E, abstractC25276d.f99186F, abstractC25276d.f99187G, abstractC25276d.f99188H, i13);
    }

    /* JADX WARN: Code duplicated, block: B:178:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:181:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:183:0x0404 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0406 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:185:0x040a  */
    /* JADX WARN: Code duplicated, block: B:187:0x0412  */
    /* JADX WARN: Code duplicated, block: B:189:0x0417  */
    /* JADX WARN: Code duplicated, block: B:191:0x041f  */
    /* JADX WARN: Code duplicated, block: B:193:0x0429 A[LOOP:0: B:192:0x0427->B:193:0x0429, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:196:0x0436  */
    /* JADX WARN: Code duplicated, block: B:201:0x045b A[LOOP:1: B:199:0x0458->B:201:0x045b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:203:0x046f  */
    /* JADX WARN: Code duplicated, block: B:205:0x0473  */
    /* JADX WARN: Instruction removed from duplicated block: B:191:0x041f, please report this as an issue */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p299l9.InterfaceC23486b1
    /* JADX INFO: renamed from: x */
    public final boolean mo36134x(C2856o0 c2856o0) {
        long j7;
        List list;
        C5327g1 c5327g1;
        long j13;
        boolean z4;
        long j14;
        List list2;
        AbstractC25273a abstractC25273a;
        long j15;
        long jMax;
        C28987k c28987k;
        long j16;
        C5327g1 c5327g2;
        boolean z13;
        long j17;
        long jM121915h;
        int i13;
        Object c25280h;
        long jM121915h2;
        boolean z14;
        boolean z15;
        AbstractC25276d abstractC25276d;
        boolean z16;
        C38445a c38445a;
        AbstractC25273a abstractC25273a2;
        C23538y0[] c23538y0Arr;
        int[] iArr;
        int i14;
        long j18;
        long j19;
        int i15;
        if (!this.f99219Y) {
            C28987k c28987k2 = this.f99203I;
            if (!c28987k2.m88007a()) {
                if (c28987k2.f117259y != null) {
                    return false;
                }
                boolean zM74178z = m74178z();
                if (zM74178z) {
                    list = Collections.EMPTY_LIST;
                    j7 = this.f99213S;
                } else {
                    j7 = m74176v().f99188H;
                    list = this.f99206L;
                }
                List list3 = list;
                C12873l c12873l = this.f99199E;
                C12871j[] c12871jArr = c12873l.f44305i;
                BehindLiveWindowException behindLiveWindowException = c12873l.f44309m;
                C5327g1 c5327g3 = this.f99204J;
                if (behindLiveWindowException == null) {
                    c5327g1 = c5327g3;
                    long j24 = c2856o0.f11327a;
                    j13 = -9223372036854775807L;
                    long j25 = j7 - j24;
                    z4 = zM74178z;
                    long jM121896J = AbstractC38065t.m121896J(c12873l.f44307k.m40728a(c12873l.f44308l).f52095b) + AbstractC38065t.m121896J(c12873l.f44307k.f52062a) + j7;
                    C12876o c12876o = c12873l.f44304h;
                    if (c12876o != null) {
                        C12877p c12877p = c12876o.f44325e;
                        C14261c c14261c = c12877p.f44327F;
                        C12865d c12865d = c12877p.f44332x;
                        if (!c14261c.f52065d) {
                            j14 = j24;
                            z14 = false;
                        } else if (c12877p.f44329H) {
                            j14 = j24;
                            z14 = true;
                        } else {
                            j14 = j24;
                            Map.Entry entryCeilingEntry = c12877p.f44326E.ceilingEntry(Long.valueOf(c14261c.f52069h));
                            if (entryCeilingEntry == null || ((Long) entryCeilingEntry.getValue()).longValue() >= jM121896J) {
                                z14 = false;
                            } else {
                                long jLongValue = ((Long) entryCeilingEntry.getKey()).longValue();
                                C12869h c12869h = c12865d.f44237w;
                                long j26 = c12869h.f44264N;
                                if (j26 == -9223372036854775807L || j26 < jLongValue) {
                                    c12869h.f44264N = jLongValue;
                                }
                                z14 = true;
                            }
                            if (z14 && c12877p.f44328G) {
                                c12877p.f44329H = true;
                                c12877p.f44328G = false;
                                C12869h c12869h2 = c12865d.f44237w;
                                c12869h2.f44254D.removeCallbacks(c12869h2.f44282w);
                                c12869h2.m36156y();
                            }
                        }
                        if (z14) {
                        }
                        z15 = c5327g2.f21694w;
                        abstractC25276d = (AbstractC25276d) c5327g2.f21695x;
                        c5327g2.f21695x = null;
                        c5327g2.f21694w = false;
                        if (z15) {
                            this.f99213S = j16;
                            this.f99219Y = true;
                            return true;
                        }
                        if (abstractC25276d == null) {
                            return false;
                        }
                        this.f99210P = abstractC25276d;
                        z16 = abstractC25276d instanceof AbstractC25273a;
                        c38445a = this.f99209O;
                        if (z16) {
                            abstractC25273a2 = (AbstractC25273a) abstractC25276d;
                            if (z4) {
                                j18 = abstractC25273a2.f99187G;
                                j19 = this.f99213S;
                                if (j18 < j19) {
                                    this.f99207M.f93237t = j19;
                                    for (C23538y0 c23538y0 : this.f99208N) {
                                        c23538y0.f93237t = this.f99213S;
                                    }
                                    if (this.f99217W) {
                                        C34610p c34610p = abstractC25273a2.f99193z;
                                        this.f99218X = !AbstractC34587d0.m109368a(c34610p.f145783n, c34610p.f145780k);
                                    }
                                }
                                this.f99217W = false;
                                this.f99213S = -9223372036854775807L;
                            }
                            abstractC25273a2.f99167M = c38445a;
                            c23538y0Arr = (C23538y0[]) c38445a.f164637y;
                            iArr = new int[c23538y0Arr.length];
                            for (i14 = 0; i14 < c23538y0Arr.length; i14++) {
                                C23538y0 c23538y1 = c23538y0Arr[i14];
                                iArr[i14] = c23538y1.f93234q + c23538y1.f93233p;
                            }
                            abstractC25273a2.f99168N = iArr;
                            this.f99205K.add(abstractC25273a2);
                        } else if (abstractC25276d instanceof C25281i) {
                            ((C25281i) abstractC25276d).f99231K = c38445a;
                        }
                        c28987k.m88009d(abstractC25276d, this, this.f99202H.m60616q(abstractC25276d.f99192y));
                        return true;
                    }
                    j14 = j24;
                    long jM121896J2 = AbstractC38065t.m121896J(AbstractC38065t.m121929v(c12873l.f44302f));
                    C14261c c14261c2 = c12873l.f44307k;
                    long j27 = c14261c2.f52062a;
                    long jM121896J3 = j27 == -9223372036854775807L ? -9223372036854775807L : jM121896J2 - AbstractC38065t.m121896J(j27 + c14261c2.m40728a(c12873l.f44308l).f52095b);
                    if (list3.isEmpty()) {
                        list2 = list3;
                        abstractC25273a = null;
                    } else {
                        list2 = list3;
                        abstractC25273a = (AbstractC25273a) AbstractC11266d.m30455i(1, list2);
                    }
                    int length = c12873l.f44306j.length();
                    InterfaceC25282j[] interfaceC25282jArr = new InterfaceC25282j[length];
                    int i16 = 0;
                    while (i16 < length) {
                        C12871j c12871j = c12871jArr[i16];
                        long j28 = jM121896J3;
                        InterfaceC12870i interfaceC12870i = c12871j.f44289d;
                        C15553a c15553a = InterfaceC25282j.f99234l;
                        if (interfaceC12870i == null) {
                            interfaceC25282jArr[i16] = c15553a;
                            j25 = j25;
                        } else {
                            long jM36158b = c12871j.m36158b(jM121896J2);
                            long jM36159c = c12871j.m36159c(jM121896J2);
                            if (abstractC25273a != null) {
                                jM121915h2 = abstractC25273a.mo74168d();
                            } else {
                                InterfaceC12870i interfaceC12870i2 = c12871j.f44289d;
                                AbstractC35849g.m113808j(interfaceC12870i2);
                                jM121915h2 = AbstractC38065t.m121915h(interfaceC12870i2.mo3108u(j7, c12871j.f44290e) + c12871j.f44291f, jM36158b, jM36159c);
                            }
                            if (jM121915h2 < jM36158b) {
                                interfaceC25282jArr[i16] = c15553a;
                            } else {
                                interfaceC25282jArr[i16] = new C12872k(c12873l.m36167b(i16), jM121915h2, jM36159c);
                            }
                        }
                        i16++;
                        jM121896J3 = j28;
                        j25 = j25;
                    }
                    long j29 = jM121896J3;
                    long j34 = j25;
                    if (!c12873l.f44307k.f52065d || c12871jArr[0].m36160d() == 0) {
                        j15 = 0;
                        jMax = -9223372036854775807L;
                    } else {
                        long jM36161e = c12871jArr[0].m36161e(c12871jArr[0].m36159c(jM121896J2));
                        C14261c c14261c3 = c12873l.f44307k;
                        long j35 = c14261c3.f52062a;
                        j15 = 0;
                        jMax = Math.max(0L, Math.min(j35 == -9223372036854775807L ? -9223372036854775807L : jM121896J2 - AbstractC38065t.m121896J(j35 + c14261c3.m40728a(c12873l.f44308l).f52095b), jM36161e) - j14);
                    }
                    c28987k = c28987k2;
                    long j36 = j15;
                    long j37 = j14;
                    j16 = -9223372036854775807L;
                    c5327g2 = c5327g1;
                    c12873l.f44306j.mo68086r(j37, j34, jMax, list2, interfaceC25282jArr);
                    int iMo68071c = c12873l.f44306j.mo68071c();
                    SystemClock.elapsedRealtime();
                    C12871j c12871jM36167b = c12873l.m36167b(iMo68071c);
                    long j38 = c12871jM36167b.f44290e;
                    long j39 = c12871jM36167b.f44291f;
                    InterfaceC12870i interfaceC12870i3 = c12871jM36167b.f44289d;
                    C14260b c14260b = c12871jM36167b.f44288c;
                    C25275c c25275c = c12871jM36167b.f44286a;
                    AbstractC14271m abstractC14271m = c12871jM36167b.f44287b;
                    if (c25275c != null) {
                        C14268j c14268j = c25275c.f99180I == null ? abstractC14271m.f52110E : null;
                        C14268j c14268jMo40754d = interfaceC12870i3 == null ? abstractC14271m.mo40754d() : null;
                        if (c14268j != null || c14268jMo40754d != null) {
                            InterfaceC40170f interfaceC40170f = c12873l.f44301e;
                            C34610p c34610pMo68082n = c12873l.f44306j.mo68082n();
                            int iMo68083o = c12873l.f44306j.mo68083o();
                            Object objMo68075g = c12873l.f44306j.mo68075g();
                            if (c14268j != null) {
                                C14268j c14268jM40751a = c14268j.m40751a(c14268jMo40754d, c14260b.f52058a);
                                if (c14268jM40751a != null) {
                                    c14268j = c14268jM40751a;
                                }
                            } else {
                                c14268jMo40754d.getClass();
                                c14268j = c14268jMo40754d;
                            }
                            c5327g2.f21695x = new C25281i(interfaceC40170f, AbstractC32410a.m101051u(abstractC14271m, c14260b.f52058a, c14268j, 0), c34610pMo68082n, iMo68083o, objMo68075g, c12871jM36167b.f44286a);
                        }
                        z15 = c5327g2.f21694w;
                        abstractC25276d = (AbstractC25276d) c5327g2.f21695x;
                        c5327g2.f21695x = null;
                        c5327g2.f21694w = false;
                        if (z15) {
                            this.f99213S = j16;
                            this.f99219Y = true;
                            return true;
                        }
                        if (abstractC25276d == null) {
                            return false;
                        }
                        this.f99210P = abstractC25276d;
                        z16 = abstractC25276d instanceof AbstractC25273a;
                        c38445a = this.f99209O;
                        if (z16) {
                            abstractC25273a2 = (AbstractC25273a) abstractC25276d;
                            if (z4) {
                                j18 = abstractC25273a2.f99187G;
                                j19 = this.f99213S;
                                if (j18 < j19) {
                                    this.f99207M.f93237t = j19;
                                    while (i15 < r5) {
                                        c23538y0.f93237t = this.f99213S;
                                    }
                                    if (this.f99217W) {
                                        C34610p c34610p2 = abstractC25273a2.f99193z;
                                        this.f99218X = !AbstractC34587d0.m109368a(c34610p2.f145783n, c34610p2.f145780k);
                                    }
                                }
                                this.f99217W = false;
                                this.f99213S = -9223372036854775807L;
                            }
                            abstractC25273a2.f99167M = c38445a;
                            c23538y0Arr = (C23538y0[]) c38445a.f164637y;
                            iArr = new int[c23538y0Arr.length];
                            while (i14 < c23538y0Arr.length) {
                                C23538y0 c23538y2 = c23538y0Arr[i14];
                                iArr[i14] = c23538y2.f93234q + c23538y2.f93233p;
                            }
                            abstractC25273a2.f99168N = iArr;
                            this.f99205K.add(abstractC25273a2);
                        } else if (abstractC25276d instanceof C25281i) {
                            ((C25281i) abstractC25276d).f99231K = c38445a;
                        }
                        c28987k.m88009d(abstractC25276d, this, this.f99202H.m60616q(abstractC25276d.f99192y));
                        return true;
                    }
                    list2 = list2;
                    C14261c c14261c4 = c12873l.f44307k;
                    boolean z17 = c14261c4.f52065d && c12873l.f44308l == c14261c4.f52074m.size() + (-1);
                    boolean z18 = (z17 && j38 == -9223372036854775807L) ? false : true;
                    if (c12871jM36167b.m36160d() == j36) {
                        c5327g2.f21694w = z18;
                    } else {
                        boolean z19 = z18;
                        long jM36158b2 = c12871jM36167b.m36158b(jM121896J2);
                        long jM36159c2 = c12871jM36167b.m36159c(jM121896J2);
                        if (z17) {
                            long jM36161e2 = c12871jM36167b.m36161e(jM36159c2);
                            z13 = z19 & ((jM36161e2 - c12871jM36167b.m36162f(jM36159c2)) + jM36161e2 >= j38);
                        } else {
                            z13 = z19;
                        }
                        if (abstractC25273a != null) {
                            jM121915h = abstractC25273a.mo74168d();
                            j17 = jM36159c2;
                        } else {
                            AbstractC35849g.m113808j(interfaceC12870i3);
                            j17 = jM36159c2;
                            jM121915h = AbstractC38065t.m121915h(interfaceC12870i3.mo3108u(j7, j38) + j39, jM36158b2, j17);
                        }
                        long j44 = jM121915h;
                        if (j44 < jM36158b2) {
                            c12873l.f44309m = new BehindLiveWindowException();
                        } else if (j44 <= j17) {
                            long j45 = j7;
                            if (c12873l.f44310n && j44 >= j17) {
                                c5327g2.f21694w = z13;
                            } else if (!z13 || c12871jM36167b.m36162f(j44) < j38) {
                                int iMin = (int) Math.min(c12873l.f44303g, (j17 - j44) + 1);
                                int i17 = (j38 > (-9223372036854775807L) ? 1 : (j38 == (-9223372036854775807L) ? 0 : -1));
                                if (i17 != 0) {
                                    while (iMin > 1 && c12871jM36167b.m36162f((((long) iMin) + j44) - 1) >= j38) {
                                        iMin--;
                                    }
                                }
                                long j46 = list2.isEmpty() ? j45 : -9223372036854775807L;
                                InterfaceC40170f interfaceC40170f2 = c12873l.f44301e;
                                int i18 = c12873l.f44300d;
                                C34610p c34610pMo68082n2 = c12873l.f44306j.mo68082n();
                                int iMo68083o2 = c12873l.f44306j.mo68083o();
                                Object objMo68075g2 = c12873l.f44306j.mo68075g();
                                long jM36162f = c12871jM36167b.m36162f(j44);
                                AbstractC35849g.m113808j(interfaceC12870i3);
                                C14268j c14268jMo3107t = interfaceC12870i3.mo3107t(j44 - j39);
                                if (c25275c == null) {
                                    c25280h = new C25283k(interfaceC40170f2, AbstractC32410a.m101051u(abstractC14271m, c14260b.f52058a, c14268jMo3107t, c12871jM36167b.m36163g(j44, j29) ? 0 : 8), c34610pMo68082n2, iMo68083o2, objMo68075g2, jM36162f, c12871jM36167b.m36161e(j44), j44, i18, c34610pMo68082n2);
                                } else {
                                    int i19 = 1;
                                    int i24 = 1;
                                    while (true) {
                                        if (i24 >= iMin) {
                                            i13 = i17;
                                            break;
                                        }
                                        int i25 = iMin;
                                        i13 = i17;
                                        AbstractC35849g.m113808j(interfaceC12870i3);
                                        C14268j c14268jM40751a2 = c14268jMo3107t.m40751a(interfaceC12870i3.mo3107t((j44 + ((long) i24)) - j39), c14260b.f52058a);
                                        if (c14268jM40751a2 == null) {
                                            break;
                                        }
                                        i19++;
                                        i24++;
                                        c14268jMo3107t = c14268jM40751a2;
                                        i17 = i13;
                                        iMin = i25;
                                    }
                                    long j47 = (j44 + ((long) i19)) - 1;
                                    long jM36161e3 = c12871jM36167b.m36161e(j47);
                                    long j48 = (i13 == 0 || j38 > jM36161e3) ? -9223372036854775807L : j38;
                                    C40171g c40171gM101051u = AbstractC32410a.m101051u(abstractC14271m, c14260b.f52058a, c14268jMo3107t, c12871jM36167b.m36163g(j47, j29) ? 0 : 8);
                                    long j49 = -abstractC14271m.f52113y;
                                    if (AbstractC34587d0.m109379l(c34610pMo68082n2.f145783n)) {
                                        j49 += jM36162f;
                                    }
                                    c25280h = new C25280h(interfaceC40170f2, c40171gM101051u, c34610pMo68082n2, iMo68083o2, objMo68075g2, jM36162f, jM36161e3, j46, j48, j44, i19, j49, c12871jM36167b.f44286a);
                                }
                                c5327g2.f21695x = c25280h;
                            } else {
                                c5327g2.f21694w = true;
                            }
                        } else {
                            c5327g2.f21694w = z13;
                        }
                    }
                    z15 = c5327g2.f21694w;
                    abstractC25276d = (AbstractC25276d) c5327g2.f21695x;
                    c5327g2.f21695x = null;
                    c5327g2.f21694w = false;
                    if (z15) {
                        this.f99213S = j16;
                        this.f99219Y = true;
                        return true;
                    }
                    if (abstractC25276d == null) {
                        return false;
                    }
                    this.f99210P = abstractC25276d;
                    z16 = abstractC25276d instanceof AbstractC25273a;
                    c38445a = this.f99209O;
                    if (z16) {
                        abstractC25273a2 = (AbstractC25273a) abstractC25276d;
                        if (z4) {
                            j18 = abstractC25273a2.f99187G;
                            j19 = this.f99213S;
                            if (j18 < j19) {
                                this.f99207M.f93237t = j19;
                                while (i15 < r5) {
                                    c23538y0.f93237t = this.f99213S;
                                }
                                if (this.f99217W) {
                                    C34610p c34610p3 = abstractC25273a2.f99193z;
                                    this.f99218X = !AbstractC34587d0.m109368a(c34610p3.f145783n, c34610p3.f145780k);
                                }
                            }
                            this.f99217W = false;
                            this.f99213S = -9223372036854775807L;
                        }
                        abstractC25273a2.f99167M = c38445a;
                        c23538y0Arr = (C23538y0[]) c38445a.f164637y;
                        iArr = new int[c23538y0Arr.length];
                        while (i14 < c23538y0Arr.length) {
                            C23538y0 c23538y3 = c23538y0Arr[i14];
                            iArr[i14] = c23538y3.f93234q + c23538y3.f93233p;
                        }
                        abstractC25273a2.f99168N = iArr;
                        this.f99205K.add(abstractC25273a2);
                    } else if (abstractC25276d instanceof C25281i) {
                        ((C25281i) abstractC25276d).f99231K = c38445a;
                    }
                    c28987k.m88009d(abstractC25276d, this, this.f99202H.m60616q(abstractC25276d.f99192y));
                    return true;
                }
                z4 = zM74178z;
                c5327g1 = c5327g3;
                j13 = -9223372036854775807L;
                c28987k = c28987k2;
                c5327g2 = c5327g1;
                j16 = j13;
                z15 = c5327g2.f21694w;
                abstractC25276d = (AbstractC25276d) c5327g2.f21695x;
                c5327g2.f21695x = null;
                c5327g2.f21694w = false;
                if (z15) {
                    this.f99213S = j16;
                    this.f99219Y = true;
                    return true;
                }
                if (abstractC25276d == null) {
                    return false;
                }
                this.f99210P = abstractC25276d;
                z16 = abstractC25276d instanceof AbstractC25273a;
                c38445a = this.f99209O;
                if (z16) {
                    abstractC25273a2 = (AbstractC25273a) abstractC25276d;
                    if (z4) {
                        j18 = abstractC25273a2.f99187G;
                        j19 = this.f99213S;
                        if (j18 < j19) {
                            this.f99207M.f93237t = j19;
                            while (i15 < r5) {
                                c23538y0.f93237t = this.f99213S;
                            }
                            if (this.f99217W) {
                                C34610p c34610p4 = abstractC25273a2.f99193z;
                                this.f99218X = !AbstractC34587d0.m109368a(c34610p4.f145783n, c34610p4.f145780k);
                            }
                        }
                        this.f99217W = false;
                        this.f99213S = -9223372036854775807L;
                    }
                    abstractC25273a2.f99167M = c38445a;
                    c23538y0Arr = (C23538y0[]) c38445a.f164637y;
                    iArr = new int[c23538y0Arr.length];
                    while (i14 < c23538y0Arr.length) {
                        C23538y0 c23538y4 = c23538y0Arr[i14];
                        iArr[i14] = c23538y4.f93234q + c23538y4.f93233p;
                    }
                    abstractC25273a2.f99168N = iArr;
                    this.f99205K.add(abstractC25273a2);
                } else if (abstractC25276d instanceof C25281i) {
                    ((C25281i) abstractC25276d).f99231K = c38445a;
                }
                c28987k.m88009d(abstractC25276d, this, this.f99202H.m60616q(abstractC25276d.f99192y));
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y */
    public final boolean m74177y(int i13) {
        int iM68129l;
        AbstractC25273a abstractC25273a = (AbstractC25273a) this.f99205K.get(i13);
        if (this.f99207M.m68129l() > abstractC25273a.m74167a(0)) {
            return true;
        }
        int i14 = 0;
        do {
            C23538y0[] c23538y0Arr = this.f99208N;
            if (i14 >= c23538y0Arr.length) {
                return false;
            }
            iM68129l = c23538y0Arr[i14].m68129l();
            i14++;
        } while (iM68129l <= abstractC25273a.m74167a(i14));
        return true;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m74178z() {
        return this.f99213S != -9223372036854775807L;
    }
}
