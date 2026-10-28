package io.getstream.chat.android.p226ui.viewmodel.messages;

import c93.InterfaceC4339a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.viewmodel.messages.q */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19953q implements MessageListView.MessageFlagHandler, MessageListView.AttachmentDownloadHandler, MessageListView.OnScrollToBottomHandler {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ MessageListView f74889w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListViewModel f74890x;

    public /* synthetic */ C19953q(MessageListView messageListView, MessageListViewModel messageListViewModel) {
        this.f74889w = messageListView;
        this.f74890x = messageListViewModel;
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.AttachmentDownloadHandler
    public void onAttachmentDownload(InterfaceC4339a interfaceC4339a) {
        MessageListViewModelBinding.bindView$lambda$17(this.f74889w, this.f74890x, interfaceC4339a);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.MessageFlagHandler
    public void onMessageFlag(Message message) {
        MessageListViewModelBinding.bindView$lambda$8(this.f74890x, this.f74889w, message);
    }

    @Override // io.getstream.chat.android.ui.feature.messages.list.MessageListView.OnScrollToBottomHandler
    public void onScrollToBottom() {
        MessageListViewModelBinding.bindView$lambda$20(this.f74890x, this.f74889w);
    }

    public /* synthetic */ C19953q(MessageListViewModel messageListViewModel, MessageListView messageListView) {
        this.f74890x = messageListViewModel;
        this.f74889w = messageListView;
    }
}
