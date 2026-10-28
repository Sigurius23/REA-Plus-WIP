package live.hms.video.factories;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: live.hms.video.factories.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C24152g implements HostnameVerifier {
    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        return OkHttpFactory.makeClient$lambda$0(str, sSLSession);
    }
}
