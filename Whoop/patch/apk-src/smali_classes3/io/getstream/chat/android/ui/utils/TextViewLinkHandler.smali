.class public abstract Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;
.super Landroid/text/method/LinkMovementMethod;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;",
        "Landroid/text/method/LinkMovementMethod;",
        "<init>",
        "()V",
        "Landroid/widget/TextView;",
        "widget",
        "Landroid/text/Spannable;",
        "buffer",
        "Landroid/view/MotionEvent;",
        "event",
        "",
        "onTouchEvent",
        "(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z",
        "",
        "url",
        "Ll83/a0;",
        "onLinkClick",
        "(Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "onUserClick",
        "(Lio/getstream/chat/android/models/User;)V",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Landroid/text/method/LinkMovementMethod;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract onLinkClick(Ljava/lang/String;)V
.end method

.method public final onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z
    .locals 3

    const-string v0, "widget"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buffer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getAction()I

    move-result v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    invoke-super {p0, p1, p2, p3}, Landroid/text/method/LinkMovementMethod;->onTouchEvent(Landroid/widget/TextView;Landroid/text/Spannable;Landroid/view/MotionEvent;)Z

    move-result p1

    return p1

    :cond_0
    invoke-virtual {p3}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    float-to-int v0, v0

    invoke-virtual {p3}, Landroid/view/MotionEvent;->getY()F

    move-result p3

    float-to-int p3, p3

    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingLeft()I

    move-result v2

    sub-int/2addr v0, v2

    invoke-virtual {p1}, Landroid/widget/TextView;->getTotalPaddingTop()I

    move-result v2

    sub-int/2addr p3, v2

    invoke-virtual {p1}, Landroid/view/View;->getScrollX()I

    move-result v2

    add-int/2addr v2, v0

    invoke-virtual {p1}, Landroid/view/View;->getScrollY()I

    move-result v0

    add-int/2addr v0, p3

    invoke-virtual {p1}, Landroid/widget/TextView;->getLayout()Landroid/text/Layout;

    move-result-object p1

    invoke-virtual {p1, v0}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result p3

    int-to-float v0, v2

    invoke-virtual {p1, p3, v0}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result p1

    const-class p3, Landroid/text/style/URLSpan;

    invoke-interface {p2, p1, p1, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p3

    const-string v0, "getSpans(...)"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/text/style/URLSpan;

    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object p3

    const-string v2, "getURL(...)"

    invoke-static {p3, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;->onLinkClick(Ljava/lang/String;)V

    :cond_1
    const-class p3, Lio/getstream/chat/android/ui/utils/UserSpan;

    invoke-interface {p2, p1, p1, p3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lm83/n;->t0([Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/ui/utils/UserSpan;

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/utils/UserSpan;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/ui/utils/TextViewLinkHandler;->onUserClick(Lio/getstream/chat/android/models/User;)V

    :cond_2
    return v1
.end method

.method public abstract onUserClick(Lio/getstream/chat/android/models/User;)V
.end method
