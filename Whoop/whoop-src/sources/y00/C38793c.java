package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p565vy.InterfaceC36562b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C38793c implements InterfaceC36562b, InterfaceC38822e8 {
    public static final Parcelable.Creator<C38793c> CREATOR = new C37677f(25);

    /* JADX INFO: renamed from: E */
    public final String f166958E;

    /* JADX INFO: renamed from: F */
    public final String f166959F;

    /* JADX INFO: renamed from: w */
    public final String f166960w;

    /* JADX INFO: renamed from: x */
    public final String f166961x;

    /* JADX INFO: renamed from: y */
    public final String f166962y;

    /* JADX INFO: renamed from: z */
    public final String f166963z;

    public C38793c(String str, String str2, String str3, String str4, String str5, String str6) {
        this.f166960w = str;
        this.f166961x = str2;
        this.f166962y = str3;
        this.f166963z = str4;
        this.f166958E = str5;
        this.f166959F = str6;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        String str = this.f166960w;
        if (str == null) {
            str = "";
        }
        C23465k c23465k = new C23465k("city", str);
        String str2 = this.f166961x;
        if (str2 == null) {
            str2 = "";
        }
        C23465k c23465k2 = new C23465k("country", str2);
        String str3 = this.f166962y;
        if (str3 == null) {
            str3 = "";
        }
        C23465k c23465k3 = new C23465k("line1", str3);
        String str4 = this.f166963z;
        if (str4 == null) {
            str4 = "";
        }
        C23465k c23465k4 = new C23465k("line2", str4);
        String str5 = this.f166958E;
        if (str5 == null) {
            str5 = "";
        }
        C23465k c23465k5 = new C23465k("postal_code", str5);
        String str6 = this.f166959F;
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, c23465k4, c23465k5, new C23465k("state", str6 != null ? str6 : ""));
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : mapM73990Y.entrySet()) {
            if (((String) entry.getValue()).length() > 0) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38793c)) {
            return false;
        }
        C38793c c38793c = (C38793c) obj;
        return AbstractC22676k.m65745e(this.f166960w, c38793c.f166960w) && AbstractC22676k.m65745e(this.f166961x, c38793c.f166961x) && AbstractC22676k.m65745e(this.f166962y, c38793c.f166962y) && AbstractC22676k.m65745e(this.f166963z, c38793c.f166963z) && AbstractC22676k.m65745e(this.f166958E, c38793c.f166958E) && AbstractC22676k.m65745e(this.f166959F, c38793c.f166959F);
    }

    public final int hashCode() {
        String str = this.f166960w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f166961x;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f166962y;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f166963z;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f166958E;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f166959F;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Address(city=", this.f166960w, ", country=", this.f166961x, ", line1=");
        AbstractC11266d.m30444B(sbM32001t, this.f166962y, ", line2=", this.f166963z, ", postalCode=");
        return AbstractC11266d.m30464r(sbM32001t, this.f166958E, ", state=", this.f166959F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166960w);
        dest.writeString(this.f166961x);
        dest.writeString(this.f166962y);
        dest.writeString(this.f166963z);
        dest.writeString(this.f166958E);
        dest.writeString(this.f166959F);
    }
}
