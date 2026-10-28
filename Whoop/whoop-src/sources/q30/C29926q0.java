package q30;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.UUID;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: q30.q0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29926q0 implements Parcelable, Serializable {
    public static final Parcelable.Creator<C29926q0> CREATOR = new C29912j0(3);

    /* JADX INFO: renamed from: w */
    public final String f122226w;

    public C29926q0(String value) {
        AbstractC22676k.m65750j(value, "value");
        this.f122226w = value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29926q0) && AbstractC22676k.m65745e(this.f122226w, ((C29926q0) obj).f122226w);
    }

    public final int hashCode() {
        return this.f122226w.hashCode();
    }

    public final String toString() {
        return this.f122226w;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122226w);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C29926q0(UUID uuid) {
        String string = uuid.toString();
        AbstractC22676k.m65749i(string, "toString(...)");
        this(string);
    }
}
