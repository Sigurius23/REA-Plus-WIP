.class public final Lcom/whoop/design/models/items/Segment;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/design/models/items/Segment$$serializer;,
        Lcom/whoop/design/models/items/Segment$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0016\u0008\u0087\u0008\u0018\u0000 Q2\u00020\u0001:\u0002RQB\u0094\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016B\u0089\u0001\u0008\u0010\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0008\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r\u0012\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u0015\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00012\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\rH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ!\u0010!\u001a\u00020 2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001c0\r\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010$J\u0016\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010,J\u001e\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\rH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J3\u0010/\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u0010.J\u009d\u0001\u00100\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\n\u0008\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0016\u0008\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r2+\u0008\u0002\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u0013H\u00c6\u0001\u00a2\u0006\u0004\u00080\u00101J\u0010\u00102\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00082\u0010$J\u0010\u00103\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\u00083\u00104J\u001a\u00106\u001a\u00020 2\u0008\u00105\u001a\u0004\u0018\u00010\u001cH\u00d6\u0003\u00a2\u0006\u0004\u00086\u00107J\'\u0010@\u001a\u00020=2\u0006\u00108\u001a\u00020\u00002\u0006\u0010:\u001a\u0002092\u0006\u0010<\u001a\u00020;H\u0001\u00a2\u0006\u0004\u0008>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010A\u001a\u0004\u0008B\u0010$R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010A\u001a\u0004\u0008C\u0010$R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008D\u0010$R\u001d\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010E\u001a\u0004\u0008F\u0010(R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010G\u001a\u0004\u0008H\u0010*R\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010I\u001a\u0004\u0008J\u0010,R0\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\r8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010K\u001a\u0004\u0008L\u0010.\"\u0004\u0008M\u0010NRE\u0010\u0014\u001a%\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rj\u0004\u0018\u0001`\u0010\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\t0\u00138\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0014\u0010K\u001a\u0004\u0008O\u0010.\"\u0004\u0008P\u0010N\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/design/models/items/Segment;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "id",
        "segmentControlTitle",
        "segmentControlSubtitle",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "action",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "analyticEvent",
        "",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "matchesAccumulatedState",
        "(Ljava/util/Map;)Z",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "component4",
        "()Ljava/util/List;",
        "component5",
        "()Lcom/whoop/whoopaction/domain/models/Action;",
        "component6",
        "()Lcom/whoop/analytics/AnalyticEventModel;",
        "component7",
        "()Ljava/util/Map;",
        "component8",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/Segment;",
        "toString",
        "hashCode",
        "()I",
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
        "(Lcom/whoop/design/models/items/Segment;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/String;",
        "getId",
        "getSegmentControlTitle",
        "getSegmentControlSubtitle",
        "Ljava/util/List;",
        "getItems",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "getAction",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "getAnalyticEvent",
        "Ljava/util/Map;",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/design/models/items/Segment$Companion;


# instance fields
.field private final action:Lcom/whoop/whoopaction/domain/models/Action;

.field private aggregateBindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation
.end field

.field private final analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

.field private bindings:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final id:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final segmentControlSubtitle:Ljava/lang/String;

