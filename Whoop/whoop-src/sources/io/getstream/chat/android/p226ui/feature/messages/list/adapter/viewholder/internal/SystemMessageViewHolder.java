package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal;

import android.view.ViewGroup;
import android.widget.TextView;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemSystemMessageBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0011R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/SystemMessageViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemSystemMessageBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemSystemMessageBinding;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemSystemMessageBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemSystemMessageBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class SystemMessageViewHolder extends BaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemSystemMessageBinding binding;
    private final MessageListItemStyle style;

    public /* synthetic */ SystemMessageViewHolder(ViewGroup viewGroup, MessageListItemStyle messageListItemStyle, StreamUiItemSystemMessageBinding streamUiItemSystemMessageBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, messageListItemStyle, (i13 & 4) != 0 ? StreamUiItemSystemMessageBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemSystemMessageBinding);
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiItemSystemMessageBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        if (diff.getText()) {
            this.binding.messageTextView.setText(MessageKt.getTranslatedText$default(data.getMessage(), null, 1, null));
            TextView messageTextView = this.binding.messageTextView;
            AbstractC22676k.m65749i(messageTextView, "messageTextView");
            TextStyleKt.setTextStyle(messageTextView, this.style.getTextStyleSystemMessage());
            this.binding.messageTextView.setGravity(this.style.getSystemMessageAlignment());
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SystemMessageViewHolder(ViewGroup parent, MessageListItemStyle style, StreamUiItemSystemMessageBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        TextView root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root);
        this.style = style;
        this.binding = binding;
    }
}
