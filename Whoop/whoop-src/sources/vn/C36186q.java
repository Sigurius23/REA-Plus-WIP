package vn;

import ai.C0902h;
import ai.C0904j;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import bb.C2919f;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import ed3.C13117a;
import g73.C15556d;
import in.C18715c;
import in.InterfaceC18714b;
import io.InterfaceC20035o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import lr.RunnableC24693e;
import p047c9.C4320k;
import p133f1.C13968p1;
import p284ko.C22611c0;
import p284ko.C22630n;
import p284ko.C22631o;
import p284ko.HandlerC22642z;
import p284ko.InterfaceC22607a0;
import p284ko.InterfaceC22609b0;
import p284ko.InterfaceC22628l;
import p284ko.InterfaceC22641y;
import p299l9.C23534w0;
import p299l9.C23537y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p309lo.C24566x;
import p319m4.AbstractC25012a;
import p345nn.C26857h;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p508ty.C34249c;
import p528un.AbstractC35090a;
import p556vm.C36136c;
import p556vm.InterfaceC36141h;
import p588wm.C37366h;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37374p;
import p588wm.InterfaceC37377s;
import p589wn.AbstractC37400h;
import p589wn.C37394b;
import p589wn.C37395c;
import p589wn.C37397e;
import p589wn.C37399g;
import p589wn.C37402j;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41014d0;
import p690zr.C41060w0;
import p715kotlin.jvm.internal.AbstractC22674j;
import q63.AbstractC30007c;
import sm.C32713f;
import sn.C32745m;
import sn.C32766w0;
import sn.C32768x0;
import sn.C32770z;
import sn.InterfaceC32752p0;
import sn.InterfaceC32760t0;

