package d40;

import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p163g1.C14970c1;
import p208i2.C17919x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: d40.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C11669n {

    /* JADX INFO: renamed from: a */
    public final long f37668a;

    /* JADX INFO: renamed from: b */
    public final long f37669b;

    /* JADX INFO: renamed from: c */
    public final long f37670c;

    /* JADX INFO: renamed from: d */
    public final long f37671d;

    /* JADX INFO: renamed from: e */
    public final long f37672e;

    /* JADX INFO: renamed from: f */
    public final long f37673f;

    /* JADX INFO: renamed from: g */
    public final long f37674g;

    /* JADX INFO: renamed from: h */
    public final long f37675h;

    /* JADX INFO: renamed from: i */
    public final C14970c1 f37676i;

    public C11669n(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, C14970c1 c14970c1) {
        this.f37668a = j7;
        this.f37669b = j13;
        this.f37670c = j14;
        this.f37671d = j15;
        this.f37672e = j16;
        this.f37673f = j17;
        this.f37674g = j18;
        this.f37675h = j19;
        this.f37676i = c14970c1;
    }

    /* JADX INFO: renamed from: a */
    public static C11669n m31071a(C11669n c11669n, long j7, long j13, long j14, long j15, long j16, long j17, long j18, C14970c1 c14970c1, int i13) {
        long j19 = (i13 & 16) != 0 ? c11669n.f37672e : j16;
        long j24 = c11669n.f37673f;
        long j25 = (i13 & 128) != 0 ? c11669n.f37675h : j18;
        c11669n.getClass();
        return new C11669n(j7, j13, j14, j15, j19, j24, j17, j25, c14970c1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11669n)) {
            return false;
        }
        C11669n c11669n = (C11669n) obj;
        return C17919x.m51542d(this.f37668a, c11669n.f37668a) && C17919x.m51542d(this.f37669b, c11669n.f37669b) && C17919x.m51542d(this.f37670c, c11669n.f37670c) && C17919x.m51542d(this.f37671d, c11669n.f37671d) && C17919x.m51542d(this.f37672e, c11669n.f37672e) && C17919x.m51542d(this.f37673f, c11669n.f37673f) && C17919x.m51542d(this.f37674g, c11669n.f37674g) && C17919x.m51542d(this.f37675h, c11669n.f37675h) && AbstractC22676k.m65745e(this.f37676i, c11669n.f37676i);
    }

    public final int hashCode() {
        int i13 = C17919x.f69638o;
        return this.f37676i.hashCode() + AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(AbstractC11266d.m30451e(Long.hashCode(this.f37668a) * 31, this.f37669b, 31), this.f37670c, 31), this.f37671d, 31), this.f37672e, 31), this.f37673f, 31), this.f37674g, 31), this.f37675h, 31);
    }

    public final String toString() {
        String strM51548j = C17919x.m51548j(this.f37668a);
        String strM51548j2 = C17919x.m51548j(this.f37669b);
        String strM51548j3 = C17919x.m51548j(this.f37670c);
        String strM51548j4 = C17919x.m51548j(this.f37671d);
        String strM51548j5 = C17919x.m51548j(this.f37672e);
        String strM51548j6 = C17919x.m51548j(this.f37673f);
        String strM51548j7 = C17919x.m51548j(this.f37674g);
        String strM51548j8 = C17919x.m51548j(this.f37675h);
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StripeColors(component=", strM51548j, ", componentBorder=", strM51548j2, ", componentDivider=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j3, ", onComponent=", strM51548j4, ", subtitle=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j5, ", textCursor=", strM51548j6, ", placeholderText=");
        AbstractC11266d.m30444B(sbM32001t, strM51548j7, ", appBarIcon=", strM51548j8, ", materialColors=");
        sbM32001t.append(this.f37676i);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }
}
