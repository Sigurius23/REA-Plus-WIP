package ge3;

import fe3.AbstractC14421e;
import io.sentry.hints.C20363j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C15752h implements InterfaceC15758n {

    /* JADX INFO: renamed from: a */
    public static final C15750f f59417a = new C15750f();

    /* JADX INFO: renamed from: b */
    public static final boolean f59418b;

    static {
        boolean z4 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, AbstractC15751g.class.getClassLoader());
            z4 = true;
        } catch (ClassNotFoundException unused) {
        }
        f59418b = z4;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: a */
    public final boolean mo44414a(SSLSocket sSLSocket) {
        return false;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: b */
    public final String mo44415b(SSLSocket sSLSocket) {
        String applicationProtocol = ((BCSSLSocket) sSLSocket).getApplicationProtocol();
        if (applicationProtocol == null || applicationProtocol.equals("")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: c */
    public final void mo44416c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        if (mo44414a(sSLSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sSLSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
            parameters.setApplicationProtocols((String[]) C20363j.m56529j(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }

    @Override // ge3.InterfaceC15758n
    public final boolean isSupported() {
        return f59418b;
    }
}
