package io.getstream.chat.android.p226ui;

import android.content.Context;
import android.widget.TextView;
import f93.InterfaceC14292d;
import io.getstream.chat.android.client.api2.C19054d;
import io.getstream.chat.android.p226ui.common.helper.DateFormatter;
import io.getstream.chat.android.p226ui.common.helper.DefaultDateFormatter;
import io.getstream.chat.android.p226ui.common.helper.DurationFormatter;
import io.getstream.chat.android.p226ui.common.helper.ReactionPushEmojiFactory;
import io.getstream.chat.android.p226ui.common.images.resizing.StreamCdnImageResizing;
import io.getstream.chat.android.p226ui.common.utils.ChannelNameFormatter;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.picker.poll.PollsConfig;
import io.getstream.chat.android.p226ui.feature.messages.composer.attachment.preview.AttachmentPreviewFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.MessageListItem;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.AttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.DefaultQuotedAttachmentMessageFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.attachment.QuotedAttachmentFactoryManager;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory;
import io.getstream.chat.android.p226ui.feature.messages.list.adapter.viewholder.decorator.DecoratorProviderFactory$Companion$defaultFactory$2;
import io.getstream.chat.android.p226ui.font.ChatFonts;
import io.getstream.chat.android.p226ui.font.ChatFontsImpl;
import io.getstream.chat.android.p226ui.font.ChatStyle;
import io.getstream.chat.android.p226ui.helper.CurrentUserProvider;
import io.getstream.chat.android.p226ui.helper.MessagePreviewFormatter;
import io.getstream.chat.android.p226ui.helper.MimeTypeIconProvider;
import io.getstream.chat.android.p226ui.helper.MimeTypeIconProviderImpl;
import io.getstream.chat.android.p226ui.helper.SupportedReactions;
import io.getstream.chat.android.p226ui.helper.transformer.AutoLinkableTextTransformer;
import io.getstream.chat.android.p226ui.helper.transformer.ChatMessageTextTransformer;
import io.getstream.chat.android.p226ui.navigation.ChatNavigator;
import io.getstream.chat.android.p226ui.utils.LazyVarDelegateKt;
import io.getstream.chat.android.p226ui.utils.extensions.MessageKt;
import io.getstream.chat.android.p226ui.widgets.avatar.ChannelAvatarRenderer;
import io.getstream.chat.android.p226ui.widgets.avatar.UserAvatarRenderer;
import j93.InterfaceC21493z;
import l83.C23454a0;
import p710im1.C18681l0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22673i0;
import p715kotlin.jvm.internal.C22684o;
import wb3.AbstractC37056f;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080.¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\f\u0010\r\u0012\u0004\b\u0012\u0010\u0003\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u001a\u0010\u0003\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R1\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b#\u0010\u0003\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R1\u0010,\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020%8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b&\u0010\u001e\u0012\u0004\b+\u0010\u0003\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R1\u00104\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020-8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b.\u0010\u001e\u0012\u0004\b3\u0010\u0003\u001a\u0004\b/\u00100\"\u0004\b1\u00102R1\u0010<\u001a\u0002052\u0006\u0010\u001c\u001a\u0002058F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b6\u0010\u001e\u0012\u0004\b;\u0010\u0003\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R1\u0010D\u001a\u00020=2\u0006\u0010\u001c\u001a\u00020=8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b>\u0010\u001e\u0012\u0004\bC\u0010\u0003\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR1\u0010L\u001a\u00020E2\u0006\u0010\u001c\u001a\u00020E8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bF\u0010\u001e\u0012\u0004\bK\u0010\u0003\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR1\u0010T\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020M8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bN\u0010\u001e\u0012\u0004\bS\u0010\u0003\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR1\u0010\\\u001a\u00020U2\u0006\u0010\u001c\u001a\u00020U8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bV\u0010\u001e\u0012\u0004\b[\u0010\u0003\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR1\u0010d\u001a\u00020]2\u0006\u0010\u001c\u001a\u00020]8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\b^\u0010\u001e\u0012\u0004\bc\u0010\u0003\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR1\u0010l\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020e8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bf\u0010\u001e\u0012\u0004\bk\u0010\u0003\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR1\u0010t\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020m8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bn\u0010\u001e\u0012\u0004\bs\u0010\u0003\u001a\u0004\bo\u0010p\"\u0004\bq\u0010rR1\u0010|\u001a\u00020u2\u0006\u0010\u001c\u001a\u00020u8F@FX\u0087\u008e\u0002¢\u0006\u0018\n\u0004\bv\u0010\u001e\u0012\u0004\b{\u0010\u0003\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR6\u0010\u0084\u0001\u001a\u00020}2\u0006\u0010\u001c\u001a\u00020}8F@FX\u0087\u008e\u0002¢\u0006\u001c\n\u0004\b~\u0010\u001e\u0012\u0005\b\u0083\u0001\u0010\u0003\u001a\u0005\b\u007f\u0010\u0080\u0001\"\u0006\b\u0081\u0001\u0010\u0082\u0001R1\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0086\u0001\u0010\u0087\u0001\u0012\u0005\b\u008c\u0001\u0010\u0003\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R1\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0094\u0001\u0010\u0003\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R1\u0010\u0095\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u0095\u0001\u0010\u008f\u0001\u0012\u0005\b\u0098\u0001\u0010\u0003\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001\"\u0006\b\u0097\u0001\u0010\u0093\u0001R1\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u0012\u0005\b \u0001\u0010\u0003\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R1\u0010¡\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b¡\u0001\u0010\u008f\u0001\u0012\u0005\b¤\u0001\u0010\u0003\u001a\u0006\b¢\u0001\u0010\u0091\u0001\"\u0006\b£\u0001\u0010\u0093\u0001R1\u0010¥\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b¥\u0001\u0010\u008f\u0001\u0012\u0005\b¨\u0001\u0010\u0003\u001a\u0006\b¦\u0001\u0010\u0091\u0001\"\u0006\b§\u0001\u0010\u0093\u0001R1\u0010ª\u0001\u001a\u00030©\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\bª\u0001\u0010«\u0001\u0012\u0005\b°\u0001\u0010\u0003\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R3\u0010²\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\b²\u0001\u0010³\u0001\u0012\u0005\b¸\u0001\u0010\u0003\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R3\u0010º\u0001\u001a\u0005\u0018\u00010¹\u00018\u0006@\u0006X\u0087\u000e¢\u0006\u001f\n\u0006\bº\u0001\u0010»\u0001\u0012\u0005\bÀ\u0001\u0010\u0003\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001¨\u0006Á\u0001"}, m65681d2 = {"Lio/getstream/chat/android/ui/ChatUI;", "", "<init>", "()V", "Landroid/content/Context;", "appContext", "Landroid/content/Context;", "getAppContext$stream_chat_android_ui_components_release", "()Landroid/content/Context;", "setAppContext$stream_chat_android_ui_components_release", "(Landroid/content/Context;)V", "Lio/getstream/chat/android/ui/font/ChatStyle;", "style", "Lio/getstream/chat/android/ui/font/ChatStyle;", "getStyle", "()Lio/getstream/chat/android/ui/font/ChatStyle;", "setStyle", "(Lio/getstream/chat/android/ui/font/ChatStyle;)V", "getStyle$annotations", "Lio/getstream/chat/android/ui/navigation/ChatNavigator;", "navigator", "Lio/getstream/chat/android/ui/navigation/ChatNavigator;", "getNavigator", "()Lio/getstream/chat/android/ui/navigation/ChatNavigator;", "setNavigator", "(Lio/getstream/chat/android/ui/navigation/ChatNavigator;)V", "getNavigator$annotations", "Lio/getstream/chat/android/ui/font/ChatFonts;", "<set-?>", "fonts$delegate", "Lf93/d;", "getFonts", "()Lio/getstream/chat/android/ui/font/ChatFonts;", "setFonts", "(Lio/getstream/chat/android/ui/font/ChatFonts;)V", "getFonts$annotations", "fonts", "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "messageTextTransformer$delegate", "getMessageTextTransformer", "()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", "setMessageTextTransformer", "(Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;)V", "getMessageTextTransformer$annotations", "messageTextTransformer", "Lio/getstream/chat/android/ui/helper/SupportedReactions;", "supportedReactions$delegate", "getSupportedReactions", "()Lio/getstream/chat/android/ui/helper/SupportedReactions;", "setSupportedReactions", "(Lio/getstream/chat/android/ui/helper/SupportedReactions;)V", "getSupportedReactions$annotations", "supportedReactions", "Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;", "reactionPushEmojiFactory$delegate", "getReactionPushEmojiFactory", "()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;", "setReactionPushEmojiFactory", "(Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;)V", "getReactionPushEmojiFactory$annotations", "reactionPushEmojiFactory", "Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;", "mimeTypeIconProvider$delegate", "getMimeTypeIconProvider", "()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;", "setMimeTypeIconProvider", "(Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;)V", "getMimeTypeIconProvider$annotations", "mimeTypeIconProvider", "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", "channelNameFormatter$delegate", "getChannelNameFormatter", "()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", "setChannelNameFormatter", "(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;)V", "getChannelNameFormatter$annotations", "channelNameFormatter", "Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;", "messagePreviewFormatter$delegate", "getMessagePreviewFormatter", "()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;", "setMessagePreviewFormatter", "(Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;)V", "getMessagePreviewFormatter$annotations", "messagePreviewFormatter", "Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "dateFormatter$delegate", "getDateFormatter", "()Lio/getstream/chat/android/ui/common/helper/DateFormatter;", "setDateFormatter", "(Lio/getstream/chat/android/ui/common/helper/DateFormatter;)V", "getDateFormatter$annotations", "dateFormatter", "Lio/getstream/chat/android/ui/common/helper/DurationFormatter;", "durationFormatter$delegate", "getDurationFormatter", "()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;", "setDurationFormatter", "(Lio/getstream/chat/android/ui/common/helper/DurationFormatter;)V", "getDurationFormatter$annotations", "durationFormatter", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", "decoratorProviderFactory$delegate", "getDecoratorProviderFactory", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", "setDecoratorProviderFactory", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;)V", "getDecoratorProviderFactory$annotations", "decoratorProviderFactory", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "attachmentFactoryManager$delegate", "getAttachmentFactoryManager", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", "setAttachmentFactoryManager", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V", "getAttachmentFactoryManager$annotations", "attachmentFactoryManager", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", "attachmentPreviewFactoryManager$delegate", "getAttachmentPreviewFactoryManager", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", "setAttachmentPreviewFactoryManager", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;)V", "getAttachmentPreviewFactoryManager$annotations", "attachmentPreviewFactoryManager", "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;", "quotedAttachmentFactoryManager$delegate", "getQuotedAttachmentFactoryManager", "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;", "setQuotedAttachmentFactoryManager", "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;)V", "getQuotedAttachmentFactoryManager$annotations", "quotedAttachmentFactoryManager", "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;", "currentUserProvider", "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;", "getCurrentUserProvider", "()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;", "setCurrentUserProvider", "(Lio/getstream/chat/android/ui/helper/CurrentUserProvider;)V", "getCurrentUserProvider$annotations", "", "videoThumbnailsEnabled", "Z", "getVideoThumbnailsEnabled", "()Z", "setVideoThumbnailsEnabled", "(Z)V", "getVideoThumbnailsEnabled$annotations", "draftMessagesEnabled", "getDraftMessagesEnabled", "setDraftMessagesEnabled", "getDraftMessagesEnabled$annotations", "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "streamCdnImageResizing", "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "getStreamCdnImageResizing", "()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;", "setStreamCdnImageResizing", "(Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)V", "getStreamCdnImageResizing$annotations", "autoTranslationEnabled", "getAutoTranslationEnabled", "setAutoTranslationEnabled", "getAutoTranslationEnabled$annotations", "showOriginalTranslationEnabled", "getShowOriginalTranslationEnabled", "setShowOriginalTranslationEnabled", "getShowOriginalTranslationEnabled$annotations", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "pollsConfig", "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "getPollsConfig", "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;", "setPollsConfig", "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;)V", "getPollsConfig$annotations", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "userAvatarRenderer", "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "getUserAvatarRenderer", "()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;", "setUserAvatarRenderer", "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;)V", "getUserAvatarRenderer$annotations", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "channelAvatarRenderer", "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "getChannelAvatarRenderer", "()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;", "setChannelAvatarRenderer", "(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V", "getChannelAvatarRenderer$annotations", "stream-chat-android-ui-components_release"}, m65682k = 1, m65683mv = {2, 2, 0}, m65685xi = 48)
public final class ChatUI {
    static final /* synthetic */ InterfaceC21493z[] $$delegatedProperties;
    public static final ChatUI INSTANCE;
    public static Context appContext;

