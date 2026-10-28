package p537ux;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ux.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C35354r implements Parcelable {
    public static final Parcelable.Creator<C35354r> CREATOR = new C35332g(5);

    /* JADX INFO: renamed from: w */
    public final int f150602w;

    /* JADX INFO: renamed from: x */
    public final C35356s f150603x;

    public C35354r(int i13, C35356s uiCustomization) {
        AbstractC22676k.m65750j(uiCustomization, "uiCustomization");
        this.f150602w = i13;
        this.f150603x = uiCustomization;
        if (i13 < 5 || i13 > 99) {
            throw new IllegalArgumentException("Timeout value must be between 5 and 99, inclusive");
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35354r)) {
            return false;
        }
        C35354r c35354r = (C35354r) obj;
        return this.f150602w == c35354r.f150602w && AbstractC22676k.m65745e(this.f150603x, c35354r.f150603x);
    }

    public final int hashCode() {
        return this.f150603x.f150611w.hashCode() + (Integer.hashCode(this.f150602w) * 31);
    }

    public final String toString() {
        return "Stripe3ds2Config(timeout=" + this.f150602w + ", uiCustomization=" + this.f150603x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f150602w);
        this.f150603x.writeToParcel(dest, i13);
    }
}
