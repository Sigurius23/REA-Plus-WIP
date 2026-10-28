package v00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p537ux.C35332g;
import p696zy.InterfaceC41211c;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C35486q implements Parcelable {
    public static final Parcelable.Creator<C35486q> CREATOR = new C35332g(19);

    /* JADX INFO: renamed from: E */
    public final boolean f151063E;

    /* JADX INFO: renamed from: w */
    public final String f151064w;

    /* JADX INFO: renamed from: x */
    public final String f151065x;

    /* JADX INFO: renamed from: y */
    public final String f151066y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC41211c f151067z;

    public C35486q(String id4, String displayName, String logoUrl, InterfaceC41211c interfaceC41211c, boolean z4) {
        AbstractC22676k.m65750j(id4, "id");
        AbstractC22676k.m65750j(displayName, "displayName");
        AbstractC22676k.m65750j(logoUrl, "logoUrl");
        this.f151064w = id4;
        this.f151065x = displayName;
        this.f151066y = logoUrl;
        this.f151067z = interfaceC41211c;
        this.f151063E = z4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C35486q)) {
            return false;
        }
        C35486q c35486q = (C35486q) obj;
        return AbstractC22676k.m65745e(this.f151064w, c35486q.f151064w) && AbstractC22676k.m65745e(this.f151065x, c35486q.f151065x) && AbstractC22676k.m65745e(this.f151066y, c35486q.f151066y) && AbstractC22676k.m65745e(this.f151067z, c35486q.f151067z) && this.f151063E == c35486q.f151063E;
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f151064w.hashCode() * 31, 31, this.f151065x), 31, this.f151066y);
        InterfaceC41211c interfaceC41211c = this.f151067z;
        return Boolean.hashCode(this.f151063E) + ((iM30450d + (interfaceC41211c == null ? 0 : interfaceC41211c.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("DisplayableCustomPaymentMethod(id=", this.f151064w, ", displayName=", this.f151065x, ", logoUrl=");
        sbM32001t.append(this.f151066y);
        sbM32001t.append(", subtitle=");
        sbM32001t.append(this.f151067z);
        sbM32001t.append(", doesNotCollectBillingDetails=");
        return AbstractC18489d0.m53372m(sbM32001t, this.f151063E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151064w);
        dest.writeString(this.f151065x);
        dest.writeString(this.f151066y);
        dest.writeParcelable(this.f151067z, i13);
        dest.writeInt(this.f151063E ? 1 : 0);
    }
}
