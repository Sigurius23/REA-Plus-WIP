.class public final Lrv/a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public synthetic E:Ljava/lang/Object;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Ljava/lang/Object;

.field public y:J

.field public z:I


# direct methods
.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/location/DeviceLocationProvider;Lm63/d;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lrv/a;->w:I

    .line 1
    iput-object p1, p0, Lrv/a;->E:Ljava/lang/Object;

    iput-object p2, p0, Lrv/a;->F:Ljava/lang/Object;

    iput-object p3, p0, Lrv/a;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/BufferedReader;[CLjava/lang/StringBuilder;JLjava/lang/Process;Lq83/d;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lrv/a;->w:I

    .line 2
    iput-object p1, p0, Lrv/a;->x:Ljava/lang/Object;

    iput-object p2, p0, Lrv/a;->E:Ljava/lang/Object;

    iput-object p3, p0, Lrv/a;->F:Ljava/lang/Object;

    iput-wide p4, p0, Lrv/a;->y:J

    iput-object p6, p0, Lrv/a;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lv10/g;Lv10/b;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lrv/a;->w:I

    .line 3
    iput-object p1, p0, Lrv/a;->F:Ljava/lang/Object;

    iput-object p2, p0, Lrv/a;->G:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 9

    iget v0, p0, Lrv/a;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lrv/a;

    iget-object p1, p0, Lrv/a;->x:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/io/BufferedReader;

    iget-object p1, p0, Lrv/a;->E:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, [C

    iget-object p1, p0, Lrv/a;->F:Ljava/lang/Object;

    move-object v4, p1

    check-cast v4, Ljava/lang/StringBuilder;

    iget-wide v5, p0, Lrv/a;->y:J

    iget-object p1, p0, Lrv/a;->G:Ljava/lang/Object;

    move-object v7, p1

    check-cast v7, Ljava/lang/Process;

    move-object v8, p2

    invoke-direct/range {v1 .. v8}, Lrv/a;-><init>(Ljava/io/BufferedReader;[CLjava/lang/StringBuilder;JLjava/lang/Process;Lq83/d;)V

    return-object v1

    :pswitch_0
    move-object v8, p2

    new-instance p2, Lrv/a;

    iget-object v0, p0, Lrv/a;->F:Ljava/lang/Object;

    check-cast v0, Lv10/g;

    iget-object v1, p0, Lrv/a;->G:Ljava/lang/Object;

    check-cast v1, Lv10/b;

    invoke-direct {p2, v0, v1, v8}, Lrv/a;-><init>(Lv10/g;Lv10/b;Lq83/d;)V

    iput-object p1, p2, Lrv/a;->E:Ljava/lang/Object;

    return-object p2

    :pswitch_1
    move-object v8, p2

    new-instance p2, Lrv/a;

    iget-object v0, p0, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, Landroid/content/Context;

    iget-object v1, p0, Lrv/a;->F:Ljava/lang/Object;

    check-cast v1, Lcom/mapbox/common/location/DeviceLocationProvider;

    iget-object v2, p0, Lrv/a;->G:Ljava/lang/Object;

    check-cast v2, Lm63/d;

    invoke-direct {p2, v0, v1, v2, v8}, Lrv/a;-><init>(Landroid/content/Context;Lcom/mapbox/common/location/DeviceLocationProvider;Lm63/d;Lq83/d;)V

    iput-object p1, p2, Lrv/a;->x:Ljava/lang/Object;

    return-object p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lrv/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrv/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrv/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Ldc3/u;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lrv/a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lrv/a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lrv/a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v7, p0

    iget v0, v7, Lrv/a;->w:I

    iget-object v1, v7, Lrv/a;->G:Ljava/lang/Object;

    const/4 v8, -0x1

    const/4 v9, 0x2

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    const/4 v3, 0x0

    const/4 v10, 0x1

    iget-object v4, v7, Lrv/a;->F:Ljava/lang/Object;

    packed-switch v0, :pswitch_data_0

    iget-wide v5, v7, Lrv/a;->y:J

    check-cast v4, Ljava/lang/StringBuilder;

    iget-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, [C

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v11, v7, Lrv/a;->z:I

    if-eqz v11, :cond_1

    if-ne v11, v10, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_0
    iget-object v2, v7, Lrv/a;->x:Ljava/lang/Object;

    check-cast v2, Ljava/io/BufferedReader;

    invoke-virtual {v2, v0}, Ljava/io/Reader;->read([C)I

    move-result v2

    if-eq v2, v8, :cond_3

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append([C)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    int-to-long v11, v2

    cmp-long v2, v11, v5

    if-gtz v2, :cond_2

    goto :goto_0

    :cond_2
    new-instance v0, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;

    const-string v1, "Process output exceeded limit of "

    const-string v2, " bytes"

    invoke-static {v5, v6, v1, v2}, Lr80/c;->l(JLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v3, v1}, Laws/smithy/kotlin/runtime/auth/awscredentials/CredentialsProviderException;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v0

    :cond_3
    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v2, La13/h;

    check-cast v1, Ljava/lang/Process;

    const/16 v4, 0x15

    invoke-direct {v2, v1, v3, v4}, La13/h;-><init>(Ljava/lang/Object;Lq83/d;I)V

    iput v10, v7, Lrv/a;->z:I

    invoke-static {v0, v2, v7}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_4

    move-object v0, v9

    :cond_4
    :goto_1
    return-object v0

    :pswitch_0
    check-cast v4, Lv10/g;

    iget-object v5, v4, Lv10/g;->e:Lgm/j;

    const-string v6, "Canceling source \'"

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v0, v7, Lrv/a;->z:I

    const/4 v12, 0x4

    const/4 v13, 0x3

    if-eqz v0, :cond_9

    if-eq v0, v10, :cond_8

    if-eq v0, v9, :cond_7

    if-eq v0, v13, :cond_6

    if-ne v0, v12, :cond_5

    iget-object v0, v7, Lrv/a;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv10/g;

    iget-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, Lv10/c;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_c

    :catchall_0
    move-exception v0

    goto/16 :goto_f

    :cond_5
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_6
    iget-object v0, v7, Lrv/a;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv10/g;

    iget-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, Lv10/c;

    :try_start_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto/16 :goto_6

    :cond_7
    iget-object v0, v7, Lrv/a;->x:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lv10/g;

    iget-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, Lv10/c;

    :try_start_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    check-cast v1, Ll83/n;

    iget-object v1, v1, Ll83/n;->w:Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto/16 :goto_5

    :cond_8
    iget-wide v0, v7, Lrv/a;->y:J

    iget-object v2, v7, Lrv/a;->x:Ljava/lang/Object;

    check-cast v2, Lyy/f;

    iget-object v14, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v14, Lv10/c;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v15, p1

    check-cast v15, Ll83/n;

    iget-object v15, v15, Ll83/n;->w:Ljava/lang/Object;

    move-wide/from16 v16, v0

    move-object v0, v14

    :goto_2
    move-object v8, v6

    move-object v1, v5

    move-wide/from16 v5, v16

    goto :goto_4

    :cond_9
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    check-cast v1, Lv10/b;

    :try_start_3
    invoke-virtual {v1}, Lv10/b;->f()Lv10/c;

    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_3
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v1

    if-nez v1, :cond_1c

    check-cast v0, Lv10/c;

    new-instance v2, Lyy/f;

    iget-object v1, v4, Lv10/g;->a:Lk83/a;

    invoke-interface {v1}, Lk83/a;->get()Ljava/lang/Object;

    move-result-object v1

    const-string v14, "get(...)"

    invoke-static {v1, v14}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Ljava/lang/String;

    iget-object v14, v0, Lv10/c;->f:Ljava/lang/String;

    invoke-direct {v2, v1, v14, v12}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v14

    iget-object v1, v0, Lv10/c;->a:Ljava/lang/String;

    sget-object v8, Lv10/g;->f:Ljava/util/List;

    iput-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    iput-object v2, v7, Lrv/a;->x:Ljava/lang/Object;

    iput-wide v14, v7, Lrv/a;->y:J

    iput v10, v7, Lrv/a;->z:I

    invoke-virtual {v4, v1, v2, v8, v7}, Lv10/g;->g(Ljava/lang/String;Lyy/f;Ljava/util/List;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_a

    goto/16 :goto_11

    :cond_a
    move-wide/from16 v16, v14

    move-object v15, v1

    goto :goto_2

    :goto_4
    instance-of v14, v15, Ll83/m;

    if-nez v14, :cond_1b

    :try_start_4
    check-cast v15, Ly00/c8;

    invoke-interface {v15}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v14

    sget-object v12, Lcom/stripe/android/model/StripeIntent$Status;->G:Lcom/stripe/android/model/StripeIntent$Status;

    if-eq v14, v12, :cond_1a

    invoke-interface {v15}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v12

    sget-object v14, Lcom/stripe/android/model/StripeIntent$Status;->H:Lcom/stripe/android/model/StripeIntent$Status;

    if-ne v12, v14, :cond_b

    goto/16 :goto_d

    :cond_b
    iget v12, v0, Lv10/c;->b:I

    invoke-static {v4, v15, v12}, Lv10/g;->b(Lv10/g;Ly00/c8;I)Z

    move-result v12

    if-eqz v12, :cond_12

    invoke-interface {v15}, Ly00/c8;->Y()Ly00/o4;

    move-result-object v1

    if-eqz v1, :cond_c

    iget-object v1, v1, Ly00/o4;->E:Ly00/f4;

    if-eqz v1, :cond_c

    iget-object v3, v1, Ly00/f4;->F:Ly00/q3;

    :cond_c
    instance-of v1, v3, Ly00/p3;

    if-eqz v1, :cond_e

    iget-object v1, v0, Lv10/c;->a:Ljava/lang/String;

    iput-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    iput-object v4, v7, Lrv/a;->x:Ljava/lang/Object;

    iput v9, v7, Lrv/a;->z:I

    invoke-virtual {v4, v1, v2, v7}, Lv10/g;->f(Ljava/lang/String;Lyy/f;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_d

    goto/16 :goto_11

    :cond_d
    :goto_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ly00/c8;

    goto :goto_7

    :cond_e
    iget-object v3, v0, Lv10/c;->a:Ljava/lang/String;

    iput-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    iput-object v4, v7, Lrv/a;->x:Ljava/lang/Object;

    iput v13, v7, Lrv/a;->z:I

    move-object v1, v4

    move-object v4, v2

    move-object v2, v15

    invoke-static/range {v1 .. v7}, Lv10/g;->a(Lv10/g;Ly00/c8;Ljava/lang/String;Lyy/f;JLs83/c;)Ljava/lang/Object;

    move-result-object v2

    move-object v4, v1

    if-ne v2, v11, :cond_f

    goto/16 :goto_11

    :cond_f
    move-object v1, v2

    :goto_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ly00/c8;

    :goto_7
    iget v2, v0, Lv10/c;->b:I

    sget-object v3, Lv10/g;->f:Ljava/util/List;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {v1}, Ly00/c8;->c()Lcom/stripe/android/model/StripeIntent$Status;

    move-result-object v3

    if-nez v3, :cond_10

    const/4 v8, -0x1

    goto :goto_8

    :cond_10
    sget-object v5, Lv10/d;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v8, v5, v3

    :goto_8
    if-eq v8, v10, :cond_11

    if-eq v8, v9, :cond_11

    move v10, v2

    :cond_11
    iget-object v2, v4, Lv10/g;->e:Lgm/j;

    iget v0, v0, Lv10/c;->b:I

    invoke-virtual {v2, v1, v0}, Lgm/j;->c(Ly00/c8;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v1, v10, v0}, Lv10/g;->d(Ly00/c8;ILjava/lang/String;)Lux/m0;

    move-result-object v0

    goto/16 :goto_e

    :cond_12
    iget-boolean v5, v0, Lv10/c;->c:Z

    if-eqz v5, :cond_19

    invoke-interface {v15}, Ly00/c8;->z()Z

    move-result v5

    if-eqz v5, :cond_19

    iget-object v1, v0, Lv10/c;->d:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    const-string v5, ""

    if-nez v1, :cond_13

    move-object v1, v5

    :cond_13
    :try_start_5
    iget-object v6, v4, Lv10/g;->c:Lqy/d;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v9

    invoke-virtual {v9}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v9

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\' for \'"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "\'"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6, v8}, Lqy/d;->a(Ljava/lang/String;)V

    invoke-interface {v15}, Ly00/c8;->m()Ly00/b8;

    move-result-object v6

    instance-of v8, v6, Ly00/v7;

    if-eqz v8, :cond_14

    check-cast v6, Ly00/v7;

    goto :goto_9

    :cond_14
    move-object v6, v3

    :goto_9
    if-eqz v6, :cond_16

    iget-object v8, v6, Ly00/v7;->E:Ljava/lang/String;

    if-nez v8, :cond_15

    goto :goto_a

    :cond_15
    move-object v5, v8

    goto :goto_b

    :cond_16
    :goto_a
    invoke-interface {v15}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_15

    :goto_b
    if-eqz v6, :cond_17

    iget-object v6, v6, Ly00/v7;->F:Ljava/lang/String;

    if-eqz v6, :cond_17

    new-instance v2, Lyy/f;

    const/4 v8, 0x6

    invoke-direct {v2, v6, v3, v8}, Lyy/f;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    :cond_17
    iput-object v0, v7, Lrv/a;->E:Ljava/lang/Object;

    iput-object v4, v7, Lrv/a;->x:Ljava/lang/Object;

    const/4 v3, 0x4

    iput v3, v7, Lrv/a;->z:I

    invoke-virtual {v4, v5, v1, v7, v2}, Lv10/g;->c(Ljava/lang/String;Ljava/lang/String;Ls83/c;Lyy/f;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v11, :cond_18

    goto :goto_11

    :cond_18
    :goto_c
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v1, Ly00/c8;

    iget v0, v0, Lv10/c;->b:I

    iget-object v2, v4, Lv10/g;->e:Lgm/j;

    invoke-virtual {v2, v1, v0}, Lgm/j;->c(Ly00/c8;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1, v0, v2}, Lv10/g;->d(Ly00/c8;ILjava/lang/String;)Lux/m0;

    move-result-object v0

    goto :goto_e

    :cond_19
    iget v0, v0, Lv10/c;->b:I

    invoke-virtual {v1, v15, v0}, Lgm/j;->c(Ly00/c8;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v4, v15, v0, v1}, Lv10/g;->d(Ly00/c8;ILjava/lang/String;)Lux/m0;

    move-result-object v0

    goto :goto_e

    :cond_1a
    :goto_d
    iget v0, v0, Lv10/c;->b:I

    invoke-virtual {v1, v15, v0}, Lgm/j;->c(Ly00/c8;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v15, v10, v0}, Lv10/g;->d(Ly00/c8;ILjava/lang/String;)Lux/m0;

    move-result-object v0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :goto_e
    move-object v15, v0

    goto :goto_10

    :goto_f
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    goto :goto_e

    :cond_1b
    :goto_10
    new-instance v11, Ll83/n;

    invoke-direct {v11, v15}, Ll83/n;-><init>(Ljava/lang/Object;)V

    goto :goto_11

    :cond_1c
    invoke-static {v1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    new-instance v11, Ll83/n;

    invoke-direct {v11, v0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :goto_11
    return-object v11

    :pswitch_1
    check-cast v4, Lcom/mapbox/common/location/DeviceLocationProvider;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v7, Lrv/a;->z:I

    if-eqz v1, :cond_1f

    if-eq v1, v10, :cond_1e

    if-ne v1, v9, :cond_1d

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_14

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    iget-wide v1, v7, Lrv/a;->y:J

    iget-object v5, v7, Lrv/a;->x:Ljava/lang/Object;

    check-cast v5, Ldc3/u;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_16

    :cond_1f
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v7, Lrv/a;->x:Ljava/lang/Object;

    check-cast v1, Ldc3/u;

    const-wide/16 v5, 0x1f4

    move-wide/from16 v16, v5

    move-object v5, v1

    move-wide/from16 v1, v16

    :cond_20
    :goto_12
    iget-object v6, v7, Lrv/a;->E:Ljava/lang/Object;

    check-cast v6, Landroid/content/Context;

    const-string v8, "applicationContext"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v8, "android.permission.ACCESS_COARSE_LOCATION"

    invoke-static {v6, v8}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v8

    if-nez v8, :cond_21

    goto :goto_13

    :cond_21
    const-string v8, "android.permission.ACCESS_FINE_LOCATION"

    invoke-static {v6, v8}, Ls4/c;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    move-result v6

    if-nez v6, :cond_23

    :goto_13
    new-instance v1, Lrm/p;

    const/4 v2, 0x7

    invoke-direct {v1, v5, v2}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v4, v1}, Lcom/mapbox/common/location/LocationProvider;->getLastLocation(Lcom/mapbox/common/location/GetLocationCallback;)Lcom/mapbox/common/Cancelable;

    move-result-object v1

    new-instance v2, Lrv/i;

    invoke-direct {v2, v1, v5}, Lrv/i;-><init>(Lcom/mapbox/common/Cancelable;Ldc3/u;)V

    invoke-interface {v4, v2}, Lcom/mapbox/common/location/LocationProvider;->addLocationObserver(Lcom/mapbox/common/location/LocationObserver;)V

    new-instance v1, Lr5/c;

    invoke-direct {v1, v9, v4, v2}, Lr5/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput-object v3, v7, Lrv/a;->x:Ljava/lang/Object;

    iput v9, v7, Lrv/a;->z:I

    invoke-static {v5, v1, v7}, Lwb3/f;->h(Ldc3/u;Lc93/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_22

    goto :goto_15

    :cond_22
    :goto_14
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    goto :goto_15

    :cond_23
    const-string v6, "MapboxLocationProvider"

    const-string v8, "Missing location permission, location component will not take effect before location permission is granted."

    invoke-static {v6, v8}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    iput-object v5, v7, Lrv/a;->x:Ljava/lang/Object;

    iput-wide v1, v7, Lrv/a;->y:J

    iput v10, v7, Lrv/a;->z:I

    invoke-static {v1, v2, v7}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_24

    :goto_15
    return-object v0

    :cond_24
    :goto_16
    int-to-long v11, v9

    mul-long/2addr v1, v11

    const-wide/16 v11, 0x1388

    cmp-long v6, v1, v11

    if-lez v6, :cond_20

    move-wide v1, v11

    goto :goto_12

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
