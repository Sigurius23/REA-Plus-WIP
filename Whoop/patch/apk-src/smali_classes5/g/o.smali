.class public abstract Lg/o;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public a(Lg/d0;Lg/d0;Landroid/view/Window;Landroid/view/View;ZZ)V
    .locals 1

    const-string v0, "statusBarStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationBarStyle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "window"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "view"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-static {p3, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    if-eqz p5, :cond_0

    iget p1, p1, Lg/d0;->b:I

    goto :goto_0

    :cond_0
    iget p1, p1, Lg/d0;->a:I

    :goto_0
    invoke-virtual {p3, p1}, Landroid/view/Window;->setStatusBarColor(I)V

    if-eqz p6, :cond_1

    iget p1, p2, Lg/d0;->b:I

    goto :goto_1

    :cond_1
    iget p1, p2, Lg/d0;->a:I

    :goto_1
    invoke-virtual {p3, p1}, Landroid/view/Window;->setNavigationBarColor(I)V

    new-instance p1, Laj/d;

    invoke-direct {p1, p4}, Laj/d;-><init>(Landroid/view/View;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 p4, 0x23

    if-lt p2, p4, :cond_2

    new-instance p2, Lh5/u1;

    invoke-direct {p2, p3, p1}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_2

    :cond_2
    const/16 p4, 0x1e

    if-lt p2, p4, :cond_3

    new-instance p2, Lh5/s1;

    invoke-direct {p2, p3, p1}, Lh5/s1;-><init>(Landroid/view/Window;Laj/d;)V

    goto :goto_2

    :cond_3
    new-instance p2, Lh5/r1;

    invoke-direct {p2, p3, p1}, Lh5/r1;-><init>(Landroid/view/Window;Laj/d;)V

    :goto_2
    xor-int/lit8 p1, p5, 0x1

    invoke-virtual {p2, p1}, Lbi/g;->Y(Z)V

    xor-int/lit8 p1, p6, 0x1

    invoke-virtual {p2, p1}, Lbi/g;->X(Z)V

    return-void
.end method
