package ge3;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: renamed from: ge3.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C15753i implements InterfaceC15756l {
    @Override // ge3.InterfaceC15756l
    /* JADX INFO: renamed from: a */
    public final boolean mo44419a(SSLSocket sSLSocket) {
        return C15755k.f59420b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // ge3.InterfaceC15756l
    /* JADX INFO: renamed from: h */
    public final InterfaceC15758n mo44420h(SSLSocket sSLSocket) {
        return new C15755k();
    }
}