.field private final segmentControlTitle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/design/models/items/Segment$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/design/models/items/Segment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/design/models/items/Segment;->Companion:Lcom/whoop/design/models/items/Segment$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/design/models/items/Segment;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lw91/i;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lw91/i;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lw91/i;

    const/16 v5, 0x1c

    invoke-direct {v4, v5}, Lw91/i;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v4

    new-instance v5, Lw91/i;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lw91/i;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v0, v0, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v0, v5

    const/4 v5, 0x1

    aput-object v1, v0, v5

    const/4 v5, 0x2

    aput-object v1, v0, v5

    const/4 v5, 0x3

    aput-object v3, v0, v5

    const/4 v3, 0x4

    aput-object v4, v0, v3

    const/4 v3, 0x5

    aput-object v1, v0, v3

    const/4 v3, 0x6

    aput-object v2, v0, v3

    const/4 v2, 0x7

    aput-object v1, v0, v2

    sput-object v0, Lcom/whoop/design/models/items/Segment;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public constructor <init>()V
    .locals 11

    .line 1
    const/16 v9, 0xff

    const/4 v10, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v10}, Lcom/whoop/design/models/items/Segment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p10, p1, 0x1

    const-string v0, ""

    if-nez p10, :cond_0

    iput-object v0, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iput-object p2, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    :goto_0
    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    iput-object v0, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    goto :goto_1

    :cond_1
    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x4

    const/4 p3, 0x0

    if-nez p2, :cond_2

    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    goto :goto_2

    :cond_2
    iput-object p4, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    :goto_2
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    .line 3
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 4
    iput-object p2, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    goto :goto_3

    :cond_3
    iput-object p5, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    :goto_3
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    goto :goto_4

    :cond_4
    iput-object p6, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :goto_4
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    goto :goto_5

    :cond_5
    iput-object p7, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :goto_5
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    goto :goto_6

    :cond_6
    iput-object p8, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    :goto_6
    and-int/lit16 p1, p1, 0x80

    if-nez p1, :cond_7

    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_7
    iput-object p9, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentControlTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    .line 7
    iput-object p2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    .line 8
    iput-object p3, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    .line 9
    iput-object p4, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    .line 10
    iput-object p5, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    .line 11
    iput-object p6, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    .line 12
    iput-object p7, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    .line 13
    iput-object p8, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p10, p9, 0x1

    .line 14
    const-string v0, ""

    if-eqz p10, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p10, p9, 0x4

    const/4 v0, 0x0

    if-eqz p10, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    .line 15
    sget-object p4, Lm83/y;->w:Lm83/y;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    move-object p5, v0

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    move-object p6, v0

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    move-object p7, v0

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    move-object p9, v0

    :goto_0
    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move-object p5, p4

    move-object p4, p3

    move-object p3, p2

    move-object p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_7
    move-object p9, p8

    goto :goto_0

    .line 16
    :goto_1
    invoke-direct/range {p1 .. p9}, Lcom/whoop/design/models/items/Segment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final _childSerializers$_anonymous_()Lwc3/c;
    .locals 7

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    new-instance v1, Lwc3/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Lcom/whoop/design/models/DesignSystemModel;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    new-instance v5, Lwc3/e;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    const/4 v3, 0x0

    new-array v6, v3, [Ljava/lang/annotation/Annotation;

    invoke-direct {v5, v2, v6}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    new-array v2, v3, [Lwc3/c;

    invoke-direct {v1, v4, v5, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 6

    new-instance v0, Lwc3/a;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lwc3/e;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    new-array v5, v2, [Ljava/lang/annotation/Annotation;

    invoke-direct {v4, v1, v5}, Lwc3/e;-><init>(Lj93/d;[Ljava/lang/annotation/Annotation;)V

    invoke-static {v4}, Lxc3/a;->d(Lwc3/c;)Lwc3/c;

    move-result-object v1

    new-array v2, v2, [Lwc3/c;

    invoke-direct {v0, v3, v1, v2}, Lwc3/a;-><init>(Lj93/d;Lwc3/c;[Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$1()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1, v1}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/Segment;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/design/models/items/Segment;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/Segment;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/design/models/items/Segment;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/design/models/items/Segment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/design/models/items/Segment;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-object p5, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

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

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/design/models/items/Segment;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/Segment;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$design_models_release(Lcom/whoop/design/models/items/Segment;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/design/models/items/Segment;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    const-string v3, ""

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_1
    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    :cond_3
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_7

    :goto_3
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v2, :cond_9

    :goto_4
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/analytics/AnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/AnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_d

    :goto_6
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/4 v0, 0x7

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_e

    goto :goto_7

    :cond_e
    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_f

    :goto_7
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lcom/whoop/design/models/WithGeneratedBindings;"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/Segment;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcom/whoop/design/models/items/SegmentStateBindingKt;->generatedBind(Lcom/whoop/design/models/items/Segment;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/Segment;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component5()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public final component6()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public final component7()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component8()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/design/models/items/Segment;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Lcom/whoop/whoopaction/domain/models/Action;",
            "Lcom/whoop/analytics/AnalyticEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/design/models/items/Segment;"
        }
    .end annotation

    const-string v0, "id"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "segmentControlTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/design/models/items/Segment;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    invoke-direct/range {v1 .. v9}, Lcom/whoop/design/models/items/Segment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/design/models/items/Segment;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/design/models/items/Segment;

    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAction()Lcom/whoop/whoopaction/domain/models/Action;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    return-object v0
.end method

.method public getAggregateBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getAnalyticEvent()Lcom/whoop/analytics/AnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    return-object v0
.end method

.method public getBindings()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getSegmentControlSubtitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    return-object v0
.end method

.method public final getSegmentControlTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/analytics/AnalyticEventModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    return v0
.end method

.method public final matchesAccumulatedState(Ljava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "accumulatedState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    instance-of v1, v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    const/4 v1, 0x0

    if-eqz v0, :cond_5

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/StateUpdateAction;->getState()Ljava/util/Map;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    return v1

    :cond_2
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkotlinx/serialization/json/JsonElement;

    instance-of v5, v3, Lkotlinx/serialization/json/JsonPrimitive;

    if-eqz v5, :cond_3

    check-cast v3, Lkotlinx/serialization/json/JsonPrimitive;

    invoke-static {v3}, Lad3/m;->f(Lkotlinx/serialization/json/JsonPrimitive;)Ljava/lang/String;

    move-result-object v3

    invoke-interface {p1, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-eqz v4, :cond_4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    goto :goto_1

    :cond_4
    move-object v4, v2

    :goto_1
    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/4 p1, 0x1

    return p1

    :cond_5
    :goto_2
    return v1
.end method

.method public setAggregateBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public setBindings(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/design/models/items/Segment;->id:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/design/models/items/Segment;->segmentControlTitle:Ljava/lang/String;

    iget-object v2, p0, Lcom/whoop/design/models/items/Segment;->segmentControlSubtitle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/design/models/items/Segment;->items:Ljava/util/List;

    iget-object v4, p0, Lcom/whoop/design/models/items/Segment;->action:Lcom/whoop/whoopaction/domain/models/Action;

    iget-object v5, p0, Lcom/whoop/design/models/items/Segment;->analyticEvent:Lcom/whoop/analytics/AnalyticEventModel;

    iget-object v6, p0, Lcom/whoop/design/models/items/Segment;->bindings:Ljava/util/Map;

    iget-object v7, p0, Lcom/whoop/design/models/items/Segment;->aggregateBindings:Ljava/util/Map;

    const-string v8, ", segmentControlTitle="

    const-string v9, ", segmentControlSubtitle="

    const-string v10, "Segment(id="

    invoke-static {v10, v0, v8, v1, v9}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", items="

    const-string v8, ", action="

    invoke-static {v2, v1, v8, v0, v3}, Lvl/b;->v(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", analyticEvent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", bindings="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", aggregateBindings="

    const-string v2, ")"

    invoke-static {v0, v6, v1, v7, v2}, Lr;->n(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
