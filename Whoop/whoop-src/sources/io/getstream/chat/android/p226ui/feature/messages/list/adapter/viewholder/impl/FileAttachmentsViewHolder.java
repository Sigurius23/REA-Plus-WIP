package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b13.ViewOnClickListenerC2292a;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemFileAttachmentsBinding;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.FileAttachmentsView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/FileAttachmentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer", "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;)V", "data", "Ll83/a0;", "updateHorizontalBias", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V", "initializeListeners", "()V", "setLinkMovementMethod", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentsBinding;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class FileAttachmentsViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final StreamUiItemFileAttachmentsBinding binding;
    private final MessageListListeners listeners;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ChatMessageTextTransformer messageTextTransformer;

    public /* synthetic */ FileAttachmentsViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, ChatMessageTextTransformer chatMessageTextTransformer, StreamUiItemFileAttachmentsBinding streamUiItemFileAttachmentsBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, chatMessageTextTransformer, (i13 & 16) != 0 ? StreamUiItemFileAttachmentsBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemFileAttachmentsBinding);
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void initializeListeners() {
        StreamUiItemFileAttachmentsBinding streamUiItemFileAttachmentsBinding = this.binding;
        final MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            streamUiItemFileAttachmentsBinding.reactionsView.setReactionClickListener(new C4312c(9, messageListListeners, this));
            final int i13 = 0;
            streamUiItemFileAttachmentsBinding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.d
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i13) {
                        case 0:
                            FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$3(messageListListeners, this, (View) obj);
                            break;
                        default:
                            FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$4(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i14 = 1;
            streamUiItemFileAttachmentsBinding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.d
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$3(messageListListeners, this, (View) obj);
                            break;
                        default:
                            FileAttachmentsViewHolder.initializeListeners$lambda$10$lambda$9$lambda$4(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            streamUiItemFileAttachmentsBinding.messageContainer.setOnLongClickListener(new ViewOnLongClickListenerC19797c(i14, messageListListeners, this));
            streamUiItemFileAttachmentsBinding.userAvatarView.setOnClickListener(new ViewOnClickListenerC2292a(3, messageListListeners, this));
            int i15 = 2;
            this.binding.fileAttachmentsView.setAttachmentLongClickListener(new C19809o(messageListListeners, this, i15));
            this.binding.fileAttachmentsView.setAttachmentClickListener(new C19808n(messageListListeners, this, i15));
            this.binding.fileAttachmentsView.setAttachmentDownloadClickListener(new C19794x34cbee9c(new FileAttachmentsViewHolder$initializeListeners$1$1$8(messageListListeners.getAttachmentDownloadClickListener())));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$10$lambda$9$lambda$2(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$10$lambda$9$lambda$3(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$10$lambda$9$lambda$4(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$10$lambda$9$lambda$5(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$10$lambda$9$lambda$6(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage().getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$10$lambda$9$lambda$7(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$10$lambda$9$lambda$8(MessageListListeners messageListListeners, FileAttachmentsViewHolder fileAttachmentsViewHolder, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        messageListListeners.getAttachmentClickListener().onAttachmentClick(((MessageListItem.MessageItem) fileAttachmentsViewHolder.getData()).getMessage(), attachment);
    }

    private final void setLinkMovementMethod() {
        MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = this.binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = this.binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new FileAttachmentsViewHolder$setLinkMovementMethod$1$1(messageListListeners.getLinkClickListener()), new FileAttachmentsViewHolder$setLinkMovementMethod$1$2(messageListListeners.getMentionClickListener()));
        }
    }

    private final void updateHorizontalBias(MessageListItem.MessageItem data) {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        c1141d.f5016E = data.isMine() ? 1.0f : 0.0f;
        messageContainer.setLayoutParams(c1141d);
    }

    public final StreamUiItemFileAttachmentsBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final View messageContainerView() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        return messageContainer;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder, io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void bindData(MessageListItem.MessageItem data, MessageListItemPayloadDiff diff) {
        AbstractC22676k.m65750j(data, "data");
        AbstractC22676k.m65750j(diff, "diff");
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.DEBUG;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[bindData] data: " + data + ", diff: " + diff, null);
        }
        super.bindData(data, diff);
        updateHorizontalBias(data);
        this.binding.fileAttachmentsView.setAttachments(data.getMessage().getAttachments());
        if (data.getMessage().getText().length() <= 0) {
            this.binding.messageText.setVisibility(8);
            return;
        }
        ChatMessageTextTransformer chatMessageTextTransformer = this.messageTextTransformer;
        TextView messageText = this.binding.messageText;
        AbstractC22676k.m65749i(messageText, "messageText");
        chatMessageTextTransformer.transformAndApply(messageText, data);
        this.binding.messageText.setVisibility(0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FileAttachmentsViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, ChatMessageTextTransformer messageTextTransformer, StreamUiItemFileAttachmentsBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(messageTextTransformer, "messageTextTransformer");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.messageTextTransformer = messageTextTransformer;
        this.binding = binding;
        this.logger = AbstractC1772c1.m5382S(this, "FileAttachmentListVH");
        initializeListeners();
        setLinkMovementMethod();
        FileAttachmentsView fileAttachmentsView = binding.fileAttachmentsView;
        AbstractC22676k.m65749i(fileAttachmentsView, "fileAttachmentsView");
        int iDpToPx = IntKt.dpToPx(4);
        fileAttachmentsView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
    }
}
