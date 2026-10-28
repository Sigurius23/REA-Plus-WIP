.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;
.super Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FileAttachmentPreviewHandler"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR\u001b\u0010\u0013\u001a\u00020\u000e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00058\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Ll83/a0;",
        "attachmentRemovalListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;)V",
        "attachment",
        "bind",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;

.field private final logger$delegate:Ll83/h;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentRemovalListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;

    const-string v0, "AttachFilePreviewHolder"

    invoke-static {p0, v0}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->logger$delegate:Ll83/h;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;->removeButton:Landroid/widget/ImageButton;

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;

    const/4 v1, 0x2

    invoke-direct {v0, p2, p0, v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;Landroid/view/View;)V
    .locals 0

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p0, "attachment"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;Landroid/view/View;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Attachment;)V
    .locals 6

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->isAnyFileType(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "[bind] isAnyFileType: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, "; "

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->attachment:Lio/getstream/chat/android/models/Attachment;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;->fileNameTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;->fileThumbImageView:Landroid/widget/ImageView;

    const-string v1, "fileThumbImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FileAttachmentPreviewFactory$FileAttachmentPreviewHandler;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiFileAttachmentPreviewBinding;->fileSizeTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result p1

    int-to-long v1, p1

    invoke-static {v1, v2}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertFileSizeByteCount(J)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
