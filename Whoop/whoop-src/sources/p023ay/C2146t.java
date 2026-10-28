package p023ay;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p000.AbstractC30802r;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import y00.InterfaceC38802c8;

/* JADX INFO: renamed from: ay.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C2146t implements Parcelable {
    public static final Parcelable.Creator<C2146t> CREATOR = new C2125b(4);

    /* JADX INFO: renamed from: w */
    public final String f8541w;

    /* JADX INFO: renamed from: x */
    public final List f8542x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC38802c8 f8543y;

    public C2146t(String publishableKey, List productUsage, InterfaceC38802c8 intent) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        AbstractC22676k.m65750j(productUsage, "productUsage");
        AbstractC22676k.m65750j(intent, "intent");
        this.f8541w = publishableKey;
        this.f8542x = productUsage;
        this.f8543y = intent;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2146t)) {
            return false;
        }
        C2146t c2146t = (C2146t) obj;
        return AbstractC22676k.m65745e(this.f8541w, c2146t.f8541w) && AbstractC22676k.m65745e(this.f8542x, c2146t.f8542x) && AbstractC22676k.m65745e(this.f8543y, c2146t.f8543y);
    }

    public final int hashCode() {
        return this.f8543y.hashCode() + AbstractC11895b.m31983b(this.f8541w.hashCode() * 31, 31, this.f8542x);
    }

    public final String toString() {
        StringBuilder sbM94766o = AbstractC30802r.m94766o("IntentConfirmationChallengeArgs(publishableKey=", this.f8541w, ", productUsage=", ", intent=", this.f8542x);
        sbM94766o.append(this.f8543y);
        sbM94766o.append(")");
        return sbM94766o.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f8541w);
        dest.writeStringList(this.f8542x);
        dest.writeParcelable(this.f8543y, i13);
    }
}
