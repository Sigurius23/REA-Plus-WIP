package qa3;

import androidx.profileinstaller.ProfileVerifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37004l;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.j0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30143j0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123238E;

    /* JADX INFO: renamed from: F */
    public int f123239F;

    /* JADX INFO: renamed from: G */
    public int f123240G;

    /* JADX INFO: renamed from: H */
    public C30171w0 f123241H;

    /* JADX INFO: renamed from: I */
    public int f123242I;

    /* JADX INFO: renamed from: J */
    public List f123243J;

    /* JADX INFO: renamed from: K */
    public C30171w0 f123244K;

    /* JADX INFO: renamed from: L */
    public int f123245L;

    /* JADX INFO: renamed from: M */
    public List f123246M;

    /* JADX INFO: renamed from: N */
    public List f123247N;

    /* JADX INFO: renamed from: O */
    public List f123248O;

    /* JADX INFO: renamed from: P */
    public C30129e1 f123249P;

    /* JADX INFO: renamed from: Q */
    public int f123250Q;

    /* JADX INFO: renamed from: R */
    public int f123251R;

    /* JADX INFO: renamed from: S */
    public List f123252S;

    /* JADX INFO: renamed from: T */
    public List f123253T;

    /* JADX INFO: renamed from: U */
    public List f123254U;

    /* JADX INFO: renamed from: V */
    public List f123255V;

    /* JADX INFO: renamed from: W */
    public List f123256W;

    /* JADX INFO: renamed from: X */
    public List f123257X;

    /* JADX INFO: renamed from: Y */
    public List f123258Y;

    /* JADX INFO: renamed from: Z */
    public List f123259Z;

    /* JADX INFO: renamed from: a0 */
    public C30158q f123260a0;

    /* JADX INFO: renamed from: b0 */
    public C30158q f123261b0;

    /* JADX INFO: renamed from: z */
    public int f123262z;

    /* JADX INFO: renamed from: n */
    public static C30143j0 m92320n() {
        C30143j0 c30143j0 = new C30143j0();
        c30143j0.f123238E = 518;
        c30143j0.f123239F = 2054;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30143j0.f123241H = c30171w0;
        List list = Collections.EMPTY_LIST;
        c30143j0.f123243J = list;
        c30143j0.f123244K = c30171w0;
        c30143j0.f123246M = list;
        c30143j0.f123247N = list;
        c30143j0.f123248O = list;
        c30143j0.f123249P = C30129e1.f123112N;
        c30143j0.f123252S = list;
        c30143j0.f123253T = list;
        c30143j0.f123254U = list;
        c30143j0.f123255V = list;
        c30143j0.f123256W = list;
        c30143j0.f123257X = list;
        c30143j0.f123258Y = list;
        c30143j0.f123259Z = list;
        C30158q c30158q = C30158q.f123391E;
        c30143j0.f123260a0 = c30158q;
        c30143j0.f123261b0 = c30158q;
        return c30143j0;
    }

    public final Object clone() {
        C30143j0 c30143j0M92320n = m92320n();
        c30143j0M92320n.m92322o(m92321l());
        return c30143j0M92320n;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30146k0 c30146k0M92321l = m92321l();
        if (c30146k0M92321l.mo92260b()) {
            return c30146k0M92321l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30146k0 c30146k0 = null;
        try {
            try {
                C30146k0.f123303f0.getClass();
                m92322o(new C30146k0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30146k0 c30146k1 = (C30146k0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30146k0 = c30146k1;
                    if (c30146k0 != null) {
                        m92322o(c30146k0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30146k0 != null) {
                m92322o(c30146k0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92322o((C30146k0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30146k0 m92321l() {
        C30146k0 c30146k0 = new C30146k0(this);
        int i13 = this.f123262z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30146k0.f123332z = this.f123238E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30146k0.f123304E = this.f123239F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30146k0.f123305F = this.f123240G;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30146k0.f123306G = this.f123241H;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30146k0.f123307H = this.f123242I;
        if ((i13 & 32) == 32) {
            this.f123243J = Collections.unmodifiableList(this.f123243J);
            this.f123262z &= -33;
        }
        c30146k0.f123308I = this.f123243J;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        c30146k0.f123309J = this.f123244K;
        if ((i13 & 128) == 128) {
            i14 |= 64;
        }
        c30146k0.f123310K = this.f123245L;
        if ((this.f123262z & 256) == 256) {
            this.f123246M = Collections.unmodifiableList(this.f123246M);
            this.f123262z &= -257;
        }
        c30146k0.f123311L = this.f123246M;
        if ((this.f123262z & 512) == 512) {
            this.f123247N = Collections.unmodifiableList(this.f123247N);
            this.f123262z &= -513;
        }
        c30146k0.f123312M = this.f123247N;
        if ((this.f123262z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            this.f123248O = Collections.unmodifiableList(this.f123248O);
            this.f123262z &= -1025;
        }
        c30146k0.f123314O = this.f123248O;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            i14 |= 128;
        }
        c30146k0.f123315P = this.f123249P;
        if ((i13 & 4096) == 4096) {
            i14 |= 256;
        }
        c30146k0.f123316Q = this.f123250Q;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 8192) {
            i14 |= 512;
        }
        c30146k0.f123317R = this.f123251R;
        if ((this.f123262z & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
            this.f123252S = Collections.unmodifiableList(this.f123252S);
            this.f123262z &= -16385;
        }
        c30146k0.f123318S = this.f123252S;
        if ((this.f123262z & 32768) == 32768) {
            this.f123253T = Collections.unmodifiableList(this.f123253T);
            this.f123262z &= -32769;
        }
        c30146k0.f123319T = this.f123253T;
        if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 65536) {
            this.f123254U = Collections.unmodifiableList(this.f123254U);
            this.f123262z &= -65537;
        }
        c30146k0.f123320U = this.f123254U;
        if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 131072) {
            this.f123255V = Collections.unmodifiableList(this.f123255V);
            this.f123262z &= -131073;
        }
        c30146k0.f123321V = this.f123255V;
        if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 262144) {
            this.f123256W = Collections.unmodifiableList(this.f123256W);
            this.f123262z &= -262145;
        }
        c30146k0.f123322W = this.f123256W;
        if ((this.f123262z & 524288) == 524288) {
            this.f123257X = Collections.unmodifiableList(this.f123257X);
            this.f123262z &= -524289;
        }
        c30146k0.f123323X = this.f123257X;
        if ((this.f123262z & 1048576) == 1048576) {
            this.f123258Y = Collections.unmodifiableList(this.f123258Y);
            this.f123262z &= -1048577;
        }
        c30146k0.f123324Y = this.f123258Y;
        if ((this.f123262z & 2097152) == 2097152) {
            this.f123259Z = Collections.unmodifiableList(this.f123259Z);
            this.f123262z &= -2097153;
        }
        c30146k0.f123325Z = this.f123259Z;
        if ((i13 & 4194304) == 4194304) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        c30146k0.f123326a0 = this.f123260a0;
        if ((i13 & 8388608) == 8388608) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        c30146k0.f123327b0 = this.f123261b0;
        c30146k0.f123331y = i14;
        return c30146k0;
    }

    /* JADX INFO: renamed from: o */
    public final void m92322o(C30146k0 c30146k0) {
        C30158q c30158q;
        C30158q c30158q2;
        C30129e1 c30129e1;
        C30171w0 c30171w0;
        C30171w0 c30171w1;
        if (c30146k0 == C30146k0.f123302e0) {
            return;
        }
        int i13 = c30146k0.f123331y;
        if ((i13 & 1) == 1) {
            int i14 = c30146k0.f123332z;
            this.f123262z = 1 | this.f123262z;
            this.f123238E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30146k0.f123304E;
            this.f123262z = 2 | this.f123262z;
            this.f123239F = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = c30146k0.f123305F;
            this.f123262z = 4 | this.f123262z;
            this.f123240G = i16;
        }
        if ((i13 & 8) == 8) {
            C30171w0 c30171w2 = c30146k0.f123306G;
            if ((this.f123262z & 8) != 8 || (c30171w1 = this.f123241H) == C30171w0.f123475U) {
                this.f123241H = c30171w2;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w1);
                c30169v0M92361r.m92357n(c30171w2);
                this.f123241H = c30169v0M92361r.m92356k();
            }
            this.f123262z |= 8;
        }
        if ((c30146k0.f123331y & 16) == 16) {
            int i17 = c30146k0.f123307H;
            this.f123262z = 16 | this.f123262z;
            this.f123242I = i17;
        }
        if (!c30146k0.f123308I.isEmpty()) {
            if (this.f123243J.isEmpty()) {
                this.f123243J = c30146k0.f123308I;
                this.f123262z &= -33;
            } else {
                if ((this.f123262z & 32) != 32) {
                    this.f123243J = new ArrayList(this.f123243J);
                    this.f123262z |= 32;
                }
                this.f123243J.addAll(c30146k0.f123308I);
            }
        }
        if ((c30146k0.f123331y & 32) == 32) {
            C30171w0 c30171w3 = c30146k0.f123309J;
            if ((this.f123262z & 64) != 64 || (c30171w0 = this.f123244K) == C30171w0.f123475U) {
                this.f123244K = c30171w3;
            } else {
                C30169v0 c30169v0M92361r2 = C30171w0.m92361r(c30171w0);
                c30169v0M92361r2.m92357n(c30171w3);
                this.f123244K = c30169v0M92361r2.m92356k();
            }
            this.f123262z |= 64;
        }
        if ((c30146k0.f123331y & 64) == 64) {
            int i18 = c30146k0.f123310K;
            this.f123262z |= 128;
            this.f123245L = i18;
        }
        if (!c30146k0.f123311L.isEmpty()) {
            if (this.f123246M.isEmpty()) {
                this.f123246M = c30146k0.f123311L;
                this.f123262z &= -257;
            } else {
                if ((this.f123262z & 256) != 256) {
                    this.f123246M = new ArrayList(this.f123246M);
                    this.f123262z |= 256;
                }
                this.f123246M.addAll(c30146k0.f123311L);
            }
        }
        if (!c30146k0.f123312M.isEmpty()) {
            if (this.f123247N.isEmpty()) {
                this.f123247N = c30146k0.f123312M;
                this.f123262z &= -513;
            } else {
                if ((this.f123262z & 512) != 512) {
                    this.f123247N = new ArrayList(this.f123247N);
                    this.f123262z |= 512;
                }
                this.f123247N.addAll(c30146k0.f123312M);
            }
        }
        if (!c30146k0.f123314O.isEmpty()) {
            if (this.f123248O.isEmpty()) {
                this.f123248O = c30146k0.f123314O;
                this.f123262z &= -1025;
            } else {
                if ((this.f123262z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 1024) {
                    this.f123248O = new ArrayList(this.f123248O);
                    this.f123262z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                this.f123248O.addAll(c30146k0.f123314O);
            }
        }
        if ((c30146k0.f123331y & 128) == 128) {
            C30129e1 c30129e2 = c30146k0.f123315P;
            if ((this.f123262z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 2048 || (c30129e1 = this.f123249P) == C30129e1.f123112N) {
                this.f123249P = c30129e2;
            } else {
                C30126d1 c30126d1M92295l = C30126d1.m92295l();
                c30126d1M92295l.m92297n(c30129e1);
                c30126d1M92295l.m92297n(c30129e2);
                this.f123249P = c30126d1M92295l.m92296k();
            }
            this.f123262z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        int i19 = c30146k0.f123331y;
        if ((i19 & 256) == 256) {
            int i24 = c30146k0.f123316Q;
            this.f123262z |= 4096;
            this.f123250Q = i24;
        }
        if ((i19 & 512) == 512) {
            int i25 = c30146k0.f123317R;
            this.f123262z |= DfuBaseService.ERROR_REMOTE_MASK;
            this.f123251R = i25;
        }
        if (!c30146k0.f123318S.isEmpty()) {
            if (this.f123252S.isEmpty()) {
                this.f123252S = c30146k0.f123318S;
                this.f123262z &= -16385;
            } else {
                if ((this.f123262z & DfuBaseService.ERROR_CONNECTION_MASK) != 16384) {
                    this.f123252S = new ArrayList(this.f123252S);
                    this.f123262z |= DfuBaseService.ERROR_CONNECTION_MASK;
                }
                this.f123252S.addAll(c30146k0.f123318S);
            }
        }
        if (!c30146k0.f123319T.isEmpty()) {
            if (this.f123253T.isEmpty()) {
                this.f123253T = c30146k0.f123319T;
                this.f123262z &= -32769;
            } else {
                if ((this.f123262z & 32768) != 32768) {
                    this.f123253T = new ArrayList(this.f123253T);
                    this.f123262z |= 32768;
                }
                this.f123253T.addAll(c30146k0.f123319T);
            }
        }
        if (!c30146k0.f123320U.isEmpty()) {
            if (this.f123254U.isEmpty()) {
                this.f123254U = c30146k0.f123320U;
                this.f123262z &= -65537;
            } else {
                if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 65536) {
                    this.f123254U = new ArrayList(this.f123254U);
                    this.f123262z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                this.f123254U.addAll(c30146k0.f123320U);
            }
        }
        if (!c30146k0.f123321V.isEmpty()) {
            if (this.f123255V.isEmpty()) {
                this.f123255V = c30146k0.f123321V;
                this.f123262z &= -131073;
            } else {
                if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 131072) {
                    this.f123255V = new ArrayList(this.f123255V);
                    this.f123262z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                this.f123255V.addAll(c30146k0.f123321V);
            }
        }
        if (!c30146k0.f123322W.isEmpty()) {
            if (this.f123256W.isEmpty()) {
                this.f123256W = c30146k0.f123322W;
                this.f123262z &= -262145;
            } else {
                if ((this.f123262z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 262144) {
                    this.f123256W = new ArrayList(this.f123256W);
                    this.f123262z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                }
                this.f123256W.addAll(c30146k0.f123322W);
            }
        }
        if (!c30146k0.f123323X.isEmpty()) {
            if (this.f123257X.isEmpty()) {
                this.f123257X = c30146k0.f123323X;
                this.f123262z &= -524289;
            } else {
                if ((this.f123262z & 524288) != 524288) {
                    this.f123257X = new ArrayList(this.f123257X);
                    this.f123262z |= 524288;
                }
                this.f123257X.addAll(c30146k0.f123323X);
            }
        }
        if (!c30146k0.f123324Y.isEmpty()) {
            if (this.f123258Y.isEmpty()) {
                this.f123258Y = c30146k0.f123324Y;
                this.f123262z &= -1048577;
            } else {
                if ((this.f123262z & 1048576) != 1048576) {
                    this.f123258Y = new ArrayList(this.f123258Y);
                    this.f123262z |= 1048576;
                }
                this.f123258Y.addAll(c30146k0.f123324Y);
            }
        }
        if (!c30146k0.f123325Z.isEmpty()) {
            if (this.f123259Z.isEmpty()) {
                this.f123259Z = c30146k0.f123325Z;
                this.f123262z &= -2097153;
            } else {
                if ((this.f123262z & 2097152) != 2097152) {
                    this.f123259Z = new ArrayList(this.f123259Z);
                    this.f123262z |= 2097152;
                }
                this.f123259Z.addAll(c30146k0.f123325Z);
            }
        }
        if ((c30146k0.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            C30158q c30158q3 = c30146k0.f123326a0;
            if ((this.f123262z & 4194304) != 4194304 || (c30158q2 = this.f123260a0) == C30158q.f123391E) {
                this.f123260a0 = c30158q3;
            } else {
                C30156p c30156p = new C30156p(0);
                c30156p.f123384z = Collections.EMPTY_LIST;
                c30156p.m92340l(c30158q2);
                c30156p.m92340l(c30158q3);
                this.f123260a0 = c30156p.m92338j();
            }
            this.f123262z |= 4194304;
        }
        if ((c30146k0.f123331y & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            C30158q c30158q4 = c30146k0.f123327b0;
            if ((this.f123262z & 8388608) != 8388608 || (c30158q = this.f123261b0) == C30158q.f123391E) {
                this.f123261b0 = c30158q4;
            } else {
                C30156p c30156p2 = new C30156p(0);
                c30156p2.f123384z = Collections.EMPTY_LIST;
                c30156p2.m92340l(c30158q);
                c30156p2.m92340l(c30158q4);
                this.f123261b0 = c30156p2.m92338j();
            }
            this.f123262z |= 8388608;
        }
        m118816j(c30146k0);
        this.f158353w = this.f158353w.m118743c(c30146k0.f123330x);
    }
}
