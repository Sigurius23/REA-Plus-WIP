.class public final Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B\u001b\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0004\u0010\u0008B#\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u0004\u0010\u000bJ\u0019\u0010\r\u001a\u00020\u000c2\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000c2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J/\u0010\u001a\u001a\u00020\u000c2\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0017\u001a\u00020\u00112\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000c2\u0006\u0010\u001c\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u000c2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u001f\u0010%\u001a\u00020\u000c2\u0006\u0010$\u001a\u00020#2\u0008\u0008\u0002\u0010\u001c\u001a\u00020\t\u00a2\u0006\u0004\u0008%\u0010&J-\u0010,\u001a\u00020\u000c2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020\'2\u0006\u0010*\u001a\u00020\'2\u0006\u0010+\u001a\u00020\'\u00a2\u0006\u0004\u0008,\u0010-R$\u0010/\u001a\u0004\u0018\u00010.8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008/\u00100\u001a\u0004\u00081\u00102\"\u0004\u00083\u00104R$\u00106\u001a\u0004\u0018\u0001058\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u00086\u00107\u001a\u0004\u00088\u00109\"\u0004\u0008:\u0010;R\u001a\u0010=\u001a\u00020<8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008B\u0010C\u00a8\u0006E"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;",
        "Landroidx/constraintlayout/widget/ConstraintLayout;",
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
        "setupPlayIcon",
        "()V",
        "",
        "isLoading",
        "showLoading",
        "(Z)V",
        "",
        "mediaUrl",
        "showImagePlaceholder",
        "Lkotlin/Function0;",
        "onCompleteCallback",
        "showMediaPreview",
        "(Ljava/lang/Object;ZLc93/a;)V",
        "andMoreCount",
        "showMoreCount",
        "(I)V",
        "Lkr/k;",
        "shapeAppearanceModel",
        "setMediaPreviewShape",
        "(Lkr/k;)V",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachment",
        "showAttachment",
        "(Lio/getstream/chat/android/models/Attachment;I)V",
        "",
        "topLeft",
        "topRight",
        "bottomRight",
        "bottomLeft",
        "setMediaPreviewShapeByCorners",
        "(FFFF)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "attachmentClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "getAttachmentClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;",
        "setAttachmentClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "attachmentLongClickListener",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "getAttachmentLongClickListener",
        "()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;",
        "setAttachmentLongClickListener",
        "(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;",
        "getBinding$stream_chat_android_ui_components_release",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;",
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
.field public static final Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView$Companion;

.field private static final NO_MORE_COUNT:I


# instance fields
.field private attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

.field private attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

.field private final binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

