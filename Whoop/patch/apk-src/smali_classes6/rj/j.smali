.class public abstract Lrj/j;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Landroid/content/Context;

.field public static b:Lvp/d;


# direct methods
.method public static A(Landroid/content/Context;I)Lvp/d;
    .locals 2

    const-string v0, "j"

    const-string v1, "Making Creator dynamically"

    invoke-static {v0, v1}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I

    invoke-static {p0, p1}, Lrj/j;->z(Landroid/content/Context;I)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string p1, "com.google.android.gms.maps.internal.CreatorImpl"

    :try_start_0
    invoke-static {p0}, Luo/w;->f(Ljava/lang/Object;)V

    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Ljava/lang/InstantiationException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_2

    check-cast p0, Landroid/os/IBinder;

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    const-string p1, "com.google.android.gms.maps.internal.ICreator"

    invoke-interface {p0, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    instance-of v1, v0, Lvp/d;

    if-eqz v1, :cond_1

    check-cast v0, Lvp/d;

    return-object v0

    :cond_1
    new-instance v0, Lvp/d;

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, v1}, Lip/a;-><init>(Landroid/os/IBinder;Ljava/lang/String;I)V

    return-object v0

    :catch_0
    move-exception p1

    :try_start_2
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to call the default constructor of "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    move-exception p1

    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object p0

    const-string v1, "Unable to instantiate the dynamic class "

    invoke-virtual {v1, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    move-exception p0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Unable to find dynamic class com.google.android.gms.maps.internal.CreatorImpl"

    invoke-direct {p1, v0, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p1
.end method

.method public static final a(ZLx30/k;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 31

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "element"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0xfb34d89

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit16 v4, v5, 0x180

    if-nez v4, :cond_6

    and-int/lit16 v4, v5, 0x200

    if-nez v4, :cond_4

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_3

    :cond_4
    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_3
    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_6
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_8

    move-object/from16 v4, p3

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_5

    :cond_7
    const/16 v6, 0x400

    :goto_5
    or-int/2addr v0, v6

    goto :goto_6

    :cond_8
    move-object/from16 v4, p3

    :goto_6
    and-int/lit16 v6, v0, 0x493

    const/16 v7, 0x492

    if-ne v6, v7, :cond_a

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_a
    :goto_7
    iget-object v6, v2, Lx30/k;->c:Lg40/c3;

    iget-object v6, v6, Lg40/c3;->c:Lg40/m3;

    invoke-interface {v6}, Lg40/z2;->f()Lec3/f2;

    move-result-object v6

    const/4 v14, 0x0

    invoke-static {v6, v11, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    iget-object v7, v2, Lx30/k;->d:Ln53/e;

    invoke-static {v7, v11, v14}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v15

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v11, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_d

    :cond_c
    invoke-static {v8, v11, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lg40/h1;

    new-instance v6, Lb30/j5;

    const/4 v8, 0x5

    invoke-direct {v6, v2, v1, v3, v8}, Lb30/j5;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v8, 0x36dfa1a3

    invoke-static {v8, v11, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/lit16 v12, v0, 0x6006

    const/16 v13, 0x8

    const/4 v6, 0x0

    const/4 v9, 0x0

    move-object v8, v4

    invoke-static/range {v6 .. v13}, Lse/a;->o(Lzy/c;Lg40/h1;Landroidx/compose/ui/Modifier;ZLx1/b;Landroidx/compose/runtime/Composer;II)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/lang/String;

    const v0, -0x3f3f89d4

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    if-nez v6, :cond_e

    move v0, v14

    goto :goto_9

    :cond_e
    invoke-static {v11}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v0

    iget-wide v8, v0, Ld40/n;->e:J

    const/16 v29, 0x0

    const v30, 0x1fffa

    const/4 v7, 0x0

    move-object/from16 v27, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v0, v14

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v6 .. v30}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    :goto_9
    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_f

    new-instance v0, Lrq2/w;

    move-object/from16 v4, p3

    invoke-direct/range {v0 .. v5}, Lrq2/w;-><init>(ZLx30/k;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 95

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move/from16 v3, p4

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v5, 0x2e5ce296

    invoke-virtual {v4, v5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v3

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v5, v6

    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v5, v6

    and-int/lit16 v5, v5, 0x2db

    const/16 v6, 0x92

    if-ne v5, v6, :cond_4

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v18, v4

    goto/16 :goto_9

    :cond_4
    :goto_3
    if-nez v0, :cond_5

    const-string v5, ""

    goto :goto_4

    :cond_5
    move-object v5, v0

    :goto_4
    sget-object v6, Ll1/z4;->a:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/y4;

    iget-object v8, v6, Ll1/y4;->k:Ll3/v0;

    sget-object v6, Ll1/h4;->a:Ll1/h4;

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    iget-wide v6, v6, Luj/i;->e:J

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v9

    iget-object v9, v9, Luj/m;->i0:Luj/i;

    iget-wide v9, v9, Luj/i;->e:J

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget-object v11, v11, Luj/m;->i0:Luj/i;

    iget-wide v11, v11, Luj/i;->g:J

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v13

    iget-object v13, v13, Luj/m;->i0:Luj/i;

    iget-wide v13, v13, Luj/i;->g:J

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v15

    iget-object v15, v15, Luj/m;->i0:Luj/i;

    iget-object v15, v15, Luj/i;->k:Li2/x;

    move-object/from16 p3, v5

    const v5, 0x658bed05

    invoke-virtual {v4, v5}, Lp1/q;->f0(I)V

    if-nez v15, :cond_6

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    move-wide/from16 v18, v6

    iget-wide v5, v5, Luj/m;->p:J

    :goto_5
    move-wide/from16 v63, v5

    goto :goto_6

    :cond_6
    move-wide/from16 v18, v6

    iget-wide v5, v15, Li2/x;->a:J

    goto :goto_5

    :goto_6
    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    iget-object v6, v6, Luj/i;->k:Li2/x;

    const v7, 0x658bedb0

    invoke-virtual {v4, v7}, Lp1/q;->f0(I)V

    if-nez v6, :cond_7

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-wide v6, v6, Luj/m;->p:J

    :goto_7
    move-wide/from16 v65, v6

    goto :goto_8

    :cond_7
    iget-wide v6, v6, Li2/x;->a:J

    goto :goto_7

    :goto_8
    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    sget-wide v31, Li2/x;->m:J

    move-wide/from16 v20, v9

    move-wide v10, v11

    move-wide v12, v13

    sget-wide v14, Li2/x;->n:J

    sget-object v6, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v4, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll1/m;

    sget-object v7, Lf1/a2;->a:Lp1/b0;

    invoke-virtual {v4, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lf1/y1;

    invoke-static {v6, v7}, Ll1/h4;->c(Ll1/m;Lf1/y1;)Ll1/e4;

    move-result-object v9

    const/16 v30, 0x0

    move-wide/from16 v16, v14

    move-wide/from16 v22, v14

    move-wide/from16 v24, v14

    move-wide/from16 v26, v14

    move-wide/from16 v28, v14

    move-wide/from16 v33, v31

    move-wide/from16 v35, v14

    move-wide/from16 v37, v14

    move-wide/from16 v39, v14

    move-wide/from16 v41, v14

    move-wide/from16 v43, v14

    move-wide/from16 v45, v14

    move-wide/from16 v47, v14

    move-wide/from16 v49, v14

    move-wide/from16 v51, v14

    move-wide/from16 v53, v14

    move-wide/from16 v55, v14

    move-wide/from16 v57, v14

    move-wide/from16 v59, v14

    move-wide/from16 v61, v14

    move-wide/from16 v67, v14

    move-wide/from16 v69, v14

    move-wide/from16 v71, v14

    move-wide/from16 v73, v14

    move-wide/from16 v75, v14

    move-wide/from16 v77, v14

    move-wide/from16 v79, v14

    move-wide/from16 v81, v14

    move-wide/from16 v83, v14

    move-wide/from16 v85, v14

    move-wide/from16 v87, v14

    move-wide/from16 v89, v14

    move-wide/from16 v91, v14

    move-wide/from16 v93, v14

    invoke-virtual/range {v9 .. v94}, Ll1/e4;->a(JJJJJJJJJJLf1/y1;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Ll1/e4;

    move-result-object v17

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget v6, v6, Luj/m;->C:F

    invoke-static {v6}, Lt0/j;->a(F)Lt0/i;

    move-result-object v16

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x1

    int-to-float v7, v7

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v9

    iget-wide v9, v9, Luj/m;->u:J

    invoke-static {v4}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget v11, v11, Luj/m;->C:F

    invoke-static {v11}, Lt0/j;->a(F)Lt0/i;

    move-result-object v11

    invoke-static {v6, v7, v9, v10, v11}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v11, Lu0/r0;

    const/16 v7, 0x77

    const/4 v9, 0x7

    invoke-direct {v11, v5, v5, v9, v7}, Lu0/r0;-><init>(IIII)V

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_8

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_9

    :cond_8
    new-instance v7, Lj43/a;

    invoke-direct {v7, v2}, Lj43/a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v5, v7

    check-cast v5, Lkotlin/jvm/functions/Function1;

    new-instance v7, Lc4/e;

    invoke-direct {v7, v1, v9}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    const v9, -0x10ad292f

    invoke-static {v9, v4, v7}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/4 v15, 0x0

    const/high16 v19, 0xc00000

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x1

    const/4 v14, 0x0

    move-object/from16 v18, v4

    move-object/from16 v4, p3

    invoke-static/range {v4 .. v19}, Ll1/j4;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;I)V

    :goto_9
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v4

    if-nez v4, :cond_a

    return-void

    :cond_a
    new-instance v5, Lgb/r;

    invoke-direct {v5, v3, v0, v1, v2}, Lgb/r;-><init>(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    iput-object v5, v4, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final c(Lcom/amplitude/android/engagement/types/ContentBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    const-string v0, "block"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResponseChanged"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x2db5e590

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    invoke-virtual {p3, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    and-int/lit16 v1, v0, 0x2db

    const/16 v2, 0x92

    if-ne v1, v2, :cond_4

    invoke-virtual {p3}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {p3}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_4
    :goto_3
    instance-of v1, p0, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    const/4 v2, 0x0

    if-eqz v1, :cond_5

    const v1, -0x6989d829

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    move-object v1, p0

    check-cast v1, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;

    and-int/lit8 v3, v0, 0x70

    or-int/lit8 v3, v3, 0x8

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v3

    invoke-static {v1, p1, p2, p3, v0}, Lrj/j;->h(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_5
    instance-of v1, p0, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    if-eqz v1, :cond_6

    const v1, -0x6989d78b

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    move-object v1, p0

    check-cast v1, Lcom/amplitude/android/engagement/types/SurveyListBlock;

    and-int/lit8 v3, v0, 0x70

    or-int/lit8 v3, v3, 0x8

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v3

    invoke-static {v1, p1, p2, p3, v0}, Lrj/j;->d(Lcom/amplitude/android/engagement/types/SurveyListBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    instance-of v1, p0, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    const/4 v3, 0x0

    if-eqz v1, :cond_8

    const v1, -0x6989d6ef

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    move-object v1, p0

    check-cast v1, Lcom/amplitude/android/engagement/types/SurveyTextBlock;

    instance-of v4, p1, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    if-eqz v4, :cond_7

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    :cond_7
    and-int/lit16 v0, v0, 0x380

    invoke-static {v1, v3, p2, p3, v0}, Lrj/j;->n(Lcom/amplitude/android/engagement/types/SurveyTextBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    instance-of v1, p0, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    if-eqz v1, :cond_a

    const v1, -0x6989d637

    invoke-virtual {p3, v1}, Lp1/q;->f0(I)V

    move-object v1, p0

    check-cast v1, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;

    instance-of v4, p1, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    if-eqz v4, :cond_9

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseText;

    :cond_9
    and-int/lit16 v0, v0, 0x380

    invoke-static {v1, v3, p2, p3, v0}, Lrj/j;->m(Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    const v0, -0x6989d54e

    invoke-virtual {p3, v0}, Lp1/q;->f0(I)V

    invoke-virtual {p3, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-nez p3, :cond_b

    return-void

    :cond_b
    new-instance v0, Lgb/r;

    const/4 v5, 0x5

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lgb/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d(Lcom/amplitude/android/engagement/types/SurveyListBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x1a877a16

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/4 v9, 0x1

    const/4 v3, 0x0

    const/4 v10, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_6

    :cond_0
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getOptions()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->J1(Ljava/lang/Iterable;)Lm83/q;

    move-result-object v0

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->isOrderRandom()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {v0}, Lm83/s;->G1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->shuffle(Ljava/util/List;)V

    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v0, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm83/c0;

    iget v5, v4, Lm83/c0;->a:I

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Lrj/p;

    iget-object v4, v4, Lm83/c0;->b:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-direct {v6, v4, v10, v3}, Lrj/p;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v1}, Lm83/s;->F1(Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getOtherOption()Lcom/amplitude/android/engagement/types/SurveyListOther;

    move-result-object v0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListOther;->getEnabled()Ljava/lang/Boolean;

    move-result-object v4

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListOther;->getLabel()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListOther;->getLabel()Ljava/lang/String;

    move-result-object v4

    goto :goto_2

    :cond_4
    :goto_1
    const-string v4, "Other"

    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    new-instance v6, Lrj/p;

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListOther;->getPlaceholderLabel()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v6, v4, v9, v0}, Lrj/p;-><init>(Ljava/lang/String;ZLjava/lang/String;)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_5
    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v4, v1

    check-cast v4, Ljava/util/List;

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v5, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v7, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    :cond_8
    invoke-static {v5, v7, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getDisplayType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "dropdown"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_b

    const v0, 0x4c8be2c1    # 7.3340424E7f

    invoke-virtual {v7, v0}, Lp1/q;->f0(I)V

    instance-of v0, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    if-eqz v0, :cond_a

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    :cond_a
    move-object v5, v3

    shl-int/lit8 v0, p4, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v8, v0, 0x48

    move-object v3, p0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lrj/j;->e(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_b
    invoke-virtual {p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyListMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyListMeta;->getListType()Ljava/lang/String;

    move-result-object v0

    const-string v1, "multiple"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    const v0, 0x4c8be400    # 7.334298E7f

    invoke-virtual {v7, v0}, Lp1/q;->f0(I)V

    instance-of v0, p1, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;

    if-eqz v0, :cond_c

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;

    :cond_c
    move-object v5, v3

    shl-int/lit8 v0, p4, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit16 v8, v0, 0x248

    move-object v3, p0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lrj/j;->f(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_d
    const v0, 0x4c8be520    # 7.334528E7f

    invoke-virtual {v7, v0}, Lp1/q;->f0(I)V

    instance-of v0, p1, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    if-eqz v0, :cond_e

    move-object v3, p1

    check-cast v3, Lcom/amplitude/android/engagement/types/SurveyResponseSelect;

    :cond_e
    move-object v5, v3

    shl-int/lit8 v0, p4, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int/lit8 v8, v0, 0x48

    move-object v3, p0

    move-object v6, p2

    invoke-static/range {v3 .. v8}, Lrj/j;->g(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_4
    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_f

    return-void

    :cond_f
    new-instance v0, Lc4/c;

    const/4 v5, 0x3

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final e(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move-object/from16 v3, p2

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v0, -0x6ef921d

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lup/d;->y(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;)Llj/f0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, v1, Llj/f0;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v12, v1

    goto :goto_0

    :cond_0
    const/4 v12, 0x0

    :goto_0
    move-object/from16 v1, p1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Ll83/k;

    iget-object v4, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-nez v12, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v4, v5, :cond_1

    goto :goto_2

    :cond_3
    const/4 v2, 0x0

    :goto_2
    check-cast v2, Ll83/k;

    if-eqz v2, :cond_4

    iget-object v1, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Lrj/p;

    move-object v14, v1

    goto :goto_3

    :cond_4
    const/4 v14, 0x0

    :goto_3
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_5

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v15, v1

    check-cast v15, Lp1/c1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_6

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object/from16 v19, v1

    check-cast v19, Lp1/c1;

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x0

    invoke-static {v5, v6, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_a

    if-ne v7, v2, :cond_b

    :cond_a
    new-instance v7, Lpj/a;

    const/4 v2, 0x2

    invoke-direct {v7, v2, v15}, Lpj/a;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v2, v13

    new-instance v13, Lnj/f;

    move-object/from16 v18, p0

    move-object/from16 v16, p1

    move-object/from16 v17, p3

    invoke-direct/range {v13 .. v19}, Lnj/f;-><init>(Lrj/p;Lp1/c1;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;Lp1/c1;)V

    const v6, 0x327f3a6f

    invoke-static {v6, v8, v13}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v6

    move-object v13, v9

    const/16 v9, 0xc00

    move-object v15, v10

    const/4 v10, 0x4

    move-object/from16 v16, v5

    move-object v5, v7

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v20, v13

    move-object/from16 v13, v16

    invoke-static/range {v4 .. v10}, Ll1/o1;->ExposedDropdownMenuBox(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const v4, 0x253f2c20

    invoke-virtual {v8, v4}, Lp1/q;->f0(I)V

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_11

    invoke-static {v1, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v1, 0x8

    int-to-float v1, v1

    const/16 v25, 0x0

    const/16 v26, 0xd

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v23, v1

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    :cond_d
    move-object/from16 v13, v20

    invoke-static {v7, v8, v7, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v8, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v3, :cond_f

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Lup/d;->y(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;)Llj/f0;

    move-result-object v0

    if-eqz v0, :cond_f

    iget-object v0, v0, Llj/f0;->c:Ljava/lang/String;

    goto :goto_6

    :cond_f
    const/4 v0, 0x0

    :goto_6
    if-eqz v14, :cond_10

    iget-object v1, v14, Lrj/p;->c:Ljava/lang/String;

    goto :goto_7

    :cond_10
    const/4 v1, 0x0

    :goto_7
    new-instance v9, Lc4/k;

    const/4 v15, 0x4

    move-object/from16 v11, p0

    move-object/from16 v13, p1

    move-object/from16 v10, p3

    invoke-direct/range {v9 .. v15}, Lc4/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v0, v1, v9, v8, v6}, Lrj/j;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_11
    const/4 v6, 0x0

    :goto_8
    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-nez v7, :cond_12

    return-void

    :cond_12
    new-instance v0, Lrj/a;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lrj/a;-><init>(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final f(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v6, p4

    check-cast v6, Lp1/q;

    const v0, -0xd8e6a3c

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p2, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "blockId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p2 .. p2}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;->getBlockId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Llj/g0;

    invoke-virtual/range {p2 .. p2}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;->getValue()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;->getStringResponse()Ljava/util/List;

    move-result-object v2

    invoke-virtual/range {p2 .. p2}, Lcom/amplitude/android/engagement/types/SurveyResponseMultiSelect;->getOtherText()Ljava/lang/String;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Llj/g0;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V

    :goto_0
    move-object v9, v0

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_1
    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz v9, :cond_3

    iget-object v1, v9, Llj/g0;->a:Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    move-object v11, v1

    goto :goto_3

    :cond_3
    :goto_2
    move-object v11, v0

    :goto_3
    if-eqz v9, :cond_5

    iget-object v1, v9, Llj/g0;->b:Ljava/util/List;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    move-object v13, v1

    goto :goto_5

    :cond_5
    :goto_4
    move-object v13, v0

    :goto_5
    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->a:Ll0/e;

    const v3, -0x1896950d

    invoke-virtual {v6, v3}, Lp1/q;->f0(I)V

    sget-object v4, Luj/k;->a:Lp1/u2;

    invoke-virtual {v6, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    const/4 v5, 0x0

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    iget v4, v4, Luj/m;->N:F

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v7, v6, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v14, v6, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-eqz v14, :cond_6

    invoke-virtual {v6, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_6
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v6, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v6, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-nez v10, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v10, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_8

    :cond_7
    invoke-static {v7, v6, v7, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x1d5b6ba4

    invoke-virtual {v6, v2}, Lp1/q;->f0(I)V

    move-object/from16 v2, p1

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v17

    :goto_7
    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x1

    if-eqz v2, :cond_e

    invoke-interface/range {v17 .. v17}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll83/k;

    iget-object v7, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    move-result v12

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    move-object v14, v2

    check-cast v14, Lrj/p;

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v11, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    move-object v7, v1

    iget-object v1, v14, Lrj/p;->a:Ljava/lang/String;

    new-instance v10, Lrj/b;

    move-object/from16 v16, p0

    move-object/from16 v15, p3

    invoke-direct/range {v10 .. v16}, Lrj/b;-><init>(Ljava/util/List;ILjava/util/List;Lrj/p;Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;)V

    invoke-virtual {v6, v3}, Lp1/q;->f0(I)V

    sget-object v15, Luj/k;->a:Lp1/u2;

    invoke-virtual {v6, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Luj/m;

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    iget-object v15, v15, Luj/m;->m0:Luj/i;

    move/from16 v16, v5

    const/4 v5, 0x0

    move-object/from16 v18, v7

    const/16 v7, 0x180

    move/from16 v19, v0

    move v0, v2

    const-string v2, "multiple"

    move-object v4, v15

    move/from16 v8, v16

    move-object/from16 v15, v18

    move/from16 v16, v3

    move-object v3, v10

    move/from16 v10, v19

    invoke-static/range {v0 .. v7}, Lrj/o;->b(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    iget-boolean v0, v14, Lrj/p;->b:Z

    if-eqz v0, :cond_d

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-interface {v11, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_d

    invoke-static {v10, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/4 v0, 0x4

    int-to-float v0, v0

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v20, 0x0

    const/16 v22, 0x0

    move/from16 v21, v0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v6, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v6, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_b

    :cond_a
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v9, :cond_c

    iget-object v0, v9, Llj/g0;->c:Ljava/lang/String;

    goto :goto_9

    :cond_c
    const/4 v0, 0x0

    :goto_9
    iget-object v1, v14, Lrj/p;->c:Ljava/lang/String;

    move/from16 v19, v10

    new-instance v10, Leu/q;

    move-object v7, v15

    const/4 v15, 0x1

    move-object/from16 v12, p0

    move-object v14, v13

    move-object v13, v11

    move-object/from16 v11, p3

    invoke-direct/range {v10 .. v15}, Leu/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object v11, v13

    move-object v13, v14

    invoke-static {v0, v1, v10, v6, v8}, Lrj/j;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    move/from16 v19, v10

    move-object v7, v15

    :goto_a
    move-object v1, v7

    move v5, v8

    move/from16 v3, v16

    move/from16 v0, v19

    goto/16 :goto_7

    :cond_e
    move v0, v4

    move v8, v5

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_f

    return-void

    :cond_f
    new-instance v18, Lgb/z;

    const/16 v20, 0x2

    move-object/from16 v21, p0

    move-object/from16 v22, p1

    move-object/from16 v23, p2

    move-object/from16 v24, p3

    move/from16 v19, p5

    invoke-direct/range {v18 .. v24}, Lgb/z;-><init>(IILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    move-object/from16 v1, v18

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final g(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v3, p2

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x7076e718

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v3, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Lup/d;->y(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;)Llj/f0;

    move-result-object v1

    if-eqz v1, :cond_0

    iget v1, v1, Llj/f0;->a:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->a:Ll0/e;

    const v13, -0x1896950d

    invoke-virtual {v10, v13}, Lp1/q;->f0(I)V

    sget-object v5, Luj/k;->a:Lp1/u2;

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Luj/m;

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    iget v5, v5, Luj/m;->N:F

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v4, -0x46e50cbf

    invoke-virtual {v10, v4}, Lp1/q;->f0(I)V

    move-object/from16 v4, p1

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v15

    :goto_2
    invoke-interface {v15}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x1

    if-eqz v4, :cond_c

    invoke-interface {v15}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll83/k;

    iget-object v6, v4, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget-object v4, v4, Ll83/k;->x:Ljava/lang/Object;

    check-cast v4, Lrj/p;

    if-nez v1, :cond_4

    goto :goto_3

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    if-ne v7, v6, :cond_5

    move v7, v5

    move v8, v7

    goto :goto_4

    :cond_5
    :goto_3
    move v8, v5

    move v7, v14

    :goto_4
    iget-object v5, v4, Lrj/p;->a:Ljava/lang/String;

    new-instance v16, Lrj/c;

    const/16 v21, 0x0

    move-object/from16 v18, p0

    move-object/from16 v17, p3

    move-object/from16 v20, v4

    move/from16 v19, v6

    invoke-direct/range {v16 .. v21}, Lrj/c;-><init>(Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;ILrj/p;I)V

    invoke-virtual {v10, v13}, Lp1/q;->f0(I)V

    sget-object v4, Luj/k;->a:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Luj/m;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    iget-object v4, v4, Luj/m;->l0:Luj/i;

    const/4 v9, 0x0

    const/16 v11, 0x180

    const-string v6, "single"

    move-object v8, v4

    move v4, v7

    move-object/from16 v7, v16

    move/from16 v0, v19

    move-object/from16 v13, v20

    invoke-static/range {v4 .. v11}, Lrj/o;->b(ZLjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    iget-boolean v4, v13, Lrj/p;->b:Z

    if-eqz v4, :cond_b

    if-nez v1, :cond_6

    goto/16 :goto_7

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-ne v4, v0, :cond_b

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v4, 0x4

    int-to-float v4, v4

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v4

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyListBlock;->getUuid()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lup/d;->y(Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Ljava/lang/String;)Llj/f0;

    move-result-object v4

    if-eqz v4, :cond_a

    iget-object v4, v4, Llj/f0;->c:Ljava/lang/String;

    goto :goto_6

    :cond_a
    const/4 v4, 0x0

    :goto_6
    iget-object v5, v13, Lrj/p;->c:Ljava/lang/String;

    new-instance v16, Lrj/c;

    const/16 v21, 0x1

    move-object/from16 v18, p0

    move-object/from16 v17, p3

    move/from16 v19, v0

    move-object/from16 v20, v13

    invoke-direct/range {v16 .. v21}, Lrj/c;-><init>(Lkotlin/jvm/functions/Function1;Lcom/amplitude/android/engagement/types/SurveyListBlock;ILrj/p;I)V

    move-object/from16 v0, v16

    invoke-static {v4, v5, v0, v10, v14}, Lrj/j;->b(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v8, 0x1

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    :cond_b
    :goto_7
    const v13, -0x1896950d

    goto/16 :goto_2

    :cond_c
    move v8, v5

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-nez v7, :cond_d

    return-void

    :cond_d
    new-instance v0, Lrj/a;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lrj/a;-><init>(Lcom/amplitude/android/engagement/types/SurveyListBlock;Ljava/util/List;Lcom/amplitude/android/engagement/types/SurveyResponseSelect;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final h(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Llj/e0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x7d0c780a

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-eqz v5, :cond_0

    iget-object v5, v0, Lp1/q;->I:Lp1/i2;

    iget v5, v5, Lp1/i2;->v:I

    neg-int v5, v5

    goto :goto_0

    :cond_0
    iget-object v5, v0, Lp1/q;->G:Lp1/e2;

    iget v5, v5, Lp1/e2;->i:I

    :goto_0
    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v6

    invoke-virtual {v6}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getType()Lcom/amplitude/android/engagement/types/SurveyRatingType;

    move-result-object v6

    sget-object v7, Lrj/i;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v7, v6

    const/4 v8, 0x3

    const/4 v9, 0x2

    const v10, -0x1896950d

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v6, v12, :cond_3

    if-eq v6, v9, :cond_2

    if-eq v6, v8, :cond_1

    const v6, 0x16b8c5bf

    invoke-virtual {v0, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    sget-object v6, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Luj/m;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    iget-object v6, v6, Luj/m;->g0:Luj/i;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v6, 0x16b8c58d

    invoke-virtual {v0, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    sget-object v6, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Luj/m;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    iget-object v6, v6, Luj/m;->g0:Luj/i;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    const v6, 0x16b8c54d

    invoke-virtual {v0, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    sget-object v6, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Luj/m;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    iget-object v6, v6, Luj/m;->h0:Luj/i;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const v6, 0x16b8c50a

    invoke-virtual {v0, v6}, Lp1/q;->f0(I)V

    invoke-virtual {v0, v10}, Lp1/q;->f0(I)V

    sget-object v6, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Luj/m;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    iget-object v6, v6, Luj/m;->f0:Luj/i;

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_1
    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v15

    iget-wide v8, v15, Luj/m;->w:J

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v14, v8, v9, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->N:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v15, 0x30

    invoke-static {v14, v9, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_2
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v0, v9, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-nez v10, :cond_5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v20, v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_6

    goto :goto_3

    :cond_5
    move-object/from16 v20, v7

    :goto_3
    invoke-static {v14, v0, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v0, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x4

    int-to-float v8, v8

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v10, Lb2/e;->J:Lb2/l;

    move-object/from16 v21, v6

    const/4 v6, 0x6

    invoke-static {v8, v10, v0, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 v22, v7

    iget-wide v6, v0, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v24, v10

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_7

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v0, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v6, v22

    goto :goto_7

    :cond_9
    :goto_6
    invoke-static {v6, v0, v6, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_5

    :goto_7
    invoke-static {v0, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v7

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getType()Lcom/amplitude/android/engagement/types/SurveyRatingType;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    aget v7, v20, v7

    const/16 v8, 0x8

    const/4 v10, 0x0

    const/4 v14, 0x1

    if-eq v7, v14, :cond_f

    const/4 v14, 0x2

    if-eq v7, v14, :cond_d

    const/4 v14, 0x3

    if-eq v7, v14, :cond_b

    const v7, 0x7901c7c1

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    instance-of v7, v2, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    if-eqz v7, :cond_a

    move-object v10, v2

    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    :cond_a
    and-int/lit16 v7, v4, 0x380

    or-int/2addr v7, v8

    invoke-static {v1, v10, v3, v0, v7}, Lrj/j;->k(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v14, 0x1

    goto :goto_9

    :cond_b
    const v7, 0x7901c6a1

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    instance-of v7, v2, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;

    if-eqz v7, :cond_c

    move-object v10, v2

    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;

    :cond_c
    and-int/lit16 v7, v4, 0x380

    or-int/2addr v7, v8

    invoke-static {v1, v10, v3, v0, v7}, Lrj/j;->j(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNPS;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v7, 0x7901c56c

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    instance-of v7, v2, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    if-eqz v7, :cond_e

    move-object v10, v2

    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyResponseNumber;

    :cond_e
    and-int/lit16 v7, v4, 0x380

    or-int/2addr v7, v8

    invoke-static {v1, v10, v3, v0, v7}, Lrj/j;->l(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    const v7, 0x7901c435

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    instance-of v7, v2, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;

    if-eqz v7, :cond_10

    move-object v10, v2

    check-cast v10, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;

    :cond_10
    and-int/lit16 v7, v4, 0x380

    or-int/2addr v7, v8

    invoke-static {v1, v10, v3, v0, v7}, Lrj/j;->i(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x0

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v7

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getLowerLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_12

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v7

    invoke-virtual {v7}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getUpperLabel()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_12

    invoke-virtual {v0, v5}, Lp1/q;->x(I)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_11

    goto/16 :goto_b

    :cond_11
    new-instance v0, Lrj/d;

    const/4 v5, 0x0

    invoke-direct/range {v0 .. v5}, Lrj/d;-><init>(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Llj/e0;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_12
    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    int-to-float v1, v8

    const/16 v29, 0x0

    const/16 v30, 0xd

    const/16 v26, 0x0

    const/16 v28, 0x0

    move/from16 v27, v1

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->g:Ll0/h;

    move-object/from16 v3, v24

    const/4 v4, 0x6

    invoke-static {v2, v3, v0, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v0, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v5, v0, Lp1/q;->S:Z

    if-eqz v5, :cond_13

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_13
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v0, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_14

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_15

    :cond_14
    invoke-static {v3, v0, v3, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v0, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getLowerLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-object/from16 v6, v21

    iget v3, v6, Luj/i;->h:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v0, v7}, Luj/m;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v16

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-wide v2, v2, Luj/m;->p:J

    const/16 v19, 0x0

    const v20, 0xfffa

    move-object/from16 v17, v0

    move-object v0, v1

    const/4 v1, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    move v9, v7

    const-wide/16 v7, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v23, v18

    const/16 v18, 0x0

    move-object/from16 v31, v21

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v17

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getUpperLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-object/from16 v6, v31

    iget v3, v6, Luj/i;->h:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v7, 0x0

    invoke-virtual {v2, v3, v0, v7}, Luj/m;->b(Ljava/lang/Integer;Landroidx/compose/runtime/Composer;I)Ll3/v0;

    move-result-object v16

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-wide v2, v2, Luj/m;->p:J

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v0 .. v20}, Ll1/o4;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v17

    const/4 v14, 0x1

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_16

    :goto_b
    return-void

    :cond_16
    new-instance v0, Lrj/d;

    const/4 v5, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lrj/d;-><init>(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Llj/e0;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final i(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, -0x5cd03584

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    const-string v1, "blockId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;->getBlockId()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Ll83/k;

    invoke-virtual/range {p1 .. p1}, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;->getValue()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/amplitude/android/engagement/types/SurveyResponseEmoji;->getStringResponse()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    if-eqz v0, :cond_1

    iget-object v0, v0, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    move-object v8, v0

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    const v0, -0x1896950d

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    sget-object v0, Luj/k;->a:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/m;

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    iget-object v3, v0, Luj/m;->f0:Luj/i;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v4, 0x6

    invoke-static {v0, v2, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v11, v5, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v11, v5, Lp1/q;->S:Z

    if-eqz v11, :cond_2

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_2
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v2, v5, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getEmojis()Ljava/util/List;

    move-result-object v0

    const v1, 0x6dc9984e

    invoke-virtual {v5, v1}, Lp1/q;->f0(I)V

    const/4 v11, 0x1

    if-nez v0, :cond_5

    goto/16 :goto_9

    :cond_5
    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    move v0, v9

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_c

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v2, v0, 0x1

    if-ltz v0, :cond_b

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    if-nez v8, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v2, :cond_7

    move v15, v11

    goto :goto_5

    :cond_7
    :goto_4
    move v15, v9

    :goto_5
    new-instance v13, Lrj/e;

    move-object/from16 v16, p0

    move-object/from16 v14, p2

    move-object/from16 v18, v0

    move/from16 v17, v2

    invoke-direct/range {v13 .. v18}, Lrj/e;-><init>(Lkotlin/jvm/functions/Function1;ZLcom/amplitude/android/engagement/types/SurveyRatingBlock;ILjava/lang/String;)V

    iget-object v1, v3, Luj/i;->b:Ljava/lang/Float;

    if-eqz v1, :cond_8

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_6
    move-object v14, v8

    const/16 p3, 0x0

    goto :goto_7

    :cond_8
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    int-to-float v1, v1

    div-float v1, v10, v1

    goto :goto_6

    :goto_7
    float-to-double v7, v1

    const-wide/16 v18, 0x0

    cmpl-double v2, v7, v18

    if-lez v2, :cond_9

    goto :goto_8

    :cond_9
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v1, v2

    if-lez v6, :cond_a

    move v1, v2

    :cond_a
    invoke-direct {v4, v1, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v6, 0x0

    move-object v2, v13

    move v1, v15

    invoke-static/range {v0 .. v6}, Lrj/o;->c(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v8, v14

    move/from16 v0, v17

    goto :goto_3

    :cond_b
    const/16 p3, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw p3

    :cond_c
    :goto_9
    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_d

    return-void

    :cond_d
    new-instance v18, Lc4/c;

    const/16 v23, 0x4

    move-object/from16 v19, p0

    move-object/from16 v20, p1

    move-object/from16 v21, p2

    move/from16 v22, p4

    invoke-direct/range {v18 .. v23}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    move-object/from16 v1, v18

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final j(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNPS;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v5, p3

    check-cast v5, Lp1/q;

    const v0, 0x7ae022a6

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v1

    const-string v2, "blockId"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p1 .. p1}, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;->getBlockId()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual/range {p1 .. p1}, Lcom/amplitude/android/engagement/types/SurveyResponseNPS;->getValue()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1
    :goto_0
    move-object v7, v0

    const v0, -0x1896950d

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    sget-object v0, Luj/k;->a:Lp1/u2;

    invoke-virtual {v5, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luj/m;

    const/4 v8, 0x0

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    iget-object v3, v0, Luj/m;->g0:Luj/i;

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->J:Lb2/l;

    const/4 v4, 0x6

    invoke-static {v0, v2, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_2

    invoke-virtual {v5, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v5, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v5, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_3

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_4

    :cond_3
    invoke-static {v2, v5, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v5, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x20188b8a

    invoke-virtual {v5, v0}, Lp1/q;->f0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v0

    invoke-virtual {v0}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v0

    const/4 v10, 0x1

    add-int/lit8 v11, v0, 0x1

    move v0, v8

    :goto_2
    if-ge v0, v11, :cond_8

    if-nez v7, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-ne v1, v0, :cond_6

    move v14, v10

    :goto_3
    move/from16 v16, v0

    goto :goto_5

    :cond_6
    :goto_4
    move v14, v8

    goto :goto_3

    :goto_5
    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    new-instance v12, Lrj/f;

    const/16 v17, 0x0

    move-object/from16 v15, p0

    move-object/from16 v13, p2

    invoke-direct/range {v12 .. v17}, Lrj/f;-><init>(Lkotlin/jvm/functions/Function1;ZLcom/amplitude/android/engagement/types/SurveyRatingBlock;II)V

    float-to-double v1, v9

    const-wide/16 v17, 0x0

    cmpl-double v1, v1, v17

    if-lez v1, :cond_7

    goto :goto_6

    :cond_7
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v4, v9, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v6, 0x0

    move-object v2, v12

    move v1, v14

    invoke-static/range {v0 .. v6}, Lrj/o;->c(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    add-int/lit8 v0, v16, 0x1

    goto :goto_2

    :cond_8
    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    :cond_9
    new-instance v18, Lc4/c;

    const/16 v23, 0x5

    move-object/from16 v19, p0

    move-object/from16 v20, p1

    move-object/from16 v21, p2

    move/from16 v22, p4

    invoke-direct/range {v18 .. v23}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    move-object/from16 v1, v18

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final k(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v2, p1

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x211b792a

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lup/d;->x(Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v1, -0x1896950d

    invoke-virtual {v8, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v8, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    const/4 v10, 0x0

    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    iget-object v6, v1, Luj/m;->g0:Luj/i;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x6

    invoke-static {v1, v4, v8, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v8, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v8, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x191cf2cc

    invoke-virtual {v8, v1}, Lp1/q;->f0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    move v3, v10

    :goto_2
    const/4 v4, 0x1

    if-ge v3, v1, :cond_9

    add-int/lit8 v3, v3, 0x1

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-ne v5, v3, :cond_5

    move v14, v4

    :goto_3
    move/from16 v16, v3

    goto :goto_5

    :cond_5
    :goto_4
    move v14, v10

    goto :goto_3

    :goto_5
    invoke-static/range {v16 .. v16}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    new-instance v12, Lrj/f;

    const/16 v17, 0x1

    move-object/from16 v15, p0

    move-object/from16 v13, p2

    invoke-direct/range {v12 .. v17}, Lrj/f;-><init>(Lkotlin/jvm/functions/Function1;ZLcom/amplitude/android/engagement/types/SurveyRatingBlock;II)V

    iget-object v5, v6, Luj/i;->b:Ljava/lang/Float;

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v5

    :goto_6
    move-object v7, v12

    goto :goto_7

    :cond_6
    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v5

    invoke-virtual {v5}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v5

    int-to-float v5, v5

    div-float v5, v11, v5

    goto :goto_6

    :goto_7
    float-to-double v11, v5

    const-wide/16 v17, 0x0

    cmpl-double v9, v11, v17

    if-lez v9, :cond_7

    :goto_8
    move-object v12, v7

    goto :goto_9

    :cond_7
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_8

    :goto_9
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v11, v5, v9

    if-lez v11, :cond_8

    move v5, v9

    :cond_8
    invoke-direct {v7, v5, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v9, 0x0

    move-object v5, v12

    move v4, v14

    invoke-static/range {v3 .. v9}, Lrj/o;->c(Ljava/lang/String;ZLc93/a;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move/from16 v3, v16

    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_2

    :cond_9
    invoke-virtual {v8, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_a

    return-void

    :cond_a
    new-instance v0, Lrj/g;

    const/4 v5, 0x0

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lrj/g;-><init>(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final l(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v2, p1

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v0, 0x25d55a5a

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getUuid()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lup/d;->x(Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const v1, -0x1896950d

    invoke-virtual {v7, v1}, Lp1/q;->f0(I)V

    sget-object v1, Luj/k;->a:Lp1/u2;

    invoke-virtual {v7, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Luj/m;

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    iget-object v5, v1, Luj/m;->h0:Luj/i;

    const/4 v1, 0x4

    int-to-float v1, v1

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v6, 0x6

    invoke-static {v1, v4, v7, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v11, v7, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v4, v7, v4, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x79f62347

    invoke-virtual {v7, v1}, Lp1/q;->f0(I)V

    invoke-virtual/range {p0 .. p0}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v1

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v1

    move v3, v9

    :goto_2
    const/4 v4, 0x1

    if-ge v3, v1, :cond_8

    add-int/lit8 v11, v3, 0x1

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v3

    if-gt v11, v3, :cond_4

    move v3, v4

    goto :goto_3

    :cond_4
    move v3, v9

    :goto_3
    new-instance v6, Lrj/h;

    move-object/from16 v12, p0

    move-object/from16 v13, p2

    invoke-direct {v6, v13, v0, v11, v12}, Lrj/h;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;ILcom/amplitude/android/engagement/types/SurveyRatingBlock;)V

    iget-object v8, v5, Luj/i;->b:Ljava/lang/Float;

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lcom/amplitude/android/engagement/types/SurveyRatingBlock;->getMeta()Lcom/amplitude/android/engagement/types/SurveyRatingMeta;

    move-result-object v8

    invoke-virtual {v8}, Lcom/amplitude/android/engagement/types/SurveyRatingMeta;->getOptions()I

    move-result v8

    int-to-float v8, v8

    div-float v8, v10, v8

    :goto_4
    float-to-double v14, v8

    const-wide/16 v16, 0x0

    cmpl-double v14, v14, v16

    if-lez v14, :cond_6

    :goto_5
    move-object v14, v6

    goto :goto_6

    :cond_6
    const-string v14, "invalid weight; must be greater than zero"

    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v15, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v16, v8, v15

    if-lez v16, :cond_7

    move v8, v15

    :cond_7
    invoke-direct {v6, v8, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v8, 0x0

    move-object v4, v14

    invoke-static/range {v3 .. v8}, Lrj/o;->d(ZLrj/h;Luj/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v3, v11

    goto :goto_2

    :cond_8
    move-object/from16 v12, p0

    move-object/from16 v13, p2

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_9

    return-void

    :cond_9
    new-instance v0, Lrj/g;

    const/4 v5, 0x1

    move/from16 v4, p4

    move-object v1, v12

    move-object v3, v13

    invoke-direct/range {v0 .. v5}, Lrj/g;-><init>(Lcom/amplitude/android/engagement/types/SurveyRatingBlock;Lcom/amplitude/android/engagement/types/SurveyResponseNumber;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final m(Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x1fae3065

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0xe

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x70

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x380

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v5, v5, 0x2db

    const/16 v6, 0x92

    if-ne v5, v6, :cond_7

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v29, v0

    goto/16 :goto_b

    :cond_7
    :goto_4
    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyTextShortBlock;->getUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lup/d;->z(Lcom/amplitude/android/engagement/types/SurveyResponseText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v30, v5

    goto :goto_7

    :cond_9
    :goto_6
    const-string v5, ""

    goto :goto_5

    :goto_7
    sget-object v5, Ll1/t2;->a:Ll1/t2;

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    iget-object v5, v5, Luj/m;->i0:Luj/i;

    iget-wide v5, v5, Luj/i;->f:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v7

    iget-wide v7, v7, Luj/m;->v:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v9

    iget-wide v9, v9, Luj/m;->v:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget-object v11, v11, Luj/m;->i0:Luj/i;

    iget-wide v11, v11, Luj/i;->e:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v13

    iget-object v13, v13, Luj/m;->i0:Luj/i;

    iget-wide v13, v13, Luj/i;->e:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v15

    move-wide/from16 v17, v5

    iget-wide v4, v15, Luj/m;->y:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    move-wide v15, v4

    iget-wide v4, v6, Luj/i;->g:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    move-wide/from16 v19, v4

    iget-wide v4, v6, Luj/i;->g:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    move-wide/from16 v21, v4

    iget-wide v4, v6, Luj/m;->q:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    iget-object v6, v6, Luj/i;->k:Li2/x;

    const v2, 0xbe9fd68

    invoke-virtual {v0, v2}, Lp1/q;->f0(I)V

    if-nez v6, :cond_a

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v23, v4

    iget-wide v4, v2, Luj/m;->p:J

    goto :goto_8

    :cond_a
    move-wide/from16 v23, v4

    iget-wide v4, v6, Li2/x;->a:J

    :goto_8
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->i0:Luj/i;

    iget-object v6, v6, Luj/i;->k:Li2/x;

    const v2, 0xbe9fde7

    invoke-virtual {v0, v2}, Lp1/q;->f0(I)V

    if-nez v6, :cond_b

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v25, v4

    iget-wide v4, v2, Luj/m;->p:J

    :goto_9
    const/4 v2, 0x0

    goto :goto_a

    :cond_b
    move-wide/from16 v25, v4

    iget-wide v4, v6, Li2/x;->a:J

    goto :goto_9

    :goto_a
    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v27, v4

    iget-wide v4, v2, Luj/m;->q:J

    move-wide/from16 v31, v27

    move-wide/from16 v27, v4

    move-wide/from16 v5, v19

    move-wide/from16 v19, v7

    move-wide/from16 v7, v21

    move-wide/from16 v21, v9

    move-wide/from16 v9, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v31

    move-object/from16 v29, v0

    invoke-static/range {v5 .. v29}, Ll1/t2;->c(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;)Ll1/e4;

    move-result-object v18

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-object v2, v2, Luj/m;->i0:Luj/i;

    iget v2, v2, Luj/i;->d:F

    invoke-static {v2}, Lt0/j;->a(F)Lt0/i;

    move-result-object v17

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v12, Lu0/r0;

    const/4 v2, 0x7

    const/16 v4, 0x77

    const/4 v5, 0x0

    invoke-direct {v12, v5, v5, v2, v4}, Lu0/r0;-><init>(IIII)V

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Lb2/z;

    const/16 v2, 0x16

    invoke-direct {v4, v2, v3, v1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lc4/e;

    const/16 v4, 0x8

    invoke-direct {v2, v1, v4}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    const v4, 0xbb6694c

    invoke-static {v4, v0, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v21, 0xc30000

    const v22, 0x1d7f78

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x1

    const/4 v15, 0x0

    const/16 v16, 0x0

    const v20, 0xc00180

    move-object/from16 v19, v0

    move-object/from16 v5, v30

    invoke-static/range {v5 .. v22}, Ll1/c3;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v29, v19

    :goto_b
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_e

    return-void

    :cond_e
    new-instance v0, Lc4/c;

    const/4 v5, 0x6

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final n(Lcom/amplitude/android/engagement/types/SurveyTextBlock;Lcom/amplitude/android/engagement/types/SurveyResponseText;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, -0x1fff69f7

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0xe

    if-nez v5, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_1
    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x70

    if-nez v6, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v4, 0x380

    if-nez v6, :cond_5

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v5, v5, 0x2db

    const/16 v6, 0x92

    if-ne v5, v6, :cond_7

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v29, v0

    goto/16 :goto_b

    :cond_7
    :goto_4
    if-eqz v2, :cond_9

    invoke-virtual {v1}, Lcom/amplitude/android/engagement/types/SurveyTextBlock;->getUuid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Lup/d;->z(Lcom/amplitude/android/engagement/types/SurveyResponseText;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_8

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v30, v5

    goto :goto_7

    :cond_9
    :goto_6
    const-string v5, ""

    goto :goto_5

    :goto_7
    sget-object v5, Ll1/t2;->a:Ll1/t2;

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v5

    iget-object v5, v5, Luj/m;->j0:Luj/i;

    iget-wide v5, v5, Luj/i;->f:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v7

    iget-wide v7, v7, Luj/m;->v:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v9

    iget-wide v9, v9, Luj/m;->v:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v11

    iget-object v11, v11, Luj/m;->j0:Luj/i;

    iget-wide v11, v11, Luj/i;->e:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v13

    iget-object v13, v13, Luj/m;->j0:Luj/i;

    iget-wide v13, v13, Luj/i;->e:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v15

    move-wide/from16 v17, v5

    iget-wide v4, v15, Luj/m;->y:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->j0:Luj/i;

    move-wide v15, v4

    iget-wide v4, v6, Luj/i;->g:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->j0:Luj/i;

    move-wide/from16 v19, v4

    iget-wide v4, v6, Luj/i;->g:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    move-wide/from16 v21, v4

    iget-wide v4, v6, Luj/m;->q:J

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->j0:Luj/i;

    iget-object v6, v6, Luj/i;->k:Li2/x;

    const v2, -0x2b71d7e3

    invoke-virtual {v0, v2}, Lp1/q;->f0(I)V

    if-nez v6, :cond_a

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v23, v4

    iget-wide v4, v2, Luj/m;->p:J

    goto :goto_8

    :cond_a
    move-wide/from16 v23, v4

    iget-wide v4, v6, Li2/x;->a:J

    :goto_8
    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v6

    iget-object v6, v6, Luj/m;->j0:Luj/i;

    iget-object v6, v6, Luj/i;->k:Li2/x;

    const v2, -0x2b71d761

    invoke-virtual {v0, v2}, Lp1/q;->f0(I)V

    if-nez v6, :cond_b

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v25, v4

    iget-wide v4, v2, Luj/m;->p:J

    :goto_9
    const/4 v2, 0x0

    goto :goto_a

    :cond_b
    move-wide/from16 v25, v4

    iget-wide v4, v6, Li2/x;->a:J

    goto :goto_9

    :goto_a
    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    move-wide/from16 v27, v4

    iget-wide v4, v2, Luj/m;->q:J

    move-wide/from16 v31, v27

    move-wide/from16 v27, v4

    move-wide/from16 v5, v19

    move-wide/from16 v19, v7

    move-wide/from16 v7, v21

    move-wide/from16 v21, v9

    move-wide/from16 v9, v23

    move-wide/from16 v23, v25

    move-wide/from16 v25, v31

    move-object/from16 v29, v0

    invoke-static/range {v5 .. v29}, Ll1/t2;->c(JJJJJJJJJJJJLandroidx/compose/runtime/Composer;)Ll1/e4;

    move-result-object v18

    invoke-static {v0}, Luj/j;->f(Landroidx/compose/runtime/Composer;)Luj/m;

    move-result-object v2

    iget-object v2, v2, Luj/m;->j0:Luj/i;

    iget v2, v2, Luj/i;->d:F

    invoke-static {v2}, Lt0/j;->a(F)Lt0/i;

    move-result-object v17

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v4, 0x78

    int-to-float v4, v4

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v2, v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_c

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_d

    :cond_c
    new-instance v4, Lb2/z;

    const/16 v2, 0x17

    invoke-direct {v4, v2, v3, v1}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v6, v4

    check-cast v6, Lkotlin/jvm/functions/Function1;

    new-instance v2, Lc4/e;

    const/16 v4, 0x9

    invoke-direct {v2, v1, v4}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    const v4, -0x16b78c50

    invoke-static {v4, v0, v2}, Lx1/c;->b(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/high16 v21, 0x6000000

    const v22, 0x1bff78

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x5

    const/16 v16, 0x0

    const v20, 0xc00180

    move-object/from16 v19, v0

    move-object/from16 v5, v30

    invoke-static/range {v5 .. v22}, Ll1/c3;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v29, v19

    :goto_b
    invoke-virtual/range {v29 .. v29}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_e

    return-void

    :cond_e
    new-instance v0, Lc4/c;

    const/4 v5, 0x7

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lc4/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static varargs o(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    .locals 10

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    array-length v0, p1

    if-ge v2, v0, :cond_1

    aget-object v3, p1, v2

    if-nez v3, :cond_0

    const-string v0, "null"

    goto :goto_1

    :cond_0
    :try_start_0
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    move-object v8, v0

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    const-string v4, "@"

    invoke-static {v0, v4, v3}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v3, "com.google.common.base.Strings"

    invoke-static {v3}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v6, "lenientToString"

    const-string v5, "Exception during lenientFormat for "

    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    const-string v5, "com.google.common.base.Strings"

    invoke-virtual/range {v3 .. v8}, Ljava/util/logging/Logger;->logp(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v3

    const-string v4, " threw "

    const-string v5, ">"

    const-string v6, "<"

    invoke-static {v6, v0, v4, v3, v5}, Lb9/y;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_1
    aput-object v0, p1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v2

    mul-int/lit8 v0, v0, 0x10

    new-instance v3, Ljava/lang/StringBuilder;

    add-int/2addr v2, v0

    invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    move v0, v1

    :goto_2
    array-length v2, p1

    if-ge v1, v2, :cond_3

    const-string v4, "%s"

    invoke-virtual {p0, v4, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v4

    const/4 v5, -0x1

    if-ne v4, v5, :cond_2

    goto :goto_3

    :cond_2
    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    add-int/lit8 v0, v1, 0x1

    aget-object v1, p1, v1

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    add-int/lit8 v1, v4, 0x2

    move v9, v1

    move v1, v0

    move v0, v9

    goto :goto_2

    :cond_3
    :goto_3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v4

    invoke-virtual {v3, p0, v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;

    if-ge v1, v2, :cond_5

    const-string p0, " ["

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 p0, v1, 0x1

    aget-object v0, p1, v1

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_4
    array-length v0, p1

    if-ge p0, v0, :cond_4

    const-string v0, ", "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v0, p0, 0x1

    aget-object p0, p1, p0

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move p0, v0

    goto :goto_4

    :cond_4
    const/16 p0, 0x5d

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_5
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 5

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x22

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_3

    invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v3

    const/16 v4, 0xa

    if-eq v3, v4, :cond_2

    const/16 v4, 0xd

    if-eq v3, v4, :cond_1

    if-eq v3, v0, :cond_0

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_0
    const-string v3, "%22"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const-string v3, "%0D"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_2
    const-string v3, "%0A"

    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-void
.end method

.method public static q(FFF)F
    .locals 1

    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    return p1

    :cond_0
    cmpl-float p1, p0, p2

    if-lez p1, :cond_1

    return p2

    :cond_1
    return p0
.end method

.method public static r(III)I
    .locals 0

    if-ge p0, p1, :cond_0

    return p1

    :cond_0
    if-le p0, p2, :cond_1

    return p2

    :cond_1
    return p0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    if-eq p0, p1, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static t(Landroid/content/pm/PackageInfo;)J
    .locals 2

    invoke-virtual {p0}, Landroid/content/pm/PackageInfo;->getLongVersionCode()J

    move-result-wide v0

    return-wide v0
.end method

.method public static u(Landroid/text/TextPaint;Ljava/lang/String;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->hasGlyph(Ljava/lang/String;)Z

    move-result p0

    return p0
.end method

.method public static v(I)Ljava/lang/String;
    .locals 2

    packed-switch p0, :pswitch_data_0

    :pswitch_0
    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :pswitch_1
    const-string p0, "EXTENDED ERROR"

    return-object p0

    :pswitch_2
    const-string p0, "OPERATION FAILED"

    return-object p0

    :pswitch_3
    const-string p0, "OPERATION NOT PERMITTED"

    return-object p0

    :pswitch_4
    const-string p0, "UNSUPPORTED TYPE"

    return-object p0

    :pswitch_5
    const-string p0, "INVALID OBJECT"

    return-object p0

    :pswitch_6
    const-string p0, "INSUFFICIENT RESOURCES"

    return-object p0

    :pswitch_7
    const-string p0, "INVALID PARAM"

    return-object p0

    :pswitch_8
    const-string p0, "OP CODE NOT SUPPORTED"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x202
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public static w(I)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x802

    if-eq p0, v0, :cond_1

    const/16 v0, 0x804

    if-eq p0, v0, :cond_0

    const-string v0, "UNKNOWN ("

    const-string v1, ")"

    invoke-static {p0, v0, v1}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const-string p0, "OPERATION FAILED"

    return-object p0

    :cond_1
    const-string p0, "OP CODE NOT SUPPORTED"

    return-object p0
.end method

.method public static x(I)Ljava/lang/String;
    .locals 0

    packed-switch p0, :pswitch_data_0

    const-string p0, "Reserved for future use"

    return-object p0

    :pswitch_0
    const-string p0, "Insufficient space"

    return-object p0

    :pswitch_1
    const-string p0, "Verification failed"

    return-object p0

    :pswitch_2
    const-string p0, "Wrong signature type"

    return-object p0

    :pswitch_3
    const-string p0, "Hash failed"

    return-object p0

    :pswitch_4
    const-string p0, "Wrong hash type"

    return-object p0

    :pswitch_5
    const-string p0, "Signature mismatch"

    return-object p0

    :pswitch_6
    const-string p0, "SD version failure"

    return-object p0

    :pswitch_7
    const-string p0, "HW version failure"

    return-object p0

    :pswitch_8
    const-string p0, "FW version failure"

    return-object p0

    :pswitch_9
    const-string p0, "Init command invalid"

    return-object p0

    :pswitch_a
    const-string p0, "Unknown command"

    return-object p0

    :pswitch_b
    const-string p0, "Wrong command format"

    return-object p0

    :pswitch_data_0
    .packed-switch 0x402
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

.method public static y(Landroid/content/Context;)Lvp/d;
    .locals 5

    invoke-static {p0}, Luo/w;->f(Ljava/lang/Object;)V

    const-string v0, "null"

    const-string v1, "preferredRenderer: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "j"

    invoke-static {v1, v0}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object v0, Lrj/j;->b:Lvp/d;

    if-nez v0, :cond_2

    sget-object v0, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    const v0, 0xcc77c0

    invoke-static {p0, v0}, Lcom/google/android/gms/common/e;->a(Landroid/content/Context;I)I

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lrj/j;->A(Landroid/content/Context;I)Lvp/d;

    move-result-object v2

    sput-object v2, Lrj/j;->b:Lvp/d;

    :try_start_0
    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    const/16 v4, 0x9

    invoke-virtual {v2, v3, v4}, Lip/a;->j0(Landroid/os/Parcel;I)Landroid/os/Parcel;

    move-result-object v2

    invoke-virtual {v2}, Landroid/os/Parcel;->readInt()I

    move-result v3

    invoke-virtual {v2}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_3

    const/4 v2, 0x2

    if-ne v3, v2, :cond_0

    :try_start_1
    sget-object v2, Lrj/j;->b:Lvp/d;

    invoke-static {p0, v0}, Lrj/j;->z(Landroid/content/Context;I)Landroid/content/Context;

    move-result-object v3

    new-instance v4, Lcp/b;

    invoke-direct {v4, v3}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v2}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object v3

    invoke-static {v3, v4}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const/16 v4, 0xb

    invoke-virtual {v2, v3, v4}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_1
    .catch Ljava/lang/UnsatisfiedLinkError; {:try_start_1 .. :try_end_1} :catch_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_1
    const-string v2, "Caught UnsatisfiedLinkError attempting to load the LATEST renderer\'s native library. Attempting to use the LEGACY renderer instead."

    invoke-static {v1, v2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    const/4 v1, 0x0

    sput-object v1, Lrj/j;->a:Landroid/content/Context;

    const/4 v1, 0x1

    invoke-static {p0, v1}, Lrj/j;->A(Landroid/content/Context;I)Lvp/d;

    move-result-object v1

    sput-object v1, Lrj/j;->b:Lvp/d;

    :cond_0
    :goto_0
    :try_start_2
    sget-object v1, Lrj/j;->b:Lvp/d;

    invoke-static {p0, v0}, Lrj/j;->z(Landroid/content/Context;I)Landroid/content/Context;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    new-instance v0, Lcp/b;

    invoke-direct {v0, p0}, Lcp/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lip/a;->k0()Landroid/os/Parcel;

    move-result-object p0

    invoke-static {p0, v0}, Lop/h;->d(Landroid/os/Parcel;Landroid/os/IInterface;)V

    const v0, 0x112f6a0

    invoke-virtual {p0, v0}, Landroid/os/Parcel;->writeInt(I)V

    const/4 v0, 0x6

    invoke-virtual {v1, p0, v0}, Lip/a;->l0(Landroid/os/Parcel;I)V
    :try_end_2
    .catch Landroid/os/RemoteException; {:try_start_2 .. :try_end_2} :catch_2

    sget-object p0, Lrj/j;->b:Lvp/d;

    return-object p0

    :catch_2
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :catch_3
    move-exception p0

    new-instance v0, Lcom/google/android/gms/maps/model/RuntimeRemoteException;

    invoke-direct {v0, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    new-instance p0, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;

    invoke-direct {p0, v0}, Lcom/google/android/gms/common/GooglePlayServicesNotAvailableException;-><init>(I)V

    throw p0

    :cond_2
    return-object v0
.end method

.method public static z(Landroid/content/Context;I)Landroid/content/Context;
    .locals 7

    sget-object v0, Lrj/j;->a:Landroid/content/Context;

    if-nez v0, :cond_2

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    const-string p1, "com.google.android.gms.maps_legacy_dynamite"

    goto :goto_0

    :cond_0
    const-string p1, "com.google.android.gms.maps_core_dynamite"

    :goto_0
    :try_start_0
    sget-object v0, Ldp/b;->b:Lkr/e;

    invoke-static {p0, v0, p1}, Ldp/b;->c(Landroid/content/Context;Lkr/e;Ljava/lang/String;)Ldp/b;

    move-result-object v0

    iget-object p0, v0, Ldp/b;->a:Landroid/content/Context;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception v0

    const-string v1, "com.google.android.gms.maps_dynamite"

    invoke-virtual {p1, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    const/4 v2, 0x0

    const/4 v3, 0x3

    const-string v4, "com.google.android.gms"

    const-string v5, "Failed to load maps module, use pre-Chimera"

    const-string v6, "j"

    if-nez p1, :cond_1

    :try_start_1
    const-string p1, "Attempting to load maps_dynamite again."

    invoke-static {v6, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    sget-object p1, Ldp/b;->b:Lkr/e;

    invoke-static {p0, p1, v1}, Ldp/b;->c(Landroid/content/Context;Lkr/e;Ljava/lang/String;)Ldp/b;

    move-result-object p1

    iget-object p0, p1, Ldp/b;->a:Landroid/content/Context;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_1

    :catch_1
    move-exception p1

    invoke-static {v6, v5, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p1, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    :try_start_2
    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0
    :try_end_2
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    goto :goto_1

    :catch_2
    move-object p0, v2

    goto :goto_1

    :cond_1
    invoke-static {v6, v5, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    sget-object p1, Lcom/google/android/gms/common/e;->a:Ljava/util/concurrent/atomic/AtomicBoolean;

    :try_start_3
    invoke-virtual {p0, v4, v3}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    move-result-object p0
    :try_end_3
    .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_3 .. :try_end_3} :catch_2

    :goto_1
    sput-object p0, Lrj/j;->a:Landroid/content/Context;

    return-object p0

    :cond_2
    return-object v0
.end method
