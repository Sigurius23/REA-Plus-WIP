package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.z7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C39017z7 extends AbstractC38792b8 {
    public static final Parcelable.Creator<C39017z7> CREATOR = new C38821e7(16);

    /* JADX INFO: renamed from: w */
    public final long f167933w;

    /* JADX INFO: renamed from: x */
    public final String f167934x;

    /* JADX INFO: renamed from: y */
    public final EnumC39003y2 f167935y;

    public C39017z7(long j7, String hostedVerificationUrl, EnumC39003y2 microdepositType) {
        AbstractC22676k.m65750j(hostedVerificationUrl, "hostedVerificationUrl");
        AbstractC22676k.m65750j(microdepositType, "microdepositType");
        this.f167933w = j7;
        this.f167934x = hostedVerificationUrl;
        this.f167935y = microdepositType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39017z7)) {
            return false;
        }
        C39017z7 c39017z7 = (C39017z7) obj;
        return this.f167933w == c39017z7.f167933w && AbstractC22676k.m65745e(this.f167934x, c39017z7.f167934x) && this.f167935y == c39017z7.f167935y;
    }

    public final int hashCode() {
        return this.f167935y.hashCode() + AbstractC11266d.m30450d(Long.hashCode(this.f167933w) * 31, 31, this.f167934x);
    }

    public final String toString() {
        StringBuilder sbM114685m = AbstractC36095b.m114685m("VerifyWithMicrodeposits(arrivalDate=", ", hostedVerificationUrl=", this.f167933w, this.f167934x);
        sbM114685m.append(", microdepositType=");
        sbM114685m.append(this.f167935y);
        sbM114685m.append(")");
        return sbM114685m.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeLong(this.f167933w);
        dest.writeString(this.f167934x);
        dest.writeString(this.f167935y.name());
    }
}
