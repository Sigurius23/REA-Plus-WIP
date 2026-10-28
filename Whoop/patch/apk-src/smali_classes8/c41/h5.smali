.class public abstract Lc41/h5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u001f\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\"\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012\"\u0014\u0010\u0015\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0012\"\u0014\u0010\u0017\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0012\"\u0017\u0010\u001c\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\"\u0017\u0010\u001f\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0019\u001a\u0004\u0008\u001e\u0010\u001b\"\u0017\u0010\"\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008 \u0010\u0019\u001a\u0004\u0008!\u0010\u001b\u00a8\u0006#"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lc41/i5;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lgz0/m0;",
        "icon",
        "",
        "isCompleted",
        "m",
        "(Lgz0/m0;ZLandroidx/compose/runtime/Composer;I)V",
        "Ly3/f;",
        "a",
        "F",
        "ICON_SIZE_DP",
        "b",
        "BOX_SIZE_DP",
        "c",
        "BORDER_WIDTH_DP",
        "d",
        "Lc41/i5;",
        "o",
        "()Lc41/i5;",
        "completedStatusTileStateSample",
        "e",
        "p",
        "notCompletedStatusTileStateSample",
        "f",
        "getNoIconStatusTileStateSample",
        "noIconStatusTileStateSample",
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
.field private static final a:F

.field private static final b:F

.field private static final c:F

.field private static final d:Lc41/i5;

.field private static final e:Lc41/i5;

.field private static final f:Lc41/i5;


# direct methods
.method static constructor <clinit>()V
    .locals 36

    const/4 v0, 0x3

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    sput v0, Lc41/h5;->a:F

    const/4 v0, 0x6

    int-to-float v0, v0

    mul-float/2addr v0, v1

    sput v0, Lc41/h5;->b:F

    const-wide v2, 0x3fd3333333333333L    # 0.3

    double-to-float v0, v2

    mul-float/2addr v0, v1

    sput v0, Lc41/h5;->c:F

    const-string v0, "MY JOURNAL"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v4, Lgz0/m0;->TINY_CHECKMARK:Lgz0/m0;

    new-instance v5, Lny0/h;

    const-string v1, "EDIT"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v7, Lgz0/m0;->PENCIL:Lgz0/m0;

    const v31, 0x1fffffc

    const/16 v32, 0x0

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

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v5 .. v32}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v11, v7

    new-instance v1, Lc41/i5;

    const/16 v9, 0x60

    move-object v6, v5

    const/4 v5, 0x1

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v10}, Lc41/i5;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZLny0/h;Lcom/whoop/navigation/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lc41/h5;->d:Lc41/i5;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    const-string v1, "Your journal isn\u2019t filled out yet. Track daily behaviors to understand their impact and improve your routine."

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    new-instance v7, Lny0/h;

    const-string v1, "FILL OUT"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const v33, 0x1fffffc

    const/16 v34, 0x0

    move-object v9, v11

    const/4 v11, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v7 .. v34}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v4

    new-instance v4, Lc41/i5;

    const/16 v12, 0x60

    const/4 v8, 0x0

    move-object v9, v7

    move-object v7, v1

    invoke-direct/range {v4 .. v13}, Lc41/i5;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZLny0/h;Lcom/whoop/navigation/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v4, Lc41/h5;->e:Lc41/i5;

    new-instance v5, Lc41/i5;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v8, Lny0/h;

    const-string v0, "ENABLE"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const v34, 0x1fffffe

    const/16 v35, 0x0

    const/4 v12, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v8 .. v35}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v13, 0x64

    move-object v10, v8

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-direct/range {v5 .. v14}, Lc41/i5;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;ZLny0/h;Lcom/whoop/navigation/e;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lc41/h5;->f:Lc41/i5;

    return-void
.end method

