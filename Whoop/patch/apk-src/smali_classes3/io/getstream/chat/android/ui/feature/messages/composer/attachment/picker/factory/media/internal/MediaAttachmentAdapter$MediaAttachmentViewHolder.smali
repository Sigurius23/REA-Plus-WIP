.class public final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;
.super Landroidx/recyclerview/widget/o2;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MediaAttachmentViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u000eJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000c\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0014R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0015R\"\u0010\u000c\u001a\u00020\u00058\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018\"\u0004\u0008\u0019\u0010\u000e\u00a8\u0006\u001a"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;",
        "Landroidx/recyclerview/widget/o2;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "Ll83/a0;",
        "onAttachmentSelected",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "style",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V",
        "attachment",
        "bindMediaImage",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V",
        "bindSelectionMark",
        "bindSelectionOverlay",
        "bindAttachmentType",
        "bind",
        "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;",
        "Lkotlin/jvm/functions/Function1;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "getAttachment",
        "()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "setAttachment",
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
.field public attachment:Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

.field private final onAttachmentSelected:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;Lkotlin/jvm/functions/Function1;Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;",
            "Lkotlin/jvm/functions/Function1;",
            "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onAttachmentSelected"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-direct {p0, v0}, Landroidx/recyclerview/widget/o2;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    iput-object p3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    new-instance p2, Lb30/k3;

    const/16 p3, 0x12

    invoke-direct {p2, p0, p3}, Lb30/k3;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final _init_$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;Landroid/view/View;)V
    .locals 0

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->onAttachmentSelected:Lkotlin/jvm/functions/Function1;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final bindAttachmentType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 5

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "videoInformationConstraintLayout"

    const/16 v2, 0x8

    if-eqz v0, :cond_5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoInformationConstraintLayout:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoLengthTextVisible()Z

    move-result v1

    const/4 v3, 0x0

    if-nez v1, :cond_1

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoIconVisible()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    move v1, v3

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v1, 0x1

    :goto_1
    if-eqz v1, :cond_2

    move v1, v3

    goto :goto_2

    :cond_2
    move v1, v2

    :goto_2
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLengthTextView:Landroid/widget/TextView;

    const-string v1, "videoLengthTextView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoLengthTextVisible()Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_3

    :cond_3
    move v4, v2

    :goto_3
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLogoImageView:Landroid/widget/ImageView;

    const-string v4, "videoLogoImageView"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoIconVisible()Z

    move-result v4

    if-eqz v4, :cond_4

    move v2, v3

    :cond_4
    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLogoImageView:Landroid/widget/ImageView;

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoIconDrawableTint()Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lio/getstream/chat/android/ui/utils/extensions/DrawableKt;->applyTint(Landroid/graphics/drawable/Drawable;Ljava/lang/Integer;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLengthTextView:Landroid/widget/TextView;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->style:Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/AttachmentsPickerDialogStyle;->getVideoLengthTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLengthTextView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getVideoLength()J

    move-result-wide v1

    const/4 p1, 0x2

    const/4 v3, 0x0

    invoke-static {v1, v2, v3, p1, v3}, Lio/getstream/chat/android/ui/common/utils/MediaStringUtil;->convertVideoLength$default(JLjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoInformationConstraintLayout:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->videoLengthTextView:Landroid/widget/TextView;

    const-string v0, ""

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private final bindMediaImage(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 10

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "video"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "mediaThumbnailImageView"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->mediaThumbnailImageView:Landroid/widget/ImageView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v3

    sget p1, Lio/getstream/chat/android/ui/R$drawable;->stream_ui_placeholder:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v8, 0x1c

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->loadVideoThumbnail$default(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    iget-object p1, p0, Landroidx/recyclerview/widget/o2;->itemView:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    sget v0, Lio/getstream/chat/android/ui/R$color;->stream_ui_white_smoke:I

    invoke-static {p1, v0}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->mediaThumbnailImageView:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v2, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->mediaThumbnailImageView:Landroid/widget/ImageView;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v3

    const/16 v8, 0x1e

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->mediaThumbnailImageView:Landroid/widget/ImageView;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackgroundColor(I)V

    return-void
.end method

.method private final bindSelectionMark(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->selectionMarkImageView:Landroid/widget/ImageView;

    const-string v1, "selectionMarkImageView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final bindSelectionOverlay(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiItemAttachmentMediaBinding;->selectionOverlayView:Landroid/view/View;

    const-string v1, "selectionOverlayView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->isSelected()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->attachment:Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bindMediaImage(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bindSelectionMark(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bindSelectionOverlay(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->bindAttachmentType(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V

    return-void
.end method

.method public final getAttachment()Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->attachment:Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "attachment"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final setAttachment(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/media/internal/MediaAttachmentAdapter$MediaAttachmentViewHolder;->attachment:Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;

    return-void
.end method
