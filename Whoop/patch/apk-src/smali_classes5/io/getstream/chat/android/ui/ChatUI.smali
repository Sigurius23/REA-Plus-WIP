.class public final Lio/getstream/chat/android/ui/ChatUI;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00bc\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\"\u0010\u0005\u001a\u00020\u00048\u0000@\u0000X\u0080.\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010\u0006\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR(\u0010\u000c\u001a\u00020\u000b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u000c\u0010\r\u0012\u0004\u0008\u0012\u0010\u0003\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R(\u0010\u0014\u001a\u00020\u00138\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0018\n\u0004\u0008\u0014\u0010\u0015\u0012\u0004\u0008\u001a\u0010\u0003\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R1\u0010$\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001b8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008\u001d\u0010\u001e\u0012\u0004\u0008#\u0010\u0003\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R1\u0010,\u001a\u00020%2\u0006\u0010\u001c\u001a\u00020%8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008&\u0010\u001e\u0012\u0004\u0008+\u0010\u0003\u001a\u0004\u0008\'\u0010(\"\u0004\u0008)\u0010*R1\u00104\u001a\u00020-2\u0006\u0010\u001c\u001a\u00020-8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008.\u0010\u001e\u0012\u0004\u00083\u0010\u0003\u001a\u0004\u0008/\u00100\"\u0004\u00081\u00102R1\u0010<\u001a\u0002052\u0006\u0010\u001c\u001a\u0002058F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u00086\u0010\u001e\u0012\u0004\u0008;\u0010\u0003\u001a\u0004\u00087\u00108\"\u0004\u00089\u0010:R1\u0010D\u001a\u00020=2\u0006\u0010\u001c\u001a\u00020=8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008>\u0010\u001e\u0012\u0004\u0008C\u0010\u0003\u001a\u0004\u0008?\u0010@\"\u0004\u0008A\u0010BR1\u0010L\u001a\u00020E2\u0006\u0010\u001c\u001a\u00020E8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008F\u0010\u001e\u0012\u0004\u0008K\u0010\u0003\u001a\u0004\u0008G\u0010H\"\u0004\u0008I\u0010JR1\u0010T\u001a\u00020M2\u0006\u0010\u001c\u001a\u00020M8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008N\u0010\u001e\u0012\u0004\u0008S\u0010\u0003\u001a\u0004\u0008O\u0010P\"\u0004\u0008Q\u0010RR1\u0010\\\u001a\u00020U2\u0006\u0010\u001c\u001a\u00020U8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008V\u0010\u001e\u0012\u0004\u0008[\u0010\u0003\u001a\u0004\u0008W\u0010X\"\u0004\u0008Y\u0010ZR1\u0010d\u001a\u00020]2\u0006\u0010\u001c\u001a\u00020]8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008^\u0010\u001e\u0012\u0004\u0008c\u0010\u0003\u001a\u0004\u0008_\u0010`\"\u0004\u0008a\u0010bR1\u0010l\u001a\u00020e2\u0006\u0010\u001c\u001a\u00020e8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008f\u0010\u001e\u0012\u0004\u0008k\u0010\u0003\u001a\u0004\u0008g\u0010h\"\u0004\u0008i\u0010jR1\u0010t\u001a\u00020m2\u0006\u0010\u001c\u001a\u00020m8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008n\u0010\u001e\u0012\u0004\u0008s\u0010\u0003\u001a\u0004\u0008o\u0010p\"\u0004\u0008q\u0010rR1\u0010|\u001a\u00020u2\u0006\u0010\u001c\u001a\u00020u8F@FX\u0087\u008e\u0002\u00a2\u0006\u0018\n\u0004\u0008v\u0010\u001e\u0012\u0004\u0008{\u0010\u0003\u001a\u0004\u0008w\u0010x\"\u0004\u0008y\u0010zR6\u0010\u0084\u0001\u001a\u00020}2\u0006\u0010\u001c\u001a\u00020}8F@FX\u0087\u008e\u0002\u00a2\u0006\u001c\n\u0004\u0008~\u0010\u001e\u0012\u0005\u0008\u0083\u0001\u0010\u0003\u001a\u0005\u0008\u007f\u0010\u0080\u0001\"\u0006\u0008\u0081\u0001\u0010\u0082\u0001R1\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u0086\u0001\u0010\u0087\u0001\u0012\u0005\u0008\u008c\u0001\u0010\u0003\u001a\u0006\u0008\u0088\u0001\u0010\u0089\u0001\"\u0006\u0008\u008a\u0001\u0010\u008b\u0001R1\u0010\u008e\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u008e\u0001\u0010\u008f\u0001\u0012\u0005\u0008\u0094\u0001\u0010\u0003\u001a\u0006\u0008\u0090\u0001\u0010\u0091\u0001\"\u0006\u0008\u0092\u0001\u0010\u0093\u0001R1\u0010\u0095\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u0095\u0001\u0010\u008f\u0001\u0012\u0005\u0008\u0098\u0001\u0010\u0003\u001a\u0006\u0008\u0096\u0001\u0010\u0091\u0001\"\u0006\u0008\u0097\u0001\u0010\u0093\u0001R1\u0010\u009a\u0001\u001a\u00030\u0099\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u009a\u0001\u0010\u009b\u0001\u0012\u0005\u0008\u00a0\u0001\u0010\u0003\u001a\u0006\u0008\u009c\u0001\u0010\u009d\u0001\"\u0006\u0008\u009e\u0001\u0010\u009f\u0001R1\u0010\u00a1\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00a1\u0001\u0010\u008f\u0001\u0012\u0005\u0008\u00a4\u0001\u0010\u0003\u001a\u0006\u0008\u00a2\u0001\u0010\u0091\u0001\"\u0006\u0008\u00a3\u0001\u0010\u0093\u0001R1\u0010\u00a5\u0001\u001a\u00030\u008d\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00a5\u0001\u0010\u008f\u0001\u0012\u0005\u0008\u00a8\u0001\u0010\u0003\u001a\u0006\u0008\u00a6\u0001\u0010\u0091\u0001\"\u0006\u0008\u00a7\u0001\u0010\u0093\u0001R1\u0010\u00aa\u0001\u001a\u00030\u00a9\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00aa\u0001\u0010\u00ab\u0001\u0012\u0005\u0008\u00b0\u0001\u0010\u0003\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001\"\u0006\u0008\u00ae\u0001\u0010\u00af\u0001R3\u0010\u00b2\u0001\u001a\u0005\u0018\u00010\u00b1\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00b2\u0001\u0010\u00b3\u0001\u0012\u0005\u0008\u00b8\u0001\u0010\u0003\u001a\u0006\u0008\u00b4\u0001\u0010\u00b5\u0001\"\u0006\u0008\u00b6\u0001\u0010\u00b7\u0001R3\u0010\u00ba\u0001\u001a\u0005\u0018\u00010\u00b9\u00018\u0006@\u0006X\u0087\u000e\u00a2\u0006\u001f\n\u0006\u0008\u00ba\u0001\u0010\u00bb\u0001\u0012\u0005\u0008\u00c0\u0001\u0010\u0003\u001a\u0006\u0008\u00bc\u0001\u0010\u00bd\u0001\"\u0006\u0008\u00be\u0001\u0010\u00bf\u0001\u00a8\u0006\u00c1\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/ChatUI;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "appContext",
        "Landroid/content/Context;",
        "getAppContext$stream_chat_android_ui_components_release",
        "()Landroid/content/Context;",
        "setAppContext$stream_chat_android_ui_components_release",
        "(Landroid/content/Context;)V",
        "Lio/getstream/chat/android/ui/font/ChatStyle;",
        "style",
        "Lio/getstream/chat/android/ui/font/ChatStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/font/ChatStyle;",
        "setStyle",
        "(Lio/getstream/chat/android/ui/font/ChatStyle;)V",
        "getStyle$annotations",
        "Lio/getstream/chat/android/ui/navigation/ChatNavigator;",
        "navigator",
        "Lio/getstream/chat/android/ui/navigation/ChatNavigator;",
        "getNavigator",
        "()Lio/getstream/chat/android/ui/navigation/ChatNavigator;",
        "setNavigator",
        "(Lio/getstream/chat/android/ui/navigation/ChatNavigator;)V",
        "getNavigator$annotations",
        "Lio/getstream/chat/android/ui/font/ChatFonts;",
        "<set-?>",
        "fonts$delegate",
        "Lf93/d;",
        "getFonts",
        "()Lio/getstream/chat/android/ui/font/ChatFonts;",
        "setFonts",
        "(Lio/getstream/chat/android/ui/font/ChatFonts;)V",
        "getFonts$annotations",
        "fonts",
        "Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "messageTextTransformer$delegate",
        "getMessageTextTransformer",
        "()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;",
        "setMessageTextTransformer",
        "(Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;)V",
        "getMessageTextTransformer$annotations",
        "messageTextTransformer",
        "Lio/getstream/chat/android/ui/helper/SupportedReactions;",
        "supportedReactions$delegate",
        "getSupportedReactions",
        "()Lio/getstream/chat/android/ui/helper/SupportedReactions;",
        "setSupportedReactions",
        "(Lio/getstream/chat/android/ui/helper/SupportedReactions;)V",
        "getSupportedReactions$annotations",
        "supportedReactions",
        "Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;",
        "reactionPushEmojiFactory$delegate",
        "getReactionPushEmojiFactory",
        "()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;",
        "setReactionPushEmojiFactory",
        "(Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;)V",
        "getReactionPushEmojiFactory$annotations",
        "reactionPushEmojiFactory",
        "Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;",
        "mimeTypeIconProvider$delegate",
        "getMimeTypeIconProvider",
        "()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;",
        "setMimeTypeIconProvider",
        "(Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;)V",
        "getMimeTypeIconProvider$annotations",
        "mimeTypeIconProvider",
        "Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;",
        "channelNameFormatter$delegate",
        "getChannelNameFormatter",
        "()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;",
        "setChannelNameFormatter",
        "(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;)V",
        "getChannelNameFormatter$annotations",
        "channelNameFormatter",
        "Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;",
        "messagePreviewFormatter$delegate",
        "getMessagePreviewFormatter",
        "()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;",
        "setMessagePreviewFormatter",
        "(Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;)V",
        "getMessagePreviewFormatter$annotations",
        "messagePreviewFormatter",
        "Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "dateFormatter$delegate",
        "getDateFormatter",
        "()Lio/getstream/chat/android/ui/common/helper/DateFormatter;",
        "setDateFormatter",
        "(Lio/getstream/chat/android/ui/common/helper/DateFormatter;)V",
        "getDateFormatter$annotations",
        "dateFormatter",
        "Lio/getstream/chat/android/ui/common/helper/DurationFormatter;",
        "durationFormatter$delegate",
        "getDurationFormatter",
        "()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;",
        "setDurationFormatter",
        "(Lio/getstream/chat/android/ui/common/helper/DurationFormatter;)V",
        "getDurationFormatter$annotations",
        "durationFormatter",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;",
        "decoratorProviderFactory$delegate",
        "getDecoratorProviderFactory",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;",
        "setDecoratorProviderFactory",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;)V",
        "getDecoratorProviderFactory$annotations",
        "decoratorProviderFactory",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "attachmentFactoryManager$delegate",
        "getAttachmentFactoryManager",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;",
        "setAttachmentFactoryManager",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V",
        "getAttachmentFactoryManager$annotations",
        "attachmentFactoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;",
        "attachmentPreviewFactoryManager$delegate",
        "getAttachmentPreviewFactoryManager",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;",
        "setAttachmentPreviewFactoryManager",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;)V",
        "getAttachmentPreviewFactoryManager$annotations",
        "attachmentPreviewFactoryManager",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;",
        "quotedAttachmentFactoryManager$delegate",
        "getQuotedAttachmentFactoryManager",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;",
        "setQuotedAttachmentFactoryManager",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;)V",
        "getQuotedAttachmentFactoryManager$annotations",
        "quotedAttachmentFactoryManager",
        "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;",
        "currentUserProvider",
        "Lio/getstream/chat/android/ui/helper/CurrentUserProvider;",
        "getCurrentUserProvider",
        "()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;",
        "setCurrentUserProvider",
        "(Lio/getstream/chat/android/ui/helper/CurrentUserProvider;)V",
        "getCurrentUserProvider$annotations",
        "",
        "videoThumbnailsEnabled",
        "Z",
        "getVideoThumbnailsEnabled",
        "()Z",
        "setVideoThumbnailsEnabled",
        "(Z)V",
        "getVideoThumbnailsEnabled$annotations",
        "draftMessagesEnabled",
        "getDraftMessagesEnabled",
        "setDraftMessagesEnabled",
        "getDraftMessagesEnabled$annotations",
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
        "streamCdnImageResizing",
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
        "getStreamCdnImageResizing",
        "()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
        "setStreamCdnImageResizing",
        "(Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)V",
        "getStreamCdnImageResizing$annotations",
        "autoTranslationEnabled",
        "getAutoTranslationEnabled",
        "setAutoTranslationEnabled",
        "getAutoTranslationEnabled$annotations",
        "showOriginalTranslationEnabled",
        "getShowOriginalTranslationEnabled",
        "setShowOriginalTranslationEnabled",
        "getShowOriginalTranslationEnabled$annotations",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        "pollsConfig",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        "getPollsConfig",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;",
        "setPollsConfig",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;)V",
        "getPollsConfig$annotations",
        "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;",
        "userAvatarRenderer",
        "Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;",
        "getUserAvatarRenderer",
        "()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;",
        "setUserAvatarRenderer",
        "(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;)V",
        "getUserAvatarRenderer$annotations",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "channelAvatarRenderer",
        "Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "getChannelAvatarRenderer",
        "()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;",
        "setChannelAvatarRenderer",
        "(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V",
        "getChannelAvatarRenderer$annotations",
        "stream-chat-android-ui-components_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic $$delegatedProperties:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

