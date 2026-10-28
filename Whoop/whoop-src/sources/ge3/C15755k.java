package ge3;

import fe3.AbstractC14421e;
import io.sentry.hints.C20363j;
import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C15755k implements InterfaceC15758n {

    /* JADX INFO: renamed from: a */
    public static final C15753i f59419a = new C15753i();

    /* JADX INFO: renamed from: b */
    public static final boolean f59420b;

    static {
        boolean z4 = false;
        try {
            Class.forName("org.conscrypt.Conscrypt$Version", false, AbstractC15754j.class.getClassLoader());
            if (Conscrypt.isAvailable() && AbstractC15754j.m44474a()) {
                z4 = true;
            }
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        f59420b = z4;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: a */
    public final boolean mo44414a(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: b */
    public final String mo44415b(SSLSocket sSLSocket) {
        if (mo44414a(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: c */
    public final void mo44416c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        if (mo44414a(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            AbstractC14421e abstractC14421e = AbstractC14421e.f52594a;
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C20363j.m56529j(protocols).toArray(new String[0]));
        }
    }

    @Override // ge3.InterfaceC15758n
    public final boolean isSupported() {
        return f59420b;
    }
}
