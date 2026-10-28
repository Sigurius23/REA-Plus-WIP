.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u000f\u0008\u0087\u0008\u0018\u0000 92\u00020\u0001:\u0002:9B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBK\u0008\u0010\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u000c\u0010\u0011J\'\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JB\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010(\u001a\u00020\'H\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010\u001cJ\u001a\u0010-\u001a\u00020,2\u0008\u0010+\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008-\u0010.R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010/\u001a\u0004\u00080\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00101\u001a\u0004\u00082\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00103\u001a\u0004\u00084\u0010 R\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00105\u001a\u0004\u00086\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00107\u001a\u0004\u00088\u0010$\u00a8\u0006;"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
        "",
        "",
        "goalTypeId",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "goalType",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;",
        "metricCard",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;",
        "metricPlanTile",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;",
        "associatedBehaviorsActivities",
        "<init>",
        "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "component3",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;",
        "component4",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;",
        "component5",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;",
        "copy",
        "(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getGoalTypeId",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;",
        "getGoalType",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;",
        "getMetricCard",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;",
        "getMetricPlanTile",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;",
        "getAssociatedBehaviorsActivities",
        "Companion",
        "$serializer",
        "weekly-plan_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;


# instance fields
.field private final associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

.field private final goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

.field private final goalTypeId:I

.field private final metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

.field private final metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lkt2/a;

    const/16 v3, 0x9

    invoke-direct {v2, v3}, Lkt2/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v2, 0x5

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v0, v2, v3

    const/4 v0, 0x2

    aput-object v1, v2, v0

    const/4 v0, 0x3

    aput-object v1, v2, v0

    const/4 v0, 0x4

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;

    invoke-virtual {p7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    return-void
.end method

.method public constructor <init>(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)V
    .locals 1

    const-string v0, "goalType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricCard"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricPlanTile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "associatedBehaviorsActivities"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->Companion:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType$Companion;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->copy(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx$$serializer;

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    return v0
.end method

.method public final component2()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method

.method public final component3()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    return-object v0
.end method

.method public final copy(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;
    .locals 7

    const-string v0, "goalType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricCard"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricPlanTile"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "associatedBehaviorsActivities"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;-><init>(ILcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;

    iget v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    iget v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAssociatedBehaviorsActivities()Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    return-object v0
.end method

.method public final getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    return-object v0
.end method

.method public final getGoalTypeId()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    return v0
.end method

.method public final getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    return-object v0
.end method

.method public final getMetricPlanTile()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    invoke-static {v2, v0, v1}, Lvl/b;->b(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalTypeId:I

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->goalType:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricCard:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->metricPlanTile:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetailKotlinx;->associatedBehaviorsActivities:Lcom/whoop/weeklyplan/hubandspoke/domain/api/AssociatedBehaviorsActivitiesKotlinx;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "MetricDetailKotlinx(goalTypeId="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", goalType="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricCard="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricPlanTile="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", associatedBehaviorsActivities="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
