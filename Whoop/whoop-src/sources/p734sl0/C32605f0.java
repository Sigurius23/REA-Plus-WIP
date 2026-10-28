package p734sl0;

import c93.InterfaceC4339a;
import com.whoop.bot.view.AiConversationFragment;

/* JADX INFO: renamed from: sl0.f0 */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C32605f0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f135131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AiConversationFragment f135132x;

    public /* synthetic */ C32605f0(AiConversationFragment aiConversationFragment, int i13) {
        this.f135131w = i13;
        this.f135132x = aiConversationFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f135131w) {
            case 0:
                return AiConversationFragment.m18266Y(this.f135132x);
            case 1:
                return AiConversationFragment.m18240C0(this.f135132x);
            case 2:
                return AiConversationFragment.m18267Z(this.f135132x);
            case 3:
                return AiConversationFragment.m18248G0(this.f135132x);
            case 4:
                return AiConversationFragment.m18268a0(this.f135132x);
            case 5:
                return AiConversationFragment.m18284q0(this.f135132x);
            case 6:
                return AiConversationFragment.m18269b0(this.f135132x);
            default:
                return AiConversationFragment.m18242D0(this.f135132x);
        }
    }
}
