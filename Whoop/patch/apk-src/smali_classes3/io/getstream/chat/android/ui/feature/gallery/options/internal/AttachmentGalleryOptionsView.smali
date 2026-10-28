.class public final Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0013\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000c2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u0015\u0010\u0018\u001a\u00020\u000c2\u0006\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;",
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
        "Landroid/view/View$OnClickListener;",
        "listener",
        "setReplyClickListener",
        "(Landroid/view/View$OnClickListener;)V",
        "setDeleteClickListener",
        "setShowInChatClickListener",
        "setSaveMediaClickListener",
        "",
        "isMine",
        "setIsMine",
        "(Z)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;",
        "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;",
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
.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

.field private style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x1

    invoke-static {p1, p0, p3}, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    .line 6
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 5

    sget-object v0, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->optionsContainer:Landroidx/cardview/widget/CardView;

    const/4 v1, 0x0

    const-string v2, "style"

    if-eqz p1, :cond_11

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getBackgroundColor()I

    move-result p1

    invoke-virtual {v0, p1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz p1, :cond_10

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getReplyOptionEnabled()Z

    move-result p1

    const-string v0, "reply"

    const/16 v3, 0x8

    if-eqz p1, :cond_2

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->reply:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getReplyOptionDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->reply:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->reply:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz p1, :cond_f

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getShowInChatOptionEnabled()Z

    move-result p1

    const-string v0, "showInChat"

    if-eqz p1, :cond_5

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->showInChat:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getShowInChatOptionDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->showInChat:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->showInChat:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz p1, :cond_e

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getSaveMediaOptionEnabled()Z

    move-result p1

    const-string v0, "saveMedia"

    if-eqz p1, :cond_8

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->saveMedia:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v4, :cond_7

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getSaveMediaOptionDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-static {p1, v4}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->saveMedia:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_8
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->saveMedia:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :goto_2
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz p1, :cond_d

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getDeleteOptionEnabled()Z

    move-result p1

    const-string v0, "delete"

    if-eqz p1, :cond_c

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getDeleteOptionDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    invoke-static {p1, v3}, Lio/getstream/chat/android/ui/utils/extensions/TextViewKt;->setStartDrawable(Landroid/widget/TextView;Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v0, :cond_a

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getOptionTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz v0, :cond_9

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getDeleteOptionTextColor()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setTextColor(I)V

    return-void

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_c
    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_e
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_f
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_11
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method


# virtual methods
.method public final setDeleteClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setIsMine(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->delete:Landroid/widget/TextView;

    const-string v1, "delete"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->style:Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/gallery/options/AttachmentGalleryOptionsViewStyle;->getDeleteOptionEnabled()Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const-string p1, "style"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_1
    move p1, v1

    :goto_0
    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    const/16 v1, 0x8

    :goto_1
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setReplyClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->reply:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setSaveMediaClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->saveMedia:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final setShowInChatClickListener(Landroid/view/View$OnClickListener;)V
    .locals 1

    const-string v0, "listener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/gallery/options/internal/AttachmentGalleryOptionsView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiAttachmentGalleryOptionsViewBinding;->showInChat:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method
