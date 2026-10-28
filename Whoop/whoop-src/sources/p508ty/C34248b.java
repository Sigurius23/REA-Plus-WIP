package p508ty;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l83.C23465k;
import m83.AbstractC25247g0;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p486sp.C32854e;
import p565vy.InterfaceC36562b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ty.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C34248b implements InterfaceC36562b {
    public static final Parcelable.Creator<C34248b> CREATOR = new C32854e(13);

    /* JADX INFO: renamed from: E */
    public static final long f143654E = TimeUnit.MINUTES.toMillis(30);

    /* JADX INFO: renamed from: w */
    public final String f143655w;

    /* JADX INFO: renamed from: x */
    public final String f143656x;

    /* JADX INFO: renamed from: y */
    public final String f143657y;

    /* JADX INFO: renamed from: z */
    public final long f143658z;

    public C34248b(String guid, String muid, String sid, long j7) {
        AbstractC22676k.m65750j(guid, "guid");
        AbstractC22676k.m65750j(muid, "muid");
        AbstractC22676k.m65750j(sid, "sid");
        this.f143655w = guid;
        this.f143656x = muid;
        this.f143657y = sid;
        this.f143658z = j7;
    }

    /* JADX INFO: renamed from: b */
    public final Map m108291b() {
        return AbstractC25247g0.m73990Y(new C23465k("guid", this.f143655w), new C23465k("muid", this.f143656x), new C23465k("sid", this.f143657y));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C34248b)) {
            return false;
        }
        C34248b c34248b = (C34248b) obj;
        return AbstractC22676k.m65745e(this.f143655w, c34248b.f143655w) && AbstractC22676k.m65745e(this.f143656x, c34248b.f143656x) && AbstractC22676k.m65745e(this.f143657y, c34248b.f143657y) && this.f143658z == c34248b.f143658z;
    }

    public final int hashCode() {
        return Long.hashCode(this.f143658z) + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f143655w.hashCode() * 31, 31, this.f143656x), 31, this.f143657y);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("FraudDetectionData(guid=", this.f143655w, ", muid=", this.f143656x, ", sid=");
        sbM32001t.append(this.f143657y);
        sbM32001t.append(", timestamp=");
        sbM32001t.append(this.f143658z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f143655w);
        dest.writeString(this.f143656x);
        dest.writeString(this.f143657y);
        dest.writeLong(this.f143658z);
    }
}
