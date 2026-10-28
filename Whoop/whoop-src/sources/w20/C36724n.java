package w20;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: w20.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C36724n implements InterfaceC36725o {
    public static final Parcelable.Creator<C36724n> CREATOR = new C36720j(2);

    /* JADX INFO: renamed from: w */
    public final String f157213w;

    public C36724n(String cvc) {
        AbstractC22676k.m65750j(cvc, "cvc");
        this.f157213w = cvc;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C36724n) && AbstractC22676k.m65745e(this.f157213w, ((C36724n) obj).f157213w);
    }

    public final int hashCode() {
        return this.f157213w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("Confirmed(cvc=", this.f157213w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f157213w);
    }
}
