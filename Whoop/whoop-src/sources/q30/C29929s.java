package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;
import r30.C30902g;

/* JADX INFO: renamed from: q30.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C29929s extends AbstractC29921o {
    public static final Parcelable.Creator<C29929s> CREATOR = new C29831p(22);

    /* JADX INFO: renamed from: w */
    public final C30902g f122231w;

    public C29929s(C30902g data) {
        AbstractC22676k.m65750j(data, "data");
        this.f122231w = data;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29929s) && AbstractC22676k.m65745e(this.f122231w, ((C29929s) obj).f122231w);
    }

    public final int hashCode() {
        return this.f122231w.hashCode();
    }

    public final String toString() {
        return "Timeout(data=" + this.f122231w + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        this.f122231w.writeToParcel(dest, i13);
    }
}
