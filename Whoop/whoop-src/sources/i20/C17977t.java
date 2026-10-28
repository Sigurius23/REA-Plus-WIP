package i20;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.t */
/* JADX INFO: loaded from: classes6.dex */
public final class C17977t extends AbstractC17981v {
    public static final Parcelable.Creator<C17977t> CREATOR = new C17925a(8);

    /* JADX INFO: renamed from: w */
    public final boolean f69809w;

    public C17977t(boolean z4) {
        this.f69809w = z4;
    }

    @Override // i20.AbstractC17981v
    /* JADX INFO: renamed from: b */
    public final int mo51591b() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C17977t) && this.f69809w == ((C17977t) obj).f69809w;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f69809w);
    }

    public final String toString() {
        return AbstractC3855a.m11827k("Canceled(irrelevantValueForGeneratedCode=", ")", this.f69809w);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f69809w ? 1 : 0);
    }
}
