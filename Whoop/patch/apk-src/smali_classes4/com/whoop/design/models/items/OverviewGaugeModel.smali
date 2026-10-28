.class public final Lcom/whoop/design/models/items/OverviewGaugeModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/OverviewGaugeModel$$serializer;,
        Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0010\u0000\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001d\u0008\u0087\u0008\u0018\u0000 _2\u00020\u0001:\u0002`_B\u00bb\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n\u0012\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019B\u00b5\u0001\u0008\u0010\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0011\u001a\u00020\n\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u00a2\u0006\u0004\u0008\u0018\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0010\u0010&\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0010\u0010\'\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0010\u0010)\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010(J\u0010\u0010*\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010(J\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010 J\u0010\u0010,\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010(J\u0010\u0010-\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010(J\u0010\u0010.\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010(J\u0012\u0010/\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010\"J\u0012\u00100\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00080\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010\"J\u0012\u00103\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00083\u00104J\u0012\u00105\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003\u00a2\u0006\u0004\u00085\u00104J\u00c4\u0001\u00106\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\n2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\n2\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010\"J\u0010\u00109\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010=\u001a\u00020\u00022\u0008\u0010<\u001a\u0004\u0018\u00010;H\u00d6\u0003\u00a2\u0006\u0004\u0008=\u0010>J\'\u0010G\u001a\u00020D2\u0006\u0010?\u001a\u00020\u00002\u0006\u0010A\u001a\u00020@2\u0006\u0010C\u001a\u00020BH\u0001\u00a2\u0006\u0004\u0008E\u0010FR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010H\u001a\u0004\u0008I\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010J\u001a\u0004\u0008K\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010L\u001a\u0004\u0008M\u0010$R\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010L\u001a\u0004\u0008N\u0010$R\u0017\u0010\t\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010L\u001a\u0004\u0008O\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010P\u001a\u0004\u0008Q\u0010(R\u0017\u0010\u000c\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010P\u001a\u0004\u0008R\u0010(R\u0017\u0010\r\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010P\u001a\u0004\u0008S\u0010(R\u0017\u0010\u000e\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010H\u001a\u0004\u0008T\u0010 R\u0017\u0010\u000f\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010P\u001a\u0004\u0008U\u0010(R\u0017\u0010\u0010\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010P\u001a\u0004\u0008V\u0010(R\u0017\u0010\u0011\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010P\u001a\u0004\u0008W\u0010(R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010J\u001a\u0004\u0008X\u0010\"R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010Y\u001a\u0004\u0008Z\u00101R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010J\u001a\u0004\u0008[\u0010\"R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\\\u001a\u0004\u0008]\u00104R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\\\u001a\u0004\u0008^\u00104\u00a8\u0006a"
    }
    d2 = {
        "Lcom/whoop/design/models/items/OverviewGaugeModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "hasSleepPerformance",
        "",
        "recoveryLevel",
        "Lcom/whoop/design/util/TextResource;",
        "recoveryScoreDisplay",
        "dayStrainDisplay",
        "sleepPerformanceDisplay",
        "",
        "recoveryScoreGaugeFillPercentage",
        "dayStrainGaugeFillPercentage",
        "sleepPerformanceGaugeFillPercentage",
        "onboarding",
        "optimalStrainGaugeFillPercentage",
        "lowerOptimalStrainFillValue",
        "higherOptimalStrainFillValue",
        "hrvDisplay",
        "weeklyPlanGoalStrainGaugeFillPercentage",
        "weeklyPlanDisplay",
        "Lcom/whoop/design/models/items/CustomGaugeEntryModel;",
        "firstCustomGaugeEntry",
        "secondCustomGaugeEntry",
        "<init>",
        "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Z",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Lcom/whoop/design/util/TextResource;",
        "component4",
        "component5",
        "component6",
        "()F",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "()Ljava/lang/Float;",
        "component15",
        "component16",
        "()Lcom/whoop/design/models/items/CustomGaugeEntryModel;",
        "component17",
        "copy",
        "(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lcom/whoop/design/models/items/OverviewGaugeModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$design_models_release",
        "(Lcom/whoop/design/models/items/OverviewGaugeModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Z",
        "getHasSleepPerformance",
        "Ljava/lang/String;",
        "getRecoveryLevel",
        "Lcom/whoop/design/util/TextResource;",
        "getRecoveryScoreDisplay",
        "getDayStrainDisplay",
        "getSleepPerformanceDisplay",
        "F",
        "getRecoveryScoreGaugeFillPercentage",
        "getDayStrainGaugeFillPercentage",
        "getSleepPerformanceGaugeFillPercentage",
        "getOnboarding",
        "getOptimalStrainGaugeFillPercentage",
        "getLowerOptimalStrainFillValue",
        "getHigherOptimalStrainFillValue",
        "getHrvDisplay",
        "Ljava/lang/Float;",
        "getWeeklyPlanGoalStrainGaugeFillPercentage",
        "getWeeklyPlanDisplay",
        "Lcom/whoop/design/models/items/CustomGaugeEntryModel;",
        "getFirstCustomGaugeEntry",
        "getSecondCustomGaugeEntry",
        "Companion",
        "$serializer",
        "design-models_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;


# instance fields
.field private final dayStrainDisplay:Lcom/whoop/design/util/TextResource;

.field private final dayStrainGaugeFillPercentage:F

.field private final firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

.field private final hasSleepPerformance:Z

.field private final higherOptimalStrainFillValue:F

.field private final hrvDisplay:Ljava/lang/String;

.field private final lowerOptimalStrainFillValue:F

.field private final onboarding:Z

.field private final optimalStrainGaugeFillPercentage:F

.field private final recoveryLevel:Ljava/lang/String;

.field private final recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

.field private final recoveryScoreGaugeFillPercentage:F

.field private final secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

.field private final sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

.field private final sleepPerformanceGaugeFillPercentage:F

.field private final weeklyPlanDisplay:Ljava/lang/String;

.field private final weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->Companion:Lcom/whoop/design/models/items/OverviewGaugeModel$Companion;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 20

    .line 1
    const v18, 0x1ffff

    const/16 v19, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

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

    move-object/from16 v0, p0

    invoke-direct/range {v0 .. v19}, Lcom/whoop/design/models/items/OverviewGaugeModel;-><init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(IZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 v0, p1, 0x1

    if-nez v0, :cond_0

    const/4 p2, 0x1

    :cond_0
    iput-boolean p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 3
    const-string p2, "HIGH"

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 6
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 7
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 8
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    .line 9
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object p2

    .line 10
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    goto :goto_4

    :cond_5
    iput p7, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    goto :goto_5

    :cond_6
    iput p8, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    goto :goto_6

    :cond_7
    iput p9, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    :goto_6
    and-int/lit16 p2, p1, 0x100

    if-nez p2, :cond_8

    const/4 p2, 0x0

    iput-boolean p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    goto :goto_7

    :cond_8
    iput-boolean p10, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    :goto_7
    and-int/lit16 p2, p1, 0x200

    if-nez p2, :cond_9

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    goto :goto_8

    :cond_9
    iput p11, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    :goto_8
    and-int/lit16 p2, p1, 0x400

    if-nez p2, :cond_a

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    goto :goto_9

    :cond_a
    iput p12, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    :goto_9
    and-int/lit16 p2, p1, 0x800

    if-nez p2, :cond_b

    iput p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    goto :goto_a

    :cond_b
    iput p13, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    :goto_a
    and-int/lit16 p2, p1, 0x1000

    const-string p4, ""

    if-nez p2, :cond_c

    iput-object p4, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    goto :goto_b

    :cond_c
    iput-object p14, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    :goto_b
    and-int/lit16 p2, p1, 0x2000

    if-nez p2, :cond_d

    .line 11
    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    .line 12
    :goto_c
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    goto :goto_d

    :cond_d
    move-object/from16 p2, p15

    goto :goto_c

    :goto_d
    and-int/lit16 p2, p1, 0x4000

    if-nez p2, :cond_e

    iput-object p4, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 p2, p16

    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    :goto_e
    const p2, 0x8000

    and-int/2addr p2, p1

    const/4 p3, 0x0

    if-nez p2, :cond_f

    iput-object p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    goto :goto_f

    :cond_f
    move-object/from16 p2, p17

    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    :goto_f
    const/high16 p2, 0x10000

    and-int/2addr p1, p2

    if-nez p1, :cond_10

    iput-object p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-void

    :cond_10
    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-void
.end method

.method public constructor <init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)V
    .locals 1

    const-string v0, "recoveryLevel"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recoveryScoreDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayStrainDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepPerformanceDisplay"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 14
    iput-boolean p1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    .line 15
    iput-object p2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    .line 16
    iput-object p3, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    .line 17
    iput-object p4, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    .line 18
    iput-object p5, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    .line 19
    iput p6, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    .line 20
    iput p7, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    .line 21
    iput p8, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    .line 22
    iput-boolean p9, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    .line 23
    iput p10, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    .line 24
    iput p11, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    .line 25
    iput p12, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    .line 26
    iput-object p13, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    .line 27
    iput-object p14, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    move-object/from16 p1, p15

    .line 28
    iput-object p1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 29
    iput-object p1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    move-object/from16 p1, p17

    .line 30
    iput-object p1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 18

    move/from16 v0, p18

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    move/from16 v1, p1

    :goto_0
    and-int/lit8 v2, v0, 0x2

    if-eqz v2, :cond_1

    .line 31
    const-string v2, "HIGH"

    goto :goto_1

    :cond_1
    move-object/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v0, 0x4

    if-eqz v3, :cond_2

    .line 32
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_2

    :cond_2
    move-object/from16 v3, p3

    :goto_2
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    .line 33
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    goto :goto_3

    :cond_3
    move-object/from16 v4, p4

    :goto_3
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    .line 34
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    goto :goto_4

    :cond_4
    move-object/from16 v5, p5

    :goto_4
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    const/4 v6, 0x0

    goto :goto_5

    :cond_5
    move/from16 v6, p6

    :goto_5
    and-int/lit8 v8, v0, 0x40

    if-eqz v8, :cond_6

    const/4 v8, 0x0

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v0, 0x80

    if-eqz v9, :cond_7

    const/4 v9, 0x0

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    const/4 v10, 0x0

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    const/4 v11, 0x0

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    const/4 v12, 0x0

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v0, 0x800

    if-eqz v13, :cond_b

    const/4 v13, 0x0

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v0, 0x1000

    .line 35
    const-string v15, ""

    if-eqz v14, :cond_c

    move-object v14, v15

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    const/16 p1, 0x0

    and-int/lit16 v7, v0, 0x2000

    if-eqz v7, :cond_d

    .line 36
    invoke-static/range {p1 .. p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    goto :goto_d

    :cond_d
    move-object/from16 v7, p14

    :goto_d
    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x4000

    if-eqz v1, :cond_e

    goto :goto_e

    :cond_e
    move-object/from16 v15, p15

    :goto_e
    const v1, 0x8000

    and-int/2addr v1, v0

    const/16 v16, 0x0

    if-eqz v1, :cond_f

    move-object/from16 v1, v16

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v17, 0x10000

    and-int v0, v0, v17

    if-eqz v0, :cond_10

    move-object/from16 p18, v16

    :goto_10
    move/from16 p2, p1

    move-object/from16 p17, v1

    move-object/from16 p3, v2

    move-object/from16 p4, v3

    move-object/from16 p5, v4

    move-object/from16 p6, v5

    move/from16 p7, v6

    move-object/from16 p15, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p16, v15

    move-object/from16 p1, p0

    goto :goto_11

    :cond_10
    move-object/from16 p18, p17

    goto :goto_10

    .line 37
    :goto_11
    invoke-direct/range {p1 .. p18}, Lcom/whoop/design/models/items/OverviewGaugeModel;-><init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/OverviewGaugeModel;ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;ILjava/lang/Object;)Lcom/whoop/design/models/items/OverviewGaugeModel;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-boolean v2, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget v7, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget v8, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    goto :goto_6

    :cond_6
    move/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget v9, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-boolean v10, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    goto :goto_8

    :cond_8
    move/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget v11, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget v12, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    goto :goto_a

    :cond_a
    move/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget v13, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    goto :goto_b

    :cond_b
    move/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v16, v1, v16

    if-eqz v16, :cond_f

    iget-object v1, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    goto :goto_f

    :cond_f
    move-object/from16 v1, p16

    :goto_f
    const/high16 v16, 0x10000

    and-int v16, p18, v16

    if-eqz v16, :cond_10

    move-object/from16 p2, v1

    iget-object v1, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    move-object/from16 p17, p2

    move-object/from16 p18, v1

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_10
    move-object/from16 p18, p17

    move-object/from16 p17, v1

    move/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move/from16 p8, v8

    move/from16 p9, v9

    move/from16 p10, v10

    move/from16 p11, v11

    move/from16 p12, v12

    move/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/design/models/items/OverviewGaugeModel;->copy(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lcom/whoop/design/models/items/OverviewGaugeModel;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/OverviewGaugeModel;Lzc3/c;Lyc3/g;)V
    .locals 5

    const/4 v0, 0x0

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    if-eq v1, v2, :cond_1

    :goto_0
    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_1
    invoke-interface {p1, p2, v2}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    const-string v1, "HIGH"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :goto_1
    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v0}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v0, 0x2

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_4

    goto :goto_2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    :goto_2
    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x3

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    :goto_3
    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_8

    goto :goto_4

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :goto_4
    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v0, 0x5

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_a

    goto :goto_5

    :cond_a
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    :goto_5
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_b
    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_c

    goto :goto_6

    :cond_c
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    :goto_6
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_f

    :goto_7
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_f
    const/16 v0, 0x8

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_10

    goto :goto_8

    :cond_10
    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    if-eqz v1, :cond_11

    :goto_8
    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    :cond_11
    const/16 v0, 0x9

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_12

    goto :goto_9

    :cond_12
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_13

    :goto_9
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_13
    const/16 v0, 0xa

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_14

    goto :goto_a

    :cond_14
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_15

    :goto_a
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_15
    const/16 v0, 0xb

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_16

    goto :goto_b

    :cond_16
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    invoke-static {v1, v2}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_17

    :goto_b
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeFloatElement(Lyc3/g;IF)V

    :cond_17
    const/16 v0, 0xc

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    const-string v3, ""

    if-eqz v1, :cond_18

    goto :goto_c

    :cond_18
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :goto_c
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v4, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_19
    const/16 v0, 0xd

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1a

    goto :goto_d

    :cond_1a
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    :goto_d
    sget-object v1, Lkotlinx/serialization/internal/FloatSerializer;->INSTANCE:Lkotlinx/serialization/internal/FloatSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1b
    const/16 v0, 0xe

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1c

    goto :goto_e

    :cond_1c
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :goto_e
    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1d
    const/16 v0, 0xf

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_1e

    goto :goto_f

    :cond_1e
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    if-eqz v1, :cond_1f

    :goto_f
    sget-object v1, Lcom/whoop/design/models/items/CustomGaugeEntryModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CustomGaugeEntryModel$$serializer;

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1f
    const/16 v0, 0x10

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_20

    goto :goto_10

    :cond_20
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    if-eqz v1, :cond_21

    :goto_10
    sget-object v1, Lcom/whoop/design/models/items/CustomGaugeEntryModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CustomGaugeEntryModel$$serializer;

    iget-object p0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_21
    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    return v0
.end method

.method public final component10()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    return v0
.end method

.method public final component11()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    return v0
.end method

.method public final component12()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    return v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Lcom/whoop/design/models/items/CustomGaugeEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-object v0
.end method

.method public final component17()Lcom/whoop/design/models/items/CustomGaugeEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    return v0
.end method

.method public final component7()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    return v0
.end method

.method public final component8()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    return v0
.end method

.method public final copy(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)Lcom/whoop/design/models/items/OverviewGaugeModel;
    .locals 19

    const-string v0, "recoveryLevel"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recoveryScoreDisplay"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dayStrainDisplay"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepPerformanceDisplay"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/OverviewGaugeModel;

    move/from16 v2, p1

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/design/models/items/OverviewGaugeModel;-><init>(ZLjava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FFFZFFFLjava/lang/String;Ljava/lang/Float;Ljava/lang/String;Lcom/whoop/design/models/items/CustomGaugeEntryModel;Lcom/whoop/design/models/items/CustomGaugeEntryModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/OverviewGaugeModel;

    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    iget-boolean v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    if-eq v1, v3, :cond_a

    return v2

    :cond_a
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_b

    return v2

    :cond_b
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    iget v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    invoke-static {v1, v3}, Ljava/lang/Float;->compare(FF)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    return v2

    :cond_11
    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    iget-object p1, p1, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_12

    return v2

    :cond_12
    return v0
.end method

.method public final getDayStrainDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDayStrainGaugeFillPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    return v0
.end method

.method public final getFirstCustomGaugeEntry()Lcom/whoop/design/models/items/CustomGaugeEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-object v0
.end method

.method public final getHasSleepPerformance()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    return v0
.end method

.method public final getHigherOptimalStrainFillValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    return v0
.end method

.method public final getHrvDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getLowerOptimalStrainFillValue()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    return v0
.end method

.method public final getOnboarding()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    return v0
.end method

.method public final getOptimalStrainGaugeFillPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    return v0
.end method

.method public final getRecoveryLevel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryScoreDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getRecoveryScoreGaugeFillPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    return v0
.end method

.method public final getSecondCustomGaugeEntry()Lcom/whoop/design/models/items/CustomGaugeEntryModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    return-object v0
.end method

.method public final getSleepPerformanceDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSleepPerformanceGaugeFillPercentage()F
    .locals 1

    iget v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    return v0
.end method

.method public final getWeeklyPlanDisplay()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    return-object v0
.end method

.method public final getWeeklyPlanGoalStrainGaugeFillPercentage()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    invoke-static {v2, v0, v1}, Ld;->a(FII)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CustomGaugeEntryModel;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/design/models/items/CustomGaugeEntryModel;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget-boolean v1, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hasSleepPerformance:Z

    iget-object v2, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryLevel:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v4, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v5, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceDisplay:Lcom/whoop/design/util/TextResource;

    iget v6, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->recoveryScoreGaugeFillPercentage:F

    iget v7, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->dayStrainGaugeFillPercentage:F

    iget v8, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->sleepPerformanceGaugeFillPercentage:F

    iget-boolean v9, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->onboarding:Z

    iget v10, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->optimalStrainGaugeFillPercentage:F

    iget v11, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->lowerOptimalStrainFillValue:F

    iget v12, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->higherOptimalStrainFillValue:F

    iget-object v13, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->hrvDisplay:Ljava/lang/String;

    iget-object v14, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanGoalStrainGaugeFillPercentage:Ljava/lang/Float;

    iget-object v15, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->weeklyPlanDisplay:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->firstCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/design/models/items/OverviewGaugeModel;->secondCustomGaugeEntry:Lcom/whoop/design/models/items/CustomGaugeEntryModel;

    const-string v0, ", recoveryLevel="

    move-object/from16 v18, v15

    const-string v15, ", recoveryScoreDisplay="

    move-object/from16 v19, v14

    const-string v14, "OverviewGaugeModel(hasSleepPerformance="

    invoke-static {v14, v0, v2, v15, v1}, Lev/n;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", dayStrainDisplay="

    const-string v2, ", sleepPerformanceDisplay="

    invoke-static {v0, v3, v1, v4, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryScoreGaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", dayStrainGaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepPerformanceGaugeFillPercentage="

    const-string v2, ", onboarding="

    invoke-static {v0, v7, v1, v8, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", optimalStrainGaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", lowerOptimalStrainFillValue="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", higherOptimalStrainFillValue="

    const-string v2, ", hrvDisplay="

    invoke-static {v0, v11, v1, v12, v2}, Lr;->u(Ljava/lang/StringBuilder;FLjava/lang/String;FLjava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoalStrainGaugeFillPercentage="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanDisplay="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", firstCustomGaugeEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", secondCustomGaugeEntry="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
