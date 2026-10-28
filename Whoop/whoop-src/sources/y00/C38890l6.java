package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.l6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38890l6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38890l6> CREATOR = new C38943r5(13);

    /* JADX INFO: renamed from: E */
    public final C38793c f167407E;

    /* JADX INFO: renamed from: F */
    public final String f167408F;

    /* JADX INFO: renamed from: G */
    public final String f167409G;

    /* JADX INFO: renamed from: H */
    public final String f167410H;

    /* JADX INFO: renamed from: w */
    public final C38793c f167411w;

    /* JADX INFO: renamed from: x */
    public final String f167412x;

    /* JADX INFO: renamed from: y */
    public final String f167413y;

    /* JADX INFO: renamed from: z */
    public final String f167414z;

    public C38890l6(C38793c c38793c, String str, String str2, String str3, C38793c c38793c2, String str4, String str5, String str6) {
        this.f167411w = c38793c;
        this.f167412x = str;
        this.f167413y = str2;
        this.f167414z = str3;
        this.f167407E = c38793c2;
        this.f167408F = str4;
        this.f167409G = str5;
        this.f167410H = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38890l6)) {
            return false;
        }
        C38890l6 c38890l6 = (C38890l6) obj;
        return AbstractC22676k.m65745e(this.f167411w, c38890l6.f167411w) && AbstractC22676k.m65745e(this.f167412x, c38890l6.f167412x) && AbstractC22676k.m65745e(this.f167413y, c38890l6.f167413y) && AbstractC22676k.m65745e(this.f167414z, c38890l6.f167414z) && AbstractC22676k.m65745e(this.f167407E, c38890l6.f167407E) && AbstractC22676k.m65745e(this.f167408F, c38890l6.f167408F) && AbstractC22676k.m65745e(this.f167409G, c38890l6.f167409G) && AbstractC22676k.m65745e(this.f167410H, c38890l6.f167410H);
    }

    public final int hashCode() {
        C38793c c38793c = this.f167411w;
        int iHashCode = (c38793c == null ? 0 : c38793c.hashCode()) * 31;
        String str = this.f167412x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167413y;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167414z;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        C38793c c38793c2 = this.f167407E;
        int iHashCode5 = (iHashCode4 + (c38793c2 == null ? 0 : c38793c2.hashCode())) * 31;
        String str4 = this.f167408F;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167409G;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167410H;
        return iHashCode7 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Owner(address=");
        sb4.append(this.f167411w);
        sb4.append(", email=");
        sb4.append(this.f167412x);
        sb4.append(", name=");
        AbstractC11266d.m30444B(sb4, this.f167413y, ", phone=", this.f167414z, ", verifiedAddress=");
        sb4.append(this.f167407E);
        sb4.append(", verifiedEmail=");
        sb4.append(this.f167408F);
        sb4.append(", verifiedName=");
        return AbstractC11266d.m30464r(sb4, this.f167409G, ", verifiedPhone=", this.f167410H, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        C38793c c38793c = this.f167411w;
        if (c38793c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167412x);
        dest.writeString(this.f167413y);
        dest.writeString(this.f167414z);
        C38793c c38793c2 = this.f167407E;
        if (c38793c2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c38793c2.writeToParcel(dest, i13);
        }
        dest.writeString(this.f167408F);
        dest.writeString(this.f167409G);
        dest.writeString(this.f167410H);
    }
}
