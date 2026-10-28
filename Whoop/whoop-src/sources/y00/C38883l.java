package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import p565vy.InterfaceC36562b;
import p695zx.C41179a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.l */
/* JADX INFO: loaded from: classes6.dex */
public final class C38883l implements InterfaceC36562b {
    public static final Parcelable.Creator<C38883l> CREATOR = new C38873k(0);

    /* JADX INFO: renamed from: w */
    public final C41179a f167351w;

    /* JADX INFO: renamed from: x */
    public final ArrayList f167352x;

    public C38883l(C41179a bin, ArrayList arrayList) {
        AbstractC22676k.m65750j(bin, "bin");
        this.f167351w = bin;
        this.f167352x = arrayList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38883l)) {
            return false;
        }
        C38883l c38883l = (C38883l) obj;
        return AbstractC22676k.m65745e(this.f167351w, c38883l.f167351w) && this.f167352x.equals(c38883l.f167352x);
    }

    public final int hashCode() {
        return this.f167352x.hashCode() + (this.f167351w.f177688w.hashCode() * 31);
    }

    public final String toString() {
        return "CardMetadata(bin=" + this.f167351w + ", accountRanges=" + this.f167352x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f167351w, i13);
        ArrayList arrayList = this.f167352x;
        dest.writeInt(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((C38783b) it.next()).writeToParcel(dest, i13);
        }
    }
}
