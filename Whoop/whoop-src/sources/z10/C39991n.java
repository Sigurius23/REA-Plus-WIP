package z10;

import android.os.Parcel;
import android.os.Parcelable;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.C38821e7;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: z10.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C39991n implements InterfaceC36562b {
    public static final Parcelable.Creator<C39991n> CREATOR = new C38821e7(29);

    /* JADX INFO: renamed from: w */
    public final InterfaceC38802c8 f172564w;

    /* JADX INFO: renamed from: x */
    public final C39990m f172565x;

    /* JADX INFO: renamed from: y */
    public final C39989l f172566y;

    public C39991n(InterfaceC38802c8 interfaceC38802c8, C39990m c39990m, C39989l c39989l) {
        this.f172564w = interfaceC38802c8;
        this.f172565x = c39990m;
        this.f172566y = c39989l;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C39991n)) {
            return false;
        }
        C39991n c39991n = (C39991n) obj;
        return AbstractC22676k.m65745e(this.f172564w, c39991n.f172564w) && AbstractC22676k.m65745e(this.f172565x, c39991n.f172565x) && AbstractC22676k.m65745e(this.f172566y, c39991n.f172566y);
    }

    public final int hashCode() {
        InterfaceC38802c8 interfaceC38802c8 = this.f172564w;
        int iHashCode = (interfaceC38802c8 == null ? 0 : interfaceC38802c8.hashCode()) * 31;
        C39990m c39990m = this.f172565x;
        int iHashCode2 = (iHashCode + (c39990m == null ? 0 : c39990m.f172563w.hashCode())) * 31;
        C39989l c39989l = this.f172566y;
        return iHashCode2 + (c39989l != null ? c39989l.hashCode() : 0);
    }

    public final String toString() {
        return "CollectBankAccountResponseInternal(intent=" + this.f172564w + ", usBankAccountData=" + this.f172565x + ", instantDebitsData=" + this.f172566y + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f172564w, i13);
        C39990m c39990m = this.f172565x;
        if (c39990m == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39990m.writeToParcel(dest, i13);
        }
        C39989l c39989l = this.f172566y;
        if (c39989l == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c39989l.writeToParcel(dest, i13);
        }
    }
}
