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

/* JADX INFO: renamed from: qa3.b0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30119b0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f122989E;

    /* JADX INFO: renamed from: F */
    public int f122990F;

    /* JADX INFO: renamed from: G */
    public int f122991G;

    /* JADX INFO: renamed from: H */
    public C30171w0 f122992H;

    /* JADX INFO: renamed from: I */
    public int f122993I;

    /* JADX INFO: renamed from: J */
    public List f122994J;

    /* JADX INFO: renamed from: K */
    public C30171w0 f122995K;

    /* JADX INFO: renamed from: L */
    public int f122996L;

    /* JADX INFO: renamed from: M */
    public List f122997M;

    /* JADX INFO: renamed from: N */
    public List f122998N;

    /* JADX INFO: renamed from: O */
    public List f122999O;

    /* JADX INFO: renamed from: P */
    public List f123000P;

    /* JADX INFO: renamed from: Q */
    public C30123c1 f123001Q;

    /* JADX INFO: renamed from: R */
    public List f123002R;

    /* JADX INFO: renamed from: S */
    public C30158q f123003S;

    /* JADX INFO: renamed from: T */
    public List f123004T;

    /* JADX INFO: renamed from: U */
    public List f123005U;

    /* JADX INFO: renamed from: V */
    public List f123006V;

    /* JADX INFO: renamed from: z */
    public int f123007z;

    /* JADX INFO: renamed from: n */
    public static C30119b0 m92285n() {
        C30119b0 c30119b0 = new C30119b0();
        c30119b0.f122989E = 6;
        c30119b0.f122990F = 6;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30119b0.f122992H = c30171w0;
        List list = Collections.EMPTY_LIST;
        c30119b0.f122994J = list;
        c30119b0.f122995K = c30171w0;
        c30119b0.f122997M = list;
        c30119b0.f122998N = list;
        c30119b0.f122999O = list;
        c30119b0.f123000P = list;
        c30119b0.f123001Q = C30123c1.f123059G;
        c30119b0.f123002R = list;
        c30119b0.f123003S = C30158q.f123391E;
        c30119b0.f123004T = list;
        c30119b0.f123005U = list;
        c30119b0.f123006V = list;
        return c30119b0;
    }

    public final Object clone() {
        C30119b0 c30119b0M92285n = m92285n();
        c30119b0M92285n.m92287o(m92286l());
        return c30119b0M92285n;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30122c0 c30122c0M92286l = m92286l();
        if (c30122c0M92286l.mo92260b()) {
            return c30122c0M92286l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30122c0 c30122c0 = null;
        try {
            try {
                C30122c0.f123035Z.getClass();
                m92287o(new C30122c0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30122c0 c30122c1 = (C30122c0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30122c0 = c30122c1;
                    if (c30122c0 != null) {
                        m92287o(c30122c0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30122c0 != null) {
                m92287o(c30122c0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92287o((C30122c0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30122c0 m92286l() {
        C30122c0 c30122c0 = new C30122c0(this);
        int i13 = this.f123007z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30122c0.f123058z = this.f122989E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30122c0.f123036E = this.f122990F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30122c0.f123037F = this.f122991G;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30122c0.f123038G = this.f122992H;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30122c0.f123039H = this.f122993I;
        if ((i13 & 32) == 32) {
            this.f122994J = Collections.unmodifiableList(this.f122994J);
            this.f123007z &= -33;
        }
        c30122c0.f123040I = this.f122994J;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        c30122c0.f123041J = this.f122995K;
        if ((i13 & 128) == 128) {
            i14 |= 64;
        }
        c30122c0.f123042K = this.f122996L;
        if ((this.f123007z & 256) == 256) {
            this.f122997M = Collections.unmodifiableList(this.f122997M);
            this.f123007z &= -257;
        }
        c30122c0.f123043L = this.f122997M;
        if ((this.f123007z & 512) == 512) {
            this.f122998N = Collections.unmodifiableList(this.f122998N);
            this.f123007z &= -513;
        }
        c30122c0.f123044M = this.f122998N;
        if ((this.f123007z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            this.f122999O = Collections.unmodifiableList(this.f122999O);
            this.f123007z &= -1025;
        }
        c30122c0.f123046O = this.f122999O;
        if ((this.f123007z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            this.f123000P = Collections.unmodifiableList(this.f123000P);
            this.f123007z &= -2049;
        }
        c30122c0.f123047P = this.f123000P;
        if ((i13 & 4096) == 4096) {
            i14 |= 128;
        }
        c30122c0.f123048Q = this.f123001Q;
        if ((this.f123007z & DfuBaseService.ERROR_REMOTE_MASK) == 8192) {
            this.f123002R = Collections.unmodifiableList(this.f123002R);
            this.f123007z &= -8193;
        }
        c30122c0.f123049R = this.f123002R;
        if ((i13 & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
            i14 |= 256;
        }
        c30122c0.f123050S = this.f123003S;
        if ((this.f123007z & 32768) == 32768) {
            this.f123004T = Collections.unmodifiableList(this.f123004T);
            this.f123007z &= -32769;
        }
        c30122c0.f123051T = this.f123004T;
        if ((this.f123007z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 65536) {
            this.f123005U = Collections.unmodifiableList(this.f123005U);
            this.f123007z &= -65537;
        }
        c30122c0.f123052U = this.f123005U;
        if ((this.f123007z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 131072) {
            this.f123006V = Collections.unmodifiableList(this.f123006V);
            this.f123007z &= -131073;
        }
        c30122c0.f123053V = this.f123006V;
        c30122c0.f123057y = i14;
        return c30122c0;
    }

    /* JADX INFO: renamed from: o */
    public final void m92287o(C30122c0 c30122c0) {
        C30158q c30158q;
        C30123c1 c30123c1;
        C30171w0 c30171w0;
        C30171w0 c30171w1;
        if (c30122c0 == C30122c0.f123034Y) {
            return;
        }
        int i13 = c30122c0.f123057y;
        if ((i13 & 1) == 1) {
            int i14 = c30122c0.f123058z;
            this.f123007z = 1 | this.f123007z;
            this.f122989E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30122c0.f123036E;
            this.f123007z = 2 | this.f123007z;
            this.f122990F = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = c30122c0.f123037F;
            this.f123007z = 4 | this.f123007z;
            this.f122991G = i16;
        }
        if ((i13 & 8) == 8) {
            C30171w0 c30171w2 = c30122c0.f123038G;
            if ((this.f123007z & 8) != 8 || (c30171w1 = this.f122992H) == C30171w0.f123475U) {
                this.f122992H = c30171w2;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w1);
                c30169v0M92361r.m92357n(c30171w2);
                this.f122992H = c30169v0M92361r.m92356k();
            }
            this.f123007z |= 8;
        }
        if ((c30122c0.f123057y & 16) == 16) {
            int i17 = c30122c0.f123039H;
            this.f123007z = 16 | this.f123007z;
            this.f122993I = i17;
        }
        if (!c30122c0.f123040I.isEmpty()) {
            if (this.f122994J.isEmpty()) {
                this.f122994J = c30122c0.f123040I;
                this.f123007z &= -33;
            } else {
                if ((this.f123007z & 32) != 32) {
                    this.f122994J = new ArrayList(this.f122994J);
                    this.f123007z |= 32;
                }
                this.f122994J.addAll(c30122c0.f123040I);
            }
        }
        if ((c30122c0.f123057y & 32) == 32) {
            C30171w0 c30171w3 = c30122c0.f123041J;
            if ((this.f123007z & 64) != 64 || (c30171w0 = this.f122995K) == C30171w0.f123475U) {
                this.f122995K = c30171w3;
            } else {
                C30169v0 c30169v0M92361r2 = C30171w0.m92361r(c30171w0);
                c30169v0M92361r2.m92357n(c30171w3);
                this.f122995K = c30169v0M92361r2.m92356k();
            }
            this.f123007z |= 64;
        }
        if ((c30122c0.f123057y & 64) == 64) {
            int i18 = c30122c0.f123042K;
            this.f123007z |= 128;
            this.f122996L = i18;
        }
        if (!c30122c0.f123043L.isEmpty()) {
            if (this.f122997M.isEmpty()) {
                this.f122997M = c30122c0.f123043L;
                this.f123007z &= -257;
            } else {
                if ((this.f123007z & 256) != 256) {
                    this.f122997M = new ArrayList(this.f122997M);
                    this.f123007z |= 256;
                }
                this.f122997M.addAll(c30122c0.f123043L);
            }
        }
        if (!c30122c0.f123044M.isEmpty()) {
            if (this.f122998N.isEmpty()) {
                this.f122998N = c30122c0.f123044M;
                this.f123007z &= -513;
            } else {
                if ((this.f123007z & 512) != 512) {
                    this.f122998N = new ArrayList(this.f122998N);
                    this.f123007z |= 512;
                }
                this.f122998N.addAll(c30122c0.f123044M);
            }
        }
        if (!c30122c0.f123046O.isEmpty()) {
            if (this.f122999O.isEmpty()) {
                this.f122999O = c30122c0.f123046O;
                this.f123007z &= -1025;
            } else {
                if ((this.f123007z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 1024) {
                    this.f122999O = new ArrayList(this.f122999O);
                    this.f123007z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                this.f122999O.addAll(c30122c0.f123046O);
            }
        }
        if (!c30122c0.f123047P.isEmpty()) {
            if (this.f123000P.isEmpty()) {
                this.f123000P = c30122c0.f123047P;
                this.f123007z &= -2049;
            } else {
                if ((this.f123007z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 2048) {
                    this.f123000P = new ArrayList(this.f123000P);
                    this.f123007z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                this.f123000P.addAll(c30122c0.f123047P);
            }
        }
        if ((c30122c0.f123057y & 128) == 128) {
            C30123c1 c30123c2 = c30122c0.f123048Q;
            if ((this.f123007z & 4096) != 4096 || (c30123c1 = this.f123001Q) == C30123c1.f123059G) {
                this.f123001Q = c30123c2;
            } else {
                C30133g c30133gM92293i = C30123c1.m92293i(c30123c1);
                c30133gM92293i.m92311o(c30123c2);
                this.f123001Q = c30133gM92293i.m92309k();
            }
            this.f123007z |= 4096;
        }
        if (!c30122c0.f123049R.isEmpty()) {
            if (this.f123002R.isEmpty()) {
                this.f123002R = c30122c0.f123049R;
                this.f123007z &= -8193;
            } else {
                if ((this.f123007z & DfuBaseService.ERROR_REMOTE_MASK) != 8192) {
                    this.f123002R = new ArrayList(this.f123002R);
                    this.f123007z |= DfuBaseService.ERROR_REMOTE_MASK;
                }
                this.f123002R.addAll(c30122c0.f123049R);
            }
        }
        if ((c30122c0.f123057y & 256) == 256) {
            C30158q c30158q2 = c30122c0.f123050S;
            if ((this.f123007z & DfuBaseService.ERROR_CONNECTION_MASK) != 16384 || (c30158q = this.f123003S) == C30158q.f123391E) {
                this.f123003S = c30158q2;
            } else {
                C30156p c30156p = new C30156p(0);
                c30156p.f123384z = Collections.EMPTY_LIST;
                c30156p.m92340l(c30158q);
                c30156p.m92340l(c30158q2);
                this.f123003S = c30156p.m92338j();
            }
            this.f123007z |= DfuBaseService.ERROR_CONNECTION_MASK;
        }
        if (!c30122c0.f123051T.isEmpty()) {
            if (this.f123004T.isEmpty()) {
                this.f123004T = c30122c0.f123051T;
                this.f123007z &= -32769;
            } else {
                if ((this.f123007z & 32768) != 32768) {
                    this.f123004T = new ArrayList(this.f123004T);
                    this.f123007z |= 32768;
                }
                this.f123004T.addAll(c30122c0.f123051T);
            }
        }
        if (!c30122c0.f123052U.isEmpty()) {
            if (this.f123005U.isEmpty()) {
                this.f123005U = c30122c0.f123052U;
                this.f123007z &= -65537;
            } else {
                if ((this.f123007z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 65536) {
                    this.f123005U = new ArrayList(this.f123005U);
                    this.f123007z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
                }
                this.f123005U.addAll(c30122c0.f123052U);
            }
        }
        if (!c30122c0.f123053V.isEmpty()) {
            if (this.f123006V.isEmpty()) {
                this.f123006V = c30122c0.f123053V;
                this.f123007z &= -131073;
            } else {
                if ((this.f123007z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) != 131072) {
                    this.f123006V = new ArrayList(this.f123006V);
                    this.f123007z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
                }
                this.f123006V.addAll(c30122c0.f123053V);
            }
        }
        m118816j(c30122c0);
        this.f158353w = this.f158353w.m118743c(c30122c0.f123056x);
    }
}
