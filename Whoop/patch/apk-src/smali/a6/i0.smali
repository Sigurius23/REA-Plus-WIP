.class public final La6/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La6/g;


# instance fields
.field public final a:La6/f1;

.field public final b:Lbc3/c0;

.field public final c:Lec3/s1;

.field public final d:Lmc3/c;

.field public e:I

.field public f:Lbc3/c2;

.field public final g:Lbu/c;

.field public final h:Lzt/q;

.field public final i:Ll83/p;

.field public final j:Ll83/p;

.field public final k:Lzt/q;


# direct methods
.method public constructor <init>(La6/f1;Ljava/util/List;Lio/sentry/hints/j;Lbc3/c0;)V
    .locals 3

    const-string p3, "scope"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, La6/i0;->a:La6/f1;

    iput-object p4, p0, La6/i0;->b:Lbc3/c0;

    new-instance p1, La6/v;

    const/4 p3, 0x0

    const/4 v0, 0x0

    invoke-direct {p1, p0, v0, p3}, La6/v;-><init>(Ljava/lang/Object;Lq83/d;I)V

    new-instance p3, Lec3/s1;

    invoke-direct {p3, p1}, Lec3/s1;-><init>(Lc93/m;)V

    iput-object p3, p0, La6/i0;->c:Lec3/s1;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, La6/i0;->d:Lmc3/c;

    new-instance p1, Lbu/c;

    const/4 p3, 0x1

    invoke-direct {p1, p3}, Lbu/c;-><init>(I)V

    iput-object p1, p0, La6/i0;->g:Lbu/c;

    new-instance p1, Lzt/q;

    invoke-direct {p1, p0, p2}, Lzt/q;-><init>(La6/i0;Ljava/util/List;)V

    iput-object p1, p0, La6/i0;->h:Lzt/q;

    new-instance p1, La6/h;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, La6/h;-><init>(La6/i0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La6/i0;->i:Ll83/p;

    new-instance p1, La6/h;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, La6/h;-><init>(La6/i0;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, La6/i0;->j:Ll83/p;

    new-instance p1, Lzt/q;

    new-instance p2, La6/i;

    const/4 p3, 0x0

    invoke-direct {p2, p0, p3}, La6/i;-><init>(Ljava/lang/Object;I)V

    new-instance p3, La6/j;

    const/4 v1, 0x0

    invoke-direct {p3, v1}, La6/j;-><init>(I)V

    new-instance v1, La6/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v0, v2}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-direct {p1, p4, p2, p3, v1}, Lzt/q;-><init>(Lbc3/c0;La6/i;La6/j;La6/c;)V

    iput-object p1, p0, La6/i0;->k:Lzt/q;

    return-void
.end method

.method public static final b(La6/i0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, La6/w;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La6/w;

    iget v1, v0, La6/w;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/w;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/w;

    invoke-direct {v0, p0, p1}, La6/w;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, La6/w;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/w;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, La6/w;->w:Lmc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/i0;->d:Lmc3/c;

    iput-object p1, v0, La6/w;->w:Lmc3/c;

    iput v3, v0, La6/w;->z:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget v1, p0, La6/i0;->e:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, La6/i0;->e:I

    if-nez v1, :cond_5

    iget-object v1, p0, La6/i0;->f:Lbc3/c2;

    if-eqz v1, :cond_4

    invoke-virtual {v1, p1}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_4
    :goto_2
    iput-object p1, p0, La6/i0;->f:Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_5
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_3
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final c(La6/i0;La6/t0;Ls83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, La6/x;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/x;

    iget v1, v0, La6/x;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/x;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/x;

    invoke-direct {v0, p0, p2}, La6/x;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La6/x;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/x;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, La6/x;->w:Lbc3/t;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p1, La6/t0;->b:Lbc3/t;

    :try_start_1
    iget-object v2, p1, La6/t0;->d:Lq83/j;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    invoke-interface {v2, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v2

    new-instance v4, La6/c;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct {v4, p0, p1, v5, v6}, La6/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p2, v0, La6/x;->w:Lbc3/t;

    iput v3, v0, La6/x;->z:I

    invoke-static {v2, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v7, p2

    move-object p2, p0

    move-object p0, v7

    goto :goto_2

    :catchall_1
    move-exception p1

    move-object p0, p2

    :goto_1
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :goto_2
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p1

    if-nez p1, :cond_4

    invoke-virtual {p0, p2}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_4
    invoke-virtual {p0, p1}, Lbc3/t;->completeExceptionally(Ljava/lang/Throwable;)Z

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(La6/i0;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, La6/y;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La6/y;

    iget v1, v0, La6/y;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/y;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/y;

    invoke-direct {v0, p0, p1}, La6/y;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, La6/y;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/y;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, La6/y;->w:Lmc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, La6/i0;->d:Lmc3/c;

    iput-object p1, v0, La6/y;->w:Lmc3/c;

    iput v3, v0, La6/y;->z:I

    invoke-virtual {p1, v0}, Lmc3/c;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p1

    :goto_1
    const/4 p1, 0x0

    :try_start_0
    iget v1, p0, La6/i0;->e:I

    add-int/2addr v1, v3

    iput v1, p0, La6/i0;->e:I

    if-ne v1, v3, :cond_4

    iget-object v1, p0, La6/i0;->b:Lbc3/c0;

    new-instance v2, La6/o;

    const/4 v3, 0x1

    invoke-direct {v2, p0, p1, v3}, La6/o;-><init>(La6/i0;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v1, p1, p1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, p0, La6/i0;->f:Lbc3/c2;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_4
    :goto_2
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :goto_3
    invoke-interface {v0, p1}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p0
.end method

.method public static final e(La6/i0;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p1, La6/a0;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, La6/a0;

    iget v1, v0, La6/a0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/a0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/a0;

    invoke-direct {v0, p0, p1}, La6/a0;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p1, v0, La6/a0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/a0;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget v0, v0, La6/a0;->w:I

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p1

    iput v4, v0, La6/a0;->z:I

    invoke-virtual {p1}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    :try_start_1
    iget-object v2, p0, La6/i0;->h:Lzt/q;

    iput p1, v0, La6/a0;->w:I

    iput v3, v0, La6/a0;->z:I

    invoke-virtual {v2, v0}, Lzt/q;->F(Ls83/c;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :catchall_1
    move-exception v0

    move-object v5, v0

    move v0, p1

    move-object p1, v5

    :goto_4
    iget-object p0, p0, La6/i0;->g:Lbu/c;

    new-instance v1, La6/v0;

    invoke-direct {v1, v0, p1}, La6/v0;-><init>(ILjava/lang/Throwable;)V

    invoke-virtual {p0, v1}, Lbu/c;->J(La6/e1;)V

    throw p1
.end method

.method public static final f(La6/i0;ZLq83/d;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, La6/i0;->g:Lbu/c;

    instance-of v1, p2, La6/b0;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, La6/b0;

    iget v2, v1, La6/b0;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, La6/b0;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, La6/b0;

    invoke-direct {v1, p0, p2}, La6/b0;-><init>(La6/i0;Lq83/d;)V

    :goto_0
    iget-object p2, v1, La6/b0;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, La6/b0;->E:I

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-boolean p1, v1, La6/b0;->w:Z

    iget-object v3, v1, La6/b0;->x:La6/e1;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lbu/c;->C()La6/e1;

    move-result-object v3

    instance-of p2, v3, La6/h1;

    if-nez p2, :cond_c

    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p2

    iput-object v3, v1, La6/b0;->x:La6/e1;

    iput-boolean p1, v1, La6/b0;->w:Z

    iput v6, v1, La6/b0;->E:I

    invoke-virtual {p2}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p2

    if-ne p2, v2, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    instance-of v6, v3, La6/b;

    if-eqz v6, :cond_6

    move-object v7, v3

    check-cast v7, La6/b;

    iget v7, v7, La6/e1;->a:I

    goto :goto_2

    :cond_6
    const/4 v7, -0x1

    :goto_2
    if-eqz v6, :cond_7

    if-ne p2, v7, :cond_7

    return-object v3

    :cond_7
    const/4 p2, 0x0

    if-eqz p1, :cond_9

    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p1

    new-instance v3, La33/c;

    invoke-direct {v3, p0, p2}, La33/c;-><init>(La6/i0;Lq83/d;)V

    iput-object p2, v1, La6/b0;->x:La6/e1;

    iput v5, v1, La6/b0;->E:I

    invoke-virtual {p1, v3, v1}, La6/d1;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_8

    goto :goto_4

    :cond_8
    :goto_3
    check-cast p2, Ll83/k;

    goto :goto_6

    :cond_9
    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p1

    new-instance v3, La6/c0;

    const/4 v5, 0x0

    invoke-direct {v3, p0, v7, p2, v5}, La6/c0;-><init>(La6/i0;ILq83/d;I)V

    iput-object p2, v1, La6/b0;->x:La6/e1;

    iput v4, v1, La6/b0;->E:I

    invoke-virtual {p1, v3, v1}, La6/d1;->c(Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_a

    :goto_4
    return-object v2

    :cond_a
    :goto_5
    check-cast p2, Ll83/k;

    :goto_6
    iget-object p0, p2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p0, La6/e1;

    iget-object p1, p2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v0, p0}, Lbu/c;->J(La6/e1;)V

    :cond_b
    return-object p0

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "This is a bug in DataStore. Please file a bug at: https://issuetracker.google.com/issues/new?component=907884&template=1466542"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final g(La6/i0;ZLs83/c;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, La6/d0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, La6/d0;

    iget v1, v0, La6/d0;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/d0;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/d0;

    invoke-direct {v0, p0, p2}, La6/d0;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p2, v0, La6/d0;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/d0;->H:I

    const/4 v3, 0x0

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :pswitch_0
    iget-object p0, v0, La6/d0;->z:Ljava/io/Serializable;

    check-cast p0, Lkotlin/jvm/internal/e0;

    iget-object p1, v0, La6/d0;->y:Lkotlin/jvm/internal/g0;

    iget-object v0, v0, La6/d0;->x:Ljava/lang/Object;

    check-cast v0, Landroidx/datastore/core/CorruptionException;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p0

    goto :goto_4

    :pswitch_1
    iget-boolean p1, v0, La6/d0;->w:Z

    iget-object v2, v0, La6/d0;->z:Ljava/io/Serializable;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v5, v0, La6/d0;->y:Lkotlin/jvm/internal/g0;

    iget-object v6, v0, La6/d0;->x:Ljava/lang/Object;

    check-cast v6, Landroidx/datastore/core/CorruptionException;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p2, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance p2, Lkotlin/jvm/internal/e0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    :try_start_1
    new-instance v2, La6/e0;

    invoke-direct {v2, v5, p0, p2, v4}, La6/e0;-><init>(Lkotlin/jvm/internal/g0;La6/i0;Lkotlin/jvm/internal/e0;Lq83/d;)V

    iput-object v6, v0, La6/d0;->x:Ljava/lang/Object;

    iput-object v5, v0, La6/d0;->y:Lkotlin/jvm/internal/g0;

    iput-object p2, v0, La6/d0;->z:Ljava/io/Serializable;

    const/4 v7, 0x6

    iput v7, v0, La6/d0;->H:I

    if-eqz p1, :cond_1

    invoke-virtual {v2, v0}, La6/e0;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p0

    new-instance p1, La6/e;

    const/4 v7, 0x1

    invoke-direct {p1, v2, v4, v7}, La6/e;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p0, p1, v0}, La6/d1;->b(Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :goto_1
    if-ne p0, v1, :cond_2

    goto/16 :goto_8

    :cond_2
    move-object p0, p2

    move-object p1, v5

    :goto_2
    new-instance p2, La6/b;

    iget-object p1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :cond_3
    iget p0, p0, Lkotlin/jvm/internal/e0;->w:I

    invoke-direct {p2, p1, v3, p0}, La6/b;-><init>(Ljava/lang/Object;II)V

    return-object p2

    :goto_3
    move-object v0, v6

    goto :goto_4

    :catchall_1
    move-exception p0

    goto :goto_3

    :goto_4
    invoke-static {v0, p0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    throw v0

    :pswitch_2
    iget-boolean p1, v0, La6/d0;->w:Z

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_2 .. :try_end_2} :catch_0

    goto/16 :goto_9

    :catch_0
    move-exception p0

    goto/16 :goto_a

    :pswitch_3
    iget-boolean p1, v0, La6/d0;->w:Z

    :try_start_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_3
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_3 .. :try_end_3} :catch_0

    goto :goto_7

    :pswitch_4
    iget p0, v0, La6/d0;->E:I

    iget-boolean p1, v0, La6/d0;->w:Z

    iget-object v1, v0, La6/d0;->x:Ljava/lang/Object;

    :try_start_4
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_4
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_6

    :pswitch_5
    iget-boolean p1, v0, La6/d0;->w:Z

    :try_start_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_5
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_5 .. :try_end_5} :catch_0

    goto :goto_5

    :pswitch_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-eqz p1, :cond_7

    :try_start_6
    iput-boolean p1, v0, La6/d0;->w:Z

    const/4 p2, 0x1

    iput p2, v0, La6/d0;->H:I

    invoke-virtual {p0, v0}, La6/i0;->i(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_8

    :cond_4
    :goto_5
    if-eqz p2, :cond_5

    invoke-virtual {p2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :cond_5
    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p0

    iput-object p2, v0, La6/d0;->x:Ljava/lang/Object;

    iput-boolean p1, v0, La6/d0;->w:Z

    iput v3, v0, La6/d0;->E:I

    const/4 v2, 0x2

    iput v2, v0, La6/d0;->H:I

    invoke-virtual {p0}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p0

    if-ne p0, v1, :cond_6

    goto :goto_8

    :cond_6
    move-object v1, p2

    move-object p2, p0

    move p0, v3

    :goto_6
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    new-instance v2, La6/b;

    invoke-direct {v2, v1, p0, p2}, La6/b;-><init>(Ljava/lang/Object;II)V

    return-object v2

    :cond_7
    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object p2

    iput-boolean p1, v0, La6/d0;->w:Z

    const/4 v2, 0x3

    iput v2, v0, La6/d0;->H:I

    invoke-virtual {p2}, La6/d1;->a()Ljava/lang/Integer;

    move-result-object p2

    if-ne p2, v1, :cond_8

    goto :goto_8

    :cond_8
    :goto_7
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    invoke-virtual {p0}, La6/i0;->h()La6/d1;

    move-result-object v2

    new-instance v3, La6/c0;

    const/4 v5, 0x1

    invoke-direct {v3, p0, p2, v4, v5}, La6/c0;-><init>(La6/i0;ILq83/d;I)V

    iput-boolean p1, v0, La6/d0;->w:Z

    const/4 p0, 0x4

    iput p0, v0, La6/d0;->H:I

    invoke-virtual {v2, v3, v0}, La6/d1;->c(Lc93/m;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    :goto_8
    return-object v1

    :cond_9
    :goto_9
    check-cast p2, La6/b;
    :try_end_6
    .catch Landroidx/datastore/core/CorruptionException; {:try_start_6 .. :try_end_6} :catch_0

    return-object p2

    :goto_a
    new-instance p2, Lkotlin/jvm/internal/g0;

    invoke-direct {p2}, Ljava/lang/Object;-><init>()V

    iput-object p0, v0, La6/d0;->x:Ljava/lang/Object;

    iput-object p2, v0, La6/d0;->y:Lkotlin/jvm/internal/g0;

    iput-object p2, v0, La6/d0;->z:Ljava/io/Serializable;

    iput-boolean p1, v0, La6/d0;->w:Z

    const/4 p1, 0x5

    iput p1, v0, La6/d0;->H:I

    throw p0

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


# virtual methods
.method public final a(Lc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 3

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    sget-object v1, La6/j1;->w:La6/j1;

    invoke-interface {v0, v1}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    check-cast v0, La6/k1;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, La6/k1;->a(La6/i0;)V

    :cond_0
    new-instance v1, La6/k1;

    invoke-direct {v1, v0, p0}, La6/k1;-><init>(La6/k1;La6/i0;)V

    new-instance v0, La6/v;

    const/4 v2, 0x0

    invoke-direct {v0, p0, p1, v2}, La6/v;-><init>(La6/i0;Lc93/m;Lq83/d;)V

    invoke-static {v1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final getData()Lec3/l;
    .locals 1

    iget-object v0, p0, La6/i0;->c:Lec3/s1;

    return-object v0
.end method

.method public final h()La6/d1;
    .locals 1

    iget-object v0, p0, La6/i0;->j:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/d1;

    return-object v0
.end method

.method public final i(Ls83/c;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, La6/i0;->i:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, La6/g1;

    new-instance v1, La6/r;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v1, v3, v2}, La6/r;-><init>(ILq83/d;)V

    invoke-interface {v0, v1, p1}, La6/g1;->b(La6/r;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/Object;ZLs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p3, La6/g0;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, La6/g0;

    iget v1, v0, La6/g0;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, La6/g0;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, La6/g0;

    invoke-direct {v0, p0, p3}, La6/g0;-><init>(La6/i0;Ls83/c;)V

    :goto_0
    iget-object p3, v0, La6/g0;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, La6/g0;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, La6/g0;->w:Lkotlin/jvm/internal/e0;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v5, Lkotlin/jvm/internal/e0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    iget-object p3, p0, La6/i0;->i:Ll83/p;

    invoke-virtual {p3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, La6/g1;

    new-instance v4, La6/h0;

    const/4 v9, 0x0

    move-object v6, p0

    move-object v7, p1

    move v8, p2

    invoke-direct/range {v4 .. v9}, La6/h0;-><init>(Lkotlin/jvm/internal/e0;La6/i0;Ljava/lang/Object;ZLq83/d;)V

    iput-object v5, v0, La6/g0;->w:Lkotlin/jvm/internal/e0;

    iput v3, v0, La6/g0;->z:I

    invoke-interface {p3, v4, v0}, La6/g1;->c(La6/h0;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object p1, v5

    :goto_1
    iget p1, p1, Lkotlin/jvm/internal/e0;->w:I

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, p1}, Ljava/lang/Integer;-><init>(I)V

    return-object p2
.end method
