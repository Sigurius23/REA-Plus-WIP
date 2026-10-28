package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: y00.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C38919p implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38919p> CREATOR = new C38873k(4);

    /* JADX INFO: renamed from: E */
    public final String f167538E;

    /* JADX INFO: renamed from: w */
    public final C38793c f167539w;

    /* JADX INFO: renamed from: x */
    public final String f167540x;

    /* JADX INFO: renamed from: y */
    public final String f167541y;

    /* JADX INFO: renamed from: z */
    public final String f167542z;

    public C38919p(C38793c address, String name, String str, String str2, String str3) {
        AbstractC22676k.m65750j(address, "address");
        AbstractC22676k.m65750j(name, "name");
        this.f167539w = address;
        this.f167540x = name;
        this.f167541y = str;
        this.f167542z = str2;
        this.f167538E = str3;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        C25272z c25272z = C25272z.f99163w;
        Map mapM73995d0 = c25272z;
        for (C23465k c23465k : AbstractC37056f.m118959K(new C23465k("address", this.f167539w.mo124325c0()), new C23465k("name", this.f167540x), new C23465k("carrier", this.f167541y), new C23465k("phone", this.f167542z), new C23465k("tracking_number", this.f167538E))) {
            String str = (String) c23465k.f92937w;
            Object obj = c23465k.f92938x;
            Map mapM114689q = obj != null ? AbstractC36095b.m114689q(obj, str) : null;
            if (mapM114689q == null) {
                mapM114689q = c25272z;
            }
            mapM73995d0 = AbstractC25247g0.m73995d0(mapM73995d0, mapM114689q);
        }
        return mapM73995d0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38919p)) {
            return false;
        }
        C38919p c38919p = (C38919p) obj;
        return AbstractC22676k.m65745e(this.f167539w, c38919p.f167539w) && AbstractC22676k.m65745e(this.f167540x, c38919p.f167540x) && AbstractC22676k.m65745e(this.f167541y, c38919p.f167541y) && AbstractC22676k.m65745e(this.f167542z, c38919p.f167542z) && AbstractC22676k.m65745e(this.f167538E, c38919p.f167538E);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f167539w.hashCode() * 31, 31, this.f167540x);
        String str = this.f167541y;
        int iHashCode = (iM30450d + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167542z;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f167538E;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Shipping(address=");
        sb4.append(this.f167539w);
        sb4.append(", name=");
        sb4.append(this.f167540x);
        sb4.append(", carrier=");
        AbstractC11266d.m30444B(sb4, this.f167541y, ", phone=", this.f167542z, ", trackingNumber=");
        return AbstractC25012a.m73376i(this.f167538E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f167539w.writeToParcel(dest, i13);
        dest.writeString(this.f167540x);
        dest.writeString(this.f167541y);
        dest.writeString(this.f167542z);
        dest.writeString(this.f167538E);
    }
}
