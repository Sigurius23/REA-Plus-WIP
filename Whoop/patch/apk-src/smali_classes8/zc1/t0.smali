.class public abstract Lzc1/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u000f\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "width",
        "Lhy0/h0;",
        "d",
        "(I)Lhy0/h0;",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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

    invoke-static {p0, p1, p2}, Lzc1/t0;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x7cfdd24a

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x1

    if-eqz v0, :cond_0

    move v1, v7

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x4

    int-to-float v9, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v3, v9, v2

    invoke-static {v3, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, Lb2/e;->N:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v3, v14, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v6, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Centered, SMALL spacing"

    const/4 v3, 0x6

    invoke-static {v1, v4, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    mul-float v13, v1, v2

    const/16 v18, 0xa0

    invoke-static/range {v18 .. v18}, Lzc1/t0;->d(I)Lhy0/h0;

    move-result-object v1

    const/16 v2, 0x64

    invoke-static {v2}, Lzc1/t0;->d(I)Lhy0/h0;

    move-result-object v2

    filled-new-array {v1, v2}, [Lhy0/h0;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    new-instance v2, Ln51/h;

    const/16 v16, 0x11

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v15, 0x0

    move-object v10, v2

    invoke-direct/range {v10 .. v17}, Ln51/h;-><init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Ln51/h;->f:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    move v10, v3

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ln51/g;->i(Landroidx/compose/ui/Modifier;Ln51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v9, v9, v8, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v1, "Staggered entrance (APPEAR_FROM_TOP)"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v15, Ln51/a;

    sget-object v1, Ln51/c;->STAGGERED:Ln51/c;

    sget-object v2, Ln51/b;->APPEAR_FROM_TOP:Ln51/b;

    invoke-direct {v15, v1, v2}, Ln51/a;-><init>(Ln51/c;Ln51/b;)V

    invoke-static/range {v18 .. v18}, Lzc1/t0;->d(I)Lhy0/h0;

    move-result-object v1

    const/16 v2, 0x78

    invoke-static {v2}, Lzc1/t0;->d(I)Lhy0/h0;

    move-result-object v2

    const/16 v3, 0x5a

    invoke-static {v3}, Lzc1/t0;->d(I)Lhy0/h0;

    move-result-object v3

    filled-new-array {v1, v2, v3}, [Lhy0/h0;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v12

    new-instance v2, Ln51/h;

    const/16 v16, 0x1

    move-object v10, v2

    invoke-direct/range {v10 .. v17}, Ln51/h;-><init>(Ljava/lang/String;Ljava/util/List;FLb2/f;Ln51/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Ln51/g;->i(Landroidx/compose/ui/Modifier;Ln51/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/j;

    const/16 v3, 0x1b

    invoke-direct {v2, v0, v3}, Lzc1/j;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/t0;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(I)Lhy0/h0;
    .locals 10

    new-instance v0, Lhy0/h0;

    new-instance v1, Lkd1/o$a;

    sget v2, Lgy0/a;->O4:I

    invoke-direct {v1, v2}, Lkd1/o$a;-><init>(I)V

    sget-object v3, Lhy0/c0;->CENTER:Lhy0/c0;

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    div-int/lit8 p0, p0, 0x3

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    const/16 v8, 0x62

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lhy0/h0;-><init>(Lkd1/o;Ljava/lang/String;Lhy0/c0;Ljava/lang/Integer;Ljava/lang/Integer;Lhy0/g0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
