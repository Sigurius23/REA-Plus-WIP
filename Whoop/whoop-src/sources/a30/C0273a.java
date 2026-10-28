package a30;

import a10.C0113a;
import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Iterator;
import java.util.List;
import p000.AbstractC30802r;
import p715kotlin.jvm.internal.AbstractC22676k;
import u00.C34377e;

/* JADX INFO: renamed from: a30.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C0273a implements Parcelable {

    /* JADX INFO: renamed from: w */
    public final List f935w;

    /* JADX INFO: renamed from: x */
    public final String f936x;

    /* JADX INFO: renamed from: y */
    public static final C34377e f934y = new C34377e(1);
    public static final Parcelable.Creator<C0273a> CREATOR = new C0113a(7);

    public C0273a(List list, String str) {
        this.f935w = list;
        this.f936x = str;
    }

    /* JADX INFO: renamed from: b */
    public static C0273a m807b(C0273a c0273a, List paymentMethods, String str, int i13) {
        if ((i13 & 1) != 0) {
            paymentMethods = c0273a.f935w;
        }
        if ((i13 & 2) != 0) {
            str = c0273a.f936x;
        }
        c0273a.getClass();
        AbstractC22676k.m65750j(paymentMethods, "paymentMethods");
        return new C0273a(paymentMethods, str);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0273a)) {
            return false;
        }
        C0273a c0273a = (C0273a) obj;
        return AbstractC22676k.m65745e(this.f935w, c0273a.f935w) && AbstractC22676k.m65745e(this.f936x, c0273a.f936x);
    }

    public final int hashCode() {
        int iHashCode = this.f935w.hashCode() * 31;
        String str = this.f936x;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC30802r.m94761j("CustomerState(paymentMethods=", ", defaultPaymentMethodId=", this.f936x, ")", this.f935w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Iterator itM30863o = AbstractC11478a.m30863o(this.f935w, dest);
        while (itM30863o.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o.next(), i13);
        }
        dest.writeString(this.f936x);
    }
}
