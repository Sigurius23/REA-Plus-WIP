.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;
.super Landroidx/appcompat/widget/AppCompatImageView;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u000eH\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;",
        "Landroidx/appcompat/widget/AppCompatImageView;",
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
        "",
        "url",
        "Ll83/a0;",
        "showAttachmentThumb",
        "(Ljava/lang/String;)V",
        "init",
        "onAttachedToWindow",
        "()V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "showAttachment",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;",
        "Lio/getstream/chat/android/models/Attachment;",
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
.field private attachment:Lio/getstream/chat/android/models/Attachment;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    .line 2
    invoke-direct {p0, v0, v1}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 3
    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 5
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    .line 7
    invoke-direct {p0, v0, p2, p3}, Landroidx/appcompat/widget/AppCompatImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 8
    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    invoke-virtual {p2, p1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    return-void
.end method

.method private final init(Landroid/content/Context;)V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;)Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    return-void
.end method

.method private final showAttachmentThumb(Ljava/lang/String;)V
    .locals 8

    new-instance v3, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->getQuotedImageRadius()I

    move-result v0

    int-to-float v0, v0

    invoke-direct {v3, v0}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;-><init>(F)V

    const/16 v6, 0x1a

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method


# virtual methods
.method public final onAttachedToWindow()V
    .locals 5

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->attachment:Lio/getstream/chat/android/models/Attachment;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v2

    :goto_0
    const-string v3, "file"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const-string v4, "style"

    if-nez v3, :cond_4

    const-string v3, "video"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_1

    :cond_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->getImageAttachmentWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->getImageAttachmentHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    goto :goto_2

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    :goto_1
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->getFileAttachmentWidth()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/DefaultQuotedAttachmentViewStyle;->getFileAttachmentHeight()I

    move-result v1

    iput v1, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    :goto_2
    invoke-virtual {p0, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-void

    :cond_5
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final showAttachment(Lio/getstream/chat/android/models/Attachment;)V
    .locals 2

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    goto :goto_2

    :sswitch_0
    const-string v1, "voiceRecording"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :sswitch_1
    const-string v1, "video"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :sswitch_2
    const-string v1, "image"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_2

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    :goto_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->showAttachmentThumb(Ljava/lang/String;)V

    return-void

    :sswitch_3
    const-string v1, "giphy"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->showAttachmentThumb(Ljava/lang/String;)V

    return-void

    :sswitch_4
    const-string v1, "file"

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void

    :cond_4
    :goto_2
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/DefaultQuotedAttachmentView;->showAttachmentThumb(Ljava/lang/String;)V

    return-void

    :sswitch_data_0
    .sparse-switch
        0x2ff57c -> :sswitch_4
        0x5dce15f -> :sswitch_3
        0x5faa95b -> :sswitch_2
        0x6b0147b -> :sswitch_1
        0x56fcf4df -> :sswitch_0
    .end sparse-switch
.end method
