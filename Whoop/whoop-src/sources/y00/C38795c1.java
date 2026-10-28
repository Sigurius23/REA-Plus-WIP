package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p319m4.AbstractC25012a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.c1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38795c1 implements InterfaceC38815e1 {
    public static final Parcelable.Creator<C38795c1> CREATOR = new C38992x0(4);

    /* JADX INFO: renamed from: w */
    public final String f166966w;

    /* JADX INFO: renamed from: x */
    public final String f166967x;

    /* JADX INFO: renamed from: y */
    public final String f166968y;

    public C38795c1(String type, String displayName, String logoUrl) {
        AbstractC22676k.m65750j(type, "type");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(logoUrl, "logoUrl");
        this.f166966w = type;
        this.f166967x = displayName;
        this.f166968y = logoUrl;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38795c1)) {
            return false;
        }
        C38795c1 c38795c1 = (C38795c1) obj;
        return AbstractC22676k.m65745e(this.f166966w, c38795c1.f166966w) && AbstractC22676k.m65745e(this.f166967x, c38795c1.f166967x) && AbstractC22676k.m65745e(this.f166968y, c38795c1.f166968y);
    }

    public final int hashCode() {
        return this.f166968y.hashCode() + AbstractC11266d.m30450d(this.f166966w.hashCode() * 31, 31, this.f166967x);
    }

    public final String toString() {
        return AbstractC25012a.m73376i(this.f166968y, ")", AbstractC11895b.m32001t("Available(type=", this.f166966w, ", displayName=", this.f166967x, ", logoUrl="));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166966w);
        dest.writeString(this.f166967x);
        dest.writeString(this.f166968y);
    }
}
