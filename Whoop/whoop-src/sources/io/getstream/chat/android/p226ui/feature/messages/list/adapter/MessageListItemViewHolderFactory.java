package io.getstream.chat.android.p226ui.feature.messages.list.adapter;

import android.view.ViewGroup;
import io.getstream.chat.android.p226ui.feature.messages.common.AudioRecordPlayerViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.GiphyViewHolderStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageListItemStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageReplyStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.MessageViewStyle;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.internal.MessageListItemViewTypeMapper;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.Decorator;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProvider;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.CustomAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.DateDividerViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.FileAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyAttachmentViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.GiphyViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.LinkAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MediaAttachmentsViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessageDeletedViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.MessagePlainTextViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.impl.PollViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.EmptyViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.ErrorMessageViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.LoadingMoreViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.SystemMessageViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.ThreadSeparatorViewHolder;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.internal.UnreadSeparatorViewHolder;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import java.util.List;
import l83.InterfaceC23462h;
import p031b9.AbstractC2875y;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m65680d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010 \u001a\u00020\u00062\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0000¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010$\u001a\u00020#2\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&H\u0016¢\u0006\u0004\b$\u0010(J'\u0010,\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0016¢\u0006\u0004\b,\u0010-J\u001f\u0010.\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b0\u0010/J\u001f\u00101\u001a\n\u0012\u0006\b\u0001\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b1\u0010/J\u001d\u00103\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b3\u0010/J\u001d\u00105\u001a\b\u0012\u0004\u0012\u0002040&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b5\u0010/J\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002060&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b7\u0010/J\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002080&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b9\u0010/J\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b:\u0010/J\u001d\u0010;\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b;\u0010/J\u001d\u0010=\u001a\b\u0012\u0004\u0012\u00020<0&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b=\u0010/J\u001d\u0010>\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b>\u0010/J\u001d\u0010?\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b?\u0010/J\u001d\u0010@\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b@\u0010/J%\u0010A\u001a\b\u0012\u0004\u0012\u00020!0&2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020#H\u0002¢\u0006\u0004\bA\u0010-J\u001d\u0010B\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bB\u0010/J\u001d\u0010C\u001a\b\u0012\u0004\u0012\u0002020&2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\bC\u0010/R\"\u0010E\u001a\u00020D8\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR$\u0010\u000b\u001a\u00020\n2\u0006\u0010K\u001a\u00020\n8\u0004@BX\u0084.¢\u0006\f\n\u0004\b\u000b\u0010L\u001a\u0004\bM\u0010NR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0010\u0010OR\u0016\u0010P\u001a\u00020\u00148\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bP\u0010QR\u0016\u0010R\u001a\u00020\u00188\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bR\u0010SR\u001c\u0010T\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bT\u0010UR(\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010K\u001a\u0004\u0018\u00010\u00048\u0004@BX\u0084\u000e¢\u0006\f\n\u0004\b\u0005\u0010V\u001a\u0004\bW\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]¨\u0006_"}, m65681d2 = {"Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItemViewHolderFactory;", "", "<init>", "()V", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "listeners", "Ll83/a0;", "setListeners$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;)V", "setListeners", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "attachmentFactoryManager", "setAttachmentFactoryManager$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V", "setAttachmentFactoryManager", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "style", "setMessageListItemStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V", "setMessageListItemStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "setReplyMessageListItemViewStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V", "setReplyMessageListItemViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "setGiphyViewHolderStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;)V", "setGiphyViewHolderStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/common/AudioRecordPlayerViewStyle;", "setAudioRecordViewStyle$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;)V", "setAudioRecordViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;", "item", "", "getItemViewType", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem;)I", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "viewHolder", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;)I", "Landroid/view/ViewGroup;", "parentView", "viewType", "createViewHolder", "(Landroid/view/ViewGroup;I)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "createCustomAttachmentsViewHolder", "(Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/BaseMessageItemViewHolder;", "createGiphyAttachmentViewHolder", "createMediaAttachmentsViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;", "createPollItemViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$UnreadSeparatorItem;", "createUnreadSeparatorViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$DateSeparatorItem;", "createDateDividerViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$LoadingMoreIndicatorItem;", "createLoadingMoreViewHolder", "createMessageDeletedViewHolder", "createPlainTextViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$ThreadSeparatorItem;", "createThreadSeparatorViewHolder", "createGiphyMessageItemViewHolder", "createSystemMessageItemViewHolder", "createErrorMessageItemViewHolder", "createEmptyMessageItemViewHolder", "createFileAttachmentsViewHolder", "createLinkAttachmentsViewHolder", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "decoratorProvider", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "getDecoratorProvider$stream_chat_android_ui_components_release", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;", "setDecoratorProvider$stream_chat_android_ui_components_release", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProvider;)V", "value", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "getAttachmentFactoryManager", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;", "messageReplyStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;", "giphyViewHolderStyle", "Lio/getstream/chat/android/ui/feature/messages/list/GiphyViewHolderStyle;", "audioRecordViewStyle", "Lio/getstream/chat/android/ui/feature/messages/list/MessageViewStyle;", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "getListeners", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListListeners;", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "textTransformer$delegate", "Ll83/h;", "getTextTransformer", "()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "textTransformer", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public class MessageListItemViewHolderFactory {
    private AttachmentFactoryManager attachmentFactoryManager;
    private MessageViewStyle<AudioRecordPlayerViewStyle> audioRecordViewStyle;
    public DecoratorProvider decoratorProvider;
    private GiphyViewHolderStyle giphyViewHolderStyle;
    private MessageListListeners listeners;
    private MessageReplyStyle messageReplyStyle;
    private MessageListItemStyle style;

    /* JADX INFO: renamed from: textTransformer$delegate, reason: from kotlin metadata */
    private final InterfaceC23462h textTransformer = AbstractC30060g.m92088H(new C19743a());

    private final BaseMessageItemViewHolder<? extends MessageListItem> createCustomAttachmentsViewHolder(ViewGroup parentView) {
        return new CustomAttachmentsViewHolder(parentView, getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators(), this.listeners, getTextTransformer(), getAttachmentFactoryManager(), null, 32, null);
    }

    private final BaseMessageItemViewHolder<MessageListItem.DateSeparatorItem> createDateDividerViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new DateDividerViewHolder(parentView, decorators, messageListItemStyle, null, 8, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem> createEmptyMessageItemViewHolder(ViewGroup parentView, int viewType) {
        return new EmptyViewHolder(parentView, viewType);
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createErrorMessageItemViewHolder(ViewGroup parentView) {
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new ErrorMessageViewHolder(parentView, messageListItemStyle, null, 4, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createFileAttachmentsViewHolder(ViewGroup parentView) {
        return new FileAttachmentsViewHolder(parentView, getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators(), this.listeners, getTextTransformer(), null, 16, null);
    }

    private final BaseMessageItemViewHolder<? extends MessageListItem> createGiphyAttachmentViewHolder(ViewGroup parentView) {
        return new GiphyAttachmentViewHolder(parentView, getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators(), this.listeners, getTextTransformer(), null, 16, null);
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createGiphyMessageItemViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        GiphyViewHolderStyle giphyViewHolderStyle = this.giphyViewHolderStyle;
        if (giphyViewHolderStyle != null) {
            return new GiphyViewHolder(parentView, decorators, messageListListeners, giphyViewHolderStyle, null, 16, null);
        }
        AbstractC22676k.m65757q("giphyViewHolderStyle");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createLinkAttachmentsViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new LinkAttachmentsViewHolder(parentView, decorators, getTextTransformer(), messageListListeners, null, messageListItemStyle, 16, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.LoadingMoreIndicatorItem> createLoadingMoreViewHolder(ViewGroup parentView) {
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new LoadingMoreViewHolder(parentView, messageListItemStyle);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<? extends MessageListItem> createMediaAttachmentsViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        ChatMessageTextTransformer textTransformer = getTextTransformer();
        MessageViewStyle<AudioRecordPlayerViewStyle> messageViewStyle = this.audioRecordViewStyle;
        if (messageViewStyle != null) {
            return new MediaAttachmentsViewHolder(parentView, decorators, messageListListeners, textTransformer, messageViewStyle, null, 32, null);
        }
        AbstractC22676k.m65757q("audioRecordViewStyle");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createMessageDeletedViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new MessageDeletedViewHolder(parentView, decorators, messageListListeners, messageListItemStyle, null, 16, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createPlainTextViewHolder(ViewGroup parentView) {
        return new MessagePlainTextViewHolder(parentView, getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators(), this.listeners, getTextTransformer(), null, 16, null);
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createPollItemViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new PollViewHolder(parentView, decorators, messageListListeners, messageListItemStyle, null, 16, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.MessageItem> createSystemMessageItemViewHolder(ViewGroup parentView) {
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new SystemMessageViewHolder(parentView, messageListItemStyle, null, 4, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.ThreadSeparatorItem> createThreadSeparatorViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new ThreadSeparatorViewHolder(parentView, decorators, messageListItemStyle, null, 8, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final BaseMessageItemViewHolder<MessageListItem.UnreadSeparatorItem> createUnreadSeparatorViewHolder(ViewGroup parentView) {
        List<Decorator> decorators = getDecoratorProvider$stream_chat_android_ui_components_release().getDecorators();
        MessageListListeners messageListListeners = this.listeners;
        MessageListItemStyle messageListItemStyle = this.style;
        if (messageListItemStyle != null) {
            return new UnreadSeparatorViewHolder(parentView, decorators, messageListListeners, messageListItemStyle, null, 16, null);
        }
        AbstractC22676k.m65757q("style");
        throw null;
    }

    private final ChatMessageTextTransformer getTextTransformer() {
        return (ChatMessageTextTransformer) this.textTransformer.getValue();
    }

    public BaseMessageItemViewHolder<? extends MessageListItem> createViewHolder(ViewGroup parentView, int viewType) {
        AbstractC22676k.m65750j(parentView, "parentView");
        switch (viewType) {
            case 1001:
                return createDateDividerViewHolder(parentView);
            case 1002:
                return createMessageDeletedViewHolder(parentView);
            case 1003:
                return createPlainTextViewHolder(parentView);
            case MessageListItemViewType.CUSTOM_ATTACHMENTS /* 1004 */:
                return createCustomAttachmentsViewHolder(parentView);
            case MessageListItemViewType.LOADING_INDICATOR /* 1005 */:
                return createLoadingMoreViewHolder(parentView);
            case MessageListItemViewType.THREAD_SEPARATOR /* 1006 */:
                return createThreadSeparatorViewHolder(parentView);
            case MessageListItemViewType.TYPING_INDICATOR /* 1007 */:
                return new EmptyViewHolder(parentView, viewType);
            case MessageListItemViewType.GIPHY /* 1008 */:
                return createGiphyMessageItemViewHolder(parentView);
            case MessageListItemViewType.SYSTEM_MESSAGE /* 1009 */:
                return createSystemMessageItemViewHolder(parentView);
            case MessageListItemViewType.ERROR_MESSAGE /* 1010 */:
                return createErrorMessageItemViewHolder(parentView);
            case MessageListItemViewType.THREAD_PLACEHOLDER /* 1011 */:
                return new EmptyViewHolder(parentView, viewType);
            case MessageListItemViewType.GIPHY_ATTACHMENT /* 1012 */:
                return createGiphyAttachmentViewHolder(parentView);
            case MessageListItemViewType.MEDIA_ATTACHMENT /* 1013 */:
                return createMediaAttachmentsViewHolder(parentView);
            case MessageListItemViewType.FILE_ATTACHMENTS /* 1014 */:
                return createFileAttachmentsViewHolder(parentView);
            case MessageListItemViewType.LINK_ATTACHMENTS /* 1015 */:
                return createLinkAttachmentsViewHolder(parentView);
            case MessageListItemViewType.UNREAD_SEPARATOR /* 1016 */:
                return createUnreadSeparatorViewHolder(parentView);
            case MessageListItemViewType.START_OF_THE_CHANNEL /* 1017 */:
                return new EmptyViewHolder(parentView, viewType);
            case MessageListItemViewType.POLL /* 1018 */:
                return createPollItemViewHolder(parentView);
            default:
                throw new IllegalArgumentException(AbstractC2875y.m8295h(viewType, "Unhandled MessageList view type: "));
        }
    }

    public final AttachmentFactoryManager getAttachmentFactoryManager() {
        AttachmentFactoryManager attachmentFactoryManager = this.attachmentFactoryManager;
        if (attachmentFactoryManager != null) {
            return attachmentFactoryManager;
        }
        AbstractC22676k.m65757q("attachmentFactoryManager");
        throw null;
    }

    public final DecoratorProvider getDecoratorProvider$stream_chat_android_ui_components_release() {
        DecoratorProvider decoratorProvider = this.decoratorProvider;
        if (decoratorProvider != null) {
            return decoratorProvider;
        }
        AbstractC22676k.m65757q("decoratorProvider");
        throw null;
    }

    public int getItemViewType(MessageListItem item) {
        AbstractC22676k.m65750j(item, "item");
        return MessageListItemViewTypeMapper.INSTANCE.getViewTypeValue(item, getAttachmentFactoryManager());
    }

    public final MessageListListeners getListeners() {
        return this.listeners;
    }

    /* JADX INFO: renamed from: setAttachmentFactoryManager$stream_chat_android_ui_components_release */
    public final void m55427xe9ea4c35(AttachmentFactoryManager attachmentFactoryManager) {
        AbstractC22676k.m65750j(attachmentFactoryManager, "attachmentFactoryManager");
        this.attachmentFactoryManager = attachmentFactoryManager;
    }

    /* JADX INFO: renamed from: setAudioRecordViewStyle$stream_chat_android_ui_components_release */
    public final void m55428xffb4c134(MessageViewStyle<AudioRecordPlayerViewStyle> style) {
        AbstractC22676k.m65750j(style, "style");
        this.audioRecordViewStyle = style;
    }

    public final void setDecoratorProvider$stream_chat_android_ui_components_release(DecoratorProvider decoratorProvider) {
        AbstractC22676k.m65750j(decoratorProvider, "<set-?>");
        this.decoratorProvider = decoratorProvider;
    }

    /* JADX INFO: renamed from: setGiphyViewHolderStyle$stream_chat_android_ui_components_release */
    public final void m55429xf46d3450(GiphyViewHolderStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.giphyViewHolderStyle = style;
    }

    public final void setListeners$stream_chat_android_ui_components_release(MessageListListeners listeners) {
        this.listeners = listeners;
    }

    /* JADX INFO: renamed from: setMessageListItemStyle$stream_chat_android_ui_components_release */
    public final void m55430x76a35cc8(MessageListItemStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.style = style;
    }

    /* JADX INFO: renamed from: setReplyMessageListItemViewStyle$stream_chat_android_ui_components_release */
    public final void m55431x90bc9829(MessageReplyStyle style) {
        AbstractC22676k.m65750j(style, "style");
        this.messageReplyStyle = style;
    }

    public int getItemViewType(BaseMessageItemViewHolder<? extends MessageListItem> viewHolder) {
        AbstractC22676k.m65750j(viewHolder, "viewHolder");
        if (viewHolder instanceof DateDividerViewHolder) {
            return 1001;
        }
        if (viewHolder instanceof MessageDeletedViewHolder) {
            return 1002;
        }
        if (viewHolder instanceof MessagePlainTextViewHolder) {
            return 1003;
        }
        if (viewHolder instanceof CustomAttachmentsViewHolder) {
            return MessageListItemViewType.CUSTOM_ATTACHMENTS;
        }
        if (viewHolder instanceof LoadingMoreViewHolder) {
            return MessageListItemViewType.LOADING_INDICATOR;
        }
        if (viewHolder instanceof ThreadSeparatorViewHolder) {
            return MessageListItemViewType.THREAD_SEPARATOR;
        }
        if (viewHolder instanceof GiphyViewHolder) {
            return MessageListItemViewType.GIPHY;
        }
        if (viewHolder instanceof SystemMessageViewHolder) {
            return MessageListItemViewType.SYSTEM_MESSAGE;
        }
        if (viewHolder instanceof ErrorMessageViewHolder) {
            return MessageListItemViewType.ERROR_MESSAGE;
        }
        if (viewHolder instanceof EmptyViewHolder) {
            return ((EmptyViewHolder) viewHolder).getViewType();
        }
        if (viewHolder instanceof LinkAttachmentsViewHolder) {
            return MessageListItemViewType.LINK_ATTACHMENTS;
        }
        if (viewHolder instanceof GiphyAttachmentViewHolder) {
            return MessageListItemViewType.GIPHY_ATTACHMENT;
        }
        if (viewHolder instanceof FileAttachmentsViewHolder) {
            return MessageListItemViewType.FILE_ATTACHMENTS;
        }
        if (viewHolder instanceof MediaAttachmentsViewHolder) {
            return MessageListItemViewType.MEDIA_ATTACHMENT;
        }
        if (viewHolder instanceof UnreadSeparatorViewHolder) {
            return MessageListItemViewType.UNREAD_SEPARATOR;
        }
        if (viewHolder instanceof PollViewHolder) {
            return MessageListItemViewType.POLL;
        }
        throw new IllegalArgumentException("Unhandled MessageList view holder: " + viewHolder);
    }
}
