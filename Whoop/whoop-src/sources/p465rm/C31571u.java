package p465rm;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import android.util.SparseBooleanArray;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.TextureView;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.ExoTimeoutException;
import com.google.android.exoplayer2.IllegalSeekPositionException;
import in.C18715c;
import in.InterfaceC18714b;
import io.AbstractC20038r;
import io.C18744f;
import io.C18745g;
import io.C20033m;
import io.C20039s;
import io.C20711w;
import io.C20712x;
import io.InterfaceC20035o;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import lr.RunnableC24693e;
import mm.C25680d;
import mo.C25737r;
import ng3.C26701n;
import ng3.C26702o;
import no.C26880m;
import p004a2.AbstractC0152a;
import p031b9.AbstractC2875y;
import p031b9.C2852m1;
import p031b9.C2853n;
import p031b9.C2863s;
import p031b9.C2865t;
import p031b9.C2869v;
import p031b9.C2873x;
import p085d9.C11787e;
import p085d9.C11799p;
import p133f1.C13968p1;
import p284ko.C22610c;
import p284ko.C22612d;
import p284ko.C22633q;
import p284ko.InterfaceC22614e;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24547e;
import p309lo.C24548f;
import p309lo.C24552j;
import p309lo.C24562t;
import p309lo.C24563u;
import p309lo.C24564v;
import p309lo.InterfaceC24550h;
import p309lo.InterfaceC24551i;
import p412q3.C29875i;
import p450r5.RunnableC30928b;
import p497t7.InterfaceC33561b;
import p690zr.AbstractC41023g0;
import p690zr.C41017e0;
import p690zr.C41060w0;
import q30.C29934u0;
import q63.AbstractC30007c;
import qa.C30097b;
import qm2.C30486c;
import sm.C32708a;
import sm.C32709b;
import sm.C32711d;
import sm.C32713f;
import sn.C32762u0;
import sn.C32763v;
import sn.C32768x0;
import sn.InterfaceC32761u;
import tm.C33926d;

