.class public final Llk/g;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lik/b;

.field public final b:Lgj/d;

.field public final c:Lfk/a;

.field public final d:Lgj/g;

.field public final e:Lmk/a;

.field public final f:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public g:Ljava/lang/String;

.field public h:Ljava/lang/String;

.field public final i:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public final j:Llk/c;


# direct methods
.method public constructor <init>(Lik/b;Lgj/d;Lfk/a;Lgj/g;Lmk/a;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llk/g;->a:Lik/b;

    iput-object p2, p0, Llk/g;->b:Lgj/d;

    iput-object p3, p0, Llk/g;->c:Lfk/a;

    iput-object p4, p0, Llk/g;->d:Lgj/g;

    iput-object p5, p0, Llk/g;->e:Lmk/a;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    const/4 p5, 0x0

    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Llk/g;->f:Ljava/util/concurrent/atomic/AtomicBoolean;

    new-instance p4, Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-direct {p4, p5}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    iput-object p4, p0, Llk/g;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    instance-of p4, p1, Ldk/f;

    if-eqz p4, :cond_0

    new-instance p4, La3/p;

    check-cast p1, Ldk/f;

    invoke-direct {p4, p1, p3, p2}, La3/p;-><init>(Ldk/f;Lfk/a;Lgj/d;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lnk/n;

    if-eqz p2, :cond_1

    new-instance p4, Lg73/a;

    check-cast p1, Lnk/n;

    invoke-direct {p4, p1}, Lg73/a;-><init>(Lnk/n;)V

    goto :goto_0

    :cond_1
    const-string p1, "Custom storage, identify intercept not started"

    invoke-interface {p3, p1}, Lfk/a;->warn(Ljava/lang/String;)V

    const/4 p4, 0x0

    :goto_0
    iput-object p4, p0, Llk/g;->j:Llk/c;

    return-void
.end method


# virtual methods
.method public final a(Ljk/a;Ls83/c;)Ljava/lang/Object;
    .locals 11

    instance-of v0, p2, Llk/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llk/d;

    iget v1, v0, Llk/d;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llk/d;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Llk/d;

    invoke-direct {v0, p0, p2}, Llk/d;-><init>(Llk/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Llk/d;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llk/d;->E:I

    const/4 v3, 0x0

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v8, :cond_4

    if-eq v2, v7, :cond_3

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_2

    :cond_1
    iget-object p1, v0, Llk/d;->w:Ljava/lang/Object;

    check-cast p1, Ljk/a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    iget-object p1, v0, Llk/d;->w:Ljava/lang/Object;

    check-cast p1, Llk/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_4
    iget-object p1, v0, Llk/d;->x:Ljk/a;

    iget-object v2, v0, Llk/d;->w:Ljava/lang/Object;

    check-cast v2, Llk/g;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :cond_5
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Llk/g;->j:Llk/c;

    if-nez p2, :cond_6

    return-object p1

    :cond_6
    iget-object p2, p0, Llk/g;->i:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {p2, v8}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    move-result p2

    if-nez p2, :cond_7

    iget-object p2, p1, Ljk/a;->a:Ljava/lang/String;

    iput-object p2, p0, Llk/g;->g:Ljava/lang/String;

    iget-object p2, p1, Ljk/a;->b:Ljava/lang/String;

    iput-object p2, p0, Llk/g;->h:Ljava/lang/String;

    :goto_1
    move p2, v8

    goto :goto_6

    :cond_7
    iget-object p2, p0, Llk/g;->g:Ljava/lang/String;

    iget-object v2, p1, Ljk/a;->a:Ljava/lang/String;

    if-nez p2, :cond_8

    if-nez v2, :cond_8

    goto :goto_2

    :cond_8
    if-eqz p2, :cond_b

    if-nez v2, :cond_9

    goto :goto_3

    :cond_9
    invoke-virtual {p2, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_a

    goto :goto_3

    :cond_a
    :goto_2
    move p2, v3

    goto :goto_4

    :cond_b
    :goto_3
    iget-object p2, p1, Ljk/a;->a:Ljava/lang/String;

    iput-object p2, p0, Llk/g;->g:Ljava/lang/String;

    move p2, v8

    :goto_4
    iget-object v2, p0, Llk/g;->h:Ljava/lang/String;

    iget-object v10, p1, Ljk/a;->b:Ljava/lang/String;

    if-nez v2, :cond_c

    if-nez v10, :cond_c

    goto :goto_6

    :cond_c
    if-eqz v2, :cond_e

    if-nez v10, :cond_d

    goto :goto_5

    :cond_d
    invoke-virtual {v2, v10}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    :goto_5
    iget-object p2, p1, Ljk/a;->b:Ljava/lang/String;

    iput-object p2, p0, Llk/g;->h:Ljava/lang/String;

    goto :goto_1

    :cond_f
    :goto_6
    if-eqz p2, :cond_10

    iput-object p0, v0, Llk/d;->w:Ljava/lang/Object;

    iput-object p1, v0, Llk/d;->x:Ljk/a;

    iput v8, v0, Llk/d;->E:I

    invoke-virtual {p0, v0}, Llk/g;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_10

    goto/16 :goto_c

    :cond_10
    move-object v2, p0

    :goto_7
    invoke-virtual {p1}, Ljk/a;->a()Ljava/lang/String;

    move-result-object p2

    const-string v10, "$identify"

    invoke-static {p2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    if-eqz p2, :cond_11

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v10

    if-ne v10, v8, :cond_11

    invoke-static {v8}, Ljh3/c;->a(I)Ljava/lang/String;

    move-result-object v10

    invoke-interface {p2, v10}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_11

    move p2, v8

    goto :goto_8

    :cond_11
    move p2, v3

    :goto_8
    if-eqz p2, :cond_14

    iget-object p2, p1, Ljk/a;->P:Ljava/util/LinkedHashMap;

    if-eqz p2, :cond_12

    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_12

    goto :goto_a

    :cond_12
    iput-object v2, v0, Llk/d;->w:Ljava/lang/Object;

    iput-object v9, v0, Llk/d;->x:Ljk/a;

    iput v7, v0, Llk/d;->E:I

    invoke-virtual {v2, p1, v0}, Llk/g;->b(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_13

    goto :goto_c

    :cond_13
    move-object p1, v2

    :goto_9
    iget-object p2, p1, Llk/g;->b:Lgj/d;

    iget-object v0, p2, Lgj/d;->c:Lbc3/c0;

    iget-object p2, p2, Lgj/d;->f:Lbc3/z;

    new-instance v1, Landroidx/room/z1;

    const/16 v2, 0x9

    invoke-direct {v1, p1, v9, v2}, Landroidx/room/z1;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, p2, v9, v1, v7}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-object v9

    :cond_14
    :goto_a
    iget-object p2, p1, Ljk/a;->O:Ljava/util/LinkedHashMap;

    if-eqz p2, :cond_15

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v7

    if-ne v7, v8, :cond_15

    invoke-static {v4}, Ljh3/c;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {p2, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_15

    move v3, v8

    :cond_15
    if-eqz v3, :cond_17

    iput-object p1, v0, Llk/d;->w:Ljava/lang/Object;

    iput-object v9, v0, Llk/d;->x:Ljk/a;

    iput v6, v0, Llk/d;->E:I

    iget-object p2, v2, Llk/g;->j:Llk/c;

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p2, v0}, Llk/c;->j(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_16

    goto :goto_b

    :cond_16
    sget-object p2, Ll83/a0;->a:Ll83/a0;

    :goto_b
    if-ne p2, v1, :cond_1a

    goto :goto_c

    :cond_17
    iput-object p1, v0, Llk/d;->w:Ljava/lang/Object;

    iput-object v9, v0, Llk/d;->x:Ljk/a;

    iput v5, v0, Llk/d;->E:I

    invoke-virtual {v2, v0}, Llk/g;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1a

    goto :goto_c

    :cond_18
    const-string v3, "$groupidentify"

    invoke-static {p2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_19

    goto :goto_d

    :cond_19
    iput-object p1, v0, Llk/d;->w:Ljava/lang/Object;

    iput-object v9, v0, Llk/d;->x:Ljk/a;

    iput v4, v0, Llk/d;->E:I

    invoke-virtual {v2, v0}, Llk/g;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_1a

    :goto_c
    return-object v1

    :cond_1a
    :goto_d
    return-object p1
.end method

.method public final b(Ljk/a;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Llk/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llk/e;

    iget v1, v0, Llk/e;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llk/e;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llk/e;

    invoke-direct {v0, p0, p2}, Llk/e;-><init>(Llk/g;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Llk/e;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llk/e;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llk/e;->w:Llk/g;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception p2

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p2, p0, Llk/g;->a:Lik/b;

    iput-object p0, v0, Llk/e;->w:Llk/g;

    iput v3, v0, Llk/e;->z:I

    invoke-interface {p2, p1, v0}, Lik/b;->e(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_3

    return-object v1

    :catch_1
    move-exception p2

    move-object p1, p0

    :goto_1
    iget-object p1, p1, Llk/g;->c:Lfk/a;

    const-string v0, "Error when intercepting identifies"

    invoke-static {p2, p1, v0}, Lio/sentry/config/a;->P(Ljava/lang/Exception;Lfk/a;Ljava/lang/String;)V

    :cond_3
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final c(Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Llk/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Llk/f;

    iget v1, v0, Llk/f;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llk/f;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llk/f;

    invoke-direct {v0, p0, p1}, Llk/f;-><init>(Llk/g;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Llk/f;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llk/f;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Llk/f;->w:Llk/g;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Llk/f;->w:Llk/g;

    iput v3, v0, Llk/f;->z:I

    iget-object p1, p0, Llk/g;->j:Llk/c;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {p1, v0}, Llk/c;->n(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    move-object v0, p0

    :goto_1
    check-cast p1, Ljk/a;

    if-eqz p1, :cond_5

    iget-object v0, v0, Llk/g;->e:Lmk/a;

    iget-object v0, v0, Lmk/a;->z:Lkk/b;

    if-eqz v0, :cond_4

    invoke-virtual {v0, p1}, Lkk/b;->a(Ljk/a;)V

    goto :goto_2

    :cond_4
    const-string p1, "pipeline"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
