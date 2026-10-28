package i20;

import android.os.Parcel;
import android.os.Parcelable;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: i20.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C17946h implements Parcelable {
    public static final Parcelable.Creator<C17946h> CREATOR = new C17925a(1);

    /* JADX INFO: renamed from: w */
    public final String f69727w;

    /* JADX INFO: renamed from: x */
    public final C17975s f69728x;

    public C17946h(String publishableKey, C17975s c17975s) {
        AbstractC22676k.m65750j(publishableKey, "publishableKey");
        this.f69727w = publishableKey;
        this.f69728x = c17975s;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C17946h)) {
            return false;
        }
        C17946h c17946h = (C17946h) obj;
        return AbstractC22676k.m65745e(this.f69727w, c17946h.f69727w) && AbstractC22676k.m65745e(this.f69728x, c17946h.f69728x);
    }

    public final int hashCode() {
        int iHashCode = this.f69727w.hashCode() * 31;
        C17975s c17975s = this.f69728x;
        return iHashCode + (c17975s == null ? 0 : c17975s.hashCode());
    }

    public final String toString() {
        return "Args(publishableKey=" + this.f69727w + ", config=" + this.f69728x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f69727w);
        C17975s c17975s = this.f69728x;
        if (c17975s == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            c17975s.writeToParcel(dest, i13);
        }
    }
}
