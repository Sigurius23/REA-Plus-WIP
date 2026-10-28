.class public final Lio/getstream/chat/android/ui/utils/extensions/ViewKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\u0008\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001d\u0010\u0007\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001d\u0010\n\u001a\u00020\u0003*\u00020\u00002\u0008\u0008\u0001\u0010\t\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\n\u0010\u0008\u001a\u001b\u0010\r\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0008\" \u0010\u0016\u001a\u0004\u0018\u00010\u0011*\u00020\u00008FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Landroid/view/View;",
        "",
        "color",
        "Ll83/a0;",
        "setBorderlessRipple",
        "(Landroid/view/View;Ljava/lang/Integer;)V",
        "resId",
        "showToast",
        "(Landroid/view/View;I)V",
        "start",
        "setPaddingStart",
        "Lio/getstream/chat/android/ui/helper/ViewPadding;",
        "padding",
        "setPaddingCompat",
        "(Landroid/view/View;Lio/getstream/chat/android/ui/helper/ViewPadding;)V",
        "typeMask",
        "applyEdgeToEdgePadding",
        "Landroidx/fragment/app/r0;",
        "getActivity",
        "(Landroid/view/View;)Landroidx/fragment/app/r0;",
        "getActivity$annotations",
        "(Landroid/view/View;)V",
        "activity",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(ILandroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/ui/utils/extensions/ViewKt;->applyEdgeToEdgePadding$lambda$0(ILandroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method public static final applyEdgeToEdgePadding(Landroid/view/View;I)V
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb9/t;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lb9/t;-><init>(II)V

    sget-object p1, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {p0, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    invoke-static {p0}, Lh5/f0;->c(Landroid/view/View;)V

    return-void
.end method

.method private static final applyEdgeToEdgePadding$lambda$0(ILandroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "windowInsets"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p2, p0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p0

    const-string p2, "getInsets(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p0, Lv4/b;->a:I

    iget v0, p0, Lv4/b;->b:I

    iget v1, p0, Lv4/b;->c:I

    iget p0, p0, Lv4/b;->d:I

    invoke-virtual {p1, p2, v0, v1, p0}, Landroid/view/View;->setPadding(IIII)V

    sget-object p0, Lh5/q1;->b:Lh5/q1;

    return-object p0
.end method

.method public static final getActivity(Landroid/view/View;)Landroidx/fragment/app/r0;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    :goto_0
    instance-of v0, p0, Landroid/content/ContextWrapper;

    if-eqz v0, :cond_1

    instance-of v0, p0, Landroidx/fragment/app/r0;

    if-eqz v0, :cond_0

    check-cast p0, Landroidx/fragment/app/r0;

    return-object p0

    :cond_0
    check-cast p0, Landroid/content/ContextWrapper;

    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic getActivity$annotations(Landroid/view/View;)V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static final setBorderlessRipple(Landroid/view/View;Ljava/lang/Integer;)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    const-string v1, "valueOf(...)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Landroid/graphics/drawable/RippleDrawable;

    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-direct {v1, p1, v0, v2}, Landroid/graphics/drawable/RippleDrawable;-><init>(Landroid/content/res/ColorStateList;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void
.end method

.method public static final setPaddingCompat(Landroid/view/View;Lio/getstream/chat/android/ui/helper/ViewPadding;)V
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "padding"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/helper/ViewPadding;->getStart()I

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/helper/ViewPadding;->getTop()I

    move-result v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/helper/ViewPadding;->getEnd()I

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/helper/ViewPadding;->getBottom()I

    move-result p1

    sget-object v3, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-virtual {p0, v0, v1, v2, p1}, Landroid/view/View;->setPaddingRelative(IIII)V

    return-void
.end method

.method public static final setPaddingStart(Landroid/view/View;I)V
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "getContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lio/getstream/chat/android/ui/utils/extensions/ContextKt;->isRtlLayout(Landroid/content/Context;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, v0, v1, p1, v2}, Landroid/view/View;->setPadding(IIII)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getPaddingTop()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0}, Landroid/view/View;->getPaddingBottom()I

    move-result v2

    invoke-virtual {p0, p1, v0, v1, v2}, Landroid/view/View;->setPadding(IIII)V

    return-void
.end method

.method public static final showToast(Landroid/view/View;I)V
    .locals 1
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p0

    const/4 p1, 0x0

    invoke-static {v0, p0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    return-void
.end method
