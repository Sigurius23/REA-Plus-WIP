.class public abstract Lc41/e4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a9\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u001a\u001f\u0010\r\u001a\u00020\u00082\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "currentProgress",
        "totalSteps",
        "Ll83/a0;",
        "e",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;II)V",
        "j",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V",
        "h",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/e4;->k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lc41/e4;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource$b;Lcom/whoop/design/util/TextResource$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lc41/e4;->f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource$b;Lcom/whoop/design/util/TextResource$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/e4;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;II)V
    .locals 22

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v9, p6

    const-string v0, "title"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subtitle"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, 0x2942a896

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v9, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v9, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v9

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v9

    :goto_1
    and-int/lit8 v6, v9, 0x30

    const/16 v7, 0x10

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    move v6, v7

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v9, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v9, 0xc00

    if-nez v6, :cond_8

    move/from16 v6, p3

    invoke-virtual {v10, v6}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x800

    goto :goto_4

    :cond_7
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v5, v8

    goto :goto_5

    :cond_8
    move/from16 v6, p3

    :goto_5
    and-int/lit16 v8, v9, 0x6000

    if-nez v8, :cond_a

    move/from16 v8, p4

    invoke-virtual {v10, v8}, Lp1/q;->e(I)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x4000

    goto :goto_6

    :cond_9
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v5, v11

    goto :goto_7

    :cond_a
    move/from16 v8, p4

    :goto_7
    and-int/lit16 v11, v5, 0x2493

    const/16 v12, 0x2492

    const/4 v13, 0x0

    const/4 v14, 0x1

    if-eq v11, v12, :cond_b

    move v11, v14

    goto :goto_8

    :cond_b
    move v11, v13

    :goto_8
    and-int/2addr v5, v14

    invoke-virtual {v10, v5, v11}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object v4, v5

    :cond_c
    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v11, Lgy0/f;->x1:I

    new-instance v12, Lcom/whoop/design/util/TextResource$d$b;

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-direct {v12, v15}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    new-array v15, v14, [Lcom/whoop/design/util/TextResource$d;

    aput-object v12, v15, v13

    invoke-direct {v0, v11, v15}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    new-instance v11, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lgy0/f;->y1:I

    new-instance v15, Lcom/whoop/design/util/TextResource$d$b;

    move/from16 p5, v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-direct {v15, v13}, Lcom/whoop/design/util/TextResource$d$b;-><init>(Ljava/lang/Number;)V

    new-array v13, v14, [Lcom/whoop/design/util/TextResource$d;

    aput-object v15, v13, p5

    invoke-direct {v11, v12, v13}, Lcom/whoop/design/util/TextResource$b;-><init>(I[Lcom/whoop/design/util/TextResource$d;)V

    int-to-float v7, v7

    int-to-float v1, v1

    mul-float/2addr v7, v1

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v1, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v13

    move-object v1, v4

    move-object v4, v0

    new-instance v0, La01/f;

    const/16 v8, 0xc

    move/from16 v7, p4

    move-object v5, v11

    invoke-direct/range {v0 .. v8}, La01/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    const v2, 0x1975f026

    invoke-static {v2, v10, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v18

    const v20, 0xc00006

    const/16 v21, 0x7a

    const/4 v11, 0x0

    move-object/from16 v19, v10

    move-object v10, v12

    move-wide v12, v13

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v10 .. v21}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_d
    move-object/from16 v19, v10

    invoke-virtual/range {v19 .. v19}, Lp1/q;->X()V

    move-object v1, v4

    :goto_9
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_e

    new-instance v0, Lc41/d4;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v7, p7

    move v6, v9

    invoke-direct/range {v0 .. v7}, Lc41/d4;-><init>(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource$b;Lcom/whoop/design/util/TextResource$b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 22

    and-int/lit8 v0, p8, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p8, 0x1

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v4

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v0, v4

    const/4 v5, 0x0

    move-object/from16 v6, p0

    invoke-static {v6, v5, v0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Lb2/e;->M:Lb2/k;

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v7, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v13, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v13, v15, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v8, v13, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v0, v9

    mul-float v18, v0, v4

    const/4 v10, 0x0

    const/16 v11, 0xe

    move-object v0, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v0

    move-object v0, v7

    move/from16 v7, v18

    invoke-static/range {v6 .. v11}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v9, v13, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v13, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v9, v13, v9, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, p1

    move-object/from16 v8, p2

    invoke-static {v6, v8, v13, v1}, Lc41/e4;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    invoke-static {v8, v9, v13, v1}, Lc41/e4;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-static {v6, v7, v5, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-eqz v9, :cond_7

    invoke-virtual {v13, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v13, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v13, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v5, v13, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v13, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v6

    move/from16 v18, v7

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v14, 0x6

    const/16 v15, 0x78

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v6, p5

    move/from16 v7, p6

    invoke-static/range {v5 .. v15}, Llz0/f;->b(Landroidx/compose/ui/Modifier;IILi2/t;JZFLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lc41/e4;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "currentProgress"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "totalSteps"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x6f95a14f

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    move/from16 v30, v4

    and-int/lit8 v4, v30, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v4, v6, :cond_4

    move v4, v7

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v6, v30, 0x1

    invoke-virtual {v3, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v4, v7

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v10, v4, v6

    const/4 v12, 0x0

    const/16 v13, 0xd

    const/4 v9, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v8

    mul-float/2addr v8, v6

    const/4 v6, 0x0

    invoke-static {v4, v8, v6, v5}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->b:Ll0/e;

    sget-object v6, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x6

    invoke-static {v5, v6, v3, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v11, v3, Lp1/q;->S:Z

    if-eqz v11, :cond_5

    invoke-virtual {v3, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v3, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v6, v3, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v30, 0xe

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v3, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->D()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v3, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object v6, v5

    const/4 v5, 0x0

    move v11, v7

    move v12, v8

    move-wide/from16 v33, v9

    move-object v10, v6

    move-wide/from16 v6, v33

    const-wide/16 v8, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    move/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move/from16 v21, v18

    const-wide/16 v17, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v26, v3

    move-object v3, v0

    move/from16 v0, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    shr-int/lit8 v5, v30, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v1, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->D()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v6

    move-object v4, v5

    const/4 v5, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v3, Lam0/c;

    const/4 v4, 0x2

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lam0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lc41/e4;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "title"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subtitle"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x5c04419b

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v2, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v2

    goto :goto_1

    :cond_1
    move v4, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    move/from16 v30, v4

    and-int/lit8 v4, v30, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x1

    if-eq v4, v5, :cond_4

    move v4, v6

    goto :goto_3

    :cond_4
    const/4 v4, 0x0

    :goto_3
    and-int/lit8 v5, v30, 0x1

    invoke-virtual {v3, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_8

    int-to-float v4, v6

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v7, 0x0

    invoke-static {v5, v7, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->M:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v5, v3, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v3, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v10, v3, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v3, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v3, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v3, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v3, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v7, v3, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v30, 0xe

    invoke-static {v0, v3, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v5, v3, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v3, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object v10, v5

    const/4 v5, 0x0

    move v11, v6

    move v12, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    move-object v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    move/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move/from16 v21, v18

    const-wide/16 v17, 0x0

    move-object/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object/from16 v0, v26

    move-object/from16 v26, v3

    move-object v3, v0

    move/from16 v0, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    shr-int/lit8 v5, v30, 0x3

    and-int/lit8 v5, v5, 0xe

    invoke-static {v1, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->c()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v6

    move-object v4, v5

    const/4 v5, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v14, 0x1

    invoke-virtual {v4, v14}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v3, Lam0/c;

    const/4 v4, 0x3

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lam0/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final k(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lc41/e4;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
