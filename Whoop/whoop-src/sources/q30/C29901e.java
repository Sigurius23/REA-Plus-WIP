package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C29901e extends AbstractC29907h {
    public static final Parcelable.Creator<C29901e> CREATOR = new C29831p(13);

    /* JADX INFO: renamed from: w */
    public final String f122167w;

    /* JADX INFO: renamed from: x */
    public final Boolean f122168x;

    public C29901e(String userEntry, Boolean bool) {
        AbstractC22676k.m65750j(userEntry, "userEntry");
        this.f122167w = userEntry;
        this.f122168x = bool;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29901e)) {
            return false;
        }
        C29901e c29901e = (C29901e) obj;
        return AbstractC22676k.m65745e(this.f122167w, c29901e.f122167w) && AbstractC22676k.m65745e(this.f122168x, c29901e.f122168x);
    }

    public final int hashCode() {
        int iHashCode = this.f122167w.hashCode() * 31;
        Boolean bool = this.f122168x;
        return iHashCode + (bool == null ? 0 : bool.hashCode());
    }

    public final String toString() {
        return "NativeForm(userEntry=" + this.f122167w + ", whitelistingValue=" + this.f122168x + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122167w);
        Boolean bool = this.f122168x;
        if (bool == null) {
            dest.writeInt(0);
        } else {
            AbstractC36095b.m114691s(dest, 1, bool);
        }
    }
}
