package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment;

import android.view.View;
import android.view.ViewGroup;
import io.getstream.chat.android.models.Message;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH&¨\u0006\nÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactory;", "", "canHandle", "", "message", "Lio/getstream/chat/android/models/Message;", "generateQuotedAttachmentView", "Landroid/view/View;", "parent", "Landroid/view/ViewGroup;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface QuotedAttachmentFactory {
    boolean canHandle(Message message);

    View generateQuotedAttachmentView(Message message, ViewGroup parent);
}
