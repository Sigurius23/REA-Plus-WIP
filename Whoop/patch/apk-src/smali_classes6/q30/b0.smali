.class public final Lq30/b0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public E:Ljava/lang/Object;

.field public final synthetic F:Ljava/io/Serializable;

.field public final synthetic G:Ljava/lang/Object;

.field public H:Ljava/lang/Object;

.field public final synthetic I:Ljava/lang/Object;

.field public final synthetic J:Ljava/lang/Object;

.field public final synthetic K:Ljava/lang/Object;

.field public final synthetic L:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lp6/l;Lp1/y1;Lkotlin/jvm/internal/f0;Lec3/h2;Landroid/content/Context;Lp6/m1;Lx6/u;Lx6/t;Lbc3/c0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lq30/b0;->w:I

    .line 1
    iput-object p1, p0, Lq30/b0;->z:Ljava/lang/Object;

    iput-object p2, p0, Lq30/b0;->E:Ljava/lang/Object;

    iput-object p3, p0, Lq30/b0;->F:Ljava/io/Serializable;

    iput-object p4, p0, Lq30/b0;->G:Ljava/lang/Object;

    iput-object p5, p0, Lq30/b0;->H:Ljava/lang/Object;

    iput-object p6, p0, Lq30/b0;->I:Ljava/lang/Object;

    iput-object p7, p0, Lq30/b0;->J:Ljava/lang/Object;

    iput-object p8, p0, Lq30/b0;->K:Ljava/lang/Object;

    iput-object p9, p0, Lq30/b0;->L:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p10}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Lq30/q0;Lev/i;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lq30/b0;->w:I

    .line 2
    iput-object p1, p0, Lq30/b0;->I:Ljava/lang/Object;

    iput-object p2, p0, Lq30/b0;->J:Ljava/lang/Object;

    iput-object p3, p0, Lq30/b0;->K:Ljava/lang/Object;

    iput-object p4, p0, Lq30/b0;->F:Ljava/io/Serializable;

    iput-object p5, p0, Lq30/b0;->G:Ljava/lang/Object;

    iput-object p6, p0, Lq30/b0;->L:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p7}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 12

    iget v0, p0, Lq30/b0;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lq30/b0;

    iget-object v0, p0, Lq30/b0;->z:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lp6/l;

    iget-object v0, p0, Lq30/b0;->E:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Lp1/y1;

    iget-object v0, p0, Lq30/b0;->F:Ljava/io/Serializable;

    move-object v4, v0

    check-cast v4, Lkotlin/jvm/internal/f0;

    iget-object v0, p0, Lq30/b0;->G:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lec3/h2;

    iget-object v0, p0, Lq30/b0;->H:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Landroid/content/Context;

    iget-object v0, p0, Lq30/b0;->I:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Lp6/m1;

    iget-object v0, p0, Lq30/b0;->J:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lx6/u;

    iget-object v0, p0, Lq30/b0;->K:Ljava/lang/Object;

    move-object v9, v0

    check-cast v9, Lx6/t;

    iget-object v0, p0, Lq30/b0;->L:Ljava/lang/Object;

    move-object v10, v0

    check-cast v10, Lbc3/c0;

    move-object v11, p2

    invoke-direct/range {v1 .. v11}, Lq30/b0;-><init>(Lp6/l;Lp1/y1;Lkotlin/jvm/internal/f0;Lec3/h2;Landroid/content/Context;Lp6/m1;Lx6/u;Lx6/t;Lbc3/c0;Lq83/d;)V

    iput-object p1, v1, Lq30/b0;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v9, p2

    new-instance v2, Lq30/b0;

    iget-object p2, p0, Lq30/b0;->I:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lq30/q0;

    iget-object p2, p0, Lq30/b0;->J:Ljava/lang/Object;

    move-object v4, p2

    check-cast v4, Lev/i;

    iget-object p2, p0, Lq30/b0;->K:Ljava/lang/Object;

    move-object v5, p2

    check-cast v5, Ljava/security/PublicKey;

    iget-object p2, p0, Lq30/b0;->F:Ljava/io/Serializable;

    move-object v6, p2

    check-cast v6, Ljava/lang/String;

    iget-object p2, p0, Lq30/b0;->G:Ljava/lang/Object;

    move-object v7, p2

    check-cast v7, Ljava/lang/String;

    iget-object p2, p0, Lq30/b0;->L:Ljava/lang/Object;

    move-object v8, p2

    check-cast v8, Ljava/security/PublicKey;

    invoke-direct/range {v2 .. v9}, Lq30/b0;-><init>(Lq30/q0;Lev/i;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;Ljava/security/PublicKey;Lq83/d;)V

    iput-object p1, v2, Lq30/b0;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lq30/b0;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lp1/w1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lq30/b0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq30/b0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq30/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lq30/b0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lq30/b0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lq30/b0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 32

    move-object/from16 v1, p0

    iget v0, v1, Lq30/b0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lq30/b0;->F:Ljava/io/Serializable;

    check-cast v0, Lkotlin/jvm/internal/f0;

    iget-object v2, v1, Lq30/b0;->E:Ljava/lang/Object;

    check-cast v2, Lp1/y1;

    iget-object v3, v1, Lq30/b0;->G:Ljava/lang/Object;

    check-cast v3, Lec3/h2;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v1, Lq30/b0;->x:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v5, :cond_2

    if-eq v5, v8, :cond_1

    if-ne v5, v7, :cond_0

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v5, p1

    goto :goto_1

    :cond_2
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v5, v1, Lq30/b0;->y:Ljava/lang/Object;

    check-cast v5, Lp1/w1;

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    if-eqz v5, :cond_8

    const/4 v9, 0x4

    if-eq v5, v9, :cond_3

    :goto_0
    move-object v4, v6

    goto :goto_3

    :cond_3
    iget-wide v9, v2, Lp1/y1;->a:J

    iget-wide v11, v0, Lkotlin/jvm/internal/f0;->w:J

    cmp-long v5, v9, v11

    if-gtz v5, :cond_4

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    if-nez v5, :cond_7

    :cond_4
    iget-object v5, v1, Lq30/b0;->z:Ljava/lang/Object;

    check-cast v5, Lp6/l;

    iget-object v9, v1, Lq30/b0;->H:Ljava/lang/Object;

    check-cast v9, Landroid/content/Context;

    iget-object v10, v1, Lq30/b0;->I:Ljava/lang/Object;

    check-cast v10, Lp6/m1;

    invoke-virtual {v10}, Lp6/m1;->a()Ln6/i;

    move-result-object v10

    check-cast v10, Ln6/k;

    iput v8, v1, Lq30/b0;->x:I

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v5, v9, v10, v1}, Lp6/l;->a(Lp6/l;Landroid/content/Context;Ln6/k;Ls83/c;)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v4, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v3}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-nez v8, :cond_7

    if-eqz v5, :cond_7

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    iput v7, v1, Lq30/b0;->x:I

    invoke-virtual {v3, v5, v1}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v6, v4, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object v3, v1, Lq30/b0;->J:Ljava/lang/Object;

    check-cast v3, Lx6/u;

    iget-object v4, v1, Lq30/b0;->K:Ljava/lang/Object;

    check-cast v4, Lx6/t;

    iget-wide v4, v4, Lx6/t;->a:J

    check-cast v3, Lx6/v;

    invoke-virtual {v3, v4, v5}, Lx6/v;->b(J)V

    :cond_7
    iget-wide v2, v2, Lp1/y1;->a:J

    iput-wide v2, v0, Lkotlin/jvm/internal/f0;->w:J

    goto :goto_0

    :cond_8
    iget-object v0, v1, Lq30/b0;->L:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lbc3/f0;->h(Lbc3/c0;Ljava/util/concurrent/CancellationException;)V

    goto :goto_0

    :goto_3
    return-object v4

    :pswitch_0
    iget-object v0, v1, Lq30/b0;->F:Ljava/io/Serializable;

    move-object v2, v0

    check-cast v2, Ljava/lang/String;

    iget-object v0, v1, Lq30/b0;->G:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljava/lang/String;

    iget-object v0, v1, Lq30/b0;->I:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Lq30/q0;

    iget-object v0, v1, Lq30/b0;->J:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Lev/i;

    sget-object v6, Lr83/a;->w:Lr83/a;

    iget v0, v1, Lq30/b0;->x:I

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v0, :cond_c

    if-eq v0, v8, :cond_b

    if-ne v0, v7, :cond_a

    iget-object v0, v1, Lq30/b0;->z:Ljava/lang/Object;

    check-cast v0, Ljava/io/Serializable;

    move-object v4, v0

    check-cast v4, Lq30/q0;

    iget-object v0, v1, Lq30/b0;->y:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v7, p1

    :cond_9
    move-object v11, v0

    move-object v12, v4

    goto/16 :goto_7

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    iget-object v0, v1, Lq30/b0;->H:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    iget-object v8, v1, Lq30/b0;->E:Ljava/lang/Object;

    check-cast v8, Ljava/lang/String;

    iget-object v10, v1, Lq30/b0;->z:Ljava/lang/Object;

    check-cast v10, Ljava/io/Serializable;

    check-cast v10, Ljava/lang/String;

    iget-object v11, v1, Lq30/b0;->y:Ljava/lang/Object;

    check-cast v11, Ljava/security/PublicKey;

    :try_start_0
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object v12, v11

    move-object v11, v10

    move-object v10, v8

    move-object/from16 v8, p1

    goto :goto_4

    :catchall_0
    move-exception v0

    goto :goto_5

    :cond_c
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v0, v1, Lq30/b0;->y:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    iget-object v0, v1, Lq30/b0;->L:Ljava/lang/Object;

    move-object v11, v0

    check-cast v11, Ljava/security/PublicKey;

    :try_start_1
    iget-object v0, v5, Lev/i;->e:Ljava/lang/Object;

    check-cast v0, Lgm/r;

    iput-object v11, v1, Lq30/b0;->y:Ljava/lang/Object;

    iput-object v3, v1, Lq30/b0;->z:Ljava/lang/Object;

    iput-object v2, v1, Lq30/b0;->E:Ljava/lang/Object;

    iput-object v0, v1, Lq30/b0;->H:Ljava/lang/Object;

    iput v8, v1, Lq30/b0;->x:I

    invoke-virtual {v5, v4, v1}, Lev/i;->d(Lq30/q0;Ls83/c;)Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_d

    goto/16 :goto_f

    :cond_d
    move-object v10, v2

    move-object v12, v11

    move-object v11, v3

    :goto_4
    check-cast v8, Lorg/json/JSONObject;

    invoke-virtual {v8}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v8

    const-string v13, "toString(...)"

    invoke-static {v8, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v8, v12, v11, v10}, Lgm/r;->B(Ljava/lang/String;Ljava/security/PublicKey;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_6

    :goto_5
    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_6
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-eqz v8, :cond_e

    iget-object v10, v5, Lev/i;->h:Ljava/lang/Object;

    check-cast v10, Ln30/c;

    new-instance v11, Ljava/lang/RuntimeException;

    const-string v12, "\n                    keyId="

    const-string v13, "\n                    sdkTransactionId="

    const-string v14, "\n                    Failed to encrypt AReq parameters.\n                        \n                    directoryServerId="

    invoke-static {v14, v3, v12, v2, v13}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v12

    invoke-virtual {v12, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v13, "\n                    "

    invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lyb3/s;->s(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v11, v12, v8}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v10, v11}, Ln30/c;->c(Ljava/lang/Throwable;)V

    :cond_e
    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v8

    if-nez v8, :cond_15

    check-cast v0, Ljava/lang/String;

    iget-object v8, v5, Lev/i;->d:Ljava/lang/Object;

    check-cast v8, Lai/j;

    iput-object v0, v1, Lq30/b0;->y:Ljava/lang/Object;

    iput-object v4, v1, Lq30/b0;->z:Ljava/lang/Object;

    iput-object v9, v1, Lq30/b0;->E:Ljava/lang/Object;

    iput-object v9, v1, Lq30/b0;->H:Ljava/lang/Object;

    iput v7, v1, Lq30/b0;->x:I

    invoke-virtual {v8, v1}, Lai/j;->h(Ls83/c;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_9

    goto/16 :goto_f

    :goto_7
    check-cast v7, Ll30/a;

    iget-object v13, v7, Ll30/a;->w:Ljava/lang/String;

    iget-object v0, v5, Lev/i;->g:Ljava/lang/Object;

    move-object v14, v0

    check-cast v14, Ljava/lang/String;

    iget-object v0, v1, Lq30/b0;->K:Ljava/lang/Object;

    check-cast v0, Ljava/security/PublicKey;

    const-string v4, "directoryServerId"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lo30/c;->z:Lt83/b;

    invoke-virtual {v4}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_f
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_10

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lo30/c;

    iget-object v7, v7, Lo30/c;->w:Ljava/util/List;

    invoke-interface {v7, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_f

    goto :goto_8

    :cond_10
    move-object v6, v9

    :goto_8
    check-cast v6, Lo30/c;

    if-eqz v6, :cond_11

    iget-object v3, v6, Lo30/c;->x:Lnw/i;

    :goto_9
    move-object/from16 v19, v3

    goto :goto_a

    :cond_11
    sget-object v3, Lnw/i;->x:Lnw/i;

    goto :goto_9

    :goto_a
    sget-object v3, Lnw/a;->y:Lnw/a;

    check-cast v0, Ljava/security/interfaces/ECPublicKey;

    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v4

    invoke-interface {v4}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v4

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v6

    invoke-virtual {v6}, Ljava/security/spec/ECPoint;->getAffineX()Ljava/math/BigInteger;

    move-result-object v6

    invoke-static {v4, v6}, Lnw/b;->e(ILjava/math/BigInteger;)Lxw/b;

    move-result-object v17

    invoke-interface {v0}, Ljava/security/interfaces/ECKey;->getParams()Ljava/security/spec/ECParameterSpec;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/ECParameterSpec;->getCurve()Ljava/security/spec/EllipticCurve;

    move-result-object v4

    invoke-virtual {v4}, Ljava/security/spec/EllipticCurve;->getField()Ljava/security/spec/ECField;

    move-result-object v4

    invoke-interface {v4}, Ljava/security/spec/ECField;->getFieldSize()I

    move-result v4

    invoke-interface {v0}, Ljava/security/interfaces/ECPublicKey;->getW()Ljava/security/spec/ECPoint;

    move-result-object v0

    invoke-virtual {v0}, Ljava/security/spec/ECPoint;->getAffineY()Ljava/math/BigInteger;

    move-result-object v0

    invoke-static {v4, v0}, Lnw/b;->e(ILjava/math/BigInteger;)Lxw/b;

    move-result-object v18

    const-string v0, "The curve must not be null"

    invoke-static {v3, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    if-eqz v2, :cond_13

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_12

    goto :goto_b

    :cond_12
    move-object/from16 v22, v2

    goto :goto_c

    :cond_13
    :goto_b
    move-object/from16 v22, v9

    :goto_c
    :try_start_2
    new-instance v15, Lnw/b;

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    move-object/from16 v16, v3

    invoke-direct/range {v15 .. v30}, Lnw/b;-><init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_0

    new-instance v16, Lnw/b;

    iget-object v0, v15, Lnw/d;->I:Ljava/util/List;

    if-nez v0, :cond_14

    :goto_d
    move-object/from16 v27, v9

    goto :goto_e

    :cond_14
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v9

    goto :goto_d

    :goto_e
    iget-object v0, v15, Lnw/d;->L:Ljava/util/Date;

    iget-object v2, v15, Lnw/d;->M:Lnw/g;

    iget-object v3, v15, Lnw/b;->O:Lnw/a;

    iget-object v4, v15, Lnw/b;->P:Lxw/b;

    iget-object v6, v15, Lnw/b;->Q:Lxw/b;

    iget-object v7, v15, Lnw/d;->x:Lnw/i;

    iget-object v8, v15, Lnw/d;->y:Ljava/util/Set;

    iget-object v9, v15, Lnw/d;->z:Lgw/a;

    iget-object v10, v15, Lnw/d;->E:Ljava/lang/String;

    move-object/from16 v30, v0

    iget-object v0, v15, Lnw/d;->F:Ljava/net/URI;

    move-object/from16 v24, v0

    iget-object v0, v15, Lnw/d;->G:Lxw/b;

    move-object/from16 v25, v0

    iget-object v0, v15, Lnw/d;->H:Lxw/b;

    move-object/from16 v26, v0

    iget-object v0, v15, Lnw/d;->J:Ljava/util/Date;

    iget-object v15, v15, Lnw/d;->K:Ljava/util/Date;

    move-object/from16 v28, v0

    move-object/from16 v31, v2

    move-object/from16 v17, v3

    move-object/from16 v18, v4

    move-object/from16 v19, v6

    move-object/from16 v20, v7

    move-object/from16 v21, v8

    move-object/from16 v22, v9

    move-object/from16 v23, v10

    move-object/from16 v29, v15

    invoke-direct/range {v16 .. v31}, Lnw/b;-><init>(Lnw/a;Lxw/b;Lxw/b;Lnw/i;Ljava/util/Set;Lgw/a;Ljava/lang/String;Ljava/net/URI;Lxw/b;Lxw/b;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lnw/g;)V

    invoke-virtual/range {v16 .. v16}, Lnw/b;->d()Ljava/util/HashMap;

    move-result-object v0

    invoke-static {v0}, Lxw/d;->j(Ljava/util/Map;)Ljava/lang/String;

    move-result-object v15

    const-string v0, "toJSONString(...)"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Lev/i;->f:Ljava/lang/Object;

    check-cast v0, Lq30/p0;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Lq30/b;

    const-string v16, "2.2.0"

    invoke-direct/range {v10 .. v16}, Lq30/b;-><init>(Ljava/lang/String;Lq30/q0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v6, v10

    :goto_f
    return-object v6

    :catch_0
    move-exception v0

    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v2, v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :cond_15
    new-instance v0, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;

    invoke-direct {v0, v8}, Lcom/stripe/android/stripe3ds2/exceptions/SDKRuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
