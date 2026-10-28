package tm;

import android.content.Context;
import android.media.AudioTimestamp;
import android.media.AudioTrack;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import hn.AbstractC17506n;
import hn.AbstractC17513u;
import hn.C17501i;
import hn.C17504l;
import hn.C17507o;
import hn.C17508p;
import hn.InterfaceC17502j;
import hn.InterfaceC17503k;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import live.hms.video.error.ErrorCodes;
import p031b9.AbstractC2875y;
import p031b9.C2832g;
import p085d9.C11795l;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.InterfaceC24554l;
import p412q3.C29875i;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p465rm.C31534g1;
import p465rm.C31573v;
import p465rm.C31576w0;
import p465rm.SurfaceHolderCallbackC31565r;
import p508ty.C34249c;
import p527um.C35073c;
import p527um.C35074d;
import p619xl.C38445a;
import p690zr.AbstractC41023g0;
import p690zr.C41014d0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import p705ea2.C12915l;
import q30.C29934u0;
import q30.C29938w0;
import sm.C32713f;

/* JADX INFO: renamed from: tm.v */
/* JADX INFO: loaded from: classes6.dex */
public final class C33944v extends AbstractC17506n implements InterfaceC24554l {

    /* JADX INFO: renamed from: e1 */
    public final Context f142299e1;

    /* JADX INFO: renamed from: f1 */
    public final C29875i f142300f1;

    /* JADX INFO: renamed from: g1 */
    public final C33941s f142301g1;

    /* JADX INFO: renamed from: h1 */
    public int f142302h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f142303i1;

    /* JADX INFO: renamed from: j1 */
    public C31521c0 f142304j1;

    /* JADX INFO: renamed from: k1 */
    public long f142305k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f142306l1;

    /* JADX INFO: renamed from: m1 */
    public boolean f142307m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f142308n1;

    /* JADX INFO: renamed from: o1 */
    public C31573v f142309o1;

    public C33944v(Context context, InterfaceC17502j interfaceC17502j, Handler handler, SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r, C33941s c33941s) {
        super(1, interfaceC17502j, 44100.0f);
        this.f142299e1 = context.getApplicationContext();
        this.f142301g1 = c33941s;
        this.f142300f1 = new C29875i(handler, surfaceHolderCallbackC31565r);
        c33941s.f142288r = new C29934u0(this, 24);
    }

