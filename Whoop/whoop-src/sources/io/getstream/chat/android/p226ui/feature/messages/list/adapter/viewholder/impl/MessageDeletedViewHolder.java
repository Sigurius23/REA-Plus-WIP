package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import b13.ViewOnClickListenerC2292a;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageDeletedBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FootnoteView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;)V", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "Ll83/a0;", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "getStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageDeletedBinding;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MessageDeletedViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemMessageDeletedBinding binding;
    private final MessageListListeners listeners;
    private final MessageListItemStyle style;

    public /* synthetic */ MessageDeletedViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, MessageListItemStyle messageListItemStyle, StreamUiItemMessageDeletedBinding streamUiItemMessageDeletedBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, messageListItemStyle, (i13 & 16) != 0 ? StreamUiItemMessageDeletedBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMessageDeletedBinding);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void lambda$3$lambda$2$lambda$0(MessageListListeners messageListListeners, MessageDeletedViewHolder messageDeletedViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) messageDeletedViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 lambda$3$lambda$2$lambda$1(MessageListListeners messageListListeners, MessageDeletedViewHolder messageDeletedViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) messageDeletedViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    public final StreamUiItemMessageDeletedBinding getBinding() {
        return this.binding;
    }

    public final MessageListItemStyle getStyle() {
        return this.style;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        super.bindData(data, diff);
        if (diff.getDeleted()) {
            TextView deleteLabel = this.binding.deleteLabel;
            AbstractC22676k.m65749i(deleteLabel, "deleteLabel");
            TextStyleKt.setTextStyle(deleteLabel, data.isTheirs() ? this.style.getTextStyleMessageDeletedTheirs() : this.style.getTextStyleMessageDeletedMine());
            LinearLayout messageContainer = this.binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C1141d c1141d = (C1141d) layoutParams;
            c1141d.f5016E = data.isTheirs() ? 0.0f : 1.0f;
            messageContainer.setLayoutParams(c1141d);
            FootnoteView footnote = this.binding.footnote;
            AbstractC22676k.m65749i(footnote, "footnote");
            ViewGroup.LayoutParams layoutParams2 = footnote.getLayoutParams();
            if (layoutParams2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            C1141d c1141d2 = (C1141d) layoutParams2;
            c1141d2.f5016E = data.isTheirs() ? 0.0f : 1.0f;
            footnote.setLayoutParams(c1141d2);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MessageDeletedViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, MessageListItemStyle style, StreamUiItemMessageDeletedBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(style, "style");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.style = style;
        this.binding = binding;
        if (messageListListeners != null) {
            binding.messageContainer.setOnClickListener(new ViewOnClickListenerC2292a(4, messageListListeners, this));
            binding.footnote.setOnThreadClickListener(new C19223a(18, messageListListeners, this));
        }
    }
}
