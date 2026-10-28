package i20;

import android.os.Parcel;
import android.os.Parcelable;
import h20.C16665h1;
import h20.C16671i1;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C17975s implements Parcelable {
    public static final Parcelable.Creator<C17975s> CREATOR = new C17925a(7);

    /* JADX INFO: renamed from: E */
    public final C17973r f69799E;

    /* JADX INFO: renamed from: F */
    public final String f69800F;

    /* JADX INFO: renamed from: G */
    public final String f69801G;

    /* JADX INFO: renamed from: H */
    public final LinkedHashSet f69802H;

    /* JADX INFO: renamed from: I */
    public final C16671i1 f69803I;

    /* JADX INFO: renamed from: w */
    public final C16665h1 f69804w;

    /* JADX INFO: renamed from: x */
    public final C17928b f69805x;

    /* JADX INFO: renamed from: y */
    public final LinkedHashSet f69806y;

    /* JADX INFO: renamed from: z */
    public final String f69807z;

    public C17975s(C16665h1 appearance, C17928b c17928b, LinkedHashSet linkedHashSet, String str, C17973r c17973r, String str2, String str3, LinkedHashSet linkedHashSet2, C16671i1 c16671i1) {
        AbstractC22676k.m65750j(appearance, "appearance");
        this.f69804w = appearance;
        this.f69805x = c17928b;
        this.f69806y = linkedHashSet;
        this.f69807z = str;
        this.f69799E = c17973r;
        this.f69800F = str2;
        this.f69801G = str3;
        this.f69802H = linkedHashSet2;
        this.f69803I = c16671i1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17975s)) {
            return false;
        }
        C17975s c17975s = (C17975s) obj;
        return AbstractC22676k.m65745e(this.f69804w, c17975s.f69804w) && AbstractC22676k.m65745e(this.f69805x, c17975s.f69805x) && this.f69806y.equals(c17975s.f69806y) && AbstractC22676k.m65745e(this.f69807z, c17975s.f69807z) && AbstractC22676k.m65745e(this.f69799E, c17975s.f69799E) && AbstractC22676k.m65745e(this.f69800F, c17975s.f69800F) && AbstractC22676k.m65745e(this.f69801G, c17975s.f69801G) && this.f69802H.equals(c17975s.f69802H) && AbstractC22676k.m65745e(this.f69803I, c17975s.f69803I);
    }

    public final int hashCode() {
        int iHashCode = this.f69804w.hashCode() * 31;
        C17928b c17928b = this.f69805x;
        int iHashCode2 = (this.f69806y.hashCode() + ((iHashCode + (c17928b == null ? 0 : c17928b.hashCode())) * 31)) * 31;
        String str = this.f69807z;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        C17973r c17973r = this.f69799E;
        int iHashCode4 = (iHashCode3 + (c17973r == null ? 0 : c17973r.hashCode())) * 31;
        String str2 = this.f69800F;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f69801G;
        int iHashCode6 = (this.f69802H.hashCode() + ((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31)) * 31;
        C16671i1 c16671i1 = this.f69803I;
        return iHashCode6 + (c16671i1 != null ? c16671i1.hashCode() : 0);
    }

    public final String toString() {
        return "Configuration(appearance=" + this.f69804w + ", address=" + this.f69805x + ", allowedCountries=" + this.f69806y + ", buttonTitle=" + this.f69807z + ", additionalFields=" + this.f69799E + ", title=" + this.f69800F + ", googlePlacesApiKey=" + this.f69801G + ", autocompleteCountries=" + this.f69802H + ", billingAddress=" + this.f69803I + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f69804w.writeToParcel(dest, i13);
        C17928b c17928b = this.f69805x;
        if (c17928b == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c17928b.writeToParcel(dest, i13);
        }
        LinkedHashSet linkedHashSet = this.f69806y;
        dest.writeInt(linkedHashSet.size());
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeString(this.f69807z);
        C17973r c17973r = this.f69799E;
        if (c17973r == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c17973r.writeToParcel(dest, i13);
        }
        dest.writeString(this.f69800F);
        dest.writeString(this.f69801G);
        LinkedHashSet linkedHashSet2 = this.f69802H;
        dest.writeInt(linkedHashSet2.size());
        Iterator it3 = linkedHashSet2.iterator();
        while (it3.hasNext()) {
            dest.writeString((String) it3.next());
        }
        C16671i1 c16671i1 = this.f69803I;
        if (c16671i1 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c16671i1.writeToParcel(dest, i13);
        }
    }
}
