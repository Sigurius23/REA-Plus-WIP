.class public abstract Lbm2/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0011\u0010\u0012\u001a\u00020\u0011*\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017\"\u0014\u0010\u001b\u001a\u00020\u00008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lbm2/r0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lbm2/r0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisModel;",
        "j",
        "(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;)Lbm2/r0;",
        "",
        "style",
        "Ly81/f;",
        "i",
        "(Ljava/lang/String;)Ly81/f;",
        "Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;",
        "Lbm2/n0;",
        "h",
        "(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;)Lbm2/n0;",
        "",
        "Lbm2/m0;",
        "a",
        "Ljava/util/List;",
        "segments",
        "b",
        "Lbm2/r0;",
        "segmentalAnalysisViewState",
        "trends_release"
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
            "Lbm2/m0;",
            ">;"
        }
    .end annotation
.end field

.field private static final b:Lbm2/r0;


# direct methods
.method static constructor <clinit>()V
    .locals 38

    new-instance v0, Lbm2/m0;

    const-string v1, "ARMS"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lbm2/o0;

    const-string v3, "80.2%"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "19.8%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lhy0/c2;

    const-string v6, "1.3%"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget-object v8, Lhy0/b2;->POSITIVE:Lhy0/b2;

    const/16 v21, 0x7ff8

    const/16 v22, 0x0

    const/4 v7, 0x1

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

    invoke-direct/range {v5 .. v22}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v2, v3, v4, v5}, Lbm2/o0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V

    new-instance v6, Lbm2/n0;

    sget-object v12, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    const-wide v7, 0x3fd3333333333333L    # 0.3

    const-wide v9, 0x3fe3333333333333L    # 0.6

    move-object v11, v12

    invoke-direct/range {v6 .. v11}, Lbm2/n0;-><init>(DDLy81/e;)V

    new-instance v13, Lbm2/n0;

    sget-object v19, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    const-wide v14, 0x3fe9eb851eb851ecL    # 0.81

    const-wide v16, 0x3fd851eb851eb852L    # 0.38

    move-object/from16 v18, v19

    invoke-direct/range {v13 .. v18}, Lbm2/n0;-><init>(DDLy81/e;)V

    filled-new-array {v6, v13}, [Lbm2/n0;

    move-result-object v3

    invoke-static {v3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    new-instance v7, Lbm2/n0;

    const-wide v8, 0x3fd851eb851eb852L    # 0.38

    const-wide v10, 0x3fe851eb851eb852L    # 0.76

    invoke-direct/range {v7 .. v12}, Lbm2/n0;-><init>(DDLy81/e;)V

    new-instance v14, Lbm2/n0;

    const-wide v15, 0x3fec28f5c28f5c29L    # 0.88

    const-wide v17, 0x3fceb851eb851eb8L    # 0.24

    invoke-direct/range {v14 .. v19}, Lbm2/n0;-><init>(DDLy81/e;)V

    filled-new-array {v7, v14}, [Lbm2/n0;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lbm2/m0;-><init>(Lcom/whoop/design/util/TextResource;Lbm2/o0;Ljava/util/List;Ljava/util/List;)V

    new-instance v1, Lbm2/m0;

    const-string v2, "TORSO"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v3, Lbm2/o0;

    const-string v4, "64.3%"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const-string v5, "35.7%"

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    new-instance v20, Lhy0/c2;

    const-string v6, "2.4%"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    sget-object v23, Lhy0/b2;->NEGATIVE:Lhy0/b2;

    const/16 v36, 0x7ff8

    const/16 v37, 0x0

    const/16 v22, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    invoke-direct/range {v20 .. v37}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v20

    invoke-direct {v3, v4, v5, v6}, Lbm2/o0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V

    new-instance v7, Lbm2/n0;

    const-wide v8, 0x3fd49374bc6a7efaL    # 0.3215

    const-wide v10, 0x3fe49374bc6a7efaL    # 0.643

    invoke-direct/range {v7 .. v12}, Lbm2/n0;-><init>(DDLy81/e;)V

    new-instance v14, Lbm2/n0;

    const-wide v15, 0x3fea666666666666L    # 0.825

    const-wide v17, 0x3fd6666666666666L    # 0.35

    invoke-direct/range {v14 .. v19}, Lbm2/n0;-><init>(DDLy81/e;)V

    filled-new-array {v7, v14}, [Lbm2/n0;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    invoke-direct {v1, v2, v3, v4, v5}, Lbm2/m0;-><init>(Lcom/whoop/design/util/TextResource;Lbm2/o0;Ljava/util/List;Ljava/util/List;)V

    filled-new-array {v0, v1}, [Lbm2/m0;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    sput-object v7, Lbm2/q0;->a:Ljava/util/List;

    new-instance v1, Lbm2/r0;

    const-string v0, "SEGMENTAL BODY COMPOSITION"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/q;->o()I

    move-result v2

    const-string v3, "VS. LAST WEEK"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lbm2/k0;

    invoke-direct {v4, v0, v3, v2}, Lbm2/k0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V

    const-string v0, "LEAN BODY MASS"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v0, "BODY FAT"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v5, Lbm2/j0;

    sget-object v2, Lgz0/m0;->MISSING_DATA:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    const-string v6, "NO DATA"

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const-string v8, "You don\'t have data to display for the selected date range. Step on the scales to update your data"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v5, v2, v6, v8}, Lbm2/j0;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    new-instance v6, Lam2/o;

    const-string v2, "Last updated: Today, 9:53am"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v8, "Imported from"

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    const/4 v9, 0x0

    invoke-direct {v6, v2, v8, v9}, Lam2/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    move-object v2, v4

    move-object v4, v0

    invoke-direct/range {v1 .. v7}, Lbm2/r0;-><init>(Lbm2/k0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/j0;Lam2/o;Ljava/util/List;)V

    sput-object v1, Lbm2/q0;->b:Lbm2/r0;

    return-void
.end method

.method public static synthetic a(Lbm2/r0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbm2/q0;->g(Lbm2/r0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbm2/q0;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;Lbm2/j0;Lam2/o;Lbm2/k0;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbm2/q0;->e(Ljava/util/List;Lbm2/j0;Lam2/o;Lbm2/k0;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lbm2/r0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbm2/r0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v10, p3

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v1, 0x56888691

    invoke-virtual {v11, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v4, v10, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit8 v4, v1, 0x13

    const/16 v5, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v4, v5, :cond_4

    move v4, v8

    goto :goto_3

    :cond_4
    move v4, v7

    :goto_3
    and-int/2addr v1, v8

    invoke-virtual {v11, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0}, Lbm2/r0;->b()Lbm2/k0;

    move-result-object v5

    invoke-virtual {v0}, Lbm2/r0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lbm2/r0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lbm2/r0;->a()Lbm2/j0;

    move-result-object v4

    move-object v9, v4

    invoke-virtual {v0}, Lbm2/r0;->c()Lam2/o;

    move-result-object v4

    invoke-virtual {v0}, Lbm2/r0;->g()Ljava/util/List;

    move-result-object v12

    int-to-float v2, v2

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v2, v13

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v2, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v2}, Lkd1/w;->a()Lk91/a;

    move-result-object v2

    invoke-virtual {v2}, Lk91/a;->c()Lt0/i;

    move-result-object v14

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v15, Lx81/d;->b:I

    invoke-virtual {v2, v11, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->a1()J

    move-result-wide v15

    int-to-float v2, v7

    int-to-float v3, v3

    mul-float v17, v2, v3

    move-object v7, v1

    new-instance v1, Lbm2/p0;

    move-object v3, v9

    const/4 v9, 0x0

    move-object v2, v12

    invoke-direct/range {v1 .. v9}, Lbm2/p0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v2, 0x14618574

    invoke-static {v2, v11, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const v19, 0x1b0006

    const/16 v20, 0x18

    move-object/from16 v18, v11

    move-object v11, v13

    move-object v12, v14

    move-wide v13, v15

    const/4 v15, 0x0

    move/from16 v16, v17

    move-object/from16 v17, v1

    invoke-static/range {v11 .. v20}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    move-object/from16 v18, v11

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    :goto_4
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_6

    new-instance v2, Lk;

    const/16 v3, 0x16

    invoke-direct {v2, v0, v6, v10, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final e(Ljava/util/List;Lbm2/j0;Lam2/o;Lbm2/k0;Lkotlin/jvm/functions/Function1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 53

    sget-object v2, Lb2/e;->w:Lb2/m;

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v4, Lb2/e;->M:Lb2/k;

    and-int/lit8 v5, p8, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x2

    if-eq v5, v8, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    move v5, v7

    :goto_0
    and-int/lit8 v9, p8, 0x1

    move-object/from16 v15, p7

    check-cast v15, Lp1/q;

    invoke-virtual {v15, v9, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_34

    int-to-float v5, v8

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v10, v5, v9

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Ll0/m;->c:Ll0/g;

    invoke-static {v13, v4, v15, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move/from16 v36, v9

    iget-wide v8, v15, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v15, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v7, v15, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v15, v7, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v15, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    move/from16 v38, v5

    iget-boolean v5, v15, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v20, v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    goto :goto_2

    :cond_2
    move/from16 v20, v10

    :goto_2
    invoke-static {v8, v15, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v15, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/m;->a:Ll0/e;

    sget-object v8, Lb2/e;->J:Lb2/l;

    move-object/from16 p7, v13

    const/4 v13, 0x0

    invoke-static {v12, v8, v15, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 p8, v12

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-eqz v0, :cond_4

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_3
    invoke-static {v15, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v15, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v0, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v12, v15, v12, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v15, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x6

    int-to-float v8, v0

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v8, v10

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual/range {p3 .. p3}, Lbm2/k0;->a()I

    move-result v8

    invoke-static {v8, v15, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v8

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v0, Lx81/d;->b:I

    invoke-virtual {v13, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->c1()J

    move-result-wide v16

    move-object/from16 v18, v13

    move-wide/from16 v51, v16

    move-object/from16 v17, v14

    move-wide/from16 v13, v51

    const/16 v16, 0x1b0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v21, v11

    const-string v11, ""

    move-object/from16 v41, p8

    move-object/from16 v39, v2

    move-object/from16 v43, v3

    move/from16 v42, v10

    move-object/from16 v3, v18

    move/from16 v40, v20

    move-object/from16 v1, v21

    move-object/from16 v2, p7

    move-object v10, v8

    move-object/from16 v8, v19

    invoke-static/range {v10 .. v17}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    int-to-float v11, v10

    mul-float v10, v11, v36

    const/4 v12, 0x0

    const/4 v13, 0x2

    invoke-static {v1, v10, v12, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v13, 0x0

    invoke-static {v2, v4, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_7

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v15, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_8

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v2, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    invoke-static {v13, v15, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v15, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p3 .. p3}, Lbm2/k0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v15, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v12

    new-instance v14, Lw3/k;

    move-object/from16 p8, v2

    const/4 v2, 0x1

    invoke-direct {v14, v2}, Lw3/k;-><init>(I)V

    invoke-virtual {v3, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->r()Lb91/a;

    move-result-object v30

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v34, v2, 0x12

    const v35, 0x2fdfa

    move v2, v11

    const/4 v11, 0x0

    move-object/from16 v22, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    move/from16 v44, v2

    move-object/from16 v45, v4

    move v2, v10

    const/4 v4, 0x0

    move-object/from16 v10, p8

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    invoke-virtual/range {p3 .. p3}, Lbm2/k0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-eqz v10, :cond_a

    const v10, -0x2fb18590

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-virtual/range {p3 .. p3}, Lbm2/k0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10, v15, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->b1()J

    move-result-wide v12

    new-instance v11, Lw3/k;

    const/4 v14, 0x1

    invoke-direct {v11, v14}, Lw3/k;-><init>(I)V

    invoke-virtual {v3, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->t()Lb91/a;

    move-result-object v30

    const/16 v33, 0x0

    const v35, 0x2fdfa

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_5
    const/4 v10, 0x1

    goto :goto_6

    :cond_a
    const/4 v13, 0x0

    const v10, -0x2fac9fc2

    invoke-virtual {v15, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_5

    :goto_6
    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v11, v10

    const-wide/16 v46, 0x0

    cmpl-double v11, v11, v46

    const-string v48, "invalid weight; must be greater than zero"

    if-lez v11, :cond_b

    goto :goto_7

    :cond_b
    invoke-static/range {v48 .. v48}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v49, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v10, v49

    if-lez v12, :cond_c

    move/from16 v10, v49

    :goto_8
    const/4 v14, 0x1

    goto :goto_9

    :cond_c
    const/high16 v10, 0x3f800000    # 1.0f

    goto :goto_8

    :goto_9
    invoke-direct {v11, v10, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v15, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v17, Lny0/q$g;->f:Lny0/q$g;

    invoke-virtual {v3}, Lx81/d;->d()Lgz0/o0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v10

    invoke-virtual {v10}, Lgz0/i0;->w()I

    move-result v18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_d

    sget-object v10, Lbm2/q0$a;->w:Lbm2/q0$a;

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v11, :cond_e

    sget-object v10, Lbm2/q0$b;->w:Lbm2/q0$b;

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v20

    new-instance v10, Lny0/o;

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x3f0

    const/16 v28, 0x0

    move-object/from16 v16, v10

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v12, Lsl2/a;->j:I

    invoke-static {v15, v12}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v12

    move-object/from16 v13, p4

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v14, :cond_f

    if-ne v4, v11, :cond_10

    :cond_f
    new-instance v4, Lbm2/w;

    const/4 v11, 0x2

    invoke-direct {v4, v13, v11}, Lbm2/w;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v4

    check-cast v14, Lc93/a;

    sget v16, Lny0/o;->k:I

    const/16 v17, 0xc

    move-object v11, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v17}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v10, 0x30

    move-object/from16 v12, v41

    move-object/from16 v11, v43

    invoke-static {v12, v11, v15, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v15, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v15, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-nez v6, :cond_12

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    invoke-static {v13, v15, v13, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v15, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, p5

    invoke-static {v4, v15, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->i0()J

    move-result-wide v12

    new-instance v4, Lw3/k;

    const/4 v14, 0x1

    invoke-direct {v4, v14}, Lw3/k;-><init>(I)V

    invoke-virtual {v3, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->s()Lb91/a;

    move-result-object v30

    const/16 v33, 0x0

    const v35, 0x2fdfa

    move-object/from16 v43, v11

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v22, v4

    move-object/from16 v4, v43

    const/16 v5, 0x30

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v6, v10

    cmpl-double v6, v6, v46

    if-lez v6, :cond_14

    goto :goto_b

    :cond_14
    invoke-static/range {v48 .. v48}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v10, v49

    if-lez v7, :cond_15

    move/from16 v7, v49

    :goto_c
    const/4 v10, 0x1

    goto :goto_d

    :cond_15
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_c

    :goto_d
    invoke-direct {v6, v7, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v15, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move-object/from16 v6, p6

    invoke-static {v6, v15, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v15, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->o0()J

    move-result-wide v12

    new-instance v6, Lw3/k;

    invoke-direct {v6, v10}, Lw3/k;-><init>(I)V

    invoke-virtual {v3, v15, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->s()Lb91/a;

    move-result-object v30

    const/16 v33, 0x0

    const v35, 0x2fdfa

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object v10, v2

    move-object/from16 v22, v6

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    if-nez p0, :cond_16

    const v2, 0x4d04cabd    # 1.3924245E8f

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_1b

    :cond_16
    const v2, 0x4d04cabe    # 1.3924246E8f

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    move-object/from16 v2, p0

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbm2/m0;

    move/from16 v6, v40

    const/4 v7, 0x0

    const/4 v10, 0x1

    invoke-static {v1, v7, v6, v10}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v7, Ll0/m;->c:Ll0/g;

    move-object/from16 v9, v45

    const/4 v13, 0x0

    invoke-static {v7, v9, v15, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_17

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_17
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_f
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v15, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v15, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-nez v14, :cond_18

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    invoke-static {v10, v15, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lbm2/m0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v8, v15, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v14, v15, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->d1()J

    move-result-wide v16

    move-object/from16 v43, v2

    new-instance v2, Lw3/k;

    move-object/from16 v45, v3

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lw3/k;-><init>(I)V

    invoke-virtual {v14, v15, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->M()Lb91/a;

    move-result-object v30

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v34, v3, 0x12

    const v35, 0x2fdfa

    move-object v3, v11

    const/4 v11, 0x0

    move-object/from16 v18, v14

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    move-object/from16 v19, v13

    move-wide/from16 v51, v16

    move-object/from16 v17, v12

    move-wide/from16 v12, v51

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v23, v19

    move-object/from16 v22, v20

    const-wide/16 v19, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v25, v23

    move-object/from16 v26, v24

    const-wide/16 v23, 0x0

    move-object/from16 v27, v25

    const/16 v25, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v29, v27

    const/16 v27, 0x0

    move-object/from16 v31, v28

    const/16 v28, 0x0

    move-object/from16 v33, v29

    const/16 v29, 0x0

    move-object/from16 v49, v31

    const/16 v31, 0x0

    move-object/from16 v50, v33

    const/16 v33, 0x0

    move-object/from16 v51, v22

    move-object/from16 v22, v2

    move-object/from16 v2, v51

    move-object/from16 v51, v8

    move-object v8, v3

    move-object/from16 v3, v50

    move-object/from16 v50, v9

    move-object/from16 v9, v49

    move/from16 v49, v6

    move v6, v10

    move-object/from16 v10, v51

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v10

    mul-float v10, v10, v36

    const/4 v11, 0x0

    const/4 v14, 0x1

    invoke-static {v1, v11, v10, v14}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v11, v4, v15, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v12, v15, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-eqz v14, :cond_1a

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v15, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-nez v11, :cond_1b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_1c

    :cond_1b
    invoke-static {v12, v15, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v15, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->d()Lbm2/o0;

    move-result-object v10

    invoke-virtual {v10}, Lbm2/o0;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10, v15, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v9, v15, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->i0()J

    move-result-wide v12

    new-instance v11, Lw3/k;

    const/4 v14, 0x1

    invoke-direct {v11, v14}, Lw3/k;-><init>(I)V

    invoke-virtual {v9, v15, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->C()Lb91/a;

    move-result-object v30

    const/16 v33, 0x0

    const v35, 0x2fdfa

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    mul-float v10, v38, v42

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v15, v11}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->d()Lbm2/o0;

    move-result-object v11

    invoke-virtual {v11}, Lbm2/o0;->c()Lhy0/c2;

    move-result-object v11

    sget v12, Lhy0/c2;->p:I

    invoke-static {v11, v15, v12}, Lhy0/z1;->c(Lhy0/c2;Landroidx/compose/runtime/Composer;I)V

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v12, v11

    cmpl-double v12, v12, v46

    if-lez v12, :cond_1d

    goto :goto_11

    :cond_1d
    invoke-static/range {v48 .. v48}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v14, 0x1

    invoke-direct {v12, v11, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v15, v12}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->d()Lbm2/o0;

    move-result-object v11

    invoke-virtual {v11}, Lbm2/o0;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static {v11, v15, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v9, v15, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->o0()J

    move-result-wide v12

    new-instance v11, Lw3/k;

    invoke-direct {v11, v14}, Lw3/k;-><init>(I)V

    invoke-virtual {v9, v15, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->C()Lb91/a;

    move-result-object v30

    const/16 v33, 0x0

    const v35, 0x2fdfa

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move v5, v10

    move-object v10, v6

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    move-object/from16 v6, v39

    const/4 v13, 0x0

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v15, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v15, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-eqz v13, :cond_1e

    invoke-virtual {v15, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1e
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v15, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_1f

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_20

    :cond_1f
    invoke-static {v10, v15, v10, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v15, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x138bedd6

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_13
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v7, 0x0

    sget-object v8, Li2/w0;->a:Li2/v0;

    if-eqz v3, :cond_24

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v9, v2, 0x1

    if-ltz v2, :cond_23

    check-cast v3, Lbm2/n0;

    if-nez v2, :cond_22

    mul-float v11, v44, v42

    const/16 v2, 0xe

    const/4 v7, 0x0

    invoke-static {v11, v7, v7, v7, v2}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v8

    :cond_21
    :goto_14
    const/4 v2, 0x3

    goto :goto_15

    :cond_22
    const/4 v7, 0x0

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->a()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    const/16 v37, 0x1

    add-int/lit8 v10, v10, -0x1

    if-ne v2, v10, :cond_21

    mul-float v11, v44, v42

    const/16 v2, 0xd

    invoke-static {v7, v11, v7, v7, v2}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v8

    goto :goto_14

    :goto_15
    int-to-float v7, v2

    mul-float v7, v7, v42

    invoke-static {v7, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3}, Lbm2/n0;->a()D

    move-result-wide v10

    double-to-float v7, v10

    invoke-virtual {v3}, Lbm2/n0;->c()D

    move-result-wide v10

    double-to-float v10, v10

    sget-object v11, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v11}, Lp91/a$a;->a()Lp91/a;

    move-result-object v11

    const/high16 v12, 0x3f000000    # 0.5f

    const/high16 v13, 0x3f800000    # 1.0f

    move-object/from16 p3, v2

    move/from16 p4, v7

    move/from16 p6, v10

    move-object/from16 p8, v11

    move/from16 p5, v12

    move/from16 p7, v13

    invoke-static/range {p3 .. p8}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v3}, Lbm2/n0;->b()Ly81/e;

    move-result-object v3

    const/4 v13, 0x0

    invoke-interface {v3, v15, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-static {v2, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v15, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v2, v9

    goto :goto_13

    :cond_23
    invoke-static {}, Lwb3/f;->d0()V

    throw v7

    :cond_24
    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    const-wide v2, 0x3fc999999999999aL    # 0.2

    double-to-float v0, v2

    mul-float v0, v0, v36

    const/4 v2, 0x0

    const/16 v3, 0xd

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 p5, v0

    move-object/from16 p3, v1

    move/from16 p7, v2

    move/from16 p8, v3

    move/from16 p4, v9

    move/from16 p6, v10

    invoke-static/range {p3 .. p8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v9, v15, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v11, v15, Lp1/q;->S:Z

    if-eqz v11, :cond_25

    invoke-virtual {v15, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_25
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_16
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v15, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v9, v15, Lp1/q;->S:Z

    if-nez v9, :cond_26

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_27

    :cond_26
    invoke-static {v3, v15, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->b()Ljava/util/List;

    move-result-object v0

    if-nez v0, :cond_28

    const v0, 0x5fa01f0e

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    :goto_17
    const/4 v14, 0x1

    goto/16 :goto_1a

    :cond_28
    const v2, 0x5fa01f0f

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2c

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v9, v2, 0x1

    if-ltz v2, :cond_2b

    check-cast v3, Lbm2/n0;

    if-nez v2, :cond_29

    mul-float v11, v44, v42

    const/4 v2, 0x7

    const/4 v10, 0x0

    invoke-static {v10, v10, v10, v11, v2}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v2

    goto :goto_19

    :cond_29
    const/4 v10, 0x0

    invoke-virtual/range {v45 .. v45}, Lbm2/m0;->a()Ljava/util/List;

    move-result-object v11

    invoke-interface {v11}, Ljava/util/List;->size()I

    move-result v11

    const/16 v37, 0x1

    add-int/lit8 v11, v11, -0x1

    if-ne v2, v11, :cond_2a

    mul-float v11, v44, v42

    const/16 v2, 0xb

    invoke-static {v10, v10, v11, v10, v2}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object v2

    goto :goto_19

    :cond_2a
    move-object v2, v8

    :goto_19
    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3}, Lbm2/n0;->a()D

    move-result-wide v12

    double-to-float v12, v12

    invoke-virtual {v3}, Lbm2/n0;->c()D

    move-result-wide v13

    double-to-float v13, v13

    sget-object v14, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v14}, Lp91/a$a;->a()Lp91/a;

    move-result-object v14

    const/high16 v16, 0x3f000000    # 0.5f

    const/high16 v17, 0x3f800000    # 1.0f

    move-object/from16 p3, v11

    move/from16 p4, v12

    move/from16 p6, v13

    move-object/from16 p8, v14

    move/from16 p5, v16

    move/from16 p7, v17

    invoke-static/range {p3 .. p8}, Lp91/e;->e(Landroidx/compose/ui/Modifier;FFFFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3}, Lbm2/n0;->b()Ly81/e;

    move-result-object v3

    move-object/from16 p3, v7

    move-object/from16 p4, v8

    const/4 v13, 0x0

    invoke-interface {v3, v15, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const/high16 v3, 0x3f000000    # 0.5f

    invoke-static {v3, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v7

    invoke-static {v11, v7, v8, v2}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v15, v13}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move v2, v9

    goto :goto_18

    :cond_2b
    move-object/from16 p3, v7

    invoke-static {}, Lwb3/f;->d0()V

    throw p3

    :cond_2c
    const/4 v10, 0x0

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto/16 :goto_17

    :goto_1a
    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v15, v14}, Lp1/q;->q(Z)V

    move-object/from16 v39, v6

    move-object/from16 v2, v43

    move/from16 v40, v49

    move-object/from16 v45, v50

    const/16 v5, 0x30

    goto/16 :goto_e

    :cond_2d
    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_1b
    if-eqz p1, :cond_2e

    move-object/from16 v0, p0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_2f

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2e

    goto :goto_1c

    :cond_2e
    const/4 v13, 0x0

    goto/16 :goto_1e

    :cond_2f
    :goto_1c
    const v0, 0x4d495803    # 2.1112427E8f

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v2, 0x3faaaaab

    const/4 v13, 0x0

    invoke-static {v0, v13, v2}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Ll0/m;->e:Ll0/h;

    sget-object v3, Lb2/e;->N:Lb2/k;

    const/16 v4, 0x36

    invoke-static {v2, v3, v15, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v3, v15, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v15, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v6, v15, Lp1/q;->S:Z

    if-eqz v6, :cond_30

    invoke-virtual {v15, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_30
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_1d
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v15, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v15, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-nez v4, :cond_31

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_32

    :cond_31
    invoke-static {v3, v15, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_32
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v15, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lbm2/j0;->b()I

    move-result v0

    const/4 v2, 0x6

    invoke-static {v0, v15, v2}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v10

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v0, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v13

    const/16 v16, 0x30

    const/16 v17, 0x4

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p1 .. p1}, Lbm2/j0;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v15, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v12

    invoke-virtual {v0, v15, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->q()Lb91/a;

    move-result-object v30

    mul-float v3, v42, v42

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 p3, v1

    move/from16 p5, v3

    move/from16 p7, v5

    move/from16 p8, v6

    move/from16 p4, v7

    move/from16 p6, v8

    invoke-static/range {p3 .. p8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v3, p3

    move/from16 v1, p5

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v34, v5, 0x12

    const v35, 0x2fff8

    move-object/from16 v32, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x30

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    invoke-virtual/range {p1 .. p1}, Lbm2/j0;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v15, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v0, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v12

    invoke-virtual {v0, v15, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v30

    const/16 v0, 0xc

    int-to-float v0, v0

    mul-float v0, v0, v42

    const/4 v2, 0x0

    const/16 v4, 0x8

    move v5, v0

    move/from16 p4, v0

    move/from16 p7, v2

    move/from16 p8, v4

    move/from16 p6, v5

    invoke-static/range {p3 .. p8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v0, Lw3/k;

    const/4 v2, 0x3

    invoke-direct {v0, v2}, Lw3/k;-><init>(I)V

    const/16 v33, 0x0

    const v35, 0x2fdf8

    const-wide/16 v14, 0x0

    move-object/from16 v22, v0

    invoke-static/range {v10 .. v35}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v32

    const/4 v10, 0x1

    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_1f

    :goto_1e
    const v0, 0x4d5bf3b8

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_1f
    if-eqz p2, :cond_33

    const v0, 0x4d5c978f    # 2.313075E8f

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    int-to-float v0, v13

    mul-float v0, v0, v36

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    const/16 v41, 0x30

    or-int/lit8 v1, v1, 0x30

    move-object/from16 v2, p2

    invoke-static {v2, v0, v15, v1, v13}, Lam2/o0;->e0(Lam2/o;FLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_20
    const/4 v10, 0x1

    goto :goto_21

    :cond_33
    const v0, 0x4d5e21b8    # 2.3292198E8f

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_20

    :goto_21
    invoke-virtual {v15, v10}, Lp1/q;->q(Z)V

    goto :goto_22

    :cond_34
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_22
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lbm2/l0;->EDUCATION:Lbm2/l0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lbm2/r0;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbm2/q0;->d(Lbm2/r0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;)Lbm2/n0;
    .locals 8

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lbm2/n0;

    invoke-virtual {p0}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;->getEndX()D

    move-result-wide v2

    invoke-virtual {p0}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;->getStartX()D

    move-result-wide v4

    add-double/2addr v4, v2

    const/4 v0, 0x2

    int-to-double v2, v0

    div-double v2, v4, v2

    invoke-virtual {p0}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;->getEndX()D

    move-result-wide v4

    invoke-virtual {p0}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;->getStartX()D

    move-result-wide v6

    sub-double/2addr v4, v6

    invoke-virtual {p0}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lbm2/q0;->i(Ljava/lang/String;)Ly81/f;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lbm2/n0;-><init>(DDLy81/e;)V

    return-object v1
.end method

.method public static final i(Ljava/lang/String;)Ly81/f;
    .locals 1

    const-string v0, "style"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "LEAN_BODY_MASS"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0

    :cond_0
    const-string v0, "BODY_FAT"

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    sget-object p0, Ly81/f;->STRAIN_ZONE_4:Ly81/f;

    return-object p0

    :cond_1
    sget-object p0, Ly81/f;->SLEEP_LIGHT_SLEEP:Ly81/f;

    return-object p0
.end method

.method public static final j(Lcom/whoop/trends/data/model/SegmentalAnalysisModel;)Lbm2/r0;
    .locals 32

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getHeader()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;->getTitle()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getHeader()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;->getIcon()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getHeader()Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/trends/data/model/SegmentalAnalysisHeaderModel;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v5, Lbm2/k0;

    invoke-direct {v5, v0, v3, v2}, Lbm2/k0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;I)V

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getPrimarySectionLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getSecondarySectionLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getEmptyState()Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;

    move-result-object v0

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    new-instance v3, Lbm2/j0;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;->getIcon()Lgz0/m0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;->getTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/SegmentalAnalysisEmptyStateModel;->getDescription()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-direct {v3, v4, v8, v0}, Lbm2/j0;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object v8, v3

    goto :goto_0

    :cond_0
    move-object v8, v2

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getLastUpdated()Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;

    move-result-object v0

    if-eqz v0, :cond_1

    new-instance v3, Lam2/o;

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;->getLeadingText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;->getTrailingText()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/trends/data/model/TimeSegmentLastUpdated;->getTrailingImage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v3, v4, v9, v0}, Lam2/o;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    move-object v9, v3

    goto :goto_1

    :cond_1
    move-object v9, v2

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/trends/data/model/SegmentalAnalysisModel;->getSegments()Ljava/util/List;

    move-result-object v0

    if-eqz v0, :cond_6

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    new-instance v11, Lbm2/o0;

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getTrendStat()Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;

    move-result-object v12

    invoke-virtual {v12}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;->getStatPrimaryDisplay()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getTrendStat()Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;

    move-result-object v13

    invoke-virtual {v13}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;->getStatSecondaryDisplay()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    new-instance v14, Lhy0/c2;

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getTrendStat()Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;

    move-result-object v15

    invoke-virtual {v15}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;->getStatPrimaryChangeDisplay()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getTrendStat()Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendStatModel;->getStatTrend()Lhy0/b2;

    move-result-object v17

    const/16 v30, 0x7ff8

    const/16 v31, 0x0

    const/16 v16, 0x1

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

    invoke-direct/range {v14 .. v31}, Lhy0/c2;-><init>(Lcom/whoop/design/util/TextResource;ZLhy0/b2;ZLgz0/m0;Lhy0/s0;ZZIIFLcom/whoop/navigation/e;Ljava/lang/Float;FLl0/k1;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v11, v12, v13, v14}, Lbm2/o0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/c2;)V

    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getMostRecentReading()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v13, Ljava/util/ArrayList;

    invoke-static {v12, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v13, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_3
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_2

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;

    invoke-static {v14}, Lbm2/q0;->h(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;)Lbm2/n0;

    move-result-object v14

    invoke-interface {v13, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_2
    invoke-virtual {v4}, Lcom/whoop/trends/data/model/SegmentalAnalysisSegmentModel;->getPreviousReading()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_3

    check-cast v4, Ljava/lang/Iterable;

    new-instance v12, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v12, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_4
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_4

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;

    invoke-static {v14}, Lbm2/q0;->h(Lcom/whoop/trends/data/model/SegmentalAnalysisTrendReadingModel;)Lbm2/n0;

    move-result-object v14

    invoke-interface {v12, v14}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    move-object v12, v2

    :cond_4
    new-instance v4, Lbm2/m0;

    invoke-direct {v4, v10, v11, v13, v12}, Lbm2/m0;-><init>(Lcom/whoop/design/util/TextResource;Lbm2/o0;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_2

    :cond_5
    move-object v10, v1

    goto :goto_5

    :cond_6
    move-object v10, v2

    :goto_5
    new-instance v4, Lbm2/r0;

    invoke-direct/range {v4 .. v10}, Lbm2/r0;-><init>(Lbm2/k0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbm2/j0;Lam2/o;Ljava/util/List;)V

    return-object v4
.end method
