.class public abstract Lzc1/i4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "Li41/d;",
        "a",
        "Li41/d;",
        "viewState",
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


# static fields
.field private static final a:Li41/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Li41/d;

    new-instance v1, Li41/c;

    sget-object v2, Li41/b;->NORMAL:Li41/b;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    sget-object v4, Lzc1/i4$d;->w:Lzc1/i4$d;

    invoke-static {v4}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v4

    invoke-direct {v1, v2, v3, v4}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    new-instance v2, Li41/c;

    sget-object v3, Li41/b;->ELEVATED:Li41/b;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v5, Lzc1/i4$e;->w:Lzc1/i4$e;

    invoke-static {v5}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v5

    invoke-direct {v2, v3, v4, v5}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    new-instance v3, Li41/c;

    sget-object v5, Li41/b;->HIGH:Li41/b;

    sget-object v6, Lzc1/i4$f;->w:Lzc1/i4$f;

    invoke-static {v6}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v6

    invoke-direct {v3, v5, v4, v6}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    filled-new-array {v1, v2, v3}, [Li41/c;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Li41/d;-><init>(Ljava/util/List;)V

    sput-object v0, Lzc1/i4;->a:Li41/d;

    return-void
.end method

.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/i4;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 71

    move-object/from16 v4, p0

    check-cast v4, Lp1/q;

    const v1, -0x2e9f22e4

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {v4, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_1f

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v5, v4, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v4, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    :cond_2
    invoke-static {v3, v4, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v4, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Key Metric Tile"

    const/4 v14, 0x6

    invoke-static {v1, v4, v14}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x4

    int-to-float v15, v1

    invoke-static {v15, v15, v8, v4}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v1, "Percent \t | \t Suffix"

    invoke-static {v1, v4, v14}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Default"

    invoke-static {v1, v4, v14}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll0/m;->g:Ll0/h;

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-static {v1, v2, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_4

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v4, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_6

    :cond_5
    invoke-static {v5, v4, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v4, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v16, Lc41/w2;

    sget-object v20, Lc41/y2$b;->a:Lc41/y2$b;

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/k0;->g()I

    move-result v3

    const-string v14, "TITLE"

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    const-string v34, "55"

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    const/16 v31, 0x3eb3

    const/16 v32, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v19, v20

    move/from16 v20, v3

    invoke-direct/range {v16 .. v32}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v20, v19

    sget v5, Lc41/w2;->o:I

    const/4 v6, 0x6

    move-object v3, v2

    const/4 v2, 0x0

    move-object/from16 v17, v3

    const/4 v3, 0x0

    move-object/from16 v35, v7

    move-object v7, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v14

    move-object/from16 v14, v17

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float/2addr v15, v1

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/w2;

    new-instance v2, Lc41/y2$c;

    const-string v53, "suffix"

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v3}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v40

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v43

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v45

    const/16 v51, 0x3eb3

    const/16 v52, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v44, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    move-object/from16 v36, v1

    move-object/from16 v39, v2

    invoke-direct/range {v36 .. v52}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v1, "Positive Trend"

    const/4 v2, 0x6

    invoke-static {v1, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v4}, Lp1/q;->i0()V

    move/from16 v36, v5

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-eqz v5, :cond_7

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v4, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v2, v4, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v4, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v1, Lc41/x2;

    sget-object v2, Lhy0/b2;->POSITIVE:Lhy0/b2;

    const-string v37, "this is a positive trend"

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3e93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v1

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    const/4 v3, 0x0

    const/4 v6, 0x6

    move-object v5, v2

    const/4 v2, 0x0

    move-object v0, v5

    move/from16 v5, v36

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/y2$c;

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v58

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v61

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v63

    new-instance v2, Lc41/x2;

    invoke-static/range {v37 .. v37}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v54, Lc41/w2;

    const/16 v69, 0x3e93

    const/16 v70, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    move-object/from16 v57, v1

    move-object/from16 v60, v2

    invoke-direct/range {v54 .. v70}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v54

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Negative Trend"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_a

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_a
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v0, Lc41/x2;

    sget-object v1, Lhy0/b2;->NEGATIVE:Lhy0/b2;

    const-string v36, "this is a negative trend"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3e93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object v0, v1

    move-object/from16 v1, v17

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/y2$c;

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v58

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v61

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v63

    new-instance v2, Lc41/x2;

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v54, Lc41/w2;

    const/16 v69, 0x3e93

    const/16 v70, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    move-object/from16 v57, v1

    move-object/from16 v60, v2

    invoke-direct/range {v54 .. v70}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v54

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Positive Range"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_d

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_f

    :cond_e
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v0, Lc41/x2;

    sget-object v1, Lhy0/b2;->POSITIVE_RANGE:Lhy0/b2;

    const-string v36, "this is a positive range"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3e93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object v0, v1

    move-object/from16 v1, v17

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/y2$c;

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v58

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v61

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v63

    new-instance v2, Lc41/x2;

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v54, Lc41/w2;

    const/16 v69, 0x3e93

    const/16 v70, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    move-object/from16 v57, v1

    move-object/from16 v60, v2

    invoke-direct/range {v54 .. v70}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v54

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Concern Range"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_10

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_10
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v0, Lc41/x2;

    sget-object v1, Lhy0/b2;->CONCERN_RANGE:Lhy0/b2;

    const-string v36, "this is a concern range"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3e93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object v0, v1

    move-object/from16 v1, v17

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/y2$c;

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v58

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v61

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v63

    new-instance v2, Lc41/x2;

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v54, Lc41/w2;

    const/16 v69, 0x3e93

    const/16 v70, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v59, 0x0

    const/16 v62, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    move-object/from16 v57, v1

    move-object/from16 v60, v2

    invoke-direct/range {v54 .. v70}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v54

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Alert Range"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_13

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_13
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_14

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    :cond_14
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v0, Lc41/x2;

    sget-object v1, Lhy0/b2;->ALERT_RANGE:Lhy0/b2;

    const-string v36, "this is an alert range"

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3e93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v0

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    move-object v0, v1

    move-object/from16 v1, v17

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/y2$c;

    invoke-static/range {v53 .. v53}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lc41/y2$c;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-static/range {v34 .. v34}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v2, Lc41/x2;

    invoke-static/range {v36 .. v36}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v2, v0, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    new-instance v17, Lc41/w2;

    move-object/from16 v20, v1

    move-object/from16 v23, v2

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    const/4 v3, 0x0

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Blank Metrics"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_16
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_17

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_18

    :cond_17
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v1, Lc41/w2;

    sget-object v20, Lc41/y2$a;->a:Lc41/y2$a;

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/k0;->g()I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const/16 v32, 0x3fb3

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v1, Lc41/w2;

    invoke-static/range {v35 .. v35}, Lb9/y;->c(Lx81/d;)I

    move-result v21

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const-string v0, "Trend Bar"

    const/4 v2, 0x6

    invoke-static {v0, v4, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v14, v4, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v1, v4, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v4, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_19

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_19
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v4, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_1a

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1b

    :cond_1a
    invoke-static {v1, v4, v1, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/q;->n()I

    move-result v21

    const-string v0, "BLOOD PRESSURE MONITOR"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v1, "NORMAL"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    new-instance v1, Lc41/x2;

    sget-object v2, Lhy0/b2;->POSITIVE_YELLOW:Lhy0/b2;

    const-string v3, "Up Vs. yesterday"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lc41/x2;-><init>(Lhy0/b2;Lcom/whoop/design/util/TextResource;)V

    sget-object v28, Lzc1/i4;->a:Li41/d;

    new-instance v17, Lc41/w2;

    const/16 v32, 0x3a93

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    move-object/from16 v23, v1

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v17

    move-object/from16 v7, v28

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v35 .. v35}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/q;->n()I

    move-result v21

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    const-string v0, "--"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v0, Li41/b;->NORMAL:Li41/b;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_1c

    sget-object v2, Lzc1/i4$a;->w:Lzc1/i4$a;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    new-instance v6, Li41/c;

    invoke-direct {v6, v0, v1, v2}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    sget-object v0, Li41/b;->ELEVATED:Li41/b;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1d

    sget-object v2, Lzc1/i4$b;->w:Lzc1/i4$b;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    new-instance v8, Li41/c;

    invoke-direct {v8, v0, v1, v2}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    sget-object v0, Li41/b;->HIGH:Li41/b;

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_1e

    sget-object v2, Lzc1/i4$c;->w:Lzc1/i4$c;

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v2}, Li91/c;->l(Lkotlin/jvm/functions/Function1;)Li91/a;

    move-result-object v2

    new-instance v3, Li41/c;

    invoke-direct {v3, v0, v1, v2}, Li41/c;-><init>(Li41/b;Ljava/lang/Boolean;Li91/a;)V

    filled-new-array {v6, v8, v3}, [Li41/c;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v7, v0}, Li41/d;->a(Ljava/util/List;)Li41/d;

    move-result-object v28

    new-instance v1, Lc41/w2;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const-string v29, "Sleep Data Required"

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x32b3

    const/16 v33, 0x0

    move-object/from16 v17, v1

    invoke-direct/range {v17 .. v33}, Lc41/w2;-><init>(Ljava/lang/Object;Ljava/lang/String;Lc41/y2;ILy81/f;Lc41/x2;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Ly81/f;Li41/d;Ljava/lang/String;Lc41/s2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v2, 0x0

    invoke-static/range {v1 .. v6}, Lc41/v2;->m(Lc41/w2;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_1f
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_20

    new-instance v1, Lzc1/s3;

    const/16 v2, 0xe

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/s3;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i4;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
