.class public final Lec3/a0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/l;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lec3/l;

.field public final synthetic y:Ls83/i;


# direct methods
.method public constructor <init>(ILc93/m;Lec3/l;)V
    .locals 0

    iput p1, p0, Lec3/a0;->w:I

    packed-switch p1, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p3, p0, Lec3/a0;->x:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/a0;->y:Ls83/i;

    return-void

    .line 3
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p3, p0, Lec3/a0;->x:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/a0;->y:Ls83/i;

    return-void

    .line 5
    :pswitch_1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p3, p0, Lec3/a0;->x:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/a0;->y:Ls83/i;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lc93/m;Lec3/l;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lec3/a0;->w:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    check-cast p1, Ls83/i;

    iput-object p1, p0, Lec3/a0;->y:Ls83/i;

    iput-object p2, p0, Lec3/a0;->x:Lec3/l;

    return-void
.end method

.method public constructor <init>(Lec3/l;Lc93/n;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lec3/a0;->w:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lec3/a0;->x:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/a0;->y:Ls83/i;

    return-void
.end method

.method public constructor <init>(Lec3/l;Lkotlin/jvm/functions/Function3;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lec3/a0;->w:I

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lec3/a0;->x:Lec3/l;

    check-cast p2, Ls83/i;

    iput-object p2, p0, Lec3/a0;->y:Ls83/i;

    return-void
.end method


# virtual methods
.method public final collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 10

    iget v0, p0, Lec3/a0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Lec3/q0;

    iget-object v1, p0, Lec3/a0;->y:Ls83/i;

    invoke-direct {v0, p1, v1}, Lec3/q0;-><init>(Lec3/m;Lc93/m;)V

    iget-object p1, p0, Lec3/a0;->x:Lec3/l;

    invoke-interface {p1, v0, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_0
    return-object p1

    :pswitch_0
    instance-of v0, p2, Lec3/o0;

    if-eqz v0, :cond_1

    move-object v0, p2

    check-cast v0, Lec3/o0;

    iget v1, v0, Lec3/o0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_1

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/o0;->x:I

    goto :goto_1

    :cond_1
    new-instance v0, Lec3/o0;

    invoke-direct {v0, p0, p2}, Lec3/o0;-><init>(Lec3/a0;Lq83/d;)V

    :goto_1
    iget-object p2, v0, Lec3/o0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/o0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_3

    if-ne v2, v3, :cond_2

    iget-object p1, v0, Lec3/o0;->z:Lec3/q0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lec3/a0;->x:Lec3/l;

    new-instance v2, Lec3/q0;

    iget-object v4, p0, Lec3/a0;->y:Ls83/i;

    invoke-direct {v2, v4, p1}, Lec3/q0;-><init>(Lc93/m;Lec3/m;)V

    :try_start_1
    iput-object v2, v0, Lec3/o0;->z:Lec3/q0;

    iput v3, v0, Lec3/o0;->x:I

    invoke-interface {p2, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Lkotlinx/coroutines/flow/internal/AbortFlowException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p1, v1, :cond_4

    goto :goto_4

    :catch_1
    move-exception p2

    move-object p1, v2

    :goto_2
    iget-object v1, p2, Lkotlinx/coroutines/flow/internal/AbortFlowException;->w:Ljava/lang/Object;

    if-ne v1, p1, :cond_5

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V

    :cond_4
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v1

    :cond_5
    throw p2

    :pswitch_1
    new-instance v0, Lkotlin/jvm/internal/b0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Lc0/a0;

    iget-object v2, p0, Lec3/a0;->y:Ls83/i;

    invoke-direct {v1, v0, p1, v2}, Lc0/a0;-><init>(Lkotlin/jvm/internal/b0;Lec3/m;Lc93/m;)V

    iget-object p1, p0, Lec3/a0;->x:Lec3/l;

    invoke-interface {p1, v1, p2}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_6

    goto :goto_5

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object p1

    :pswitch_2
    instance-of v0, p2, Lec3/g0;

    if-eqz v0, :cond_7

    move-object v0, p2

    check-cast v0, Lec3/g0;

    iget v1, v0, Lec3/g0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_7

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/g0;->x:I

    goto :goto_6

    :cond_7
    new-instance v0, Lec3/g0;

    invoke-direct {v0, p0, p2}, Lec3/g0;-><init>(Lec3/a0;Lq83/d;)V

    :goto_6
    iget-object p2, v0, Lec3/g0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/g0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_a

    if-eq v2, v4, :cond_9

    if-ne v2, v3, :cond_8

    iget-wide v5, v0, Lec3/g0;->G:J

    iget-object p1, v0, Lec3/g0;->F:Ljava/lang/Throwable;

    iget-object v2, v0, Lec3/g0;->E:Lec3/m;

    iget-object v7, v0, Lec3/g0;->z:Lec3/a0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_a

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_9
    iget-wide v5, v0, Lec3/g0;->G:J

    iget-object p1, v0, Lec3/g0;->E:Lec3/m;

    iget-object v2, v0, Lec3/g0;->z:Lec3/a0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v7, v2

    :goto_7
    move-object v2, p1

    goto :goto_9

    :cond_a
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v5, 0x0

    move-object p2, p0

    :goto_8
    iget-object v2, p2, Lec3/a0;->x:Lec3/l;

    iput-object p2, v0, Lec3/g0;->z:Lec3/a0;

    iput-object p1, v0, Lec3/g0;->E:Lec3/m;

    const/4 v7, 0x0

    iput-object v7, v0, Lec3/g0;->F:Ljava/lang/Throwable;

    iput-wide v5, v0, Lec3/g0;->G:J

    iput v4, v0, Lec3/g0;->x:I

    invoke-static {v2, p1, v0}, Lec3/v;->k(Lec3/l;Lec3/m;Ls83/c;)Ljava/io/Serializable;

    move-result-object v2

    if-ne v2, v1, :cond_b

    goto :goto_d

    :cond_b
    move-object v7, p2

    move-object p2, v2

    goto :goto_7

    :goto_9
    move-object p1, p2

    check-cast p1, Ljava/lang/Throwable;

    if-eqz p1, :cond_e

    iget-object p2, v7, Lec3/a0;->y:Ls83/i;

    new-instance v8, Ljava/lang/Long;

    invoke-direct {v8, v5, v6}, Ljava/lang/Long;-><init>(J)V

    iput-object v7, v0, Lec3/g0;->z:Lec3/a0;

    iput-object v2, v0, Lec3/g0;->E:Lec3/m;

    iput-object p1, v0, Lec3/g0;->F:Ljava/lang/Throwable;

    iput-wide v5, v0, Lec3/g0;->G:J

    iput v3, v0, Lec3/g0;->x:I

    invoke-interface {p2, v2, p1, v8, v0}, Lc93/n;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_c

    goto :goto_d

    :cond_c
    :goto_a
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-eqz p2, :cond_d

    const-wide/16 p1, 0x1

    add-long/2addr v5, p1

    move p1, v4

    :goto_b
    move-object p2, v7

    goto :goto_c

    :cond_d
    throw p1

    :cond_e
    const/4 p1, 0x0

    goto :goto_b

    :goto_c
    if-nez p1, :cond_f

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_d
    return-object v1

    :cond_f
    move-object p1, v2

    goto :goto_8

    :pswitch_3
    instance-of v0, p2, Lec3/b0;

    if-eqz v0, :cond_10

    move-object v0, p2

    check-cast v0, Lec3/b0;

    iget v1, v0, Lec3/b0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_10

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/b0;->x:I

    goto :goto_e

    :cond_10
    new-instance v0, Lec3/b0;

    invoke-direct {v0, p0, p2}, Lec3/b0;-><init>(Lec3/a0;Lq83/d;)V

    :goto_e
    iget-object p2, v0, Lec3/b0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/b0;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_13

    if-eq v2, v4, :cond_12

    if-ne v2, v3, :cond_11

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_10

    :cond_11
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_12
    iget-object p1, v0, Lec3/b0;->E:Lec3/m;

    iget-object v2, v0, Lec3/b0;->z:Lec3/a0;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_f

    :cond_13
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lec3/b0;->z:Lec3/a0;

    iput-object p1, v0, Lec3/b0;->E:Lec3/m;

    iput v4, v0, Lec3/b0;->x:I

    iget-object p2, p0, Lec3/a0;->x:Lec3/l;

    invoke-static {p2, p1, v0}, Lec3/v;->k(Lec3/l;Lec3/m;Ls83/c;)Ljava/io/Serializable;

    move-result-object p2

    if-ne p2, v1, :cond_14

    goto :goto_11

    :cond_14
    move-object v2, p0

    :goto_f
    check-cast p2, Ljava/lang/Throwable;

    if-eqz p2, :cond_15

    iget-object v2, v2, Lec3/a0;->y:Ls83/i;

    const/4 v4, 0x0

    iput-object v4, v0, Lec3/b0;->z:Lec3/a0;

    iput-object v4, v0, Lec3/b0;->E:Lec3/m;

    iput v3, v0, Lec3/b0;->x:I

    invoke-interface {v2, p1, p2, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_15

    goto :goto_11

    :cond_15
    :goto_10
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_11
    return-object v1

    :pswitch_4
    instance-of v0, p2, Lec3/z;

    if-eqz v0, :cond_16

    move-object v0, p2

    check-cast v0, Lec3/z;

    iget v1, v0, Lec3/z;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_16

    sub-int/2addr v1, v2

    iput v1, v0, Lec3/z;->x:I

    goto :goto_12

    :cond_16
    new-instance v0, Lec3/z;

    invoke-direct {v0, p0, p2}, Lec3/z;-><init>(Lec3/a0;Lq83/d;)V

    :goto_12
    iget-object p2, v0, Lec3/z;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lec3/z;->x:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_19

    if-eq v2, v4, :cond_18

    if-ne v2, v3, :cond_17

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_17
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_18
    iget-object p1, v0, Lec3/z;->F:Lfc3/t;

    iget-object v2, v0, Lec3/z;->E:Lec3/m;

    iget-object v4, v0, Lec3/z;->z:Lec3/a0;

    :try_start_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_13

    :catchall_0
    move-exception p2

    goto :goto_16

    :cond_19
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lfc3/t;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-direct {p2, p1, v2}, Lfc3/t;-><init>(Lec3/m;Lq83/j;)V

    :try_start_3
    iget-object v2, p0, Lec3/a0;->y:Ls83/i;

    iput-object p0, v0, Lec3/z;->z:Lec3/a0;

    iput-object p1, v0, Lec3/z;->E:Lec3/m;

    iput-object p2, v0, Lec3/z;->F:Lfc3/t;

    iput v4, v0, Lec3/z;->x:I

    invoke-interface {v2, p2, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    if-ne v2, v1, :cond_1a

    goto :goto_15

    :cond_1a
    move-object v4, p0

    move-object v2, p1

    move-object p1, p2

    :goto_13
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    iget-object p1, v4, Lec3/a0;->x:Lec3/l;

    const/4 p2, 0x0

    iput-object p2, v0, Lec3/z;->z:Lec3/a0;

    iput-object p2, v0, Lec3/z;->E:Lec3/m;

    iput-object p2, v0, Lec3/z;->F:Lfc3/t;

    iput v3, v0, Lec3/z;->x:I

    invoke-interface {p1, v2, v0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_1b

    goto :goto_15

    :cond_1b
    :goto_14
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_15
    return-object v1

    :catchall_1
    move-exception p1

    move-object v9, p2

    move-object p2, p1

    move-object p1, v9

    :goto_16
    invoke-virtual {p1}, Ls83/c;->releaseIntercepted()V

    throw p2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
