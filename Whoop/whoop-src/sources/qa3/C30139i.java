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

/* JADX INFO: renamed from: qa3.i */
/* JADX INFO: loaded from: classes3.dex */
public final class C30139i extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123185E;

    /* JADX INFO: renamed from: F */
    public int f123186F;

    /* JADX INFO: renamed from: G */
    public int f123187G;

    /* JADX INFO: renamed from: H */
    public List f123188H;

    /* JADX INFO: renamed from: I */
    public List f123189I;

    /* JADX INFO: renamed from: J */
    public List f123190J;

    /* JADX INFO: renamed from: K */
    public List f123191K;

    /* JADX INFO: renamed from: L */
    public List f123192L;

    /* JADX INFO: renamed from: M */
    public List f123193M;

    /* JADX INFO: renamed from: N */
    public List f123194N;

    /* JADX INFO: renamed from: O */
    public List f123195O;

    /* JADX INFO: renamed from: P */
    public List f123196P;

    /* JADX INFO: renamed from: Q */
    public List f123197Q;

    /* JADX INFO: renamed from: R */
    public List f123198R;

    /* JADX INFO: renamed from: S */
    public List f123199S;

    /* JADX INFO: renamed from: T */
    public int f123200T;

    /* JADX INFO: renamed from: U */
    public C30171w0 f123201U;

    /* JADX INFO: renamed from: V */
    public int f123202V;

    /* JADX INFO: renamed from: W */
    public List f123203W;

    /* JADX INFO: renamed from: X */
    public C30123c1 f123204X;

    /* JADX INFO: renamed from: Y */
    public List f123205Y;

    /* JADX INFO: renamed from: Z */
    public C30144j1 f123206Z;

    /* JADX INFO: renamed from: a0 */
    public List f123207a0;

    /* JADX INFO: renamed from: z */
    public int f123208z;

    /* JADX INFO: renamed from: n */
    public static C30139i m92316n() {
        C30139i c30139i = new C30139i();
        c30139i.f123185E = 6;
        List list = Collections.EMPTY_LIST;
        c30139i.f123188H = list;
        c30139i.f123189I = list;
        c30139i.f123190J = list;
        c30139i.f123191K = list;
        c30139i.f123192L = list;
        c30139i.f123193M = list;
        c30139i.f123194N = list;
        c30139i.f123195O = list;
        c30139i.f123196P = list;
        c30139i.f123197Q = list;
        c30139i.f123198R = list;
        c30139i.f123199S = list;
        c30139i.f123201U = C30171w0.f123475U;
        c30139i.f123203W = list;
        c30139i.f123204X = C30123c1.f123059G;
        c30139i.f123205Y = list;
        c30139i.f123206Z = C30144j1.f123263E;
        c30139i.f123207a0 = list;
        return c30139i;
    }

    public final Object clone() {
        C30139i c30139iM92316n = m92316n();
        c30139iM92316n.m92318o(m92317l());
        return c30139iM92316n;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30145k c30145kM92317l = m92317l();
        if (c30145kM92317l.mo92260b()) {
            return c30145kM92317l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30145k c30145k = null;
        try {
            try {
                C30145k.f123270h0.getClass();
                m92318o(new C30145k(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30145k c30145k2 = (C30145k) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30145k = c30145k2;
                    if (c30145k != null) {
                        m92318o(c30145k);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30145k != null) {
                m92318o(c30145k);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92318o((C30145k) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30145k m92317l() {
        C30145k c30145k = new C30145k(this);
        int i13 = this.f123208z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30145k.f123301z = this.f123185E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30145k.f123271E = this.f123186F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30145k.f123272F = this.f123187G;
        if ((i13 & 8) == 8) {
            this.f123188H = Collections.unmodifiableList(this.f123188H);
            this.f123208z &= -9;
        }
        c30145k.f123273G = this.f123188H;
        if ((this.f123208z & 16) == 16) {
            this.f123189I = Collections.unmodifiableList(this.f123189I);
            this.f123208z &= -17;
        }
        c30145k.f123274H = this.f123189I;
        if ((this.f123208z & 32) == 32) {
            this.f123190J = Collections.unmodifiableList(this.f123190J);
            this.f123208z &= -33;
        }
        c30145k.f123275I = this.f123190J;
        if ((this.f123208z & 64) == 64) {
            this.f123191K = Collections.unmodifiableList(this.f123191K);
            this.f123208z &= -65;
        }
        c30145k.f123277K = this.f123191K;
        if ((this.f123208z & 128) == 128) {
            this.f123192L = Collections.unmodifiableList(this.f123192L);
            this.f123208z &= -129;
        }
        c30145k.f123279M = this.f123192L;
        if ((this.f123208z & 256) == 256) {
            this.f123193M = Collections.unmodifiableList(this.f123193M);
            this.f123208z &= -257;
        }
        c30145k.f123280N = this.f123193M;
        if ((this.f123208z & 512) == 512) {
            this.f123194N = Collections.unmodifiableList(this.f123194N);
            this.f123208z &= -513;
        }
        c30145k.f123282P = this.f123194N;
        if ((this.f123208z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            this.f123195O = Collections.unmodifiableList(this.f123195O);
            this.f123208z &= -1025;
        }
        c30145k.f123283Q = this.f123195O;
        if ((this.f123208z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            this.f123196P = Collections.unmodifiableList(this.f123196P);
            this.f123208z &= -2049;
        }
        c30145k.f123284R = this.f123196P;
        if ((this.f123208z & 4096) == 4096) {
            this.f123197Q = Collections.unmodifiableList(this.f123197Q);
            this.f123208z &= -4097;
        }
        c30145k.f123285S = this.f123197Q;
        if ((this.f123208z & DfuBaseService.ERROR_REMOTE_MASK) == 8192) {
            this.f123198R = Collections.unmodifiableList(this.f123198R);
            this.f123208z &= -8193;
        }
        c30145k.f123286T = this.f123198R;
        if ((this.f123208z & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
            this.f123199S = Collections.unmodifiableList(this.f123199S);
            this.f123208z &= -16385;
        }
        c30145k.f123287U = this.f123199S;
        if ((i13 & 32768) == 32768) {
            i14 |= 8;
        }
        c30145k.f123289W = this.f123200T;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) == 65536) {
            i14 |= 16;
        }
        c30145k.f123290X = this.f123201U;
        if ((i13 & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ) == 131072) {
            i14 |= 32;
        }
        c30145k.f123291Y = this.f123202V;
        if ((this.f123208z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) == 262144) {
            this.f123203W = Collections.unmodifiableList(this.f123203W);
            this.f123208z &= -262145;
        }
        c30145k.f123292Z = this.f123203W;
        if ((i13 & 524288) == 524288) {
            i14 |= 64;
        }
        c30145k.f123293a0 = this.f123204X;
        if ((this.f123208z & 1048576) == 1048576) {
            this.f123205Y = Collections.unmodifiableList(this.f123205Y);
            this.f123208z &= -1048577;
        }
        c30145k.f123294b0 = this.f123205Y;
        if ((i13 & 2097152) == 2097152) {
            i14 |= 128;
        }
        c30145k.f123295c0 = this.f123206Z;
        if ((this.f123208z & 4194304) == 4194304) {
            this.f123207a0 = Collections.unmodifiableList(this.f123207a0);
            this.f123208z &= -4194305;
        }
        c30145k.f123296d0 = this.f123207a0;
        c30145k.f123300y = i14;
        return c30145k;
    }

    /* JADX INFO: renamed from: o */
    public final void m92318o(C30145k c30145k) {
        C30144j1 c30144j1;
        C30123c1 c30123c1;
        C30171w0 c30171w0;
        if (c30145k == C30145k.f123269g0) {
            return;
        }
        int i13 = c30145k.f123300y;
        if ((i13 & 1) == 1) {
            int i14 = c30145k.f123301z;
            this.f123208z = 1 | this.f123208z;
            this.f123185E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30145k.f123271E;
            this.f123208z = 2 | this.f123208z;
            this.f123186F = i15;
        }
        if ((i13 & 4) == 4) {
            int i16 = c30145k.f123272F;
            this.f123208z = 4 | this.f123208z;
            this.f123187G = i16;
        }
        if (!c30145k.f123273G.isEmpty()) {
            if (this.f123188H.isEmpty()) {
                this.f123188H = c30145k.f123273G;
                this.f123208z &= -9;
            } else {
                if ((this.f123208z & 8) != 8) {
                    this.f123188H = new ArrayList(this.f123188H);
                    this.f123208z |= 8;
                }
                this.f123188H.addAll(c30145k.f123273G);
            }
        }
        if (!c30145k.f123274H.isEmpty()) {
            if (this.f123189I.isEmpty()) {
                this.f123189I = c30145k.f123274H;
                this.f123208z &= -17;
            } else {
                if ((this.f123208z & 16) != 16) {
                    this.f123189I = new ArrayList(this.f123189I);
                    this.f123208z |= 16;
                }
                this.f123189I.addAll(c30145k.f123274H);
            }
        }
        if (!c30145k.f123275I.isEmpty()) {
            if (this.f123190J.isEmpty()) {
                this.f123190J = c30145k.f123275I;
                this.f123208z &= -33;
            } else {
                if ((this.f123208z & 32) != 32) {
                    this.f123190J = new ArrayList(this.f123190J);
                    this.f123208z |= 32;
                }
                this.f123190J.addAll(c30145k.f123275I);
            }
        }
        if (!c30145k.f123277K.isEmpty()) {
            if (this.f123191K.isEmpty()) {
                this.f123191K = c30145k.f123277K;
                this.f123208z &= -65;
            } else {
                if ((this.f123208z & 64) != 64) {
                    this.f123191K = new ArrayList(this.f123191K);
                    this.f123208z |= 64;
                }
                this.f123191K.addAll(c30145k.f123277K);
            }
        }
        if (!c30145k.f123279M.isEmpty()) {
            if (this.f123192L.isEmpty()) {
                this.f123192L = c30145k.f123279M;
                this.f123208z &= -129;
            } else {
                if ((this.f123208z & 128) != 128) {
                    this.f123192L = new ArrayList(this.f123192L);
                    this.f123208z |= 128;
                }
                this.f123192L.addAll(c30145k.f123279M);
            }
        }
        if (!c30145k.f123280N.isEmpty()) {
            if (this.f123193M.isEmpty()) {
                this.f123193M = c30145k.f123280N;
                this.f123208z &= -257;
            } else {
                if ((this.f123208z & 256) != 256) {
                    this.f123193M = new ArrayList(this.f123193M);
                    this.f123208z |= 256;
                }
                this.f123193M.addAll(c30145k.f123280N);
            }
        }
        if (!c30145k.f123282P.isEmpty()) {
            if (this.f123194N.isEmpty()) {
                this.f123194N = c30145k.f123282P;
                this.f123208z &= -513;
            } else {
                if ((this.f123208z & 512) != 512) {
                    this.f123194N = new ArrayList(this.f123194N);
                    this.f123208z |= 512;
                }
                this.f123194N.addAll(c30145k.f123282P);
            }
        }
        if (!c30145k.f123283Q.isEmpty()) {
            if (this.f123195O.isEmpty()) {
                this.f123195O = c30145k.f123283Q;
                this.f123208z &= -1025;
            } else {
                if ((this.f123208z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) != 1024) {
                    this.f123195O = new ArrayList(this.f123195O);
                    this.f123208z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                }
                this.f123195O.addAll(c30145k.f123283Q);
            }
        }
        if (!c30145k.f123284R.isEmpty()) {
            if (this.f123196P.isEmpty()) {
                this.f123196P = c30145k.f123284R;
                this.f123208z &= -2049;
            } else {
                if ((this.f123208z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 2048) {
                    this.f123196P = new ArrayList(this.f123196P);
                    this.f123208z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                }
                this.f123196P.addAll(c30145k.f123284R);
            }
        }
        if (!c30145k.f123285S.isEmpty()) {
            if (this.f123197Q.isEmpty()) {
                this.f123197Q = c30145k.f123285S;
                this.f123208z &= -4097;
            } else {
                if ((this.f123208z & 4096) != 4096) {
                    this.f123197Q = new ArrayList(this.f123197Q);
                    this.f123208z |= 4096;
                }
                this.f123197Q.addAll(c30145k.f123285S);
            }
        }
        if (!c30145k.f123286T.isEmpty()) {
            if (this.f123198R.isEmpty()) {
                this.f123198R = c30145k.f123286T;
                this.f123208z &= -8193;
            } else {
                if ((this.f123208z & DfuBaseService.ERROR_REMOTE_MASK) != 8192) {
                    this.f123198R = new ArrayList(this.f123198R);
                    this.f123208z |= DfuBaseService.ERROR_REMOTE_MASK;
                }
                this.f123198R.addAll(c30145k.f123286T);
            }
        }
        if (!c30145k.f123287U.isEmpty()) {
            if (this.f123199S.isEmpty()) {
                this.f123199S = c30145k.f123287U;
                this.f123208z &= -16385;
            } else {
                if ((this.f123208z & DfuBaseService.ERROR_CONNECTION_MASK) != 16384) {
                    this.f123199S = new ArrayList(this.f123199S);
                    this.f123208z |= DfuBaseService.ERROR_CONNECTION_MASK;
                }
                this.f123199S.addAll(c30145k.f123287U);
            }
        }
        int i17 = c30145k.f123300y;
        if ((i17 & 8) == 8) {
            int i18 = c30145k.f123289W;
            this.f123208z |= 32768;
            this.f123200T = i18;
        }
        if ((i17 & 16) == 16) {
            C30171w0 c30171w1 = c30145k.f123290X;
            if ((this.f123208z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST) != 65536 || (c30171w0 = this.f123201U) == C30171w0.f123475U) {
                this.f123201U = c30171w1;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w0);
                c30169v0M92361r.m92357n(c30171w1);
                this.f123201U = c30169v0M92361r.m92356k();
            }
            this.f123208z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST;
        }
        if ((c30145k.f123300y & 32) == 32) {
            int i19 = c30145k.f123291Y;
            this.f123208z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ;
            this.f123202V = i19;
        }
        if (!c30145k.f123292Z.isEmpty()) {
            if (this.f123203W.isEmpty()) {
                this.f123203W = c30145k.f123292Z;
                this.f123208z &= -262145;
            } else {
                if ((this.f123208z & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION) != 262144) {
                    this.f123203W = new ArrayList(this.f123203W);
                    this.f123208z |= ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION;
                }
                this.f123203W.addAll(c30145k.f123292Z);
            }
        }
        if ((c30145k.f123300y & 64) == 64) {
            C30123c1 c30123c2 = c30145k.f123293a0;
            if ((this.f123208z & 524288) != 524288 || (c30123c1 = this.f123204X) == C30123c1.f123059G) {
                this.f123204X = c30123c2;
            } else {
                C30133g c30133gM92293i = C30123c1.m92293i(c30123c1);
                c30133gM92293i.m92311o(c30123c2);
                this.f123204X = c30133gM92293i.m92309k();
            }
            this.f123208z |= 524288;
        }
        if (!c30145k.f123294b0.isEmpty()) {
            if (this.f123205Y.isEmpty()) {
                this.f123205Y = c30145k.f123294b0;
                this.f123208z &= -1048577;
            } else {
                if ((this.f123208z & 1048576) != 1048576) {
                    this.f123205Y = new ArrayList(this.f123205Y);
                    this.f123208z |= 1048576;
                }
                this.f123205Y.addAll(c30145k.f123294b0);
            }
        }
        if ((c30145k.f123300y & 128) == 128) {
            C30144j1 c30144j2 = c30145k.f123295c0;
            if ((this.f123208z & 2097152) != 2097152 || (c30144j1 = this.f123206Z) == C30144j1.f123263E) {
                this.f123206Z = c30144j2;
            } else {
                C30156p c30156p = new C30156p(1);
                c30156p.f123384z = Collections.EMPTY_LIST;
                c30156p.m92341n(c30144j1);
                c30156p.m92341n(c30144j2);
                this.f123206Z = c30156p.m92339k();
            }
            this.f123208z |= 2097152;
        }
        if (!c30145k.f123296d0.isEmpty()) {
            if (this.f123207a0.isEmpty()) {
                this.f123207a0 = c30145k.f123296d0;
                this.f123208z &= -4194305;
            } else {
                if ((this.f123208z & 4194304) != 4194304) {
                    this.f123207a0 = new ArrayList(this.f123207a0);
                    this.f123208z |= 4194304;
                }
                this.f123207a0.addAll(c30145k.f123296d0);
            }
        }
        m118816j(c30145k);
        this.f158353w = this.f158353w.m118743c(c30145k.f123299x);
    }
}
