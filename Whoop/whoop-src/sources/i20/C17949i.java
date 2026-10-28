package i20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C17949i implements Parcelable {
    public static final Parcelable.Creator<C17949i> CREATOR = new C17925a(2);

    /* JADX INFO: renamed from: w */
    public final AbstractC17981v f69731w;

    public C17949i(AbstractC17981v addressOptionsResult) {
        AbstractC22676k.m65750j(addressOptionsResult, "addressOptionsResult");
        this.f69731w = addressOptionsResult;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17949i) && AbstractC22676k.m65745e(this.f69731w, ((C17949i) obj).f69731w);
    }

    public final int hashCode() {
        return this.f69731w.hashCode();
    }

    public final String toString() {
        return "Result(addressOptionsResult=" + this.f69731w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeParcelable(this.f69731w, i13);
    }
}
