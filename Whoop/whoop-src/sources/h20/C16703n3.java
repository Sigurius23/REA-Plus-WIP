package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.n3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16703n3 implements Parcelable {
    public static final Parcelable.Creator<C16703n3> CREATOR = new C16654f2(23);

    /* JADX INFO: renamed from: w */
    public final Map f64229w;

    /* JADX INFO: renamed from: x */
    public final Map f64230x;

    public C16703n3(Map paymentElement, Map walletButtonsView) {
        AbstractC22676k.m65750j(paymentElement, "paymentElement");
        AbstractC22676k.m65750j(walletButtonsView, "walletButtonsView");
        this.f64229w = paymentElement;
        this.f64230x = walletButtonsView;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16703n3)) {
            return false;
        }
        C16703n3 c16703n3 = (C16703n3) obj;
        return AbstractC22676k.m65745e(this.f64229w, c16703n3.f64229w) && AbstractC22676k.m65745e(this.f64230x, c16703n3.f64230x);
    }

    public final int hashCode() {
        return this.f64230x.hashCode() + (this.f64229w.hashCode() * 31);
    }

    public final String toString() {
        return "Visibility(paymentElement=" + this.f64229w + ", walletButtonsView=" + this.f64230x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        Map map = this.f64229w;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString(((EnumC16709o3) entry.getKey()).name());
            dest.writeString(((EnumC16697m3) entry.getValue()).name());
        }
        Map map2 = this.f64230x;
        dest.writeInt(map2.size());
        for (Map.Entry entry2 : map2.entrySet()) {
            dest.writeString(((EnumC16709o3) entry2.getKey()).name());
            dest.writeString(((EnumC16715p3) entry2.getValue()).name());
        }
    }
}
