package kz;

import android.os.Parcel;
import android.os.Parcelable;
import p266jz.C22060h;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: kz.k */
/* JADX INFO: loaded from: classes6.dex */
public final class C22914k extends AbstractC22917n {

    /* JADX INFO: renamed from: w */
    public static final C22914k f90466w = new C22914k();
    public static final Parcelable.Creator<C22914k> CREATOR = new C22060h(13);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C22914k);
    }

    public final int hashCode() {
        return -1615979050;
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
