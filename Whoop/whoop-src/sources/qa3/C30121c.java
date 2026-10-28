package qa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import no.nordicsemi.android.dfu.DfuBaseService;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;
import wa3.InterfaceC37020w;

/* JADX INFO: renamed from: qa3.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C30121c extends AbstractC37002k implements InterfaceC37020w {

    /* JADX INFO: renamed from: E */
    public float f123022E;

    /* JADX INFO: renamed from: F */
    public double f123023F;

    /* JADX INFO: renamed from: G */
    public int f123024G;

    /* JADX INFO: renamed from: H */
    public int f123025H;

    /* JADX INFO: renamed from: I */
    public int f123026I;

    /* JADX INFO: renamed from: J */
    public C30136h f123027J;

    /* JADX INFO: renamed from: K */
    public List f123028K;

    /* JADX INFO: renamed from: L */
    public int f123029L;

    /* JADX INFO: renamed from: M */
    public int f123030M;

    /* JADX INFO: renamed from: x */
    public int f123031x;

    /* JADX INFO: renamed from: y */
    public EnumC30124d f123032y;

    /* JADX INFO: renamed from: z */
    public long f123033z;

    /* JADX INFO: renamed from: k */
    public static C30121c m92289k() {
        C30121c c30121c = new C30121c();
        c30121c.f123032y = EnumC30124d.BYTE;
        c30121c.f123027J = C30136h.f123167G;
        c30121c.f123028K = Collections.EMPTY_LIST;
        return c30121c;
    }

    public final Object clone() {
        C30121c c30121cM92289k = m92289k();
        c30121cM92289k.m92291l(m92290j());
        return c30121cM92289k;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30127e c30127eM92290j = m92290j();
        if (c30127eM92290j.mo92260b()) {
            return c30127eM92290j;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30127e c30127e = null;
        try {
            try {
                C30127e.f123094Q.getClass();
                m92291l(new C30127e(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30127e c30127e2 = (C30127e) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30127e = c30127e2;
                    if (c30127e != null) {
                        m92291l(c30127e);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30127e != null) {
                m92291l(c30127e);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92291l((C30127e) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: j */
    public final C30127e m92290j() {
        C30127e c30127e = new C30127e(this);
        int i13 = this.f123031x;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30127e.f123108y = this.f123032y;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30127e.f123109z = this.f123033z;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30127e.f123095E = this.f123022E;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30127e.f123096F = this.f123023F;
        if ((i13 & 16) == 16) {
            i14 |= 16;
        }
        c30127e.f123097G = this.f123024G;
        if ((i13 & 32) == 32) {
            i14 |= 32;
        }
        c30127e.f123098H = this.f123025H;
        if ((i13 & 64) == 64) {
            i14 |= 64;
        }
        c30127e.f123099I = this.f123026I;
        if ((i13 & 128) == 128) {
            i14 |= 128;
        }
        c30127e.f123100J = this.f123027J;
        if ((i13 & 256) == 256) {
            this.f123028K = Collections.unmodifiableList(this.f123028K);
            this.f123031x &= -257;
        }
        c30127e.f123101K = this.f123028K;
        if ((i13 & 512) == 512) {
            i14 |= 256;
        }
        c30127e.f123102L = this.f123029L;
        if ((i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED) == 1024) {
            i14 |= 512;
        }
        c30127e.f123103M = this.f123030M;
        c30127e.f123107x = i14;
        return c30127e;
    }

    /* JADX INFO: renamed from: l */
    public final void m92291l(C30127e c30127e) {
        C30136h c30136h;
        if (c30127e == C30127e.f123093P) {
            return;
        }
        if ((c30127e.f123107x & 1) == 1) {
            EnumC30124d enumC30124d = c30127e.f123108y;
            enumC30124d.getClass();
            this.f123031x = 1 | this.f123031x;
            this.f123032y = enumC30124d;
        }
        int i13 = c30127e.f123107x;
        if ((i13 & 2) == 2) {
            long j7 = c30127e.f123109z;
            this.f123031x |= 2;
            this.f123033z = j7;
        }
        if ((i13 & 4) == 4) {
            float f13 = c30127e.f123095E;
            this.f123031x = 4 | this.f123031x;
            this.f123022E = f13;
        }
        if ((i13 & 8) == 8) {
            double d3 = c30127e.f123096F;
            this.f123031x |= 8;
            this.f123023F = d3;
        }
        if ((i13 & 16) == 16) {
            int i14 = c30127e.f123097G;
            this.f123031x = 16 | this.f123031x;
            this.f123024G = i14;
        }
        if ((i13 & 32) == 32) {
            int i15 = c30127e.f123098H;
            this.f123031x = 32 | this.f123031x;
            this.f123025H = i15;
        }
        if ((i13 & 64) == 64) {
            int i16 = c30127e.f123099I;
            this.f123031x = 64 | this.f123031x;
            this.f123026I = i16;
        }
        if ((i13 & 128) == 128) {
            C30136h c30136h2 = c30127e.f123100J;
            if ((this.f123031x & 128) != 128 || (c30136h = this.f123027J) == C30136h.f123167G) {
                this.f123027J = c30136h2;
            } else {
                C30133g c30133g = new C30133g(0);
                c30133g.f123150z = Collections.EMPTY_LIST;
                c30133g.m92310n(c30136h);
                c30133g.m92310n(c30136h2);
                this.f123027J = c30133g.m92308j();
            }
            this.f123031x |= 128;
        }
        if (!c30127e.f123101K.isEmpty()) {
            if (this.f123028K.isEmpty()) {
                this.f123028K = c30127e.f123101K;
                this.f123031x &= -257;
            } else {
                if ((this.f123031x & 256) != 256) {
                    this.f123028K = new ArrayList(this.f123028K);
                    this.f123031x |= 256;
                }
                this.f123028K.addAll(c30127e.f123101K);
            }
        }
        int i17 = c30127e.f123107x;
        if ((i17 & 256) == 256) {
            int i18 = c30127e.f123102L;
            this.f123031x |= 512;
            this.f123029L = i18;
        }
        if ((i17 & 512) == 512) {
            int i19 = c30127e.f123103M;
            this.f123031x |= DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
            this.f123030M = i19;
        }
        this.f158353w = this.f158353w.m118743c(c30127e.f123106w);
    }
}
