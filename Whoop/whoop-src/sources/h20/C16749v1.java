package h20;

import android.os.Parcel;
import android.os.Parcelable;
import d40.AbstractC11672q;
import d40.C11669n;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p163g1.C14970c1;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16749v1 implements Parcelable {
    public static final Parcelable.Creator<C16749v1> CREATOR = new C16699n(24);

    /* JADX INFO: renamed from: L */
    public static final C16749v1 f64317L;

    /* JADX INFO: renamed from: M */
    public static final C16749v1 f64318M;

    /* JADX INFO: renamed from: E */
    public final int f64319E;

    /* JADX INFO: renamed from: F */
    public final int f64320F;

    /* JADX INFO: renamed from: G */
    public final int f64321G;

    /* JADX INFO: renamed from: H */
    public final int f64322H;

    /* JADX INFO: renamed from: I */
    public final int f64323I;

    /* JADX INFO: renamed from: J */
    public final int f64324J;

    /* JADX INFO: renamed from: K */
    public final int f64325K;

    /* JADX INFO: renamed from: w */
    public final int f64326w;

    /* JADX INFO: renamed from: x */
    public final int f64327x;

    /* JADX INFO: renamed from: y */
    public final int f64328y;

    /* JADX INFO: renamed from: z */
    public final int f64329z;

    static {
        C11669n c11669n = AbstractC11672q.f37691a;
        long jM43091f = c11669n.f37676i.m43091f();
        C14970c1 c14970c1 = c11669n.f37676i;
        f64317L = new C16749v1(jM43091f, c14970c1.m43093h(), c11669n.f37668a, c11669n.f37669b, c11669n.f37670c, c11669n.f37671d, c11669n.f37672e, c11669n.f37674g, c14970c1.m43090e(), c11669n.f37675h, c14970c1.m43088c());
        C11669n c11669n2 = AbstractC11672q.f37692b;
        long jM43091f2 = c11669n2.f37676i.m43091f();
        C14970c1 c14970c2 = c11669n2.f37676i;
        f64318M = new C16749v1(jM43091f2, c14970c2.m43093h(), c11669n2.f37668a, c11669n2.f37669b, c11669n2.f37670c, c11669n2.f37671d, c11669n2.f37672e, c11669n2.f37674g, c14970c2.m43090e(), c11669n2.f37675h, c14970c2.m43088c());
    }

    public C16749v1(int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24, int i25, int i26, int i27) {
        this.f64326w = i13;
        this.f64327x = i14;
        this.f64328y = i15;
        this.f64329z = i16;
        this.f64319E = i17;
        this.f64320F = i18;
        this.f64321G = i19;
        this.f64322H = i24;
        this.f64323I = i25;
        this.f64324J = i26;
        this.f64325K = i27;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16749v1)) {
            return false;
        }
        C16749v1 c16749v1 = (C16749v1) obj;
        return this.f64326w == c16749v1.f64326w && this.f64327x == c16749v1.f64327x && this.f64328y == c16749v1.f64328y && this.f64329z == c16749v1.f64329z && this.f64319E == c16749v1.f64319E && this.f64320F == c16749v1.f64320F && this.f64321G == c16749v1.f64321G && this.f64322H == c16749v1.f64322H && this.f64323I == c16749v1.f64323I && this.f64324J == c16749v1.f64324J && this.f64325K == c16749v1.f64325K;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.f64326w * 31) + this.f64327x) * 31) + this.f64328y) * 31) + this.f64329z) * 31) + this.f64319E) * 31) + this.f64320F) * 31) + this.f64321G) * 31) + this.f64322H) * 31) + this.f64323I) * 31) + this.f64324J) * 31) + this.f64325K;
    }

    public final String toString() {
        StringBuilder sbM30465s = AbstractC11266d.m30465s(this.f64326w, this.f64327x, "Colors(primary=", ", surface=", ", component=");
        AbstractC30802r.m94773v(sbM30465s, this.f64328y, ", componentBorder=", this.f64329z, ", componentDivider=");
        AbstractC30802r.m94773v(sbM30465s, this.f64319E, ", onComponent=", this.f64320F, ", onSurface=");
        AbstractC30802r.m94773v(sbM30465s, this.f64321G, ", subtitle=", this.f64322H, ", placeholderText=");
        AbstractC30802r.m94773v(sbM30465s, this.f64323I, ", appBarIcon=", this.f64324J, ", error=");
        return AbstractC18489d0.m53371l(sbM30465s, this.f64325K, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f64326w);
        dest.writeInt(this.f64327x);
        dest.writeInt(this.f64328y);
        dest.writeInt(this.f64329z);
        dest.writeInt(this.f64319E);
        dest.writeInt(this.f64320F);
        dest.writeInt(this.f64321G);
        dest.writeInt(this.f64322H);
        dest.writeInt(this.f64323I);
        dest.writeInt(this.f64324J);
        dest.writeInt(this.f64325K);
    }

    public C16749v1(long j7, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j24, long j25, long j26) {
        this(AbstractC17918w0.m51506H(j7), AbstractC17918w0.m51506H(j13), AbstractC17918w0.m51506H(j14), AbstractC17918w0.m51506H(j15), AbstractC17918w0.m51506H(j16), AbstractC17918w0.m51506H(j17), AbstractC17918w0.m51506H(j24), AbstractC17918w0.m51506H(j18), AbstractC17918w0.m51506H(j19), AbstractC17918w0.m51506H(j25), AbstractC17918w0.m51506H(j26));
    }
}
