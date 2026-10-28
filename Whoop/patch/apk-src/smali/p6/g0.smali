.class public abstract Lp6/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final w:I

.field private final x:Lp6/u1;

.field private final y:Lp6/j1;

.field private final z:Ly6/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ly6/g;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, 0x7f0d01e8

    iput v0, p0, Lp6/g0;->w:I

    sget-object v0, Lp6/t1;->a:Lp6/t1;

    iput-object v0, p0, Lp6/g0;->x:Lp6/u1;

    iput-object v0, p0, Lp6/g0;->y:Lp6/j1;

    sget-object v0, Ly6/h;->a:Ly6/h;

    iput-object v0, p0, Lp6/g0;->z:Ly6/g;

    return-void
.end method

.method public static synthetic k(Lp6/g0;Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp6/g0;",
            "Landroid/content/Context;",
            "Ln6/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic o(Lp6/g0;Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    if-nez p7, :cond_1

    and-int/lit8 p6, p6, 0x8

    if-eqz p6, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lp6/g0;->n(Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: triggerAction"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic r(Lp6/g0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p6, :cond_1

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3, p4}, Lp6/g0;->q(Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: update"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public a(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;)Lp6/l;
    .locals 0

    new-instance p1, Lp6/l;

    invoke-direct {p1, p0, p2, p3}, Lp6/l;-><init>(Lp6/g0;Lp6/b;Landroid/os/Bundle;)V

    return-object p1
.end method

.method public final b(Landroid/content/Context;ILq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lp6/c0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lp6/c0;

    iget v1, v0, Lp6/c0;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lp6/c0;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lp6/c0;

    invoke-direct {v0, p0, p3}, Lp6/c0;-><init>(Lp6/g0;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lp6/c0;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lp6/c0;->G:I

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, Lp6/c0;->y:Ljava/lang/Throwable;

    iget-object p2, v0, Lp6/c0;->x:Lp6/b;

    iget-object v0, v0, Lp6/c0;->w:Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_1
    iget-object p1, v0, Lp6/c0;->x:Lp6/b;

    iget-object p2, v0, Lp6/c0;->w:Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-object p1, v0, Lp6/c0;->x:Lp6/b;

    iget-object p2, v0, Lp6/c0;->w:Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_3
    iget-object p1, v0, Lp6/c0;->x:Lp6/b;

    iget-object p2, v0, Lp6/c0;->w:Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget p1, v0, Lp6/c0;->z:I

    iget-object p2, v0, Lp6/c0;->x:Lp6/b;

    iget-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v6, p2

    move p2, p1

    move-object p1, v6

    goto :goto_2

    :catchall_0
    move-exception p3

    goto/16 :goto_4

    :catch_0
    move-object v6, p2

    move p2, p1

    move-object p1, v6

    goto/16 :goto_7

    :pswitch_5
    iget p2, v0, Lp6/c0;->z:I

    iget-object p1, v0, Lp6/c0;->x:Lp6/b;

    iget-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p3, p1

    move-object p1, v2

    goto :goto_1

    :pswitch_6
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p3, Lp6/b;

    invoke-direct {p3, p2}, Lp6/b;-><init>(I)V

    invoke-virtual {p0, p1}, Lp6/g0;->f(Landroid/content/Context;)Lx6/f;

    move-result-object v2

    new-instance v3, Ln20/j;

    const/4 v4, 0x0

    const/16 v5, 0xd

    invoke-direct {v3, p3, v4, v5}, Ln20/j;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput-object p1, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p3, v0, Lp6/c0;->x:Lp6/b;

    iput p2, v0, Lp6/c0;->z:I

    const/4 v4, 0x1

    iput v4, v0, Lp6/c0;->G:I

    check-cast v2, Lx6/l;

    invoke-virtual {v2, v3, v0}, Lx6/l;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_1

    goto/16 :goto_8

    :cond_1
    :goto_1
    :try_start_1
    iput-object p1, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p3, v0, Lp6/c0;->x:Lp6/b;

    iput p2, v0, Lp6/c0;->z:I

    const/4 v2, 0x2

    iput v2, v0, Lp6/c0;->G:I

    invoke-virtual {p0, p1, p3, v0}, Lp6/g0;->j(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v2
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v2, v1, :cond_2

    goto/16 :goto_8

    :cond_2
    move-object v2, p1

    move-object p1, p3

    :goto_2
    invoke-virtual {p0}, Lp6/g0;->h()Ly6/g;

    move-result-object p3

    if-eqz p3, :cond_4

    sget-object v3, Ly6/f;->a:Ly6/f;

    invoke-static {p2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object p2

    iput-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p1, v0, Lp6/c0;->x:Lp6/b;

    const/4 v4, 0x3

    iput v4, v0, Lp6/c0;->G:I

    invoke-virtual {v3, v2, p3, p2, v0}, Ly6/f;->a(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    goto/16 :goto_8

    :cond_3
    move-object p2, v2

    :goto_3
    move-object v2, p2

    :cond_4
    invoke-static {v2, p1}, Lp6/t;->b(Landroid/content/Context;Lp6/b;)V

    goto/16 :goto_9

    :catchall_1
    move-exception v2

    move-object v6, v2

    move-object v2, p1

    move p1, p2

    move-object p2, p3

    move-object p3, v6

    goto :goto_4

    :catch_1
    move-object v2, p1

    move-object p1, p3

    goto :goto_7

    :goto_4
    :try_start_2
    const-string v3, "GlanceAppWidget"

    const-string v4, "Error in user-provided deletion callback"

    invoke-static {v3, v4, p3}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    invoke-virtual {p0}, Lp6/g0;->h()Ly6/g;

    move-result-object p3

    if-eqz p3, :cond_6

    sget-object v3, Ly6/f;->a:Ly6/f;

    invoke-static {p1}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p2, v0, Lp6/c0;->x:Lp6/b;

    const/4 v4, 0x5

    iput v4, v0, Lp6/c0;->G:I

    invoke-virtual {v3, v2, p3, p1, v0}, Ly6/f;->a(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_8

    :cond_5
    move-object p1, p2

    move-object p2, v2

    :goto_5
    move-object v2, p2

    move-object p2, p1

    :cond_6
    invoke-static {v2, p2}, Lp6/t;->b(Landroid/content/Context;Lp6/b;)V

    goto :goto_9

    :catchall_2
    move-exception p3

    invoke-virtual {p0}, Lp6/g0;->h()Ly6/g;

    move-result-object v3

    if-eqz v3, :cond_8

    sget-object v4, Ly6/f;->a:Ly6/f;

    invoke-static {p1}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object p1

    iput-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p2, v0, Lp6/c0;->x:Lp6/b;

    iput-object p3, v0, Lp6/c0;->y:Ljava/lang/Throwable;

    const/4 v5, 0x6

    iput v5, v0, Lp6/c0;->G:I

    invoke-virtual {v4, v2, v3, p1, v0}, Ly6/f;->a(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_8

    :cond_7
    move-object p1, p3

    move-object v0, v2

    :goto_6
    move-object p3, p1

    move-object v2, v0

    :cond_8
    invoke-static {v2, p2}, Lp6/t;->b(Landroid/content/Context;Lp6/b;)V

    throw p3

    :goto_7
    invoke-virtual {p0}, Lp6/g0;->h()Ly6/g;

    move-result-object p3

    if-eqz p3, :cond_4

    sget-object v3, Ly6/f;->a:Ly6/f;

    invoke-static {p2}, Lvd/e;->l(I)Ljava/lang/String;

    move-result-object p2

    iput-object v2, v0, Lp6/c0;->w:Landroid/content/Context;

    iput-object p1, v0, Lp6/c0;->x:Lp6/b;

    const/4 v4, 0x4

    iput v4, v0, Lp6/c0;->G:I

    invoke-virtual {v3, v2, p3, p2, v0}, Ly6/f;->a(Landroid/content/Context;Ly6/g;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_8
    return-object v1

    :cond_9
    move-object p2, v2

    goto :goto_3

    :goto_9
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public c(Landroid/content/Context;)Lp6/t0;
    .locals 0

    const/4 p1, 0x0

    return-object p1
.end method

.method public d()I
    .locals 1

    iget v0, p0, Lp6/g0;->w:I

    return v0
.end method

.method public final e(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;Lc93/n;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroid/content/Context;",
            "Lp6/b;",
            "Landroid/os/Bundle;",
            "Lc93/n;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Lp6/g0;->f(Landroid/content/Context;)Lx6/f;

    move-result-object v0

    new-instance v1, Lp6/d0;

    const/4 v7, 0x0

    move-object v4, p0

    move-object v2, p1

    move-object v3, p2

    move-object v5, p3

    move-object v6, p4

    invoke-direct/range {v1 .. v7}, Lp6/d0;-><init>(Landroid/content/Context;Lp6/b;Lp6/g0;Landroid/os/Bundle;Lc93/n;Lq83/d;)V

    check-cast v0, Lx6/l;

    invoke-virtual {v0, v1, p5}, Lx6/l;->a(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public f(Landroid/content/Context;)Lx6/f;
    .locals 0

    invoke-static {}, Lx6/m;->a()Lx6/l;

    move-result-object p1

    return-object p1
.end method

.method public g()Lp6/u1;
    .locals 1

    iget-object v0, p0, Lp6/g0;->x:Lp6/u1;

    return-object v0
.end method

.method public abstract h()Ly6/g;
.end method

.method public i(Landroid/content/Context;Ln6/l;ILjava/lang/Throwable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    invoke-virtual {p0}, Lp6/g0;->d()I

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Landroid/widget/RemoteViews;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0}, Lp6/g0;->d()I

    move-result v0

    invoke-direct {p2, p4, v0}, Landroid/widget/RemoteViews;-><init>(Ljava/lang/String;I)V

    invoke-static {p1}, Landroid/appwidget/AppWidgetManager;->getInstance(Landroid/content/Context;)Landroid/appwidget/AppWidgetManager;

    move-result-object p1

    invoke-virtual {p1, p3, p2}, Landroid/appwidget/AppWidgetManager;->updateAppWidget(ILandroid/widget/RemoteViews;)V

    return-void

    :cond_0
    throw p4
.end method

.method public j(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln6/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {p0, p1, p2, p3}, Lp6/g0;->k(Lp6/g0;Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public abstract l(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
.end method

.method public final m(Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Landroid/os/Bundle;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Lp6/g0;->g()Lp6/u1;

    move-result-object v0

    instance-of v0, v0, Lp6/t1;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-nez v0, :cond_1

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1f

    if-le v0, v2, :cond_0

    invoke-virtual {p0}, Lp6/g0;->g()Lp6/u1;

    move-result-object v0

    instance-of v0, v0, Lp6/s1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v4, Lp6/b;

    invoke-direct {v4, p2}, Lp6/b;-><init>(I)V

    new-instance v6, Lp6/e0;

    const/4 p2, 0x0

    const/4 v0, 0x0

    invoke-direct {v6, p3, p2, v0}, Lp6/e0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    move-object v2, p0

    move-object v3, p1

    move-object v5, p3

    move-object v7, p4

    invoke-virtual/range {v2 .. v7}, Lp6/g0;->e(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    :goto_0
    return-object v1
.end method

.method public final n(Landroid/content/Context;ILjava/lang/String;Landroid/os/Bundle;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Ljava/lang/String;",
            "Landroid/os/Bundle;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v2, Lp6/b;

    invoke-direct {v2, p2}, Lp6/b;-><init>(I)V

    new-instance v4, Lp6/e0;

    const/4 p2, 0x0

    const/4 v0, 0x1

    invoke-direct {v4, p3, p2, v0}, Lp6/e0;-><init>(Ljava/lang/Object;Lq83/d;I)V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lp6/g0;->e(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final p(Landroid/content/Context;Ln6/l;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ln6/l;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lp6/b;

    if-eqz v0, :cond_1

    check-cast p2, Lp6/b;

    invoke-static {p2}, Lvd/e;->J(Lp6/b;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p2}, Lp6/b;->a()I

    move-result v3

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p3

    invoke-static/range {v1 .. v7}, Lp6/g0;->r(Lp6/g0;Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Invalid Glance ID"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final q(Landroid/content/Context;ILandroid/os/Bundle;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "I",
            "Landroid/os/Bundle;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-static {}, Lp6/w1;->a()V

    new-instance v2, Lp6/b;

    invoke-direct {v2, p2}, Lp6/b;-><init>(I)V

    new-instance v4, Lp6/f0;

    invoke-direct {v4}, Lp6/f0;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lp6/g0;->e(Landroid/content/Context;Lp6/b;Landroid/os/Bundle;Lc93/n;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
