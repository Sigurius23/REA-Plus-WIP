package io.getstream.chat.android.p226ui.feature.messages.list;

import c93.InterfaceC4351m;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.common.state.messages.MessageAction;
import io.getstream.chat.android.p226ui.feature.messages.list.options.message.MessageOptionsDialogFragment;
import l83.InterfaceC23459e;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.i */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19831i implements MessageOptionsDialogFragment.ReactionClickListener, MessageOptionsDialogFragment.MessageOptionClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC23459e f74747a;

    public /* synthetic */ C19831i(InterfaceC23459e interfaceC23459e) {
        this.f74747a = interfaceC23459e;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.options.message.MessageOptionsDialogFragment.MessageOptionClickListener
    public void onMessageOptionClick(MessageAction messageAction) {
        MessageListView.showMessageOptionsDialog$lambda$51$lambda$50((Function1) this.f74747a, messageAction);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.options.message.MessageOptionsDialogFragment.ReactionClickListener
    public void onReactionClick(Message message, String str) {
        MessageListView.showMessageOptionsDialog$lambda$51$lambda$49((InterfaceC4351m) this.f74747a, message, str);
    }
}
