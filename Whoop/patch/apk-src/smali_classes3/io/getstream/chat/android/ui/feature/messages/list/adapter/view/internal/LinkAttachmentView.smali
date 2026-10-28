.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;,
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\u0008\u0000\u0018\u0000 32\u00020\u0001:\u000243B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u001f\u0010\u0014\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u0017\u0010\u0012J\u0017\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u0017\u0010 \u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008\u001f\u0010\u001bJ\u0017\u0010$\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\tH\u0000\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010\'\u001a\u00020\u00102\u0006\u0010&\u001a\u00020%\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008.\u0010/R\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u00102\u00a8\u00065"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;",
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
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;",
        "style",
        "Ll83/a0;",
        "showTitle",
        "(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V",
        "showDescription",
        "showLabel",
        "showAttachmentImage",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "showLinkAttachment",
        "Lio/getstream/chat/android/ui/font/TextStyle;",
        "textStyle",
        "setTitleTextStyle$stream_chat_android_ui_components_release",
        "(Lio/getstream/chat/android/ui/font/TextStyle;)V",
        "setTitleTextStyle",
        "setDescriptionTextStyle$stream_chat_android_ui_components_release",
        "setDescriptionTextStyle",
        "setLabelTextStyle$stream_chat_android_ui_components_release",
        "setLabelTextStyle",
        "maxLines",
        "setLinkDescriptionMaxLines$stream_chat_android_ui_components_release",
        "(I)V",
        "setLinkDescriptionMaxLines",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;",
        "linkPreviewClickListener",
        "setLinkPreviewClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;)V",
        "Landroid/view/View;",
        "longClickTarget",
        "setLongClickTarget",
        "(Landroid/view/View;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;",
        "",
        "previewUrl",
        "Ljava/lang/String;",
        "Companion",
        "LinkPreviewClickListener",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;

.field private static final LINK_PREVIEW_CORNER_RADIUS:F


# instance fields
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

.field private previewUrl:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$Companion;

    const/16 v0, 0x8

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v0

    sput v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->LINK_PREVIEW_CORNER_RADIUS:F

    return-void
.end method

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

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

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

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

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

    invoke-static {p1, p0, p2}, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->previewUrl:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;->onLinkPreviewClick(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showAttachmentImage$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)Ll83/a0;

    return-void
.end method

.method public static synthetic c(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)V
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showAttachmentImage$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)Ll83/a0;

    return-void
.end method

.method private static final setLinkPreviewClickListener$lambda$3(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->previewUrl:Ljava/lang/String;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;->onLinkPreviewClick(Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final setLongClickTarget$lambda$4(Landroid/view/View;Landroid/view/View;)Z
    .locals 0

    invoke-virtual {p0}, Landroid/view/View;->performLongClick()Z

    const/4 p0, 0x1

    return p0
.end method

.method private final showAttachmentImage(Lio/getstream/chat/android/models/Attachment;)V
    .locals 6

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->getLinkPreviewImageUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v1

    const-string p1, "linkPreviewContainer"

    if-eqz v1, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->linkPreviewContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->linkPreviewImageView:Landroid/widget/ImageView;

    const-string p1, "linkPreviewImageView"

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_picture_placeholder:I

    new-instance v3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    sget v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->LINK_PREVIEW_CORNER_RADIUS:F

    invoke-direct {v3, v2}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;-><init>(F)V

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    new-instance v4, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/n;

    const/4 p1, 0x0

    invoke-direct {v4, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/n;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;I)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/n;

    const/4 p1, 0x1

    invoke-direct {v5, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/n;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;I)V

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->linkPreviewContainer:Landroid/widget/FrameLayout;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p1, 0x8

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v1, "progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private static final showAttachmentImage$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v0, "progressBar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final showAttachmentImage$lambda$1(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;)Ll83/a0;
    .locals 1

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v0, "progressBar"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p0, v0}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final showDescription(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object p1

    const-string v0, "descriptionTextView"

    if-eqz p1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkDescription()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method private final showLabel(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 4

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object p1

    const-string v0, "labelContainer"

    if-eqz p1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->labelContainer:Landroid/widget/FrameLayout;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->labelTextView:Landroid/widget/TextView;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-lez v2, :cond_0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type java.lang.String"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "toUpperCase(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p1

    const-string v0, "substring(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->labelContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->labelTextView:Landroid/widget/TextView;

    const-string v0, "labelTextView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkLabel()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method private final showTitle(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object p1

    const-string v0, "titleTextView"

    if-eqz p1, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->titleTextView:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;->getTextStyleLinkTitle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object p2

    invoke-static {p1, p2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method


# virtual methods
.method public final setDescriptionTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 2

    const-string v0, "textStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    const-string v1, "descriptionTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public final setLabelTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 2

    const-string v0, "textStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->labelTextView:Landroid/widget/TextView;

    const-string v1, "labelTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public final setLinkDescriptionMaxLines$stream_chat_android_ui_components_release(I)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->descriptionTextView:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setMaxLines(I)V

    return-void
.end method

.method public final setLinkPreviewClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView$LinkPreviewClickListener;)V
    .locals 2

    const-string v0, "linkPreviewClickListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setLongClickTarget(Landroid/view/View;)V
    .locals 2

    const-string v0, "longClickTarget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;

    const/4 v1, 0x1

    invoke-direct {v0, p1, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, v0}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method

.method public final setTitleTextStyle$stream_chat_android_ui_components_release(Lio/getstream/chat/android/ui/font/TextStyle;)V
    .locals 2

    const-string v0, "textStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiLinkAttachmentsViewBinding;->titleTextView:Landroid/widget/TextView;

    const-string v1, "titleTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    return-void
.end method

.method public final showLinkAttachment(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->getLinkUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->previewUrl:Ljava/lang/String;

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showTitle(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showDescription(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showLabel(Lio/getstream/chat/android/models/Attachment;Lio/getstream/chat/android/ui/feature/messages/list/MessageListItemStyle;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/LinkAttachmentView;->showAttachmentImage(Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method
