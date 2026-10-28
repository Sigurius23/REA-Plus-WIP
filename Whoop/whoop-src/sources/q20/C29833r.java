package q20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38915o4;
import y00.EnumC38922p2;

/* JADX INFO: renamed from: q20.r */
/* JADX INFO: loaded from: classes6.dex */
public final class C29833r implements Parcelable {
    public static final Parcelable.Creator<C29833r> CREATOR = new C29831p(2);

    /* JADX INFO: renamed from: w */
    public final C38915o4 f121940w;

    /* JADX INFO: renamed from: x */
    public final EnumC38922p2 f121941x;

    public C29833r(C38915o4 paymentMethod, EnumC38922p2 enumC38922p2) {
        AbstractC22676k.m65750j(paymentMethod, "paymentMethod");
        this.f121940w = paymentMethod;
        this.f121941x = enumC38922p2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29833r)) {
            return false;
        }
        C29833r c29833r = (C29833r) obj;
        return AbstractC22676k.m65745e(this.f121940w, c29833r.f121940w) && this.f121941x == c29833r.f121941x;
    }

    public final int hashCode() {
        int iHashCode = this.f121940w.hashCode() * 31;
        EnumC38922p2 enumC38922p2 = this.f121941x;
        return iHashCode + (enumC38922p2 == null ? 0 : enumC38922p2.hashCode());
    }

    public final String toString() {
        return "InstantDebitsInfo(paymentMethod=" + this.f121940w + ", linkMode=" + this.f121941x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f121940w, i13);
        EnumC38922p2 enumC38922p2 = this.f121941x;
        if (enumC38922p2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(enumC38922p2.name());
        }
    }
}
