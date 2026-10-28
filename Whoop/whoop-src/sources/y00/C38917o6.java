package y00;

import android.os.Parcel;
import android.os.Parcelable;
import c13.AbstractC3855a;
import d13.AbstractC11478a;
import p000.AbstractC11266d;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.o6 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38917o6 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38917o6> CREATOR = new C38943r5(15);

    /* JADX INFO: renamed from: E */
    public final Integer f167532E;

    /* JADX INFO: renamed from: w */
    public final EnumC38908n6 f167533w;

    /* JADX INFO: renamed from: x */
    public final Integer f167534x;

    /* JADX INFO: renamed from: y */
    public final String f167535y;

    /* JADX INFO: renamed from: z */
    public final String f167536z;

    public C38917o6(EnumC38908n6 type, Integer num, String str, String str2, Integer num2) {
        AbstractC22676k.m65750j(type, "type");
        this.f167533w = type;
        this.f167534x = num;
        this.f167535y = str;
        this.f167536z = str2;
        this.f167532E = num2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38917o6)) {
            return false;
        }
        C38917o6 c38917o6 = (C38917o6) obj;
        return this.f167533w == c38917o6.f167533w && AbstractC22676k.m65745e(this.f167534x, c38917o6.f167534x) && AbstractC22676k.m65745e(this.f167535y, c38917o6.f167535y) && AbstractC22676k.m65745e(this.f167536z, c38917o6.f167536z) && AbstractC22676k.m65745e(this.f167532E, c38917o6.f167532E);
    }

    public final int hashCode() {
        int iHashCode = this.f167533w.hashCode() * 31;
        Integer num = this.f167534x;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        String str = this.f167535y;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167536z;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num2 = this.f167532E;
        return iHashCode4 + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("Item(type=");
        sb4.append(this.f167533w);
        sb4.append(", amount=");
        sb4.append(this.f167534x);
        sb4.append(", currency=");
        AbstractC11266d.m30444B(sb4, this.f167535y, ", description=", this.f167536z, ", quantity=");
        return AbstractC11478a.m30859k(sb4, this.f167532E, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167533w.name());
        Integer num = this.f167534x;
        if (num == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num);
        }
        dest.writeString(this.f167535y);
        dest.writeString(this.f167536z);
        Integer num2 = this.f167532E;
        if (num2 == null) {
            dest.writeInt(0);
        } else {
            AbstractC3855a.m11837u(dest, 1, num2);
        }
    }
}
