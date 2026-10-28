.class public abstract Lzt2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a/\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Lzt2/n;",
        "recoveriesCounterState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lzt2/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lzt2/l;",
        "state",
        "",
        "goalId",
        "",
        "dayIndex",
        "g",
        "(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Lzt2/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzt2/m;->f(Lzt2/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzt2/m;->h(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzt2/n;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzt2/m;->e(Lzt2/n;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lzt2/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzt2/n;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "recoveriesCounterState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, 0x73bb3c4e

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x1

    if-eq v6, v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    const/4 v4, 0x0

    :goto_2
    and-int/2addr v3, v7

    invoke-virtual {v13, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_5

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v3, 0x3

    int-to-float v3, v3

    int-to-float v5, v5

    mul-float/2addr v3, v5

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_3

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_4

    :cond_3
    new-instance v5, Lx30/h1;

    const/16 v3, 0x14

    invoke-direct {v5, v0, v3}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v13, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v12, v5

    check-cast v12, Lkotlin/jvm/functions/Function1;

    const/16 v14, 0x6006

    const/16 v15, 0x1ee

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v4 .. v15}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_6

    new-instance v4, Lyf1/e;

    const/16 v5, 0x1b

    invoke-direct {v4, v0, v1, v2, v5}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final e(Lzt2/n;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyRow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lzt2/n;->b()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lzt2/m$a;

    invoke-direct {v2, v0}, Lzt2/m$a;-><init>(Ljava/util/List;)V

    new-instance v3, Lzt2/m$b;

    invoke-direct {v3, v0, p0}, Lzt2/m$b;-><init>(Ljava/util/List;Lzt2/n;)V

    new-instance p0, Lx1/b;

    const/4 v0, 0x1

    const v4, 0x799532c4

    invoke-direct {p0, v3, v0, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p1, Ln0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v1, v0, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lzt2/n;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzt2/m;->d(Lzt2/n;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x33a1551f    # -5.8370948E7f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v8, v9, :cond_9

    move v8, v13

    goto :goto_7

    :cond_9
    move v8, v14

    :goto_7
    and-int/2addr v0, v13

    invoke-virtual {v10, v0, v8}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    const/4 v0, 0x0

    if-eqz v3, :cond_a

    move-object v3, v0

    goto :goto_8

    :cond_a
    move-object v3, v5

    :goto_8
    if-eqz v6, :cond_b

    move-object v15, v0

    goto :goto_9

    :cond_b
    move-object v15, v7

    :goto_9
    invoke-virtual {v1}, Lzt2/l;->c()Z

    move-result v5

    if-eqz v5, :cond_c

    const v5, 0x2f5f8e4a

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->T()J

    move-result-wide v5

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    const v5, 0x2f5f90ec

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    sget-wide v5, Li2/x;->m:J

    :goto_a
    invoke-virtual {v1}, Lzt2/l;->c()Z

    move-result v7

    if-eqz v7, :cond_d

    const v7, 0x2f5f9a29

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X()J

    move-result-wide v7

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_d
    const v7, 0x2f5f9e28

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-static {v7, v10, v8, v14}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v7

    :goto_b
    invoke-virtual {v1}, Lzt2/l;->c()Z

    move-result v9

    if-eqz v9, :cond_e

    const v9, 0x2f5fa70b

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v9, v10, v11, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    goto :goto_c

    :cond_e
    const v9, 0x2f5fab48

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v9, v10, v11, v14}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_c
    invoke-virtual {v1}, Lzt2/l;->c()Z

    move-result v9

    if-eqz v9, :cond_f

    const-string v9, "Logged"

    goto :goto_d

    :cond_f
    const-string v9, "NotLogged"

    :goto_d
    if-eqz v3, :cond_10

    if-eqz v15, :cond_10

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v14, "_Day"

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v14, "_"

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_Circle"

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_10
    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v13, v13

    invoke-static {v13, v7, v8}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v7

    sget-object v8, Lt0/j;->a:Lt0/i;

    iget v13, v7, Lf0/t;->a:F

    iget-object v7, v7, Lf0/t;->b:Li2/t;

    invoke-static {v13, v0, v7, v8}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v7, 0x8

    int-to-float v7, v7

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v5, v6, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v13, 0x1

    invoke-static {v0, v13}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v5, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_11

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_13

    :cond_12
    invoke-static {v6, v10, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lzt2/l;->a()Lgz0/m0;

    move-result-object v0

    if-eqz v0, :cond_14

    const v0, -0x10fcb23d

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/l;->a()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v5, 0x6

    invoke-static {v0, v10, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const-string v6, "null"

    invoke-static {v6, v10, v5}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/4 v5, 0x3

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-wide v8, v11

    const/16 v11, 0x180

    const/4 v12, 0x0

    move-object v5, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    move-object v2, v15

    goto/16 :goto_10

    :cond_14
    move-wide v8, v11

    const/4 v6, 0x0

    invoke-virtual {v1}, Lzt2/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v0, :cond_15

    const v0, -0x10f81d34

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lzt2/l;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v25

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v29, v0, 0x12

    const v30, 0x2fffa

    move v0, v6

    const/4 v6, 0x0

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object v2, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v13, 0x1

    goto :goto_10

    :cond_15
    move v0, v6

    move-object v2, v15

    const v5, -0x10f5b099

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    goto :goto_11

    :cond_16
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lz51/n;

    const/16 v6, 0xf

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lz51/n;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzt2/m;->g(Lzt2/l;Ljava/lang/String;Ljava/lang/Integer;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