.field public static appContext:Landroid/content/Context;

.field private static final attachmentFactoryManager$delegate:Lf93/d;

.field private static final attachmentPreviewFactoryManager$delegate:Lf93/d;

.field private static autoTranslationEnabled:Z

.field private static channelAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

.field private static final channelNameFormatter$delegate:Lf93/d;

.field private static currentUserProvider:Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

.field private static final dateFormatter$delegate:Lf93/d;

.field private static final decoratorProviderFactory$delegate:Lf93/d;

.field private static draftMessagesEnabled:Z

.field private static final durationFormatter$delegate:Lf93/d;

.field private static final fonts$delegate:Lf93/d;

.field private static final messagePreviewFormatter$delegate:Lf93/d;

.field private static final messageTextTransformer$delegate:Lf93/d;

.field private static final mimeTypeIconProvider$delegate:Lf93/d;

.field private static navigator:Lio/getstream/chat/android/ui/navigation/ChatNavigator;

.field private static pollsConfig:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

.field private static final quotedAttachmentFactoryManager$delegate:Lf93/d;

.field private static final reactionPushEmojiFactory$delegate:Lf93/d;

.field private static showOriginalTranslationEnabled:Z

.field private static streamCdnImageResizing:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

.field private static style:Lio/getstream/chat/android/ui/font/ChatStyle;

