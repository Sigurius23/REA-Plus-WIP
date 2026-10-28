package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: y00.u7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38972u7 implements Parcelable {
    public static final Parcelable.Creator<C38972u7> CREATOR = new C38821e7(13);

    /* JADX INFO: renamed from: w */
    public final String f167745w;

    /* JADX INFO: renamed from: x */
    public final String f167746x;

    /* JADX INFO: renamed from: y */
    public final List f167747y;

    /* JADX INFO: renamed from: z */
    public final String f167748z;

    public C38972u7(String directoryServerId, String dsCertificateData, List rootCertsData, String str) {
        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
        AbstractC22676k.m65750j(dsCertificateData, "dsCertificateData");
        AbstractC22676k.m65750j(rootCertsData, "rootCertsData");
        this.f167745w = directoryServerId;
        this.f167746x = dsCertificateData;
        this.f167747y = rootCertsData;
        this.f167748z = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38972u7)) {
            return false;
        }
        C38972u7 c38972u7 = (C38972u7) obj;
        return AbstractC22676k.m65745e(this.f167745w, c38972u7.f167745w) && AbstractC22676k.m65745e(this.f167746x, c38972u7.f167746x) && AbstractC22676k.m65745e(this.f167747y, c38972u7.f167747y) && AbstractC22676k.m65745e(this.f167748z, c38972u7.f167748z);
    }

    public final int hashCode() {
        int iM31983b = AbstractC11895b.m31983b(AbstractC11266d.m30450d(this.f167745w.hashCode() * 31, 31, this.f167746x), 31, this.f167747y);
        String str = this.f167748z;
        return iM31983b + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return AbstractC38963t7.m124377g(", keyId=", this.f167748z, ")", AbstractC11895b.m32001t("DirectoryServerEncryption(directoryServerId=", this.f167745w, ", dsCertificateData=", this.f167746x, ", rootCertsData="), this.f167747y);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167745w);
        dest.writeString(this.f167746x);
        dest.writeStringList(this.f167747y);
        dest.writeString(this.f167748z);
    }
}
