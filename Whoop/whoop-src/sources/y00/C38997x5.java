package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
import p499t9.C33623c0;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38997x5 extends AbstractC39006y5 {
    public static final Parcelable.Creator<C38997x5> CREATOR = new C38943r5(2);

    /* JADX INFO: renamed from: E */
    public final Set f167846E;

    /* JADX INFO: renamed from: F */
    public final EnumC38941r3 f167847F;

    /* JADX INFO: renamed from: w */
    public final Integer f167848w;

    /* JADX INFO: renamed from: x */
    public final Integer f167849x;

    /* JADX INFO: renamed from: y */
    public final C38988w5 f167850y;

    /* JADX INFO: renamed from: z */
    public final C38977v3 f167851z;

    public C38997x5(Integer num, Integer num2, C38988w5 c38988w5, C38977v3 c38977v3, Set set, EnumC38941r3 enumC38941r3) {
        C33623c0 c33623c0 = EnumC38828f4.f167088G;
        this.f167848w = num;
        this.f167849x = num2;
        this.f167850y = c38988w5;
        this.f167851z = c38977v3;
        this.f167846E = set;
        this.f167847F = enumC38941r3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C38997x5)) {
            return false;
        }
        C38997x5 c38997x5 = (C38997x5) obj;
        return AbstractC22676k.m65745e(c38997x5.f167848w, this.f167848w) && AbstractC22676k.m65745e(c38997x5.f167849x, this.f167849x) && AbstractC22676k.m65745e(c38997x5.f167850y, this.f167850y) && AbstractC22676k.m65745e(c38997x5.f167851z, this.f167851z);
    }

    public final int hashCode() {
        return Objects.hash(this.f167848w, this.f167849x, this.f167850y, this.f167851z);
    }

    public final String toString() {
        StringBuilder sbM114684l = AbstractC36095b.m114684l("PaymentMethodCreateParams.Card.(expiryMonth=", this.f167848w, ", expiryYear=", this.f167849x, ", networks=");
        sbM114684l.append(this.f167850y);
        sbM114684l.append(", billingDetails=");
        sbM114684l.append(this.f167851z);
        sbM114684l.append(")");
        return sbM114684l.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Integer num = this.f167848w;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        Integer num2 = this.f167849x;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
        C38988w5 c38988w5 = this.f167850y;
        if (c38988w5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38988w5.writeToParcel(dest, i13);
        }
        C38977v3 c38977v3 = this.f167851z;
        if (c38977v3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38977v3.writeToParcel(dest, i13);
        }
        Set set = this.f167846E;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        EnumC38941r3 enumC38941r3 = this.f167847F;
        if (enumC38941r3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC38941r3.writeToParcel(dest, i13);
        }
    }
}
