.class public abstract Lq81/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a?\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0013\u0010\u0017\u001a\u00020\u000e*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a\u00b2\u0006\u000e\u0010\u0019\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lq81/b;",
        "baseTimerState",
        "Landroidx/lifecycle/g0;",
        "lifecycleOwner",
        "Lb91/a;",
        "textStyle",
        "Li2/x;",
        "textColor",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JLandroidx/compose/runtime/Composer;II)V",
        "state",
        "",
        "l",
        "(Lq81/b;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;II)Ljava/lang/String;",
        "",
        "timeInSeconds",
        "",
        "includeHours",
        "j",
        "(IZ)Ljava/lang/String;",
        "i",
        "(I)Ljava/lang/String;",
        "currentTimeInSeconds",
        "design_release"
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
.method public static synthetic a(Lq81/b;)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lq81/a;->m(Lq81/b;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lq81/b;Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq81/a;->q(Lq81/b;Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic c(Landroidx/lifecycle/g0;Lq81/b;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lq81/a;->p(Landroidx/lifecycle/g0;Lq81/b;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lq81/a;->f(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JLandroidx/compose/runtime/Composer;II)V
    .locals 34

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    move/from16 v7, p7

    const-string v1, "baseTimerState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p6

    check-cast v1, Lp1/q;

    const v3, -0x2fc30aad

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p8, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v4, v7, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v7, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v1, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v7

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_7

    and-int/lit8 v6, p8, 0x4

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v1, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    move-object/from16 v6, p2

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    goto :goto_4

    :cond_7
    move-object/from16 v6, p2

    :goto_4
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_a

    and-int/lit8 v8, p8, 0x8

    if-nez v8, :cond_9

    and-int/lit16 v8, v7, 0x1000

    if-nez v8, :cond_8

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_5

    :cond_8
    invoke-virtual {v1, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_5
    if-eqz v8, :cond_9

    const/16 v8, 0x800

    goto :goto_6

    :cond_9
    const/16 v8, 0x400

    :goto_6
    or-int/2addr v5, v8

    :cond_a
    and-int/lit16 v8, v7, 0x6000

    if-nez v8, :cond_d

    and-int/lit8 v8, p8, 0x10

    if-nez v8, :cond_b

    move-wide/from16 v8, p4

    invoke-virtual {v1, v8, v9}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_c

    const/16 v10, 0x4000

    goto :goto_7

    :cond_b
    move-wide/from16 v8, p4

    :cond_c
    const/16 v10, 0x2000

    :goto_7
    or-int/2addr v5, v10

    goto :goto_8

    :cond_d
    move-wide/from16 v8, p4

    :goto_8
    and-int/lit16 v10, v5, 0x2493

    const/16 v11, 0x2492

    const/4 v12, 0x0

    if-eq v10, v11, :cond_e

    const/4 v10, 0x1

    goto :goto_9

    :cond_e
    move v10, v12

    :goto_9
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v1, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_18

    invoke-virtual {v1}, Lp1/q;->Z()V

    and-int/lit8 v10, v7, 0x1

    const v11, -0xe001

    if-eqz v10, :cond_13

    invoke-virtual {v1}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_f

    goto :goto_b

    :cond_f
    invoke-virtual {v1}, Lp1/q;->X()V

    and-int/lit8 v3, p8, 0x4

    if-eqz v3, :cond_10

    and-int/lit16 v5, v5, -0x381

    :cond_10
    and-int/lit8 v3, p8, 0x8

    if-eqz v3, :cond_11

    and-int/lit16 v5, v5, -0x1c01

    :cond_11
    and-int/lit8 v3, p8, 0x10

    if-eqz v3, :cond_12

    and-int/2addr v5, v11

    :cond_12
    move-object/from16 v28, v0

    move-object v3, v4

    move-object v4, v6

    :goto_a
    move-wide v10, v8

    goto :goto_e

    :cond_13
    :goto_b
    if-eqz v3, :cond_14

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_c

    :cond_14
    move-object v3, v4

    :goto_c
    and-int/lit8 v4, p8, 0x4

    if-eqz v4, :cond_15

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v4

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroidx/lifecycle/g0;

    and-int/lit16 v5, v5, -0x381

    goto :goto_d

    :cond_15
    move-object v4, v6

    :goto_d
    and-int/lit8 v6, p8, 0x8

    const/4 v10, 0x6

    if-eqz v6, :cond_16

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v1, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->A()Lb91/a;

    move-result-object v0

    and-int/lit16 v5, v5, -0x1c01

    :cond_16
    and-int/lit8 v6, p8, 0x10

    if-eqz v6, :cond_17

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v1, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    and-int/2addr v5, v11

    :cond_17
    move-object/from16 v28, v0

    goto :goto_a

    :goto_e
    invoke-virtual {v1}, Lp1/q;->r()V

    const-string v0, "BASE_TIMER_TEST_TAG"

    invoke-static {v3, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    shr-int/lit8 v0, v5, 0x3

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v2, v4, v1, v0, v12}, Lq81/a;->l(Lq81/b;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;II)Ljava/lang/String;

    move-result-object v8

    shr-int/lit8 v0, v5, 0x6

    and-int/lit16 v0, v0, 0x380

    shl-int/lit8 v5, v5, 0x9

    const/high16 v6, 0x380000

    and-int v32, v5, v6

    const v33, 0x2fff8

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move/from16 v31, v0

    move-object/from16 v30, v1

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object v1, v3

    move-object v3, v4

    move-wide v5, v10

    move-object/from16 v4, v28

    goto :goto_f

    :cond_18
    move-object/from16 v30, v1

    invoke-virtual/range {v30 .. v30}, Lp1/q;->X()V

    move-object v1, v4

    move-object v3, v6

    move-wide v5, v8

    move-object v4, v0

    :goto_f
    invoke-virtual/range {v30 .. v30}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_19

    new-instance v0, Lc41/p0;

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lc41/p0;-><init>(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-wide v5, p4

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lq81/a;->e(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic g(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lq81/a;->n(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic h(Lp1/c1;I)V
    .locals 0

    invoke-static {p0, p1}, Lq81/a;->o(Lp1/c1;I)V

    return-void
.end method

.method private static final i(I)Ljava/lang/String;
    .locals 1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x1

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%02d"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final j(IZ)Ljava/lang/String;
    .locals 4

    div-int/lit16 v0, p0, 0xe10

    invoke-static {v0}, Lq81/a;->i(I)Ljava/lang/String;

    move-result-object v0

    div-int/lit8 v1, p0, 0x3c

    rem-int/lit8 v1, v1, 0x3c

    invoke-static {v1}, Lq81/a;->i(I)Ljava/lang/String;

    move-result-object v1

    rem-int/lit8 p0, p0, 0x3c

    invoke-static {p0}, Lq81/a;->i(I)Ljava/lang/String;

    move-result-object p0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, ":"

    if-eqz p1, :cond_0

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :cond_0
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(IZILjava/lang/Object;)Ljava/lang/String;
    .locals 0

    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_0

    const/4 p1, 0x0

    :cond_0
    invoke-static {p0, p1}, Lq81/a;->j(IZ)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Lq81/b;Landroidx/lifecycle/g0;Landroidx/compose/runtime/Composer;II)Ljava/lang/String;
    .locals 7

    const-string p3, "state"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p3, p4, 0x2

    if-eqz p3, :cond_0

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object p1

    move-object p3, p2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/lifecycle/g0;

    :cond_0
    check-cast p2, Lp1/q;

    const p3, -0x78a0075e

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lq81/b;->g()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    invoke-virtual {p0}, Lq81/b;->i()Ljava/lang/Long;

    move-result-object p4

    filled-new-array {p3, p4}, [Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p4, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lq80/h;

    const/4 p4, 0x1

    invoke-direct {v0, p0, p4}, Lq80/h;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    const/4 p4, 0x0

    invoke-static {p3, v0, p2, p4}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lp1/c1;

    invoke-virtual {p0}, Lq81/b;->h()Lkotlin/jvm/functions/Function1;

    move-result-object v0

    invoke-static {v0, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v0

    invoke-virtual {p0}, Lq81/b;->k()Z

    move-result v2

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {p0}, Lq81/b;->g()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {p0}, Lq81/b;->i()Ljava/lang/Long;

    move-result-object v4

    invoke-virtual {p2, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_3

    if-ne v6, v1, :cond_4

    :cond_3
    new-instance v6, Lq81/a$a;

    const/4 v5, 0x0

    invoke-direct {v6, p0, v0, p3, v5}, Lq81/a$a;-><init>(Lq81/b;Lp1/t2;Lp1/c1;Lq83/d;)V

    invoke-virtual {p2, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v6, Lc93/m;

    invoke-static {v2, v3, v4, v6, p2}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {p2, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_5

    if-ne v2, v1, :cond_6

    :cond_5
    new-instance v2, Lno0/j0;

    const/16 v0, 0x15

    invoke-direct {v2, p1, p0, p3, v0}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, v2, p2}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-static {p3}, Lq81/a;->n(Lp1/c1;)I

    move-result p1

    invoke-virtual {p0}, Lq81/b;->f()Z

    move-result p0

    invoke-static {p1, p0}, Lq81/a;->j(IZ)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2, p4}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final m(Lq81/b;)Lp1/c1;
    .locals 0

    invoke-virtual {p0}, Lq81/b;->g()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final o(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Landroidx/lifecycle/g0;Lq81/b;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Leu/k;

    invoke-direct {p3, p1, p2}, Leu/k;-><init>(Lq81/b;Lp1/c1;)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p3}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lq81/a$b;

    invoke-direct {p1, p0, p3}, Lq81/a$b;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final q(Lq81/b;Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "event"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    if-ne p3, p2, :cond_0

    invoke-virtual {p0}, Lq81/b;->e()Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    invoke-static {p1, p0}, Lq81/a;->o(Lp1/c1;I)V

    :cond_0
    return-void
.end method
