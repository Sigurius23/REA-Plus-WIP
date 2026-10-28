package p087db;

import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;
import androidx.fragment.app.RunnableC1283d;
import androidx.fragment.app.RunnableC1319m;
import androidx.media3.p019ui.PlayerView;
import androidx.media3.p019ui.SubtitleView;
import p004a2.AbstractC0152a;
import p031b9.C2822c1;
import p031b9.C2830f0;
import p516u8.AbstractC34609o0;
import p516u8.C34597i0;
import p516u8.C34605m0;
import p516u8.C34623v0;
import p516u8.C34629y0;
import p516u8.InterfaceC34595h0;
import p516u8.InterfaceC34599j0;
import p576w8.C36933c;
import p607x8.AbstractC38065t;

/* JADX INFO: renamed from: db.e0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ViewOnClickListenerC11846e0 implements InterfaceC34595h0, View.OnClickListener, InterfaceC11881w, InterfaceC11863n {

    /* JADX INFO: renamed from: w */
    public final C34605m0 f38629w = new C34605m0();

    /* JADX INFO: renamed from: x */
    public Object f38630x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ PlayerView f38631y;

    public ViewOnClickListenerC11846e0(PlayerView playerView) {
        this.f38631y = playerView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = PlayerView.f6457j0;
        this.f38631y.m5081j();
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onCues(C36933c c36933c) {
        SubtitleView subtitleView = this.f38631y.f6462I;
        if (subtitleView != null) {
            subtitleView.setCues(c36933c.f158063a);
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlayWhenReadyChanged(boolean z4, int i13) {
        int i14 = PlayerView.f6457j0;
        PlayerView playerView = this.f38631y;
        playerView.m5083l();
        if (!playerView.m5076e() || !playerView.f6483g0) {
            playerView.m5077f(false);
            return;
        }
        C11882x c11882x = playerView.f6465L;
        if (c11882x != null) {
            c11882x.m31851f();
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPlaybackStateChanged(int i13) {
        int i14 = PlayerView.f6457j0;
        PlayerView playerView = this.f38631y;
        playerView.m5083l();
        playerView.m5085n();
        if (!playerView.m5076e() || !playerView.f6483g0) {
            playerView.m5077f(false);
            return;
        }
        C11882x c11882x = playerView.f6465L;
        if (c11882x != null) {
            c11882x.m31851f();
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onPositionDiscontinuity(C34597i0 c34597i0, C34597i0 c34597i1, int i13) {
        C11882x c11882x;
        int i14 = PlayerView.f6457j0;
        PlayerView playerView = this.f38631y;
        if (playerView.m5076e() && playerView.f6483g0 && (c11882x = playerView.f6465L) != null) {
            c11882x.m31851f();
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onRenderedFirstFrame() {
        PlayerView playerView = this.f38631y;
        View view = playerView.f6488y;
        if (view != null) {
            view.setVisibility(4);
            if (!playerView.m5073b()) {
                playerView.m5075d();
                return;
            }
            ImageView imageView = playerView.f6460G;
            if (imageView != null) {
                imageView.setVisibility(4);
            }
        }
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onSurfaceSizeChanged(int i13, int i14) {
        PlayerView playerView = this.f38631y;
        View view = playerView.f6489z;
        if (AbstractC38065t.f163031a == 34 && (view instanceof SurfaceView) && playerView.f6485i0) {
            C11852h0 c11852h0 = playerView.f6459F;
            c11852h0.getClass();
            playerView.f6468O.post(new RunnableC1283d(c11852h0, (SurfaceView) view, new RunnableC1319m(playerView, 22), 5));
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0065  */
    /* JADX WARN: Code duplicated, block: B:20:0x0069  */
    /* JADX WARN: Code duplicated, block: B:22:0x0070  */
    /* JADX WARN: Code duplicated, block: B:24:0x007e A[RETURN] */
    @Override // p516u8.InterfaceC34595h0
    public final void onTracksChanged(C34623v0 c34623v0) {
        Object obj;
        int iMo8132b;
        int iMo8132b2;
        PlayerView playerView = this.f38631y;
        InterfaceC34599j0 interfaceC34599j0 = playerView.f6472S;
        interfaceC34599j0.getClass();
        AbstractC0152a abstractC0152a = (AbstractC0152a) interfaceC34599j0;
        AbstractC34609o0 abstractC34609o0M8104c0 = abstractC0152a.m367A(17) ? ((C2830f0) interfaceC34599j0).m8104c0() : AbstractC34609o0.f145755a;
        if (abstractC34609o0M8104c0.m109408p()) {
            this.f38630x = null;
        } else {
            boolean zM367A = abstractC0152a.m367A(30);
            C34605m0 c34605m0 = this.f38629w;
            if (zM367A) {
                C2830f0 c2830f0 = (C2830f0) interfaceC34599j0;
                if (c2830f0.m8105d0().f145864a.isEmpty()) {
                    obj = this.f38630x;
                    if (obj != null) {
                        iMo8132b = abstractC34609o0M8104c0.mo8132b(obj);
                        if (iMo8132b != -1) {
                            if (((C2830f0) interfaceC34599j0).m8101Z() == abstractC34609o0M8104c0.mo8128f(iMo8132b, c34605m0, false).f145693c) {
                                return;
                            }
                        }
                        this.f38630x = null;
                    }
                } else {
                    c2830f0.m8091L0();
                    if (c2830f0.f11111I0.f11045a.m109408p()) {
                        iMo8132b2 = 0;
                    } else {
                        C2822c1 c2822c1 = c2830f0.f11111I0;
                        iMo8132b2 = c2822c1.f11045a.mo8132b(c2822c1.f11046b.f92976a);
                    }
                    this.f38630x = abstractC34609o0M8104c0.mo8128f(iMo8132b2, c34605m0, true).f145692b;
                }
            } else {
                obj = this.f38630x;
                if (obj != null) {
                    iMo8132b = abstractC34609o0M8104c0.mo8132b(obj);
                    if (iMo8132b != -1) {
                        if (((C2830f0) interfaceC34599j0).m8101Z() == abstractC34609o0M8104c0.mo8128f(iMo8132b, c34605m0, false).f145693c) {
                            return;
                        }
                    }
                    this.f38630x = null;
                }
            }
        }
        playerView.m5086o(false);
    }

    @Override // p516u8.InterfaceC34595h0
    public final void onVideoSizeChanged(C34629y0 c34629y0) {
        PlayerView playerView;
        InterfaceC34599j0 interfaceC34599j0;
        if (c34629y0.equals(C34629y0.f145874d) || (interfaceC34599j0 = (playerView = this.f38631y).f6472S) == null || ((C2830f0) interfaceC34599j0).m8110i0() == 1) {
            return;
        }
        playerView.m5082k();
    }
}
