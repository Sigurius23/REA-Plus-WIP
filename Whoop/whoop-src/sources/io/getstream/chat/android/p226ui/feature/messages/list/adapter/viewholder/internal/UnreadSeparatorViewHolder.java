package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemUnreadSeparatorBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\r\u001a\u00020\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/internal/UnreadSeparatorViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "messageListListeners", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "onAttachedToWindow", "()V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;", "getBinding$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemUnreadSeparatorBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class UnreadSeparatorViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.UnreadSeparatorItem> {
    private final StreamUiItemUnreadSeparatorBinding binding;
    private final MessageListListeners messageListListeners;
    private final MessageListItemStyle style;

    public /* synthetic */ UnreadSeparatorViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, MessageListItemStyle messageListItemStyle, StreamUiItemUnreadSeparatorBinding streamUiItemUnreadSeparatorBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, messageListItemStyle, (i13 & 16) != 0 ? StreamUiItemUnreadSeparatorBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemUnreadSeparatorBinding);
    }

    /* JADX INFO: renamed from: getBinding$stream_chat_android_ui_components_release, reason: from getter */
    public final StreamUiItemUnreadSeparatorBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void onAttachedToWindow() {
        MessageListView.OnUnreadLabelReachedListener unreadLabelReachedListener;
        super.onAttachedToWindow();
        MessageListListeners messageListListeners = this.messageListListeners;
        if (messageListListeners == null || (unreadLabelReachedListener = messageListListeners.getUnreadLabelReachedListener()) == null) {
            return;
        }
        unreadLabelReachedListener.onUnreadLabelReached();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.UnreadSeparatorItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        this.binding.getRoot().setBackgroundColor(this.style.getUnreadSeparatorBackgroundColor());
        TextView unreadSeparatorLabel = this.binding.unreadSeparatorLabel;
        AbstractC22676k.m65749i(unreadSeparatorLabel, "unreadSeparatorLabel");
        TextStyleKt.setTextStyle(unreadSeparatorLabel, this.style.getUnreadSeparatorTextStyle());
        this.binding.unreadSeparatorLabel.setText(getContext().getResources().getString(C19469R.string.stream_ui_message_list_unread_separator));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public UnreadSeparatorViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, MessageListItemStyle style, StreamUiItemUnreadSeparatorBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        FrameLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.messageListListeners = messageListListeners;
        this.style = style;
        this.binding = binding;
    }
}
