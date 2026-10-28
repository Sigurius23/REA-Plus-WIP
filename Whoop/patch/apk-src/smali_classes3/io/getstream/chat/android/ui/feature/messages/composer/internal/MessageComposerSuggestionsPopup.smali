.class public final Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;
.super Landroid/widget/PopupWindow;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;",
        "Landroid/widget/PopupWindow;",
        "Landroid/view/View;",
        "suggestionView",
        "anchorView",
        "Landroid/widget/PopupWindow$OnDismissListener;",
        "dismissListener",
        "<init>",
        "(Landroid/view/View;Landroid/view/View;Landroid/widget/PopupWindow$OnDismissListener;)V",
        "Ll83/a0;",
        "showOrUpdate",
        "()V",
        "Landroid/view/View;",
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
.field private final anchorView:Landroid/view/View;

.field private final suggestionView:Landroid/view/View;


# direct methods
.method public constructor <init>(Landroid/view/View;Landroid/view/View;Landroid/widget/PopupWindow$OnDismissListener;)V
    .locals 2

    const-string v0, "suggestionView"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "anchorView"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dismissListener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, -0x1

    const/4 v1, -0x2

    invoke-direct {p0, p1, v0, v1}, Landroid/widget/PopupWindow;-><init>(Landroid/view/View;II)V

    iput-object p1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->suggestionView:Landroid/view/View;

    iput-object p2, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->anchorView:Landroid/view/View;

    const/4 p1, 0x1

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setOutsideTouchable(Z)V

    invoke-virtual {p0, p1}, Landroid/widget/PopupWindow;->setInputMethodMode(I)V

    invoke-virtual {p0, p3}, Landroid/widget/PopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    return-void
.end method


# virtual methods
.method public final showOrUpdate()V
    .locals 9

    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->suggestionView:Landroid/view/View;

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    const/4 v2, 0x0

    invoke-static {v2, v2}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    invoke-virtual {v1, v0, v3}, Landroid/view/View;->measure(II)V

    iget-object v0, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->suggestionView:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    move-result v0

    iget-object v1, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->anchorView:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    move-result v1

    add-int/2addr v1, v0

    invoke-virtual {p0}, Landroid/widget/PopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v4, p0, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->anchorView:Landroid/view/View;

    neg-int v6, v1

    const/4 v7, -0x1

    const/4 v8, -0x1

    const/4 v5, 0x0

    move-object v3, p0

    invoke-virtual/range {v3 .. v8}, Landroid/widget/PopupWindow;->update(Landroid/view/View;IIII)V

    return-void

    :cond_0
    move-object v3, p0

    iget-object v0, v3, Lio/getstream/chat/android/ui/feature/messages/composer/internal/MessageComposerSuggestionsPopup;->anchorView:Landroid/view/View;

    neg-int v1, v1

    invoke-virtual {p0, v0, v2, v1}, Landroid/widget/PopupWindow;->showAsDropDown(Landroid/view/View;II)V

    return-void
.end method
