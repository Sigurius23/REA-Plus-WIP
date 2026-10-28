.class final Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;
.super Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "FallbackAttachmentPreviewViewHolder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0002\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\rR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;",
        "Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;",
        "binding",
        "Lkotlin/Function1;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Ll83/a0;",
        "attachmentRemovalListener",
        "<init>",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;)V",
        "attachment",
        "bind",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;",
        "Lkotlin/jvm/functions/Function1;",
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
.field private final attachmentRemovalListener:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "binding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachmentRemovalListener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;-><init>(Landroid/view/View;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    return-void
.end method

.method public static a(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final bind$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->attachmentRemovalListener:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final bind(Lio/getstream/chat/android/models/Attachment;)V
    .locals 3

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;->titleImageView:Landroid/widget/TextView;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/FallbackAttachmentPreviewFactory$FallbackAttachmentPreviewViewHolder;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiUnsupportedAttachmentPreviewBinding;->removeButton:Landroid/widget/ImageButton;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/factory/a;-><init>(Lio/getstream/chat/android/ui/feature/messages/composer/attachment/preview/AttachmentPreviewViewHolder;Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
