package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.C25272z;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p127ev.AbstractC13673n;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: y00.w4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38987w4 implements InterfaceC38822e8, Parcelable {
    public static final Parcelable.Creator<C38987w4> CREATOR = new C38858i4(11);

    /* JADX INFO: renamed from: w */
    public final String f167823w;

    /* JADX INFO: renamed from: x */
    public final String f167824x;

    /* JADX INFO: renamed from: y */
    public final Map f167825y;

    public C38987w4(String paymentDetailsId, String consumerSessionClientSecret, Map map) {
        AbstractC22676k.m65750j(paymentDetailsId, "paymentDetailsId");
        AbstractC22676k.m65750j(consumerSessionClientSecret, "consumerSessionClientSecret");
        this.f167823w = paymentDetailsId;
        this.f167824x = consumerSessionClientSecret;
        this.f167825y = map;
    }

    @Override // y00.InterfaceC38822e8
    /* JADX INFO: renamed from: c0 */
    public final Map mo124325c0() {
        Map mapM73990Y = AbstractC25247g0.m73990Y(new C23465k("payment_details_id", this.f167823w), new C23465k("credentials", AbstractC31061c.m95645u("consumer_session_client_secret", this.f167824x)));
        Map map = this.f167825y;
        if (map == null) {
            map = C25272z.f99163w;
        }
        return AbstractC25247g0.m73995d0(mapM73990Y, map);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38987w4)) {
            return false;
        }
        C38987w4 c38987w4 = (C38987w4) obj;
        return AbstractC22676k.m65745e(this.f167823w, c38987w4.f167823w) && AbstractC22676k.m65745e(this.f167824x, c38987w4.f167824x) && AbstractC22676k.m65745e(this.f167825y, c38987w4.f167825y);
    }

    public final int hashCode() {
        int iM30450d = AbstractC11266d.m30450d(this.f167823w.hashCode() * 31, 31, this.f167824x);
        Map map = this.f167825y;
        return iM30450d + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return AbstractC13673n.m38565l(AbstractC11895b.m32001t("Link(paymentDetailsId=", this.f167823w, ", consumerSessionClientSecret=", this.f167824x, ", extraParams="), this.f167825y, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167823w);
        dest.writeString(this.f167824x);
        Map map = this.f167825y;
        if (map == null) {
            dest.writeInt(0);
            return;
        }
        dest.writeInt(1);
        dest.writeInt(map.size());
        for (Map.Entry entry : map.entrySet()) {
            dest.writeString((String) entry.getKey());
            dest.writeValue(entry.getValue());
        }
    }
}
