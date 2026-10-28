.class public abstract Lzc1/n3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0003\u001a\u000f\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Lm91/u;",
        "f",
        "(Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "e",
        "d",
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

    invoke-static {p0, p1, p2}, Lzc1/n3;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 27

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x1d9787bc

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v3, 0x0

    if-eqz v0, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    move v4, v3

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-static {v1, v3}, Lzc1/n3;->f(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v8

    const/4 v4, 0x2

    int-to-float v5, v4

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v5, v6, v1, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

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

    invoke-static {v1, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v1, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v1, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v1, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v5, "Free (default) \u2014 fling settles anywhere"

    invoke-static {v5, v1, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v5, Lr71/c;

    const-string v16, "RECOMMENDED FOR YOU"

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v10, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->FREE:Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    const/16 v13, 0x60

    const/4 v14, 0x0

    const-string v6, "recommendation-carousel-free"

    const-string v9, "Recommendation carousel with free scrolling"

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v5 .. v14}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lr71/c;->h:I

    const/4 v7, 0x0

    invoke-static {v5, v7, v1, v6, v4}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Snap \u2014 fling settles on a tile"

    invoke-static {v5, v1, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v5, Lr71/c;

    move-object v9, v7

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v22, Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;->SNAP:Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;

    move v10, v6

    const-string v6, "recommendation-carousel-snap"

    move-object v11, v9

    const-string v9, "Recommendation carousel with snap scrolling"

    move-object v12, v11

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move v2, v10

    move-object/from16 v3, v17

    move-object/from16 v10, v22

    invoke-direct/range {v5 .. v14}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v3, v1, v2, v4}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Snap + paging indicator \u2014 dot tracks the current tile"

    invoke-static {v5, v1, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v5, Lr71/c;

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/16 v13, 0x40

    const-string v6, "recommendation-carousel-paging"

    const-string v9, "Recommendation carousel with snap scrolling and paging indicator"

    const/4 v11, 0x1

    invoke-direct/range {v5 .. v14}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v5, v3, v1, v2, v4}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Paging indicator (many items) \u2014 dots collapse past 5"

    invoke-static {v5, v1, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Lr71/c;

    invoke-static/range {v16 .. v16}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    const/4 v5, 0x0

    invoke-static {v1, v5}, Lzc1/n3;->e(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v20

    const/16 v25, 0x40

    const/16 v26, 0x0

    const-string v18, "recommendation-carousel-paging-many"

    const-string v21, "Recommendation carousel with paging indicator and many items"

    const/16 v23, 0x1

    const/16 v24, 0x0

    invoke-direct/range {v17 .. v26}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v17

    invoke-static {v5, v3, v1, v2, v4}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const-string v5, "Edge cases \u2014 null title/labels, missing zones (no container title)"

    invoke-static {v5, v1, v15}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v17, Lr71/c;

    const/4 v5, 0x0

    invoke-static {v1, v5}, Lzc1/n3;->d(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object v20

    const/16 v25, 0x60

    const-string v18, "recommendation-carousel-edge-cases"

    const/16 v19, 0x0

    const-string v21, "Recommendation carousel exercising null titles, null labels, and missing zones"

    const/16 v23, 0x0

    invoke-direct/range {v17 .. v26}, Lr71/c;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;Lcom/whoop/design/atomic/organism/horizontalscrollcontainer/HorizontalScrollBehavior;ZLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v5, v17

    invoke-static {v5, v3, v1, v2, v4}, Lr71/b;->k(Lr71/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Lzc1/l2;

    const/16 v3, 0x19

    invoke-direct {v2, v0, v3}, Lzc1/l2;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/n3;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final d(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const/16 v11, 0x7fd

    const/4 v12, 0x0

    const/4 v0, 0x0

    const-string v1, "NO BAR TITLE"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v12}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v15

    invoke-static {}, Lzc1/j9;->f()Lu41/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v19, 0x32

    const/16 v20, 0x0

    const-string v13, "rec-no-bar-title"

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v0

    const/16 v12, 0x7fd

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-string v2, "NO ZONE LABELS"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v16

    invoke-static {}, Lzc1/j9;->g()Lu41/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x32

    const/16 v21, 0x0

    const-string v14, "rec-no-zone-labels"

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v1

    filled-new-array {v0, v1}, [Lh31/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private static final e(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0x8

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    const-string v3, "rec-activity-"

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v4

    add-int/lit8 v2, v2, 0x1

    const-string v3, "ACTIVITY "

    invoke-static {v2, v3}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/16 v16, 0x7fd

    const/16 v17, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v17}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v6

    const/16 v10, 0x3a

    const/4 v9, 0x0

    invoke-static/range {v4 .. v11}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method private static final f(Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const/16 v11, 0x7fd

    const/4 v12, 0x0

    const/4 v0, 0x0

    const-string v1, "ZONE 2 RUN"

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v0 .. v12}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v15

    invoke-static {}, Lzc1/j9;->d()Lu41/b;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v16

    const/16 v19, 0x32

    const/16 v20, 0x0

    const-string v13, "rec-zone-2-run"

    const/4 v14, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v13 .. v20}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v0

    const/16 v12, 0x7fd

    const/4 v13, 0x0

    const/4 v1, 0x0

    const-string v2, "STRENGTH TRAINER"

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v1 .. v13}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v16

    invoke-static {}, Lzc1/j9;->e()Lu41/b;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    const/16 v20, 0x32

    const/16 v21, 0x0

    const-string v14, "rec-strength-trainer"

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v14 .. v21}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v1

    sget-object v3, Lh31/n;->COMMITTED:Lh31/n;

    const/16 v15, 0x7fd

    const/16 v16, 0x0

    const-string v5, "YOGA FLOW"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v4 .. v16}, Li31/c;->n(Ljava/lang/String;Ljava/lang/String;Lb91/c;Lm91/u;Lkd1/o;Ljava/util/List;Lm91/u;Lm91/u;ZZLcom/whoop/navigation/models/GenericInteraction;ILjava/lang/Object;)Li31/g;

    move-result-object v4

    sget-object v5, Lh31/f;->COMMITTED:Lh31/f;

    sget-object v7, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    const/16 v10, 0x18

    const-string v6, "COMMITTED"

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lh31/e;->k(Lh31/f;Ljava/lang/String;Lgz0/m0;ZLh31/c;ILjava/lang/Object;)Lh31/g;

    move-result-object v6

    const/16 v8, 0x28

    const-string v2, "rec-yoga-flow"

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lh31/l;->l(Ljava/lang/String;Lh31/n;Lm91/u;Ljava/util/List;Lm91/u;ZILjava/lang/Object;)Lh31/q;

    move-result-object v2

    filled-new-array {v0, v1, v2}, [Lh31/q;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method
