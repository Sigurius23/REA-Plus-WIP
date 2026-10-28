package p444r;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import p474s.AbstractViewOnTouchListenerC31986n1;
import p474s.C31944d;
import p474s.C31948e;
import p474s.C31956g;
import p474s.C31960h;

/* JADX INFO: renamed from: r.b */
/* JADX INFO: loaded from: classes5.dex */
public final class C30805b extends AbstractViewOnTouchListenerC31986n1 {

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ int f126987J = 0;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ View f126988K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30805b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f126988K = actionMenuItemView;
    }

    @Override // p474s.AbstractViewOnTouchListenerC31986n1
    /* JADX INFO: renamed from: b */
    public final InterfaceC30806b0 mo94781b() {
        C31944d c31944d;
        switch (this.f126987J) {
            case 0:
                AbstractC30807c abstractC30807c = ((ActionMenuItemView) this.f126988K).f4220F;
                if (abstractC30807c == null || (c31944d = ((C31948e) abstractC30807c).f132655a.f132697T) == null) {
                    return null;
                }
                return c31944d.m94834a();
            default:
                C31944d c31944d2 = ((C31956g) this.f126988K).f132675w.f132696S;
                if (c31944d2 == null) {
                    return null;
                }
                return c31944d2.m94834a();
        }
    }

    @Override // p474s.AbstractViewOnTouchListenerC31986n1
    /* JADX INFO: renamed from: c */
    public final boolean mo94782c() {
        InterfaceC30806b0 interfaceC30806b0Mo94781b;
        switch (this.f126987J) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f126988K;
                InterfaceC30817k interfaceC30817k = actionMenuItemView.f4229z;
                return interfaceC30817k != null && interfaceC30817k.mo3255a(actionMenuItemView.f4226w) && (interfaceC30806b0Mo94781b = mo94781b()) != null && interfaceC30806b0Mo94781b.mo94784a();
            default:
                ((C31956g) this.f126988K).f132675w.m99451l();
                return true;
        }
    }

    @Override // p474s.AbstractViewOnTouchListenerC31986n1
    /* JADX INFO: renamed from: d */
    public boolean mo94783d() {
        switch (this.f126987J) {
            case 1:
                C31960h c31960h = ((C31956g) this.f126988K).f132675w;
                if (c31960h.f132698U != null) {
                    return false;
                }
                c31960h.m99449c();
                return true;
            default:
                return super.mo94783d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30805b(C31956g c31956g, C31956g c31956g2) {
        super(c31956g2);
        this.f126988K = c31956g;
    }
}
