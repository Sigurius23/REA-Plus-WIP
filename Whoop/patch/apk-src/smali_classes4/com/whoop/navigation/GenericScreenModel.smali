.class public final Lcom/whoop/navigation/GenericScreenModel;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/navigation/CommonNavigationScreenModel;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/navigation/GenericScreenModel$$serializer;,
        Lcom/whoop/navigation/GenericScreenModel$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0087\u0008\u0018\u0000 P2\u00020\u0001:\u0002QRB{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0081\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010&J\u0012\u0010\'\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008)\u0010*J\u0018\u0010+\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010*J\u0086\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0010\u0008\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00102\u0010\u0008\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010 J\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00104\u001a\u0002032\u0008\u00102\u001a\u0004\u0018\u000101H\u00d6\u0003\u00a2\u0006\u0004\u00084\u00105J\'\u0010>\u001a\u00020;2\u0006\u00106\u001a\u00020\u00002\u0006\u00108\u001a\u0002072\u0006\u0010:\u001a\u000209H\u0001\u00a2\u0006\u0004\u0008<\u0010=R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010?\u001a\u0004\u0008@\u0010\u001cR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010A\u001a\u0004\u0008B\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010C\u001a\u0004\u0008D\u0010 R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010E\u001a\u0004\u0008F\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010G\u001a\u0004\u0008H\u0010$R\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010I\u001a\u0004\u0008J\u0010&R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010K\u001a\u0004\u0008L\u0010(R\u001f\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010M\u001a\u0004\u0008N\u0010*R\u001f\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010M\u001a\u0004\u0008O\u0010*\u00a8\u0006S"
    }
    d2 = {
        "Lcom/whoop/navigation/GenericScreenModel;",
        "Lcom/whoop/navigation/CommonNavigationScreenModel;",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "request",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "cachePolicy",
        "",
        "navigationStyle",
        "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "analyticEvents",
        "Lcom/whoop/analytics/MetricEventModel;",
        "metricEvents",
        "Lcom/whoop/navigation/AiAction;",
        "aiAction",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "onStartInteraction",
        "",
        "Lkotlinx/serialization/json/JsonElement;",
        "loadingTopItems",
        "errorTopItems",
        "<init>",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/navigation/models/ApiRequest;",
        "component2",
        "()Lcom/whoop/navigation/CachePolicyModel;",
        "component3",
        "()Ljava/lang/String;",
        "component4",
        "()Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "component5",
        "()Lcom/whoop/analytics/MetricEventModel;",
        "component6",
        "()Lcom/whoop/navigation/AiAction;",
        "component7",
        "()Lcom/whoop/navigation/models/GenericInteraction;",
        "component8",
        "()Ljava/util/List;",
        "component9",
        "copy",
        "(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)Lcom/whoop/navigation/GenericScreenModel;",
        "toString",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$navigation_release",
        "(Lcom/whoop/navigation/GenericScreenModel;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "getRequest",
        "Lcom/whoop/navigation/CachePolicyModel;",
        "getCachePolicy",
        "Ljava/lang/String;",
        "getNavigationStyle",
        "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
        "getAnalyticEvents",
        "Lcom/whoop/analytics/MetricEventModel;",
        "getMetricEvents",
        "Lcom/whoop/navigation/AiAction;",
        "getAiAction",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "getOnStartInteraction",
        "Ljava/util/List;",
        "getLoadingTopItems",
        "getErrorTopItems",
        "Companion",
        "$serializer",
        "a",
        "navigation_release"
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

.field public static final Companion:Lcom/whoop/navigation/GenericScreenModel$a;


# instance fields
.field private final aiAction:Lcom/whoop/navigation/AiAction;

.field private final analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

.field private final cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

.field private final errorTopItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final loadingTopItems:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation
.end field

.field private final metricEvents:Lcom/whoop/analytics/MetricEventModel;

.field private final navigationStyle:Ljava/lang/String;

.field private final onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

.field private final request:Lcom/whoop/navigation/models/ApiRequest;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    new-instance v0, Lcom/whoop/navigation/GenericScreenModel$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/navigation/GenericScreenModel$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/navigation/GenericScreenModel;->Companion:Lcom/whoop/navigation/GenericScreenModel$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/navigation/GenericScreenModel;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lj00/u;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Lj00/u;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v4, Lj00/u;

    const/16 v5, 0x16

    invoke-direct {v4, v5}, Lj00/u;-><init>(I)V

    invoke-static {v2, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    const/16 v4, 0x9

    new-array v4, v4, [Ll83/h;

    const/4 v5, 0x0

    aput-object v1, v4, v5

    const/4 v5, 0x1

    aput-object v1, v4, v5

    const/4 v5, 0x2

    aput-object v1, v4, v5

    const/4 v5, 0x3

    aput-object v1, v4, v5

    const/4 v5, 0x4

    aput-object v1, v4, v5

    const/4 v5, 0x5

    aput-object v1, v4, v5

    const/4 v5, 0x6

    aput-object v1, v4, v5

    const/4 v1, 0x7

    aput-object v3, v4, v1

    aput-object v2, v4, v0

    sput-object v4, Lcom/whoop/navigation/GenericScreenModel;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p1, 0x1

    const/4 v0, 0x1

    if-eq v0, p11, :cond_0

    .line 1
    sget-object p11, Lcom/whoop/navigation/GenericScreenModel$$serializer;->INSTANCE:Lcom/whoop/navigation/GenericScreenModel$$serializer;

    invoke-virtual {p11}, Lcom/whoop/navigation/GenericScreenModel$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p11

    invoke-static {p1, v0, p11}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    and-int/lit8 p2, p1, 0x2

    const/4 p11, 0x0

    if-nez p2, :cond_1

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    goto :goto_0

    :cond_1
    iput-object p3, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    :goto_0
    and-int/lit8 p2, p1, 0x4

    if-nez p2, :cond_2

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    goto :goto_1

    :cond_2
    iput-object p4, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    :goto_1
    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_3

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    goto :goto_2

    :cond_3
    iput-object p5, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    :goto_2
    and-int/lit8 p2, p1, 0x10

    if-nez p2, :cond_4

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    goto :goto_3

    :cond_4
    iput-object p6, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    :goto_3
    and-int/lit8 p2, p1, 0x20

    if-nez p2, :cond_5

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    goto :goto_4

    :cond_5
    iput-object p7, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    :goto_4
    and-int/lit8 p2, p1, 0x40

    if-nez p2, :cond_6

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_5

    :cond_6
    iput-object p8, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :goto_5
    and-int/lit16 p2, p1, 0x80

    if-nez p2, :cond_7

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    goto :goto_6

    :cond_7
    iput-object p9, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    :goto_6
    and-int/lit16 p1, p1, 0x100

    if-nez p1, :cond_8

    iput-object p11, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    return-void

    :cond_8
    iput-object p10, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/navigation/CachePolicyModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
            "Lcom/whoop/analytics/MetricEventModel;",
            "Lcom/whoop/navigation/AiAction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)V"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    .line 4
    iput-object p2, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    .line 5
    iput-object p3, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    .line 7
    iput-object p5, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    .line 8
    iput-object p6, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    .line 9
    iput-object p7, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    .line 10
    iput-object p8, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    .line 11
    iput-object p9, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x2

    const/4 v0, 0x0

    if-eqz p11, :cond_0

    move-object p2, v0

    :cond_0
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_1

    move-object p3, v0

    :cond_1
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_2

    move-object p4, v0

    :cond_2
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_3

    move-object p5, v0

    :cond_3
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_4

    move-object p6, v0

    :cond_4
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_5

    move-object p7, v0

    :cond_5
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_6

    move-object p8, v0

    :cond_6
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_7

    move-object p10, v0

    :goto_0
    move-object p9, p8

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
    move-object p10, p9

    goto :goto_0

    .line 12
    :goto_1
    invoke-direct/range {p1 .. p10}, Lcom/whoop/navigation/GenericScreenModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lad3/n;->a:Lad3/n;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/GenericScreenModel;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/navigation/GenericScreenModel;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/navigation/GenericScreenModel;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/navigation/GenericScreenModel;Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;ILjava/lang/Object;)Lcom/whoop/navigation/GenericScreenModel;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/navigation/GenericScreenModel;->copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)Lcom/whoop/navigation/GenericScreenModel;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$navigation_release(Lcom/whoop/navigation/GenericScreenModel;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/navigation/GenericScreenModel;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/navigation/models/ApiRequest$$serializer;->INSTANCE:Lcom/whoop/navigation/models/ApiRequest$$serializer;

    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/navigation/CachePolicyModel$$serializer;->INSTANCE:Lcom/whoop/navigation/CachePolicyModel$$serializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x2

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    if-eqz v2, :cond_3

    :goto_1
    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_4

    goto :goto_2

    :cond_4
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    if-eqz v2, :cond_5

    :goto_2
    sget-object v2, Lcom/whoop/analytics/ScreenAnalyticEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/ScreenAnalyticEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_5
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_6

    goto :goto_3

    :cond_6
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    if-eqz v2, :cond_7

    :goto_3
    sget-object v2, Lcom/whoop/analytics/MetricEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/MetricEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_7
    const/4 v1, 0x5

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_4

    :cond_8
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-eqz v2, :cond_9

    :goto_4
    sget-object v2, Lcom/whoop/navigation/AiAction$$serializer;->INSTANCE:Lcom/whoop/navigation/AiAction$$serializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_9
    const/4 v1, 0x6

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_a

    goto :goto_5

    :cond_a
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v2, :cond_b

    :goto_5
    sget-object v2, Lcom/whoop/navigation/models/GenericInteraction$$serializer;->INSTANCE:Lcom/whoop/navigation/models/GenericInteraction$$serializer;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_b
    const/4 v1, 0x7

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_c

    goto :goto_6

    :cond_c
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    if-eqz v2, :cond_d

    :goto_6
    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_d
    const/16 v1, 0x8

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_e

    goto :goto_7

    :cond_e
    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    if-eqz v2, :cond_f

    :goto_7
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_f
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/analytics/ScreenAnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final component6()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final component7()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final component8()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    return-object v0
.end method

.method public final component9()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    return-object v0
.end method

.method public final copy(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)Lcom/whoop/navigation/GenericScreenModel;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lcom/whoop/navigation/CachePolicyModel;",
            "Ljava/lang/String;",
            "Lcom/whoop/analytics/ScreenAnalyticEventModel;",
            "Lcom/whoop/analytics/MetricEventModel;",
            "Lcom/whoop/navigation/AiAction;",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;",
            "Ljava/util/List<",
            "+",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;)",
            "Lcom/whoop/navigation/GenericScreenModel;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/navigation/GenericScreenModel;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/whoop/navigation/GenericScreenModel;-><init>(Lcom/whoop/navigation/models/ApiRequest;Lcom/whoop/navigation/CachePolicyModel;Ljava/lang/String;Lcom/whoop/analytics/ScreenAnalyticEventModel;Lcom/whoop/analytics/MetricEventModel;Lcom/whoop/navigation/AiAction;Lcom/whoop/navigation/models/GenericInteraction;Ljava/util/List;Ljava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/navigation/GenericScreenModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/navigation/GenericScreenModel;

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    iget-object p1, p1, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAiAction()Lcom/whoop/navigation/AiAction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    return-object v0
.end method

.method public final getAnalyticEvents()Lcom/whoop/analytics/ScreenAnalyticEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    return-object v0
.end method

.method public final getCachePolicy()Lcom/whoop/navigation/CachePolicyModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    return-object v0
.end method

.method public final getErrorTopItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    return-object v0
.end method

.method public final getLoadingTopItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkotlinx/serialization/json/JsonElement;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    return-object v0
.end method

.method public final getMetricEvents()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final getNavigationStyle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    return-object v0
.end method

.method public final getOnStartInteraction()Lcom/whoop/navigation/models/GenericInteraction;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/navigation/models/ApiRequest;
    .locals 1

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    invoke-virtual {v0}, Lcom/whoop/navigation/models/ApiRequest;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/CachePolicyModel;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    if-nez v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/analytics/ScreenAnalyticEventModel;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    if-nez v1, :cond_3

    move v1, v2

    goto :goto_3

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/analytics/MetricEventModel;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    if-nez v1, :cond_4

    move v1, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->hashCode()I

    move-result v1

    :goto_4
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    if-nez v1, :cond_5

    move v1, v2

    goto :goto_5

    :cond_5
    invoke-virtual {v1}, Lcom/whoop/navigation/models/GenericInteraction;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    if-nez v1, :cond_6

    move v1, v2

    goto :goto_6

    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/navigation/GenericScreenModel;->request:Lcom/whoop/navigation/models/ApiRequest;

    iget-object v1, p0, Lcom/whoop/navigation/GenericScreenModel;->cachePolicy:Lcom/whoop/navigation/CachePolicyModel;

    iget-object v2, p0, Lcom/whoop/navigation/GenericScreenModel;->navigationStyle:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/navigation/GenericScreenModel;->analyticEvents:Lcom/whoop/analytics/ScreenAnalyticEventModel;

    iget-object v4, p0, Lcom/whoop/navigation/GenericScreenModel;->metricEvents:Lcom/whoop/analytics/MetricEventModel;

    iget-object v5, p0, Lcom/whoop/navigation/GenericScreenModel;->aiAction:Lcom/whoop/navigation/AiAction;

    iget-object v6, p0, Lcom/whoop/navigation/GenericScreenModel;->onStartInteraction:Lcom/whoop/navigation/models/GenericInteraction;

    iget-object v7, p0, Lcom/whoop/navigation/GenericScreenModel;->loadingTopItems:Ljava/util/List;

    iget-object v8, p0, Lcom/whoop/navigation/GenericScreenModel;->errorTopItems:Ljava/util/List;

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "GenericScreenModel(request="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", cachePolicy="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", navigationStyle="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", analyticEvents="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricEvents="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", aiAction="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", onStartInteraction="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", loadingTopItems="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", errorTopItems="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lc13/a;->m(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
