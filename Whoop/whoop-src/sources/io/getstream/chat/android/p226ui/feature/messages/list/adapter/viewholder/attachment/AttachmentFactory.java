package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\"\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016¨\u0006\fÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactory;", "", "canHandle", "", "message", "Lio/getstream/chat/android/models/Message;", "createViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/InnerAttachmentViewHolder;", "listeners", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "parent", "Landroid/view/ViewGroup;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface AttachmentFactory {

    @Metadata(m65682k = 3, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class DefaultImpls {
        @Deprecated
        public static InnerAttachmentViewHolder createViewHolder(AttachmentFactory attachmentFactory, Message message, MessageListListeners messageListListeners, ViewGroup parent) {
            AbstractC22676k.m65750j(message, "message");
            AbstractC22676k.m65750j(parent, "parent");
            return AttachmentFactory.super.createViewHolder(message, messageListListeners, parent);
        }
    }

    boolean canHandle(Message message);

    default InnerAttachmentViewHolder createViewHolder(Message message, MessageListListeners listeners, ViewGroup parent) {
        AbstractC22676k.m65750j(message, "message");
        AbstractC22676k.m65750j(parent, "parent");
        return InnerAttachmentViewHolder.INSTANCE.stub(parent);
    }
}
