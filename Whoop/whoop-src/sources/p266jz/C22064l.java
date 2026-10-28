package p266jz;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: jz.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C22064l extends AbstractC22067o {

    /* JADX INFO: renamed from: w */
    public static final C22064l f85576w = new C22064l();
    public static final Parcelable.Creator<C22064l> CREATOR = new C22060h(2);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22064l);
    }

    public final int hashCode() {
        return 637890822;
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
