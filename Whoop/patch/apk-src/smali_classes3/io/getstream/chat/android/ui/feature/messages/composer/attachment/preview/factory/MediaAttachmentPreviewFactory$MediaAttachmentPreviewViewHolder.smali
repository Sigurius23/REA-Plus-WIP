.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaAttachmentPreviewViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0002\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0012R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Ll83/a0;",
        "attachmentRemovalListener",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V",
        "setupIconImageView",
        "()V",
        "setupIconCard",
        "attachment",
        "bind",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
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

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

.field private final logger$delegate:Ll83/h;

.field private final style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const-string v3, "binding"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "attachmentRemovalListener"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    const-string v4, "getRoot(...)"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;-><init>(Landroid/view/View;)V

    iput-object v1, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    move-object/from16 v3, p3

    iput-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    const-string v3, "AttachMediaPreviewHolder"

    invoke-static {v0, v3}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v3

    iput-object v3, v0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->logger$delegate:Ll83/h;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lio/getstream/chat/android/ui/R$dimen;->stream_ui_selected_attachment_corner_radius:I

    invoke-static {v3, v4}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->getDimension(Landroid/content/Context;I)I

    move-result v3

    int-to-float v3, v3

    iget-object v4, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->thumbImageView:Lcom/google/android/material/imageview/ShapeableImageView;

    new-instance v5, Lkr/i;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    new-instance v6, Lkr/i;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    new-instance v7, Lkr/i;

    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    new-instance v8, Lkr/i;

    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    new-instance v9, Lkr/e;

    const/4 v10, 0x0

    invoke-direct {v9, v10}, Lkr/e;-><init>(I)V

    new-instance v10, Lkr/e;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lkr/e;-><init>(I)V

    new-instance v11, Lkr/e;

    const/4 v12, 0x0

    invoke-direct {v11, v12}, Lkr/e;-><init>(I)V

    new-instance v12, Lkr/e;

    const/4 v13, 0x0

    invoke-direct {v12, v13}, Lkr/e;-><init>(I)V

    new-instance v13, Lkr/a;

    invoke-direct {v13, v3}, Lkr/a;-><init>(F)V

    new-instance v14, Lkr/a;

    invoke-direct {v14, v3}, Lkr/a;-><init>(F)V

    new-instance v15, Lkr/a;

    invoke-direct {v15, v3}, Lkr/a;-><init>(F)V

    new-instance v0, Lkr/a;

    invoke-direct {v0, v3}, Lkr/a;-><init>(F)V

    new-instance v3, Lkr/k;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-object v5, v3, Lkr/k;->a:Lse/a;

    iput-object v6, v3, Lkr/k;->b:Lse/a;

    iput-object v7, v3, Lkr/k;->c:Lse/a;

    iput-object v8, v3, Lkr/k;->d:Lse/a;

    iput-object v13, v3, Lkr/k;->e:Lkr/c;

    iput-object v14, v3, Lkr/k;->f:Lkr/c;

    iput-object v15, v3, Lkr/k;->g:Lkr/c;

    iput-object v0, v3, Lkr/k;->h:Lkr/c;

    iput-object v9, v3, Lkr/k;->i:Lkr/e;

    iput-object v10, v3, Lkr/k;->j:Lkr/e;

    iput-object v11, v3, Lkr/k;->k:Lkr/e;

    iput-object v12, v3, Lkr/k;->l:Lkr/e;

    invoke-virtual {v4, v3}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    iget-object v0, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->removeButton:Landroid/widget/ImageButton;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;

    const/4 v3, 0x3

    move-object/from16 v4, p0

    invoke-direct {v1, v2, v4, v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;-><init>(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->setupIconImageView()V

    invoke-direct {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->setupIconCard()V

    return-void
.end method

.method private static final _init_$lambda$0(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    if-eqz p1, :cond_0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p0, "attachment"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->_init_$lambda$0(Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;Landroid/view/View;)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final setupIconCard()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    if-eqz v0, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->playIconCardView:Landroidx/cardview/widget/CardView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconBackgroundColor()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconElevation()F

    move-result v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setElevation(F)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconCornerRadius()F

    move-result v0

    invoke-virtual {v1, v0}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    :cond_1
    return-void
.end method

.method private final setupIconImageView()V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->playIconImageView:Landroid/widget/ImageView;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawableTint()Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawablePaddingStart()I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawablePaddingTop()I

    move-result v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawablePaddingEnd()I

    move-result v3

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getMessageInputVideoAttachmentIconDrawablePaddingBottom()I

    move-result v4

    invoke-virtual {v1, v0, v2, v3, v4}, Landroid/view/View;->setPaddingRelative(IIII)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Attachment;)V
    .locals 13

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v4

    const-string v5, ", isVideo: "

    const-string v6, "; "

    const-string v7, "[bind] isImage: "

    invoke-static {v7, v5, v6, v1, v4}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->attachment:Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v6

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->playIconCardView:Landroidx/cardview/widget/CardView;

    const-string v1, "playIconCardView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    goto :goto_0

    :cond_1
    const/16 v1, 0x8

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    const-string v0, "thumbImageView"

    if-eqz v6, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    iget-object v5, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->thumbImageView:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1e

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v12}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/MediaAttachmentPreviewFactory$MediaAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;

    iget-object v1, v1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentPreviewBinding;->thumbImageView:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, p1}, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void
.end method
