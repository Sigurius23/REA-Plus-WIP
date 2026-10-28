.class public final Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;,
        Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u000f\u0010\u0010Bo\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000f\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010!J\u0018\u0010%\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010!Jp\u0010*\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0010\u0008\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010!J\u0010\u0010-\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001fJ\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00105\u001a\u0004\u00086\u0010!R\u0017\u0010\u0006\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00105\u001a\u0004\u00087\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00105\u001a\u0004\u00088\u0010!R\u0019\u0010\u0008\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u00105\u001a\u0004\u00089\u0010!R\u001f\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010:\u001a\u0004\u0008;\u0010&R\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010<\u001a\u0004\u0008=\u0010(R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u00105\u001a\u0004\u0008>\u0010!\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "goalTypeId",
        "",
        "leftIcon",
        "title",
        "informationButton",
        "description",
        "",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
        "barStyles",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;",
        "metricValue",
        "rightButtonIcon",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$weekly_plan_release",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()I",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;",
        "component8",
        "copy",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;",
        "toString",
        "hashCode",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "I",
        "getGoalTypeId",
        "Ljava/lang/String;",
        "getLeftIcon",
        "getTitle",
        "getInformationButton",
        "getDescription",
        "Ljava/util/List;",
        "getBarStyles",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;",
        "getMetricValue",
        "getRightButtonIcon",
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

.field public static final Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;


# instance fields
.field private final barStyles:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
            ">;"
        }
    .end annotation
.end field

.field private final description:Ljava/lang/String;

.field private final goalTypeId:I

.field private final informationButton:Ljava/lang/String;

.field private final leftIcon:Ljava/lang/String;

.field private final metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

.field private final rightButtonIcon:Ljava/lang/String;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Llq2/h;

    const/16 v4, 0x1c

    invoke-direct {v3, v4}, Llq2/h;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v0, v3

    const/4 v3, 0x1

    aput-object v1, v0, v3

    const/4 v3, 0x2

    aput-object v1, v0, v3

    const/4 v3, 0x3

    aput-object v1, v0, v3

    const/4 v3, 0x4

    aput-object v1, v0, v3

    const/4 v3, 0x5

    aput-object v2, v0, v3

    const/4 v2, 0x6

    aput-object v1, v0, v2

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p10, p1, 0xff

    const/16 v0, 0xff

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    iput-object p9, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
            ">;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricValue"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    .line 4
    iput-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    .line 10
    iput-object p8, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;->Companion:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle$Companion;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle$Companion;->serializer()Lwc3/c;

    move-result-object v1

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget p1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$weekly_plan_release(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    const/4 v3, 0x1

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x2

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue$$serializer;->INSTANCE:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue$$serializer;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    const/4 v3, 0x6

    invoke-interface {p1, p2, v3, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    iget-object p0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    return v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
            ">;",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricValue"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    iget v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    iget v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    iget-object v3, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBarStyles()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getGoalTypeId()I
    .locals 1

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    return v0
.end method

.method public final getInformationButton()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    return-object v0
.end method

.method public final getLeftIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getMetricValue()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    return-object v0
.end method

.method public final getRightButtonIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    if-nez v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->goalTypeId:I

    iget-object v1, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->leftIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->title:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->informationButton:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->description:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->barStyles:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->metricValue:Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    iget-object v7, p0, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->rightButtonIcon:Ljava/lang/String;

    const-string v8, ", leftIcon="

    const-string v9, ", title="

    const-string v10, "MetricPlanTileModel(goalTypeId="

    invoke-static {v0, v10, v8, v1, v9}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", informationButton="

    const-string v8, ", description="

    invoke-static {v0, v2, v1, v3, v8}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", barStyles="

    const-string v2, ", metricValue="

    invoke-static {v4, v1, v2, v0, v5}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rightButtonIcon="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
