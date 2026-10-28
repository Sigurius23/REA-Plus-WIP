.class public abstract Lhr2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0003\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u00028\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lhr2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "d",
        "(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "Lhr2/a;",
        "coloredText",
        "Lkotlin/time/Duration;",
        "delay",
        "Ly3/o;",
        "textSize",
        "g",
        "(Lhr2/a;JJLandroidx/compose/runtime/Composer;I)V",
        "visible",
        "",
        "alpha",
        "user-journey_release"
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
.method public static synthetic a(Lhr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhr2/f;->e(Lhr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhr2/a;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lhr2/f;->k(Lhr2/a;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lhr2/f;->f(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v0, p0

    move/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x3045834d

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v11, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v11

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v4, v5, :cond_4

    move v4, v13

    goto :goto_3

    :cond_4
    move v4, v12

    :goto_3
    and-int/2addr v3, v13

    invoke-virtual {v7, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_10

    if-eqz v1, :cond_f

    const v3, 0x694d1bde

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_5

    new-instance v3, Ld0/q0;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v4}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v4}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v4, v3

    check-cast v4, Ld0/q0;

    const/high16 v3, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_6

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_8

    :cond_7
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v7, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v5, Lhb2/f;

    const/4 v8, 0x3

    invoke-direct {v5, v0, v8}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    const v8, -0x54944d04

    invoke-static {v8, v7, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v8, 0x180

    move-object v13, v9

    const/4 v9, 0x2

    move-object/from16 v16, v6

    move-object v6, v5

    const/4 v5, 0x0

    move-object/from16 v17, v13

    move-object/from16 v13, v16

    invoke-static/range {v4 .. v9}, Lkr2/b;->k(Ld0/q0;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    const/4 v6, 0x0

    invoke-static {v4, v5, v6, v11}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-string v5, "WirPillarIntroV2Footer"

    invoke-static {v4, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v6, v5, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_9

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v7, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_b

    :cond_a
    move-object/from16 v13, v17

    invoke-static {v6, v7, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v7, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v4, v3

    const-wide/16 v8, 0x0

    cmpl-double v4, v4, v8

    if-lez v4, :cond_c

    goto :goto_6

    :cond_c
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v3, -0x2a257f58

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lhr2/b;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v12, v4, 0x1

    if-ltz v4, :cond_d

    check-cast v5, Lhr2/a;

    sget-object v6, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v6, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v4, v6}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v8

    invoke-static {v8, v9, v11}, Lkotlin/time/Duration;->div-UwyO8pc(JI)J

    move-result-wide v8

    invoke-virtual {v0}, Lhr2/b;->g()J

    move-result-wide v13

    invoke-static {v13, v14}, Ly3/o;->c(J)F

    move-result v4

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    const-wide v13, 0x100000000L

    invoke-static {v4, v13, v14, v6}, Lr80/c;->b(FJLy3/c;)J

    move-result-wide v13

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object v4, v5

    move-wide v5, v8

    move-object v9, v7

    move-wide v7, v13

    invoke-static/range {v4 .. v10}, Lhr2/f;->g(Lhr2/a;JJLandroidx/compose/runtime/Composer;I)V

    move-object v7, v9

    move v4, v12

    goto :goto_7

    :cond_d
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_e
    const/4 v3, 0x0

    const/4 v5, 0x1

    invoke-static {v7, v3, v5, v5, v3}, Lb9/y;->B(Lp1/q;ZZZZ)V

    goto :goto_8

    :cond_f
    move v3, v12

    const v4, 0x69603735

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_11

    new-instance v4, Lhr2/c;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v1, v2, v5}, Lhr2/c;-><init>(Lhr2/b;ZII)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final e(Lhr2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    const/16 p1, 0x8c

    int-to-float p1, p1

    const/4 p2, 0x4

    int-to-float p2, p2

    mul-float/2addr p1, p2

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p1, p2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-virtual {p0}, Lhr2/b;->e()Lkd1/o;

    move-result-object v1

    sget v5, Lkd1/o;->a:I

    const/4 v6, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const/16 v9, 0x61b0

    const/16 v10, 0x68

    move-object v8, v4

    const/4 v4, 0x0

    sget-object v5, Ly2/j;->a:Ly2/b1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v3, p1

    invoke-static/range {v1 .. v10}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lhr2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lhr2/f;->d(Lhr2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lhr2/a;JJLandroidx/compose/runtime/Composer;I)V
    .locals 32

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, -0xcea7a59

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v6, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v6

    goto :goto_2

    :cond_2
    move v0, v6

    :goto_2
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v11, v2, v3}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    and-int/lit16 v4, v6, 0x180

    move-wide/from16 v14, p3

    if-nez v4, :cond_6

    invoke-virtual {v11, v14, v15}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x100

    goto :goto_4

    :cond_5
    const/16 v4, 0x80

    :goto_4
    or-int/2addr v0, v4

    :cond_6
    and-int/lit16 v4, v0, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/16 v16, 0x1

    if-eq v4, v7, :cond_7

    move/from16 v4, v16

    goto :goto_5

    :cond_7
    move v4, v8

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v4, v7, :cond_8

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v4}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v4

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v4, Lp1/c1;

    invoke-static {v4}, Lhr2/f;->h(Lp1/c1;)Z

    move-result v9

    const/4 v10, 0x0

    if-eqz v9, :cond_9

    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_6

    :cond_9
    move v9, v10

    :goto_6
    const/high16 v12, 0x42480000    # 50.0f

    const/4 v13, 0x5

    const/4 v5, 0x0

    invoke-static {v10, v12, v13, v5}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v10

    const/16 v12, 0x30

    const/16 v13, 0x1c

    move-object/from16 v17, v7

    move v7, v9

    const/4 v9, 0x0

    move/from16 v18, v8

    move-object v8, v10

    const/4 v10, 0x0

    move-object/from16 v5, v17

    invoke-static/range {v7 .. v13}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v7

    and-int/lit8 v8, v0, 0x70

    const/16 v9, 0x20

    if-ne v8, v9, :cond_a

    move/from16 v8, v16

    goto :goto_7

    :cond_a
    const/4 v8, 0x0

    :goto_7
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_b

    if-ne v9, v5, :cond_c

    :cond_b
    new-instance v9, Lhr2/f$a;

    const/4 v5, 0x0

    invoke-direct {v9, v2, v3, v4, v5}, Lhr2/f$a;-><init>(JLp1/c1;Lq83/d;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v9, Lc93/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v9, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v7}, Lhr2/f;->j(Lp1/t2;)F

    move-result v5

    invoke-static {v5, v4}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v1}, Lhr2/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-static {}, Lhr2/h;->a()Ll3/v0;

    move-result-object v27

    invoke-virtual {v1}, Lhr2/a;->b()Ly81/f;

    move-result-object v4

    const/4 v5, 0x0

    invoke-virtual {v4, v11, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x1c00

    const/high16 v30, 0x180000

    const v31, 0xfff0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    move/from16 v29, v0

    move-object/from16 v28, v11

    move-wide/from16 v11, p3

    invoke-static/range {v7 .. v31}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lg1/o4;

    const/4 v7, 0x1

    move-wide/from16 v4, p3

    invoke-direct/range {v0 .. v7}, Lg1/o4;-><init>(Ljava/lang/Object;JJII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final h(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final i(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final k(Lhr2/a;JJILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-wide v1, p1

    move-wide v3, p3

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lhr2/f;->g(Lhr2/a;JJLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic l(Lp1/c1;Z)V
    .locals 0

    invoke-static {p0, p1}, Lhr2/f;->i(Lp1/c1;Z)V

    return-void
.end method
