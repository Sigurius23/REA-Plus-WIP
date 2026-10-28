.class public Lg/q;
.super Lg/p;
.source "SourceFile"


# virtual methods
.method public a(Lg/d0;Lg/d0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 3

    const-string v0, "statusBarStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationBarStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget v0, p2, Lg/d0;->c:I

    const-string v1, "window"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "view"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x0

    invoke-static {p3, v1}, Lpf/c;->V(Landroid/view/Window;Z)V

    iget v2, p1, Lg/d0;->c:I

    if-nez v2, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    if-eqz p5, :cond_1

    iget p1, p1, Lg/d0;->b:I

    goto :goto_0

    :cond_1
    iget p1, p1, Lg/d0;->a:I

    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    if-nez v0, :cond_2

    move p1, v1

    goto :goto_1

    :cond_2
    if-eqz p6, :cond_3

    iget p1, p2, Lg/d0;->b:I

    goto :goto_1

    :cond_3
    iget p1, p2, Lg/d0;->a:I

    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    invoke-virtual {p3, v1}, Landroid/view/Window;->setStatusBarContrastEnforced(Z)V

    const/4 p1, 0x1

    if-nez v0, :cond_4

    move v1, p1

    :cond_4
    invoke-virtual {p3, v1}, Landroid/view/Window;->setNavigationBarContrastEnforced(Z)V

    new-instance p2, Laj/d;

    invoke-direct {p2, p4}, Laj/d;-><init>(Landroid/view/View;)V

    sget p4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x23

    if-lt p4, v0, :cond_5

    new-instance p4, Lh5/u1;

    invoke-direct {p4, p3, p2}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_2

    :cond_5
    const/16 v0, 0x1e

    if-lt p4, v0, :cond_6

    new-instance p4, Lh5/s1;

    invoke-direct {p4, p3, p2}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_2

    :cond_6
    new-instance p4, Lh5/r1;

    invoke-direct {p4, p3, p2}, Lh5/r1;-><init>(Landroid/view/Window;Laj/d;)V

    :goto_2
    xor-int/lit8 p2, p5, 0x1

    invoke-virtual {p4, p2}, Lbi/g;->Y(Z)V

    xor-int/2addr p1, p6

    invoke-virtual {p4, p1}, Lbi/g;->X(Z)V

    return-void
.end method