/* JADX INFO: renamed from: rm.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C31571u extends AbstractC0152a implements InterfaceC31544k {

    /* JADX INFO: renamed from: A0 */
    public final int f130375A0;

    /* JADX INFO: renamed from: B0 */
    public final C33926d f130376B0;

    /* JADX INFO: renamed from: C0 */
    public final float f130377C0;

    /* JADX INFO: renamed from: D0 */
    public boolean f130378D0;

    /* JADX INFO: renamed from: E */
    public final C2852m1 f130379E;

    /* JADX INFO: renamed from: E0 */
    public List f130380E0;

    /* JADX INFO: renamed from: F */
    public final Context f130381F;

    /* JADX INFO: renamed from: F0 */
    public final boolean f130382F0;

    /* JADX INFO: renamed from: G */
    public final C31571u f130383G;

    /* JADX INFO: renamed from: G0 */
    public boolean f130384G0;

    /* JADX INFO: renamed from: H */
    public final AbstractC31523d[] f130385H;

    /* JADX INFO: renamed from: H0 */
    public final C31538i f130386H0;

    /* JADX INFO: renamed from: I */
    public final AbstractC20038r f130387I;

    /* JADX INFO: renamed from: I0 */
    public C25737r f130388I0;

    /* JADX INFO: renamed from: J */
    public final C24564v f130389J;

    /* JADX INFO: renamed from: J0 */
    public C31551m0 f130390J0;

    /* JADX INFO: renamed from: K */
    public final C31550m f130391K;

    /* JADX INFO: renamed from: K0 */
    public C31574v0 f130392K0;

    /* JADX INFO: renamed from: L */
    public final C31581z f130393L;

    /* JADX INFO: renamed from: L0 */
    public int f130394L0;

    /* JADX INFO: renamed from: M */
    public final C11799p f130395M;

    /* JADX INFO: renamed from: M0 */
    public long f130396M0;

    /* JADX INFO: renamed from: N */
    public final CopyOnWriteArraySet f130397N;

    /* JADX INFO: renamed from: O */
    public final C31552m1 f130398O;

    /* JADX INFO: renamed from: P */
    public final ArrayList f130399P;

    /* JADX INFO: renamed from: Q */
    public final boolean f130400Q;

    /* JADX INFO: renamed from: R */
    public final InterfaceC32761u f130401R;

    /* JADX INFO: renamed from: S */
    public final C32711d f130402S;

    /* JADX INFO: renamed from: T */
    public final Looper f130403T;

    /* JADX INFO: renamed from: U */
    public final InterfaceC22614e f130404U;

    /* JADX INFO: renamed from: V */
    public final long f130405V;

    /* JADX INFO: renamed from: W */
    public final long f130406W;

    /* JADX INFO: renamed from: X */
    public final C24562t f130407X;

    /* JADX INFO: renamed from: Y */
    public final SurfaceHolderCallbackC31565r f130408Y;

    /* JADX INFO: renamed from: Z */
    public final C31567s f130409Z;

    /* JADX INFO: renamed from: a0 */
    public final C13968p1 f130410a0;

    /* JADX INFO: renamed from: b0 */
    public final C31520c f130411b0;

    /* JADX INFO: renamed from: c0 */
    public final C31543j1 f130412c0;

    /* JADX INFO: renamed from: d0 */
    public final C26701n f130413d0;

    /* JADX INFO: renamed from: e0 */
    public final C26702o f130414e0;

    /* JADX INFO: renamed from: f0 */
    public final long f130415f0;

    /* JADX INFO: renamed from: g0 */
    public int f130416g0;

    /* JADX INFO: renamed from: h0 */
    public boolean f130417h0;

    /* JADX INFO: renamed from: i0 */
    public int f130418i0;

    /* JADX INFO: renamed from: j0 */
    public int f130419j0;

    /* JADX INFO: renamed from: k0 */
    public boolean f130420k0;

    /* JADX INFO: renamed from: l0 */
    public int f130421l0;

    /* JADX INFO: renamed from: m0 */
    public final C31537h1 f130422m0;

    /* JADX INFO: renamed from: n0 */
    public C32762u0 f130423n0;

    /* JADX INFO: renamed from: o0 */
    public C31578x0 f130424o0;

    /* JADX INFO: renamed from: p0 */
    public C31551m0 f130425p0;

    /* JADX INFO: renamed from: q0 */
    public AudioTrack f130426q0;

    /* JADX INFO: renamed from: r0 */
    public Object f130427r0;

    /* JADX INFO: renamed from: s0 */
    public Surface f130428s0;

    /* JADX INFO: renamed from: t0 */
    public SurfaceHolder f130429t0;

    /* JADX INFO: renamed from: u0 */
    public C26880m f130430u0;

    /* JADX INFO: renamed from: v0 */
    public boolean f130431v0;

    /* JADX INFO: renamed from: w0 */
    public TextureView f130432w0;

    /* JADX INFO: renamed from: x0 */
    public final int f130433x0;

    /* JADX INFO: renamed from: y */
    public final C20712x f130434y;

    /* JADX INFO: renamed from: y0 */
    public int f130435y0;

    /* JADX INFO: renamed from: z */
    public final C31578x0 f130436z;

    /* JADX INFO: renamed from: z0 */
    public int f130437z0;

    static {
        AbstractC31515a0.m97109a("goog.exo.exoplayer");
    }

    public C31571u(C31541j c31541j) {
        super(6);
        this.f130379E = new C2852m1(2);
        try {
            String hexString = Integer.toHexString(System.identityHashCode(this));
            String str = AbstractC24567y.f95879e;
            StringBuilder sb4 = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
            sb4.append("Init ");
            sb4.append(hexString);
            sb4.append(" [ExoPlayerLib/2.17.1] [");
            sb4.append(str);
            sb4.append("]");
            Log.i("ExoPlayerImpl", sb4.toString());
            Context context = c31541j.f130178a;
            Looper looper = c31541j.f130184g;
            C24562t c24562t = c31541j.f130179b;
            this.f130381F = context.getApplicationContext();
            this.f130402S = new C32711d(c24562t);
            this.f130376B0 = c31541j.f130185h;
            this.f130433x0 = c31541j.f130186i;
            this.f130378D0 = false;
            this.f130415f0 = c31541j.f130193p;
            SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = new SurfaceHolderCallbackC31565r(this);
            this.f130408Y = surfaceHolderCallbackC31565r;
            this.f130409Z = new C31567s();
            Handler handler = new Handler(looper);
            AbstractC31523d[] abstractC31523dArrM91497e = ((C29875i) c31541j.f130180c.get()).m91497e(handler, surfaceHolderCallbackC31565r, surfaceHolderCallbackC31565r, surfaceHolderCallbackC31565r, surfaceHolderCallbackC31565r);
            this.f130385H = abstractC31523dArrM91497e;
            AbstractC24543a.m71573i(abstractC31523dArrM91497e.length > 0);
            this.f130387I = (AbstractC20038r) c31541j.f130182e.get();
            this.f130401R = (InterfaceC32761u) c31541j.f130181d.get();
            this.f130404U = (InterfaceC22614e) c31541j.f130183f.get();
            this.f130400Q = c31541j.f130187j;
            this.f130422m0 = c31541j.f130188k;
            this.f130405V = c31541j.f130189l;
            this.f130406W = c31541j.f130190m;
            this.f130403T = looper;
            this.f130407X = c24562t;
            this.f130383G = this;
            this.f130395M = new C11799p(looper, c24562t, new C30097b(this));
            this.f130397N = new CopyOnWriteArraySet();
            this.f130399P = new ArrayList();
            this.f130423n0 = new C32762u0();
            this.f130434y = new C20712x(new C31534g1[abstractC31523dArrM91497e.length], new InterfaceC20035o[abstractC31523dArrM91497e.length], C31564q1.f130357x, null);
            this.f130398O = new C31552m1();
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            int[] iArr = {1, 2, 3, 13, 14, 15, 16, 17, 18, 19, 20, 30, 21, 22, 23, 24, 25, 26, 27, 28};
            for (int i13 = 0; i13 < 20; i13++) {
                int i14 = iArr[i13];
                AbstractC24543a.m71573i(!false);
                sparseBooleanArray.append(i14, true);
            }
            this.f130387I.getClass();
            AbstractC24543a.m71573i(!false);
            sparseBooleanArray.append(29, true);
            AbstractC24543a.m71573i(!false);
            C24548f c24548f = new C24548f(sparseBooleanArray);
            this.f130436z = new C31578x0(c24548f);
            SparseBooleanArray sparseBooleanArray2 = new SparseBooleanArray();
            for (int i15 = 0; i15 < c24548f.f95817a.size(); i15++) {
                int iM71595a = c24548f.m71595a(i15);
                AbstractC24543a.m71573i(!false);
                sparseBooleanArray2.append(iM71595a, true);
            }
            AbstractC24543a.m71573i(!false);
            sparseBooleanArray2.append(4, true);
            AbstractC24543a.m71573i(!false);
            sparseBooleanArray2.append(10, true);
            AbstractC24543a.m71573i(!false);
            this.f130424o0 = new C31578x0(new C24548f(sparseBooleanArray2));
            this.f130389J = this.f130407X.m71645a(this.f130403T, null);
            C31550m c31550m = new C31550m(this);
            this.f130391K = c31550m;
            this.f130392K0 = C31574v0.m97232i(this.f130434y);
            this.f130402S.m102662B(this.f130383G, this.f130403T);
            int i16 = AbstractC24567y.f95875a;
            this.f130393L = new C31581z(this.f130385H, this.f130387I, this.f130434y, new C31535h(), this.f130404U, this.f130416g0, this.f130417h0, this.f130402S, this.f130422m0, c31541j.f130191n, c31541j.f130192o, this.f130403T, this.f130407X, c31550m, i16 < 31 ? new C32713f() : AbstractC31556o.m97168a());
            this.f130377C0 = 1.0f;
            this.f130416g0 = 0;
            C31551m0 c31551m0 = C31551m0.f130246h0;
            this.f130425p0 = c31551m0;
            this.f130390J0 = c31551m0;
            int iGenerateAudioSessionId = -1;
            this.f130394L0 = -1;
            if (i16 < 21) {
                AudioTrack audioTrack = this.f130426q0;
                if (audioTrack != null && audioTrack.getAudioSessionId() != 0) {
                    this.f130426q0.release();
                    this.f130426q0 = null;
                }
                if (this.f130426q0 == null) {
                    this.f130426q0 = new AudioTrack(3, 4000, 4, 2, 2, 0, 0);
                }
                this.f130375A0 = this.f130426q0.getAudioSessionId();
            } else {
                AudioManager audioManager = (AudioManager) this.f130381F.getSystemService("audio");
                if (audioManager != null) {
                    iGenerateAudioSessionId = audioManager.generateAudioSessionId();
                }
                this.f130375A0 = iGenerateAudioSessionId;
            }
            this.f130380E0 = C41060w0.f177067E;
            this.f130382F0 = true;
            m97199Q(this.f130402S);
            InterfaceC22614e interfaceC22614e = this.f130404U;
            Handler handler2 = new Handler(this.f130403T);
            C32711d c32711d = this.f130402S;
            C22633q c22633q = (C22633q) interfaceC22614e;
            c22633q.getClass();
            c32711d.getClass();
            C22612d c22612d = c22633q.f89042b;
            c22612d.getClass();
            CopyOnWriteArrayList<C22610c> copyOnWriteArrayList = c22612d.f88960a;
            for (C22610c c22610c : copyOnWriteArrayList) {
                if (c22610c.f88952b == c32711d) {
                    c22610c.f88953c = true;
                    copyOnWriteArrayList.remove(c22610c);
                }
            }
            copyOnWriteArrayList.add(new C22610c(handler2, c32711d));
            this.f130397N.add(this.f130408Y);
            C13968p1 c13968p1 = new C13968p1(context, handler, this.f130408Y);
            this.f130410a0 = c13968p1;
            c13968p1.m39763u();
            this.f130411b0 = new C31520c(context, handler, this.f130408Y);
            int i17 = AbstractC24567y.f95875a;
            C31543j1 c31543j1 = new C31543j1(context, handler, this.f130408Y);
            this.f130412c0 = c31543j1;
            int iM71689t = AbstractC24567y.m71689t(this.f130376B0.f142167y);
            if (c31543j1.f130196b != iM71689t) {
                c31543j1.f130196b = iM71689t;
                c31543j1.m97147d();
                C31571u c31571u = ((SurfaceHolderCallbackC31565r) c31543j1.f130200f).f130359w;
                C31538i c31538iM97194T = m97194T(c31571u.f130412c0);
                if (!c31538iM97194T.equals(c31571u.f130386H0)) {
                    c31571u.f130386H0 = c31538iM97194T;
                    c31571u.f130395M.m31625i(29, new C31559p(c31538iM97194T, 2));
                }
            }
            int i18 = 23;
            C26701n c26701n = new C26701n(i18);
            this.f130413d0 = c26701n;
            C26702o c26702o = new C26702o(i18, false);
            this.f130414e0 = c26702o;
            this.f130386H0 = m97194T(c31543j1);
            this.f130388I0 = C25737r.f101428E;
            m97223r0(1, 10, Integer.valueOf(this.f130375A0));
            m97223r0(2, 10, Integer.valueOf(this.f130375A0));
            m97223r0(1, 3, this.f130376B0);
            m97223r0(2, 4, Integer.valueOf(this.f130433x0));
            m97223r0(2, 5, 0);
            m97223r0(1, 9, Boolean.valueOf(this.f130378D0));
            m97223r0(2, 7, this.f130409Z);
            m97223r0(6, 8, this.f130409Z);
        } finally {
            this.f130379E.m8248c();
        }
    }

    /* JADX INFO: renamed from: T */
    public static C31538i m97194T(C31543j1 c31543j1) {
        c31543j1.getClass();
        AudioManager audioManager = (AudioManager) c31543j1.f130201g;
        return new C31538i(0, AbstractC24567y.f95875a >= 28 ? audioManager.getStreamMinVolume(c31543j1.f130196b) : 0, audioManager.getStreamMaxVolume(c31543j1.f130196b));
    }

    /* JADX INFO: renamed from: f0 */
    public static long m97195f0(C31574v0 c31574v0) {
        C31555n1 c31555n1 = new C31555n1();
        C31552m1 c31552m1 = new C31552m1();
        c31574v0.f130441a.mo97132g(c31574v0.f130442b.f136238a, c31552m1);
        long j7 = c31574v0.f130443c;
        return j7 == -9223372036854775807L ? c31574v0.f130441a.mo97136m(c31552m1.f130286y, c31555n1, 0L).f130317M : c31552m1.f130281E + j7;
    }

    /* JADX INFO: renamed from: h0 */
    public static boolean m97196h0(C31574v0 c31574v0) {
        return c31574v0.f130445e == 3 && c31574v0.f130452l && c31574v0.f130453m == 0;
    }

    /* JADX INFO: renamed from: A0 */
    public final void m97197A0() {
        int iM97212e0 = m97212e0();
        C26702o c26702o = this.f130414e0;
        C26701n c26701n = this.f130413d0;
        if (iM97212e0 != 1) {
            if (iM97212e0 == 2 || iM97212e0 == 3) {
                m97198B0();
                boolean z4 = this.f130392K0.f130456p;
                m97211d0();
                c26701n.getClass();
                m97211d0();
                c26702o.getClass();
                return;
            }
            if (iM97212e0 != 4) {
                throw new IllegalStateException();
            }
        }
        c26701n.getClass();
        c26702o.getClass();
    }

    /* JADX INFO: renamed from: B0 */
    public final void m97198B0() {
        C2852m1 c2852m1 = this.f130379E;
        synchronized (c2852m1) {
            boolean z4 = false;
            while (!c2852m1.f11320x) {
                try {
                    c2852m1.wait();
                } catch (InterruptedException unused) {
                    z4 = true;
                }
            }
            if (z4) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread() != this.f130403T.getThread()) {
            String name = Thread.currentThread().getName();
            String name2 = this.f130403T.getThread().getName();
            int i13 = AbstractC24567y.f95875a;
            Locale locale = Locale.US;
            String strM8300m = AbstractC2875y.m8300m("Player is accessed on the wrong thread.\nCurrent thread: '", name, "'\nExpected thread: '", name2, "'\nSee https://exoplayer.dev/issues/player-accessed-on-wrong-thread");
            if (this.f130382F0) {
                throw new IllegalStateException(strM8300m);
            }
            AbstractC24543a.m71564F("ExoPlayerImpl", strM8300m, this.f130384G0 ? null : new IllegalStateException());
            this.f130384G0 = true;
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m97199Q(InterfaceC31582z0 interfaceC31582z0) {
        interfaceC31582z0.getClass();
        C11799p c11799p = this.f130395M;
        if (c11799p.f38300a) {
            return;
        }
        ((CopyOnWriteArraySet) c11799p.f38304e).add(new C24552j(interfaceC31582z0));
    }

    /* JADX INFO: renamed from: R */
    public final C31551m0 m97200R() {
        AbstractC31558o1 abstractC31558o1M97209b0 = m97209b0();
        if (abstractC31558o1M97209b0.m97175p()) {
            return this.f130390J0;
        }
        C31545k0 c31545k0 = abstractC31558o1M97209b0.mo97136m(m97206Y(), (C31555n1) this.f475x, 0L).f130324y;
        C31548l0 c31548l0M97149a = this.f130390J0.m97149a();
        C31551m0 c31551m0 = c31545k0.f130208z;
        if (c31551m0 != null) {
            CharSequence charSequence = c31551m0.f130277w;
            if (charSequence != null) {
                c31548l0M97149a.f130219a = charSequence;
            }
            CharSequence charSequence2 = c31551m0.f130278x;
            if (charSequence2 != null) {
                c31548l0M97149a.f130220b = charSequence2;
            }
            CharSequence charSequence3 = c31551m0.f130279y;
            if (charSequence3 != null) {
                c31548l0M97149a.f130221c = charSequence3;
            }
            CharSequence charSequence4 = c31551m0.f130280z;
            if (charSequence4 != null) {
                c31548l0M97149a.f130222d = charSequence4;
            }
            CharSequence charSequence5 = c31551m0.f130248E;
            if (charSequence5 != null) {
                c31548l0M97149a.f130223e = charSequence5;
            }
            CharSequence charSequence6 = c31551m0.f130249F;
            if (charSequence6 != null) {
                c31548l0M97149a.f130224f = charSequence6;
            }
            CharSequence charSequence7 = c31551m0.f130250G;
            if (charSequence7 != null) {
                c31548l0M97149a.f130225g = charSequence7;
            }
            Uri uri = c31551m0.f130251H;
            if (uri != null) {
                c31548l0M97149a.f130226h = uri;
            }
            AbstractC31531f1 abstractC31531f1 = c31551m0.f130252I;
            if (abstractC31531f1 != null) {
                c31548l0M97149a.f130227i = abstractC31531f1;
            }
            AbstractC31531f1 abstractC31531f2 = c31551m0.f130253J;
            if (abstractC31531f2 != null) {
                c31548l0M97149a.f130228j = abstractC31531f2;
            }
            byte[] bArr = c31551m0.f130254K;
            if (bArr != null) {
                Integer num = c31551m0.f130255L;
                c31548l0M97149a.f130229k = (byte[]) bArr.clone();
                c31548l0M97149a.f130230l = num;
            }
            Uri uri2 = c31551m0.f130256M;
            if (uri2 != null) {
                c31548l0M97149a.f130231m = uri2;
            }
            Integer num2 = c31551m0.f130257N;
            if (num2 != null) {
                c31548l0M97149a.f130232n = num2;
            }
            Integer num3 = c31551m0.f130258O;
            if (num3 != null) {
                c31548l0M97149a.f130233o = num3;
            }
            Integer num4 = c31551m0.f130259P;
            if (num4 != null) {
                c31548l0M97149a.f130234p = num4;
            }
            Boolean bool = c31551m0.f130260Q;
            if (bool != null) {
                c31548l0M97149a.f130235q = bool;
            }
            Integer num5 = c31551m0.f130261R;
            if (num5 != null) {
                c31548l0M97149a.f130236r = num5;
            }
            Integer num6 = c31551m0.f130262S;
            if (num6 != null) {
                c31548l0M97149a.f130236r = num6;
            }
            Integer num7 = c31551m0.f130263T;
            if (num7 != null) {
                c31548l0M97149a.f130237s = num7;
            }
            Integer num8 = c31551m0.f130264U;
            if (num8 != null) {
                c31548l0M97149a.f130238t = num8;
            }
            Integer num9 = c31551m0.f130265V;
            if (num9 != null) {
                c31548l0M97149a.f130239u = num9;
            }
            Integer num10 = c31551m0.f130266W;
            if (num10 != null) {
                c31548l0M97149a.f130240v = num10;
            }
            Integer num11 = c31551m0.f130267X;
            if (num11 != null) {
                c31548l0M97149a.f130241w = num11;
            }
            CharSequence charSequence8 = c31551m0.f130268Y;
            if (charSequence8 != null) {
                c31548l0M97149a.f130242x = charSequence8;
            }
            CharSequence charSequence9 = c31551m0.f130269Z;
            if (charSequence9 != null) {
                c31548l0M97149a.f130243y = charSequence9;
            }
            CharSequence charSequence10 = c31551m0.f130270a0;
            if (charSequence10 != null) {
                c31548l0M97149a.f130244z = charSequence10;
            }
            Integer num12 = c31551m0.f130271b0;
            if (num12 != null) {
                c31548l0M97149a.f130213A = num12;
            }
            Integer num13 = c31551m0.f130272c0;
            if (num13 != null) {
                c31548l0M97149a.f130214B = num13;
            }
            CharSequence charSequence11 = c31551m0.f130273d0;
            if (charSequence11 != null) {
                c31548l0M97149a.f130215C = charSequence11;
            }
            CharSequence charSequence12 = c31551m0.f130274e0;
            if (charSequence12 != null) {
                c31548l0M97149a.f130216D = charSequence12;
            }
            CharSequence charSequence13 = c31551m0.f130275f0;
            if (charSequence13 != null) {
                c31548l0M97149a.f130217E = charSequence13;
            }
            Bundle bundle = c31551m0.f130276g0;
            if (bundle != null) {
                c31548l0M97149a.f130218F = bundle;
            }
        }
        return new C31551m0(c31548l0M97149a);
    }

    /* JADX INFO: renamed from: S */
    public final void m97201S() {
        m97198B0();
        m97221p0();
        m97228w0(null);
        m97217l0(0, 0);
    }

    /* JADX INFO: renamed from: U */
    public final C31525d1 m97202U(InterfaceC31522c1 interfaceC31522c1) {
        int iM97210c0 = m97210c0();
        AbstractC31558o1 abstractC31558o1 = this.f130392K0.f130441a;
        if (iM97210c0 == -1) {
            iM97210c0 = 0;
        }
        C24562t c24562t = this.f130407X;
        C31581z c31581z = this.f130393L;
        return new C31525d1(c31581z, interfaceC31522c1, abstractC31558o1, iM97210c0, c24562t, c31581z.f130485J);
    }

    /* JADX INFO: renamed from: V */
    public final long m97203V() {
        m97198B0();
        if (!m97214i0()) {
            return m97207Z();
        }
        C31574v0 c31574v0 = this.f130392K0;
        AbstractC31558o1 abstractC31558o1 = c31574v0.f130441a;
        Object obj = c31574v0.f130442b.f136238a;
        C31552m1 c31552m1 = this.f130398O;
        abstractC31558o1.mo97132g(obj, c31552m1);
        C31574v0 c31574v1 = this.f130392K0;
        if (c31574v1.f130443c == -9223372036854775807L) {
            return AbstractC24567y.m71669G(c31574v1.f130441a.mo97136m(m97206Y(), (C31555n1) this.f475x, 0L).f130317M);
        }
        return AbstractC24567y.m71669G(this.f130392K0.f130443c) + AbstractC24567y.m71669G(c31552m1.f130281E);
    }

    /* JADX INFO: renamed from: W */
    public final int m97204W() {
        m97198B0();
        if (m97214i0()) {
            return this.f130392K0.f130442b.f136239b;
        }
        return -1;
    }

    /* JADX INFO: renamed from: X */
    public final int m97205X() {
        m97198B0();
        if (m97214i0()) {
            return this.f130392K0.f130442b.f136240c;
        }
        return -1;
    }

    /* JADX INFO: renamed from: Y */
    public final int m97206Y() {
        m97198B0();
        int iM97210c0 = m97210c0();
        if (iM97210c0 == -1) {
            return 0;
        }
        return iM97210c0;
    }

    /* JADX INFO: renamed from: Z */
    public final long m97207Z() {
        m97198B0();
        return AbstractC24567y.m71669G(m97208a0(this.f130392K0));
    }

    /* JADX INFO: renamed from: a0 */
    public final long m97208a0(C31574v0 c31574v0) {
        if (c31574v0.f130441a.m97175p()) {
            return AbstractC24567y.m71695z(this.f130396M0);
        }
        if (c31574v0.f130442b.m102753a()) {
            return c31574v0.f130459s;
        }
        AbstractC31558o1 abstractC31558o1 = c31574v0.f130441a;
        C32763v c32763v = c31574v0.f130442b;
        long j7 = c31574v0.f130459s;
        Object obj = c32763v.f136238a;
        C31552m1 c31552m1 = this.f130398O;
        abstractC31558o1.mo97132g(obj, c31552m1);
        return j7 + c31552m1.f130281E;
    }

    /* JADX INFO: renamed from: b0 */
    public final AbstractC31558o1 m97209b0() {
        m97198B0();
        return this.f130392K0.f130441a;
    }

    /* JADX INFO: renamed from: c0 */
    public final int m97210c0() {
        if (this.f130392K0.f130441a.m97175p()) {
            return this.f130394L0;
        }
        C31574v0 c31574v0 = this.f130392K0;
        return c31574v0.f130441a.mo97132g(c31574v0.f130442b.f136238a, this.f130398O).f130286y;
    }

    /* JADX INFO: renamed from: d0 */
    public final boolean m97211d0() {
        m97198B0();
        return this.f130392K0.f130452l;
    }

    /* JADX INFO: renamed from: e0 */
    public final int m97212e0() {
        m97198B0();
        return this.f130392K0.f130445e;
    }

    /* JADX INFO: renamed from: g0 */
    public final C18744f m97213g0() {
        m97198B0();
        return (C18744f) ((C20033m) this.f130387I).f75163d.get();
    }

    /* JADX INFO: renamed from: i0 */
    public final boolean m97214i0() {
        m97198B0();
        return this.f130392K0.f130442b.m102753a();
    }

    /* JADX INFO: renamed from: j0 */
    public final C31574v0 m97215j0(C31574v0 c31574v0, AbstractC31558o1 abstractC31558o1, Pair pair) {
        List list;
        AbstractC24543a.m71569e(abstractC31558o1.m97175p() || pair != null);
        AbstractC31558o1 abstractC31558o2 = c31574v0.f130441a;
        C31574v0 c31574v0M97240h = c31574v0.m97240h(abstractC31558o1);
        if (abstractC31558o1.m97175p()) {
            C32763v c32763v = C31574v0.f130440t;
            long jM71695z = AbstractC24567y.m71695z(this.f130396M0);
            C31574v0 c31574v0M97233a = c31574v0M97240h.m97234b(c32763v, jM71695z, jM71695z, jM71695z, 0L, C32768x0.f136269z, this.f130434y, C41060w0.f177067E).m97233a(c32763v);
            c31574v0M97233a.f130457q = c31574v0M97233a.f130459s;
            return c31574v0M97233a;
        }
        Object obj = c31574v0M97240h.f130442b.f136238a;
        int i13 = AbstractC24567y.f95875a;
        boolean zEquals = obj.equals(pair.first);
        C32763v c32763v2 = !zEquals ? new C32763v(pair.first) : c31574v0M97240h.f130442b;
        long jLongValue = ((Long) pair.second).longValue();
        long jM71695z2 = AbstractC24567y.m71695z(m97203V());
        if (!abstractC31558o2.m97175p()) {
            jM71695z2 -= abstractC31558o2.mo97132g(obj, this.f130398O).f130281E;
        }
        if (!zEquals || jLongValue < jM71695z2) {
            C32763v c32763v3 = c32763v2;
            AbstractC24543a.m71573i(!c32763v3.m102753a());
            C32768x0 c32768x0 = !zEquals ? C32768x0.f136269z : c31574v0M97240h.f130448h;
            C20712x c20712x = !zEquals ? this.f130434y : c31574v0M97240h.f130449i;
            if (zEquals) {
                list = c31574v0M97240h.f130450j;
            } else {
                C41017e0 c41017e0 = AbstractC41023g0.f176998x;
                list = C41060w0.f177067E;
            }
            C31574v0 c31574v0M97233a2 = c31574v0M97240h.m97234b(c32763v3, jLongValue, jLongValue, jLongValue, 0L, c32768x0, c20712x, list).m97233a(c32763v3);
            c31574v0M97233a2.f130457q = jLongValue;
            return c31574v0M97233a2;
        }
        if (jLongValue != jM71695z2) {
            C32763v c32763v4 = c32763v2;
            AbstractC24543a.m71573i(!c32763v4.m102753a());
            long jMax = Math.max(0L, c31574v0M97240h.f130458r - (jLongValue - jM71695z2));
            long j7 = c31574v0M97240h.f130457q;
            if (c31574v0M97240h.f130451k.equals(c31574v0M97240h.f130442b)) {
                j7 = jLongValue + jMax;
            }
            C31574v0 c31574v0M97234b = c31574v0M97240h.m97234b(c32763v4, jLongValue, jLongValue, jLongValue, jMax, c31574v0M97240h.f130448h, c31574v0M97240h.f130449i, c31574v0M97240h.f130450j);
            c31574v0M97234b.f130457q = j7;
            return c31574v0M97234b;
        }
        int iMo97128b = abstractC31558o1.mo97128b(c31574v0M97240h.f130451k.f136238a);
        if (iMo97128b != -1 && abstractC31558o1.mo97131f(iMo97128b, this.f130398O, false).f130286y == abstractC31558o1.mo97132g(c32763v2.f136238a, this.f130398O).f130286y) {
            return c31574v0M97240h;
        }
        abstractC31558o1.mo97132g(c32763v2.f136238a, this.f130398O);
        long jM97150a = c32763v2.m102753a() ? this.f130398O.m97150a(c32763v2.f136239b, c32763v2.f136240c) : this.f130398O.f130287z;
        C32763v c32763v5 = c32763v2;
        C31574v0 c31574v0M97233a3 = c31574v0M97240h.m97234b(c32763v5, c31574v0M97240h.f130459s, c31574v0M97240h.f130459s, c31574v0M97240h.f130444d, jM97150a - c31574v0M97240h.f130459s, c31574v0M97240h.f130448h, c31574v0M97240h.f130449i, c31574v0M97240h.f130450j).m97233a(c32763v5);
        c31574v0M97233a3.f130457q = jM97150a;
        return c31574v0M97233a3;
    }

    /* JADX INFO: renamed from: k0 */
    public final Pair m97216k0(AbstractC31558o1 abstractC31558o1, int i13, long j7) {
        if (abstractC31558o1.m97175p()) {
            this.f130394L0 = i13;
            if (j7 == -9223372036854775807L) {
                j7 = 0;
            }
            this.f130396M0 = j7;
            return null;
        }
        if (i13 == -1 || i13 >= abstractC31558o1.mo97137o()) {
            i13 = abstractC31558o1.mo97127a(this.f130417h0);
            j7 = AbstractC24567y.m71669G(abstractC31558o1.mo97136m(i13, (C31555n1) this.f475x, 0L).f130317M);
        }
        return abstractC31558o1.m97172i((C31555n1) this.f475x, this.f130398O, i13, AbstractC24567y.m71695z(j7));
    }

    /* JADX INFO: renamed from: l0 */
    public final void m97217l0(int i13, int i14) {
        if (i13 == this.f130435y0 && i14 == this.f130437z0) {
            return;
        }
        this.f130435y0 = i13;
        this.f130437z0 = i14;
        this.f130395M.m31625i(24, new C2863s(i13, i14, 1));
    }

    /* JADX INFO: renamed from: m0 */
    public final void m97218m0() {
        m97198B0();
        boolean zM97211d0 = m97211d0();
        int iM97112c = this.f130411b0.m97112c(2, zM97211d0);
        m97230y0(iM97112c, (!zM97211d0 || iM97112c == 1) ? 1 : 2, zM97211d0);
        C31574v0 c31574v0 = this.f130392K0;
        if (c31574v0.f130445e != 1) {
            return;
        }
        C31574v0 c31574v0M97237e = c31574v0.m97237e(null);
        C31574v0 c31574v0M97239g = c31574v0M97237e.m97239g(c31574v0M97237e.f130441a.m97175p() ? 4 : 2);
        this.f130418i0++;
        C24564v c24564v = this.f130393L.f130483H;
        c24564v.getClass();
        C24563u c24563uM71648b = C24564v.m71648b();
        c24563uM71648b.f95863a = c24564v.f95865a.obtainMessage(0);
        c24563uM71648b.m71647b();
        m97231z0(c31574v0M97239g, 1, 1, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m97219n0() {
        String str;
        boolean z4;
        AudioTrack audioTrack;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str2 = AbstractC24567y.f95879e;
        HashSet hashSet = AbstractC31515a0.f130019a;
        synchronized (AbstractC31515a0.class) {
            str = AbstractC31515a0.f130020b;
        }
        StringBuilder sb4 = new StringBuilder(AbstractC30007c.m91832b(AbstractC30007c.m91832b(AbstractC30007c.m91832b(36, hexString), str2), str));
        sb4.append("Release ");
        sb4.append(hexString);
        sb4.append(" [ExoPlayerLib/2.17.1] [");
        sb4.append(str2);
        sb4.append("] [");
        sb4.append(str);
        sb4.append("]");
        Log.i("ExoPlayerImpl", sb4.toString());
        m97198B0();
        if (AbstractC24567y.f95875a < 21 && (audioTrack = this.f130426q0) != null) {
            audioTrack.release();
            this.f130426q0 = null;
        }
        this.f130410a0.m39763u();
        C31543j1 c31543j1 = this.f130412c0;
        C11787e c11787e = (C11787e) c31543j1.f130202h;
        if (c11787e != null) {
            try {
                ((Context) c31543j1.f130198d).unregisterReceiver(c11787e);
            } catch (RuntimeException e5) {
                AbstractC24543a.m71564F("StreamVolumeManager", "Error unregistering stream volume receiver", e5);
            }
            c31543j1.f130202h = null;
        }
        this.f130413d0.getClass();
        this.f130414e0.getClass();
        C31520c c31520c = this.f130411b0;
        c31520c.f130065c = null;
        c31520c.m97110a();
        C31581z c31581z = this.f130393L;
        synchronized (c31581z) {
            if (c31581z.f130500Y || !c31581z.f130484I.isAlive()) {
                z4 = true;
            } else {
                c31581z.f130483H.m71650c(7);
                c31581z.m97283g0(new C2853n(c31581z, 4), c31581z.f130496U);
                z4 = c31581z.f130500Y;
            }
        }
        if (!z4) {
            this.f130395M.m31625i(10, new C30097b(11));
        }
        C11799p c11799p = this.f130395M;
        CopyOnWriteArraySet<C24552j> copyOnWriteArraySet = (CopyOnWriteArraySet) c11799p.f38304e;
        for (C24552j c24552j : copyOnWriteArraySet) {
            InterfaceC24551i interfaceC24551i = (InterfaceC24551i) c11799p.f38303d;
            c24552j.f95823d = true;
            if (c24552j.f95822c) {
                interfaceC24551i.mo71596a(c24552j.f95820a, c24552j.f95821b.m71593b());
            }
        }
        copyOnWriteArraySet.clear();
        c11799p.f38300a = true;
        this.f130389J.f95865a.removeCallbacksAndMessages(null);
        InterfaceC22614e interfaceC22614e = this.f130404U;
        C32711d c32711d = this.f130402S;
        CopyOnWriteArrayList<C22610c> copyOnWriteArrayList = ((C22633q) interfaceC22614e).f89042b.f88960a;
        for (C22610c c22610c : copyOnWriteArrayList) {
            if (c22610c.f88952b == c32711d) {
                c22610c.f88953c = true;
                copyOnWriteArrayList.remove(c22610c);
            }
        }
        C31574v0 c31574v0M97239g = this.f130392K0.m97239g(1);
        this.f130392K0 = c31574v0M97239g;
        C31574v0 c31574v0M97233a = c31574v0M97239g.m97233a(c31574v0M97239g.f130442b);
        this.f130392K0 = c31574v0M97233a;
        c31574v0M97233a.f130457q = c31574v0M97233a.f130459s;
        this.f130392K0.f130458r = 0L;
        C32711d c32711d2 = this.f130402S;
        C24564v c24564v = c32711d2.f135989H;
        AbstractC24543a.m71574j(c24564v);
        c24564v.f95865a.post(new RunnableC24693e(c32711d2, 20));
        m97221p0();
        Surface surface = this.f130428s0;
        if (surface != null) {
            surface.release();
            this.f130428s0 = null;
        }
        this.f130380E0 = C41060w0.f177067E;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m97220o0(InterfaceC31582z0 interfaceC31582z0) {
        interfaceC31582z0.getClass();
        C11799p c11799p = this.f130395M;
        CopyOnWriteArraySet<C24552j> copyOnWriteArraySet = (CopyOnWriteArraySet) c11799p.f38304e;
        for (C24552j c24552j : copyOnWriteArraySet) {
            if (c24552j.f95820a.equals(interfaceC31582z0)) {
                InterfaceC24551i interfaceC24551i = (InterfaceC24551i) c11799p.f38303d;
                c24552j.f95823d = true;
                if (c24552j.f95822c) {
                    interfaceC24551i.mo71596a(c24552j.f95820a, c24552j.f95821b.m71593b());
                }
                copyOnWriteArraySet.remove(c24552j);
            }
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m97221p0() {
        C26880m c26880m = this.f130430u0;
        SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = this.f130408Y;
        if (c26880m != null) {
            C31525d1 c31525d1M97202U = m97202U(this.f130409Z);
            AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
            c31525d1M97202U.f130119d = InterfaceC33561b.INVALID_OWNERSHIP;
            AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
            c31525d1M97202U.f130120e = null;
            c31525d1M97202U.m97125c();
            this.f130430u0.f107288w.remove(surfaceHolderCallbackC31565r);
            this.f130430u0 = null;
        }
        TextureView textureView = this.f130432w0;
        if (textureView != null) {
            if (textureView.getSurfaceTextureListener() != surfaceHolderCallbackC31565r) {
                Log.w("ExoPlayerImpl", "SurfaceTextureListener already unset or replaced.");
            } else {
                this.f130432w0.setSurfaceTextureListener(null);
            }
            this.f130432w0 = null;
        }
        SurfaceHolder surfaceHolder = this.f130429t0;
        if (surfaceHolder != null) {
            surfaceHolder.removeCallback(surfaceHolderCallbackC31565r);
            this.f130429t0 = null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m97222q0(int i13, long j7) {
        m97198B0();
        C32711d c32711d = this.f130402S;
        if (!c32711d.f135990I) {
            C32708a c32708aM102663t = c32711d.m102663t();
            c32711d.f135990I = true;
            c32711d.m102668z(c32708aM102663t, -1, new C32709b(3));
        }
        AbstractC31558o1 abstractC31558o1 = this.f130392K0.f130441a;
        if (i13 < 0 || (!abstractC31558o1.m97175p() && i13 >= abstractC31558o1.mo97137o())) {
            throw new IllegalSeekPositionException();
        }
        this.f130418i0++;
        if (!m97214i0()) {
            int i14 = m97212e0() != 1 ? 2 : 1;
            int iM97206Y = m97206Y();
            C31574v0 c31574v0M97215j0 = m97215j0(this.f130392K0.m97239g(i14), abstractC31558o1, m97216k0(abstractC31558o1, i13, j7));
            this.f130393L.f130483H.m71649a(3, new C31579y(abstractC31558o1, i13, AbstractC24567y.m71695z(j7))).m71647b();
            m97231z0(c31574v0M97215j0, 0, 1, true, true, 1, m97208a0(c31574v0M97215j0), iM97206Y);
            return;
        }
        Log.w("ExoPlayerImpl", "seekTo ignored because an ad is playing");
        C31577x c31577x = new C31577x(this.f130392K0);
        c31577x.m97241a(1);
        C31571u c31571u = this.f130391K.f130245w;
        c31571u.f130389J.f95865a.post(new RunnableC30928b(7, c31571u, c31577x));
    }

    /* JADX INFO: renamed from: r0 */
    public final void m97223r0(int i13, int i14, Object obj) {
        for (AbstractC31523d abstractC31523d : this.f130385H) {
            if (abstractC31523d.f130110w == i13) {
                C31525d1 c31525d1M97202U = m97202U(abstractC31523d);
                AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
                c31525d1M97202U.f130119d = i14;
                AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
                c31525d1M97202U.f130120e = obj;
                c31525d1M97202U.m97125c();
            }
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m97224s0(SurfaceHolder surfaceHolder) {
        this.f130431v0 = false;
        this.f130429t0 = surfaceHolder;
        surfaceHolder.addCallback(this.f130408Y);
        Surface surface = this.f130429t0.getSurface();
        if (surface == null || !surface.isValid()) {
            m97217l0(0, 0);
        } else {
            Rect surfaceFrame = this.f130429t0.getSurfaceFrame();
            m97217l0(surfaceFrame.width(), surfaceFrame.height());
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m97225t0(boolean z4) {
        m97198B0();
        int iM97112c = this.f130411b0.m97112c(m97212e0(), z4);
        int i13 = 1;
        if (z4 && iM97112c != 1) {
            i13 = 2;
        }
        m97230y0(iM97112c, i13, z4);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m97226u0(int i13) {
        m97198B0();
        if (this.f130416g0 != i13) {
            this.f130416g0 = i13;
            C24564v c24564v = this.f130393L.f130483H;
            c24564v.getClass();
            C24563u c24563uM71648b = C24564v.m71648b();
            c24563uM71648b.f95863a = c24564v.f95865a.obtainMessage(11, i13, 0);
            c24563uM71648b.m71647b();
            C2865t c2865t = new C2865t(i13, 4);
            C11799p c11799p = this.f130395M;
            c11799p.m31623g(8, c2865t);
            m97229x0();
            c11799p.m31618b();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m97227v0(C20711w c20711w) {
        m97198B0();
        AbstractC20038r abstractC20038r = this.f130387I;
        abstractC20038r.getClass();
        C20033m c20033m = (C20033m) abstractC20038r;
        AtomicReference atomicReference = c20033m.f75163d;
        if (c20711w.equals((C18744f) atomicReference.get())) {
            return;
        }
        if (c20711w instanceof C18744f) {
            c20033m.m55871f((C18744f) c20711w);
        }
        C18745g c18745g = new C18745g((C18744f) atomicReference.get());
        c18745g.m56899b(c20711w);
        c20033m.m55871f(new C18744f(c18745g));
        this.f130395M.m31625i(19, new C25680d(c20711w, 29));
    }

    /* JADX INFO: renamed from: w0 */
    public final void m97228w0(Object obj) {
        boolean z4;
        ArrayList arrayList = new ArrayList();
        boolean z13 = false;
        for (AbstractC31523d abstractC31523d : this.f130385H) {
            if (abstractC31523d.f130110w == 2) {
                C31525d1 c31525d1M97202U = m97202U(abstractC31523d);
                AbstractC24543a.m71573i(!c31525d1M97202U.f130122g);
                c31525d1M97202U.f130119d = 1;
                AbstractC24543a.m71573i(true ^ c31525d1M97202U.f130122g);
                c31525d1M97202U.f130120e = obj;
                c31525d1M97202U.m97125c();
                arrayList.add(c31525d1M97202U);
            }
        }
        Object obj2 = this.f130427r0;
        if (obj2 == null || obj2 == obj) {
            z4 = false;
        } else {
            try {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C31525d1) it.next()).m97123a(this.f130415f0);
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (TimeoutException unused2) {
                z4 = true;
            }
            z4 = false;
            Object obj3 = this.f130427r0;
            Surface surface = this.f130428s0;
            if (obj3 == surface) {
                surface.release();
                this.f130428s0 = null;
            }
        }
        this.f130427r0 = obj;
        if (z4) {
            ExoPlaybackException exoPlaybackException = new ExoPlaybackException(2, new ExoTimeoutException("Detaching surface timed out."), 1003);
            C31574v0 c31574v0 = this.f130392K0;
            C31574v0 c31574v0M97233a = c31574v0.m97233a(c31574v0.f130442b);
            c31574v0M97233a.f130457q = c31574v0M97233a.f130459s;
            c31574v0M97233a.f130458r = 0L;
            C31574v0 c31574v0M97237e = c31574v0M97233a.m97239g(1).m97237e(exoPlaybackException);
            this.f130418i0++;
            C24564v c24564v = this.f130393L.f130483H;
            c24564v.getClass();
            C24563u c24563uM71648b = C24564v.m71648b();
            c24563uM71648b.f95863a = c24564v.f95865a.obtainMessage(6);
            c24563uM71648b.m71647b();
            if (c31574v0M97237e.f130441a.m97175p() && !this.f130392K0.f130441a.m97175p()) {
                z13 = true;
            }
            m97231z0(c31574v0M97237e, 0, 1, false, z13, 4, m97208a0(c31574v0M97237e), -1);
        }
    }

    /* JADX INFO: renamed from: x0 */
    public final void m97229x0() {
        int iMo97134k;
        int iMo97130e;
        C31578x0 c31578x0 = this.f130424o0;
        int i13 = AbstractC24567y.f95875a;
        C31571u c31571u = this.f130383G;
        boolean zM97214i0 = c31571u.m97214i0();
        boolean zM370D = c31571u.m370D();
        AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
        if (abstractC31558o1M97209b0.m97175p()) {
            iMo97134k = -1;
        } else {
            int iM97206Y = c31571u.m97206Y();
            c31571u.m97198B0();
            int i14 = c31571u.f130416g0;
            if (i14 == 1) {
                i14 = 0;
            }
            c31571u.m97198B0();
            iMo97134k = abstractC31558o1M97209b0.mo97134k(iM97206Y, i14, c31571u.f130417h0);
        }
        boolean z4 = iMo97134k != -1;
        AbstractC31558o1 abstractC31558o1M97209b1 = c31571u.m97209b0();
        if (abstractC31558o1M97209b1.m97175p()) {
            iMo97130e = -1;
        } else {
            int iM97206Y2 = c31571u.m97206Y();
            c31571u.m97198B0();
            int i15 = c31571u.f130416g0;
            if (i15 == 1) {
                i15 = 0;
            }
            c31571u.m97198B0();
            iMo97130e = abstractC31558o1M97209b1.mo97130e(iM97206Y2, i15, c31571u.f130417h0);
        }
        boolean z13 = iMo97130e != -1;
        boolean zM369C = c31571u.m369C();
        boolean zM368B = c31571u.m368B();
        boolean zM97175p = c31571u.m97209b0().m97175p();
        C29934u0 c29934u0 = new C29934u0(10);
        C24547e c24547e = (C24547e) c29934u0.f122249x;
        C24548f c24548f = this.f130436z.f130475w;
        c24547e.getClass();
        for (int i16 = 0; i16 < c24548f.f95817a.size(); i16++) {
            c24547e.m71592a(c24548f.m71595a(i16));
        }
        boolean z14 = !zM97214i0;
        c29934u0.m91538y(4, z14);
        c29934u0.m91538y(5, zM370D && !zM97214i0);
        c29934u0.m91538y(6, z4 && !zM97214i0);
        c29934u0.m91538y(7, !zM97175p && (z4 || !zM369C || zM370D) && !zM97214i0);
        c29934u0.m91538y(8, z13 && !zM97214i0);
        c29934u0.m91538y(9, !zM97175p && (z13 || (zM369C && zM368B)) && !zM97214i0);
        c29934u0.m91538y(10, z14);
        c29934u0.m91538y(11, zM370D && !zM97214i0);
        c29934u0.m91538y(12, zM370D && !zM97214i0);
        C31578x0 c31578x1 = new C31578x0(c24547e.m71593b());
        this.f130424o0 = c31578x1;
        if (c31578x1.equals(c31578x0)) {
            return;
        }
        this.f130395M.m31623g(13, new C31550m(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: y0 */
    public final void m97230y0(int i13, int i14, boolean z4) {
        int i15 = 0;
        ?? r10 = (!z4 || i13 == -1) ? 0 : 1;
        if (r10 != 0 && i13 != 1) {
            i15 = 1;
        }
        C31574v0 c31574v0 = this.f130392K0;
        if (c31574v0.f130452l == r10 && c31574v0.f130453m == i15) {
            return;
        }
        this.f130418i0++;
        C31574v0 c31574v0M97236d = c31574v0.m97236d(i15, r10);
        C24564v c24564v = this.f130393L.f130483H;
        c24564v.getClass();
        C24563u c24563uM71648b = C24564v.m71648b();
        c24563uM71648b.f95863a = c24564v.f95865a.obtainMessage(1, r10, i15);
        c24563uM71648b.m71647b();
        m97231z0(c31574v0M97236d, 0, i14, false, false, 5, -9223372036854775807L, -1);
    }

    /* JADX INFO: renamed from: z0 */
    public final void m97231z0(final C31574v0 c31574v0, final int i13, final int i14, boolean z4, boolean z13, int i15, long j7, int i16) {
        int i17;
        Pair pair;
        int i18;
        C31545k0 c31545k0;
        int i19;
        Object obj;
        C31545k0 c31545k1;
        Object obj2;
        int i24;
        long j13;
        long j14;
        long jM97195f0;
        long jM97195f1;
        Object obj3;
        C31545k0 c31545k2;
        Object obj4;
        int i25;
        C31574v0 c31574v1 = this.f130392K0;
        this.f130392K0 = c31574v0;
        boolean zEquals = c31574v1.f130441a.equals(c31574v0.f130441a);
        C31555n1 c31555n1 = (C31555n1) this.f475x;
        C31552m1 c31552m1 = this.f130398O;
        AbstractC31558o1 abstractC31558o1 = c31574v1.f130441a;
        C32763v c32763v = c31574v1.f130442b;
        AbstractC31558o1 abstractC31558o2 = c31574v0.f130441a;
        C32763v c32763v2 = c31574v0.f130442b;
        if (abstractC31558o2.m97175p() && abstractC31558o1.m97175p()) {
            pair = new Pair(Boolean.FALSE, -1);
            i17 = 3;
        } else {
            i17 = 3;
            if (abstractC31558o2.m97175p() != abstractC31558o1.m97175p()) {
                pair = new Pair(Boolean.TRUE, 3);
            } else if (abstractC31558o1.mo97136m(abstractC31558o1.mo97132g(c32763v.f136238a, c31552m1).f130286y, c31555n1, 0L).f130322w.equals(abstractC31558o2.mo97136m(abstractC31558o2.mo97132g(c32763v2.f136238a, c31552m1).f130286y, c31555n1, 0L).f130322w)) {
                pair = (z13 && i15 == 0 && c32763v.f136241d < c32763v2.f136241d) ? new Pair(Boolean.TRUE, 0) : new Pair(Boolean.FALSE, -1);
            } else {
                if (z13 && i15 == 0) {
                    i18 = 1;
                } else if (z13 && i15 == 1) {
                    i18 = 2;
                } else {
                    if (zEquals) {
                        throw new IllegalStateException();
                    }
                    i18 = 3;
                }
                pair = new Pair(Boolean.TRUE, Integer.valueOf(i18));
            }
        }
        boolean zBooleanValue = ((Boolean) pair.first).booleanValue();
        int iIntValue = ((Integer) pair.second).intValue();
        C31551m0 c31551m0M97200R = this.f130425p0;
        if (zBooleanValue) {
            c31545k0 = c31574v0.f130441a.m97175p() ? null : c31574v0.f130441a.mo97136m(c31574v0.f130441a.mo97132g(c31574v0.f130442b.f136238a, this.f130398O).f130286y, (C31555n1) this.f475x, 0L).f130324y;
            this.f130390J0 = C31551m0.f130246h0;
        } else {
            c31545k0 = null;
        }
        if (zBooleanValue || !c31574v1.f130450j.equals(c31574v0.f130450j)) {
            C31548l0 c31548l0M97149a = this.f130390J0.m97149a();
            List list = c31574v0.f130450j;
            for (int i26 = 0; i26 < list.size(); i26++) {
                C18715c c18715c = (C18715c) list.get(i26);
                int i27 = 0;
                while (true) {
                    InterfaceC18714b[] interfaceC18714bArr = c18715c.f73525w;
                    if (i27 < interfaceC18714bArr.length) {
                        interfaceC18714bArr[i27].mo54416w(c31548l0M97149a);
                        i27++;
                    }
                }
            }
            this.f130390J0 = new C31551m0(c31548l0M97149a);
            c31551m0M97200R = m97200R();
        }
        boolean zEquals2 = c31551m0M97200R.equals(this.f130425p0);
        this.f130425p0 = c31551m0M97200R;
        boolean z14 = c31574v1.f130452l != c31574v0.f130452l;
        boolean z15 = c31574v1.f130445e != c31574v0.f130445e;
        if (z15 || z14) {
            m97197A0();
        }
        boolean z16 = c31574v1.f130447g != c31574v0.f130447g;
        if (!c31574v1.f130441a.equals(c31574v0.f130441a)) {
            final int i28 = 0;
            this.f130395M.m31623g(0, new InterfaceC24550h() { // from class: rm.n
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj5) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj5;
                    switch (i28) {
                        case 0:
                            AbstractC31558o1 abstractC31558o3 = c31574v0.f130441a;
                            interfaceC31582z0.mo97307g(i13);
                            break;
                        default:
                            interfaceC31582z0.onPlayWhenReadyChanged(c31574v0.f130452l, i13);
                            break;
                    }
                }
            });
        }
        if (z13) {
            C31552m1 c31552m2 = new C31552m1();
            if (c31574v1.f130441a.m97175p()) {
                i19 = i16;
                obj = null;
                c31545k1 = null;
                obj2 = null;
                i24 = -1;
            } else {
                Object obj5 = c31574v1.f130442b.f136238a;
                c31574v1.f130441a.mo97132g(obj5, c31552m2);
                int i29 = c31552m2.f130286y;
                int iMo97128b = c31574v1.f130441a.mo97128b(obj5);
                obj = c31574v1.f130441a.mo97136m(i29, (C31555n1) this.f475x, 0L).f130322w;
                c31545k1 = ((C31555n1) this.f475x).f130324y;
                obj2 = obj5;
                i19 = i29;
                i24 = iMo97128b;
            }
            if (i15 == 0) {
                if (c31574v1.f130442b.m102753a()) {
                    C32763v c32763v3 = c31574v1.f130442b;
                    jM97195f0 = c31552m2.m97150a(c32763v3.f136239b, c32763v3.f136240c);
                    jM97195f1 = m97195f0(c31574v1);
                } else {
                    if (c31574v1.f130442b.f136242e != -1) {
                        jM97195f0 = m97195f0(this.f130392K0);
                    } else {
                        j13 = c31552m2.f130281E;
                        j14 = c31552m2.f130287z;
                        jM97195f0 = j13 + j14;
                    }
                    jM97195f1 = jM97195f0;
                }
            } else if (c31574v1.f130442b.m102753a()) {
                jM97195f0 = c31574v1.f130459s;
                jM97195f1 = m97195f0(c31574v1);
            } else {
                j13 = c31552m2.f130281E;
                j14 = c31574v1.f130459s;
                jM97195f0 = j13 + j14;
                jM97195f1 = jM97195f0;
            }
            long jM71669G = AbstractC24567y.m71669G(jM97195f0);
            long jM71669G2 = AbstractC24567y.m71669G(jM97195f1);
            C32763v c32763v4 = c31574v1.f130442b;
            C31516a1 c31516a1 = new C31516a1(obj, i19, c31545k1, obj2, i24, jM71669G, jM71669G2, c32763v4.f136239b, c32763v4.f136240c);
            C31555n1 c31555n2 = (C31555n1) this.f475x;
            int iM97206Y = m97206Y();
            if (this.f130392K0.f130441a.m97175p()) {
                obj3 = null;
                c31545k2 = null;
                obj4 = null;
                i25 = -1;
            } else {
                C31574v0 c31574v2 = this.f130392K0;
                Object obj6 = c31574v2.f130442b.f136238a;
                c31574v2.f130441a.mo97132g(obj6, this.f130398O);
                int iMo97128b2 = this.f130392K0.f130441a.mo97128b(obj6);
                Object obj7 = this.f130392K0.f130441a.mo97136m(iM97206Y, c31555n2, 0L).f130322w;
                c31545k2 = c31555n2.f130324y;
                i25 = iMo97128b2;
                obj4 = obj6;
                obj3 = obj7;
            }
            long jM71669G3 = AbstractC24567y.m71669G(j7);
            long jM71669G4 = this.f130392K0.f130442b.m102753a() ? AbstractC24567y.m71669G(m97195f0(this.f130392K0)) : jM71669G3;
            C32763v c32763v5 = this.f130392K0.f130442b;
            this.f130395M.m31623g(11, new C2873x(c31516a1, i15, new C31516a1(obj3, iM97206Y, c31545k2, obj4, i25, jM71669G3, jM71669G4, c32763v5.f136239b, c32763v5.f136240c), 2));
        } else {
            zBooleanValue = zBooleanValue;
            z14 = z14;
            zEquals2 = zEquals2;
        }
        if (zBooleanValue) {
            this.f130395M.m31623g(1, new C2869v(c31545k0, iIntValue, 3));
        }
        if (c31574v1.f130446f != c31574v0.f130446f) {
            final int i34 = 0;
            this.f130395M.m31623g(10, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj8) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj8;
                    switch (i34) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
            if (c31574v0.f130446f != null) {
                final int i35 = 1;
                this.f130395M.m31623g(10, new InterfaceC24550h() { // from class: rm.l
                    @Override // p309lo.InterfaceC24550h
                    public final void invoke(Object obj8) {
                        InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj8;
                        switch (i35) {
                            case 0:
                                interfaceC31582z0.mo97310l(c31574v0.f130446f);
                                break;
                            case 1:
                                interfaceC31582z0.mo97312n(c31574v0.f130446f);
                                break;
                            case 2:
                                interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                                break;
                            case 3:
                                C31574v0 c31574v3 = c31574v0;
                                boolean z17 = c31574v3.f130447g;
                                interfaceC31582z0.getClass();
                                interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                                break;
                            case 4:
                                C31574v0 c31574v4 = c31574v0;
                                interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                                break;
                            case 5:
                                interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                                break;
                            case 6:
                                interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                                break;
                            case 7:
                                interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                                break;
                            default:
                                interfaceC31582z0.mo97302a(c31574v0.f130454n);
                                break;
                        }
                    }
                });
            }
        }
        C20712x c20712x = c31574v1.f130449i;
        C20712x c20712x2 = c31574v0.f130449i;
        if (c20712x != c20712x2) {
            AbstractC20038r abstractC20038r = this.f130387I;
            Object obj8 = c20712x2.f77585e;
            abstractC20038r.getClass();
            this.f130395M.m31623g(2, new C30486c(1, c31574v0, new C20039s(c31574v0.f130449i.f77583c)));
            final int i36 = 2;
            this.f130395M.m31623g(2, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i36) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (!zEquals2) {
            this.f130395M.m31623g(14, new C25680d(this.f130425p0, 28));
        }
        if (z16) {
            final int i37 = 3;
            this.f130395M.m31623g(i17, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i37) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (z15 || z14) {
            final int i38 = 4;
            this.f130395M.m31623g(-1, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i38) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (z15) {
            final int i39 = 5;
            this.f130395M.m31623g(4, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i39) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (z14) {
            final int i44 = 1;
            this.f130395M.m31623g(5, new InterfaceC24550h() { // from class: rm.n
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i44) {
                        case 0:
                            AbstractC31558o1 abstractC31558o3 = c31574v0.f130441a;
                            interfaceC31582z0.mo97307g(i14);
                            break;
                        default:
                            interfaceC31582z0.onPlayWhenReadyChanged(c31574v0.f130452l, i14);
                            break;
                    }
                }
            });
        }
        if (c31574v1.f130453m != c31574v0.f130453m) {
            final int i45 = 6;
            this.f130395M.m31623g(6, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i45) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (m97196h0(c31574v1) != m97196h0(c31574v0)) {
            final int i46 = 7;
            this.f130395M.m31623g(7, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i46) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (!c31574v1.f130454n.equals(c31574v0.f130454n)) {
            final int i47 = 8;
            this.f130395M.m31623g(12, new InterfaceC24550h() { // from class: rm.l
                @Override // p309lo.InterfaceC24550h
                public final void invoke(Object obj9) {
                    InterfaceC31582z0 interfaceC31582z0 = (InterfaceC31582z0) obj9;
                    switch (i47) {
                        case 0:
                            interfaceC31582z0.mo97310l(c31574v0.f130446f);
                            break;
                        case 1:
                            interfaceC31582z0.mo97312n(c31574v0.f130446f);
                            break;
                        case 2:
                            interfaceC31582z0.mo61777r(c31574v0.f130449i.f77584d);
                            break;
                        case 3:
                            C31574v0 c31574v3 = c31574v0;
                            boolean z17 = c31574v3.f130447g;
                            interfaceC31582z0.getClass();
                            interfaceC31582z0.onIsLoadingChanged(c31574v3.f130447g);
                            break;
                        case 4:
                            C31574v0 c31574v4 = c31574v0;
                            interfaceC31582z0.onPlayerStateChanged(c31574v4.f130452l, c31574v4.f130445e);
                            break;
                        case 5:
                            interfaceC31582z0.onPlaybackStateChanged(c31574v0.f130445e);
                            break;
                        case 6:
                            interfaceC31582z0.onPlaybackSuppressionReasonChanged(c31574v0.f130453m);
                            break;
                        case 7:
                            interfaceC31582z0.onIsPlayingChanged(C31571u.m97196h0(c31574v0));
                            break;
                        default:
                            interfaceC31582z0.mo97302a(c31574v0.f130454n);
                            break;
                    }
                }
            });
        }
        if (z4) {
            this.f130395M.m31623g(-1, new C30097b(13));
        }
        m97229x0();
        this.f130395M.m31618b();
        if (c31574v1.f130455o != c31574v0.f130455o) {
            Iterator it = this.f130397N.iterator();
            while (it.hasNext()) {
                ((SurfaceHolderCallbackC31565r) it.next()).getClass();
            }
        }
        if (c31574v1.f130456p != c31574v0.f130456p) {
            Iterator it3 = this.f130397N.iterator();
            while (it3.hasNext()) {
                ((SurfaceHolderCallbackC31565r) it3.next()).f130359w.m97197A0();
            }
        }
    }
}
