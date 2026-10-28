package jo;

import android.view.TextureView;
import android.view.View;
import com.google.android.exoplayer2.p051ui.StyledPlayerView;
import com.google.android.exoplayer2.p051ui.SubtitleView;
import java.util.List;
import mo.C25737r;
import p465rm.AbstractC31558o1;
import p465rm.C31516a1;
import p465rm.C31552m1;
import p465rm.C31564q1;
import p465rm.C31571u;
import p465rm.C31574v0;
import p465rm.InterfaceC31519b1;
import p465rm.InterfaceC31582z0;

/* JADX INFO: renamed from: jo.x */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnLayoutChangeListenerC21835x implements InterfaceC31582z0, View.OnLayoutChangeListener, View.OnClickListener, InterfaceC21829r {

    /* JADX INFO: renamed from: w */
    public final C31552m1 f84237w = new C31552m1();

    /* JADX INFO: renamed from: x */
    public Object f84238x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ StyledPlayerView f84239y;

    public ViewOnLayoutChangeListenerC21835x(StyledPlayerView styledPlayerView) {
        this.f84239y = styledPlayerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = StyledPlayerView.f20400d0;
        this.f84239y.m15572g();
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onCues(List list) {
        SubtitleView subtitleView = this.f84239y.f20403G;
        if (subtitleView != null) {
            subtitleView.setCues(list);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i24) {
        StyledPlayerView.m15566a((TextureView) view, this.f84239y.f20421b0);
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlayWhenReadyChanged(boolean z4, int i13) {
        int i14 = StyledPlayerView.f20400d0;
        StyledPlayerView styledPlayerView = this.f84239y;
        styledPlayerView.m15574i();
        if (!styledPlayerView.m15567b() || !styledPlayerView.f20419W) {
            styledPlayerView.m15568c(false);
            return;
        }
        C21830s c21830s = styledPlayerView.f20406J;
        if (c21830s != null) {
            c21830s.m61761f();
        }
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onPlaybackStateChanged(int i13) {
        int i14 = StyledPlayerView.f20400d0;
        StyledPlayerView styledPlayerView = this.f84239y;
        styledPlayerView.m15574i();
        styledPlayerView.m15576k();
        if (!styledPlayerView.m15567b() || !styledPlayerView.f20419W) {
            styledPlayerView.m15568c(false);
            return;
        }
        C21830s c21830s = styledPlayerView.f20406J;
        if (c21830s != null) {
            c21830s.m61761f();
        }
    }

    @Override // p465rm.InterfaceC31582z0
    public final void onRenderedFirstFrame() {
        View view = this.f84239y.f20425y;
        if (view != null) {
            view.setVisibility(4);
        }
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: p */
    public final void mo61775p(C31516a1 c31516a1, C31516a1 c31516a2, int i13) {
        C21830s c21830s;
        int i14 = StyledPlayerView.f20400d0;
        StyledPlayerView styledPlayerView = this.f84239y;
        if (styledPlayerView.m15567b() && styledPlayerView.f20419W && (c21830s = styledPlayerView.f20406J) != null) {
            c21830s.m61761f();
        }
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: q */
    public final void mo61776q(C25737r c25737r) {
        int i13 = StyledPlayerView.f20400d0;
        this.f84239y.m15573h();
    }

    @Override // p465rm.InterfaceC31582z0
    /* JADX INFO: renamed from: r */
    public final void mo61777r(C31564q1 c31564q1) {
        int iMo97128b;
        StyledPlayerView styledPlayerView = this.f84239y;
        InterfaceC31519b1 interfaceC31519b1 = styledPlayerView.f20409M;
        interfaceC31519b1.getClass();
        C31571u c31571u = (C31571u) interfaceC31519b1;
        AbstractC31558o1 abstractC31558o1M97209b0 = c31571u.m97209b0();
        if (abstractC31558o1M97209b0.m97175p()) {
            this.f84238x = null;
        } else {
            c31571u.m97198B0();
            boolean zIsEmpty = c31571u.f130392K0.f130449i.f77584d.f130358w.isEmpty();
            C31552m1 c31552m1 = this.f84237w;
            if (zIsEmpty) {
                Object obj = this.f84238x;
                if (obj != null) {
                    int iMo97128b2 = abstractC31558o1M97209b0.mo97128b(obj);
                    if (iMo97128b2 != -1) {
                        if (c31571u.m97206Y() == abstractC31558o1M97209b0.mo97131f(iMo97128b2, c31552m1, false).f130286y) {
                            return;
                        }
                    }
                    this.f84238x = null;
                }
            } else {
                c31571u.m97198B0();
                if (c31571u.f130392K0.f130441a.m97175p()) {
                    iMo97128b = 0;
                } else {
                    C31574v0 c31574v0 = c31571u.f130392K0;
                    iMo97128b = c31574v0.f130441a.mo97128b(c31574v0.f130442b.f136238a);
                }
                this.f84238x = abstractC31558o1M97209b0.mo97131f(iMo97128b, c31552m1, true).f130285x;
            }
        }
        styledPlayerView.m15577l(false);
    }
}
