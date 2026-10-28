package ge3;

import android.net.ssl.SSLSockets;
import android.os.Build;
import fe3.AbstractC14421e;
import io.sentry.hints.C20363j;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C15745a implements InterfaceC15758n {
    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: a */
    public final boolean mo44414a(SSLSocket sSLSocket) {
        return SSLSockets.isSupportedSocket(sSLSocket);
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: b */
    public final String mo44415b(SSLSocket sSLSocket) {
        try {
            String applicationProtocol = sSLSocket.getApplicationProtocol();
            if (applicationProtocol == null || applicationProtocol.equals("")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: c */
    public final void mo44416c(SSLSocket sSLSocket, String str, List protocols) throws IOException {
        AbstractC22676k.m65750j(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sSLSocket, true);
            SSLParameters sSLParameters = sSLSocket.getSSLParameters();
            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
            sSLParameters.setApplicationProtocols((String[]) C20363j.m56529j(protocols).toArray(new String[0]));
            sSLSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e5) {
            throw new IOException("Android internal error", e5);
        }
    }

    @Override // ge3.InterfaceC15758n
    public final boolean isSupported() {
        AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
        return Build.VERSION.SDK_INT >= 29;
    }
}
