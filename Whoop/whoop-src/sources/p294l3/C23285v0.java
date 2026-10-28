package p294l3;

import androidx.profileinstaller.ProfileVerifier;
import no.nordicsemi.android.dfu.DfuBaseService;
import p127ev.AbstractC13673n;
import p208i2.AbstractC17911t;
import p208i2.C17919x;
import p208i2.C17924z0;
import p270k2.AbstractC22132f;
import p392p3.AbstractC28771i;
import p392p3.C28776n;
import p392p3.C28777o;
import p392p3.C28780r;
import p478s3.C32096b;
import p571w3.C36765a;
import p571w3.C36767c;
import p571w3.C36768d;
import p571w3.C36769e;
import p571w3.C36773i;
import p571w3.C36775k;
import p571w3.C36776l;
import p571w3.C36777m;
import p571w3.C36778n;
import p571w3.C36780p;
import p571w3.C36781q;
import p571w3.C36783s;
import p571w3.InterfaceC36779o;
import p636y3.C39183o;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: l3.v0 */
/* JADX INFO: loaded from: classes.dex */
public final class C23285v0 {

    /* JADX INFO: renamed from: d */
    public static final C23285v0 f92254d = new C23285v0(0, 0, null, null, null, 0, null, null, 0, 0, 16777215);

    /* JADX INFO: renamed from: a */
    public final C23267m0 f92255a;

    /* JADX INFO: renamed from: b */
    public final C23245b0 f92256b;

    /* JADX INFO: renamed from: c */
    public final C23255g0 f92257c;

    public C23285v0(C23267m0 c23267m0, C23245b0 c23245b0, C23255g0 c23255g0) {
        this.f92255a = c23267m0;
        this.f92256b = c23245b0;
        this.f92257c = c23255g0;
    }

