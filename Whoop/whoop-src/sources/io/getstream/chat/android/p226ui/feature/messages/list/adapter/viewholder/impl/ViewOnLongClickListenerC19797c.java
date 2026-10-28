package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import lq0.C24659g;

/* JADX INFO: renamed from: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.c */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ViewOnLongClickListenerC19797c implements View.OnLongClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f74672a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f74673b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f74674c;

    public /* synthetic */ ViewOnLongClickListenerC19797c(int i13, Object obj, Object obj2) {
        this.f74672a = i13;
        this.f74673b = obj;
        this.f74674c = obj2;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        switch (this.f74672a) {
            case 0:
                CustomAttachmentsViewHolder.initializeListeners$lambda$9$lambda$8$lambda$6((MessageListListeners) this.f74673b, (CustomAttachmentsViewHolder) this.f74674c, view);
                return true;
            case 1:
                FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$5((MessageListListeners) this.f74673b, (FileAttachmentsViewHolder) this.f74674c, view);
                return true;
            case 2:
                GiphyAttachmentViewHolder.initializeListeners$lambda$8$lambda$7$lambda$5((MessageListListeners) this.f74673b, (GiphyAttachmentViewHolder) this.f74674c, view);
                return true;
            case 3:
                MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$13((MessageListListeners) this.f74673b, (MediaAttachmentsViewHolder) this.f74674c, view);
                return true;
            case 4:
                MessagePlainTextViewHolder.lambda$8$lambda$7$lambda$4((MessageListListeners) this.f74673b, (MessagePlainTextViewHolder) this.f74674c, view);
                return true;
            default:
                return C24659g.m72022n((C24659g) this.f74673b, (MessageListItem.MessageItem) this.f74674c, view);
        }
    }
}
