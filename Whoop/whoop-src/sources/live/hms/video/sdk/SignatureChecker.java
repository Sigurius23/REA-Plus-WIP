package live.hms.video.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import java.io.ByteArrayInputStream;
import java.security.Principal;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import yb3.AbstractC39414r;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0003H\u0002R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\b¨\u0006\n"}, m65681d2 = {"Llive/hms/video/sdk/SignatureChecker;", "", "applicationContext", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "isReleaseSigned", "", "()Z", "mContext", "lib_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class SignatureChecker {
    private final boolean isReleaseSigned;

    public SignatureChecker(Context applicationContext) {
        AbstractC22676k.m65750j(applicationContext, "applicationContext");
        this.isReleaseSigned = isReleaseSigned(applicationContext);
    }

    /* JADX INFO: renamed from: isReleaseSigned, reason: from getter */
    public final boolean getIsReleaseSigned() {
        return this.isReleaseSigned;
    }

    private final boolean isReleaseSigned(Context mContext) {
        X509Certificate x509Certificate;
        Principal issuerDN;
        String name;
        PackageManager packageManager = mContext.getPackageManager();
        AbstractC22676k.m65749i(packageManager, "getPackageManager(...)");
        String packageName = mContext.getPackageName();
        AbstractC22676k.m65749i(packageName, "getPackageName(...)");
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(packageName, 134217728);
            Signature[] apkContentsSigners = packageInfo.signingInfo.hasMultipleSigners() ? packageInfo.signingInfo.getApkContentsSigners() : packageInfo.signingInfo.getSigningCertificateHistory();
            AbstractC22676k.m65747g(apkContentsSigners);
            byte[] byteArray = apkContentsSigners[0].toByteArray();
            AbstractC22676k.m65749i(byteArray, "toByteArray(...)");
            try {
                Certificate certificateGenerateCertificate = CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream(byteArray));
                AbstractC22676k.m65748h(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                x509Certificate = (X509Certificate) certificateGenerateCertificate;
            } catch (CertificateException e5) {
                e5.printStackTrace();
                x509Certificate = null;
            }
            return AbstractC22676k.m65745e(x509Certificate != null ? x509Certificate.getSigAlgName() : null, "SHA256withRSA") || !(x509Certificate == null || (issuerDN = x509Certificate.getIssuerDN()) == null || (name = issuerDN.getName()) == null || AbstractC39414r.m125876U(name, "CN=Android Debug", false));
        } catch (PackageManager.NameNotFoundException e13) {
            e13.printStackTrace();
            return false;
        }
    }
}
