package u30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import m83.C25235a0;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p486sp.C32854e;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: u30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C34498c implements Parcelable {
    public static final Parcelable.Creator<C34498c> CREATOR = new C32854e(18);

    /* JADX INFO: renamed from: E */
    public final Set f144994E;

    /* JADX INFO: renamed from: w */
    public final boolean f144995w;

    /* JADX INFO: renamed from: x */
    public final boolean f144996x;

    /* JADX INFO: renamed from: y */
    public final boolean f144997y;

    /* JADX INFO: renamed from: z */
    public final EnumC34497b f144998z;

    public C34498c(boolean z4, boolean z13, boolean z14, EnumC34497b address, Set set) {
        AbstractC22676k.m65750j(address, "address");
        this.f144995w = z4;
        this.f144996x = z13;
        this.f144997y = z14;
        this.f144998z = address;
        this.f144994E = set;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34498c)) {
            return false;
        }
        C34498c c34498c = (C34498c) obj;
        return this.f144995w == c34498c.f144995w && this.f144996x == c34498c.f144996x && this.f144997y == c34498c.f144997y && this.f144998z == c34498c.f144998z && AbstractC22676k.m65745e(this.f144994E, c34498c.f144994E);
    }

    public final int hashCode() {
        return this.f144994E.hashCode() + ((this.f144998z.hashCode() + AbstractC2875y.m8289b(AbstractC2875y.m8289b(Boolean.hashCode(this.f144995w) * 31, 31, this.f144996x), 31, this.f144997y)) * 31);
    }

    public final String toString() {
        StringBuilder sbM32002u = AbstractC11895b.m32002u("BillingDetailsCollectionConfiguration(collectName=", ", collectEmail=", ", collectPhone=", this.f144995w, this.f144996x);
        sbM32002u.append(this.f144997y);
        sbM32002u.append(", address=");
        sbM32002u.append(this.f144998z);
        sbM32002u.append(", allowedCountries=");
        sbM32002u.append(this.f144994E);
        sbM32002u.append(")");
        return sbM32002u.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f144995w ? 1 : 0);
        dest.writeInt(this.f144996x ? 1 : 0);
        dest.writeInt(this.f144997y ? 1 : 0);
        dest.writeString(this.f144998z.name());
        Set set = this.f144994E;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }

    public /* synthetic */ C34498c(boolean z4, boolean z13, boolean z14, EnumC34497b enumC34497b, int i13) {
        this((i13 & 1) != 0 ? false : z4, (i13 & 2) != 0 ? false : z13, (i13 & 4) != 0 ? false : z14, (i13 & 8) != 0 ? EnumC34497b.f144990w : enumC34497b, C25235a0.f99113w);
    }
}
