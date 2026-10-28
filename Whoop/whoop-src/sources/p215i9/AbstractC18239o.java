package p215i9;

import a30.C0332w0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.os.Trace;
import androidx.media3.decoder.DecoderInputBuffer$InsufficientCapacityException;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.drm.DrmSession$DrmSessionException;
import androidx.media3.exoplayer.mediacodec.MediaCodecDecoderException;
import androidx.media3.exoplayer.mediacodec.MediaCodecRenderer$DecoderInitializationException;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil$DecoderQueryException;
import e10.C12554k0;
import hm.C17417d;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import live.hms.video.error.ErrorCodes;
import p010a9.C0578c;
import p010a9.C0580e;
import p010a9.InterfaceC0577b;
import p031b9.AbstractC2829f;
import p031b9.AbstractC2875y;
import p031b9.C2832g;
import p031b9.C2835h;
import p031b9.C2836h0;
import p047c9.C4323n;
import p079d2.AbstractC11480b;
import p085d9.C11782b0;
import p171g9.AbstractC15592i;
import p299l9.InterfaceC23540z0;
import p309lo.C24565w;
import p499t9.AbstractC33618a;
import p516u8.C34608o;
import p516u8.C34610p;
import p547v8.InterfaceC35788e;
import p607x8.AbstractC38046a;
import p607x8.AbstractC38065t;
import qg3.C30352d;
import rs.AbstractC31780b;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: i9.o */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC18239o extends AbstractC2829f {

    /* JADX INFO: renamed from: b1 */
    public static final byte[] f70962b1 = {0, 0, 1, 103, 66, -64, 11, -38, 37, -112, 0, 0, 1, 104, -50, 15, 19, 32, 0, 0, 1, 101, -120, -124, 13, -50, 113, 24, -96, 0, 47, -65, 28, 49, -61, 39, 93, 120};

    /* JADX INFO: renamed from: A0 */
    public long f70963A0;

    /* JADX INFO: renamed from: B0 */
    public int f70964B0;

    /* JADX INFO: renamed from: C0 */
    public int f70965C0;

    /* JADX INFO: renamed from: D0 */
    public ByteBuffer f70966D0;

    /* JADX INFO: renamed from: E0 */
    public boolean f70967E0;

    /* JADX INFO: renamed from: F0 */
    public boolean f70968F0;

    /* JADX INFO: renamed from: G0 */
    public boolean f70969G0;

    /* JADX INFO: renamed from: H0 */
    public boolean f70970H0;

    /* JADX INFO: renamed from: I0 */
    public boolean f70971I0;

    /* JADX INFO: renamed from: J0 */
    public boolean f70972J0;

    /* JADX INFO: renamed from: K0 */
    public int f70973K0;

    /* JADX INFO: renamed from: L0 */
    public int f70974L0;

    /* JADX INFO: renamed from: M0 */
    public int f70975M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f70976N0;

    /* JADX INFO: renamed from: O0 */
    public boolean f70977O0;

    /* JADX INFO: renamed from: P0 */
    public boolean f70978P0;

    /* JADX INFO: renamed from: Q0 */
    public long f70979Q0;

    /* JADX INFO: renamed from: R */
    public final InterfaceC18234j f70980R;

    /* JADX INFO: renamed from: R0 */
    public long f70981R0;

    /* JADX INFO: renamed from: S */
    public final C18232h f70982S;

    /* JADX INFO: renamed from: S0 */
    public boolean f70983S0;

    /* JADX INFO: renamed from: T */
    public final float f70984T;

    /* JADX INFO: renamed from: T0 */
    public boolean f70985T0;

    /* JADX INFO: renamed from: U */
    public final C0580e f70986U;

    /* JADX INFO: renamed from: U0 */
    public boolean f70987U0;

    /* JADX INFO: renamed from: V */
    public final C0580e f70988V;

    /* JADX INFO: renamed from: V0 */
    public boolean f70989V0;

    /* JADX INFO: renamed from: W */
    public final C0580e f70990W;

    /* JADX INFO: renamed from: W0 */
    public ExoPlaybackException f70991W0;

    /* JADX INFO: renamed from: X */
    public final C18230f f70992X;

    /* JADX INFO: renamed from: X0 */
    public C2832g f70993X0;

    /* JADX INFO: renamed from: Y */
    public final MediaCodec.BufferInfo f70994Y;

    /* JADX INFO: renamed from: Y0 */
    public C18238n f70995Y0;

    /* JADX INFO: renamed from: Z */
    public final ArrayDeque f70996Z;

    /* JADX INFO: renamed from: Z0 */
    public long f70997Z0;

    /* JADX INFO: renamed from: a0 */
    public final C11782b0 f70998a0;

    /* JADX INFO: renamed from: a1 */
    public boolean f70999a1;

    /* JADX INFO: renamed from: b0 */
    public C34610p f71000b0;

    /* JADX INFO: renamed from: c0 */
    public C34610p f71001c0;

    /* JADX INFO: renamed from: d0 */
    public C12554k0 f71002d0;

    /* JADX INFO: renamed from: e0 */
    public C12554k0 f71003e0;

    /* JADX INFO: renamed from: f0 */
    public C2836h0 f71004f0;

    /* JADX INFO: renamed from: g0 */
    public MediaCrypto f71005g0;

    /* JADX INFO: renamed from: h0 */
    public final long f71006h0;

    /* JADX INFO: renamed from: i0 */
    public float f71007i0;

    /* JADX INFO: renamed from: j0 */
    public float f71008j0;

    /* JADX INFO: renamed from: k0 */
    public InterfaceC18235k f71009k0;

    /* JADX INFO: renamed from: l0 */
    public C34610p f71010l0;

    /* JADX INFO: renamed from: m0 */
    public MediaFormat f71011m0;

    /* JADX INFO: renamed from: n0 */
    public boolean f71012n0;

    /* JADX INFO: renamed from: o0 */
    public float f71013o0;

    /* JADX INFO: renamed from: p0 */
    public ArrayDeque f71014p0;

    /* JADX INFO: renamed from: q0 */
    public MediaCodecRenderer$DecoderInitializationException f71015q0;

    /* JADX INFO: renamed from: r0 */
    public C18237m f71016r0;

    /* JADX INFO: renamed from: s0 */
    public int f71017s0;

    /* JADX INFO: renamed from: t0 */
    public boolean f71018t0;

    /* JADX INFO: renamed from: u0 */
    public boolean f71019u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f71020v0;

    /* JADX INFO: renamed from: w0 */
    public boolean f71021w0;

    /* JADX INFO: renamed from: x0 */
    public boolean f71022x0;

    /* JADX INFO: renamed from: y0 */
    public boolean f71023y0;

    /* JADX INFO: renamed from: z0 */
    public long f71024z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC18239o(int i13, InterfaceC18234j interfaceC18234j, float f13) {
        super(i13);
        C18232h c18232h = C18232h.f70944x;
        this.f70980R = interfaceC18234j;
        this.f70982S = c18232h;
        this.f70984T = f13;
        this.f70986U = new C0580e(0);
        this.f70988V = new C0580e(0);
        this.f70990W = new C0580e(2);
        C18230f c18230f = new C18230f(2);
        c18230f.f70941L = 32;
        this.f70992X = c18230f;
        this.f70994Y = new MediaCodec.BufferInfo();
        this.f71007i0 = 1.0f;
        this.f71008j0 = 1.0f;
        this.f71006h0 = -9223372036854775807L;
        this.f70996Z = new ArrayDeque();
        this.f70995Y0 = C18238n.f70957e;
        c18230f.m1508q(0);
        c18230f.f2063E.order(ByteOrder.nativeOrder());
        C11782b0 c11782b0 = new C11782b0();
        c11782b0.f38198a = InterfaceC35788e.f152198a;
        c11782b0.f38200c = 0;
        c11782b0.f38199b = 2;
        this.f70998a0 = c11782b0;
        this.f71013o0 = -1.0f;
        this.f71017s0 = 0;
        this.f70973K0 = 0;
        this.f70964B0 = -1;
        this.f70965C0 = -1;
        this.f70963A0 = -9223372036854775807L;
        this.f70979Q0 = -9223372036854775807L;
        this.f70981R0 = -9223372036854775807L;
        this.f70997Z0 = -9223372036854775807L;
        this.f71024z0 = -9223372036854775807L;
        this.f70974L0 = 0;
        this.f70975M0 = 0;
        this.f70993X0 = new C2832g(0);
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: A */
    public final int mo8057A(C34610p c34610p) throws ExoPlaybackException {
        try {
            return mo31587s0(this.f70982S, c34610p);
        } catch (MediaCodecUtil$DecoderQueryException e5) {
            throw m8059g(e5, c34610p, false, ErrorCodes.WebrtcErrors.cCreateAnswerFailed);
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: B */
    public final int mo8058B() {
        return 8;
    }

    /* JADX WARN: Code duplicated, block: B:122:0x0321  */
    /* JADX WARN: Code duplicated, block: B:125:0x0329 A[LOOP:0: B:25:0x008e->B:125:0x0329, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:145:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r24v0, types: [b9.f, i9.o] */
    /* JADX WARN: Type inference failed for: r25v2 */
    /* JADX WARN: Type inference failed for: r25v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r4v22, types: [int] */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v32, types: [java.util.List] */
    /* JADX INFO: renamed from: C */
    public final boolean m52517C(long j7, long j13) throws ExoPlaybackException {
        C18230f c18230f;
        ?? r10;
        ?? r25;
        AbstractC35849g.m113807i(!this.f70985T0);
        C18230f c18230f2 = this.f70992X;
        if (c18230f2.m52500t()) {
            ByteBuffer byteBuffer = c18230f2.f2063E;
            int i13 = this.f70965C0;
            int i14 = c18230f2.f70940K;
            long j14 = c18230f2.f2065G;
            boolean zM52529T = m52529T(this.f11088L, c18230f2.f70939J);
            boolean zM1496f = c18230f2.m1496f(4);
            C34610p c34610p = this.f71001c0;
            c34610p.getClass();
            c18230f = c18230f2;
            if (mo31584h0(j7, j13, null, byteBuffer, i13, 0, i14, j14, zM52529T, zM1496f, c34610p)) {
                mo52533d0(c18230f.f70939J);
                c18230f.mo1506o();
            }
        }
        c18230f = c18230f2;
        if (this.f70983S0) {
            this.f70985T0 = true;
            return false;
        }
        ?? r14 = 0;
        boolean z4 = this.f70970H0;
        C0580e c0580e = this.f70990W;
        if (z4) {
            AbstractC35849g.m113807i(c18230f.m52499s(c0580e));
            this.f70970H0 = false;
        }
        if (this.f70971I0) {
            if (c18230f.m52500t()) {
                return true;
            }
            m52519F();
            this.f70971I0 = false;
            m52530U();
            if (!this.f70969G0) {
                return false;
            }
        }
        AbstractC35849g.m113807i(!this.f70983S0);
        C30352d c30352d = this.f11096y;
        c30352d.m92812k();
        c0580e.mo1506o();
        while (true) {
            c0580e.mo1506o();
            int iM8074w = m8074w(c30352d, c0580e, r14);
            if (iM8074w == -5) {
                mo31580a0(c30352d);
            } else if (iM8074w != -4) {
                if (iM8074w != -3) {
                    throw new IllegalStateException();
                }
                if (m8063k()) {
                    this.f70981R0 = this.f70979Q0;
                }
            } else if (c0580e.m1496f(4)) {
                this.f70983S0 = true;
                this.f70981R0 = this.f70979Q0;
            } else {
                this.f70979Q0 = Math.max(this.f70979Q0, c0580e.f2065G);
                if (m8063k() || this.f70988V.m1496f(536870912)) {
                    this.f70981R0 = this.f70979Q0;
                }
                byte[] bArr = null;
                if (this.f70987U0) {
                    C34610p c34610p2 = this.f71000b0;
                    c34610p2.getClass();
                    this.f71001c0 = c34610p2;
                    if (Objects.equals(c34610p2.f145783n, "audio/opus") && !this.f71001c0.f145786q.isEmpty()) {
                        byte[] bArr2 = (byte[]) this.f71001c0.f145786q.get(r14);
                        int i15 = (bArr2[10] & 255) | ((bArr2[11] & 255) << 8);
                        C34608o c34608oM109410a = this.f71001c0.m109410a();
                        c34608oM109410a.f145722F = i15;
                        this.f71001c0 = new C34610p(c34608oM109410a);
                    }
                    mo31581b0(this.f71001c0, null);
                    this.f70987U0 = r14;
                }
                c0580e.m1509r();
                C34610p c34610p3 = this.f71001c0;
                if (c34610p3 != null && Objects.equals(c34610p3.f145783n, "audio/opus")) {
                    if (c0580e.m1496f(268435456)) {
                        c0580e.f2068y = this.f71001c0;
                        mo31576R(c0580e);
                    }
                    if (this.f11088L - c0580e.f2065G <= 80000) {
                        ?? r15 = this.f71001c0.f145786q;
                        C11782b0 c11782b0 = this.f70998a0;
                        c11782b0.getClass();
                        c0580e.f2063E.getClass();
                        if (c0580e.f2063E.limit() - c0580e.f2063E.position() != 0) {
                            if (c11782b0.f38199b == 2 && (r15.size() == 1 || r15.size() == 3)) {
                                bArr = (byte[]) r15.get(r14);
                            }
                            ByteBuffer byteBuffer2 = c0580e.f2063E;
                            int iPosition = byteBuffer2.position();
                            int iLimit = byteBuffer2.limit();
                            int i16 = iLimit - iPosition;
                            int i17 = (i16 + 255) / 255;
                            int i18 = i17 + 27 + i16;
                            if (c11782b0.f38199b == 2) {
                                int length = bArr != null ? bArr.length + 28 : 47;
                                i18 = (length == true ? 1 : 0) + 44 + i18;
                                r10 = length;
                            } else {
                                r10 = r14;
                            }
                            int i19 = i18;
                            if (c11782b0.f38198a.capacity() < i19) {
                                c11782b0.f38198a = ByteBuffer.allocate(i19).order(ByteOrder.LITTLE_ENDIAN);
                            } else {
                                c11782b0.f38198a.clear();
                            }
                            ByteBuffer byteBuffer3 = c11782b0.f38198a;
                            if (c11782b0.f38199b == 2) {
                                if (bArr != null) {
                                    C11782b0.m31595a(byteBuffer3, 0L, 0, 1, true);
                                    long length2 = bArr.length;
                                    if (!((length2 >> 8) == 0)) {
                                        throw new IllegalArgumentException(AbstractC31780b.m98690k("out of range: %s", Long.valueOf(length2)));
                                    }
                                    byteBuffer3.put((byte) length2);
                                    byteBuffer3.put(bArr);
                                    byteBuffer3.putInt(22, AbstractC38065t.m121919l(byteBuffer3.arrayOffset(), bArr.length + 28, 0, byteBuffer3.array()));
                                    byteBuffer3.position(bArr.length + 28);
                                } else {
                                    byteBuffer3.put(C11782b0.f38196d);
                                }
                                byteBuffer3.put(C11782b0.f38197e);
                                r25 = r10;
                            } else {
                                r25 = r10 == true ? 1 : 0;
                                iLimit = iLimit;
                            }
                            int iM106218j = c11782b0.f38200c + ((int) ((AbstractC33618a.m106218j(byteBuffer2.get(0), byteBuffer2.limit() > 1 ? byteBuffer2.get(1) : (byte) 0) * 48000) / 1000000));
                            c11782b0.f38200c = iM106218j;
                            C11782b0.m31595a(byteBuffer3, iM106218j, c11782b0.f38199b, i17, false);
                            for (int i24 = 0; i24 < i17; i24++) {
                                if (i16 >= 255) {
                                    byteBuffer3.put((byte) -1);
                                    i16 -= 255;
                                } else {
                                    byteBuffer3.put((byte) i16);
                                    i16 = 0;
                                }
                            }
                            int i25 = iLimit;
                            while (iPosition < i25) {
                                byteBuffer3.put(byteBuffer2.get(iPosition));
                                iPosition++;
                            }
                            byteBuffer2.position(byteBuffer2.limit());
                            byteBuffer3.flip();
                            if (c11782b0.f38199b == 2) {
                                byteBuffer3.putInt(r25 + 66, AbstractC38065t.m121919l(byteBuffer3.arrayOffset() + r25 + 44, byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            } else {
                                byteBuffer3.putInt(22, AbstractC38065t.m121919l(byteBuffer3.arrayOffset(), byteBuffer3.limit() - byteBuffer3.position(), 0, byteBuffer3.array()));
                            }
                            c11782b0.f38199b++;
                            c11782b0.f38198a = byteBuffer3;
                            c0580e.mo1506o();
                            c0580e.m1508q(c11782b0.f38198a.remaining());
                            c0580e.f2063E.put(c11782b0.f38198a);
                            c0580e.m1509r();
                        }
                    }
                }
                if (c18230f.m52500t()) {
                    long j15 = this.f11088L;
                    if (m52529T(j15, c18230f.f70939J) == m52529T(j15, c0580e.f2065G)) {
                        if (!c18230f.m52499s(c0580e)) {
                            r14 = 0;
                        }
                    }
                } else if (!c18230f.m52499s(c0580e)) {
                    r14 = 0;
                }
                this.f70970H0 = true;
            }
            if (c18230f.m52500t()) {
                c18230f.m1509r();
            }
            return c18230f.m52500t() || this.f70983S0 || this.f70971I0;
        }
    }

    /* JADX INFO: renamed from: D */
    public abstract C2835h mo31572D(C18237m c18237m, C34610p c34610p, C34610p c34610p2);

    /* JADX INFO: renamed from: E */
    public MediaCodecDecoderException mo52518E(IllegalStateException illegalStateException, C18237m c18237m) {
        return new MediaCodecDecoderException(illegalStateException, c18237m);
    }

    /* JADX INFO: renamed from: F */
    public final void m52519F() {
        this.f70971I0 = false;
        this.f70992X.mo1506o();
        this.f70990W.mo1506o();
        this.f70970H0 = false;
        this.f70969G0 = false;
        C11782b0 c11782b0 = this.f70998a0;
        c11782b0.getClass();
        c11782b0.f38198a = InterfaceC35788e.f152198a;
        c11782b0.f38200c = 0;
        c11782b0.f38199b = 2;
    }

    /* JADX INFO: renamed from: G */
    public final boolean m52520G() throws ExoPlaybackException {
        if (!this.f70976N0) {
            m52545u0();
            return true;
        }
        this.f70974L0 = 1;
        if (this.f71019u0) {
            this.f70975M0 = 3;
            return false;
        }
        this.f70975M0 = 2;
        return true;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m52521H(long j7, long j13) throws ExoPlaybackException {
        boolean z4;
        MediaCodec.BufferInfo bufferInfo;
        boolean zMo31584h0;
        int iMo52488f;
        InterfaceC18235k interfaceC18235k = this.f71009k0;
        interfaceC18235k.getClass();
        int i13 = this.f70965C0;
        MediaCodec.BufferInfo bufferInfo2 = this.f70994Y;
        if (i13 < 0) {
            if (this.f71020v0 && this.f70977O0) {
                try {
                    iMo52488f = interfaceC18235k.mo52488f(bufferInfo2);
                } catch (IllegalStateException unused) {
                    m52535g0();
                    if (this.f70985T0) {
                        m52537j0();
                    }
                }
            } else {
                iMo52488f = interfaceC18235k.mo52488f(bufferInfo2);
            }
            if (iMo52488f < 0) {
                if (iMo52488f == -2) {
                    this.f70978P0 = true;
                    InterfaceC18235k interfaceC18235k2 = this.f71009k0;
                    interfaceC18235k2.getClass();
                    MediaFormat outputFormat = interfaceC18235k2.getOutputFormat();
                    if (this.f71017s0 != 0 && outputFormat.getInteger("width") == 32 && outputFormat.getInteger("height") == 32) {
                        this.f71022x0 = true;
                        return true;
                    }
                    this.f71011m0 = outputFormat;
                    this.f71012n0 = true;
                    return true;
                }
                if (this.f71023y0 && (this.f70983S0 || this.f70974L0 == 2)) {
                    m52535g0();
                }
                long j14 = this.f71024z0;
                if (j14 != -9223372036854775807L) {
                    long j15 = j14 + 100;
                    this.f11083G.getClass();
                    if (j15 < System.currentTimeMillis()) {
                        m52535g0();
                        return false;
                    }
                }
                return false;
            }
            if (this.f71022x0) {
                this.f71022x0 = false;
                interfaceC18235k.mo52491i(iMo52488f);
                return true;
            }
            if (bufferInfo2.size == 0 && (bufferInfo2.flags & 4) != 0) {
                m52535g0();
                return false;
            }
            this.f70965C0 = iMo52488f;
            ByteBuffer outputBuffer = interfaceC18235k.getOutputBuffer(iMo52488f);
            this.f70966D0 = outputBuffer;
            if (outputBuffer != null) {
                outputBuffer.position(bufferInfo2.offset);
                this.f70966D0.limit(bufferInfo2.offset + bufferInfo2.size);
            }
            long j16 = bufferInfo2.presentationTimeUs;
            this.f70967E0 = j16 < this.f11088L;
            long j17 = this.f70981R0;
            this.f70968F0 = j17 != -9223372036854775807L && j17 <= j16;
            m52546v0(j16);
        }
        if (this.f71020v0 && this.f70977O0) {
            try {
                ByteBuffer byteBuffer = this.f70966D0;
                int i14 = this.f70965C0;
                int i15 = bufferInfo2.flags;
                long j18 = bufferInfo2.presentationTimeUs;
                boolean z13 = this.f70967E0;
                boolean z14 = this.f70968F0;
                C34610p c34610p = this.f71001c0;
                c34610p.getClass();
                z4 = false;
                bufferInfo = bufferInfo2;
                try {
                    zMo31584h0 = mo31584h0(j7, j13, interfaceC18235k, byteBuffer, i14, i15, 1, j18, z13, z14, c34610p);
                } catch (IllegalStateException unused2) {
                    m52535g0();
                    if (!this.f70985T0) {
                        return z4;
                    }
                    m52537j0();
                    return z4;
                }
            } catch (IllegalStateException unused3) {
                z4 = false;
            }
        } else {
            z4 = false;
            bufferInfo = bufferInfo2;
            ByteBuffer byteBuffer2 = this.f70966D0;
            int i16 = this.f70965C0;
            int i17 = bufferInfo.flags;
            long j19 = bufferInfo.presentationTimeUs;
            boolean z15 = this.f70967E0;
            boolean z16 = this.f70968F0;
            C34610p c34610p2 = this.f71001c0;
            c34610p2.getClass();
            zMo31584h0 = mo31584h0(j7, j13, interfaceC18235k, byteBuffer2, i16, i17, 1, j19, z15, z16, c34610p2);
        }
        if (!zMo31584h0) {
            return z4;
        }
        mo52533d0(bufferInfo.presentationTimeUs);
        boolean z17 = (bufferInfo.flags & 4) != 0 ? true : z4;
        if (!z17 && this.f70977O0 && this.f70968F0) {
            this.f11083G.getClass();
            this.f71024z0 = System.currentTimeMillis();
        }
        this.f70965C0 = -1;
        this.f70966D0 = null;
        if (!z17) {
            return r15;
        }
        m52535g0();
        return z4;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0191  */
    /* JADX WARN: Code duplicated, block: B:101:0x0199  */
    /* JADX WARN: Code duplicated, block: B:110:0x008f A[EDGE_INSN: B:110:0x008f->B:33:0x008f BREAK  A[LOOP:0: B:30:0x006d->B:32:0x007a], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    /* JADX WARN: Code duplicated, block: B:20:0x0035  */
    /* JADX WARN: Code duplicated, block: B:23:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:27:0x0068  */
    /* JADX WARN: Code duplicated, block: B:29:0x006c  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a A[LOOP:0: B:30:0x006d->B:32:0x007a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:38:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:53:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00db  */
    /* JADX WARN: Code duplicated, block: B:58:0x00df  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0109  */
    /* JADX WARN: Code duplicated, block: B:74:0x0110  */
    /* JADX WARN: Code duplicated, block: B:76:0x0118  */
    /* JADX WARN: Code duplicated, block: B:78:0x011c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0120  */
    /* JADX WARN: Code duplicated, block: B:81:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x0139  */
    /* JADX WARN: Code duplicated, block: B:87:0x0141  */
    /* JADX WARN: Code duplicated, block: B:88:0x0152  */
    /* JADX WARN: Code duplicated, block: B:92:0x016e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0176  */
    /* JADX WARN: Code duplicated, block: B:97:0x0185  */
    /* JADX INFO: renamed from: I */
    public final boolean m52522I() throws ExoPlaybackException {
        int iPosition;
        C30352d c30352d;
        int iM8074w;
        boolean zM1496f;
        long j7;
        int iMo52526M;
        ArrayDeque arrayDeque;
        C0578c c0578c;
        int i13;
        C34610p c34610p;
        InterfaceC18235k interfaceC18235k = this.f71009k0;
        if (interfaceC18235k != null && this.f70974L0 != 2 && !this.f70983S0) {
            int i14 = this.f70964B0;
            C0580e c0580e = this.f70988V;
            if (i14 < 0) {
                int iMo52487e = interfaceC18235k.mo52487e();
                this.f70964B0 = iMo52487e;
                if (iMo52487e >= 0) {
                    c0580e.f2063E = interfaceC18235k.getInputBuffer(iMo52487e);
                    c0580e.mo1506o();
                    if (this.f70974L0 == 1) {
                        if (!this.f71023y0) {
                            this.f70977O0 = true;
                            interfaceC18235k.mo52483a(this.f70964B0, 0, 0L, 4);
                            this.f70964B0 = -1;
                            c0580e.f2063E = null;
                        }
                        this.f70974L0 = 2;
                        return false;
                    }
                    if (this.f71021w0) {
                        this.f71021w0 = false;
                        ByteBuffer byteBuffer = c0580e.f2063E;
                        byteBuffer.getClass();
                        byteBuffer.put(f70962b1);
                        interfaceC18235k.mo52483a(this.f70964B0, 38, 0L, 0);
                        this.f70964B0 = -1;
                        c0580e.f2063E = null;
                        this.f70976N0 = true;
                        return true;
                    }
                    if (this.f70973K0 == 1) {
                        i13 = 0;
                        while (true) {
                            c34610p = this.f71010l0;
                            c34610p.getClass();
                            if (i13 < c34610p.f145786q.size()) {
                                break;
                            }
                            byte[] bArr = (byte[]) this.f71010l0.f145786q.get(i13);
                            ByteBuffer byteBuffer2 = c0580e.f2063E;
                            byteBuffer2.getClass();
                            byteBuffer2.put(bArr);
                            i13++;
                        }
                        this.f70973K0 = 2;
                    }
                    ByteBuffer byteBuffer3 = c0580e.f2063E;
                    byteBuffer3.getClass();
                    iPosition = byteBuffer3.position();
                    c30352d = this.f11096y;
                    c30352d.m92812k();
                    try {
                        iM8074w = m8074w(c30352d, c0580e, 0);
                        if (iM8074w == -3) {
                            if (m8063k()) {
                                this.f70981R0 = this.f70979Q0;
                                return false;
                            }
                        } else {
                            if (iM8074w == -5) {
                                if (this.f70973K0 == 2) {
                                    c0580e.mo1506o();
                                    this.f70973K0 = 1;
                                }
                                mo31580a0(c30352d);
                                return true;
                            }
                            if (c0580e.m1496f(4)) {
                                if (this.f70976N0 && !c0580e.m1496f(1)) {
                                    c0580e.mo1506o();
                                    if (this.f70973K0 == 2) {
                                        this.f70973K0 = 1;
                                        return true;
                                    }
                                } else if (!mo52542p0(c0580e)) {
                                    zM1496f = c0580e.m1496f(1073741824);
                                    if (zM1496f) {
                                        c0578c = c0580e.f2069z;
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
                                    j7 = c0580e.f2065G;
                                    if (this.f70987U0) {
                                        arrayDeque = this.f70996Z;
                                        if (arrayDeque.isEmpty()) {
                                            C24565w c24565w = this.f70995Y0.f70961d;
                                            C34610p c34610p2 = this.f71000b0;
                                            c34610p2.getClass();
                                            c24565w.m71651a(j7, c34610p2);
                                        } else {
                                            C24565w c24565w2 = ((C18238n) arrayDeque.peekLast()).f70961d;
                                            C34610p c34610p3 = this.f71000b0;
                                            c34610p3.getClass();
                                            c24565w2.m71651a(j7, c34610p3);
                                        }
                                        this.f70987U0 = false;
                                    }
                                    this.f70979Q0 = Math.max(this.f70979Q0, j7);
                                    if (m8063k() || c0580e.m1496f(536870912)) {
                                        this.f70981R0 = this.f70979Q0;
                                    }
                                    c0580e.m1509r();
                                    if (c0580e.m1496f(268435456)) {
                                        mo31576R(c0580e);
                                    }
                                    mo52534f0(c0580e);
                                    iMo52526M = mo52526M(c0580e);
                                    if (zM1496f) {
                                        interfaceC18235k.mo52489g(this.f70964B0, c0580e.f2069z, j7, iMo52526M);
                                    } else {
                                        int i15 = this.f70964B0;
                                        ByteBuffer byteBuffer4 = c0580e.f2063E;
                                        byteBuffer4.getClass();
                                        interfaceC18235k.mo52483a(i15, byteBuffer4.limit(), j7, iMo52526M);
                                    }
                                    this.f70964B0 = -1;
                                    c0580e.f2063E = null;
                                    this.f70976N0 = true;
                                    this.f70973K0 = 0;
                                    this.f70993X0.f11168d++;
                                    return true;
                                }
                                return true;
                            }
                            this.f70981R0 = this.f70979Q0;
                            if (this.f70973K0 == 2) {
                                c0580e.mo1506o();
                                this.f70973K0 = 1;
                            }
                            this.f70983S0 = true;
                            if (!this.f70976N0) {
                                m52535g0();
                                return false;
                            }
                            if (!this.f71023y0) {
                                this.f70977O0 = true;
                                interfaceC18235k.mo52483a(this.f70964B0, 0, 0L, 4);
                                this.f70964B0 = -1;
                                c0580e.f2063E = null;
                                return false;
                            }
                        }
                    } catch (DecoderInputBuffer$InsufficientCapacityException e5) {
                        mo31577X(e5);
                        m52536i0(0);
                        m52523J();
                        return true;
                    }
                }
            } else {
                if (this.f70974L0 == 1) {
                    if (!this.f71023y0) {
                        this.f70977O0 = true;
                        interfaceC18235k.mo52483a(this.f70964B0, 0, 0L, 4);
                        this.f70964B0 = -1;
                        c0580e.f2063E = null;
                    }
                    this.f70974L0 = 2;
                    return false;
                }
                if (this.f71021w0) {
                    this.f71021w0 = false;
                    ByteBuffer byteBuffer5 = c0580e.f2063E;
                    byteBuffer5.getClass();
                    byteBuffer5.put(f70962b1);
                    interfaceC18235k.mo52483a(this.f70964B0, 38, 0L, 0);
                    this.f70964B0 = -1;
                    c0580e.f2063E = null;
                    this.f70976N0 = true;
                    return true;
                }
                if (this.f70973K0 == 1) {
                    i13 = 0;
                    while (true) {
                        c34610p = this.f71010l0;
                        c34610p.getClass();
                        if (i13 < c34610p.f145786q.size()) {
                            break;
                            break;
                        }
                        byte[] bArr2 = (byte[]) this.f71010l0.f145786q.get(i13);
                        ByteBuffer byteBuffer6 = c0580e.f2063E;
                        byteBuffer6.getClass();
                        byteBuffer6.put(bArr2);
                        i13++;
                    }
                    this.f70973K0 = 2;
                }
                ByteBuffer byteBuffer7 = c0580e.f2063E;
                byteBuffer7.getClass();
                iPosition = byteBuffer7.position();
                c30352d = this.f11096y;
                c30352d.m92812k();
                iM8074w = m8074w(c30352d, c0580e, 0);
                if (iM8074w == -3) {
                    if (m8063k()) {
                        this.f70981R0 = this.f70979Q0;
                        return false;
                    }
                } else {
                    if (iM8074w == -5) {
                        if (this.f70973K0 == 2) {
                            c0580e.mo1506o();
                            this.f70973K0 = 1;
                        }
                        mo31580a0(c30352d);
                        return true;
                    }
                    if (c0580e.m1496f(4)) {
                        if (this.f70976N0) {
                            if (!mo52542p0(c0580e)) {
                                zM1496f = c0580e.m1496f(1073741824);
                                if (zM1496f) {
                                    c0578c = c0580e.f2069z;
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
                                j7 = c0580e.f2065G;
                                if (this.f70987U0) {
                                    arrayDeque = this.f70996Z;
                                    if (arrayDeque.isEmpty()) {
                                        C24565w c24565w3 = ((C18238n) arrayDeque.peekLast()).f70961d;
                                        C34610p c34610p4 = this.f71000b0;
                                        c34610p4.getClass();
                                        c24565w3.m71651a(j7, c34610p4);
                                    } else {
                                        C24565w c24565w4 = this.f70995Y0.f70961d;
                                        C34610p c34610p5 = this.f71000b0;
                                        c34610p5.getClass();
                                        c24565w4.m71651a(j7, c34610p5);
                                    }
                                    this.f70987U0 = false;
                                }
                                this.f70979Q0 = Math.max(this.f70979Q0, j7);
                                if (m8063k()) {
                                    this.f70981R0 = this.f70979Q0;
                                } else {
                                    this.f70981R0 = this.f70979Q0;
                                }
                                c0580e.m1509r();
                                if (c0580e.m1496f(268435456)) {
                                    mo31576R(c0580e);
                                }
                                mo52534f0(c0580e);
                                iMo52526M = mo52526M(c0580e);
                                if (zM1496f) {
                                    interfaceC18235k.mo52489g(this.f70964B0, c0580e.f2069z, j7, iMo52526M);
                                } else {
                                    int i16 = this.f70964B0;
                                    ByteBuffer byteBuffer8 = c0580e.f2063E;
                                    byteBuffer8.getClass();
                                    interfaceC18235k.mo52483a(i16, byteBuffer8.limit(), j7, iMo52526M);
                                }
                                this.f70964B0 = -1;
                                c0580e.f2063E = null;
                                this.f70976N0 = true;
                                this.f70973K0 = 0;
                                this.f70993X0.f11168d++;
                                return true;
                            }
                        } else if (!mo52542p0(c0580e)) {
                            zM1496f = c0580e.m1496f(1073741824);
                            if (zM1496f) {
                                c0578c = c0580e.f2069z;
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
                            j7 = c0580e.f2065G;
                            if (this.f70987U0) {
                                arrayDeque = this.f70996Z;
                                if (arrayDeque.isEmpty()) {
                                    C24565w c24565w5 = ((C18238n) arrayDeque.peekLast()).f70961d;
                                    C34610p c34610p6 = this.f71000b0;
                                    c34610p6.getClass();
                                    c24565w5.m71651a(j7, c34610p6);
                                } else {
                                    C24565w c24565w6 = this.f70995Y0.f70961d;
                                    C34610p c34610p7 = this.f71000b0;
                                    c34610p7.getClass();
                                    c24565w6.m71651a(j7, c34610p7);
                                }
                                this.f70987U0 = false;
                            }
                            this.f70979Q0 = Math.max(this.f70979Q0, j7);
                            if (m8063k()) {
                                this.f70981R0 = this.f70979Q0;
                            } else {
                                this.f70981R0 = this.f70979Q0;
                            }
                            c0580e.m1509r();
                            if (c0580e.m1496f(268435456)) {
                                mo31576R(c0580e);
                            }
                            mo52534f0(c0580e);
                            iMo52526M = mo52526M(c0580e);
                            if (zM1496f) {
                                interfaceC18235k.mo52489g(this.f70964B0, c0580e.f2069z, j7, iMo52526M);
                            } else {
                                int i17 = this.f70964B0;
                                ByteBuffer byteBuffer9 = c0580e.f2063E;
                                byteBuffer9.getClass();
                                interfaceC18235k.mo52483a(i17, byteBuffer9.limit(), j7, iMo52526M);
                            }
                            this.f70964B0 = -1;
                            c0580e.f2063E = null;
                            this.f70976N0 = true;
                            this.f70973K0 = 0;
                            this.f70993X0.f11168d++;
                            return true;
                        }
                        return true;
                    }
                    this.f70981R0 = this.f70979Q0;
                    if (this.f70973K0 == 2) {
                        c0580e.mo1506o();
                        this.f70973K0 = 1;
                    }
                    this.f70983S0 = true;
                    if (!this.f70976N0) {
                        m52535g0();
                        return false;
                    }
                    if (!this.f71023y0) {
                        this.f70977O0 = true;
                        interfaceC18235k.mo52483a(this.f70964B0, 0, 0L, 4);
                        this.f70964B0 = -1;
                        c0580e.f2063E = null;
                        return false;
                    }
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: J */
    public final void m52523J() {
        try {
            InterfaceC18235k interfaceC18235k = this.f71009k0;
            AbstractC35849g.m113808j(interfaceC18235k);
            interfaceC18235k.flush();
        } finally {
            mo52538l0();
        }
    }

    /* JADX INFO: renamed from: K */
    public final boolean m52524K() {
        if (this.f71009k0 == null) {
            return false;
        }
        int i13 = this.f70975M0;
        if (i13 == 3 || ((this.f71018t0 && !this.f70978P0) || (this.f71019u0 && this.f70977O0))) {
            m52537j0();
            return true;
        }
        if (i13 == 2) {
            int i14 = AbstractC38065t.f163031a;
            AbstractC35849g.m113807i(i14 >= 23);
            if (i14 >= 23) {
                try {
                    m52545u0();
                } catch (ExoPlaybackException e5) {
                    AbstractC38046a.m121827v("MediaCodecRenderer", "Failed to update the DRM session, releasing the codec instead.", e5);
                    m52537j0();
                    return true;
                }
            }
        }
        m52523J();
        return false;
    }

    /* JADX INFO: renamed from: L */
    public final List m52525L(boolean z4) {
        C34610p c34610p = this.f71000b0;
        c34610p.getClass();
        C18232h c18232h = this.f70982S;
        ArrayList arrayListMo31574P = mo31574P(c18232h, c34610p, z4);
        if (!arrayListMo31574P.isEmpty() || !z4) {
            return arrayListMo31574P;
        }
        ArrayList arrayListMo31574P2 = mo31574P(c18232h, c34610p, false);
        if (!arrayListMo31574P2.isEmpty()) {
            AbstractC38046a.m121826u("MediaCodecRenderer", "Drm session requires secure decoder for " + c34610p.f145783n + ", but no secure decoder available. Trying to proceed with " + arrayListMo31574P2 + ".");
        }
        return arrayListMo31574P2;
    }

    /* JADX INFO: renamed from: M */
    public int mo52526M(C0580e c0580e) {
        return 0;
    }

    /* JADX INFO: renamed from: N */
    public boolean mo52527N() {
        return false;
    }

    /* JADX INFO: renamed from: O */
    public abstract float mo31573O(float f13, C34610p[] c34610pArr);

    /* JADX INFO: renamed from: P */
    public abstract ArrayList mo31574P(C18232h c18232h, C34610p c34610p, boolean z4);

    /* JADX INFO: renamed from: Q */
    public abstract C0332w0 mo31575Q(C18237m c18237m, C34610p c34610p, MediaCrypto mediaCrypto, float f13);

    /* JADX INFO: renamed from: R */
    public abstract void mo31576R(C0580e c0580e);

    /* JADX WARN: Code duplicated, block: B:30:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f9  */
    /* JADX INFO: renamed from: S */
    public final void m52528S(C18237m c18237m, MediaCrypto mediaCrypto) {
        float fMo31573O;
        int i13;
        C34610p c34610p = this.f71000b0;
        c34610p.getClass();
        String str = c18237m.f70948a;
        int i14 = AbstractC38065t.f163031a;
        if (i14 < 23) {
            fMo31573O = -1.0f;
        } else {
            float f13 = this.f71008j0;
            C34610p[] c34610pArr = this.f11086J;
            c34610pArr.getClass();
            fMo31573O = mo31573O(f13, c34610pArr);
        }
        float f14 = fMo31573O > this.f70984T ? fMo31573O : -1.0f;
        this.f11083G.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C0332w0 c0332w0Mo31575Q = mo31575Q(c18237m, c34610p, mediaCrypto, f14);
        if (i14 >= 31) {
            C4323n c4323n = this.f11082F;
            c4323n.getClass();
            AbstractC11480b.m30892r(c0332w0Mo31575Q, c4323n);
        }
        try {
            Trace.beginSection("createCodec:" + str);
            InterfaceC18235k interfaceC18235kMo43808e = this.f70980R.mo43808e(c0332w0Mo31575Q);
            this.f71009k0 = interfaceC18235kMo43808e;
            interfaceC18235kMo43808e.mo52493k(new C17417d(this, 7));
            Trace.endSection();
            this.f11083G.getClass();
            float f15 = f14;
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            if (!c18237m.m52513e(c34610p)) {
                String strM109409c = C34610p.m109409c(c34610p);
                Locale locale = Locale.US;
                AbstractC38046a.m121826u("MediaCodecRenderer", AbstractC2875y.m8300m("Format exceeds selected codec's capabilities [", strM109409c, ", ", str, "]"));
            }
            this.f71016r0 = c18237m;
            this.f71013o0 = f15;
            this.f71010l0 = c34610p;
            if (i14 <= 25 && "OMX.Exynos.avc.dec.secure".equals(str)) {
                String str2 = Build.MODEL;
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
                String str3 = Build.DEVICE;
                if ("flounder".equals(str3) || "flounder_lte".equals(str3) || "grouper".equals(str3) || "tilapia".equals(str3)) {
                    i13 = 1;
                } else {
                    i13 = 0;
                }
            }
            this.f71017s0 = i13;
            this.f71018t0 = i14 == 29 && "c2.android.aac.decoder".equals(str);
            this.f71019u0 = i14 <= 23 && "OMX.google.vorbis.decoder".equals(str);
            this.f71020v0 = i14 == 21 && "OMX.google.aac.decoder".equals(str);
            String str4 = c18237m.f70948a;
            this.f71023y0 = (i14 <= 25 && "OMX.rk.video_decoder.avc".equals(str4)) || (i14 <= 29 && ("OMX.broadcom.video_decoder.tunnel".equals(str4) || "OMX.broadcom.video_decoder.tunnel.secure".equals(str4) || "OMX.bcm.vdec.avc.tunnel".equals(str4) || "OMX.bcm.vdec.avc.tunnel.secure".equals(str4) || "OMX.bcm.vdec.hevc.tunnel".equals(str4) || "OMX.bcm.vdec.hevc.tunnel.secure".equals(str4))) || (("Amazon".equals(Build.MANUFACTURER) && "AFTS".equals(Build.MODEL) && c18237m.f70953f) || mo52527N());
            this.f71009k0.getClass();
            if (this.f11084H == 2) {
                this.f11083G.getClass();
                this.f70963A0 = SystemClock.elapsedRealtime() + 1000;
            }
            this.f70993X0.f11166b++;
            mo31578Y(jElapsedRealtime2, jElapsedRealtime2 - jElapsedRealtime, str);
        } catch (Throwable th3) {
            Trace.endSection();
            throw th3;
        }
    }

    /* JADX INFO: renamed from: T */
    public final boolean m52529T(long j7, long j13) {
        if (j13 >= j7) {
            return false;
        }
        C34610p c34610p = this.f71001c0;
        return c34610p == null || !Objects.equals(c34610p.f145783n, "audio/opus") || j7 - j13 > 80000;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0084 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:40:0x0086  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:45:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab A[Catch: MediaCodecRenderer$DecoderInitializationException -> 0x00bb, TryCatch #1 {MediaCodecRenderer$DecoderInitializationException -> 0x00bb, blocks: (B:51:0x00a7, B:53:0x00ab, B:55:0x00b2, B:60:0x00bd, B:64:0x00ca), top: B:76:0x00a7 }] */
    /* JADX WARN: Code duplicated, block: B:63:0x00c9  */
    /* JADX INFO: renamed from: U */
    public final void m52530U() throws ExoPlaybackException {
        C34610p c34610p;
        C12554k0 c12554k0;
        if (this.f71009k0 != null || this.f70969G0 || (c34610p = this.f71000b0) == null) {
            return;
        }
        String str = c34610p.f145783n;
        boolean z4 = true;
        if (this.f71003e0 == null && mo31586r0(c34610p)) {
            m52519F();
            boolean zEquals = "audio/mp4a-latm".equals(str);
            C18230f c18230f = this.f70992X;
            if (zEquals || "audio/mpeg".equals(str) || "audio/opus".equals(str)) {
                c18230f.getClass();
                c18230f.f70941L = 32;
            } else {
                c18230f.getClass();
                c18230f.f70941L = 1;
            }
            this.f70969G0 = true;
            return;
        }
        m52540n0(this.f71003e0);
        if (this.f71002d0 == null) {
            try {
                c12554k0 = this.f71002d0;
                if (c12554k0 == null && (c12554k0.m35220G() == 3 || this.f71002d0.m35220G() == 4)) {
                    C12554k0 c12554k1 = this.f71002d0;
                    AbstractC35849g.m113808j(str);
                    if (!c12554k1.m35223L(str)) {
                        z4 = false;
                    }
                } else {
                    z4 = false;
                }
                m52531V(this.f71005g0, z4);
            } catch (MediaCodecRenderer$DecoderInitializationException e5) {
                throw m8059g(e5, c34610p, false, ErrorCodes.WebrtcErrors.cCreateOfferFailed);
            }
        } else {
            AbstractC35849g.m113807i(this.f71005g0 == null);
            C12554k0 c12554k2 = this.f71002d0;
            InterfaceC0577b interfaceC0577bM35242z = c12554k2.m35242z();
            if (AbstractC15592i.f58542a && (interfaceC0577bM35242z instanceof AbstractC15592i)) {
                int iM35220G = c12554k2.m35220G();
                if (iM35220G == 1) {
                    DrmSession$DrmSessionException drmSession$DrmSessionExceptionM35217C = c12554k2.m35217C();
                    drmSession$DrmSessionExceptionM35217C.getClass();
                    throw m8059g(drmSession$DrmSessionExceptionM35217C, this.f71000b0, false, drmSession$DrmSessionExceptionM35217C.f6391w);
                }
                if (iM35220G == 4) {
                    if (interfaceC0577bM35242z == null) {
                        if (c12554k2.m35217C() != null) {
                        }
                    } else if (interfaceC0577bM35242z instanceof AbstractC15592i) {
                        this.f71005g0 = new MediaCrypto(null, null);
                    }
                    c12554k0 = this.f71002d0;
                    if (c12554k0 == null) {
                        z4 = false;
                    } else {
                        z4 = false;
                    }
                    m52531V(this.f71005g0, z4);
                }
            } else {
                if (interfaceC0577bM35242z == null) {
                    if (c12554k2.m35217C() != null) {
                    }
                } else if (interfaceC0577bM35242z instanceof AbstractC15592i) {
                    try {
                        this.f71005g0 = new MediaCrypto(null, null);
                    } catch (MediaCryptoException e13) {
                        throw m8059g(e13, this.f71000b0, false, ErrorCodes.GenericErrors.cRTCTrackMissing);
                    }
                }
                c12554k0 = this.f71002d0;
                if (c12554k0 == null) {
                    z4 = false;
                } else {
                    z4 = false;
                }
                m52531V(this.f71005g0, z4);
            }
        }
        MediaCrypto mediaCrypto = this.f71005g0;
        if (mediaCrypto == null || this.f71009k0 != null) {
            return;
        }
        mediaCrypto.release();
        this.f71005g0 = null;
    }

    /* JADX INFO: renamed from: V */
    public final void m52531V(MediaCrypto mediaCrypto, boolean z4) throws MediaCodecRenderer$DecoderInitializationException {
        C34610p c34610p = this.f71000b0;
        c34610p.getClass();
        if (this.f71014p0 == null) {
            try {
                List listM52525L = m52525L(z4);
                this.f71014p0 = new ArrayDeque();
                ArrayList arrayList = (ArrayList) listM52525L;
                if (!arrayList.isEmpty()) {
                    this.f71014p0.add((C18237m) arrayList.get(0));
                }
                this.f71015q0 = null;
            } catch (MediaCodecUtil$DecoderQueryException e5) {
                throw new MediaCodecRenderer$DecoderInitializationException(c34610p, e5, z4, -49998);
            }
        }
        if (this.f71014p0.isEmpty()) {
            throw new MediaCodecRenderer$DecoderInitializationException(c34610p, null, z4, -49999);
        }
        ArrayDeque arrayDeque = this.f71014p0;
        arrayDeque.getClass();
        while (this.f71009k0 == null) {
            C18237m c18237m = (C18237m) arrayDeque.peekFirst();
            c18237m.getClass();
            if (!mo52532W(c34610p) || !mo52543q0(c18237m)) {
                return;
            }
            try {
                m52528S(c18237m, mediaCrypto);
            } catch (Exception e13) {
                AbstractC38046a.m121827v("MediaCodecRenderer", "Failed to initialize decoder: " + c18237m, e13);
                arrayDeque.removeFirst();
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException = new MediaCodecRenderer$DecoderInitializationException("Decoder init failed: " + c18237m.f70948a + ", " + c34610p, e13, c34610p.f145783n, z4, c18237m, e13 instanceof MediaCodec.CodecException ? ((MediaCodec.CodecException) e13).getDiagnosticInfo() : null);
                mo31577X(mediaCodecRenderer$DecoderInitializationException);
                MediaCodecRenderer$DecoderInitializationException mediaCodecRenderer$DecoderInitializationException2 = this.f71015q0;
                if (mediaCodecRenderer$DecoderInitializationException2 == null) {
                    this.f71015q0 = mediaCodecRenderer$DecoderInitializationException;
                } else {
                    this.f71015q0 = new MediaCodecRenderer$DecoderInitializationException(mediaCodecRenderer$DecoderInitializationException2.getMessage(), mediaCodecRenderer$DecoderInitializationException2.getCause(), mediaCodecRenderer$DecoderInitializationException2.f6394w, mediaCodecRenderer$DecoderInitializationException2.f6395x, mediaCodecRenderer$DecoderInitializationException2.f6396y, mediaCodecRenderer$DecoderInitializationException2.f6397z);
                }
                if (arrayDeque.isEmpty()) {
                    throw this.f71015q0;
                }
            }
        }
        this.f71014p0 = null;
    }

    /* JADX INFO: renamed from: W */
    public boolean mo52532W(C34610p c34610p) {
        return true;
    }

    /* JADX INFO: renamed from: X */
    public abstract void mo31577X(Exception exc);

    /* JADX INFO: renamed from: Y */
    public abstract void mo31578Y(long j7, long j13, String str);

    /* JADX INFO: renamed from: Z */
    public abstract void mo31579Z(String str);

    /* JADX WARN: Code duplicated, block: B:87:0x011f  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e3, code lost:
    
        if (r4.m35223L(r2) != false) goto L134;
     */
    /* JADX INFO: renamed from: a0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p031b9.C2835h mo31580a0(qg3.C30352d r14) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p215i9.AbstractC18239o.mo31580a0(qg3.d):b9.h");
    }

    /* JADX INFO: renamed from: b0 */
    public abstract void mo31581b0(C34610p c34610p, MediaFormat mediaFormat);

    /* JADX INFO: renamed from: c0 */
    public void mo31582c0() {
    }

    /* JADX INFO: renamed from: d0 */
    public void mo52533d0(long j7) {
        this.f70997Z0 = j7;
        while (true) {
            ArrayDeque arrayDeque = this.f70996Z;
            if (arrayDeque.isEmpty() || j7 < ((C18238n) arrayDeque.peek()).f70958a) {
                return;
            }
            C18238n c18238n = (C18238n) arrayDeque.poll();
            c18238n.getClass();
            m52541o0(c18238n);
            mo31583e0();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public abstract void mo31583e0();

    /* JADX INFO: renamed from: f0 */
    public void mo52534f0(C0580e c0580e) {
    }

    /* JADX INFO: renamed from: g0 */
    public final void m52535g0() throws ExoPlaybackException {
        int i13 = this.f70975M0;
        if (i13 == 1) {
            m52523J();
            return;
        }
        if (i13 == 2) {
            m52523J();
            m52545u0();
        } else if (i13 != 3) {
            this.f70985T0 = true;
            mo31585k0();
        } else {
            m52537j0();
            m52530U();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public abstract boolean mo31584h0(long j7, long j13, InterfaceC18235k interfaceC18235k, ByteBuffer byteBuffer, int i13, int i14, int i15, long j14, boolean z4, boolean z13, C34610p c34610p);

    /* JADX INFO: renamed from: i0 */
    public final boolean m52536i0(int i13) throws ExoPlaybackException {
        C30352d c30352d = this.f11096y;
        c30352d.m92812k();
        C0580e c0580e = this.f70986U;
        c0580e.mo1506o();
        int iM8074w = m8074w(c30352d, c0580e, i13 | 4);
        if (iM8074w == -5) {
            mo31580a0(c30352d);
            return true;
        }
        if (iM8074w != -4 || !c0580e.m1496f(4)) {
            return false;
        }
        this.f70983S0 = true;
        m52535g0();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j0 */
    public final void m52537j0() {
        try {
            InterfaceC18235k interfaceC18235k = this.f71009k0;
            if (interfaceC18235k != null) {
                interfaceC18235k.release();
                this.f70993X0.f11167c++;
                C18237m c18237m = this.f71016r0;
                c18237m.getClass();
                mo31579Z(c18237m.f70948a);
            }
            this.f71009k0 = null;
            try {
                MediaCrypto mediaCrypto = this.f71005g0;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.f71005g0 = null;
                m52540n0(null);
                m52539m0();
            }
        } catch (Throwable th3) {
            this.f71009k0 = null;
            try {
                MediaCrypto mediaCrypto2 = this.f71005g0;
                if (mediaCrypto2 != null) {
                    mediaCrypto2.release();
                }
                throw th3;
            } finally {
                this.f71005g0 = null;
                m52540n0(null);
                m52539m0();
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public abstract void mo31585k0();

    /* JADX INFO: renamed from: l0 */
    public void mo52538l0() {
        this.f70964B0 = -1;
        this.f70988V.f2063E = null;
        this.f70965C0 = -1;
        this.f70966D0 = null;
        this.f70963A0 = -9223372036854775807L;
        this.f70977O0 = false;
        this.f71024z0 = -9223372036854775807L;
        this.f70976N0 = false;
        this.f71021w0 = false;
        this.f71022x0 = false;
        this.f70967E0 = false;
        this.f70968F0 = false;
        this.f70979Q0 = -9223372036854775807L;
        this.f70981R0 = -9223372036854775807L;
        this.f70997Z0 = -9223372036854775807L;
        this.f70974L0 = 0;
        this.f70975M0 = 0;
        this.f70973K0 = this.f70972J0 ? 1 : 0;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m52539m0() {
        mo52538l0();
        this.f70991W0 = null;
        this.f71014p0 = null;
        this.f71016r0 = null;
        this.f71010l0 = null;
        this.f71011m0 = null;
        this.f71012n0 = false;
        this.f70978P0 = false;
        this.f71013o0 = -1.0f;
        this.f71017s0 = 0;
        this.f71018t0 = false;
        this.f71019u0 = false;
        this.f71020v0 = false;
        this.f71023y0 = false;
        this.f70972J0 = false;
        this.f70973K0 = 0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: n */
    public boolean mo8065n() {
        boolean zMo36169b;
        if (this.f71000b0 != null) {
            if (m8063k()) {
                zMo36169b = this.f11090N;
            } else {
                InterfaceC23540z0 interfaceC23540z0 = this.f11085I;
                interfaceC23540z0.getClass();
                zMo36169b = interfaceC23540z0.mo36169b();
            }
            if (!zMo36169b) {
                if (!(this.f70965C0 >= 0)) {
                    if (this.f70963A0 != -9223372036854775807L) {
                        this.f11083G.getClass();
                        if (SystemClock.elapsedRealtime() < this.f70963A0) {
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m52540n0(C12554k0 c12554k0) {
        C12554k0 c12554k1 = this.f71002d0;
        if (c12554k1 != c12554k0) {
            if (c12554k0 != null) {
                c12554k0.m35235j(null);
            }
            if (c12554k1 != null) {
                c12554k1.m35222K(null);
            }
        }
        this.f71002d0 = c12554k0;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: o */
    public void mo8066o() {
        this.f71000b0 = null;
        m52541o0(C18238n.f70957e);
        this.f70996Z.clear();
        m52524K();
    }

    /* JADX INFO: renamed from: o0 */
    public final void m52541o0(C18238n c18238n) {
        this.f70995Y0 = c18238n;
        if (c18238n.f70960c != -9223372036854775807L) {
            this.f70999a1 = true;
            mo31582c0();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public boolean mo52542p0(C0580e c0580e) {
        return false;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: q */
    public void mo8068q(long j7, boolean z4) throws ExoPlaybackException {
        this.f70983S0 = false;
        this.f70985T0 = false;
        this.f70989V0 = false;
        if (this.f70969G0) {
            this.f70992X.mo1506o();
            this.f70990W.mo1506o();
            this.f70970H0 = false;
            C11782b0 c11782b0 = this.f70998a0;
            c11782b0.getClass();
            c11782b0.f38198a = InterfaceC35788e.f152198a;
            c11782b0.f38200c = 0;
            c11782b0.f38199b = 2;
        } else if (m52524K()) {
            m52530U();
        }
        if (this.f70995Y0.f70961d.m71658h() > 0) {
            this.f70987U0 = true;
        }
        this.f70995Y0.f70961d.m71652b();
        this.f70996Z.clear();
    }

    /* JADX INFO: renamed from: q0 */
    public boolean mo52543q0(C18237m c18237m) {
        return true;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean mo31586r0(C34610p c34610p) {
        return false;
    }

    /* JADX INFO: renamed from: s0 */
    public abstract int mo31587s0(C18232h c18232h, C34610p c34610p);

    /* JADX INFO: renamed from: t0 */
    public final boolean m52544t0(C34610p c34610p) throws ExoPlaybackException {
        if (AbstractC38065t.f163031a >= 23 && this.f71009k0 != null && this.f70975M0 != 3 && this.f11084H != 0) {
            float f13 = this.f71008j0;
            c34610p.getClass();
            C34610p[] c34610pArr = this.f11086J;
            c34610pArr.getClass();
            float fMo31573O = mo31573O(f13, c34610pArr);
            float f14 = this.f71013o0;
            if (f14 != fMo31573O) {
                if (fMo31573O == -1.0f) {
                    if (this.f70976N0) {
                        this.f70974L0 = 1;
                        this.f70975M0 = 3;
                        return false;
                    }
                    m52537j0();
                    m52530U();
                    return false;
                }
                if (f14 != -1.0f || fMo31573O > this.f70984T) {
                    Bundle bundle = new Bundle();
                    bundle.putFloat("operating-rate", fMo31573O);
                    InterfaceC18235k interfaceC18235k = this.f71009k0;
                    interfaceC18235k.getClass();
                    interfaceC18235k.setParameters(bundle);
                    this.f71013o0 = fMo31573O;
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: u0 */
    public final void m52545u0() throws ExoPlaybackException {
        C12554k0 c12554k0 = this.f71003e0;
        c12554k0.getClass();
        if (c12554k0.m35242z() instanceof AbstractC15592i) {
            try {
                MediaCrypto mediaCrypto = this.f71005g0;
                mediaCrypto.getClass();
                mediaCrypto.setMediaDrmSession(null);
            } catch (MediaCryptoException e5) {
                throw m8059g(e5, this.f71000b0, false, ErrorCodes.GenericErrors.cRTCTrackMissing);
            }
        }
        m52540n0(this.f71003e0);
        this.f70974L0 = 0;
        this.f70975M0 = 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
    
        if (r4 >= r0) goto L14;
     */
    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8073v(p516u8.C34610p[] r13, long r14, long r16, p299l9.C23488c0 r18) {
        /*
            r12 = this;
            i9.n r13 = r12.f70995Y0
            long r0 = r13.f70960c
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r13 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r13 != 0) goto L1e
            i9.n r4 = new i9.n
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r7 = r14
            r9 = r16
            r4.<init>(r5, r7, r9)
            r12.m52541o0(r4)
            return
        L1e:
            java.util.ArrayDeque r13 = r12.f70996Z
            boolean r0 = r13.isEmpty()
            if (r0 == 0) goto L52
            long r0 = r12.f70979Q0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L36
            long r4 = r12.f70997Z0
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 == 0) goto L52
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L52
        L36:
            i9.n r5 = new i9.n
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r12.m52541o0(r5)
            i9.n r13 = r12.f70995Y0
            long r13 = r13.f70960c
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 == 0) goto L51
            r12.mo31583e0()
        L51:
            return
        L52:
            i9.n r5 = new i9.n
            long r6 = r12.f70979Q0
            r8 = r14
            r10 = r16
            r5.<init>(r6, r8, r10)
            r13.add(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p215i9.AbstractC18239o.mo8073v(u8.p[], long, long, l9.c0):void");
    }

    /* JADX INFO: renamed from: v0 */
    public final void m52546v0(long j7) {
        C34610p c34610p = (C34610p) this.f70995Y0.f70961d.m71656f(j7);
        if (c34610p == null && this.f70999a1 && this.f71011m0 != null) {
            c34610p = (C34610p) this.f70995Y0.f70961d.m71655e();
        }
        if (c34610p != null) {
            this.f71001c0 = c34610p;
        } else if (!this.f71012n0 || this.f71001c0 == null) {
            return;
        }
        C34610p c34610p2 = this.f71001c0;
        c34610p2.getClass();
        mo31581b0(c34610p2, this.f71011m0);
        this.f71012n0 = false;
        this.f70999a1 = false;
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: x */
    public void mo8075x(long j7, long j13) throws ExoPlaybackException {
        boolean z4;
        boolean z13;
        boolean z14 = false;
        if (this.f70989V0) {
            this.f70989V0 = false;
            m52535g0();
        }
        ExoPlaybackException exoPlaybackException = this.f70991W0;
        if (exoPlaybackException != null) {
            this.f70991W0 = null;
            throw exoPlaybackException;
        }
        try {
            if (this.f70985T0) {
                mo31585k0();
                return;
            }
            if (this.f71000b0 != null || m52536i0(2)) {
                m52530U();
                if (this.f70969G0) {
                    Trace.beginSection("bypassRender");
                    while (m52517C(j7, j13)) {
                    }
                    Trace.endSection();
                } else if (this.f71009k0 != null) {
                    this.f11083G.getClass();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    Trace.beginSection("drainAndFeed");
                    while (m52521H(j7, j13)) {
                        long j14 = this.f71006h0;
                        if (j14 != -9223372036854775807L) {
                            this.f11083G.getClass();
                            z13 = SystemClock.elapsedRealtime() - jElapsedRealtime < j14;
                        }
                        if (!z13) {
                            break;
                        }
                    }
                    while (m52522I()) {
                        long j15 = this.f71006h0;
                        if (j15 != -9223372036854775807L) {
                            this.f11083G.getClass();
                            z4 = SystemClock.elapsedRealtime() - jElapsedRealtime < j15;
                        }
                        if (!z4) {
                            break;
                        }
                    }
                    Trace.endSection();
                } else {
                    C2832g c2832g = this.f70993X0;
                    int i13 = c2832g.f11169e;
                    InterfaceC23540z0 interfaceC23540z0 = this.f11085I;
                    interfaceC23540z0.getClass();
                    c2832g.f11169e = i13 + interfaceC23540z0.mo36171j(j7 - this.f11087K);
                    m52536i0(1);
                }
                synchronized (this.f70993X0) {
                }
            }
        } catch (MediaCodec.CryptoException e5) {
            throw m8059g(e5, this.f71000b0, false, AbstractC38065t.m121926s(e5.getErrorCode()));
        } catch (IllegalStateException e13) {
            boolean z15 = e13 instanceof MediaCodec.CodecException;
            if (!z15) {
                StackTraceElement[] stackTrace = e13.getStackTrace();
                if (stackTrace.length <= 0 || !stackTrace[0].getClassName().equals("android.media.MediaCodec")) {
                    throw e13;
                }
            }
            mo31577X(e13);
            if (z15 && ((MediaCodec.CodecException) e13).isRecoverable()) {
                z14 = true;
            }
            if (z14) {
                m52537j0();
            }
            MediaCodecDecoderException mediaCodecDecoderExceptionMo52518E = mo52518E(e13, this.f71016r0);
            throw m8059g(mediaCodecDecoderExceptionMo52518E, this.f71000b0, z14, mediaCodecDecoderExceptionMo52518E.f6393w == 1101 ? 4006 : ErrorCodes.WebrtcErrors.cSetLocalDescriptionFailed);
        }
    }

    @Override // p031b9.AbstractC2829f
    /* JADX INFO: renamed from: z */
    public void mo8077z(float f13, float f14) throws ExoPlaybackException {
        this.f71007i0 = f13;
        this.f71008j0 = f14;
        m52544t0(this.f71010l0);
    }
}
