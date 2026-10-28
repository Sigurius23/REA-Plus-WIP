package p674z8;

import android.net.Uri;
import androidx.media3.datasource.UdpDataSource$UdpDataSourceException;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import live.hms.video.error.ErrorCodes;

/* JADX INFO: renamed from: z8.o */
/* JADX INFO: loaded from: classes5.dex */
public final class C40179o extends AbstractC40166b {

    /* JADX INFO: renamed from: E */
    public final int f173388E;

    /* JADX INFO: renamed from: F */
    public final byte[] f173389F;

    /* JADX INFO: renamed from: G */
    public final DatagramPacket f173390G;

    /* JADX INFO: renamed from: H */
    public Uri f173391H;

    /* JADX INFO: renamed from: I */
    public DatagramSocket f173392I;

    /* JADX INFO: renamed from: J */
    public MulticastSocket f173393J;

    /* JADX INFO: renamed from: K */
    public InetAddress f173394K;

    /* JADX INFO: renamed from: L */
    public boolean f173395L;

    /* JADX INFO: renamed from: M */
    public int f173396M;

    public C40179o() {
        super(true);
        this.f173388E = 8000;
        byte[] bArr = new byte[ErrorCodes.InitAPIErrors.cServerErrors];
        this.f173389F = bArr;
        this.f173390G = new DatagramPacket(bArr, 0, ErrorCodes.InitAPIErrors.cServerErrors);
    }

    @Override // p674z8.InterfaceC40170f
    public final void close() {
        this.f173391H = null;
        MulticastSocket multicastSocket = this.f173393J;
        if (multicastSocket != null) {
            try {
                InetAddress inetAddress = this.f173394K;
                inetAddress.getClass();
                multicastSocket.leaveGroup(inetAddress);
            } catch (IOException unused) {
            }
            this.f173393J = null;
        }
        DatagramSocket datagramSocket = this.f173392I;
        if (datagramSocket != null) {
            datagramSocket.close();
            this.f173392I = null;
        }
        this.f173394K = null;
        this.f173396M = 0;
        if (this.f173395L) {
            this.f173395L = false;
            m128884b();
        }
    }

    @Override // p674z8.InterfaceC40170f
    public final Uri getUri() {
        return this.f173391H;
    }

    @Override // p674z8.InterfaceC40170f
    public final long open(C40171g c40171g) throws UdpDataSource$UdpDataSourceException {
        Uri uri = c40171g.f173343a;
        this.f173391H = uri;
        String host = uri.getHost();
        host.getClass();
        int port = this.f173391H.getPort();
        m128885d();
        try {
            this.f173394K = InetAddress.getByName(host);
            InetSocketAddress inetSocketAddress = new InetSocketAddress(this.f173394K, port);
            if (this.f173394K.isMulticastAddress()) {
                MulticastSocket multicastSocket = new MulticastSocket(inetSocketAddress);
                this.f173393J = multicastSocket;
                multicastSocket.joinGroup(this.f173394K);
                this.f173392I = this.f173393J;
            } else {
                this.f173392I = new DatagramSocket(inetSocketAddress);
            }
            this.f173392I.setSoTimeout(this.f173388E);
            this.f173395L = true;
            m128886h(c40171g);
            return -1L;
        } catch (IOException e5) {
            throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cConnectionLost, e5);
        } catch (SecurityException e13) {
            throw new UdpDataSource$UdpDataSourceException(2006, e13);
        }
    }

    @Override // p516u8.InterfaceC34594h
    public final int read(byte[] bArr, int i13, int i14) throws UdpDataSource$UdpDataSourceException {
        if (i14 == 0) {
            return 0;
        }
        int i15 = this.f173396M;
        DatagramPacket datagramPacket = this.f173390G;
        if (i15 == 0) {
            try {
                DatagramSocket datagramSocket = this.f173392I;
                datagramSocket.getClass();
                datagramSocket.receive(datagramPacket);
                int length = datagramPacket.getLength();
                this.f173396M = length;
                m128883a(length);
            } catch (SocketTimeoutException e5) {
                throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cInvalidEndpointURL, e5);
            } catch (IOException e13) {
                throw new UdpDataSource$UdpDataSourceException(ErrorCodes.InitAPIErrors.cConnectionLost, e13);
            }
        }
        int length2 = datagramPacket.getLength();
        int i16 = this.f173396M;
        int iMin = Math.min(i16, i14);
        System.arraycopy(this.f173389F, length2 - i16, bArr, i13, iMin);
        this.f173396M -= iMin;
        return iMin;
    }
}
