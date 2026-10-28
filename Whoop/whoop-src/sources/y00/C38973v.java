package y00;

import android.os.Parcel;
import android.os.Parcelable;
import hc3.AbstractC17176i;
import java.util.List;
import java.util.Map;
import n83.C26463f;
import org.json.JSONObject;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p474s.AbstractC32004s;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C38973v implements InterfaceC38822e8 {
    public static final Parcelable.Creator<C38973v> CREATOR = new C38873k(8);

    /* JADX INFO: renamed from: E */
    public final List f167749E;

    /* JADX INFO: renamed from: F */
    public final String f167750F;

    /* JADX INFO: renamed from: G */
    public final String f167751G;

    /* JADX INFO: renamed from: H */
    public final String f167752H;

    /* JADX INFO: renamed from: I */
    public final String f167753I;

    /* JADX INFO: renamed from: w */
    public final String f167754w;

    /* JADX INFO: renamed from: x */
    public final String f167755x;

    /* JADX INFO: renamed from: y */
    public final EnumC38910o f167756y;

    /* JADX INFO: renamed from: z */
    public final String f167757z;

    public C38973v(String mode, String str, EnumC38910o enumC38910o, String str2, List list, String str3, String str4, String str5, String str6) {
        AbstractC22676k.m65750j(mode, "mode");
        this.f167754w = mode;
        this.f167755x = str;
        this.f167756y = enumC38910o;
        this.f167757z = str2;
        this.f167749E = list;
        this.f167750F = str3;
        this.f167751G = str4;
        this.f167752H = str5;
        this.f167753I = str6;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C26463f c26463f = new C26463f();
        c26463f.put("mode", this.f167754w);
        String str = this.f167755x;
        if (str != null) {
            c26463f.put("currency", str);
        }
        EnumC38910o enumC38910o = this.f167756y;
        if (enumC38910o == null || enumC38910o == EnumC38910o.Blank) {
            enumC38910o = null;
        }
        if (enumC38910o != null) {
            c26463f.put("setup_future_usage", enumC38910o.f167492w);
        }
        String str2 = this.f167757z;
        if (str2 != null) {
            c26463f.put("capture_method", str2);
        }
        List list = this.f167749E;
        if (list != null && !list.isEmpty()) {
            c26463f.put("payment_method_types", list);
        }
        String str3 = this.f167750F;
        if (str3 != null) {
            c26463f.put("on_behalf_of", str3);
        }
        String str4 = this.f167751G;
        if (str4 != null) {
            c26463f.put("payment_method_configuration", str4);
        }
        String str5 = this.f167752H;
        if (str5 != null) {
            c26463f.put("customer", str5);
        }
        String str6 = this.f167753I;
        if (str6 != null) {
            Map mapM99544m = AbstractC32004s.m99544m(new JSONObject(str6));
            AbstractC22676k.m65748h(mapM99544m, "null cannot be cast to non-null type kotlin.Any");
            c26463f.put("payment_method_options", mapM99544m);
        }
        return c26463f.m78380b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38973v)) {
            return false;
        }
        C38973v c38973v = (C38973v) obj;
        return AbstractC22676k.m65745e(this.f167754w, c38973v.f167754w) && AbstractC22676k.m65745e(this.f167755x, c38973v.f167755x) && this.f167756y == c38973v.f167756y && AbstractC22676k.m65745e(this.f167757z, c38973v.f167757z) && AbstractC22676k.m65745e(this.f167749E, c38973v.f167749E) && AbstractC22676k.m65745e(this.f167750F, c38973v.f167750F) && AbstractC22676k.m65745e(this.f167751G, c38973v.f167751G) && AbstractC22676k.m65745e(this.f167752H, c38973v.f167752H) && AbstractC22676k.m65745e(this.f167753I, c38973v.f167753I);
    }

    public final int hashCode() {
        int iHashCode = this.f167754w.hashCode() * 31;
        String str = this.f167755x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC38910o enumC38910o = this.f167756y;
        int iHashCode3 = (iHashCode2 + (enumC38910o == null ? 0 : enumC38910o.hashCode())) * 31;
        String str2 = this.f167757z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.f167749E;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.f167750F;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f167751G;
        int iHashCode7 = (iHashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f167752H;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f167753I;
        return iHashCode8 + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("ConfirmationTokenClientContextParams(mode=", this.f167754w, ", currency=", this.f167755x, ", setupFutureUsage=");
        sbM32001t.append(this.f167756y);
        sbM32001t.append(", captureMethod=");
        sbM32001t.append(this.f167757z);
        sbM32001t.append(", paymentMethodTypes=");
        AbstractC17176i.m48511m(", onBehalfOf=", this.f167750F, ", paymentMethodConfiguration=", sbM32001t, this.f167749E);
        AbstractC11266d.m30444B(sbM32001t, this.f167751G, ", customer=", this.f167752H, ", paymentMethodOptionsJson=");
        return AbstractC25012a.m73376i(this.f167753I, ")", sbM32001t);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167754w);
        dest.writeString(this.f167755x);
        EnumC38910o enumC38910o = this.f167756y;
        if (enumC38910o == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38910o.name());
        }
        dest.writeString(this.f167757z);
        dest.writeStringList(this.f167749E);
        dest.writeString(this.f167750F);
        dest.writeString(this.f167751G);
        dest.writeString(this.f167752H);
        dest.writeString(this.f167753I);
    }
}
