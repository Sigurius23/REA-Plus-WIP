package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d10.C11465b;
import p715kotlin.jvm.internal.AbstractC22676k;
import v00.AbstractC35455a0;
import v00.C35490s;

/* JADX INFO: renamed from: a30.p0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C0318p0 extends AbstractC0326t0 {

    /* JADX INFO: renamed from: w */
    public static final C0318p0 f1095w = new C0318p0();
    public static final Parcelable.Creator<C0318p0> CREATOR = new C0113a(14);

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: b */
    public final AbstractC35455a0 mo828b(C11465b c11465b) {
        return C35490s.f151071w;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // a30.AbstractC0326t0
    /* JADX INFO: renamed from: f */
    public final void mo829f() {
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(1);
    }
}