    /* JADX INFO: renamed from: p0 */
    public static AbstractC41023g0 m107377p0(C17507o c17507o, C31521c0 c31521c0, boolean z4, C33941s c33941s) {
        String str = c31521c0.f130077L;
        if (str == null) {
            C41017e0 c41017e0 = AbstractC41023g0.f176998x;
            return C41060w0.f177067E;
        }
        if (c33941s.m107360g(c31521c0) != 0) {
            List listM49754e = AbstractC17513u.m49754e("audio/raw", false, false);
            C17504l c17504l = listM49754e.isEmpty() ? null : (C17504l) listM49754e.get(0);
            if (c17504l != null) {
                return AbstractC41023g0.m133256r(c17504l);
            }
        }
        c17507o.getClass();
        List listM49754e2 = AbstractC17513u.m49754e(str, z4, false);
        String strM49751b = AbstractC17513u.m49751b(c31521c0);
        if (strM49751b == null) {
            return AbstractC41023g0.m133252m(listM49754e2);
        }
        List listM49754e3 = AbstractC17513u.m49754e(strM49751b, z4, false);
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        c41014d0M133251l.m133224c(listM49754e2);
        c41014d0M133251l.m133224c(listM49754e3);
        return c41014d0M133251l.m133239f();
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: A */
    public final C35074d mo49700A(C17504l c17504l, C31521c0 c31521c0, C31521c0 c31521c1) {
        C35074d c35074dM49694b = c17504l.m49694b(c31521c0, c31521c1);
        int i13 = c35074dM49694b.f148806e;
        if (m107378o0(c17504l, c31521c1) > this.f142302h1) {
            i13 |= 64;
        }
        int i14 = i13;
        return new C35074d(c17504l.f67657a, c31521c0, c31521c1, i14 != 0 ? 0 : c35074dM49694b.f148805d, i14);
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: K */
    public final float mo49710K(float f13, C31521c0[] c31521c0Arr) {
        int iMax = -1;
        for (C31521c0 c31521c0 : c31521c0Arr) {
            int i13 = c31521c0.f130091Z;
            if (i13 != -1) {
                iMax = Math.max(iMax, i13);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f13;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: L */
    public final ArrayList mo49711L(C17507o c17507o, C31521c0 c31521c0, boolean z4) {
        AbstractC41023g0 abstractC41023g0M107377p0 = m107377p0(c17507o, c31521c0, z4, this.f142301g1);
        Pattern pattern = AbstractC17513u.f67745a;
        ArrayList arrayList = new ArrayList(abstractC41023g0M107377p0);
        Collections.sort(arrayList, new C12915l(new C17508p(c31521c0, 0), 2));
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0062  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b1  */
    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: N */
    public final C17501i mo49713N(C17504l c17504l, C31521c0 c31521c0, MediaCrypto mediaCrypto, float f13) {
        boolean z4;
        C31521c0[] c31521c0Arr = this.f130105H;
        c31521c0Arr.getClass();
        int iM107378o0 = m107378o0(c17504l, c31521c0);
        if (c31521c0Arr.length != 1) {
            for (C31521c0 c31521c1 : c31521c0Arr) {
                if (c17504l.m49694b(c31521c0, c31521c1).f148805d != 0) {
                    iM107378o0 = Math.max(iM107378o0, m107378o0(c17504l, c31521c1));
                }
            }
        }
        this.f142302h1 = iM107378o0;
        String str = c17504l.f67657a;
        int i13 = AbstractC24567y.f95875a;
        if (i13 < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(AbstractC24567y.f95877c)) {
            String str2 = AbstractC24567y.f95876b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                z4 = true;
            } else {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        this.f142303i1 = z4;
        String str3 = c17504l.f67659c;
        int i14 = this.f142302h1;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str3);
        int i15 = c31521c0.f130090Y;
        String str4 = c31521c0.f130077L;
        mediaFormat.setInteger("channel-count", i15);
        int i16 = c31521c0.f130091Z;
        mediaFormat.setInteger("sample-rate", i16);
        AbstractC24543a.m71562D(mediaFormat, c31521c0.f130079N);
        AbstractC24543a.m71588x(mediaFormat, "max-input-size", i14);
        if (i13 >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f13 != -1.0f) {
                if (i13 == 23) {
                    String str5 = AbstractC24567y.f95878d;
                    if (!"ZTE B2017G".equals(str5) && !"AXON 7 mini".equals(str5)) {
                        mediaFormat.setFloat("operating-rate", f13);
                    }
                } else {
                    mediaFormat.setFloat("operating-rate", f13);
                }
            }
        }
        if (i13 <= 28 && "audio/ac4".equals(str4)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i13 >= 24) {
            int i17 = c31521c0.f130090Y;
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130047k = "audio/raw";
            c31518b0.f130060x = i17;
            c31518b0.f130061y = i16;
            c31518b0.f130062z = 4;
            if (this.f142301g1.m107360g(new C31521c0(c31518b0)) == 2) {
                mediaFormat.setInteger("pcm-encoding", 4);
            }
        }
        if (i13 >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        this.f142304j1 = (!"audio/raw".equals(c17504l.f67658b) || "audio/raw".equals(str4)) ? null : c31521c0;
        return new C17501i(c17504l, mediaFormat, c31521c0, null, mediaCrypto);
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: S */
    public final void mo49718S(Exception exc) {
        AbstractC24543a.m71578n("MediaCodecAudioRenderer", "Audio codec error", exc);
        C29875i c29875i = this.f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, exc, 3));
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: T */
    public final void mo49719T(long j7, long j13, String str) {
        C29875i c29875i = this.f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, str, j7, j13));
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: U */
    public final void mo49720U(String str) {
        C29875i c29875i = this.f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, str, 0));
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: V */
    public final C35074d mo49721V(C38445a c38445a) throws ExoPlaybackException {
        C35074d c35074dMo49721V = super.mo49721V(c38445a);
        C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
        C29875i c29875i = this.f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, c31521c0, c35074dMo49721V));
        }
        return c35074dMo49721V;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: W */
    public final void mo49722W(C31521c0 c31521c0, MediaFormat mediaFormat) throws ExoPlaybackException {
        int iM71686q;
        C31521c0 c31521c1 = this.f142304j1;
        int[] iArr = null;
        if (c31521c1 != null) {
            c31521c0 = c31521c1;
        } else if (this.f67717i0 != null) {
            String str = c31521c0.f130077L;
            int i13 = c31521c0.f130090Y;
            if ("audio/raw".equals(str)) {
                iM71686q = c31521c0.f130092a0;
            } else if (AbstractC24567y.f95875a < 24 || !mediaFormat.containsKey("pcm-encoding")) {
                iM71686q = mediaFormat.containsKey("v-bits-per-sample") ? AbstractC24567y.m71686q(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            } else {
                iM71686q = mediaFormat.getInteger("pcm-encoding");
            }
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130047k = "audio/raw";
            c31518b0.f130062z = iM71686q;
            c31518b0.f130033A = c31521c0.f130093b0;
            c31518b0.f130034B = c31521c0.f130094c0;
            c31518b0.f130060x = mediaFormat.getInteger("channel-count");
            c31518b0.f130061y = mediaFormat.getInteger("sample-rate");
            c31521c0 = new C31521c0(c31518b0);
            if (this.f142303i1 && c31521c0.f130090Y == 6 && i13 < 6) {
                iArr = new int[i13];
                for (int i14 = 0; i14 < i13; i14++) {
                    iArr[i14] = i14;
                }
            }
        }
        try {
            this.f142301g1.m107357b(c31521c0, iArr);
        } catch (AudioSink$ConfigurationException e5) {
            throw m97117e(e5, e5.f20376w, false, ErrorCodes.WebsocketMethodErrors.cAlreadyJoined);
        }
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: Y */
    public final void mo49724Y() {
        this.f142301g1.f142249G = true;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: Z */
    public final void mo49725Z(C35073c c35073c) {
        if (!this.f142306l1 || c35073c.m1496f(Integer.MIN_VALUE)) {
            return;
        }
        if (Math.abs(c35073c.f148797F - this.f142305k1) > 500000) {
            this.f142305k1 = c35073c.f148797F;
        }
        this.f142306l1 = false;
    }

    @Override // p465rm.AbstractC31523d, p465rm.InterfaceC31522c1
    /* JADX INFO: renamed from: a */
    public final void mo75855a(int i13, Object obj) {
        C33941s c33941s = this.f142301g1;
        if (i13 == 2) {
            float fFloatValue = ((Float) obj).floatValue();
            if (c33941s.f142252J != fFloatValue) {
                c33941s.f142252J = fFloatValue;
                if (c33941s.m107367n()) {
                    if (AbstractC24567y.f95875a >= 21) {
                        c33941s.f142291u.setVolume(c33941s.f142252J);
                        return;
                    }
                    AudioTrack audioTrack = c33941s.f142291u;
                    float f13 = c33941s.f142252J;
                    audioTrack.setStereoVolume(f13, f13);
                    return;
                }
                return;
            }
            return;
        }
        if (i13 == 3) {
            C33926d c33926d = (C33926d) obj;
            if (c33941s.f142292v.equals(c33926d)) {
                return;
            }
            c33941s.f142292v = c33926d;
            if (c33941s.f142267Y) {
                return;
            }
            c33941s.m107359d();
            return;
        }
        if (i13 == 6) {
            C33934l c33934l = (C33934l) obj;
            if (c33941s.f142266X.equals(c33934l)) {
                return;
            }
            c33934l.getClass();
            if (c33941s.f142291u != null) {
                c33941s.f142266X.getClass();
            }
            c33941s.f142266X = c33934l;
            return;
        }
        switch (i13) {
            case 9:
                c33941s.m107371s(c33941s.m107361h().f142239a, ((Boolean) obj).booleanValue());
                break;
            case 10:
                int iIntValue = ((Integer) obj).intValue();
                if (c33941s.f142265W != iIntValue) {
                    c33941s.f142265W = iIntValue;
                    c33941s.f142264V = iIntValue != 0;
                    c33941s.m107359d();
                }
                break;
            case 11:
                this.f142309o1 = (C31573v) obj;
                break;
        }
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: b */
    public final C31576w0 mo8163b() {
        C33941s c33941s = this.f142301g1;
        return c33941s.f142281k ? c33941s.f142295y : c33941s.m107361h().f142239a;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: b0 */
    public final boolean mo49727b0(long j7, long j13, InterfaceC17503k interfaceC17503k, ByteBuffer byteBuffer, int i13, int i14, int i15, long j14, boolean z4, boolean z13, C31521c0 c31521c0) throws ExoPlaybackException {
        byteBuffer.getClass();
        if (this.f142304j1 != null && (i14 & 2) != 0) {
            interfaceC17503k.getClass();
            interfaceC17503k.releaseOutputBuffer(i13, false);
            return true;
        }
        C33941s c33941s = this.f142301g1;
        if (z4) {
            if (interfaceC17503k != null) {
                interfaceC17503k.releaseOutputBuffer(i13, false);
            }
            this.f67705Z0.f11171g += i15;
            c33941s.f142249G = true;
            return true;
        }
        try {
            if (!c33941s.m107364k(byteBuffer, j14, i15)) {
                return false;
            }
            if (interfaceC17503k != null) {
                interfaceC17503k.releaseOutputBuffer(i13, false);
            }
            this.f67705Z0.f11170f += i15;
            return true;
        } catch (AudioSink$InitializationException e5) {
            throw m97117e(e5, e5.f20378x, e5.f20377w, ErrorCodes.WebsocketMethodErrors.cAlreadyJoined);
        } catch (AudioSink$WriteException e13) {
            throw m97117e(e13, c31521c0, e13.f20379w, 5002);
        }
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: c */
    public final long mo8165c() {
        if (this.f130103F == 2) {
            m107379q0();
        }
        return this.f142305k1;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: e0 */
    public final void mo49730e0() throws ExoPlaybackException {
        try {
            C33941s c33941s = this.f142301g1;
            if (!c33941s.f142261S && c33941s.m107367n() && c33941s.m107358c()) {
                c33941s.m107368p();
                c33941s.f142261S = true;
            }
        } catch (AudioSink$WriteException e5) {
            throw m97117e(e5, e5.f20380x, e5.f20379w, 5002);
        }
    }

    @Override // p309lo.InterfaceC24554l
    /* JADX INFO: renamed from: f */
    public final void mo8168f(C31576w0 c31576w0) {
        C33941s c33941s = this.f142301g1;
        c33941s.getClass();
        C31576w0 c31576w1 = new C31576w0(AbstractC24567y.m71676g(c31576w0.f130465w, 0.1f, 8.0f), AbstractC24567y.m71676g(c31576w0.f130466x, 0.1f, 8.0f));
        if (!c33941s.f142281k || AbstractC24567y.f95875a < 23) {
            c33941s.m107371s(c31576w1, c33941s.m107361h().f142240b);
        } else {
            c33941s.m107372t(c31576w1);
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: g */
    public final InterfaceC24554l mo97118g() {
        return this;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: h */
    public final String mo54420h() {
        return "MediaCodecAudioRenderer";
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: j */
    public final boolean mo49735j() {
        if (!this.f67697V0) {
            return false;
        }
        C33941s c33941s = this.f142301g1;
        if (c33941s.m107367n()) {
            return c33941s.f142261S && !c33941s.m107365l();
        }
        return true;
    }

    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: j0 */
    public final boolean mo49736j0(C31521c0 c31521c0) {
        return this.f142301g1.m107360g(c31521c0) != 0;
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public final boolean mo49737k() {
        return this.f142301g1.m107365l() || super.mo49737k();
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0050, code lost:
    
        if ((r5.isEmpty() ? null : (hn.C17504l) r5.get(0)) != null) goto L30;
     */
    @Override // hn.AbstractC17506n
    /* JADX INFO: renamed from: k0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int mo49738k0(hn.C17507o r14, p465rm.C31521c0 r15) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.C33944v.mo49738k0(hn.o, rm.c0):int");
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: l */
    public final void mo54421l() {
        C29875i c29875i = this.f142300f1;
        this.f142308n1 = true;
        try {
            this.f142301g1.m107359d();
            try {
                this.f67704Z = null;
                this.f67707a1 = -9223372036854775807L;
                this.f67709b1 = -9223372036854775807L;
                this.f67711c1 = 0;
                m49707H();
            } finally {
                c29875i.m91498g(this.f67705Z0);
            }
        } catch (Throwable th3) {
            try {
                this.f67704Z = null;
                this.f67707a1 = -9223372036854775807L;
                this.f67709b1 = -9223372036854775807L;
                this.f67711c1 = 0;
                m49707H();
                throw th3;
            } finally {
                c29875i.m91498g(this.f67705Z0);
            }
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: m */
    public final void mo75856m(boolean z4, boolean z13) {
        C2832g c2832g = new C2832g(1);
        this.f67705Z0 = c2832g;
        C29875i c29875i = this.f142300f1;
        Handler handler = (Handler) c29875i.f122095w;
        if (handler != null) {
            handler.post(new RunnableC33931i(c29875i, c2832g, 5));
        }
        C31534g1 c31534g1 = this.f130112y;
        c31534g1.getClass();
        boolean z14 = c31534g1.f130151a;
        C33941s c33941s = this.f142301g1;
        if (z14) {
            c33941s.getClass();
            AbstractC24543a.m71573i(AbstractC24567y.f95875a >= 21);
            AbstractC24543a.m71573i(c33941s.f142264V);
            if (!c33941s.f142267Y) {
                c33941s.f142267Y = true;
                c33941s.m107359d();
            }
        } else if (c33941s.f142267Y) {
            c33941s.f142267Y = false;
            c33941s.m107359d();
        }
        C32713f c32713f = this.f130102E;
        c32713f.getClass();
        c33941s.f142287q = c32713f;
    }

    @Override // hn.AbstractC17506n, p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public final void mo49741n(long j7, boolean z4) throws ExoPlaybackException {
        super.mo49741n(j7, z4);
        this.f142301g1.m107359d();
        this.f142305k1 = j7;
        this.f142306l1 = true;
        this.f142307m1 = true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: o */
    public final void mo75857o() {
        C33941s c33941s = this.f142301g1;
        try {
            try {
                m49702C();
                m49729d0();
                C34249c c34249c = this.f67710c0;
                if (c34249c != null) {
                    c34249c.m108304u(null);
                }
                this.f67710c0 = null;
                if (this.f142308n1) {
                    this.f142308n1 = false;
                    c33941s.m107370r();
                }
            } catch (Throwable th3) {
                C34249c c34249c2 = this.f67710c0;
                if (c34249c2 != null) {
                    c34249c2.m108304u(null);
                }
                this.f67710c0 = null;
                throw th3;
            }
        } catch (Throwable th4) {
            if (this.f142308n1) {
                this.f142308n1 = false;
                c33941s.m107370r();
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final int m107378o0(C17504l c17504l, C31521c0 c31521c0) {
        int i13;
        if (!"OMX.google.raw.decoder".equals(c17504l.f67657a) || (i13 = AbstractC24567y.f95875a) >= 24 || (i13 == 23 && AbstractC24567y.m71694y(this.f142299e1))) {
            return c31521c0.f130078M;
        }
        return -1;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: p */
    public final void mo75859p() {
        C33941s c33941s = this.f142301g1;
        c33941s.f142263U = true;
        if (c33941s.m107367n()) {
            C11795l c11795l = c33941s.f142279i.f142198f;
            c11795l.getClass();
            c11795l.m31610a();
            c33941s.f142291u.play();
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: q */
    public final void mo75860q() {
        m107379q0();
        C33941s c33941s = this.f142301g1;
        c33941s.f142263U = false;
        if (c33941s.m107367n()) {
            C33933k c33933k = c33941s.f142279i;
            c33933k.f142204l = 0L;
            c33933k.f142215w = 0;
            c33933k.f142214v = 0;
            c33933k.f142205m = 0L;
            c33933k.f142189C = 0L;
            c33933k.f142192F = 0L;
            c33933k.f142203k = false;
            if (c33933k.f142216x == -9223372036854775807L) {
                C11795l c11795l = c33933k.f142198f;
                c11795l.getClass();
                c11795l.m31610a();
                c33941s.f142291u.pause();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0147  */
    /* JADX WARN: Code duplicated, block: B:70:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0155  */
    /* JADX WARN: Code duplicated, block: B:72:0x015f  */
    /* JADX WARN: Code duplicated, block: B:75:0x016b  */
    /* JADX WARN: Code duplicated, block: B:76:0x016f  */
    /* JADX WARN: Code duplicated, block: B:79:0x017d  */
    /* JADX WARN: Code duplicated, block: B:80:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:82:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x0215  */
    /* JADX WARN: Code duplicated, block: B:85:0x021e  */
    /* JADX WARN: Code duplicated, block: B:95:0x0257 A[Catch: Exception -> 0x0272, TRY_LEAVE, TryCatch #0 {Exception -> 0x0272, blocks: (B:93:0x0232, B:95:0x0257), top: B:166:0x0232 }] */
    /* JADX INFO: renamed from: q0 */
    public final void m107379q0() {
        long j7;
        long jMax;
        boolean z4;
        C33941s c33941s;
        C29938w0 c29938w0;
        C33941s c33941s2;
        long j13;
        long jM107347a;
        C29938w0 c29938w1;
        long jM71685p;
        long jM71666D;
        long j14;
        boolean timestamp;
        long j15;
        long j16;
        long j17;
        long j18;
        long j19;
        Method method;
        long jMax2;
        boolean zMo49735j = mo49735j();
        C33941s c33941s3 = this.f142301g1;
        C29938w0 c29938w2 = c33941s3.f142271b;
        if (!c33941s3.m107367n() || c33941s3.f142250H) {
            j7 = Long.MIN_VALUE;
            jMax = Long.MIN_VALUE;
        } else {
            C33933k c33933k = c33941s3.f142279i;
            C33941s c33941s4 = (C33941s) c33933k.f142193a.f122249x;
            AudioTrack audioTrack = c33933k.f142195c;
            audioTrack.getClass();
            j7 = Long.MIN_VALUE;
            if (audioTrack.getPlayState() == 3) {
                long[] jArr = c33933k.f142194b;
                j13 = 1000;
                long jM107347a2 = (c33933k.m107347a() * 1000000) / ((long) c33933k.f142199g);
                if (jM107347a2 == 0) {
                    z4 = zMo49735j;
                    c33941s = c33941s3;
                    c29938w0 = c29938w2;
                    c33941s2 = c33941s4;
                } else {
                    c33941s2 = c33941s4;
                    long jNanoTime = System.nanoTime() / 1000;
                    if (jNanoTime - c33933k.f142205m >= 30000) {
                        int i13 = c33933k.f142214v;
                        jArr[i13] = jM107347a2 - jNanoTime;
                        c33933k.f142214v = (i13 + 1) % 10;
                        int i14 = c33933k.f142215w;
                        if (i14 < 10) {
                            c33933k.f142215w = i14 + 1;
                        }
                        c33933k.f142205m = jNanoTime;
                        c33933k.f142204l = 0L;
                        int i15 = 0;
                        while (true) {
                            int i16 = c33933k.f142215w;
                            if (i15 >= i16) {
                                break;
                            }
                            c33933k.f142204l = (jArr[i15] / ((long) i16)) + c33933k.f142204l;
                            i15++;
                        }
                    }
                    if (c33933k.f142200h) {
                        z4 = zMo49735j;
                        c33941s = c33941s3;
                        c29938w0 = c29938w2;
                    } else {
                        C11795l c11795l = c33933k.f142198f;
                        c11795l.getClass();
                        C33932j c33932j = (C33932j) c11795l.f38261g;
                        if (c33932j != null) {
                            AudioTimestamp audioTimestamp = c33932j.f142183b;
                            j14 = 500000;
                            if (jNanoTime - c11795l.f38259e >= c11795l.f38258d) {
                                c11795l.f38259e = jNanoTime;
                                timestamp = c33932j.f142182a.getTimestamp(audioTimestamp);
                                if (timestamp) {
                                    long j24 = audioTimestamp.framePosition;
                                    if (c33932j.f142185d > j24) {
                                        c33932j.f142184c++;
                                    }
                                    c33932j.f142185d = j24;
                                    c33932j.f142186e = j24 + (c33932j.f142184c << 32);
                                }
                                int i17 = c11795l.f38256b;
                                if (i17 != 0) {
                                    if (i17 != 1) {
                                        if (i17 != 2) {
                                            if (i17 != 3) {
                                                if (i17 != 4) {
                                                    throw new IllegalStateException();
                                                }
                                            } else if (timestamp) {
                                                c11795l.m31610a();
                                            }
                                        } else if (!timestamp) {
                                            c11795l.m31610a();
                                        }
                                    } else if (!timestamp) {
                                        c11795l.m31610a();
                                    } else if (c33932j.f142186e > c11795l.f38260f) {
                                        c11795l.m31611b(2);
                                    }
                                } else if (timestamp) {
                                    if (audioTimestamp.nanoTime / 1000 >= c11795l.f38257c) {
                                        c11795l.f38260f = c33932j.f142186e;
                                        c11795l.m31611b(1);
                                    }
                                } else if (jNanoTime - c11795l.f38257c > 500000) {
                                    c11795l.m31611b(3);
                                }
                            }
                            if (timestamp) {
                                if (c33932j != null) {
                                    j15 = 5000000;
                                    j16 = c33932j.f142183b.nanoTime / 1000;
                                } else {
                                    j15 = 5000000;
                                    j16 = -9223372036854775807L;
                                }
                                if (c33932j != null) {
                                    j17 = c33932j.f142186e;
                                } else {
                                    j17 = -1;
                                }
                                if (Math.abs(j16 - jNanoTime) > j15) {
                                    long jM107362i = c33941s2.m107362i();
                                    long jM107363j = c33941s2.m107363j();
                                    z4 = zMo49735j;
                                    StringBuilder sb4 = new StringBuilder(180);
                                    sb4.append("Spurious audio timestamp (system clock mismatch): ");
                                    sb4.append(j17);
                                    sb4.append(", ");
                                    sb4.append(j16);
                                    AbstractC2875y.m8285A(sb4, ", ", jNanoTime, ", ");
                                    sb4.append(jM107347a2);
                                    AbstractC2875y.m8285A(sb4, ", ", jM107362i, ", ");
                                    sb4.append(jM107363j);
                                    Log.w("DefaultAudioSink", sb4.toString());
                                    c11795l.m31611b(4);
                                    c33941s = c33941s3;
                                    c29938w0 = c29938w2;
                                    j18 = jNanoTime;
                                } else {
                                    z4 = zMo49735j;
                                    j18 = jNanoTime;
                                    j19 = j17;
                                    if (Math.abs(((j17 * 1000000) / ((long) c33933k.f142199g)) - jM107347a2) > j15) {
                                        long jM107362i2 = c33941s2.m107362i();
                                        long jM107363j2 = c33941s2.m107363j();
                                        c29938w0 = c29938w2;
                                        c33941s = c33941s3;
                                        StringBuilder sb5 = new StringBuilder(182);
                                        sb5.append("Spurious audio timestamp (frame position mismatch): ");
                                        sb5.append(j19);
                                        sb5.append(", ");
                                        sb5.append(j16);
                                        AbstractC2875y.m8285A(sb5, ", ", j18, ", ");
                                        sb5.append(jM107347a2);
                                        AbstractC2875y.m8285A(sb5, ", ", jM107362i2, ", ");
                                        sb5.append(jM107363j2);
                                        Log.w("DefaultAudioSink", sb5.toString());
                                        c11795l.m31611b(4);
                                    } else {
                                        c33941s = c33941s3;
                                        c29938w0 = c29938w2;
                                        if (c11795l.f38256b == 4) {
                                            c11795l.m31610a();
                                        }
                                    }
                                }
                            } else {
                                z4 = zMo49735j;
                                c33941s = c33941s3;
                                c29938w0 = c29938w2;
                                j18 = jNanoTime;
                                j15 = 5000000;
                            }
                            if (c33933k.f142209q && (method = c33933k.f142206n) != null && j18 - c33933k.f142210r >= j14) {
                                try {
                                    AudioTrack audioTrack2 = c33933k.f142195c;
                                    audioTrack2.getClass();
                                    Integer num = (Integer) method.invoke(audioTrack2, null);
                                    int i18 = AbstractC24567y.f95875a;
                                    long jIntValue = (((long) num.intValue()) * 1000) - c33933k.f142201i;
                                    c33933k.f142207o = jIntValue;
                                    jMax2 = Math.max(jIntValue, 0L);
                                    c33933k.f142207o = jMax2;
                                    if (jMax2 > j15) {
                                        StringBuilder sb6 = new StringBuilder(61);
                                        sb6.append("Ignoring impossibly large audio latency: ");
                                        sb6.append(jMax2);
                                        Log.w("DefaultAudioSink", sb6.toString());
                                        c33933k.f142207o = 0L;
                                    }
                                } catch (Exception unused) {
                                    c33933k.f142206n = null;
                                }
                                c33933k.f142210r = j18;
                            }
                        } else {
                            j14 = 500000;
                        }
                        timestamp = false;
                        if (timestamp) {
                            z4 = zMo49735j;
                            c33941s = c33941s3;
                            c29938w0 = c29938w2;
                            j18 = jNanoTime;
                            j15 = 5000000;
                        } else {
                            if (c33932j != null) {
                                j15 = 5000000;
                                j16 = c33932j.f142183b.nanoTime / 1000;
                            } else {
                                j15 = 5000000;
                                j16 = -9223372036854775807L;
                            }
                            if (c33932j != null) {
                                j17 = c33932j.f142186e;
                            } else {
                                j17 = -1;
                            }
                            if (Math.abs(j16 - jNanoTime) > j15) {
                                long jM107362i3 = c33941s2.m107362i();
                                long jM107363j3 = c33941s2.m107363j();
                                z4 = zMo49735j;
                                StringBuilder sb7 = new StringBuilder(180);
                                sb7.append("Spurious audio timestamp (system clock mismatch): ");
                                sb7.append(j17);
                                sb7.append(", ");
                                sb7.append(j16);
                                AbstractC2875y.m8285A(sb7, ", ", jNanoTime, ", ");
                                sb7.append(jM107347a2);
                                AbstractC2875y.m8285A(sb7, ", ", jM107362i3, ", ");
                                sb7.append(jM107363j3);
                                Log.w("DefaultAudioSink", sb7.toString());
                                c11795l.m31611b(4);
                                c33941s = c33941s3;
                                c29938w0 = c29938w2;
                                j18 = jNanoTime;
                            } else {
                                z4 = zMo49735j;
                                j18 = jNanoTime;
                                j19 = j17;
                                if (Math.abs(((j17 * 1000000) / ((long) c33933k.f142199g)) - jM107347a2) > j15) {
                                    long jM107362i4 = c33941s2.m107362i();
                                    long jM107363j4 = c33941s2.m107363j();
                                    c29938w0 = c29938w2;
                                    c33941s = c33941s3;
                                    StringBuilder sb8 = new StringBuilder(182);
                                    sb8.append("Spurious audio timestamp (frame position mismatch): ");
                                    sb8.append(j19);
                                    sb8.append(", ");
                                    sb8.append(j16);
                                    AbstractC2875y.m8285A(sb8, ", ", j18, ", ");
                                    sb8.append(jM107347a2);
                                    AbstractC2875y.m8285A(sb8, ", ", jM107362i4, ", ");
                                    sb8.append(jM107363j4);
                                    Log.w("DefaultAudioSink", sb8.toString());
                                    c11795l.m31611b(4);
                                } else {
                                    c33941s = c33941s3;
                                    c29938w0 = c29938w2;
                                    if (c11795l.f38256b == 4) {
                                        c11795l.m31610a();
                                    }
                                }
                            }
                        }
                        if (c33933k.f142209q) {
                            AudioTrack audioTrack3 = c33933k.f142195c;
                            audioTrack3.getClass();
                            Integer num2 = (Integer) method.invoke(audioTrack3, null);
                            int i19 = AbstractC24567y.f95875a;
                            long jIntValue2 = (((long) num2.intValue()) * 1000) - c33933k.f142201i;
                            c33933k.f142207o = jIntValue2;
                            jMax2 = Math.max(jIntValue2, 0L);
                            c33933k.f142207o = jMax2;
                            if (jMax2 > j15) {
                                StringBuilder sb9 = new StringBuilder(61);
                                sb9.append("Ignoring impossibly large audio latency: ");
                                sb9.append(jMax2);
                                Log.w("DefaultAudioSink", sb9.toString());
                                c33933k.f142207o = 0L;
                            }
                            c33933k.f142210r = j18;
                        }
                    }
                }
            } else {
                z4 = zMo49735j;
                c33941s = c33941s3;
                c29938w0 = c29938w2;
                c33941s2 = c33941s4;
                j13 = 1000;
            }
            long jNanoTime2 = System.nanoTime() / j13;
            C11795l c11795l2 = c33933k.f142198f;
            c11795l2.getClass();
            boolean z13 = c11795l2.f38256b == 2;
            if (z13) {
                C33932j c33932j2 = (C33932j) c11795l2.f38261g;
                jM107347a = AbstractC24567y.m71685p(c33933k.f142202j, jNanoTime2 - (c33932j2 != null ? c33932j2.f142183b.nanoTime / j13 : -9223372036854775807L)) + (((c33932j2 != null ? c33932j2.f142186e : -1L) * 1000000) / ((long) c33933k.f142199g));
            } else {
                jM107347a = c33933k.f142215w == 0 ? (c33933k.m107347a() * 1000000) / ((long) c33933k.f142199g) : c33933k.f142204l + jNanoTime2;
                if (!z4) {
                    jM107347a = Math.max(0L, jM107347a - c33933k.f142207o);
                }
            }
            if (c33933k.f142190D != z13) {
                c33933k.f142192F = c33933k.f142189C;
                c33933k.f142191E = c33933k.f142188B;
            }
            long j25 = jNanoTime2 - c33933k.f142192F;
            if (j25 < 1000000) {
                long jM71685p2 = AbstractC24567y.m71685p(c33933k.f142202j, j25) + c33933k.f142191E;
                long j26 = (j25 * j13) / 1000000;
                jM107347a = (((j13 - j26) * jM71685p2) + (jM107347a * j26)) / j13;
            }
            if (!c33933k.f142203k) {
                long j27 = c33933k.f142188B;
                if (jM107347a > j27) {
                    c33933k.f142203k = true;
                    long jCurrentTimeMillis = System.currentTimeMillis() - AbstractC24567y.m71669G(AbstractC24567y.m71688s(c33933k.f142202j, AbstractC24567y.m71669G(jM107347a - j27)));
                    C29934u0 c29934u0 = c33941s2.f142288r;
                    if (c29934u0 != null) {
                        C29875i c29875i = ((C33944v) c29934u0.f122249x).f142300f1;
                        Handler handler = (Handler) c29875i.f122095w;
                        if (handler != null) {
                            handler.post(new RunnableC33931i(c29875i, jCurrentTimeMillis));
                        }
                    }
                }
            }
            c33933k.f142189C = jNanoTime2;
            c33933k.f142188B = jM107347a;
            c33933k.f142190D = z13;
            C33941s c33941s5 = c33941s;
            long jMin = Math.min(jM107347a, (c33941s5.m107363j() * 1000000) / ((long) c33941s5.f142290t.f142234e));
            ArrayDeque arrayDeque = c33941s5.f142280j;
            while (!arrayDeque.isEmpty() && jMin >= ((C33940r) arrayDeque.getFirst()).f142242d) {
                c33941s5.f142294x = (C33940r) arrayDeque.remove();
            }
            C33940r c33940r = c33941s5.f142294x;
            long j28 = jMin - c33940r.f142242d;
            if (c33940r.f142239a.equals(C31576w0.f130464z)) {
                jM71685p = c33941s5.f142294x.f142241c + j28;
                c29938w1 = c29938w0;
            } else if (arrayDeque.isEmpty()) {
                c29938w1 = c29938w0;
                C33948z c33948z = (C33948z) c29938w1.f122262z;
                if (c33948z.f142357o >= 1024) {
                    long j29 = c33948z.f142356n;
                    C33947y c33947y = c33948z.f142352j;
                    c33947y.getClass();
                    long j34 = j29 - ((long) ((c33947y.f142332k * c33947y.f142323b) * 2));
                    int i24 = c33948z.f142350h.f142175a;
                    int i25 = c33948z.f142349g.f142175a;
                    jM71666D = i24 == i25 ? AbstractC24567y.m71666D(j28, j34, c33948z.f142357o) : AbstractC24567y.m71666D(j28, j34 * ((long) i24), c33948z.f142357o * ((long) i25));
                } else {
                    jM71666D = (long) (((double) c33948z.f142345c) * j28);
                }
                jM71685p = jM71666D + c33941s5.f142294x.f142241c;
            } else {
                c29938w1 = c29938w0;
                C33940r c33940r2 = (C33940r) arrayDeque.getFirst();
                jM71685p = c33940r2.f142241c - AbstractC24567y.m71685p(c33941s5.f142294x.f142239a.f130465w, c33940r2.f142242d - jMin);
            }
            jMax = ((((C33946x) c29938w1.f122261y).f142321t * 1000000) / ((long) c33941s5.f142290t.f142234e)) + jM71685p;
        }
        if (jMax != j7) {
            if (!this.f142307m1) {
                jMax = Math.max(this.f142305k1, jMax);
            }
            this.f142305k1 = jMax;
            this.f142307m1 = false;
        }
    }
}
