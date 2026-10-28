.class public abstract Lf01/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\"\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lf01/a1;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "a",
        "Ljava/util/List;",
        "getImageAndButtonCardPreviewStates",
        "()Ljava/util/List;",
        "imageAndButtonCardPreviewStates",
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
.field private static final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lf01/a1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 18

    new-instance v0, Lf01/a1;

    new-instance v1, Lkd1/o$c;

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/u;->c()I

    move-result v3

    invoke-static {v8}, Ldc/b;->d(Lx81/d;)I

    move-result v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const-string v2, ""

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v2, "Start Journaling Today"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, " Learn which behaviors unlock your best self. "

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "GET STARTED"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget-object v5, Lf01/x;->ONBOARDING:Lf01/x;

    new-instance v6, Lcom/whoop/navigation/e;

    const/4 v13, 0x7

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v0 .. v6}, Lf01/a1;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf01/x;Lcom/whoop/navigation/e;)V

    new-instance v1, Lf01/a1;

    new-instance v2, Lkd1/o$c;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/u;->c()I

    move-result v11

    invoke-static {v8}, Ldc/b;->d(Lx81/d;)I

    move-result v12

    const/16 v14, 0x8

    const/4 v15, 0x0

    const-string v10, ""

    const/4 v13, 0x0

    move-object v9, v2

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v3, "Your Dashboard is Empty"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "Monitor the data that is most important to you. You can change your Dashboard at any time."

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v9, "COMPLETE"

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget-object v6, Lf01/x;->NORMAL:Lf01/x;

    new-instance v7, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v10, v7

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct/range {v1 .. v7}, Lf01/a1;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf01/x;Lcom/whoop/navigation/e;)V

    new-instance v10, Lf01/a1;

    new-instance v11, Lkd1/o$c;

    invoke-virtual {v8}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->h()Lgz0/u;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/u;->c()I

    move-result v13

    invoke-static {v8}, Ldc/b;->d(Lx81/d;)I

    move-result v14

    const/16 v16, 0x8

    const/16 v17, 0x0

    const-string v12, ""

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v17}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v16, Lcom/whoop/navigation/e;

    const/4 v6, 0x7

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v16

    invoke-direct/range {v2 .. v7}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v16}, Lf01/a1;-><init>(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf01/x;Lcom/whoop/navigation/e;)V

    filled-new-array {v0, v1, v10}, [Lf01/a1;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lf01/z0;->a:Ljava/util/List;

    return-void
.end method

.method public static synthetic a(Lf01/a1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lf01/z0;->g(Lf01/a1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lf01/a1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lf01/z0;->f(Lf01/a1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lf01/z0;->e(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf01/a1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v3, 0x89098f0

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v5, v6, :cond_5

    move v5, v8

    goto :goto_4

    :cond_5
    move v5, v7

    :goto_4
    and-int/2addr v3, v8

    invoke-virtual {v11, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x3

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5}, Lt0/j;->e(F)Lt0/i;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->V0()J

    move-result-wide v9

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v12, v12

    invoke-virtual {v6, v11, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->W0()J

    move-result-wide v13

    invoke-static {v12, v13, v14}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v8

    int-to-float v6, v7

    mul-float/2addr v6, v4

    new-instance v4, Lf01/f;

    const/4 v7, 0x4

    invoke-direct {v4, v7, v0, v1}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v7, 0x5d7766d

    invoke-static {v7, v11, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v4

    const v12, 0x1b0006

    const/16 v13, 0x8

    move-wide v15, v9

    move v9, v6

    move-wide v6, v15

    move-object v10, v4

    move-object v4, v3

    invoke-static/range {v4 .. v13}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_7

    new-instance v4, Lf01/b;

    const/4 v5, 0x1

    invoke-direct {v4, v0, v1, v2, v5}, Lf01/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final e(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    and-int/lit8 v2, p3, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x0

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v4

    :goto_0
    and-int/lit8 v6, p3, 0x1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    const/4 v2, 0x3

    int-to-float v6, v2

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const-wide/high16 v8, 0x400c000000000000L    # 3.5

    double-to-float v8, v8

    mul-float/2addr v8, v7

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v8, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v8, v14, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v14, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v14, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v14, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v9, v14, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v14, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0x13

    int-to-float v6, v6

    const/4 v8, 0x4

    int-to-float v8, v8

    mul-float/2addr v6, v8

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v5, v5

    mul-float v17, v5, v7

    const/16 v20, 0x7

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v6, v19

    invoke-virtual {v0}, Lf01/a1;->e()Lkd1/o;

    move-result-object v7

    const/4 v11, 0x0

    const/4 v12, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v10, v14

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object/from16 v29, v10

    const/16 v15, 0x1b0

    const/16 v16, 0x78

    const-string v8, "Non-interactive Tile Image"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v9, v13

    const/4 v13, 0x0

    move-object v14, v9

    move-object v9, v5

    move-object v5, v14

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v0}, Lf01/a1;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    const/4 v8, 0x6

    if-eqz v7, :cond_4

    const v7, -0x39b1c373

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lf01/a1;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v14, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v14, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v9, v14, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->Q()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    move v9, v8

    const/4 v8, 0x0

    move v13, v9

    move-wide v9, v10

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v30, v28

    const/16 v28, 0x0

    move/from16 v33, v30

    const/16 v30, 0x0

    move/from16 v3, v33

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v29

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move v3, v8

    const v7, -0x39ae8215

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v0}, Lf01/a1;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-eqz v7, :cond_5

    const v7, -0x39ad6108

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lf01/a1;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v14, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v14, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v8, v14, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    new-instance v8, Lw3/k;

    invoke-direct {v8, v2}, Lw3/k;-><init>(I)V

    const/16 v31, 0x0

    const v32, 0x2fdfa

    move-object/from16 v19, v8

    const/4 v8, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v29

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    const v2, -0x39a99a95

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    :goto_3
    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v15, v5

    move/from16 v17, v6

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lf01/a1;->f()Lf01/x;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lf01/x;->getButtonBrush()Lj91/b;

    move-result-object v5

    goto :goto_4

    :cond_6
    move-object v5, v6

    :goto_4
    if-nez v5, :cond_7

    const v5, -0x39a69928

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    move-object v5, v6

    goto :goto_5

    :cond_7
    const v7, -0x39a69927

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-interface {v5, v14, v4}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object v5

    invoke-static {v15, v5}, Lny0/u;->o(Landroidx/compose/ui/Modifier;Li2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    :goto_5
    invoke-static {v2, v5}, Lgb1/d;->f(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lny0/v;->TextMedium:Lny0/v;

    invoke-virtual {v0}, Lf01/a1;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v14, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v0}, Lf01/a1;->f()Lf01/x;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Lf01/x;->getButtonColor()Ly81/f;

    move-result-object v2

    goto :goto_6

    :cond_8
    move-object v2, v6

    :goto_6
    if-nez v2, :cond_9

    const v2, -0x39a2b529

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v5, 0x7a03026a

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v14, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v14, v4, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v6

    :goto_7
    if-nez v6, :cond_a

    const v2, 0x7a030781

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-static {v2, v14, v3, v4}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v2

    :goto_8
    move-wide v11, v2

    goto :goto_9

    :cond_a
    const v2, 0x7a02fee8

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v4}, Lp1/q;->q(Z)V

    iget-wide v2, v6, Li2/x;->a:J

    goto :goto_8

    :goto_9
    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_b

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v3, v2, :cond_c

    :cond_b
    new-instance v3, Ld30/l;

    const/16 v2, 0x1b

    invoke-direct {v3, v2, v0, v1}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v15, v3

    check-cast v15, Lc93/a;

    const/16 v17, 0x30

    const/16 v18, 0x68

    const/4 v10, 0x0

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x0

    move-object/from16 v16, v29

    invoke-static/range {v7 .. v18}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v14, v16

    const/4 v0, 0x1

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_d
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_a
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lf01/a1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lf01/a1;->c()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lf01/a1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lf01/z0;->d(Lf01/a1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
