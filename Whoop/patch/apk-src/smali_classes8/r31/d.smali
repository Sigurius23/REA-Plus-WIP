.class public abstract Lr31/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0011\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u000b\u001a\u0004\u0008\u0010\u0010\r\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u000b\u001a\u0004\u0008\u0013\u0010\r\"\u001a\u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u000b\u001a\u0004\u0008\u0015\u0010\r\u00a8\u0006\u0017"
    }
    d2 = {
        "Lr31/f;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "a",
        "Lr31/f;",
        "getPreviewDefaultSelectionWidgetViewState",
        "()Lr31/f;",
        "previewDefaultSelectionWidgetViewState",
        "b",
        "getPreviewLoadingSelectionWidgetViewState",
        "previewLoadingSelectionWidgetViewState",
        "c",
        "getPreviewDisabledSelectionWidgetViewState",
        "previewDisabledSelectionWidgetViewState",
        "getPreviewPrefixTextSelectionWidgetViewState",
        "previewPrefixTextSelectionWidgetViewState",
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
.field private static final a:Lr31/f;

.field private static final b:Lr31/f;

.field private static final c:Lr31/f;

.field private static final d:Lr31/f;


# direct methods
.method static constructor <clinit>()V
    .locals 30

    new-instance v0, Lr31/f;

    sget-object v4, Lr31/e;->ENABLED:Lr31/e;

    sget-object v1, Lgz0/m0;->AI_SPARKLE:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    sget-object v2, Lf21/a;->COMPACT:Lf21/a;

    new-instance v3, Lf21/d;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v5, "You slept well"

    const-string v6, "callout-1"

    invoke-direct {v3, v6, v1, v5, v2}, Lf21/d;-><init>(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lf21/a;)V

    invoke-static {v3}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {}, Ll11/c;->A()Ll11/e;

    move-result-object v5

    const/16 v8, 0x60

    const/4 v9, 0x0

    move-object v3, v4

    move-object v4, v1

    const-string v1, "selection-widget-1"

    const-string v2, "Stretching"

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lr31/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lr31/d;->a:Lr31/f;

    new-instance v1, Lr31/f;

    invoke-static {}, Ll11/c;->A()Ll11/e;

    move-result-object v4

    sget-object v12, Ll11/d$d;->a:Ll11/d$d;

    const/16 v17, 0xf7f

    const/16 v18, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v4 .. v18}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v6

    const/16 v9, 0x60

    const-string v2, "selection-widget-1"

    move-object v4, v3

    const-string v3, "Stretching"

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct/range {v1 .. v10}, Lr31/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v3, v4

    sput-object v1, Lr31/d;->b:Lr31/f;

    new-instance v11, Lr31/f;

    sget-object v14, Lr31/e;->DISABLED:Lr31/e;

    invoke-static {}, Ll11/c;->A()Ll11/e;

    move-result-object v15

    sget-object v23, Ll11/d$b;->a:Ll11/d$b;

    const/16 v28, 0xf7f

    const/16 v29, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    invoke-static/range {v15 .. v29}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v16

    const/16 v19, 0x60

    const-string v12, "selection-widget-1"

    const-string v13, "Stretching"

    move-object v15, v5

    invoke-direct/range {v11 .. v20}, Lr31/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Lr31/d;->c:Lr31/f;

    new-instance v1, Lr31/f;

    invoke-static {}, Ll11/c;->A()Ll11/e;

    move-result-object v6

    const/16 v19, 0xbfd

    const-string v8, "REMOVE (2)"

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-string v17, "REMOVE"

    invoke-static/range {v6 .. v20}, Ll11/e;->b(Ll11/e;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lgz0/m0;Lgz0/m0;Ljava/lang/String;Lgz0/m0;Ll11/d;ZLjava/lang/String;Ljava/lang/String;Lb91/a;ILjava/lang/Object;)Ll11/e;

    move-result-object v6

    const/16 v9, 0x60

    const-string v2, "selection-widget-1"

    const-string v3, "Stretching"

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lr31/f;-><init>(Ljava/lang/String;Ljava/lang/String;Lr31/e;Ljava/util/List;Lm91/u;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lr31/d;->d:Lr31/f;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr31/d;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    move-object v0, p1

    move-object p1, p0

    move-object p0, v0

    invoke-static/range {p0 .. p6}, Lr31/d;->g(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr31/d;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 34
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr31/f;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0x276ad8a2

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit16 v10, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x1

    const/4 v13, 0x0

    if-eq v10, v11, :cond_8

    move v10, v12

    goto :goto_6

    :cond_8
    move v10, v13

    :goto_6
    and-int/2addr v0, v12

    invoke-virtual {v9, v0, v10}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_15

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_9

    move-object v5, v0

    goto :goto_7

    :cond_9
    move-object v5, v6

    :goto_7
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_a

    new-instance v7, Lqt2/w;

    const/16 v8, 0x12

    invoke-direct {v7, v8}, Lqt2/w;-><init>(I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v31, v7

    goto :goto_8

    :cond_b
    move-object/from16 v31, v8

    :goto_8
    invoke-virtual {v1}, Lr31/f;->g()Lr31/e;

    move-result-object v7

    sget-object v8, Lr31/e;->DISABLED:Lr31/e;

    if-ne v7, v8, :cond_c

    move/from16 v32, v12

    goto :goto_9

    :cond_c
    move/from16 v32, v13

    :goto_9
    invoke-static {}, Lr71/b;->y()Lp1/t1;

    move-result-object v7

    invoke-virtual {v9, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-eqz v7, :cond_d

    const v7, -0xac9a587

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->a:Lp1/b0;

    invoke-virtual {v9, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/res/Configuration;

    iget v7, v7, Landroid/content/res/Configuration;->screenWidthDp:I

    int-to-float v7, v7

    const/high16 v8, 0x3f400000    # 0.75f

    mul-float/2addr v7, v8

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    const v7, -0xac7f4fb

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :goto_a
    invoke-interface {v5, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v7, v12

    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object v8

    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v3, v3

    mul-float/2addr v10, v3

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v7, v0, v8, v3}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-static {}, Lgb1/b0;->P()Li2/t;

    move-result-object v0

    invoke-static {v0}, Li91/c;->h(Li2/t;)Li91/a;

    move-result-object v15

    invoke-static {v10}, Lt0/j;->e(F)Lt0/i;

    move-result-object v16

    const/16 v18, 0x4

    const/16 v19, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Li91/c;->e(Landroidx/compose/ui/Modifier;Li91/a;Li2/a1;Ljava/lang/Float;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v2, v3, v9, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_e

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_e
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_b
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-nez v8, :cond_f

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_10

    :cond_f
    invoke-static {v3, v9, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lr31/f;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v0, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    const-string v2, "toUpperCase(...)"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v9, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->j()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v9, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object v2, v6

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v3, v12

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

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move-object v3, v5

    move-object v5, v0

    move-object v0, v3

    move/from16 v3, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    if-eqz v32, :cond_12

    const v5, -0x4f8f0eec

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_11

    new-instance v5, Lqt2/w;

    const/16 v2, 0x13

    invoke-direct {v5, v2}, Lqt2/w;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object v8, v5

    goto :goto_c

    :cond_12
    const v2, -0x4f8e91d5

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object/from16 v8, v31

    :goto_c
    const v2, 0x5003b074

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lr31/f;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_13
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v1}, Lr31/f;->e()Lm91/u;

    move-result-object v5

    if-nez v5, :cond_14

    const v2, -0x4f8bc971

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    :goto_e
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    goto :goto_f

    :cond_14
    const v2, -0x4f8bc970

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_e

    :goto_f
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    move-object v2, v0

    move-object/from16 v3, v31

    goto :goto_10

    :cond_15
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    :goto_10
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lr31/c;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lr31/c;-><init>(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lr31/d;->d(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
