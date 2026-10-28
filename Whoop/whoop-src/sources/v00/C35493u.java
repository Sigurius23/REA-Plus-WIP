package v00;

import android.os.Parcel;
import android.os.Parcelable;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C35493u extends AbstractC35455a0 {
    public static final Parcelable.Creator<C35493u> CREATOR = new C35332g(22);

    /* JADX INFO: renamed from: w */
    public final EnumC35492t f151080w;

    public C35493u(EnumC35492t attachmentStyle) {
        AbstractC22676k.m65750j(attachmentStyle, "attachmentStyle");
        this.f151080w = attachmentStyle;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35493u) && this.f151080w == ((C35493u) obj).f151080w;
    }

    public final int hashCode() {
        return this.f151080w.hashCode();
    }

    public final String toString() {
        return "CustomerSheet(attachmentStyle=" + this.f151080w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f151080w.name());
    }
}
