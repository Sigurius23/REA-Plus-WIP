package sz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: sz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C33141l extends AbstractC33147o {

    /* JADX INFO: renamed from: w */
    public static final C33141l f138219w = new C33141l();
    public static final Parcelable.Creator<C33141l> CREATOR = new C33133h(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C33141l);
    }

    public final int hashCode() {
        return 1700832601;
    }

    public final String toString() {
        return "Canceled";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