.field private static final supportedReactions$delegate:Lf93/d;

.field private static userAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;

.field private static videoThumbnailsEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 19

    new-instance v0, Lkotlin/jvm/internal/o;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "getFonts()Lio/getstream/chat/android/ui/font/ChatFonts;"

    const/4 v5, 0x0

    move-object v1, v2

    const-class v2, Lio/getstream/chat/android/ui/ChatUI;

    const-string v3, "fonts"

    invoke-direct/range {v0 .. v5}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    move-object v2, v1

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v0

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getMessageTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;"

    const/4 v6, 0x0

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "messageTextTransformer"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v8

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "supportedReactions"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v9

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getReactionPushEmojiFactory()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "reactionPushEmojiFactory"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v10

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getMimeTypeIconProvider()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "mimeTypeIconProvider"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v11

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "channelNameFormatter"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v12

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getMessagePreviewFormatter()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "messagePreviewFormatter"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v13

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "dateFormatter"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v14

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getDurationFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "durationFormatter"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v15

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getDecoratorProviderFactory()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "decoratorProviderFactory"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v16

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "attachmentFactoryManager"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v17

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getAttachmentPreviewFactoryManager()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "attachmentPreviewFactoryManager"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v18

    new-instance v1, Lkotlin/jvm/internal/o;

    const-string v5, "getQuotedAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;"

    const-class v3, Lio/getstream/chat/android/ui/ChatUI;

    const-string v4, "quotedAttachmentFactoryManager"

    invoke-direct/range {v1 .. v6}, Lkotlin/jvm/internal/a0;-><init>(Ljava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v7, v1}, Lkotlin/jvm/internal/i0;->mutableProperty0(Lkotlin/jvm/internal/n;)Lj93/j;

    move-result-object v1

    const/16 v2, 0xd

    new-array v3, v2, [Lj93/z;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v8, v3, v0

    const/4 v4, 0x2

    aput-object v9, v3, v4

    const/4 v4, 0x3

    aput-object v10, v3, v4

    const/4 v4, 0x4

    aput-object v11, v3, v4

    const/4 v4, 0x5

    aput-object v12, v3, v4

    const/4 v4, 0x6

    aput-object v13, v3, v4

    const/4 v4, 0x7

    aput-object v14, v3, v4

    const/16 v4, 0x8

    aput-object v15, v3, v4

    const/16 v4, 0x9

    aput-object v16, v3, v4

    const/16 v4, 0xa

    aput-object v17, v3, v4

    const/16 v5, 0xb

    aput-object v18, v3, v5

    const/16 v6, 0xc

    aput-object v1, v3, v6

    sput-object v3, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    new-instance v1, Lio/getstream/chat/android/ui/ChatUI;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    new-instance v1, Lio/getstream/chat/android/ui/font/ChatStyle;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->style:Lio/getstream/chat/android/ui/font/ChatStyle;

    new-instance v1, Lio/getstream/chat/android/ui/navigation/ChatNavigator;

    const/4 v3, 0x0

    invoke-direct {v1, v3, v0, v3}, Lio/getstream/chat/android/ui/navigation/ChatNavigator;-><init>(Lio/getstream/chat/android/ui/navigation/ChatNavigationHandler;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->navigator:Lio/getstream/chat/android/ui/navigation/ChatNavigator;

    new-instance v1, Lim1/l0;

    invoke-direct {v1, v4}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->fonts$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x11

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->messageTextTransformer$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x12

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->supportedReactions$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x13

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->reactionPushEmojiFactory$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x14

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->mimeTypeIconProvider$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x15

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->channelNameFormatter$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v3, 0x16

    invoke-direct {v1, v3}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->messagePreviewFormatter$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    invoke-direct {v1, v5}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->dateFormatter$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    invoke-direct {v1, v6}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->durationFormatter$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    invoke-direct {v1, v2}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->decoratorProviderFactory$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->attachmentFactoryManager$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v2, 0xf

    invoke-direct {v1, v2}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->attachmentPreviewFactoryManager$delegate:Lf93/d;

    new-instance v1, Lim1/l0;

    const/16 v2, 0x10

    invoke-direct {v1, v2}, Lim1/l0;-><init>(I)V

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/LazyVarDelegateKt;->lazyVar(Lc93/a;)Lf93/d;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->quotedAttachmentFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->Companion:Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider$Companion;->defaultCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->currentUserProvider:Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    sput-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->videoThumbnailsEnabled:Z

    sput-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->draftMessagesEnabled:Z

    sget-object v1, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->Companion:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing$Companion;->defaultStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v1

    sput-object v1, Lio/getstream/chat/android/ui/ChatUI;->streamCdnImageResizing:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    sput-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->autoTranslationEnabled:Z

    sput-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->showOriginalTranslationEnabled:Z

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->Companion:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig$Companion;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;->access$getDefault$cp()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/ui/ChatUI;->pollsConfig:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic a()Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->dateFormatter_delegate$lambda$8()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/helper/DefaultDateFormatter;

    return-object v0
.end method

.method private static final attachmentFactoryManager_delegate$lambda$11()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-direct {v0, v1, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private static final attachmentPreviewFactoryManager_delegate$lambda$12()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;-><init>(Ljava/util/List;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method public static synthetic b(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/ChatUI;->messageTextTransformer_delegate$lambda$2$lambda$1(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Ll83/a0;

    return-void
.end method

.method public static synthetic c()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->channelNameFormatter_delegate$lambda$6()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v0

    return-object v0
.end method

.method private static final channelNameFormatter_delegate$lambda$6()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 6

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->Companion:Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/ChatUI;->getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;

    move-result-object v1

    const/4 v4, 0x6

    const/4 v5, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;->defaultFormatter$default(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter$Companion;Landroid/content/Context;IIILjava/lang/Object;)Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d()Lio/getstream/chat/android/ui/font/ChatFontsImpl;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->fonts_delegate$lambda$0()Lio/getstream/chat/android/ui/font/ChatFonts;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/font/ChatFontsImpl;

    return-object v0
.end method

.method private static final dateFormatter_delegate$lambda$8()Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/ChatUI;->getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-static {v0, v1, v2, v3, v2}, Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;->from$default(Lio/getstream/chat/android/ui/common/helper/DateFormatter$Companion;Landroid/content/Context;Ljava/util/Locale;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v0

    return-object v0
.end method

.method private static final decoratorProviderFactory_delegate$lambda$10()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;->defaultFactory$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;

    move-result-object v0

    return-object v0
.end method

.method private static final durationFormatter_delegate$lambda$9()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/DurationFormatter;->Companion:Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/DurationFormatter$Companion;->defaultFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic e()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->decoratorProviderFactory_delegate$lambda$10()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory$Companion$defaultFactory$2;

    return-object v0
.end method

.method public static synthetic f()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->attachmentPreviewFactoryManager_delegate$lambda$12()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    move-result-object v0

    return-object v0
.end method

.method private static final fonts_delegate$lambda$0()Lio/getstream/chat/android/ui/font/ChatFonts;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/font/ChatFontsImpl;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->style:Lio/getstream/chat/android/ui/font/ChatStyle;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/ChatUI;->getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lio/getstream/chat/android/ui/font/ChatFontsImpl;-><init>(Lio/getstream/chat/android/ui/font/ChatStyle;Landroid/content/Context;)V

    return-object v0
.end method

.method public static synthetic g()Lio/getstream/chat/android/ui/helper/SupportedReactions;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->supportedReactions_delegate$lambda$3()Lio/getstream/chat/android/ui/helper/SupportedReactions;

    move-result-object v0

    return-object v0
.end method

.method public static final getAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->attachmentFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    return-object v0
.end method

.method public static synthetic getAttachmentFactoryManager$annotations()V
    .locals 0

    return-void
.end method

.method public static final getAttachmentPreviewFactoryManager()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->attachmentPreviewFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;

    return-object v0
.end method

.method public static synthetic getAttachmentPreviewFactoryManager$annotations()V
    .locals 0

    return-void
.end method

.method public static final getAutoTranslationEnabled()Z
    .locals 1

    sget-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->autoTranslationEnabled:Z

    return v0
.end method

.method public static synthetic getAutoTranslationEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static final getChannelAvatarRenderer()Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->channelAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    return-object v0
.end method

.method public static synthetic getChannelAvatarRenderer$annotations()V
    .locals 0

    return-void
.end method

.method public static final getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->channelNameFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    return-object v0
.end method

.method public static synthetic getChannelNameFormatter$annotations()V
    .locals 0

    return-void
.end method

.method public static final getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->currentUserProvider:Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    return-object v0
.end method

.method public static synthetic getCurrentUserProvider$annotations()V
    .locals 0

    return-void
.end method

.method public static final getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->dateFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    return-object v0
.end method

.method public static synthetic getDateFormatter$annotations()V
    .locals 0

    return-void
.end method

.method public static final getDecoratorProviderFactory()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->decoratorProviderFactory$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;

    return-object v0
.end method

.method public static synthetic getDecoratorProviderFactory$annotations()V
    .locals 0

    return-void
.end method

.method public static final getDraftMessagesEnabled()Z
    .locals 1

    sget-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->draftMessagesEnabled:Z

    return v0
.end method

.method public static synthetic getDraftMessagesEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static final getDurationFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->durationFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/helper/DurationFormatter;

    return-object v0
.end method

.method public static synthetic getDurationFormatter$annotations()V
    .locals 0

    return-void
.end method

.method public static final getFonts()Lio/getstream/chat/android/ui/font/ChatFonts;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->fonts$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/font/ChatFonts;

    return-object v0
.end method

.method public static synthetic getFonts$annotations()V
    .locals 0

    return-void
.end method

.method public static final getMessagePreviewFormatter()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->messagePreviewFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;

    return-object v0
.end method

.method public static synthetic getMessagePreviewFormatter$annotations()V
    .locals 0

    return-void
.end method

.method public static final getMessageTextTransformer()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->messageTextTransformer$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    return-object v0
.end method

.method public static synthetic getMessageTextTransformer$annotations()V
    .locals 0

    return-void
.end method

.method public static final getMimeTypeIconProvider()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->mimeTypeIconProvider$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;

    return-object v0
.end method

.method public static synthetic getMimeTypeIconProvider$annotations()V
    .locals 0

    return-void
.end method

.method public static final getNavigator()Lio/getstream/chat/android/ui/navigation/ChatNavigator;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->navigator:Lio/getstream/chat/android/ui/navigation/ChatNavigator;

    return-object v0
.end method

.method public static synthetic getNavigator$annotations()V
    .locals 0

    return-void
.end method

.method public static final getPollsConfig()Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->pollsConfig:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-object v0
.end method

.method public static synthetic getPollsConfig$annotations()V
    .locals 0

    return-void
.end method

.method public static final getQuotedAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->quotedAttachmentFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    return-object v0
.end method

.method public static synthetic getQuotedAttachmentFactoryManager$annotations()V
    .locals 0

    return-void
.end method

.method public static final getReactionPushEmojiFactory()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->reactionPushEmojiFactory$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;

    return-object v0
.end method

.method public static synthetic getReactionPushEmojiFactory$annotations()V
    .locals 0

    return-void
.end method

.method public static final getShowOriginalTranslationEnabled()Z
    .locals 1

    sget-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->showOriginalTranslationEnabled:Z

    return v0
.end method

.method public static synthetic getShowOriginalTranslationEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static final getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->streamCdnImageResizing:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    return-object v0
.end method

.method public static synthetic getStreamCdnImageResizing$annotations()V
    .locals 0

    return-void
.end method

.method public static final getStyle()Lio/getstream/chat/android/ui/font/ChatStyle;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->style:Lio/getstream/chat/android/ui/font/ChatStyle;

    return-object v0
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0

    return-void
.end method

.method public static final getSupportedReactions()Lio/getstream/chat/android/ui/helper/SupportedReactions;
    .locals 4

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->supportedReactions$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2}, Lf93/c;->getValue(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/SupportedReactions;

    return-object v0
.end method

.method public static synthetic getSupportedReactions$annotations()V
    .locals 0

    return-void
.end method

.method public static final getUserAvatarRenderer()Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->userAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;

    return-object v0
.end method

.method public static synthetic getUserAvatarRenderer$annotations()V
    .locals 0

    return-void
.end method

.method public static final getVideoThumbnailsEnabled()Z
    .locals 1

    sget-boolean v0, Lio/getstream/chat/android/ui/ChatUI;->videoThumbnailsEnabled:Z

    return v0
.end method

.method public static synthetic getVideoThumbnailsEnabled$annotations()V
    .locals 0

    return-void
.end method

.method public static synthetic h()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->attachmentFactoryManager_delegate$lambda$11()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->messagePreviewFormatter_delegate$lambda$7()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic j()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->quotedAttachmentFactoryManager_delegate$lambda$13()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k()Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;
    .locals 1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->messageTextTransformer_delegate$lambda$2()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;

    return-object v0
.end method

.method private static final messagePreviewFormatter_delegate$lambda$7()Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;
    .locals 2

    sget-object v0, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;->Companion:Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/ChatUI;->getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v0, v1}, Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter$Companion;->defaultFormatter(Landroid/content/Context;)Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;

    move-result-object v0

    return-object v0
.end method

.method private static final messageTextTransformer_delegate$lambda$2()Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;
    .locals 3

    new-instance v0, Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;

    new-instance v1, Lio/getstream/chat/android/client/api2/d;

    const/16 v2, 0x12

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/helper/transformer/AutoLinkableTextTransformer;-><init>(Lc93/m;)V

    return-object v0
.end method

.method private static final messageTextTransformer_delegate$lambda$2$lambda$1(Landroid/widget/TextView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;)Ll83/a0;
    .locals 3

    const-string v0, "textView"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageItem"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/MessageListItem$MessageItem;->getShowOriginalText()Z

    move-result p1

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getToggleableTranslatedText$default(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/helper/CurrentUserProvider;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final mimeTypeIconProvider_delegate$lambda$5()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;

    invoke-direct {v0}, Lio/getstream/chat/android/ui/helper/MimeTypeIconProviderImpl;-><init>()V

    return-object v0
.end method

.method private static final quotedAttachmentFactoryManager_delegate$lambda$13()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/DefaultQuotedAttachmentMessageFactory;

    invoke-direct {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/DefaultQuotedAttachmentMessageFactory;-><init>()V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method private static final reactionPushEmojiFactory_delegate$lambda$4()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;->Companion:Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory$Companion;->defaultFactory()Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;

    move-result-object v0

    return-object v0
.end method

.method public static final setAttachmentFactoryManager(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/AttachmentFactoryManager;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->attachmentFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xa

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setAttachmentPreviewFactoryManager(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewFactoryManager;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->attachmentPreviewFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xb

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setAutoTranslationEnabled(Z)V
    .locals 0

    sput-boolean p0, Lio/getstream/chat/android/ui/ChatUI;->autoTranslationEnabled:Z

    return-void
.end method

.method public static final setChannelAvatarRenderer(Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;)V
    .locals 0

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->channelAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/ChannelAvatarRenderer;

    return-void
.end method

.method public static final setChannelNameFormatter(Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->channelNameFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x5

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setCurrentUserProvider(Lio/getstream/chat/android/ui/helper/CurrentUserProvider;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->currentUserProvider:Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    return-void
.end method

.method public static final setDateFormatter(Lio/getstream/chat/android/ui/common/helper/DateFormatter;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->dateFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x7

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setDecoratorProviderFactory(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/decorator/DecoratorProviderFactory;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->decoratorProviderFactory$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0x9

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setDraftMessagesEnabled(Z)V
    .locals 0

    sput-boolean p0, Lio/getstream/chat/android/ui/ChatUI;->draftMessagesEnabled:Z

    return-void
.end method

.method public static final setDurationFormatter(Lio/getstream/chat/android/ui/common/helper/DurationFormatter;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->durationFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0x8

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setFonts(Lio/getstream/chat/android/ui/font/ChatFonts;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->fonts$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setMessagePreviewFormatter(Lio/getstream/chat/android/ui/helper/MessagePreviewFormatter;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->messagePreviewFormatter$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x6

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setMessageTextTransformer(Lio/getstream/chat/android/ui/helper/transformer/ChatMessageTextTransformer;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->messageTextTransformer$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x1

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setMimeTypeIconProvider(Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->mimeTypeIconProvider$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x4

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setNavigator(Lio/getstream/chat/android/ui/navigation/ChatNavigator;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->navigator:Lio/getstream/chat/android/ui/navigation/ChatNavigator;

    return-void
.end method

.method public static final setPollsConfig(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->pollsConfig:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/poll/PollsConfig;

    return-void
.end method

.method public static final setQuotedAttachmentFactoryManager(Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->quotedAttachmentFactoryManager$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/16 v3, 0xc

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setReactionPushEmojiFactory(Lio/getstream/chat/android/ui/common/helper/ReactionPushEmojiFactory;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->reactionPushEmojiFactory$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x3

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setShowOriginalTranslationEnabled(Z)V
    .locals 0

    sput-boolean p0, Lio/getstream/chat/android/ui/ChatUI;->showOriginalTranslationEnabled:Z

    return-void
.end method

.method public static final setStreamCdnImageResizing(Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->streamCdnImageResizing:Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    return-void
.end method

.method public static final setStyle(Lio/getstream/chat/android/ui/font/ChatStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->style:Lio/getstream/chat/android/ui/font/ChatStyle;

    return-void
.end method

.method public static final setSupportedReactions(Lio/getstream/chat/android/ui/helper/SupportedReactions;)V
    .locals 4

    const-string v0, "<set-?>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->supportedReactions$delegate:Lf93/d;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    sget-object v2, Lio/getstream/chat/android/ui/ChatUI;->$$delegatedProperties:[Lj93/z;

    const/4 v3, 0x2

    aget-object v2, v2, v3

    invoke-interface {v0, v1, v2, p0}, Lf93/d;->setValue(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static final setUserAvatarRenderer(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;)V
    .locals 0

    sput-object p0, Lio/getstream/chat/android/ui/ChatUI;->userAvatarRenderer:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarRenderer;

    return-void
.end method

.method public static final setVideoThumbnailsEnabled(Z)V
    .locals 0

    sput-boolean p0, Lio/getstream/chat/android/ui/ChatUI;->videoThumbnailsEnabled:Z

    return-void
.end method

.method private static final supportedReactions_delegate$lambda$3()Lio/getstream/chat/android/ui/helper/SupportedReactions;
    .locals 4

    new-instance v0, Lio/getstream/chat/android/ui/helper/SupportedReactions;

    sget-object v1, Lio/getstream/chat/android/ui/ChatUI;->INSTANCE:Lio/getstream/chat/android/ui/ChatUI;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/ChatUI;->getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;

    move-result-object v1

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lio/getstream/chat/android/ui/helper/SupportedReactions;-><init>(Landroid/content/Context;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final getAppContext$stream_chat_android_ui_components_release()Landroid/content/Context;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/ChatUI;->appContext:Landroid/content/Context;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "appContext"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setAppContext$stream_chat_android_ui_components_release(Landroid/content/Context;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object p1, Lio/getstream/chat/android/ui/ChatUI;->appContext:Landroid/content/Context;

    return-void
.end method
