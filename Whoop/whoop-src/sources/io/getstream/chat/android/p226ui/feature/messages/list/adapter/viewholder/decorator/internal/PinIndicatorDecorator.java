package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
import io.getstream.chat.android.models.Message;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemCustomAttachmentsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemFileAttachmentsBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemGiphyAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemLinkAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageMediaAttachmentBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePlainTextBinding;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessagePollBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.CustomAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MediaAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessagePlainTextViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import io.getstream.chat.android.p226ui.font.TextStyleKt;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.utils.extensions.TextViewKt;
import l83.C23454a0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001c2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\"2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/PinIndicatorDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "root", "Landroid/widget/TextView;", "pinIndicatorTextView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "setupPinIndicator", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class PinIndicatorDecorator extends BaseDecorator {
    private final MessageListItemStyle style;
    private final Decorator.Type type;

    public PinIndicatorDecorator(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.type = Decorator.Type.BuiltIn.PIN_INDICATOR;
    }

    private final void setupPinIndicator(ConstraintLayout root, TextView pinIndicatorTextView, MessageListItem.MessageItem data) {
        if (!data.getMessage().getPinned()) {
            pinIndicatorTextView.setVisibility(8);
            root.setBackgroundColor(0);
            return;
        }
        pinIndicatorTextView.setVisibility(0);
        Message message = data.getMessage();
        Context context = root.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        pinIndicatorTextView.setText(MessageKt.getPinnedText(message, context));
        TextStyleKt.setTextStyle(pinIndicatorTextView, this.style.getPinnedMessageIndicatorTextStyle());
        TextViewKt.setStartDrawableWithSize(pinIndicatorTextView, this.style.getPinnedMessageIndicatorIcon(), C19469R.dimen.stream_ui_message_pin_indicator_icon_size);
        root.setBackgroundColor(this.style.getPinnedMessageBackgroundColor());
        ConstraintLayoutKt.updateConstraints(root, new C19223a(16, data, pinIndicatorTextView));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupPinIndicator$lambda$7(MessageListItem.MessageItem messageItem, TextView textView, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3651j(textView.getId()).f5118d.f5185w = messageItem.isMine() ? 1.0f : 0.0f;
        return C23454a0.f92919a;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemCustomAttachmentsBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemFileAttachmentsBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemGiphyAttachmentBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemLinkAttachmentBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessageMediaAttachmentBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePlainTextBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePollBinding binding$stream_chat_android_ui_components_release = viewHolder.getBinding();
        ConstraintLayout root = binding$stream_chat_android_ui_components_release.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        TextView pinIndicatorTextView = binding$stream_chat_android_ui_components_release.pinIndicatorTextView;
        AbstractC22676k.m65749i(pinIndicatorTextView, "pinIndicatorTextView");
        setupPinIndicator(root, pinIndicatorTextView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
