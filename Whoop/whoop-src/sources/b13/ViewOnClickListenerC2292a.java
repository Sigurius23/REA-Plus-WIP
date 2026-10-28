package b13;

import android.app.Activity;
import android.view.View;
import bh3.InterfaceC3255b;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import com.stripe.android.stripe3ds2.views.ThreeDS2Button;
import com.whoop.data.remote.domain.response.onboarding.OnboardingInfo;
import com.whoop.domain.model.teams.TeamUserListing;
import com.whoop.p069ui.WhoopEditText;
import com.whoop.p069ui.drawer.strapsettings.connectstrap.BleConnectStrapActivity;
import eq0.AbstractC13552x1;
import io.getstream.android.push.permissions.snackbar.SnackbarNotificationPermissionHandler;
import io.getstream.chat.android.p226ui.common.state.channels.actions.ChannelAction;
import io.getstream.chat.android.p226ui.feature.channels.actions.internal.ChannelActionsDialogFragment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionItem;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal.MessageOptionsView;
import io.getstream.chat.android.p226ui.feature.pinned.list.internal.PinnedMessageListAdapter;
import io.getstream.chat.android.p226ui.feature.search.internal.SearchResultListAdapter;
import kc3.ExecutorC22364d;
import lq0.C24659g;
import mr.C25908n;
import p715kotlin.jvm.functions.Function1;
import q30.C29897c;
import rq0.C31659d1;
import rq0.C31696t0;
import s40.C32190y0;
import s40.C32192z0;

/* JADX INFO: renamed from: b13.a */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class ViewOnClickListenerC2292a implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f9090w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f9091x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ Object f9092y;

    public /* synthetic */ ViewOnClickListenerC2292a(int i13, Object obj, Object obj2) {
        this.f9090w = i13;
        this.f9091x = obj;
        this.f9092y = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i13 = this.f9090w;
        Object obj = this.f9092y;
        Object obj2 = this.f9091x;
        switch (i13) {
            case 0:
                ((SnackbarNotificationPermissionHandler) obj2).openSystemSettings((Activity) obj);
                break;
            case 1:
                ((WhoopEditText) obj2).m26674V((InterfaceC3255b) obj, view);
                break;
            case 2:
                ChannelActionsDialogFragment.bindChannelOptions$lambda$7$lambda$6((ChannelActionsDialogFragment) obj2, (ChannelAction) obj, view);
                break;
            case 3:
                FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$6((MessageListListeners) obj2, (FileAttachmentsViewHolder) obj, view);
                break;
            case 4:
                MessageDeletedViewHolder.lambda$3$lambda$2$lambda$0((MessageListListeners) obj2, (MessageDeletedViewHolder) obj, view);
                break;
            case 5:
                PinnedMessageListAdapter.MessagePreviewViewHolder._init_$lambda$0((PinnedMessageListAdapter) obj2, (PinnedMessageListAdapter.MessagePreviewViewHolder) obj, view);
                break;
            case 6:
                SearchResultListAdapter.MessagePreviewViewHolder._init_$lambda$0((SearchResultListAdapter) obj2, (SearchResultListAdapter.MessagePreviewViewHolder) obj, view);
                break;
            case 7:
                C24659g.m72021m((C24659g) obj2, (MessageListItem.MessageItem) obj, view);
                break;
            case 8:
                C25908n c25908n = (C25908n) obj2;
                c25908n.getClass();
                ((View.OnClickListener) obj).onClick(view);
                c25908n.m76610a(1);
                break;
            case 9:
                BleConnectStrapActivity.m27107m1((OnboardingInfo) obj2, (BleConnectStrapActivity) obj, view);
                break;
            case 10:
                C31696t0.m98210L0((AbstractC13552x1) obj2, (C31696t0) obj, view);
                break;
            case 11:
                C31659d1.m97923c((Function1) obj2, (TeamUserListing) obj, view);
                break;
            case 12:
                ((C32192z0) obj2).m100114a(((C32190y0) obj).getBindingAdapterPosition());
                break;
            case 13:
                ExecutorC22364d executorC22364d = ChallengeActivity.f22425M;
                ((ThreeDS2Button) obj2).setClickable(false);
                ((ChallengeActivity) obj).m16877r().m105885g(C29897c.f122151w);
                break;
            default:
                MessageOptionsView.setMessageOptions$lambda$1$lambda$0((MessageOptionsView) obj2, (MessageOptionItem) obj, view);
                break;
        }
    }
}
