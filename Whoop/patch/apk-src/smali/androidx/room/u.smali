.class public final synthetic Landroidx/room/u;
.super Lkotlin/jvm/internal/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V
    .locals 0

    iput p7, p0, Landroidx/room/u;->w:I

    move-object p7, p4

    move-object p4, p3

    move p3, p6

    move-object p6, p7

    move-object p7, p5

    move-object p5, p2

    move p2, p1

    move-object p1, p0

    invoke-direct/range {p1 .. p7}, Lkotlin/jvm/internal/h;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 19

    move-object/from16 v1, p0

    iget v0, v1, Landroidx/room/u;->w:I

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x4

    const/4 v7, 0x0

    const-string v8, "p0"

    packed-switch v0, :pswitch_data_0

    move-object/from16 v0, p1

    check-cast v0, La63/f0;

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lz53/g;

    iget-object v2, v2, Lz53/g;->y:Lz53/b;

    iget-object v3, v2, Lz53/b;->b:Lud3/l0;

    if-nez v3, :cond_0

    sget-object v3, Lz53/g;->I:Ll83/p;

    invoke-virtual {v3}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lud3/l0;

    :cond_0
    invoke-virtual {v3}, Lud3/l0;->a()Lud3/k0;

    move-result-object v3

    new-instance v4, Lud3/u;

    invoke-direct {v4}, Lud3/u;-><init>()V

    iput-object v4, v3, Lud3/k0;->a:Lud3/u;

    iget-object v2, v2, Lz53/b;->a:Lz53/a;

    invoke-virtual {v2, v3}, Lz53/a;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v0, :cond_5

    iget-object v2, v0, La63/f0;->b:Ljava/lang/Long;

    const-wide v4, 0x7fffffffffffffffL

    const-wide/16 v6, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v2, v8, v4

    if-nez v2, :cond_1

    move-wide v8, v6

    :cond_1
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v8, v9, v2}, Lud3/k0;->b(JLjava/util/concurrent/TimeUnit;)V

    :cond_2
    iget-object v0, v0, La63/f0;->c:Ljava/lang/Long;

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    cmp-long v0, v8, v4

    if-nez v0, :cond_3

    move-wide v4, v6

    goto :goto_0

    :cond_3
    move-wide v4, v8

    :goto_0
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v3, v4, v5, v2}, Lud3/k0;->e(JLjava/util/concurrent/TimeUnit;)V

    if-nez v0, :cond_4

    goto :goto_1

    :cond_4
    move-wide v6, v8

    :goto_1
    invoke-virtual {v3, v6, v7, v2}, Lud3/k0;->f(JLjava/util/concurrent/TimeUnit;)V

    :cond_5
    new-instance v0, Lud3/l0;

    invoke-direct {v0, v3}, Lud3/l0;-><init>(Lud3/k0;)V

    return-object v0

    :pswitch_0
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lvg/n;

    check-cast v2, Lvg/r;

    invoke-virtual {v2, v0}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_1
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lvg/n;

    check-cast v2, Lvg/r;

    invoke-virtual {v2, v0}, Lvg/r;->b(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_2
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lvg/n;

    check-cast v2, Lvg/r;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_3
    move-object/from16 v0, p1

    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lrf/m;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v2, Lrf/o;

    new-instance v3, Lrf/r;

    new-instance v4, Lrf/q;

    invoke-direct {v4}, Lrf/q;-><init>()V

    invoke-interface {v0, v4}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {v3, v4}, Lrf/r;-><init>(Lrf/q;)V

    invoke-direct {v2, v3, v7}, Lrf/o;-><init>(Lrf/r;Lud3/l0;)V

    return-object v2

    :pswitch_4
    invoke-static/range {p1 .. p1}, Lr;->t(Ljava/lang/Object;)V

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lqf/b;

    iget-wide v2, v0, Lqf/b;->F:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lqf/a;->b()Lgf/c;

    move-result-object v2

    invoke-static {v0, v2, v6}, Lqg/a;->a(Ljava/lang/Long;Lgf/c;I)V

    throw v7

    :pswitch_5
    invoke-static/range {p1 .. p1}, Lr;->t(Ljava/lang/Object;)V

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v0, Lqf/b;

    iget-wide v2, v0, Lqf/b;->x:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {}, Lqf/a;->a()Lgf/c;

    move-result-object v2

    invoke-static {v0, v2, v6}, Lqg/a;->a(Ljava/lang/Long;Lgf/c;I)V

    throw v7

    :pswitch_6
    move-object/from16 v0, p1

    check-cast v0, Lq83/d;

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lme/d;

    iget-object v2, v2, Lme/d;->w:Ll83/h;

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbe/m;

    const-string v3, "/latest/meta-data/placement/region"

    check-cast v2, Lbe/g;

    invoke-virtual {v2, v3, v0}, Lbe/g;->b(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_7
    move-object/from16 v0, p1

    check-cast v0, Lob3/g;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lmb3/e;

    invoke-virtual {v2, v0}, Lmb3/e;->a(Lob3/g;)Llb3/f1;

    move-result-object v0

    return-object v0

    :pswitch_8
    move-object/from16 v0, p1

    check-cast v0, Lmb3/f;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Ljb3/g;

    iget-object v3, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v3, Ljb3/h;

    invoke-direct {v2, v3, v0}, Ljb3/g;-><init>(Ljb3/h;Lmb3/f;)V

    return-object v2

    :pswitch_9
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lj1/l;

    invoke-virtual {v2}, Lj1/l;->b()Z

    move-result v4

    iget-object v5, v2, Lj1/l;->f:Lp1/g1;

    iget-object v7, v2, Lj1/l;->g:Lp1/g1;

    const/4 v8, 0x0

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v4

    add-float/2addr v4, v0

    cmpg-float v0, v4, v8

    if-gez v0, :cond_7

    move v4, v8

    :cond_7
    invoke-virtual {v5}, Lp1/g1;->x()F

    move-result v0

    sub-float v0, v4, v0

    invoke-virtual {v5, v4}, Lp1/g1;->y(F)V

    invoke-virtual {v2}, Lj1/l;->a()F

    move-result v4

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v5

    cmpg-float v4, v4, v5

    if-gtz v4, :cond_8

    invoke-virtual {v2}, Lj1/l;->a()F

    move-result v3

    goto :goto_3

    :cond_8
    invoke-virtual {v2}, Lj1/l;->a()F

    move-result v4

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v5

    div-float/2addr v4, v5

    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    move-result v4

    const/high16 v5, 0x3f800000    # 1.0f

    sub-float/2addr v4, v5

    cmpg-float v5, v4, v8

    if-gez v5, :cond_9

    goto :goto_2

    :cond_9
    move v8, v4

    :goto_2
    const/high16 v4, 0x40000000    # 2.0f

    cmpl-float v5, v8, v4

    if-lez v5, :cond_a

    move v8, v4

    :cond_a
    float-to-double v4, v8

    int-to-double v9, v3

    invoke-static {v4, v5, v9, v10}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v3

    double-to-float v3, v3

    int-to-float v4, v6

    div-float/2addr v3, v4

    sub-float/2addr v8, v3

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v3

    mul-float/2addr v3, v8

    invoke-virtual {v7}, Lp1/g1;->x()F

    move-result v4

    add-float/2addr v3, v4

    :goto_3
    iget-object v2, v2, Lj1/l;->e:Lp1/g1;

    invoke-virtual {v2, v3}, Lp1/g1;->y(F)V

    move v8, v0

    :goto_4
    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    return-object v0

    :pswitch_a
    move-object/from16 v0, p1

    check-cast v0, Laws/smithy/kotlin/runtime/SdkBaseException;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lgg/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Laws/smithy/kotlin/runtime/SdkBaseException;->a()Lte/c;

    move-result-object v0

    invoke-virtual {v0}, Lte/c;->d()Z

    move-result v2

    if-eqz v2, :cond_b

    new-instance v7, Lgg/b;

    sget-object v0, Lgg/f;->y:Lgg/f;

    invoke-direct {v7, v0}, Lgg/b;-><init>(Lgg/f;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v0}, Lte/c;->c()Z

    move-result v0

    if-eqz v0, :cond_c

    new-instance v7, Lgg/b;

    sget-object v0, Lgg/f;->z:Lgg/f;

    invoke-direct {v7, v0}, Lgg/b;-><init>(Lgg/f;)V

    :cond_c
    :goto_5
    return-object v7

    :pswitch_b
    move-object/from16 v0, p1

    check-cast v0, Laws/smithy/kotlin/runtime/ClientException;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lgg/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v0, v0, Laws/smithy/kotlin/runtime/SdkBaseException;->w:Lte/c;

    invoke-virtual {v0}, Lte/c;->c()Z

    move-result v0

    if-eqz v0, :cond_d

    new-instance v7, Lgg/b;

    sget-object v0, Lgg/f;->x:Lgg/f;

    invoke-direct {v7, v0}, Lgg/b;-><init>(Lgg/f;)V

    :cond_d
    return-object v7

    :pswitch_c
    move-object/from16 v0, p1

    check-cast v0, Laws/smithy/kotlin/runtime/ServiceException;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lgg/h;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0}, Laws/smithy/kotlin/runtime/ServiceException;->b()Lte/e;

    move-result-object v0

    invoke-virtual {v0}, Lte/c;->c()Z

    move-result v2

    if-eqz v2, :cond_e

    invoke-virtual {v0}, Lte/e;->g()Lte/f;

    move-result-object v2

    sget-object v3, Lte/f;->x:Lte/f;

    if-ne v2, v3, :cond_e

    new-instance v7, Lgg/b;

    sget-object v0, Lgg/f;->w:Lgg/f;

    invoke-direct {v7, v0}, Lgg/b;-><init>(Lgg/f;)V

    goto :goto_6

    :cond_e
    invoke-virtual {v0}, Lte/c;->c()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-virtual {v0}, Lte/e;->g()Lte/f;

    move-result-object v0

    sget-object v2, Lte/f;->w:Lte/f;

    if-ne v0, v2, :cond_f

    new-instance v7, Lgg/b;

    sget-object v0, Lgg/f;->x:Lgg/f;

    invoke-direct {v7, v0}, Lgg/b;-><init>(Lgg/f;)V

    :cond_f
    :goto_6
    return-object v7

    :pswitch_d
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lgg/h;

    invoke-virtual {v2, v0}, Lgg/h;->a(Ljava/lang/Throwable;)Lgg/e;

    move-result-object v0

    return-object v0

    :pswitch_e
    move-object/from16 v0, p1

    check-cast v0, Lq83/d;

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lme/b;

    invoke-static {v2, v0}, Lme/b;->h(Lme/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :pswitch_f
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    iget-object v5, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v5, Lf0/h;

    iget-object v6, v5, Lf0/h;->d0:La0/k0;

    if-eqz v0, :cond_10

    invoke-virtual {v5}, Lf0/h;->f1()V

    goto/16 :goto_b

    :cond_10
    iget-object v0, v5, Lf0/h;->Q:Lj0/i;

    if-eqz v0, :cond_14

    iget-object v0, v6, La0/k0;->c:[Ljava/lang/Object;

    iget-object v8, v6, La0/k0;->a:[J

    array-length v9, v8

    sub-int/2addr v9, v3

    if-ltz v9, :cond_14

    move v3, v4

    :goto_7
    aget-wide v10, v8, v3

    not-long v12, v10

    const/4 v14, 0x7

    shl-long/2addr v12, v14

    and-long/2addr v12, v10

    const-wide v14, -0x7f7f7f7f7f7f7f80L    # -2.937446524422997E-306

    and-long/2addr v12, v14

    cmp-long v12, v12, v14

    if-eqz v12, :cond_13

    sub-int v12, v3, v9

    not-int v12, v12

    ushr-int/lit8 v12, v12, 0x1f

    const/16 v13, 0x8

    rsub-int/lit8 v12, v12, 0x8

    move v14, v4

    :goto_8
    if-ge v14, v12, :cond_12

    const-wide/16 v15, 0xff

    and-long/2addr v15, v10

    const-wide/16 v17, 0x80

    cmp-long v15, v15, v17

    if-gez v15, :cond_11

    shl-int/lit8 v15, v3, 0x3

    add-int/2addr v15, v14

    aget-object v15, v0, v15

    check-cast v15, Lj0/l;

    move/from16 p1, v13

    invoke-virtual {v5}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v13

    move-object/from16 v16, v0

    new-instance v0, Lf0/f;

    invoke-direct {v0, v5, v15, v7, v4}, Lf0/f;-><init>(Lf0/h;Lj0/l;Lq83/d;I)V

    invoke-static {v13, v7, v7, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_9

    :cond_11
    move-object/from16 v16, v0

    move/from16 p1, v13

    :goto_9
    shr-long v10, v10, p1

    add-int/lit8 v14, v14, 0x1

    move/from16 v13, p1

    move-object/from16 v0, v16

    goto :goto_8

    :cond_12
    move-object/from16 v16, v0

    move v0, v13

    if-ne v12, v0, :cond_14

    goto :goto_a

    :cond_13
    move-object/from16 v16, v0

    :goto_a
    if-eq v3, v9, :cond_14

    add-int/lit8 v3, v3, 0x1

    move-object/from16 v0, v16

    goto :goto_7

    :cond_14
    invoke-virtual {v6}, La0/k0;->a()V

    invoke-virtual {v5}, Lf0/h;->g1()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_10
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v8, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v8, Lcf/b;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, Lcf/d;->f:Lcf/d;

    sget-object v9, Lcf/c;->e:Lcf/c;

    sget-object v10, Lcf/d;->e:Lcf/d;

    sget-object v11, Lcf/d;->d:Lcf/d;

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v12, "|"

    filled-new-array {v12}, [Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x6

    invoke-static {v0, v12, v13}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    const/16 v13, 0xa

    invoke-static {v0, v13}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v13

    invoke-direct {v12, v13}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/String;

    new-array v14, v6, [Lcf/e;

    aput-object v11, v14, v4

    aput-object v10, v14, v5

    aput-object v9, v14, v3

    aput-object v8, v14, v2

    invoke-static {v14}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    :goto_d
    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v15

    if-eqz v15, :cond_16

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v16, v15

    check-cast v16, Lcf/e;

    move/from16 v17, v3

    invoke-virtual/range {v16 .. v16}, Lcf/e;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v13, v3, v5}, Lyb3/y;->F(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v3

    if-eqz v3, :cond_15

    goto :goto_e

    :cond_15
    move/from16 v3, v17

    goto :goto_d

    :cond_16
    move/from16 v17, v3

    move-object v15, v7

    :goto_e
    check-cast v15, Lcf/e;

    if-eqz v15, :cond_17

    invoke-virtual {v12, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v3, v17

    goto :goto_c

    :cond_17
    new-instance v0, Laws/smithy/kotlin/runtime/ClientException;

    const-string v3, "Log mode "

    const-string v7, " is not supported, should be one or more of: "

    invoke-static {v3, v13, v7}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v3

    new-array v6, v6, [Lcf/e;

    aput-object v11, v6, v4

    aput-object v10, v6, v5

    aput-object v9, v6, v17

    aput-object v8, v6, v2

    invoke-static {v6}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ljava/lang/Iterable;

    const/4 v8, 0x0

    const/16 v9, 0x3e

    const-string v5, ", "

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Laws/smithy/kotlin/runtime/SdkBaseException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    :goto_f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcf/e;

    check-cast v3, Lcf/e;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string v5, "mode"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v5, Lcf/d;

    iget v3, v3, Lcf/e;->a:I

    iget v4, v4, Lcf/e;->a:I

    or-int/2addr v3, v4

    invoke-direct {v5, v3, v2}, Lcf/d;-><init>(II)V

    move-object v3, v5

    goto :goto_f

    :cond_19
    check-cast v3, Lcf/e;

    return-object v3

    :cond_1a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Empty collection can\'t be reduced."

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_11
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_12
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_13
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_14
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_15
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->d(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_16
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_17
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/String;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Ltg/e;

    invoke-interface {v2, v0}, Ltg/e;->c(Ljava/lang/String;)Ltg/b;

    move-result-object v0

    return-object v0

    :pswitch_18
    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Throwable;

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Lbc3/m1;

    invoke-virtual {v2, v0}, Lbc3/m1;->j(Ljava/lang/Throwable;)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :pswitch_19
    move-object/from16 v0, p1

    check-cast v0, Ljava/util/Set;

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v1, Lkotlin/jvm/internal/c;->receiver:Ljava/lang/Object;

    check-cast v2, Landroidx/room/v;

    iget-object v3, v2, Landroidx/room/v;->e:Ljava/util/concurrent/locks/ReentrantLock;

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->lock()V

    :try_start_0
    iget-object v2, v2, Landroidx/room/v;->d:Ljava/util/LinkedHashMap;

    invoke-virtual {v2}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_1b
    :goto_10
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_20

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroidx/room/i0;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, Lm83/a0;->w:Lm83/a0;

    iget-object v7, v3, Landroidx/room/i0;->b:[I

    array-length v8, v7

    if-eqz v8, :cond_1f

    if-eq v8, v5, :cond_1e

    new-instance v6, Ln83/i;

    invoke-direct {v6}, Ln83/i;-><init>()V

    array-length v8, v7

    move v9, v4

    move v10, v9

    :goto_11
    if-ge v9, v8, :cond_1d

    aget v11, v7, v9

    add-int/lit8 v12, v10, 0x1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1c

    iget-object v11, v3, Landroidx/room/i0;->c:[Ljava/lang/String;

    aget-object v10, v11, v10

    invoke-virtual {v6, v10}, Ln83/i;->add(Ljava/lang/Object;)Z

    :cond_1c
    add-int/lit8 v9, v9, 0x1

    move v10, v12

    goto :goto_11

    :cond_1d
    invoke-static {v6}, Ldt/b;->g(Ln83/i;)Ln83/i;

    move-result-object v6

    goto :goto_12

    :cond_1e
    aget v7, v7, v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-interface {v0, v7}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1f

    iget-object v6, v3, Landroidx/room/i0;->d:Ljava/util/Set;

    :cond_1f
    :goto_12
    move-object v7, v6

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_1b

    iget-object v3, v3, Landroidx/room/i0;->a:Landroidx/room/s;

    invoke-virtual {v3, v6}, Landroidx/room/s;->a(Ljava/util/Set;)V

    goto :goto_10

    :cond_20
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    invoke-virtual {v3}, Ljava/util/concurrent/locks/ReentrantLock;->unlock()V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
