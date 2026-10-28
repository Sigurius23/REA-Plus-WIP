package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C29899d extends AbstractC29907h {
    public static final Parcelable.Creator<C29899d> CREATOR = new C29831p(12);

    /* JADX INFO: renamed from: w */
    public final String f122158w;

    public C29899d(String userEntry) {
        AbstractC22676k.m65750j(userEntry, "userEntry");
        this.f122158w = userEntry;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C29899d) && AbstractC22676k.m65745e(this.f122158w, ((C29899d) obj).f122158w);
    }

    public final int hashCode() {
        return this.f122158w.hashCode();
    }

    public final String toString() {
        return AbstractC11895b.m31996o("HtmlForm(userEntry=", this.f122158w, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122158w);
    }
}
