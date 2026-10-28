package y00;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.v7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38981v7 extends AbstractC38990w7 {
    public static final Parcelable.Creator<C38981v7> CREATOR = new C38821e7(12);

    /* JADX INFO: renamed from: E */
    public final String f167783E;

    /* JADX INFO: renamed from: F */
    public final String f167784F;

    /* JADX INFO: renamed from: w */
    public final String f167785w;

    /* JADX INFO: renamed from: x */
    public final String f167786x;

    /* JADX INFO: renamed from: y */
    public final String f167787y;

    /* JADX INFO: renamed from: z */
    public final C38972u7 f167788z;

    public C38981v7(String source, String serverName, String transactionId, C38972u7 serverEncryption, String str, String str2) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(serverName, "serverName");
        AbstractC22676k.m65750j(transactionId, "transactionId");
        AbstractC22676k.m65750j(serverEncryption, "serverEncryption");
        this.f167785w = source;
        this.f167786x = serverName;
        this.f167787y = transactionId;
        this.f167788z = serverEncryption;
        this.f167783E = str;
        this.f167784F = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38981v7)) {
            return false;
        }
        C38981v7 c38981v7 = (C38981v7) obj;
        return AbstractC22676k.m65745e(this.f167785w, c38981v7.f167785w) && AbstractC22676k.m65745e(this.f167786x, c38981v7.f167786x) && AbstractC22676k.m65745e(this.f167787y, c38981v7.f167787y) && AbstractC22676k.m65745e(this.f167788z, c38981v7.f167788z) && AbstractC22676k.m65745e(this.f167783E, c38981v7.f167783E) && AbstractC22676k.m65745e(this.f167784F, c38981v7.f167784F);
    }

    public final int hashCode() {
        int iHashCode = (this.f167788z.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f167785w.hashCode() * 31, 31, this.f167786x), 31, this.f167787y)) * 31;
        String str = this.f167783E;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f167784F;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Use3DS2(source=", this.f167785w, ", serverName=", this.f167786x, ", transactionId=");
        sbM32001t.append(this.f167787y);
        sbM32001t.append(", serverEncryption=");
        sbM32001t.append(this.f167788z);
        sbM32001t.append(", threeDS2IntentId=");
        return AbstractC11266d.m30464r(sbM32001t, this.f167783E, ", publishableKey=", this.f167784F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167785w);
        dest.writeString(this.f167786x);
        dest.writeString(this.f167787y);
        this.f167788z.writeToParcel(dest, i13);
        dest.writeString(this.f167783E);
        dest.writeString(this.f167784F);
    }
}
