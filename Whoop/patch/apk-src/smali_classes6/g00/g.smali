.class public abstract Lg00/g;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:Lp1/u2;

.field public static final c:Lp1/u2;

.field public static final d:Lp1/u2;

.field public static final e:F

.field public static final f:F

.field public static final g:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfw0/a;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg00/g;->a:Lp1/u2;

    new-instance v0, Lfw0/a;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg00/g;->b:Lp1/u2;

    new-instance v0, Lfw0/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg00/g;->c:Lp1/u2;

    new-instance v0, Lfw0/a;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg00/g;->d:Lp1/u2;

    const/16 v0, 0x30

    int-to-float v0, v0

    sput v0, Lg00/g;->e:F

    const/16 v0, 0x46

    int-to-float v0, v0

    sput v0, Lg00/g;->f:F

    const/16 v0, 0x14

    int-to-float v0, v0

    sput v0, Lg00/g;->g:F

    return-void
.end method

.method public static final a(Lwz/d0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 63

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v0, 0x52b9c0ec

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    or-int/lit8 v0, v2, 0x2

    and-int/lit8 v0, v0, 0x13

    const/16 v4, 0x12

    if-ne v0, v4, :cond_1

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v4, p0

    goto/16 :goto_d

    :cond_1
    :goto_0
    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v0, v2, 0x1

    if-eqz v0, :cond_3

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object/from16 v4, p0

    goto :goto_2

    :cond_3
    :goto_1
    sget-object v0, Lg00/g;->a:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwz/d0;

    move-object v4, v0

    :goto_2
    invoke-virtual {v3}, Lp1/q;->r()V

    const v0, 0x3960d629

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    const v0, 0x3960cf22

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    :try_start_0
    sget-object v0, Li00/a;->a:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm40/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception v0

    invoke-static {v0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v0

    :goto_3
    const/4 v5, 0x0

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v6

    if-nez v6, :cond_4

    goto :goto_4

    :cond_4
    new-instance v0, Lm40/w;

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    const/16 v7, 0x1e

    invoke-direct {v0, v6, v7}, Lm40/w;-><init>(Landroid/content/Context;I)V

    :goto_4
    check-cast v0, Lm40/w;

    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    const v6, 0x24d4188c

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    if-eqz v4, :cond_5

    iget-object v6, v4, Lwz/d0;->y:Lwz/c0;

    goto :goto_5

    :cond_5
    const/4 v6, 0x0

    :goto_5
    sget-object v7, Lwz/c0;->x:Lwz/c0;

    if-ne v6, v7, :cond_6

    move v6, v5

    goto :goto_7

    :cond_6
    sget-object v7, Lwz/c0;->y:Lwz/c0;

    if-ne v6, v7, :cond_7

    const/4 v6, 0x1

    goto :goto_7

    :cond_7
    sget-object v7, Lwz/c0;->w:Lwz/c0;

    if-eq v6, v7, :cond_9

    if-nez v6, :cond_8

    goto :goto_6

    :cond_8
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_9
    :goto_6
    invoke-static {v3}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v6

    :goto_7
    invoke-virtual {v3, v5}, Lp1/q;->q(Z)V

    sget-object v7, Lg00/d;->a:Lg00/b;

    if-eqz v6, :cond_a

    sget-object v7, Lg00/d;->b:Lg00/b;

    goto :goto_8

    :cond_a
    sget-object v7, Lg00/d;->a:Lg00/b;

    :goto_8
    if-eqz v4, :cond_c

    if-eqz v6, :cond_b

    iget-object v8, v4, Lwz/d0;->x:Lwz/a0;

    goto :goto_9

    :cond_b
    iget-object v8, v4, Lwz/d0;->w:Lwz/a0;

    :goto_9
    iget-wide v9, v8, Lwz/a0;->w:J

    iget-wide v11, v8, Lwz/a0;->x:J

    iget-wide v13, v8, Lwz/a0;->y:J

    move-wide/from16 v29, v9

    iget-boolean v10, v7, Lg00/b;->a:Z

    move-wide/from16 v47, v11

    iget-wide v11, v7, Lg00/b;->b:J

    move-wide/from16 v21, v13

    iget-wide v13, v7, Lg00/b;->c:J

    iget-wide v8, v7, Lg00/b;->d:J

    move/from16 p2, v6

    iget-wide v5, v7, Lg00/b;->e:J

    move-wide/from16 v17, v5

    iget-wide v5, v7, Lg00/b;->f:J

    move-wide/from16 v19, v5

    iget-wide v5, v7, Lg00/b;->h:J

    move-wide/from16 v23, v5

    iget-wide v5, v7, Lg00/b;->i:J

    move-wide/from16 v25, v5

    iget-wide v5, v7, Lg00/b;->j:J

    move-wide/from16 v27, v5

    iget-wide v5, v7, Lg00/b;->l:J

    move-wide/from16 v31, v5

    iget-wide v5, v7, Lg00/b;->m:J

    move-wide/from16 v33, v5

    iget-wide v5, v7, Lg00/b;->n:J

    move-wide/from16 v35, v5

    iget-wide v5, v7, Lg00/b;->o:J

    move-wide/from16 v37, v5

    iget-wide v5, v7, Lg00/b;->p:J

    move-wide/from16 v39, v5

    iget-wide v5, v7, Lg00/b;->r:J

    move-wide/from16 v43, v5

    iget-wide v5, v7, Lg00/b;->s:J

    move-wide/from16 v45, v5

    iget-wide v5, v7, Lg00/b;->u:J

    move-wide/from16 v49, v5

    iget-wide v5, v7, Lg00/b;->v:J

    move-wide/from16 v51, v5

    iget-wide v5, v7, Lg00/b;->w:J

    move-wide/from16 v53, v5

    iget-wide v5, v7, Lg00/b;->x:J

    move-wide/from16 v55, v5

    iget-wide v5, v7, Lg00/b;->y:J

    move-wide/from16 v57, v5

    iget-wide v5, v7, Lg00/b;->z:J

    move-wide/from16 v59, v5

    iget-wide v5, v7, Lg00/b;->A:J

    move-wide v15, v8

    new-instance v9, Lg00/b;

    move-wide/from16 v41, v29

    move-wide/from16 v61, v5

    invoke-direct/range {v9 .. v62}, Lg00/b;-><init>(ZJJJJJJJJJJJJJJJJJJJJJJJJJJ)V

    move-object v7, v9

    goto :goto_a

    :cond_c
    move/from16 p2, v6

    :goto_a
    new-instance v5, Lg00/c;

    const/4 v6, 0x4

    int-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    const/16 v8, 0xc

    int-to-float v8, v8

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    const/16 v10, 0x38

    int-to-float v11, v10

    invoke-direct {v5, v6, v9, v8, v11}, Lg00/c;-><init>(Lt0/i;Lt0/i;Lt0/i;F)V

    if-eqz v4, :cond_f

    iget-object v5, v4, Lwz/d0;->z:Lwz/b0;

    iget-object v12, v5, Lwz/b0;->w:Ljava/lang/Float;

    if-eqz v12, :cond_d

    invoke-virtual {v12}, Ljava/lang/Number;->floatValue()F

    move-result v8

    invoke-static {v8}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    :cond_d
    iget-object v5, v5, Lwz/b0;->x:Ljava/lang/Float;

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Ljava/lang/Float;->floatValue()F

    move-result v11

    :cond_e
    new-instance v5, Lg00/c;

    invoke-direct {v5, v6, v9, v8, v11}, Lg00/c;-><init>(Lt0/i;Lt0/i;Lt0/i;F)V

    :cond_f
    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    sget-object v9, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v3, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    const v11, 0x396178b1

    invoke-virtual {v3, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    move/from16 v12, p2

    invoke-virtual {v3, v12}, Lp1/q;->h(Z)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v3, v9}, Lp1/q;->h(Z)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v13, v11, :cond_13

    :cond_10
    if-eqz v12, :cond_11

    const/16 v11, 0x20

    goto :goto_b

    :cond_11
    const/16 v11, 0x10

    :goto_b
    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v12

    invoke-virtual {v12}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v12

    iget v12, v12, Landroid/content/res/Configuration;->uiMode:I

    and-int/lit8 v12, v12, 0x30

    if-ne v11, v12, :cond_12

    goto :goto_c

    :cond_12
    new-instance v12, Landroid/content/res/Configuration;

    invoke-virtual {v8}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v13

    invoke-virtual {v13}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v13

    invoke-direct {v12, v13}, Landroid/content/res/Configuration;-><init>(Landroid/content/res/Configuration;)V

    iput v11, v12, Landroid/content/res/Configuration;->uiMode:I

    invoke-virtual {v8}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v11

    new-instance v13, Lg00/f;

    invoke-direct {v13, v8, v9, v12, v11}, Lg00/f;-><init>(Landroid/content/Context;ZLandroid/content/res/Configuration;Landroid/content/res/Resources$Theme;)V

    invoke-virtual {v13, v12}, Lq/d;->a(Landroid/content/res/Configuration;)V

    move-object v8, v13

    :goto_c
    invoke-virtual {v3, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v13, v8

    :cond_13
    check-cast v13, Landroid/content/Context;

    const/4 v8, 0x0

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v13}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v6

    sget-object v8, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v7

    sget-object v8, Lg00/g;->b:Lp1/u2;

    sget-object v9, Lg00/h;->a:Lg00/e;

    invoke-virtual {v8, v9}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v8

    sget-object v9, Lg00/g;->d:Lp1/u2;

    invoke-virtual {v9, v5}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v5

    sget-object v9, Li00/a;->a:Lp1/u2;

    invoke-virtual {v9, v0}, Lp1/u2;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v6, v7, v8, v5, v0}, [Lp1/u1;

    move-result-object v0

    new-instance v5, Lb30/l4;

    const/4 v6, 0x5

    invoke-direct {v5, v1, v6}, Lb30/l4;-><init>(Lx1/b;I)V

    const v6, 0x595a142c

    invoke-static {v6, v3, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    invoke-static {v0, v5, v3, v10}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_d
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v3, Lf01/f;

    const/16 v5, 0xa

    invoke-direct {v3, v4, v1, v2, v5}, Lf01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method
