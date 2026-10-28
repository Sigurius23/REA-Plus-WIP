package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.C30902g;

/* JADX INFO: renamed from: q30.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C29923p extends AbstractC29921o {
    public static final Parcelable.Creator<C29923p> CREATOR = new C29831p(19);

    /* JADX INFO: renamed from: w */
    public final C30902g f122223w;

    public C29923p(C30902g data) {
        AbstractC22676k.m65750j(data, "data");
        this.f122223w = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29923p) && AbstractC22676k.m65745e(this.f122223w, ((C29923p) obj).f122223w);
    }

    public final int hashCode() {
        return this.f122223w.hashCode();
    }

    public final String toString() {
        return "ProtocolError(data=" + this.f122223w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f122223w.writeToParcel(dest, i13);
    }
}
