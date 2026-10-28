.class public final Lkk/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public w:Ldc3/c;

.field public x:I

.field public y:I

.field public final synthetic z:Lkk/b;


# direct methods
.method public constructor <init>(Lkk/b;Lq83/d;)V
    .locals 0

    iput-object p1, p0, Lkk/a;->z:Lkk/b;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1

    new-instance p1, Lkk/a;

    iget-object v0, p0, Lkk/a;->z:Lkk/b;

    invoke-direct {p1, v0, p2}, Lkk/a;-><init>(Lkk/b;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lkk/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lkk/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lkk/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Lkk/a;->z:Lkk/b;

    iget-object v1, v0, Lkk/b;->b:Ljava/util/concurrent/atomic/AtomicInteger;

    iget-object v2, v0, Lkk/b;->a:Lgj/d;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, p0, Lkk/a;->y:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_2

    if-eq v4, v7, :cond_1

    if-ne v4, v6, :cond_0

    iget v4, p0, Lkk/a;->x:I

    iget-object v8, p0, Lkk/a;->w:Ldc3/c;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v4, p0, Lkk/a;->w:Ldc3/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v8, v4

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v0, Lkk/b;->g:Ldc3/l;

    invoke-interface {p1}, Ldc3/w;->iterator()Ldc3/c;

    move-result-object p1

    :goto_0
    iput-object p1, p0, Lkk/a;->w:Ldc3/c;

    iput v7, p0, Lkk/a;->y:I

    invoke-virtual {p1, p0}, Ldc3/c;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_3

    goto :goto_3

    :cond_3
    move-object v8, p1

    move-object p1, v4

    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_b

    invoke-virtual {v8}, Ldc3/c;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkk/f;

    iget v4, p1, Lkk/f;->a:I

    if-ne v4, v6, :cond_4

    move v4, v7

    goto :goto_2

    :cond_4
    move v4, v5

    :goto_2
    if-nez v4, :cond_5

    iget-object p1, p1, Lkk/f;->b:Ljk/a;

    if-eqz p1, :cond_5

    :try_start_1
    iget-object v9, v0, Lkk/b;->e:Lik/b;

    iput-object v8, p0, Lkk/a;->w:Ldc3/c;

    iput v4, p0, Lkk/a;->x:I

    iput v6, p0, Lkk/a;->y:I

    invoke-interface {v9, p1, p0}, Lik/b;->e(Ljk/a;Ls83/c;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v3, :cond_5

    :goto_3
    return-object v3

    :cond_5
    :goto_4
    move-object p1, v8

    goto :goto_6

    :goto_5
    iget-object v9, v2, Lgj/d;->k:Lfk/a;

    const-string v10, "Error when writing event to pipeline"

    invoke-static {p1, v9, v10}, Lio/sentry/config/a;->P(Ljava/lang/Exception;Lfk/a;Ljava/lang/String;)V

    goto :goto_4

    :goto_6
    iget-object v8, v2, Lgj/d;->a:Lgj/g;

    iget-object v8, v8, Lgj/g;->p:Ljava/lang/Boolean;

    sget-object v9, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    goto :goto_0

    :cond_6
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicInteger;->incrementAndGet()I

    move-result v8

    iget-object v9, v2, Lgj/d;->a:Lgj/g;

    iget v9, v9, Lgj/g;->c:I

    iget-object v10, v0, Lkk/b;->k:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {v10}, Ljava/util/concurrent/atomic/AtomicInteger;->get()I

    move-result v10

    div-int/2addr v9, v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v11, 0x0

    if-nez v9, :cond_7

    move-object v10, v11

    :cond_7
    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v9

    goto :goto_7

    :cond_8
    move v9, v7

    :goto_7
    if-ge v8, v9, :cond_a

    if-eqz v4, :cond_9

    goto :goto_8

    :cond_9
    iget-object v4, v0, Lkk/b;->f:Lbc3/c0;

    iget-object v8, v2, Lgj/d;->f:Lbc3/z;

    new-instance v9, La6/c;

    const/16 v10, 0x17

    invoke-direct {v9, v0, v11, v10}, La6/c;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v4, v8, v11, v9, v6}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto/16 :goto_0

    :cond_a
    :goto_8
    invoke-virtual {v1, v5}, Ljava/util/concurrent/atomic/AtomicInteger;->set(I)V

    iget-object v4, v0, Lkk/b;->h:Ldc3/l;

    const-string v8, "#!upload"

    invoke-interface {v4, v8}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    goto/16 :goto_0

    :cond_b
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
