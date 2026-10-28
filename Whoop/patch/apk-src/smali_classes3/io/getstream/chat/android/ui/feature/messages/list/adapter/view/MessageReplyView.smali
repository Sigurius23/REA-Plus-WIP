.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u0000 12\u00020\u0001:\u00011B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ!\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u0008J\u001f\u0010\u0012\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J)\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0017\u0010!\u001a\u00020\u00102\u0006\u0010\u001d\u001a\u00020\u0017H\u0003\u00a2\u0006\u0004\u0008!\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\"\u0010#J\u0017\u0010$\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008$\u0010#J)\u0010%\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008%\u0010\u001cJ!\u0010&\u001a\u00020\u000c2\u0006\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010*\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\'\u0010,\u001a\u00020\u000c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00102\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008,\u0010\u001cR\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0016\u0010*\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u00100\u00a8\u00062"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;",
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
        "Lio/getstream/chat/android/models/User;",
        "user",
        "",
        "isVisible",
        "setUserAvatar",
        "(Lio/getstream/chat/android/models/User;Z)V",
        "isMine",
        "setAvatarPosition",
        "(Z)V",
        "Lio/getstream/chat/android/models/Message;",
        "quotedMessage",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;",
        "style",
        "setReplyBackground",
        "(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V",
        "message",
        "isLink",
        "(Lio/getstream/chat/android/models/Message;)Z",
        "hasEnrichedLink",
        "hasLinkInText",
        "setAttachmentImage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "setAdditionalInfo",
        "setReplyText",
        "configureLinkTextStyle",
        "(ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V",
        "",
        "text",
        "ellipsize",
        "(Ljava/lang/String;)Ljava/lang/String;",
        "setMessage",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;",
        "Z",
        "Companion",
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
.field private static final CONTENT_MARGIN:I

.field private static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView$Companion;

.field private static final DEFAULT_STROKE_WIDTH:F

.field private static final MAX_ELLIPSIZE_CHAR_COUNT:I = 0xaa

.field private static final REPLY_CORNER_RADIUS:F


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

