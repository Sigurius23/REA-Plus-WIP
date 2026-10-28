.class public final Ld9/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;

.field public g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    iput-object p1, p0, Ld9/p;->b:Ljava/lang/Object;

    .line 19
    sget-object p1, Ld9/b;->c:Ld9/b;

    iput-object p1, p0, Ld9/p;->c:Ljava/lang/Object;

    .line 20
    sget-object p1, Ld9/y;->a:Ld9/y;

    iput-object p1, p0, Ld9/p;->e:Ljava/lang/Object;

    .line 21
    sget-object p1, Ld9/o;->a:Ld9/z;

    iput-object p1, p0, Ld9/p;->f:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Landroid/os/Looper;Llo/t;Llo/i;)V
    .locals 1

    .line 8
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>()V

    invoke-direct {p0, v0, p1, p2, p3}, Ld9/p;-><init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Llo/t;Llo/i;)V

    return-void
.end method

.method public constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;Landroid/os/Looper;Llo/t;Llo/i;)V
    .locals 0

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p3, p0, Ld9/p;->b:Ljava/lang/Object;

    .line 11
    iput-object p1, p0, Ld9/p;->e:Ljava/lang/Object;

    .line 12
    iput-object p4, p0, Ld9/p;->d:Ljava/lang/Object;

    .line 13
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ld9/p;->f:Ljava/lang/Object;

    .line 14
    new-instance p1, Ljava/util/ArrayDeque;

    invoke-direct {p1}, Ljava/util/ArrayDeque;-><init>()V

    iput-object p1, p0, Ld9/p;->g:Ljava/lang/Object;

    .line 15
    new-instance p1, Llo/g;

    const/4 p4, 0x0

    invoke-direct {p1, p0, p4}, Llo/g;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p3, p2, p1}, Llo/t;->a(Landroid/os/Looper;Landroid/os/Handler$Callback;)Llo/v;

    move-result-object p1

    .line 16
    iput-object p1, p0, Ld9/p;->c:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lty/c;Lwe/o;Lwe/g;[BLmf/d;)V
    .locals 1

    const-string v0, "signer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousSignature"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ld9/p;->b:Ljava/lang/Object;

    .line 3
    iput-object p2, p0, Ld9/p;->c:Ljava/lang/Object;

    .line 4
    iput-object p3, p0, Ld9/p;->d:Ljava/lang/Object;

    .line 5
    iput-object p4, p0, Ld9/p;->e:Ljava/lang/Object;

    .line 6
    iput-object p5, p0, Ld9/p;->f:Ljava/lang/Object;

    .line 7
    new-instance p1, Lyf/k;

    invoke-direct {p1}, Lyf/k;-><init>()V

    iput-object p1, p0, Ld9/p;->g:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a(Ls83/c;)Ljava/lang/Object;
    .locals 12

    iget-object v0, p0, Ld9/p;->b:Ljava/lang/Object;

    check-cast v0, Lty/c;

    iget-object v1, p0, Ld9/p;->g:Ljava/lang/Object;

    check-cast v1, Lyf/k;

    instance-of v2, p1, Lxe/a;

    if-eqz v2, :cond_0

    move-object v2, p1

    check-cast v2, Lxe/a;

    iget v3, v2, Lxe/a;->y:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxe/a;->y:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxe/a;

    invoke-direct {v2, p0, p1}, Lxe/a;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object p1, v2, Lxe/a;->w:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxe/a;->y:I

    const-wide/16 v5, 0x0

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x1

    if-eqz v4, :cond_4

    if-eq v4, v9, :cond_3

    if-eq v4, v8, :cond_2

    if-ne v4, v7, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v1, Lyf/k;->w:Lne3/h;

    iget-wide v10, p1, Lne3/h;->x:J

    cmp-long p1, v10, v5

    if-lez p1, :cond_5

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p1

    :cond_5
    invoke-virtual {v0}, Lty/c;->s()Z

    move-result p1

    const/4 v4, 0x0

    if-eqz p1, :cond_6

    iget-boolean p1, p0, Ld9/p;->a:Z

    if-eqz p1, :cond_6

    goto :goto_6

    :cond_6
    iget-object p1, p0, Ld9/p;->d:Ljava/lang/Object;

    check-cast p1, Lwe/g;

    iget-object p1, p1, Lwe/g;->k:Lwe/b0;

    sget-object v10, Lwe/a0;->b:Lwe/a0;

    invoke-static {p1, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    iput v9, v2, Lxe/a;->y:I

    invoke-virtual {p0, v4, v2}, Ld9/p;->f(Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_7

    goto :goto_4

    :cond_7
    :goto_1
    check-cast p1, Lyf/k;

    goto :goto_3

    :cond_8
    iput v8, v2, Lxe/a;->y:I

    invoke-virtual {p0, v4, v2}, Ld9/p;->d(Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_9

    goto :goto_4

    :cond_9
    :goto_2
    check-cast p1, Lyf/k;

    :goto_3
    if-nez p1, :cond_b

    invoke-virtual {v0}, Lty/c;->s()Z

    move-result p1

    if-eqz p1, :cond_c

    iput v7, v2, Lxe/a;->y:I

    invoke-virtual {p0, v2}, Ld9/p;->c(Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v3, :cond_a

    :goto_4
    return-object v3

    :cond_a
    :goto_5
    check-cast p1, Lyf/k;

    iput-boolean v9, p0, Ld9/p;->a:Z

    :cond_b
    move-object v4, p1

    goto :goto_6

    :cond_c
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Expected underlying reader to be closed"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_6
    if-eqz v4, :cond_d

    const-string p1, "\r\n"

    invoke-virtual {v4, v8, p1}, Lyf/k;->z(ILjava/lang/String;)V

    :cond_d
    if-eqz v4, :cond_e

    invoke-virtual {v1, v4}, Lyf/k;->C(Lyf/u;)J

    move-result-wide v2

    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v2, v3}, Ljava/lang/Long;-><init>(J)V

    :cond_e
    iget-object p1, v1, Lyf/k;->w:Lne3/h;

    iget-wide v0, p1, Lne3/h;->x:J

    cmp-long p1, v0, v5

    if-lez p1, :cond_f

    goto :goto_7

    :cond_f
    const/4 v9, 0x0

    :goto_7
    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 6

    iget-object v0, p0, Ld9/p;->c:Ljava/lang/Object;

    check-cast v0, Llo/v;

    iget-object v1, p0, Ld9/p;->f:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    iget-object v2, p0, Ld9/p;->g:Ljava/lang/Object;

    check-cast v2, Ljava/util/ArrayDeque;

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_0

    goto :goto_1

    :cond_0
    iget-object v3, v0, Llo/v;->a:Landroid/os/Handler;

    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/os/Handler;->hasMessages(I)Z

    move-result v3

    if-nez v3, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Llo/v;->b()Llo/u;

    move-result-object v3

    iget-object v5, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v5, v4}, Landroid/os/Handler;->obtainMessage(I)Landroid/os/Message;

    move-result-object v4

    iput-object v4, v3, Llo/u;->a:Landroid/os/Message;

    iget-object v0, v0, Llo/v;->a:Landroid/os/Handler;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v4}, Landroid/os/Handler;->sendMessageAtFrontOfQueue(Landroid/os/Message;)Z

    invoke-virtual {v3}, Llo/u;->a()V

    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Ljava/util/ArrayDeque;->clear()V

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->peekFirst()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Runnable;

    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeFirst()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    :goto_1
    return-void
.end method

.method public c(Ls83/c;)Ljava/lang/Object;
    .locals 8

    iget-object v0, p0, Ld9/p;->f:Ljava/lang/Object;

    check-cast v0, Lmf/d;

    instance-of v1, p1, Lxe/b;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lxe/b;

    iget v2, v1, Lxe/b;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lxe/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lxe/b;

    invoke-direct {v1, p0, p1}, Lxe/b;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object p1, v1, Lxe/b;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lxe/b;->E:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    iget-object v0, v1, Lxe/b;->w:Lyf/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v1, Lxe/b;->x:Ld9/p;

    iget-object v3, v1, Lxe/b;->w:Lyf/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ld9/p;->d:Ljava/lang/Object;

    check-cast p1, Lwe/g;

    iget-object p1, p1, Lwe/g;->k:Lwe/b0;

    sget-object v3, Lwe/a0;->b:Lwe/a0;

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    new-instance p1, Lyf/k;

    invoke-direct {p1}, Lyf/k;-><init>()V

    iput v7, v1, Lxe/b;->E:I

    invoke-virtual {p0, p1, v1}, Ld9/p;->f(Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :cond_5
    :goto_1
    check-cast p1, Lyf/k;

    goto :goto_2

    :cond_6
    new-instance p1, Lyf/k;

    invoke-direct {p1}, Lyf/k;-><init>()V

    iput v6, v1, Lxe/b;->E:I

    invoke-virtual {p0, p1, v1}, Ld9/p;->d(Lyf/k;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto :goto_4

    :goto_2
    if-eqz p1, :cond_a

    iget-object v3, v0, Lgf/u;->c:Ljava/util/Map;

    invoke-interface {v3}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_9

    iput-object p1, v1, Lxe/b;->w:Lyf/k;

    iput-object p0, v1, Lxe/b;->x:Ld9/p;

    iput v5, v1, Lxe/b;->E:I

    invoke-static {v0, v1}, Lvp/c;->o0(Lmf/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_7

    goto :goto_4

    :cond_7
    move-object v3, p1

    move-object p1, v0

    move-object v0, p0

    :goto_3
    check-cast p1, Lmf/h;

    iput-object v3, v1, Lxe/b;->w:Lyf/k;

    const/4 v5, 0x0

    iput-object v5, v1, Lxe/b;->x:Ld9/p;

    iput v4, v1, Lxe/b;->E:I

    invoke-virtual {v0, p1, v1}, Ld9/p;->e(Lmf/h;Ls83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_8

    :goto_4
    return-object v2

    :cond_8
    move-object v0, v3

    :goto_5
    check-cast p1, Lyf/k;

    invoke-virtual {v0, p1}, Lyf/k;->C(Lyf/u;)J

    return-object v0

    :cond_9
    return-object p1

    :cond_a
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Required value was null."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public d(Lyf/k;Ls83/c;)Ljava/lang/Object;
    .locals 22

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lxe/c;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lxe/c;

    iget v3, v2, Lxe/c;->z:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lxe/c;->z:I

    goto :goto_0

    :cond_0
    new-instance v2, Lxe/c;

    invoke-direct {v2, v0, v1}, Lxe/c;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object v1, v2, Lxe/c;->x:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lxe/c;->z:I

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v4, :cond_3

    if-eq v4, v7, :cond_2

    if-ne v4, v6, :cond_1

    iget-object v2, v2, Lxe/c;->w:[B

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_5

    iget-object v1, v0, Ld9/p;->b:Ljava/lang/Object;

    check-cast v1, Lty/c;

    iput v7, v2, Lxe/c;->z:I

    invoke-virtual {v0, v1, v2}, Ld9/p;->h(Lty/c;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_5

    :cond_4
    :goto_1
    check-cast v1, Lyf/k;

    goto :goto_2

    :cond_5
    move-object/from16 v1, p1

    :goto_2
    const/4 v4, 0x0

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lyf/k;->n()[B

    move-result-object v1

    iget-object v8, v0, Ld9/p;->c:Ljava/lang/Object;

    check-cast v8, Lwe/o;

    iget-object v9, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v9, [B

    iget-object v10, v0, Ld9/p;->d:Ljava/lang/Object;

    check-cast v10, Lwe/g;

    invoke-virtual {v10}, Lwe/g;->x()Lwe/g;

    move-result-object v10

    sget-object v11, Lwe/c;->y:Lwe/c;

    iput-object v11, v10, Lwe/g;->g:Lwe/c;

    sget-object v11, Lwe/v;->a:Lwe/v;

    iput-object v11, v10, Lwe/g;->k:Lwe/b0;

    new-instance v11, Lwe/g;

    invoke-direct {v11, v10}, Lwe/g;-><init>(Lwe/g;)V

    iput-object v1, v2, Lxe/c;->w:[B

    iput v6, v2, Lxe/c;->z:I

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    const-class v8, Lwe/o;

    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    invoke-interface {v8}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_9

    invoke-static {v2, v8}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v2

    iget-object v8, v11, Lwe/g;->f:Lwe/e;

    invoke-static {v8}, Lwe/p;->a(Lwe/e;)Lb3/b;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v10, "prevSignature"

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v12, v8, Lb3/b;->b:Ljava/lang/Object;

    check-cast v12, Lwe/e;

    iget-object v12, v12, Lwe/e;->w:Ljava/lang/String;

    const-string v13, "-PAYLOAD"

    invoke-virtual {v12, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v12, 0xa

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v13, v11, Lwe/g;->d:Lug/b;

    sget-object v14, Lug/t;->x:Lug/t;

    invoke-virtual {v13, v14}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v11}, Ls3/d;->h(Lwe/g;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v10, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v9}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v9, v11, Lwe/g;->g:Lwe/c;

    sget-object v14, Lwe/i;->a:[I

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    aget v9, v14, v9

    if-ne v9, v7, :cond_7

    const/16 v9, 0xf

    new-array v9, v9, [B

    const-string v14, ":date"

    invoke-static {v14}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v14

    array-length v15, v14

    int-to-byte v15, v15

    aput-byte v15, v9, v5

    const/16 v15, 0xc

    invoke-static {v5, v5, v15, v14, v9}, Lm83/n;->h0(III[B[B)V

    array-length v14, v14

    add-int v15, v7, v14

    add-int/2addr v14, v6

    const/16 v16, 0x8

    aput-byte v16, v9, v15

    invoke-static {v13}, Lug/c;->b(Lug/b;)J

    move-result-wide v15

    const/4 v13, 0x7

    :goto_3
    const/4 v6, -0x1

    if-ge v6, v13, :cond_6

    add-int/lit8 v6, v14, 0x1

    mul-int/lit8 v17, v13, 0x8

    ushr-long v17, v15, v17

    const-wide/16 v19, 0xff

    move/from16 p1, v6

    and-long v5, v17, v19

    long-to-int v5, v5

    int-to-byte v5, v5

    aput-byte v5, v9, v14

    add-int/lit8 v13, v13, -0x1

    move/from16 v14, p1

    const/4 v5, 0x0

    goto :goto_3

    :cond_6
    new-instance v5, Llf/c;

    invoke-direct {v5}, Llf/c;-><init>()V

    invoke-static {v5, v9}, Lse/h;->J(Llf/a;[B)[B

    move-result-object v5

    invoke-static {v5}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object v5

    goto :goto_4

    :cond_7
    const-string v5, "e3b0c44298fc1c149afbf4c8996fb92427ae41e4649b934ca495991b7852b855"

    :goto_4
    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Lb3/b;->t()Lc93/a;

    move-result-object v5

    invoke-static {v1, v5}, Lse/h;->K([BLc93/a;)[B

    move-result-object v5

    invoke-static {v5}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lar0/a;

    const/16 v9, 0x12

    invoke-direct {v6, v5, v9}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v4, v6}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    invoke-interface {v8, v11}, Lwe/j0;->a(Lwe/g;)[B

    move-result-object v6

    invoke-interface {v8, v5, v6}, Lwe/j0;->d(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lar0/a;

    const/16 v8, 0x13

    invoke-direct {v6, v5, v8}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {v2, v4, v6}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v2, Lwe/h;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v5}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v5

    invoke-direct {v2, v4, v5}, Lwe/h;-><init>(Ljava/lang/Object;[B)V

    if-ne v2, v3, :cond_8

    :goto_5
    return-object v3

    :cond_8
    move-object/from16 v21, v2

    move-object v2, v1

    move-object/from16 v1, v21

    :goto_6
    check-cast v1, Lwe/h;

    iget-object v1, v1, Lwe/h;->b:[B

    iput-object v1, v0, Ld9/p;->e:Ljava/lang/Object;

    new-instance v3, Lyf/k;

    invoke-direct {v3}, Lyf/k;-><init>()V

    array-length v4, v2

    const/16 v5, 0x10

    invoke-static {v5}, Lva3/d;->c(I)V

    invoke-static {v4, v5}, Ljava/lang/Integer;->toString(II)Ljava/lang/String;

    move-result-object v4

    const-string v6, "toString(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    invoke-virtual {v3, v6, v4}, Lyf/k;->z(ILjava/lang/String;)V

    const-string v4, ";"

    invoke-virtual {v3, v7, v4}, Lyf/k;->z(ILjava/lang/String;)V

    const-string v4, "chunk-signature="

    invoke-virtual {v3, v5, v4}, Lyf/k;->z(ILjava/lang/String;)V

    array-length v4, v1

    const/4 v5, 0x0

    invoke-virtual {v3, v1, v5, v4}, Lyf/k;->write([BII)V

    const-string v1, "\r\n"

    const/4 v4, 0x2

    invoke-virtual {v3, v4, v1}, Lyf/k;->z(ILjava/lang/String;)V

    array-length v1, v2

    invoke-virtual {v3, v2, v5, v1}, Lyf/k;->write([BII)V

    return-object v3

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_a
    return-object v4
.end method

.method public e(Lmf/h;Ls83/c;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    iget-object v2, v0, Ld9/p;->d:Ljava/lang/Object;

    check-cast v2, Lwe/g;

    instance-of v3, v1, Lxe/d;

    if-eqz v3, :cond_0

    move-object v3, v1

    check-cast v3, Lxe/d;

    iget v4, v3, Lxe/d;->z:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lxe/d;->z:I

    goto :goto_0

    :cond_0
    new-instance v3, Lxe/d;

    invoke-direct {v3, v0, v1}, Lxe/d;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object v1, v3, Lxe/d;->x:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lxe/d;->z:I

    const-string v6, ":"

    const/4 v7, 0x1

    if-eqz v5, :cond_2

    if-ne v5, v7, :cond_1

    iget-object v3, v3, Lxe/d;->w:Lmf/h;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Ld9/p;->c:Ljava/lang/Object;

    check-cast v1, Lwe/o;

    iget-object v5, v0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v5, [B

    invoke-virtual {v2}, Lwe/g;->x()Lwe/g;

    move-result-object v8

    sget-object v9, Lwe/c;->z:Lwe/c;

    iput-object v9, v8, Lwe/g;->g:Lwe/c;

    sget-object v9, Lwe/v;->a:Lwe/v;

    iput-object v9, v8, Lwe/g;->k:Lwe/b0;

    new-instance v9, Lwe/g;

    invoke-direct {v9, v8}, Lwe/g;-><init>(Lwe/g;)V

    move-object/from16 v8, p1

    iput-object v8, v3, Lxe/d;->w:Lmf/h;

    iput v7, v3, Lxe/d;->z:I

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const-class v3, Lwe/o;

    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    invoke-interface {v3}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v1, v3}, Lvd/f;->B(Lq83/j;Ljava/lang/String;)Lgm/r;

    move-result-object v1

    iget-object v3, v9, Lwe/g;->f:Lwe/e;

    invoke-static {v3}, Lwe/p;->a(Lwe/e;)Lb3/b;

    move-result-object v3

    invoke-interface {v8}, Lgf/t;->b()Ljava/util/Set;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Lqx/d0;

    const/4 v12, 0x7

    invoke-direct {v11, v12}, Lqx/d0;-><init>(I)V

    invoke-static {v10, v11}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v10, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v11, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_1
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/util/Map$Entry;

    new-instance v14, Ljava/lang/StringBuilder;

    invoke-direct {v14}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {v13}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ljava/lang/String;

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v15, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v7

    const-string v15, "toLowerCase(...)"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-interface {v13}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v7

    move-object v15, v7

    check-cast v15, Ljava/lang/Iterable;

    new-instance v7, Lwd3/b;

    const/4 v13, 0x5

    invoke-direct {v7, v13}, Lwd3/b;-><init>(I)V

    const/16 v20, 0x1e

    const-string v16, ","

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v7

    invoke-static/range {v15 .. v20}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v7, "\n"

    invoke-virtual {v14, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v14}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v7

    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v7, 0x1

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_4

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, [B

    check-cast v10, [B

    invoke-static {v10, v11}, Lm83/n;->F0([B[B)[B

    move-result-object v10

    goto :goto_2

    :cond_4
    check-cast v10, [B

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v7, "trailingHeaders"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "prevSignature"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v11, v3, Lb3/b;->b:Ljava/lang/Object;

    check-cast v11, Lwe/e;

    iget-object v11, v11, Lwe/e;->w:Ljava/lang/String;

    const-string v13, "-TRAILER"

    invoke-virtual {v11, v13}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    iget-object v11, v9, Lwe/g;->d:Lug/b;

    sget-object v13, Lug/t;->x:Lug/t;

    invoke-virtual {v11, v13}, Lug/b;->b(Lug/t;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v9}, Ls3/d;->h(Lwe/g;)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v7, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {v5}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v12}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Lb3/b;->t()Lc93/a;

    move-result-object v5

    invoke-static {v10, v5}, Lse/h;->K([BLc93/a;)[B

    move-result-object v5

    invoke-static {v5}, Ltg/f;->a([B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-instance v7, Lar0/a;

    const/16 v10, 0xe

    invoke-direct {v7, v5, v10}, Lar0/a;-><init>(Ljava/lang/String;I)V

    const/4 v10, 0x0

    invoke-interface {v1, v10, v7}, Log/g;->s(Ljava/lang/Throwable;Lc93/a;)V

    invoke-interface {v3, v9}, Lwe/j0;->a(Lwe/g;)[B

    move-result-object v7

    invoke-interface {v3, v5, v7}, Lwe/j0;->d(Ljava/lang/String;[B)Ljava/lang/String;

    move-result-object v3

    new-instance v5, Lar0/a;

    const/16 v7, 0xf

    invoke-direct {v5, v3, v7}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-interface {v1, v10, v5}, Log/g;->u(Ljava/lang/Throwable;Lc93/a;)V

    new-instance v1, Lwe/h;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v3}, Lyb3/y;->D(Ljava/lang/String;)[B

    move-result-object v3

    invoke-direct {v1, v5, v3}, Lwe/h;-><init>(Ljava/lang/Object;[B)V

    if-ne v1, v4, :cond_5

    return-object v4

    :cond_5
    move-object v3, v8

    :goto_3
    check-cast v1, Lwe/h;

    iget-object v1, v1, Lwe/h;->b:[B

    iput-object v1, v0, Ld9/p;->e:Ljava/lang/Object;

    new-instance v4, Lyf/k;

    invoke-direct {v4}, Lyf/k;-><init>()V

    const-string v5, "trailers"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Lgf/t;->b()Ljava/util/Set;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v5, Lqx/d0;

    const/16 v7, 0x9

    invoke-direct {v5, v7}, Lqx/d0;-><init>(I)V

    invoke-static {v3, v5}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-string v7, "\r\n"

    if-eqz v5, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/Map$Entry;

    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    invoke-static {v4, v8}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const/4 v8, 0x1

    invoke-virtual {v4, v8, v6}, Lyf/k;->z(ILjava/lang/String;)V

    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/Iterable;

    new-instance v13, Lxa0/a;

    const/16 v5, 0xf

    invoke-direct {v13, v5}, Lxa0/a;-><init>(I)V

    const/16 v14, 0x1e

    const-string v10, ","

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    const/4 v5, 0x2

    invoke-virtual {v4, v5, v7}, Lyf/k;->z(ILjava/lang/String;)V

    goto :goto_4

    :cond_6
    iget-object v2, v2, Lwe/g;->k:Lwe/b0;

    sget-object v3, Lwe/a0;->b:Lwe/a0;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    invoke-static {v1}, Lyb3/y;->A([B)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "x-amz-trailer-signature:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v4, v1}, Lyf/l;->B(Lyf/l;Ljava/lang/String;)V

    :cond_7
    return-object v4

    :cond_8
    new-instance v1, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Empty collection can\'t be reduced."

    invoke-direct {v1, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_9
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "logger<T> cannot be used on an anonymous object"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public f(Lyf/k;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lxe/e;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxe/e;

    iget v1, v0, Lxe/e;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxe/e;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxe/e;

    invoke-direct {v0, p0, p2}, Lxe/e;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxe/e;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxe/e;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    if-nez p1, :cond_4

    iget-object p1, p0, Ld9/p;->b:Ljava/lang/Object;

    check-cast p1, Lty/c;

    iput v3, v0, Lxe/e;->y:I

    invoke-virtual {p0, p1, v0}, Ld9/p;->h(Lty/c;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    move-object p1, p2

    check-cast p1, Lyf/k;

    if-nez p1, :cond_4

    const/4 p1, 0x0

    return-object p1

    :cond_4
    new-instance p2, Lyf/k;

    invoke-direct {p2}, Lyf/k;-><init>()V

    iget-object v0, p1, Lyf/k;->w:Lne3/h;

    iget-wide v0, v0, Lne3/h;->x:J

    const/16 v2, 0x10

    invoke-static {v2}, Lva3/d;->c(I)V

    invoke-static {v0, v1, v2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    invoke-virtual {p2, v1, v0}, Lyf/k;->z(ILjava/lang/String;)V

    const-string v0, "\r\n"

    const/4 v1, 0x2

    invoke-virtual {p2, v1, v0}, Lyf/k;->z(ILjava/lang/String;)V

    invoke-virtual {p2, p1}, Lyf/k;->C(Lyf/u;)J

    return-object p2
.end method

.method public g(ILlo/h;)V
    .locals 4

    new-instance v0, Ljava/util/concurrent/CopyOnWriteArraySet;

    iget-object v1, p0, Ld9/p;->e:Ljava/lang/Object;

    check-cast v1, Ljava/util/concurrent/CopyOnWriteArraySet;

    invoke-direct {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;-><init>(Ljava/util/Collection;)V

    iget-object v1, p0, Ld9/p;->g:Ljava/lang/Object;

    check-cast v1, Ljava/util/ArrayDeque;

    new-instance v2, Landroidx/profileinstaller/a;

    const/4 v3, 0x3

    invoke-direct {v2, v0, p1, p2, v3}, Landroidx/profileinstaller/a;-><init>(Ljava/lang/Object;ILjava/lang/Object;I)V

    invoke-virtual {v1, v2}, Ljava/util/ArrayDeque;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public h(Lty/c;Ls83/c;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lxe/f;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lxe/f;

    iget v1, v0, Lxe/f;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lxe/f;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lxe/f;

    invoke-direct {v0, p0, p2}, Lxe/f;-><init>(Ld9/p;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lxe/f;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lxe/f;->F:I

    const-wide/16 v3, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    iget-wide v6, v0, Lxe/f;->y:J

    iget-object p1, v0, Lxe/f;->x:Lyf/k;

    iget-object v2, v0, Lxe/f;->w:Lty/c;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v12, v0

    move-object v0, p1

    move-object p1, v2

    :goto_1
    move-object v2, v12

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lyf/k;

    invoke-direct {p2}, Lyf/k;-><init>()V

    const-wide/32 v6, 0x10000

    :goto_2
    cmp-long v2, v6, v3

    if-lez v2, :cond_5

    iput-object p1, v0, Lxe/f;->w:Lty/c;

    iput-object p2, v0, Lxe/f;->x:Lyf/k;

    iput-wide v6, v0, Lxe/f;->y:J

    iput v5, v0, Lxe/f;->F:I

    iget v2, p1, Lty/c;->w:I

    packed-switch v2, :pswitch_data_0

    iget-object v2, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast v2, Lyf/m;

    invoke-interface {v2, p2, v6, v7}, Lyf/u;->c0(Lyf/k;J)J

    move-result-wide v8

    new-instance v2, Ljava/lang/Long;

    invoke-direct {v2, v8, v9}, Ljava/lang/Long;-><init>(J)V

    goto :goto_3

    :pswitch_0
    iget-object v2, p1, Lty/c;->x:Ljava/lang/Object;

    check-cast v2, Lyf/o;

    invoke-interface {v2, p2, v6, v7, v0}, Lyf/o;->b(Lyf/k;JLs83/c;)Ljava/lang/Object;

    move-result-object v2

    :goto_3
    if-ne v2, v1, :cond_3

    return-object v1

    :cond_3
    move-object v12, v0

    move-object v0, p2

    move-object p2, v2

    goto :goto_1

    :goto_4
    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    const-wide/16 v10, -0x1

    cmp-long p2, v8, v10

    if-eqz p2, :cond_4

    sub-long/2addr v6, v8

    move-object p2, v0

    move-object v0, v2

    goto :goto_2

    :cond_4
    move-object p2, v0

    :cond_5
    iget-object p1, p2, Lyf/k;->w:Lne3/h;

    iget-wide v0, p1, Lne3/h;->x:J

    cmp-long p1, v0, v3

    if-nez p1, :cond_6

    const/4 p1, 0x0

    return-object p1

    :cond_6
    return-object p2

    :pswitch_data_0
    .packed-switch 0x12
        :pswitch_0
    .end packed-switch
.end method

.method public i(ILlo/h;)V
    .locals 0

    invoke-virtual {p0, p1, p2}, Ld9/p;->g(ILlo/h;)V

    invoke-virtual {p0}, Ld9/p;->b()V

    return-void
.end method
