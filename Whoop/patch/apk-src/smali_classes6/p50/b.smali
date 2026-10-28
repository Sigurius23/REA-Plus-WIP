.class public abstract Lp50/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a!\u0010\u0010\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lp50/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lp50/c;",
        "row",
        "l",
        "(Lp50/c;Landroidx/compose/runtime/Composer;I)V",
        "Lsz0/c0;",
        "state",
        "f",
        "(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V",
        "access_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lp50/b;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lp50/b;->k(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lp50/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lp50/b;->m(Lp50/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lp50/b;->j(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lsz0/c0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lp50/b;->g(Landroidx/compose/ui/Modifier;Lsz0/c0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V
    .locals 30

    move-object/from16 v2, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x54e91ff5

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p3, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_5

    and-int/lit8 v4, p3, 0x40

    if-nez v4, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_2

    :cond_3
    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_2
    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_3

    :cond_4
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    move/from16 v29, v3

    and-int/lit8 v3, v29, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    if-eq v3, v4, :cond_6

    const/4 v3, 0x1

    goto :goto_4

    :cond_6
    move v3, v5

    :goto_4
    and-int/lit8 v4, v29, 0x1

    invoke-virtual {v12, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_7
    move-object v0, v1

    :goto_5
    invoke-virtual {v2}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v3, Liz0/l;->a:Liz0/l;

    sget-object v4, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v2}, Lsz0/c0;->l()Lb91/c;

    move-result-object v6

    invoke-virtual {v4, v6}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v4

    invoke-virtual {v4}, Lb91/a;->d()Ll3/v0;

    move-result-object v13

    invoke-virtual {v2}, Lsz0/c0;->c()I

    move-result v22

    const/16 v26, 0x0

    const v27, 0xff7fff

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v4

    invoke-virtual {v2}, Lsz0/c0;->e()Ly81/f;

    move-result-object v6

    invoke-virtual {v6, v12, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    sget v7, Liz0/l;->b:I

    shl-int/lit8 v27, v7, 0xf

    const/16 v28, 0x7ffc

    const-wide/16 v7, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v25, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-virtual/range {v3 .. v28}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v6

    shl-int/lit8 v3, v29, 0x3

    and-int/lit8 v3, v3, 0x70

    sget v4, Liz0/m;->p:I

    shl-int/lit8 v4, v4, 0x9

    or-int v13, v3, v4

    const/16 v14, 0x1f4

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, v0

    move-object v3, v1

    move-object/from16 v12, v25

    invoke-static/range {v3 .. v14}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object v1, v4

    goto :goto_6

    :cond_8
    move-object/from16 v25, v12

    invoke-virtual/range {v25 .. v25}, Lp1/q;->X()V

    :goto_6
    invoke-virtual/range {v25 .. v25}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lno0/y0;

    const/16 v5, 0xd

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lsz0/c0;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lp50/b;->f(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lp50/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p3

    check-cast v15, Lp1/q;

    const v0, 0x7387f821

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v1

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v15, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v9, v10, :cond_8

    move v9, v12

    goto :goto_5

    :cond_8
    move v9, v11

    :goto_5
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v15, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_14

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v9

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    if-eqz v7, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v5, v7, :cond_a

    new-instance v5, Lov2/f;

    const/16 v7, 0x17

    invoke-direct {v5, v7}, Lov2/f;-><init>(I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object/from16 v18, v5

    goto :goto_7

    :cond_b
    move-object/from16 v18, v8

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-static {v5, v7, v8}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v10, v8

    int-to-float v3, v3

    invoke-static {v5, v10, v3}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v5, v15, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a1()J

    move-result-wide v13

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v13, v14, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v1, v1

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v1, v5

    const-wide/high16 v13, 0x4004000000000000L    # 2.5

    double-to-float v13, v13

    mul-float/2addr v13, v5

    invoke-static {v3, v1, v13}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v15, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v15, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v15, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v15, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_e

    :cond_d
    invoke-static {v7, v15, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v15, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x5ba8b4b3

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp50/d;->b()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v7, 0x0

    :goto_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    add-int/lit8 v19, v7, 0x1

    if-ltz v7, :cond_10

    check-cast v8, Lp50/c;

    sget v11, Lsz0/c0;->k:I

    invoke-static {v8, v15, v11}, Lp50/b;->l(Lp50/c;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v2}, Lp50/d;->b()Ljava/util/List;

    move-result-object v8

    invoke-static {v8}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v8

    if-ge v7, v8, :cond_f

    const v7, -0x6db21abe

    invoke-virtual {v15, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-static {v9, v7, v1, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v16, 0x6

    const/16 v17, 0xfe

    move v8, v6

    const/4 v6, 0x0

    move v11, v5

    move-object v5, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    move/from16 v20, v10

    move/from16 v21, v11

    const-wide/16 v10, 0x0

    move/from16 v23, v12

    move/from16 v22, v13

    const-wide/16 v12, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move/from16 p0, v1

    move/from16 v2, v23

    const/4 v1, 0x0

    const/16 v25, 0x0

    move-object/from16 v23, v0

    move-object/from16 v0, v24

    const/16 v24, 0x3

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    move-object/from16 v23, v0

    move/from16 p0, v1

    move/from16 v21, v5

    move/from16 v22, v6

    move-object v0, v9

    move/from16 v20, v10

    move v2, v12

    const/4 v1, 0x0

    const/16 v24, 0x3

    const/16 v25, 0x0

    const v5, -0x6db0ae9d    # -6.5418E-28f

    invoke-virtual {v15, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_a
    move/from16 v1, p0

    move-object v9, v0

    move v12, v2

    move/from16 v7, v19

    move/from16 v10, v20

    move/from16 v5, v21

    move/from16 v6, v22

    move-object/from16 v0, v23

    move-object/from16 v2, p1

    goto/16 :goto_9

    :cond_10
    const/16 v25, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v25

    :cond_11
    move-object/from16 v23, v0

    move/from16 v21, v5

    move/from16 v22, v6

    move-object v0, v9

    move/from16 v20, v10

    move v2, v12

    const/4 v1, 0x0

    const/16 v24, 0x3

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lp50/d;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_13

    const v3, 0x19721a34

    invoke-virtual {v15, v3}, Lp1/q;->e0(I)V

    mul-float v10, v20, v21

    invoke-static {v10, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v15, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lp50/d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_b
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lm91/u;

    new-instance v7, Lno0/r0;

    const/16 v3, 0xe

    invoke-direct {v7, v3}, Lno0/r0;-><init>(I)V

    shl-int/lit8 v3, v22, 0x3

    and-int/lit16 v10, v3, 0x1c00

    const/4 v11, 0x2

    const/4 v6, 0x0

    move-object v9, v15

    move-object/from16 v8, v18

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_12
    move-object/from16 v8, v18

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_13
    move-object/from16 v8, v18

    const v0, 0x1976d6b7

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object/from16 v1, v23

    :goto_d
    move-object v3, v8

    goto :goto_e

    :cond_14
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v1, v5

    goto :goto_d

    :goto_e
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_15

    new-instance v0, Lot1/f;

    const/16 v6, 0xd

    move-object/from16 v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x3774c41e

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lp50/b;->h(Landroidx/compose/ui/Modifier;Lp50/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp50/c;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    check-cast p1, Lp1/q;

    const v0, 0x6ed27540

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p2, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, p2, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, p2

    goto :goto_2

    :cond_2
    move v0, p2

    :goto_2
    and-int/lit8 v2, v0, 0x3

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v2, v1, :cond_3

    move v1, v4

    goto :goto_3

    :cond_3
    move v1, v3

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {p1, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->L:Lb2/l;

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v6, 0x30

    invoke-static {v5, v2, p1, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v5, p1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p1, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p1}, Lp1/q;->i0()V

    iget-boolean v8, p1, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {p1, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {p1}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p1, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p1, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, p1, Lp1/q;->S:Z

    if-nez v6, :cond_5

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v5, p1, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p1, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v5, v1

    const-wide/16 v7, 0x0

    cmpl-double v0, v5, v7

    if-lez v0, :cond_7

    move v0, v4

    goto :goto_5

    :cond_7
    move v0, v3

    :goto_5
    if-nez v0, :cond_8

    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_8
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v0, v1, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {p0}, Lp50/c;->a()Lsz0/c0;

    move-result-object v1

    sget v2, Lsz0/c0;->k:I

    shl-int/lit8 v2, v2, 0x3

    invoke-static {v0, v1, p1, v2, v3}, Lp50/b;->f(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0}, Lp50/c;->c()Lsz0/c0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1, v0, p1, v2, v4}, Lp50/b;->f(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0}, Lp50/c;->b()Lsz0/c0;

    move-result-object v0

    invoke-static {v1, v0, p1, v2, v4}, Lp50/b;->f(Landroidx/compose/ui/Modifier;Lsz0/c0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v4}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_a

    new-instance v0, Los0/d;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p2, v1}, Los0/d;-><init>(Ljava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final m(Lp50/c;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lp50/b;->l(Lp50/c;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