.field private ellipsize:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView$Companion;

    const/4 v0, 0x1

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->DEFAULT_STROKE_WIDTH:F

    const/16 v0, 0xc

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->REPLY_CORNER_RADIUS:F

    const/4 v0, 0x4

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->CONTENT_MARGIN:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 2
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, p0, v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    .line 6
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 8
    invoke-direct {p0, v0, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 9
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p3

    const/4 v0, 0x1

    invoke-static {p3, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    move-result-object p3

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    .line 10
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->init(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public static synthetic a(Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;Landroidx/constraintlayout/widget/p;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setAvatarPosition$lambda$4$lambda$1(Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;Landroidx/constraintlayout/widget/p;)Ll83/a0;

    return-void
.end method

.method private final configureLinkTextStyle(ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V
    .locals 1

    const-string v0, "replyText"

    if-eqz p1, :cond_0

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getLinkStyleMine()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyText:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle;->apply(Landroid/widget/TextView;)V

    return-void

    :cond_0
    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getLinkStyleTheirs()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p1

    if-eqz p1, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p2, p2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyText:Landroid/widget/TextView;

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyle;->apply(Landroid/widget/TextView;)V

    :cond_1
    return-void
.end method

.method private final ellipsize(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x0

    const/16 v2, 0xaa

    const/4 v3, 0x0

    invoke-static {p1, v2, v3, v0, v1}, Lio/getstream/chat/android/ui/utils/MessageEllipsizeKt;->ellipsizeText$default(Ljava/lang/String;IIILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method private final hasEnrichedLink(Lio/getstream/chat/android/models/Message;)Z
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    invoke-static {p1}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    :cond_0
    return v2

    :cond_1
    return v1
.end method

.method private final hasLinkInText(Lio/getstream/chat/android/models/Message;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "RestrictedApi"
        }
    .end annotation

    sget-object v0, Lg5/c;->a:Ljava/util/regex/Pattern;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/regex/Matcher;->matches()Z

    move-result p1

    return p1
.end method

.method private final init(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/R$styleable;->MessageReplyView:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    const-string p2, "obtainStyledAttributes(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$styleable;->MessageReplyView_streamUiEllipsize:I

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result p2

    iput-boolean p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->ellipsize:Z

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private final isLink(Lio/getstream/chat/android/models/Message;)Z
    .locals 1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->hasEnrichedLink(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->hasLinkInText(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    return p1
.end method

.method private final setAdditionalInfo(Lio/getstream/chat/android/models/Message;)V
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    const-string v2, "additionalInfo"

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_1

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->additionalInfo:Landroid/widget/TextView;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->additionalInfo:Landroid/widget/TextView;

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getDurationFormatter()Lio/getstream/chat/android/ui/common/helper/DurationFormatter;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Attachment;

    invoke-static {v4}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_0

    :cond_3
    const/4 v3, 0x0

    :goto_0
    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    if-eqz v3, :cond_4

    invoke-static {v3}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getDurationInMs(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Integer;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    :cond_4
    invoke-interface {v2, v1}, Lio/getstream/chat/android/ui/common/helper/DurationFormatter;->format(I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->additionalInfo:Landroid/widget/TextView;

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setAttachmentImage(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getQuotedAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    move-result-object v0

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;->canHandle(Lio/getstream/chat/android/models/Message;)Z

    move-result v0

    const-string v1, "attachmentContainer"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->attachmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getQuotedAttachmentFactoryManager()Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->attachmentContainer:Landroid/widget/FrameLayout;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/viewholder/attachment/QuotedAttachmentFactoryManager;->createAndAddQuotedView(Lio/getstream/chat/android/models/Message;Landroid/view/ViewGroup;)V

    return-void

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->attachmentContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final setAvatarPosition(Z)V
    .locals 6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lhb2/c;

    const/16 v3, 0x19

    invoke-direct {v2, v0, v3}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v2, "replyAvatarView"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams"

    if-eqz v2, :cond_3

    check-cast v2, Landroidx/constraintlayout/widget/d;

    const/4 v4, 0x0

    if-eqz p1, :cond_0

    iput v4, v2, Landroidx/constraintlayout/widget/d;->v:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    iput v5, v2, Landroidx/constraintlayout/widget/d;->s:I

    goto :goto_0

    :cond_0
    iput v4, v2, Landroidx/constraintlayout/widget/d;->t:I

    iget-object v5, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v5}, Landroid/view/View;->getId()I

    move-result v5

    iput v5, v2, Landroidx/constraintlayout/widget/d;->u:I

    :goto_0
    sget v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->CONTENT_MARGIN:I

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "replyContainer"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    if-eqz v2, :cond_2

    check-cast v2, Landroidx/constraintlayout/widget/d;

    if-eqz p1, :cond_1

    iput v4, v2, Landroidx/constraintlayout/widget/d;->t:I

    iget-object p1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v2, Landroidx/constraintlayout/widget/d;->u:I

    goto :goto_1

    :cond_1
    iget-object p1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    iput p1, v2, Landroidx/constraintlayout/widget/d;->s:I

    iput v4, v2, Landroidx/constraintlayout/widget/d;->v:I

    :goto_1
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    invoke-virtual {v2, v5}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_2
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    new-instance p1, Ljava/lang/NullPointerException;

    invoke-direct {p1, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static final setAvatarPosition$lambda$4$lambda$1(Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;Landroidx/constraintlayout/widget/p;)Ll83/a0;
    .locals 3

    const-string v0, "$this$updateConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v1, 0x6

    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    const/4 v2, 0x7

    invoke-virtual {p1, v0, v2}, Landroidx/constraintlayout/widget/p;->c(II)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {v0}, Landroid/view/View;->getId()I

    move-result v0

    invoke-virtual {p1, v0, v1}, Landroidx/constraintlayout/widget/p;->c(II)V

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-virtual {p0}, Landroid/view/View;->getId()I

    move-result p0

    invoke-virtual {p1, p0, v2}, Landroidx/constraintlayout/widget/p;->c(II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final setReplyBackground(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V
    .locals 7

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v6, "getContext(...)"

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->REPLY_CORNER_RADIUS:F

    sget-object v3, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-static {p1, v3}, Lio/getstream/chat/android/ui/common/utils/extensions/MessageKt;->isMine(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result v4

    const/4 v5, 0x1

    const/4 v3, 0x0

    invoke-virtual/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->create(Landroid/content/Context;FFZZ)Lkr/k;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyContainer:Landroidx/constraintlayout/widget/ConstraintLayout;

    new-instance v2, Lkr/g;

    invoke-direct {v2, v0}, Lkr/g;-><init>(Lkr/k;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->isLink(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_3

    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Lkr/g;->o(Landroid/graphics/Paint$Style;)V

    if-eqz p2, :cond_1

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getLinkBackgroundColorMine()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_blue_alice:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    goto :goto_0

    :cond_1
    if-eqz p3, :cond_2

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getLinkBackgroundColorTheirs()I

    move-result p1

    goto :goto_0

    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_blue_alice:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_0
    invoke-virtual {v2, p1}, Lkr/g;->setTint(I)V

    goto/16 :goto_7

    :cond_3
    if-eqz p2, :cond_7

    sget-object p1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Lkr/g;->o(Landroid/graphics/Paint$Style;)V

    if-eqz p3, :cond_4

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageStrokeColorMine()I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_literal_transparent:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_1
    invoke-virtual {v2, p1}, Lkr/g;->r(I)V

    if-eqz p3, :cond_5

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageStrokeWidthMine()F

    move-result p1

    goto :goto_2

    :cond_5
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->DEFAULT_STROKE_WIDTH:F

    :goto_2
    invoke-virtual {v2, p1}, Lkr/g;->s(F)V

    if-eqz p3, :cond_6

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageBackgroundColorMine()I

    move-result p1

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_white:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_3
    invoke-virtual {v2, p1}, Lkr/g;->setTint(I)V

    goto :goto_7

    :cond_7
    sget-object p1, Landroid/graphics/Paint$Style;->FILL_AND_STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v2, p1}, Lkr/g;->o(Landroid/graphics/Paint$Style;)V

    if-eqz p3, :cond_8

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageStrokeColorTheirs()I

    move-result p1

    goto :goto_4

    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_gainsboro:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_4
    invoke-virtual {v2, p1}, Lkr/g;->r(I)V

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageStrokeWidthTheirs()F

    move-result p1

    goto :goto_5

    :cond_9
    sget p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->DEFAULT_STROKE_WIDTH:F

    :goto_5
    invoke-virtual {v2, p1}, Lkr/g;->s(F)V

    if-eqz p3, :cond_a

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getMessageBackgroundColorTheirs()I

    move-result p1

    goto :goto_6

    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    invoke-static {p1, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Lio/getstream/chat/android/ui/R$color;->stream_ui_grey_whisper:I

    invoke-static {p1, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    :goto_6
    invoke-virtual {v2, p1}, Lkr/g;->setTint(I)V

    :goto_7
    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final setReplyText(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/models/Attachment;

    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {p1, v2, v3, v2}, Lio/getstream/chat/android/ui/utils/extensions/MessageKt;->getTranslatedText$default(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/ui/helper/CurrentUserProvider;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyText:Landroid/widget/TextView;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/common/R$string;->stream_ui_message_list_message_deleted:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    if-eqz v0, :cond_1

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_quoted_message_poll:I

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getName()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {v1, v2, v0}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    if-eqz v1, :cond_4

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_audio_reply_info:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_4
    :goto_0
    iget-boolean v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->ellipsize:Z

    if-eqz v0, :cond_5

    invoke-direct {p0, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->ellipsize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    :cond_5
    move-object v0, v2

    :cond_6
    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->isLink(Lio/getstream/chat/android/models/Message;)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-direct {p0, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->configureLinkTextStyle(ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    return-void

    :cond_7
    const-string p1, "replyText"

    if-eqz p2, :cond_8

    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getTextStyleMine()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p3, p3, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyText:Landroid/widget/TextView;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/font/TextStyle;->apply(Landroid/widget/TextView;)V

    return-void

    :cond_8
    if-eqz p3, :cond_9

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getTextStyleTheirs()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    if-eqz p2, :cond_9

    iget-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p3, p3, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyText:Landroid/widget/TextView;

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/font/TextStyle;->apply(Landroid/widget/TextView;)V

    :cond_9
    return-void
.end method

.method private final setUserAvatar(Lio/getstream/chat/android/models/User;Z)V
    .locals 4

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {v0, p1, v3, v1, v2}, Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;->setUser$default(Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;Lio/getstream/chat/android/models/User;ZILjava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageReplyViewBinding;->replyAvatarView:Lio/getstream/chat/android/ui/widgets/avatar/UserAvatarView;

    const-string v0, "replyAvatarView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p2, :cond_0

    goto :goto_0

    :cond_0
    const/16 v3, 0x8

    :goto_0
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final setMessage(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    if-eqz p3, :cond_0

    invoke-virtual {p3}, Lio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;->getShowUserAvatar()Z

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x1

    :goto_0
    invoke-direct {p0, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setUserAvatar(Lio/getstream/chat/android/models/User;Z)V

    sget-object v0, Lio/getstream/chat/android/client/ChatClient;->Companion:Lio/getstream/chat/android/client/ChatClient$Companion;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient$Companion;->instance()Lio/getstream/chat/android/client/ChatClient;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/ChatClient;->getCurrentUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/utils/extensions/MessageKt;->isMine(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/User;)Z

    move-result v0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setAvatarPosition(Z)V

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setReplyBackground(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setAttachmentImage(Lio/getstream/chat/android/models/Message;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setAdditionalInfo(Lio/getstream/chat/android/models/Message;)V

    invoke-direct {p0, p1, p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MessageReplyView;->setReplyText(Lio/getstream/chat/android/models/Message;ZLio/getstream/chat/android/ui/feature/messages/list/MessageReplyStyle;)V

    return-void
.end method
