package he3;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: he3.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C17223a extends ProxySelector {

    /* JADX INFO: renamed from: a */
    public static final C17223a f66186a = new C17223a();

    @Override // java.net.ProxySelector
    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
    }

    @Override // java.net.ProxySelector
    public final List select(URI uri) {
        if (uri != null) {
            return AbstractC37056f.m118958J(Proxy.NO_PROXY);
        }
        throw new IllegalArgumentException("uri must not be null");
    }
}
