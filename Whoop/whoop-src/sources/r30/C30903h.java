package r30;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashMap;
import java.util.Map;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import q30.C29912j0;

/* JADX INFO: renamed from: r30.h */
/* JADX INFO: loaded from: classes6.dex */
public final class C30903h implements Parcelable {
    public static final Parcelable.Creator<C30903h> CREATOR = new C29912j0(13);

    /* JADX INFO: renamed from: w */
    public final String f127446w;

    /* JADX INFO: renamed from: x */
    public final String f127447x;

    /* JADX INFO: renamed from: y */
    public final boolean f127448y;

    /* JADX INFO: renamed from: z */
    public final HashMap f127449z;

    public C30903h(boolean z4, String name, String id4, HashMap map) {
        AbstractC22676k.m65750j(name, "name");
        AbstractC22676k.m65750j(id4, "id");
        this.f127446w = name;
        this.f127447x = id4;
        this.f127448y = z4;
        this.f127449z = map;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30903h)) {
            return false;
        }
        C30903h c30903h = (C30903h) obj;
        return AbstractC22676k.m65745e(this.f127446w, c30903h.f127446w) && AbstractC22676k.m65745e(this.f127447x, c30903h.f127447x) && this.f127448y == c30903h.f127448y && this.f127449z.equals(c30903h.f127449z);
    }

    public final int hashCode() {
        return this.f127449z.hashCode() + AbstractC2875y.m8289b(AbstractC11266d.m30450d(this.f127446w.hashCode() * 31, 31, this.f127447x), 31, this.f127448y);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("MessageExtension(name=", this.f127446w, ", id=", this.f127447x, ", criticalityIndicator=");
        sbM32001t.append(this.f127448y);
        sbM32001t.append(", data=");
        sbM32001t.append(this.f127449z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f127446w);
        dest.writeString(this.f127447x);
        dest.writeInt(this.f127448y ? 1 : 0);
        HashMap map = this.f127449z;
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeString((String) entry.getValue());
        }
    }
}
