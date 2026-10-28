.class public abstract Lzc1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "f",
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
.method public static synthetic a(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/f;->i(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/f;->h(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/f;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/f;->g(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/f;->j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 46

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0xfb5153c

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_c

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v1, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v7, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v7, v8

    invoke-static {v7, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v8, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v1, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v1, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v11, v1, Lp1/q;->S:Z

    if-eqz v11, :cond_1

    invoke-virtual {v1, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v1, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v1, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v8, v1, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v1, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "Empty Pill - Button Type"

    const/4 v7, 0x6

    invoke-static {v5, v1, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x2

    int-to-float v8, v5

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v1, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v10, Lc41/j;

    invoke-direct {v10}, Lc41/j;-><init>()V

    new-instance v11, Lc41/w;

    const-string v28, "TITLE"

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Lc41/o;

    new-instance v12, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v15

    invoke-virtual {v15}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v15

    invoke-virtual {v15}, Lgz0/c0;->j()I

    move-result v15

    invoke-direct {v12, v15}, Lkd1/o$a;-><init>(I)V

    const/16 v20, 0x1a

    const/16 v21, 0x0

    const/4 v15, 0x1

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v12

    invoke-direct/range {v14 .. v21}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v15, Lc41/x$a;

    const-string v12, "PROCESS"

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v16

    sget-object v18, Lc41/i;->PROCESS_NOW:Lc41/i;

    const/16 v21, 0x18

    const/16 v22, 0x0

    const-string v17, "PROCESS Pressed"

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v22}, Lc41/x$a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Object;Lc41/i;ZLi91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v34, Lcom/whoop/navigation/ActivityDetailType;->SLEEP:Lcom/whoop/navigation/ActivityDetailType;

    const/16 v26, 0x3fe1

    const/16 v27, 0x0

    const/4 v12, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    move-object/from16 v16, v34

    invoke-direct/range {v11 .. v27}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_4

    if-ne v13, v14, :cond_5

    :cond_4
    new-instance v13, Lh32/b;

    const/4 v12, 0x5

    invoke-direct {v13, v4, v12}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v12, Lc41/w;->o:I

    sget v15, Lc41/j;->a:I

    shl-int/2addr v15, v7

    or-int/2addr v12, v15

    invoke-virtual {v10, v11, v13, v1, v12}, Lc41/j;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    mul-float/2addr v9, v9

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v1, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v10, "Empty Pill - Text Type"

    invoke-static {v10, v1, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v1, v10}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v10, Lc41/j;

    invoke-direct {v10}, Lc41/j;-><init>()V

    new-instance v29, Lc41/w;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    new-instance v15, Lc41/o;

    new-instance v11, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v13

    invoke-direct {v11, v13}, Lkd1/o$a;-><init>(I)V

    const/16 v21, 0x1a

    const/16 v22, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v11

    invoke-direct/range {v15 .. v22}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lc41/x$b;

    const-string v13, "Pending"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    const/4 v3, 0x0

    invoke-direct {v11, v13, v2, v5, v3}, Lc41/x$b;-><init>(Lcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v44, 0x3fe1

    const/16 v45, 0x0

    const/16 v30, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v33, v11

    move-object/from16 v32, v15

    invoke-direct/range {v29 .. v45}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v29

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_6

    if-ne v5, v14, :cond_7

    :cond_6
    new-instance v5, Lh32/b;

    const/4 v3, 0x6

    invoke-direct {v5, v4, v3}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v10, v2, v5, v1, v12}, Lc41/j;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Icon + Text"

    invoke-static {v2, v1, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/j;

    invoke-direct {v2}, Lc41/j;-><init>()V

    new-instance v29, Lc41/w;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    new-instance v15, Lc41/o;

    sget-object v17, Ly81/f;->STRAIN:Ly81/f;

    new-instance v3, Lkd1/o$a;

    invoke-static {}, Lc13/a;->a()I

    move-result v5

    invoke-direct {v3, v5}, Lkd1/o$a;-><init>(I)V

    const-string v5, "12.1"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const/16 v21, 0x11

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v20, 0x0

    move-object/from16 v18, v3

    invoke-direct/range {v15 .. v22}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    new-instance v5, Lc41/x$c;

    const-string v10, "8:00am"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    const-string v11, "9:00am"

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-direct {v5, v10, v11, v3}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    const/16 v44, 0x3fe1

    const/16 v45, 0x0

    const/16 v30, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v33, v5

    move-object/from16 v32, v15

    invoke-direct/range {v29 .. v45}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v29

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_8

    if-ne v10, v14, :cond_9

    :cond_8
    new-instance v10, Lh32/b;

    const/4 v5, 0x7

    invoke-direct {v10, v4, v5}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v3, v10, v1, v12}, Lc41/j;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v2, "Icon + Icon"

    invoke-static {v2, v1, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v8, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v2, Lc41/j;

    invoke-direct {v2}, Lc41/j;-><init>()V

    new-instance v29, Lc41/w;

    invoke-static/range {v28 .. v28}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v31

    new-instance v15, Lc41/o;

    sget-object v17, Ly81/f;->SLEEP:Ly81/f;

    new-instance v3, Lkd1/o$a;

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/o0;->l()Lgz0/c0;

    move-result-object v5

    invoke-virtual {v5}, Lgz0/c0;->i()I

    move-result v5

    invoke-direct {v3, v5}, Lkd1/o$a;-><init>(I)V

    sget-object v20, Lgz0/m0;->NO_INTERNET:Lgz0/m0;

    const/16 v21, 0x9

    const/16 v22, 0x0

    const/16 v16, 0x0

    const/16 v19, 0x0

    move-object/from16 v18, v3

    invoke-direct/range {v15 .. v22}, Lc41/o;-><init>(ZLy81/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lgz0/m0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    new-instance v5, Lc41/x$c;

    const-string v7, "Start"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const-string v8, "End"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v5, v7, v8, v3}, Lc41/x$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)V

    const/16 v44, 0x3fe1

    const/16 v45, 0x0

    const/16 v30, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    move-object/from16 v33, v5

    move-object/from16 v32, v15

    invoke-direct/range {v29 .. v45}, Lc41/w;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lc41/o;Lc41/x;Lcom/whoop/navigation/ActivityDetailType;Lcom/whoop/service/network/model/cycles/Period;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/service/network/model/cycles/Activity;Lc41/n1;ZLc41/g2;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v29

    invoke-virtual {v1, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_a

    if-ne v7, v14, :cond_b

    :cond_a
    new-instance v7, Lh32/b;

    const/16 v5, 0x8

    invoke-direct {v7, v4, v5}, Lh32/b;-><init>(Landroid/content/Context;I)V

    invoke-virtual {v1, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v2, v3, v7, v1, v12}, Lc41/j;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-static {v6, v9, v1, v2}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_2

    :cond_c
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v2, Lv41/c;

    const/16 v3, 0x1b

    invoke-direct {v2, v0, v3}, Lv41/c;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final g(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc41/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc41/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc41/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroid/content/Context;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lc41/h;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/f;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
