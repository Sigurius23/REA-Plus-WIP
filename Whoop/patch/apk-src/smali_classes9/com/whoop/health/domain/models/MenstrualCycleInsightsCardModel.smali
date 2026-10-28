.class public final Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/DesignSystemModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$$serializer;,
        Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0014\u0008\u0087\u0008\u0018\u0000 I2\u00020\u0001:\u0002JIBQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bk\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010\"J\u0010\u0010$\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010&\u001a\u00020\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/Jh\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010\"J\u0010\u00103\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00108\u001a\u0002072\u0008\u00106\u001a\u0004\u0018\u000105H\u00d6\u0003\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010:\u001a\u0004\u0008<\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010=\u001a\u0004\u0008>\u0010%R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010?\u001a\u0004\u0008@\u0010\'R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010A\u001a\u0004\u0008B\u0010)R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010C\u001a\u0004\u0008D\u0010+R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010E\u001a\u0004\u0008F\u0010-R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010G\u001a\u0004\u0008H\u0010/\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "",
        "title",
        "endIcon",
        "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;",
        "body",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "graph",
        "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;",
        "footer",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "logButton",
        "Lcom/whoop/navigation/e;",
        "destination",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "trend",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_release",
        "(Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;",
        "component4",
        "()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "component5",
        "()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;",
        "component6",
        "()Lcom/whoop/design/models/items/CardButtonModel;",
        "component7",
        "()Lcom/whoop/navigation/e;",
        "component8",
        "()Lcom/whoop/design/models/items/ImpactModel;",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getEndIcon",
        "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;",
        "getBody",
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "getGraph",
        "Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;",
        "getFooter",
        "Lcom/whoop/design/models/items/CardButtonModel;",
        "getLogButton",
        "Lcom/whoop/navigation/e;",
        "getDestination",
        "Lcom/whoop/design/models/items/ImpactModel;",
        "getTrend",
        "Companion",
        "$serializer",
        "health_release"
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

.field public static final Companion:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$Companion;


# instance fields
.field private final body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

.field private final destination:Lcom/whoop/navigation/e;

.field private final endIcon:Ljava/lang/String;

.field private final footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

.field private final graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

.field private final logButton:Lcom/whoop/design/models/items/CardButtonModel;

.field private final title:Ljava/lang/String;

.field private final trend:Lcom/whoop/design/models/items/ImpactModel;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->Companion:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$Companion;

    sget v0, Lcom/whoop/design/models/items/ImpactModel;->$stable:I

    sget v2, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/items/CardButtonModel;->$stable:I

    or-int/2addr v0, v2

    sget v2, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->$stable:I

    or-int/2addr v0, v2

    sput v0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lsh2/d;

    const/16 v3, 0xb

    invoke-direct {v2, v3}, Lsh2/d;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v2, 0x8

    new-array v2, v2, [Ll83/h;

    const/4 v3, 0x0

    aput-object v1, v2, v3

    const/4 v3, 0x1

    aput-object v1, v2, v3

    const/4 v3, 0x2

    aput-object v1, v2, v3

    const/4 v3, 0x3

    aput-object v1, v2, v3

    const/4 v3, 0x4

    aput-object v1, v2, v3

    const/4 v3, 0x5

    aput-object v1, v2, v3

    const/4 v3, 0x6

    aput-object v0, v2, v3

    const/4 v0, 0x7

    aput-object v1, v2, v0

    sput-object v2, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p1, 0x7f

    const/16 v0, 0x7f

    if-eq v0, p10, :cond_0

    .line 1
    sget-object p10, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$$serializer;

    invoke-virtual {p10}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p10

    invoke-static {p1, v0, p10}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    iput-object p5, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iput-object p6, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    iput-object p7, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    iput-object p8, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-void

    :cond_1
    iput-object p9, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graph"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    .line 9
    iput-object p7, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    .line 10
    iput-object p8, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    move/from16 v0, p9

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move-object v9, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    goto :goto_1

    :cond_0
    move-object/from16 v9, p8

    goto :goto_0

    .line 11
    :goto_1
    invoke-direct/range {v1 .. v9}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 4

    new-instance v0, Lwc3/a;

    const-class v1, Lcom/whoop/navigation/e;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lwc3/c;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v3, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;ILjava/lang/Object;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_release(Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/DailyTickMarkPlotModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    const/4 v3, 0x3

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel$$serializer;->INSTANCE:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    const/4 v3, 0x4

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/design/models/items/CardButtonModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/CardButtonModel$$serializer;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    const/4 v3, 0x5

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x6

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-eqz v1, :cond_1

    :goto_0
    sget-object v1, Lcom/whoop/design/models/items/ImpactModel$$serializer;->INSTANCE:Lcom/whoop/design/models/items/ImpactModel$$serializer;

    iget-object p0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;
    .locals 10

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "endIcon"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "graph"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;Lcom/whoop/design/models/items/DailyTickMarkPlotModel;Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;Lcom/whoop/design/models/items/CardButtonModel;Lcom/whoop/navigation/e;Lcom/whoop/design/models/items/ImpactModel;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;

    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    iget-object p1, p1, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBody()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getEndIcon()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    return-object v0
.end method

.method public final getFooter()Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    return-object v0
.end method

.method public final getGraph()Lcom/whoop/design/models/items/DailyTickMarkPlotModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    return-object v0
.end method

.method public final getLogButton()Lcom/whoop/design/models/items/CardButtonModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getTrend()Lcom/whoop/design/models/items/ImpactModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    invoke-virtual {v2}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    invoke-virtual {v0}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lcom/whoop/design/models/items/CardButtonModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    if-nez v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/ImpactModel;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->endIcon:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->body:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardBodyModel;

    iget-object v3, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->graph:Lcom/whoop/design/models/items/DailyTickMarkPlotModel;

    iget-object v4, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->footer:Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardFooterModel;

    iget-object v5, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->logButton:Lcom/whoop/design/models/items/CardButtonModel;

    iget-object v6, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->destination:Lcom/whoop/navigation/e;

    iget-object v7, p0, Lcom/whoop/health/domain/models/MenstrualCycleInsightsCardModel;->trend:Lcom/whoop/design/models/items/ImpactModel;

    const-string v8, ", endIcon="

    const-string v9, ", body="

    const-string v10, "MenstrualCycleInsightsCardModel(title="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", graph="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", footer="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", logButton="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", trend="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
