package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C29897c extends AbstractC29907h {

    /* JADX INFO: renamed from: w */
    public static final C29897c f122151w = new C29897c();
    public static final Parcelable.Creator<C29897c> CREATOR = new C29831p(11);

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
