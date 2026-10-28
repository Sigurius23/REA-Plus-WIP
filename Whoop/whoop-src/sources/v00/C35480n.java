package v00;

import android.os.Parcel;
import android.os.Parcelable;
import com.squareup.wire.AbstractC5583n;
import ih0.AbstractC18489d0;
import java.util.LinkedHashMap;
import java.util.Map;
import m83.AbstractC25247g0;
import p537ux.C35332g;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: v00.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C35480n implements Parcelable {
    public static final Parcelable.Creator<C35480n> CREATOR = new C35332g(13);

    /* JADX INFO: renamed from: w */
    public final Object f151052w;

    /* JADX INFO: renamed from: x */
    public final Map f151053x;

    public C35480n(Map map) {
        this.f151052w = map;
        this.f151053x = m112547b(map);
    }

    /* JADX WARN: Type inference failed for: r1v14, types: [java.lang.Object, java.util.Map] */
    /* JADX INFO: renamed from: b */
    public static Map m112547b(Map map) {
        Object objM112547b;
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC25247g0.m73988W(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            AbstractC35478m abstractC35478m = (AbstractC35478m) entry.getValue();
            if (abstractC35478m instanceof C35472j) {
                objM112547b = m112547b(((C35472j) abstractC35478m).f151013w);
            } else if (abstractC35478m instanceof C35474k) {
                objM112547b = ((C35474k) abstractC35478m).f151015w;
            } else if (abstractC35478m instanceof C35476l) {
                objM112547b = ((C35476l) abstractC35478m).f151017w;
            } else {
                if (abstractC35478m != null) {
                    throw new NoWhenBranchMatchedException();
                }
                objM112547b = null;
            }
            linkedHashMap.put(key, objM112547b);
        }
        return AbstractC5583n.m16798y(linkedHashMap);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C35480n) && this.f151052w.equals(((C35480n) obj).f151052w);
    }

    public final int hashCode() {
        return this.f151052w.hashCode();
    }

    public final String toString() {
        return AbstractC18489d0.m53369j(this.f151052w, "AnalyticsMetadata(values=", ")");
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.Map] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        ?? r10 = this.f151052w;
        dest.writeInt(r10.size());
        for (Map.Entry entry : r10.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeParcelable((Parcelable) entry.getValue(), i13);
        }
    }
}
