package qa3;

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

/* JADX INFO: renamed from: qa3.v0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C30169v0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public List f123456E;

    /* JADX INFO: renamed from: F */
    public boolean f123457F;

    /* JADX INFO: renamed from: G */
    public int f123458G;

    /* JADX INFO: renamed from: H */
    public C30171w0 f123459H;

    /* JADX INFO: renamed from: I */
    public int f123460I;

    /* JADX INFO: renamed from: J */
    public int f123461J;

    /* JADX INFO: renamed from: K */
    public int f123462K;

    /* JADX INFO: renamed from: L */
    public int f123463L;

    /* JADX INFO: renamed from: M */
    public int f123464M;

    /* JADX INFO: renamed from: N */
    public C30171w0 f123465N;

    /* JADX INFO: renamed from: O */
    public int f123466O;

    /* JADX INFO: renamed from: P */
    public C30171w0 f123467P;

    /* JADX INFO: renamed from: Q */
    public int f123468Q;

    /* JADX INFO: renamed from: R */
    public int f123469R;

    /* JADX INFO: renamed from: S */
    public List f123470S;

    /* JADX INFO: renamed from: z */
    public int f123471z;

    /* JADX INFO: renamed from: l */
    public static C30169v0 m92355l() {
        C30169v0 c30169v0 = new C30169v0();
        List list = Collections.EMPTY_LIST;
        c30169v0.f123456E = list;
        C30171w0 c30171w0 = C30171w0.f123475U;
        c30169v0.f123459H = c30171w0;
        c30169v0.f123465N = c30171w0;
        c30169v0.f123467P = c30171w0;
        c30169v0.f123470S = list;
        return c30169v0;
    }

    public final Object clone() {
        C30169v0 c30169v0M92355l = m92355l();
        c30169v0M92355l.m92357n(m92356k());
        return c30169v0M92355l;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30171w0 c30171w0M92356k = m92356k();
        if (c30171w0M92356k.mo92260b()) {
            return c30171w0M92356k;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30171w0 c30171w0 = null;
        try {
            try {
                C30171w0.f123476V.getClass();
                m92357n(new C30171w0(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30171w0 c30171w1 = (C30171w0) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30171w0 = c30171w1;
                    if (c30171w0 != null) {
                        m92357n(c30171w0);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30171w0 != null) {
                m92357n(c30171w0);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92357n((C30171w0) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final C30171w0 m92356k() {
        C30171w0 c30171w0 = new C30171w0(this);
        int i13 = this.f123471z;
        if ((i13 & 1) == 1) {
            this.f123456E = Collections.unmodifiableList(this.f123456E);
            this.f123471z &= -2;
        }
        c30171w0.f123495z = this.f123456E;
        int i14 = (i13 & 2) != 2 ? 0 : 1;
        c30171w0.f123477E = this.f123457F;
        if ((i13 & 4) == 4) {
            i14 |= 2;
        }
        c30171w0.f123478F = this.f123458G;
        if ((i13 & 8) == 8) {
            i14 |= 4;
        }
        c30171w0.f123479G = this.f123459H;
        if ((i13 & 16) == 16) {
            i14 |= 8;
        }
        c30171w0.f123480H = this.f123460I;
        if ((i13 & 32) == 32) {
            i14 |= 16;
        }
        c30171w0.f123481I = this.f123461J;
        if ((i13 & 64) == 64) {
            i14 |= 32;
        }
        c30171w0.f123482J = this.f123462K;
        if ((i13 & 128) == 128) {
            i14 |= 64;
        }
        c30171w0.f123483K = this.f123463L;
        if ((i13 & 256) == 256) {
            i14 |= 128;
        }
        c30171w0.f123484L = this.f123464M;
        if ((i13 & 512) == 512) {
            i14 |= 256;
        }
        c30171w0.f123485M = this.f123465N;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            i14 |= 512;
        }
        c30171w0.f123486N = this.f123466O;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
        }
        c30171w0.f123487O = this.f123467P;
        if ((i13 & 4096) == 4096) {
            i14 |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        c30171w0.f123488P = this.f123468Q;
        if ((i13 & DfuBaseService.ERROR_REMOTE_MASK) == 8192) {
            i14 |= 4096;
        }
        c30171w0.f123489Q = this.f123469R;
        if ((this.f123471z & DfuBaseService.ERROR_CONNECTION_MASK) == 16384) {
            this.f123470S = Collections.unmodifiableList(this.f123470S);
            this.f123471z &= -16385;
        }
        c30171w0.f123490R = this.f123470S;
        c30171w0.f123494y = i14;
        return c30171w0;
    }

    /* JADX INFO: renamed from: n */
    public final C30169v0 m92357n(C30171w0 c30171w0) {
        C30171w0 c30171w1;
        C30171w0 c30171w2;
        C30171w0 c30171w3;
        C30171w0 c30171w4 = C30171w0.f123475U;
        if (c30171w0 == c30171w4) {
            return this;
        }
        if (!c30171w0.f123495z.isEmpty()) {
            if (this.f123456E.isEmpty()) {
                this.f123456E = c30171w0.f123495z;
                this.f123471z &= -2;
            } else {
                if ((this.f123471z & 1) != 1) {
                    this.f123456E = new ArrayList(this.f123456E);
                    this.f123471z |= 1;
                }
                this.f123456E.addAll(c30171w0.f123495z);
            }
        }
        int i13 = c30171w0.f123494y;
        if ((i13 & 1) == 1) {
            boolean z4 = c30171w0.f123477E;
            this.f123471z |= 2;
            this.f123457F = z4;
        }
        if ((i13 & 2) == 2) {
            int i14 = c30171w0.f123478F;
            this.f123471z |= 4;
            this.f123458G = i14;
        }
        if ((i13 & 4) == 4) {
            C30171w0 c30171w5 = c30171w0.f123479G;
            if ((this.f123471z & 8) != 8 || (c30171w3 = this.f123459H) == c30171w4) {
                this.f123459H = c30171w5;
            } else {
                C30169v0 c30169v0M92361r = C30171w0.m92361r(c30171w3);
                c30169v0M92361r.m92357n(c30171w5);
                this.f123459H = c30169v0M92361r.m92356k();
            }
            this.f123471z |= 8;
        }
        if ((c30171w0.f123494y & 8) == 8) {
            int i15 = c30171w0.f123480H;
            this.f123471z |= 16;
            this.f123460I = i15;
        }
        if (c30171w0.m92362p()) {
            int i16 = c30171w0.f123481I;
            this.f123471z |= 32;
            this.f123461J = i16;
        }
        int i17 = c30171w0.f123494y;
        if ((i17 & 32) == 32) {
            int i18 = c30171w0.f123482J;
            this.f123471z |= 64;
            this.f123462K = i18;
        }
        if ((i17 & 64) == 64) {
            int i19 = c30171w0.f123483K;
            this.f123471z |= 128;
            this.f123463L = i19;
        }
        if ((i17 & 128) == 128) {
            int i24 = c30171w0.f123484L;
            this.f123471z |= 256;
            this.f123464M = i24;
        }
        if ((i17 & 256) == 256) {
            C30171w0 c30171w6 = c30171w0.f123485M;
            if ((this.f123471z & 512) != 512 || (c30171w2 = this.f123465N) == c30171w4) {
                this.f123465N = c30171w6;
            } else {
                C30169v0 c30169v0M92361r2 = C30171w0.m92361r(c30171w2);
                c30169v0M92361r2.m92357n(c30171w6);
                this.f123465N = c30169v0M92361r2.m92356k();
            }
            this.f123471z |= 512;
        }
        int i25 = c30171w0.f123494y;
        if ((i25 & 512) == 512) {
            int i26 = c30171w0.f123486N;
            this.f123471z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            this.f123466O = i26;
        }
        if ((i25 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            C30171w0 c30171w7 = c30171w0.f123487O;
            if ((this.f123471z & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 2048 || (c30171w1 = this.f123467P) == c30171w4) {
                this.f123467P = c30171w7;
            } else {
                C30169v0 c30169v0M92361r3 = C30171w0.m92361r(c30171w1);
                c30169v0M92361r3.m92357n(c30171w7);
                this.f123467P = c30169v0M92361r3.m92356k();
            }
            this.f123471z |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
        }
        int i27 = c30171w0.f123494y;
        if ((i27 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) == 2048) {
            int i28 = c30171w0.f123488P;
            this.f123471z |= 4096;
            this.f123468Q = i28;
        }
        if ((i27 & 4096) == 4096) {
            int i29 = c30171w0.f123489Q;
            this.f123471z |= DfuBaseService.ERROR_REMOTE_MASK;
            this.f123469R = i29;
        }
        if (!c30171w0.f123490R.isEmpty()) {
            if (this.f123470S.isEmpty()) {
                this.f123470S = c30171w0.f123490R;
                this.f123471z &= -16385;
            } else {
                if ((this.f123471z & DfuBaseService.ERROR_CONNECTION_MASK) != 16384) {
                    this.f123470S = new ArrayList(this.f123470S);
                    this.f123471z |= DfuBaseService.ERROR_CONNECTION_MASK;
                }
                this.f123470S.addAll(c30171w0.f123490R);
            }
        }
        m118816j(c30171w0);
        this.f158353w = this.f158353w.m118743c(c30171w0.f123493x);
        return this;
    }
}
