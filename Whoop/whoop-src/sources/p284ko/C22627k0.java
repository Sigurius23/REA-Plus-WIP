package p284ko;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import live.hms.video.error.ErrorCodes;

/* JADX INFO: renamed from: ko.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C22627k0 extends AbstractC22616f {

    /* JADX INFO: renamed from: E */
    public final int f89003E;

    /* JADX INFO: renamed from: F */
    public final byte[] f89004F;

    /* JADX INFO: renamed from: G */
    public final DatagramPacket f89005G;

    /* JADX INFO: renamed from: H */
    public Uri f89006H;

    /* JADX INFO: renamed from: I */
    public DatagramSocket f89007I;

    /* JADX INFO: renamed from: J */
    public MulticastSocket f89008J;

    /* JADX INFO: renamed from: K */
    public InetAddress f89009K;

    /* JADX INFO: renamed from: L */
    public boolean f89010L;

    /* JADX INFO: renamed from: M */
    public int f89011M;

    public C22627k0() {
        super(true);
        this.f89003E = 8000;
        byte[] bArr = new byte[ErrorCodes.InitAPIErrors.cServerErrors];
        this.f89004F = bArr;
        this.f89005G = new DatagramPacket(bArr, 0, ErrorCodes.InitAPIErrors.cServerErrors);
    }

    @Override // p284ko.InterfaceC22628l
    public final void close() {
        this.f89006H = null;
        MulticastSocket multicastSocket = this.f89008J;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f89009K;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f89008J = null;
        }
        DatagramSocket datagramSocket = this.f89007I;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f89007I = null;
        }
        this.f89009K = null;
        this.f89011M = 0;
        if (this.f89010L) {
            this.f89010L = false;
            m65558b();
        }
    }

    @Override // p284ko.InterfaceC22628l
    public final Uri getUri() {
        return this.f89006H;
    }

    @Override // p284ko.InterfaceC22622i, p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws UdpDataSource$UdpDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f89011M;
        DatagramPacket datagramPacket = this.f89005G;
        if (i15 == 0) {
            try {
                DatagramSocket datagramSocket = this.f89007I;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f89011M = length;
                m65557a(length);
            } catch (SocketTimeoutException e5) {
                throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cInvalidEndpointURL, e5);
            } catch (IOException e13) {
                throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cConnectionLost, e13);
            }
        }
        int length2 = datagramPacket.getLength();
        int i16 = this.f89011M;
        int iMin = Math.min(i16, i14);
        System.arraycopy(this.f89004F, length2 - i16, bArr, i13, iMin);
        this.f89011M -= iMin;
        return iMin;
    }

    @Override // p284ko.InterfaceC22628l
    /* JADX INFO: renamed from: z */
    public final long mo65551z(C22630n c22630n) throws UdpDataSource$UdpDataSourceException {
        Uri uri = c22630n.f89019a;
        this.f89006H = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f89006H.getPort();
        m65559d();
        try {
            this.f89009K = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f89009K, port);
            if (this.f89009K.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f89008J = multicastSocket;
                multicastSocket.joinGroup(this.f89009K);
                this.f89007I = this.f89008J;
            } else {
                this.f89007I = new DatagramSocket(inetSocketAddress);
            }
            this.f89007I.setSoTimeout(this.f89003E);
            this.f89010L = true;
            m65560h(c22630n);
            return -1L;
        } catch (IOException e5) {
            throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cConnectionLost, e5);
        } catch (SecurityException e13) {
            throw new UdpDataSource$UdpDataSourceException(2006, e13);
        }
    }
}
