package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import androidx.constraintlayout.widget.Guideline;
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
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 52\u00020\u0001:\u00015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001a2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u001d2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010!\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020 2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b!\u0010\"J\u001f\u0010$\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020#2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b$\u0010%J\u001f\u0010'\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020&2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b'\u0010(J\u001f\u0010*\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020)2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b*\u0010+J\u001f\u0010-\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020,2\u0006\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u001a\u00101\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00066"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/MaxPossibleWidthDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Landroidx/constraintlayout/widget/Guideline;", "marginStart", "marginEnd", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "applyMaxPossibleWidth", "(Landroidx/constraintlayout/widget/Guideline;Landroidx/constraintlayout/widget/Guideline;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "", "isTheirs", "", "getMaxWidthFactor", "(Z)F", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MaxPossibleWidthDecorator extends BaseDecorator {
    private static final float END_PERCENT = 1.0f;
    private static final float START_PERCENT = 0.0f;
    private final MessageListItemStyle style;
    private final Decorator.Type type;

    public MaxPossibleWidthDecorator(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.type = Decorator.Type.BuiltIn.MAX_POSSIBLE_WIDTH;
    }

    private final void applyMaxPossibleWidth(Guideline marginStart, Guideline marginEnd, MessageListItem.MessageItem data) {
        float maxWidthFactor = data.isTheirs() ? 0.0f : 0.0f + getMaxWidthFactor(data.isTheirs());
        float maxWidthFactor2 = data.isTheirs() ? 1.0f - getMaxWidthFactor(data.isTheirs()) : 1.0f;
        marginStart.setGuidelinePercent(maxWidthFactor);
        marginEnd.setGuidelinePercent(maxWidthFactor2);
    }

    private final float getMaxWidthFactor(boolean isTheirs) {
        return 1 - (isTheirs ? this.style.getMessageMaxWidthFactorTheirs() : this.style.getMessageMaxWidthFactorMine());
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateDeletedMessage(MessageDeletedViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateFileAttachmentsMessage(FileAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyMessage(GiphyViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateLinkAttachmentsMessage(LinkAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        Guideline marginStart = viewHolder.getBinding().marginStart;
        AbstractC22676k.m65749i(marginStart, "marginStart");
        Guideline marginEnd = viewHolder.getBinding().marginEnd;
        AbstractC22676k.m65749i(marginEnd, "marginEnd");
        applyMaxPossibleWidth(marginStart, marginEnd, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
