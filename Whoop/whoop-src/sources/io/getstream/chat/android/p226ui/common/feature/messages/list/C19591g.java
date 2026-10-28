package io.getstream.chat.android.p226ui.common.feature.messages.list;

import androidx.health.platform.client.proto.C1533u;
import io.getstream.chat.android.models.Poll;
import io.getstream.chat.android.p226ui.common.state.messages.list.MessageListState;
import l83.C23454a0;
import n23.AbstractC26202e;
import n23.AbstractC26205h;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.common.feature.messages.list.g */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19591g implements Function1 {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74463w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListController f74464x;

    public /* synthetic */ C19591g(MessageListController messageListController, int i13) {
        this.f74463w = i13;
        this.f74464x = messageListController;
    }

    @Override // p715kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f74463w) {
            case 0:
                MessageListController.C195751.invokeSuspend$lambda$2(this.f74464x, (MessageListState) obj);
                break;
            case 1:
                MessageListController.unblockUser$lambda$145(this.f74464x, (AbstractC26202e) obj);
                break;
            case 2:
                MessageListController.removeAttachment$lambda$155$lambda$151(this.f74464x, (AbstractC26202e) obj);
                break;
            case 3:
                MessageListController.removeAttachment$lambda$155$lambda$153(this.f74464x, (AbstractC26202e) obj);
                break;
            case 4:
                MessageListController.banUser$lambda$131(this.f74464x, (AbstractC26202e) obj);
                break;
            case 5:
                MessageListController.unpinMessage$lambda$104(this.f74464x, (AbstractC26202e) obj);
                break;
            case 6:
                MessageListController.flagUser$lambda$139(this.f74464x, (AbstractC26202e) obj);
                break;
            case 7:
                MessageListController.unbanUser$lambda$133(this.f74464x, (AbstractC26202e) obj);
                break;
            case 8:
                MessageListController.resendMessage$lambda$106(this.f74464x, (AbstractC26202e) obj);
                break;
            case 9:
                MessageListController.blockUser$lambda$143(this.f74464x, (AbstractC26202e) obj);
                break;
            case 10:
                MessageListController.muteUser$lambda$127(this.f74464x, (AbstractC26202e) obj);
                break;
            case 11:
                MessageListController.removeShadowBanFromUser$lambda$137(this.f74464x, (AbstractC26202e) obj);
                break;
            case 12:
                MessageListController.castVote$lambda$113(this.f74464x, (AbstractC26202e) obj);
                break;
            case 13:
                MessageListController.closePoll$lambda$116(this.f74464x, (Poll) obj);
                break;
            case 14:
                MessageListController.closePoll$lambda$117(this.f74464x, (AbstractC26202e) obj);
                break;
            case 15:
                MessageListController.removeVote$lambda$115(this.f74464x, (AbstractC26202e) obj);
                break;
            case 16:
                MessageListController.unmuteUser$lambda$129(this.f74464x, (AbstractC26202e) obj);
                break;
            case C1533u.MAX_FIELD_NUMBER /* 17 */:
                MessageListController.focusChannelMessage$lambda$75(this.f74464x, (AbstractC26205h) obj);
                break;
            case C1533u.AVG_FIELD_NUMBER /* 18 */:
                MessageListController.pinMessage$lambda$101(this.f74464x, (AbstractC26202e) obj);
                break;
            case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                MessageListController.shadowBanUser$lambda$135(this.f74464x, (AbstractC26202e) obj);
                break;
            case 20:
                MessageListController.unmuteUser$lambda$111(this.f74464x, (AbstractC26202e) obj);
                break;
            case 21:
                MessageListController.unflagUser$lambda$141(this.f74464x, (AbstractC26202e) obj);
                break;
            default:
                MessageListController.muteUser$lambda$109(this.f74464x, (AbstractC26202e) obj);
                break;
        }
        return C23454a0.f92919a;
    }
}
