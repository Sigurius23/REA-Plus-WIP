package p426qi;

import android.graphics.Matrix;
import com.airbnb.lottie.LottieAnimationView;
import dj.AbstractC12058c;
import dj.AbstractC12064i;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: qi.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C30377d implements InterfaceC30405z {
    @Override // p426qi.InterfaceC30405z
    public final void onResult(Object obj) {
        Throwable th3 = (Throwable) obj;
        C30377d c30377d = LottieAnimationView.f20244N;
        Matrix matrix = AbstractC12064i.f40031a;
        if (!(th3 instanceof SocketException) && !(th3 instanceof ClosedChannelException) && !(th3 instanceof InterruptedIOException) && !(th3 instanceof ProtocolException) && !(th3 instanceof SSLException) && !(th3 instanceof UnknownHostException) && !(th3 instanceof UnknownServiceException)) {
            throw new IllegalStateException("Unable to parse composition", th3);
        }
        AbstractC12058c.m33240c("Unable to load composition.", th3);
    }
}
