package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C29905g extends AbstractC29907h {

    /* JADX INFO: renamed from: w */
    public static final C29905g f122177w = new C29905g();
    public static final Parcelable.Creator<C29905g> CREATOR = new C29831p(15);

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
