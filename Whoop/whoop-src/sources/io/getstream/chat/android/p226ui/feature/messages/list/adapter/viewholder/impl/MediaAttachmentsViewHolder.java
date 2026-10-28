package io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.C1141d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.room.AbstractC1772c1;
import b23.C2345k;
import b23.EnumC2341g;
import b23.InterfaceC2339e;
import b23.InterfaceC2344j;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.utils.attachment.AttachmentUtilsKt;
import io.getstream.chat.android.models.Attachment;
import io.getstream.chat.android.p226ui.C19469R;
import io.getstream.chat.android.p226ui.databinding.StreamUiItemMessageMediaAttachmentBinding;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItemPayloadDiff;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListListeners;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.DecoratedBaseMessageItemViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.AudioRecordingAttachmentsGroupView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.view.internal.MediaAttachmentsGroupView;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.internal.LongClickFriendlyLinkMovementMethod;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.utils.extensions.IntKt;
import io.getstream.chat.android.p226ui.utils.extensions.ViewGroupKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import l83.InterfaceC23462h;
import m83.AbstractC25267u;
import p047c9.C4312c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BI\b\u0000\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u000f\u0010\u0018\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0018\u0010\u0015J\u000f\u0010\u0019\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0019\u0010\u0015J\u000f\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001a\u0010\u0015J\u000f\u0010\u001b\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u00022\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0013H\u0016¢\u0006\u0004\b$\u0010\u0015J\u000f\u0010%\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0015R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010'R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b\u000e\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020.8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0014\u00107\u001a\u0002048BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b5\u00106¨\u00068"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/impl/MediaAttachmentsViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/internal/DecoratedBaseMessageItemViewHolder;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "Landroid/view/ViewGroup;", "parent", "", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/Decorator;", "decorators", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer", "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "audioRecordViewStyle", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;", "binding", "<init>", "(Landroid/view/ViewGroup;Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;)V", "Ll83/a0;", "bindMessageText", "()V", "bindHorizontalBias", "bindMediaAttachments", "bindAudioRecordAttachments", "bindUploadingIndicator", "initializeListeners", "setLinkMovementMethod", "Landroid/view/View;", "messageContainerView", "()Landroid/view/View;", "data", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;", "diff", "bindData", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemPayloadDiff;)V", "onAttachedToWindow", "unbind", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "getAudioRecordViewStyle", "()Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;", "getBinding", "()Lio/getstream/chat/android/ui/databinding/StreamUiItemMessageMediaAttachmentBinding;", "Lb23/k;", "logger$delegate", "Ll83/h;", "getLogger", "()Lb23/k;", "logger", "", "getBaPosition", "()I", "baPosition", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class MediaAttachmentsViewHolder extends DecoratedBaseMessageItemViewHolder<MessageListItem.MessageItem> {
    private final MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordViewStyle;
    private final StreamUiItemMessageMediaAttachmentBinding binding;
    private final MessageListListeners listeners;

    /* JADX INFO: renamed from: logger$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h logger;
    private final ChatMessageTextTransformer messageTextTransformer;

    public /* synthetic */ MediaAttachmentsViewHolder(ViewGroup viewGroup, List list, MessageListListeners messageListListeners, ChatMessageTextTransformer chatMessageTextTransformer, MessageViewStyle messageViewStyle, StreamUiItemMessageMediaAttachmentBinding streamUiItemMessageMediaAttachmentBinding, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(viewGroup, list, messageListListeners, chatMessageTextTransformer, messageViewStyle, (i13 & 32) != 0 ? StreamUiItemMessageMediaAttachmentBinding.inflate(ViewGroupKt.getStreamThemeInflater(viewGroup), viewGroup, false) : streamUiItemMessageMediaAttachmentBinding);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindAudioRecordAttachments() {
        boolean z4;
        List<Attachment> attachments = ((MessageListItem.MessageItem) getData()).getMessage().getAttachments();
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            Iterator<T> it = attachments.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z4 = false;
                    break;
                } else if (AttachmentUtilsKt.isAudioRecording((Attachment) it.next())) {
                    z4 = true;
                    break;
                }
            }
        } else {
            z4 = false;
            break;
        }
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        String str = logger.f9273a;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            logger.f9274b.log(enumC2341g, str, "[bindAudioRecordAttachments] #" + getBindingAdapterPosition() + "; hasRecordingAttachment: " + z4, null);
        }
        if (z4) {
            AudioRecordingAttachmentsGroupView audioRecordsView = this.binding.audioRecordsView;
            AbstractC22676k.m65749i(audioRecordsView, "audioRecordsView");
            audioRecordsView.setVisibility(0);
            this.binding.audioRecordsView.showAudioAttachments(((MessageListItem.MessageItem) getData()).getMessage().getAttachments());
        } else {
            AudioRecordingAttachmentsGroupView audioRecordsView2 = this.binding.audioRecordsView;
            AbstractC22676k.m65749i(audioRecordsView2, "audioRecordsView");
            audioRecordsView2.setVisibility(8);
        }
        AudioRecordPlayerViewStyle audioRecordPlayerViewStyle = (AudioRecordPlayerViewStyle) (((MessageListItem.MessageItem) getData()).isMine() ? this.audioRecordViewStyle.getOwn() : this.audioRecordViewStyle.getTheirs());
        if (audioRecordPlayerViewStyle != null) {
            this.binding.audioRecordsView.setStyle(audioRecordPlayerViewStyle);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindHorizontalBias() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        ViewGroup.LayoutParams layoutParams = messageContainer.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        C1141d c1141d = (C1141d) layoutParams;
        c1141d.f5016E = ((MessageListItem.MessageItem) getData()).isMine() ? 1.0f : 0.0f;
        messageContainer.setLayoutParams(c1141d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindMediaAttachments() {
        C2345k logger = getLogger();
        InterfaceC2339e interfaceC2339e = logger.f9275c;
        EnumC2341g enumC2341g = EnumC2341g.VERBOSE;
        String str = logger.f9273a;
        if (interfaceC2339e.isLoggable(enumC2341g, str)) {
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            int bindingAdapterPosition = getBindingAdapterPosition();
            List<Attachment> attachments = ((MessageListItem.MessageItem) getData()).getMessage().getAttachments();
            ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(attachments, 10));
            Iterator<T> it = attachments.iterator();
            while (it.hasNext()) {
                arrayList.add(((Attachment) it.next()).getType());
            }
            interfaceC2344j.log(enumC2341g, str, "[bindMediaAttachments] #" + bindingAdapterPosition + "; data.message.attachments.type: " + arrayList, null);
        }
        MediaAttachmentsGroupView mediaAttachmentView = this.binding.mediaAttachmentView;
        AbstractC22676k.m65749i(mediaAttachmentView, "mediaAttachmentView");
        int iDpToPx = IntKt.dpToPx(1);
        mediaAttachmentView.setPadding(iDpToPx, iDpToPx, iDpToPx, iDpToPx);
        this.binding.mediaAttachmentView.setupBackground((MessageListItem.MessageItem) getData());
        this.binding.mediaAttachmentView.showAttachments(getBindingAdapterPosition(), ((MessageListItem.MessageItem) getData()).getMessage().getAttachments());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindMessageText() {
        TextView messageText = this.binding.messageText;
        AbstractC22676k.m65749i(messageText, "messageText");
        messageText.setVisibility(((MessageListItem.MessageItem) getData()).getMessage().getText().length() > 0 ? 0 : 8);
        ChatMessageTextTransformer chatMessageTextTransformer = this.messageTextTransformer;
        TextView messageText2 = this.binding.messageText;
        AbstractC22676k.m65749i(messageText2, "messageText");
        chatMessageTextTransformer.transformAndApply(messageText2, (MessageListItem.MessageItem) getData());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void bindUploadingIndicator() {
        int size = ((MessageListItem.MessageItem) getData()).getMessage().getAttachments().size();
        List<Attachment> attachments = ((MessageListItem.MessageItem) getData()).getMessage().getAttachments();
        int i13 = 0;
        if (!(attachments instanceof Collection) || !attachments.isEmpty()) {
            for (Attachment attachment : attachments) {
                if (attachment.getUploadState() == null || AbstractC22676k.m65745e(attachment.getUploadState(), Attachment.UploadState.Success.INSTANCE)) {
                    i13++;
                    if (i13 < 0) {
                        AbstractC37056f.m118976c0();
                        throw null;
                    }
                }
            }
        }
        if (i13 != size) {
            this.binding.sentFiles.setText(getContext().getString(C19469R.string.stream_ui_message_list_attachment_uploading, Integer.valueOf(i13), Integer.valueOf(size)));
            return;
        }
        TextView sentFiles = this.binding.sentFiles;
        AbstractC22676k.m65749i(sentFiles, "sentFiles");
        sentFiles.setVisibility(8);
    }

    private final int getBaPosition() {
        return getBindingAdapterPosition();
    }

    private final C2345k getLogger() {
        return (C2345k) this.logger.getValue();
    }

    private final void initializeListeners() {
        StreamUiItemMessageMediaAttachmentBinding streamUiItemMessageMediaAttachmentBinding = this.binding;
        final MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            final int i13 = 0;
            streamUiItemMessageMediaAttachmentBinding.messageContainer.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i13) {
                        case 0:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$9(messageListListeners, this, view);
                            break;
                        default:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$14(messageListListeners, this, view);
                            break;
                    }
                }
            });
            streamUiItemMessageMediaAttachmentBinding.reactionsView.setReactionClickListener(new C4312c(12, messageListListeners, this));
            final int i14 = 0;
            streamUiItemMessageMediaAttachmentBinding.footnote.setOnThreadClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.m
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i14) {
                        case 0:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$11(messageListListeners, this, (View) obj);
                            break;
                        default:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$12(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            final int i15 = 1;
            streamUiItemMessageMediaAttachmentBinding.footnote.setOnTranslatedLabelClickListener(new Function1() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.m
                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    switch (i15) {
                        case 0:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$11(messageListListeners, this, (View) obj);
                            break;
                        default:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$12(messageListListeners, this, (View) obj);
                            break;
                    }
                    return C23454a0.f92919a;
                }
            });
            streamUiItemMessageMediaAttachmentBinding.messageContainer.setOnLongClickListener(new ViewOnLongClickListenerC19797c(3, messageListListeners, this));
            final int i16 = 1;
            streamUiItemMessageMediaAttachmentBinding.userAvatarView.setOnClickListener(new View.OnClickListener() { // from class: io.getstream.chat.android.ui.feature.messages.list.adapter.viewholder.impl.l
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i16) {
                        case 0:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$9(messageListListeners, this, view);
                            break;
                        default:
                            MediaAttachmentsViewHolder.initializeListeners$lambda$20$lambda$19$lambda$14(messageListListeners, this, view);
                            break;
                    }
                }
            });
            int i17 = 0;
            streamUiItemMessageMediaAttachmentBinding.mediaAttachmentView.setAttachmentClickListener(new C19808n(messageListListeners, this, i17));
            streamUiItemMessageMediaAttachmentBinding.mediaAttachmentView.setAttachmentLongClickListener(new C19809o(messageListListeners, this, i17));
            streamUiItemMessageMediaAttachmentBinding.audioRecordsView.setAttachmentClickListener(new C19808n(messageListListeners, this, 1));
            streamUiItemMessageMediaAttachmentBinding.audioRecordsView.setAttachmentLongClickListener(new C19809o(messageListListeners, this, 1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$10(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, String it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getReactionViewClickListener().onReactionViewClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$20$lambda$19$lambda$11(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getThreadClickListener().onThreadClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final C23454a0 initializeListeners$lambda$20$lambda$19$lambda$12(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, View it) {
        AbstractC22676k.m65750j(it, "it");
        messageListListeners.getTranslatedLabelClickListener().onTranslatedLabelClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean initializeListeners$lambda$20$lambda$19$lambda$13(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, View view) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$14(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, View view) {
        messageListListeners.getUserClickListener().onUserClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage().getUser());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$15(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        messageListListeners.getAttachmentClickListener().onAttachmentClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage(), attachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$16(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$17(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, Attachment attachment) {
        AbstractC22676k.m65750j(attachment, "attachment");
        messageListListeners.getAttachmentClickListener().onAttachmentClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage(), attachment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$18(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder) {
        messageListListeners.getMessageLongClickListener().onMessageLongClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void initializeListeners$lambda$20$lambda$19$lambda$9(MessageListListeners messageListListeners, MediaAttachmentsViewHolder mediaAttachmentsViewHolder, View view) {
        messageListListeners.getMessageClickListener().onMessageClick(((MessageListItem.MessageItem) mediaAttachmentsViewHolder.getData()).getMessage());
    }

    private final void setLinkMovementMethod() {
        MessageListListeners messageListListeners = this.listeners;
        if (messageListListeners != null) {
            LongClickFriendlyLinkMovementMethod.Companion companion = LongClickFriendlyLinkMovementMethod.INSTANCE;
            TextView messageText = this.binding.messageText;
            AbstractC22676k.m65749i(messageText, "messageText");
            LinearLayout messageContainer = this.binding.messageContainer;
            AbstractC22676k.m65749i(messageContainer, "messageContainer");
            companion.set(messageText, messageContainer, new MediaAttachmentsViewHolder$setLinkMovementMethod$1$1(messageListListeners.getLinkClickListener()), new MediaAttachmentsViewHolder$setLinkMovementMethod$1$2(messageListListeners.getMentionClickListener()));
        }
    }

    public final MessageViewStyle<AudioRecordPlayerViewStyle> getAudioRecordViewStyle() {
        return this.audioRecordViewStyle;
    }

    public final StreamUiItemMessageMediaAttachmentBinding getBinding() {
        return this.binding;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final View messageContainerView() {
        LinearLayout messageContainer = this.binding.messageContainer;
        AbstractC22676k.m65749i(messageContainer, "messageContainer");
        return messageContainer;
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void onAttachedToWindow() {
        bindUploadingIndicator();
    }

    @Override // io.getstream.chat.android.p226ui.feature.messages.list.adapter.BaseMessageItemViewHolder
    public final void unbind() {
        super.unbind();
        this.binding.audioRecordsView.unbind();
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
            InterfaceC2344j interfaceC2344j = logger.f9274b;
            int bindingAdapterPosition = getBindingAdapterPosition();
            String text = data.getMessage().getText();
            int size = data.getMessage().getAttachments().size();
            StringBuilder sbM53373n = AbstractC18489d0.m53373n(bindingAdapterPosition, "[bindData] #", "; data: Data(text=", text, ", attachments.size=");
            sbM53373n.append(size);
            sbM53373n.append("), diff: ");
            sbM53373n.append(diff);
            interfaceC2344j.log(enumC2341g, str, sbM53373n.toString(), null);
        }
        super.bindData(data, diff);
        bindMessageText();
        bindHorizontalBias();
        if (diff.getAttachments()) {
            C2345k logger2 = getLogger();
            InterfaceC2339e interfaceC2339e2 = logger2.f9275c;
            String str2 = logger2.f9273a;
            EnumC2341g enumC2341g2 = EnumC2341g.VERBOSE;
            if (interfaceC2339e2.isLoggable(enumC2341g2, str2)) {
                logger2.f9274b.log(enumC2341g2, str2, "[bindData] has attachments", null);
            }
            bindMediaAttachments();
            bindAudioRecordAttachments();
        }
        bindUploadingIndicator();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MediaAttachmentsViewHolder(ViewGroup parent, List<? extends Decorator> decorators, MessageListListeners messageListListeners, ChatMessageTextTransformer messageTextTransformer, MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordViewStyle, StreamUiItemMessageMediaAttachmentBinding binding) {
        AbstractC22676k.m65750j(parent, "parent");
        AbstractC22676k.m65750j(decorators, "decorators");
        AbstractC22676k.m65750j(messageTextTransformer, "messageTextTransformer");
        AbstractC22676k.m65750j(audioRecordViewStyle, "audioRecordViewStyle");
        AbstractC22676k.m65750j(binding, "binding");
        ConstraintLayout root = binding.getRoot();
        AbstractC22676k.m65749i(root, "getRoot(...)");
        super(root, decorators);
        this.listeners = messageListListeners;
        this.messageTextTransformer = messageTextTransformer;
        this.audioRecordViewStyle = audioRecordViewStyle;
        this.binding = binding;
        this.logger = AbstractC1772c1.m5382S(this, "Chat:MediaAttachmentsVH");
        initializeListeners();
        setLinkMovementMethod();
    }
}
