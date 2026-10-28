package e33;

import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import d33.C11620p;
import d33.C11622q;
import d33.C11624r;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.webrtc.Loggable;
import org.webrtc.Logging;
import org.webrtc.audio.JavaAudioDeviceModule;
import p042c2.C3872q;
import p522uf.AbstractC34870c0;
import p715kotlin.jvm.internal.AbstractC22676k;
import r80.AbstractC31061c;

/* JADX INFO: renamed from: e33.v */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C12661v implements Loggable, JavaAudioDeviceModule.SamplesReadyCallback, JavaAudioDeviceModule.AudioBufferCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C12638j0 f43286a;

    public /* synthetic */ C12661v(C12638j0 c12638j0) {
        this.f43286a = c12638j0;
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.AudioBufferCallback
    public long onBuffer(ByteBuffer byteBuffer, int i13, int i14, int i15, int i16, long j7) {
        ByteBuffer byteBufferM109966A;
        C12638j0 c12638j0 = this.f43286a;
        C3872q c3872q = c12638j0.f43160j;
        if (c3872q != null) {
            Integer numValueOf = Integer.valueOf(i13);
            Integer numValueOf2 = Integer.valueOf(i14);
            Integer numValueOf3 = Integer.valueOf(i15);
            AbstractC22676k.m65747g(byteBuffer);
            c3872q.invoke(numValueOf, numValueOf2, numValueOf3, byteBuffer);
        }
        if (i16 > 0) {
            AbstractC22676k.m65747g(byteBuffer);
            C11622q c11622q = c12638j0.f43161k;
            ByteBuffer byteBuffer2 = c11622q != null ? (ByteBuffer) c11622q.invoke(Integer.valueOf(i16)) : null;
            if (byteBuffer2 != null && byteBuffer2.remaining() > 0) {
                byteBuffer2.position(0);
                byteBuffer.position(0);
                int iLimit = byteBuffer2.limit() / 2;
                short[] sArr = new short[iLimit];
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBuffer2.order(byteOrder);
                byteBuffer2.asShortBuffer().get(sArr);
                C11624r c11624r = c12638j0.f43162l;
                if (c11624r != null ? ((Boolean) c11624r.invoke()).booleanValue() : true) {
                    int iLimit2 = byteBuffer.limit() / 2;
                    short[] sArr2 = new short[iLimit2];
                    byteBuffer.order(byteOrder);
                    byteBuffer.asShortBuffer().get(sArr2);
                    byteBufferM109966A = AbstractC34870c0.m109966A(sArr2, iLimit2, sArr, iLimit);
                } else {
                    int iLimit3 = byteBuffer.limit() / 2;
                    short[] sArr3 = new short[iLimit3];
                    for (int i17 = 0; i17 < iLimit3; i17++) {
                        sArr3[i17] = 0;
                    }
                    byteBufferM109966A = AbstractC34870c0.m109966A(sArr3, iLimit3, sArr, iLimit);
                }
                byteBuffer.clear();
                byteBuffer.put(byteBufferM109966A);
            }
        }
        return j7;
    }

    @Override // org.webrtc.Loggable
    public void onLogMessage(String str, Logging.Severity severity, String str2) {
        int i13 = severity == null ? -1 : AbstractC12663w.f43308a[severity.ordinal()];
        C12638j0 c12638j0 = this.f43286a;
        if (i13 == 2) {
            C2345k c2345kM35394c = c12638j0.m35394c();
            InterfaceC2339e interfaceC2339e = c2345kM35394c.f9275c;
            String str3 = c2345kM35394c.f9273a;
            EnumC2341g enumC2341g = EnumC2341g.INFO;
            if (interfaceC2339e.isLoggable(enumC2341g, str3)) {
                c2345kM35394c.f9274b.log(enumC2341g, str3, AbstractC31061c.m95640p("[onLogMessage] label: ", str2, ", message: ", str), null);
                return;
            }
            return;
        }
        if (i13 == 3) {
            C2345k c2345kM35394c2 = c12638j0.m35394c();
            InterfaceC2339e interfaceC2339e2 = c2345kM35394c2.f9275c;
            String str4 = c2345kM35394c2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.WARN;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str4)) {
                c2345kM35394c2.f9274b.log(enumC2341g2, str4, AbstractC31061c.m95640p("[onLogMessage] label: ", str2, ", message: ", str), null);
                return;
            }
            return;
        }
        if (i13 == 4) {
            C2345k c2345kM35394c3 = c12638j0.m35394c();
            InterfaceC2339e interfaceC2339e3 = c2345kM35394c3.f9275c;
            String str5 = c2345kM35394c3.f9273a;
            EnumC2341g enumC2341g3 = EnumC2341g.ERROR;
            if (interfaceC2339e3.isLoggable(enumC2341g3, str5)) {
                c2345kM35394c3.f9274b.log(enumC2341g3, str5, AbstractC31061c.m95640p("[onLogMessage] label: ", str2, ", message: ", str), null);
                return;
            }
            return;
        }
        if (i13 != 5) {
            return;
        }
        C2345k c2345kM35394c4 = c12638j0.m35394c();
        InterfaceC2339e interfaceC2339e4 = c2345kM35394c4.f9275c;
        String str6 = c2345kM35394c4.f9273a;
        EnumC2341g enumC2341g4 = EnumC2341g.DEBUG;
        if (interfaceC2339e4.isLoggable(enumC2341g4, str6)) {
            c2345kM35394c4.f9274b.log(enumC2341g4, str6, AbstractC31061c.m95640p("[onLogMessage] label: ", str2, ", message: ", str), null);
        }
    }

    @Override // org.webrtc.audio.JavaAudioDeviceModule.SamplesReadyCallback
    public void onWebRtcAudioRecordSamplesReady(JavaAudioDeviceModule.AudioSamples audioSamples) {
        C11620p c11620p = this.f43286a.f43159i;
        if (c11620p != null) {
            AbstractC22676k.m65747g(audioSamples);
            c11620p.invoke(audioSamples);
        }
    }
}
