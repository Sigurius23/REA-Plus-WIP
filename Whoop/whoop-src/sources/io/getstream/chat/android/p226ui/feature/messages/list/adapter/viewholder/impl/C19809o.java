package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentLongClickListener;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.o */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C19809o implements AttachmentLongClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74707w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListListeners f74708x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ DecoratedBaseMessageItemViewHolder f74709y;

    public /* synthetic */ C19809o(MessageListListeners messageListListeners, DecoratedBaseMessageItemViewHolder decoratedBaseMessageItemViewHolder, int i13) {
        this.f74707w = i13;
        this.f74708x = messageListListeners;
        this.f74709y = decoratedBaseMessageItemViewHolder;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AttachmentLongClickListener
    public final void onAttachmentLongClick() {
        switch (this.f74707w) {
            case 0:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$16(this.f74708x, (MediaAttachmentsViewHolder) this.f74709y);
                break;
            case 1:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$18(this.f74708x, (MediaAttachmentsViewHolder) this.f74709y);
                break;
            default:
                FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$7(this.f74708x, (FileAttachmentsViewHolder) this.f74709y);
                break;
        }
    }
}
