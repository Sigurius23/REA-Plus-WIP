package qa3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p715kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import p715kotlin.reflect.jvm.internal.impl.protobuf.UninitializedMessageException;
import wa3.AbstractC37002k;
import wa3.AbstractC37004l;
import wa3.AbstractC37012p;
import wa3.C36992f;
import wa3.C36998i;
import wa3.InterfaceC37019v;

/* JADX INFO: renamed from: qa3.z0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C30177z0 extends AbstractC37004l {

    /* JADX INFO: renamed from: E */
    public int f123544E;

    /* JADX INFO: renamed from: F */
    public int f123545F;

    /* JADX INFO: renamed from: G */
    public boolean f123546G;

    /* JADX INFO: renamed from: H */
    public EnumC30117a1 f123547H;

    /* JADX INFO: renamed from: I */
    public List f123548I;

    /* JADX INFO: renamed from: J */
    public List f123549J;

    /* JADX INFO: renamed from: K */
    public List f123550K;

    /* JADX INFO: renamed from: z */
    public int f123551z;

    /* JADX INFO: renamed from: k */
    public static C30177z0 m92371k() {
        C30177z0 c30177z0 = new C30177z0();
        c30177z0.f123547H = EnumC30117a1.INV;
        List list = Collections.EMPTY_LIST;
        c30177z0.f123548I = list;
        c30177z0.f123549J = list;
        c30177z0.f123550K = list;
        return c30177z0;
    }

    public final Object clone() {
        C30177z0 c30177z0 = new C30177z0();
        c30177z0.f123547H = EnumC30117a1.INV;
        List list = Collections.EMPTY_LIST;
        c30177z0.f123548I = list;
        c30177z0.f123549J = list;
        c30177z0.f123550K = list;
        c30177z0.m92373n(m92372l());
        return c30177z0;
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: g */
    public final InterfaceC37019v mo92277g() {
        C30120b1 c30120b1M92372l = m92372l();
        if (c30120b1M92372l.mo92260b()) {
            return c30120b1M92372l;
        }
        throw new UninitializedMessageException();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: h */
    public final AbstractC37002k mo92278h(C36992f c36992f, C36998i c36998i) throws Throwable {
        C30120b1 c30120b1 = null;
        try {
            try {
                C30120b1.f123009O.getClass();
                m92373n(new C30120b1(c36992f, c36998i));
                return this;
            } catch (InvalidProtocolBufferException e5) {
                C30120b1 c30120b2 = (C30120b1) e5.f89345w;
                try {
                    throw e5;
                } catch (Throwable th3) {
                    th = th3;
                    c30120b1 = c30120b2;
                    if (c30120b1 != null) {
                        m92373n(c30120b1);
                    }
                    throw th;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            if (c30120b1 != null) {
                m92373n(c30120b1);
            }
            throw th;
        }
    }

    @Override // wa3.AbstractC37002k
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ AbstractC37002k mo92279i(AbstractC37012p abstractC37012p) {
        m92373n((C30120b1) abstractC37012p);
        return this;
    }

    /* JADX INFO: renamed from: l */
    public final C30120b1 m92372l() {
        C30120b1 c30120b1 = new C30120b1(this);
        int i13 = this.f123551z;
        int i14 = (i13 & 1) != 1 ? 0 : 1;
        c30120b1.f123021z = this.f123544E;
        if ((i13 & 2) == 2) {
            i14 |= 2;
        }
        c30120b1.f123010E = this.f123545F;
        if ((i13 & 4) == 4) {
            i14 |= 4;
        }
        c30120b1.f123011F = this.f123546G;
        if ((i13 & 8) == 8) {
            i14 |= 8;
        }
        c30120b1.f123012G = this.f123547H;
        if ((i13 & 16) == 16) {
            this.f123548I = Collections.unmodifiableList(this.f123548I);
            this.f123551z &= -17;
        }
        c30120b1.f123013H = this.f123548I;
        if ((this.f123551z & 32) == 32) {
            this.f123549J = Collections.unmodifiableList(this.f123549J);
            this.f123551z &= -33;
        }
        c30120b1.f123014I = this.f123549J;
        if ((this.f123551z & 64) == 64) {
            this.f123550K = Collections.unmodifiableList(this.f123550K);
            this.f123551z &= -65;
        }
        c30120b1.f123016K = this.f123550K;
        c30120b1.f123020y = i14;
        return c30120b1;
    }

    /* JADX INFO: renamed from: n */
    public final void m92373n(C30120b1 c30120b1) {
        if (c30120b1 == C30120b1.f123008N) {
            return;
        }
        int i13 = c30120b1.f123020y;
        if ((i13 & 1) == 1) {
            int i14 = c30120b1.f123021z;
            this.f123551z = 1 | this.f123551z;
            this.f123544E = i14;
        }
        if ((i13 & 2) == 2) {
            int i15 = c30120b1.f123010E;
            this.f123551z = 2 | this.f123551z;
            this.f123545F = i15;
        }
        if ((i13 & 4) == 4) {
            boolean z4 = c30120b1.f123011F;
            this.f123551z = 4 | this.f123551z;
            this.f123546G = z4;
        }
        if ((i13 & 8) == 8) {
            EnumC30117a1 enumC30117a1 = c30120b1.f123012G;
            enumC30117a1.getClass();
            this.f123551z = 8 | this.f123551z;
            this.f123547H = enumC30117a1;
        }
        if (!c30120b1.f123013H.isEmpty()) {
            if (this.f123548I.isEmpty()) {
                this.f123548I = c30120b1.f123013H;
                this.f123551z &= -17;
            } else {
                if ((this.f123551z & 16) != 16) {
                    this.f123548I = new ArrayList(this.f123548I);
                    this.f123551z |= 16;
                }
                this.f123548I.addAll(c30120b1.f123013H);
            }
        }
        if (!c30120b1.f123014I.isEmpty()) {
            if (this.f123549J.isEmpty()) {
                this.f123549J = c30120b1.f123014I;
                this.f123551z &= -33;
            } else {
                if ((this.f123551z & 32) != 32) {
                    this.f123549J = new ArrayList(this.f123549J);
                    this.f123551z |= 32;
                }
                this.f123549J.addAll(c30120b1.f123014I);
            }
        }
        if (!c30120b1.f123016K.isEmpty()) {
            if (this.f123550K.isEmpty()) {
                this.f123550K = c30120b1.f123016K;
                this.f123551z &= -65;
            } else {
                if ((this.f123551z & 64) != 64) {
                    this.f123550K = new ArrayList(this.f123550K);
                    this.f123551z |= 64;
                }
                this.f123550K.addAll(c30120b1.f123016K);
            }
        }
        m118816j(c30120b1);
        this.f158353w = this.f158353w.m118743c(c30120b1.f123019x);
    }
}
