package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import l83.C23465k;
import p088dc.AbstractC11895b;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.l5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38889l5 extends AbstractC38970u5 {
    public static final Parcelable.Creator<C38889l5> CREATOR = new C38858i4(24);

    /* JADX INFO: renamed from: E */
    public final Boolean f167403E;

    /* JADX INFO: renamed from: x */
    public final String f167404x;

    /* JADX INFO: renamed from: y */
    public final String f167405y;

    /* JADX INFO: renamed from: z */
    public final EnumC38910o f167406z;

    public /* synthetic */ C38889l5(EnumC38910o enumC38910o) {
        this(null, null, enumC38910o, Boolean.TRUE);
    }

    /* JADX INFO: renamed from: f */
    public static C38889l5 m124360f(C38889l5 c38889l5, String str, EnumC38910o enumC38910o, int i13) {
        if ((i13 & 1) != 0) {
            str = c38889l5.f167404x;
        }
        String str2 = c38889l5.f167405y;
        if ((i13 & 4) != 0) {
            enumC38910o = c38889l5.f167406z;
        }
        Boolean bool = c38889l5.f167403E;
        c38889l5.getClass();
        return new C38889l5(str, str2, enumC38910o, bool);
    }

    @Override // y00.AbstractC38970u5
    /* JADX INFO: renamed from: b */
    public final List mo124356b() {
        C23465k c23465k = new C23465k("cvc", this.f167404x);
        C23465k c23465k2 = new C23465k("network", this.f167405y);
        C23465k c23465k3 = new C23465k("moto", this.f167403E);
        EnumC38910o enumC38910o = this.f167406z;
        return AbstractC37056f.m118959K(c23465k, c23465k2, c23465k3, new C23465k("setup_future_usage", enumC38910o != null ? enumC38910o.f167492w : null));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38889l5)) {
            return false;
        }
        C38889l5 c38889l5 = (C38889l5) obj;
        return AbstractC22676k.m65745e(this.f167404x, c38889l5.f167404x) && AbstractC22676k.m65745e(this.f167405y, c38889l5.f167405y) && this.f167406z == c38889l5.f167406z && AbstractC22676k.m65745e(this.f167403E, c38889l5.f167403E);
    }

    public final int hashCode() {
        String str = this.f167404x;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167405y;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        EnumC38910o enumC38910o = this.f167406z;
        int iHashCode3 = (iHashCode2 + (enumC38910o == null ? 0 : enumC38910o.hashCode())) * 31;
        Boolean bool = this.f167403E;
        return iHashCode3 + (bool != null ? bool.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Card(cvc=", this.f167404x, ", network=", this.f167405y, ", setupFutureUsage=");
        sbM32001t.append(this.f167406z);
        sbM32001t.append(", moto=");
        sbM32001t.append(this.f167403E);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167404x);
        dest.writeString(this.f167405y);
        EnumC38910o enumC38910o = this.f167406z;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
        Boolean bool = this.f167403E;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }

    public C38889l5(String str, String str2, EnumC38910o enumC38910o, Boolean bool) {
        super(EnumC38828f4.f167090I);
        this.f167404x = str;
        this.f167405y = str2;
        this.f167406z = enumC38910o;
        this.f167403E = bool;
    }

    public C38889l5(int i13, String str, EnumC38910o enumC38910o) {
        this((i13 & 1) != 0 ? null : str, null, (i13 & 4) != 0 ? null : enumC38910o, null);
    }
}
