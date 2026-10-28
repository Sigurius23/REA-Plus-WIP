.class public final Lh20/r3;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:La30/w0;


# direct methods
.method public constructor <init>(La30/w0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lh20/r3;->a:La30/w0;

    return-void
.end method


# virtual methods
.method public final a(Lh20/u2;Lh20/x1;)V
    .locals 7

    const-string v0, "intentConfiguration"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, La30/q0;

    invoke-direct {v2, p1}, La30/q0;-><init>(Lh20/u2;)V

    iget-object p1, p0, Lh20/r3;->a:La30/w0;

    iget-object v0, p1, La30/w0;->y:Ljava/lang/Object;

    check-cast v0, Landroid/app/Activity;

    if-nez p2, :cond_0

    invoke-static {v0}, Lse/h;->z(Landroid/content/Context;)Lh20/x1;

    move-result-object p2

    :cond_0
    move-object v3, p2

    const-string p2, "activity"

    invoke-static {v0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget p2, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    const/4 v4, 0x0

    if-le p2, v1, :cond_2

    :cond_1
    :goto_0
    move-object v5, v4

    goto :goto_1

    :cond_2
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Landroid/view/Window;->getStatusBarColor()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_0

    :goto_1
    iget-object p2, p1, La30/w0;->z:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Ljava/lang/String;

    new-instance v1, Lh20/w3;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lh20/w3;-><init>(La30/t0;Lh20/x1;Ljava/lang/String;Ljava/lang/Integer;Z)V

    iget-object p2, p1, La30/w0;->F:Ljava/lang/Object;

    check-cast p2, Landroid/app/Application;

    invoke-virtual {p2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p2

    const v0, 0x7f01005d

    const v2, 0x7f01005e

    invoke-static {p2, v0, v2}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object p2

    const-string v0, "makeCustomAnimation(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p1, La30/w0;->x:Ljava/lang/Object;

    check-cast v0, Lj/d;

    invoke-virtual {v0, v1, p2}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p2, v0

    iget-object v0, p1, La30/w0;->E:Ljava/lang/Object;

    check-cast v0, Landroidx/lifecycle/g0;

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "The host activity is not in a valid state ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")."

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iget-object p1, p1, La30/w0;->G:Ljava/lang/Object;

    check-cast p1, Lg32/n;

    new-instance v1, Lh20/a4;

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2, v0, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v1, v2}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p1, v1}, Lg32/n;->a(Lh20/b4;)V

    return-void
.end method
