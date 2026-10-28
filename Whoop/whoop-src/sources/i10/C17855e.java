package i10;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i10.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C17855e extends AbstractC17857g {

    /* JADX INFO: renamed from: w */
    public static final C17855e f69477w = new C17855e();
    public static final Parcelable.Creator<C17855e> CREATOR = new C16054r0(17);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof C17855e);
    }

    public final int hashCode() {
        return -263131732;
    }

    public final String toString() {
        return "Completed";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
