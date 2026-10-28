package az;

import android.os.Parcel;
import android.os.Parcelable;
import p023ay.C2125b;
import p031b9.AbstractC2875y;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: az.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2157a implements Parcelable {
    public static final Parcelable.Creator<C2157a> CREATOR = new C2125b(5);

    /* JADX INFO: renamed from: w */
    public final String f8573w;

    /* JADX INFO: renamed from: x */
    public final String f8574x;

    public C2157a(String original, String replacement) {
        AbstractC22676k.m65750j(original, "original");
        AbstractC22676k.m65750j(replacement, "replacement");
        this.f8573w = original;
        this.f8574x = replacement;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2157a)) {
            return false;
        }
        C2157a c2157a = (C2157a) obj;
        return AbstractC22676k.m65745e(this.f8573w, c2157a.f8573w) && AbstractC22676k.m65745e(this.f8574x, c2157a.f8574x);
    }

    public final int hashCode() {
        return this.f8574x.hashCode() + (this.f8573w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC2875y.m8300m("Replace(original=", this.f8573w, ", replacement=", this.f8574x, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f8573w);
        dest.writeString(this.f8574x);
    }
}
