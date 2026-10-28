.class public abstract Lny0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a9\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u000f\u0010\u000b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\"\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000e\"\u001a\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\u00a8\u0006\u0018\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lny0/l;",
        "state",
        "Lj0/i;",
        "interactionSource",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lny0/l;",
        "spreadCardIconButtonState",
        "",
        "b",
        "Ljava/util/List;",
        "cardIconButtonSharedRowStates",
        "c",
        "cardIconButtonStripStates",
        "",
        "isPressed",
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
.field private static final a:Lny0/l;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lny0/l;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lny0/l;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 21

    new-instance v0, Lny0/l;

    sget-object v3, Lgz0/m0;->HOME:Lgz0/m0;

    const/16 v7, 0x3c

    const/4 v8, 0x0

    const-string v1, "preview"

    move-object v2, v3

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lny0/k;->a:Lny0/l;

    new-instance v3, Lny0/l;

    sget-object v6, Lgz0/m0;->ADD:Lgz0/m0;

    sget-object v9, Lny0/p;->DEFAULT:Lny0/p;

    const/16 v10, 0x1c

    const/4 v11, 0x0

    const-string v4, "activity"

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v11}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v3

    move-object v10, v5

    new-instance v1, Lny0/l;

    sget-object v7, Lny0/p;->HIGHLIGHT:Lny0/p;

    const/16 v8, 0x1c

    const/4 v9, 0x0

    move-object v3, v2

    const-string v2, "home"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v9}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v3

    new-instance v11, Lny0/l;

    sget-object v13, Lgz0/m0;->TINY_EXPAND:Lgz0/m0;

    sget-object v17, Lny0/p;->BLUE_BACKGROUND:Lny0/p;

    const/16 v18, 0x1c

    const/16 v19, 0x0

    const-string v12, "more"

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v11 .. v19}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v11}, [Lny0/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lny0/k;->b:Ljava/util/List;

    new-instance v4, Lny0/l;

    move-object v5, v10

    sget-object v10, Lny0/p;->QUICK_ACTION:Lny0/p;

    const/16 v11, 0x1c

    const/4 v12, 0x0

    move-object v6, v5

    const-string v5, "strip_1"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v12}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v4

    move-object v10, v6

    new-instance v1, Lny0/l;

    sget-object v7, Lny0/p;->ONBOARDING:Lny0/p;

    const/16 v8, 0x1c

    const-string v2, "strip_2"

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v9}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v12, Lny0/l;

    sget-object v18, Lny0/p;->TRANSPARENT_BACKGROUND:Lny0/p;

    const/16 v19, 0x1c

    const/16 v20, 0x0

    move-object v14, v13

    const-string v13, "strip_3"

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v12 .. v20}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v12

    new-instance v4, Lny0/l;

    move-object v5, v10

    sget-object v10, Lny0/p;->LIGHT_BACKGROUND:Lny0/p;

    const/16 v11, 0x14

    const/4 v12, 0x0

    move-object v6, v5

    const-string v5, "strip_4"

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v12}, Lny0/l;-><init>(Ljava/lang/String;Lgz0/m0;Lcom/whoop/navigation/e;ZLi91/a;Lny0/p;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v0, v1, v2, v4}, [Lny0/l;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lny0/k;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/k;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lny0/k;->g(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lny0/k;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lny0/l;",
            "Lj0/i;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onClick"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x417c94c4

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v6, v5, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v5, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v3

    goto :goto_0

    :cond_1
    move v7, v1

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v5, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_7

    or-int/lit16 v7, v7, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_4

    :cond_8
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v7, v10

    :goto_5
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_a

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_6

    :cond_9
    const/16 v10, 0x400

    :goto_6
    or-int/2addr v7, v10

    :cond_a
    and-int/lit16 v10, v7, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    if-eq v10, v13, :cond_b

    const/4 v10, 0x1

    goto :goto_7

    :cond_b
    move v10, v14

    :goto_7
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v11, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_1d

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_c

    move-object/from16 v0, v16

    goto :goto_8

    :cond_c
    move-object v0, v6

    :goto_8
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_d

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_d
    check-cast v8, Lj0/i;

    move-object v9, v8

    :cond_e
    shr-int/lit8 v8, v7, 0x6

    and-int/lit8 v8, v8, 0xe

    invoke-static {v9, v11, v8}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v8

    invoke-static {v8}, Lny0/k;->e(Lp1/t2;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v2}, Lny0/l;->h()Lny0/p;

    move-result-object v8

    invoke-virtual {v8}, Lny0/p;->getPressedBackground()Li91/a;

    move-result-object v8

    goto :goto_9

    :cond_f
    invoke-virtual {v2}, Lny0/l;->c()Li91/a;

    move-result-object v8

    :goto_9
    invoke-virtual {v2}, Lny0/l;->h()Lny0/p;

    move-result-object v10

    invoke-virtual {v10}, Lny0/p;->getBorderColor()Lj91/b;

    move-result-object v10

    if-nez v10, :cond_10

    const v10, 0x3f625152

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    goto :goto_a

    :cond_10
    const v13, 0x2b55c08f

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-interface {v10, v11, v14}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v10

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v2}, Lny0/l;->h()Lny0/p;

    move-result-object v13

    invoke-virtual {v13}, Lny0/p;->getCornerRadius-lTKBWiU()Ly3/f;

    move-result-object v13

    if-eqz v13, :cond_11

    iget v1, v13, Ly3/f;->w:F

    goto :goto_b

    :cond_11
    int-to-float v1, v1

    int-to-float v13, v3

    mul-float/2addr v1, v13

    :goto_b
    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-virtual {v2}, Lny0/l;->f()Z

    move-result v13

    const/4 v15, 0x6

    if-nez v13, :cond_12

    const v13, 0x2b55dbe3

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    invoke-static {v13, v11, v15, v14}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v17

    :goto_c
    move-wide/from16 v12, v17

    goto :goto_10

    :cond_12
    const v13, 0x3f66074e

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/l;->h()Lny0/p;

    move-result-object v13

    invoke-virtual {v13}, Lny0/p;->getIconColor()Ly81/f;

    move-result-object v13

    if-nez v13, :cond_13

    const v13, 0x3f665812

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    goto :goto_d

    :cond_13
    const v15, 0x2b55e1cf

    invoke-virtual {v11, v15}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    invoke-static {v11, v14, v12, v13}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v13

    :goto_d
    if-nez v13, :cond_14

    const v12, 0x2b55e78f

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/l;->h()Lny0/p;

    move-result-object v12

    invoke-virtual {v12}, Lny0/p;->getTitleColor()Ly81/f;

    move-result-object v12

    invoke-virtual {v12, v11, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_e
    move-wide/from16 v17, v12

    goto :goto_f

    :cond_14
    const v12, 0x2b55df34

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    iget-wide v12, v13, Li2/x;->a:J

    goto :goto_e

    :goto_f
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_10
    const/16 v15, 0xa

    int-to-float v15, v15

    int-to-float v3, v3

    mul-float/2addr v15, v3

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v2}, Lny0/l;->f()Z

    move-result v19

    and-int/lit16 v7, v7, 0x1c00

    const/16 v14, 0x800

    if-ne v7, v14, :cond_15

    const/4 v7, 0x1

    goto :goto_11

    :cond_15
    const/4 v7, 0x0

    :goto_11
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v7, :cond_16

    if-ne v14, v6, :cond_17

    :cond_16
    new-instance v14, Llq2/k;

    const/16 v6, 0x11

    invoke-direct {v14, v4, v6}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v21, v14

    check-cast v21, Lc93/a;

    const/16 v22, 0x18

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v9

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v16

    invoke-static {v6, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    if-eqz v10, :cond_18

    move v9, v3

    const-wide/high16 v2, 0x3fd8000000000000L    # 0.375

    double-to-float v2, v2

    mul-float/2addr v2, v9

    invoke-static {v2, v7, v10, v1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_12

    :cond_18
    move v9, v3

    invoke-interface {v6, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_12
    invoke-static {v1, v8}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lny0/l;->h()Lny0/p;

    move-result-object v2

    invoke-virtual {v2}, Lny0/p;->getPaddingValues()Ll0/k1;

    move-result-object v2

    if-eqz v2, :cond_19

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v1, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_13

    :cond_19
    invoke-interface {v1, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_13
    invoke-interface {v15, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->E:Lb2/m;

    const/4 v3, 0x0

    invoke-static {v2, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v14, v11, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_1a

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_14
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v11, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_1b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1c

    :cond_1b
    invoke-static {v3, v11, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v11, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lny0/l;->g()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v2, 0x6

    invoke-static {v1, v11, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    mul-float v3, v9, v9

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-wide v9, v12

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    move-object v1, v0

    move-object/from16 v3, v17

    goto :goto_15

    :cond_1d
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v6

    move-object v3, v9

    :goto_15
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1e

    new-instance v0, Lkw1/c;

    const/16 v7, 0x1a

    move-object/from16 v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final e(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final f(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lny0/k;->d(Landroidx/compose/ui/Modifier;Lny0/l;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x60b7ed1a

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lny0/k$a;

    invoke-direct {v1}, Lny0/k$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lm22/t;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lm22/t;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lny0/k;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j()Ljava/util/List;
    .locals 1

    sget-object v0, Lny0/k;->b:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic k()Ljava/util/List;
    .locals 1

    sget-object v0, Lny0/k;->c:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic l()Lny0/l;
    .locals 1

    sget-object v0, Lny0/k;->a:Lny0/l;

    return-object v0
.end method
