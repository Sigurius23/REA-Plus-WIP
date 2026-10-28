package p031b9;

import android.media.AudioManager;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.sidesheet.SideSheetBehavior;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.MessageListScrollHelper;
import java.util.function.IntConsumer;
import live.hms.video.media.capturers.camera.CameraControl;
import od1.AbstractC27857t;
import p012ab.C0667a;
import p047c9.C4317h;
import p465rm.C31517b;
import p465rm.C31520c;
import p465rm.C31571u;
import p465rm.SurfaceHolderCallbackC31565r;
import p513u4.AbstractC34514b;
import q63.AbstractC30007c;
import sc2.C32386y;
import td3.AbstractC33722b;
import td3.AbstractC33729i;
import td3.C33723c;
import td3.C33724d;
import td3.C33734n;

/* JADX INFO: renamed from: b9.g0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class RunnableC2833g0 implements Runnable {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f11178w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ int f11179x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f11180y;

    public /* synthetic */ RunnableC2833g0(C2848l0 c2848l0, int i13, boolean z4) {
        this.f11178w = 0;
        this.f11180y = c2848l0;
        this.f11179x = i13;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f11178w) {
            case 0:
                C2848l0 c2848l0 = (C2848l0) this.f11180y;
                C4317h c4317h = c2848l0.f11276W;
                int i13 = ((AbstractC2829f) c2848l0.f11302w[this.f11179x].f11233e).f11095x;
                c4317h.m13602l(c4317h.m13601k(), 1033, new C0667a(24));
                break;
            case 1:
                ((IntConsumer) this.f11180y).accept(this.f11179x);
                break;
            case 2:
                MessageListScrollHelper.scrollToMessage$lambda$12$lambda$11$lambda$10$lambda$9((RecyclerView) this.f11180y, this.f11179x);
                break;
            case 3:
                CameraControl.setFlash$lambda$13((CameraControl) this.f11180y, this.f11179x);
                break;
            case 4:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.f11180y;
                View view = (View) sideSheetBehavior.f21034p.get();
                if (view != null) {
                    sideSheetBehavior.m15778L(view, this.f11179x, false);
                }
                break;
            case 5:
                ((AbstractC27857t) this.f11180y).m84021k(this.f11179x);
                break;
            case 6:
                C31520c c31520c = (C31520c) ((C31517b) this.f11180y).f130032c;
                int i14 = this.f11179x;
                if (i14 == -3 || i14 == -2) {
                    if (i14 == -2) {
                        SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r = c31520c.f130065c;
                        if (surfaceHolderCallbackC31565r != null) {
                            C31571u c31571u = surfaceHolderCallbackC31565r.f130359w;
                            boolean zM97211d0 = c31571u.m97211d0();
                            c31571u.m97230y0(0, zM97211d0 ? 2 : 1, zM97211d0);
                        }
                        c31520c.m97111b(2);
                    } else {
                        c31520c.m97111b(3);
                    }
                } else if (i14 == -1) {
                    SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r2 = c31520c.f130065c;
                    if (surfaceHolderCallbackC31565r2 != null) {
                        C31571u c31571u2 = surfaceHolderCallbackC31565r2.f130359w;
                        boolean zM97211d1 = c31571u2.m97211d0();
                        c31571u2.m97230y0(-1, zM97211d1 ? 2 : 1, zM97211d1);
                    }
                    c31520c.m97110a();
                } else if (i14 == 1) {
                    c31520c.m97111b(1);
                    SurfaceHolderCallbackC31565r surfaceHolderCallbackC31565r3 = c31520c.f130065c;
                    if (surfaceHolderCallbackC31565r3 != null) {
                        C31571u c31571u3 = surfaceHolderCallbackC31565r3.f130359w;
                        c31571u3.m97230y0(1, 1, c31571u3.m97211d0());
                    }
                } else {
                    AbstractC30007c.m91850t(38, i14, "Unknown focus change type: ", "AudioFocusManager");
                }
                break;
            case 7:
                C32386y.m100948Y((C32386y) this.f11180y, this.f11179x);
                break;
            case 8:
                C33724d c33724d = ((C33723c) this.f11180y).f141053b;
                C33734n c33734n = c33724d.f141044g;
                AbstractC33729i abstractC33729i = c33724d.f141045h;
                if (!c33734n.f141106J || c33734n.f141114z == 1) {
                    abstractC33729i.mo18124b(this.f11179x);
                } else {
                    c33734n.f141106J = false;
                    AbstractC33722b abstractC33722bM106606a = AbstractC33722b.m106606a();
                    try {
                        abstractC33722bM106606a.m106609d(abstractC33729i);
                        break;
                    } catch (Exception unused) {
                    }
                    try {
                        abstractC33722bM106606a.mo106608c(c33724d.f141043f, c33734n, abstractC33729i, c33724d.f141046i);
                    } catch (Exception unused2) {
                        return;
                    }
                }
                break;
            case 9:
                ((AbstractC34514b) this.f11180y).mo50020j(this.f11179x);
                break;
            default:
                ((AudioManager.OnAudioFocusChangeListener) ((C31517b) this.f11180y).f130032c).onAudioFocusChange(this.f11179x);
                break;
        }
    }

    public /* synthetic */ RunnableC2833g0(Object obj, int i13, int i14) {
        this.f11178w = i14;
        this.f11180y = obj;
        this.f11179x = i13;
    }
}
