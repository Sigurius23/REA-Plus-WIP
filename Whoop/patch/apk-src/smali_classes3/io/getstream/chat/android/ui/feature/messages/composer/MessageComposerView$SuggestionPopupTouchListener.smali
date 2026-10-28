.class final Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "SuggestionPopupTouchListener"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0082\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0016\u00a8\u0006\n"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;",
        "Landroid/view/View$OnTouchListener;",
        "<init>",
        "(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V",
        "onTouch",
        "",
        "v",
        "Landroid/view/View;",
        "event",
        "Landroid/view/MotionEvent;",
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
.field final synthetic this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onTouch(Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 4

    iget-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {p1}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->access$getSuggestionsPopup$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;

    move-result-object p1

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getAction()I

    move-result v1

    const/4 v2, 0x4

    if-ne v1, v2, :cond_2

    const/4 v1, 0x2

    new-array v1, v1, [I

    invoke-virtual {p1}, Landroid/widget/PopupWindow;->getContentView()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    move-result p1

    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    move-result p2

    aget v2, v1, v0

    int-to-float v2, v2

    add-float/2addr v2, p1

    const/4 p1, 0x1

    aget v1, v1, p1

    int-to-float v1, v1

    add-float/2addr v1, p2

    new-instance p2, Landroid/graphics/Rect;

    invoke-direct {p2}, Landroid/graphics/Rect;-><init>()V

    iget-object v3, p0, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView$SuggestionPopupTouchListener;->this$0:Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;

    invoke-static {v3}, Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;->access$getBinding$p(Lio/getstream/chat/android/ui/feature/messages/composer/MessageComposerView;)Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;

    move-result-object v3

    if-eqz v3, :cond_1

    iget-object v3, v3, Lio/getstream/chat/android/ui/databinding/StreamUiMessageComposerBinding;->leadingContent:Landroid/widget/FrameLayout;

    invoke-virtual {v3, p2}, Landroid/view/View;->getGlobalVisibleRect(Landroid/graphics/Rect;)Z

    float-to-int v2, v2

    float-to-int v1, v1

    invoke-virtual {p2, v2, v1}, Landroid/graphics/Rect;->contains(II)Z

    move-result p2

    if-eqz p2, :cond_2

    return p1

    :cond_1
    const-string p1, "binding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_2
    return v0
.end method
