package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p597wx.C37677f;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C38783b implements InterfaceC36562b {
    public static final Parcelable.Creator<C38783b> CREATOR = new C37677f(24);

    /* JADX INFO: renamed from: E */
    public final String f166931E;

    /* JADX INFO: renamed from: w */
    public final C38823f f166932w;

    /* JADX INFO: renamed from: x */
    public final int f166933x;

    /* JADX INFO: renamed from: y */
    public final EnumC38773a f166934y;

    /* JADX INFO: renamed from: z */
    public final EnumC38863j f166935z;

    public /* synthetic */ C38783b(C38823f c38823f, int i13, EnumC38773a enumC38773a) {
        this(c38823f, i13, enumC38773a, EnumC38863j.Unknown, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38783b)) {
            return false;
        }
        C38783b c38783b = (C38783b) obj;
        return AbstractC22676k.m65745e(this.f166932w, c38783b.f166932w) && this.f166933x == c38783b.f166933x && this.f166934y == c38783b.f166934y && this.f166935z == c38783b.f166935z && AbstractC22676k.m65745e(this.f166931E, c38783b.f166931E);
    }

    public final int hashCode() {
        int iHashCode = (this.f166935z.hashCode() + ((this.f166934y.hashCode() + AbstractC11266d.m30448b(this.f166933x, this.f166932w.hashCode() * 31, 31)) * 31)) * 31;
        String str = this.f166931E;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AccountRange(binRange=");
        sb4.append(this.f166932w);
        sb4.append(", panLength=");
        sb4.append(this.f166933x);
        sb4.append(", brandInfo=");
        sb4.append(this.f166934y);
        sb4.append(", funding=");
        sb4.append(this.f166935z);
        sb4.append(", country=");
        return AbstractC25012a.m73376i(this.f166931E, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f166932w.writeToParcel(dest, i13);
        dest.writeInt(this.f166933x);
        dest.writeString(this.f166934y.name());
        dest.writeString(this.f166935z.name());
        dest.writeString(this.f166931E);
    }

    public C38783b(C38823f binRange, int i13, EnumC38773a brandInfo, EnumC38863j funding, String str) {
        AbstractC22676k.m65750j(binRange, "binRange");
        AbstractC22676k.m65750j(brandInfo, "brandInfo");
        AbstractC22676k.m65750j(funding, "funding");
        this.f166932w = binRange;
        this.f166933x = i13;
        this.f166934y = brandInfo;
        this.f166935z = funding;
        this.f166931E = str;
    }
}
