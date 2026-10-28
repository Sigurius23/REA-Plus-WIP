package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.internal;

import a81.C0561l;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.Space;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.C1153p;
import androidx.constraintlayout.widget.ConstraintLayout;
import io.getstream.chat.android.client.internal.offline.repository.domain.queryChannels.internal.C19223a;
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
import io.getstream.chat.android.p226ui.feature.messages.list.reactions.view.internal.ViewReactionsView;
import io.getstream.chat.android.p226ui.utils.extensions.ConstraintLayoutKt;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import l83.C23454a0;
import p184h5.ViewTreeObserverOnPreDrawListenerC16921w;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 :2\u00020\u0001:\u0001:B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u001f2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b \u0010!J\u001f\u0010#\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\"2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010&\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020%2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020(2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b)\u0010*J\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020+2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b,\u0010-J\u001f\u0010/\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020.2\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b/\u00100J\u001f\u00102\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u0002012\u0006\u0010\u000e\u001a\u00020\rH\u0014¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109¨\u0006;"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/BaseDecorator;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "<init>", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "rootConstraintLayout", "Landroid/view/View;", "contentView", "reactionsSpace", "Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;", "reactionsView", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "data", "Ll83/a0;", "setupReactionsView", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "", "calculateDynamicOffset", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/reactions/view/internal/ViewReactionsView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)I", "dynamicOffset", "updateOffset", "(Landroid/view/View;Landroid/view/View;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;I)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;", "viewHolder", "decorateCustomAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/CustomAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;", "decorateGiphyAttachmentMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "decorateFileAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "decorateMediaAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;", "decoratePlainTextMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessagePlainTextViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;", "decorateDeletedMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MessageDeletedViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;", "decorateGiphyMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/GiphyViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;", "decorateLinkAttachmentsMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/LinkAttachmentsViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;", "decoratePollMessage", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/PollViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "type", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "getType", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator$Type;", "Companion", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ReactionsDecorator extends BaseDecorator {
    private final MessageListItemStyle style;
    private final Decorator.Type type;
    private static final Companion Companion = new Companion();
    private static final int SINGLE_REACTION_OFFSET = IntKt.dpToPx(8);
    private static final int MULTIPLE_REACTIONS_OFFSET = IntKt.dpToPx(26);

    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/internal/ReactionsDecorator$Companion;", "", "<init>", "()V", "SINGLE_REACTION_OFFSET", "", "MULTIPLE_REACTIONS_OFFSET", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public ReactionsDecorator(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
        this.type = Decorator.Type.BuiltIn.REACTIONS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int calculateDynamicOffset(ConstraintLayout rootConstraintLayout, View reactionsSpace, ViewReactionsView reactionsView, MessageListItem.MessageItem data) {
        Rect rect = new Rect();
        reactionsSpace.getDrawingRect(rect);
        rootConstraintLayout.offsetDescendantRectToMyCoords(reactionsSpace, rect);
        int measuredWidth = rect.left;
        int measuredWidth2 = rootConstraintLayout.getMeasuredWidth() - (rootConstraintLayout.getPaddingEnd() + rootConstraintLayout.getPaddingStart());
        if (!data.isTheirs()) {
            measuredWidth = rootConstraintLayout.getMeasuredWidth() - measuredWidth;
        }
        int measuredWidth3 = reactionsView.getMeasuredWidth() + measuredWidth;
        if (measuredWidth3 > rootConstraintLayout.getMeasuredWidth()) {
            return measuredWidth3 - measuredWidth2;
        }
        return MessageKt.hasSingleReaction(data.getMessage()) ? SINGLE_REACTION_OFFSET : MULTIPLE_REACTIONS_OFFSET;
    }

    private final void setupReactionsView(ConstraintLayout rootConstraintLayout, View contentView, View reactionsSpace, ViewReactionsView reactionsView, MessageListItem.MessageItem data) {
        if (!MessageKt.hasReactions(data.getMessage())) {
            reactionsView.setVisibility(8);
            reactionsSpace.setVisibility(8);
        } else {
            reactionsView.setVisibility(0);
            reactionsSpace.setVisibility(0);
            reactionsView.applyStyle$stream_chat_android_ui_components_release(this.style.getReactionsViewStyle());
            reactionsView.setMessage(data.getMessage(), data.isMine(), new C0561l(rootConstraintLayout, reactionsSpace, reactionsView, data, contentView, this, 5));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupReactionsView$lambda$11(final ConstraintLayout constraintLayout, final View view, final ViewReactionsView viewReactionsView, final MessageListItem.MessageItem messageItem, final View view2, final ReactionsDecorator reactionsDecorator) {
        ConstraintLayoutKt.updateConstraints(constraintLayout, new C19223a(17, viewReactionsView, view));
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        if (messageItem.isTheirs()) {
            c1141d.f5075v = view2.getId();
            c1141d.setMarginEnd(0);
        } else {
            c1141d.f5073t = view2.getId();
            c1141d.setMarginStart(0);
        }
        view.setLayoutParams(c1141d);
        ViewGroup.LayoutParams layoutParams2 = viewReactionsView.getLayoutParams();
        if (layoutParams2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d2 = (C1141d) layoutParams2;
        if (messageItem.isTheirs()) {
            c1141d2.f5072s = view.getId();
        } else {
            c1141d2.f5074u = view.getId();
        }
        viewReactionsView.setLayoutParams(c1141d2);
        ViewTreeObserverOnPreDrawListenerC16921w.m47614a(view, new Runnable() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.decorator.internal.ReactionsDecorator$setupReactionsView$lambda$11$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                reactionsDecorator.updateOffset(view2, view, messageItem, reactionsDecorator.calculateDynamicOffset(constraintLayout, view, viewReactionsView, messageItem));
            }
        });
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 setupReactionsView$lambda$11$lambda$7(ViewReactionsView viewReactionsView, View view, C1153p updateConstraints) {
        AbstractC22676k.m65750j(updateConstraints, "$this$updateConstraints");
        updateConstraints.m3646c(viewReactionsView.getId(), 6);
        updateConstraints.m3646c(viewReactionsView.getId(), 7);
        updateConstraints.m3646c(view.getId(), 6);
        updateConstraints.m3646c(view.getId(), 7);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateOffset(View contentView, View reactionsSpace, MessageListItem.MessageItem data, int dynamicOffset) {
        ViewGroup.LayoutParams layoutParams = reactionsSpace.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        if (data.isTheirs()) {
            c1141d.f5075v = contentView.getId();
            c1141d.setMarginEnd(dynamicOffset);
        } else {
            c1141d.f5073t = contentView.getId();
            c1141d.setMarginStart(dynamicOffset);
        }
        reactionsSpace.setLayoutParams(c1141d);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateCustomAttachmentsMessage(CustomAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemCustomAttachmentsBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
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
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateGiphyAttachmentMessage(GiphyAttachmentViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemGiphyAttachmentBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
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
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decorateMediaAttachmentsMessage(MediaAttachmentsViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessageMediaAttachmentBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePlainTextMessage(MessagePlainTextViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePlainTextBinding binding = viewHolder.getBinding();
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        LinearLayout messageContainer = binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.BaseDecorator
    public final void decoratePollMessage(PollViewHolder viewHolder, MessageListItem.MessageItem data) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        AbstractC22676k.m65750j(data, "data");
        StreamUiItemMessagePollBinding binding$stream_chat_android_ui_components_release = viewHolder.getBinding();
        ConstraintLayout root = binding$stream_chat_android_ui_components_release.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        LinearLayout messageContainer = binding$stream_chat_android_ui_components_release.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        Space reactionsSpace = binding$stream_chat_android_ui_components_release.reactionsSpace;
        AbstractC22676k.m65749i(reactionsSpace, "reactionsSpace");
        ViewReactionsView reactionsView = binding$stream_chat_android_ui_components_release.reactionsView;
        AbstractC22676k.m65749i(reactionsView, "reactionsView");
        setupReactionsView(root, messageContainer, reactionsSpace, reactionsView, data);
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator
    public final Decorator.Type getType() {
        return this.type;
    }
}
