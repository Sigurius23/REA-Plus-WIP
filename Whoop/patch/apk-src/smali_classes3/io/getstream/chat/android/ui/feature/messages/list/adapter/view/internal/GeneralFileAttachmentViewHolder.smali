.class final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0002\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\'\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0010J\u000f\u0010\u001d\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u0010J\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001e\u001a\u00020\u0011H\u0016\u00a2\u0006\u0004\u0008\u001f\u0010\u0014J\u000f\u0010 \u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008 \u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\"R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/FileAttachmentViewHolder;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "attachmentLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;",
        "attachmentDownloadClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V",
        "Ll83/a0;",
        "setupBackground",
        "()V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "subscribeForProgressIfNeeded",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "Landroid/widget/TextView;",
        "fileSizeView",
        "",
        "bytesRead",
        "totalBytes",
        "handleInProgressAttachment",
        "(Landroid/widget/TextView;JJ)V",
        "clearScope",
        "restartJob",
        "item",
        "bind",
        "unbind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lbc3/c0;",
        "scope",
        "Lbc3/c0;",
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
.field public static final synthetic a:I


# instance fields
.field private attachment:Lio/getstream/chat/android/models/Attachment;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

.field private final logger$delegate:Ll83/h;

.field private scope:Lbc3/c0;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;)V
    .locals 2

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    const-string p5, "FileAttachmentVH"

    invoke-static {p0, p5}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p5

    iput-object p5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->logger$delegate:Ll83/h;

    if-eqz p2, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p5

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p5, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p2

    new-instance p5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;

    const/4 v0, 0x0

    invoke-direct {p5, p3, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/k;-><init>(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;I)V

    invoke-virtual {p2, p5}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    :cond_1
    if-eqz p4, :cond_2

    iget-object p2, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/4 p5, 0x2

    invoke-direct {p3, p5, p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p2, p3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    :cond_2
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    sget-object p2, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->INSTANCE:Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;->getContext()Landroid/content/Context;

    move-result-object p3

    invoke-virtual {p2, p3}, Lio/getstream/chat/android/ui/feature/messages/list/background/ShapeAppearanceModelFactory;->fileBackground(Landroid/content/Context;)Lkr/g;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V

    :cond_0
    return-void
.end method

.method public static synthetic b(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Landroid/view/View;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final handleInProgressAttachment(Landroid/widget/TextView;JJ)V
    .locals 1

    invoke-static {p4, p5}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/widgets/internal/SimpleListAdapter$ViewHolder;->getContext()Landroid/content/Context;

    move-result-object p5

    sget v0, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_attachment_upload_progress:I

    invoke-static {p2, p3}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p2, p4}, [Ljava/lang/Object;

    move-result-object p2

    invoke-virtual {p5, v0, p2}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private static final lambda$1$lambda$0(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V

    :cond_0
    return-void
.end method

.method private static final lambda$3$lambda$2(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;Landroid/view/View;)Z
    .locals 0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;->onAttachmentLongClick()V

    const/4 p0, 0x1

    return p0
.end method

.method private static final lambda$6$lambda$5(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;Landroid/view/View;)V
    .locals 1

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p2, :cond_0

    invoke-static {p2}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->isFailed(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p2

    const/4 v0, 0x1

    if-ne p2, v0, :cond_0

    return-void

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentDownloadClickListener;->onAttachmentDownloadClick(Lio/getstream/chat/android/models/Attachment;)V

    :cond_1
    return-void
.end method

.method private final setupBackground()V
    .locals 10

    new-instance v0, Lkr/e;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lkr/e;-><init>(I)V

    new-instance v1, Lkr/e;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lkr/e;-><init>(I)V

    new-instance v2, Lkr/e;

    const/4 v3, 0x0

    invoke-direct {v2, v3}, Lkr/e;-><init>(I)V

    new-instance v3, Lkr/e;

    const/4 v4, 0x0

    invoke-direct {v3, v4}, Lkr/e;-><init>(I)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getCornerRadius()I

    move-result v4

    int-to-float v4, v4

    const/4 v5, 0x0

    invoke-static {v5}, Lse/b;->z(I)Lse/a;

    move-result-object v5

    new-instance v6, Lkr/a;

    invoke-direct {v6, v4}, Lkr/a;-><init>(F)V

    new-instance v7, Lkr/a;

    invoke-direct {v7, v4}, Lkr/a;-><init>(F)V

    new-instance v8, Lkr/a;

    invoke-direct {v8, v4}, Lkr/a;-><init>(F)V

    new-instance v9, Lkr/a;

    invoke-direct {v9, v4}, Lkr/a;-><init>(F)V

    new-instance v4, Lkr/k;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    iput-object v5, v4, Lkr/k;->a:Lse/a;

    iput-object v5, v4, Lkr/k;->b:Lse/a;

    iput-object v5, v4, Lkr/k;->c:Lse/a;

    iput-object v5, v4, Lkr/k;->d:Lse/a;

    iput-object v6, v4, Lkr/k;->e:Lkr/c;

    iput-object v7, v4, Lkr/k;->f:Lkr/c;

    iput-object v8, v4, Lkr/k;->g:Lkr/c;

    iput-object v9, v4, Lkr/k;->h:Lkr/c;

    iput-object v0, v4, Lkr/k;->i:Lkr/e;

    iput-object v1, v4, Lkr/k;->j:Lkr/e;

    iput-object v2, v4, Lkr/k;->k:Lkr/e;

    iput-object v3, v4, Lkr/k;->l:Lkr/e;

    new-instance v0, Lkr/g;

    invoke-direct {v0, v4}, Lkr/g;-><init>(Lkr/k;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getBackgroundColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->m(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getStrokeColor()I

    move-result v1

    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkr/g;->q(Landroid/content/res/ColorStateList;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getStrokeWidth()I

    move-result v1

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lkr/g;->s(F)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method private final subscribeForProgressIfNeeded(Lio/getstream/chat/android/models/Attachment;)V
    .locals 6

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v2, v1, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    const-string v3, "fileSize"

    if-eqz v2, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/io/File;->length()J

    move-result-wide v2

    :goto_0
    move-wide v4, v2

    goto :goto_1

    :cond_0
    const-wide/16 v2, 0x0

    goto :goto_0

    :goto_1
    const-wide/16 v2, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->handleInProgressAttachment(Landroid/widget/TextView;JJ)V

    return-void

    :cond_1
    instance-of v2, v1, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-eqz v2, :cond_2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    iget-object v2, v2, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    move-object v4, v1

    move-object v1, v2

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;->getBytesUploaded()J

    move-result-wide v2

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;->getTotalBytes()J

    move-result-wide v4

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->handleInProgressAttachment(Landroid/widget/TextView;JJ)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Attachment;)V
    .locals 7

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->getLogger()Lb23/k;

    move-result-object v0

    .line 3
    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    .line 4
    sget-object v2, Lb23/g;->y:Lb23/g;

    .line 5
    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    .line 6
    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 7
    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    .line 8
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v4, "[bind] item: "

    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    .line 9
    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    .line 11
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    .line 12
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileTitle:Landroid/widget/TextView;

    const-string v2, "fileTitle"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getTitleTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 13
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    const-string v2, "fileSize"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getFileSizeTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v2

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    .line 14
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileTypeIcon:Landroid/widget/ImageView;

    const-string v2, "fileTypeIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    .line 15
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileTitle:Landroid/widget/TextView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->getDisplayableName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    const/16 v2, 0x8

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    if-nez v1, :cond_5

    .line 17
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-nez v1, :cond_5

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/models/Attachment$UploadState$Success;

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-nez v1, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    .line 20
    :cond_2
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 21
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getActionButtonIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 22
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v1

    int-to-long v3, v1

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 23
    :cond_3
    :goto_0
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v5}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 24
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getFailedAttachmentIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v6

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 25
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v3

    :cond_4
    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_2

    .line 26
    :cond_5
    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->actionButton:Landroid/widget/ImageView;

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 27
    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->fileSize:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/io/File;->length()J

    move-result-wide v3

    :cond_6
    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 28
    :goto_2
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/FileAttachmentViewStyle;->getProgressBarDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 29
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemFileAttachmentBinding;->progressBar:Landroid/widget/ProgressBar;

    const-string v1, "progressBar"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v1

    instance-of v1, v1, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-eqz v1, :cond_7

    move v2, v5

    .line 30
    :cond_7
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 31
    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->subscribeForProgressIfNeeded(Lio/getstream/chat/android/models/Attachment;)V

    .line 32
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->setupBackground()V

    return-void
.end method

.method public final bridge synthetic bind(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->bind(Lio/getstream/chat/android/models/Attachment;)V

    return-void
.end method

.method public final clearScope()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->scope:Lbc3/c0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-static {v0, v1}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->scope:Lbc3/c0;

    return-void
.end method

.method public final restartJob()V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz v0, :cond_0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->subscribeForProgressIfNeeded(Lio/getstream/chat/android/models/Attachment;)V

    :cond_0
    return-void
.end method

.method public final unbind()V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/GeneralFileAttachmentViewHolder;->clearScope()V

    return-void
.end method
