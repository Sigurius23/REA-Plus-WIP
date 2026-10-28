.class public abstract Luz1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\" \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00020\n8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Luz1/r;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "a",
        "Ljava/util/List;",
        "getShopBannerSamples",
        "()Ljava/util/List;",
        "shopBannerSamples",
        "native-store_release"
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Luz1/r;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 14

    new-instance v0, Luz1/r;

    new-instance v4, Lkd1/o$a;

    sget v1, Lgy0/a;->j2:I

    invoke-direct {v4, v1}, Lkd1/o$a;-><init>(I)V

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    const/16 v8, 0x50

    const/4 v9, 0x0

    const-string v1, "The Navigator band: rugged by design."

    const-string v2, "Engineered for durability and built to go the distance."

    const-string v3, "Shop Now"

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Luz1/r;

    new-instance v5, Lkd1/o$a;

    sget v2, Lgy0/a;->j2:I

    invoke-direct {v5, v2}, Lkd1/o$a;-><init>(I)V

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    const/16 v9, 0x52

    const/4 v10, 0x0

    const-string v2, "Tee off with SuperKnit bands"

    const/4 v3, 0x0

    const-string v4, "Shop Now"

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Luz1/r;

    new-instance v6, Lkd1/o$a;

    sget v3, Lgy0/a;->j2:I

    invoke-direct {v6, v3}, Lkd1/o$a;-><init>(I)V

    const/4 v3, 0x2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    const/16 v10, 0x54

    const/4 v11, 0x0

    const-string v3, "SportFlex"

    const-string v4, "Designed with silicone to enhance performance without ever getting in the way."

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v2 .. v11}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Luz1/r;

    const/16 v11, 0x76

    const/4 v12, 0x0

    const-string v4, "Project Terrain is here."

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v12}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Luz1/r;

    const/16 v12, 0x70

    const/4 v13, 0x0

    const-string v5, "A title is limited to two lines, if longer it will truncate. Vivamus sagittis lacus. This text shouldn\'t be visible."

    const-string v6, "A description is limited to three lines, if longer it will truncate with an ellipsis. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. Vivamus sagittis lacus vel augue laoreet rutrum faucibus dolor auctor. This text shouldn\'t be visible."

    const-string v7, "CTA Button"

    const/4 v11, 0x0

    invoke-direct/range {v4 .. v13}, Luz1/r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkd1/o;Lcom/whoop/navigation/e;Ljava/lang/Integer;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Luz1/r;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Luz1/q;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luz1/q;->f(Lmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Luz1/q;->g(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Luz1/r;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Luz1/q;->e(Lkotlin/jvm/functions/Function1;Luz1/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Luz1/r;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x3a6e8b52

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_5

    and-int/lit8 v7, v4, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    move v7, v8

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v4, 0x180

    const/16 v9, 0x100

    if-nez v7, :cond_7

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v9

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v7, v6, 0x93

    const/16 v11, 0x92

    const/4 v15, 0x0

    if-eq v7, v11, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v15

    :goto_5
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v10, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v11

    goto :goto_6

    :cond_9
    move-object v0, v5

    :goto_6
    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v1, v1

    const/high16 v7, 0x422a0000    # 42.5f

    mul-float/2addr v7, v1

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v7, 0x3

    int-to-float v7, v7

    mul-float v14, v7, v1

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v5, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    and-int/lit16 v5, v6, 0x380

    if-ne v5, v9, :cond_a

    const/4 v5, 0x1

    goto :goto_7

    :cond_a
    move v5, v15

    :goto_7
    and-int/lit8 v7, v6, 0x70

    if-eq v7, v8, :cond_c

    and-int/lit8 v6, v6, 0x40

    if-eqz v6, :cond_b

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_b

    goto :goto_8

    :cond_b
    move v6, v15

    goto :goto_9

    :cond_c
    :goto_8
    const/4 v6, 0x1

    :goto_9
    or-int/2addr v5, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_d

    if-ne v6, v7, :cond_e

    :cond_d
    new-instance v6, Lui0/q;

    const/4 v5, 0x4

    invoke-direct {v6, v5, v3, v2}, Lui0/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object/from16 v20, v6

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v8, v10, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move-object/from16 v31, v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_b

    :cond_10
    move-object/from16 v31, v0

    :goto_b
    invoke-static {v8, v10, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Luz1/r;->b()Lkd1/o;

    move-result-object v5

    sget-object v15, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-nez v5, :cond_12

    const v5, -0x6dc49651

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move/from16 v34, v1

    move-object/from16 v32, v6

    move-object/from16 v33, v9

    move-object v3, v11

    move-object v2, v12

    move-object v1, v13

    const/4 v4, 0x1

    goto :goto_c

    :cond_12
    const v8, -0x6dc49650

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_13

    new-instance v8, Luk2/a;

    const/16 v7, 0x16

    invoke-direct {v8, v7}, Luk2/a;-><init>(I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v7, v8

    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v8, Lkd1/o;->a:I

    or-int/lit16 v8, v8, 0x180

    move-object/from16 v27, v10

    const/4 v10, 0x1

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v33, v9

    move-object/from16 v32, v17

    move v9, v8

    move-object/from16 v8, v27

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    invoke-virtual {v15, v11}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v14}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v6, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x6030

    const/16 v14, 0x68

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move/from16 v34, v1

    move-object v2, v12

    move-object/from16 v1, v17

    move-object/from16 v3, v18

    move-object/from16 v12, v27

    const/4 v4, 0x1

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v15, v3}, Landroidx/compose/foundation/layout/b;->b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Li2/t;->b:Li2/s;

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->o()J

    move-result-wide v11

    const v9, 0x3e4ccccd    # 0.2f

    invoke-static {v9, v11, v12}, Li2/x;->c(FJ)J

    move-result-wide v11

    new-instance v9, Li2/x;

    invoke-direct {v9, v11, v12}, Li2/x;-><init>(J)V

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->o()J

    move-result-wide v11

    new-instance v13, Li2/x;

    invoke-direct {v13, v11, v12}, Li2/x;-><init>(J)V

    filled-new-array {v9, v13}, [Li2/x;

    move-result-object v9

    invoke-static {v9}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const/16 v11, 0xe

    const/4 v12, 0x0

    invoke-static {v6, v9, v12, v12, v11}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v11, 0x6

    invoke-static {v5, v6, v9, v12, v11}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x0

    invoke-static {v5, v10, v6}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    sget-object v5, Lb2/e;->G:Lb2/m;

    invoke-virtual {v15, v3, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x8

    int-to-float v6, v6

    const/high16 v9, 0x3fc00000    # 1.5f

    mul-float/2addr v9, v6

    const/high16 v11, 0x3f000000    # 0.5f

    mul-float/2addr v11, v6

    invoke-static {v5, v9, v9, v9, v11}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x0

    invoke-static {v9, v11, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_14

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v10, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v32

    invoke-static {v10, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-nez v14, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_16

    :cond_15
    move-object/from16 v14, v33

    goto :goto_e

    :cond_16
    move-object/from16 v14, v33

    goto :goto_f

    :goto_e
    invoke-static {v11, v10, v11, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_f
    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Luz1/r;->h()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v7, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->q()Lb91/a;

    move-result-object v25

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v15

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v11, v11, 0x12

    or-int/lit16 v12, v11, 0xc30

    const v30, 0x2d7fa

    move/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v32, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move/from16 v29, v11

    const/4 v11, 0x0

    move/from16 v18, v29

    move/from16 v29, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v8

    move-object/from16 v33, v14

    move-wide/from16 v41, v15

    move-object/from16 v16, v7

    move-wide/from16 v7, v41

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v26, v20

    const/16 v20, 0x2

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v35, v22

    const/16 v22, 0x2

    move/from16 v36, v23

    const/16 v23, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move/from16 v38, v26

    const/16 v26, 0x0

    move-object/from16 v39, v28

    const/16 v28, 0x0

    move-object/from16 p3, v0

    move-object/from16 v37, v1

    move-object/from16 v40, v33

    move-object/from16 v0, v39

    const/4 v1, 0x0

    move-object/from16 v33, v2

    move/from16 v2, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    int-to-float v5, v4

    mul-float v5, v5, v35

    invoke-static {v3, v1, v5, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v7, v5

    invoke-virtual/range {p1 .. p1}, Luz1/r;->g()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    const/16 v28, 0x30

    const v30, 0x2d7f8

    move v11, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x2

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x3

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v0, v35

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-static {v3, v1, v0, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->K:Lb2/l;

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    const/16 v6, 0x36

    invoke-static {v0, v5, v10, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_17

    move-object/from16 v8, v37

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_10
    move-object/from16 v7, v33

    goto :goto_11

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_10

    :goto_11
    invoke-static {v10, v7, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v32

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v14, v40

    goto :goto_13

    :cond_19
    :goto_12
    move-object/from16 v0, p3

    goto :goto_14

    :goto_13
    invoke-static {v5, v10, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_12

    :goto_14
    invoke-static {v10, v0, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Luz1/r;->c()Ljava/lang/String;

    move-result-object v5

    move-object/from16 v0, v39

    invoke-virtual {v0, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a()J

    move-result-wide v7

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move/from16 v29, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    sget-object v1, Lgz0/m0;->TINY_ARROW_FWD:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v5, 0x0

    invoke-static {v1, v10, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v5

    invoke-virtual {v0, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a()J

    move-result-wide v8

    const/high16 v0, 0x40600000    # 3.5f

    mul-float v1, v34, v0

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v12}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-static {v10, v4, v4, v4}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v31

    goto :goto_15

    :cond_1a
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    :goto_15
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lt01/e;

    const/16 v6, 0x19

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Luz1/r;)Ll83/a0;
    .locals 3

    new-instance v0, Ltz1/h;

    invoke-virtual {p1}, Luz1/r;->e()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {p1}, Luz1/r;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Luz1/r;->f()Ljava/lang/Integer;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Ltz1/h;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lmh/h;)Ll83/a0;
    .locals 3

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lph/a;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v2}, Lph/a;-><init>(II)V

    iput-object v0, p0, Lmh/h;->j:Lph/e;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Luz1/q;->d(Landroidx/compose/ui/Modifier;Luz1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