/* JADX INFO: renamed from: vn.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C36186q implements InterfaceC22641y, InterfaceC22609b0, InterfaceC32760t0, InterfaceC37369k, InterfaceC32752p0 {

    /* JADX INFO: renamed from: y0 */
    public static final Set f154860y0 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));

    /* JADX INFO: renamed from: E */
    public final C22631o f154861E;

    /* JADX INFO: renamed from: F */
    public final C31521c0 f154862F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC36141h f154863G;

    /* JADX INFO: renamed from: H */
    public final C32770z f154864H;

    /* JADX INFO: renamed from: I */
    public final C15556d f154865I;

    /* JADX INFO: renamed from: J */
    public final C22611c0 f154866J = new C22611c0("Loader:HlsSampleStreamWrapper");

    /* JADX INFO: renamed from: K */
    public final C32770z f154867K;

    /* JADX INFO: renamed from: L */
    public final int f154868L;

    /* JADX INFO: renamed from: M */
    public final C13968p1 f154869M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f154870N;

    /* JADX INFO: renamed from: O */
    public final List f154871O;

    /* JADX INFO: renamed from: P */
    public final RunnableC36183n f154872P;

    /* JADX INFO: renamed from: Q */
    public final RunnableC36183n f154873Q;

    /* JADX INFO: renamed from: R */
    public final Handler f154874R;

    /* JADX INFO: renamed from: S */
    public final ArrayList f154875S;

    /* JADX INFO: renamed from: T */
    public final Map f154876T;

    /* JADX INFO: renamed from: U */
    public AbstractC35090a f154877U;

    /* JADX INFO: renamed from: V */
    public C36185p[] f154878V;

    /* JADX INFO: renamed from: W */
    public int[] f154879W;

    /* JADX INFO: renamed from: X */
    public final HashSet f154880X;

    /* JADX INFO: renamed from: Y */
    public final SparseIntArray f154881Y;

    /* JADX INFO: renamed from: Z */
    public C36184o f154882Z;

    /* JADX INFO: renamed from: a0 */
    public int f154883a0;

    /* JADX INFO: renamed from: b0 */
    public int f154884b0;

    /* JADX INFO: renamed from: c0 */
    public boolean f154885c0;

    /* JADX INFO: renamed from: d0 */
    public boolean f154886d0;

    /* JADX INFO: renamed from: e0 */
    public int f154887e0;

    /* JADX INFO: renamed from: f0 */
    public C31521c0 f154888f0;

    /* JADX INFO: renamed from: g0 */
    public C31521c0 f154889g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f154890h0;

    /* JADX INFO: renamed from: i0 */
    public C32768x0 f154891i0;

    /* JADX INFO: renamed from: j0 */
    public Set f154892j0;

    /* JADX INFO: renamed from: k0 */
    public int[] f154893k0;

    /* JADX INFO: renamed from: l0 */
    public int f154894l0;

    /* JADX INFO: renamed from: m0 */
    public boolean f154895m0;

    /* JADX INFO: renamed from: n0 */
    public boolean[] f154896n0;

    /* JADX INFO: renamed from: o0 */
    public boolean[] f154897o0;

    /* JADX INFO: renamed from: p0 */
    public long f154898p0;

    /* JADX INFO: renamed from: q0 */
    public long f154899q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f154900r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f154901s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f154902t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f154903u0;

    /* JADX INFO: renamed from: v0 */
    public long f154904v0;

    /* JADX INFO: renamed from: w */
    public final String f154905w;

    /* JADX INFO: renamed from: w0 */
    public C36136c f154906w0;

    /* JADX INFO: renamed from: x */
    public final int f154907x;

    /* JADX INFO: renamed from: x0 */
    public C36179j f154908x0;

    /* JADX INFO: renamed from: y */
    public final C36180k f154909y;

    /* JADX INFO: renamed from: z */
    public final C36177h f154910z;

    /* JADX WARN: Type inference failed for: r1v12, types: [vn.n] */
    /* JADX WARN: Type inference failed for: r1v13, types: [vn.n] */
    public C36186q(String str, int i13, C36180k c36180k, C36177h c36177h, Map map, C22631o c22631o, long j7, C31521c0 c31521c0, InterfaceC36141h interfaceC36141h, C32770z c32770z, C15556d c15556d, C32770z c32770z2, int i14) {
        this.f154905w = str;
        this.f154907x = i13;
        this.f154909y = c36180k;
        this.f154910z = c36177h;
        this.f154876T = map;
        this.f154861E = c22631o;
        this.f154862F = c31521c0;
        this.f154863G = interfaceC36141h;
        this.f154864H = c32770z;
        this.f154865I = c15556d;
        this.f154867K = c32770z2;
        this.f154868L = i14;
        C13968p1 c13968p1 = new C13968p1(10);
        c13968p1.f49808y = null;
        final int i15 = 0;
        c13968p1.f49807x = false;
        c13968p1.f49809z = null;
        this.f154869M = c13968p1;
        this.f154879W = new int[0];
        Set set = f154860y0;
        this.f154880X = new HashSet(set.size());
        this.f154881Y = new SparseIntArray(set.size());
        this.f154878V = new C36185p[0];
        this.f154897o0 = new boolean[0];
        this.f154896n0 = new boolean[0];
        ArrayList arrayList = new ArrayList();
        this.f154870N = arrayList;
        this.f154871O = Collections.unmodifiableList(arrayList);
        this.f154875S = new ArrayList();
        this.f154872P = new Runnable(this) { // from class: vn.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C36186q f154850x;

            {
                this.f154850x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i15) {
                    case 0:
                        this.f154850x.m115136D();
                        break;
                    default:
                        C36186q c36186q = this.f154850x;
                        c36186q.f154885c0 = true;
                        c36186q.m115136D();
                        break;
                }
            }
        };
        final int i16 = 1;
        this.f154873Q = new Runnable(this) { // from class: vn.n

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ C36186q f154850x;

            {
                this.f154850x = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i16) {
                    case 0:
                        this.f154850x.m115136D();
                        break;
                    default:
                        C36186q c36186q = this.f154850x;
                        c36186q.f154885c0 = true;
                        c36186q.m115136D();
                        break;
                }
            }
        };
        this.f154874R = AbstractC24567y.m71680k(null);
        this.f154898p0 = j7;
        this.f154899q0 = j7;
    }

    /* JADX INFO: renamed from: B */
    public static int m115131B(int i13) {
        if (i13 == 1) {
            return 2;
        }
        if (i13 != 2) {
            return i13 != 3 ? 0 : 1;
        }
        return 3;
    }

    /* JADX INFO: renamed from: t */
    public static C37366h m115132t(int i13, int i14) {
        StringBuilder sb4 = new StringBuilder(54);
        sb4.append("Unmapped track with id ");
        sb4.append(i13);
        sb4.append(" of type ");
        sb4.append(i14);
        Log.w("HlsSampleStreamWrapper", sb4.toString());
        return new C37366h();
    }

    /* JADX INFO: renamed from: y */
    public static C31521c0 m115133y(C31521c0 c31521c0, C31521c0 c31521c1, boolean z4) {
        String strM71607a;
        if (c31521c0 == null) {
            return c31521c1;
        }
        String str = c31521c0.f130074I;
        String strM71609c = c31521c1.f130077L;
        int iM71613g = AbstractC24555m.m71613g(strM71609c);
        if (AbstractC24567y.m71682m(iM71613g, str) == 1) {
            strM71607a = AbstractC24567y.m71683n(iM71613g, str);
            strM71609c = AbstractC24555m.m71609c(strM71607a);
        } else {
            strM71607a = AbstractC24555m.m71607a(str, strM71609c);
        }
        C31518b0 c31518b0M97113a = c31521c1.m97113a();
        c31518b0M97113a.f130037a = c31521c0.f130098w;
        c31518b0M97113a.f130038b = c31521c0.f130099x;
        c31518b0M97113a.f130039c = c31521c0.f130100y;
        c31518b0M97113a.f130040d = c31521c0.f130101z;
        c31518b0M97113a.f130041e = c31521c0.f130070E;
        c31518b0M97113a.f130042f = z4 ? c31521c0.f130071F : -1;
        c31518b0M97113a.f130043g = z4 ? c31521c0.f130072G : -1;
        c31518b0M97113a.f130044h = strM71607a;
        if (iM71613g == 2) {
            c31518b0M97113a.f130052p = c31521c0.f130082Q;
            c31518b0M97113a.f130053q = c31521c0.f130083R;
            c31518b0M97113a.f130054r = c31521c0.f130084S;
        }
        if (strM71609c != null) {
            c31518b0M97113a.f130047k = strM71609c;
        }
        int i13 = c31521c0.f130090Y;
        if (i13 != -1 && iM71613g == 1) {
            c31518b0M97113a.f130060x = i13;
        }
        C18715c c18715c = c31521c0.f130075J;
        if (c18715c != null) {
            C18715c c18715c2 = c31521c1.f130075J;
            if (c18715c2 != null) {
                InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
                if (interfaceC18714bArr.length == 0) {
                    c18715c = c18715c2;
                } else {
                    InterfaceC18714b[] interfaceC18714bArr2 = c18715c2.f73525w;
                    Object[] objArrCopyOf = Arrays.copyOf(interfaceC18714bArr2, interfaceC18714bArr2.length + interfaceC18714bArr.length);
                    System.arraycopy(interfaceC18714bArr, 0, objArrCopyOf, interfaceC18714bArr2.length, interfaceC18714bArr.length);
                    c18715c = new C18715c((InterfaceC18714b[]) objArrCopyOf);
                }
            }
            c31518b0M97113a.f130045i = c18715c;
        }
        return new C31521c0(c31518b0M97113a);
    }

    /* JADX INFO: renamed from: A */
    public final C36179j m115134A() {
        return (C36179j) AbstractC25012a.m73371d(this.f154870N, 1);
    }

    /* JADX INFO: renamed from: C */
    public final boolean m115135C() {
        return this.f154899q0 != -9223372036854775807L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D */
    public final void m115136D() {
        int i13;
        if (!this.f154890h0 && this.f154893k0 == null && this.f154885c0) {
            int i14 = 0;
            for (C36185p c36185p : this.f154878V) {
                if (c36185p.m102744o() == null) {
                    return;
                }
            }
            C32768x0 c32768x0 = this.f154891i0;
            if (c32768x0 != null) {
                int i15 = c32768x0.f136270w;
                int[] iArr = new int[i15];
                this.f154893k0 = iArr;
                Arrays.fill(iArr, -1);
                for (int i16 = 0; i16 < i15; i16++) {
                    int i17 = 0;
                    while (true) {
                        C36185p[] c36185pArr = this.f154878V;
                        if (i17 >= c36185pArr.length) {
                            break;
                        }
                        C31521c0 c31521c0M102744o = c36185pArr[i17].m102744o();
                        AbstractC24543a.m71574j(c31521c0M102744o);
                        C31521c0 c31521c0 = this.f154891i0.m102758a(i16).f136262y[0];
                        String str = c31521c0M102744o.f130077L;
                        String str2 = c31521c0.f130077L;
                        int iM71613g = AbstractC24555m.m71613g(str);
                        if (iM71613g != 3) {
                            if (iM71613g == AbstractC24555m.m71613g(str2)) {
                                this.f154893k0[i16] = i17;
                                break;
                            }
                            i17++;
                        } else {
                            if (AbstractC24567y.m71670a(str, str2) && (!("application/cea-608".equals(str) || "application/cea-708".equals(str)) || c31521c0M102744o.f130095d0 == c31521c0.f130095d0)) {
                                this.f154893k0[i16] = i17;
                                break;
                                break;
                            }
                            i17++;
                        }
                    }
                }
                Iterator it = this.f154875S.iterator();
                while (it.hasNext()) {
                    ((C36182m) it.next()).m115129a();
                }
                return;
            }
            int length = this.f154878V.length;
            int i18 = 0;
            int i19 = -1;
            int i24 = -2;
            while (true) {
                int i25 = 1;
                if (i18 >= length) {
                    break;
                }
                C31521c0 c31521c0M102744o2 = this.f154878V[i18].m102744o();
                AbstractC24543a.m71574j(c31521c0M102744o2);
                String str3 = c31521c0M102744o2.f130077L;
                if (AbstractC24555m.m71616j(str3)) {
                    i25 = 2;
                } else if (!AbstractC24555m.m71614h(str3)) {
                    i25 = AbstractC24555m.m71615i(str3) ? 3 : -2;
                }
                if (m115131B(i25) > m115131B(i24)) {
                    i19 = i18;
                    i24 = i25;
                } else if (i25 == i24 && i19 != -1) {
                    i19 = -1;
                }
                i18++;
            }
            C32766w0 c32766w0 = this.f154910z.f154770h;
            int i26 = c32766w0.f136260w;
            this.f154894l0 = -1;
            this.f154893k0 = new int[length];
            for (int i27 = 0; i27 < length; i27++) {
                this.f154893k0[i27] = i27;
            }
            C32766w0[] c32766w0Arr = new C32766w0[length];
            int i28 = 0;
            while (i28 < length) {
                C31521c0 c31521c0M102744o3 = this.f154878V[i28].m102744o();
                AbstractC24543a.m71574j(c31521c0M102744o3);
                String str4 = this.f154905w;
                C31521c0 c31521c1 = this.f154862F;
                if (i28 == i19) {
                    C31521c0[] c31521c0Arr = new C31521c0[i26];
                    for (int i29 = i14; i29 < i26; i29++) {
                        C31521c0 c31521c0M97115c = c32766w0.f136262y[i29];
                        if (i24 == 1 && c31521c1 != null) {
                            c31521c0M97115c = c31521c0M97115c.m97115c(c31521c1);
                        }
                        c31521c0Arr[i29] = i26 == 1 ? c31521c0M102744o3.m97115c(c31521c0M97115c) : m115133y(c31521c0M97115c, c31521c0M102744o3, true);
                    }
                    c32766w0Arr[i28] = new C32766w0(str4, c31521c0Arr);
                    this.f154894l0 = i28;
                    i13 = 0;
                } else {
                    if (i24 != 2 || !AbstractC24555m.m71614h(c31521c0M102744o3.f130077L)) {
                        c31521c1 = null;
                    }
                    int i34 = i28 < i19 ? i28 : i28 - 1;
                    StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(18, str4));
                    sb4.append(str4);
                    sb4.append(":muxed:");
                    sb4.append(i34);
                    i13 = 0;
                    c32766w0Arr[i28] = new C32766w0(sb4.toString(), m115133y(c31521c1, c31521c0M102744o3, false));
                }
                i28++;
                i14 = i13;
            }
            int i35 = i14;
            this.f154891i0 = m115142w(c32766w0Arr);
            AbstractC24543a.m71573i(this.f154892j0 == null ? 1 : i35);
            this.f154892j0 = Collections.EMPTY_SET;
            this.f154886d0 = true;
            this.f154909y.m115126r();
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m115137E() {
        C22611c0 c22611c0 = this.f154866J;
        IOException iOException = c22611c0.f88959c;
        if (iOException != null) {
            throw iOException;
        }
        HandlerC22642z handlerC22642z = c22611c0.f88958b;
        if (handlerC22642z != null) {
            int i13 = handlerC22642z.f89089w;
            IOException iOException2 = handlerC22642z.f89092z;
            if (iOException2 != null && handlerC22642z.f89084E > i13) {
                throw iOException2;
            }
        }
        C36177h c36177h = this.f154910z;
        BehindLiveWindowException behindLiveWindowException = c36177h.f154776n;
        if (behindLiveWindowException != null) {
            throw behindLiveWindowException;
        }
        Uri uri = c36177h.f154777o;
        if (uri == null || !c36177h.f154781s) {
            return;
        }
        C37394b c37394b = (C37394b) c36177h.f154769g.f160004z.get(uri);
        C22611c0 c22611c1 = c37394b.f159987x;
        IOException iOException3 = c22611c1.f88959c;
        if (iOException3 != null) {
            throw iOException3;
        }
        HandlerC22642z handlerC22642z2 = c22611c1.f88958b;
        if (handlerC22642z2 != null) {
            int i14 = handlerC22642z2.f89089w;
            IOException iOException4 = handlerC22642z2.f89092z;
            if (iOException4 != null && handlerC22642z2.f89084E > i14) {
                throw iOException4;
            }
        }
        IOException iOException5 = c37394b.f159984J;
        if (iOException5 != null) {
            throw iOException5;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m115138F(C32766w0[] c32766w0Arr, int... iArr) {
        this.f154891i0 = m115142w(c32766w0Arr);
        this.f154892j0 = new HashSet();
        for (int i13 : iArr) {
            this.f154892j0.add(this.f154891i0.m102758a(i13));
        }
        this.f154894l0 = 0;
        this.f154874R.post(new RunnableC24693e(this.f154909y, 23));
        this.f154886d0 = true;
    }

    /* JADX INFO: renamed from: G */
    public final void m115139G() {
        for (C36185p c36185p : this.f154878V) {
            c36185p.m102750u(this.f154900r0);
        }
        this.f154900r0 = false;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m115140H(long j7, boolean z4) {
        this.f154898p0 = j7;
        if (m115135C()) {
            this.f154899q0 = j7;
            return true;
        }
        if (this.f154885c0 && !z4) {
            int length = this.f154878V.length;
            for (int i13 = 0; i13 < length; i13++) {
                if (this.f154878V[i13].m102751v(j7, false) || (!this.f154897o0[i13] && this.f154895m0)) {
                }
            }
            return false;
        }
        this.f154899q0 = j7;
        this.f154902t0 = false;
        this.f154870N.clear();
        C22611c0 c22611c0 = this.f154866J;
        if (!c22611c0.m65554b()) {
            c22611c0.f88959c = null;
            m115139G();
            return true;
        }
        if (this.f154885c0) {
            for (C36185p c36185p : this.f154878V) {
                c36185p.m102736g();
            }
        }
        c22611c0.m65553a();
        return true;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: a */
    public final boolean mo91531a() {
        return this.f154866J.m65554b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: c */
    public final void mo65586c(InterfaceC22607a0 interfaceC22607a0) {
        AbstractC35090a abstractC35090a = (AbstractC35090a) interfaceC22607a0;
        this.f154877U = null;
        if (abstractC35090a instanceof C36174e) {
            C36174e c36174e = (C36174e) abstractC35090a;
            byte[] bArr = c36174e.f154755j;
            C36177h c36177h = this.f154910z;
            c36177h.f154775m = bArr;
            C34249c c34249c = c36177h.f154772j;
            Uri uri = c36174e.f148914b.f89019a;
            byte[] bArr2 = c36174e.f154757l;
            bArr2.getClass();
            C36173d c36173d = (C36173d) c34249c.f143660x;
            uri.getClass();
        }
        long j7 = abstractC35090a.f148913a;
        Uri uri2 = abstractC35090a.f148921i.f88998y;
        C32745m c32745m = new C32745m();
        this.f154865I.getClass();
        this.f154867K.m102763e(c32745m, abstractC35090a.f148915c, this.f154907x, abstractC35090a.f148916d, abstractC35090a.f148917e, abstractC35090a.f148918f, abstractC35090a.f148919g, abstractC35090a.f148920h);
        if (this.f154886d0) {
            this.f154909y.mo97274c(this);
        } else {
            mo91536u(this.f154898p0);
        }
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: d */
    public final long mo91532d() {
        if (m115135C()) {
            return this.f154899q0;
        }
        if (this.f154902t0) {
            return Long.MIN_VALUE;
        }
        return m115134A().f148920h;
    }

    @Override // p284ko.InterfaceC22609b0
    /* JADX INFO: renamed from: g */
    public final void mo65552g() {
        for (C36185p c36185p : this.f154878V) {
            c36185p.m102750u(true);
            C34249c c34249c = c36185p.f136219h;
            if (c34249c != null) {
                c34249c.m108304u(c36185p.f136216e);
                c36185p.f136219h = null;
                c36185p.f136218g = null;
            }
        }
    }

    @Override // p588wm.InterfaceC37369k, p499t9.InterfaceC33648q
    /* JADX INFO: renamed from: l */
    public final void mo3098l() {
        this.f154903u0 = true;
        this.f154874R.post(this.f154873Q);
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: m */
    public final long mo91533m() {
        long j7;
        ArrayList arrayList = this.f154870N;
        if (this.f154902t0) {
            return Long.MIN_VALUE;
        }
        if (m115135C()) {
            return this.f154899q0;
        }
        long jMax = this.f154898p0;
        C36179j c36179jM115134A = m115134A();
        if (!c36179jM115134A.f154791H) {
            c36179jM115134A = arrayList.size() > 1 ? (C36179j) AbstractC25012a.m73371d(arrayList, 2) : null;
        }
        if (c36179jM115134A != null) {
            jMax = Math.max(jMax, c36179jM115134A.f148920h);
        }
        if (this.f154885c0) {
            for (C36185p c36185p : this.f154878V) {
                synchronized (c36185p) {
                    j7 = c36185p.f136233v;
                }
                jMax = Math.max(jMax, j7);
            }
        }
        return jMax;
    }

    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: n */
    public final void mo91534n(long j7) {
        C22611c0 c22611c0 = this.f154866J;
        if (c22611c0.f88959c == null && !m115135C()) {
            boolean zM65554b = c22611c0.m65554b();
            C36177h c36177h = this.f154910z;
            List list = this.f154871O;
            if (zM65554b) {
                this.f154877U.getClass();
                if (c36177h.f154776n != null ? false : c36177h.f154779q.mo55875t(j7, this.f154877U, list)) {
                    c22611c0.m65553a();
                    return;
                }
                return;
            }
            int size = list.size();
            while (size > 0 && c36177h.m115115b((C36179j) list.get(size - 1)) == 2) {
                size--;
            }
            if (size < list.size()) {
                m115143z(size);
            }
            int size2 = (c36177h.f154776n != null || c36177h.f154779q.length() < 2) ? list.size() : c36177h.f154779q.mo54495l(j7, list);
            if (size2 < this.f154870N.size()) {
                m115143z(size2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [vn.p[]] */
    /* JADX WARN: Type inference failed for: r1v1, types: [vn.p[]] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [wm.s] */
    /* JADX WARN: Type inference failed for: r5v4, types: [sn.q0, vn.p] */
    /* JADX WARN: Type inference failed for: r5v6, types: [wm.h] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: o */
    public final InterfaceC37377s mo3102o(int i13, int i14) {
        Integer numValueOf = Integer.valueOf(i14);
        Set set = f154860y0;
        boolean zContains = set.contains(numValueOf);
        HashSet hashSet = this.f154880X;
        SparseIntArray sparseIntArray = this.f154881Y;
        ?? c36185p = 0;
        c36185p = 0;
        if (zContains) {
            AbstractC24543a.m71569e(set.contains(Integer.valueOf(i14)));
            int i15 = sparseIntArray.get(i14, -1);
            if (i15 != -1) {
                if (hashSet.add(Integer.valueOf(i14))) {
                    this.f154879W[i15] = i13;
                }
                c36185p = this.f154879W[i15] == i13 ? this.f154878V[i15] : m115132t(i13, i14);
            }
        } else {
            int i16 = 0;
            while (true) {
                ?? r10 = this.f154878V;
                if (i16 >= r10.length) {
                    break;
                }
                if (this.f154879W[i16] == i13) {
                    c36185p = r10[i16];
                    break;
                }
                i16++;
            }
        }
        if (c36185p == 0) {
            if (this.f154903u0) {
                return m115132t(i13, i14);
            }
            int length = this.f154878V.length;
            boolean z4 = i14 == 1 || i14 == 2;
            c36185p = new C36185p(this.f154861E, this.f154863G, this.f154864H, this.f154876T);
            c36185p.f136231t = this.f154898p0;
            if (z4) {
                c36185p.f154859I = this.f154906w0;
                c36185p.f136237z = true;
            }
            long j7 = this.f154904v0;
            if (c36185p.f136210F != j7) {
                c36185p.f136210F = j7;
                c36185p.f136237z = true;
            }
            C36179j c36179j = this.f154908x0;
            if (c36179j != null) {
                c36185p.f136207C = c36179j.f154795k;
            }
            c36185p.f136217f = this;
            int i17 = length + 1;
            int[] iArrCopyOf = Arrays.copyOf(this.f154879W, i17);
            this.f154879W = iArrCopyOf;
            iArrCopyOf[length] = i13;
            C36185p[] c36185pArr = this.f154878V;
            int i18 = AbstractC24567y.f95875a;
            ?? CopyOf = Arrays.copyOf(c36185pArr, c36185pArr.length + 1);
            CopyOf[c36185pArr.length] = c36185p;
            this.f154878V = (C36185p[]) CopyOf;
            boolean[] zArrCopyOf = Arrays.copyOf(this.f154897o0, i17);
            this.f154897o0 = zArrCopyOf;
            zArrCopyOf[length] = z4;
            this.f154895m0 |= z4;
            hashSet.add(Integer.valueOf(i14));
            sparseIntArray.append(i14, length);
            if (m115131B(i14) > m115131B(this.f154883a0)) {
                this.f154884b0 = length;
                this.f154883a0 = i14;
            }
            this.f154896n0 = Arrays.copyOf(this.f154896n0, i17);
        }
        if (i14 != 5) {
            return c36185p;
        }
        if (this.f154882Z == null) {
            this.f154882Z = new C36184o(c36185p, this.f154868L);
        }
        return this.f154882Z;
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: p */
    public final void mo65587p(InterfaceC22607a0 interfaceC22607a0, boolean z4) {
        AbstractC35090a abstractC35090a = (AbstractC35090a) interfaceC22607a0;
        this.f154877U = null;
        long j7 = abstractC35090a.f148913a;
        Uri uri = abstractC35090a.f148921i.f88998y;
        C32745m c32745m = new C32745m();
        this.f154865I.getClass();
        this.f154867K.m102761c(c32745m, abstractC35090a.f148915c, this.f154907x, abstractC35090a.f148916d, abstractC35090a.f148917e, abstractC35090a.f148918f, abstractC35090a.f148919g, abstractC35090a.f148920h);
        if (z4) {
            return;
        }
        if (m115135C() || this.f154887e0 == 0) {
            m115139G();
        }
        if (this.f154887e0 > 0) {
            this.f154909y.mo97274c(this);
        }
    }

    @Override // p284ko.InterfaceC22641y
    /* JADX INFO: renamed from: q */
    public final C2919f mo65588q(InterfaceC22607a0 interfaceC22607a0, IOException iOException, int i13) {
        boolean zMo54505r;
        C2919f c2919f;
        int i14;
        AbstractC35090a abstractC35090a = (AbstractC35090a) interfaceC22607a0;
        boolean z4 = abstractC35090a instanceof C36179j;
        if (z4 && !((C36179j) abstractC35090a).f154794K && (iOException instanceof HttpDataSource$InvalidResponseCodeException) && ((i14 = ((HttpDataSource$InvalidResponseCodeException) iOException).f20438y) == 410 || i14 == 404)) {
            return C22611c0.f88954d;
        }
        long j7 = abstractC35090a.f148921i.f88997x;
        Uri uri = abstractC35090a.f148921i.f88998y;
        C32745m c32745m = new C32745m();
        AbstractC24567y.m71669G(abstractC35090a.f148919g);
        AbstractC24567y.m71669G(abstractC35090a.f148920h);
        C0904j c0904j = new C0904j(iOException, i13);
        C36177h c36177h = this.f154910z;
        C4320k c4320kM65740z = AbstractC22674j.m65740z(c36177h.f154779q);
        this.f154865I.getClass();
        C2919f c2919fM43804g = C15556d.m43804g(c4320kM65740z, c0904j);
        if (c2919fM43804g == null || c2919fM43804g.f11740a != 2) {
            zMo54505r = false;
        } else {
            long j13 = c2919fM43804g.f11741b;
            InterfaceC20035o interfaceC20035o = c36177h.f154779q;
            zMo54505r = interfaceC20035o.mo54505r(interfaceC20035o.mo54501i(c36177h.f154770h.m102757a(abstractC35090a.f148916d)), j13);
        }
        if (zMo54505r) {
            if (z4 && j7 == 0) {
                ArrayList arrayList = this.f154870N;
                AbstractC24543a.m71573i(((C36179j) arrayList.remove(arrayList.size() - 1)) == abstractC35090a);
                if (arrayList.isEmpty()) {
                    this.f154899q0 = this.f154898p0;
                } else {
                    ((C36179j) AbstractC41047q.m133279i(arrayList)).f154793J = true;
                }
            }
            c2919f = C22611c0.f88955e;
        } else {
            long jM43805i = C15556d.m43805i(c0904j);
            c2919f = jM43805i != -9223372036854775807L ? new C2919f(0, jM43805i, (byte) 0) : C22611c0.f88956f;
        }
        C2919f c2919f2 = c2919f;
        int i15 = c2919f2.f11740a;
        boolean z13 = i15 == 0 || i15 == 1;
        this.f154867K.m102765g(c32745m, abstractC35090a.f148915c, this.f154907x, abstractC35090a.f148916d, abstractC35090a.f148917e, abstractC35090a.f148918f, abstractC35090a.f148919g, abstractC35090a.f148920h, iOException, !z13);
        if (!z13) {
            this.f154877U = null;
        }
        if (zMo54505r) {
            if (!this.f154886d0) {
                mo91536u(this.f154898p0);
                return c2919f2;
            }
            this.f154909y.mo97274c(this);
        }
        return c2919f2;
    }

    @Override // sn.InterfaceC32752p0
    /* JADX INFO: renamed from: r */
    public final void mo102719r() {
        this.f154874R.post(this.f154872P);
    }

    /* JADX INFO: renamed from: s */
    public final void m115141s() {
        AbstractC24543a.m71573i(this.f154886d0);
        this.f154891i0.getClass();
        this.f154892j0.getClass();
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0285  */
    /* JADX WARN: Code duplicated, block: B:114:0x028f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0293  */
    /* JADX WARN: Code duplicated, block: B:118:0x0297  */
    /* JADX WARN: Code duplicated, block: B:122:0x02a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:123:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:126:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:133:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:140:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:142:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:145:0x02df  */
    /* JADX WARN: Code duplicated, block: B:148:0x02e5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x0307  */
    /* JADX WARN: Code duplicated, block: B:153:0x0312  */
    /* JADX WARN: Code duplicated, block: B:155:0x0324  */
    /* JADX WARN: Code duplicated, block: B:156:0x0326  */
    /* JADX WARN: Code duplicated, block: B:159:0x0345  */
    /* JADX WARN: Code duplicated, block: B:161:0x034c  */
    /* JADX WARN: Code duplicated, block: B:164:0x0363  */
    /* JADX WARN: Code duplicated, block: B:165:0x0366  */
    /* JADX WARN: Code duplicated, block: B:167:0x036a  */
    /* JADX WARN: Code duplicated, block: B:168:0x0374  */
    /* JADX WARN: Code duplicated, block: B:170:0x0377  */
    /* JADX WARN: Code duplicated, block: B:171:0x0382  */
    /* JADX WARN: Code duplicated, block: B:174:0x0388 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:175:0x038a  */
    /* JADX WARN: Code duplicated, block: B:176:0x038c  */
    /* JADX WARN: Code duplicated, block: B:178:0x038f  */
    /* JADX WARN: Code duplicated, block: B:179:0x0399  */
    /* JADX WARN: Code duplicated, block: B:182:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:184:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:187:0x03dc  */
    /* JADX WARN: Code duplicated, block: B:189:0x03e0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:197:0x03f9  */
    /* JADX WARN: Code duplicated, block: B:200:0x0402  */
    /* JADX WARN: Code duplicated, block: B:203:0x0408  */
    /* JADX WARN: Code duplicated, block: B:206:0x040f A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:212:0x041e  */
    /* JADX WARN: Code duplicated, block: B:215:0x0427  */
    /* JADX WARN: Code duplicated, block: B:218:0x044f  */
    /* JADX WARN: Code duplicated, block: B:222:0x0485  */
    /* JADX WARN: Code duplicated, block: B:224:0x0492  */
    /* JADX WARN: Code duplicated, block: B:226:0x0496 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:227:0x0498  */
    /* JADX WARN: Code duplicated, block: B:229:0x04ac A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:230:0x04b0  */
    /* JADX WARN: Code duplicated, block: B:232:0x04b4  */
    /* JADX WARN: Code duplicated, block: B:234:0x04d3 A[LOOP:1: B:233:0x04d1->B:234:0x04d3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:237:0x04f2  */
    /* JADX WARN: Code duplicated, block: B:239:0x04ff  */
    /* JADX WARN: Code duplicated, block: B:249:0x0502 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:81:0x01d9  */
    /* JADX WARN: Instruction removed from duplicated block: B:232:0x04b4, please report this as an issue */
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
    @Override // sn.InterfaceC32760t0
    /* JADX INFO: renamed from: u */
    public final boolean mo91536u(long j7) {
        long jMax;
        List list;
        long j13;
        C13968p1 c13968p1;
        int i13;
        C13968p1 c13968p2;
        C36177h c36177h;
        int i14;
        int iIntValue;
        Uri uri;
        C36176g c36176g;
        boolean z4;
        AbstractC37400h abstractC37400h;
        C37399g c37399g;
        long j14;
        Uri uriM71561C;
        C36174e c36174eM115117d;
        String str;
        Uri uriM71561C2;
        C36174e c36174eM115117d2;
        long j15;
        long j16;
        boolean z13;
        InterfaceC22628l c36170a;
        C34249c c34249c;
        byte[] bArr;
        byte[] bArr2;
        Map map;
        int i15;
        boolean z14;
        byte[] bArrM115118d;
        InterfaceC22628l c36170a2;
        C37399g c37399g2;
        C22630n c22630n;
        InterfaceC22628l interfaceC22628l;
        boolean z15;
        int i16;
        C26857h c26857h;
        C13117a c13117a;
        C36171b c36171b;
        SparseArray sparseArray;
        C24566x c24566x;
        C22630n c22630n2;
        boolean z16;
        boolean z17;
        C36171b c36171b2;
        boolean z18;
        byte[] bArrM115118d2;
        String str2;
        boolean z19;
        AbstractC35090a abstractC35090a;
        Uri uri2;
        C36179j c36179j;
        C41014d0 c41014d0M133251l;
        int i17;
        int i18;
        if (!this.f154902t0) {
            C22611c0 c22611c0 = this.f154866J;
            if (!c22611c0.m65554b()) {
                if (c22611c0.f88959c != null) {
                    return false;
                }
                if (m115135C()) {
                    list = Collections.EMPTY_LIST;
                    jMax = this.f154899q0;
                    for (C36185p c36185p : this.f154878V) {
                        c36185p.f136231t = this.f154899q0;
                    }
                } else {
                    C36179j c36179jM115134A = m115134A();
                    jMax = c36179jM115134A.f154791H ? c36179jM115134A.f148920h : Math.max(this.f154898p0, c36179jM115134A.f148919g);
                    list = this.f154871O;
                }
                List list2 = list;
                C13968p1 c13968p3 = this.f154869M;
                c13968p3.f49808y = null;
                c13968p3.f49807x = false;
                c13968p3.f49809z = null;
                boolean z24 = this.f154886d0 || !list2.isEmpty();
                C36177h c36177h2 = this.f154910z;
                C34249c c34249c2 = c36177h2.f154772j;
                Uri[] uriArr = c36177h2.f154767e;
                C37395c c37395c = c36177h2.f154769g;
                C36179j c36179j2 = list2.isEmpty() ? null : (C36179j) AbstractC41047q.m133279i(list2);
                int iM102757a = c36179j2 == null ? -1 : c36177h2.f154770h.m102757a(c36179j2.f148916d);
                long jMax2 = jMax - j7;
                long j17 = c36177h2.f154780r;
                long jMax3 = j17 != -9223372036854775807L ? j17 - j7 : -9223372036854775807L;
                if (c36179j2 == null) {
                    j13 = jMax;
                    c13968p1 = c13968p3;
                    i13 = iM102757a;
                } else if (c36177h2.f154778p) {
                    j13 = jMax;
                    i13 = iM102757a;
                    c13968p1 = c13968p3;
                } else {
                    i13 = iM102757a;
                    c13968p1 = c13968p3;
                    long j18 = c36179j2.f148920h - c36179j2.f148919g;
                    j13 = jMax;
                    jMax2 = Math.max(0L, jMax2 - j18);
                    if (jMax3 != -9223372036854775807L) {
                        jMax3 = Math.max(0L, jMax3 - j18);
                    }
                }
                long j19 = j13;
                C36179j c36179j3 = c36179j2;
                int i19 = i13;
                c36177h2.f154779q.mo54497q(j7, jMax2, jMax3, list2, c36177h2.m115114a(c36179j2, j19));
                int iMo54503m = c36177h2.f154779q.mo54503m();
                boolean z25 = i19 != iMo54503m;
                Uri uri3 = uriArr[iMo54503m];
                if (c37395c.m119753d(uri3)) {
                    c13968p2 = c13968p1;
                    C37402j c37402jM119751a = c37395c.m119751a(true, uri3);
                    c37402jM119751a.getClass();
                    long j24 = c37402jM119751a.f160032h;
                    c36177h2.f154778p = c37402jM119751a.f160069c;
                    c36177h2.f154780r = c37402jM119751a.f160039o ? -9223372036854775807L : (c37402jM119751a.f160045u + j24) - c37395c.f160000N;
                    boolean z26 = z25;
                    long j25 = j24 - c37395c.f160000N;
                    Pair pairM115116c = c36177h2.m115116c(c36179j3, z26, c37402jM119751a, j25, j19);
                    long jLongValue = ((Long) pairM115116c.first).longValue();
                    int iIntValue2 = ((Integer) pairM115116c.second).intValue();
                    if (jLongValue >= c37402jM119751a.f160035k || c36179j3 == null || !z26) {
                        c36177h = c36177h2;
                        i14 = iMo54503m;
                        iIntValue = iIntValue2;
                        uri = uri3;
                    } else {
                        uri = uriArr[i19];
                        c37402jM119751a = c37395c.m119751a(true, uri);
                        c37402jM119751a.getClass();
                        j25 = c37402jM119751a.f160032h - c37395c.f160000N;
                        c36177h = c36177h2;
                        Pair pairM115116c2 = c36177h.m115116c(c36179j3, false, c37402jM119751a, j25, j19);
                        jLongValue = ((Long) pairM115116c2.first).longValue();
                        iIntValue = ((Integer) pairM115116c2.second).intValue();
                        i14 = i19;
                    }
                    long j26 = j25;
                    long j27 = jLongValue;
                    String str3 = c37402jM119751a.f160067a;
                    boolean z27 = c37402jM119751a.f160069c;
                    long j28 = c37402jM119751a.f160035k;
                    AbstractC41023g0 abstractC41023g0 = c37402jM119751a.f160042r;
                    if (j27 >= j28) {
                        AbstractC41023g0 abstractC41023g1 = c37402jM119751a.f160043s;
                        boolean z28 = z27;
                        int i24 = (int) (j27 - j28);
                        if (i24 == abstractC41023g0.size()) {
                            if (iIntValue == -1) {
                                iIntValue = 0;
                            }
                            if (iIntValue < abstractC41023g1.size()) {
                                c36176g = new C36176g((AbstractC37400h) abstractC41023g1.get(iIntValue), j27, iIntValue);
                            } else {
                                c36176g = null;
                            }
                        } else {
                            C37399g c37399g3 = (C37399g) abstractC41023g0.get(i24);
                            if (iIntValue == -1) {
                                c36176g = new C36176g(c37399g3, j27, -1);
                            } else if (iIntValue < c37399g3.f160011M.size()) {
                                c36176g = new C36176g((AbstractC37400h) c37399g3.f160011M.get(iIntValue), j27, iIntValue);
                            } else {
                                int i25 = i24 + 1;
                                if (i25 < abstractC41023g0.size()) {
                                    c36176g = new C36176g((AbstractC37400h) abstractC41023g0.get(i25), j27 + 1, -1);
                                } else if (abstractC41023g1.isEmpty()) {
                                    c36176g = null;
                                } else {
                                    c36176g = new C36176g((AbstractC37400h) abstractC41023g1.get(0), j27 + 1, 0);
                                }
                            }
                        }
                        if (c36176g != null) {
                            z4 = c36176g.f154762d;
                            abstractC37400h = c36176g.f154759a;
                            c36177h.f154781s = false;
                            c36177h.f154777o = null;
                            c37399g = abstractC37400h.f160020x;
                            j14 = abstractC37400h.f160012E;
                            if (c37399g != null || (str2 = c37399g.f160014G) == null) {
                                uriM71561C = null;
                            } else {
                                uriM71561C = AbstractC24543a.m71561C(str3, str2);
                            }
                            c36174eM115117d = c36177h.m115117d(uriM71561C, i14);
                            c13968p2.f49808y = c36174eM115117d;
                            if (c36174eM115117d == null) {
                                str = abstractC37400h.f160014G;
                                if (str == null) {
                                    uriM71561C2 = null;
                                } else {
                                    uriM71561C2 = AbstractC24543a.m71561C(str3, str);
                                }
                                c36174eM115117d2 = c36177h.m115117d(uriM71561C2, i14);
                                c13968p2.f49808y = c36174eM115117d2;
                                if (c36174eM115117d2 == null) {
                                    if (c36179j3 == null) {
                                        AtomicInteger atomicInteger = C36179j.f154783L;
                                    } else {
                                        if (uri.equals(c36179j3.f154797m) || !c36179j3.f154791H) {
                                            j15 = j26 + j14;
                                            if (abstractC37400h instanceof C37397e) {
                                                if (!((C37397e) abstractC37400h).f160005L || (c36176g.f154761c == 0 && z28)) {
                                                    z28 = true;
                                                } else {
                                                    z28 = false;
                                                }
                                            }
                                            if (z28) {
                                                j16 = j14;
                                                if (j15 >= c36179j3.f148920h) {
                                                }
                                                if (z13 || !z4) {
                                                    InterfaceC36178i interfaceC36178i = c36177h.f154763a;
                                                    c36170a = c36177h.f154764b;
                                                    C31521c0 c31521c0 = c36177h.f154768f[i14];
                                                    List list3 = c36177h.f154771i;
                                                    int iMo54496o = c36177h.f154779q.mo54496o();
                                                    Object objMo54494g = c36177h.f154779q.mo54494g();
                                                    boolean z29 = c36177h.f154774l;
                                                    C34249c c34249c3 = c36177h.f154766d;
                                                    if (uriM71561C2 == null) {
                                                        c34249c2.getClass();
                                                        c34249c = c34249c2;
                                                        bArr = null;
                                                    } else {
                                                        c34249c = c34249c2;
                                                        bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                                    }
                                                    if (uriM71561C == null) {
                                                        bArr2 = null;
                                                    } else {
                                                        bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                                    }
                                                    C32713f c32713f = c36177h.f154773k;
                                                    AtomicInteger atomicInteger2 = C36179j.f154783L;
                                                    map = Collections.EMPTY_MAP;
                                                    Uri uriM71561C3 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                                    long j29 = abstractC37400h.f160016I;
                                                    long j34 = abstractC37400h.f160017J;
                                                    if (z4) {
                                                        i15 = 8;
                                                    } else {
                                                        i15 = 0;
                                                    }
                                                    AbstractC24543a.m71575k(uriM71561C3, "The uri must be set.");
                                                    C22630n c22630n3 = new C22630n(uriM71561C3, 1, null, map, j29, j34, i15);
                                                    if (bArr != null) {
                                                        z14 = true;
                                                    } else {
                                                        z14 = false;
                                                    }
                                                    if (z14) {
                                                        String str4 = abstractC37400h.f160015H;
                                                        str4.getClass();
                                                        bArrM115118d = C36179j.m115118d(str4);
                                                    } else {
                                                        bArrM115118d = null;
                                                    }
                                                    if (bArr != null) {
                                                        bArrM115118d.getClass();
                                                        c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                                    } else {
                                                        c36170a2 = c36170a;
                                                    }
                                                    c37399g2 = abstractC37400h.f160020x;
                                                    if (c37399g2 != null) {
                                                        if (bArr2 != null) {
                                                            z18 = true;
                                                        } else {
                                                            z18 = false;
                                                        }
                                                        if (z18) {
                                                            String str5 = c37399g2.f160015H;
                                                            str5.getClass();
                                                            bArrM115118d2 = C36179j.m115118d(str5);
                                                        } else {
                                                            bArrM115118d2 = null;
                                                        }
                                                        boolean z34 = z18;
                                                        C22630n c22630n4 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                                        if (bArr2 != null) {
                                                            bArrM115118d2.getClass();
                                                            c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                                        }
                                                        z15 = z34;
                                                        interfaceC22628l = c36170a;
                                                        c22630n = c22630n4;
                                                    } else {
                                                        c22630n = null;
                                                        interfaceC22628l = null;
                                                        z15 = false;
                                                    }
                                                    long j35 = j26 + j16;
                                                    long j36 = j35 + abstractC37400h.f160021y;
                                                    i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                                    if (c36179j3 != null) {
                                                        c22630n2 = c36179j3.f154801q;
                                                        if (c22630n != c22630n2 || (c22630n != null && c22630n2 != null && c22630n.f89019a.equals(c22630n2.f89019a) && c22630n.f89023e == c22630n2.f89023e)) {
                                                            z16 = true;
                                                        } else {
                                                            z16 = false;
                                                        }
                                                        if (uri.equals(c36179j3.f154797m) || !c36179j3.f154791H) {
                                                            z17 = false;
                                                        } else {
                                                            z17 = true;
                                                        }
                                                        c26857h = c36179j3.f154809y;
                                                        c13117a = c36179j3.f154810z;
                                                        if (z16 || !z17 || c36179j3.f154793J || c36179j3.f154796l != i16) {
                                                            c36171b2 = null;
                                                        } else {
                                                            c36171b2 = c36179j3.f154786C;
                                                        }
                                                        c36171b = c36171b2;
                                                    } else {
                                                        c26857h = new C26857h(null);
                                                        c13117a = new C13117a(10);
                                                        c36171b = null;
                                                    }
                                                    C26857h c26857h2 = c26857h;
                                                    C13117a c13117a2 = c13117a;
                                                    long j37 = c36176g.f154760b;
                                                    int i26 = c36176g.f154761c;
                                                    boolean z35 = !z4;
                                                    boolean z36 = abstractC37400h.f160018K;
                                                    sparseArray = (SparseArray) c34249c3.f143660x;
                                                    c24566x = (C24566x) sparseArray.get(i16);
                                                    if (c24566x == null) {
                                                        c24566x = new C24566x(9223372036854775806L);
                                                        sparseArray.put(i16, c24566x);
                                                    }
                                                    c13968p2 = c13968p2;
                                                    c13968p2.f49808y = new C36179j(interfaceC36178i, c36170a2, c22630n3, c31521c0, z14, interfaceC22628l, c22630n, z15, uri, list3, iMo54496o, objMo54494g, j35, j36, j37, i26, z35, i16, z36, z29, c24566x, abstractC37400h.f160013F, c36171b, c26857h2, c13117a2, z13, c32713f);
                                                }
                                            } else {
                                                j16 = j14;
                                            }
                                            z13 = true;
                                            if (z13) {
                                            }
                                            InterfaceC36178i interfaceC36178i2 = c36177h.f154763a;
                                            c36170a = c36177h.f154764b;
                                            C31521c0 c31521c1 = c36177h.f154768f[i14];
                                            List list4 = c36177h.f154771i;
                                            int iMo54496o2 = c36177h.f154779q.mo54496o();
                                            Object objMo54494g2 = c36177h.f154779q.mo54494g();
                                            boolean z210 = c36177h.f154774l;
                                            C34249c c34249c4 = c36177h.f154766d;
                                            if (uriM71561C2 == null) {
                                                c34249c2.getClass();
                                                c34249c = c34249c2;
                                                bArr = null;
                                            } else {
                                                c34249c = c34249c2;
                                                bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                            }
                                            if (uriM71561C == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                            }
                                            C32713f c32713f2 = c36177h.f154773k;
                                            AtomicInteger atomicInteger3 = C36179j.f154783L;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriM71561C4 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                            long j210 = abstractC37400h.f160016I;
                                            long j38 = abstractC37400h.f160017J;
                                            if (z4) {
                                                i15 = 8;
                                            } else {
                                                i15 = 0;
                                            }
                                            AbstractC24543a.m71575k(uriM71561C4, "The uri must be set.");
                                            C22630n c22630n5 = new C22630n(uriM71561C4, 1, null, map, j210, j38, i15);
                                            if (bArr != null) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                String str6 = abstractC37400h.f160015H;
                                                str6.getClass();
                                                bArrM115118d = C36179j.m115118d(str6);
                                            } else {
                                                bArrM115118d = null;
                                            }
                                            if (bArr != null) {
                                                bArrM115118d.getClass();
                                                c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                            } else {
                                                c36170a2 = c36170a;
                                            }
                                            c37399g2 = abstractC37400h.f160020x;
                                            if (c37399g2 != null) {
                                                if (bArr2 != null) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    String str7 = c37399g2.f160015H;
                                                    str7.getClass();
                                                    bArrM115118d2 = C36179j.m115118d(str7);
                                                } else {
                                                    bArrM115118d2 = null;
                                                }
                                                boolean z37 = z18;
                                                C22630n c22630n6 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                                if (bArr2 != null) {
                                                    bArrM115118d2.getClass();
                                                    c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                                }
                                                z15 = z37;
                                                interfaceC22628l = c36170a;
                                                c22630n = c22630n6;
                                            } else {
                                                c22630n = null;
                                                interfaceC22628l = null;
                                                z15 = false;
                                            }
                                            long j39 = j26 + j16;
                                            long j310 = j39 + abstractC37400h.f160021y;
                                            i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                            if (c36179j3 != null) {
                                                c22630n2 = c36179j3.f154801q;
                                                if (c22630n != c22630n2) {
                                                    z16 = true;
                                                } else {
                                                    z16 = true;
                                                }
                                                if (uri.equals(c36179j3.f154797m)) {
                                                    z17 = false;
                                                } else {
                                                    z17 = false;
                                                }
                                                c26857h = c36179j3.f154809y;
                                                c13117a = c36179j3.f154810z;
                                                if (z16) {
                                                    c36171b2 = null;
                                                } else {
                                                    c36171b2 = null;
                                                }
                                                c36171b = c36171b2;
                                            } else {
                                                c26857h = new C26857h(null);
                                                c13117a = new C13117a(10);
                                                c36171b = null;
                                            }
                                            C26857h c26857h3 = c26857h;
                                            C13117a c13117a3 = c13117a;
                                            long j311 = c36176g.f154760b;
                                            int i27 = c36176g.f154761c;
                                            boolean z38 = !z4;
                                            boolean z39 = abstractC37400h.f160018K;
                                            sparseArray = (SparseArray) c34249c4.f143660x;
                                            c24566x = (C24566x) sparseArray.get(i16);
                                            if (c24566x == null) {
                                                c24566x = new C24566x(9223372036854775806L);
                                                sparseArray.put(i16, c24566x);
                                            }
                                            c13968p2 = c13968p2;
                                            c13968p2.f49808y = new C36179j(interfaceC36178i2, c36170a2, c22630n5, c31521c1, z14, interfaceC22628l, c22630n, z15, uri, list4, iMo54496o2, objMo54494g2, j39, j310, j311, i27, z38, i16, z39, z210, c24566x, abstractC37400h.f160013F, c36171b, c26857h3, c13117a3, z13, c32713f2);
                                        }
                                        z13 = false;
                                        if (z13) {
                                        }
                                        InterfaceC36178i interfaceC36178i3 = c36177h.f154763a;
                                        c36170a = c36177h.f154764b;
                                        C31521c0 c31521c2 = c36177h.f154768f[i14];
                                        List list5 = c36177h.f154771i;
                                        int iMo54496o3 = c36177h.f154779q.mo54496o();
                                        Object objMo54494g3 = c36177h.f154779q.mo54494g();
                                        boolean z211 = c36177h.f154774l;
                                        C34249c c34249c5 = c36177h.f154766d;
                                        if (uriM71561C2 == null) {
                                            c34249c2.getClass();
                                            c34249c = c34249c2;
                                            bArr = null;
                                        } else {
                                            c34249c = c34249c2;
                                            bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                        }
                                        if (uriM71561C == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                        }
                                        C32713f c32713f3 = c36177h.f154773k;
                                        AtomicInteger atomicInteger4 = C36179j.f154783L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM71561C5 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                        long j211 = abstractC37400h.f160016I;
                                        long j312 = abstractC37400h.f160017J;
                                        if (z4) {
                                            i15 = 8;
                                        } else {
                                            i15 = 0;
                                        }
                                        AbstractC24543a.m71575k(uriM71561C5, "The uri must be set.");
                                        C22630n c22630n7 = new C22630n(uriM71561C5, 1, null, map, j211, j312, i15);
                                        if (bArr != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            String str8 = abstractC37400h.f160015H;
                                            str8.getClass();
                                            bArrM115118d = C36179j.m115118d(str8);
                                        } else {
                                            bArrM115118d = null;
                                        }
                                        if (bArr != null) {
                                            bArrM115118d.getClass();
                                            c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                        } else {
                                            c36170a2 = c36170a;
                                        }
                                        c37399g2 = abstractC37400h.f160020x;
                                        if (c37399g2 != null) {
                                            if (bArr2 != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                String str9 = c37399g2.f160015H;
                                                str9.getClass();
                                                bArrM115118d2 = C36179j.m115118d(str9);
                                            } else {
                                                bArrM115118d2 = null;
                                            }
                                            boolean z310 = z18;
                                            C22630n c22630n8 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                            if (bArr2 != null) {
                                                bArrM115118d2.getClass();
                                                c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                            }
                                            z15 = z310;
                                            interfaceC22628l = c36170a;
                                            c22630n = c22630n8;
                                        } else {
                                            c22630n = null;
                                            interfaceC22628l = null;
                                            z15 = false;
                                        }
                                        long j313 = j26 + j16;
                                        long j314 = j313 + abstractC37400h.f160021y;
                                        i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                        if (c36179j3 != null) {
                                            c22630n2 = c36179j3.f154801q;
                                            if (c22630n != c22630n2) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            if (uri.equals(c36179j3.f154797m)) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                            }
                                            c26857h = c36179j3.f154809y;
                                            c13117a = c36179j3.f154810z;
                                            if (z16) {
                                                c36171b2 = null;
                                            } else {
                                                c36171b2 = null;
                                            }
                                            c36171b = c36171b2;
                                        } else {
                                            c26857h = new C26857h(null);
                                            c13117a = new C13117a(10);
                                            c36171b = null;
                                        }
                                        C26857h c26857h4 = c26857h;
                                        C13117a c13117a4 = c13117a;
                                        long j315 = c36176g.f154760b;
                                        int i28 = c36176g.f154761c;
                                        boolean z311 = !z4;
                                        boolean z312 = abstractC37400h.f160018K;
                                        sparseArray = (SparseArray) c34249c5.f143660x;
                                        c24566x = (C24566x) sparseArray.get(i16);
                                        if (c24566x == null) {
                                            c24566x = new C24566x(9223372036854775806L);
                                            sparseArray.put(i16, c24566x);
                                        }
                                        c13968p2 = c13968p2;
                                        c13968p2.f49808y = new C36179j(interfaceC36178i3, c36170a2, c22630n7, c31521c2, z14, interfaceC22628l, c22630n, z15, uri, list5, iMo54496o3, objMo54494g3, j313, j314, j315, i28, z311, i16, z312, z211, c24566x, abstractC37400h.f160013F, c36171b, c26857h4, c13117a4, z13, c32713f3);
                                    }
                                    j16 = j14;
                                    z13 = false;
                                    if (z13) {
                                    }
                                    InterfaceC36178i interfaceC36178i4 = c36177h.f154763a;
                                    c36170a = c36177h.f154764b;
                                    C31521c0 c31521c3 = c36177h.f154768f[i14];
                                    List list6 = c36177h.f154771i;
                                    int iMo54496o4 = c36177h.f154779q.mo54496o();
                                    Object objMo54494g4 = c36177h.f154779q.mo54494g();
                                    boolean z212 = c36177h.f154774l;
                                    C34249c c34249c6 = c36177h.f154766d;
                                    if (uriM71561C2 == null) {
                                        c34249c2.getClass();
                                        c34249c = c34249c2;
                                        bArr = null;
                                    } else {
                                        c34249c = c34249c2;
                                        bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                    }
                                    if (uriM71561C == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                    }
                                    C32713f c32713f4 = c36177h.f154773k;
                                    AtomicInteger atomicInteger5 = C36179j.f154783L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM71561C6 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                    long j212 = abstractC37400h.f160016I;
                                    long j316 = abstractC37400h.f160017J;
                                    if (z4) {
                                        i15 = 8;
                                    } else {
                                        i15 = 0;
                                    }
                                    AbstractC24543a.m71575k(uriM71561C6, "The uri must be set.");
                                    C22630n c22630n9 = new C22630n(uriM71561C6, 1, null, map, j212, j316, i15);
                                    if (bArr != null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        String str10 = abstractC37400h.f160015H;
                                        str10.getClass();
                                        bArrM115118d = C36179j.m115118d(str10);
                                    } else {
                                        bArrM115118d = null;
                                    }
                                    if (bArr != null) {
                                        bArrM115118d.getClass();
                                        c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                    } else {
                                        c36170a2 = c36170a;
                                    }
                                    c37399g2 = abstractC37400h.f160020x;
                                    if (c37399g2 != null) {
                                        if (bArr2 != null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (z18) {
                                            String str11 = c37399g2.f160015H;
                                            str11.getClass();
                                            bArrM115118d2 = C36179j.m115118d(str11);
                                        } else {
                                            bArrM115118d2 = null;
                                        }
                                        boolean z313 = z18;
                                        C22630n c22630n10 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                        if (bArr2 != null) {
                                            bArrM115118d2.getClass();
                                            c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                        }
                                        z15 = z313;
                                        interfaceC22628l = c36170a;
                                        c22630n = c22630n10;
                                    } else {
                                        c22630n = null;
                                        interfaceC22628l = null;
                                        z15 = false;
                                    }
                                    long j317 = j26 + j16;
                                    long j318 = j317 + abstractC37400h.f160021y;
                                    i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                    if (c36179j3 != null) {
                                        c22630n2 = c36179j3.f154801q;
                                        if (c22630n != c22630n2) {
                                            z16 = true;
                                        } else {
                                            z16 = true;
                                        }
                                        if (uri.equals(c36179j3.f154797m)) {
                                            z17 = false;
                                        } else {
                                            z17 = false;
                                        }
                                        c26857h = c36179j3.f154809y;
                                        c13117a = c36179j3.f154810z;
                                        if (z16) {
                                            c36171b2 = null;
                                        } else {
                                            c36171b2 = null;
                                        }
                                        c36171b = c36171b2;
                                    } else {
                                        c26857h = new C26857h(null);
                                        c13117a = new C13117a(10);
                                        c36171b = null;
                                    }
                                    C26857h c26857h5 = c26857h;
                                    C13117a c13117a5 = c13117a;
                                    long j319 = c36176g.f154760b;
                                    int i29 = c36176g.f154761c;
                                    boolean z314 = !z4;
                                    boolean z315 = abstractC37400h.f160018K;
                                    sparseArray = (SparseArray) c34249c6.f143660x;
                                    c24566x = (C24566x) sparseArray.get(i16);
                                    if (c24566x == null) {
                                        c24566x = new C24566x(9223372036854775806L);
                                        sparseArray.put(i16, c24566x);
                                    }
                                    c13968p2 = c13968p2;
                                    c13968p2.f49808y = new C36179j(interfaceC36178i4, c36170a2, c22630n9, c31521c3, z14, interfaceC22628l, c22630n, z15, uri, list6, iMo54496o4, objMo54494g4, j317, j318, j319, i29, z314, i16, z315, z212, c24566x, abstractC37400h.f160013F, c36171b, c26857h5, c13117a5, z13, c32713f4);
                                }
                            }
                        } else if (!c37402jM119751a.f160039o) {
                            c13968p2.f49809z = uri;
                            c36177h.f154781s &= uri.equals(c36177h.f154777o);
                            c36177h.f154777o = uri;
                        } else if (z24 || abstractC41023g0.isEmpty()) {
                            c13968p2.f49807x = true;
                        } else {
                            c36176g = new C36176g((AbstractC37400h) AbstractC41047q.m133279i(abstractC41023g0), (j28 + ((long) abstractC41023g0.size())) - 1, -1);
                            z4 = c36176g.f154762d;
                            abstractC37400h = c36176g.f154759a;
                            c36177h.f154781s = false;
                            c36177h.f154777o = null;
                            c37399g = abstractC37400h.f160020x;
                            j14 = abstractC37400h.f160012E;
                            if (c37399g != null) {
                                uriM71561C = null;
                            } else {
                                uriM71561C = null;
                            }
                            c36174eM115117d = c36177h.m115117d(uriM71561C, i14);
                            c13968p2.f49808y = c36174eM115117d;
                            if (c36174eM115117d == null) {
                                str = abstractC37400h.f160014G;
                                if (str == null) {
                                    uriM71561C2 = null;
                                } else {
                                    uriM71561C2 = AbstractC24543a.m71561C(str3, str);
                                }
                                c36174eM115117d2 = c36177h.m115117d(uriM71561C2, i14);
                                c13968p2.f49808y = c36174eM115117d2;
                                if (c36174eM115117d2 == null) {
                                    if (c36179j3 == null) {
                                        AtomicInteger atomicInteger6 = C36179j.f154783L;
                                    } else {
                                        if (uri.equals(c36179j3.f154797m)) {
                                        }
                                        j15 = j26 + j14;
                                        if (abstractC37400h instanceof C37397e) {
                                            if (((C37397e) abstractC37400h).f160005L) {
                                                z28 = true;
                                            } else {
                                                z28 = true;
                                            }
                                        }
                                        if (z28) {
                                            j16 = j14;
                                            if (j15 >= c36179j3.f148920h) {
                                                z13 = false;
                                            }
                                            if (z13) {
                                            }
                                            InterfaceC36178i interfaceC36178i5 = c36177h.f154763a;
                                            c36170a = c36177h.f154764b;
                                            C31521c0 c31521c4 = c36177h.f154768f[i14];
                                            List list7 = c36177h.f154771i;
                                            int iMo54496o5 = c36177h.f154779q.mo54496o();
                                            Object objMo54494g5 = c36177h.f154779q.mo54494g();
                                            boolean z213 = c36177h.f154774l;
                                            C34249c c34249c7 = c36177h.f154766d;
                                            if (uriM71561C2 == null) {
                                                c34249c2.getClass();
                                                c34249c = c34249c2;
                                                bArr = null;
                                            } else {
                                                c34249c = c34249c2;
                                                bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                            }
                                            if (uriM71561C == null) {
                                                bArr2 = null;
                                            } else {
                                                bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                            }
                                            C32713f c32713f5 = c36177h.f154773k;
                                            AtomicInteger atomicInteger7 = C36179j.f154783L;
                                            map = Collections.EMPTY_MAP;
                                            Uri uriM71561C7 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                            long j213 = abstractC37400h.f160016I;
                                            long j3110 = abstractC37400h.f160017J;
                                            if (z4) {
                                                i15 = 8;
                                            } else {
                                                i15 = 0;
                                            }
                                            AbstractC24543a.m71575k(uriM71561C7, "The uri must be set.");
                                            C22630n c22630n11 = new C22630n(uriM71561C7, 1, null, map, j213, j3110, i15);
                                            if (bArr != null) {
                                                z14 = true;
                                            } else {
                                                z14 = false;
                                            }
                                            if (z14) {
                                                String str12 = abstractC37400h.f160015H;
                                                str12.getClass();
                                                bArrM115118d = C36179j.m115118d(str12);
                                            } else {
                                                bArrM115118d = null;
                                            }
                                            if (bArr != null) {
                                                bArrM115118d.getClass();
                                                c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                            } else {
                                                c36170a2 = c36170a;
                                            }
                                            c37399g2 = abstractC37400h.f160020x;
                                            if (c37399g2 != null) {
                                                if (bArr2 != null) {
                                                    z18 = true;
                                                } else {
                                                    z18 = false;
                                                }
                                                if (z18) {
                                                    String str13 = c37399g2.f160015H;
                                                    str13.getClass();
                                                    bArrM115118d2 = C36179j.m115118d(str13);
                                                } else {
                                                    bArrM115118d2 = null;
                                                }
                                                boolean z316 = z18;
                                                C22630n c22630n12 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                                if (bArr2 != null) {
                                                    bArrM115118d2.getClass();
                                                    c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                                }
                                                z15 = z316;
                                                interfaceC22628l = c36170a;
                                                c22630n = c22630n12;
                                            } else {
                                                c22630n = null;
                                                interfaceC22628l = null;
                                                z15 = false;
                                            }
                                            long j3111 = j26 + j16;
                                            long j3112 = j3111 + abstractC37400h.f160021y;
                                            i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                            if (c36179j3 != null) {
                                                c22630n2 = c36179j3.f154801q;
                                                if (c22630n != c22630n2) {
                                                    z16 = true;
                                                } else {
                                                    z16 = true;
                                                }
                                                if (uri.equals(c36179j3.f154797m)) {
                                                    z17 = false;
                                                } else {
                                                    z17 = false;
                                                }
                                                c26857h = c36179j3.f154809y;
                                                c13117a = c36179j3.f154810z;
                                                if (z16) {
                                                    c36171b2 = null;
                                                } else {
                                                    c36171b2 = null;
                                                }
                                                c36171b = c36171b2;
                                            } else {
                                                c26857h = new C26857h(null);
                                                c13117a = new C13117a(10);
                                                c36171b = null;
                                            }
                                            C26857h c26857h6 = c26857h;
                                            C13117a c13117a6 = c13117a;
                                            long j3113 = c36176g.f154760b;
                                            int i210 = c36176g.f154761c;
                                            boolean z317 = !z4;
                                            boolean z318 = abstractC37400h.f160018K;
                                            sparseArray = (SparseArray) c34249c7.f143660x;
                                            c24566x = (C24566x) sparseArray.get(i16);
                                            if (c24566x == null) {
                                                c24566x = new C24566x(9223372036854775806L);
                                                sparseArray.put(i16, c24566x);
                                            }
                                            c13968p2 = c13968p2;
                                            c13968p2.f49808y = new C36179j(interfaceC36178i5, c36170a2, c22630n11, c31521c4, z14, interfaceC22628l, c22630n, z15, uri, list7, iMo54496o5, objMo54494g5, j3111, j3112, j3113, i210, z317, i16, z318, z213, c24566x, abstractC37400h.f160013F, c36171b, c26857h6, c13117a6, z13, c32713f5);
                                        } else {
                                            j16 = j14;
                                        }
                                        z13 = true;
                                        if (z13) {
                                        }
                                        InterfaceC36178i interfaceC36178i6 = c36177h.f154763a;
                                        c36170a = c36177h.f154764b;
                                        C31521c0 c31521c5 = c36177h.f154768f[i14];
                                        List list8 = c36177h.f154771i;
                                        int iMo54496o6 = c36177h.f154779q.mo54496o();
                                        Object objMo54494g6 = c36177h.f154779q.mo54494g();
                                        boolean z214 = c36177h.f154774l;
                                        C34249c c34249c8 = c36177h.f154766d;
                                        if (uriM71561C2 == null) {
                                            c34249c2.getClass();
                                            c34249c = c34249c2;
                                            bArr = null;
                                        } else {
                                            c34249c = c34249c2;
                                            bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                        }
                                        if (uriM71561C == null) {
                                            bArr2 = null;
                                        } else {
                                            bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                        }
                                        C32713f c32713f6 = c36177h.f154773k;
                                        AtomicInteger atomicInteger8 = C36179j.f154783L;
                                        map = Collections.EMPTY_MAP;
                                        Uri uriM71561C8 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                        long j214 = abstractC37400h.f160016I;
                                        long j3114 = abstractC37400h.f160017J;
                                        if (z4) {
                                            i15 = 8;
                                        } else {
                                            i15 = 0;
                                        }
                                        AbstractC24543a.m71575k(uriM71561C8, "The uri must be set.");
                                        C22630n c22630n13 = new C22630n(uriM71561C8, 1, null, map, j214, j3114, i15);
                                        if (bArr != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (z14) {
                                            String str14 = abstractC37400h.f160015H;
                                            str14.getClass();
                                            bArrM115118d = C36179j.m115118d(str14);
                                        } else {
                                            bArrM115118d = null;
                                        }
                                        if (bArr != null) {
                                            bArrM115118d.getClass();
                                            c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                        } else {
                                            c36170a2 = c36170a;
                                        }
                                        c37399g2 = abstractC37400h.f160020x;
                                        if (c37399g2 != null) {
                                            if (bArr2 != null) {
                                                z18 = true;
                                            } else {
                                                z18 = false;
                                            }
                                            if (z18) {
                                                String str15 = c37399g2.f160015H;
                                                str15.getClass();
                                                bArrM115118d2 = C36179j.m115118d(str15);
                                            } else {
                                                bArrM115118d2 = null;
                                            }
                                            boolean z319 = z18;
                                            C22630n c22630n14 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                            if (bArr2 != null) {
                                                bArrM115118d2.getClass();
                                                c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                            }
                                            z15 = z319;
                                            interfaceC22628l = c36170a;
                                            c22630n = c22630n14;
                                        } else {
                                            c22630n = null;
                                            interfaceC22628l = null;
                                            z15 = false;
                                        }
                                        long j3115 = j26 + j16;
                                        long j3116 = j3115 + abstractC37400h.f160021y;
                                        i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                        if (c36179j3 != null) {
                                            c22630n2 = c36179j3.f154801q;
                                            if (c22630n != c22630n2) {
                                                z16 = true;
                                            } else {
                                                z16 = true;
                                            }
                                            if (uri.equals(c36179j3.f154797m)) {
                                                z17 = false;
                                            } else {
                                                z17 = false;
                                            }
                                            c26857h = c36179j3.f154809y;
                                            c13117a = c36179j3.f154810z;
                                            if (z16) {
                                                c36171b2 = null;
                                            } else {
                                                c36171b2 = null;
                                            }
                                            c36171b = c36171b2;
                                        } else {
                                            c26857h = new C26857h(null);
                                            c13117a = new C13117a(10);
                                            c36171b = null;
                                        }
                                        C26857h c26857h7 = c26857h;
                                        C13117a c13117a7 = c13117a;
                                        long j3117 = c36176g.f154760b;
                                        int i211 = c36176g.f154761c;
                                        boolean z3110 = !z4;
                                        boolean z3111 = abstractC37400h.f160018K;
                                        sparseArray = (SparseArray) c34249c8.f143660x;
                                        c24566x = (C24566x) sparseArray.get(i16);
                                        if (c24566x == null) {
                                            c24566x = new C24566x(9223372036854775806L);
                                            sparseArray.put(i16, c24566x);
                                        }
                                        c13968p2 = c13968p2;
                                        c13968p2.f49808y = new C36179j(interfaceC36178i6, c36170a2, c22630n13, c31521c5, z14, interfaceC22628l, c22630n, z15, uri, list8, iMo54496o6, objMo54494g6, j3115, j3116, j3117, i211, z3110, i16, z3111, z214, c24566x, abstractC37400h.f160013F, c36171b, c26857h7, c13117a7, z13, c32713f6);
                                    }
                                    j16 = j14;
                                    z13 = false;
                                    if (z13) {
                                    }
                                    InterfaceC36178i interfaceC36178i7 = c36177h.f154763a;
                                    c36170a = c36177h.f154764b;
                                    C31521c0 c31521c6 = c36177h.f154768f[i14];
                                    List list9 = c36177h.f154771i;
                                    int iMo54496o7 = c36177h.f154779q.mo54496o();
                                    Object objMo54494g7 = c36177h.f154779q.mo54494g();
                                    boolean z215 = c36177h.f154774l;
                                    C34249c c34249c9 = c36177h.f154766d;
                                    if (uriM71561C2 == null) {
                                        c34249c2.getClass();
                                        c34249c = c34249c2;
                                        bArr = null;
                                    } else {
                                        c34249c = c34249c2;
                                        bArr = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C2);
                                    }
                                    if (uriM71561C == null) {
                                        bArr2 = null;
                                    } else {
                                        bArr2 = (byte[]) ((C36173d) c34249c.f143660x).get(uriM71561C);
                                    }
                                    C32713f c32713f7 = c36177h.f154773k;
                                    AtomicInteger atomicInteger9 = C36179j.f154783L;
                                    map = Collections.EMPTY_MAP;
                                    Uri uriM71561C9 = AbstractC24543a.m71561C(str3, abstractC37400h.f160019w);
                                    long j215 = abstractC37400h.f160016I;
                                    long j3118 = abstractC37400h.f160017J;
                                    if (z4) {
                                        i15 = 8;
                                    } else {
                                        i15 = 0;
                                    }
                                    AbstractC24543a.m71575k(uriM71561C9, "The uri must be set.");
                                    C22630n c22630n15 = new C22630n(uriM71561C9, 1, null, map, j215, j3118, i15);
                                    if (bArr != null) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (z14) {
                                        String str16 = abstractC37400h.f160015H;
                                        str16.getClass();
                                        bArrM115118d = C36179j.m115118d(str16);
                                    } else {
                                        bArrM115118d = null;
                                    }
                                    if (bArr != null) {
                                        bArrM115118d.getClass();
                                        c36170a2 = new C36170a(c36170a, bArr, bArrM115118d);
                                    } else {
                                        c36170a2 = c36170a;
                                    }
                                    c37399g2 = abstractC37400h.f160020x;
                                    if (c37399g2 != null) {
                                        if (bArr2 != null) {
                                            z18 = true;
                                        } else {
                                            z18 = false;
                                        }
                                        if (z18) {
                                            String str17 = c37399g2.f160015H;
                                            str17.getClass();
                                            bArrM115118d2 = C36179j.m115118d(str17);
                                        } else {
                                            bArrM115118d2 = null;
                                        }
                                        boolean z3112 = z18;
                                        C22630n c22630n16 = new C22630n(AbstractC24543a.m71561C(str3, c37399g2.f160019w), 1, null, map, c37399g2.f160016I, c37399g2.f160017J, 0);
                                        if (bArr2 != null) {
                                            bArrM115118d2.getClass();
                                            c36170a = new C36170a(c36170a, bArr2, bArrM115118d2);
                                        }
                                        z15 = z3112;
                                        interfaceC22628l = c36170a;
                                        c22630n = c22630n16;
                                    } else {
                                        c22630n = null;
                                        interfaceC22628l = null;
                                        z15 = false;
                                    }
                                    long j3119 = j26 + j16;
                                    long j31110 = j3119 + abstractC37400h.f160021y;
                                    i16 = c37402jM119751a.f160034j + abstractC37400h.f160022z;
                                    if (c36179j3 != null) {
                                        c22630n2 = c36179j3.f154801q;
                                        if (c22630n != c22630n2) {
                                            z16 = true;
                                        } else {
                                            z16 = true;
                                        }
                                        if (uri.equals(c36179j3.f154797m)) {
                                            z17 = false;
                                        } else {
                                            z17 = false;
                                        }
                                        c26857h = c36179j3.f154809y;
                                        c13117a = c36179j3.f154810z;
                                        if (z16) {
                                            c36171b2 = null;
                                        } else {
                                            c36171b2 = null;
                                        }
                                        c36171b = c36171b2;
                                    } else {
                                        c26857h = new C26857h(null);
                                        c13117a = new C13117a(10);
                                        c36171b = null;
                                    }
                                    C26857h c26857h8 = c26857h;
                                    C13117a c13117a8 = c13117a;
                                    long j31111 = c36176g.f154760b;
                                    int i212 = c36176g.f154761c;
                                    boolean z3113 = !z4;
                                    boolean z3114 = abstractC37400h.f160018K;
                                    sparseArray = (SparseArray) c34249c9.f143660x;
                                    c24566x = (C24566x) sparseArray.get(i16);
                                    if (c24566x == null) {
                                        c24566x = new C24566x(9223372036854775806L);
                                        sparseArray.put(i16, c24566x);
                                    }
                                    c13968p2 = c13968p2;
                                    c13968p2.f49808y = new C36179j(interfaceC36178i7, c36170a2, c22630n15, c31521c6, z14, interfaceC22628l, c22630n, z15, uri, list9, iMo54496o7, objMo54494g7, j3119, j31110, j31111, i212, z3113, i16, z3114, z215, c24566x, abstractC37400h.f160013F, c36171b, c26857h8, c13117a8, z13, c32713f7);
                                }
                            }
                        }
                        z19 = c13968p2.f49807x;
                        abstractC35090a = (AbstractC35090a) c13968p2.f49808y;
                        uri2 = (Uri) c13968p2.f49809z;
                        if (z19) {
                            this.f154899q0 = -9223372036854775807L;
                            this.f154902t0 = true;
                            return true;
                        }
                        if (abstractC35090a == null) {
                            if (uri2 != null) {
                                return false;
                            }
                            C37394b c37394b = (C37394b) this.f154909y.f154830x.f160004z.get(uri2);
                            c37394b.m119749d(c37394b.f159986w);
                            return false;
                        }
                        if (abstractC35090a instanceof C36179j) {
                            c36179j = (C36179j) abstractC35090a;
                            this.f154908x0 = c36179j;
                            this.f154888f0 = c36179j.f148916d;
                            this.f154899q0 = -9223372036854775807L;
                            this.f154870N.add(c36179j);
                            c41014d0M133251l = AbstractC41023g0.m133251l();
                            for (C36185p c36185p2 : this.f154878V) {
                                c41014d0M133251l.m133222a(Integer.valueOf(c36185p2.f136228q + c36185p2.f136227p));
                            }
                            C41060w0 c41060w0M133239f = c41014d0M133251l.m133239f();
                            c36179j.f154787D = this;
                            c36179j.f154792I = c41060w0M133239f;
                            for (C36185p c36185p3 : this.f154878V) {
                                c36185p3.getClass();
                                c36185p3.f136207C = c36179j.f154795k;
                                if (c36179j.f154798n) {
                                    c36185p3.f136211G = true;
                                }
                            }
                        }
                        this.f154877U = abstractC35090a;
                        c22611c0.m65556d(abstractC35090a, this, this.f154865I.m43809h(abstractC35090a.f148915c));
                        this.f154867K.m102767i(new C32745m(abstractC35090a.f148914b), abstractC35090a.f148915c, this.f154907x, abstractC35090a.f148916d, abstractC35090a.f148917e, abstractC35090a.f148918f, abstractC35090a.f148919g, abstractC35090a.f148920h);
                        return true;
                    }
                    c36177h.f154776n = new BehindLiveWindowException();
                } else {
                    c13968p2 = c13968p1;
                    c13968p2.f49809z = uri3;
                    c36177h2.f154781s &= uri3.equals(c36177h2.f154777o);
                    c36177h2.f154777o = uri3;
                }
                z19 = c13968p2.f49807x;
                abstractC35090a = (AbstractC35090a) c13968p2.f49808y;
                uri2 = (Uri) c13968p2.f49809z;
                if (z19) {
                    this.f154899q0 = -9223372036854775807L;
                    this.f154902t0 = true;
                    return true;
                }
                if (abstractC35090a == null) {
                    if (uri2 != null) {
                        return false;
                    }
                    C37394b c37394b2 = (C37394b) this.f154909y.f154830x.f160004z.get(uri2);
                    c37394b2.m119749d(c37394b2.f159986w);
                    return false;
                }
                if (abstractC35090a instanceof C36179j) {
                    c36179j = (C36179j) abstractC35090a;
                    this.f154908x0 = c36179j;
                    this.f154888f0 = c36179j.f148916d;
                    this.f154899q0 = -9223372036854775807L;
                    this.f154870N.add(c36179j);
                    c41014d0M133251l = AbstractC41023g0.m133251l();
                    while (i17 < r5) {
                        c41014d0M133251l.m133222a(Integer.valueOf(c36185p2.f136228q + c36185p2.f136227p));
                    }
                    C41060w0 c41060w0M133239f2 = c41014d0M133251l.m133239f();
                    c36179j.f154787D = this;
                    c36179j.f154792I = c41060w0M133239f2;
                    while (i18 < r4) {
                        c36185p3.getClass();
                        c36185p3.f136207C = c36179j.f154795k;
                        if (c36179j.f154798n) {
                            c36185p3.f136211G = true;
                        }
                    }
                }
                this.f154877U = abstractC35090a;
                c22611c0.m65556d(abstractC35090a, this, this.f154865I.m43809h(abstractC35090a.f148915c));
                this.f154867K.m102767i(new C32745m(abstractC35090a.f148914b), abstractC35090a.f148915c, this.f154907x, abstractC35090a.f148916d, abstractC35090a.f148917e, abstractC35090a.f148918f, abstractC35090a.f148919g, abstractC35090a.f148920h);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final C32768x0 m115142w(C32766w0[] c32766w0Arr) {
        for (int i13 = 0; i13 < c32766w0Arr.length; i13++) {
            C32766w0 c32766w0 = c32766w0Arr[i13];
            C31521c0[] c31521c0Arr = new C31521c0[c32766w0.f136260w];
            for (int i14 = 0; i14 < c32766w0.f136260w; i14++) {
                C31521c0 c31521c0 = c32766w0.f136262y[i14];
                int iMo114965b = this.f154863G.mo114965b(c31521c0);
                C31518b0 c31518b0M97113a = c31521c0.m97113a();
                c31518b0M97113a.f130036D = iMo114965b;
                c31521c0Arr[i14] = new C31521c0(c31518b0M97113a);
            }
            c32766w0Arr[i13] = new C32766w0(c32766w0.f136261x, c31521c0Arr);
        }
        return new C32768x0(c32766w0Arr);
    }

    @Override // p588wm.InterfaceC37369k
    /* JADX INFO: renamed from: x */
    public final void mo3111x(InterfaceC37374p interfaceC37374p) {
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX INFO: renamed from: z */
    public final void m115143z(int i13) {
        ArrayList arrayList;
        long j7;
        AbstractC24543a.m71573i(!this.f154866J.m65554b());
        int i14 = i13;
        loop0: while (true) {
            arrayList = this.f154870N;
            if (i14 >= arrayList.size()) {
                i14 = -1;
                break;
            }
            int i15 = i14;
            while (true) {
                if (i15 >= arrayList.size()) {
                    C36179j c36179j = (C36179j) arrayList.get(i14);
                    int i16 = 0;
                    while (true) {
                        if (i16 >= this.f154878V.length) {
                            break loop0;
                        }
                        if (this.f154878V[i16].m102741l() > c36179j.m115120e(i16)) {
                            break;
                        } else {
                            i16++;
                        }
                    }
                } else if (((C36179j) arrayList.get(i15)).f154798n) {
                    break;
                } else {
                    i15++;
                }
            }
            i14++;
        }
        if (i14 == -1) {
            return;
        }
        long j13 = m115134A().f148920h;
        C36179j c36179j2 = (C36179j) arrayList.get(i14);
        int size = arrayList.size();
        int i17 = AbstractC24567y.f95875a;
        if (i14 < 0 || size > arrayList.size() || i14 > size) {
            throw new IllegalArgumentException();
        }
        if (i14 != size) {
            arrayList.subList(i14, size).clear();
        }
        int i18 = 0;
        while (i18 < this.f154878V.length) {
            int iM115120e = c36179j2.m115120e(i18);
            C36185p c36185p = this.f154878V[i18];
            C23534w0 c23534w0 = c36185p.f136212a;
            long jM102737h = c36185p.m102737h(iM115120e);
            int i19 = c23534w0.f93189b;
            AbstractC24543a.m71569e(jM102737h <= c23534w0.f93190c);
            c23534w0.f93190c = jM102737h;
            if (jM102737h != 0) {
                C0902h c0902h = (C0902h) c23534w0.f93193f;
                if (jM102737h == c0902h.f3295x) {
                    j7 = j13;
                    c23534w0.m68117b((C0902h) c23534w0.f93193f);
                    C0902h c0902h2 = new C0902h(i19, c23534w0.f93190c, 9);
                    c23534w0.f93193f = c0902h2;
                    c23534w0.f93194g = c0902h2;
                    c23534w0.f93195h = c0902h2;
                } else {
                    while (c23534w0.f93190c > c0902h.f3296y) {
                        c0902h = (C0902h) c0902h.f3293E;
                    }
                    C0902h c0902h3 = (C0902h) c0902h.f3293E;
                    c0902h3.getClass();
                    c23534w0.m68117b(c0902h3);
                    C0902h c0902h4 = new C0902h(i19, c0902h.f3296y, 9);
                    c0902h.f3293E = c0902h4;
                    j7 = j13;
                    if (c23534w0.f93190c == c0902h.f3296y) {
                        c0902h = c0902h4;
                    }
                    c23534w0.f93195h = c0902h;
                    if (((C0902h) c23534w0.f93194g) == c0902h3) {
                        c23534w0.f93194g = c0902h4;
                    }
                }
            } else {
                j7 = j13;
                c23534w0.m68117b((C0902h) c23534w0.f93193f);
                C0902h c0902h5 = new C0902h(i19, c23534w0.f93190c, 9);
                c23534w0.f93193f = c0902h5;
                c23534w0.f93194g = c0902h5;
                c23534w0.f93195h = c0902h5;
            }
            i18++;
            j13 = j7;
        }
        long j14 = j13;
        if (arrayList.isEmpty()) {
            this.f154899q0 = this.f154898p0;
        } else {
            ((C36179j) AbstractC41047q.m133279i(arrayList)).f154793J = true;
        }
        this.f154902t0 = false;
        int i24 = this.f154883a0;
        long j15 = c36179j2.f148919g;
        C32770z c32770z = this.f154867K;
        c32770z.m102769k(new C23537y(1, i24, null, 3, null, c32770z.m102759a(j15), c32770z.m102759a(j14)));
    }
}
