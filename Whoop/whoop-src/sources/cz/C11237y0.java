package cz;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: cz.y0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11237y0 extends AbstractC11239z0 {
    public static final Parcelable.Creator<C11237y0> CREATOR = new C2125b(17);

    /* JADX INFO: renamed from: w */
    public final Throwable f36049w;

    public C11237y0(Throwable exception) {
        AbstractC22676k.m65750j(exception, "exception");
        this.f36049w = exception;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f36049w);
    }
}
