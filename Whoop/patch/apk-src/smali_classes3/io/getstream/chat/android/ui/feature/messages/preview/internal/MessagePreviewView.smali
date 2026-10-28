.class public final Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u000c2\u0006\u0010\u001f\u001a\u00020\u001e\u00a2\u0006\u0004\u0008 \u0010!J\u0015\u0010\"\u001a\u00020\u000c2\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\"\u0010\u0018R\u001a\u0010$\u001a\u00020#8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'\u00a8\u0006("
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;",
        "Landroid/widget/FrameLayout;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/util/AttributeSet;",
        "attrs",
        "(Landroid/content/Context;Landroid/util/AttributeSet;)V",
        "",
        "defStyleAttr",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "Ll83/a0;",
        "init",
        "(Landroid/util/AttributeSet;)V",
        "parseAttrs",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "renderDate",
        "(Lio/getstream/chat/android/models/Message;)V",
        "renderMessage",
        "Lio/getstream/chat/android/ui/common/model/MessageResult;",
        "messageResult",
        "renderChannel",
        "(Lio/getstream/chat/android/ui/common/model/MessageResult;)V",
        "",
        "currentUserMention",
        "",
        "formatMessagePreview",
        "(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ljava/lang/CharSequence;",
        "Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;",
        "messagePreviewStyle",
        "styleView",
        "(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V",
        "renderMessageResult",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;",
        "getBinding$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;",
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


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 6
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 7
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    return-void
.end method

.method private final formatMessagePreview(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ljava/lang/CharSequence;
    .locals 7

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->hasAudioRecording(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget p2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_audio_reply_info:I

    invoke-virtual {p1, p2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    const-string p2, "getString(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p2, 0x3

    invoke-static {p1, v2, v1, p2, v2}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->italicize$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getAttachmentsText(Lio/getstream/chat/android/models/Message;)Landroid/text/SpannableString;

    move-result-object v0

    const/4 v3, 0x1

    invoke-static {p1, v2, v3, v2}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getTranslatedText$default(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/helper/CurrentUserProvider;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    if-eqz p2, :cond_1

    invoke-static {p2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-static {p1, p2, v3}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold(Ljava/lang/String;Ljava/util/List;Z)Landroid/text/SpannableString;

    move-result-object p1

    :cond_1
    const/4 p2, 0x2

    new-array p2, p2, [Ljava/lang/CharSequence;

    aput-object p1, p2, v1

    aput-object v0, p2, v3

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Ljava/lang/CharSequence;

    if-eqz v1, :cond_2

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    if-nez v1, :cond_3

    goto :goto_0

    :cond_3
    invoke-virtual {v0, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_4
    new-instance v1, Landroid/text/SpannableStringBuilder;

    invoke-direct {v1}, Landroid/text/SpannableStringBuilder;-><init>()V

    const/4 v5, 0x0

    const/16 v6, 0x7c

    const-string v2, " "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lm83/s;->M0(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)V

    return-object v1
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 0

    return-void
.end method

.method private final parseAttrs(Landroid/util/AttributeSet;)V
    .locals 0

    return-void
.end method

.method private final renderChannel(Lio/getstream/chat/android/ui/common/model/MessageResult;)V
    .locals 9

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0}, Lio/getstream/chat/android/ui/common/utils/extensions/ChannelKt;->isDirectMessaging(Lio/getstream/chat/android/models/Channel;)Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v0

    invoke-interface {v0}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->userAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_6

    if-eqz v2, :cond_1

    goto :goto_1

    :cond_1
    move-object v4, v5

    :goto_1
    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v7

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_3
    move-object v8, v5

    :goto_2
    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    goto :goto_3

    :cond_4
    move-object v6, v5

    :goto_3
    check-cast v6, Lio/getstream/chat/android/models/Member;

    if-eqz v6, :cond_5

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    goto :goto_4

    :cond_5
    move-object v4, v5

    :goto_4
    if-eqz v4, :cond_6

    goto :goto_5

    :cond_6
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    :goto_5
    const/4 v6, 0x2

    invoke-static {v3, v4, v1, v6, v5}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->senderNameLabel:Landroid/widget/TextView;

    const/4 v4, 0x3

    if-eqz v2, :cond_a

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_e

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_7
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v6

    if-eqz v0, :cond_8

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    goto :goto_6

    :cond_8
    move-object v7, v5

    :goto_6
    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_e

    invoke-static {p1, v5, v1, v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object v5

    goto :goto_8

    :cond_9
    new-instance p1, Ljava/util/NoSuchElementException;

    const-string v0, "Collection contains no element matching the predicate."

    invoke-direct {p1, v0}, Ljava/util/NoSuchElementException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_a
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getChannelNameFormatter()Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;

    move-result-object v6

    invoke-interface {v6, v2, v0}, Lio/getstream/chat/android/ui/common/utils/ChannelNameFormatter;->formatChannelName(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/User;)Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_b
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getChannelInfo()Lio/getstream/chat/android/models/ChannelInfo;

    move-result-object v0

    if-eqz v0, :cond_c

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelInfo;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_7

    :cond_c
    move-object v0, v5

    :goto_7
    if-eqz v0, :cond_d

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v6, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_preview_sender:I

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v7

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object v7

    filled-new-array {v7, v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v2, v6, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object v0

    if-eqz v0, :cond_d

    move-object v5, v0

    goto :goto_8

    :cond_d
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v5, v1, v4, v5}, Lio/getstream/chat/android/ui/utils/extensions/StringKt;->bold$default(Ljava/lang/String;Ljava/util/List;ZILjava/lang/Object;)Landroid/text/SpannableString;

    move-result-object p1

    move-object v5, p1

    :cond_e
    :goto_8
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final renderDate(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageTimeLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDateFormatter()Lio/getstream/chat/android/ui/common/helper/DateFormatter;

    move-result-object v1

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getCreatedAtOrNull(Lio/getstream/chat/android/models/Message;)Ljava/util/Date;

    move-result-object p1

    invoke-interface {v1, p1}, Lio/getstream/chat/android/ui/common/helper/DateFormatter;->formatDate(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final renderMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 4

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderDate(Lio/getstream/chat/android/models/Message;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageLabel:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getCurrentUserProvider()Lio/getstream/chat/android/ui/helper/CurrentUserProvider;

    move-result-object v1

    invoke-interface {v1}, Lio/getstream/chat/android/ui/helper/CurrentUserProvider;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    const-string v3, "getContext(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/UserKt;->asMention(Lio/getstream/chat/android/models/User;Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-direct {p0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->formatMessagePreview(Lio/getstream/chat/android/models/Message;Ljava/lang/String;)Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    return-object v0
.end method

.method public final renderMessageResult(Lio/getstream/chat/android/ui/common/model/MessageResult;)V
    .locals 1

    const-string v0, "messageResult"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/model/MessageResult;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderMessage(Lio/getstream/chat/android/models/Message;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->renderChannel(Lio/getstream/chat/android/ui/common/model/MessageResult;)V

    return-void
.end method

.method public final styleView(Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;)V
    .locals 2

    const-string v0, "messagePreviewStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->senderNameLabel:Landroid/widget/TextView;

    const-string v1, "senderNameLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->getMessageSenderTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageLabel:Landroid/widget/TextView;

    const-string v1, "messageLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->getMessageTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/preview/internal/MessagePreviewView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessagePreviewItemBinding;->messageTimeLabel:Landroid/widget/TextView;

    const-string v1, "messageTimeLabel"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/preview/MessagePreviewStyle;->getMessageTimeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method
