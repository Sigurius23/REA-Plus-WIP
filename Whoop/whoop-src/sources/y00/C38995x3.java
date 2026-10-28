package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38995x3 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38995x3> CREATOR = new C38967u2(19);

    /* JADX INFO: renamed from: w */
    public final Set f167842w;

    /* JADX INFO: renamed from: x */
    public final boolean f167843x;

    /* JADX INFO: renamed from: y */
    public final String f167844y;

    public C38995x3(boolean z4, String str, Set set) {
        this.f167842w = set;
        this.f167843x = z4;
        this.f167844y = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38995x3)) {
            return false;
        }
        C38995x3 c38995x3 = (C38995x3) obj;
        return AbstractC22676k.m65745e(this.f167842w, c38995x3.f167842w) && this.f167843x == c38995x3.f167843x && AbstractC22676k.m65745e(this.f167844y, c38995x3.f167844y);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b(this.f167842w.hashCode() * 31, 31, this.f167843x);
        String str = this.f167844y;
        return iM8289b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Networks(available=");
        sb4.append(this.f167842w);
        sb4.append(", selectionMandatory=");
        sb4.append(this.f167843x);
        sb4.append(", preferred=");
        return AbstractC25012a.m73376i(this.f167844y, ")", sb4);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Set set = this.f167842w;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
        dest.writeInt(this.f167843x ? 1 : 0);
        dest.writeString(this.f167844y);
    }
}
