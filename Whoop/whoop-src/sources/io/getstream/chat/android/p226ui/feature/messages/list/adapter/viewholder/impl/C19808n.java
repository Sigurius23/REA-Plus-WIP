package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentClickListener;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.n */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19808n implements AttachmentClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74704w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListListeners f74705x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ DecoratedBaseMessageItemViewHolder f74706y;

    public /* synthetic */ C19808n(MessageListListeners messageListListeners, DecoratedBaseMessageItemViewHolder decoratedBaseMessageItemViewHolder, int i13) {
        this.f74704w = i13;
        this.f74705x = messageListListeners;
        this.f74706y = decoratedBaseMessageItemViewHolder;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentClickListener
    public final void onAttachmentClick(Attachment attachment) {
        switch (this.f74704w) {
            case 0:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$15(this.f74705x, (MediaAttachmentsViewHolder) this.f74706y, attachment);
                break;
            case 1:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$17(this.f74705x, (MediaAttachmentsViewHolder) this.f74706y, attachment);
                break;
            default:
                FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$8(this.f74705x, (FileAttachmentsViewHolder) this.f74706y, attachment);
                break;
        }
    }
}
