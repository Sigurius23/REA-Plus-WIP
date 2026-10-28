package h20;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.p2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16714p2 extends AbstractC16726r2 {
    public static final Parcelable.Creator<C16714p2> CREATOR = new C16654f2(5);

    /* JADX INFO: renamed from: E */
    public final C16708o2 f64246E;

    /* JADX INFO: renamed from: w */
    public final long f64247w;

    /* JADX INFO: renamed from: x */
    public final String f64248x;

    /* JADX INFO: renamed from: y */
    public final EnumC16738t2 f64249y;

    /* JADX INFO: renamed from: z */
    public final EnumC16684k2 f64250z;

    public C16714p2(long j7, String currency, EnumC16738t2 enumC16738t2, EnumC16684k2 captureMethod, C16708o2 c16708o2) {
        AbstractC22676k.m65750j(currency, "currency");
        AbstractC22676k.m65750j(captureMethod, "captureMethod");
        this.f64247w = j7;
        this.f64248x = currency;
        this.f64249y = enumC16738t2;
        this.f64250z = captureMethod;
        this.f64246E = c16708o2;
    }

    @Override // h20.AbstractC16726r2
    /* JADX INFO: renamed from: b */
    public final EnumC16738t2 mo47258b() {
        return this.f64249y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16714p2)) {
            return false;
        }
        C16714p2 c16714p2 = (C16714p2) obj;
        return this.f64247w == c16714p2.f64247w && AbstractC22676k.m65745e(this.f64248x, c16714p2.f64248x) && this.f64249y == c16714p2.f64249y && this.f64250z == c16714p2.f64250z && AbstractC22676k.m65745e(this.f64246E, c16714p2.f64246E);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(Long.hashCode(this.f64247w) * 31, 31, this.f64248x);
        EnumC16738t2 enumC16738t2 = this.f64249y;
        int iHashCode = (this.f64250z.hashCode() + ((iM30450d + (enumC16738t2 == null ? 0 : enumC16738t2.hashCode())) * 31)) * 31;
        C16708o2 c16708o2 = this.f64246E;
        return iHashCode + (c16708o2 != null ? c16708o2.f64236w.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("Payment(amount=", ", currency=", this.f64247w, this.f64248x);
        sbM114685m.append(", setupFutureUse=");
        sbM114685m.append(this.f64249y);
        sbM114685m.append(", captureMethod=");
        sbM114685m.append(this.f64250z);
        sbM114685m.append(", paymentMethodOptions=");
        sbM114685m.append(this.f64246E);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.f64247w);
        dest.writeString(this.f64248x);
        EnumC16738t2 enumC16738t2 = this.f64249y;
        if (enumC16738t2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC16738t2.name());
        }
        dest.writeString(this.f64250z.name());
        C16708o2 c16708o2 = this.f64246E;
        if (c16708o2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16708o2.writeToParcel(dest, i13);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C16714p2(long j7, String currency, EnumC16738t2 enumC16738t2) {
        EnumC16684k2 enumC16684k2 = EnumC16684k2.f64153w;
        AbstractC22676k.m65750j(currency, "currency");
        this(j7, currency, enumC16738t2, enumC16684k2, null);
    }
}
