.class public abstract Lb81/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000b\u001a\u0004\u0008\u0013\u0010\r\"\u001a\u0010\u0017\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u000b\u001a\u0004\u0008\u0016\u0010\r\u00a8\u0006\u0018"
    }
    d2 = {
        "Lb81/f;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lb81/f;",
        "getPreviewMultiSelectViewState",
        "()Lb81/f;",
        "previewMultiSelectViewState",
        "b",
        "getPreviewMultiSelectSelectedViewState",
        "previewMultiSelectSelectedViewState",
        "c",
        "getPreviewMultiSelectDisabledViewState",
        "previewMultiSelectDisabledViewState",
        "d",
        "getPreviewMultiSelectSuccessViewState",
        "previewMultiSelectSuccessViewState",
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


# static fields
.field private static final a:Lb81/f;

.field private static final b:Lb81/f;

.field private static final c:Lb81/f;

.field private static final d:Lb81/f;


# direct methods
.method static constructor <clinit>()V
    .locals 17

    new-instance v0, Lb81/f;

    new-instance v1, Lb81/j;

    const/16 v8, 0x18

    const/4 v9, 0x0

    const/4 v2, 0x1

    const-string v3, "Stretching"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lb81/j;

    const/16 v9, 0x18

    const/4 v10, 0x0

    const/4 v3, 0x2

    const-string v4, "Late Meals"

    const/4 v6, 0x0

    const-wide/16 v7, 0x0

    invoke-direct/range {v2 .. v10}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lb81/j;

    const/16 v10, 0x18

    const/4 v11, 0x0

    const/4 v4, 0x3

    const-string v5, "Artificial Light"

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    invoke-direct/range {v3 .. v11}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v4, Lb81/j;

    const/16 v11, 0x18

    const/4 v12, 0x0

    const/4 v5, 0x4

    const-string v6, "Device in Bed"

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    invoke-direct/range {v4 .. v12}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v5, Lb81/j;

    const/16 v12, 0x18

    const/4 v13, 0x0

    const/4 v6, 0x5

    const-string v7, "Shared Bed"

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    invoke-direct/range {v5 .. v13}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lb81/j;

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/4 v7, 0x6

    const-string v8, "Sleep Mask"

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    invoke-direct/range {v6 .. v14}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lb81/j;

    const/16 v14, 0x18

    const/4 v15, 0x0

    const/4 v8, 0x7

    const-string v9, "Sleep in Dark Room"

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    invoke-direct/range {v7 .. v15}, Lb81/j;-><init>(ILjava/lang/String;ZZDILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array/range {v1 .. v7}, [Lb81/j;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const-string v1, "multi-select-1"

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lb81/f;-><init>(Ljava/lang/String;Ljava/util/List;Lb81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lb81/d;->a:Lb81/f;

    invoke-virtual {v0}, Lb81/f;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v6, v4, 0x1

    if-ltz v4, :cond_1

    check-cast v5, Lm91/u;

    const-string v7, "null cannot be cast to non-null type com.whoop.design.atomic.organism.multiselect.SelectableChipViewState"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, v5

    check-cast v8, Lb81/j;

    const/4 v5, 0x3

    if-ge v4, v5, :cond_0

    const/4 v4, 0x1

    move v11, v4

    goto :goto_1

    :cond_0
    move v11, v3

    :goto_1
    const/16 v15, 0x1b

    const/16 v16, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    invoke-static/range {v8 .. v16}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object v4

    invoke-interface {v2, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v4, v6

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_2
    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lb81/f;->b(Lb81/f;Ljava/lang/String;Ljava/util/List;Lb81/e;ILjava/lang/Object;)Lb81/f;

    move-result-object v6

    sput-object v6, Lb81/d;->b:Lb81/f;

    sget-object v9, Lb81/e;->DISABLED:Lb81/e;

    const/4 v10, 0x3

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lb81/f;->b(Lb81/f;Ljava/lang/String;Ljava/util/List;Lb81/e;ILjava/lang/Object;)Lb81/f;

    move-result-object v0

    sput-object v0, Lb81/d;->c:Lb81/f;

    sget-object v9, Lb81/e;->SUCCESS:Lb81/e;

    invoke-static/range {v6 .. v11}, Lb81/f;->b(Lb81/f;Ljava/lang/String;Ljava/util/List;Lb81/e;ILjava/lang/Object;)Lb81/f;

    move-result-object v0

    sput-object v0, Lb81/d;->d:Lb81/f;

    return-void
.end method

.method public static synthetic a(Lb81/f;ZLkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lb81/d;->g(Lb81/f;ZLkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lb81/d;->i(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lb81/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lb81/d;->h(Lkotlin/jvm/functions/Function1;Lm91/u;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lb81/d;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lb81/f;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x9305154

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p5, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v5, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_5

    move-object/from16 v5, p2

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_8

    move v7, v10

    goto :goto_6

    :cond_8
    move v7, v9

    :goto_6
    and-int/2addr v0, v10

    invoke-virtual {v14, v0, v7}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_d

    if-eqz v2, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v0, v3

    :goto_7
    if-eqz v4, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_a

    new-instance v2, Lb72/a;

    const/4 v3, 0x4

    invoke-direct {v2, v3}, Lb72/a;-><init>(I)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v2, v5

    :goto_8
    invoke-virtual {v6}, Lb81/f;->e()Lb81/e;

    move-result-object v3

    sget-object v4, Lb81/e;->ENABLED:Lb81/e;

    if-ne v3, v4, :cond_c

    move v9, v10

    :cond_c
    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    new-instance v4, Lb81/b;

    const/4 v5, 0x0

    invoke-direct {v4, v6, v9, v2, v5}, Lb81/b;-><init>(Ljava/lang/Object;ZLl83/e;I)V

    const v5, -0x44c7f047

    invoke-static {v5, v14, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const v15, 0x1801b0

    const/16 v16, 0x38

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v3

    invoke-static/range {v7 .. v16}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    move-object v5, v2

    goto :goto_9

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v4, v3

    :goto_9
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_e

    new-instance v0, La01/e;

    const/16 v3, 0x10

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lb81/f;ZLkotlin/jvm/functions/Function1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v3, p2

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v7, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v7

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-virtual/range {p0 .. p0}, Lb81/f;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_1
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm91/u;

    instance-of v1, v0, Lb81/j;

    if-eqz v1, :cond_3

    const v1, -0x6dcd23f

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    move-object v9, v0

    check-cast v9, Lb81/j;

    const/16 v16, 0x17

    const/16 v17, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v14, 0x0

    move/from16 v13, p1

    invoke-static/range {v9 .. v17}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object v1

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Lb81/c;

    const/4 v0, 0x0

    invoke-direct {v2, v3, v9, v0}, Lb81/c;-><init>(Lkotlin/jvm/functions/Function1;Lb81/j;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lc93/a;

    invoke-static {v1, v2, v4, v7}, Lb81/i;->c(Lb81/j;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    const v1, -0x6d8d98b

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_2
    move-object/from16 v3, p2

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :cond_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lm91/u;)Ll83/a0;
    .locals 9

    move-object v0, p1

    check-cast v0, Lb81/j;

    invoke-virtual {v0}, Lb81/j;->f()Z

    move-result p1

    xor-int/lit8 v3, p1, 0x1

    const/16 v7, 0x1b

    const/4 v8, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const-wide/16 v5, 0x0

    invoke-static/range {v0 .. v8}, Lb81/j;->b(Lb81/j;ILjava/lang/String;ZZDILjava/lang/Object;)Lb81/j;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lb81/d;->e(Lb81/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
