.class public Lcom/whoop/analytics/strain/model/util/ModelUtilities;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final DefaultAnalyticsState:Lcom/whoop/analytics/strain/model/AnalyticsState;

.field public static final DefaultState:Lcom/whoop/analytics/strain/model/State;

.field public static final DefaultStrainScore:Lcom/whoop/analytics/strain/model/StrainScore;

.field public static final DefaultUserProfile:Lcom/whoop/analytics/strain/model/UserProfile;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    invoke-static {}, Lcom/whoop/analytics/strain/model/AnalyticsState;->builder()Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLastUsed(Ljava/lang/Long;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverAccelX(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->setLeftOverHrc(Ljava/util/List;)Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/AnalyticsState$Builder;->build()Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v0

    sput-object v0, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultAnalyticsState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-static {}, Lcom/whoop/analytics/strain/model/StrainScore;->builder()Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    const-wide/16 v4, 0x0

    invoke-static {v4, v5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    invoke-virtual {v3, v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setAvgHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setKilojoules(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setProjectedStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3, v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setMaxHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->build()Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v3

    sput-object v3, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultStrainScore:Lcom/whoop/analytics/strain/model/StrainScore;

    invoke-static {}, Lcom/whoop/analytics/strain/model/State;->builder()Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v3

    invoke-virtual {v3, v0}, Lcom/whoop/analytics/strain/model/State$Builder;->setAnaState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/State$Builder;->setPrevMaxTime(J)Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v0

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/State$Builder;->setUserId(Ljava/lang/Integer;)Lcom/whoop/analytics/strain/model/State$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/State$Builder;->build()Lcom/whoop/analytics/strain/model/State;

    move-result-object v0

    sput-object v0, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultState:Lcom/whoop/analytics/strain/model/State;

    invoke-static {}, Lcom/whoop/analytics/strain/model/UserProfile;->builder()Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    sget-object v3, Lcom/whoop/analytics/strain/model/BiologicalSex;->female:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v0, v3}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBirthday(J)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    sget-object v1, Lcom/whoop/analytics/strain/model/FitnessLevel;->inactive:Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    const-wide/high16 v1, 0x4069000000000000L    # 200.0

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setMaxHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setRestingHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    const-wide v1, 0x3ff999999999999aL    # 1.6

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setHeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    const-wide v1, 0x3ff4cccccccccccdL    # 1.3

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setWeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    const/4 v1, -0x1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setId(I)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->build()Lcom/whoop/analytics/strain/model/UserProfile;

    move-result-object v0

    sput-object v0, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultUserProfile:Lcom/whoop/analytics/strain/model/UserProfile;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