.method public static synthetic a(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lc41/h5;->l(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lgz0/m0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/h5;->n(Lgz0/m0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lc41/h5;->i(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc41/h5;->k(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc41/i5;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lc41/h5;->j(Lc41/i5;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc41/h5;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lc41/i5;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, 0x6e6ca5f4

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v8, 0x92

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v14, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_c

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move/from16 v17, v5

    move-object v5, v0

    move/from16 v0, v17

    goto :goto_6

    :cond_9
    move v0, v5

    move-object v5, v1

    :goto_6
    if-eqz v0, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_a

    new-instance v0, Lc31/m;

    const/16 v1, 0x19

    invoke-direct {v0, v1}, Lc31/m;-><init>(I)V

    invoke-virtual {v14, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v0, v6

    :goto_7
    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v6, 0x6

    invoke-virtual {v1, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->W0()J

    move-result-wide v7

    new-instance v1, La01/d;

    const/16 v6, 0x8

    invoke-direct {v1, v5, v2, v0, v6}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, -0x313ef27c

    invoke-static {v6, v14, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    and-int/lit8 v1, v3, 0xe

    const/high16 v3, 0xc00000

    or-int v15, v1, v3

    const/16 v16, 0x7a

    const/4 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v16}, Lrz0/e;->j(Landroidx/compose/ui/Modifier;Lrz0/f;JLt0/i;Lf0/t;Lrz0/a;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    move-object v1, v5

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v3, v6

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lc41/d1;

    const/4 v6, 0x6

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 61

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    and-int/lit8 v2, p4, 0x3

    const/4 v3, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v6, p4, 0x1

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v2, v6, :cond_1

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v2

    :cond_1
    move-object v13, v2

    check-cast v13, Lj0/i;

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_2

    if-ne v7, v6, :cond_3

    :cond_2
    new-instance v7, Lbs1/v;

    const/16 v2, 0x10

    invoke-direct {v7, v0, v1, v2}, Lbs1/v;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    const/16 v18, 0x1c

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v12, p0

    invoke-static/range {v12 .. v18}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v5, v5

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v5, v7

    invoke-virtual {v0}, Lc41/i5;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v8

    if-eqz v8, :cond_4

    move v8, v5

    goto :goto_1

    :cond_4
    int-to-float v8, v3

    mul-float/2addr v8, v7

    :goto_1
    invoke-static {v2, v5, v8}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0xc

    int-to-float v8, v8

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    const/4 v9, 0x0

    invoke-static {v2, v9, v8, v3}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v8, v9, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_5

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_5
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_2
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v11, v8, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v15, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_7

    :cond_6
    invoke-static {v9, v11, v9, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v11, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lb2/e;->K:Lb2/l;

    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v15, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v10, v3

    mul-float/2addr v10, v7

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/16 v3, 0x36

    invoke-static {v7, v2, v11, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    move-object/from16 p4, v4

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v0, p4

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 p4, v5

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v11, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v3, v11, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v11, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v4, v3

    const-wide/16 v17, 0x0

    cmpl-double v4, v4, v17

    if-lez v4, :cond_b

    goto :goto_4

    :cond_b
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v3, 0x36

    invoke-static {v0, v2, v11, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v2, v11, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v5, v11, Lp1/q;->S:Z

    if-eqz v5, :cond_c

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v11, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    :cond_d
    invoke-static {v2, v11, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v11, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->g()Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_f

    const v0, -0x1e72c1a

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_f
    const/4 v0, 0x0

    const v2, -0x1e72c19

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->g()Lgz0/m0;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->e()Z

    move-result v3

    invoke-static {v2, v3, v11, v0}, Lc41/h5;->m(Lgz0/m0;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lc41/i5;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v3, v15

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->c()Lny0/h;

    move-result-object v33

    if-nez v33, :cond_10

    const v1, 0x59d42ed2

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_7
    const/4 v5, 0x1

    goto :goto_8

    :cond_10
    const v4, 0x59d42ed3

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    new-instance v7, Lny0/d;

    invoke-direct {v7}, Lny0/d;-><init>()V

    const v59, 0x1ffdfff

    const/16 v60, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    invoke-static/range {v33 .. v60}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v9

    move-object/from16 v4, v33

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_11

    if-ne v8, v6, :cond_12

    :cond_11
    new-instance v8, Lc11/d;

    const/4 v5, 0x1

    invoke-direct {v8, v1, v4, v5}, Lc11/d;-><init>(Lkotlin/jvm/functions/Function1;Lny0/h;I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v10, v8

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x6

    move-object v8, v3

    invoke-virtual/range {v7 .. v12}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_7

    :goto_8
    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v1

    if-eqz v1, :cond_13

    const v1, 0x795411a3

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move/from16 v14, p4

    move-object v12, v3

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lc41/i5;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v1, v11, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v11, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v27

    invoke-virtual {v0, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object/from16 v29, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v29

    const/4 v1, 0x0

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v5, 0x1

    goto :goto_a

    :cond_13
    const/4 v1, 0x0

    const v0, 0x79581ba8

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_a
    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_14
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(Lc41/i5;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lc41/i5;->f()Lcom/whoop/navigation/e;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lny0/h;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lc41/h5;->g(Landroidx/compose/ui/Modifier;Lc41/i5;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lgz0/m0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v5, p2

    check-cast v5, Lp1/q;

    const p2, 0x1c2f4925

    invoke-virtual {v5, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p2

    invoke-virtual {v5, p2}, Lp1/q;->e(I)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v5, p1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    const/4 v8, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_4

    move v0, v8

    goto :goto_3

    :cond_4
    move v0, v2

    :goto_3
    and-int/2addr p2, v8

    invoke-virtual {v5, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_c

    const/4 p2, 0x6

    if-eqz p1, :cond_5

    const v0, -0x327e5b11

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v5, p2, v2}, Ldc/b;->e(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_4
    move-wide v3, v0

    goto :goto_5

    :cond_5
    const v0, -0x327e56d4

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v5, p2, v2}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_4

    :goto_5
    if-eqz p1, :cond_6

    const v0, -0x327e4eb0

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v5, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->V0()J

    move-result-wide v0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_6
    const v0, -0x327e4a54

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v5, p2, v2}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    :goto_6
    if-eqz p1, :cond_7

    sget-object v6, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    goto :goto_7

    :cond_7
    sget-object v6, Ly81/f;->TRANSPARENT:Ly81/f;

    :goto_7
    if-eqz p1, :cond_8

    const/4 v7, 0x0

    goto :goto_8

    :cond_8
    const v7, 0x3e4ccccd    # 0.2f

    :goto_8
    sget v9, Lc41/h5;->c:F

    invoke-static {v7, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    invoke-static {v9, v0, v1}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    sget-object v1, Lt0/j;->a:Lt0/i;

    iget v7, v0, Lf0/t;->a:F

    iget-object v0, v0, Lf0/t;->b:Li2/t;

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v9, v0, v1}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v7, Lc41/h5;->b:F

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v1}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v6, v5, v2}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    sget-object v1, Li2/w0;->a:Li2/v0;

    invoke-static {v0, v6, v7, v1}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v8}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    invoke-virtual {v5, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_9
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_9
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v5, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v5, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v2, v5, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v5, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    invoke-static {v0, v5, p2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v0

    const-string v1, "null"

    invoke-static {v1, v5, p2}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v9, v8}, Lgb1/h;->a(Landroidx/compose/ui/Modifier;Z)Landroidx/compose/ui/Modifier;

    move-result-object p2

    sget v2, Lc41/h5;->a:F

    invoke-static {v2, p2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_d

    new-instance v0, Lam0/b;

    const/4 v1, 0x7

    invoke-direct {v0, p0, p1, p3, v1}, Lam0/b;-><init>(Ljava/lang/Object;ZII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_d
    return-void
.end method

.method private static final n(Lgz0/m0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lc41/h5;->m(Lgz0/m0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final o()Lc41/i5;
    .locals 1

    sget-object v0, Lc41/h5;->d:Lc41/i5;

    return-object v0
.end method

.method public static final p()Lc41/i5;
    .locals 1

    sget-object v0, Lc41/h5;->e:Lc41/i5;

    return-object v0
.end method
