package h20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d40.AbstractC11672q;
import d40.C11664i;
import d40.C11666k;
import ih0.AbstractC18489d0;
import p000.AbstractC30802r;
import p208i2.AbstractC17918w0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.z2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16774z2 implements Parcelable {
    public static final Parcelable.Creator<C16774z2> CREATOR = new C16654f2(11);

    /* JADX INFO: renamed from: F */
    public static final C16774z2 f64474F;

    /* JADX INFO: renamed from: G */
    public static final C16774z2 f64475G;

    /* JADX INFO: renamed from: E */
    public final int f64476E;

    /* JADX INFO: renamed from: w */
    public final Integer f64477w;

    /* JADX INFO: renamed from: x */
    public final int f64478x;

    /* JADX INFO: renamed from: y */
    public final int f64479y;

    /* JADX INFO: renamed from: z */
    public final int f64480z;

    static {
        C11666k c11666k = AbstractC11672q.f37695e;
        int iM51506H = AbstractC17918w0.m51506H(c11666k.f37659a.f37652b);
        C11664i c11664i = c11666k.f37659a;
        int iM51506H2 = AbstractC17918w0.m51506H(c11664i.f37653c);
        long j7 = c11664i.f37652b;
        f64474F = new C16774z2(null, iM51506H, iM51506H2, AbstractC17918w0.m51506H(j7), AbstractC17918w0.m51506H(j7));
        C11664i c11664i2 = c11666k.f37660b;
        f64475G = new C16774z2(null, AbstractC17918w0.m51506H(c11664i2.f37652b), AbstractC17918w0.m51506H(c11664i2.f37653c), AbstractC17918w0.m51506H(c11664i.f37652b), AbstractC17918w0.m51506H(c11664i2.f37652b));
    }

    public C16774z2(Integer num, int i13, int i14, int i15, int i16) {
        this.f64477w = num;
        this.f64478x = i13;
        this.f64479y = i14;
        this.f64480z = i15;
        this.f64476E = i16;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16774z2)) {
            return false;
        }
        C16774z2 c16774z2 = (C16774z2) obj;
        return AbstractC22676k.m65745e(this.f64477w, c16774z2.f64477w) && this.f64478x == c16774z2.f64478x && this.f64479y == c16774z2.f64479y && this.f64480z == c16774z2.f64480z && this.f64476E == c16774z2.f64476E;
    }

    public final int hashCode() {
        Integer num = this.f64477w;
        return ((((((((num == null ? 0 : num.hashCode()) * 31) + this.f64478x) * 31) + this.f64479y) * 31) + this.f64480z) * 31) + this.f64476E;
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("PrimaryButtonColors(background=");
        sb4.append(this.f64477w);
        sb4.append(", onBackground=");
        sb4.append(this.f64478x);
        sb4.append(", border=");
        AbstractC30802r.m94773v(sb4, this.f64479y, ", successBackgroundColor=", this.f64480z, ", onSuccessBackgroundColor=");
        return AbstractC18489d0.m53371l(sb4, this.f64476E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f64477w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeInt(this.f64478x);
        dest.writeInt(this.f64479y);
        dest.writeInt(this.f64480z);
        dest.writeInt(this.f64476E);
    }
}
