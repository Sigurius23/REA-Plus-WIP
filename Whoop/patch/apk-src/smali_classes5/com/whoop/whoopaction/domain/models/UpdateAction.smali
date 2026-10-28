.class public final Lcom/whoop/whoopaction/domain/models/UpdateAction;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/whoopaction/domain/models/Action;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whoopaction/domain/models/UpdateAction$$serializer;,
        Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0011\u0008\u0087\u0008\u0018\u0000 ?2\u00020\u0001:\u0002@?BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fBY\u0008\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0018\u00010\n\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u000e\u0010\u0014J\'\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u001c\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'JT\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008*\u0010+J\u0010\u0010,\u001a\u00020\u0010H\u00d6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u001a\u00101\u001a\u0002002\u0008\u0010/\u001a\u0004\u0018\u00010.H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010\u001fR\"\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u00105\u0012\u0004\u00087\u00108\u001a\u0004\u00086\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00109\u001a\u0004\u0008:\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u0010;\u001a\u0004\u0008<\u0010%R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010=\u001a\u0004\u0008>\u0010\'\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/whoopaction/domain/models/UpdateAction;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "Lcom/whoop/whoopaction/domain/models/Request;",
        "request",
        "Lcom/whoop/navigation/e;",
        "completionDestination",
        "Lcom/whoop/navigation/DismissEventModel;",
        "dismissEvent",
        "Lcom/whoop/analytics/MetricEventModel;",
        "metricEvent",
        "",
        "",
        "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
        "media",
        "<init>",
        "(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$whoop_action_release",
        "(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Lcom/whoop/whoopaction/domain/models/Request;",
        "component2",
        "()Lcom/whoop/navigation/e;",
        "component3",
        "()Lcom/whoop/navigation/DismissEventModel;",
        "component4",
        "()Lcom/whoop/analytics/MetricEventModel;",
        "component5",
        "()Ljava/util/Map;",
        "copy",
        "(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/UpdateAction;",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lcom/whoop/whoopaction/domain/models/Request;",
        "getRequest",
        "Lcom/whoop/navigation/e;",
        "getCompletionDestination",
        "getCompletionDestination$annotations",
        "()V",
        "Lcom/whoop/navigation/DismissEventModel;",
        "getDismissEvent",
        "Lcom/whoop/analytics/MetricEventModel;",
        "getMetricEvent",
        "Ljava/util/Map;",
        "getMedia",
        "Companion",
        "$serializer",
        "whoop-action_release"
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

.field public static final Companion:Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;


# instance fields
.field private final completionDestination:Lcom/whoop/navigation/e;

.field private final dismissEvent:Lcom/whoop/navigation/DismissEventModel;

.field private final media:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
            ">;"
        }
    .end annotation
.end field

.field private final metricEvent:Lcom/whoop/analytics/MetricEventModel;

