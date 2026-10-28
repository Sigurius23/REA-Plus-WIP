package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/BaseAttachmentFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;", "<init>", "()V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public abstract class BaseAttachmentFactory implements AttachmentFactory {
    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactory
    public final InnerAttachmentViewHolder createViewHolder(Message message, MessageListListeners messageListListeners, ViewGroup viewGroup) {
        return super.createViewHolder(message, messageListListeners, viewGroup);
    }
}
