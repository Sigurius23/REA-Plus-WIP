package ge3;

import java.util.List;
import javax.net.ssl.SSLSocket;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: ge3.m */
/* JADX INFO: loaded from: classes5.dex */
public final class C15757m implements InterfaceC15758n {

    /* JADX INFO: renamed from: a */
    public final InterfaceC15756l f59421a;

    /* JADX INFO: renamed from: b */
    public InterfaceC15758n f59422b;

    public C15757m(InterfaceC15756l interfaceC15756l) {
        this.f59421a = interfaceC15756l;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: a */
    public final boolean mo44414a(SSLSocket sSLSocket) {
        return this.f59421a.mo44419a(sSLSocket);
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: b */
    public final String mo44415b(SSLSocket sSLSocket) {
        InterfaceC15758n interfaceC15758nM44475d = m44475d(sSLSocket);
        if (interfaceC15758nM44475d != null) {
            return interfaceC15758nM44475d.mo44415b(sSLSocket);
        }
        return null;
    }

    @Override // ge3.InterfaceC15758n
    /* JADX INFO: renamed from: c */
    public final void mo44416c(SSLSocket sSLSocket, String str, List protocols) {
        AbstractC22676k.m65750j(protocols, "protocols");
        InterfaceC15758n interfaceC15758nM44475d = m44475d(sSLSocket);
        if (interfaceC15758nM44475d != null) {
            interfaceC15758nM44475d.mo44416c(sSLSocket, str, protocols);
        }
    }

    /* JADX INFO: renamed from: d */
    public final synchronized InterfaceC15758n m44475d(SSLSocket sSLSocket) {
        try {
            if (this.f59422b == null && this.f59421a.mo44419a(sSLSocket)) {
                this.f59422b = this.f59421a.mo44420h(sSLSocket);
            }
        } catch (Throwable th3) {
            throw th3;
        }
        return this.f59422b;
    }

    @Override // ge3.InterfaceC15758n
    public final boolean isSupported() {
        return true;
    }
}
