package g10;

import android.os.Parcel;
import android.os.Parcelable;
import e10.InterfaceC12555l;
import p126eq.C13433b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.AbstractC38970u5;
import y00.C38809d5;

/* JADX INFO: renamed from: g10.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C15216b implements InterfaceC12555l {
    public static final Parcelable.Creator<C15216b> CREATOR = new C13433b(10);

    /* JADX INFO: renamed from: w */
    public final C38809d5 f57139w;

    /* JADX INFO: renamed from: x */
    public final AbstractC38970u5 f57140x;

    public C15216b(C38809d5 createParams, AbstractC38970u5 abstractC38970u5) {
        AbstractC22676k.m65750j(createParams, "createParams");
        this.f57139w = createParams;
        this.f57140x = abstractC38970u5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15216b)) {
            return false;
        }
        C15216b c15216b = (C15216b) obj;
        return AbstractC22676k.m65745e(this.f57139w, c15216b.f57139w) && AbstractC22676k.m65745e(this.f57140x, c15216b.f57140x);
    }

    public final int hashCode() {
        int iHashCode = this.f57139w.hashCode() * 31;
        AbstractC38970u5 abstractC38970u5 = this.f57140x;
        return iHashCode + (abstractC38970u5 == null ? 0 : abstractC38970u5.hashCode());
    }

    public final String toString() {
        return "BacsConfirmationOption(createParams=" + this.f57139w + ", optionsParams=" + this.f57140x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f57139w, i13);
        dest.writeParcelable(this.f57140x, i13);
    }
}
