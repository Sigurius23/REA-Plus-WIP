package io.getstream.chat.android.p226ui.helper.transformer;

import android.widget.TextView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\tÀ\u0006\u0003"}, m65681d2 = {"Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "", "Landroid/widget/TextView;", "textView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "messageItem", "Ll83/a0;", "transformAndApply", "(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public interface ChatMessageTextTransformer {
    void transformAndApply(TextView textView, MessageListItem.MessageItem messageItem);
}
