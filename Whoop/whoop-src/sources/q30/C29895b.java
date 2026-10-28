package q30;

import android.os.Parcel;
import android.os.Parcelable;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C29895b implements Parcelable {
    public static final Parcelable.Creator<C29895b> CREATOR = new C29831p(10);

    /* JADX INFO: renamed from: E */
    public final String f122133E;

    /* JADX INFO: renamed from: F */
    public final String f122134F;

    /* JADX INFO: renamed from: w */
    public final String f122135w;

    /* JADX INFO: renamed from: x */
    public final C29926q0 f122136x;

    /* JADX INFO: renamed from: y */
    public final String f122137y;

    /* JADX INFO: renamed from: z */
    public final String f122138z;

    public C29895b(String deviceData, C29926q0 sdkTransactionId, String sdkAppId, String sdkReferenceNumber, String sdkEphemeralPublicKey, String messageVersion) {
        AbstractC22676k.m65750j(deviceData, "deviceData");
        AbstractC22676k.m65750j(sdkTransactionId, "sdkTransactionId");
        AbstractC22676k.m65750j(sdkAppId, "sdkAppId");
        AbstractC22676k.m65750j(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC22676k.m65750j(sdkEphemeralPublicKey, "sdkEphemeralPublicKey");
        AbstractC22676k.m65750j(messageVersion, "messageVersion");
        this.f122135w = deviceData;
        this.f122136x = sdkTransactionId;
        this.f122137y = sdkAppId;
        this.f122138z = sdkReferenceNumber;
        this.f122133E = sdkEphemeralPublicKey;
        this.f122134F = messageVersion;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29895b)) {
            return false;
        }
        C29895b c29895b = (C29895b) obj;
        return AbstractC22676k.m65745e(this.f122135w, c29895b.f122135w) && AbstractC22676k.m65745e(this.f122136x, c29895b.f122136x) && AbstractC22676k.m65745e(this.f122137y, c29895b.f122137y) && AbstractC22676k.m65745e(this.f122138z, c29895b.f122138z) && AbstractC22676k.m65745e(this.f122133E, c29895b.f122133E) && AbstractC22676k.m65745e(this.f122134F, c29895b.f122134F);
    }

    public final int hashCode() {
        return this.f122134F.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f122135w.hashCode() * 31, 31, this.f122136x.f122226w), 31, this.f122137y), 31, this.f122138z), 31, this.f122133E);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("AuthenticationRequestParameters(deviceData=");
        sb4.append(this.f122135w);
        sb4.append(", sdkTransactionId=");
        sb4.append(this.f122136x);
        sb4.append(", sdkAppId=");
        AbstractC11266d.m30444B(sb4, this.f122137y, ", sdkReferenceNumber=", this.f122138z, ", sdkEphemeralPublicKey=");
        return AbstractC11266d.m30464r(sb4, this.f122133E, ", messageVersion=", this.f122134F, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122135w);
        this.f122136x.writeToParcel(dest, i13);
        dest.writeString(this.f122137y);
        dest.writeString(this.f122138z);
        dest.writeString(this.f122133E);
        dest.writeString(this.f122134F);
    }
}
