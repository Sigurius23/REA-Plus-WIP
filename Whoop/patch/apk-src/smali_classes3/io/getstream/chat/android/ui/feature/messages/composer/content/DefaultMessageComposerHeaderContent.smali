.class public Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;
.super Landroid/widget/FrameLayout;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006B\u001b\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\tB#\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0005\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\"\u0010\u0019\u001a\u00020\u00188\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\"\u0010 \u001a\u00020\u001f8\u0004@\u0004X\u0084.\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%R*\u0010\'\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010&8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\'\u0010(\u001a\u0004\u0008)\u0010*\"\u0004\u0008+\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;",
        "Landroid/widget/FrameLayout;",
        "Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerHeaderContent;",
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
        "()V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;",
        "messageComposerContext",
        "attachContext",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;",
        "state",
        "renderState",
        "(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;",
        "binding",
        "Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;",
        "getBinding",
        "()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;",
        "setBinding",
        "(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;)V",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "style",
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "getStyle",
        "()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;",
        "setStyle",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V",
        "Lkotlin/Function0;",
        "dismissActionClickListener",
        "Lc93/a;",
        "getDismissActionClickListener",
        "()Lc93/a;",
        "setDismissActionClickListener",
        "(Lc93/a;)V",
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
.field public static final synthetic w:I


# instance fields
.field protected binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

.field private dismissActionClickListener:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field protected style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

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
    invoke-direct {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->init()V

    return-void
.end method

.method private final init()V
    .locals 3

    invoke-static {p0}, Lio/getstream/chat/android/ui/utils/extensions/ViewGroupKt;->getStreamThemeInflater(Landroid/view/ViewGroup;)Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0, p0}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object v0

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->setBinding(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object v0

    iget-object v0, v0, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->dismissInputModeButton:Landroid/widget/ImageView;

    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/content/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method private static final init$lambda$0(Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;Landroid/view/View;)V
    .locals 0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getDismissActionClickListener()Lc93/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method


# virtual methods
.method public final attachContext(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;)V
    .locals 1

    const-string v0, "messageComposerContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerContext;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->dismissInputModeButton:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getDismissModeIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public final findViewByKey(Ljava/lang/String;)Landroid/view/View;
    .locals 0

    invoke-super {p0, p1}, Lio/getstream/chat/android/ui/feature/messages/composer/content/MessageComposerContent;->findViewByKey(Ljava/lang/String;)Landroid/view/View;

    const/4 p1, 0x0

    return-object p1
.end method

.method public final getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public getDismissActionClickListener()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->dismissActionClickListener:Lc93/a;

    return-object v0
.end method

.method public final getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "style"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final renderState(Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;)V
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getRecording()Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/ui/common/state/messages/composer/RecordingState$Idle;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->getRoot()Landroid/view/View;

    move-result-object v1

    const-string v2, "getRoot(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v2, 0x8

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/MessageComposerState;->getAction()Lio/getstream/chat/android/ui/common/state/messages/MessageAction;

    move-result-object p1

    instance-of v0, p1, Lio/getstream/chat/android/ui/common/state/messages/Reply;

    const-string v1, "inputModeHeaderContainer"

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeHeaderContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getReplyModeText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeImageView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getReplyModeIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_1
    instance-of p1, p1, Lio/getstream/chat/android/ui/common/state/messages/Edit;

    if-eqz p1, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeHeaderContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeTextView:Landroid/widget/TextView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getEditModeText()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeImageView:Landroid/widget/ImageView;

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getStyle()Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;->getEditModeIconDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_2
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->getBinding()Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    move-result-object p1

    iget-object p1, p1, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;->inputModeHeaderContainer:Landroid/widget/FrameLayout;

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final setBinding(Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->binding:Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerDefaultHeaderContentBinding;

    return-void
.end method

.method public setDismissActionClickListener(Lc93/a;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->dismissActionClickListener:Lc93/a;

    return-void
.end method

.method public final setStyle(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/content/DefaultMessageComposerHeaderContent;->style:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerViewStyle;

    return-void
.end method
