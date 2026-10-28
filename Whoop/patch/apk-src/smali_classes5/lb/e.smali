.class public final Llb/e;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llb/b;


# instance fields
.field public volatile E:Z

.field public final F:J

.field public final G:I

.field public final w:Llb/s;

.field public final x:Llb/s;

.field public final y:Lg73/d;

.field public final z:Ljava/lang/ThreadLocal;


# direct methods
.method public constructor <init>(Lio/sentry/internal/debugmeta/c;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lg73/d;

    const/16 v1, 0x13

    .line 3
    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    .line 4
    iput-object v0, p0, Llb/e;->y:Lg73/d;

    .line 5
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Llb/e;->z:Ljava/lang/ThreadLocal;

    .line 6
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x1e

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    iput-wide v0, p0, Llb/e;->F:J

    const/4 v0, 0x2

    .line 7
    iput v0, p0, Llb/e;->G:I

    .line 8
    new-instance v0, Llb/s;

    .line 9
    new-instance v1, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v2, 0x15

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    const/4 p1, 0x1

    .line 10
    invoke-direct {v0, p1, v1}, Llb/s;-><init>(ILc93/a;)V

    .line 11
    iput-object v0, p0, Llb/e;->w:Llb/s;

    .line 12
    iput-object v0, p0, Llb/e;->x:Llb/s;

    return-void
.end method

.method public constructor <init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)V
    .locals 3

    const-string v0, "fileName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    new-instance v0, Lg73/d;

    const/16 v1, 0x13

    .line 15
    invoke-direct {v0, v1}, Lg73/d;-><init>(I)V

    .line 16
    iput-object v0, p0, Llb/e;->y:Lg73/d;

    .line 17
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    iput-object v0, p0, Llb/e;->z:Ljava/lang/ThreadLocal;

    .line 18
    sget-object v0, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    const/16 v0, 0x1e

    sget-object v1, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v0

    iput-wide v0, p0, Llb/e;->F:J

    const/4 v0, 0x2

    .line 19
    iput v0, p0, Llb/e;->G:I

    if-lez p3, :cond_0

    .line 20
    new-instance v0, Llb/s;

    .line 21
    new-instance v1, Llb/c;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Llb/c;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)V

    .line 22
    invoke-direct {v0, p3, v1}, Llb/s;-><init>(ILc93/a;)V

    .line 23
    iput-object v0, p0, Llb/e;->w:Llb/s;

    .line 24
    new-instance p3, Llb/s;

    .line 25
    new-instance v0, Llb/c;

    const/4 v1, 0x1

    invoke-direct {v0, p1, p2, v1}, Llb/c;-><init>(Lio/sentry/internal/debugmeta/c;Ljava/lang/String;I)V

    .line 26
    invoke-direct {p3, v1, v0}, Llb/s;-><init>(ILc93/a;)V

    .line 27
    iput-object p3, p0, Llb/e;->x:Llb/s;

    return-void

    .line 28
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Maximum number of readers must be greater than 0"

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public final A0(ZLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v1, p0

    move/from16 v0, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    instance-of v4, v3, Llb/d;

    if-eqz v4, :cond_0

    move-object v4, v3

    check-cast v4, Llb/d;

    iget v5, v4, Llb/d;->J:I

    const/high16 v6, -0x80000000

    and-int v7, v5, v6

    if-eqz v7, :cond_0

    sub-int/2addr v5, v6

    iput v5, v4, Llb/d;->J:I

    goto :goto_0

    :cond_0
    new-instance v4, Llb/d;

    invoke-direct {v4, v1, v3}, Llb/d;-><init>(Llb/e;Lq83/d;)V

    :goto_0
    iget-object v3, v4, Llb/d;->H:Ljava/lang/Object;

    sget-object v5, Lr83/a;->w:Lr83/a;

    iget v6, v4, Llb/d;->J:I

    const-string v7, "ROLLBACK TRANSACTION"

    const-string v8, "<this>"

    const/4 v9, 0x4

    const/4 v10, 0x3

    const/4 v11, 0x2

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eqz v6, :cond_5

    if-eq v6, v12, :cond_4

    if-eq v6, v11, :cond_3

    if-eq v6, v10, :cond_2

    if-ne v6, v9, :cond_1

    iget-object v0, v4, Llb/d;->y:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v0, v4, Llb/d;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Llb/s;

    :try_start_0
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_8

    :catchall_0
    move-exception v0

    move-object v6, v2

    move-object v2, v0

    goto/16 :goto_9

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-boolean v0, v4, Llb/d;->w:Z

    iget-object v2, v4, Llb/d;->G:Lg73/d;

    iget-object v6, v4, Llb/d;->F:Lkotlin/jvm/internal/g0;

    iget-object v10, v4, Llb/d;->E:Lq83/j;

    iget-object v11, v4, Llb/d;->z:Lkotlin/jvm/internal/g0;

    iget-object v14, v4, Llb/d;->y:Ljava/lang/Object;

    check-cast v14, Llb/s;

    iget-object v15, v4, Llb/d;->x:Ljava/lang/Object;

    check-cast v15, Lc93/m;

    :try_start_1
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v9, v6

    move-object v6, v11

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    move-object v2, v0

    move-object v6, v11

    :goto_1
    move-object v4, v14

    goto/16 :goto_9

    :cond_3
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_4
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_5
    invoke-static {v3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean v3, v1, Llb/e;->E:Z

    if-nez v3, :cond_17

    iget-object v3, v1, Llb/e;->z:Ljava/lang/ThreadLocal;

    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Llb/a0;

    if-nez v3, :cond_7

    invoke-interface {v4}, Lq83/d;->getContext()Lq83/j;

    move-result-object v3

    iget-object v6, v1, Llb/e;->y:Lg73/d;

    invoke-interface {v3, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v3

    check-cast v3, Llb/a;

    if-eqz v3, :cond_6

    iget-object v3, v3, Llb/a;->x:Llb/a0;

    goto :goto_2

    :cond_6
    move-object v3, v13

    :cond_7
    :goto_2
    if-eqz v3, :cond_d

    if-nez v0, :cond_9

    iget-boolean v0, v3, Llb/a0;->c:Z

    if-nez v0, :cond_8

    goto :goto_3

    :cond_8
    const-string v0, "Cannot upgrade connection from reader to writer"

    invoke-static {v12, v0}, Lhg3/i;->l0(ILjava/lang/String;)V

    throw v13

    :cond_9
    :goto_3
    invoke-interface {v4}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    iget-object v6, v1, Llb/e;->y:Lg73/d;

    invoke-interface {v0, v6}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v0

    if-nez v0, :cond_b

    new-instance v0, Llb/a;

    iget-object v6, v1, Llb/e;->y:Lg73/d;

    invoke-direct {v0, v6, v3}, Llb/a;-><init>(Lq83/i;Llb/a0;)V

    iget-object v6, v1, Llb/e;->z:Ljava/lang/ThreadLocal;

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, Lhc3/z;

    invoke-direct {v7, v3, v6}, Lhc3/z;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    invoke-static {v0, v7}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v6, Lh20/i0;

    const/16 v7, 0x14

    invoke-direct {v6, v2, v3, v13, v7}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v12, v4, Llb/d;->J:I

    invoke-static {v0, v6, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_a

    goto/16 :goto_7

    :cond_a
    return-object v0

    :cond_b
    iput v11, v4, Llb/d;->J:I

    invoke-interface {v2, v3, v4}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v5, :cond_c

    goto/16 :goto_7

    :cond_c
    return-object v0

    :cond_d
    if-eqz v0, :cond_e

    iget-object v3, v1, Llb/e;->w:Llb/s;

    goto :goto_4

    :cond_e
    iget-object v3, v1, Llb/e;->x:Llb/s;

    :goto_4
    new-instance v6, Lkotlin/jvm/internal/g0;

    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    :try_start_2
    invoke-interface {v4}, Lq83/d;->getContext()Lq83/j;

    move-result-object v11

    iget-object v14, v1, Llb/e;->y:Lg73/d;

    iget-wide v12, v1, Llb/e;->F:J

    new-instance v15, Lio/getstream/chat/android/client/b;

    const/4 v9, 0x3

    invoke-direct {v15, v1, v0, v9}, Lio/getstream/chat/android/client/b;-><init>(Ljava/lang/Object;ZI)V

    iput-object v2, v4, Llb/d;->x:Ljava/lang/Object;

    iput-object v3, v4, Llb/d;->y:Ljava/lang/Object;

    iput-object v6, v4, Llb/d;->z:Lkotlin/jvm/internal/g0;

    iput-object v11, v4, Llb/d;->E:Lq83/j;

    iput-object v6, v4, Llb/d;->F:Lkotlin/jvm/internal/g0;

    iput-object v14, v4, Llb/d;->G:Lg73/d;

    iput-boolean v0, v4, Llb/d;->w:Z

    iput v10, v4, Llb/d;->J:I

    invoke-virtual {v3, v12, v13, v15, v4}, Llb/s;->b(JLio/getstream/chat/android/client/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    if-ne v9, v5, :cond_f

    goto :goto_7

    :cond_f
    move-object v15, v2

    move-object v10, v11

    move-object v2, v14

    move-object v14, v3

    move-object v3, v9

    move-object v9, v6

    :goto_5
    :try_start_3
    check-cast v3, Llb/h;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v11, "context"

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v10, v3, Llb/h;->y:Lq83/j;

    new-instance v10, Ljava/lang/Throwable;

    invoke-direct {v10}, Ljava/lang/Throwable;-><init>()V

    iput-object v10, v3, Llb/h;->z:Ljava/lang/Throwable;

    iget-object v10, v1, Llb/e;->w:Llb/s;

    iget-object v11, v1, Llb/e;->x:Llb/s;

    if-eq v10, v11, :cond_10

    if-eqz v0, :cond_10

    const/4 v0, 0x1

    goto :goto_6

    :cond_10
    const/4 v0, 0x0

    :goto_6
    new-instance v10, Llb/a0;

    invoke-direct {v10, v2, v3, v0}, Llb/a0;-><init>(Lg73/d;Llb/h;Z)V

    iput-object v10, v9, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    iget-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-eqz v0, :cond_14

    check-cast v0, Llb/a0;

    new-instance v2, Llb/a;

    iget-object v3, v1, Llb/e;->y:Lg73/d;

    invoke-direct {v2, v3, v0}, Llb/a;-><init>(Lq83/i;Llb/a0;)V

    iget-object v3, v1, Llb/e;->z:Ljava/lang/ThreadLocal;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lhc3/z;

    invoke-direct {v8, v0, v3}, Lhc3/z;-><init>(Ljava/lang/Object;Ljava/lang/ThreadLocal;)V

    invoke-static {v2, v8}, Le93/b;->T(Lq83/h;Lq83/j;)Lq83/j;

    move-result-object v0

    new-instance v2, Lh20/i0;

    const/16 v3, 0x15

    const/4 v8, 0x0

    invoke-direct {v2, v15, v6, v8, v3}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object v14, v4, Llb/d;->x:Ljava/lang/Object;

    iput-object v6, v4, Llb/d;->y:Ljava/lang/Object;

    iput-object v8, v4, Llb/d;->z:Lkotlin/jvm/internal/g0;

    iput-object v8, v4, Llb/d;->E:Lq83/j;

    iput-object v8, v4, Llb/d;->F:Lkotlin/jvm/internal/g0;

    iput-object v8, v4, Llb/d;->G:Lg73/d;

    const/4 v3, 0x4

    iput v3, v4, Llb/d;->J:I

    invoke-static {v0, v2, v4}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    if-ne v3, v5, :cond_11

    :goto_7
    return-object v5

    :cond_11
    move-object v2, v6

    move-object v4, v14

    :goto_8
    iget-object v0, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Llb/a0;

    if-eqz v0, :cond_13

    iget-boolean v2, v0, Llb/a0;->e:Z

    if-nez v2, :cond_12

    const/4 v2, 0x1

    iput-boolean v2, v0, Llb/a0;->e:Z

    iget-object v2, v0, Llb/a0;->b:Llb/h;

    iget-object v2, v2, Llb/h;->w:Ltb/a;

    invoke-interface {v2}, Ltb/a;->v()Z

    move-result v2

    if-eqz v2, :cond_12

    iget-object v2, v0, Llb/a0;->b:Llb/h;

    invoke-static {v7, v2}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :cond_12
    iget-object v0, v0, Llb/a0;->b:Llb/h;

    const/4 v15, 0x0

    iput-object v15, v0, Llb/h;->y:Lq83/j;

    iput-object v15, v0, Llb/h;->z:Ljava/lang/Throwable;

    invoke-virtual {v4, v0}, Llb/s;->e(Llb/h;)V

    :cond_13
    return-object v3

    :catchall_2
    move-exception v0

    move-object v2, v0

    goto/16 :goto_1

    :cond_14
    :try_start_4
    const-string v0, "Required value was null."

    new-instance v2, Ljava/lang/IllegalArgumentException;

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    :catchall_3
    move-exception v0

    move-object v2, v0

    move-object v4, v3

    :goto_9
    :try_start_5
    throw v2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    :catchall_4
    move-exception v0

    move-object v3, v0

    :try_start_6
    iget-object v0, v6, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast v0, Llb/a0;

    if-eqz v0, :cond_16

    iget-boolean v5, v0, Llb/a0;->e:Z

    if-nez v5, :cond_15

    const/4 v5, 0x1

    iput-boolean v5, v0, Llb/a0;->e:Z

    iget-object v5, v0, Llb/a0;->b:Llb/h;

    iget-object v5, v5, Llb/h;->w:Ltb/a;

    invoke-interface {v5}, Ltb/a;->v()Z

    move-result v5

    if-eqz v5, :cond_15

    iget-object v5, v0, Llb/a0;->b:Llb/h;

    invoke-static {v7, v5}, Lhg3/i;->K(Ljava/lang/String;Ltb/a;)V

    :cond_15
    iget-object v0, v0, Llb/a0;->b:Llb/h;

    const/4 v15, 0x0

    iput-object v15, v0, Llb/h;->y:Lq83/j;

    iput-object v15, v0, Llb/h;->z:Ljava/lang/Throwable;

    invoke-virtual {v4, v0}, Llb/s;->e(Llb/h;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    goto :goto_a

    :catchall_5
    move-exception v0

    invoke-static {v2, v0}, Lpf/c;->g(Ljava/lang/Throwable;Ljava/lang/Throwable;)V

    :cond_16
    :goto_a
    throw v3

    :cond_17
    const/16 v0, 0x15

    const-string v2, "Connection pool is closed"

    invoke-static {v0, v2}, Lhg3/i;->l0(ILjava/lang/String;)V

    const/4 v15, 0x0

    throw v15
.end method

.method public final close()V
    .locals 1

    iget-boolean v0, p0, Llb/e;->E:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Llb/e;->E:Z

    iget-object v0, p0, Llb/e;->w:Llb/s;

    invoke-virtual {v0}, Llb/s;->c()V

    iget-object v0, p0, Llb/e;->x:Llb/s;

    invoke-virtual {v0}, Llb/s;->c()V

    :cond_0
    return-void
.end method
