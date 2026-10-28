package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: z10.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C39993p extends AbstractC39995r {
    public static final Parcelable.Creator<C39993p> CREATOR = new C39988k(3);

    /* JADX INFO: renamed from: w */
    public final C39991n f172568w;

    public C39993p(C39991n response) {
        AbstractC22676k.m65750j(response, "response");
        this.f172568w = response;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C39993p) && AbstractC22676k.m65745e(this.f172568w, ((C39993p) obj).f172568w);
    }

    public final int hashCode() {
        return this.f172568w.hashCode();
    }

    public final String toString() {
        return "Completed(response=" + this.f172568w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f172568w.writeToParcel(dest, i13);
    }
}
