package oe3;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.logging.Level;
import ne3.C26608d;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C27888h extends C26608d {

    /* JADX INFO: renamed from: n */
    public final Socket f112447n;

    public C27888h(Socket socket) {
        AbstractC22676k.m65750j(socket, "socket");
        this.f112447n = socket;
    }

    @Override // ne3.C26608d
    /* JADX INFO: renamed from: k */
    public final void mo14147k() {
        Socket socket = this.f112447n;
        try {
            socket.close();
        } catch (AssertionError e5) {
            if (!AbstractC27891k.m84162b(e5)) {
                throw e5;
            }
            AbstractC27891k.f112470a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e5);
        } catch (Exception e13) {
            AbstractC27891k.f112470a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e13);
        }
    }

    /* JADX INFO: renamed from: l */
    public final IOException m84160l(IOException iOException) {
        SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
        if (iOException != null) {
            socketTimeoutException.initCause(iOException);
        }
        return socketTimeoutException;
    }
}
