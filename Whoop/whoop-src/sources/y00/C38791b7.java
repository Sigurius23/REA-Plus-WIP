package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import p031b9.AbstractC2875y;
import p319m4.AbstractC25012a;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q63.AbstractC30007c;

/* JADX INFO: renamed from: y00.b7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38791b7 implements InterfaceC36562b {
    public static final Parcelable.Creator<C38791b7> CREATOR = new C38943r5(27);

    /* JADX INFO: renamed from: w */
    public final String f166954w;

    /* JADX INFO: renamed from: x */
    public final boolean f166955x;

    /* JADX INFO: renamed from: y */
    public final String f166956y;

    /* JADX INFO: renamed from: z */
    public final Map f166957z;

    public C38791b7(String str, boolean z4, String str2, Map map) {
        this.f166954w = str;
        this.f166955x = z4;
        this.f166956y = str2;
        this.f166957z = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38791b7)) {
            return false;
        }
        C38791b7 c38791b7 = (C38791b7) obj;
        return AbstractC22676k.m65745e(this.f166954w, c38791b7.f166954w) && this.f166955x == c38791b7.f166955x && AbstractC22676k.m65745e(this.f166956y, c38791b7.f166956y) && AbstractC22676k.m65745e(this.f166957z, c38791b7.f166957z);
    }

    public final int hashCode() {
        String str = this.f166954w;
        int iM8289b = AbstractC2875y.m8289b((str == null ? 0 : str.hashCode()) * 31, 31, this.f166955x);
        String str2 = this.f166956y;
        int iHashCode = (iM8289b + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map map = this.f166957z;
        return iHashCode + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        return AbstractC30007c.m91842l(AbstractC25012a.m73379l("MessageExtension(name=", this.f166954w, ", criticalityIndicator=", ", id=", this.f166955x), this.f166956y, ", data=", this.f166957z, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f166954w);
        dest.writeInt(this.f166955x ? 1 : 0);
        dest.writeString(this.f166956y);
        Map map = this.f166957z;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
