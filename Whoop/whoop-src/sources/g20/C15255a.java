package g20;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g20.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C15255a extends AbstractC15258d {

    /* JADX INFO: renamed from: w */
    public static final C15255a f57286w = new C15255a();
    public static final Parcelable.Creator<C15255a> CREATOR = new C13433b(11);

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
