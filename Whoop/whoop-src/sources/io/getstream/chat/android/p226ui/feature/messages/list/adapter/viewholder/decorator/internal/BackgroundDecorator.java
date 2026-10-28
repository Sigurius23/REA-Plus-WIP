package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import android.content.Context;
import android.widget.LinearLayout;
import com.google.android.material.card.MaterialCardView;
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
import io.getstream.chat.android.p226ui.feature.messages.list.background.MessageBackgroundFactory;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 +2\u00020\u0001:\u0001+B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00162\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00192\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001c2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u001a\u0010'\u001a\u00020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006,"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "messageBackgroundFactory", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/background/MessageBackgroundFactory;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class BackgroundDecorator extends BaseDecorator {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private static final float DEFAULT_CORNER_RADIUS = IntKt.dpToPxPrecise(14);
    private final MessageBackgroundFactory messageBackgroundFactory;
    private final Decorator.Type type;

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/BackgroundDecorator$Companion;", "", "<init>", "()V", "DEFAULT_CORNER_RADIUS", "", "getDEFAULT_CORNER_RADIUS$stream_chat_android_ui_components_release", "()F", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: renamed from: getDEFAULT_CORNER_RADIUS$stream_chat_android_ui_components_release */
        public final float m55539xf05a04f5() {
            return BackgroundDecorator.DEFAULT_CORNER_RADIUS;
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public BackgroundDecorator(MessageBackgroundFactory messageBackgroundFactory) {
        AbstractC22676k.m65750j(messageBackgroundFactory, "messageBackgroundFactory");
        this.messageBackgroundFactory = messageBackgroundFactory;
        this.type = Decorator.Type.BuiltIn.BACKGROUND;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.textAndAttachmentMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.deletedMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.fileAttachmentsMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.textAndAttachmentMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        MaterialCardView materialCardView = viewHolder.getBinding().cardView;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().cardView.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        materialCardView.setBackground(messageBackgroundFactory.giphyAppearanceModel(context));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.linkAttachmentMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.imageAttachmentMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.plainTextMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        LinearLayout linearLayout = viewHolder.getBinding().messageContainer;
        MessageBackgroundFactory messageBackgroundFactory = this.messageBackgroundFactory;
        Context context = viewHolder.getBinding().messageContainer.getContext();
        AbstractC22676k.m65749i(context, "getContext(...)");
        linearLayout.setBackground(messageBackgroundFactory.pollMessageBackground(context, data));
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
