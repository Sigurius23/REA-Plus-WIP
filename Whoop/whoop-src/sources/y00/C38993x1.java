package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.Set;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.x1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38993x1 implements Parcelable {
    public static final Parcelable.Creator<C38993x1> CREATOR = new C38992x0(16);

    /* JADX INFO: renamed from: w */
    public final Set f167840w;

    public C38993x1(Set disallowFundingSourceCreation) {
        AbstractC22676k.m65750j(disallowFundingSourceCreation, "disallowFundingSourceCreation");
        this.f167840w = disallowFundingSourceCreation;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C38993x1) && AbstractC22676k.m65745e(this.f167840w, ((C38993x1) obj).f167840w);
    }

    public final int hashCode() {
        return this.f167840w.hashCode();
    }

    public final String toString() {
        return "Link(disallowFundingSourceCreation=" + this.f167840w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Set set = this.f167840w;
        dest.writeInt(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            dest.writeString((String) it.next());
        }
    }
}
