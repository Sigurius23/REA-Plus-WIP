package y00;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayInputStream;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import m83.AbstractC25267u;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39397a;

/* JADX INFO: renamed from: y00.g7 */
/* JADX INFO: loaded from: classes6.dex */
public final class C38841g7 implements Parcelable {
    public static final Parcelable.Creator<C38841g7> CREATOR = new C38943r5(29);

    /* JADX INFO: renamed from: w */
    public final String f167184w;

    /* JADX INFO: renamed from: x */
    public final String f167185x;

    /* JADX INFO: renamed from: y */
    public final String f167186y;

    /* JADX INFO: renamed from: z */
    public final C38831f7 f167187z;

    public C38841g7(String source, String directoryServerName, String serverTransactionId, C38831f7 directoryServerEncryption) {
        AbstractC22676k.m65750j(source, "source");
        AbstractC22676k.m65750j(directoryServerName, "directoryServerName");
        AbstractC22676k.m65750j(serverTransactionId, "serverTransactionId");
        AbstractC22676k.m65750j(directoryServerEncryption, "directoryServerEncryption");
        this.f167184w = source;
        this.f167185x = directoryServerName;
        this.f167186y = serverTransactionId;
        this.f167187z = directoryServerEncryption;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C38841g7)) {
            return false;
        }
        C38841g7 c38841g7 = (C38841g7) obj;
        return AbstractC22676k.m65745e(this.f167184w, c38841g7.f167184w) && AbstractC22676k.m65745e(this.f167185x, c38841g7.f167185x) && AbstractC22676k.m65745e(this.f167186y, c38841g7.f167186y) && AbstractC22676k.m65745e(this.f167187z, c38841g7.f167187z);
    }

    public final int hashCode() {
        return this.f167187z.hashCode() + AbstractC11266d.m30450d(AbstractC11266d.m30450d(this.f167184w.hashCode() * 31, 31, this.f167185x), 31, this.f167186y);
    }

    public final String toString() {
        StringBuilder sbM32001t = AbstractC11895b.m32001t("Stripe3ds2Fingerprint(source=", this.f167184w, ", directoryServerName=", this.f167185x, ", serverTransactionId=");
        sbM32001t.append(this.f167186y);
        sbM32001t.append(", directoryServerEncryption=");
        sbM32001t.append(this.f167187z);
        sbM32001t.append(")");
        return sbM32001t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i13) {
        AbstractC22676k.m65750j(dest, "dest");
        dest.writeString(this.f167184w);
        dest.writeString(this.f167185x);
        dest.writeString(this.f167186y);
        this.f167187z.writeToParcel(dest, i13);
    }

    public C38841g7(C38981v7 sdkData) throws CertificateException {
        AbstractC22676k.m65750j(sdkData, "sdkData");
        String str = sdkData.f167785w;
        String str2 = sdkData.f167786x;
        String str3 = sdkData.f167787y;
        C38972u7 c38972u7 = sdkData.f167788z;
        String directoryServerId = c38972u7.f167745w;
        String dsCertificateData = c38972u7.f167746x;
        List rootCertsData = c38972u7.f167747y;
        String str4 = c38972u7.f167748z;
        AbstractC22676k.m65750j(directoryServerId, "directoryServerId");
        AbstractC22676k.m65750j(dsCertificateData, "dsCertificateData");
        AbstractC22676k.m65750j(rootCertsData, "rootCertsData");
        CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
        byte[] bytes = dsCertificateData.getBytes(AbstractC39397a.f169546a);
        AbstractC22676k.m65749i(bytes, "getBytes(...)");
        Certificate certificateGenerateCertificate = certificateFactory.generateCertificate(new ByteArrayInputStream(bytes));
        AbstractC22676k.m65748h(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
        PublicKey publicKey = ((X509Certificate) certificateGenerateCertificate).getPublicKey();
        AbstractC22676k.m65749i(publicKey, "getPublicKey(...)");
        List<String> list = rootCertsData;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
        for (String str5 : list) {
            CertificateFactory certificateFactory2 = CertificateFactory.getInstance("X.509");
            byte[] bytes2 = str5.getBytes(AbstractC39397a.f169546a);
            AbstractC22676k.m65749i(bytes2, "getBytes(...)");
            Certificate certificateGenerateCertificate2 = certificateFactory2.generateCertificate(new ByteArrayInputStream(bytes2));
            AbstractC22676k.m65748h(certificateGenerateCertificate2, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            arrayList.add((X509Certificate) certificateGenerateCertificate2);
        }
        this(str, str2, str3, new C38831f7(directoryServerId, publicKey, arrayList, str4));
    }
}
