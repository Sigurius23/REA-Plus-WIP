package hn;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer$InsufficientCapacityException;
import com.google.android.exoplayer2.drm.DrmSession$DrmSessionException;
import com.google.android.exoplayer2.mediacodec.MediaCodecDecoderException;
import com.google.android.exoplayer2.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import com.google.android.exoplayer2.mediacodec.MediaCodecUtil$DecoderQueryException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import live.hms.video.error.ErrorCodes;
import p010a9.C0578c;
import p031b9.C2832g;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24565w;
import p465rm.AbstractC31523d;
import p465rm.AbstractC31532g;
import p465rm.C31521c0;
import p508ty.C34249c;
import p527um.C35073c;
import p527um.C35074d;
import p556vm.AbstractC36142i;
import p619xl.C38445a;
import q63.AbstractC30007c;
import sm.C32713f;
import sn.InterfaceC32756r0;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: hn.n */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC17506n extends AbstractC31523d {

    /* JADX INFO: renamed from: d1 */
    public static final byte[] f67665d1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0 */
    public boolean f67666A0;

    /* JADX INFO: renamed from: B0 */
    public C17500h f67667B0;

    /* JADX INFO: renamed from: C0 */
    public long f67668C0;

    /* JADX INFO: renamed from: D0 */
    public int f67669D0;

    /* JADX INFO: renamed from: E0 */
    public int f67670E0;

    /* JADX INFO: renamed from: F0 */
    public ByteBuffer f67671F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f67672G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f67673H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f67674I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f67675J0;

    /* JADX INFO: renamed from: K0 */
    public boolean f67676K0;

    /* JADX INFO: renamed from: L0 */
    public boolean f67677L0;

    /* JADX INFO: renamed from: M */
    public final InterfaceC17502j f67678M;

    /* JADX INFO: renamed from: M0 */
    public int f67679M0;

    /* JADX INFO: renamed from: N */
    public final C17507o f67680N;

    /* JADX INFO: renamed from: N0 */
    public int f67681N0;

    /* JADX INFO: renamed from: O */
    public final float f67682O;

    /* JADX INFO: renamed from: O0 */
    public int f67683O0;

    /* JADX INFO: renamed from: P */
    public final C35073c f67684P;

    /* JADX INFO: renamed from: P0 */
    public boolean f67685P0;

    /* JADX INFO: renamed from: Q */
    public final C35073c f67686Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f67687Q0;

    /* JADX INFO: renamed from: R */
    public final C35073c f67688R;

    /* JADX INFO: renamed from: R0 */
    public boolean f67689R0;

    /* JADX INFO: renamed from: S */
    public final C17499g f67690S;

    /* JADX INFO: renamed from: S0 */
    public long f67691S0;

    /* JADX INFO: renamed from: T */
    public final C24565w f67692T;

    /* JADX INFO: renamed from: T0 */
    public long f67693T0;

    /* JADX INFO: renamed from: U */
    public final ArrayList f67694U;

    /* JADX INFO: renamed from: U0 */
    public boolean f67695U0;

    /* JADX INFO: renamed from: V */
    public final MediaCodec.BufferInfo f67696V;

    /* JADX INFO: renamed from: V0 */
    public boolean f67697V0;

    /* JADX INFO: renamed from: W */
    public final long[] f67698W;

    /* JADX INFO: renamed from: W0 */
    public boolean f67699W0;

    /* JADX INFO: renamed from: X */
    public final long[] f67700X;

    /* JADX INFO: renamed from: X0 */
    public boolean f67701X0;

    /* JADX INFO: renamed from: Y */
    public final long[] f67702Y;

    /* JADX INFO: renamed from: Y0 */
    public ExoPlaybackException f67703Y0;

    /* JADX INFO: renamed from: Z */
    public C31521c0 f67704Z;

    /* JADX INFO: renamed from: Z0 */
    public C2832g f67705Z0;

    /* JADX INFO: renamed from: a0 */
    public C31521c0 f67706a0;

    /* JADX INFO: renamed from: a1 */
    public long f67707a1;

    /* JADX INFO: renamed from: b0 */
    public C34249c f67708b0;

    /* JADX INFO: renamed from: b1 */
    public long f67709b1;

    /* JADX INFO: renamed from: c0 */
    public C34249c f67710c0;

    /* JADX INFO: renamed from: c1 */
    public int f67711c1;

    /* JADX INFO: renamed from: d0 */
    public MediaCrypto f67712d0;

    /* JADX INFO: renamed from: e0 */
    public boolean f67713e0;

    /* JADX INFO: renamed from: f0 */
    public final long f67714f0;

    /* JADX INFO: renamed from: g0 */
    public float f67715g0;

    /* JADX INFO: renamed from: h0 */
    public float f67716h0;

    /* JADX INFO: renamed from: i0 */
    public InterfaceC17503k f67717i0;

    /* JADX INFO: renamed from: j0 */
    public C31521c0 f67718j0;

    /* JADX INFO: renamed from: k0 */
    public MediaFormat f67719k0;

    /* JADX INFO: renamed from: l0 */
    public boolean f67720l0;

    /* JADX INFO: renamed from: m0 */
    public float f67721m0;

    /* JADX INFO: renamed from: n0 */
    public ArrayDeque f67722n0;

    /* JADX INFO: renamed from: o0 */
    public MediaCodecRenderer$DecoderInitializationException f67723o0;

    /* JADX INFO: renamed from: p0 */
    public C17504l f67724p0;

    /* JADX INFO: renamed from: q0 */
    public int f67725q0;

    /* JADX INFO: renamed from: r0 */
    public boolean f67726r0;

    /* JADX INFO: renamed from: s0 */
    public boolean f67727s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f67728t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f67729u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f67730v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f67731w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f67732x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f67733y0;

    /* JADX INFO: renamed from: z0 */
    public boolean f67734z0;

    public AbstractC17506n(int i13, InterfaceC17502j interfaceC17502j, float f13) {
        super(i13);
        this.f67678M = interfaceC17502j;
        this.f67680N = C17507o.f67735x;
        this.f67682O = f13;
        this.f67684P = new C35073c(0);
        this.f67686Q = new C35073c(0);
        this.f67688R = new C35073c(2);
        C17499g c17499g = new C17499g(2);
        c17499g.f67648K = 32;
        this.f67690S = c17499g;
        this.f67692T = new C24565w(0);
        this.f67694U = new ArrayList();
        this.f67696V = new MediaCodec.BufferInfo();
        this.f67715g0 = 1.0f;
        this.f67716h0 = 1.0f;
        this.f67714f0 = -9223372036854775807L;
        this.f67698W = new long[10];
        this.f67700X = new long[10];
        this.f67702Y = new long[10];
        this.f67707a1 = -9223372036854775807L;
        this.f67709b1 = -9223372036854775807L;
        c17499g.m110918q(0);
        c17499g.f148801z.order(ByteOrder.nativeOrder());
        this.f67721m0 = -1.0f;
        this.f67725q0 = 0;
        this.f67679M0 = 0;
        this.f67669D0 = -1;
        this.f67670E0 = -1;
        this.f67668C0 = -9223372036854775807L;
        this.f67691S0 = -9223372036854775807L;
        this.f67693T0 = -9223372036854775807L;
        this.f67681N0 = 0;
        this.f67683O0 = 0;
    }

    /* JADX INFO: renamed from: A */
    public abstract C35074d mo49700A(C17504l c17504l, C31521c0 c31521c0, C31521c0 c31521c1);

    /* JADX INFO: renamed from: B */
    public MediaCodecDecoderException mo49701B(IllegalStateException illegalStateException, C17504l c17504l) {
        return new MediaCodecDecoderException(illegalStateException, c17504l);
    }

    /* JADX INFO: renamed from: C */
    public final void m49702C() {
        this.f67676K0 = false;
        this.f67690S.mo49690o();
        this.f67688R.mo49690o();
        this.f67675J0 = false;
        this.f67674I0 = false;
    }

    /* JADX INFO: renamed from: D */
    public final boolean m49703D() throws ExoPlaybackException {
        if (!this.f67685P0) {
            m49740m0();
            return true;
        }
        this.f67681N0 = 1;
        if (this.f67727s0 || this.f67729u0) {
            this.f67683O0 = 3;
            return false;
        }
        this.f67683O0 = 2;
        return true;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m49704E(long j7, long j13) throws ExoPlaybackException {
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo49727b0;
        int iMo45163f;
        boolean z13;
        int i13 = this.f67670E0;
        MediaCodec.BufferInfo bufferInfo2 = this.f67696V;
        if (i13 < 0) {
            if (this.f67730v0 && this.f67687Q0) {
                try {
                    iMo45163f = this.f67717i0.mo45163f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m49726a0();
                    if (this.f67697V0) {
                        m49729d0();
                    }
                }
            } else {
                iMo45163f = this.f67717i0.mo45163f(bufferInfo2);
            }
            if (iMo45163f < 0) {
                if (iMo45163f != -2) {
                    if (this.f67666A0 && (this.f67695U0 || this.f67681N0 == 2)) {
                        m49726a0();
                        return false;
                    }
                    return false;
                }
                this.f67689R0 = true;
                MediaFormat outputFormat = this.f67717i0.getOutputFormat();
                if (this.f67725q0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                    this.f67734z0 = true;
                    return true;
                }
                if (this.f67732x0) {
                    outputFormat.setInteger("channel-count", 1);
                }
                this.f67719k0 = outputFormat;
                this.f67720l0 = true;
                return true;
            }
            if (this.f67734z0) {
                this.f67734z0 = false;
                this.f67717i0.releaseOutputBuffer(iMo45163f, false);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m49726a0();
                return false;
            }
            this.f67670E0 = iMo45163f;
            ByteBuffer outputBuffer = this.f67717i0.getOutputBuffer(iMo45163f);
            this.f67671F0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f67671F0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            if (this.f67731w0 && bufferInfo2.presentationTimeUs == 0 && (bufferInfo2.flags & 4) != 0) {
                long j14 = this.f67691S0;
                if (j14 != -9223372036854775807L) {
                    bufferInfo2.presentationTimeUs = j14;
                }
            }
            long j15 = bufferInfo2.presentationTimeUs;
            ArrayList arrayList = this.f67694U;
            int size = arrayList.size();
            int i14 = 0;
            while (true) {
                if (i14 >= size) {
                    z13 = false;
                    break;
                }
                if (((Long) arrayList.get(i14)).longValue() == j15) {
                    arrayList.remove(i14);
                    z13 = true;
                    break;
                }
                i14++;
            }
            this.f67672G0 = z13;
            long j16 = this.f67693T0;
            long j17 = bufferInfo2.presentationTimeUs;
            this.f67673H0 = j16 == j17;
            m49742n0(j17);
        }
        if (this.f67730v0 && this.f67687Q0) {
            try {
                z4 = false;
                bufferInfo = bufferInfo2;
                try {
                    zMo49727b0 = mo49727b0(j7, j13, this.f67717i0, this.f67671F0, this.f67670E0, bufferInfo2.flags, 1, bufferInfo2.presentationTimeUs, this.f67672G0, this.f67673H0, this.f67706a0);
                } catch (IllegalStateException unused2) {
                    m49726a0();
                    if (!this.f67697V0) {
                        return z4;
                    }
                    m49729d0();
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            z4 = false;
            bufferInfo = bufferInfo2;
            zMo49727b0 = mo49727b0(j7, j13, this.f67717i0, this.f67671F0, this.f67670E0, bufferInfo.flags, 1, bufferInfo.presentationTimeUs, this.f67672G0, this.f67673H0, this.f67706a0);
        }
        if (!zMo49727b0) {
            return z4;
        }
        mo49723X(bufferInfo.presentationTimeUs);
        boolean z14 = (bufferInfo.flags & 4) != 0 ? true : z4;
        this.f67670E0 = -1;
        this.f67671F0 = null;
        if (!z14) {
            return r15;
        }
        m49726a0();
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0188  */
    /* JADX WARN: Code duplicated, block: B:106:0x0190  */
    /* JADX WARN: Code duplicated, block: B:108:0x019a  */
    /* JADX WARN: Code duplicated, block: B:112:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01af A[LOOP:2: B:113:0x01ad->B:114:0x01af, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:117:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:118:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:120:0x0210  */
    /* JADX WARN: Code duplicated, block: B:123:0x0219  */
    /* JADX WARN: Code duplicated, block: B:126:0x0226  */
    /* JADX WARN: Code duplicated, block: B:129:0x0243  */
    /* JADX WARN: Code duplicated, block: B:132:0x024b A[Catch: CryptoException -> 0x0254, TRY_ENTER, TryCatch #2 {CryptoException -> 0x0254, blocks: (B:132:0x024b, B:136:0x0256), top: B:150:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:136:0x0256 A[Catch: CryptoException -> 0x0254, TRY_LEAVE, TryCatch #2 {CryptoException -> 0x0254, blocks: (B:132:0x024b, B:136:0x0256), top: B:150:0x0249 }] */
    /* JADX WARN: Code duplicated, block: B:146:0x00da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:153:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:0x0179 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    /* JADX WARN: Code duplicated, block: B:20:0x0039  */
    /* JADX WARN: Code duplicated, block: B:23:0x004d  */
    /* JADX WARN: Code duplicated, block: B:25:0x0051  */
    /* JADX WARN: Code duplicated, block: B:27:0x006d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x007c A[LOOP:0: B:30:0x0072->B:32:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00de  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0 A[Catch: CryptoException -> 0x00f2, TRY_LEAVE, TryCatch #0 {CryptoException -> 0x00f2, blocks: (B:58:0x00da, B:61:0x00e0), top: B:146:0x00da }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0102  */
    /* JADX WARN: Code duplicated, block: B:74:0x0116  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0120  */
    /* JADX WARN: Code duplicated, block: B:78:0x0124  */
    /* JADX WARN: Code duplicated, block: B:80:0x0128  */
    /* JADX WARN: Code duplicated, block: B:84:0x013b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x0149  */
    /* JADX WARN: Code duplicated, block: B:90:0x0152  */
    /* JADX WARN: Code duplicated, block: B:91:0x0154  */
    /* JADX WARN: Code duplicated, block: B:94:0x0172 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x0174  */
    /* JADX WARN: Code duplicated, block: B:97:0x0178  */
    /* JADX INFO: renamed from: F */
    public final boolean m49705F() throws ExoPlaybackException {
        C0578c c0578c;
        int iPosition;
        C38445a c38445a;
        int iM97120s;
        boolean zM1496f;
        long jMax;
        C17500h c17500h;
        C31521c0 c31521c0;
        ByteBuffer byteBuffer;
        int i13;
        int i14;
        int iM107333g;
        ByteBuffer byteBuffer2;
        int iPosition2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        InterfaceC17503k interfaceC17503k = this.f67717i0;
        if (interfaceC17503k != null && this.f67681N0 != 2 && !this.f67695U0) {
            int i24 = this.f67669D0;
            C35073c c35073c = this.f67686Q;
            if (i24 < 0) {
                int iMo45162e = interfaceC17503k.mo45162e();
                this.f67669D0 = iMo45162e;
                if (iMo45162e >= 0) {
                    c35073c.f148801z = this.f67717i0.getInputBuffer(iMo45162e);
                    c35073c.mo49690o();
                    if (this.f67681N0 == 1) {
                        if (!this.f67666A0) {
                            this.f67687Q0 = true;
                            this.f67717i0.mo45158a(this.f67669D0, 0, 0L, 4);
                            this.f67669D0 = -1;
                            c35073c.f148801z = null;
                        }
                        this.f67681N0 = 2;
                        return false;
                    }
                    if (this.f67733y0) {
                        this.f67733y0 = false;
                        c35073c.f148801z.put(f67665d1);
                        this.f67717i0.mo45158a(this.f67669D0, 38, 0L, 0);
                        this.f67669D0 = -1;
                        c35073c.f148801z = null;
                        this.f67685P0 = true;
                        return true;
                    }
                    if (this.f67679M0 == 1) {
                        for (i19 = 0; i19 < this.f67718j0.f130079N.size(); i19++) {
                            c35073c.f148801z.put((byte[]) this.f67718j0.f130079N.get(i19));
                        }
                        this.f67679M0 = 2;
                    }
                    ByteBuffer byteBuffer3 = c35073c.f148801z;
                    c0578c = c35073c.f148800y;
                    iPosition = byteBuffer3.position();
                    c38445a = this.f130111x;
                    c38445a.m123175j();
                    try {
                        iM97120s = m97120s(c38445a, c35073c, 0);
                        if (m97119i()) {
                            this.f67693T0 = this.f67691S0;
                        }
                        if (iM97120s != -3) {
                            if (iM97120s == -5) {
                                if (this.f67679M0 == 2) {
                                    c35073c.mo49690o();
                                    this.f67679M0 = 1;
                                }
                                mo49721V(c38445a);
                                return true;
                            }
                            if (c35073c.m1496f(4)) {
                                if (!this.f67685P0 || c35073c.m1496f(1)) {
                                    zM1496f = c35073c.m1496f(1073741824);
                                    if (zM1496f) {
                                        if (iPosition == 0) {
                                            c0578c.getClass();
                                        } else {
                                            if (c0578c.f2056d == null) {
                                                int[] iArr = new int[1];
                                                c0578c.f2056d = iArr;
                                                c0578c.f2061i.numBytesOfClearData = iArr;
                                            }
                                            int[] iArr2 = c0578c.f2056d;
                                            iArr2[0] = iArr2[0] + iPosition;
                                        }
                                    }
                                    if (this.f67726r0 && !zM1496f) {
                                        byteBuffer2 = c35073c.f148801z;
                                        iPosition2 = byteBuffer2.position();
                                        i15 = 0;
                                        i16 = 0;
                                        while (true) {
                                            i17 = i15 + 1;
                                            if (i17 >= iPosition2) {
                                                byteBuffer2.clear();
                                                break;
                                            }
                                            i18 = byteBuffer2.get(i15) & 255;
                                            if (i16 == 3) {
                                                if (i18 == 1 && (byteBuffer2.get(i17) & 31) == 7) {
                                                    ByteBuffer byteBufferDuplicate = byteBuffer2.duplicate();
                                                    byteBufferDuplicate.position(i15 - 3);
                                                    byteBufferDuplicate.limit(iPosition2);
                                                    byteBuffer2.position(0);
                                                    byteBuffer2.put(byteBufferDuplicate);
                                                    break;
                                                }
                                            } else if (i18 == 0) {
                                                i16++;
                                            }
                                            if (i18 != 0) {
                                                i16 = 0;
                                            }
                                            i15 = i17;
                                        }
                                        if (c35073c.f148801z.position() != 0) {
                                            this.f67726r0 = false;
                                        }
                                    }
                                    jMax = c35073c.f148797F;
                                    c17500h = this.f67667B0;
                                    if (c17500h != null) {
                                        c31521c0 = this.f67704Z;
                                        if (c17500h.f67650b == 0) {
                                            c17500h.f67649a = jMax;
                                        }
                                        if (!c17500h.f67651c) {
                                            byteBuffer = c35073c.f148801z;
                                            byteBuffer.getClass();
                                            i14 = 0;
                                            for (i13 = 0; i13 < 4; i13++) {
                                                i14 = (i14 << 8) | (byteBuffer.get(i13) & 255);
                                            }
                                            iM107333g = AbstractC33922a.m107333g(i14);
                                            if (iM107333g == -1) {
                                                c17500h.f67651c = true;
                                                c17500h.f67650b = 0L;
                                                c17500h.f67649a = c35073c.f148797F;
                                                Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                                jMax = c35073c.f148797F;
                                            } else {
                                                jMax = Math.max(0L, ((c17500h.f67650b - 529) * 1000000) / c31521c0.f130091Z) + c17500h.f67649a;
                                                c17500h.f67650b += (long) iM107333g;
                                            }
                                        }
                                        long j7 = this.f67691S0;
                                        C17500h c17500h2 = this.f67667B0;
                                        C31521c0 c31521c1 = this.f67704Z;
                                        c17500h2.getClass();
                                        this.f67691S0 = Math.max(j7, Math.max(0L, ((c17500h2.f67650b - 529) * 1000000) / c31521c1.f130091Z) + c17500h2.f67649a);
                                    }
                                    if (c35073c.m1496f(Integer.MIN_VALUE)) {
                                        this.f67694U.add(Long.valueOf(jMax));
                                    }
                                    if (this.f67699W0) {
                                        this.f67692T.m71651a(jMax, this.f67704Z);
                                        this.f67699W0 = false;
                                    }
                                    this.f67691S0 = Math.max(this.f67691S0, jMax);
                                    c35073c.m110919r();
                                    if (c35073c.m1496f(268435456)) {
                                        mo49714O(c35073c);
                                    }
                                    mo49725Z(c35073c);
                                    try {
                                        if (zM1496f) {
                                            this.f67717i0.mo45168r(this.f67669D0, c0578c, jMax);
                                        } else {
                                            this.f67717i0.mo45158a(this.f67669D0, c35073c.f148801z.limit(), jMax, 0);
                                        }
                                        this.f67669D0 = -1;
                                        c35073c.f148801z = null;
                                        this.f67685P0 = true;
                                        this.f67679M0 = 0;
                                        this.f67705Z0.f11168d++;
                                        return true;
                                    } catch (MediaCodec.CryptoException e5) {
                                        throw m97117e(e5, this.f67704Z, false, AbstractC24567y.m71684o(e5.getErrorCode()));
                                    }
                                }
                                c35073c.mo49690o();
                                if (this.f67679M0 == 2) {
                                    this.f67679M0 = 1;
                                    return true;
                                }
                                return true;
                            }
                            if (this.f67679M0 == 2) {
                                c35073c.mo49690o();
                                this.f67679M0 = 1;
                            }
                            this.f67695U0 = true;
                            if (!this.f67685P0) {
                                m49726a0();
                                return false;
                            }
                            try {
                                if (this.f67666A0) {
                                    this.f67687Q0 = true;
                                    this.f67717i0.mo45158a(this.f67669D0, 0, 0L, 4);
                                    this.f67669D0 = -1;
                                    c35073c.f148801z = null;
                                    return false;
                                }
                            } catch (MediaCodec.CryptoException e13) {
                                throw m97117e(e13, this.f67704Z, false, AbstractC24567y.m71684o(e13.getErrorCode()));
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e14) {
                        mo49718S(e14);
                        m49728c0(0);
                        m49706G();
                        return true;
                    }
                }
            } else {
                if (this.f67681N0 == 1) {
                    if (!this.f67666A0) {
                        this.f67687Q0 = true;
                        this.f67717i0.mo45158a(this.f67669D0, 0, 0L, 4);
                        this.f67669D0 = -1;
                        c35073c.f148801z = null;
                    }
                    this.f67681N0 = 2;
                    return false;
                }
                if (this.f67733y0) {
                    this.f67733y0 = false;
                    c35073c.f148801z.put(f67665d1);
                    this.f67717i0.mo45158a(this.f67669D0, 38, 0L, 0);
                    this.f67669D0 = -1;
                    c35073c.f148801z = null;
                    this.f67685P0 = true;
                    return true;
                }
                if (this.f67679M0 == 1) {
                    while (i19 < this.f67718j0.f130079N.size()) {
                        c35073c.f148801z.put((byte[]) this.f67718j0.f130079N.get(i19));
                    }
                    this.f67679M0 = 2;
                }
                ByteBuffer byteBuffer4 = c35073c.f148801z;
                c0578c = c35073c.f148800y;
                iPosition = byteBuffer4.position();
                c38445a = this.f130111x;
                c38445a.m123175j();
                iM97120s = m97120s(c38445a, c35073c, 0);
                if (m97119i()) {
                    this.f67693T0 = this.f67691S0;
                }
                if (iM97120s != -3) {
                    if (iM97120s == -5) {
                        if (this.f67679M0 == 2) {
                            c35073c.mo49690o();
                            this.f67679M0 = 1;
                        }
                        mo49721V(c38445a);
                        return true;
                    }
                    if (c35073c.m1496f(4)) {
                        if (this.f67685P0) {
                            zM1496f = c35073c.m1496f(1073741824);
                            if (zM1496f) {
                                if (iPosition == 0) {
                                    c0578c.getClass();
                                } else {
                                    if (c0578c.f2056d == null) {
                                        int[] iArr3 = new int[1];
                                        c0578c.f2056d = iArr3;
                                        c0578c.f2061i.numBytesOfClearData = iArr3;
                                    }
                                    int[] iArr4 = c0578c.f2056d;
                                    iArr4[0] = iArr4[0] + iPosition;
                                }
                            }
                            if (this.f67726r0) {
                                byteBuffer2 = c35073c.f148801z;
                                iPosition2 = byteBuffer2.position();
                                i15 = 0;
                                i16 = 0;
                                while (true) {
                                    i17 = i15 + 1;
                                    if (i17 >= iPosition2) {
                                        byteBuffer2.clear();
                                        break;
                                    }
                                    i18 = byteBuffer2.get(i15) & 255;
                                    if (i16 == 3) {
                                        if (i18 == 1) {
                                            ByteBuffer byteBufferDuplicate2 = byteBuffer2.duplicate();
                                            byteBufferDuplicate2.position(i15 - 3);
                                            byteBufferDuplicate2.limit(iPosition2);
                                            byteBuffer2.position(0);
                                            byteBuffer2.put(byteBufferDuplicate2);
                                            break;
                                        }
                                    } else if (i18 == 0) {
                                        i16++;
                                    }
                                    if (i18 != 0) {
                                        i16 = 0;
                                    }
                                    i15 = i17;
                                }
                                if (c35073c.f148801z.position() != 0) {
                                    this.f67726r0 = false;
                                }
                            }
                            jMax = c35073c.f148797F;
                            c17500h = this.f67667B0;
                            if (c17500h != null) {
                                c31521c0 = this.f67704Z;
                                if (c17500h.f67650b == 0) {
                                    c17500h.f67649a = jMax;
                                }
                                if (!c17500h.f67651c) {
                                    byteBuffer = c35073c.f148801z;
                                    byteBuffer.getClass();
                                    i14 = 0;
                                    while (i13 < 4) {
                                        i14 = (i14 << 8) | (byteBuffer.get(i13) & 255);
                                    }
                                    iM107333g = AbstractC33922a.m107333g(i14);
                                    if (iM107333g == -1) {
                                        c17500h.f67651c = true;
                                        c17500h.f67650b = 0L;
                                        c17500h.f67649a = c35073c.f148797F;
                                        Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                        jMax = c35073c.f148797F;
                                    } else {
                                        jMax = Math.max(0L, ((c17500h.f67650b - 529) * 1000000) / c31521c0.f130091Z) + c17500h.f67649a;
                                        c17500h.f67650b += (long) iM107333g;
                                    }
                                }
                                long j13 = this.f67691S0;
                                C17500h c17500h3 = this.f67667B0;
                                C31521c0 c31521c2 = this.f67704Z;
                                c17500h3.getClass();
                                this.f67691S0 = Math.max(j13, Math.max(0L, ((c17500h3.f67650b - 529) * 1000000) / c31521c2.f130091Z) + c17500h3.f67649a);
                            }
                            if (c35073c.m1496f(Integer.MIN_VALUE)) {
                                this.f67694U.add(Long.valueOf(jMax));
                            }
                            if (this.f67699W0) {
                                this.f67692T.m71651a(jMax, this.f67704Z);
                                this.f67699W0 = false;
                            }
                            this.f67691S0 = Math.max(this.f67691S0, jMax);
                            c35073c.m110919r();
                            if (c35073c.m1496f(268435456)) {
                                mo49714O(c35073c);
                            }
                            mo49725Z(c35073c);
                            if (zM1496f) {
                                this.f67717i0.mo45168r(this.f67669D0, c0578c, jMax);
                            } else {
                                this.f67717i0.mo45158a(this.f67669D0, c35073c.f148801z.limit(), jMax, 0);
                            }
                            this.f67669D0 = -1;
                            c35073c.f148801z = null;
                            this.f67685P0 = true;
                            this.f67679M0 = 0;
                            this.f67705Z0.f11168d++;
                            return true;
                        }
                        zM1496f = c35073c.m1496f(1073741824);
                        if (zM1496f) {
                            if (iPosition == 0) {
                                c0578c.getClass();
                            } else {
                                if (c0578c.f2056d == null) {
                                    int[] iArr5 = new int[1];
                                    c0578c.f2056d = iArr5;
                                    c0578c.f2061i.numBytesOfClearData = iArr5;
                                }
                                int[] iArr6 = c0578c.f2056d;
                                iArr6[0] = iArr6[0] + iPosition;
                            }
                        }
                        if (this.f67726r0) {
                            byteBuffer2 = c35073c.f148801z;
                            iPosition2 = byteBuffer2.position();
                            i15 = 0;
                            i16 = 0;
                            while (true) {
                                i17 = i15 + 1;
                                if (i17 >= iPosition2) {
                                    byteBuffer2.clear();
                                    break;
                                }
                                i18 = byteBuffer2.get(i15) & 255;
                                if (i16 == 3) {
                                    if (i18 == 1) {
                                        ByteBuffer byteBufferDuplicate3 = byteBuffer2.duplicate();
                                        byteBufferDuplicate3.position(i15 - 3);
                                        byteBufferDuplicate3.limit(iPosition2);
                                        byteBuffer2.position(0);
                                        byteBuffer2.put(byteBufferDuplicate3);
                                        break;
                                    }
                                } else if (i18 == 0) {
                                    i16++;
                                }
                                if (i18 != 0) {
                                    i16 = 0;
                                }
                                i15 = i17;
                            }
                            if (c35073c.f148801z.position() != 0) {
                                this.f67726r0 = false;
                            }
                        }
                        jMax = c35073c.f148797F;
                        c17500h = this.f67667B0;
                        if (c17500h != null) {
                            c31521c0 = this.f67704Z;
                            if (c17500h.f67650b == 0) {
                                c17500h.f67649a = jMax;
                            }
                            if (!c17500h.f67651c) {
                                byteBuffer = c35073c.f148801z;
                                byteBuffer.getClass();
                                i14 = 0;
                                while (i13 < 4) {
                                    i14 = (i14 << 8) | (byteBuffer.get(i13) & 255);
                                }
                                iM107333g = AbstractC33922a.m107333g(i14);
                                if (iM107333g == -1) {
                                    c17500h.f67651c = true;
                                    c17500h.f67650b = 0L;
                                    c17500h.f67649a = c35073c.f148797F;
                                    Log.w("C2Mp3TimestampTracker", "MPEG audio header is invalid.");
                                    jMax = c35073c.f148797F;
                                } else {
                                    jMax = Math.max(0L, ((c17500h.f67650b - 529) * 1000000) / c31521c0.f130091Z) + c17500h.f67649a;
                                    c17500h.f67650b += (long) iM107333g;
                                }
                            }
                            long j14 = this.f67691S0;
                            C17500h c17500h4 = this.f67667B0;
                            C31521c0 c31521c3 = this.f67704Z;
                            c17500h4.getClass();
                            this.f67691S0 = Math.max(j14, Math.max(0L, ((c17500h4.f67650b - 529) * 1000000) / c31521c3.f130091Z) + c17500h4.f67649a);
                        }
                        if (c35073c.m1496f(Integer.MIN_VALUE)) {
                            this.f67694U.add(Long.valueOf(jMax));
                        }
                        if (this.f67699W0) {
                            this.f67692T.m71651a(jMax, this.f67704Z);
                            this.f67699W0 = false;
                        }
                        this.f67691S0 = Math.max(this.f67691S0, jMax);
                        c35073c.m110919r();
                        if (c35073c.m1496f(268435456)) {
                            mo49714O(c35073c);
                        }
                        mo49725Z(c35073c);
                        if (zM1496f) {
                            this.f67717i0.mo45168r(this.f67669D0, c0578c, jMax);
                        } else {
                            this.f67717i0.mo45158a(this.f67669D0, c35073c.f148801z.limit(), jMax, 0);
                        }
                        this.f67669D0 = -1;
                        c35073c.f148801z = null;
                        this.f67685P0 = true;
                        this.f67679M0 = 0;
                        this.f67705Z0.f11168d++;
                        return true;
                        return true;
                    }
                    if (this.f67679M0 == 2) {
                        c35073c.mo49690o();
                        this.f67679M0 = 1;
                    }
                    this.f67695U0 = true;
                    if (!this.f67685P0) {
                        m49726a0();
                        return false;
                    }
                    if (this.f67666A0) {
                        this.f67687Q0 = true;
                        this.f67717i0.mo45158a(this.f67669D0, 0, 0L, 4);
                        this.f67669D0 = -1;
                        c35073c.f148801z = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public final void m49706G() {
        try {
            this.f67717i0.flush();
        } finally {
            mo49731f0();
        }
    }

    /* JADX INFO: renamed from: H */
    public final boolean m49707H() {
        if (this.f67717i0 == null) {
            return false;
        }
        if (this.f67683O0 == 3 || this.f67727s0 || ((this.f67728t0 && !this.f67689R0) || (this.f67729u0 && this.f67687Q0))) {
            m49729d0();
            return true;
        }
        m49706G();
        return false;
    }

    /* JADX INFO: renamed from: I */
    public final List m49708I(boolean z4) {
        C31521c0 c31521c0 = this.f67704Z;
        C17507o c17507o = this.f67680N;
        ArrayList arrayListMo49711L = mo49711L(c17507o, c31521c0, z4);
        if (!arrayListMo49711L.isEmpty() || !z4) {
            return arrayListMo49711L;
        }
        ArrayList arrayListMo49711L2 = mo49711L(c17507o, this.f67704Z, false);
        if (!arrayListMo49711L2.isEmpty()) {
            String str = this.f67704Z.f130077L;
            String strValueOf = String.valueOf(arrayListMo49711L2);
            StringBuilder sb4 = new StringBuilder(strValueOf.length() + AbstractC30007c.m91832b(99, str));
            sb4.append("Drm session requires secure decoder for ");
            sb4.append(str);
            sb4.append(", but no secure decoder available. Trying to proceed with ");
            sb4.append(strValueOf);
            sb4.append(".");
            Log.w("MediaCodecRenderer", sb4.toString());
        }
        return arrayListMo49711L2;
    }

    /* JADX INFO: renamed from: J */
    public boolean mo49709J() {
        return false;
    }

    /* JADX INFO: renamed from: K */
    public abstract float mo49710K(float f13, C31521c0[] c31521c0Arr);

    /* JADX INFO: renamed from: L */
    public abstract ArrayList mo49711L(C17507o c17507o, C31521c0 c31521c0, boolean z4);

    /* JADX INFO: renamed from: M */
    public final AbstractC36142i m49712M(C34249c c34249c) {
        c34249c.getClass();
        return null;
    }

    /* JADX INFO: renamed from: N */
    public abstract C17501i mo49713N(C17504l c17504l, C31521c0 c31521c0, MediaCrypto mediaCrypto, float f13);

    /* JADX INFO: renamed from: O */
    public void mo49714O(C35073c c35073c) {
    }

    /* JADX WARN: Code duplicated, block: B:120:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:93:0x016d  */
    /* JADX INFO: renamed from: P */
    public final void m49715P(C17504l c17504l, MediaCrypto mediaCrypto) {
        float fMo49710K;
        int i13;
        boolean z4;
        boolean z13;
        String str = c17504l.f67657a;
        int i14 = AbstractC24567y.f95875a;
        if (i14 < 23) {
            fMo49710K = -1.0f;
        } else {
            float f13 = this.f67716h0;
            C31521c0[] c31521c0Arr = this.f130105H;
            c31521c0Arr.getClass();
            fMo49710K = mo49710K(f13, c31521c0Arr);
        }
        float f14 = fMo49710K > this.f67682O ? fMo49710K : -1.0f;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C17501i c17501iMo49713N = mo49713N(c17504l, this.f67704Z, mediaCrypto, f14);
        if (i14 >= 31) {
            C32713f c32713f = this.f130102E;
            c32713f.getClass();
            AbstractC17505m.m49699a(c17501iMo49713N, c32713f);
        }
        try {
            String strValueOf = String.valueOf(str);
            AbstractC24543a.m71567c(strValueOf.length() != 0 ? "createCodec:".concat(strValueOf) : new String("createCodec:"));
            this.f67717i0 = this.f67678M.mo43807a(c17501iMo49713N);
            AbstractC24543a.m71579o();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            this.f67724p0 = c17504l;
            this.f67721m0 = f14;
            this.f67718j0 = this.f67704Z;
            if (i14 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = AbstractC24567y.f95878d;
                if (str2.startsWith("SM-T585") || str2.startsWith("SM-A510") || str2.startsWith("SM-A520") || str2.startsWith("SM-J700")) {
                    i13 = 2;
                } else if (i14 < 24) {
                    i13 = 0;
                } else {
                    i13 = 0;
                }
            } else if (i14 < 24 || !("OMX.Nvidia.h264.decode".equals(str) || "OMX.Nvidia.h264.decode.secure".equals(str))) {
                i13 = 0;
            } else {
                String str3 = AbstractC24567y.f95876b;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
            }
            this.f67725q0 = i13;
            this.f67726r0 = i14 < 21 && this.f67718j0.f130079N.isEmpty() && "OMX.MTK.VIDEO.DECODER.AVC".equals(str);
            this.f67727s0 = i14 < 18 || (i14 == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (i14 == 19 && AbstractC24567y.f95878d.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str)));
            this.f67728t0 = i14 == 29 && "c2.android.aac.decoder".equals(str);
            if (i14 > 23 || !"OMX.google.vorbis.decoder".equals(str)) {
                if (i14 <= 19) {
                    String str4 = AbstractC24567y.f95876b;
                    z4 = ("hb2000".equals(str4) || "stvm8".equals(str4)) && ("OMX.amlogic.avc.decoder.awesome".equals(str) || "OMX.amlogic.avc.decoder.awesome.secure".equals(str));
                }
            }
            this.f67729u0 = z4;
            this.f67730v0 = i14 == 21 && "OMX.google.aac.decoder".equals(str);
            if (i14 < 21 && "OMX.SEC.mp3.dec".equals(str) && "samsung".equals(AbstractC24567y.f95877c)) {
                String str5 = AbstractC24567y.f95876b;
                if (str5.startsWith("baffin") || str5.startsWith("grand") || str5.startsWith("fortuna") || str5.startsWith("gprimelte") || str5.startsWith("j2y18lte") || str5.startsWith("ms01")) {
                    z13 = true;
                } else {
                    z13 = false;
                }
            } else {
                z13 = false;
            }
            this.f67731w0 = z13;
            this.f67732x0 = i14 <= 18 && this.f67718j0.f130090Y == 1 && "OMX.MTK.AUDIO.DECODER.MP3".equals(str);
            this.f67666A0 = (i14 <= 25 && "OMX.rk.video_decoder.avc".equals(str)) || (i14 <= 17 && "OMX.allwinner.video.decoder.avc".equals(str)) || ((i14 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str))) || (("Amazon".equals(AbstractC24567y.f95877c) && "AFTS".equals(AbstractC24567y.f95878d) && c17504l.f67662f) || mo49709J()));
            this.f67717i0.getClass();
            if ("c2.android.mp3.decoder".equals(str)) {
                this.f67667B0 = new C17500h();
            }
            if (this.f130103F == 2) {
                this.f67668C0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f67705Z0.f11166b++;
            mo49719T(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th3) {
            AbstractC24543a.m71579o();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m49716Q() throws ExoPlaybackException {
        C31521c0 c31521c0;
        if (this.f67717i0 != null || this.f67674I0 || (c31521c0 = this.f67704Z) == null) {
            return;
        }
        if (this.f67710c0 == null && mo49736j0(c31521c0)) {
            C31521c0 c31521c1 = this.f67704Z;
            m49702C();
            String str = c31521c1.f130077L;
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C17499g c17499g = this.f67690S;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c17499g.getClass();
                c17499g.f67648K = 32;
            } else {
                c17499g.getClass();
                c17499g.f67648K = 1;
            }
            this.f67674I0 = true;
            return;
        }
        m49733h0(this.f67710c0);
        String str2 = this.f67704Z.f130077L;
        C34249c c34249c = this.f67708b0;
        if (c34249c != null) {
            if (this.f67712d0 == null) {
                m49712M(c34249c);
                if (this.f67708b0.m108297n() == null) {
                    return;
                }
            }
            if (AbstractC36142i.f154645a) {
                int iM108301r = this.f67708b0.m108301r();
                if (iM108301r == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionM108297n = this.f67708b0.m108297n();
                    drmSession$DrmSessionExceptionM108297n.getClass();
                    throw m97117e(drmSession$DrmSessionExceptionM108297n, this.f67704Z, false, drmSession$DrmSessionExceptionM108297n.f20381w);
                }
                if (iM108301r != 4) {
                    return;
                }
            }
        }
        try {
            m49717R(this.f67712d0, this.f67713e0);
        } catch (MediaCodecRenderer$DecoderInitializationException e5) {
            throw m97117e(e5, this.f67704Z, false, ErrorCodes.WebrtcErrors.cCreateOfferFailed);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:60:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:65:0x004c A[SYNTHETIC] */
    /* JADX INFO: renamed from: R */
    public final void m49717R(MediaCrypto mediaCrypto, boolean z4) throws MediaCodecRenderer$DecoderInitializationException {
        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException;
        String str;
        MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2;
        String diagnosticInfo;
        if (this.f67722n0 == null) {
            try {
                List listM49708I = m49708I(z4);
                this.f67722n0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listM49708I;
                if (!arrayList.isEmpty()) {
                    this.f67722n0.add((C17504l) arrayList.get(0));
                }
                this.f67723o0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e5) {
                throw new MediaCodecRenderer$DecoderInitializationException(this.f67704Z, e5, z4, -49998);
            }
        }
        if (this.f67722n0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(this.f67704Z, null, z4, -49999);
        }
        C17504l c17504l = (C17504l) this.f67722n0.peekFirst();
        while (this.f67717i0 == null) {
            C17504l c17504l2 = (C17504l) this.f67722n0.peekFirst();
            if (!mo49734i0(c17504l2)) {
                return;
            }
            try {
                m49715P(c17504l2, mediaCrypto);
            } catch (Exception e13) {
                if (c17504l2 != c17504l) {
                    throw e13;
                }
                try {
                    Log.w("MediaCodecRenderer", "Preferred decoder instantiation failed. Sleeping for 50ms then retrying.");
                    Thread.sleep(50L);
                    m49715P(c17504l2, mediaCrypto);
                } catch (Exception e14) {
                    String strValueOf = String.valueOf(c17504l2);
                    StringBuilder sb4 = new StringBuilder(strValueOf.length() + 30);
                    sb4.append("Failed to initialize decoder: ");
                    sb4.append(strValueOf);
                    AbstractC24543a.m71564F("MediaCodecRenderer", sb4.toString(), e14);
                    this.f67722n0.removeFirst();
                    C31521c0 c31521c0 = this.f67704Z;
                    String str2 = c17504l2.f67657a;
                    String strValueOf2 = String.valueOf(c31521c0);
                    StringBuilder sb5 = new StringBuilder(strValueOf2.length() + AbstractC30007c.m91832b(23, str2));
                    sb5.append("Decoder init failed: ");
                    sb5.append(str2);
                    sb5.append(", ");
                    sb5.append(strValueOf2);
                    String string = sb5.toString();
                    String str3 = c31521c0.f130077L;
                    if (AbstractC24567y.f95875a >= 21) {
                        if (e14 instanceof MediaCodec.CodecException) {
                            diagnosticInfo = ((MediaCodec.CodecException) e14).getDiagnosticInfo();
                        } else {
                            diagnosticInfo = null;
                        }
                        str = diagnosticInfo;
                    } else {
                        str = null;
                    }
                    mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(string, e14, str3, z4, c17504l2, str);
                    mo49718S(mediaCodecRenderer$DecoderInitializationException);
                    mediaCodecRenderer$DecoderInitializationException2 = this.f67723o0;
                    if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                        this.f67723o0 = mediaCodecRenderer$DecoderInitializationException;
                    } else {
                        this.f67723o0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.f20382w, mediaCodecRenderer$DecoderInitializationException2.f20383x, mediaCodecRenderer$DecoderInitializationException2.f20384y, mediaCodecRenderer$DecoderInitializationException2.f20385z);
                    }
                    if (!this.f67722n0.isEmpty()) {
                        throw this.f67723o0;
                    }
                }
                String strValueOf3 = String.valueOf(c17504l2);
                StringBuilder sb6 = new StringBuilder(strValueOf3.length() + 30);
                sb6.append("Failed to initialize decoder: ");
                sb6.append(strValueOf3);
                AbstractC24543a.m71564F("MediaCodecRenderer", sb6.toString(), e14);
                this.f67722n0.removeFirst();
                C31521c0 c31521c1 = this.f67704Z;
                String str4 = c17504l2.f67657a;
                String strValueOf4 = String.valueOf(c31521c1);
                StringBuilder sb7 = new StringBuilder(strValueOf4.length() + AbstractC30007c.m91832b(23, str4));
                sb7.append("Decoder init failed: ");
                sb7.append(str4);
                sb7.append(", ");
                sb7.append(strValueOf4);
                String string2 = sb7.toString();
                String str5 = c31521c1.f130077L;
                if (AbstractC24567y.f95875a >= 21) {
                    if (e14 instanceof MediaCodec.CodecException) {
                        diagnosticInfo = ((MediaCodec.CodecException) e14).getDiagnosticInfo();
                    } else {
                        diagnosticInfo = null;
                    }
                    str = diagnosticInfo;
                } else {
                    str = null;
                }
                mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException(string2, e14, str5, z4, c17504l2, str);
                mo49718S(mediaCodecRenderer$DecoderInitializationException);
                mediaCodecRenderer$DecoderInitializationException2 = this.f67723o0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.f67723o0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f67723o0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.f20382w, mediaCodecRenderer$DecoderInitializationException2.f20383x, mediaCodecRenderer$DecoderInitializationException2.f20384y, mediaCodecRenderer$DecoderInitializationException2.f20385z);
                }
                if (!this.f67722n0.isEmpty()) {
                    throw this.f67723o0;
                }
            }
        }
        this.f67722n0 = null;
    }

    /* JADX INFO: renamed from: S */
    public abstract void mo49718S(Exception exc);

    /* JADX INFO: renamed from: T */
    public abstract void mo49719T(long j7, long j13, String str);

    /* JADX INFO: renamed from: U */
    public abstract void mo49720U(String str);

    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX INFO: renamed from: V */
    public C35074d mo49721V(C38445a c38445a) throws ExoPlaybackException {
        boolean z4 = true;
        this.f67699W0 = true;
        C31521c0 c31521c0 = (C31521c0) c38445a.f164637y;
        c31521c0.getClass();
        int i13 = 0;
        if (c31521c0.f130077L == null) {
            throw m97117e(new IllegalArgumentException(), c31521c0, false, ErrorCodes.WebrtcErrors.cICEFailure);
        }
        C34249c c34249c = (C34249c) c38445a.f164636x;
        C34249c c34249c2 = this.f67710c0;
        if (c34249c2 != c34249c) {
            if (c34249c != null) {
                c34249c.getClass();
            }
            if (c34249c2 != null) {
                c34249c2.getClass();
            }
        }
        this.f67710c0 = c34249c;
        this.f67704Z = c31521c0;
        if (this.f67674I0) {
            this.f67676K0 = true;
            return null;
        }
        InterfaceC17503k interfaceC17503k = this.f67717i0;
        if (interfaceC17503k == null) {
            this.f67722n0 = null;
            m49716Q();
            return null;
        }
        C17504l c17504l = this.f67724p0;
        C31521c0 c31521c1 = this.f67718j0;
        C34249c c34249c3 = this.f67708b0;
        if (c34249c3 != c34249c) {
            if (c34249c != null && c34249c3 != null && AbstractC24567y.f95875a >= 23) {
                UUID uuid = AbstractC31532g.f130148c;
                if (!uuid.equals(c34249c3.m108300q()) && !uuid.equals(c34249c.m108300q())) {
                    m49712M(c34249c);
                }
            }
            if (this.f67685P0) {
                this.f67681N0 = 1;
                this.f67683O0 = 3;
            } else {
                m49729d0();
                m49716Q();
            }
            return new C35074d(c17504l.f67657a, c31521c1, c31521c0, 0, 128);
        }
        boolean z13 = this.f67710c0 != this.f67708b0;
        AbstractC24543a.m71573i(!z13 || AbstractC24567y.f95875a >= 23);
        C35074d c35074dMo49700A = mo49700A(c17504l, c31521c1, c31521c0);
        int i14 = c35074dMo49700A.f148805d;
        if (i14 != 0) {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 != 3) {
                        throw new IllegalStateException();
                    }
                    if (m49739l0(c31521c0)) {
                        this.f67718j0 = c31521c0;
                        if (z13 && !m49703D()) {
                            i13 = 2;
                        }
                    } else {
                        i13 = 16;
                    }
                } else if (m49739l0(c31521c0)) {
                    this.f67677L0 = true;
                    this.f67679M0 = 1;
                    int i15 = this.f67725q0;
                    if (i15 != 2 && (i15 != 1 || c31521c0.f130082Q != c31521c1.f130082Q || c31521c0.f130083R != c31521c1.f130083R)) {
                        z4 = false;
                    }
                    this.f67733y0 = z4;
                    this.f67718j0 = c31521c0;
                    if (z13 && !m49703D()) {
                        i13 = 2;
                    }
                } else {
                    i13 = 16;
                }
            } else if (m49739l0(c31521c0)) {
                this.f67718j0 = c31521c0;
                if (z13) {
                    if (!m49703D()) {
                        i13 = 2;
                    }
                } else if (this.f67685P0) {
                    this.f67681N0 = 1;
                    if (this.f67727s0 || this.f67729u0) {
                        this.f67683O0 = 3;
                        i13 = 2;
                    } else {
                        this.f67683O0 = 1;
                    }
                }
            } else {
                i13 = 16;
            }
        } else if (this.f67685P0) {
            this.f67681N0 = 1;
            this.f67683O0 = 3;
        } else {
            m49729d0();
            m49716Q();
        }
        if (i14 == 0 || (this.f67717i0 == interfaceC17503k && this.f67683O0 != 3)) {
            return c35074dMo49700A;
        }
        return new C35074d(c17504l.f67657a, c31521c1, c31521c0, 0, i13);
    }

    /* JADX INFO: renamed from: W */
    public abstract void mo49722W(C31521c0 c31521c0, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: X */
    public void mo49723X(long j7) {
        while (true) {
            int i13 = this.f67711c1;
            if (i13 == 0) {
                return;
            }
            long[] jArr = this.f67702Y;
            if (j7 < jArr[0]) {
                return;
            }
            long[] jArr2 = this.f67698W;
            this.f67707a1 = jArr2[0];
            long[] jArr3 = this.f67700X;
            this.f67709b1 = jArr3[0];
            int i14 = i13 - 1;
            this.f67711c1 = i14;
            System.arraycopy(jArr2, 1, jArr2, 0, i14);
            System.arraycopy(jArr3, 1, jArr3, 0, this.f67711c1);
            System.arraycopy(jArr, 1, jArr, 0, this.f67711c1);
            mo49724Y();
        }
    }

    /* JADX INFO: renamed from: Y */
    public abstract void mo49724Y();

    /* JADX INFO: renamed from: Z */
    public abstract void mo49725Z(C35073c c35073c);

    /* JADX INFO: renamed from: a0 */
    public final void m49726a0() throws ExoPlaybackException {
        int i13 = this.f67683O0;
        if (i13 == 1) {
            m49706G();
            return;
        }
        if (i13 == 2) {
            m49706G();
            m49740m0();
        } else if (i13 != 3) {
            this.f67697V0 = true;
            mo49730e0();
        } else {
            m49729d0();
            m49716Q();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public abstract boolean mo49727b0(long j7, long j13, InterfaceC17503k interfaceC17503k, ByteBuffer byteBuffer, int i13, int i14, int i15, long j14, boolean z4, boolean z13, C31521c0 c31521c0);

    /* JADX INFO: renamed from: c0 */
    public final boolean m49728c0(int i13) throws ExoPlaybackException {
        C38445a c38445a = this.f130111x;
        c38445a.m123175j();
        C35073c c35073c = this.f67684P;
        c35073c.mo49690o();
        int iM97120s = m97120s(c38445a, c35073c, i13 | 4);
        if (iM97120s == -5) {
            mo49721V(c38445a);
            return true;
        }
        if (iM97120s != -4 || !c35073c.m1496f(4)) {
            return false;
        }
        this.f67695U0 = true;
        m49726a0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final void m49729d0() {
        try {
            InterfaceC17503k interfaceC17503k = this.f67717i0;
            if (interfaceC17503k != null) {
                interfaceC17503k.release();
                this.f67705Z0.f11167c++;
                mo49720U(this.f67724p0.f67657a);
            }
            this.f67717i0 = null;
            try {
                MediaCrypto mediaCrypto = this.f67712d0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f67712d0 = null;
                m49733h0(null);
                m49732g0();
            }
        } catch (Throwable th3) {
            this.f67717i0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f67712d0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
                this.f67712d0 = null;
                m49733h0(null);
                m49732g0();
            }
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void mo49730e0() {
    }

    /* JADX INFO: renamed from: f0 */
    public void mo49731f0() {
        this.f67669D0 = -1;
        this.f67686Q.f148801z = null;
        this.f67670E0 = -1;
        this.f67671F0 = null;
        this.f67668C0 = -9223372036854775807L;
        this.f67687Q0 = false;
        this.f67685P0 = false;
        this.f67733y0 = false;
        this.f67734z0 = false;
        this.f67672G0 = false;
        this.f67673H0 = false;
        this.f67694U.clear();
        this.f67691S0 = -9223372036854775807L;
        this.f67693T0 = -9223372036854775807L;
        C17500h c17500h = this.f67667B0;
        if (c17500h != null) {
            c17500h.f67649a = 0L;
            c17500h.f67650b = 0L;
            c17500h.f67651c = false;
        }
        this.f67681N0 = 0;
        this.f67683O0 = 0;
        this.f67679M0 = this.f67677L0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final void m49732g0() {
        mo49731f0();
        this.f67703Y0 = null;
        this.f67667B0 = null;
        this.f67722n0 = null;
        this.f67724p0 = null;
        this.f67718j0 = null;
        this.f67719k0 = null;
        this.f67720l0 = false;
        this.f67689R0 = false;
        this.f67721m0 = -1.0f;
        this.f67725q0 = 0;
        this.f67726r0 = false;
        this.f67727s0 = false;
        this.f67728t0 = false;
        this.f67729u0 = false;
        this.f67730v0 = false;
        this.f67731w0 = false;
        this.f67732x0 = false;
        this.f67666A0 = false;
        this.f67677L0 = false;
        this.f67679M0 = 0;
        this.f67713e0 = false;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m49733h0(C34249c c34249c) {
        C34249c c34249c2 = this.f67708b0;
        if (c34249c2 != c34249c) {
            if (c34249c != null) {
                c34249c.m108293i(null);
            }
            if (c34249c2 != null) {
                c34249c2.m108304u(null);
            }
        }
        this.f67708b0 = c34249c;
    }

    /* JADX INFO: renamed from: i0 */
    public boolean mo49734i0(C17504l c17504l) {
        return true;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: j */
    public boolean mo49735j() {
        return this.f67697V0;
    }

    /* JADX INFO: renamed from: j0 */
    public boolean mo49736j0(C31521c0 c31521c0) {
        return false;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: k */
    public boolean mo49737k() {
        boolean zMo79412b;
        if (this.f67704Z != null) {
            if (m97119i()) {
                zMo79412b = this.f130108K;
            } else {
                InterfaceC32756r0 interfaceC32756r0 = this.f130104G;
                interfaceC32756r0.getClass();
                zMo79412b = interfaceC32756r0.mo79412b();
            }
            if (!zMo79412b) {
                if ((this.f67670E0 >= 0) || (this.f67668C0 != -9223372036854775807L && SystemClock.elapsedRealtime() < this.f67668C0)) {
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: k0 */
    public abstract int mo49738k0(C17507o c17507o, C31521c0 c31521c0);

    /* JADX INFO: renamed from: l0 */
    public final boolean m49739l0(C31521c0 c31521c0) throws ExoPlaybackException {
        if (AbstractC24567y.f95875a >= 23 && this.f67717i0 != null && this.f67683O0 != 3 && this.f130103F != 0) {
            float f13 = this.f67716h0;
            C31521c0[] c31521c0Arr = this.f130105H;
            c31521c0Arr.getClass();
            float fMo49710K = mo49710K(f13, c31521c0Arr);
            float f14 = this.f67721m0;
            if (f14 != fMo49710K) {
                if (fMo49710K == -1.0f) {
                    if (this.f67685P0) {
                        this.f67681N0 = 1;
                        this.f67683O0 = 3;
                        return false;
                    }
                    m49729d0();
                    m49716Q();
                    return false;
                }
                if (f14 != -1.0f || fMo49710K > this.f67682O) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo49710K);
                    this.f67717i0.setParameters(bundle);
                    this.f67721m0 = fMo49710K;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m49740m0() throws ExoPlaybackException {
        try {
            MediaCrypto mediaCrypto = this.f67712d0;
            m49712M(this.f67710c0).getClass();
            mediaCrypto.setMediaDrmSession(null);
            m49733h0(this.f67710c0);
            this.f67681N0 = 0;
            this.f67683O0 = 0;
        } catch (MediaCryptoException e5) {
            throw m97117e(e5, this.f67704Z, false, ErrorCodes.GenericErrors.cRTCTrackMissing);
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: n */
    public void mo49741n(long j7, boolean z4) throws ExoPlaybackException {
        int i13;
        this.f67695U0 = false;
        this.f67697V0 = false;
        this.f67701X0 = false;
        if (this.f67674I0) {
            this.f67690S.mo49690o();
            this.f67688R.mo49690o();
            this.f67675J0 = false;
        } else if (m49707H()) {
            m49716Q();
        }
        C24565w c24565w = this.f67692T;
        synchronized (c24565w) {
            i13 = c24565w.f95870e;
        }
        if (i13 > 0) {
            this.f67699W0 = true;
        }
        this.f67692T.m71652b();
        int i14 = this.f67711c1;
        if (i14 != 0) {
            int i15 = i14 - 1;
            this.f67709b1 = this.f67700X[i15];
            this.f67707a1 = this.f67698W[i15];
            this.f67711c1 = 0;
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m49742n0(long j7) {
        Object objM71654d;
        Object objM71657g;
        C24565w c24565w = this.f67692T;
        synchronized (c24565w) {
            objM71654d = c24565w.m71654d(j7, true);
        }
        C31521c0 c31521c0 = (C31521c0) objM71654d;
        if (c31521c0 == null && this.f67720l0) {
            C24565w c24565w2 = this.f67692T;
            synchronized (c24565w2) {
                objM71657g = c24565w2.f95870e == 0 ? null : c24565w2.m71657g();
            }
            c31521c0 = (C31521c0) objM71657g;
        }
        if (c31521c0 != null) {
            this.f67706a0 = c31521c0;
        } else if (!this.f67720l0 || this.f67706a0 == null) {
            return;
        }
        mo49722W(this.f67706a0, this.f67719k0);
        this.f67720l0 = false;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: r */
    public final void mo49743r(C31521c0[] c31521c0Arr, long j7, long j13) {
        if (this.f67709b1 == -9223372036854775807L) {
            AbstractC24543a.m71573i(this.f67707a1 == -9223372036854775807L);
            this.f67707a1 = j7;
            this.f67709b1 = j13;
            return;
        }
        int i13 = this.f67711c1;
        long[] jArr = this.f67700X;
        if (i13 == jArr.length) {
            long j14 = jArr[i13 - 1];
            StringBuilder sb4 = new StringBuilder(65);
            sb4.append("Too many stream changes, so dropping offset: ");
            sb4.append(j14);
            Log.w("MediaCodecRenderer", sb4.toString());
        } else {
            this.f67711c1 = i13 + 1;
        }
        int i14 = this.f67711c1 - 1;
        this.f67698W[i14] = j7;
        jArr[i14] = j13;
        this.f67702Y[i14] = this.f67691S0;
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: t */
    public final void mo49744t(long j7, long j13) throws ExoPlaybackException {
        boolean z4 = false;
        if (this.f67701X0) {
            this.f67701X0 = false;
            m49726a0();
        }
        ExoPlaybackException exoPlaybackException = this.f67703Y0;
        if (exoPlaybackException != null) {
            this.f67703Y0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f67697V0) {
                mo49730e0();
                return;
            }
            if (this.f67704Z != null || m49728c0(2)) {
                m49716Q();
                if (this.f67674I0) {
                    AbstractC24543a.m71567c("bypassRender");
                    while (m49748z(j7, j13)) {
                    }
                    AbstractC24543a.m71579o();
                } else if (this.f67717i0 != null) {
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    AbstractC24543a.m71567c("drainAndFeed");
                    while (m49704E(j7, j13)) {
                        long j14 = this.f67714f0;
                        if (!(j14 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j14)) {
                            break;
                        }
                    }
                    while (m49705F()) {
                        long j15 = this.f67714f0;
                        if (!(j15 == -9223372036854775807L || SystemClock.elapsedRealtime() - jElapsedRealtime < j15)) {
                            break;
                        }
                    }
                    AbstractC24543a.m71579o();
                } else {
                    C2832g c2832g = this.f67705Z0;
                    int i13 = c2832g.f11169e;
                    InterfaceC32756r0 interfaceC32756r0 = this.f130104G;
                    interfaceC32756r0.getClass();
                    c2832g.f11169e = i13 + interfaceC32756r0.mo79416j(j7 - this.f130106I);
                    m49728c0(1);
                }
                synchronized (this.f67705Z0) {
                }
            }
        } catch (IllegalStateException e5) {
            int i14 = AbstractC24567y.f95875a;
            if (i14 < 21 || !(e5 instanceof MediaCodec.CodecException)) {
                StackTraceElement[] stackTrace = e5.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e5;
                }
            }
            mo49718S(e5);
            if (i14 >= 21) {
                if (e5 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e5).isRecoverable() : false) {
                    z4 = true;
                }
            }
            if (z4) {
                m49729d0();
            }
            throw m97117e(mo49701B(e5, this.f67724p0), this.f67704Z, z4, ErrorCodes.WebrtcErrors.cSetLocalDescriptionFailed);
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: w */
    public void mo49745w(float f13, float f14) throws ExoPlaybackException {
        this.f67715g0 = f13;
        this.f67716h0 = f14;
        m49739l0(this.f67718j0);
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: x */
    public final int mo49746x(C31521c0 c31521c0) throws ExoPlaybackException {
        try {
            return mo49738k0(this.f67680N, c31521c0);
        } catch (MediaCodecUtil$DecoderQueryException e5) {
            throw m97117e(e5, c31521c0, false, ErrorCodes.WebrtcErrors.cCreateAnswerFailed);
        }
    }

    @Override // p465rm.AbstractC31523d
    /* JADX INFO: renamed from: y */
    public final int mo49747y() {
        return 8;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m49748z(long j7, long j13) throws ExoPlaybackException {
        C17499g c17499g;
        AbstractC24543a.m71573i(!this.f67697V0);
        C17499g c17499g2 = this.f67690S;
        int i13 = c17499g2.f67647J;
        if (i13 > 0) {
            c17499g = c17499g2;
            if (!mo49727b0(j7, j13, null, c17499g2.f148801z, this.f67670E0, 0, i13, c17499g2.f148797F, c17499g2.m1496f(Integer.MIN_VALUE), c17499g2.m1496f(4), this.f67706a0)) {
                return false;
            }
            mo49723X(c17499g.f67646I);
            c17499g.mo49690o();
        } else {
            c17499g = c17499g2;
        }
        if (this.f67695U0) {
            this.f67697V0 = true;
            return false;
        }
        boolean z4 = this.f67675J0;
        C35073c c35073c = this.f67688R;
        if (z4) {
            AbstractC24543a.m71573i(c17499g.m49691s(c35073c));
            this.f67675J0 = false;
        }
        if (this.f67676K0) {
            if (c17499g.f67647J > 0) {
                return true;
            }
            m49702C();
            this.f67676K0 = false;
            m49716Q();
            if (!this.f67674I0) {
                return false;
            }
        }
        AbstractC24543a.m71573i(!this.f67695U0);
        C38445a c38445a = this.f130111x;
        c38445a.m123175j();
        c35073c.mo49690o();
        while (true) {
            c35073c.mo49690o();
            int iM97120s = m97120s(c38445a, c35073c, 0);
            if (iM97120s == -5) {
                mo49721V(c38445a);
                break;
            }
            if (iM97120s != -4) {
                if (iM97120s == -3) {
                    break;
                }
                throw new IllegalStateException();
            }
            if (c35073c.m1496f(4)) {
                this.f67695U0 = true;
                break;
            }
            if (this.f67699W0) {
                C31521c0 c31521c0 = this.f67704Z;
                c31521c0.getClass();
                this.f67706a0 = c31521c0;
                mo49722W(c31521c0, null);
                this.f67699W0 = false;
            }
            c35073c.m110919r();
            if (!c17499g.m49691s(c35073c)) {
                this.f67675J0 = true;
                break;
            }
        }
        if (c17499g.f67647J > 0) {
            c17499g.m110919r();
        }
        return c17499g.f67647J > 0 || this.f67695U0 || this.f67676K0;
    }
}
