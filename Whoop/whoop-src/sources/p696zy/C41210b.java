package p696zy;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import az.C2157a;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import p088dc.AbstractC11895b;
import p479s4.AbstractC32128i;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39421y;
import z10.C39988k;

/* JADX INFO: renamed from: zy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C41210b implements InterfaceC41211c {
    public static final Parcelable.Creator<C41210b> CREATOR = new C39988k(8);

    /* JADX INFO: renamed from: w */
    public final int f177845w;

    /* JADX INFO: renamed from: x */
    public final List f177846x;

    /* JADX INFO: renamed from: y */
    public final List f177847y;

    public C41210b(int i13, List list, List list2) {
        this.f177845w = i13;
        this.f177846x = list;
        this.f177847y = list2;
    }

    @Override // p696zy.InterfaceC41211c
    /* JADX INFO: renamed from: M */
    public final String mo133889M(Context context) {
        AbstractC22676k.m65750j(context, "context");
        List<C2157a> list = this.f177846x;
        Object[] objArrM100065t = AbstractC32128i.m100065t(context, this.f177847y);
        String value = context.getString(this.f177845w, Arrays.copyOf(objArrM100065t, objArrM100065t.length));
        for (C2157a c2157a : list) {
            c2157a.getClass();
            AbstractC22676k.m65750j(value, "value");
            value = AbstractC39421y.m125926K(value, c2157a.f8573w, c2157a.f8574x, false);
        }
        return value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C41210b)) {
            return false;
        }
        C41210b c41210b = (C41210b) obj;
        return this.f177845w == c41210b.f177845w && AbstractC22676k.m65745e(this.f177846x, c41210b.f177846x) && AbstractC22676k.m65745e(this.f177847y, c41210b.f177847y);
    }

    public final int hashCode() {
        return this.f177847y.hashCode() + AbstractC11895b.m31983b(Integer.hashCode(this.f177845w) * 31, 31, this.f177846x);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("IdentifierResolvableString(id=");
        sb4.append(this.f177845w);
        sb4.append(", transformations=");
        sb4.append(this.f177846x);
        sb4.append(", args=");
        return AbstractC3855a.m11829m(sb4, this.f177847y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeInt(this.f177845w);
        Iterator itM30863o = AbstractC11478a.m30863o(this.f177846x, dest);
        while (itM30863o.hasNext()) {
            dest.writeParcelable((Parcelable) itM30863o.next(), i13);
        }
        Iterator itM30863o2 = AbstractC11478a.m30863o(this.f177847y, dest);
        while (itM30863o2.hasNext()) {
            dest.writeValue(itM30863o2.next());
        }
    }
}
