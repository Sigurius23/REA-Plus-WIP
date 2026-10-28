.class public abstract Lir2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\n\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\'\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u001a\u000f\u0010\u0012\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lir2/b;",
        "viewState",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "l",
        "(Lir2/b;ZLandroidx/compose/runtime/Composer;I)V",
        "",
        "Lir2/a;",
        "recommendations",
        "f",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "rec",
        "",
        "currentIndex",
        "lastIndex",
        "h",
        "(Lir2/a;IILandroidx/compose/runtime/Composer;I)V",
        "j",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lir2/d;->g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lir2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lir2/d;->n(Lir2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lir2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lir2/d;->m(Lir2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lir2/d;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lir2/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lir2/d;->i(Lir2/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lir2/a;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v2, "recommendations"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x43fbd39a

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v12, 0x1

    if-eq v5, v3, :cond_2

    move v3, v12

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/2addr v2, v12

    invoke-virtual {v8, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    sget-object v2, Lb2/e;->N:Lb2/k;

    sget-object v13, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v13, v2, v8, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_3

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v8, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_5

    :cond_4
    invoke-static {v6, v8, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v8, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0x50

    int-to-float v6, v6

    int-to-float v4, v4

    mul-float/2addr v6, v4

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x3

    int-to-float v9, v9

    mul-float v12, v9, v4

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    invoke-static {v6, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lx81/d;->a:Lx81/d;

    move/from16 v16, v4

    sget v4, Lx81/d;->b:I

    invoke-virtual {v9, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    move/from16 v19, v4

    invoke-virtual/range {v17 .. v17}, Ly81/i;->a1()J

    move-result-wide v3

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v3, v4, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v13, v2, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move/from16 v18, v12

    move-object/from16 v17, v13

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v8, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v4, v8, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v8, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0xd

    int-to-float v3, v3

    mul-float v3, v3, v16

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v3, v19

    invoke-virtual {v9, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->W0()J

    move-result-wide v12

    invoke-static {v2, v12, v13, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb2/e;->z:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v2, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v8, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v4, v8, v4, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v8, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v0, v18

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const-wide/high16 v12, 0x4004000000000000L    # 2.5

    double-to-float v2, v12

    const/16 v4, 0x8

    int-to-float v12, v4

    mul-float v19, v2, v12

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v13, v19

    invoke-virtual {v9}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/u;->g()I

    move-result v4

    const/4 v6, 0x6

    invoke-static {v4, v8, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v4

    invoke-virtual {v9, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v18

    move-object v6, v9

    const/16 v9, 0x1b0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move/from16 v20, v3

    move-object v3, v4

    const/4 v4, 0x0

    move/from16 v1, v20

    move-wide/from16 v24, v18

    move/from16 v18, v0

    move-object v0, v5

    move-object/from16 v19, v7

    move-object v5, v2

    move-object/from16 v2, v16

    move-object/from16 v16, v11

    move-object v11, v6

    move-wide/from16 v6, v24

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v3

    new-instance v5, Lhy0/h;

    const/4 v6, 0x0

    invoke-direct {v5, v12, v6}, Lhy0/h;-><init>(FLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v14, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v4

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v9

    const/16 v9, 0x180

    const/16 v10, 0x8

    const/4 v7, 0x0

    move-object/from16 v24, v6

    move v6, v1

    move-object/from16 v1, v24

    invoke-static/range {v3 .. v10}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    invoke-static/range {v18 .. v18}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v14, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v13, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    move-object/from16 v5, v17

    const/4 v6, 0x0

    invoke-static {v5, v4, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v8, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    move-object/from16 v0, v19

    goto :goto_8

    :cond_e
    :goto_7
    move-object/from16 v0, v16

    goto :goto_9

    :goto_8
    invoke-static {v5, v8, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x22bd7a85

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, p0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v4, 0x0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v4, 0x1

    if-ltz v4, :cond_f

    check-cast v2, Lir2/a;

    invoke-static/range {p0 .. p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v4, v5, v8, v6}, Lir2/d;->h(Lir2/a;IILandroidx/compose/runtime/Composer;I)V

    move v4, v3

    goto :goto_a

    :cond_f
    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_10
    const/4 v3, 0x1

    const/4 v4, 0x0

    invoke-static {v8, v4, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    invoke-static {v8, v4}, Lir2/d;->j(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_12

    new-instance v1, Lbm0/o;

    const/4 v2, 0x7

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final g(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lir2/d;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lir2/a;IILandroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "rec"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x534a3a07

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v5, 0x4

    const/4 v6, 0x2

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

    move v0, v5

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_3

    :cond_3
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :cond_4
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->e(I)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_4

    :cond_5
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :cond_6
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v7, v8, :cond_7

    move v7, v13

    goto :goto_5

    :cond_7
    move v7, v14

    :goto_5
    and-int/2addr v0, v13

    invoke-virtual {v10, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    sget-object v15, Lb2/t;->w:Lb2/t;

    const/16 v0, 0x8

    if-eqz v2, :cond_8

    const v7, -0x75274824

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    int-to-float v7, v6

    int-to-float v8, v0

    invoke-static {v7, v8, v15, v10, v14}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    goto :goto_6

    :cond_8
    const v7, -0x75265ba5

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_6
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v9, v8, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_b

    :cond_a
    invoke-static {v9, v10, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v6, v6

    int-to-float v0, v0

    mul-float v18, v6, v0

    const/16 v19, 0x0

    const/16 v20, 0xb

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x6

    int-to-float v6, v6

    int-to-float v5, v5

    mul-float/2addr v6, v5

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lir2/a;->a()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v10, v14}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v0, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lir2/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move-object/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move/from16 v23, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move-object/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move-object/from16 v33, v26

    const/16 v26, 0x0

    move/from16 v34, v28

    const/16 v28, 0x0

    move-object/from16 p3, v0

    move-object/from16 v0, v33

    move/from16 v1, v34

    const/4 v4, 0x1

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-static {v10, v4, v0, v1, v10}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    if-eq v3, v2, :cond_c

    const v0, -0x751c1675

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    move-object/from16 v0, p3

    move/from16 v1, v32

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->W0()J

    move-result-wide v6

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v5 .. v12}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const/4 v0, 0x0

    const v1, -0x751aea25

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Leg2/l;

    const/4 v5, 0x6

    move-object/from16 v1, p0

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Leg2/l;-><init>(Ljava/lang/Object;IIII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final i(Lir2/a;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lir2/d;->h(Lir2/a;IILandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x48de1c28    # 454881.25f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v10, v1, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v1, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v1, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-nez v11, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_3

    :cond_2
    invoke-static {v5, v1, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v8, 0x3

    int-to-float v11, v8

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float/2addr v11, v12

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v14, 0x48

    int-to-float v14, v14

    mul-float/2addr v14, v12

    invoke-static {v14, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v14, 0x0

    invoke-static {v14, v14, v11, v11, v8}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v15

    invoke-static {v13, v15}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v15, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move-object/from16 v17, v15

    invoke-virtual/range {v16 .. v16}, Ly81/i;->a1()J

    move-result-wide v14

    sget-object v3, Li2/w0;->a:Li2/v0;

    invoke-static {v13, v14, v15, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lb2/e;->w:Lb2/m;

    invoke-static {v14, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v15

    move-object/from16 v18, v3

    iget-wide v2, v1, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v1, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 v19, v12

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v1, v10, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v3, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v2, v1, v2, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v1, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float v2, v2, v19

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x3e

    int-to-float v3, v3

    mul-float v3, v3, v19

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x3

    const/4 v7, 0x0

    invoke-static {v7, v7, v11, v11, v3}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v3

    invoke-static {v2, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v17

    invoke-virtual {v3, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->a1()J

    move-result-wide v7

    move-object/from16 v3, v18

    invoke-static {v2, v7, v8, v3}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x0

    invoke-static {v14, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v1, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-eqz v11, :cond_7

    invoke-virtual {v1, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v1, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v1, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v7, v1, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v1, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_a
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lhy0/e0;

    const/16 v3, 0xa

    invoke-direct {v2, v0, v3}, Lhy0/e0;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lir2/d;->j(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Lir2/b;ZLandroidx/compose/runtime/Composer;I)V
    .locals 3

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0xa416ca3

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    new-instance v1, Lb30/a1;

    const/16 v2, 0x15

    invoke-direct {v1, p0, v2}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    const v2, 0x7da4be67

    invoke-static {v2, p2, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    or-int/lit8 v0, v0, 0x30

    invoke-static {p1, v1, p2, v0}, Llq2/a;->e(ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lir2/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lir2/c;-><init>(Lir2/b;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final m(Lir2/b;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 36

    move-object/from16 v0, p2

    const-string v1, "$this$BasicAnimationComponent"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v1, 0x4004000000000000L    # 2.5

    double-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v4, v1, v2

    const/4 v1, 0x1

    int-to-float v3, v1

    mul-float v5, v3, v2

    const/4 v7, 0x0

    const/16 v8, 0x8

    sget-object v3, Lb2/t;->w:Lb2/t;

    move v6, v4

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object v6, v0

    check-cast v6, Lp1/q;

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    iget-object v10, v6, Lp1/q;->a:Lhb3/a0;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v10, v6, Lp1/q;->S:Z

    if-eqz v10, :cond_0

    invoke-virtual {v6, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_0
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v0, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-nez v8, :cond_1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_2

    :cond_1
    invoke-static {v7, v6, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v0, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    const-wide/16 v9, 0x0

    cmpl-double v5, v7, v9

    const-string v7, "invalid weight; must be greater than zero"

    if-lez v5, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v11, v4, v8

    if-lez v11, :cond_4

    move v11, v8

    goto :goto_2

    :cond_4
    move v11, v4

    :goto_2
    invoke-direct {v5, v11, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide/high16 v11, 0x4029000000000000L    # 12.5

    double-to-float v11, v11

    mul-float/2addr v11, v2

    const/4 v12, 0x0

    invoke-static {v5, v12, v11, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lir2/b;->g()Ljava/util/List;

    move-result-object v5

    const/4 v11, 0x0

    invoke-static {v5, v0, v11}, Lir2/d;->f(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    float-to-double v13, v4

    cmpl-double v5, v13, v9

    if-lez v5, :cond_5

    goto :goto_3

    :cond_5
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v4, v8

    if-lez v7, :cond_6

    move v4, v8

    :cond_6
    invoke-direct {v5, v4, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const-wide v7, 0x4020800000000000L    # 8.25

    double-to-float v4, v7

    mul-float/2addr v4, v2

    invoke-static {v5, v12, v4, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v0, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-wide/high16 v4, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v4

    mul-float v13, v4, v2

    const/4 v14, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v3

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lir2/b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v0, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v20

    invoke-virtual {v5, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v24, v10, 0x12

    const v25, 0x2fff8

    move v10, v4

    move-object v11, v5

    const-wide/16 v4, 0x0

    move-object v12, v6

    const/4 v6, 0x0

    move v13, v7

    const/4 v7, 0x0

    move-object v0, v3

    move-wide/from16 v34, v8

    move v9, v1

    move-object v1, v2

    move-wide/from16 v2, v34

    const/4 v8, 0x0

    move v15, v9

    move v14, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v18, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v16

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x30

    move-object/from16 v32, v22

    move/from16 v31, v26

    move/from16 v33, v27

    move-object/from16 v30, v29

    move-object/from16 v22, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v22

    invoke-virtual/range {p0 .. p0}, Lir2/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v14, v31

    invoke-static {v1, v0, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v11, v32

    move/from16 v13, v33

    invoke-virtual {v11, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v11, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v2

    const/16 v23, 0x0

    const v25, 0x2fffa

    move-object v0, v1

    const/4 v1, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v15, 0x1

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lir2/b;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lir2/d;->l(Lir2/b;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
