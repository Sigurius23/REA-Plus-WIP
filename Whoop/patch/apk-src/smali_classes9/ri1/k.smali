.class public abstract Lri1/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0001\u0010\u0003\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010\u0002\u001a\u0004\u0008\u0006\u0010\u0003\"\u001a\u0010\n\u001a\u00020\u00008\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0002\u001a\u0004\u0008\t\u0010\u0003\" \u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\r\u001a\u0004\u0008\u0008\u0010\u000e\"\u001a\u0010\u0014\u001a\u00020\u00108\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u001a\u0010\u0019\u001a\u00020\u00158\u0000X\u0081\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0005\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "a",
        "Lcom/whoop/design/models/items/CtaTileModel;",
        "()Lcom/whoop/design/models/items/CtaTileModel;",
        "dataBehindPrefixCta",
        "b",
        "d",
        "offlineShepherdOnboardingPrefixCta",
        "c",
        "e",
        "offlineTakeNewLabradorSuffixCta",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "Ljava/util/List;",
        "()Ljava/util/List;",
        "offlineHeartScreenerV2",
        "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;",
        "Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;",
        "getOfflineTakeNewLabradorSuffixBody",
        "()Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;",
        "offlineTakeNewLabradorSuffixBody",
        "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "f",
        "Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "()Lcom/whoop/health/domain/models/DataVisHeaderModel;",
        "offlineCardHeaderModel",
        "health_release"
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
.field private static final a:Lcom/whoop/design/models/items/CtaTileModel;

.field private static final b:Lcom/whoop/design/models/items/CtaTileModel;

.field private static final c:Lcom/whoop/design/models/items/CtaTileModel;

.field private static final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private static final e:Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

.field private static final f:Lcom/whoop/health/domain/models/DataVisHeaderModel;


