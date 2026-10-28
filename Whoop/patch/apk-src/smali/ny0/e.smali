.class public abstract Lny0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lny0/e$c;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010 \n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a9\u0010\t\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\u000c*\u00020\u000b\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0015\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010\u0012\u001a\u0004\u0008\u0013\u0010\u0014\"\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u001d\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00168\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0018\u001a\u0004\u0008\u001d\u0010\u001a\u00a8\u0006!\u00b2\u0006\u000c\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lny0/h;",
        "state",
        "Lj0/i;",
        "interactionSource",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "Lny0/b;",
        "Ly3/f;",
        "l",
        "(Lny0/b;)F",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "a",
        "Lny0/h;",
        "k",
        "()Lny0/h;",
        "spreadCardButtonState",
        "",
        "b",
        "Ljava/util/List;",
        "getChipCardButtonStates",
        "()Ljava/util/List;",
        "chipCardButtonStates",
        "c",
        "j",
        "cardButtonStates",
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
.field private static final a:Lny0/h;

.field private static final b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lny0/h;",
            ">;"
        }
    .end annotation
.end field

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lny0/h;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 41

    new-instance v0, Lny0/h;

    const-string v1, "Wide Button"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Lgz0/m0;->HOME:Lgz0/m0;

    const v26, 0x1fffffc

    const/16 v27, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v0 .. v27}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lny0/e;->a:Lny0/h;

    new-instance v1, Lny0/h;

    const-string v0, "Today"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget-object v8, Lny0/p;->DARK_BACKGROUND:Lny0/p;

    sget-object v20, Lny0/g;->CHIP:Lny0/g;

    const v27, 0x1fffbbe

    const/16 v28, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v12, v20

    const/16 v20, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v1 .. v28}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v9, Lny0/h;

    const-string v0, "This Week"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    sget-object v11, Lgz0/m0;->TINY_EXPAND:Lgz0/m0;

    sget-object v31, Lny0/c;->TRAILING_ICON:Lny0/c;

    const v35, 0x1dffbfc

    const/16 v36, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v9 .. v36}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v1, v9}, [Lny0/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lny0/e;->b:Ljava/util/List;

    new-instance v12, Lny0/h;

    const-string v0, "Activity"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    sget-object v14, Lgz0/m0;->ADD:Lgz0/m0;

    const v38, 0x1fffffc

    const/16 v39, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v35, 0x0

    const/16 v37, 0x0

    invoke-direct/range {v12 .. v39}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v13, Lny0/h;

    const-string v0, "No Icon"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const v39, 0x1fffffe

    const/16 v40, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v13 .. v40}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v0, v13

    new-instance v13, Lny0/h;

    const-string v1, "Testing Very Long Title Button Text: Go! "

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    const v39, 0x1fffffc

    move-object v15, v11

    invoke-direct/range {v13 .. v40}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    filled-new-array {v12, v0, v13}, [Lny0/h;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lny0/e;->c:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lny0/e;->f(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lny0/e;->g(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lny0/e;->i(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lny0/h;",
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

    const v0, 0x69779683

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

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

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v5

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v5

    :goto_1
    and-int/lit8 v8, v5, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, p6, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v7, v7, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v5, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v7, v10

    :goto_4
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_9

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_5

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v7, v10

    :cond_9
    and-int/lit16 v10, v7, 0x493

    const/16 v13, 0x492

    const/4 v14, 0x0

    if-eq v10, v13, :cond_a

    const/4 v10, 0x1

    goto :goto_6

    :cond_a
    move v10, v14

    :goto_6
    and-int/lit8 v13, v7, 0x1

    invoke-virtual {v11, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2d

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_b

    move-object v0, v10

    goto :goto_7

    :cond_b
    move-object v0, v6

    :goto_7
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v8, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_c

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_c
    check-cast v8, Lj0/i;

    move-object v9, v8

    :cond_d
    shr-int/lit8 v8, v7, 0x6

    and-int/lit8 v8, v8, 0xe

    invoke-static {v9, v11, v8}, Lge3/g;->m(Lj0/i;Lp1/q;I)Lp1/c1;

    move-result-object v8

    invoke-virtual {v2}, Lny0/h;->o()Z

    move-result v13

    if-nez v13, :cond_e

    invoke-virtual {v2}, Lny0/h;->m()Li91/a;

    move-result-object v8

    if-nez v8, :cond_10

    sget-object v8, Lny0/p;->DEFAULT:Lny0/p;

    invoke-virtual {v8}, Lny0/p;->getBackground()Li91/a;

    move-result-object v8

    goto :goto_8

    :cond_e
    invoke-static {v8}, Lny0/e;->e(Lp1/t2;)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-virtual {v2}, Lny0/h;->u()Li91/a;

    move-result-object v8

    goto :goto_8

    :cond_f
    invoke-virtual {v2}, Lny0/h;->g()Li91/a;

    move-result-object v8

    :cond_10
    :goto_8
    invoke-virtual {v2}, Lny0/h;->h()Lj91/b;

    move-result-object v13

    const/16 v23, 0x0

    if-nez v13, :cond_11

    const v13, 0x539bfccb

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object/from16 v3, v23

    goto :goto_9

    :cond_11
    const v3, -0x1613be0a

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-interface {v13, v11, v14}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v3

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v13

    invoke-virtual {v13}, Lny0/g;->getVerticalPadding-D9Ej5fM()F

    move-result v13

    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lny0/g;->getHorizontalPadding-D9Ej5fM()F

    move-result v14

    invoke-virtual {v2}, Lny0/h;->k()Ly3/f;

    move-result-object v12

    if-eqz v12, :cond_12

    :goto_a
    iget v12, v12, Ly3/f;->w:F

    goto :goto_b

    :cond_12
    invoke-virtual {v2}, Lny0/h;->v()Lny0/p;

    move-result-object v12

    invoke-virtual {v12}, Lny0/p;->getCornerRadius-lTKBWiU()Ly3/f;

    move-result-object v12

    if-eqz v12, :cond_13

    goto :goto_a

    :cond_13
    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v12

    invoke-virtual {v12}, Lny0/g;->getCornerRadius-D9Ej5fM()F

    move-result v12

    :goto_b
    invoke-virtual {v2}, Lny0/h;->w()Lb91/c;

    move-result-object v1

    if-eqz v1, :cond_15

    sget-object v15, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v15, v1}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v1

    if-nez v1, :cond_14

    goto :goto_d

    :cond_14
    :goto_c
    move-object/from16 v26, v1

    goto :goto_e

    :cond_15
    :goto_d
    invoke-virtual {v2}, Lny0/h;->v()Lny0/p;

    move-result-object v1

    invoke-virtual {v1}, Lny0/p;->getTitleStyle()Lb91/a;

    move-result-object v1

    if-nez v1, :cond_14

    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v1

    invoke-virtual {v1}, Lny0/g;->getTextStyle()Lb91/a;

    move-result-object v1

    goto :goto_c

    :goto_e
    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v1

    invoke-virtual {v1}, Lny0/g;->getShape()Lny0/f;

    move-result-object v1

    sget-object v15, Lny0/e$c;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v15, v1

    const/4 v15, 0x1

    if-eq v1, v15, :cond_17

    const/4 v15, 0x2

    if-ne v1, v15, :cond_16

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    goto :goto_f

    :cond_16
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_17
    const/16 v1, 0x32

    invoke-static {v1}, Lt0/j;->b(I)Lt0/i;

    move-result-object v1

    :goto_f
    invoke-virtual {v2}, Lny0/h;->o()Z

    move-result v12

    if-eqz v12, :cond_18

    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_10

    :cond_18
    const v12, 0x3ecccccd    # 0.4f

    :goto_10
    invoke-static {v12, v10}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v2}, Lny0/h;->o()Z

    move-result v17

    if-eqz v17, :cond_19

    invoke-virtual {v2}, Lny0/h;->z()Z

    move-result v17

    if-nez v17, :cond_19

    const/16 v19, 0x1

    goto :goto_11

    :cond_19
    const/16 v19, 0x0

    :goto_11
    and-int/lit16 v7, v7, 0x1c00

    const/16 v15, 0x800

    if-ne v7, v15, :cond_1a

    const/4 v7, 0x1

    goto :goto_12

    :cond_1a
    const/4 v7, 0x0

    :goto_12
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_1b

    if-ne v15, v6, :cond_1c

    :cond_1b
    new-instance v15, Le61/e;

    const/4 v6, 0x6

    invoke-direct {v15, v4, v6}, Le61/e;-><init>(Lc93/a;I)V

    invoke-virtual {v11, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object/from16 v21, v15

    check-cast v21, Lc93/a;

    const/16 v22, 0x18

    const/16 v18, 0x0

    const/16 v20, 0x0

    move-object/from16 v17, v9

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v22}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v32, v17

    invoke-static {v6, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 p2, v13

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    if-eqz v3, :cond_1d

    double-to-float v7, v12

    invoke-static {v7, v10, v3, v1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v6, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_13

    :cond_1d
    invoke-interface {v6, v10}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_13
    invoke-static {v1, v8}, Li91/c;->c(Landroidx/compose/ui/Modifier;Li91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v2}, Lny0/h;->v()Lny0/p;

    move-result-object v3

    invoke-virtual {v3}, Lny0/p;->getPaddingValues()Ll0/k1;

    move-result-object v3

    if-eqz v3, :cond_1e

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_14

    :cond_1e
    move/from16 v3, p2

    invoke-static {v10, v14, v3}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    :goto_14
    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_1f

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_15
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v11, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_20

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_21

    :cond_20
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v11, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lny0/h;->z()Z

    move-result v1

    if-eqz v1, :cond_22

    const/4 v15, 0x0

    goto :goto_16

    :cond_22
    const/high16 v15, 0x3f800000    # 1.0f

    :goto_16
    invoke-static {v15, v10}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v14, Ll0/m;->e:Ll0/h;

    sget-object v15, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v14, v15, v11, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_23

    invoke-virtual {v11, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_23
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_24

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_25

    :cond_24
    invoke-static {v13, v11, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    invoke-static {v11, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lny0/h;->s()Lgz0/m0;

    move-result-object v1

    if-eqz v1, :cond_26

    invoke-virtual {v2}, Lny0/h;->t()Lny0/c;

    move-result-object v1

    sget-object v3, Lny0/c;->LEADING_ICON:Lny0/c;

    if-ne v1, v3, :cond_26

    const/4 v15, 0x1

    goto :goto_18

    :cond_26
    const/4 v15, 0x0

    :goto_18
    invoke-virtual {v2}, Lny0/h;->s()Lgz0/m0;

    move-result-object v1

    if-eqz v1, :cond_27

    invoke-virtual {v2}, Lny0/h;->t()Lny0/c;

    move-result-object v1

    sget-object v3, Lny0/c;->TRAILING_ICON:Lny0/c;

    if-ne v1, v3, :cond_27

    const/4 v1, 0x1

    goto :goto_19

    :cond_27
    const/4 v1, 0x0

    :goto_19
    invoke-virtual {v2}, Lny0/h;->v()Lny0/p;

    move-result-object v3

    invoke-virtual {v3}, Lny0/p;->getIconColor()Ly81/f;

    move-result-object v3

    if-nez v3, :cond_28

    const v3, 0x7658c095

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_1a
    move-object/from16 v3, v23

    goto :goto_1b

    :cond_28
    const/4 v6, 0x0

    const v7, -0x35fd2314    # -2144059.0f

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v11, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-static {v11, v6, v7, v8}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v23

    goto :goto_1a

    :goto_1b
    if-nez v3, :cond_29

    const v3, -0x35fd1e14    # -2144379.0f

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/h;->y()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v11, v6}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_29
    const v7, -0x35fd25b5

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    iget-wide v7, v3, Li2/x;->a:J

    :goto_1c
    const/16 v3, 0x8

    const/4 v14, 0x6

    if-eqz v15, :cond_2a

    const v6, 0x765a53f3

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/h;->s()Lgz0/m0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    invoke-static {v6, v11, v14}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v9, 0x4

    int-to-float v12, v9

    mul-float/2addr v12, v12

    invoke-static {v12, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    move-object v15, v10

    move-wide/from16 v40, v7

    move-object v8, v9

    move-wide/from16 v9, v40

    const-string v7, ""

    invoke-static/range {v6 .. v13}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-wide/from16 v33, v9

    const/4 v6, 0x1

    int-to-float v7, v6

    int-to-float v8, v3

    const/4 v9, 0x0

    invoke-static {v7, v8, v15, v11, v9}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_1d

    :cond_2a
    move-wide/from16 v33, v7

    move-object v15, v10

    const/4 v6, 0x1

    const/4 v9, 0x0

    const v7, 0x765f57c9

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual {v2}, Lny0/h;->x()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v11, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2}, Lny0/h;->y()Ly81/f;

    move-result-object v8

    invoke-virtual {v8, v11, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    invoke-virtual {v2}, Lny0/h;->i()Lny0/g;

    move-result-object v8

    invoke-virtual {v8}, Lny0/g;->getMaxLines()I

    move-result v23

    const/16 v30, 0x30

    const v31, 0x2d7fa

    move/from16 v25, v6

    move-object v6, v7

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move/from16 v24, v9

    move-wide v8, v12

    const/4 v12, 0x0

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

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x2

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move-object/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v38, v29

    const/16 v29, 0x0

    move/from16 v3, v36

    move-object/from16 v39, v37

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    if-eqz v1, :cond_2b

    const v1, 0x76645173

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v3

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v1, v6

    move-object/from16 v15, v39

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lny0/h;->s()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v6, 0x6

    invoke-static {v1, v11, v6}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v9, 0x4

    int-to-float v1, v9

    mul-float/2addr v1, v1

    invoke-static {v1, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const-string v7, ""

    move-wide/from16 v9, v33

    invoke-static/range {v6 .. v13}, Ll1/r1;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_1e

    :cond_2b
    move-object/from16 v15, v39

    const/4 v1, 0x0

    const v6, 0x76695549

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lny0/h;->z()Z

    move-result v6

    if-eqz v6, :cond_2c

    const v6, 0x4b17a7a6    # 9938854.0f

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lny0/h;->y()Ly81/f;

    move-result-object v6

    invoke-virtual {v6, v11, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/4 v9, 0x4

    int-to-float v6, v9

    mul-float/2addr v6, v6

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v9

    const/16 v15, 0x186

    const/16 v16, 0x38

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v14, v28

    invoke-static/range {v6 .. v16}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_2c
    const v6, 0x4b1a9b65    # 1.0132325E7f

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v11, v3}, Lp1/q;->q(Z)V

    move-object v1, v0

    move-object/from16 v3, v32

    goto :goto_20

    :cond_2d
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v6

    move-object v3, v9

    :goto_20
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_2e

    new-instance v0, Lb11/c;

    const/4 v7, 0x5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb11/c;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_2e
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

.method private static final g(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, 0x29f2ef7b

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

    new-instance v1, Lny0/e$a;

    invoke-direct {v1}, Lny0/e$a;-><init>()V

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

    const/16 v1, 0xa

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

    invoke-static {p1, p0}, Lny0/e;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final j()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lny0/h;",
            ">;"
        }
    .end annotation

    sget-object v0, Lny0/e;->c:Ljava/util/List;

    return-object v0
.end method

.method public static final k()Lny0/h;
    .locals 1

    sget-object v0, Lny0/e;->a:Lny0/h;

    return-object v0
.end method

.method public static final l(Lny0/b;)F
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lny0/e$c;->b:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x4

    const/4 v1, 0x1

    if-eq p0, v1, :cond_3

    const/4 v1, 0x2

    if-eq p0, v1, :cond_2

    const/4 v1, 0x3

    if-eq p0, v1, :cond_1

    if-ne p0, v0, :cond_0

    int-to-float p0, v0

    mul-float/2addr p0, p0

    return p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    int-to-float p0, v1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0

    :cond_2
    int-to-float p0, v1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0

    :cond_3
    int-to-float p0, v1

    int-to-float v0, v0

    mul-float/2addr p0, v0

    return p0
.end method
