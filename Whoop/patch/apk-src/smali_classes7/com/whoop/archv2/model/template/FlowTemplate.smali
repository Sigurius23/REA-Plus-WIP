.class public final Lcom/whoop/archv2/model/template/FlowTemplate;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/archv2/model/template/ScreenTemplate;
.implements Lcom/whoop/design/models/WithGeneratedBindings;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/archv2/model/template/FlowTemplate$$serializer;,
        Lcom/whoop/archv2/model/template/FlowTemplate$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0013\u0008\u0087\u0008\u0018\u0000 H2\u00020\u00012\u00020\u0002:\u0002IJBz\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012+\u0008\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012Bw\u0008\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\u0008\u0011\u0010\u0017J\'\u0010 \u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0001\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ#\u0010#\u001a\u00020\u00022\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020!0\u0007H\u0016\u00a2\u0006\u0004\u0008#\u0010$J\u0019\u0010(\u001a\u0004\u0018\u00010\'2\u0006\u0010&\u001a\u00020%H\u0016\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0003H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0016\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010-J\u001c\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u0007H\u00c6\u0003\u00a2\u0006\u0004\u0008.\u0010/J\u001e\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007H\u00c6\u0003\u00a2\u0006\u0004\u00080\u0010/J3\u00101\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000fH\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010/J\u0085\u0001\u00102\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00052\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u00072\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00072+\u0008\u0002\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000fH\u00c6\u0001\u00a2\u0006\u0004\u00082\u00103J\u0010\u00104\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\u00084\u0010+J\u0010\u00105\u001a\u00020\u0013H\u00d6\u0001\u00a2\u0006\u0004\u00085\u00106J\u001a\u00109\u001a\u0002082\u0008\u00107\u001a\u0004\u0018\u00010!H\u00d6\u0003\u00a2\u0006\u0004\u00089\u0010:R\u0017\u0010\u0004\u001a\u00020\u00038\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010;\u001a\u0004\u0008<\u0010+R&\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010-R#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00080\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010A\u001a\u0004\u0008B\u0010/R0\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00078\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010A\u001a\u0004\u0008C\u0010/\"\u0004\u0008D\u0010ERE\u0010\u0010\u001a%\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0007j\u0004\u0018\u0001`\u000c\u00a2\u0006\u000c\u0008\r\u0012\u0008\u0008\u000e\u0012\u0004\u0008\t0\u000f8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010A\u001a\u0004\u0008F\u0010/\"\u0004\u0008G\u0010E\u00a8\u0006K"
    }
    d2 = {
        "Lcom/whoop/archv2/model/template/FlowTemplate;",
        "Lcom/whoop/archv2/model/template/ScreenTemplate;",
        "Lcom/whoop/design/models/WithGeneratedBindings;",
        "",
        "flowId",
        "",
        "currentStepList",
        "",
        "Lcom/whoop/archv2/model/template/FlowStep;",
        "steps",
        "bindings",
        "Lcom/whoop/design/models/binding/AggregateBinding;",
        "Lcom/whoop/design/models/binding/AggregateBindings;",
        "Lwc3/i;",
        "with",
        "Lj93/d;",
        "aggregateBindings",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$arch_v2_release",
        "(Lcom/whoop/archv2/model/template/FlowTemplate;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "",
        "accumulatedState",
        "bind",
        "(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;",
        "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "screenAnalytics",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "failureAnalyticEvent",
        "(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "()Ljava/util/Map;",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getFlowId",
        "Ljava/util/List;",
        "getCurrentStepList",
        "getCurrentStepList$annotations",
        "()V",
        "Ljava/util/Map;",
        "getSteps",
        "getBindings",
        "setBindings",
        "(Ljava/util/Map;)V",
        "getAggregateBindings",
        "setAggregateBindings",
        "Companion",
        "$serializer",
        "a",
        "arch-v2_release"
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

.field public static final Companion:Lcom/whoop/archv2/model/template/FlowTemplate$a;


# instance fields
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

.field private final currentStepList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final flowId:Ljava/lang/String;

.field private final steps:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowStep;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/archv2/model/template/FlowTemplate$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/archv2/model/template/FlowTemplate$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/archv2/model/template/FlowTemplate;->Companion:Lcom/whoop/archv2/model/template/FlowTemplate$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/archv2/model/template/FlowTemplate;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcb1/a;

    const/16 v3, 0x15

    invoke-direct {v2, v3}, Lcb1/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcb1/a;

    const/16 v4, 0x16

    invoke-direct {v3, v4}, Lcb1/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lcb1/a;

    const/16 v5, 0x17

    invoke-direct {v4, v5}, Lcb1/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v4, 0x5

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v2, v4, v5

    const/4 v2, 0x2

    aput-object v3, v4, v2

    const/4 v2, 0x3

    aput-object v0, v4, v2

    const/4 v0, 0x4

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/archv2/model/template/FlowTemplate;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/archv2/model/template/FlowTemplate$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/FlowTemplate$$serializer;

    invoke-virtual {p7}, Lcom/whoop/archv2/model/template/FlowTemplate$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    and-int/lit8 p2, p1, 0x2

    if-nez p2, :cond_1

    .line 2
    sget-object p2, Lm83/y;->w:Lm83/y;

    .line 3
    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    .line 4
    sget-object p2, Lm83/z;->w:Lm83/z;

    .line 5
    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    const/4 p3, 0x0

    if-nez p2, :cond_3

    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    :goto_2
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_4

    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    return-void

    :cond_4
    iput-object p6, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowStep;",
            ">;",
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

    const-string v0, "flowId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentStepList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "steps"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    .line 8
    iput-object p2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    .line 9
    iput-object p3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    .line 10
    iput-object p4, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    .line 11
    iput-object p5, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    .line 12
    sget-object p2, Lm83/y;->w:Lm83/y;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 13
    sget-object p3, Lm83/z;->w:Lm83/z;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, p6, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    :goto_1
    move-object v0, p0

    move-object v1, p1

    goto :goto_2

    :cond_3
    move-object v5, p5

    goto :goto_1

    .line 14
    :goto_2
    invoke-direct/range {v0 .. v5}, Lcom/whoop/archv2/model/template/FlowTemplate;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/archv2/model/template/FlowStep$$serializer;->INSTANCE:Lcom/whoop/archv2/model/template/FlowStep$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

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

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowTemplate;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/archv2/model/template/FlowTemplate;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowTemplate;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/archv2/model/template/FlowTemplate;->_childSerializers$_anonymous_$1()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/FlowTemplate;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/archv2/model/template/FlowTemplate;->copy(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCurrentStepList$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "current_step_list"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$arch_v2_release(Lcom/whoop/archv2/model/template/FlowTemplate;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/archv2/model/template/FlowTemplate;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getBindings()Ljava/util/Map;

    move-result-object v2

    if-eqz v2, :cond_5

    :goto_2
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getBindings()Ljava/util/Map;

    move-result-object v2

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v0, 0x4

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_3

    :cond_6
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    if-eqz v1, :cond_7

    :goto_3
    sget-object v1, Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;->INSTANCE:Lcom/whoop/design/models/binding/LenientAggregateBindingsSerializer;

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getAggregateBindings()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;
    .locals 10
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

    invoke-interface {p1}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getBindings()Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/archv2/model/template/FlowTemplate;->getAggregateBindings()Ljava/util/Map;

    move-result-object v1

    invoke-static {p0, v0, v1, p1}, Lcj0/d;->a(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;

    move-result-object v2

    iget-object v0, v2, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    new-instance v5, Ljava/util/LinkedHashMap;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    invoke-direct {v5, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/archv2/model/template/FlowStep;

    invoke-virtual {v1, p1}, Lcom/whoop/archv2/model/template/FlowStep;->bind(Ljava/util/Map;)Lcom/whoop/design/models/WithGeneratedBindings;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type com.whoop.archv2.model.template.FlowStep"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lcom/whoop/archv2/model/template/FlowStep;

    invoke-interface {v5, v3, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    const/16 v8, 0x1b

    const/4 v9, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v2 .. v9}, Lcom/whoop/archv2/model/template/FlowTemplate;->copy$default(Lcom/whoop/archv2/model/template/FlowTemplate;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/archv2/model/template/FlowTemplate;

    move-result-object p1

    return-object p1
.end method

.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    return-object v0
.end method

.method public final component4()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)Lcom/whoop/archv2/model/template/FlowTemplate;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowStep;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/design/models/binding/AggregateBinding;",
            ">;)",
            "Lcom/whoop/archv2/model/template/FlowTemplate;"
        }
    .end annotation

    const-string v0, "flowId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentStepList"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "steps"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/archv2/model/template/FlowTemplate;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/archv2/model/template/FlowTemplate;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/archv2/model/template/FlowTemplate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/archv2/model/template/FlowTemplate;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    iget-object v3, p1, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public failureAnalyticEvent(Lcom/whoop/analytics/ScreenAnalyticEventModel;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 2

    const-string v0, "screenAnalytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    invoke-static {p1}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return-object v0

    :cond_0
    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/archv2/model/template/FlowStep;

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/archv2/model/template/FlowStep;->getAnalyticEvents()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "step_failed"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/AnalyticEventModel;

    return-object p1

    :cond_1
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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

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

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    return-object v0
.end method

.method public final getCurrentStepList()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    return-object v0
.end method

.method public final getFlowId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    return-object v0
.end method

.method public bridge getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;
    .locals 1

    invoke-super {p0}, Lcom/whoop/archv2/model/template/ScreenTemplate;->getLifecycleInteractions()Lcom/whoop/design/models/modal/LifecycleInteractions;

    move-result-object v0

    return-object v0
.end method

.method public final getSteps()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/archv2/model/template/FlowStep;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    invoke-static {v2, v0, v1}, Lc13/a;->e(Ljava/util/Map;II)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    return v0
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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

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

    iput-object p1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->flowId:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->currentStepList:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->steps:Ljava/util/Map;

    iget-object v3, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->bindings:Ljava/util/Map;

    iget-object v4, p0, Lcom/whoop/archv2/model/template/FlowTemplate;->aggregateBindings:Ljava/util/Map;

    const-string v5, ", currentStepList="

    const-string v6, ", steps="

    const-string v7, "FlowTemplate(flowId="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", bindings="

    const-string v5, ", aggregateBindings="

    invoke-static {v0, v2, v1, v3, v5}, Lc13/a;->x(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v0, v4, v1}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