# direct methods
.method static constructor <clinit>()V
    .locals 35

    sget v0, Loi1/a;->c:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v2

    sget-object v17, Lcom/whoop/design/models/items/TileBorderStyle;->NONE:Lcom/whoop/design/models/items/TileBorderStyle;

    new-instance v1, Lcom/whoop/design/models/items/CtaTileModel;

    const v18, 0xc5ba

    const/16 v19, 0x0

    const/4 v3, 0x0

    const-string v4, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const-string v8, "TINY_CHECKMARK"

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-string v11, "ANF_DATA_BEHIND"

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v15, v17

    const/16 v17, 0x0

    invoke-direct/range {v1 .. v19}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v1, Lri1/k;->a:Lcom/whoop/design/models/items/CtaTileModel;

    sget v0, Loi1/a;->m:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v17

    sget-object v30, Lcom/whoop/design/models/items/TileBorderStyle;->ONBOARDING:Lcom/whoop/design/models/items/TileBorderStyle;

    new-instance v16, Lcom/whoop/design/models/items/CtaTileModel;

    const v33, 0xc5ba

    const/16 v34, 0x0

    const/16 v18, 0x0

    const-string v19, ""

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const-string v23, "TINY_CHECKMARK"

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-string v26, "ANF_ONBOARDING"

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v16 .. v34}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v16, Lri1/k;->b:Lcom/whoop/design/models/items/CtaTileModel;

    sget v0, Loi1/a;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    new-instance v19, Lcom/whoop/navigation/e;

    sget-object v6, Lcom/whoop/navigation/AppScreen$s2;->w:Lcom/whoop/navigation/AppScreen$s2;

    new-instance v7, Lcom/whoop/navigation/HeartScreenerModel;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1, v0}, Lcom/whoop/navigation/HeartScreenerModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x4

    const/4 v8, 0x0

    move-object/from16 v5, v19

    invoke-direct/range {v5 .. v10}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lcom/whoop/design/models/items/CtaTileModel;

    const/16 v20, 0x45ba

    const/4 v5, 0x0

    const-string v6, ""

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-string v10, "ADD"

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-string v13, "ECG_NEW_RECORDING"

    move-object/from16 v17, v15

    const/4 v15, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v3 .. v21}, Lcom/whoop/design/models/items/CtaTileModel;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;ZZZLcom/whoop/design/models/items/TileBorderStyle;Lcom/whoop/design/models/items/CtaSupplementalInfo;Lcom/whoop/navigation/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v3, Lri1/k;->c:Lcom/whoop/design/models/items/CtaTileModel;

    new-instance v2, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;

    sget v4, Loi1/a;->d:I

    invoke-static {v4}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    const-string v6, ""

    invoke-direct {v2, v0, v4, v5, v6}, Lcom/whoop/health/domain/models/ImageVisualizationCardBodyModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/lang/String;)V

    new-instance v4, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;

    new-instance v5, Lcom/whoop/health/domain/models/HeartScreenerStatus;

    sget v6, Loi1/a;->g:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    new-instance v7, Lcom/whoop/health/domain/models/MiniStatus;

    const-string v8, "TINY_ELLIPSE"

    const-string v9, "NONE"

    invoke-direct {v7, v8, v9}, Lcom/whoop/health/domain/models/MiniStatus;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    const-string v8, "LABRADOR"

    invoke-direct {v5, v6, v8, v7}, Lcom/whoop/health/domain/models/HeartScreenerStatus;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/health/domain/models/MiniStatus;)V

    invoke-static {v5}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-direct {v4, v5, v0}, Lcom/whoop/health/domain/models/ScreenerStatusTileBodyModel;-><init>(Ljava/util/List;Lcom/whoop/design/util/TextResource;)V

    sget v5, Loi1/a;->n:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    new-instance v9, Lcom/whoop/navigation/e;

    sget-object v10, Lcom/whoop/navigation/AppScreen$i3;->w:Lcom/whoop/navigation/AppScreen$i3;

    new-instance v11, Lcom/whoop/navigation/LabradorReadingModel;

    invoke-direct {v11, v0, v1, v0}, Lcom/whoop/navigation/LabradorReadingModel;-><init>(Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x4

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v14}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/models/items/CardButtonModel;

    const v27, 0xf7240

    const/16 v28, 0x0

    const/4 v7, 0x0

    move-object v14, v9

    const-string v9, "ADD"

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "LIGHT_BACKGROUND"

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v6 .. v28}, Lcom/whoop/design/models/items/CardButtonModel;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lcom/whoop/design/models/modal/AnyModal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/DismissEventModel;Ljava/lang/Boolean;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v0, 0x3

    new-array v0, v0, [Lcom/whoop/design/models/DesignSystemModel;

    const/4 v5, 0x0

    aput-object v2, v0, v5

    aput-object v4, v0, v1

    const/4 v1, 0x2

    aput-object v6, v0, v1

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lri1/k;->d:Ljava/util/List;

    new-instance v5, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    const/16 v13, 0x6f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    move-object v10, v3

    invoke-direct/range {v5 .. v14}, Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/items/ImpactModel;Lcom/whoop/design/models/items/graph/GraphModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/design/models/items/CtaTileModel;Lcom/whoop/health/domain/models/CardSupplementalInfo;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v5, Lri1/k;->e:Lcom/whoop/health/domain/models/DataVisualizationCardBodyModel;

    new-instance v6, Lcom/whoop/health/domain/models/DataVisHeaderModel;

    sget v0, Loi1/a;->b:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v7

    sget v0, Loi1/a;->n:I

    invoke-static {v0}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    const/4 v10, 0x4

    invoke-direct/range {v6 .. v11}, Lcom/whoop/health/domain/models/DataVisHeaderModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v6, Lri1/k;->f:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    return-void
.end method

.method public static final a()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    sget-object v0, Lri1/k;->a:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public static final b()Lcom/whoop/health/domain/models/DataVisHeaderModel;
    .locals 1

    sget-object v0, Lri1/k;->f:Lcom/whoop/health/domain/models/DataVisHeaderModel;

    return-object v0
.end method

.method public static final c()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    sget-object v0, Lri1/k;->d:Ljava/util/List;

    return-object v0
.end method

.method public static final d()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    sget-object v0, Lri1/k;->b:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method

.method public static final e()Lcom/whoop/design/models/items/CtaTileModel;
    .locals 1

    sget-object v0, Lri1/k;->c:Lcom/whoop/design/models/items/CtaTileModel;

    return-object v0
.end method
