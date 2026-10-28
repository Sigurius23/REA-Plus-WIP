.class public abstract Llf0/o1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u0014\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\n8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000e\u001a\u00020\r8\nX\u008a\u0084\u0002\u00b2\u0006\u0012\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000f8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lld0/q;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isExpanded",
        "hasMoreItems",
        "Ly3/f;",
        "fadeHeight",
        "",
        "Lm91/u;",
        "itemsToShow",
        "",
        "caretRotation",
        "advanced-labs_release"
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
.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/o1;->h(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lld0/q;)Z
    .locals 0

    invoke-static {p0}, Llf0/o1;->l(Lld0/q;)Z

    move-result p0

    return p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Llf0/o1;->i(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llf0/o1;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lld0/q;Lp1/c1;Lp1/t2;)Ljava/util/List;
    .locals 0

    invoke-static {p0, p1, p2}, Llf0/o1;->o(Lld0/q;Lp1/c1;Lp1/t2;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lld0/q;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x40925d07

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_3

    :cond_7
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v4, v8

    :goto_4
    and-int/lit16 v8, v4, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v13

    :goto_5
    and-int/lit8 v9, v4, 0x1

    invoke-virtual {v10, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_1e

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v15

    :cond_9
    const/16 v0, 0xe

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_a

    new-instance v6, Llc0/g;

    invoke-direct {v6, v0}, Llc0/g;-><init>(I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v16, v6

    goto :goto_6

    :cond_b
    move-object/from16 v16, v7

    :goto_6
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v12, :cond_c

    invoke-virtual {v5}, Lld0/q;->f()Z

    move-result v6

    invoke-static {v6}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-static {v6}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lp1/c1;

    invoke-virtual {v5}, Lld0/q;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-virtual {v5}, Lld0/q;->e()I

    move-result v8

    invoke-virtual {v10, v7}, Lp1/q;->e(I)Z

    move-result v7

    invoke-virtual {v10, v8}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_d

    if-ne v8, v12, :cond_e

    :cond_d
    new-instance v7, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;

    const/16 v8, 0x1a

    invoke-direct {v7, v5, v8}, Lio/getstream/chat/android/ui/feature/messages/composer/attachment/picker/factory/file/internal/b;-><init>(Ljava/lang/Object;I)V

    invoke-static {v7}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lp1/t2;

    invoke-static {v6}, Llf0/o1;->j(Lp1/c1;)Z

    move-result v7

    if-nez v7, :cond_10

    invoke-static {v8}, Llf0/o1;->m(Lp1/t2;)Z

    move-result v7

    if-nez v7, :cond_f

    goto :goto_7

    :cond_f
    const/16 v7, 0xc8

    int-to-float v7, v7

    goto :goto_8

    :cond_10
    :goto_7
    int-to-float v7, v13

    :goto_8
    const/16 v9, 0x12c

    const/4 v11, 0x0

    const/4 v0, 0x6

    move-object/from16 v17, v6

    move v6, v7

    invoke-static {v9, v13, v11, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    move/from16 v18, v9

    move-object v9, v10

    const/16 v10, 0x30

    move-object/from16 v19, v11

    const/16 v11, 0xc

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v14, v17

    move/from16 v1, v18

    move-object/from16 v2, v20

    move/from16 v18, v4

    move-object/from16 v4, v19

    invoke-static/range {v6 .. v11}, Ld0/g;->a(FLd0/l;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v19

    move-object v10, v9

    invoke-virtual {v5}, Lld0/q;->c()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5}, Lld0/q;->e()I

    move-result v7

    invoke-virtual {v10, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v10, v7}, Lp1/q;->e(I)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_11

    if-ne v7, v12, :cond_12

    :cond_11
    new-instance v6, Lim1/a0;

    const/16 v7, 0x15

    invoke-direct {v6, v5, v14, v2, v7}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v6}, Lp1/x;->r(Lc93/a;)Lp1/f0;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v20, v7

    check-cast v20, Lp1/t2;

    invoke-static {v14}, Llf0/o1;->j(Lp1/c1;)Z

    move-result v6

    if-eqz v6, :cond_13

    const/high16 v6, -0x3ccc0000    # -180.0f

    goto :goto_9

    :cond_13
    const/4 v6, 0x0

    :goto_9
    invoke-static {v1, v13, v4, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    const/16 v11, 0x30

    move-object v8, v12

    const/16 v12, 0x1c

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v22, v21

    invoke-static/range {v6 .. v12}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v21

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_14

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_16

    :cond_15
    invoke-static {v9, v10, v9, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v4, 0x12c

    const/4 v6, 0x6

    const/4 v9, 0x0

    invoke-static {v4, v13, v9, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    const/4 v9, 0x2

    invoke-static {v15, v4, v9}, Landroidx/compose/animation/c;->a(Landroidx/compose/ui/Modifier;Ld0/e2;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static/range {v19 .. v19}, Llf0/o1;->n(Lp1/t2;)F

    move-result v9

    invoke-static {v4, v9}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x14

    int-to-float v9, v9

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    invoke-static {v9, v8, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 v23, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_17

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v0, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    invoke-static {v6, v10, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v10, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x370bf64e

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-static/range {v20 .. v20}, Llf0/o1;->p(Lp1/t2;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_c
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lm91/u;

    invoke-static {}, Lmd0/c;->B0()Lm91/p;

    move-result-object v7

    sget v1, Lm91/p;->b:I

    shl-int/lit8 v1, v1, 0x3

    shl-int/lit8 v4, v18, 0x3

    and-int/lit16 v4, v4, 0x1c00

    or-int v11, v1, v4

    const/4 v12, 0x4

    const/4 v8, 0x0

    move-object/from16 v9, v16

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_c

    :cond_1a
    move-object/from16 v1, v16

    const/4 v4, 0x0

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-static {v2}, Llf0/o1;->m(Lp1/t2;)Z

    move-result v2

    if-eqz v2, :cond_1d

    const v2, -0x63a95a78

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/4 v9, 0x2

    int-to-float v2, v9

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v17, v2, v6

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v23 .. v23}, Llf0/o1;->j(Lp1/c1;)Z

    move-result v6

    if-eqz v6, :cond_1b

    invoke-virtual {v5}, Lld0/q;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    :goto_d
    move-object/from16 v17, v6

    goto :goto_e

    :cond_1b
    invoke-virtual {v5}, Lld0/q;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    goto :goto_d

    :goto_e
    sget-object v6, Lg1/v0;->a:Ll0/l1;

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->W0()J

    move-result-wide v8

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->X0()J

    move-result-wide v13

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->W0()J

    move-result-wide v18

    move-object v7, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 p3, v1

    move-object v1, v7

    move-object/from16 v0, v23

    move-wide/from16 v24, v18

    move-object/from16 v18, v2

    move v2, v4

    move-object v4, v6

    move-wide v6, v8

    move-wide v8, v11

    move-wide v12, v13

    move-object v14, v10

    move-wide/from16 v10, v24

    invoke-static/range {v6 .. v16}, Lg1/v0;->a(JJJJLandroidx/compose/runtime/Composer;II)Lg1/m1;

    move-result-object v10

    move-object v9, v14

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/w;->g()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static/range {v21 .. v21}, Llf0/o1;->q(Lp1/t2;)F

    move-result v4

    invoke-static {v4, v1}, Landroidx/room/c1;->L(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v8, v22

    if-ne v1, v8, :cond_1c

    new-instance v1, Ljt1/b;

    const/16 v4, 0xe

    invoke-direct {v1, v4, v0}, Ljt1/b;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v16, v1

    check-cast v16, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v6, 0x6

    shl-int/2addr v0, v6

    const v1, 0x30006

    or-int/2addr v0, v1

    const/16 v19, 0x6

    const/16 v20, 0x30a

    const/4 v7, 0x0

    move-object v14, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v8, v17

    move-object/from16 v17, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v6, v18

    move/from16 v18, v0

    invoke-static/range {v6 .. v20}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v17

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    :goto_f
    const/4 v0, 0x1

    goto :goto_10

    :cond_1d
    move-object/from16 p3, v1

    move v2, v4

    const v0, -0x639daa9b

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v6, p3

    :goto_11
    move-object v4, v3

    goto :goto_12

    :cond_1e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v6, v7

    goto :goto_11

    :goto_12
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Ll72/h;

    const/16 v3, 0x11

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ll72/h;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lp1/c1;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Llf0/o1;->j(Lp1/c1;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    invoke-static {p0, v0}, Llf0/o1;->k(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Llf0/o1;->f(Landroidx/compose/ui/Modifier;Lld0/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;)Z
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

.method private static final k(Lp1/c1;Z)V
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

.method private static final l(Lld0/q;)Z
    .locals 1

    invoke-virtual {p0}, Lld0/q;->c()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p0}, Lld0/q;->e()I

    move-result p0

    if-le v0, p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final m(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
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

.method private static final n(Lp1/t2;)F
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

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    return p0
.end method

.method private static final o(Lld0/q;Lp1/c1;Lp1/t2;)Ljava/util/List;
    .locals 0

    invoke-static {p1}, Llf0/o1;->j(Lp1/c1;)Z

    move-result p1

    if-nez p1, :cond_1

    invoke-static {p2}, Llf0/o1;->m(Lp1/t2;)Z

    move-result p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lld0/q;->c()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-virtual {p0}, Lld0/q;->e()I

    move-result p0

    invoke-static {p1, p0}, Lm83/s;->w1(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    :goto_0
    invoke-virtual {p0}, Lld0/q;->c()Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Lp1/t2;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final q(Lp1/t2;)F
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
