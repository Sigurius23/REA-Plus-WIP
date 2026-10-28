package o10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12576v0;
import mn.C25704b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: o10.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C27391d implements Parcelable {
    public static final Parcelable.Creator<C27391d> CREATOR = new C25704b(20);

    /* JADX INFO: renamed from: w */
    public final InterfaceC12576v0 f110101w;

    public C27391d(InterfaceC12576v0 nextConfirmationOption) {
        AbstractC22676k.m65750j(nextConfirmationOption, "nextConfirmationOption");
        this.f110101w = nextConfirmationOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C27391d) && AbstractC22676k.m65745e(this.f110101w, ((C27391d) obj).f110101w);
    }

    public final int hashCode() {
        return this.f110101w.hashCode();
    }

    public final String toString() {
        return "Result(nextConfirmationOption=" + this.f110101w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f110101w, i13);
    }
}
