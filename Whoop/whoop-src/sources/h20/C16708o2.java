package h20;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: h20.o2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C16708o2 implements Parcelable {
    public static final Parcelable.Creator<C16708o2> CREATOR = new C16654f2(6);

    /* JADX INFO: renamed from: w */
    public final LinkedHashMap f64236w;

    public C16708o2(LinkedHashMap linkedHashMap) {
        this.f64236w = linkedHashMap;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16708o2) && this.f64236w.equals(((C16708o2) obj).f64236w);
    }

    public final int hashCode() {
        return this.f64236w.hashCode();
    }

    public final String toString() {
        return "PaymentMethodOptions(setupFutureUsageValues=" + this.f64236w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        LinkedHashMap linkedHashMap = this.f64236w;
        dest.writeInt(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            dest.writeParcelable((Parcelable) entry.getKey(), i13);
            dest.writeString(((EnumC16738t2) entry.getValue()).name());
        }
    }
}
