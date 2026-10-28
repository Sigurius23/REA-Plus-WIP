.class public abstract Le4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:Lo2/e; = null

.field public static b:Ljava/lang/Boolean; = null

.field public static c:Landroid/content/Context; = null

.field public static d:Lhm/d; = null

.field public static volatile e:Z = true


# direct methods
.method public static final synthetic A()Lr7/k;
    .locals 3

    const v0, 0xf4240

    int-to-double v0, v0

    sget-object v2, Lr7/k;->y:Lr7/e;

    invoke-static {v0, v1}, Lr7/e;->a(D)Lr7/k;

    move-result-object v0

    return-object v0
.end method

.method public static B(I[I[I[Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "$"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v1, 0x0

    :goto_0
    if-ge v1, p0, :cond_3

    aget v2, p1, v1

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_1

    const/4 v3, 0x3

    if-eq v2, v3, :cond_0

    const/4 v3, 0x4

    if-eq v2, v3, :cond_0

    const/4 v3, 0x5

    if-eq v2, v3, :cond_0

    goto :goto_1

    :cond_0
    const/16 v2, 0x2e

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget-object v2, p3, v1

    if-eqz v2, :cond_2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    const/16 v2, 0x5b

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    aget v2, p2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v2, 0x5d

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_2
    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static C(Landroidx/compose/runtime/Composer;)Lb30/h4;
    .locals 5

    check-cast p0, Lp1/q;

    const v0, -0x62c3c378

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    const v0, -0x6845e150

    invoke-virtual {p0, v0}, Lp1/q;->e0(I)V

    sget-object v0, Ld40/p;->e:Ld40/k;

    sget-object v1, Lb30/i4;->b:Lp1/u2;

    invoke-virtual {p0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lb30/h4;

    const v2, -0x4a290cf8

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {p0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_4

    :cond_0
    iget v2, v1, Lb30/h4;->a:F

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_0

    :cond_1
    iget-object v2, v0, Ld40/k;->c:Ld40/j;

    iget v2, v2, Ld40/j;->a:F

    :goto_0
    iget v3, v1, Lb30/h4;->b:F

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v0, Ld40/k;->c:Ld40/j;

    iget v3, v3, Ld40/j;->b:F

    :goto_1
    iget v1, v1, Lb30/h4;->c:F

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_2

    :cond_3
    iget-object v0, v0, Ld40/k;->c:Ld40/j;

    iget v1, v0, Ld40/j;->c:F

    :goto_2
    new-instance v0, Lb30/h4;

    invoke-direct {v0, v2, v3, v1}, Lb30/h4;-><init>(FFF)V

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :cond_4
    check-cast v3, Lb30/h4;

    const/4 v0, 0x0

    invoke-static {p0, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-object v3
.end method

.method public static D(Ljava/util/List;Lio/sentry/e5;)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p1, :cond_8

    if-eqz p0, :cond_8

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1}, Ljava/util/HashSet;-><init>()V

    iget-object v2, p1, Lio/sentry/e5;->Q:Lio/sentry/protocol/o;

    if-eqz v2, :cond_2

    iget-object v3, v2, Lio/sentry/protocol/o;->x:Ljava/lang/String;

    if-eqz v3, :cond_1

    invoke-virtual {v1, v3}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_1
    iget-object v2, v2, Lio/sentry/protocol/o;->w:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_2
    invoke-virtual {p1}, Lio/sentry/r4;->a()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_3
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x1

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/sentry/e0;

    iget-object v2, v2, Lio/sentry/e0;->a:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    return v3

    :cond_5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_6
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/sentry/e0;

    invoke-virtual {v1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_6

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-virtual {p1, v4}, Lio/sentry/e0;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_7

    return v3

    :cond_8
    :goto_0
    return v0
.end method

.method public static E(Li2/p0;FF)Z
    .locals 22

    move-object/from16 v0, p0

    instance-of v1, v0, Li2/n0;

    if-eqz v1, :cond_0

    check-cast v0, Li2/n0;

    iget-object v0, v0, Li2/n0;->a:Lh2/c;

    iget v1, v0, Lh2/c;->a:F

    cmpg-float v1, v1, p1

    if-gtz v1, :cond_7

    iget v1, v0, Lh2/c;->c:F

    cmpg-float v1, p1, v1

    if-gez v1, :cond_7

    iget v1, v0, Lh2/c;->b:F

    cmpg-float v1, v1, p2

    if-gtz v1, :cond_7

    iget v0, v0, Lh2/c;->d:F

    cmpg-float v0, p2, v0

    if-gez v0, :cond_7

    goto/16 :goto_0

    :cond_0
    instance-of v1, v0, Li2/o0;

    if-eqz v1, :cond_8

    check-cast v0, Li2/o0;

    iget-object v0, v0, Li2/o0;->a:Lh2/d;

    iget v1, v0, Lh2/d;->a:F

    iget-wide v2, v0, Lh2/d;->f:J

    iget-wide v4, v0, Lh2/d;->h:J

    iget-wide v6, v0, Lh2/d;->g:J

    iget v8, v0, Lh2/d;->d:F

    iget v9, v0, Lh2/d;->b:F

    iget v10, v0, Lh2/d;->c:F

    iget-wide v11, v0, Lh2/d;->e:J

    cmpg-float v13, p1, v1

    if-ltz v13, :cond_7

    cmpl-float v13, p1, v10

    if-gez v13, :cond_7

    cmpg-float v13, p2, v9

    if-ltz v13, :cond_7

    cmpl-float v13, p2, v8

    if-ltz v13, :cond_1

    goto/16 :goto_1

    :cond_1
    const/16 v13, 0x20

    shr-long v14, v11, v13

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v15

    move/from16 p0, v13

    move/from16 v16, v14

    shr-long v13, v2, p0

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    add-float/2addr v14, v15

    invoke-virtual {v0}, Lh2/d;->b()F

    move-result v15

    cmpg-float v14, v14, v15

    if-gtz v14, :cond_6

    shr-long v14, v4, p0

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v15

    move/from16 v17, v1

    move-wide/from16 v18, v2

    shr-long v1, v6, p0

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, v15

    invoke-virtual {v0}, Lh2/d;->b()F

    move-result v3

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_6

    const-wide v2, 0xffffffffL

    and-long/2addr v11, v2

    long-to-int v11, v11

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v12

    and-long/2addr v4, v2

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    add-float/2addr v5, v12

    invoke-virtual {v0}, Lh2/d;->a()F

    move-result v12

    cmpg-float v5, v5, v12

    if-gtz v5, :cond_6

    move-wide/from16 v20, v2

    and-long v2, v18, v20

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    and-long v5, v6, v20

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    add-float/2addr v6, v3

    invoke-virtual {v0}, Lh2/d;->a()F

    move-result v3

    cmpg-float v3, v6, v3

    if-gtz v3, :cond_6

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    add-float v3, v3, v17

    invoke-static {v11}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    add-float/2addr v6, v9

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float v7, v10, v7

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    add-float/2addr v2, v9

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v10, v1

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v5, v8, v1

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float/2addr v8, v1

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    add-float v4, v1, v17

    cmpg-float v1, p1, v3

    if-gez v1, :cond_2

    cmpg-float v1, p2, v6

    if-gez v1, :cond_2

    iget-wide v0, v0, Lh2/d;->e:J

    move/from16 v2, p1

    move v4, v3

    move v5, v6

    move/from16 v3, p2

    invoke-static/range {v0 .. v5}, Le4/a;->H(JFFFF)Z

    move-result v0

    return v0

    :cond_2
    cmpg-float v1, p1, v4

    if-gez v1, :cond_3

    cmpl-float v1, p2, v8

    if-lez v1, :cond_3

    iget-wide v0, v0, Lh2/d;->h:J

    move/from16 v2, p1

    move/from16 v3, p2

    move v5, v8

    invoke-static/range {v0 .. v5}, Le4/a;->H(JFFFF)Z

    move-result v0

    return v0

    :cond_3
    cmpl-float v1, p1, v7

    if-lez v1, :cond_4

    cmpg-float v1, p2, v2

    if-gez v1, :cond_4

    iget-wide v0, v0, Lh2/d;->f:J

    move/from16 v3, p2

    move v5, v2

    move v4, v7

    move/from16 v2, p1

    invoke-static/range {v0 .. v5}, Le4/a;->H(JFFFF)Z

    move-result v0

    return v0

    :cond_4
    cmpl-float v1, p1, v10

    if-lez v1, :cond_5

    cmpl-float v1, p2, v5

    if-lez v1, :cond_5

    iget-wide v0, v0, Lh2/d;->g:J

    move/from16 v2, p1

    move/from16 v3, p2

    move v4, v10

    invoke-static/range {v0 .. v5}, Le4/a;->H(JFFFF)Z

    move-result v0

    return v0

    :cond_5
    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_6
    move/from16 v2, p1

    move/from16 v3, p2

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    invoke-static {v1, v0}, Li2/s0;->b(Li2/s0;Lh2/d;)V

    invoke-static {v1, v2, v3}, Le4/a;->F(Li2/s0;FF)Z

    move-result v0

    return v0

    :cond_7
    :goto_1
    const/4 v0, 0x0

    return v0

    :cond_8
    move/from16 v2, p1

    move/from16 v3, p2

    instance-of v1, v0, Li2/m0;

    if-eqz v1, :cond_9

    check-cast v0, Li2/m0;

    iget-object v0, v0, Li2/m0;->a:Li2/s0;

    invoke-static {v0, v2, v3}, Le4/a;->F(Li2/s0;FF)Z

    move-result v0

    return v0

    :cond_9
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public static final F(Li2/s0;FF)Z
    .locals 4

    new-instance v0, Lh2/c;

    const v1, 0x3ba3d70a    # 0.005f

    sub-float v2, p1, v1

    sub-float v3, p2, v1

    add-float/2addr p1, v1

    add-float/2addr p2, v1

    invoke-direct {v0, v2, v3, p1, p2}, Lh2/c;-><init>(FFFF)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p1

    invoke-static {p1, v0}, Li2/s0;->a(Li2/s0;Lh2/c;)V

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, p0, p1, v0}, Li2/j;->j(Li2/s0;Li2/s0;I)Z

    iget-object p0, p2, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {p0}, Landroid/graphics/Path;->isEmpty()Z

    move-result p0

    invoke-virtual {p2}, Li2/j;->k()V

    invoke-virtual {p1}, Li2/j;->k()V

    xor-int/2addr p0, v0

    return p0
.end method

.method public static G(Landroid/content/Context;)Z
    .locals 4

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p0

    if-eqz p0, :cond_5

    sget-object v0, Le4/a;->b:Ljava/lang/Boolean;

    if-eqz v0, :cond_0

    sget-object v0, Le4/a;->c:Landroid/content/Context;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Le4/a;->b:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_0
    const/4 v0, 0x0

    sput-object v0, Le4/a;->b:Ljava/lang/Boolean;

    sget-object v1, Le4/a;->d:Lhm/d;

    if-eqz v1, :cond_1

    sget-object v1, Le4/a;->c:Landroid/content/Context;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    new-instance v1, Lhm/d;

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v2

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lhm/d;-><init>(Ljava/lang/Object;I)V

    sput-object v1, Le4/a;->d:Lhm/d;

    :cond_2
    sget-object v1, Le4/a;->d:Lhm/d;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lhm/d;->y:Ljava/lang/reflect/Method;

    if-nez v2, :cond_3

    :try_start_0
    const-class v2, Landroid/content/pm/PackageManager;

    const-string v3, "isInstantApp"

    invoke-virtual {v2, v3, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v2

    sput-object v2, Lhm/d;->y:Ljava/lang/reflect/Method;
    :try_end_0
    .catch Ljava/lang/NoSuchMethodException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_3
    :try_start_1
    sget-object v2, Lhm/d;->y:Ljava/lang/reflect/Method;

    iget-object v1, v1, Lhm/d;->x:Ljava/lang/Object;

    check-cast v1, Landroid/content/pm/PackageManager;

    invoke-virtual {v2, v1, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;
    :try_end_1
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_1 .. :try_end_1} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_1 .. :try_end_1} :catch_0

    move-object v0, v1

    :catch_0
    sput-object p0, Le4/a;->c:Landroid/content/Context;

    if-eqz v0, :cond_4

    sput-object v0, Le4/a;->b:Ljava/lang/Boolean;

    goto :goto_0

    :cond_4
    :try_start_2
    invoke-virtual {p0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object p0

    const-string v0, "com.google.android.instantapps.supervisor.InstantAppsRuntime"

    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sput-object p0, Le4/a;->b:Ljava/lang/Boolean;
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_0

    :catch_1
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sput-object p0, Le4/a;->b:Ljava/lang/Boolean;

    :goto_0
    sget-object p0, Le4/a;->b:Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0

    :cond_5
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Application context is null!"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_6
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Context must be non-null"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final H(JFFFF)Z
    .locals 2

    sub-float/2addr p2, p4

    sub-float/2addr p3, p5

    const/16 p4, 0x20

    shr-long p4, p0, p4

    long-to-int p4, p4

    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p4

    const-wide v0, 0xffffffffL

    and-long/2addr p0, v0

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    mul-float/2addr p2, p2

    mul-float/2addr p4, p4

    div-float/2addr p2, p4

    mul-float/2addr p3, p3

    mul-float/2addr p0, p0

    div-float/2addr p3, p0

    add-float/2addr p3, p2

    const/high16 p0, 0x3f800000    # 1.0f

    cmpg-float p0, p3, p0

    if-gtz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final I(Ljava/lang/String;)V
    .locals 3

    const-string v0, "key"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "No valid saved state was found for the key \'"

    const-string v2, "\'. It may be missing, null, or not of the expected type. This can occur if the value was saved with a different type or if the saved state was modified unexpectedly."

    invoke-static {v1, p0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static K(Lkotlin/reflect/jvm/internal/impl/resolve/scopes/o;Lva3/h;Lz93/a;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "location"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1, p2}, Lkotlin/reflect/jvm/internal/impl/resolve/scopes/q;->getContributedFunctions(Lva3/h;Lz93/a;)Ljava/util/Collection;

    return-void
.end method

.method public static L(Lqg/c;Ljava/lang/Long;)V
    .locals 0

    const-string p1, "<this>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public static final M(Lqg/c;JLgf/b;Lng/f;)V
    .locals 0

    const-string p4, "$this$recordSeconds"

    invoke-static {p0, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "attributes"

    invoke-static {p3, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lkotlin/time/Duration;->getInWholeNanoseconds-impl(J)J

    return-void
.end method

.method public static N(Lqg/c;JLgf/c;I)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p3, Lgf/i;->w:Lgf/i;

    :cond_0
    const/4 p4, 0x0

    invoke-static {p0, p1, p2, p3, p4}, Le4/a;->M(Lqg/c;JLgf/b;Lng/f;)V

    return-void
.end method

.method public static O(Lxn/a;)V
    .locals 5

    const v0, -0x800001

    iput v0, p0, Lxn/a;->k:F

    const/high16 v0, -0x80000000

    iput v0, p0, Lxn/a;->j:I

    iget-object v0, p0, Lxn/a;->a:Ljava/lang/CharSequence;

    instance-of v1, v0, Landroid/text/Spanned;

    if-eqz v1, :cond_3

    instance-of v1, v0, Landroid/text/Spannable;

    if-nez v1, :cond_0

    invoke-static {v0}, Landroid/text/SpannableString;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableString;

    move-result-object v0

    iput-object v0, p0, Lxn/a;->a:Ljava/lang/CharSequence;

    :cond_0
    iget-object p0, p0, Lxn/a;->a:Ljava/lang/CharSequence;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    check-cast p0, Landroid/text/Spannable;

    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const-class v1, Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-interface {p0, v2, v0, v1}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    :goto_0
    if-ge v2, v1, :cond_3

    aget-object v3, v0, v2

    instance-of v4, v3, Landroid/text/style/AbsoluteSizeSpan;

    if-nez v4, :cond_1

    instance-of v4, v3, Landroid/text/style/RelativeSizeSpan;

    if-eqz v4, :cond_2

    :cond_1
    invoke-interface {p0, v3}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    :cond_2
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public static final P(Lg/l;)V
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-ge v0, v1, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object p0

    const/4 v0, 0x0

    invoke-static {p0, v0}, Lpf/c;->V(Landroid/view/Window;Z)V

    return-void
.end method

.method public static Q(FIII)F
    .locals 2

    const v0, -0x800001

    cmpl-float v1, p0, v0

    if-nez v1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_3

    const/4 p3, 0x1

    if-eq p1, p3, :cond_2

    const/4 p2, 0x2

    if-eq p1, p2, :cond_1

    return v0

    :cond_1
    return p0

    :cond_2
    int-to-float p1, p2

    :goto_0
    mul-float/2addr p0, p1

    return p0

    :cond_3
    int-to-float p1, p3

    goto :goto_0
.end method

.method public static final R(Lr93/e;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    const-string v0, "classDescriptor"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "jvmDescriptor"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lq93/d;->a:Ljava/lang/String;

    invoke-static {p0}, Lcb3/e;->g(Lr93/k;)Lva3/e;

    move-result-object v0

    iget-object v0, v0, Lva3/e;->a:Lva3/f;

    invoke-static {v0}, Lq93/d;->g(Lva3/f;)Lva3/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0}, Ldb3/b;->e(Lva3/c;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    sget-object v0, Loa3/m;->a:Loa3/m;

    invoke-static {p0, v0}, Ldp/d;->t(Lr93/e;Loa3/m;)Ljava/lang/String;

    move-result-object p0

    :goto_0
    const-string v0, "internalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x2e

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final S(Lj93/d;)Landroidx/health/platform/client/proto/w;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Landroidx/health/platform/client/proto/w;->s()Landroidx/health/platform/client/proto/v;

    move-result-object v0

    sget-object v1, Lf7/a;->b:Ljava/util/LinkedHashMap;

    invoke-virtual {v1, p0}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->c()V

    iget-object p0, v0, Landroidx/health/platform/client/proto/s0;->x:Landroidx/health/platform/client/proto/u0;

    check-cast p0, Landroidx/health/platform/client/proto/w;

    invoke-static {p0, v1}, Landroidx/health/platform/client/proto/w;->p(Landroidx/health/platform/client/proto/w;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/health/platform/client/proto/s0;->a()Landroidx/health/platform/client/proto/u0;

    move-result-object p0

    check-cast p0, Landroidx/health/platform/client/proto/w;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Not supported yet: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final T(Lrf/l;)Ljava/lang/String;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lrf/l;->w:Lvf/a;

    invoke-interface {v0}, Lvf/a;->getMethod()Lmf/r;

    move-result-object v2

    invoke-interface {v0}, Lvf/a;->getUrl()Lcg/o;

    move-result-object v3

    iget-object p0, p0, Lrf/l;->x:Lwf/a;

    iget-object p0, p0, Lwf/a;->a:Lmf/t;

    iget v0, p0, Lmf/t;->a:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    iget-object v6, p0, Lmf/t;->b:Ljava/lang/String;

    const-string v1, "HTTP"

    const-string v4, "-->"

    filled-new-array/range {v1 .. v6}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    const/4 v4, 0x0

    const/16 v5, 0x3e

    const-string v1, " "

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcz/p0;Lkotlin/jvm/functions/Function1;Lbz/i;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v1, Lcz/p0;->r:Lzy/c;

    iget-boolean v4, v1, Lcz/p0;->s:Z

    iget-object v5, v1, Lcz/p0;->m:Lzy/c;

    const-string v6, "viewActionHandler"

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "userFacingLogger"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v6, -0x414f01b9

    invoke-virtual {v12, v6}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int v6, p4, v6

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    const/16 v9, 0x20

    if-eqz v8, :cond_1

    move v8, v9

    goto :goto_1

    :cond_1
    const/16 v8, 0x10

    :goto_1
    or-int/2addr v6, v8

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x100

    goto :goto_2

    :cond_2
    const/16 v8, 0x80

    :goto_2
    or-int/2addr v6, v8

    const/4 v8, 0x1

    invoke-virtual {v12, v8}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_3

    const/16 v10, 0x800

    goto :goto_3

    :cond_3
    const/16 v10, 0x400

    :goto_3
    or-int/2addr v6, v10

    and-int/lit16 v10, v6, 0x493

    const/16 v11, 0x492

    if-ne v10, v11, :cond_5

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v10

    if-nez v10, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_17

    :cond_5
    :goto_4
    sget-object v10, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v10

    const v11, 0x468d4745

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    iget-boolean v11, v1, Lcz/p0;->t:Z

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_c

    const v11, 0x7f140fe8

    invoke-static {v12, v11}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    const v15, 0x7f140fe7

    invoke-static {v12, v15}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v15

    const v7, 0x7f14107b

    invoke-static {v12, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const v8, 0x7f140fd2

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    const v14, 0x468d90b6

    invoke-virtual {v12, v14}, Lp1/q;->e0(I)V

    and-int/lit8 v14, v6, 0x70

    if-ne v14, v9, :cond_6

    const/16 v18, 0x1

    goto :goto_5

    :cond_6
    const/16 v18, 0x0

    :goto_5
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v18, :cond_8

    if-ne v9, v13, :cond_7

    goto :goto_6

    :cond_7
    move/from16 v18, v4

    goto :goto_7

    :cond_8
    :goto_6
    new-instance v9, Lfa0/a;

    move/from16 v18, v4

    const/16 v4, 0x1b

    invoke-direct {v9, v2, v4}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v9, Lc93/a;

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    const v4, 0x468d8178

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    const/16 v4, 0x20

    if-ne v14, v4, :cond_9

    const/4 v14, 0x1

    goto :goto_8

    :cond_9
    const/4 v14, 0x0

    :goto_8
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_a

    if-ne v4, v13, :cond_b

    :cond_a
    new-instance v4, Lfa0/a;

    const/16 v14, 0x1c

    invoke-direct {v4, v2, v14}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v4, Lc93/a;

    const/4 v14, 0x0

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    move-object/from16 v17, v10

    move-object v10, v8

    move-object v8, v15

    const/16 v15, 0x6000

    move/from16 v20, v14

    move-object v14, v12

    move-object v12, v9

    move-object v9, v7

    move-object v7, v11

    const/4 v11, 0x1

    move/from16 p3, v6

    move-object/from16 v21, v13

    move/from16 v6, v20

    const/16 v16, 0x1

    move-object v13, v4

    move-object/from16 v4, v17

    invoke-static/range {v7 .. v15}, Ls30/b;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v12, v14

    goto :goto_9

    :cond_c
    move/from16 v18, v4

    move/from16 p3, v6

    move/from16 v16, v8

    move-object v4, v10

    move-object/from16 v21, v13

    const/4 v6, 0x0

    :goto_9
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v7, 0x7f1410c6

    invoke-static {v12, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x4

    int-to-float v8, v8

    const/16 v28, 0x7

    sget-object v29, Lb2/t;->w:Lb2/t;

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v27, v8

    move-object/from16 v23, v29

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v7, v8, v12, v6, v6}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const v7, 0x468dc5e6

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v15, p3, 0x70

    const/16 v7, 0x20

    if-ne v15, v7, :cond_d

    move/from16 v8, v16

    goto :goto_a

    :cond_d
    move v8, v6

    :goto_a
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_e

    move-object/from16 v8, v21

    if-ne v9, v8, :cond_f

    goto :goto_b

    :cond_e
    move-object/from16 v8, v21

    :goto_b
    new-instance v9, Lgz/d;

    invoke-direct {v9, v2}, Lgz/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lgz/d;

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v10, 0x468dd681

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    if-ne v15, v7, :cond_10

    move/from16 v10, v16

    goto :goto_c

    :cond_10
    move v10, v6

    :goto_c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_11

    if-ne v11, v8, :cond_12

    :cond_11
    new-instance v11, Lgz/c;

    invoke-direct {v11, v2}, Lgz/c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v11, Lgz/c;

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v10, 0x468de6fc

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    if-ne v15, v7, :cond_13

    move/from16 v10, v16

    goto :goto_d

    :cond_13
    move v10, v6

    :goto_d
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_14

    if-ne v13, v8, :cond_15

    :cond_14
    new-instance v13, Lgz/b;

    invoke-direct {v13, v2}, Lgz/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v13, Lgz/b;

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v10, 0x468df6df

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    if-ne v15, v7, :cond_16

    move/from16 v10, v16

    goto :goto_e

    :cond_16
    move v10, v6

    :goto_e
    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v10, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v10, :cond_17

    if-ne v14, v8, :cond_18

    :cond_17
    new-instance v14, Lgz/e;

    invoke-direct {v14, v2, v3}, Lgz/e;-><init>(Lkotlin/jvm/functions/Function1;Lbz/i;)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v14, Lgz/e;

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v10, 0x468e0bca

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    sget-object v10, La40/f;->a:Lp1/u2;

    invoke-virtual {v10, v9}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v9

    sget-object v10, La40/d;->a:Lp1/u2;

    invoke-virtual {v10, v11}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v10

    sget-object v11, La40/b;->a:Lp1/u2;

    invoke-virtual {v11, v13}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v11

    sget-object v13, Lv30/c;->a:Lp1/b0;

    invoke-virtual {v13, v14}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v13

    filled-new-array {v9, v10, v11, v13}, [Lp1/u1;

    move-result-object v9

    new-instance v10, Lb30/w2;

    const/16 v11, 0xc

    invoke-direct {v10, v11, v1, v2}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v11, 0x4d2161d9    # 1.6922152E8f

    invoke-static {v11, v12, v10}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v11, 0x38

    invoke-static {v9, v10, v12, v11}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/16 v9, 0x18

    int-to-float v9, v9

    const/16 v33, 0x0

    const/16 v34, 0xd

    const/16 v30, 0x0

    const/16 v32, 0x0

    move/from16 v31, v9

    invoke-static/range {v29 .. v34}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v10, v29

    invoke-static {v12, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v9, 0x468eab54

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    if-nez v5, :cond_19

    goto :goto_f

    :cond_19
    invoke-static {v5, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v9, v11, v12, v6}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_f
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const v9, 0x468ebf97

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    const/16 v11, 0x8

    const/16 v19, 0x0

    if-eqz v18, :cond_1c

    const v13, 0x468ecc29

    invoke-virtual {v12, v13}, Lp1/q;->e0(I)V

    if-nez v0, :cond_1a

    move-object/from16 v13, v19

    goto :goto_10

    :cond_1a
    invoke-static {v0, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v13

    :goto_10
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    if-eqz v5, :cond_1b

    int-to-float v5, v11

    :goto_11
    move/from16 v22, v5

    goto :goto_12

    :cond_1b
    int-to-float v5, v6

    goto :goto_11

    :goto_12
    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v22, v7

    move-object v7, v13

    const/4 v13, 0x0

    const/16 v14, 0x1c

    move/from16 v17, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    move/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v35, v8

    move-object v8, v5

    move-object/from16 v5, v35

    move-object/from16 v35, v29

    invoke-static/range {v7 .. v14}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    goto :goto_13

    :cond_1c
    move-object v5, v8

    move-object/from16 v35, v10

    :goto_13
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    iget-object v7, v1, Lcz/p0;->o:Lzy/c;

    invoke-static {v7, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v7

    iget-boolean v8, v1, Lcz/p0;->p:Z

    iget-boolean v9, v1, Lcz/p0;->l:Z

    const-string v10, "CustomerSheetSaveButton"

    move-object/from16 v11, v35

    invoke-static {v11, v10}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    const/16 v10, 0xa

    int-to-float v10, v10

    const/16 v25, 0x0

    const/16 v26, 0xd

    const/16 v22, 0x0

    const/16 v24, 0x0

    move/from16 v23, v10

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const v13, 0x468f0dd9

    invoke-virtual {v12, v13}, Lp1/q;->e0(I)V

    const/16 v13, 0x20

    if-ne v15, v13, :cond_1d

    goto :goto_14

    :cond_1d
    move/from16 v16, v6

    :goto_14
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v16, :cond_1e

    if-ne v13, v5, :cond_1f

    :cond_1e
    new-instance v13, Lfa0/a;

    const/16 v5, 0x1d

    invoke-direct {v13, v2, v5}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v13, Lc93/a;

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/high16 v16, 0x180000

    const/16 v17, 0x90

    move-object/from16 v29, v11

    const/4 v11, 0x0

    move-object v14, v12

    move v12, v9

    move-object v9, v13

    const/4 v13, 0x1

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v5, v29

    invoke-static/range {v7 .. v17}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    if-nez v18, :cond_21

    const v7, 0x468f3ca9

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    if-nez v0, :cond_20

    :goto_15
    move-object/from16 v7, v19

    goto :goto_16

    :cond_20
    invoke-static {v0, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v19

    goto :goto_15

    :goto_16
    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v0, 0x8

    int-to-float v15, v0

    const/16 v17, 0x0

    const/16 v18, 0xd

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v13, 0x0

    const/16 v14, 0x1c

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v14}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    :cond_21
    :goto_17
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, La01/d;

    const/16 v6, 0x11

    const/4 v4, 0x0

    move/from16 v5, p4

    invoke-direct/range {v0 .. v6}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final b(Lpj/p;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move-wide v2, p1

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x51332635    # 4.809001E10f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    iget v4, p0, Lpj/p;->b:I

    goto :goto_0

    :cond_0
    move v4, v1

    :goto_0
    const/4 v5, -0x1

    if-nez v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    sget-object v6, Lnj/i;->a:[I

    invoke-static {v4}, Le4/p;->e(I)I

    move-result v4

    aget v4, v6, v4

    :goto_1
    packed-switch v4, :pswitch_data_0

    const/4 v4, 0x0

    goto :goto_2

    :pswitch_0
    const/high16 v4, 0x43870000    # 270.0f

    goto :goto_2

    :pswitch_1
    const/high16 v4, 0x42b40000    # 90.0f

    goto :goto_2

    :pswitch_2
    const/high16 v4, 0x43340000    # 180.0f

    :goto_2
    new-instance v6, Ly3/l;

    invoke-direct {v6, v2, v3}, Ly3/l;-><init>(J)V

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v6, v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    const/16 v8, 0x20

    const-wide v9, 0xffffffffL

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v6, :cond_2

    if-ne v7, v11, :cond_9

    :cond_2
    const/4 v6, 0x0

    if-eqz p0, :cond_3

    iget-object v7, p0, Lpj/p;->c:Lpj/f;

    iget-object v7, v7, Lpj/f;->a:Ljava/lang/Number;

    goto :goto_3

    :cond_3
    move-object v7, v6

    :goto_3
    const/16 v12, -0xc

    if-eqz v7, :cond_5

    iget-object v6, p0, Lpj/p;->c:Lpj/f;

    iget-object v6, v6, Lpj/f;->a:Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->intValue()I

    move-result v6

    iget v7, p0, Lpj/p;->b:I

    if-nez v7, :cond_4

    goto :goto_4

    :cond_4
    sget-object v5, Lnj/i;->a:[I

    invoke-static {v7}, Le4/p;->e(I)I

    move-result v7

    aget v5, v5, v7

    :goto_4
    packed-switch v5, :pswitch_data_1

    move v12, v1

    goto :goto_5

    :pswitch_3
    and-long v12, v2, v9

    long-to-int v12, v12

    :goto_5
    :pswitch_4
    invoke-static {v6, v12}, Lvo/b;->a(II)J

    move-result-wide v5

    goto :goto_8

    :cond_5
    if-eqz p0, :cond_6

    iget-object v6, p0, Lpj/p;->c:Lpj/f;

    iget-object v6, v6, Lpj/f;->b:Ljava/lang/Number;

    :cond_6
    if-eqz v6, :cond_8

    iget v6, p0, Lpj/p;->b:I

    if-nez v6, :cond_7

    goto :goto_6

    :cond_7
    sget-object v5, Lnj/i;->a:[I

    invoke-static {v6}, Le4/p;->e(I)I

    move-result v6

    aget v5, v5, v6

    :goto_6
    packed-switch v5, :pswitch_data_2

    move v12, v1

    goto :goto_7

    :pswitch_5
    shr-long v5, v2, v8

    long-to-int v12, v5

    :goto_7
    :pswitch_6
    iget-object v5, p0, Lpj/p;->c:Lpj/f;

    iget-object v5, v5, Lpj/f;->b:Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v12, v5}, Lvo/b;->a(II)J

    move-result-wide v5

    goto :goto_8

    :cond_8
    invoke-static {v1, v1}, Lvo/b;->a(II)J

    move-result-wide v5

    :goto_8
    new-instance v7, Ly3/j;

    invoke-direct {v7, v5, v6}, Ly3/j;-><init>(J)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Ly3/j;

    iget-wide v5, v7, Ly3/j;->a:J

    const v7, -0x1896950d

    invoke-virtual {v0, v7}, Lp1/q;->f0(I)V

    sget-object v7, Luj/k;->a:Lp1/u2;

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Luj/m;

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    iget-wide v12, v7, Luj/m;->w:J

    shr-long v7, v5, v8

    long-to-int v7, v7

    int-to-float v7, v7

    and-long/2addr v5, v9

    long-to-int v5, v5

    int-to-float v5, v5

    move-object/from16 v6, p3

    invoke-static {v6, v7, v5}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0xc

    int-to-float v7, v7

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v7, 0x18

    int-to-float v7, v7

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_c

    :cond_b
    invoke-static {v5, v0, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v12, v13}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    if-ne v5, v11, :cond_e

    :cond_d
    new-instance v5, Lnj/d;

    invoke-direct {v5, v12, v13}, Lnj/d;-><init>(J)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v4, 0x6

    invoke-static {v1, v5, v0, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-nez v7, :cond_f

    return-void

    :cond_f
    new-instance v0, Lnj/e;

    move-object v1, p0

    move/from16 v5, p5

    move-object v4, v6

    invoke-direct/range {v0 .. v5}, Lnj/e;-><init>(Lpj/p;JLandroidx/compose/ui/Modifier;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_3
        :pswitch_3
        :pswitch_3
        :pswitch_4
        :pswitch_4
        :pswitch_4
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x7
        :pswitch_5
        :pswitch_5
        :pswitch_5
        :pswitch_6
        :pswitch_6
        :pswitch_6
    .end packed-switch
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    move-object/from16 v2, p1

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0xad7a79f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0xe

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    move v4, v1

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p3, 0x70

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    move v11, v4

    and-int/lit8 v4, v11, 0x5b

    const/16 v5, 0x12

    if-ne v4, v5, :cond_6

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_5

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v3

    goto/16 :goto_6

    :cond_6
    :goto_3
    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_7
    move-object v0, v3

    :goto_4
    const v3, -0x1896950d

    invoke-virtual {v8, v3}, Lp1/q;->f0(I)V

    sget-object v3, Luj/k;->a:Lp1/u2;

    invoke-virtual {v8, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Luj/m;

    const/4 v12, 0x0

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    iget-object v13, v3, Luj/m;->n0:Luj/i;

    iget v14, v13, Luj/i;->a:F

    const-string v3, "BeaconPulse"

    invoke-static {v3, v8, v12}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v3

    new-instance v4, Ld0/v;

    const/4 v15, 0x0

    const v5, 0x3e4ccccd    # 0.2f

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-direct {v4, v15, v15, v5, v6}, Ld0/v;-><init>(FFFF)V

    const/16 v7, 0x5dc

    invoke-static {v7, v12, v4, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    const/4 v9, 0x0

    const/4 v10, 0x6

    invoke-static {v4, v9, v10}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v4

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v17, v6

    move-object v6, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move/from16 v18, v5

    const/high16 v5, 0x40800000    # 4.0f

    move/from16 v19, v7

    const-string v7, "scale"

    move-object/from16 v20, v9

    const/16 v9, 0x71b8

    move/from16 v1, v17

    move/from16 v12, v18

    invoke-static/range {v3 .. v10}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v4

    new-instance v5, Ld0/v;

    invoke-direct {v5, v15, v15, v12, v1}, Ld0/v;-><init>(FFFF)V

    const/16 v1, 0x5dc

    const/4 v6, 0x2

    const/4 v7, 0x0

    invoke-static {v1, v7, v5, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v1

    const/4 v5, 0x0

    const/4 v6, 0x6

    invoke-static {v1, v5, v6}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v6

    const-string v7, "alpha"

    move-object v1, v4

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v5, 0x0

    invoke-static/range {v3 .. v10}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v3

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_8

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v5, v4, :cond_9

    :cond_8
    new-instance v5, Lb2/z;

    const/16 v4, 0x12

    invoke-direct {v5, v4, v1, v3}, Lb2/z;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v5}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v14, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget v3, v13, Luj/i;->d:F

    iget-wide v4, v13, Luj/i;->e:J

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v1, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v1, v4, v5, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x0

    invoke-static {v1, v8, v7}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    iget v6, v13, Luj/i;->d:F

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v1, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v4, v5, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    if-eqz v2, :cond_a

    const/4 v7, 0x1

    goto :goto_5

    :cond_a
    const/4 v7, 0x0

    :goto_5
    new-instance v3, Lnj/f;

    invoke-direct {v3, v2, v11}, Lnj/f;-><init>(Lc93/a;I)V

    const/4 v4, 0x0

    invoke-static {v1, v7, v3, v8, v4}, Lds/p;->y(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v8, v4}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v1, v0

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-nez v6, :cond_b

    return-void

    :cond_b
    new-instance v0, Lnj/g;

    const/4 v5, 0x0

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lnj/g;-><init>(Landroidx/compose/ui/Modifier;Ll83/e;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    return-void
.end method

.method public static final d(Lpj/p;JLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p5, Lp1/q;

    const v0, 0x2c00b3d8

    invoke-virtual {p5, v0}, Lp1/q;->g0(I)Lp1/q;

    new-instance v0, Ly3/l;

    invoke-direct {v0, p1, p2}, Ly3/l;-><init>(J)V

    invoke-virtual {p5, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v1

    invoke-virtual {p5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    const/16 v2, 0x20

    const-wide v3, 0xffffffffL

    const/4 v5, 0x0

    if-nez v0, :cond_0

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_7

    :cond_0
    const/4 v0, 0x0

    if-eqz p0, :cond_1

    iget-object v1, p0, Lpj/p;->c:Lpj/f;

    iget-object v1, v1, Lpj/f;->a:Ljava/lang/Number;

    goto :goto_0

    :cond_1
    move-object v1, v0

    :goto_0
    const/16 v6, -0xc

    const/4 v7, -0x1

    if-eqz v1, :cond_3

    iget-object v0, p0, Lpj/p;->c:Lpj/f;

    iget-object v0, v0, Lpj/f;->a:Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    iget v1, p0, Lpj/p;->b:I

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    sget-object v7, Lnj/i;->a:[I

    invoke-static {v1}, Le4/p;->e(I)I

    move-result v1

    aget v7, v7, v1

    :goto_1
    packed-switch v7, :pswitch_data_0

    move v6, v5

    goto :goto_2

    :pswitch_0
    and-long v6, p1, v3

    long-to-int v6, v6

    :goto_2
    :pswitch_1
    invoke-static {v0, v6}, Lvo/b;->a(II)J

    move-result-wide v0

    goto :goto_5

    :cond_3
    if-eqz p0, :cond_4

    iget-object v0, p0, Lpj/p;->c:Lpj/f;

    iget-object v0, v0, Lpj/f;->b:Ljava/lang/Number;

    :cond_4
    if-eqz v0, :cond_6

    iget v0, p0, Lpj/p;->b:I

    if-nez v0, :cond_5

    goto :goto_3

    :cond_5
    sget-object v1, Lnj/i;->a:[I

    invoke-static {v0}, Le4/p;->e(I)I

    move-result v0

    aget v7, v1, v0

    :goto_3
    packed-switch v7, :pswitch_data_1

    move v6, v5

    goto :goto_4

    :pswitch_2
    shr-long v0, p1, v2

    long-to-int v6, v0

    :goto_4
    :pswitch_3
    iget-object v0, p0, Lpj/p;->c:Lpj/f;

    iget-object v0, v0, Lpj/f;->b:Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    invoke-static {v6, v0}, Lvo/b;->a(II)J

    move-result-wide v0

    goto :goto_5

    :cond_6
    const-wide/16 v0, 0x0

    :goto_5
    new-instance v6, Ly3/j;

    invoke-direct {v6, v0, v1}, Ly3/j;-><init>(J)V

    invoke-virtual {p5, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v6

    :cond_7
    check-cast v1, Ly3/j;

    iget-wide v0, v1, Ly3/j;->a:J

    shr-long v6, v0, v2

    long-to-int v2, v6

    int-to-float v2, v2

    and-long/2addr v0, v3

    long-to-int v0, v0

    int-to-float v0, v0

    invoke-static {p3, v2, v0}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p4, p5, v5, v5}, Le4/a;->c(Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p5}, Lp1/q;->u()Lp1/v1;

    move-result-object p5

    if-nez p5, :cond_8

    return-void

    :cond_8
    new-instance v0, Lnj/h;

    move-object v1, p0

    move-wide v2, p1

    move-object v4, p3

    move-object v5, p4

    move v6, p6

    invoke-direct/range {v0 .. v6}, Lnj/h;-><init>(Lpj/p;JLandroidx/compose/ui/Modifier;Lc93/a;I)V

    iput-object v0, p5, Lp1/v1;->d:Lc93/m;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_1
        :pswitch_1
        :pswitch_1
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x7
        :pswitch_2
        :pswitch_2
        :pswitch_2
        :pswitch_3
        :pswitch_3
        :pswitch_3
    .end packed-switch
.end method

.method public static final e(Lcz/n0;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v2, p0

    move/from16 v8, p2

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p1

    check-cast v15, Lp1/q;

    const v0, -0x620f296f

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v8

    and-int/lit8 v0, v0, 0x3

    if-ne v0, v1, :cond_2

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object v0, v2, Lcz/n0;->M:Ln53/e;

    const/4 v9, 0x0

    invoke-static {v0, v15, v9}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v0

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Lcz/t0;

    const v0, 0x72522dee

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_3

    if-ne v1, v11, :cond_4

    :cond_3
    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x1

    const-class v3, Lcz/n0;

    const-string v4, "handleViewAction"

    const-string v5, "handleViewAction(Lcom/stripe/android/customersheet/CustomerSheetViewAction;)V"

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_4
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object v12, v1

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const v0, 0x72523616

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_5

    if-ne v1, v11, :cond_6

    :cond_5
    new-instance v0, Lg40/f4;

    const/4 v6, 0x0

    const/4 v7, 0x2

    const/4 v1, 0x1

    const-class v3, Lcz/n0;

    const-string v4, "providePaymentMethodName"

    const-string v5, "providePaymentMethodName(Ljava/lang/String;)Lcom/stripe/android/core/strings/ResolvableString;"

    invoke-direct/range {v0 .. v7}, Lg40/f4;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v0

    :cond_6
    check-cast v1, Lj93/g;

    invoke-virtual {v15, v9}, Lp1/q;->q(Z)V

    move-object v13, v1

    check-cast v13, Lkotlin/jvm/functions/Function1;

    iget-object v14, v2, Lcz/n0;->I:Lbz/i;

    const/16 v16, 0x0

    move-object v9, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v9 .. v16}, Le4/a;->f(Lcz/t0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbz/i;Landroidx/compose/runtime/Composer;I)V

    :goto_2
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lej1/h;

    invoke-direct {v1, v2, v8}, Lej1/h;-><init>(Lcz/n0;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final f(Lcz/t0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbz/i;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodNameProvider"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userFacingLogger"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p6

    check-cast v6, Lp1/q;

    const v0, -0x17ab9317

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p7, v0

    or-int/lit16 v0, v0, 0x1b0

    invoke-virtual {v6, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/16 v5, 0x800

    goto :goto_1

    :cond_1
    const/16 v5, 0x400

    :goto_1
    or-int/2addr v0, v5

    invoke-virtual {v6, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x4000

    goto :goto_2

    :cond_2
    const/16 v5, 0x2000

    :goto_2
    or-int/2addr v0, v5

    invoke-virtual {v6, p5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/high16 v5, 0x20000

    goto :goto_3

    :cond_3
    const/high16 v5, 0x10000

    :goto_3
    or-int/2addr v0, v5

    const v5, 0x12493

    and-int/2addr v0, v5

    const v5, 0x12492

    if-ne v0, v5, :cond_5

    invoke-virtual {v6}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    move v2, p1

    move-object v3, p2

    move-object v5, v6

    goto :goto_5

    :cond_5
    :goto_4
    new-instance v0, Lb30/w2;

    const/16 v5, 0xd

    invoke-direct {v0, v5, p0, p3}, Lb30/w2;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, -0x33dfd478    # -4.1987616E7f

    invoke-static {v5, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    new-instance v0, Lb1/d;

    const/4 v5, 0x3

    move-object v1, p0

    move-object v2, p3

    move-object v3, p4

    move-object v4, p5

    invoke-direct/range {v0 .. v5}, Lb1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, 0x527df067

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    move-object v5, v6

    const/16 v6, 0x1b6

    move-object v1, v7

    const/16 v7, 0x8

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Ldp/d;->a(Lx1/b;Lx1/b;Landroidx/compose/ui/Modifier;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    move v2, v0

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_6

    new-instance v0, Lc41/t1;

    move-object v1, p0

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lc41/t1;-><init>(Lcz/t0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lbz/i;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final g(ZZILjava/lang/String;Lm40/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lh20/g1;Landroidx/compose/runtime/Composer;II)V
    .locals 23

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v0, p8

    move-object/from16 v10, p9

    move-object/from16 v12, p11

    move/from16 v1, p13

    move/from16 v2, p14

    const-string v7, "imageLoader"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "title"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "onClick"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p12

    check-cast v7, Lp1/q;

    const v8, 0x348e46e

    invoke-virtual {v7, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v1, 0x6

    if-nez v8, :cond_1

    move/from16 v8, p0

    invoke-virtual {v7, v8}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x4

    goto :goto_0

    :cond_0
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v1

    goto :goto_1

    :cond_1
    move/from16 v8, p0

    move v13, v1

    :goto_1
    and-int/lit8 v14, v1, 0x30

    const/16 v16, 0x20

    if-nez v14, :cond_3

    move/from16 v14, p1

    invoke-virtual {v7, v14}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_2

    move/from16 v17, v16

    goto :goto_2

    :cond_2
    const/16 v17, 0x10

    :goto_2
    or-int v13, v13, v17

    goto :goto_3

    :cond_3
    move/from16 v14, p1

    :goto_3
    and-int/lit16 v9, v1, 0x180

    const/16 v17, 0x80

    const/16 v18, 0x100

    if-nez v9, :cond_5

    invoke-virtual {v7, v3}, Lp1/q;->e(I)Z

    move-result v9

    if-eqz v9, :cond_4

    move/from16 v9, v18

    goto :goto_4

    :cond_4
    move/from16 v9, v17

    :goto_4
    or-int/2addr v13, v9

    :cond_5
    and-int/lit16 v9, v1, 0xc00

    if-nez v9, :cond_7

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x800

    goto :goto_5

    :cond_6
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v13, v9

    :cond_7
    and-int/lit16 v9, v1, 0x6000

    if-nez v9, :cond_a

    const v9, 0x8000

    and-int/2addr v9, v1

    if-nez v9, :cond_8

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_6

    :cond_8
    invoke-virtual {v7, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_6
    if-eqz v9, :cond_9

    const/16 v9, 0x4000

    goto :goto_7

    :cond_9
    const/16 v9, 0x2000

    :goto_7
    or-int/2addr v13, v9

    :cond_a
    const/high16 v9, 0x30000

    and-int/2addr v9, v1

    if-nez v9, :cond_c

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_b

    const/high16 v9, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v9, 0x10000

    :goto_8
    or-int/2addr v13, v9

    :cond_c
    const/high16 v9, 0x180000

    and-int/2addr v9, v1

    if-nez v9, :cond_e

    move-object/from16 v9, p6

    invoke-virtual {v7, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_d

    const/high16 v19, 0x100000

    goto :goto_9

    :cond_d
    const/high16 v19, 0x80000

    :goto_9
    or-int v13, v13, v19

    goto :goto_a

    :cond_e
    move-object/from16 v9, p6

    :goto_a
    const/high16 v19, 0xc00000

    and-int v19, v1, v19

    move-object/from16 v11, p7

    if-nez v19, :cond_10

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_f

    const/high16 v20, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v20, 0x400000

    :goto_b
    or-int v13, v13, v20

    :cond_10
    const/high16 v20, 0x6000000

    and-int v20, v1, v20

    if-nez v20, :cond_12

    invoke-virtual {v7, v0}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_11

    const/high16 v20, 0x4000000

    goto :goto_c

    :cond_11
    const/high16 v20, 0x2000000

    :goto_c
    or-int v13, v13, v20

    :cond_12
    const/high16 v20, 0x30000000

    and-int v20, v1, v20

    if-nez v20, :cond_14

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_13

    const/high16 v20, 0x20000000

    goto :goto_d

    :cond_13
    const/high16 v20, 0x10000000

    :goto_d
    or-int v13, v13, v20

    :cond_14
    and-int/lit8 v20, v2, 0x6

    move-object/from16 v15, p10

    if-nez v20, :cond_16

    invoke-virtual {v7, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_15

    const/16 v19, 0x4

    goto :goto_e

    :cond_15
    const/16 v19, 0x2

    :goto_e
    or-int v19, v2, v19

    goto :goto_f

    :cond_16
    move/from16 v19, v2

    :goto_f
    and-int/lit8 v21, v2, 0x30

    if-nez v21, :cond_18

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_17

    move/from16 v20, v16

    goto :goto_10

    :cond_17
    const/16 v20, 0x10

    :goto_10
    or-int v19, v19, v20

    :cond_18
    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_1b

    and-int/lit16 v1, v2, 0x200

    if-nez v1, :cond_19

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_11

    :cond_19
    invoke-virtual {v7, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_11
    if-eqz v1, :cond_1a

    move/from16 v17, v18

    :cond_1a
    or-int v19, v19, v17

    :cond_1b
    move/from16 v1, v19

    const v16, 0x12492493

    and-int v2, v13, v16

    const v6, 0x12492492

    if-ne v2, v6, :cond_1d

    and-int/lit16 v2, v1, 0x93

    const/16 v6, 0x92

    if-ne v2, v6, :cond_1d

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1c

    goto :goto_12

    :cond_1c
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object/from16 v19, v7

    goto :goto_14

    :cond_1d
    :goto_12
    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v2, p13, 0x1

    if-eqz v2, :cond_1f

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_1e

    goto :goto_13

    :cond_1e
    invoke-virtual {v7}, Lp1/q;->X()V

    :cond_1f
    :goto_13
    invoke-virtual {v7}, Lp1/q;->r()V

    new-instance v2, Ld30/d0;

    invoke-direct {v2, v3, v4, v5, v0}, Ld30/d0;-><init>(ILjava/lang/String;Lm40/w;Z)V

    const v6, 0x5421138c

    invoke-static {v6, v7, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    and-int/lit8 v6, v13, 0xe

    or-int/lit16 v6, v6, 0x6c00

    and-int/lit8 v16, v13, 0x70

    or-int v6, v6, v16

    const/high16 v16, 0x70000

    and-int v16, v13, v16

    or-int v6, v6, v16

    const/high16 v16, 0x380000

    and-int v16, v13, v16

    or-int v6, v6, v16

    const/high16 v16, 0x1c00000

    and-int v16, v13, v16

    or-int v6, v6, v16

    const/high16 v16, 0xe000000

    shr-int/lit8 v13, v13, 0x3

    and-int v13, v13, v16

    or-int v20, v6, v13

    and-int/lit8 v6, v1, 0xe

    shr-int/lit8 v13, v1, 0x3

    and-int/lit8 v13, v13, 0x70

    or-int/2addr v6, v13

    shl-int/lit8 v1, v1, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int v21, v6, v1

    const/16 v22, 0x204

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    move/from16 v6, p0

    move-object/from16 v16, p10

    move-object/from16 v19, v7

    move-object v13, v11

    move-object/from16 v17, v12

    move v7, v14

    move-object/from16 v11, p5

    move-object/from16 v12, p6

    move-object v14, v10

    move-object v10, v2

    invoke-static/range {v6 .. v22}, Lkotlin/jvm/internal/j;->f(ZZZZLx1/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lc93/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lh20/g1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    :goto_14
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_20

    new-instance v0, Ld30/c0;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Ld30/c0;-><init>(ZZILjava/lang/String;Lm40/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lh20/g1;II)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method public static final h(ZZLd30/w;Lm40/w;Landroidx/compose/ui/Modifier;Lh20/g1;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v3, p2

    move-object/from16 v8, p3

    move-object/from16 v0, p4

    move-object/from16 v15, p5

    move/from16 v1, p7

    const-string v2, "displayablePaymentMethod"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "imageLoader"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p6

    check-cast v2, Lp1/q;

    const v4, 0x30087afe

    invoke-virtual {v2, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move/from16 v4, p0

    invoke-virtual {v2, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_1
    move/from16 v4, p0

    move v5, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move/from16 v6, p1

    invoke-virtual {v2, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    goto :goto_3

    :cond_3
    move/from16 v6, p1

    :goto_3
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_4

    :cond_4
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v1, 0xc00

    if-nez v7, :cond_8

    and-int/lit16 v7, v1, 0x1000

    if-nez v7, :cond_6

    invoke-virtual {v2, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_5

    :cond_6
    invoke-virtual {v2, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_5
    if-eqz v7, :cond_7

    const/16 v7, 0x800

    goto :goto_6

    :cond_7
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v5, v7

    :cond_8
    and-int/lit16 v7, v1, 0x6000

    if-nez v7, :cond_a

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_9

    const/16 v7, 0x4000

    goto :goto_7

    :cond_9
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v5, v7

    :cond_a
    const/high16 v7, 0x30000

    or-int/2addr v5, v7

    const/high16 v7, 0x180000

    and-int/2addr v7, v1

    if-nez v7, :cond_d

    const/high16 v7, 0x200000

    and-int/2addr v7, v1

    if-nez v7, :cond_b

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_8

    :cond_b
    invoke-virtual {v2, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_8
    if-eqz v7, :cond_c

    const/high16 v7, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v7, 0x80000

    :goto_9
    or-int/2addr v5, v7

    :cond_d
    const v7, 0x92493

    and-int/2addr v7, v5

    const v9, 0x92492

    if-ne v7, v9, :cond_f

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v7

    if-nez v7, :cond_e

    goto :goto_a

    :cond_e
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v16, v2

    goto/16 :goto_e

    :cond_f
    :goto_a
    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v7, v1, 0x1

    if-eqz v7, :cond_11

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_10

    goto :goto_b

    :cond_10
    invoke-virtual {v2}, Lp1/q;->X()V

    :cond_11
    :goto_b
    invoke-virtual {v2}, Lp1/q;->r()V

    const v7, -0x5fe799d9

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    iget v7, v3, Ld30/w;->d:I

    iget-object v9, v3, Ld30/w;->e:Ljava/lang/Integer;

    iget-object v10, v3, Ld30/w;->l:Ljava/lang/Integer;

    invoke-static {v7, v9, v10, v2}, Lx43/j;->H(ILjava/lang/Integer;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;)I

    move-result v7

    const/4 v9, 0x0

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    const v10, 0x1c5665b4

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    iget-object v10, v3, Ld30/w;->f:Ljava/lang/String;

    iget-object v11, v3, Ld30/w;->g:Ljava/lang/String;

    const v12, -0xc01f75b

    invoke-virtual {v2, v12}, Lp1/q;->e0(I)V

    const v12, -0x5b23d4c6

    invoke-virtual {v2, v12}, Lp1/q;->e0(I)V

    invoke-static {v2}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v12

    iget-wide v12, v12, Ld40/n;->a:J

    invoke-static {v12, v13}, Li2/w0;->x(J)F

    move-result v12

    float-to-double v12, v12

    const-wide/high16 v16, 0x3fe0000000000000L    # 0.5

    cmpg-double v12, v12, v16

    if-gez v12, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    move v12, v9

    :goto_c
    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    if-eqz v12, :cond_13

    if-eqz v11, :cond_13

    move-object v10, v11

    :cond_13
    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    iget-object v11, v3, Ld30/w;->c:Lzy/c;

    invoke-static {v11, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v11

    iget-object v12, v3, Ld30/w;->i:Lzy/c;

    const v13, -0x5cfca925

    invoke-virtual {v2, v13}, Lp1/q;->e0(I)V

    if-nez v12, :cond_14

    const/4 v12, 0x0

    goto :goto_d

    :cond_14
    invoke-static {v12, v2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v12

    :goto_d
    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    move-object v13, v11

    iget-object v11, v3, Ld30/w;->j:Ljava/lang/String;

    move v6, v7

    move-object v7, v10

    move-object v10, v12

    iget-boolean v12, v3, Ld30/w;->h:Z

    iget-object v14, v3, Ld30/w;->a:Ljava/lang/String;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v1, "TEST_TAG_NEW_PAYMENT_METHOD_ROW_BUTTON_"

    invoke-direct {v9, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const v1, -0x5cfc94b4

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v1, :cond_15

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v9, v1, :cond_16

    :cond_15
    new-instance v9, Ld1/i;

    const/4 v1, 0x5

    invoke-direct {v9, v3, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v2, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v9, Lc93/a;

    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Lp1/q;->q(Z)V

    and-int/lit8 v1, v5, 0x7e

    const v16, 0x8000

    or-int v1, v1, v16

    shl-int/lit8 v16, v5, 0x3

    const v17, 0xe000

    and-int v16, v16, v17

    or-int v17, v1, v16

    shr-int/lit8 v1, v5, 0xc

    and-int/lit16 v1, v1, 0x3f0

    move-object v5, v13

    move-object v13, v9

    move-object v9, v5

    move/from16 v5, p1

    move/from16 v18, v1

    move-object/from16 v16, v2

    invoke-static/range {v4 .. v18}, Le4/a;->g(ZZILjava/lang/String;Lm40/w;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;Lh20/g1;Landroidx/compose/runtime/Composer;II)V

    :goto_e
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_17

    new-instance v0, Lb30/v;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lb30/v;-><init>(ZZLd30/w;Lm40/w;Landroidx/compose/ui/Modifier;Lh20/g1;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final i(ZLg40/s2;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p4

    move/from16 v1, p6

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v4, -0x2a03331a

    invoke-virtual {v8, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_1

    move/from16 v4, p0

    invoke-virtual {v8, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v1

    goto :goto_1

    :cond_1
    move/from16 v4, p0

    move v5, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v1, 0xc00

    move-object/from16 v7, p3

    if-nez v6, :cond_7

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v1, 0x6000

    if-nez v6, :cond_9

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    move v11, v5

    and-int/lit16 v5, v11, 0x2493

    const/16 v6, 0x2492

    if-ne v5, v6, :cond_b

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_b

    :cond_b
    :goto_6
    iget-object v5, v2, Lg40/s2;->c:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    check-cast v5, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_c
    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v9, v6

    check-cast v9, Lg40/b3;

    invoke-virtual {v9}, Lg40/b3;->a()Lcom/stripe/android/uicore/elements/IdentifierSpec;

    move-result-object v9

    invoke-interface {v3, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_c

    invoke-virtual {v12, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_d
    const v5, 0x610aebe6

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v13, Lp1/l;->a:Lp1/v0;

    const/4 v14, 0x0

    if-ne v5, v13, :cond_e

    int-to-float v5, v14

    new-instance v6, Ly3/f;

    invoke-direct {v6, v5}, Ly3/f;-><init>(F)V

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v5

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v15, v5

    check-cast v15, Lp1/c1;

    invoke-virtual {v8, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v5

    if-nez v5, :cond_18

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x0

    const/4 v1, 0x3

    invoke-static {v9, v10, v14, v1}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 p5, v1

    sget-object v1, Ll0/m;->a:Ll0/e;

    move/from16 v16, v5

    sget-object v5, Lb2/e;->J:Lb2/l;

    invoke-static {v1, v5, v8, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    move/from16 v17, v11

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v14, v8, Lp1/q;->S:Z

    if-eqz v14, :cond_f

    invoke-virtual {v8, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v8, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v8, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_11

    :cond_10
    invoke-static {v10, v8, v10, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x3abf772a

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v11, 0x0

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v9, 0x1

    if-eqz v5, :cond_17

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v14, v11, 0x1

    if-ltz v11, :cond_16

    check-cast v5, Lg40/b3;

    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    move-result v10

    int-to-float v10, v10

    div-float v10, v16, v10

    move-object/from16 v19, v1

    float-to-double v1, v10

    const-wide/16 v20, 0x0

    cmpl-double v1, v1, v20

    if-lez v1, :cond_12

    goto :goto_a

    :cond_12
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v20, v10, v2

    if-lez v20, :cond_13

    move v10, v2

    :cond_13
    invoke-direct {v1, v10, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const v2, -0x5e0ebd52

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v13, :cond_14

    new-instance v2, Lf1/a0;

    const/16 v9, 0xa

    invoke-direct {v2, v9, v15}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-static {v1, v2}, Landroidx/compose/ui/layout/b;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    and-int/lit8 v2, v17, 0xe

    shl-int/lit8 v9, v17, 0x3

    and-int/lit16 v10, v9, 0x1c00

    or-int/2addr v2, v10

    const v10, 0xe000

    and-int/2addr v9, v10

    or-int/2addr v9, v2

    const/4 v10, 0x0

    move-object/from16 v18, v5

    move-object v5, v1

    move-object v1, v6

    move-object v6, v3

    move v3, v4

    move-object/from16 v4, v18

    const/16 v18, 0x0

    invoke-static/range {v3 .. v10}, Ls2/e;->g(ZLg40/y2;Landroidx/compose/ui/Modifier;Ljava/util/Set;Lcom/stripe/android/uicore/elements/IdentifierSpec;Landroidx/compose/runtime/Composer;II)V

    const v2, 0x3abfc176

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-static {v12}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v2

    if-eq v11, v2, :cond_15

    invoke-interface {v15}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v8}, Ld40/r;->l(Landroidx/compose/runtime/Composer;)Ld40/o;

    move-result-object v3

    iget v3, v3, Ld40/o;->c:F

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v2

    iget-wide v4, v2, Ld40/n;->c:J

    const/4 v9, 0x0

    const/16 v10, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    :cond_15
    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move/from16 v4, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v7, p3

    move-object v6, v1

    move v11, v14

    move-object/from16 v1, v19

    goto/16 :goto_9

    :cond_16
    const/16 v18, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_17
    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    :cond_18
    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lb30/j2;

    const/4 v7, 0x5

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(ZLg40/z2;Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/ui/Modifier;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final j(Lcz/r0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewActionHandler"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "paymentMethodNameProvider"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x4a6c0794    # 3867109.0f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/4 v9, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v9

    :goto_0
    or-int v0, p5, v0

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v14, 0x20

    if-eqz v4, :cond_1

    move v4, v14

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    or-int/lit16 v0, v0, 0xc00

    and-int/lit16 v4, v0, 0x493

    const/16 v5, 0x492

    if-ne v4, v5, :cond_4

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v14, v2

    move-object v12, v11

    goto/16 :goto_e

    :cond_4
    :goto_3
    sget-object v4, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object v15

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x0

    invoke-static {v4, v5, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v5, v11, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v11, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v4, v1, Lcz/r0;->c:Ljava/lang/String;

    const v5, 0x7fcbe4ee

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    if-nez v4, :cond_8

    const v4, 0x7f141087

    invoke-static {v11, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    :cond_8
    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    const/16 v5, 0x14

    int-to-float v5, v5

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v20, v5

    move-object/from16 v16, v7

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v22, v20

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5, v11, v10, v10}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    iget-object v3, v1, Lcz/r0;->d:Ljava/util/List;

    iget-boolean v4, v1, Lcz/r0;->i:Z

    iget-object v12, v1, Lcz/r0;->e:Lq20/y;

    iget-boolean v7, v1, Lcz/r0;->o:Z

    const/4 v8, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v3 .. v8}, Lse/b;->A(Ljava/util/List;ZZLkotlin/jvm/functions/Function1;ZLjava/lang/String;)Ljava/util/ArrayList;

    move-result-object v3

    invoke-static {v3, v12}, Lse/b;->H(Ljava/util/List;Lq20/y;)Lh20/t0;

    move-result-object v4

    iget-boolean v5, v1, Lcz/r0;->h:Z

    iget-boolean v6, v1, Lcz/r0;->g:Z

    const v7, 0x7fcc604f

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v14, :cond_9

    const/4 v8, 0x1

    goto :goto_5

    :cond_9
    move v8, v10

    :goto_5
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_a

    if-ne v12, v13, :cond_b

    :cond_a
    new-instance v12, Lgz/a;

    invoke-direct {v12, v2, v10}, Lgz/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v12, Lc93/a;

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    const v8, 0x7fcc6c11

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    if-ne v0, v14, :cond_c

    const/4 v8, 0x1

    goto :goto_6

    :cond_c
    move v8, v10

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v8, :cond_d

    if-ne v7, v13, :cond_e

    :cond_d
    new-instance v7, Lge0/c;

    const/16 v8, 0x9

    invoke-direct {v7, v2, v8}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    const v7, 0x7fcc77cf

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    if-ne v0, v14, :cond_f

    const/4 v7, 0x1

    goto :goto_7

    :cond_f
    move v7, v10

    :goto_7
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_10

    if-ne v14, v13, :cond_11

    :cond_10
    new-instance v14, Lge0/c;

    const/16 v7, 0xa

    invoke-direct {v14, v2, v7}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v10}, Lp1/q;->q(Z)V

    int-to-float v7, v9

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move/from16 v20, v7

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move v9, v10

    move-object v10, v7

    move-object v7, v12

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v17, v13

    const/high16 v13, 0xc00000

    move/from16 v24, v0

    move-object v9, v14

    move-object/from16 v0, v16

    move-object/from16 v23, v17

    move/from16 v14, v20

    const/4 v2, 0x1

    invoke-static/range {v3 .. v13}, Lb30/o5;->h(Ljava/util/List;Lh20/t0;ZZLc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ln0/u;Landroidx/compose/runtime/Composer;I)V

    iget-object v3, v1, Lcz/r0;->m:Ljava/lang/String;

    const v4, 0x7fcc8cf2

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    if-nez v3, :cond_12

    const/4 v9, 0x0

    goto :goto_8

    :cond_12
    const/4 v4, 0x0

    invoke-static {v0, v4, v14, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v9, 0x0

    invoke-static {v3, v4, v12, v9}, Lvd/f;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const v3, 0x7fccabe7

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    iget-boolean v3, v1, Lcz/r0;->j:Z

    if-eqz v3, :cond_16

    iget-object v3, v1, Lcz/r0;->p:Lzy/b;

    invoke-static {v3, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    iget-boolean v8, v1, Lcz/r0;->g:Z

    xor-int/lit8 v4, v8, 0x1

    const-string v5, "CustomerSheetConfirmButton"

    invoke-static {v0, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move/from16 v18, v22

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const v5, 0x7fcccc19

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    move/from16 v5, v24

    const/16 v7, 0x20

    if-ne v5, v7, :cond_13

    move v10, v2

    goto :goto_9

    :cond_13
    const/4 v10, 0x0

    :goto_9
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_15

    move-object/from16 v7, v23

    if-ne v5, v7, :cond_14

    goto :goto_a

    :cond_14
    move-object/from16 v14, p1

    goto :goto_b

    :cond_15
    :goto_a
    new-instance v5, Lfa0/a;

    const/16 v7, 0x1a

    move-object/from16 v14, p1

    invoke-direct {v5, v14, v7}, Lfa0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v5, Lc93/a;

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object v11, v12

    const/4 v12, 0x0

    const/16 v13, 0xd0

    move v9, v7

    const/4 v7, 0x0

    move v10, v9

    const/4 v9, 0x0

    move/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v2, v16

    invoke-static/range {v3 .. v13}, Lio/sentry/config/a;->i(Ljava/lang/String;ZLc93/a;Landroidx/compose/ui/Modifier;ZZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v11

    goto :goto_c

    :cond_16
    move-object/from16 v14, p1

    const/4 v2, 0x0

    :goto_c
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    iget-object v3, v1, Lcz/r0;->n:Lzy/c;

    const v4, 0x7fccfcf9

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    if-nez v3, :cond_17

    const/4 v3, 0x0

    goto :goto_d

    :cond_17
    invoke-static {v3, v12}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v3

    :goto_d
    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v2, 0x8

    int-to-float v6, v2

    const/4 v8, 0x0

    const/16 v9, 0xd

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v15, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v9, 0x0

    const/16 v10, 0x1c

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v8, v12

    invoke-static/range {v3 .. v10}, Ls2/a;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;IILjava/util/Map;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v12, v2}, Lp1/q;->q(Z)V

    move-object v4, v0

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lat2/u;

    const/16 v6, 0xa

    move-object/from16 v3, p2

    move/from16 v5, p5

    move-object v2, v14

    invoke-direct/range {v0 .. v6}, Lat2/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final k(Ljava/lang/String;Ld10/b;Landroidx/compose/runtime/Composer;I)V
    .locals 6

    check-cast p2, Lp1/q;

    const v0, 0x44323cb2

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v1, 0x4

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    const/16 v3, 0x20

    if-nez v2, :cond_4

    and-int/lit8 v2, p3, 0x40

    if-nez v2, :cond_2

    invoke-virtual {p2, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_2

    :cond_2
    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_2
    if-eqz v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    const/16 v2, 0x10

    :goto_3
    or-int/2addr v0, v2

    :cond_4
    and-int/lit8 v2, v0, 0x13

    const/16 v4, 0x12

    if-ne v2, v4, :cond_6

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_7

    :cond_6
    :goto_4
    const v2, -0x56811959

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v0, 0xe

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-ne v2, v1, :cond_7

    move v1, v4

    goto :goto_5

    :cond_7
    move v1, v5

    :goto_5
    and-int/lit8 v2, v0, 0x70

    if-eq v2, v3, :cond_9

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_8

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_8

    goto :goto_6

    :cond_8
    move v4, v5

    :cond_9
    :goto_6
    or-int v0, v1, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_a

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_b

    :cond_a
    new-instance v1, Lo23/p;

    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-direct {v1, p0, p1, v0, v2}, Lo23/p;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {p2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v1, Lc93/m;

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    invoke-static {p0, p1, v1, p2}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    :goto_7
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lof2/d;

    const/16 v1, 0xb

    invoke-direct {v0, p0, p1, p3, v1}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final l(Lcz/s0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    check-cast p2, Lp1/q;

    const v0, 0x5fd6d2e0

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    const/16 v1, 0x30

    or-int/2addr v0, v1

    and-int/lit8 v0, v0, 0x13

    const/16 v2, 0x12

    const/16 v3, 0x14

    if-ne v0, v2, :cond_2

    invoke-virtual {p2}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p2}, Lp1/q;->X()V

    goto/16 :goto_4

    :cond_2
    :goto_1
    sget-object p1, Ld40/p;->a:Ld40/n;

    invoke-static {}, Ld40/r;->j()Ll0/l1;

    move-result-object p1

    sget-object v0, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x0

    invoke-static {v0, v2, p2, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, p2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v9, p2, Lp1/q;->S:Z

    if-eqz v9, :cond_3

    invoke-virtual {p2, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_3
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_2
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p2, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {p2, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v5, p2, Lp1/q;->S:Z

    if-nez v5, :cond_4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_5

    :cond_4
    invoke-static {v2, p2, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {p2, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v0, p0, Lcz/s0;->c:Lb30/y0;

    iget-object v0, v0, Lb30/y0;->y:Lzy/b;

    const v2, 0x4da7719a    # 3.51155E8f

    invoke-virtual {p2, v2}, Lp1/q;->e0(I)V

    if-nez v0, :cond_6

    goto :goto_3

    :cond_6
    invoke-static {v0, p2}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v0

    int-to-float v10, v3

    const/4 v11, 0x7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {p1, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {v0, p1, p2, v4, v4}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_3
    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    iget-object p1, p0, Lcz/s0;->c:Lb30/y0;

    invoke-static {p1, v6, p2, v1}, Luf/c0;->w(Lb30/y0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 p1, 0x1

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    move-object p1, v6

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_7

    new-instance v0, Lf01/f;

    invoke-direct {v0, p0, p1, p3, v3}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final m(La3/w0;Ly2/a;)I
    .locals 4

    invoke-virtual {p0}, La3/w0;->I0()La3/w0;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Child of "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, " cannot be null when calculating alignment line"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lx2/a;->b(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p0}, La3/w0;->O0()Ly2/s0;

    move-result-object v1

    invoke-interface {v1}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object v1

    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, -0x80000000

    if-eqz v1, :cond_1

    invoke-virtual {p0}, La3/w0;->O0()Ly2/s0;

    move-result-object p0

    invoke-interface {p0}, Ly2/s0;->a()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_1
    invoke-virtual {v0, p1}, La3/w0;->c0(Ly2/a;)I

    move-result v1

    if-ne v1, v2, :cond_3

    :cond_2
    return v2

    :cond_3
    const/4 v2, 0x1

    iput-boolean v2, v0, La3/w0;->J:Z

    iput-boolean v2, p0, La3/w0;->K:Z

    invoke-virtual {p0}, La3/w0;->U0()V

    const/4 v2, 0x0

    iput-boolean v2, v0, La3/w0;->J:Z

    iput-boolean v2, p0, La3/w0;->K:Z

    instance-of p0, p1, Ly2/m;

    if-eqz p0, :cond_4

    invoke-virtual {v0}, La3/w0;->Q0()J

    move-result-wide p0

    const-wide v2, 0xffffffffL

    and-long/2addr p0, v2

    :goto_1
    long-to-int p0, p0

    add-int/2addr v1, p0

    return v1

    :cond_4
    invoke-virtual {v0}, La3/w0;->Q0()J

    move-result-wide p0

    const/16 v0, 0x20

    shr-long/2addr p0, v0

    goto :goto_1
.end method

.method public static final n(Le2/f;J)Z
    .locals 10

    iget-object v0, p0, Lb2/v;->w:Lb2/v;

    iget-boolean v0, v0, Lb2/v;->N:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p0}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v0

    iget-object v0, v0, La3/n0;->e0:La3/l1;

    iget-object v0, v0, La3/l1;->d:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/node/a;

    iget-object v1, v0, Landroidx/compose/ui/node/a;->p0:La3/l2;

    iget-boolean v1, v1, Lb2/v;->N:Z

    if-nez v1, :cond_1

    goto :goto_0

    :cond_1
    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Landroidx/compose/ui/node/NodeCoordinator;->Z(J)J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long v3, v0, v2

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    iget-wide v6, p0, Le2/f;->Q:J

    shr-long v8, v6, v2

    long-to-int p0, v8

    int-to-float p0, p0

    add-float/2addr p0, v3

    and-long/2addr v6, v4

    long-to-int v1, v6

    int-to-float v1, v1

    add-float/2addr v1, v0

    shr-long v6, p1, v2

    long-to-int v2, v6

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    cmpg-float v3, v3, v2

    if-gtz v3, :cond_2

    cmpg-float p0, v2, p0

    if-gtz p0, :cond_2

    and-long p0, p1, v4

    long-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    cmpg-float p1, v0, p0

    if-gtz p1, :cond_2

    cmpg-float p0, p0, v1

    if-gtz p0, :cond_2

    const/4 p0, 0x1

    return p0

    :cond_2
    :goto_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final o(Le2/f;Le10/k0;)V
    .locals 0

    invoke-virtual {p0, p1}, Le2/f;->Y0(Le10/k0;)V

    invoke-virtual {p0, p1}, Le2/f;->a1(Le10/k0;)V

    return-void
.end method

.method public static final p(La3/p2;Lkotlin/jvm/functions/Function1;)V
    .locals 2

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, La3/o2;->w:La3/o2;

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    invoke-static {p0, p1}, La3/g;->t(La3/p2;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public static final q(JJJF)F
    .locals 0

    invoke-static {p6, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide p0

    invoke-static {p0, p1, p4, p5}, Li2/w0;->p(JJ)J

    move-result-wide p0

    invoke-static {p2, p3, p0, p1}, Li2/w0;->p(JJ)J

    move-result-wide p2

    invoke-static {p2, p3}, Li2/w0;->x(J)F

    move-result p2

    const p3, 0x3d4ccccd    # 0.05f

    add-float/2addr p2, p3

    invoke-static {p0, p1}, Li2/w0;->x(J)F

    move-result p0

    add-float/2addr p0, p3

    invoke-static {p2, p0}, Ljava/lang/Math;->max(FF)F

    move-result p1

    invoke-static {p2, p0}, Ljava/lang/Math;->min(FF)F

    move-result p0

    div-float/2addr p1, p0

    return p1
.end method

.method public static r(La00/g;Lr93/w0;Ljava/util/List;)La00/g;
    .locals 7

    move-object v0, p1

    check-cast v0, Lu93/g;

    iget-object v0, v0, Lu93/g;->I:Lu93/f;

    invoke-virtual {v0}, Lu93/f;->getParameters()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lr93/x0;

    invoke-interface {v2}, Lr93/x0;->a()Lr93/x0;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    move-object v0, p2

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v1, v0}, Lm83/s;->K1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->i0(Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object v5

    new-instance v1, La00/g;

    const/16 v6, 0x16

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    invoke-direct/range {v1 .. v6}, La00/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    return-object v1
.end method

.method public static s(Lmx/c;Landroidx/recyclerview/widget/RecyclerView;)Lmx/b;
    .locals 4

    new-instance v0, Lmx/b;

    invoke-direct {v0}, Landroidx/recyclerview/widget/i1;-><init>()V

    new-instance v1, Lmx/a;

    invoke-direct {v1, v0}, Lmx/a;-><init>(Lmx/b;)V

    new-instance v2, Llx/c;

    invoke-direct {v2}, Llx/c;-><init>()V

    iput-object v0, v2, Llx/c;->b:Ljava/lang/Object;

    invoke-virtual {p0}, Lmx/c;->c()V

    iget-object v3, v0, Lmx/b;->a:Lmx/c;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lmx/c;->p0()Ljx/a;

    move-result-object v3

    check-cast v3, Ljx/d;

    iget-object v3, v3, Ljx/d;->a:Le10/k0;

    iget-object v3, v3, Le10/k0;->x:Ljava/lang/Object;

    check-cast v3, Lex/a;

    invoke-virtual {v3, v2}, Lex/a;->remove(Ljava/lang/Object;)Z

    :cond_0
    iput-object p0, v0, Lmx/b;->a:Lmx/c;

    invoke-virtual {p0}, Lmx/c;->p0()Ljx/a;

    move-result-object v3

    check-cast v3, Ljx/d;

    iget-object v3, v3, Ljx/d;->a:Le10/k0;

    iget-object v3, v3, Le10/k0;->x:Ljava/lang/Object;

    check-cast v3, Lex/a;

    invoke-virtual {v3, v2}, Lex/a;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0}, Lmx/c;->y()Z

    move-result v2

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/i1;->setHasStableIds(Z)V

    if-eqz p1, :cond_1

    invoke-virtual {p1, v0}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-virtual {p1, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnItemTouchListener(Landroidx/recyclerview/widget/y1;)V

    :cond_1
    invoke-virtual {p0}, Lmx/c;->G()V

    return-object v0
.end method

.method public static final t(Lq0/y;)J
    .locals 4

    invoke-virtual {p0}, Lq0/y;->k()I

    move-result v0

    int-to-long v0, v0

    invoke-virtual {p0}, Lq0/y;->o()I

    move-result v2

    int-to-long v2, v2

    mul-long/2addr v0, v2

    iget-object v2, p0, Lq0/y;->d:Ll9/o;

    iget-object v2, v2, Ll9/o;->d:Ljava/lang/Object;

    check-cast v2, Lp1/g1;

    invoke-virtual {v2}, Lp1/g1;->x()F

    move-result v2

    invoke-virtual {p0}, Lq0/y;->o()I

    move-result p0

    int-to-float p0, p0

    mul-float/2addr v2, p0

    float-to-double v2, v2

    invoke-static {v2, v3}, Le93/b;->Y(D)J

    move-result-wide v2

    add-long/2addr v2, v0

    return-wide v2
.end method

.method public static final w(I)Lr7/k;
    .locals 3

    int-to-double v0, p0

    sget-object p0, Lr7/k;->y:Lr7/e;

    new-instance p0, Lr7/k;

    sget-object v2, Lr7/j;->w:Lr7/f;

    invoke-direct {p0, v0, v1, v2}, Lr7/k;-><init>(DLr7/j;)V

    return-object p0
.end method

.method public static x(Landroidx/compose/runtime/Composer;)Lb30/t3;
    .locals 20

    move-object/from16 v0, p0

    check-cast v0, Lp1/q;

    const v1, -0xcc35015

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const v1, -0x5fa996d4

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    sget-object v1, Ld40/p;->e:Ld40/k;

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    sget-object v3, Lb30/i4;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lb30/t3;

    invoke-static {v0}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v4

    const v5, 0xbc4a40d

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_0

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_7

    :cond_0
    iget-wide v5, v3, Lb30/t3;->a:J

    const-wide/16 v7, 0x10

    cmp-long v9, v5, v7

    if-eqz v9, :cond_1

    :goto_0
    move-wide v10, v5

    goto :goto_1

    :cond_1
    invoke-static {v1, v2}, Ld40/r;->c(Ld40/k;Landroid/content/Context;)I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    goto :goto_0

    :goto_1
    iget-wide v5, v3, Lb30/t3;->b:J

    cmp-long v9, v5, v7

    if-eqz v9, :cond_2

    :goto_2
    move-wide v12, v5

    goto :goto_3

    :cond_2
    invoke-static {v1, v2}, Ld40/r;->h(Ld40/k;Landroid/content/Context;)I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    goto :goto_2

    :goto_3
    iget-wide v5, v3, Lb30/t3;->c:J

    cmp-long v9, v5, v7

    if-eqz v9, :cond_3

    :goto_4
    move-wide v14, v5

    goto :goto_5

    :cond_3
    const v5, 0x7f060500

    invoke-static {v2, v5}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v5

    invoke-static {v5}, Li2/w0;->c(I)J

    move-result-wide v5

    goto :goto_4

    :goto_5
    iget-wide v5, v3, Lb30/t3;->d:J

    cmp-long v9, v5, v7

    if-eqz v9, :cond_4

    :goto_6
    move-wide/from16 v16, v5

    goto :goto_8

    :cond_4
    if-eqz v4, :cond_5

    sget-wide v4, Li2/x;->b:J

    :goto_7
    move-wide v5, v4

    goto :goto_6

    :cond_5
    sget-wide v4, Li2/x;->f:J

    goto :goto_7

    :goto_8
    iget-wide v3, v3, Lb30/t3;->e:J

    cmp-long v5, v3, v7

    if-eqz v5, :cond_6

    :goto_9
    move-wide/from16 v18, v3

    goto :goto_a

    :cond_6
    invoke-static {v1, v2}, Ld40/r;->e(Ld40/k;Landroid/content/Context;)I

    move-result v1

    invoke-static {v1}, Li2/w0;->c(I)J

    move-result-wide v3

    goto :goto_9

    :goto_a
    new-instance v9, Lb30/t3;

    invoke-direct/range {v9 .. v19}, Lb30/t3;-><init>(JJJJJ)V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v9

    :cond_7
    check-cast v6, Lb30/t3;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    return-object v6
.end method

.method public static y(Landroid/content/Context;Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, p2, v0}, Le4/a;->z(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method

.method public static z(Landroid/content/Context;Landroid/content/Context;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;
    .locals 1

    :try_start_0
    sget-boolean v0, Le4/a;->e:Z

    if-eqz v0, :cond_2

    if-eqz p3, :cond_0

    new-instance v0, Lq/d;

    invoke-direct {v0, p1, p3}, Lq/d;-><init>(Landroid/content/Context;Landroid/content/res/Resources$Theme;)V

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    invoke-static {v0, p2}, Lq83/g;->x(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0
    :try_end_0
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    return-object p0

    :catch_0
    move-exception p3

    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {p1, p2}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0

    :cond_1
    throw p3

    :catch_1
    const/4 p0, 0x0

    sput-boolean p0, Le4/a;->e:Z

    :catch_2
    :cond_2
    if-eqz p3, :cond_3

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object p3

    :goto_1
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object p0

    sget-object p1, Lu4/k;->a:Ljava/lang/ThreadLocal;

    invoke-static {p0, p2, p3}, Lu4/b;->f(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract J([BII)I
.end method

.method public abstract u([BII)Ljava/lang/String;
.end method

.method public abstract v(Ljava/lang/String;[BII)I
.end method
