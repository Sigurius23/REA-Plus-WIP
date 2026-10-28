package i10;

import android.os.Parcel;
import android.os.Parcelable;
import gp.C16054r0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i10.f */
/* JADX INFO: loaded from: classes6.dex */
public final class C17856f extends AbstractC17857g {
    public static final Parcelable.Creator<C17856f> CREATOR = new C16054r0(18);

    /* JADX INFO: renamed from: w */
    public final Throwable f69478w;

    public C17856f(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        this.f69478w = throwable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f69478w);
    }
}
