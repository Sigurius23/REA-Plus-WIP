.class public final Lio/getstream/chat/android/ui/utils/extensions/EditTextKt$focusAndShowKeyboard$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lio/getstream/chat/android/ui/utils/extensions/EditTextKt;->focusAndShowKeyboard(Landroid/widget/EditText;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "io/getstream/chat/android/ui/utils/extensions/EditTextKt$focusAndShowKeyboard$1",
        "Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;",
        "",
        "hasFocus",
        "Ll83/a0;",
        "onWindowFocusChanged",
        "(Z)V",
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
.field final synthetic $this_focusAndShowKeyboard:Landroid/widget/EditText;


# direct methods
.method public constructor <init>(Landroid/widget/EditText;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt$focusAndShowKeyboard$1;->$this_focusAndShowKeyboard:Landroid/widget/EditText;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onWindowFocusChanged(Z)V
    .locals 0

    if-eqz p1, :cond_0

    iget-object p1, p0, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt$focusAndShowKeyboard$1;->$this_focusAndShowKeyboard:Landroid/widget/EditText;

    invoke-static {p1}, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt;->showKeyboardIfFocused(Landroid/widget/EditText;)V

    iget-object p1, p0, Lio/getstream/chat/android/ui/utils/extensions/EditTextKt$focusAndShowKeyboard$1;->$this_focusAndShowKeyboard:Landroid/widget/EditText;

    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object p1

    invoke-virtual {p1, p0}, Landroid/view/ViewTreeObserver;->removeOnWindowFocusChangeListener(Landroid/view/ViewTreeObserver$OnWindowFocusChangeListener;)V

    :cond_0
    return-void
.end method
