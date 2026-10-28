package p442qy;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Map;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: qy.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C30767f implements InterfaceC36562b, Serializable {
    public static final Parcelable.Creator<C30767f> CREATOR = new C30763b(1);

    /* JADX INFO: renamed from: E */
    public final String f126698E;

    /* JADX INFO: renamed from: F */
    public final String f126699F;

    /* JADX INFO: renamed from: G */
    public final String f126700G;

    /* JADX INFO: renamed from: H */
    public final Map f126701H;

    /* JADX INFO: renamed from: w */
    public final String f126702w;

    /* JADX INFO: renamed from: x */
    public final String f126703x;

    /* JADX INFO: renamed from: y */
    public final String f126704y;

    /* JADX INFO: renamed from: z */
    public final String f126705z;

    public C30767f(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map map) {
        this.f126702w = str;
        this.f126703x = str2;
        this.f126704y = str3;
        this.f126705z = str4;
        this.f126698E = str5;
        this.f126699F = str6;
        this.f126700G = str7;
        this.f126701H = map;
    }

    /* JADX INFO: renamed from: b */
    public final String m94515b() {
        return this.f126703x;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30767f)) {
            return false;
        }
        C30767f c30767f = (C30767f) obj;
        return AbstractC22676k.m65745e(this.f126702w, c30767f.f126702w) && AbstractC22676k.m65745e(this.f126703x, c30767f.f126703x) && AbstractC22676k.m65745e(this.f126704y, c30767f.f126704y) && AbstractC22676k.m65745e(this.f126705z, c30767f.f126705z) && AbstractC22676k.m65745e(this.f126698E, c30767f.f126698E) && AbstractC22676k.m65745e(this.f126699F, c30767f.f126699F) && AbstractC22676k.m65745e(this.f126700G, c30767f.f126700G) && AbstractC22676k.m65745e(this.f126701H, c30767f.f126701H);
    }

    public final int hashCode() {
        String str = this.f126702w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f126703x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f126704y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f126705z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f126698E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f126699F;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f126700G;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Map map = this.f126701H;
        return iHashCode7 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("StripeError(type=", this.f126702w, ", message=", this.f126703x, ", code=");
        AbstractC11266d.m30444B(sbM32001t, this.f126704y, ", param=", this.f126705z, ", declineCode=");
        AbstractC11266d.m30444B(sbM32001t, this.f126698E, ", charge=", this.f126699F, ", docUrl=");
        return AbstractC30007c.m91842l(sbM32001t, this.f126700G, ", extraFields=", this.f126701H, ")");
    }

    /* JADX INFO: renamed from: v */
    public final String m94516v() {
        return this.f126704y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f126702w);
        dest.writeString(this.f126703x);
        dest.writeString(this.f126704y);
        dest.writeString(this.f126705z);
        dest.writeString(this.f126698E);
        dest.writeString(this.f126699F);
        dest.writeString(this.f126700G);
        Map map = this.f126701H;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
