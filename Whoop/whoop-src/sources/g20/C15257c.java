package g20;

import android.os.Parcel;
import android.os.Parcelable;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: g20.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C15257c extends AbstractC15258d {
    public static final Parcelable.Creator<C15257c> CREATOR = new C13433b(13);

    /* JADX INFO: renamed from: w */
    public final Throwable f57288w;

    public C15257c(Throwable throwable) {
        AbstractC22676k.m65750j(throwable, "throwable");
        this.f57288w = throwable;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeSerializable(this.f57288w);
    }
}
