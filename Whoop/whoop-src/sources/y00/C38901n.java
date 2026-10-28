package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p664yy.AbstractC39851c;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C38901n implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38901n> CREATOR = new C38873k(2);

    /* JADX INFO: renamed from: w */
    public final String f167464w;

    /* JADX INFO: renamed from: x */
    public final EnumC38896m3 f167465x;

    /* JADX INFO: renamed from: y */
    public final EnumC38979v5 f167466y;

    /* JADX INFO: renamed from: z */
    public final String f167467z;

    public C38901n(String str, EnumC38896m3 enumC38896m3, EnumC38979v5 enumC38979v5, String stripeSdkVersion) {
        AbstractC22676k.m65750j(stripeSdkVersion, "stripeSdkVersion");
        this.f167464w = str;
        this.f167465x = enumC38896m3;
        this.f167466y = enumC38979v5;
        this.f167467z = stripeSdkVersion;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Map map = C25272z.f99163w;
        C23465k c23465k = new C23465k("merchant_integration_source", "elements");
        C23465k c23465k2 = new C23465k("merchant_integration_subtype", "mobile");
        C23465k c23465k3 = new C23465k("merchant_integration_version", AbstractC11266d.m30461o("stripe-android/", this.f167467z));
        UUID uuid = AbstractC39851c.f172106g;
        Map mapM73990Y = AbstractC25247g0.m73990Y(c23465k, c23465k2, c23465k3, new C23465k("client_session_id", AbstractC39851c.f172106g.toString()));
        EnumC38979v5 enumC38979v5 = this.f167466y;
        Map mapM95645u = enumC38979v5 != null ? AbstractC31061c.m95645u("payment_method_selection_flow", enumC38979v5.f167781w) : null;
        if (mapM95645u == null) {
            mapM95645u = map;
        }
        LinkedHashMap linkedHashMapM73995d0 = AbstractC25247g0.m73995d0(mapM73990Y, mapM95645u);
        EnumC38896m3 enumC38896m3 = this.f167465x;
        Map mapM95645u2 = enumC38896m3 != null ? AbstractC31061c.m95645u("payment_intent_creation_flow", enumC38896m3.f167444w) : null;
        if (mapM95645u2 == null) {
            mapM95645u2 = map;
        }
        LinkedHashMap linkedHashMapM73995d1 = AbstractC25247g0.m73995d0(linkedHashMapM73995d0, mapM95645u2);
        String str = this.f167464w;
        Map mapM95645u3 = str != null ? AbstractC31061c.m95645u("elements_session_config_id", str) : null;
        if (mapM95645u3 != null) {
            map = mapM95645u3;
        }
        return AbstractC25247g0.m73995d0(linkedHashMapM73995d1, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38901n)) {
            return false;
        }
        C38901n c38901n = (C38901n) obj;
        return AbstractC22676k.m65745e(this.f167464w, c38901n.f167464w) && this.f167465x == c38901n.f167465x && this.f167466y == c38901n.f167466y && AbstractC22676k.m65745e(this.f167467z, c38901n.f167467z);
    }

    public final int hashCode() {
        String str = this.f167464w;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        EnumC38896m3 enumC38896m3 = this.f167465x;
        int iHashCode2 = (iHashCode + (enumC38896m3 == null ? 0 : enumC38896m3.hashCode())) * 31;
        EnumC38979v5 enumC38979v5 = this.f167466y;
        return this.f167467z.hashCode() + ((iHashCode2 + (enumC38979v5 != null ? enumC38979v5.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "ClientAttributionMetadata(elementsSessionConfigId=" + this.f167464w + ", paymentIntentCreationFlow=" + this.f167465x + ", paymentMethodSelectionFlow=" + this.f167466y + ", stripeSdkVersion=" + this.f167467z + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167464w);
        EnumC38896m3 enumC38896m3 = this.f167465x;
        if (enumC38896m3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38896m3.name());
        }
        EnumC38979v5 enumC38979v5 = this.f167466y;
        if (enumC38979v5 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38979v5.name());
        }
        dest.writeString(this.f167467z);
    }
}
