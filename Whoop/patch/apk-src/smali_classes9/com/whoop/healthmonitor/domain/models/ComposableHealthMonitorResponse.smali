.class public final Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$$serializer;,
        Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0010\u000b\n\u0002\u0008\u000e\u0008\u0087\u0008\u0018\u0000 72\u00020\u0001:\u000287B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\rBS\u0008\u0010\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u000c\u0010\u0012J\'\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0001\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0016\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001dJ\u0010\u0010!\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"J\u0012\u0010#\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$JL\u0010%\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u00c6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u000eH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u001a\u0010,\u001a\u00020+2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010.\u001a\u0004\u0008/\u0010\u001dR\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010.\u001a\u0004\u00082\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00103\u001a\u0004\u00084\u0010\"R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00105\u001a\u0004\u00086\u0010$\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;",
        "",
        "",
        "title",
        "",
        "Lcom/whoop/design/models/DesignSystemModel;",
        "items",
        "footer",
        "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
        "analytics",
        "Lcom/whoop/healthmonitor/domain/models/MetaData;",
        "metadata",
        "<init>",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$health_monitor_release",
        "(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Ljava/util/List;",
        "component3",
        "component4",
        "()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
        "component5",
        "()Lcom/whoop/healthmonitor/domain/models/MetaData;",
        "copy",
        "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "Ljava/util/List;",
        "getItems",
        "getFooter",
        "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
        "getAnalytics",
        "Lcom/whoop/healthmonitor/domain/models/MetaData;",
        "getMetadata",
        "Companion",
        "$serializer",
        "health-monitor_release"
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

.field public static final Companion:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;


# instance fields
.field private final analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

.field private final footer:Ljava/lang/String;

.field private final items:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation
.end field

.field private final metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->Companion:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lyc2/a;

    invoke-direct {v3, v0}, Lyc2/a;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

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

    sput-object v2, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p7, p1, 0x1f

    const/16 v0, 0x1f

    if-eq v0, p7, :cond_0

    .line 1
    sget-object p7, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$$serializer;->INSTANCE:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$$serializer;

    invoke-virtual {p7}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p7

    invoke-static {p1, v0, p7}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    iput-object p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    iput-object p6, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
            "Lcom/whoop/healthmonitor/domain/models/MetaData;",
            ")V"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    iput-object p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    iput-object p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    iput-object p5, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

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

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;ILjava/lang/Object;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$health_monitor_release(Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->$childSerializers:[Ll83/h;

    const/4 v1, 0x0

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v1, v2}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;->INSTANCE:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel$$serializer;

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/healthmonitor/domain/models/MetaData$$serializer;->INSTANCE:Lcom/whoop/healthmonitor/domain/models/MetaData$$serializer;

    iget-object p0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    const/4 v1, 0x4

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    return-object v0
.end method

.method public final component5()Lcom/whoop/healthmonitor/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "+",
            "Lcom/whoop/design/models/DesignSystemModel;",
            ">;",
            "Ljava/lang/String;",
            "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;",
            "Lcom/whoop/healthmonitor/domain/models/MetaData;",
            ")",
            "Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;"
        }
    .end annotation

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "items"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;-><init>(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;Lcom/whoop/healthmonitor/domain/models/MetaData;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    iget-object v3, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    iget-object p1, p1, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAnalytics()Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    return-object v0
.end method

.method public final getFooter()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

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

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    return-object v0
.end method

.method public final getMetadata()Lcom/whoop/healthmonitor/domain/models/MetaData;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    invoke-virtual {v2}, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/healthmonitor/domain/models/MetaData;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->items:Ljava/util/List;

    iget-object v2, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->footer:Ljava/lang/String;

    iget-object v3, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->analytics:Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorAnalyticsModel;

    iget-object v4, p0, Lcom/whoop/healthmonitor/domain/models/ComposableHealthMonitorResponse;->metadata:Lcom/whoop/healthmonitor/domain/models/MetaData;

    const-string v5, ", items="

    const-string v6, ", footer="

    const-string v7, "ComposableHealthMonitorResponse(title="

    invoke-static {v7, v0, v5, v6, v1}, Lr;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", analytics="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", metadata="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
