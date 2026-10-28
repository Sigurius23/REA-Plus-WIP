.class public final Lwz/l1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ln20/d;

.field public final b:Lec3/h2;

.field public final c:Ln53/e;


# direct methods
.method public constructor <init>(Ln20/d;)V
    .locals 2

    const-string v0, "linkComponentFactory"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lwz/l1;->a:Ln20/d;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lwz/l1;->b:Lec3/h2;

    new-instance v0, Lwo1/e0;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lwo1/e0;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->y(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    new-instance v0, Lwz/h1;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lwz/h1;-><init>(I)V

    invoke-static {p1, v0}, Lbi/g;->M(Lec3/f2;Lkotlin/jvm/functions/Function1;)Ln53/e;

    move-result-object p1

    iput-object p1, p0, Lwz/l1;->c:Ln53/e;

    return-void
.end method


# virtual methods
.method public final a(Lwz/g0;Ly00/d5;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lwz/i1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwz/i1;

    iget v1, v0, Lwz/i1;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/i1;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/i1;

    invoke-direct {v0, p0, p3}, Lwz/i1;-><init>(Lwz/l1;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lwz/i1;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/i1;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lwz/i1;->x:Lxz/x;

    iget-object p2, v0, Lwz/i1;->w:Lwz/g0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p3, p3, Ll83/n;->w:Ljava/lang/Object;

    move-object v5, p3

    move-object p3, p1

    move-object p1, p2

    move-object p2, v5

    goto :goto_1

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object p3

    invoke-virtual {p3}, Ln20/e;->a()Lxz/x;

    move-result-object p3

    iput-object p1, v0, Lwz/i1;->w:Lwz/g0;

    iput-object p3, v0, Lwz/i1;->x:Lxz/x;

    iput v4, v0, Lwz/i1;->E:I

    invoke-virtual {p3, p2, v0}, Lxz/x;->c(Ly00/d5;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    instance-of v2, p2, Ll83/m;

    if-nez v2, :cond_7

    :try_start_1
    check-cast p2, Lwz/o0;

    iget-boolean p1, p1, Lwz/g0;->H:Z

    if-eqz p1, :cond_6

    const/4 p1, 0x0

    iput-object p1, v0, Lwz/i1;->w:Lwz/g0;

    iput-object p1, v0, Lwz/i1;->x:Lxz/x;

    iput v3, v0, Lwz/i1;->E:I

    invoke-virtual {p3, p2, v0}, Lxz/x;->r(Lwz/o0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Lwz/q0;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    return-object p1

    :cond_6
    return-object p2

    :goto_4
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    return-object p1

    :cond_7
    return-object p2
.end method

.method public final b(Lwz/g0;)Ln20/e;
    .locals 4

    iget-object v0, p0, Lwz/l1;->b:Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln20/e;

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    iget v3, v1, Ln20/e;->a:I

    packed-switch v3, :pswitch_data_0

    iget-object v3, v1, Ln20/e;->b:Lwz/g0;

    goto :goto_0

    :pswitch_0
    iget-object v3, v1, Ln20/e;->b:Lwz/g0;

    goto :goto_0

    :pswitch_1
    iget-object v3, v1, Ln20/e;->b:Lwz/g0;

    goto :goto_0

    :pswitch_2
    iget-object v3, v1, Ln20/e;->b:Lwz/g0;

    :goto_0
    invoke-static {v3, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    move-object v1, v2

    :goto_1
    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    return-object v1

    :cond_2
    :goto_2
    iget-object v1, p0, Lwz/l1;->a:Ln20/d;

    iget v3, v1, Ln20/d;->a:I

    packed-switch v3, :pswitch_data_1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ln20/e;

    iget-object v1, v1, Ln20/d;->b:Ljava/lang/Object;

    check-cast v1, Lt10/b;

    invoke-direct {v3, v1, p1}, Ln20/e;-><init>(Lt10/b;Lwz/g0;)V

    goto :goto_3

    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ln20/e;

    iget-object v1, v1, Ln20/d;->b:Ljava/lang/Object;

    check-cast v1, Lp20/h;

    invoke-direct {v3, v1, p1}, Ln20/e;-><init>(Lp20/h;Lwz/g0;)V

    goto :goto_3

    :pswitch_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ln20/e;

    iget-object v1, v1, Ln20/d;->b:Ljava/lang/Object;

    check-cast v1, Lp20/f;

    invoke-direct {v3, v1, p1}, Ln20/e;-><init>(Lp20/f;Lwz/g0;)V

    goto :goto_3

    :pswitch_5
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v3, Ln20/e;

    iget-object v1, v1, Ln20/d;->b:Ljava/lang/Object;

    check-cast v1, Ln20/b;

    invoke-direct {v3, v1, p1}, Ln20/e;-><init>(Ln20/b;Lwz/g0;)V

    :goto_3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v2, v3}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-object v3

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch
.end method

.method public final c(Lwz/g0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lwz/j1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lwz/j1;

    iget v1, v0, Lwz/j1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/j1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/j1;

    invoke-direct {v0, p0, p2}, Lwz/j1;-><init>(Lwz/l1;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lwz/j1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/j1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object p1

    invoke-virtual {p1}, Ln20/e;->a()Lxz/x;

    move-result-object p1

    iput v3, v0, Lwz/j1;->y:I

    invoke-virtual {p1, v0}, Lxz/x;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    return-object p1
.end method

.method public final d(Lwz/g0;Lj00/i0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lwz/k1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lwz/k1;

    iget v1, v0, Lwz/k1;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lwz/k1;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lwz/k1;

    invoke-direct {v0, p0, p3}, Lwz/k1;-><init>(Lwz/l1;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lwz/k1;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lwz/k1;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p3, Ll83/n;

    iget-object p1, p3, Ll83/n;->w:Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Lwz/l1;->b(Lwz/g0;)Ln20/e;

    move-result-object p1

    invoke-virtual {p1}, Ln20/e;->a()Lxz/x;

    move-result-object p1

    iput v3, v0, Lwz/k1;->y:I

    invoke-virtual {p1, p2, v0}, Lxz/x;->t(Lj00/i0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    instance-of p2, p1, Ll83/m;

    if-nez p2, :cond_4

    check-cast p1, Ld00/l;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    :cond_4
    return-object p1
.end method