.field private final request:Lcom/whoop/whoopaction/domain/models/Request;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->Companion:Lcom/whoop/whoopaction/domain/models/UpdateAction$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->$stable:I

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;

    const/16 v4, 0x1b

    invoke-direct {v3, v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/a;-><init>(I)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/4 v3, 0x5

    new-array v3, v3, [Ll83/h;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v2, v3, v4

    const/4 v2, 0x2

    aput-object v1, v3, v2

    const/4 v2, 0x3

    aput-object v1, v3, v2

    const/4 v1, 0x4

    aput-object v0, v3, v1

    sput-object v3, Lcom/whoop/whoopaction/domain/models/UpdateAction;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x7

    const/4 v0, 0x7

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/whoopaction/domain/models/UpdateAction$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/UpdateAction$$serializer;

    invoke-virtual {p7}, Lcom/whoop/whoopaction/domain/models/UpdateAction$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    and-int/lit8 p2, p1, 0x8

    if-nez p2, :cond_1

    const/4 p2, 0x0

    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    goto :goto_0

    :cond_1
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    :goto_0
    and-int/lit8 p1, p1, 0x10

    if-nez p1, :cond_2

    .line 2
    sget-object p1, Lm83/z;->w:Lm83/z;

    .line 3
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    return-void

    :cond_2
    iput-object p6, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Request;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Lcom/whoop/analytics/MetricEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
            ">;)V"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "media"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput-object p1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    .line 6
    iput-object p2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    .line 7
    iput-object p3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    .line 8
    iput-object p4, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    .line 9
    iput-object p5, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 6

    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_0

    const/4 p4, 0x0

    :cond_0
    move-object v4, p4

    and-int/lit8 p4, p6, 0x10

    if-eqz p4, :cond_1

    .line 10
    sget-object p5, Lm83/z;->w:Lm83/z;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v5, p5

    .line 11
    invoke-direct/range {v0 .. v5}, Lcom/whoop/whoopaction/domain/models/UpdateAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)V

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

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 3

    new-instance v0, Lkotlinx/serialization/internal/LinkedHashMapSerializer;

    sget-object v1, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    sget-object v2, Lcom/whoop/whoopaction/domain/models/MediaCaps$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/MediaCaps$$serializer;

    invoke-direct {v0, v1, v2}, Lkotlinx/serialization/internal/LinkedHashMapSerializer;-><init>(Lwc3/c;Lwc3/c;)V

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/whoopaction/domain/models/UpdateAction;->copy(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getCompletionDestination$annotations()V
    .locals 0

    return-void
.end method

.method public static final synthetic write$Self$whoop_action_release(Lcom/whoop/whoopaction/domain/models/UpdateAction;Lzc3/c;Lyc3/g;)V
    .locals 4

    sget-object v0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->$childSerializers:[Ll83/h;

    sget-object v1, Lcom/whoop/whoopaction/domain/models/Request$$serializer;->INSTANCE:Lcom/whoop/whoopaction/domain/models/Request$$serializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    aget-object v2, v0, v1

    invoke-interface {v2}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v1, Lcom/whoop/navigation/DismissEventModel$$serializer;->INSTANCE:Lcom/whoop/navigation/DismissEventModel$$serializer;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    const/4 v3, 0x2

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    if-eqz v2, :cond_1

    :goto_0
    sget-object v2, Lcom/whoop/analytics/MetricEventModel$$serializer;->INSTANCE:Lcom/whoop/analytics/MetricEventModel$$serializer;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    invoke-interface {p1, p2, v1, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_1
    const/4 v1, 0x4

    invoke-interface {p1, p2, v1}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :goto_1
    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object p0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/whoopaction/domain/models/Request;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    return-object v0
.end method

.method public final component2()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final component3()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final component5()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    return-object v0
.end method

.method public final copy(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)Lcom/whoop/whoopaction/domain/models/UpdateAction;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/Request;",
            "Lcom/whoop/navigation/e;",
            "Lcom/whoop/navigation/DismissEventModel;",
            "Lcom/whoop/analytics/MetricEventModel;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
            ">;)",
            "Lcom/whoop/whoopaction/domain/models/UpdateAction;"
        }
    .end annotation

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "media"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/whoopaction/domain/models/UpdateAction;-><init>(Lcom/whoop/whoopaction/domain/models/Request;Lcom/whoop/navigation/e;Lcom/whoop/navigation/DismissEventModel;Lcom/whoop/analytics/MetricEventModel;Ljava/util/Map;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    iget-object v3, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    iget-object p1, p1, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCompletionDestination()Lcom/whoop/navigation/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    return-object v0
.end method

.method public final getDismissEvent()Lcom/whoop/navigation/DismissEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    return-object v0
.end method

.method public final getMedia()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/whoop/whoopaction/domain/models/MediaCaps;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    return-object v0
.end method

.method public final getMetricEvent()Lcom/whoop/analytics/MetricEventModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    return-object v0
.end method

.method public final getRequest()Lcom/whoop/whoopaction/domain/models/Request;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/Request;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/DismissEventModel;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lcom/whoop/analytics/MetricEventModel;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    iget-object v0, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->request:Lcom/whoop/whoopaction/domain/models/Request;

    iget-object v1, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->completionDestination:Lcom/whoop/navigation/e;

    iget-object v2, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->dismissEvent:Lcom/whoop/navigation/DismissEventModel;

    iget-object v3, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->metricEvent:Lcom/whoop/analytics/MetricEventModel;

    iget-object v4, p0, Lcom/whoop/whoopaction/domain/models/UpdateAction;->media:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "UpdateAction(request="

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", completionDestination="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", dismissEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", metricEvent="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", media="

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v5, v4, v0}, Lev/n;->l(Ljava/lang/StringBuilder;Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