.field private style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView$Companion;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 1
    invoke-direct {p0, p1, v0, v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 2

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->createStreamThemeWrapper(Landroid/content/Context;)Landroid/content/Context;

    move-result-object p1

    .line 4
    invoke-direct {p0, p1, p2, p3}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    const/4 v0, 0x0

    .line 6
    invoke-static {p1, p3, v0}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p3

    new-instance v0, Landroidx/constraintlayout/widget/d;

    const/4 v1, -0x1

    invoke-direct {v0, v1, v1}, Landroidx/constraintlayout/widget/d;-><init>(II)V

    invoke-virtual {p3, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 p3, 0x1

    .line 8
    invoke-static {p3}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPx(I)I

    move-result p3

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    invoke-virtual {v0, p3, p3, p3, p3}, Landroid/view/View;->setPadding(IIII)V

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p3

    invoke-virtual {p0, p3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 11
    new-instance p3, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;

    const/4 v0, 0x1

    invoke-direct {p3, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/l;-><init>(Ljava/lang/Object;I)V

    invoke-static {p0, p3}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->updateConstraints(Landroidx/constraintlayout/widget/ConstraintLayout;Lkotlin/jvm/functions/Function1;)V

    .line 12
    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    .line 13
    invoke-direct {p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->init(Landroid/util/AttributeSet;)V

    return-void
.end method

.method private static final binding$lambda$1$lambda$0(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;Landroidx/constraintlayout/widget/p;)Ll83/a0;
    .locals 3

    const-string v0, "$this$updateConstraints"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v0

    const-string v1, "getRoot(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-static {p1, v0, v2}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->getRoot()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p0

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x3

    invoke-static {p1, p0, v0}, Lio/getstream/chat/android/ui/utils/extensions/ConstraintLayoutKt;->constrainViewToParentBySide(Landroidx/constraintlayout/widget/p;Landroid/view/View;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static f(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V

    :cond_0
    return-void
.end method

.method private final init(Landroid/util/AttributeSet;)V
    .locals 3

    sget-object v0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->Companion:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle$Companion;->invoke(Landroid/content/Context;Landroid/util/AttributeSet;)Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->loadingProgressBar:Landroid/widget/ProgressBar;

    const/4 v1, 0x0

    const-string v2, "style"

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getProgressIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCountLabel:Landroid/widget/TextView;

    const-string v0, "moreCountLabel"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getMoreCountTextStyle()Lio/getstream/chat/android/ui/font/TextStyle;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/font/TextStyleKt;->setTextStyle(Landroid/widget/TextView;Lio/getstream/chat/android/ui/font/TextStyle;)V

    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setupPlayIcon()V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic j(Lf1/x;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$lambda$6(Lc93/a;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;

    return-void
.end method

.method public static k(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;->onAttachmentLongClick()V

    :cond_0
    return-void
.end method

.method public static synthetic l(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment$lambda$5(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)Ll83/a0;

    return-void
.end method

.method public static m(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showLoading(Z)V

    return-void
.end method

.method public static synthetic n(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;Landroidx/constraintlayout/widget/p;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding$lambda$1$lambda$0(Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;Landroidx/constraintlayout/widget/p;)Ll83/a0;

    return-void
.end method

.method public static synthetic o(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lc93/a;)V
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showMediaPreview$lambda$11(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lc93/a;)Ll83/a0;

    return-void
.end method

.method private final setMediaPreviewShape(Lkr/k;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    invoke-virtual {v0, p1}, Lcom/google/android/material/imageview/ShapeableImageView;->setShapeAppearanceModel(Lkr/k;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    new-instance v1, Lkr/g;

    invoke-direct {v1, p1}, Lkr/g;-><init>(Lkr/k;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    const/4 v3, 0x0

    const-string v4, "style"

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getMediaPreviewBackgroundColor()I

    move-result v2

    invoke-virtual {v1, v2}, Lkr/g;->setTint(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    new-instance v1, Lkr/g;

    invoke-direct {v1, p1}, Lkr/g;-><init>(Lkr/k;)V

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getMediaPreviewBackgroundColor()I

    move-result v2

    invoke-virtual {v1, v2}, Lkr/g;->setTint(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCount:Landroid/widget/FrameLayout;

    new-instance v1, Lkr/g;

    invoke-direct {v1, p1}, Lkr/g;-><init>(Lkr/k;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getMoreCountOverlayColor()I

    move-result p1

    invoke-virtual {v1, p1}, Lkr/g;->setTint(I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_2
    invoke-static {v4}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method private final setupPlayIcon()V
    .locals 7

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->playIconCardView:Landroidx/cardview/widget/CardView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    const-string v2, "style"

    const/4 v3, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconElevation()F

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setElevation(F)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v1, :cond_9

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconBackgroundColor()I

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setCardBackgroundColor(I)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconCornerRadius()F

    move-result v1

    invoke-virtual {v0, v1}, Landroidx/cardview/widget/CardView;->setRadius(F)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->playIconImageView:Landroid/widget/ImageView;

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIcon()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-eqz v1, :cond_1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v4, :cond_0

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconTint()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    invoke-virtual {v1, v4}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_1
    move-object v1, v3

    :cond_2
    :goto_0
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconPaddingStart()I

    move-result v1

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v4, :cond_5

    invoke-virtual {v4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconPaddingTop()I

    move-result v4

    iget-object v5, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v5, :cond_4

    invoke-virtual {v5}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconPaddingEnd()I

    move-result v5

    iget-object v6, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlayVideoIconPaddingBottom()I

    move-result v2

    invoke-virtual {v0, v1, v4, v5, v2}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_7
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_9
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3

    :cond_a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v3
.end method

.method public static synthetic showAttachment$default(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;IILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showAttachment(Lio/getstream/chat/android/models/Attachment;I)V

    return-void
.end method

.method private static final showAttachment$lambda$5(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)Ll83/a0;
    .locals 0

    if-lez p0, :cond_0

    invoke-direct {p1, p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showMoreCount(I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final showAttachment$lambda$6(Lc93/a;Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    iget-object p0, p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object p0, p0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->playIconImageView:Landroid/widget/ImageView;

    const-string p1, "playIconImageView"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final showAttachment$lambda$7(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lio/getstream/chat/android/models/Attachment;Landroid/view/View;)V
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;->onAttachmentClick(Lio/getstream/chat/android/models/Attachment;)V

    :cond_0
    return-void
.end method

.method private static final showAttachment$lambda$8(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Landroid/view/View;)Z
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;->onAttachmentLongClick()V

    :cond_0
    const/4 p0, 0x1

    return p0
.end method

.method private final showLoading(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->loadImage:Landroid/widget/FrameLayout;

    const-string v1, "loadImage"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/16 p1, 0x8

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private final showMediaPreview(Ljava/lang/Object;ZLc93/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Z",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p2, :cond_3

    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    const-string v1, "style"

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlaceholderIcon()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    invoke-virtual {p2}, Landroid/graphics/drawable/Drawable;->mutate()Landroid/graphics/drawable/Drawable;

    move-result-object p2

    iget-object v2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->style:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/MediaAttachmentViewStyle;->getPlaceholderIconTint()Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {p2, v0}, Landroid/graphics/drawable/Drawable;->setTint(I)V

    :cond_0
    move-object v3, p2

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    move-object v3, v0

    :goto_0
    iget-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v1, p2, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->imageView:Lcom/google/android/material/imageview/ShapeableImageView;

    const-string p2, "imageView"

    invoke-static {v1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/d;

    const/4 p2, 0x1

    invoke-direct {v5, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/d;-><init>(Landroid/view/ViewGroup;I)V

    new-instance v6, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/s;

    const/4 p2, 0x2

    invoke-direct {v6, p2, p0, p3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/s;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v4, 0x0

    move-object v2, p1

    invoke-static/range {v1 .. v8}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Landroid/graphics/drawable/Drawable;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    return-void
.end method

.method private static final showMediaPreview$lambda$10(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)Ll83/a0;
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showLoading(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final showMediaPreview$lambda$11(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;Lc93/a;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showLoading(Z)V

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final showMoreCount(I)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCount:Landroid/widget/FrameLayout;

    const-string v1, "moreCount"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;->moreCountLabel:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lio/getstream/chat/android/ui/R$string;->stream_ui_message_list_attachment_more_count:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method


# virtual methods
.method public final getAttachmentClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-object v0
.end method

.method public final getAttachmentLongClickListener()Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-object v0
.end method

.method public final getBinding$stream_chat_android_ui_components_release()Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMediaAttachmentViewBinding;

    return-object v0
.end method

.method public final setAttachmentClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentClickListener;

    return-void
.end method

.method public final setAttachmentLongClickListener(Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->attachmentLongClickListener:Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/AttachmentLongClickListener;

    return-void
.end method

.method public final setMediaPreviewShapeByCorners(FFFF)V
    .locals 9

    new-instance v0, Lkr/i;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lkr/i;

    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    new-instance v2, Lkr/i;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    new-instance v3, Lkr/i;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    new-instance v4, Lkr/e;

    const/4 v5, 0x0

    invoke-direct {v4, v5}, Lkr/e;-><init>(I)V

    new-instance v5, Lkr/e;

    const/4 v6, 0x0

    invoke-direct {v5, v6}, Lkr/e;-><init>(I)V

    new-instance v6, Lkr/e;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lkr/e;-><init>(I)V

    new-instance v7, Lkr/e;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lkr/e;-><init>(I)V

    new-instance v8, Lkr/a;

    invoke-direct {v8, p1}, Lkr/a;-><init>(F)V

    new-instance p1, Lkr/a;

    invoke-direct {p1, p2}, Lkr/a;-><init>(F)V

    new-instance p2, Lkr/a;

    invoke-direct {p2, p3}, Lkr/a;-><init>(F)V

    new-instance p3, Lkr/a;

    invoke-direct {p3, p4}, Lkr/a;-><init>(F)V

    new-instance p4, Lkr/k;

    invoke-direct {p4}, Ljava/lang/Object;-><init>()V

    iput-object v0, p4, Lkr/k;->a:Lse/a;

    iput-object v1, p4, Lkr/k;->b:Lse/a;

    iput-object v2, p4, Lkr/k;->c:Lse/a;

    iput-object v3, p4, Lkr/k;->d:Lse/a;

    iput-object v8, p4, Lkr/k;->e:Lkr/c;

    iput-object p1, p4, Lkr/k;->f:Lkr/c;

    iput-object p2, p4, Lkr/k;->g:Lkr/c;

    iput-object p3, p4, Lkr/k;->h:Lkr/c;

    iput-object v4, p4, Lkr/k;->i:Lkr/e;

    iput-object v5, p4, Lkr/k;->j:Lkr/e;

    iput-object v6, p4, Lkr/k;->k:Lkr/e;

    iput-object v7, p4, Lkr/k;->l:Lkr/e;

    invoke-direct {p0, p4}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->setMediaPreviewShape(Lkr/k;)V

    return-void
.end method

.method public final showAttachment(Lio/getstream/chat/android/models/Attachment;I)V
    .locals 4

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_4

    goto :goto_0

    :cond_1
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getVideoThumbnailsEnabled()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v1

    invoke-static {v0, v1}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    const/4 v0, 0x0

    :cond_4
    :goto_1
    new-instance v1, Lf1/x;

    invoke-direct {v1, p2, p0}, Lf1/x;-><init>(ILio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;)V

    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p2

    new-instance v2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/r;

    const/4 v3, 0x1

    invoke-direct {v2, v1, p0, p1, v3}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-direct {p0, v0, p2, v2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/MediaAttachmentView;->showMediaPreview(Ljava/lang/Object;ZLc93/a;)V

    new-instance p2, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;

    const/16 v0, 0x8

    invoke-direct {p2, v0, p0, p1}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, p2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    new-instance p1, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lio/getstream/chat/android/ui/feature/messages/list/adapter/view/internal/f;-><init>(Landroid/view/View;I)V

    invoke-virtual {p0, p1}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    return-void
.end method
