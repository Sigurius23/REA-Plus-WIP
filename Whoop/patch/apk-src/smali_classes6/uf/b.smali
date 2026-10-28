.class public final Luf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/e;


# instance fields
.field public final a:Luf/e;

.field public final b:La30/w0;

.field public final c:Luf/p;

.field public final d:Luf/f;


# direct methods
.method public constructor <init>(Luf/e;La30/w0;Luf/p;Luf/f;)V
    .locals 1

    const-string v0, "authConfig"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luf/b;->a:Luf/e;

    iput-object p2, p0, Luf/b;->b:La30/w0;

    iput-object p3, p0, Luf/b;->c:Luf/p;

    iput-object p4, p0, Luf/b;->d:Luf/f;

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;Ls83/c;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Luf/u;

    invoke-virtual {p0, p1, p2}, Luf/b;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final b(Luf/u;Lq83/d;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    iget-object v3, v0, Luf/b;->b:La30/w0;

    iget-object v4, v3, La30/w0;->y:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v5, v3, La30/w0;->x:Ljava/lang/Object;

    check-cast v5, Ldg/a;

    instance-of v6, v2, Luf/a;

    if-eqz v6, :cond_0

    move-object v6, v2

    check-cast v6, Luf/a;

    iget v7, v6, Luf/a;->M:I

    const/high16 v8, -0x80000000

    and-int v9, v7, v8

    if-eqz v9, :cond_0

    sub-int/2addr v7, v8

    iput v7, v6, Luf/a;->M:I

    goto :goto_0

    :cond_0
    new-instance v6, Luf/a;

    check-cast v2, Ls83/c;

    invoke-direct {v6, v0, v2}, Luf/a;-><init>(Luf/b;Ls83/c;)V

    :goto_0
    iget-object v2, v6, Luf/a;->K:Ljava/lang/Object;

    sget-object v7, Lr83/a;->w:Lr83/a;

    iget v8, v6, Luf/a;->M:I

    sget-object v9, Lgf/i;->w:Lgf/i;

    const-string v10, "Required value was null."

    const-string v11, "executionContext"

    iget-object v12, v0, Luf/b;->c:Luf/p;

    packed-switch v8, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v1, v6, Luf/a;->G:Lgf/b;

    check-cast v1, Lnf/k;

    iget-object v1, v6, Luf/a;->F:Ljava/lang/Object;

    check-cast v1, Luf/u;

    iget-object v1, v6, Luf/a;->E:Lgf/c;

    check-cast v1, Luf/w;

    iget-object v1, v6, Luf/a;->z:Ljava/lang/Object;

    check-cast v1, Lxf/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v2

    :pswitch_1
    iget-wide v8, v6, Luf/a;->J:J

    iget-object v1, v6, Luf/a;->I:Lgf/b;

    iget-object v12, v6, Luf/a;->H:Lqg/c;

    iget-object v13, v6, Luf/a;->G:Lgf/b;

    check-cast v13, Lnf/k;

    iget-object v13, v6, Luf/a;->F:Ljava/lang/Object;

    check-cast v13, Luf/u;

    iget-object v15, v6, Luf/a;->E:Lgf/c;

    check-cast v15, Luf/w;

    iget-object v15, v6, Luf/a;->z:Ljava/lang/Object;

    check-cast v15, Lxf/a;

    iget-object v15, v6, Luf/a;->x:Lnf/e;

    iget-object v14, v6, Luf/a;->w:Luf/u;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object/from16 v18, v10

    move-object v2, v13

    move-object v13, v11

    goto/16 :goto_c

    :pswitch_2
    iget-object v1, v6, Luf/a;->E:Lgf/c;

    check-cast v1, Luf/w;

    iget-object v1, v6, Luf/a;->z:Ljava/lang/Object;

    check-cast v1, Lxf/a;

    iget-object v8, v6, Luf/a;->y:Lgf/b;

    iget-object v9, v6, Luf/a;->x:Lnf/e;

    iget-object v12, v6, Luf/a;->w:Luf/u;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v16, v4

    move-object v14, v8

    move-object v15, v9

    move-object/from16 v18, v10

    move-object v13, v11

    goto/16 :goto_a

    :pswitch_3
    iget-wide v14, v6, Luf/a;->J:J

    iget-object v1, v6, Luf/a;->H:Lqg/c;

    check-cast v1, Lkotlin/time/TimeSource$Monotonic;

    iget-object v1, v6, Luf/a;->G:Lgf/b;

    iget-object v8, v6, Luf/a;->F:Ljava/lang/Object;

    check-cast v8, Lqg/c;

    iget-object v12, v6, Luf/a;->E:Lgf/c;

    check-cast v12, Luf/w;

    iget-object v12, v6, Luf/a;->z:Ljava/lang/Object;

    check-cast v12, Lxf/a;

    iget-object v13, v6, Luf/a;->y:Lgf/b;

    move-object/from16 p1, v1

    iget-object v1, v6, Luf/a;->x:Lnf/e;

    move-object/from16 v16, v1

    iget-object v1, v6, Luf/a;->w:Luf/u;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v17, v9

    move-object/from16 v18, v10

    move-object/from16 v19, v1

    move-object/from16 v1, p1

    move-object/from16 v20, v2

    move-object/from16 v2, v19

    move-object/from16 v19, v4

    move-object/from16 v4, v20

    move-object/from16 v20, v16

    move-object/from16 v16, v19

    move-object/from16 v19, v13

    move-object v13, v11

    move-wide v10, v14

    move-object/from16 v15, v20

    move-object/from16 v14, v19

    goto/16 :goto_6

    :pswitch_4
    iget-wide v12, v6, Luf/a;->J:J

    iget-object v1, v6, Luf/a;->F:Ljava/lang/Object;

    check-cast v1, Lkotlin/time/TimeSource$Monotonic;

    iget-object v1, v6, Luf/a;->E:Lgf/c;

    iget-object v8, v6, Luf/a;->z:Ljava/lang/Object;

    check-cast v8, Lqg/c;

    iget-object v14, v6, Luf/a;->y:Lgf/b;

    iget-object v15, v6, Luf/a;->x:Lnf/e;

    move-object/from16 v16, v1

    iget-object v1, v6, Luf/a;->w:Luf/u;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    move-object v2, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v4

    move-object/from16 v4, v19

    goto/16 :goto_4

    :pswitch_5
    iget-object v1, v6, Luf/a;->w:Luf/u;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v2, v12, Luf/p;->a:Luf/c;

    iput-object v1, v6, Luf/a;->w:Luf/u;

    const/4 v8, 0x1

    iput v8, v6, Luf/a;->M:I

    invoke-interface {v2, v1, v6}, Luf/c;->f(Luf/u;Luf/a;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_1

    goto/16 :goto_e

    :cond_1
    :goto_1
    check-cast v2, Ljava/util/List;

    move-object v8, v2

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_3

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    move-object v14, v13

    check-cast v14, Lue/a;

    iget-object v15, v12, Luf/p;->b:Ljava/util/Map;

    iget-object v14, v14, Lue/a;->a:Ljava/lang/String;

    move-object/from16 v16, v4

    new-instance v4, Lue/b;

    invoke-direct {v4, v14}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-interface {v15, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    goto :goto_3

    :cond_2
    move-object/from16 v4, v16

    goto :goto_2

    :cond_3
    move-object/from16 v16, v4

    const/4 v13, 0x0

    :goto_3
    check-cast v13, Lue/a;

    if-eqz v13, :cond_17

    iget-object v2, v13, Lue/a;->a:Ljava/lang/String;

    iget-object v4, v12, Luf/p;->b:Ljava/util/Map;

    new-instance v8, Lue/b;

    invoke-direct {v8, v2}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lnf/e;

    if-eqz v4, :cond_16

    new-instance v2, Lgf/c;

    invoke-direct {v2}, Lgf/c;-><init>()V

    invoke-interface {v4}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v8

    const-string v14, "value"

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v14, Lgf/a;

    const-string v15, "auth.scheme_id"

    invoke-direct {v14, v15}, Lgf/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v14, v8}, Lgf/c;->c(Lgf/a;Ljava/lang/Object;)V

    iget-object v8, v1, Luf/u;->a:Ldg/a;

    iget-object v13, v13, Lue/a;->b:Lgf/b;

    invoke-static {v8, v13}, Ljc/x;->c0(Lgf/l;Lgf/b;)V

    iget-object v12, v12, Luf/p;->c:Lxf/f;

    invoke-interface {v4, v12}, Lnf/e;->a(Lxf/f;)Lxf/c;

    move-result-object v12

    invoke-static {v8}, Lrs/b;->j(Ldg/a;)Luf/t;

    move-result-object v13

    iget-object v13, v13, Luf/t;->j:Lqg/c;

    sget-object v14, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {v14}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v14

    iput-object v1, v6, Luf/a;->w:Luf/u;

    iput-object v4, v6, Luf/a;->x:Lnf/e;

    iput-object v2, v6, Luf/a;->y:Lgf/b;

    iput-object v13, v6, Luf/a;->z:Ljava/lang/Object;

    iput-object v2, v6, Luf/a;->E:Lgf/c;

    move-object/from16 p1, v1

    const/4 v1, 0x0

    iput-object v1, v6, Luf/a;->F:Ljava/lang/Object;

    iput-wide v14, v6, Luf/a;->J:J

    const/4 v1, 0x2

    iput v1, v6, Luf/a;->M:I

    invoke-interface {v12, v8, v6}, Lxf/c;->b(Lgf/b;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_4

    goto/16 :goto_e

    :cond_4
    move-object v8, v13

    move-wide v12, v14

    move-object v14, v2

    move-object v15, v4

    move-object/from16 v2, p1

    move-object v4, v1

    move-object v1, v14

    :goto_4
    check-cast v4, Lxf/a;

    move-object/from16 v17, v9

    new-instance v9, Lkotlin/time/TimedValue;

    invoke-static {v12, v13}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v12

    move-object/from16 v18, v10

    const/4 v10, 0x0

    invoke-direct {v9, v4, v12, v13, v10}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lkotlin/time/TimedValue;->getDuration-UwyO8pc()J

    move-result-wide v12

    invoke-static {v8, v12, v13, v1, v10}, Le4/a;->M(Lqg/c;JLgf/b;Lng/f;)V

    invoke-virtual {v9}, Lkotlin/time/TimedValue;->getValue()Ljava/lang/Object;

    move-result-object v1

    move-object v12, v1

    check-cast v12, Lxf/a;

    iget-object v1, v2, Luf/u;->a:Ldg/a;

    invoke-interface {v12}, Lxf/a;->getAttributes()Lgf/b;

    move-result-object v4

    sget-object v8, Lbf/b;->a:Lgf/a;

    invoke-interface {v4, v8}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/Set;

    if-eqz v4, :cond_5

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->n1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lbf/a;

    invoke-static {v1, v8}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    goto :goto_5

    :cond_5
    new-instance v4, Luf/w;

    iget-object v8, v2, Luf/u;->b:Ljava/lang/Object;

    check-cast v8, Lvf/b;

    invoke-static {v8}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v8

    invoke-direct {v4, v1, v8, v12}, Luf/w;-><init>(Ldg/a;Lvf/g;Lxf/a;)V

    iget-object v8, v0, Luf/b;->d:Luf/f;

    if-eqz v8, :cond_d

    invoke-static {v1}, Lrs/b;->j(Ldg/a;)Luf/t;

    move-result-object v9

    iget-object v9, v9, Luf/t;->i:Lqg/c;

    sget-object v10, Luf/i;->h:Lgf/a;

    invoke-virtual {v1, v10}, Ldg/a;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lgf/b;

    if-nez v1, :cond_6

    move-object/from16 v1, v17

    :cond_6
    sget-object v10, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    move-object v13, v11

    invoke-virtual {v10}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v10

    iput-object v2, v6, Luf/a;->w:Luf/u;

    iput-object v15, v6, Luf/a;->x:Lnf/e;

    iput-object v14, v6, Luf/a;->y:Lgf/b;

    iput-object v12, v6, Luf/a;->z:Ljava/lang/Object;

    move-object/from16 p1, v2

    const/4 v2, 0x0

    iput-object v2, v6, Luf/a;->E:Lgf/c;

    iput-object v9, v6, Luf/a;->F:Ljava/lang/Object;

    iput-object v1, v6, Luf/a;->G:Lgf/b;

    iput-object v2, v6, Luf/a;->H:Lqg/c;

    iput-wide v10, v6, Luf/a;->J:J

    const/4 v2, 0x3

    iput v2, v6, Luf/a;->M:I

    invoke-interface {v8, v4, v6}, Luf/f;->c(Luf/w;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v7, :cond_7

    goto/16 :goto_e

    :cond_7
    move-object v4, v2

    move-object v8, v9

    move-object/from16 v2, p1

    :goto_6
    check-cast v4, Lef/a;

    new-instance v9, Lkotlin/time/TimedValue;

    invoke-static {v10, v11}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v10

    move-object/from16 p1, v12

    const/4 v12, 0x0

    invoke-direct {v9, v4, v10, v11, v12}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lkotlin/time/TimedValue;->getDuration-UwyO8pc()J

    move-result-wide v10

    invoke-static {v8, v10, v11, v1, v12}, Le4/a;->M(Lqg/c;JLgf/b;Lng/f;)V

    invoke-virtual {v9}, Lkotlin/time/TimedValue;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lef/a;

    invoke-interface {v6}, Lq83/d;->getContext()Lq83/j;

    move-result-object v4

    new-instance v8, Lsc0/c;

    const/16 v9, 0x13

    invoke-direct {v8, v1, v9}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    sget-object v9, Log/b;->z:Log/b;

    const-class v10, Luf/b;

    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v10

    invoke-interface {v10}, Lj93/d;->getQualifiedName()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_c

    const/4 v12, 0x0

    invoke-static {v4, v9, v10, v12, v8}, Lvd/f;->A(Lq83/j;Log/b;Ljava/lang/String;Ljava/lang/Throwable;Lc93/a;)V

    invoke-static {v2, v1}, Lrv/n;->k(Luf/u;Lef/a;)V

    iget-object v4, v2, Luf/u;->a:Ldg/a;

    iget-object v1, v1, Lef/a;->b:Lgf/b;

    sget-object v8, Lef/b;->a:Lgf/a;

    invoke-interface {v1, v8}, Lgf/b;->b(Lgf/a;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    if-nez v8, :cond_8

    sget-object v8, Lm83/y;->w:Lm83/y;

    :cond_8
    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_9
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_a

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lue/a;

    iget-object v10, v10, Lue/a;->a:Ljava/lang/String;

    invoke-interface {v15}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    goto :goto_7

    :cond_a
    const/4 v9, 0x0

    :goto_7
    check-cast v9, Lue/a;

    if-eqz v9, :cond_b

    iget-object v9, v9, Lue/a;->b:Lgf/b;

    goto :goto_8

    :cond_b
    move-object/from16 v9, v17

    :goto_8
    invoke-static {v4, v9}, Ljc/x;->c0(Lgf/l;Lgf/b;)V

    invoke-static {v4, v1}, Ljc/x;->c0(Lgf/l;Lgf/b;)V

    move-object/from16 v1, p1

    goto :goto_9

    :cond_c
    new-instance v1, Ljava/lang/IllegalArgumentException;

    const-string v2, "log<T> cannot be used on an anonymous object"

    invoke-direct {v1, v2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_d
    move-object/from16 p1, v2

    move-object v13, v11

    move-object v1, v12

    :goto_9
    iget-object v4, v2, Luf/u;->b:Ljava/lang/Object;

    check-cast v4, Lvf/b;

    const-string v8, "<this>"

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v8, Lvf/g;

    const/4 v9, 0x1

    invoke-direct {v8, v4, v9}, Lvf/g;-><init>(Lvf/b;Z)V

    iput-object v2, v6, Luf/a;->w:Luf/u;

    iput-object v15, v6, Luf/a;->x:Lnf/e;

    iput-object v14, v6, Luf/a;->y:Lgf/b;

    iput-object v1, v6, Luf/a;->z:Ljava/lang/Object;

    const/4 v12, 0x0

    iput-object v12, v6, Luf/a;->E:Lgf/c;

    iput-object v12, v6, Luf/a;->F:Ljava/lang/Object;

    iput-object v12, v6, Luf/a;->G:Lgf/b;

    iput-object v12, v6, Luf/a;->H:Lqg/c;

    const/4 v4, 0x4

    iput v4, v6, Luf/a;->M:I

    invoke-virtual {v3, v8, v6}, La30/w0;->B(Lvf/g;Ls83/c;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_e

    goto/16 :goto_e

    :cond_e
    move-object v12, v2

    move-object v2, v4

    :goto_a
    check-cast v2, Lvf/a;

    invoke-static {v2}, Ls93/k;->i(Lvf/a;)Lvf/b;

    move-result-object v2

    invoke-static {v12, v2}, Luf/u;->a(Luf/u;Ljava/lang/Object;)Luf/u;

    move-result-object v2

    iget-object v4, v2, Luf/u;->b:Ljava/lang/Object;

    check-cast v4, Lvf/b;

    invoke-static {v4}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v8

    iput-object v8, v3, La30/w0;->F:Ljava/lang/Object;

    iget-object v8, v3, La30/w0;->E:Ljava/lang/Object;

    if-eqz v8, :cond_15

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, v16

    check-cast v8, Ljava/lang/Iterable;

    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_f

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lcf/a;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_b

    :cond_f
    new-instance v8, Lnf/k;

    iget-object v9, v2, Luf/u;->a:Ldg/a;

    invoke-direct {v8, v4, v1, v9}, Lnf/k;-><init>(Lvf/b;Lxf/a;Ldg/a;)V

    iget-object v1, v12, Luf/u;->a:Ldg/a;

    invoke-static {v1}, Lrs/b;->j(Ldg/a;)Luf/t;

    move-result-object v1

    iget-object v1, v1, Luf/t;->k:Lqg/c;

    sget-object v4, Lkotlin/time/TimeSource$Monotonic;->INSTANCE:Lkotlin/time/TimeSource$Monotonic;

    invoke-virtual {v4}, Lkotlin/time/TimeSource$Monotonic;->markNow-z9LOYto()J

    move-result-wide v9

    invoke-interface {v15}, Lnf/e;->b()Lnf/i;

    move-result-object v4

    iput-object v12, v6, Luf/a;->w:Luf/u;

    iput-object v15, v6, Luf/a;->x:Lnf/e;

    const/4 v11, 0x0

    iput-object v11, v6, Luf/a;->y:Lgf/b;

    iput-object v11, v6, Luf/a;->z:Ljava/lang/Object;

    iput-object v11, v6, Luf/a;->E:Lgf/c;

    iput-object v2, v6, Luf/a;->F:Ljava/lang/Object;

    iput-object v11, v6, Luf/a;->G:Lgf/b;

    iput-object v1, v6, Luf/a;->H:Lqg/c;

    iput-object v14, v6, Luf/a;->I:Lgf/b;

    iput-wide v9, v6, Luf/a;->J:J

    const/4 v11, 0x5

    iput v11, v6, Luf/a;->M:I

    invoke-interface {v4, v8, v6}, Lnf/i;->a(Lnf/k;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_10

    goto/16 :goto_e

    :cond_10
    move-object v8, v12

    move-object v12, v1

    move-object v1, v14

    move-object v14, v8

    move-wide v8, v9

    :goto_c
    new-instance v4, Lkotlin/time/TimedValue;

    invoke-static {v8, v9}, Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;->elapsedNow-UwyO8pc(J)J

    move-result-wide v8

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    const/4 v11, 0x0

    invoke-direct {v4, v10, v8, v9, v11}, Lkotlin/time/TimedValue;-><init>(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lkotlin/time/TimedValue;->getDuration-UwyO8pc()J

    move-result-wide v8

    invoke-static {v12, v8, v9, v1, v11}, Le4/a;->M(Lqg/c;JLgf/b;Lng/f;)V

    invoke-virtual {v4}, Lkotlin/time/TimedValue;->getValue()Ljava/lang/Object;

    invoke-interface {v15}, Lnf/e;->c()Ljava/lang/String;

    move-result-object v1

    const-string v4, "aws.auth#sigv4a"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_11

    iget-object v1, v14, Luf/u;->a:Ldg/a;

    sget-object v4, Lbf/c;->F:Lbf/c;

    invoke-static {v1, v4}, Lbf/b;->b(Ldg/a;Lbf/a;)V

    :cond_11
    iget-object v1, v2, Luf/u;->b:Ljava/lang/Object;

    check-cast v1, Lvf/b;

    invoke-static {v1}, Ls93/h;->s(Lvf/b;)Lvf/g;

    move-result-object v1

    iput-object v1, v3, La30/w0;->F:Ljava/lang/Object;

    iget-object v1, v3, La30/w0;->E:Ljava/lang/Object;

    if-eqz v1, :cond_14

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, v16

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcf/a;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    goto :goto_d

    :cond_12
    const/4 v12, 0x0

    iput-object v12, v6, Luf/a;->w:Luf/u;

    iput-object v12, v6, Luf/a;->x:Lnf/e;

    iput-object v12, v6, Luf/a;->y:Lgf/b;

    iput-object v12, v6, Luf/a;->z:Ljava/lang/Object;

    iput-object v12, v6, Luf/a;->E:Lgf/c;

    iput-object v12, v6, Luf/a;->F:Ljava/lang/Object;

    iput-object v12, v6, Luf/a;->G:Lgf/b;

    iput-object v12, v6, Luf/a;->H:Lqg/c;

    iput-object v12, v6, Luf/a;->I:Lgf/b;

    const/4 v1, 0x6

    iput v1, v6, Luf/a;->M:I

    iget-object v1, v0, Luf/b;->a:Luf/e;

    invoke-virtual {v1, v2, v6}, Luf/e;->b(Luf/u;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_13

    :goto_e
    return-object v7

    :cond_13
    return-object v1

    :cond_14
    new-instance v1, Ljava/lang/IllegalStateException;

    move-object/from16 v2, v18

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_15
    move-object/from16 v2, v18

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_16
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "auth scheme "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v2}, Lue/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " not configured"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_17
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "no auth scheme found for operation; candidates: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

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
