.class public abstract Lcz0/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcz0/p;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v5, p0

    check-cast v5, Lp1/q;

    const v1, -0x7b4bf3b1

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz p1, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v7

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_13

    new-instance v2, Lh2/c;

    const/4 v9, 0x0

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-direct {v2, v9, v9, v10, v10}, Lh2/c;-><init>(FFFF)V

    new-instance v1, Lh2/c;

    const v3, 0x3f666666    # 0.9f

    invoke-direct {v1, v9, v9, v10, v3}, Lh2/c;-><init>(FFFF)V

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->g:Ll0/h;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v4, v6, v5, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_1

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v5, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v5, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v6, v5, v6, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v11, v7, v3}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/t1;->a:Ll0/t1;

    invoke-virtual {v6, v4, v8, v10}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v7, v5, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v5, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v5}, Lp1/q;->i0()V

    move-object/from16 v17, v1

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-eqz v1, :cond_4

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v5, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_5

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    :cond_5
    invoke-static {v7, v5, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v5, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v1, v7, :cond_7

    sget-object v1, Lcz0/p$a;->w:Lcz0/p$a;

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v21

    new-instance v18, Le71/b;

    const/16 v19, 0x0

    const v20, 0x3ea8f5c3    # 0.33f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x79

    const/16 v27, 0x0

    invoke-direct/range {v18 .. v27}, Le71/b;-><init>(FFLi91/a;FFLa71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v18

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v7, :cond_8

    sget-object v3, Lcz0/p$b;->w:Lcz0/p$b;

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v21

    new-instance v18, Le71/b;

    const/high16 v19, 0x3f000000    # 0.5f

    const/high16 v20, 0x3e800000    # 0.25f

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x78

    const/16 v27, 0x0

    invoke-direct/range {v18 .. v27}, Le71/b;-><init>(FFLi91/a;FFLa71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v18

    filled-new-array {v1, v3}, [Le71/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    new-instance v18, Le71/a;

    const/16 v28, 0x1f1

    const/16 v29, 0x0

    const/16 v19, 0x0

    const/high16 v21, 0x3f000000    # 0.5f

    const v22, 0x3dcccccd    # 0.1f

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-direct/range {v18 .. v29}, Le71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FFLjava/lang/Float;Lu61/d;Lu61/d;La71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v21, Lcz0/s$b;

    const-string v22, "bar1"

    const/high16 v23, 0x3f000000    # 0.5f

    const/16 v26, 0x8

    const/16 v27, 0x0

    move-object/from16 v24, v18

    invoke-direct/range {v21 .. v27}, Lcz0/s$b;-><init>(Ljava/lang/String;FLe71/a;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v21 .. v21}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    move-object v1, v6

    const/16 v6, 0x1b6

    const/high16 v3, 0x3f000000    # 0.5f

    move-object/from16 v30, v1

    move-object/from16 v1, v17

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-static/range {v1 .. v6}, Lcz0/o;->j(Lh2/c;Lh2/c;FLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-static {v11, v4, v8}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v0, v30

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v6, v3, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    move-object v4, v2

    iget-wide v1, v5, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v5, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v1, v5, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v5, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_c

    sget-object v1, Lcz0/p$c;->w:Lcz0/p$c;

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v24

    new-instance v18, La71/a;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0xfdf

    const/16 v32, 0x0

    invoke-direct/range {v18 .. v32}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v18 .. v18}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v2, Lcz0/s$c;

    const-string v3, "line1"

    const v6, 0x3f733333    # 0.95f

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct {v2, v3, v8, v6, v1}, Lcz0/s$c;-><init>(Ljava/lang/String;FFLjava/util/List;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_d

    sget-object v1, Lcz0/p$d;->w:Lcz0/p$d;

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v24

    new-instance v18, La71/a;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0xfdf

    const/16 v32, 0x0

    invoke-direct/range {v18 .. v32}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v18 .. v18}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v3, Lcz0/s$c;

    const-string v6, "line2"

    const v8, 0x3ea8f5c3    # 0.33f

    move-object/from16 v18, v4

    const/high16 v4, 0x3f000000    # 0.5f

    invoke-direct {v3, v6, v4, v8, v1}, Lcz0/s$c;-><init>(Ljava/lang/String;FFLjava/util/List;)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v7, :cond_e

    sget-object v1, Lcz0/p$e;->w:Lcz0/p$e;

    invoke-virtual {v5, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v25

    new-instance v19, La71/a;

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0xfdf

    const/16 v33, 0x0

    invoke-direct/range {v19 .. v33}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v19 .. v19}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    new-instance v4, Lcz0/s$c;

    const-string v6, "line3"

    move-object/from16 v16, v5

    const/4 v5, 0x0

    const/high16 v8, 0x3f000000    # 0.5f

    invoke-direct {v4, v6, v8, v5, v1}, Lcz0/s$c;-><init>(Ljava/lang/String;FFLjava/util/List;)V

    filled-new-array {v2, v3, v4}, [Lcz0/s$c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v6, 0x1b6

    const/high16 v3, 0x3f000000    # 0.5f

    move-object/from16 v5, v16

    move-object/from16 v1, v17

    move-object/from16 v2, v18

    invoke-static/range {v1 .. v6}, Lcz0/o;->j(Lh2/c;Lh2/c;FLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-static {v11, v4, v8}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-virtual {v0, v6, v3, v8}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v5, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v8, v5, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v5, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v4, v5, v4, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v5, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v22, Lj71/a;->TWO_DOTS:Lj71/a;

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v7, :cond_12

    sget-object v0, Lcz0/p$f;->w:Lcz0/p$f;

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v29

    new-instance v23, La71/a;

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0xfdf

    const/16 v37, 0x0

    invoke-direct/range {v23 .. v37}, La71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Float;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ljava/lang/String;ZLhy0/h1;La71/c;Ljava/util/List;Lc41/p2;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v23 .. v23}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v23

    new-instance v17, Lcz0/s$a;

    const v20, 0x3f07ae14    # 0.53f

    const/high16 v21, 0x3f000000    # 0.5f

    const-string v18, "band1"

    const/high16 v19, 0x3f000000    # 0.5f

    invoke-direct/range {v17 .. v23}, Lcz0/s$a;-><init>(Ljava/lang/String;FFFLj71/a;Ljava/util/List;)V

    invoke-static/range {v17 .. v17}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    const/16 v6, 0x1b6

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static/range {v1 .. v6}, Lcz0/o;->j(Lh2/c;Lh2/c;FLjava/util/List;Landroidx/compose/runtime/Composer;I)V

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_13
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lcom/whoop/profile/view/edit/preview/a;

    const/4 v2, 0x7

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lcom/whoop/profile/view/edit/preview/a;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lcz0/p;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
