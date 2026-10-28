.class public abstract Lxn2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lxn2/g;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Lxn2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lxn2/g;",
        "d",
        "()Lxn2/g;",
        "buyNowItemPreviewViewState",
        "universal-checkout_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Lxn2/g;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    new-instance v0, Lxn2/g;

    const-string v1, "WHOOP Your Way MG"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "Band: Evergreen, Clasp: Alloy, Hook: Atlas"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "WHOOP Standard Shipping"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v8, 0x10

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-string v6, "783cf38a-8019-42ae-9fb5-42bd57e6b10a"

    const-string v7, "wyw-mg-sku"

    invoke-direct/range {v0 .. v9}, Lxn2/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lxn2/f;->a:Lxn2/g;

    return-void
.end method

.method public static synthetic a(Lxn2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxn2/f;->c(Lxn2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lxn2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 33

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x673066c2

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v10, 0x12

    const/4 v11, 0x1

    if-eq v6, v10, :cond_5

    move v6, v11

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    and-int/2addr v0, v11

    invoke-virtual {v7, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_10

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_6

    move-object v0, v12

    goto :goto_5

    :cond_6
    move-object v0, v5

    :goto_5
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/16 v6, 0x8

    int-to-float v13, v6

    const/16 v6, 0x36

    const/high16 v9, 0x3fc00000    # 1.5f

    invoke-static {v13, v9, v5, v7, v6}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v5

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_7

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v7, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v7, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move/from16 p2, v10

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-nez v10, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    :cond_8
    invoke-static {v6, v7, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v2, v2

    const/high16 v4, 0x41aa0000    # 21.25f

    mul-float/2addr v4, v2

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    invoke-static {v6, v3, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v11, v7, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    move-object/from16 p1, v9

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v8, v9, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, Lb2/e;->E:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v7}, Lp1/q;->i0()V

    move-object/from16 v28, v0

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-eqz v0, :cond_a

    invoke-virtual {v7, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v7, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    move-object/from16 v0, p1

    goto :goto_8

    :cond_c
    move-object/from16 v0, p1

    goto :goto_9

    :goto_8
    invoke-static {v8, v7, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_9
    invoke-static {v7, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v2, v3

    invoke-virtual {v1}, Lxn2/g;->b()Lkd1/o;

    move-result-object v3

    invoke-virtual {v1}, Lxn2/g;->c()Ljava/util/List;

    move-result-object v6

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v8, Lkd1/o;->a:I

    shl-int/lit8 v8, v8, 0x3

    const/16 v9, 0xc06

    or-int/2addr v8, v9

    const/16 v9, 0x8

    move/from16 v16, v2

    sget-object v2, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v17, v5

    move-object v5, v4

    move-object v4, v6

    const/4 v6, 0x0

    move-object/from16 v29, v0

    move/from16 v30, v16

    move-object/from16 v0, v17

    invoke-static/range {v2 .. v9}, Lnn2/a;->b(Ll0/u;Lkd1/o;Ljava/util/List;Landroidx/compose/ui/Modifier;Ly2/k;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float/2addr v13, v3

    const/16 v16, 0x0

    const/16 v17, 0xd

    move-object v3, v14

    move v14, v13

    const/4 v13, 0x0

    move-object v4, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v6, v8, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_d
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v7, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v7, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    move-object/from16 v0, v29

    invoke-static {v8, v7, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v7, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lxn2/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    move/from16 v4, v30

    invoke-virtual {v11, v7, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->Q()Lb91/a;

    move-result-object v22

    invoke-virtual {v11, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v8, Lb91/a;->d:I

    shl-int/lit8 v26, v8, 0x12

    const v27, 0x2fffa

    move v8, v3

    const/4 v3, 0x0

    move-wide v4, v5

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move-object v13, v11

    move v14, v12

    const-wide/16 v11, 0x0

    move-object v15, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v31, v25

    const/16 v25, 0x0

    move-object v2, v0

    move/from16 v0, v29

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lxn2/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v31

    invoke-virtual {v3, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->d1()J

    move-result-wide v4

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move-object/from16 v32, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual/range {p0 .. p0}, Lxn2/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v7, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v13, v32

    invoke-virtual {v13, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v13, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    const/4 v13, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v2, 0x1

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_b

    :cond_10
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v5

    :goto_b
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_11

    new-instance v0, Lwq1/b;

    const/4 v5, 0x4

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final c(Lxn2/g;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lxn2/f;->b(Lxn2/g;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d()Lxn2/g;
    .locals 1

    sget-object v0, Lxn2/f;->a:Lxn2/g;

    return-object v0
.end method
