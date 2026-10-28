package p474s;

import p444r.InterfaceC30806b0;

/* JADX INFO: renamed from: s.c0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C31941c0 extends AbstractViewOnTouchListenerC31986n1 {

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ C31965i0 f132637J;

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ C31977l0 f132638K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31941c0(C31977l0 c31977l0, C31977l0 c31977l1, C31965i0 c31965i0) {
        super(c31977l1);
        this.f132638K = c31977l0;
        this.f132637J = c31965i0;
    }

    @Override // p474s.AbstractViewOnTouchListenerC31986n1
    /* JADX INFO: renamed from: b */
    public final InterfaceC30806b0 mo94781b() {
        return this.f132637J;
    }

    @Override // p474s.AbstractViewOnTouchListenerC31986n1
    /* JADX INFO: renamed from: c */
    public final boolean mo94782c() {
        C31977l0 c31977l0 = this.f132638K;
        if (c31977l0.getInternalPopup().mo99431a()) {
            return true;
        }
        c31977l0.f132753F.mo99439j(c31977l0.getTextDirection(), c31977l0.getTextAlignment());
        return true;
    }
}
