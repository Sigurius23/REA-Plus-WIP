package p696zy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import d13.AbstractC11478a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p479s4.AbstractC32128i;
import p555vl.AbstractC36095b;
import p715kotlin.jvm.internal.AbstractC22676k;
import z10.C39988k;

/* JADX INFO: renamed from: zy.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C41212d implements InterfaceC41211c {
    public static final Parcelable.Creator<C41212d> CREATOR = new C39988k(9);

    /* JADX INFO: renamed from: w */
    public final String f177848w;

    /* JADX INFO: renamed from: x */
    public final List f177849x;

    public C41212d(String value, List list) {
        AbstractC22676k.m65750j(value, "value");
        this.f177848w = value;
        this.f177849x = list;
    }

    @Override // p696zy.InterfaceC41211c
    /* JADX INFO: renamed from: M */
    public final String mo133889M(Context context) {
        AbstractC22676k.m65750j(context, "context");
        Object[] objArrM100065t = AbstractC32128i.m100065t(context, this.f177849x);
        Object[] objArrCopyOf = Arrays.copyOf(objArrM100065t, objArrM100065t.length);
        return String.format(this.f177848w, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41212d)) {
            return false;
        }
        C41212d c41212d = (C41212d) obj;
        return AbstractC22676k.m65745e(this.f177848w, c41212d.f177848w) && AbstractC22676k.m65745e(this.f177849x, c41212d.f177849x);
    }

    public final int hashCode() {
        return this.f177849x.hashCode() + (this.f177848w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC36095b.m114679g("StaticResolvableString(value=", this.f177848w, ", args=", ")", this.f177849x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f177848w);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f177849x, dest);
        while (itM30863o.hasNext()) {
            dest.writeValue(itM30863o.next());
        }
    }
}
