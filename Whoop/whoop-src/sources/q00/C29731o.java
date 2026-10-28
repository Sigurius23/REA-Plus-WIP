package q00;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q00.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C29731o implements Parcelable {
    public static final Parcelable.Creator<C29731o> CREATOR = new C29723k(0);

    /* JADX INFO: renamed from: w */
    public final InterfaceC29729n f121590w;

    /* JADX INFO: renamed from: x */
    public final String f121591x;

    public C29731o(InterfaceC29729n paymentType, String last4) {
        AbstractC22676k.m65750j(paymentType, "paymentType");
        AbstractC22676k.m65750j(last4, "last4");
        this.f121590w = paymentType;
        this.f121591x = last4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29731o)) {
            return false;
        }
        C29731o c29731o = (C29731o) obj;
        return AbstractC22676k.m65745e(this.f121590w, c29731o.f121590w) && AbstractC22676k.m65745e(this.f121591x, c29731o.f121591x);
    }

    public final int hashCode() {
        return this.f121591x.hashCode() + (this.f121590w.hashCode() * 31);
    }

    public final String toString() {
        return "DefaultPaymentUI(paymentType=" + this.f121590w + ", last4=" + this.f121591x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f121590w, i13);
        dest.writeString(this.f121591x);
    }
}
