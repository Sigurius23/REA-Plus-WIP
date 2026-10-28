package p10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12576v0;
import mn.C25704b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: p10.c */
/* JADX INFO: loaded from: classes6.dex */
public final class C28694c implements Parcelable {
    public static final Parcelable.Creator<C28694c> CREATOR = new C25704b(28);

    /* JADX INFO: renamed from: w */
    public final InterfaceC12576v0 f116063w;

    public C28694c(InterfaceC12576v0 nextConfirmationOption) {
        AbstractC22676k.m65750j(nextConfirmationOption, "nextConfirmationOption");
        this.f116063w = nextConfirmationOption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C28694c) && AbstractC22676k.m65745e(this.f116063w, ((C28694c) obj).f116063w);
    }

    public final int hashCode() {
        return this.f116063w.hashCode();
    }

    public final String toString() {
        return "Result(nextConfirmationOption=" + this.f116063w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f116063w, i13);
    }
}
