package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.EnumC38922p2;
import y00.InterfaceC38866j2;

/* JADX INFO: renamed from: jz.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C22057e implements Parcelable {
    public static final Parcelable.Creator<C22057e> CREATOR = new C16054r0(26);

    /* JADX INFO: renamed from: E */
    public final C22055c f85561E;

    /* JADX INFO: renamed from: F */
    public final C22056d f85562F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC38866j2 f85563G;

    /* JADX INFO: renamed from: w */
    public final Long f85564w;

    /* JADX INFO: renamed from: x */
    public final String f85565x;

    /* JADX INFO: renamed from: y */
    public final EnumC38922p2 f85566y;

    /* JADX INFO: renamed from: z */
    public final EnumC22053a f85567z;

    public C22057e(Long l7, String str, EnumC38922p2 enumC38922p2, EnumC22053a enumC22053a, C22055c c22055c, C22056d prefillDetails, InterfaceC38866j2 interfaceC38866j2) {
        AbstractC22676k.m65750j(prefillDetails, "prefillDetails");
        this.f85564w = l7;
        this.f85565x = str;
        this.f85566y = enumC38922p2;
        this.f85567z = enumC22053a;
        this.f85561E = c22055c;
        this.f85562F = prefillDetails;
        this.f85563G = interfaceC38866j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22057e)) {
            return false;
        }
        C22057e c22057e = (C22057e) obj;
        return AbstractC22676k.m65745e(this.f85564w, c22057e.f85564w) && AbstractC22676k.m65745e(this.f85565x, c22057e.f85565x) && this.f85566y == c22057e.f85566y && this.f85567z == c22057e.f85567z && AbstractC22676k.m65745e(this.f85561E, c22057e.f85561E) && AbstractC22676k.m65745e(this.f85562F, c22057e.f85562F) && AbstractC22676k.m65745e(this.f85563G, c22057e.f85563G);
    }

    public final int hashCode() {
        Long l7 = this.f85564w;
        int iHashCode = (l7 == null ? 0 : l7.hashCode()) * 31;
        String str = this.f85565x;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        EnumC38922p2 enumC38922p2 = this.f85566y;
        int iHashCode3 = (iHashCode2 + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode())) * 31;
        EnumC22053a enumC22053a = this.f85567z;
        int iHashCode4 = (iHashCode3 + (enumC22053a == null ? 0 : enumC22053a.hashCode())) * 31;
        C22055c c22055c = this.f85561E;
        int iHashCode5 = (this.f85562F.hashCode() + ((iHashCode4 + (c22055c == null ? 0 : c22055c.hashCode())) * 31)) * 31;
        InterfaceC38866j2 interfaceC38866j2 = this.f85563G;
        return iHashCode5 + (interfaceC38866j2 != null ? interfaceC38866j2.hashCode() : 0);
    }

    public final String toString() {
        return "ElementsSessionContext(amount=" + this.f85564w + ", currency=" + this.f85565x + ", linkMode=" + this.f85566y + ", allowRedisplay=" + this.f85567z + ", billingDetails=" + this.f85561E + ", prefillDetails=" + this.f85562F + ", incentiveEligibilitySession=" + this.f85563G + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Long l7 = this.f85564w;
        if (l7 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeLong(l7.longValue());
        }
        dest.writeString(this.f85565x);
        EnumC38922p2 enumC38922p2 = this.f85566y;
        if (enumC38922p2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38922p2.name());
        }
        EnumC22053a enumC22053a = this.f85567z;
        if (enumC22053a == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            enumC22053a.writeToParcel(dest, i13);
        }
        C22055c c22055c = this.f85561E;
        if (c22055c == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c22055c.writeToParcel(dest, i13);
        }
        this.f85562F.writeToParcel(dest, i13);
        dest.writeParcelable(this.f85563G, i13);
    }
}
