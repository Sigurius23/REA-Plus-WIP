package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.e */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnClickListenerC19799e implements View.OnClickListener {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f74678w = 1;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ MessageListListeners f74679x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ GiphyAttachmentViewHolder f74680y;

    public /* synthetic */ ViewOnClickListenerC19799e(MessageListListeners messageListListeners, GiphyAttachmentViewHolder giphyAttachmentViewHolder) {
        this.f74679x = messageListListeners;
        this.f74680y = giphyAttachmentViewHolder;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f74678w) {
            case 0:
                GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$1(this.f74680y, this.f74679x, view);
                break;
            default:
                GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$6(this.f74679x, this.f74680y, view);
                break;
        }
    }

    public /* synthetic */ ViewOnClickListenerC19799e(GiphyAttachmentViewHolder giphyAttachmentViewHolder, MessageListListeners messageListListeners) {
        this.f74680y = giphyAttachmentViewHolder;
        this.f74679x = messageListListeners;
    }
}
