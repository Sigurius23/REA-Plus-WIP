.class public abstract Lrc/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "EnqueueRunnable"

    invoke-static {v0}, Lic/w;->f(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lrc/a;->a:Ljava/lang/String;

    return-void
.end method

.method public static a(Ljc/o;)V
    .locals 5

    iget-object v0, p0, Ljc/o;->a:Ljc/v;

    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p0, Ljc/o;->e:Ljava/util/ArrayList;

    invoke-interface {v1, v2}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    invoke-static {p0}, Ljc/o;->V(Ljc/o;)Ljava/util/HashSet;

    move-result-object v2

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {v2, v4}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_1
    iget-object v2, p0, Ljc/o;->e:Ljava/util/ArrayList;

    invoke-interface {v1, v2}, Ljava/util/Set;->removeAll(Ljava/util/Collection;)Z

    const/4 v1, 0x0

    :goto_0
    if-nez v1, :cond_3

    iget-object v1, v0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iget-object v2, v0, Ljc/v;->b:Lic/b;

    invoke-virtual {v1}, Landroidx/room/z0;->beginTransaction()V

    :try_start_0
    invoke-static {v1, v2, p0}, Lts/o;->g(Landroidx/work/impl/WorkDatabase;Lic/b;Ljc/o;)V

    invoke-static {p0}, Lrc/a;->b(Ljc/o;)Z

    move-result p0

    invoke-virtual {v1}, Landroidx/room/z0;->setTransactionSuccessful()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1}, Landroidx/room/z0;->endTransaction()V

    if-eqz p0, :cond_2

    iget-object p0, v0, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    iget-object v0, v0, Ljc/v;->e:Ljava/util/List;

    invoke-static {v2, p0, v0}, Ljc/k;->b(Lic/b;Landroidx/work/impl/WorkDatabase;Ljava/util/List;)V

    :cond_2
    return-void

    :catchall_0
    move-exception p0

    invoke-virtual {v1}, Landroidx/room/z0;->endTransaction()V

    throw p0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "WorkContinuation has cycles ("

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p0, ")"

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static b(Ljc/o;)Z
    .locals 24

    move-object/from16 v0, p0

    invoke-static {v0}, Ljc/o;->V(Ljc/o;)Ljava/util/HashSet;

    move-result-object v1

    iget-object v2, v0, Ljc/o;->a:Ljc/v;

    iget-object v3, v0, Ljc/o;->d:Ljava/util/List;

    const/4 v4, 0x0

    new-array v5, v4, [Ljava/lang/String;

    invoke-virtual {v1, v5}, Ljava/util/HashSet;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    iget-object v5, v0, Ljc/o;->b:Ljava/lang/String;

    iget-object v6, v0, Ljc/o;->c:Lic/l;

    iget-object v7, v2, Ljc/v;->b:Lic/b;

    iget-object v7, v7, Lic/b;->d:Lic/y;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    iget-object v9, v2, Ljc/v;->c:Landroidx/work/impl/WorkDatabase;

    if-eqz v1, :cond_0

    array-length v11, v1

    if-lez v11, :cond_0

    const/4 v11, 0x1

    goto :goto_0

    :cond_0
    move v11, v4

    :goto_0
    if-eqz v11, :cond_6

    array-length v12, v1

    move v13, v4

    move v15, v13

    move/from16 v16, v15

    const/4 v14, 0x1

    :goto_1
    if-ge v13, v12, :cond_7

    aget-object v4, v1, v13

    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v10

    invoke-virtual {v10, v4}, Lqc/u;->e(Ljava/lang/String;)Lqc/q;

    move-result-object v10

    if-nez v10, :cond_2

    invoke-static {}, Lic/w;->d()Lic/w;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Prerequisite "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " doesn\'t exist; not enqueuing"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lrc/a;->a:Ljava/lang/String;

    invoke-virtual {v1, v3, v2}, Lic/w;->b(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    :goto_2
    const/4 v4, 0x0

    const/4 v6, 0x1

    goto/16 :goto_11

    :cond_2
    iget-object v4, v10, Lqc/q;->b:Lic/m0;

    sget-object v10, Lic/m0;->y:Lic/m0;

    if-ne v4, v10, :cond_3

    const/4 v10, 0x1

    goto :goto_3

    :cond_3
    const/4 v10, 0x0

    :goto_3
    and-int/2addr v14, v10

    sget-object v10, Lic/m0;->z:Lic/m0;

    if-ne v4, v10, :cond_4

    const/16 v16, 0x1

    goto :goto_4

    :cond_4
    sget-object v10, Lic/m0;->F:Lic/m0;

    if-ne v4, v10, :cond_5

    const/4 v15, 0x1

    :cond_5
    :goto_4
    add-int/lit8 v13, v13, 0x1

    const/4 v4, 0x0

    goto :goto_1

    :cond_6
    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    :cond_7
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_16

    if-nez v11, :cond_16

    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v10

    invoke-virtual {v10, v5}, Lqc/u;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-nez v12, :cond_16

    sget-object v12, Lic/l;->y:Lic/l;

    if-eq v6, v12, :cond_c

    sget-object v12, Lic/l;->z:Lic/l;

    if-ne v6, v12, :cond_8

    goto :goto_6

    :cond_8
    sget-object v12, Lic/l;->x:Lic/l;

    if-ne v6, v12, :cond_a

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_9
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_a

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lqc/o;

    iget-object v12, v12, Lqc/o;->b:Lic/m0;

    sget-object v13, Lic/m0;->w:Lic/m0;

    if-eq v12, v13, :cond_1

    sget-object v13, Lic/m0;->x:Lic/m0;

    if-ne v12, v13, :cond_9

    goto :goto_2

    :cond_a
    const-string v6, "getWorkDatabase(...)"

    invoke-static {v9, v6}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lh6/l;

    const/4 v12, 0x6

    invoke-direct {v6, v9, v5, v2, v12}, Lh6/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v6}, Landroidx/room/z0;->runInTransaction(Ljava/lang/Runnable;)V

    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v6

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_5
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lqc/o;

    iget-object v12, v12, Lqc/o;->a:Ljava/lang/String;

    invoke-virtual {v6, v12}, Lqc/u;->c(Ljava/lang/String;)V

    goto :goto_5

    :cond_b
    move-object/from16 v17, v3

    move/from16 v18, v4

    move-object/from16 v19, v9

    const/4 v3, 0x1

    goto/16 :goto_c

    :cond_c
    :goto_6
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->b()Lqc/c;

    move-result-object v11

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v10}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v13

    if-eqz v13, :cond_11

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lqc/o;

    move-object/from16 v17, v3

    iget-object v3, v13, Lqc/o;->a:Ljava/lang/String;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v18, v4

    const-string v4, "id"

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v4, v11, Lqc/c;->a:Landroidx/room/z0;

    move-object/from16 v19, v9

    new-instance v9, Lht2/d;

    move-object/from16 v20, v10

    const/16 v10, 0x19

    invoke-direct {v9, v3, v10}, Lht2/d;-><init>(Ljava/lang/String;I)V

    const/4 v3, 0x0

    const/4 v10, 0x1

    invoke-static {v4, v10, v3, v9}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-nez v3, :cond_10

    iget-object v3, v13, Lqc/o;->b:Lic/m0;

    sget-object v4, Lic/m0;->y:Lic/m0;

    if-ne v3, v4, :cond_d

    const/4 v4, 0x1

    goto :goto_8

    :cond_d
    const/4 v4, 0x0

    :goto_8
    and-int/2addr v4, v14

    sget-object v9, Lic/m0;->z:Lic/m0;

    if-ne v3, v9, :cond_e

    const/16 v16, 0x1

    goto :goto_9

    :cond_e
    sget-object v9, Lic/m0;->F:Lic/m0;

    if-ne v3, v9, :cond_f

    const/4 v15, 0x1

    :cond_f
    :goto_9
    iget-object v3, v13, Lqc/o;->a:Ljava/lang/String;

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move v14, v4

    :cond_10
    move-object/from16 v3, v17

    move/from16 v4, v18

    move-object/from16 v9, v19

    move-object/from16 v10, v20

    goto :goto_7

    :cond_11
    move-object/from16 v17, v3

    move/from16 v18, v4

    move-object/from16 v19, v9

    sget-object v3, Lic/l;->z:Lic/l;

    if-ne v6, v3, :cond_14

    if-nez v15, :cond_12

    if-eqz v16, :cond_14

    :cond_12
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v3

    invoke-virtual {v3, v5}, Lqc/u;->f(Ljava/lang/String;)Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_a
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lqc/o;

    iget-object v6, v6, Lqc/o;->a:Ljava/lang/String;

    invoke-virtual {v3, v6}, Lqc/u;->c(Ljava/lang/String;)V

    goto :goto_a

    :cond_13
    sget-object v12, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    const/4 v15, 0x0

    const/16 v16, 0x0

    :cond_14
    invoke-interface {v12, v1}, Ljava/util/List;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [Ljava/lang/String;

    array-length v3, v1

    if-lez v3, :cond_15

    const/4 v11, 0x1

    goto :goto_b

    :cond_15
    const/4 v11, 0x0

    :goto_b
    const/4 v3, 0x0

    goto :goto_c

    :cond_16
    move-object/from16 v17, v3

    move/from16 v18, v4

    move-object/from16 v19, v9

    goto :goto_b

    :goto_c
    invoke-interface/range {v17 .. v17}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    move v10, v3

    :goto_d
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lic/r0;

    iget-object v6, v3, Lic/r0;->b:Lqc/q;

    iget-object v9, v3, Lic/r0;->a:Ljava/util/UUID;

    if-eqz v11, :cond_19

    if-nez v14, :cond_19

    if-eqz v16, :cond_17

    sget-object v12, Lic/m0;->z:Lic/m0;

    iput-object v12, v6, Lqc/q;->b:Lic/m0;

    goto :goto_e

    :cond_17
    if-eqz v15, :cond_18

    sget-object v12, Lic/m0;->F:Lic/m0;

    iput-object v12, v6, Lqc/q;->b:Lic/m0;

    goto :goto_e

    :cond_18
    sget-object v12, Lic/m0;->E:Lic/m0;

    iput-object v12, v6, Lqc/q;->b:Lic/m0;

    goto :goto_e

    :cond_19
    iput-wide v7, v6, Lqc/q;->n:J

    :goto_e
    iget-object v12, v6, Lqc/q;->b:Lic/m0;

    sget-object v13, Lic/m0;->w:Lic/m0;

    if-ne v12, v13, :cond_1a

    const/4 v10, 0x1

    :cond_1a
    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->h()Lqc/u;

    move-result-object v12

    iget-object v13, v2, Ljc/v;->e:Ljava/util/List;

    invoke-static {v13, v6}, Lts/o;->U(Ljava/util/List;Lqc/q;)Lqc/q;

    move-result-object v6

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v13, v12, Lqc/u;->a:Landroidx/room/z0;

    move-object/from16 v17, v2

    new-instance v2, Lqc/r;

    move-object/from16 v20, v4

    const/4 v4, 0x0

    invoke-direct {v2, v12, v6, v4}, Lqc/r;-><init>(Lqc/u;Lqc/q;I)V

    const/4 v4, 0x0

    const/4 v6, 0x1

    invoke-static {v13, v4, v6, v2}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    const-string v2, "toString(...)"

    if-eqz v11, :cond_1b

    array-length v4, v1

    const/4 v6, 0x0

    :goto_f
    if-ge v6, v4, :cond_1b

    aget-object v12, v1, v6

    new-instance v13, Lqc/a;

    move-object/from16 v21, v1

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v13, v1, v12}, Lqc/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->b()Lqc/c;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v12, v1, Lqc/c;->a:Landroidx/room/z0;

    move/from16 v22, v4

    new-instance v4, Lq11/c;

    move/from16 v23, v6

    const/4 v6, 0x4

    invoke-direct {v4, v6, v1, v13}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v6, 0x1

    invoke-static {v12, v1, v6, v4}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    add-int/lit8 v6, v23, 0x1

    move-object/from16 v1, v21

    move/from16 v4, v22

    goto :goto_f

    :cond_1b
    move-object/from16 v21, v1

    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->i()Lqc/w;

    move-result-object v1

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, v3, Lic/r0;->c:Ljava/util/Set;

    invoke-virtual {v1, v4, v3}, Lqc/w;->a(Ljava/lang/String;Ljava/util/Set;)V

    if-nez v18, :cond_1c

    invoke-virtual/range {v19 .. v19}, Landroidx/work/impl/WorkDatabase;->f()Lqc/l;

    move-result-object v1

    new-instance v3, Lqc/k;

    invoke-virtual {v9}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v3, v5, v4}, Lqc/k;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object v2, v1, Lqc/l;->a:Landroidx/room/z0;

    new-instance v4, Lp3/b0;

    const/4 v6, 0x4

    invoke-direct {v4, v6, v1, v3}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const/4 v1, 0x0

    const/4 v6, 0x1

    invoke-static {v2, v1, v6, v4}, Lge3/g;->L(Landroidx/room/z0;ZZLkotlin/jvm/functions/Function1;)Ljava/lang/Object;

    goto :goto_10

    :cond_1c
    const/4 v1, 0x0

    const/4 v6, 0x1

    :goto_10
    move-object/from16 v2, v17

    move-object/from16 v4, v20

    move-object/from16 v1, v21

    goto/16 :goto_d

    :cond_1d
    const/4 v6, 0x1

    move v4, v10

    :goto_11
    iput-boolean v6, v0, Ljc/o;->g:Z

    return v4
.end method
