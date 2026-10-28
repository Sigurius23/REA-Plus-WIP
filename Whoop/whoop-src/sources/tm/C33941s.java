package tm;

import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.media.PlaybackParams;
import android.os.ConditionVariable;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.audio.AudioProcessor$UnhandledAudioFormatException;
import com.google.android.exoplayer2.audio.AudioSink$ConfigurationException;
import com.google.android.exoplayer2.audio.AudioSink$InitializationException;
import com.google.android.exoplayer2.audio.AudioSink$WriteException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import p016an.C1053d;
import p085d9.C11795l;
import p085d9.C11805v;
import p085d9.C11806w;
import p085d9.ExecutorC11804u;
import p085d9.RunnableC11792i;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24555m;
import p309lo.AbstractC24567y;
import p412q3.C29875i;
import p465rm.C31521c0;
import p465rm.C31573v;
import p465rm.C31576w0;
import p550vd.AbstractC35903f;
import p715kotlin.time.DurationKt;
import q30.C29934u0;
import q30.C29938w0;
import q63.AbstractC30007c;
import sm.C32713f;

/* JADX INFO: renamed from: tm.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C33941s {

    /* JADX INFO: renamed from: A */
    public int f142243A;

    /* JADX INFO: renamed from: B */
    public long f142244B;

    /* JADX INFO: renamed from: C */
    public long f142245C;

    /* JADX INFO: renamed from: D */
    public long f142246D;

    /* JADX INFO: renamed from: E */
    public long f142247E;

    /* JADX INFO: renamed from: F */
    public int f142248F;

    /* JADX INFO: renamed from: G */
    public boolean f142249G;

    /* JADX INFO: renamed from: H */
    public boolean f142250H;

    /* JADX INFO: renamed from: I */
    public long f142251I;

    /* JADX INFO: renamed from: J */
    public float f142252J;

    /* JADX INFO: renamed from: K */
    public InterfaceC33930h[] f142253K;

    /* JADX INFO: renamed from: L */
    public ByteBuffer[] f142254L;

    /* JADX INFO: renamed from: M */
    public ByteBuffer f142255M;

    /* JADX INFO: renamed from: N */
    public int f142256N;

    /* JADX INFO: renamed from: O */
    public ByteBuffer f142257O;

    /* JADX INFO: renamed from: P */
    public byte[] f142258P;

    /* JADX INFO: renamed from: Q */
    public int f142259Q;

    /* JADX INFO: renamed from: R */
    public int f142260R;

    /* JADX INFO: renamed from: S */
    public boolean f142261S;

    /* JADX INFO: renamed from: T */
    public boolean f142262T;

    /* JADX INFO: renamed from: U */
    public boolean f142263U;

    /* JADX INFO: renamed from: V */
    public boolean f142264V;

    /* JADX INFO: renamed from: W */
    public int f142265W;

    /* JADX INFO: renamed from: X */
    public C33934l f142266X;

    /* JADX INFO: renamed from: Y */
    public boolean f142267Y;

    /* JADX INFO: renamed from: Z */
    public long f142268Z;

    /* JADX INFO: renamed from: a */
    public final C33928f f142269a;

    /* JADX INFO: renamed from: a0 */
    public boolean f142270a0;

    /* JADX INFO: renamed from: b */
    public final C29938w0 f142271b;

    /* JADX INFO: renamed from: b0 */
    public boolean f142272b0;

    /* JADX INFO: renamed from: c */
    public final boolean f142273c;

    /* JADX INFO: renamed from: d */
    public final C33936n f142274d;

    /* JADX INFO: renamed from: e */
    public final C33923a0 f142275e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC33930h[] f142276f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC33930h[] f142277g;

    /* JADX INFO: renamed from: h */
    public final ConditionVariable f142278h;

    /* JADX INFO: renamed from: i */
    public final C33933k f142279i;

    /* JADX INFO: renamed from: j */
    public final ArrayDeque f142280j;

    /* JADX INFO: renamed from: k */
    public final boolean f142281k;

    /* JADX INFO: renamed from: l */
    public final int f142282l;

    /* JADX INFO: renamed from: m */
    public C11806w f142283m;

    /* JADX INFO: renamed from: n */
    public final C1053d f142284n;

    /* JADX INFO: renamed from: o */
    public final C1053d f142285o;

    /* JADX INFO: renamed from: p */
    public final C33942t f142286p;

    /* JADX INFO: renamed from: q */
    public C32713f f142287q;

    /* JADX INFO: renamed from: r */
    public C29934u0 f142288r;

    /* JADX INFO: renamed from: s */
    public C33939q f142289s;

    /* JADX INFO: renamed from: t */
    public C33939q f142290t;

    /* JADX INFO: renamed from: u */
    public AudioTrack f142291u;

    /* JADX INFO: renamed from: v */
    public C33926d f142292v;

    /* JADX INFO: renamed from: w */
    public C33940r f142293w;

    /* JADX INFO: renamed from: x */
    public C33940r f142294x;

    /* JADX INFO: renamed from: y */
    public C31576w0 f142295y;

    /* JADX INFO: renamed from: z */
    public ByteBuffer f142296z;

    public C33941s(C29938w0 c29938w0) {
        this.f142269a = (C33928f) c29938w0.f122260x;
        C29938w0 c29938w1 = (C29938w0) c29938w0.f122261y;
        this.f142271b = c29938w1;
        int i13 = AbstractC24567y.f95875a;
        this.f142273c = false;
        this.f142281k = false;
        this.f142282l = 0;
        this.f142286p = (C33942t) c29938w0.f122262z;
        this.f142278h = new ConditionVariable(true);
        this.f142279i = new C33933k(new C29934u0(this, 23));
        C33936n c33936n = new C33936n();
        this.f142274d = c33936n;
        C33923a0 c33923a0 = new C33923a0();
        c33923a0.f142159m = AbstractC24567y.f95880f;
        this.f142275e = c33923a0;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C33945w(), c33936n, c33923a0);
        Collections.addAll(arrayList, (InterfaceC33930h[]) c29938w1.f122260x);
        this.f142276f = (InterfaceC33930h[]) arrayList.toArray(new InterfaceC33930h[0]);
        this.f142277g = new InterfaceC33930h[]{new C33943u()};
        this.f142252J = 1.0f;
        this.f142292v = C33926d.f142162G;
        this.f142265W = 0;
        this.f142266X = new C33934l();
        C31576w0 c31576w0 = C31576w0.f130464z;
        this.f142294x = new C33940r(c31576w0, false, 0L, 0L);
        this.f142295y = c31576w0;
        this.f142260R = -1;
        this.f142253K = new InterfaceC33930h[0];
        this.f142254L = new ByteBuffer[0];
        this.f142280j = new ArrayDeque();
        this.f142284n = new C1053d(9);
        this.f142285o = new C1053d(9);
    }

    /* JADX INFO: renamed from: e */
    public static AudioFormat m107353e(int i13, int i14, int i15) {
        return new AudioFormat.Builder().setSampleRate(i13).setChannelMask(i14).setEncoding(i15).build();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00b6  */
    /* JADX INFO: renamed from: f */
    public static Pair m107354f(C31521c0 c31521c0, C33928f c33928f) {
        int i13;
        String str = c31521c0.f130077L;
        str.getClass();
        int iM71608b = AbstractC24555m.m71608b(str, c31521c0.f130074I);
        int i14 = 6;
        if (iM71608b == 5 || iM71608b == 6 || iM71608b == 18 || iM71608b == 17 || iM71608b == 7 || iM71608b == 8 || iM71608b == 14) {
            if (iM71608b == 18 && Arrays.binarySearch(c33928f.f142172a, 18) < 0) {
                iM71608b = 6;
            } else if (iM71608b == 8 && Arrays.binarySearch(c33928f.f142172a, 8) < 0) {
                iM71608b = 7;
            }
            if (Arrays.binarySearch(c33928f.f142172a, iM71608b) < 0) {
                return null;
            }
            if (iM71608b != 18) {
                i13 = c31521c0.f130090Y;
                if (i13 <= c33928f.f142173b) {
                }
            } else if (AbstractC24567y.f95875a >= 29) {
                int i15 = c31521c0.f130091Z;
                if (i15 == -1) {
                    i15 = 48000;
                }
                AudioAttributes audioAttributesBuild = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
                i13 = 8;
                while (true) {
                    if (i13 <= 0) {
                        i13 = 0;
                        break;
                    }
                    if (AudioTrack.isDirectPlaybackSupported(new AudioFormat.Builder().setEncoding(18).setSampleRate(i15).setChannelMask(AbstractC24567y.m71681l(i13)).build(), audioAttributesBuild)) {
                        break;
                    }
                    i13--;
                }
                if (i13 == 0) {
                    Log.w("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                    return null;
                }
            } else {
                i13 = 6;
            }
            int i16 = AbstractC24567y.f95875a;
            if (i16 > 28) {
                i14 = i13;
            } else if (i13 == 7) {
                i14 = 8;
            } else if (i13 != 3 && i13 != 4 && i13 != 5) {
                i14 = i13;
            }
            if (i16 <= 26 && "fugu".equals(AbstractC24567y.f95876b) && i14 == 1) {
                i14 = 2;
            }
            int iM71681l = AbstractC24567y.m71681l(i14);
            if (iM71681l != 0) {
                return Pair.create(Integer.valueOf(iM71608b), Integer.valueOf(iM71681l));
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: o */
    public static boolean m107355o(AudioTrack audioTrack) {
        return AbstractC24567y.f95875a >= 29 && audioTrack.isOffloadedPlayback();
    }

    /* JADX INFO: renamed from: a */
    public final void m107356a(long j7) {
        C31576w0 c31576w0;
        boolean z4;
        boolean zM107373u = m107373u();
        C29938w0 c29938w0 = this.f142271b;
        if (zM107373u) {
            c31576w0 = m107361h().f142239a;
            C33948z c33948z = (C33948z) c29938w0.f122262z;
            float f13 = c31576w0.f130465w;
            if (c33948z.f142345c != f13) {
                c33948z.f142345c = f13;
                c33948z.f142351i = true;
            }
            float f14 = c31576w0.f130466x;
            if (c33948z.f142346d != f14) {
                c33948z.f142346d = f14;
                c33948z.f142351i = true;
            }
        } else {
            c31576w0 = C31576w0.f130464z;
        }
        C31576w0 c31576w1 = c31576w0;
        int i13 = 0;
        if (m107373u()) {
            boolean z13 = m107361h().f142240b;
            ((C33946x) c29938w0.f122261y).f142314m = z13;
            z4 = z13;
        } else {
            z4 = false;
        }
        this.f142280j.add(new C33940r(c31576w1, z4, Math.max(0L, j7), (m107363j() * 1000000) / ((long) this.f142290t.f142234e)));
        InterfaceC33930h[] interfaceC33930hArr = this.f142290t.f142238i;
        ArrayList arrayList = new ArrayList();
        for (InterfaceC33930h interfaceC33930h : interfaceC33930hArr) {
            if (interfaceC33930h.isActive()) {
                arrayList.add(interfaceC33930h);
            } else {
                interfaceC33930h.flush();
            }
        }
        int size = arrayList.size();
        this.f142253K = (InterfaceC33930h[]) arrayList.toArray(new InterfaceC33930h[size]);
        this.f142254L = new ByteBuffer[size];
        while (true) {
            InterfaceC33930h[] interfaceC33930hArr2 = this.f142253K;
            if (i13 >= interfaceC33930hArr2.length) {
                break;
            }
            InterfaceC33930h interfaceC33930h2 = interfaceC33930hArr2[i13];
            interfaceC33930h2.flush();
            this.f142254L[i13] = interfaceC33930h2.mo107334a();
            i13++;
        }
        C29934u0 c29934u0 = this.f142288r;
        if (c29934u0 != null) {
            C29875i c29875i = ((C33944v) c29934u0.f122249x).f142300f1;
            Handler handler = (Handler) c29875i.f122095w;
            if (handler != null) {
                handler.post(new RunnableC11792i(c29875i, z4, 1));
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m107357b(C31521c0 c31521c0, int[] iArr) {
        int i13;
        int iIntValue;
        int i14;
        InterfaceC33930h[] interfaceC33930hArr;
        int i15;
        int i16;
        int iM71677h;
        int[] iArr2;
        String str = c31521c0.f130077L;
        int i17 = c31521c0.f130091Z;
        int i18 = c31521c0.f130090Y;
        int i19 = c31521c0.f130092a0;
        if ("audio/raw".equals(str)) {
            AbstractC24543a.m71569e(AbstractC24567y.m71693x(i19));
            int iM71687r = AbstractC24567y.m71687r(i19, i18);
            InterfaceC33930h[] interfaceC33930hArr2 = (this.f142273c && (i19 == 536870912 || i19 == 805306368 || i19 == 4)) ? this.f142277g : this.f142276f;
            int i24 = c31521c0.f130093b0;
            int i25 = c31521c0.f130094c0;
            C33923a0 c33923a0 = this.f142275e;
            c33923a0.f142155i = i24;
            c33923a0.f142156j = i25;
            if (AbstractC24567y.f95875a < 21 && i18 == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i26 = 0; i26 < 6; i26++) {
                    iArr2[i26] = i26;
                }
            } else {
                iArr2 = iArr;
            }
            this.f142274d.f142226i = iArr2;
            C33929g c33929g = new C33929g(i17, i18, i19);
            for (InterfaceC33930h interfaceC33930h : interfaceC33930hArr2) {
                try {
                    C33929g c33929gMo107346e = interfaceC33930h.mo107346e(c33929g);
                    if (interfaceC33930h.isActive()) {
                        c33929g = c33929gMo107346e;
                    }
                } catch (AudioProcessor$UnhandledAudioFormatException e5) {
                    throw new AudioSink$ConfigurationException(e5, c31521c0);
                }
            }
            int i27 = c33929g.f142177c;
            int i28 = c33929g.f142176b;
            int i29 = c33929g.f142175a;
            iIntValue = AbstractC24567y.m71681l(i28);
            int iM71687r2 = AbstractC24567y.m71687r(i27, i28);
            interfaceC33930hArr = interfaceC33930hArr2;
            i15 = i27;
            i17 = i29;
            i13 = iM71687r2;
            i16 = iM71687r;
            i14 = 0;
        } else {
            InterfaceC33930h[] interfaceC33930hArr3 = new InterfaceC33930h[0];
            i13 = -1;
            if (m107374v(c31521c0, this.f142292v)) {
                String str2 = c31521c0.f130077L;
                str2.getClass();
                int iM71608b = AbstractC24555m.m71608b(str2, c31521c0.f130074I);
                iIntValue = AbstractC24567y.m71681l(i18);
                i16 = -1;
                interfaceC33930hArr = interfaceC33930hArr3;
                i15 = iM71608b;
                i14 = 1;
            } else {
                Pair pairM107354f = m107354f(c31521c0, this.f142269a);
                if (pairM107354f == null) {
                    String strValueOf = String.valueOf(c31521c0);
                    StringBuilder sb4 = new StringBuilder(strValueOf.length() + 37);
                    sb4.append("Unable to configure passthrough for: ");
                    sb4.append(strValueOf);
                    throw new AudioSink$ConfigurationException(sb4.toString(), c31521c0);
                }
                int iIntValue2 = ((Integer) pairM107354f.first).intValue();
                iIntValue = ((Integer) pairM107354f.second).intValue();
                i14 = 2;
                interfaceC33930hArr = interfaceC33930hArr3;
                i15 = iIntValue2;
                i16 = -1;
            }
        }
        int minBufferSize = AudioTrack.getMinBufferSize(i17, iIntValue, i15);
        AbstractC24543a.m71573i(minBufferSize != -2);
        double d3 = this.f142281k ? 8.0d : 1.0d;
        this.f142286p.getClass();
        if (i14 == 0) {
            i16 = i16;
            long j7 = i17;
            long j13 = ((long) 250000) * j7;
            long j14 = i13;
            iM71677h = AbstractC24567y.m71677h(minBufferSize * 4, AbstractC35903f.m114016k((j13 * j14) / 1000000), AbstractC35903f.m114016k(((((long) 750000) * j7) * j14) / 1000000));
        } else if (i14 == 1) {
            iM71677h = AbstractC35903f.m114016k((((long) 50000000) * ((long) C33942t.m107376a(i15))) / 1000000);
        } else {
            if (i14 != 2) {
                throw new IllegalArgumentException();
            }
            iM71677h = AbstractC35903f.m114016k((((long) (i15 == 5 ? 500000 : 250000)) * ((long) C33942t.m107376a(i15))) / 1000000);
        }
        int iMax = (((Math.max(minBufferSize, (int) (((double) iM71677h) * d3)) + i13) - 1) / i13) * i13;
        if (i15 == 0) {
            String strValueOf2 = String.valueOf(c31521c0);
            StringBuilder sb5 = new StringBuilder(strValueOf2.length() + 48);
            sb5.append("Invalid output encoding (mode=");
            sb5.append(i14);
            sb5.append(") for: ");
            sb5.append(strValueOf2);
            throw new AudioSink$ConfigurationException(sb5.toString(), c31521c0);
        }
        if (iIntValue != 0) {
            this.f142270a0 = false;
            C33939q c33939q = new C33939q(c31521c0, i16, i14, i13, i17, iIntValue, i15, iMax, interfaceC33930hArr);
            if (m107367n()) {
                this.f142289s = c33939q;
                return;
            } else {
                this.f142290t = c33939q;
                return;
            }
        }
        String strValueOf3 = String.valueOf(c31521c0);
        StringBuilder sb6 = new StringBuilder(strValueOf3.length() + 54);
        sb6.append("Invalid output channel config (mode=");
        sb6.append(i14);
        sb6.append(") for: ");
        sb6.append(strValueOf3);
        throw new AudioSink$ConfigurationException(sb6.toString(), c31521c0);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: c */
    public final boolean m107358c() {
        /*
            r9 = this;
            int r0 = r9.f142260R
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.f142260R = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.f142260R
            tm.h[] r5 = r9.f142253K
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.mo107345c()
        L1f:
            r9.m107369q(r7)
            boolean r0 = r4.mo107336d()
            if (r0 != 0) goto L29
            goto L3a
        L29:
            int r0 = r9.f142260R
            int r0 = r0 + r1
            r9.f142260R = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.f142257O
            if (r0 == 0) goto L3b
            r9.m107375w(r0, r7)
            java.nio.ByteBuffer r0 = r9.f142257O
            if (r0 == 0) goto L3b
        L3a:
            return r2
        L3b:
            r9.f142260R = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.C33941s.m107358c():boolean");
    }

    /* JADX INFO: renamed from: d */
    public final void m107359d() {
        if (m107367n()) {
            this.f142244B = 0L;
            this.f142245C = 0L;
            this.f142246D = 0L;
            this.f142247E = 0L;
            this.f142272b0 = false;
            this.f142248F = 0;
            this.f142294x = new C33940r(m107361h().f142239a, m107361h().f142240b, 0L, 0L);
            this.f142251I = 0L;
            this.f142293w = null;
            this.f142280j.clear();
            this.f142255M = null;
            this.f142256N = 0;
            this.f142257O = null;
            this.f142262T = false;
            this.f142261S = false;
            this.f142260R = -1;
            this.f142296z = null;
            this.f142243A = 0;
            this.f142275e.f142161o = 0L;
            int i13 = 0;
            while (true) {
                InterfaceC33930h[] interfaceC33930hArr = this.f142253K;
                if (i13 >= interfaceC33930hArr.length) {
                    break;
                }
                InterfaceC33930h interfaceC33930h = interfaceC33930hArr[i13];
                interfaceC33930h.flush();
                this.f142254L[i13] = interfaceC33930h.mo107334a();
                i13++;
            }
            C33933k c33933k = this.f142279i;
            AudioTrack audioTrack = c33933k.f142195c;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.f142291u.pause();
            }
            if (m107355o(this.f142291u)) {
                C11806w c11806w = this.f142283m;
                c11806w.getClass();
                c11806w.m31628a(this.f142291u);
            }
            AudioTrack audioTrack2 = this.f142291u;
            this.f142291u = null;
            if (AbstractC24567y.f95875a < 21 && !this.f142264V) {
                this.f142265W = 0;
            }
            C33939q c33939q = this.f142289s;
            if (c33939q != null) {
                this.f142290t = c33939q;
                this.f142289s = null;
            }
            c33933k.f142204l = 0L;
            c33933k.f142215w = 0;
            c33933k.f142214v = 0;
            c33933k.f142205m = 0L;
            c33933k.f142189C = 0L;
            c33933k.f142192F = 0L;
            c33933k.f142203k = false;
            c33933k.f142195c = null;
            c33933k.f142198f = null;
            this.f142278h.close();
            new C33937o(this, audioTrack2).start();
        }
        this.f142285o.f4099y = null;
        this.f142284n.f4099y = null;
    }

    /* JADX INFO: renamed from: g */
    public final int m107360g(C31521c0 c31521c0) {
        String str = c31521c0.f130077L;
        int i13 = c31521c0.f130092a0;
        if ("audio/raw".equals(str)) {
            if (!AbstractC24567y.m71693x(i13)) {
                AbstractC30007c.m91850t(33, i13, "Invalid PCM encoding: ", "DefaultAudioSink");
                return 0;
            }
            if (i13 != 2 && (!this.f142273c || i13 != 4)) {
                return 1;
            }
        } else if ((this.f142270a0 || !m107374v(c31521c0, this.f142292v)) && m107354f(c31521c0, this.f142269a) == null) {
            return 0;
        }
        return 2;
    }

    /* JADX INFO: renamed from: h */
    public final C33940r m107361h() {
        C33940r c33940r = this.f142293w;
        if (c33940r != null) {
            return c33940r;
        }
        ArrayDeque arrayDeque = this.f142280j;
        return !arrayDeque.isEmpty() ? (C33940r) arrayDeque.getLast() : this.f142294x;
    }

    /* JADX INFO: renamed from: i */
    public final long m107362i() {
        C33939q c33939q = this.f142290t;
        return c33939q.f142232c == 0 ? this.f142244B / ((long) c33939q.f142231b) : this.f142245C;
    }

    /* JADX INFO: renamed from: j */
    public final long m107363j() {
        C33939q c33939q = this.f142290t;
        return c33939q.f142232c == 0 ? this.f142246D / ((long) c33939q.f142233d) : this.f142247E;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01ce A[LOOP:0: B:95:0x01ac->B:103:0x01ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:106:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:107:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:109:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:113:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:114:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:116:0x020d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0211  */
    /* JADX WARN: Code duplicated, block: B:120:0x0224  */
    /* JADX WARN: Code duplicated, block: B:123:0x022e  */
    /* JADX WARN: Code duplicated, block: B:124:0x0231  */
    /* JADX WARN: Code duplicated, block: B:126:0x0237  */
    /* JADX WARN: Code duplicated, block: B:128:0x0241 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0243  */
    /* JADX WARN: Code duplicated, block: B:131:0x0247  */
    /* JADX WARN: Code duplicated, block: B:134:0x025b  */
    /* JADX WARN: Code duplicated, block: B:136:0x026e  */
    /* JADX WARN: Code duplicated, block: B:137:0x027f  */
    /* JADX WARN: Code duplicated, block: B:139:0x0293  */
    /* JADX WARN: Code duplicated, block: B:141:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:144:0x02b3  */
    /* JADX WARN: Code duplicated, block: B:146:0x02c8  */
    /* JADX WARN: Code duplicated, block: B:152:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:155:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:156:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:158:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:163:0x0336  */
    /* JADX WARN: Code duplicated, block: B:166:0x033d  */
    /* JADX WARN: Code duplicated, block: B:168:0x034e  */
    /* JADX WARN: Code duplicated, block: B:173:0x035e  */
    /* JADX WARN: Code duplicated, block: B:174:0x0369  */
    /* JADX WARN: Code duplicated, block: B:176:0x0376  */
    /* JADX WARN: Code duplicated, block: B:178:0x0381  */
    /* JADX WARN: Code duplicated, block: B:180:0x0387  */
    /* JADX WARN: Code duplicated, block: B:182:0x0396  */
    /* JADX WARN: Code duplicated, block: B:189:0x008b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:192:0x01d4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ec A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:73:0x0143  */
    /* JADX WARN: Code duplicated, block: B:76:0x0148  */
    /* JADX WARN: Code duplicated, block: B:78:0x0150  */
    /* JADX WARN: Code duplicated, block: B:79:0x0152  */
    /* JADX WARN: Code duplicated, block: B:83:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0173  */
    /* JADX WARN: Code duplicated, block: B:91:0x0181  */
    /* JADX WARN: Code duplicated, block: B:92:0x019a  */
    /* JADX WARN: Code duplicated, block: B:93:0x019e  */
    /* JADX WARN: Code duplicated, block: B:94:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:99:0x01c1  */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x02cc, code lost:
    
        if (r13 == 0) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00f9, code lost:
    
        if (r10.m107347a() == 0) goto L12;
     */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean m107364k(java.nio.ByteBuffer r26, long r27, int r29) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: tm.C33941s.m107364k(java.nio.ByteBuffer, long, int):boolean");
    }

    /* JADX INFO: renamed from: l */
    public final boolean m107365l() {
        return m107367n() && this.f142279i.m107348b(m107363j());
    }

    /* JADX WARN: Code duplicated, block: B:69:0x0142  */
    /* JADX WARN: Code duplicated, block: B:77:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: m */
    public final void m107366m() throws AudioSink$InitializationException {
        AudioTrack audioTrackM107351a;
        C32713f c32713f;
        this.f142278h.block();
        try {
            C33939q c33939q = this.f142290t;
            c33939q.getClass();
            try {
                audioTrackM107351a = c33939q.m107351a(this.f142267Y, this.f142292v, this.f142265W);
            } catch (AudioSink$InitializationException e5) {
                C29934u0 c29934u0 = this.f142288r;
                if (c29934u0 != null) {
                    c29934u0.m91528D(e5);
                }
                throw e5;
            }
        } catch (AudioSink$InitializationException e13) {
            C33939q c33939q2 = this.f142290t;
            if (c33939q2.f142237h > 1000000) {
                C33939q c33939q3 = new C33939q(c33939q2.f142230a, c33939q2.f142231b, c33939q2.f142232c, c33939q2.f142233d, c33939q2.f142234e, c33939q2.f142235f, c33939q2.f142236g, DurationKt.NANOS_IN_MILLIS, c33939q2.f142238i);
                try {
                    try {
                        audioTrackM107351a = c33939q3.m107351a(this.f142267Y, this.f142292v, this.f142265W);
                        this.f142290t = c33939q3;
                    } catch (AudioSink$InitializationException e14) {
                        e13.addSuppressed(e14);
                        if (this.f142290t.f142232c == 1) {
                            throw e13;
                        }
                        this.f142270a0 = true;
                        throw e13;
                    }
                } catch (AudioSink$InitializationException e15) {
                    C29934u0 c29934u1 = this.f142288r;
                    if (c29934u1 != null) {
                        c29934u1.m91528D(e15);
                    }
                    throw e15;
                }
            }
            if (this.f142290t.f142232c == 1) {
                throw e13;
            }
            this.f142270a0 = true;
            throw e13;
        }
        this.f142291u = audioTrackM107351a;
        if (m107355o(audioTrackM107351a)) {
            AudioTrack audioTrack = this.f142291u;
            if (this.f142283m == null) {
                this.f142283m = new C11806w(this);
            }
            C11806w c11806w = this.f142283m;
            Handler handler = c11806w.f38331b;
            Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new ExecutorC11804u(handler), (C11805v) c11806w.f38332c);
            if (this.f142282l != 3) {
                AudioTrack audioTrack2 = this.f142291u;
                C31521c0 c31521c0 = this.f142290t.f142230a;
                audioTrack2.setOffloadDelayPadding(c31521c0.f130093b0, c31521c0.f130094c0);
            }
        }
        int i13 = AbstractC24567y.f95875a;
        if (i13 >= 31 && (c32713f = this.f142287q) != null) {
            AbstractC33938p.m107350a(this.f142291u, c32713f);
        }
        this.f142265W = this.f142291u.getAudioSessionId();
        AudioTrack audioTrack3 = this.f142291u;
        C33939q c33939q4 = this.f142290t;
        boolean z4 = c33939q4.f142232c == 2;
        int i14 = c33939q4.f142236g;
        int i15 = c33939q4.f142233d;
        int i16 = c33939q4.f142237h;
        C33933k c33933k = this.f142279i;
        c33933k.f142195c = audioTrack3;
        c33933k.f142196d = i15;
        c33933k.f142197e = i16;
        c33933k.f142198f = new C11795l(audioTrack3, 1);
        c33933k.f142199g = audioTrack3.getSampleRate();
        c33933k.f142200h = z4 && i13 < 23 && (i14 == 5 || i14 == 6);
        boolean zM71693x = AbstractC24567y.m71693x(i14);
        c33933k.f142209q = zM71693x;
        c33933k.f142201i = zM71693x ? (((long) (i16 / i15)) * 1000000) / ((long) c33933k.f142199g) : -9223372036854775807L;
        c33933k.f142211s = 0L;
        c33933k.f142212t = 0L;
        c33933k.f142213u = 0L;
        c33933k.f142208p = false;
        c33933k.f142216x = -9223372036854775807L;
        c33933k.f142217y = -9223372036854775807L;
        c33933k.f142210r = 0L;
        c33933k.f142207o = 0L;
        c33933k.f142202j = 1.0f;
        if (m107367n()) {
            if (i13 >= 21) {
                this.f142291u.setVolume(this.f142252J);
            } else {
                AudioTrack audioTrack4 = this.f142291u;
                float f13 = this.f142252J;
                audioTrack4.setStereoVolume(f13, f13);
            }
        }
        this.f142266X.getClass();
        this.f142250H = true;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m107367n() {
        return this.f142291u != null;
    }

    /* JADX INFO: renamed from: p */
    public final void m107368p() {
        if (this.f142262T) {
            return;
        }
        this.f142262T = true;
        long jM107363j = m107363j();
        C33933k c33933k = this.f142279i;
        c33933k.f142218z = c33933k.m107347a();
        c33933k.f142216x = SystemClock.elapsedRealtime() * 1000;
        c33933k.f142187A = jM107363j;
        this.f142291u.stop();
        this.f142243A = 0;
    }

    /* JADX INFO: renamed from: q */
    public final void m107369q(long j7) throws Exception {
        ByteBuffer byteBuffer;
        int length = this.f142253K.length;
        int i13 = length;
        while (i13 >= 0) {
            if (i13 > 0) {
                byteBuffer = this.f142254L[i13 - 1];
            } else {
                byteBuffer = this.f142255M;
                if (byteBuffer == null) {
                    byteBuffer = InterfaceC33930h.f142179a;
                }
            }
            if (i13 == length) {
                m107375w(byteBuffer, j7);
            } else {
                InterfaceC33930h interfaceC33930h = this.f142253K[i13];
                if (i13 > this.f142260R) {
                    interfaceC33930h.mo107335b(byteBuffer);
                }
                ByteBuffer byteBufferMo107334a = interfaceC33930h.mo107334a();
                this.f142254L[i13] = byteBufferMo107334a;
                if (byteBufferMo107334a.hasRemaining()) {
                    i13++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i13--;
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m107370r() {
        m107359d();
        for (InterfaceC33930h interfaceC33930h : this.f142276f) {
            interfaceC33930h.reset();
        }
        for (InterfaceC33930h interfaceC33930h2 : this.f142277g) {
            interfaceC33930h2.reset();
        }
        this.f142263U = false;
        this.f142270a0 = false;
    }

    /* JADX INFO: renamed from: s */
    public final void m107371s(C31576w0 c31576w0, boolean z4) {
        C33940r c33940rM107361h = m107361h();
        if (c31576w0.equals(c33940rM107361h.f142239a) && z4 == c33940rM107361h.f142240b) {
            return;
        }
        C33940r c33940r = new C33940r(c31576w0, z4, -9223372036854775807L, -9223372036854775807L);
        if (m107367n()) {
            this.f142293w = c33940r;
        } else {
            this.f142294x = c33940r;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m107372t(C31576w0 c31576w0) {
        if (m107367n()) {
            try {
                this.f142291u.setPlaybackParams(new PlaybackParams().allowDefaults().setSpeed(c31576w0.f130465w).setPitch(c31576w0.f130466x).setAudioFallbackMode(2));
            } catch (IllegalArgumentException e5) {
                AbstractC24543a.m71564F("DefaultAudioSink", "Failed to set playback params", e5);
            }
            c31576w0 = new C31576w0(this.f142291u.getPlaybackParams().getSpeed(), this.f142291u.getPlaybackParams().getPitch());
            float f13 = c31576w0.f130465w;
            C33933k c33933k = this.f142279i;
            c33933k.f142202j = f13;
            C11795l c11795l = c33933k.f142198f;
            if (c11795l != null) {
                c11795l.m31610a();
            }
        }
        this.f142295y = c31576w0;
    }

    /* JADX INFO: renamed from: u */
    public final boolean m107373u() {
        if (this.f142267Y || !"audio/raw".equals(this.f142290t.f142230a.f130077L)) {
            return false;
        }
        int i13 = this.f142290t.f142230a.f130092a0;
        if (!this.f142273c) {
            return true;
        }
        int i14 = AbstractC24567y.f95875a;
        return (i13 == 536870912 || i13 == 805306368 || i13 == 4) ? false : true;
    }

    /* JADX INFO: renamed from: v */
    public final boolean m107374v(C31521c0 c31521c0, C33926d c33926d) {
        int i13;
        int iM71681l;
        int playbackOffloadSupport;
        int i14 = AbstractC24567y.f95875a;
        if (i14 >= 29 && (i13 = this.f142282l) != 0) {
            String str = c31521c0.f130077L;
            str.getClass();
            int iM71608b = AbstractC24555m.m71608b(str, c31521c0.f130074I);
            if (iM71608b == 0 || (iM71681l = AbstractC24567y.m71681l(c31521c0.f130090Y)) == 0) {
                return false;
            }
            AudioFormat audioFormatM107353e = m107353e(c31521c0.f130091Z, iM71681l, iM71608b);
            AudioAttributes audioAttributesM107343a = c33926d.m107343a();
            if (i14 >= 31) {
                playbackOffloadSupport = AudioManager.getPlaybackOffloadSupport(audioFormatM107353e, audioAttributesM107343a);
            } else if (AudioManager.isOffloadedPlaybackSupported(audioFormatM107353e, audioAttributesM107343a)) {
                playbackOffloadSupport = (i14 == 30 && AbstractC24567y.f95878d.startsWith("Pixel")) ? 2 : 1;
            } else {
                playbackOffloadSupport = 0;
            }
            if (playbackOffloadSupport != 0) {
                if (playbackOffloadSupport == 1) {
                    return ((c31521c0.f130093b0 != 0 || c31521c0.f130094c0 != 0) && (i13 == 1)) ? false : true;
                }
                if (playbackOffloadSupport == 2) {
                    return true;
                }
                throw new IllegalStateException();
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: w */
    public final void m107375w(ByteBuffer byteBuffer, long j7) throws Exception {
        ByteBuffer byteBuffer2;
        int iWrite;
        int iWrite2;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.f142257O;
            if (byteBuffer3 != null) {
                AbstractC24543a.m71569e(byteBuffer3 == byteBuffer);
            } else {
                this.f142257O = byteBuffer;
                if (AbstractC24567y.f95875a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.f142258P;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.f142258P = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.f142258P, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.f142259Q = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            int i13 = AbstractC24567y.f95875a;
            C33933k c33933k = this.f142279i;
            if (i13 < 21) {
                int iM107347a = c33933k.f142197e - ((int) (this.f142246D - (c33933k.m107347a() * ((long) c33933k.f142196d))));
                if (iM107347a > 0) {
                    iWrite = this.f142291u.write(this.f142258P, this.f142259Q, Math.min(iRemaining2, iM107347a));
                    if (iWrite > 0) {
                        this.f142259Q += iWrite;
                        byteBuffer.position(byteBuffer.position() + iWrite);
                    }
                } else {
                    iWrite = 0;
                }
                byteBuffer2 = byteBuffer;
            } else if (this.f142267Y) {
                AbstractC24543a.m71573i(j7 != -9223372036854775807L);
                AudioTrack audioTrack = this.f142291u;
                if (i13 >= 26) {
                    byteBuffer2 = byteBuffer;
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1, 1000 * j7);
                } else {
                    byteBuffer2 = byteBuffer;
                    if (this.f142296z == null) {
                        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16);
                        this.f142296z = byteBufferAllocate;
                        byteBufferAllocate.order(ByteOrder.BIG_ENDIAN);
                        this.f142296z.putInt(1431633921);
                    }
                    if (this.f142243A == 0) {
                        this.f142296z.putInt(4, iRemaining2);
                        this.f142296z.putLong(8, j7 * 1000);
                        this.f142296z.position(0);
                        this.f142243A = iRemaining2;
                    }
                    int iRemaining3 = this.f142296z.remaining();
                    if (iRemaining3 > 0) {
                        iWrite = audioTrack.write(this.f142296z, iRemaining3, 1);
                        if (iWrite < 0) {
                            this.f142243A = 0;
                        } else if (iWrite < iRemaining3) {
                            iWrite = 0;
                        }
                    }
                    iWrite2 = audioTrack.write(byteBuffer2, iRemaining2, 1);
                    if (iWrite2 < 0) {
                        this.f142243A = 0;
                    } else {
                        this.f142243A -= iWrite2;
                    }
                }
                iWrite = iWrite2;
            } else {
                byteBuffer2 = byteBuffer;
                iWrite = this.f142291u.write(byteBuffer2, iRemaining2, 1);
            }
            this.f142268Z = SystemClock.elapsedRealtime();
            C1053d c1053d = this.f142285o;
            if (iWrite < 0) {
                boolean z4 = (i13 >= 24 && iWrite == -6) || iWrite == -32;
                if (z4 && this.f142290t.f142232c == 1) {
                    this.f142270a0 = true;
                }
                AudioSink$WriteException audioSink$WriteException = new AudioSink$WriteException(iWrite, this.f142290t.f142230a, z4);
                C29934u0 c29934u0 = this.f142288r;
                if (c29934u0 != null) {
                    c29934u0.m91528D(audioSink$WriteException);
                }
                if (audioSink$WriteException.f20379w) {
                    throw audioSink$WriteException;
                }
                c1053d.m3090O(audioSink$WriteException);
                return;
            }
            c1053d.f4099y = null;
            if (m107355o(this.f142291u)) {
                long j13 = this.f142247E;
                if (j13 > 0) {
                    this.f142272b0 = false;
                }
                if (this.f142263U && this.f142288r != null && iWrite < iRemaining2 && !this.f142272b0) {
                    long jM71669G = AbstractC24567y.m71669G(((j13 - c33933k.m107347a()) * 1000000) / ((long) c33933k.f142199g));
                    C31573v c31573v = ((C33944v) this.f142288r.f122249x).f142309o1;
                    if (c31573v != null && jM71669G >= 2000) {
                        c31573v.f130439a.f130508g0 = true;
                    }
                }
            }
            int i14 = this.f142290t.f142232c;
            if (i14 == 0) {
                this.f142246D += (long) iWrite;
            }
            if (iWrite == iRemaining2) {
                if (i14 != 0) {
                    AbstractC24543a.m71573i(byteBuffer2 == this.f142255M);
                    this.f142247E += (long) (this.f142248F * this.f142256N);
                }
                this.f142257O = null;
            }
        }
    }
}
