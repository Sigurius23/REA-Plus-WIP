.class public abstract Lc41/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0006\"\u0017\u0010\u0005\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00008\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0004\"\u001d\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\r"
    }
    d2 = {
        "Lc41/h3;",
        "a",
        "Lc41/h3;",
        "b",
        "()Lc41/h3;",
        "metricStatusTileWithDataSample",
        "metricStatusTileNoDataSample",
        "",
        "c",
        "Ljava/util/List;",
        "getListOfMetricStatusTileSamples",
        "()Ljava/util/List;",
        "listOfMetricStatusTileSamples",
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
.field private static final a:Lc41/h3;

.field private static final b:Lc41/h3;

.field private static final c:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lc41/h3;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 36

    new-instance v0, Lc41/h3;

    const-string v10, "Blood Pressure"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "Aug 12, 2026"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "134/98"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "mmHg"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v5, Lhy0/h1;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v13, Ly71/g;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Lb9/y;->c(Lx81/d;)I

    move-result v7

    const/4 v8, 0x0

    const/4 v9, 0x2

    invoke-direct {v13, v7, v8, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v14, Ly81/f;->ACCENT_POSITIVE_TREND_15:Ly81/f;

    sget-object v16, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    sget-object v19, Lhy0/o1;->SYMPTOMS:Lhy0/o1;

    int-to-float v7, v9

    const/4 v11, 0x4

    int-to-float v11, v11

    mul-float/2addr v7, v11

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v21

    const v34, 0x3ffd68

    const/16 v35, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

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

    move-object v11, v5

    invoke-direct/range {v11 .. v35}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v11, Lny0/p0;

    const-string v7, "Update Readings"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v13, Lcom/whoop/navigation/e;

    const/16 v17, 0x7

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v14, Ly71/g;

    invoke-static {v6}, Lm4/a;->A(Lx81/d;)I

    move-result v6

    invoke-direct {v14, v6, v8, v9, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v26, 0x3ff8

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v11 .. v27}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v6, v11

    const/16 v8, 0x40

    const/4 v9, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lc41/h3;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h1;Lny0/p0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lc41/g3;->a:Lc41/h3;

    new-instance v11, Lc41/h3;

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    new-instance v17, Lny0/p0;

    const-string v1, "Update"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    new-instance v1, Lcom/whoop/navigation/e;

    const/4 v5, 0x7

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v28, 0x3ffc

    move-object/from16 v13, v17

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object v15, v1

    invoke-direct/range {v13 .. v29}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v19, 0x5e

    const/16 v20, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v11 .. v20}, Lc41/h3;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h1;Lny0/p0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v11, Lc41/g3;->b:Lc41/h3;

    const-string v1, "Weight"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const-string v2, "Today"

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const-string v3, "170"

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const-string v4, "lbs"

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    const/16 v8, 0x70

    const/4 v5, 0x0

    invoke-static/range {v0 .. v9}, Lc41/h3;->b(Lc41/h3;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/h1;Lny0/p0;Ljava/lang/Object;ILjava/lang/Object;)Lc41/h3;

    move-result-object v1

    filled-new-array {v0, v1, v11}, [Lc41/h3;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lc41/g3;->c:Ljava/util/List;

    return-void
.end method

.method public static final a()Lc41/h3;
    .locals 1

    sget-object v0, Lc41/g3;->b:Lc41/h3;

    return-object v0
.end method

.method public static final b()Lc41/h3;
    .locals 1

    sget-object v0, Lc41/g3;->a:Lc41/h3;

    return-object v0
.end method
