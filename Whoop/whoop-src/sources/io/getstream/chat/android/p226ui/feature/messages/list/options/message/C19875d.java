package io.getstream.chat.android.p226ui.feature.messages.list.options.message;

import io.getstream.chat.android.models.Reaction;
import io.getstream.chat.android.models.User;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.internal.MessageOptionsView;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener;
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.user.internal.UserReactionsView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.options.message.d */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19875d implements MessageOptionsView.MessageActionClickListener, UserReactionsView.UserReactionClickListener, ReactionClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MessageOptionsDialogFragment f74791w;

    public /* synthetic */ C19875d(MessageOptionsDialogFragment messageOptionsDialogFragment) {
        this.f74791w = messageOptionsDialogFragment;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.options.message.internal.MessageOptionsView.MessageActionClickListener
    public void onMessageActionClick(MessageAction messageAction) {
        MessageOptionsDialogFragment.setupMessageOptions$lambda$17$lambda$16(this.f74791w, messageAction);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.reactions.ReactionClickListener
    public void onReactionClick(String str) {
        MessageOptionsDialogFragment.setupEditReactionsView$lambda$6$lambda$5(this.f74791w, str);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.reactions.user.internal.UserReactionsView.UserReactionClickListener
    public void onUserReactionClick(User user, Reaction reaction) {
        MessageOptionsDialogFragment.setupUserReactionsView$lambda$13$lambda$12(this.f74791w, user, reaction);
    }
}
