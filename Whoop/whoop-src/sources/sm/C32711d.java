package sm;

import a30.C0332w0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import in.C18715c;
import io.C20039s;
import io.C20711w;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import mo.C25737r;
import p085d9.C11799p;
import p299l9.C23537y;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24562t;
import p309lo.C24564v;
import p309lo.InterfaceC24550h;
import p465rm.AbstractC31558o1;
import p465rm.C31516a1;
import p465rm.C31538i;
import p465rm.C31545k0;
import p465rm.C31551m0;
import p465rm.C31552m1;
import p465rm.C31555n1;
import p465rm.C31559p;
import p465rm.C31564q1;
import p465rm.C31571u;
import p465rm.C31576w0;
import p465rm.C31578x0;
import p465rm.C31580y0;
import p465rm.InterfaceC31519b1;
import p465rm.InterfaceC31582z0;
import p556vm.InterfaceC36138e;
import p690zr.AbstractC41023g0;
import p690zr.C41009b1;
import sn.C32745m;
import sn.C32759t;
import sn.C32763v;
import sn.C32768x0;
import sn.InterfaceC32722a0;

/* JADX INFO: renamed from: sm.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C32711d implements InterfaceC31582z0, InterfaceC32722a0, InterfaceC36138e {

    /* JADX INFO: renamed from: E */
    public final SparseArray f135986E;

    /* JADX INFO: renamed from: F */
    public C11799p f135987F;

    /* JADX INFO: renamed from: G */
    public InterfaceC31519b1 f135988G;

    /* JADX INFO: renamed from: H */
    public C24564v f135989H;

    /* JADX INFO: renamed from: I */
    public boolean f135990I;

    /* JADX INFO: renamed from: w */
    public final C24562t f135991w;

    /* JADX INFO: renamed from: x */
    public final C31552m1 f135992x;

    /* JADX INFO: renamed from: y */
    public final C31555n1 f135993y;

    /* JADX INFO: renamed from: z */
    public final C0332w0 f135994z;

    public C32711d(C24562t c24562t) {
        c24562t.getClass();
        this.f135991w = c24562t;
        int i13 = AbstractC24567y.f95875a;
        Looper looperMyLooper = Looper.myLooper();
        this.f135987F = new C11799p(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, c24562t, new C32709b(16));
        C31552m1 c31552m1 = new C31552m1();
        this.f135992x = c31552m1;
        this.f135993y = new C31555n1();
        this.f135994z = new C0332w0(c31552m1);
        this.f135986E = new SparseArray();
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: A */
    public final void mo91075A(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y, IOException iOException, boolean z4) {
        m102668z(m102666w(i13, c32763v), 1003, new C32710c(16));
    }

    /* JADX INFO: renamed from: B */
    public final void m102662B(C31571u c31571u, Looper looper) {
        AbstractC24543a.m71573i(this.f135988G == null || ((AbstractC41023g0) this.f135994z.f1169y).isEmpty());
        c31571u.getClass();
        this.f135988G = c31571u;
        this.f135989H = this.f135991w.m71645a(looper, null);
        C11799p c11799p = this.f135987F;
        this.f135987F = new C11799p((CopyOnWriteArraySet) c11799p.f38304e, looper, (C24562t) c11799p.f38301b, new C31559p(this, c31571u));
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: G */
    public final void mo91084G(int i13, C32763v c32763v, C23537y c23537y) {
        m102668z(m102666w(i13, c32763v), MessageListItemViewType.LOADING_INDICATOR, new C32709b(29));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: a */
    public final void mo97302a(C31576w0 c31576w0) {
        m102668z(m102663t(), 12, new C32709b(1));
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: a0 */
    public final void mo91107a0(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        m102668z(m102666w(i13, c32763v), 1002, new C32710c(10));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: b */
    public final void mo97303b(C31538i c31538i) {
        m102668z(m102663t(), 29, new C32710c(5));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: c */
    public final void mo97304c(C31545k0 c31545k0, int i13) {
        m102668z(m102663t(), 1, new C32709b(10));
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: d */
    public final void mo91111d(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        m102668z(m102666w(i13, c32763v), 1000, new C32710c(0));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: e */
    public final void mo97305e(C32768x0 c32768x0, C20039s c20039s) {
        m102668z(m102663t(), 2, new C32710c(2));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: f */
    public final void mo97306f(int i13, boolean z4) {
        m102668z(m102663t(), 30, new C32710c(6));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: g */
    public final void mo97307g(int i13) {
        InterfaceC31519b1 interfaceC31519b1 = this.f135988G;
        interfaceC31519b1.getClass();
        C0332w0 c0332w0 = this.f135994z;
        c0332w0.f1164E = C0332w0.m835p(interfaceC31519b1, (AbstractC41023g0) c0332w0.f1169y, (C32763v) c0332w0.f1165F, (C31552m1) c0332w0.f1168x);
        c0332w0.m848L(((C31571u) interfaceC31519b1).m97209b0());
        m102668z(m102663t(), 0, new C32710c(4));
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: h */
    public final void mo91116h(int i13, C32763v c32763v, C23537y c23537y) {
        m102668z(m102666w(i13, c32763v), MessageListItemViewType.CUSTOM_ATTACHMENTS, new C32709b(5));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: i */
    public final void mo97308i(C18715c c18715c) {
        m102668z(m102663t(), 28, new C32710c(7));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: j */
    public final void mo97309j(C31578x0 c31578x0) {
        m102668z(m102663t(), 13, new C32709b(11));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: k */
    public final void mo61755k(C31580y0 c31580y0) {
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: l */
    public final void mo97310l(PlaybackException playbackException) {
        C32759t c32759t;
        m102668z((!(playbackException instanceof ExoPlaybackException) || (c32759t = ((ExoPlaybackException) playbackException).f20368H) == null) ? m102663t() : m102665v(new C32763v(c32759t)), 10, new C32709b(25));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: m */
    public final void mo97311m() {
        m102668z(m102663t(), -1, new C32709b(4));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: n */
    public final void mo97312n(PlaybackException playbackException) {
        C32759t c32759t;
        m102668z((!(playbackException instanceof ExoPlaybackException) || (c32759t = ((ExoPlaybackException) playbackException).f20368H) == null) ? m102663t() : m102665v(new C32763v(c32759t)), 10, new C32709b(9));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: o */
    public final void mo97313o(C20711w c20711w) {
        m102668z(m102663t(), 19, new C32709b(17));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onCues(List list) {
        m102668z(m102663t(), 27, new C32709b(23));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onIsLoadingChanged(boolean z4) {
        m102668z(m102663t(), 3, new C32710c(11));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onIsPlayingChanged(boolean z4) {
        m102668z(m102663t(), 7, new C32710c(18));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlayWhenReadyChanged(boolean z4, int i13) {
        m102668z(m102663t(), 5, new C32709b(8));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlaybackStateChanged(int i13) {
        m102668z(m102663t(), 4, new C32709b(14));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlaybackSuppressionReasonChanged(int i13) {
        m102668z(m102663t(), 6, new C32709b(26));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlayerStateChanged(boolean z4, int i13) {
        m102668z(m102663t(), -1, new C32709b(2));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onRenderedFirstFrame() {
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onRepeatModeChanged(int i13) {
        m102668z(m102663t(), 8, new C32709b(21));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onShuffleModeEnabledChanged(boolean z4) {
        m102668z(m102663t(), 9, new C32710c(13));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onSkipSilenceEnabledChanged(boolean z4) {
        m102668z(m102667y(), 23, new C32710c(12));
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onSurfaceSizeChanged(int i13, int i14) {
        m102668z(m102667y(), 24, new C32709b(6));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: p */
    public final void mo61775p(C31516a1 c31516a1, C31516a1 c31516a2, int i13) {
        if (i13 == 1) {
            this.f135990I = false;
        }
        InterfaceC31519b1 interfaceC31519b1 = this.f135988G;
        interfaceC31519b1.getClass();
        C0332w0 c0332w0 = this.f135994z;
        c0332w0.f1164E = C0332w0.m835p(interfaceC31519b1, (AbstractC41023g0) c0332w0.f1169y, (C32763v) c0332w0.f1165F, (C31552m1) c0332w0.f1168x);
        m102668z(m102663t(), 11, new C32710c(1));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: q */
    public final void mo61776q(C25737r c25737r) {
        m102668z(m102667y(), 25, new C32710c(9));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: r */
    public final void mo61777r(C31564q1 c31564q1) {
        m102668z(m102663t(), 2, new C32709b(7));
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: s */
    public final void mo97314s(C31551m0 c31551m0) {
        m102668z(m102663t(), 14, new C32709b(0));
    }

    /* JADX INFO: renamed from: t */
    public final C32708a m102663t() {
        return m102665v((C32763v) this.f135994z.f1164E);
    }

    /* JADX INFO: renamed from: u */
    public final C32708a m102664u(AbstractC31558o1 abstractC31558o1, int i13, C32763v c32763v) {
        C32763v c32763v2 = abstractC31558o1.m97175p() ? null : c32763v;
        this.f135991w.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = abstractC31558o1.equals(((C31571u) this.f135988G).m97209b0()) && i13 == ((C31571u) this.f135988G).m97206Y();
        long jM71669G = 0;
        if (c32763v2 == null || !c32763v2.m102753a()) {
            if (z4) {
                jM71669G = ((C31571u) this.f135988G).m97203V();
            } else if (!abstractC31558o1.m97175p()) {
                jM71669G = AbstractC24567y.m71669G(abstractC31558o1.mo97136m(i13, this.f135993y, 0L).f130317M);
            }
        } else if (z4 && ((C31571u) this.f135988G).m97204W() == c32763v2.f136239b && ((C31571u) this.f135988G).m97205X() == c32763v2.f136240c) {
            jM71669G = ((C31571u) this.f135988G).m97207Z();
        }
        C32763v c32763v3 = (C32763v) this.f135994z.f1164E;
        AbstractC31558o1 abstractC31558o1M97209b0 = ((C31571u) this.f135988G).m97209b0();
        int iM97206Y = ((C31571u) this.f135988G).m97206Y();
        long jM97207Z = ((C31571u) this.f135988G).m97207Z();
        C31571u c31571u = (C31571u) this.f135988G;
        c31571u.m97198B0();
        return new C32708a(jElapsedRealtime, abstractC31558o1, i13, c32763v2, jM71669G, abstractC31558o1M97209b0, iM97206Y, c32763v3, jM97207Z, AbstractC24567y.m71669G(c31571u.f130392K0.f130458r));
    }

    /* JADX INFO: renamed from: v */
    public final C32708a m102665v(C32763v c32763v) {
        this.f135988G.getClass();
        AbstractC31558o1 abstractC31558o1 = c32763v == null ? null : (AbstractC31558o1) ((C41009b1) this.f135994z.f1170z).get(c32763v);
        if (c32763v != null && abstractC31558o1 != null) {
            return m102664u(abstractC31558o1, abstractC31558o1.mo97132g(c32763v.f136238a, this.f135992x).f130286y, c32763v);
        }
        int iM97206Y = ((C31571u) this.f135988G).m97206Y();
        AbstractC31558o1 abstractC31558o1M97209b0 = ((C31571u) this.f135988G).m97209b0();
        if (iM97206Y >= abstractC31558o1M97209b0.mo97137o()) {
            abstractC31558o1M97209b0 = AbstractC31558o1.f130335w;
        }
        return m102664u(abstractC31558o1M97209b0, iM97206Y, null);
    }

    /* JADX INFO: renamed from: w */
    public final C32708a m102666w(int i13, C32763v c32763v) {
        this.f135988G.getClass();
        AbstractC31558o1 abstractC31558o1 = AbstractC31558o1.f130335w;
        if (c32763v != null) {
            return ((AbstractC31558o1) ((C41009b1) this.f135994z.f1170z).get(c32763v)) != null ? m102665v(c32763v) : m102664u(abstractC31558o1, i13, c32763v);
        }
        AbstractC31558o1 abstractC31558o1M97209b0 = ((C31571u) this.f135988G).m97209b0();
        if (i13 < abstractC31558o1M97209b0.mo97137o()) {
            abstractC31558o1 = abstractC31558o1M97209b0;
        }
        return m102664u(abstractC31558o1, i13, null);
    }

    @Override // sn.InterfaceC32722a0
    /* JADX INFO: renamed from: x */
    public final void mo91134x(int i13, C32763v c32763v, C32745m c32745m, C23537y c23537y) {
        m102668z(m102666w(i13, c32763v), 1001, new C32710c(14));
    }

    /* JADX INFO: renamed from: y */
    public final C32708a m102667y() {
        return m102665v((C32763v) this.f135994z.f1166G);
    }

    /* JADX INFO: renamed from: z */
    public final void m102668z(C32708a c32708a, int i13, InterfaceC24550h interfaceC24550h) {
        this.f135986E.put(i13, c32708a);
        this.f135987F.m31625i(i13, interfaceC24550h);
    }
}
