package q30;

import android.os.Parcel;
import android.os.Parcelable;
import java.security.KeyPair;
import p000.AbstractC11266d;
import p715kotlin.jvm.internal.AbstractC22676k;
import q20.C29831p;

/* JADX INFO: renamed from: q30.i0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C29910i0 implements Parcelable {
    public static final Parcelable.Creator<C29910i0> CREATOR = new C29831p(29);

    /* JADX INFO: renamed from: E */
    public final C29920n0 f122190E;

    /* JADX INFO: renamed from: w */
    public final String f122191w;

    /* JADX INFO: renamed from: x */
    public final KeyPair f122192x;

    /* JADX INFO: renamed from: y */
    public final C29915l f122193y;

    /* JADX INFO: renamed from: z */
    public final int f122194z;

    public C29910i0(String sdkReferenceNumber, KeyPair sdkKeyPair, C29915l challengeParameters, int i13, C29920n0 intentData) {
        AbstractC22676k.m65750j(sdkReferenceNumber, "sdkReferenceNumber");
        AbstractC22676k.m65750j(sdkKeyPair, "sdkKeyPair");
        AbstractC22676k.m65750j(challengeParameters, "challengeParameters");
        AbstractC22676k.m65750j(intentData, "intentData");
        this.f122191w = sdkReferenceNumber;
        this.f122192x = sdkKeyPair;
        this.f122193y = challengeParameters;
        this.f122194z = i13;
        this.f122190E = intentData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C29910i0)) {
            return false;
        }
        C29910i0 c29910i0 = (C29910i0) obj;
        return AbstractC22676k.m65745e(this.f122191w, c29910i0.f122191w) && AbstractC22676k.m65745e(this.f122192x, c29910i0.f122192x) && AbstractC22676k.m65745e(this.f122193y, c29910i0.f122193y) && this.f122194z == c29910i0.f122194z && AbstractC22676k.m65745e(this.f122190E, c29910i0.f122190E);
    }

    public final int hashCode() {
        return this.f122190E.hashCode() + AbstractC11266d.m30448b(this.f122194z, (this.f122193y.hashCode() + ((this.f122192x.hashCode() + (this.f122191w.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        return "InitChallengeArgs(sdkReferenceNumber=" + this.f122191w + ", sdkKeyPair=" + this.f122192x + ", challengeParameters=" + this.f122193y + ", timeoutMins=" + this.f122194z + ", intentData=" + this.f122190E + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f122191w);
        dest.writeSerializable(this.f122192x);
        this.f122193y.writeToParcel(dest, i13);
        dest.writeInt(this.f122194z);
        this.f122190E.writeToParcel(dest, i13);
    }
}
