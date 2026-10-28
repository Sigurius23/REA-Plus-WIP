.class public final synthetic Lc41/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ljava/lang/Object;

.field public final synthetic y:Ljava/lang/Object;

.field public final synthetic z:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lc41/m;->w:I

    iput-object p1, p0, Lc41/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc41/m;->y:Ljava/lang/Object;

    iput-object p3, p0, Lc41/m;->z:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, Lc41/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/m;->z:Ljava/lang/Object;

    iput-object p2, p0, Lc41/m;->x:Ljava/lang/Object;

    iput-object p3, p0, Lc41/m;->y:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/c1;)V
    .locals 1

    .line 3
    const/4 v0, 0x3

    iput v0, p0, Lc41/m;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc41/m;->x:Ljava/lang/Object;

    iput-object p2, p0, Lc41/m;->z:Ljava/lang/Object;

    iput-object p3, p0, Lc41/m;->y:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 30

    move-object/from16 v1, p0

    iget v0, v1, Lc41/m;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, v1, Lc41/m;->x:Ljava/lang/Object;

    check-cast v0, Lud3/l;

    iget-object v2, v1, Lc41/m;->y:Ljava/lang/Object;

    check-cast v2, Lud3/c0;

    iget-object v3, v1, Lc41/m;->z:Ljava/lang/Object;

    check-cast v3, Lud3/a;

    iget-object v0, v0, Lud3/l;->b:Landroidx/room/c1;

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lud3/c0;->a()Ljava/util/List;

    move-result-object v2

    iget-object v3, v3, Lud3/a;->h:Lud3/e0;

    iget-object v3, v3, Lud3/e0;->d:Ljava/lang/String;

    invoke-virtual {v0, v3, v2}, Landroidx/room/c1;->h(Ljava/lang/String;Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, v1, Lc41/m;->x:Ljava/lang/Object;

    check-cast v0, Lvn1/q;

    iget-object v2, v1, Lc41/m;->z:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lc41/m;->y:Ljava/lang/Object;

    check-cast v3, Lp1/t2;

    invoke-static {v0, v2, v3}, Lum1/d;->b(Lvn1/q;Lkotlin/jvm/functions/Function1;Lp1/t2;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, v1, Lc41/m;->z:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/functions/Function1;

    iget-object v2, v1, Lc41/m;->x:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    iget-object v3, v1, Lc41/m;->y:Ljava/lang/Object;

    check-cast v3, Lp1/c1;

    invoke-static {v0, v2, v3}, Lp31/f;->h(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_2
    iget-object v0, v1, Lc41/m;->x:Ljava/lang/Object;

    move-object v3, v0

    check-cast v3, Ljc/v;

    iget-object v0, v1, Lc41/m;->y:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/lang/String;

    iget-object v0, v1, Lc41/m;->z:Ljava/lang/Object;

    check-cast v0, Lic/r0;

    iget-object v2, v3, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    invoke-virtual {v2}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v2

    invoke-virtual {v2, v4}, Lqc/u;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    if-gt v6, v7, :cond_c

    invoke-static {v5}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lqc/o;

    if-nez v5, :cond_0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v2, Ljc/o;

    sget-object v5, Lic/l;->x:Lic/l;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    invoke-static {v2}, Lrc/a;->a(Ljc/o;)V

    goto/16 :goto_3

    :cond_0
    iget-object v6, v5, Lqc/o;->a:Ljava/lang/String;

    invoke-virtual {v2, v6}, Lqc/u;->e(Ljava/lang/String;)Lqc/q;

    move-result-object v8

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Lqc/q;->c()Z

    move-result v8

    if-eqz v8, :cond_a

    iget-object v8, v5, Lqc/o;->b:Lic/m0;

    sget-object v9, Lic/m0;->F:Lic/m0;

    if-ne v8, v9, :cond_1

    invoke-virtual {v2, v6}, Lqc/u;->c(Ljava/lang/String;)V

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    new-instance v2, Ljc/o;

    sget-object v5, Lic/l;->x:Lic/l;

    const/4 v7, 0x0

    invoke-direct/range {v2 .. v7}, Ljc/o;-><init>(Ljc/v;Ljava/lang/String;Lic/l;Ljava/util/List;I)V

    invoke-static {v2}, Lrc/a;->a(Ljc/o;)V

    goto/16 :goto_3

    :cond_1
    iget-object v8, v0, Lic/r0;->b:Lqc/q;

    iget-object v9, v5, Lqc/o;->a:Ljava/lang/String;

    const/16 v20, 0x0

    const v21, 0x1fffffe

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    invoke-static/range {v8 .. v21}, Lqc/q;->b(Lqc/q;Ljava/lang/String;Lic/m0;Ljava/lang/String;Lic/g;IJIIJII)Lqc/q;

    move-result-object v2

    iget-object v4, v3, Ljc/v;->f:Ljc/g;

    const-string v5, "getProcessor(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v5, v3, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    const-string v6, "getWorkDatabase(...)"

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v6, v3, Ljc/v;->b:Lic/b;

    const-string v8, "<get-configuration>(...)"

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Ljc/v;->e:Ljava/util/List;

    const-string v8, "getSchedulers(...)"

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v0, Lic/r0;->c:Ljava/util/Set;

    const-string v8, "OneTime"

    const-string v9, "Periodic"

    iget-object v10, v2, Lqc/q;->a:Ljava/lang/String;

    invoke-virtual {v5}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v11

    invoke-virtual {v11, v10}, Lqc/u;->e(Ljava/lang/String;)Lqc/q;

    move-result-object v11

    if-eqz v11, :cond_9

    iget-object v12, v11, Lqc/q;->b:Lic/m0;

    invoke-virtual {v12}, Lic/m0;->a()Z

    move-result v12

    if-eqz v12, :cond_2

    sget-object v0, Lic/o0;->w:[Lic/o0;

    goto :goto_3

    :cond_2
    invoke-virtual {v11}, Lqc/q;->c()Z

    move-result v12

    invoke-virtual {v2}, Lqc/q;->c()Z

    move-result v13

    xor-int/2addr v12, v13

    if-nez v12, :cond_6

    iget-object v12, v4, Ljc/g;->k:Ljava/lang/Object;

    monitor-enter v12

    :try_start_0
    invoke-virtual {v4, v10}, Ljc/g;->c(Ljava/lang/String;)Ljc/i0;

    move-result-object v4

    if-eqz v4, :cond_3

    :goto_0
    move/from16 v29, v7

    goto :goto_1

    :cond_3
    const/4 v7, 0x0

    goto :goto_0

    :goto_1
    monitor-exit v12
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v29, :cond_4

    move-object v4, v3

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljc/i;

    invoke-interface {v7, v10}, Ljc/i;->a(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    new-instance v22, Ljc/y;

    move-object/from16 v28, v0

    move-object/from16 v25, v2

    move-object/from16 v26, v3

    move-object/from16 v23, v5

    move-object/from16 v27, v10

    move-object/from16 v24, v11

    invoke-direct/range {v22 .. v29}, Ljc/y;-><init>(Landroidx/work/impl/WorkDatabase;Lqc/q;Lqc/q;Ljava/util/List;Ljava/lang/String;Ljava/util/Set;Z)V

    move-object/from16 v3, v22

    move-object/from16 v0, v23

    move-object/from16 v2, v26

    invoke-virtual {v0, v3}, Landroidx/room/z0;->runInTransaction(Ljava/lang/Runnable;)V

    if-nez v29, :cond_5

    invoke-static {v6, v0, v2}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_5
    sget-object v0, Lic/o0;->w:[Lic/o0;

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit v12
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0

    :cond_6
    move-object/from16 v25, v2

    move-object/from16 v24, v11

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Can\'t update "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual/range {v24 .. v24}, Lqc/q;->c()Z

    move-result v3

    if-eqz v3, :cond_7

    move-object v3, v9

    goto :goto_4

    :cond_7
    move-object v3, v8

    :goto_4
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " Worker to "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual/range {v25 .. v25}, Lqc/q;->c()Z

    move-result v3

    if-eqz v3, :cond_8

    move-object v8, v9

    :cond_8
    const-string v3, " Worker. Update operation must preserve worker\'s type."

    invoke-static {v8, v3, v2}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_9
    move-object v0, v10

    new-instance v2, Ljava/lang/IllegalArgumentException;

    const-string v3, "Worker with "

    const-string v4, " doesn\'t exist"

    invoke-static {v3, v0, v4}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v2

    :cond_a
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Can\'t update OneTimeWorker to Periodic Worker. Update operation must preserve worker\'s type."

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "WorkSpec with "

    const-string v3, ", that matches a name \""

    const-string v5, "\", wasn\'t found"

    invoke-static {v2, v6, v3, v4, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v2, "Can\'t apply UPDATE policy to the chains of work."

    invoke-direct {v0, v2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_3
    iget-object v0, v1, Lc41/m;->x:Ljava/lang/Object;

    check-cast v0, Lc41/x;

    iget-object v2, v1, Lc41/m;->y:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/navigation/e;

    iget-object v3, v1, Lc41/m;->z:Ljava/lang/Object;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, v3}, Lc41/n;->d(Lc41/x;Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
