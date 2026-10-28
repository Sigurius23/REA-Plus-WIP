.class public abstract Lzc1/b4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Lm91/o;",
        "d",
        "(Landroidx/compose/runtime/Composer;I)Lm91/o;",
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

    invoke-static {p0, p1, p2}, Lzc1/b4;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 33

    move/from16 v0, p1

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, 0x973fdfc

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eqz v0, :cond_0

    move v1, v8

    goto :goto_0

    :cond_0
    move v1, v7

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v6, 0x6

    invoke-static {v1, v5, v4, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

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

    invoke-static {v4, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v4, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, Lgz0/m0;->TINY_INFORMATION:Lgz0/m0;

    const-string v1, "This impact is significantly different than the WHOOP Average. Note that impacts can sometimes be affected by other correlated factors that you don\u2019t track."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_4

    sget-object v1, Lzc1/b4$a;->w:Lzc1/b4$a;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    sget-object v1, Lzc1/b4$b;->w:Lzc1/b4$b;

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    new-instance v9, Lc41/p2;

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const v30, 0xffeae

    const/16 v31, 0x0

    invoke-direct/range {v9 .. v31}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lc41/p2;->v:I

    shl-int/lit8 v1, v1, 0x3

    or-int/lit8 v5, v1, 0x6

    const/4 v6, 0x4

    move-object v1, v3

    const/4 v3, 0x0

    move-object/from16 v32, v9

    move-object v9, v1

    move-object v1, v2

    move-object/from16 v2, v32

    invoke-static/range {v1 .. v6}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v2, "Items aligned to text (default)."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_6

    sget-object v2, Lzc1/b4$c;->w:Lzc1/b4$c;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_7

    sget-object v2, Lzc1/b4$d;->w:Lzc1/b4$d;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    sget-object v28, Lc41/o2;->TEXT:Lc41/o2;

    invoke-static {v4, v7}, Lzc1/b4;->d(Landroidx/compose/runtime/Composer;I)Lm91/o;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    new-instance v2, Lc41/p2;

    const v30, 0x9feae

    const/16 v31, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object/from16 v32, v9

    move-object v9, v2

    move-object/from16 v2, v32

    invoke-direct/range {v9 .. v31}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x4

    move-object/from16 v32, v9

    move-object v9, v2

    move-object/from16 v2, v32

    invoke-static/range {v1 .. v6}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v2, "Items aligned to the leading edge."

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_8

    sget-object v2, Lzc1/b4$e;->w:Lzc1/b4$e;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v16

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_9

    sget-object v2, Lzc1/b4$f;->w:Lzc1/b4$f;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    sget-object v28, Lc41/o2;->LEADING:Lc41/o2;

    invoke-static {v4, v7}, Lzc1/b4;->d(Landroidx/compose/runtime/Composer;I)Lm91/o;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v27

    new-instance v2, Lc41/p2;

    const v30, 0x9feae

    const/16 v31, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v29, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v31}, Lc41/p2;-><init>(Lgz0/m0;FLc41/n2;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lb91/c;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Ly81/e;Lrz0/f;Ly81/e;ZLjava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Lc41/o2;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x4

    invoke-static/range {v1 .. v6}, Lc41/r2;->f(Landroidx/compose/ui/Modifier;Lc41/p2;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_b

    new-instance v2, Lzc1/s3;

    const/16 v3, 0x9

    invoke-direct {v2, v0, v3}, Lzc1/s3;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/b4;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Landroidx/compose/runtime/Composer;I)Lm91/o;
    .locals 20

    new-instance v0, Lm91/o;

    new-instance v1, Lny0/p0;

    const-string v2, "GET READY"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lcom/whoop/navigation/e;

    const/4 v7, 0x7

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v3 .. v8}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Ly71/g;

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-static {v4}, Lih0/d0;->E(Lx81/d;)I

    move-result v4

    const/4 v7, 0x2

    invoke-direct {v5, v4, v6, v7, v6}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v16, 0x3fb4

    const/16 v17, 0x0

    const/4 v4, 0x0

    move-object v8, v6

    move v9, v7

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move v11, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    invoke-direct/range {v1 .. v17}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-direct {v0, v1, v14, v15, v14}, Lm91/o;-><init>(Lm91/u;Lcom/whoop/analytics/AnalyticEventModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