    /* JADX INFO: renamed from: a */
    public static C23285v0 m67363a(C23285v0 c23285v0, AbstractC17911t abstractC17911t, long j7, C28780r c28780r, AbstractC28771i abstractC28771i, long j13, int i13) {
        float fMo117874a = c23285v0.f92255a.f92191a.mo117874a();
        long j14 = (i13 & 4) != 0 ? c23285v0.f92255a.f92192b : j7;
        C28780r c28780r2 = (i13 & 8) != 0 ? c23285v0.f92255a.f92193c : c28780r;
        C23267m0 c23267m0 = c23285v0.f92255a;
        C28776n c28776n = c23267m0.f92194d;
        C28777o c28777o = c23267m0.f92195e;
        AbstractC28771i abstractC28771i2 = (i13 & 64) != 0 ? c23267m0.f92196f : abstractC28771i;
        String str = c23267m0.f92197g;
        long j15 = c23267m0.f92198h;
        C36765a c36765a = c23267m0.f92199i;
        C36780p c36780p = c23267m0.f92200j;
        C32096b c32096b = c23267m0.f92201k;
        long j16 = c23267m0.f92202l;
        C36776l c36776l = c23267m0.f92203m;
        C17924z0 c17924z0 = c23267m0.f92204n;
        AbstractC22132f abstractC22132f = c23267m0.f92206p;
        C23245b0 c23245b0 = c23285v0.f92256b;
        int i14 = c23245b0.f92104a;
        int i15 = c23245b0.f92105b;
        long j17 = (i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 0 ? c23245b0.f92106c : j13;
        C36781q c36781q = c23245b0.f92107d;
        C23255g0 c23255g0 = c23285v0.f92257c;
        C36773i c36773i = c23245b0.f92109f;
        int i16 = c23245b0.f92110g;
        int i17 = c23245b0.f92111h;
        C36783s c36783s = c23245b0.f92112i;
        c23285v0.getClass();
        C23267m0 c23267m1 = new C23267m0(abstractC17911t, fMo117874a, j14, c28780r2, c28776n, c28777o, abstractC28771i2, str, j15, c36765a, c36780p, c32096b, j16, c36776l, c17924z0, c23255g0 != null ? c23255g0.f92138a : null, abstractC22132f);
        C23251e0 c23251e0 = null;
        if (c23255g0 != null) {
            c23251e0 = c23255g0.f92139b;
        }
        return new C23285v0(c23267m1, new C23245b0(i14, i15, j17, c36781q, c23251e0, c36773i, i16, i17, c36783s), c23255g0);
    }

    /* JADX INFO: renamed from: b */
    public static C23285v0 m67364b(C23285v0 c23285v0, long j7, long j13, C28780r c28780r, AbstractC28771i abstractC28771i, long j14, int i13, long j15, C23255g0 c23255g0, C36773i c36773i, int i14) {
        InterfaceC36779o c36767c;
        long jMo117875b = (i14 & 1) != 0 ? c23285v0.f92255a.f92191a.mo117875b() : j7;
        long j16 = (i14 & 2) != 0 ? c23285v0.f92255a.f92192b : j13;
        C28780r c28780r2 = (i14 & 4) != 0 ? c23285v0.f92255a.f92193c : c28780r;
        C23267m0 c23267m0 = c23285v0.f92255a;
        C28776n c28776n = c23267m0.f92194d;
        C28777o c28777o = c23267m0.f92195e;
        AbstractC28771i abstractC28771i2 = (i14 & 32) != 0 ? c23267m0.f92196f : abstractC28771i;
        String str = c23267m0.f92197g;
        long j17 = (i14 & 128) != 0 ? c23267m0.f92198h : j14;
        C36765a c36765a = c23267m0.f92199i;
        C36780p c36780p = c23267m0.f92200j;
        C32096b c32096b = c23267m0.f92201k;
        long j18 = c23267m0.f92202l;
        C36776l c36776l = (i14 & 4096) != 0 ? c23267m0.f92203m : C36776l.f157353d;
        C17924z0 c17924z0 = c23267m0.f92204n;
        AbstractC22132f abstractC22132f = c23267m0.f92206p;
        int i15 = (i14 & 32768) != 0 ? c23285v0.f92256b.f92104a : i13;
        C23245b0 c23245b0 = c23285v0.f92256b;
        int i16 = c23245b0.f92105b;
        long j19 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? c23245b0.f92106c : j15;
        C36781q c36781q = c23245b0.f92107d;
        C23255g0 c23255g1 = (i14 & 524288) != 0 ? c23285v0.f92257c : c23255g0;
        C36773i c36773i2 = (i14 & 1048576) != 0 ? c23245b0.f92109f : c36773i;
        int i17 = c23245b0.f92110g;
        int i18 = c23245b0.f92111h;
        C36783s c36783s = c23245b0.f92112i;
        if (C17919x.m51542d(jMo117875b, c23267m0.f92191a.mo117875b())) {
            c36767c = c23267m0.f92191a;
        } else {
            c36767c = jMo117875b != 16 ? new C36767c(jMo117875b) : C36778n.f157356a;
        }
        return new C23285v0(new C23267m0(c36767c, j16, c28780r2, c28776n, c28777o, abstractC28771i2, str, j17, c36765a, c36780p, c32096b, j18, c36776l, c17924z0, c23255g1 != null ? c23255g1.f92138a : null, abstractC22132f), new C23245b0(i15, i16, j19, c36781q, c23255g1 != null ? c23255g1.f92139b : null, c36773i2, i17, i18, c36783s), c23255g1);
    }

    /* JADX INFO: renamed from: f */
    public static C23285v0 m67365f(C23285v0 c23285v0, long j7, long j13, C28780r c28780r, C28776n c28776n, AbstractC28771i abstractC28771i, long j14, C36776l c36776l, int i13, long j15, int i14) {
        long j16 = (i14 & 1) != 0 ? C17919x.f69637n : j7;
        long j17 = (i14 & 2) != 0 ? C39183o.f168428c : j13;
        C28780r c28780r2 = (i14 & 4) != 0 ? null : c28780r;
        C28776n c28776n2 = (i14 & 8) != 0 ? null : c28776n;
        AbstractC28771i abstractC28771i2 = (i14 & 32) != 0 ? null : abstractC28771i;
        long j18 = (i14 & 128) != 0 ? C39183o.f168428c : j14;
        long j19 = C17919x.f69637n;
        C36776l c36776l2 = (i14 & 4096) != 0 ? null : c36776l;
        int i15 = (32768 & i14) != 0 ? Integer.MIN_VALUE : i13;
        long j24 = (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? C39183o.f168428c : j15;
        C23267m0 c23267m0M67329a = AbstractC23269n0.m67329a(c23285v0.f92255a, j16, null, Float.NaN, j17, c28780r2, c28776n2, null, abstractC28771i2, null, j18, null, null, null, j19, c36776l2, null, null, null);
        C23245b0 c23245b0M67298a = AbstractC23247c0.m67298a(c23285v0.f92256b, i15, Integer.MIN_VALUE, j24, null, null, null, 0, Integer.MIN_VALUE, null);
        return (c23285v0.f92255a == c23267m0M67329a && c23285v0.f92256b == c23245b0M67298a) ? c23285v0 : new C23285v0(c23267m0M67329a, c23245b0M67298a);
    }

    /* JADX INFO: renamed from: c */
    public final long m67366c() {
        return this.f92255a.f92191a.mo117875b();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m67367d(C23285v0 c23285v0) {
        if (this != c23285v0) {
            return AbstractC22676k.m65745e(this.f92256b, c23285v0.f92256b) && this.f92255a.m67326b(c23285v0.f92255a);
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public final C23285v0 m67368e(C23285v0 c23285v0) {
        return (c23285v0 == null || c23285v0.equals(f92254d)) ? this : new C23285v0(this.f92255a.m67328d(c23285v0.f92255a), this.f92256b.m67296a(c23285v0.f92256b));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23285v0)) {
            return false;
        }
        C23285v0 c23285v0 = (C23285v0) obj;
        return AbstractC22676k.m65745e(this.f92255a, c23285v0.f92255a) && AbstractC22676k.m65745e(this.f92256b, c23285v0.f92256b) && AbstractC22676k.m65745e(this.f92257c, c23285v0.f92257c);
    }

    public final int hashCode() {
        int iHashCode = (this.f92256b.hashCode() + (this.f92255a.hashCode() * 31)) * 31;
        C23255g0 c23255g0 = this.f92257c;
        return iHashCode + (c23255g0 != null ? c23255g0.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TextStyle(color=");
        sb4.append((Object) C17919x.m51548j(m67366c()));
        sb4.append(", brush=");
        C23267m0 c23267m0 = this.f92255a;
        sb4.append(c23267m0.f92191a.mo117876c());
        sb4.append(", alpha=");
        sb4.append(c23267m0.f92191a.mo117874a());
        sb4.append(", fontSize=");
        sb4.append((Object) C39183o.m124807e(c23267m0.f92192b));
        sb4.append(", fontWeight=");
        sb4.append(c23267m0.f92193c);
        sb4.append(", fontStyle=");
        sb4.append(c23267m0.f92194d);
        sb4.append(", fontSynthesis=");
        sb4.append(c23267m0.f92195e);
        sb4.append(", fontFamily=");
        sb4.append(c23267m0.f92196f);
        sb4.append(", fontFeatureSettings=");
        sb4.append(c23267m0.f92197g);
        sb4.append(", letterSpacing=");
        sb4.append((Object) C39183o.m124807e(c23267m0.f92198h));
        sb4.append(", baselineShift=");
        sb4.append(c23267m0.f92199i);
        sb4.append(", textGeometricTransform=");
        sb4.append(c23267m0.f92200j);
        sb4.append(", localeList=");
        sb4.append(c23267m0.f92201k);
        sb4.append(", background=");
        AbstractC13673n.m38574u(c23267m0.f92202l, ", textDecoration=", sb4);
        sb4.append(c23267m0.f92203m);
        sb4.append(", shadow=");
        sb4.append(c23267m0.f92204n);
        sb4.append(", drawStyle=");
        sb4.append(c23267m0.f92206p);
        sb4.append(", textAlign=");
        C23245b0 c23245b0 = this.f92256b;
        sb4.append((Object) C36775k.m117881a(c23245b0.f92104a));
        sb4.append(", textDirection=");
        sb4.append((Object) C36777m.m117882a(c23245b0.f92105b));
        sb4.append(", lineHeight=");
        sb4.append((Object) C39183o.m124807e(c23245b0.f92106c));
        sb4.append(", textIndent=");
        sb4.append(c23245b0.f92107d);
        sb4.append(", platformStyle=");
        sb4.append(this.f92257c);
        sb4.append(", lineHeightStyle=");
        sb4.append(c23245b0.f92109f);
        sb4.append(", lineBreak=");
        sb4.append((Object) C36769e.m117878a(c23245b0.f92110g));
        sb4.append(", hyphens=");
        sb4.append((Object) C36768d.m117877a(c23245b0.f92111h));
        sb4.append(", textMotion=");
        sb4.append(c23245b0.f92112i);
        sb4.append(')');
        return sb4.toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C23285v0(C23267m0 c23267m0, C23245b0 c23245b0) {
        C23253f0 c23253f0 = c23267m0.f92205o;
        C23251e0 c23251e0 = c23245b0.f92108e;
        this(c23267m0, c23245b0, (c23253f0 == null && c23251e0 == null) ? null : new C23255g0(c23253f0, c23251e0));
    }

    public C23285v0(long j7, long j13, C28780r c28780r, C28776n c28776n, AbstractC28771i abstractC28771i, long j14, C36776l c36776l, C17924z0 c17924z0, int i13, long j15, int i14) {
        this(new C23267m0((i14 & 1) != 0 ? C17919x.f69637n : j7, (i14 & 2) != 0 ? C39183o.f168428c : j13, (i14 & 4) != 0 ? null : c28780r, (i14 & 8) != 0 ? null : c28776n, (C28777o) null, (i14 & 32) != 0 ? null : abstractC28771i, (String) null, (i14 & 128) != 0 ? C39183o.f168428c : j14, (C36765a) null, (C36780p) null, (C32096b) null, C17919x.f69637n, (i14 & 4096) != 0 ? null : c36776l, (i14 & DfuBaseService.ERROR_REMOTE_MASK) != 0 ? null : c17924z0, (C23253f0) null), new C23245b0((32768 & i14) != 0 ? Integer.MIN_VALUE : i13, Integer.MIN_VALUE, (i14 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 0 ? C39183o.f168428c : j15, null, null, null, 0, Integer.MIN_VALUE, null), null);
    }
}