    /* JADX INFO: renamed from: attachmentFactoryManager$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d attachmentFactoryManager;

    /* JADX INFO: renamed from: attachmentPreviewFactoryManager$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d attachmentPreviewFactoryManager;
    private static boolean autoTranslationEnabled;
    private static ChannelAvatarRenderer channelAvatarRenderer;

    /* JADX INFO: renamed from: channelNameFormatter$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d channelNameFormatter;
    private static CurrentUserProvider currentUserProvider;

    /* JADX INFO: renamed from: dateFormatter$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d dateFormatter;

    /* JADX INFO: renamed from: decoratorProviderFactory$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d decoratorProviderFactory;
    private static boolean draftMessagesEnabled;

    /* JADX INFO: renamed from: durationFormatter$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d durationFormatter;

    /* JADX INFO: renamed from: fonts$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d fonts;

    /* JADX INFO: renamed from: messagePreviewFormatter$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d messagePreviewFormatter;

    /* JADX INFO: renamed from: messageTextTransformer$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d messageTextTransformer;

    /* JADX INFO: renamed from: mimeTypeIconProvider$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d mimeTypeIconProvider;
    private static ChatNavigator navigator;
    private static PollsConfig pollsConfig;

    /* JADX INFO: renamed from: quotedAttachmentFactoryManager$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d quotedAttachmentFactoryManager;

    /* JADX INFO: renamed from: reactionPushEmojiFactory$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d reactionPushEmojiFactory;
    private static boolean showOriginalTranslationEnabled;
    private static StreamCdnImageResizing streamCdnImageResizing;
    private static ChatStyle style;

    /* JADX INFO: renamed from: supportedReactions$delegate, reason: from kotlin metadata */
    private static final InterfaceC14292d supportedReactions;
    private static UserAvatarRenderer userAvatarRenderer;
    private static boolean videoThumbnailsEnabled;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        ChatUI chatUI = INSTANCE;
        C22684o c22684o = new C22684o(chatUI, ChatUI.class, "fonts", "getFonts()Lio/getstream/chat/android/ui/font/ChatFonts;", 0);
        C22673i0 c22673i0 = AbstractC22671h0.f89337a;
        $$delegatedProperties = new InterfaceC21493z[]{c22673i0.mutableProperty0(c22684o), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "messageTextTransformer", "getMessageTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "supportedReactions", "getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "reactionPushEmojiFactory", "getReactionPushEmojiFactory()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "mimeTypeIconProvider", "getMimeTypeIconProvider()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "channelNameFormatter", "getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "messagePreviewFormatter", "getMessagePreviewFormatter()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "dateFormatter", "getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "durationFormatter", "getDurationFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "decoratorProviderFactory", "getDecoratorProviderFactory()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "attachmentFactoryManager", "getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "attachmentPreviewFactoryManager", "getAttachmentPreviewFactoryManager()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;", 0)), c22673i0.mutableProperty0(new C22684o(chatUI, ChatUI.class, "quotedAttachmentFactoryManager", "getQuotedAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;", 0))};
        INSTANCE = new ChatUI();
        style = new ChatStyle();
        navigator = new ChatNavigator(null, 1, 0 == true ? 1 : 0);
        fonts = LazyVarDelegateKt.lazyVar(new C18681l0(10));
        messageTextTransformer = LazyVarDelegateKt.lazyVar(new C18681l0(17));
        supportedReactions = LazyVarDelegateKt.lazyVar(new C18681l0(18));
        reactionPushEmojiFactory = LazyVarDelegateKt.lazyVar(new C18681l0(19));
        mimeTypeIconProvider = LazyVarDelegateKt.lazyVar(new C18681l0(20));
        channelNameFormatter = LazyVarDelegateKt.lazyVar(new C18681l0(21));
        messagePreviewFormatter = LazyVarDelegateKt.lazyVar(new C18681l0(22));
        dateFormatter = LazyVarDelegateKt.lazyVar(new C18681l0(11));
        durationFormatter = LazyVarDelegateKt.lazyVar(new C18681l0(12));
        decoratorProviderFactory = LazyVarDelegateKt.lazyVar(new C18681l0(13));
        attachmentFactoryManager = LazyVarDelegateKt.lazyVar(new C18681l0(14));
        attachmentPreviewFactoryManager = LazyVarDelegateKt.lazyVar(new C18681l0(15));
        quotedAttachmentFactoryManager = LazyVarDelegateKt.lazyVar(new C18681l0(16));
        currentUserProvider = CurrentUserProvider.INSTANCE.defaultCurrentUserProvider();
        videoThumbnailsEnabled = true;
        draftMessagesEnabled = true;
        streamCdnImageResizing = StreamCdnImageResizing.INSTANCE.defaultStreamCdnImageResizing();
        autoTranslationEnabled = true;
        showOriginalTranslationEnabled = true;
        PollsConfig.INSTANCE.getClass();
        pollsConfig = PollsConfig.Default;
    }

    private ChatUI() {
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ DefaultDateFormatter m54988a() {
        return (DefaultDateFormatter) dateFormatter_delegate$lambda$8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AttachmentFactoryManager attachmentFactoryManager_delegate$lambda$11() {
        return new AttachmentFactoryManager(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final AttachmentPreviewFactoryManager attachmentPreviewFactoryManager_delegate$lambda$12() {
        return new AttachmentPreviewFactoryManager(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ChannelNameFormatter channelNameFormatter_delegate$lambda$6() {
        return ChannelNameFormatter.Companion.defaultFormatter$default(ChannelNameFormatter.INSTANCE, INSTANCE.getAppContext$stream_chat_android_ui_components_release(), 0, 0, 6, null);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ ChatFontsImpl m54991d() {
        return (ChatFontsImpl) fonts_delegate$lambda$0();
    }

    private static final DateFormatter dateFormatter_delegate$lambda$8() {
        return DateFormatter.Companion.from$default(DateFormatter.INSTANCE, INSTANCE.getAppContext$stream_chat_android_ui_components_release(), null, 2, null);
    }

    private static final DecoratorProviderFactory decoratorProviderFactory_delegate$lambda$10() {
        return DecoratorProviderFactory.Companion.defaultFactory$default(DecoratorProviderFactory.INSTANCE, null, 1, null);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ DecoratorProviderFactory$Companion$defaultFactory$2 m54992e() {
        return (DecoratorProviderFactory$Companion$defaultFactory$2) decoratorProviderFactory_delegate$lambda$10();
    }

    private static final ChatFonts fonts_delegate$lambda$0() {
        return new ChatFontsImpl(style, INSTANCE.getAppContext$stream_chat_android_ui_components_release());
    }

    public static final AttachmentFactoryManager getAttachmentFactoryManager() {
        return (AttachmentFactoryManager) attachmentFactoryManager.getValue(INSTANCE, $$delegatedProperties[10]);
    }

    public static /* synthetic */ void getAttachmentFactoryManager$annotations() {
    }

    public static final AttachmentPreviewFactoryManager getAttachmentPreviewFactoryManager() {
        return (AttachmentPreviewFactoryManager) attachmentPreviewFactoryManager.getValue(INSTANCE, $$delegatedProperties[11]);
    }

    public static /* synthetic */ void getAttachmentPreviewFactoryManager$annotations() {
    }

    public static final boolean getAutoTranslationEnabled() {
        return autoTranslationEnabled;
    }

    public static /* synthetic */ void getAutoTranslationEnabled$annotations() {
    }

    public static final ChannelAvatarRenderer getChannelAvatarRenderer() {
        return channelAvatarRenderer;
    }

    public static /* synthetic */ void getChannelAvatarRenderer$annotations() {
    }

    public static final ChannelNameFormatter getChannelNameFormatter() {
        return (ChannelNameFormatter) channelNameFormatter.getValue(INSTANCE, $$delegatedProperties[5]);
    }

    public static /* synthetic */ void getChannelNameFormatter$annotations() {
    }

    public static final CurrentUserProvider getCurrentUserProvider() {
        return currentUserProvider;
    }

    public static /* synthetic */ void getCurrentUserProvider$annotations() {
    }

    public static final DateFormatter getDateFormatter() {
        return (DateFormatter) dateFormatter.getValue(INSTANCE, $$delegatedProperties[7]);
    }

    public static /* synthetic */ void getDateFormatter$annotations() {
    }

    public static final DecoratorProviderFactory getDecoratorProviderFactory() {
        return (DecoratorProviderFactory) decoratorProviderFactory.getValue(INSTANCE, $$delegatedProperties[9]);
    }

    public static /* synthetic */ void getDecoratorProviderFactory$annotations() {
    }

    public static final boolean getDraftMessagesEnabled() {
        return draftMessagesEnabled;
    }

    public static /* synthetic */ void getDraftMessagesEnabled$annotations() {
    }

    public static final DurationFormatter getDurationFormatter() {
        return (DurationFormatter) durationFormatter.getValue(INSTANCE, $$delegatedProperties[8]);
    }

    public static /* synthetic */ void getDurationFormatter$annotations() {
    }

    public static final ChatFonts getFonts() {
        return (ChatFonts) fonts.getValue(INSTANCE, $$delegatedProperties[0]);
    }

    public static /* synthetic */ void getFonts$annotations() {
    }

    public static final MessagePreviewFormatter getMessagePreviewFormatter() {
        return (MessagePreviewFormatter) messagePreviewFormatter.getValue(INSTANCE, $$delegatedProperties[6]);
    }

    public static /* synthetic */ void getMessagePreviewFormatter$annotations() {
    }

    public static final ChatMessageTextTransformer getMessageTextTransformer() {
        return (ChatMessageTextTransformer) messageTextTransformer.getValue(INSTANCE, $$delegatedProperties[1]);
    }

    public static /* synthetic */ void getMessageTextTransformer$annotations() {
    }

    public static final MimeTypeIconProvider getMimeTypeIconProvider() {
        return (MimeTypeIconProvider) mimeTypeIconProvider.getValue(INSTANCE, $$delegatedProperties[4]);
    }

    public static /* synthetic */ void getMimeTypeIconProvider$annotations() {
    }

    public static final ChatNavigator getNavigator() {
        return navigator;
    }

    public static /* synthetic */ void getNavigator$annotations() {
    }

    public static final PollsConfig getPollsConfig() {
        return pollsConfig;
    }

    public static /* synthetic */ void getPollsConfig$annotations() {
    }

    public static final QuotedAttachmentFactoryManager getQuotedAttachmentFactoryManager() {
        return (QuotedAttachmentFactoryManager) quotedAttachmentFactoryManager.getValue(INSTANCE, $$delegatedProperties[12]);
    }

    public static /* synthetic */ void getQuotedAttachmentFactoryManager$annotations() {
    }

    public static final ReactionPushEmojiFactory getReactionPushEmojiFactory() {
        return (ReactionPushEmojiFactory) reactionPushEmojiFactory.getValue(INSTANCE, $$delegatedProperties[3]);
    }

    public static /* synthetic */ void getReactionPushEmojiFactory$annotations() {
    }

    public static final boolean getShowOriginalTranslationEnabled() {
        return showOriginalTranslationEnabled;
    }

    public static /* synthetic */ void getShowOriginalTranslationEnabled$annotations() {
    }

    public static final StreamCdnImageResizing getStreamCdnImageResizing() {
        return streamCdnImageResizing;
    }

    public static /* synthetic */ void getStreamCdnImageResizing$annotations() {
    }

    public static final ChatStyle getStyle() {
        return style;
    }

    public static /* synthetic */ void getStyle$annotations() {
    }

    public static final SupportedReactions getSupportedReactions() {
        return (SupportedReactions) supportedReactions.getValue(INSTANCE, $$delegatedProperties[2]);
    }

    public static /* synthetic */ void getSupportedReactions$annotations() {
    }

    public static final UserAvatarRenderer getUserAvatarRenderer() {
        return userAvatarRenderer;
    }

    public static /* synthetic */ void getUserAvatarRenderer$annotations() {
    }

    public static final boolean getVideoThumbnailsEnabled() {
        return videoThumbnailsEnabled;
    }

    public static /* synthetic */ void getVideoThumbnailsEnabled$annotations() {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ AutoLinkableTextTransformer m54998k() {
        return (AutoLinkableTextTransformer) messageTextTransformer_delegate$lambda$2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MessagePreviewFormatter messagePreviewFormatter_delegate$lambda$7() {
        return MessagePreviewFormatter.INSTANCE.defaultFormatter(INSTANCE.getAppContext$stream_chat_android_ui_components_release());
    }

    private static final ChatMessageTextTransformer messageTextTransformer_delegate$lambda$2() {
        return new AutoLinkableTextTransformer(new C19054d(18));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 messageTextTransformer_delegate$lambda$2$lambda$1(TextView textView, MessageListItem.MessageItem messageItem) {
        AbstractC22676k.m65750j(textView, "textView");
        AbstractC22676k.m65750j(messageItem, "messageItem");
        textView.setText(MessageKt.getToggleableTranslatedText$default(messageItem.getMessage(), messageItem.getShowOriginalText(), null, 2, null));
        return C23454a0.f92919a;
    }

    private static final MimeTypeIconProvider mimeTypeIconProvider_delegate$lambda$5() {
        return new MimeTypeIconProviderImpl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final QuotedAttachmentFactoryManager quotedAttachmentFactoryManager_delegate$lambda$13() {
        return new QuotedAttachmentFactoryManager(AbstractC37056f.m118958J(new DefaultQuotedAttachmentMessageFactory()));
    }

    public static final void setAttachmentFactoryManager(AttachmentFactoryManager attachmentFactoryManager2) {
        AbstractC22676k.m65750j(attachmentFactoryManager2, "<set-?>");
        attachmentFactoryManager.setValue(INSTANCE, $$delegatedProperties[10], attachmentFactoryManager2);
    }

    public static final void setAttachmentPreviewFactoryManager(AttachmentPreviewFactoryManager attachmentPreviewFactoryManager2) {
        AbstractC22676k.m65750j(attachmentPreviewFactoryManager2, "<set-?>");
        attachmentPreviewFactoryManager.setValue(INSTANCE, $$delegatedProperties[11], attachmentPreviewFactoryManager2);
    }

    public static final void setAutoTranslationEnabled(boolean z4) {
        autoTranslationEnabled = z4;
    }

    public static final void setChannelAvatarRenderer(ChannelAvatarRenderer channelAvatarRenderer2) {
        channelAvatarRenderer = channelAvatarRenderer2;
    }

    public static final void setChannelNameFormatter(ChannelNameFormatter channelNameFormatter2) {
        AbstractC22676k.m65750j(channelNameFormatter2, "<set-?>");
        channelNameFormatter.setValue(INSTANCE, $$delegatedProperties[5], channelNameFormatter2);
    }

    public static final void setCurrentUserProvider(CurrentUserProvider currentUserProvider2) {
        AbstractC22676k.m65750j(currentUserProvider2, "<set-?>");
        currentUserProvider = currentUserProvider2;
    }

    public static final void setDateFormatter(DateFormatter dateFormatter2) {
        AbstractC22676k.m65750j(dateFormatter2, "<set-?>");
        dateFormatter.setValue(INSTANCE, $$delegatedProperties[7], dateFormatter2);
    }

    public static final void setDecoratorProviderFactory(DecoratorProviderFactory decoratorProviderFactory2) {
        AbstractC22676k.m65750j(decoratorProviderFactory2, "<set-?>");
        decoratorProviderFactory.setValue(INSTANCE, $$delegatedProperties[9], decoratorProviderFactory2);
    }

    public static final void setDraftMessagesEnabled(boolean z4) {
        draftMessagesEnabled = z4;
    }

    public static final void setDurationFormatter(DurationFormatter durationFormatter2) {
        AbstractC22676k.m65750j(durationFormatter2, "<set-?>");
        durationFormatter.setValue(INSTANCE, $$delegatedProperties[8], durationFormatter2);
    }

    public static final void setFonts(ChatFonts chatFonts) {
        AbstractC22676k.m65750j(chatFonts, "<set-?>");
        fonts.setValue(INSTANCE, $$delegatedProperties[0], chatFonts);
    }

    public static final void setMessagePreviewFormatter(MessagePreviewFormatter messagePreviewFormatter2) {
        AbstractC22676k.m65750j(messagePreviewFormatter2, "<set-?>");
        messagePreviewFormatter.setValue(INSTANCE, $$delegatedProperties[6], messagePreviewFormatter2);
    }

    public static final void setMessageTextTransformer(ChatMessageTextTransformer chatMessageTextTransformer) {
        AbstractC22676k.m65750j(chatMessageTextTransformer, "<set-?>");
        messageTextTransformer.setValue(INSTANCE, $$delegatedProperties[1], chatMessageTextTransformer);
    }

    public static final void setMimeTypeIconProvider(MimeTypeIconProvider mimeTypeIconProvider2) {
        AbstractC22676k.m65750j(mimeTypeIconProvider2, "<set-?>");
        mimeTypeIconProvider.setValue(INSTANCE, $$delegatedProperties[4], mimeTypeIconProvider2);
    }

    public static final void setNavigator(ChatNavigator chatNavigator) {
        AbstractC22676k.m65750j(chatNavigator, "<set-?>");
        navigator = chatNavigator;
    }

    public static final void setPollsConfig(PollsConfig pollsConfig2) {
        AbstractC22676k.m65750j(pollsConfig2, "<set-?>");
        pollsConfig = pollsConfig2;
    }

    public static final void setQuotedAttachmentFactoryManager(QuotedAttachmentFactoryManager quotedAttachmentFactoryManager2) {
        AbstractC22676k.m65750j(quotedAttachmentFactoryManager2, "<set-?>");
        quotedAttachmentFactoryManager.setValue(INSTANCE, $$delegatedProperties[12], quotedAttachmentFactoryManager2);
    }

    public static final void setReactionPushEmojiFactory(ReactionPushEmojiFactory reactionPushEmojiFactory2) {
        AbstractC22676k.m65750j(reactionPushEmojiFactory2, "<set-?>");
        reactionPushEmojiFactory.setValue(INSTANCE, $$delegatedProperties[3], reactionPushEmojiFactory2);
    }

    public static final void setShowOriginalTranslationEnabled(boolean z4) {
        showOriginalTranslationEnabled = z4;
    }

    public static final void setStreamCdnImageResizing(StreamCdnImageResizing streamCdnImageResizing2) {
        AbstractC22676k.m65750j(streamCdnImageResizing2, "<set-?>");
        streamCdnImageResizing = streamCdnImageResizing2;
    }

    public static final void setStyle(ChatStyle chatStyle) {
        AbstractC22676k.m65750j(chatStyle, "<set-?>");
        style = chatStyle;
    }

    public static final void setSupportedReactions(SupportedReactions supportedReactions2) {
        AbstractC22676k.m65750j(supportedReactions2, "<set-?>");
        supportedReactions.setValue(INSTANCE, $$delegatedProperties[2], supportedReactions2);
    }

    public static final void setUserAvatarRenderer(UserAvatarRenderer userAvatarRenderer2) {
        userAvatarRenderer = userAvatarRenderer2;
    }

    public static final void setVideoThumbnailsEnabled(boolean z4) {
        videoThumbnailsEnabled = z4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportedReactions supportedReactions_delegate$lambda$3() {
        return new SupportedReactions(INSTANCE.getAppContext$stream_chat_android_ui_components_release(), null, 2, null);
    }

    public final Context getAppContext$stream_chat_android_ui_components_release() {
        Context context = appContext;
        if (context != null) {
            return context;
        }
        AbstractC22676k.m65757q("appContext");
        throw null;
    }

    public final void setAppContext$stream_chat_android_ui_components_release(Context context) {
        AbstractC22676k.m65750j(context, "<set-?>");
        appContext = context;
    }
}
