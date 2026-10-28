package v00;

import android.os.Parcel;
import android.os.Parcelable;
import ih0.AbstractC18489d0;
import java.util.Map;
import p537ux.C35332g;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.j */
/* JADX INFO: loaded from: classes6.dex */
public final class C35472j extends AbstractC35478m {
    public static final Parcelable.Creator<C35472j> CREATOR = new C35332g(14);

    /* JADX INFO: renamed from: w */
    public final Object f151013w;

    public C35472j(Map map) {
        this.f151013w = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35472j) && this.f151013w.equals(((C35472j) obj).f151013w);
    }

    public final int hashCode() {
        return this.f151013w.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f151013w, "Nested(value=", ")");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ?? r10 = this.f151013w;
        dest.writeInt(r10.size());
        for (Map.Entry entry : r10.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), i13);
        }
    }
}
