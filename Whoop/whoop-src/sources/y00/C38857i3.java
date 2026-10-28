package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.i3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38857i3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38857i3> CREATOR = new C38967u2(8);

    /* JADX INFO: renamed from: E */
    public final String f167270E;

    /* JADX INFO: renamed from: F */
    public final String f167271F;

    /* JADX INFO: renamed from: G */
    public final C38915o4 f167272G;

    /* JADX INFO: renamed from: H */
    public final EnumC38847h3 f167273H;

    /* JADX INFO: renamed from: w */
    public final String f167274w;

    /* JADX INFO: renamed from: x */
    public final String f167275x;

    /* JADX INFO: renamed from: y */
    public final String f167276y;

    /* JADX INFO: renamed from: z */
    public final String f167277z;

    public C38857i3(String str, String str2, String str3, String str4, String str5, String str6, C38915o4 c38915o4, EnumC38847h3 enumC38847h3) {
        this.f167274w = str;
        this.f167275x = str2;
        this.f167276y = str3;
        this.f167277z = str4;
        this.f167270E = str5;
        this.f167271F = str6;
        this.f167272G = c38915o4;
        this.f167273H = enumC38847h3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38857i3)) {
            return false;
        }
        C38857i3 c38857i3 = (C38857i3) obj;
        return AbstractC22676k.m65745e(this.f167274w, c38857i3.f167274w) && AbstractC22676k.m65745e(this.f167275x, c38857i3.f167275x) && AbstractC22676k.m65745e(this.f167276y, c38857i3.f167276y) && AbstractC22676k.m65745e(this.f167277z, c38857i3.f167277z) && AbstractC22676k.m65745e(this.f167270E, c38857i3.f167270E) && AbstractC22676k.m65745e(this.f167271F, c38857i3.f167271F) && AbstractC22676k.m65745e(this.f167272G, c38857i3.f167272G) && this.f167273H == c38857i3.f167273H;
    }

    public final int hashCode() {
        String str = this.f167274w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f167275x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167276y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167277z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167270E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167271F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        C38915o4 c38915o4 = this.f167272G;
        int iHashCode7 = (iHashCode6 + (c38915o4 == null ? 0 : c38915o4.hashCode())) * 31;
        EnumC38847h3 enumC38847h3 = this.f167273H;
        return iHashCode7 + (enumC38847h3 != null ? enumC38847h3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Error(charge=", this.f167274w, ", code=", this.f167275x, ", declineCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f167276y, ", docUrl=", this.f167277z, ", message=");
        AbstractC11266d.m30444B(sbM32001t, this.f167270E, ", param=", this.f167271F, ", paymentMethod=");
        sbM32001t.append(this.f167272G);
        sbM32001t.append(", type=");
        sbM32001t.append(this.f167273H);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167274w);
        dest.writeString(this.f167275x);
        dest.writeString(this.f167276y);
        dest.writeString(this.f167277z);
        dest.writeString(this.f167270E);
        dest.writeString(this.f167271F);
        C38915o4 c38915o4 = this.f167272G;
        if (c38915o4 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38915o4.writeToParcel(dest, i13);
        }
        EnumC38847h3 enumC38847h3 = this.f167273H;
        if (enumC38847h3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38847h3.name());
        }
    }
}
