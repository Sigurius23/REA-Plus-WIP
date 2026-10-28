package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p555vl.AbstractC36095b;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.r1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38939r1 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38939r1> CREATOR = new C38992x0(13);

    /* JADX INFO: renamed from: w */
    public final String f167623w;

    /* JADX INFO: renamed from: x */
    public final Map f167624x;

    public C38939r1(String arbId, Map map) {
        AbstractC22676k.m65750j(arbId, "arbId");
        this.f167623w = arbId;
        this.f167624x = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38939r1)) {
            return false;
        }
        C38939r1 c38939r1 = (C38939r1) obj;
        return AbstractC22676k.m65745e(this.f167623w, c38939r1.f167623w) && AbstractC22676k.m65745e(this.f167624x, c38939r1.f167624x);
    }

    public final int hashCode() {
        return this.f167624x.hashCode() + (this.f167623w.hashCode() * 31);
    }

    public final String toString() {
        return AbstractC36095b.m114680h("ExperimentsData(arbId=", this.f167623w, ", experimentAssignments=", ")", this.f167624x);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167623w);
        Map map = this.f167624x;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString(((EnumC38930q1) entry.getKey()).name());
            dest.writeString((String) entry.getValue());
        }
    }
}
