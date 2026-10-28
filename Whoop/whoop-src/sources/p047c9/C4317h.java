package p047c9;

import a30.C0332w0;
import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemViewType;
import java.io.IOException;
import java.util.List;
import p012ab.C0667a;
import p012ab.C0680g0;
import p031b9.C2818b0;
import p031b9.C2830f0;
import p031b9.C2865t;
import p171g9.InterfaceC15588e;
import p299l9.C23488c0;
import p299l9.C23527t;
import p299l9.C23537y;
import p299l9.InterfaceC23506i0;
import p516u8.AbstractC34609o0;
import p516u8.C34581a0;
import p516u8.C34585c0;
import p516u8.C34586d;
import p516u8.C34589e0;
import p516u8.C34591f0;
import p516u8.C34593g0;
import p516u8.C34597i0;
import p516u8.C34605m0;
import p516u8.C34607n0;
import p516u8.C34619t0;
import p516u8.C34623v0;
import p516u8.C34626x;
import p516u8.C34629y0;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p576w8.C36933c;
import p607x8.AbstractC38065t;
import p607x8.C38054i;
import p607x8.C38061p;
import p607x8.C38063r;
import p607x8.InterfaceC38051f;
import p690zr.AbstractC41023g0;
import p690zr.C41009b1;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: c9.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C4317h implements InterfaceC34595h0, InterfaceC23506i0, InterfaceC15588e {

    /* JADX INFO: renamed from: E */
    public final SparseArray f17515E;

    /* JADX INFO: renamed from: F */
    public C38054i f17516F;

    /* JADX INFO: renamed from: G */
    public InterfaceC34599j0 f17517G;

    /* JADX INFO: renamed from: H */
    public C38063r f17518H;

    /* JADX INFO: renamed from: I */
    public boolean f17519I;

    /* JADX INFO: renamed from: w */
    public final C38061p f17520w;

    /* JADX INFO: renamed from: x */
    public final C34605m0 f17521x;

    /* JADX INFO: renamed from: y */
    public final C34607n0 f17522y;

    /* JADX INFO: renamed from: z */
    public final C0332w0 f17523z;

    public C4317h(C38061p c38061p) {
        c38061p.getClass();
        this.f17520w = c38061p;
        int i13 = AbstractC38065t.f163031a;
        Looper looperMyLooper = Looper.myLooper();
        this.f17516F = new C38054i(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, c38061p, new C0667a(27));
        C34605m0 c34605m0 = new C34605m0();
        this.f17521x = c34605m0;
        this.f17522y = new C34607n0();
        this.f17523z = new C0332w0(c34605m0);
        this.f17515E = new SparseArray();
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: a */
    public final void mo8314a(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        m13602l(m13600j(i13, c23488c0), 1001, new C4313d(16));
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: b */
    public final void mo8315b(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, IOException iOException, boolean z4) {
        C4310a c4310aM13600j = m13600j(i13, c23488c0);
        m13602l(c4310aM13600j, 1003, new C0680g0(c4310aM13600j, c23527t, c23537y, iOException, z4));
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: c */
    public final void mo8316c(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y) {
        m13602l(m13600j(i13, c23488c0), 1002, new C4313d(14));
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: d */
    public final void mo8317d(int i13, C23488c0 c23488c0, C23537y c23537y) {
        C4310a c4310aM13600j = m13600j(i13, c23488c0);
        m13602l(c4310aM13600j, MessageListItemViewType.CUSTOM_ATTACHMENTS, new C4312c(1, c4310aM13600j, c23537y));
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: e */
    public final void mo8318e(int i13, C23488c0 c23488c0, C23537y c23537y) {
        m13602l(m13600j(i13, c23488c0), MessageListItemViewType.LOADING_INDICATOR, new C4313d(26));
    }

    @Override // p299l9.InterfaceC23506i0
    /* JADX INFO: renamed from: f */
    public final void mo8319f(int i13, C23488c0 c23488c0, C23527t c23527t, C23537y c23537y, int i14) {
        m13602l(m13600j(i13, c23488c0), 1000, new C4313d(6));
    }

    /* JADX INFO: renamed from: g */
    public final C4310a m13597g() {
        return m13598h((C23488c0) this.f17523z.f1164E);
    }

    /* JADX INFO: renamed from: h */
    public final C4310a m13598h(C23488c0 c23488c0) {
        this.f17517G.getClass();
        AbstractC34609o0 abstractC34609o0 = c23488c0 == null ? null : (AbstractC34609o0) ((C41009b1) this.f17523z.f1170z).get(c23488c0);
        if (c23488c0 != null && abstractC34609o0 != null) {
            return m13599i(abstractC34609o0, abstractC34609o0.mo8135g(c23488c0.f92976a, this.f17521x).f145693c, c23488c0);
        }
        int iM8101Z = ((C2830f0) this.f17517G).m8101Z();
        AbstractC34609o0 abstractC34609o0M8104c0 = ((C2830f0) this.f17517G).m8104c0();
        if (iM8101Z >= abstractC34609o0M8104c0.mo8139o()) {
            abstractC34609o0M8104c0 = AbstractC34609o0.f145755a;
        }
        return m13599i(abstractC34609o0M8104c0, iM8101Z, null);
    }

    /* JADX INFO: renamed from: i */
    public final C4310a m13599i(AbstractC34609o0 abstractC34609o0, int i13, C23488c0 c23488c0) {
        C23488c0 c23488c1 = abstractC34609o0.m109408p() ? null : c23488c0;
        this.f17520w.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z4 = abstractC34609o0.equals(((C2830f0) this.f17517G).m8104c0()) && i13 == ((C2830f0) this.f17517G).m8101Z();
        long jM121907U = 0;
        if (c23488c1 == null || !c23488c1.m68054b()) {
            if (z4) {
                C2830f0 c2830f0 = (C2830f0) this.f17517G;
                c2830f0.m8091L0();
                jM121907U = c2830f0.m8098W(c2830f0.f11111I0);
            } else if (!abstractC34609o0.m109408p()) {
                jM121907U = AbstractC38065t.m121907U(abstractC34609o0.mo8129m(i13, this.f17522y, 0L).f145712l);
            }
        } else if (z4 && ((C2830f0) this.f17517G).m8099X() == c23488c1.f92977b && ((C2830f0) this.f17517G).m8100Y() == c23488c1.f92978c) {
            jM121907U = ((C2830f0) this.f17517G).m8102a0();
        }
        C23488c0 c23488c2 = (C23488c0) this.f17523z.f1164E;
        AbstractC34609o0 abstractC34609o0M8104c0 = ((C2830f0) this.f17517G).m8104c0();
        int iM8101Z = ((C2830f0) this.f17517G).m8101Z();
        long jM8102a0 = ((C2830f0) this.f17517G).m8102a0();
        C2830f0 c2830f1 = (C2830f0) this.f17517G;
        c2830f1.m8091L0();
        return new C4310a(jElapsedRealtime, abstractC34609o0, i13, c23488c1, jM121907U, abstractC34609o0M8104c0, iM8101Z, c23488c2, jM8102a0, AbstractC38065t.m121907U(c2830f1.f11111I0.f11062r));
    }

    /* JADX INFO: renamed from: j */
    public final C4310a m13600j(int i13, C23488c0 c23488c0) {
        this.f17517G.getClass();
        if (c23488c0 != null) {
            return ((AbstractC34609o0) ((C41009b1) this.f17523z.f1170z).get(c23488c0)) != null ? m13598h(c23488c0) : m13599i(AbstractC34609o0.f145755a, i13, c23488c0);
        }
        AbstractC34609o0 abstractC34609o0M8104c0 = ((C2830f0) this.f17517G).m8104c0();
        if (i13 >= abstractC34609o0M8104c0.mo8139o()) {
            abstractC34609o0M8104c0 = AbstractC34609o0.f145755a;
        }
        return m13599i(abstractC34609o0M8104c0, i13, null);
    }

    /* JADX INFO: renamed from: k */
    public final C4310a m13601k() {
        return m13598h((C23488c0) this.f17523z.f1166G);
    }

    /* JADX INFO: renamed from: l */
    public final void m13602l(C4310a c4310a, int i13, InterfaceC38051f interfaceC38051f) {
        this.f17515E.put(i13, c4310a);
        this.f17516F.m121835e(i13, interfaceC38051f);
    }

    /* JADX INFO: renamed from: m */
    public final void m13603m(C2830f0 c2830f0, Looper looper) {
        AbstractC35849g.m113807i(this.f17517G == null || ((AbstractC41023g0) this.f17523z.f1169y).isEmpty());
        c2830f0.getClass();
        this.f17517G = c2830f0;
        this.f17518H = this.f17520w.m121874a(looper, null);
        C38054i c38054i = this.f17516F;
        this.f17516F = new C38054i(c38054i.f162998d, looper, c38054i.f162995a, new C4312c(0, this, c2830f0), c38054i.f163003i);
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onAudioAttributesChanged(C34586d c34586d) {
        m13602l(m13601k(), 20, new C4313d(28));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onAudioSessionIdChanged(int i13) {
        m13602l(m13601k(), 21, new C4313d(19));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onAvailableCommandsChanged(C34591f0 c34591f0) {
        m13602l(m13597g(), 13, new C4316g(0));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onCues(List list) {
        m13602l(m13597g(), 27, new C0667a(26));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onEvents(InterfaceC34599j0 interfaceC34599j0, C34593g0 c34593g0) {
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onIsLoadingChanged(boolean z4) {
        m13602l(m13597g(), 3, new C4313d(21));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onIsPlayingChanged(boolean z4) {
        m13602l(m13597g(), 7, new C0667a(18));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onMediaItemTransition(C34626x c34626x, int i13) {
        m13602l(m13597g(), 1, new C4316g(2));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onMediaMetadataChanged(C34581a0 c34581a0) {
        m13602l(m13597g(), 14, new C4313d(11));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onMetadata(C34585c0 c34585c0) {
        m13602l(m13597g(), 28, new C0667a(17));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlayWhenReadyChanged(boolean z4, int i13) {
        m13602l(m13597g(), 5, new C0667a(23));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlaybackParametersChanged(C34589e0 c34589e0) {
        m13602l(m13597g(), 12, new C0667a(15));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlaybackStateChanged(int i13) {
        m13602l(m13597g(), 4, new C0667a(28));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlaybackSuppressionReasonChanged(int i13) {
        m13602l(m13597g(), 6, new C0667a(20));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlayerError(PlaybackException playbackException) {
        C23488c0 c23488c0;
        C4310a c4310aM13597g = (!(playbackException instanceof ExoPlaybackException) || (c23488c0 = ((ExoPlaybackException) playbackException).f6374H) == null) ? m13597g() : m13598h(c23488c0);
        m13602l(c4310aM13597g, 10, new C0680g0(c4310aM13597g, playbackException, 12));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlayerErrorChanged(PlaybackException playbackException) {
        C23488c0 c23488c0;
        m13602l((!(playbackException instanceof ExoPlaybackException) || (c23488c0 = ((ExoPlaybackException) playbackException).f6374H) == null) ? m13597g() : m13598h(c23488c0), 10, new C0667a(22));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlayerStateChanged(boolean z4, int i13) {
        m13602l(m13597g(), -1, new C0667a(16));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPositionDiscontinuity(C34597i0 c34597i0, C34597i0 c34597i1, int i13) {
        if (i13 == 1) {
            this.f17519I = false;
        }
        InterfaceC34599j0 interfaceC34599j0 = this.f17517G;
        interfaceC34599j0.getClass();
        C0332w0 c0332w0 = this.f17523z;
        c0332w0.f1164E = C0332w0.m834o(interfaceC34599j0, (AbstractC41023g0) c0332w0.f1169y, (C23488c0) c0332w0.f1165F, (C34605m0) c0332w0.f1168x);
        C4310a c4310aM13597g = m13597g();
        m13602l(c4310aM13597g, 11, new C2865t(c4310aM13597g, i13, c34597i0, c34597i1));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onRenderedFirstFrame() {
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onRepeatModeChanged(int i13) {
        m13602l(m13597g(), 8, new C4313d(0));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onShuffleModeEnabledChanged(boolean z4) {
        m13602l(m13597g(), 9, new C4313d(4));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onSkipSilenceEnabledChanged(boolean z4) {
        m13602l(m13601k(), 23, new C4313d(25));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onSurfaceSizeChanged(int i13, int i14) {
        m13602l(m13601k(), 24, new C4313d(5));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onTimelineChanged(AbstractC34609o0 abstractC34609o0, int i13) {
        InterfaceC34599j0 interfaceC34599j0 = this.f17517G;
        interfaceC34599j0.getClass();
        C0332w0 c0332w0 = this.f17523z;
        c0332w0.f1164E = C0332w0.m834o(interfaceC34599j0, (AbstractC41023g0) c0332w0.f1169y, (C23488c0) c0332w0.f1165F, (C34605m0) c0332w0.f1168x);
        c0332w0.m850N(((C2830f0) interfaceC34599j0).m8104c0());
        m13602l(m13597g(), 0, new C4316g(1));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onTrackSelectionParametersChanged(C34619t0 c34619t0) {
        m13602l(m13597g(), 19, new C4313d(24));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onTracksChanged(C34623v0 c34623v0) {
        m13602l(m13597g(), 2, new C0667a(25));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onVideoSizeChanged(C34629y0 c34629y0) {
        C4310a c4310aM13601k = m13601k();
        m13602l(c4310aM13601k, 25, new C2818b0(c4310aM13601k, c34629y0));
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onCues(C36933c c36933c) {
        m13602l(m13597g(), 27, new C4313d(3));
    }
}
