package e10;

import android.os.Parcel;
import android.os.Parcelable;
import n10.EnumC26121c0;
import p096dq.C12280x;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: e10.g0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12546g0 implements Parcelable {
    public static final Parcelable.Creator<C12546g0> CREATOR = new C12280x(19);

    /* JADX INFO: renamed from: w */
    public final InterfaceC12555l f42859w;

    /* JADX INFO: renamed from: x */
    public final C12553k f42860x;

    /* JADX INFO: renamed from: y */
    public final EnumC26121c0 f42861y;

    public C12546g0(InterfaceC12555l confirmationOption, C12553k confirmationArgs, EnumC26121c0 enumC26121c0) {
        AbstractC22676k.m65750j(confirmationOption, "confirmationOption");
        AbstractC22676k.m65750j(confirmationArgs, "confirmationArgs");
        this.f42859w = confirmationOption;
        this.f42860x = confirmationArgs;
        this.f42861y = enumC26121c0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C12546g0)) {
            return false;
        }
        C12546g0 c12546g0 = (C12546g0) obj;
        return AbstractC22676k.m65745e(this.f42859w, c12546g0.f42859w) && AbstractC22676k.m65745e(this.f42860x, c12546g0.f42860x) && this.f42861y == c12546g0.f42861y;
    }

    public final int hashCode() {
        int iHashCode = (this.f42860x.hashCode() + (this.f42859w.hashCode() * 31)) * 31;
        EnumC26121c0 enumC26121c0 = this.f42861y;
        return iHashCode + (enumC26121c0 == null ? 0 : enumC26121c0.hashCode());
    }

    public final String toString() {
        return "Parameters(confirmationOption=" + this.f42859w + ", confirmationArgs=" + this.f42860x + ", deferredIntentConfirmationType=" + this.f42861y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f42859w, i13);
        this.f42860x.writeToParcel(dest, i13);
        EnumC26121c0 enumC26121c0 = this.f42861y;
        if (enumC26121c0 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC26121c0.name());
        }
    }
}
