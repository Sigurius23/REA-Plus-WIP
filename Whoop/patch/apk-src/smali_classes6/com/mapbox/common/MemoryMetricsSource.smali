.class public final Lcom/mapbox/common/MemoryMetricsSource;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/common/MetricsSource;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/common/MemoryMetricsSource$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u000c\u0010\u0006\u001a\u00020\u0007*\u00020\u0008H\u0002\u00a8\u0006\n"
    }
    d2 = {
        "Lcom/mapbox/common/MemoryMetricsSource;",
        "Lcom/mapbox/common/MetricsSource;",
        "()V",
        "getMetrics",
        "",
        "Lcom/mapbox/common/Metrics;",
        "toMetricValue",
        "Lcom/mapbox/bindgen/Value;",
        "",
        "Companion",
        "common_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x7,
        0x1
    }
    xi = 0x30
.end annotation


# static fields
.field public static final Companion:Lcom/mapbox/common/MemoryMetricsSource$Companion;

.field private static final instance$delegate:Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ll83/h;"
        }
    .end annotation
.end field

.field private static final prefix:Ljava/lang/String; = "mapbox/common/tracker/android/"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/common/MemoryMetricsSource$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/common/MemoryMetricsSource$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/common/MemoryMetricsSource;->Companion:Lcom/mapbox/common/MemoryMetricsSource$Companion;

    sget-object v0, Lcom/mapbox/common/MemoryMetricsSource$Companion$instance$2;->INSTANCE:Lcom/mapbox/common/MemoryMetricsSource$Companion$instance$2;

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    sput-object v0, Lcom/mapbox/common/MemoryMetricsSource;->instance$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/mapbox/common/MemoryMetricsSource;-><init>()V

    return-void
.end method

.method public static final synthetic access$getInstance$delegate$cp()Ll83/h;
    .locals 1

    sget-object v0, Lcom/mapbox/common/MemoryMetricsSource;->instance$delegate:Ll83/h;

    return-object v0
.end method

.method private final toMetricValue(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;
    .locals 1

    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lcom/mapbox/common/ValueUtilsKt;->toValue(Ljava/lang/Integer;)Lcom/mapbox/bindgen/Value;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    invoke-static {p1}, Lcom/mapbox/common/ValueUtilsKt;->toValue(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public getMetrics()Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/mapbox/common/Metrics;",
            ">;"
        }
    .end annotation

    new-instance v0, Landroid/os/Debug$MemoryInfo;

    invoke-direct {v0}, Landroid/os/Debug$MemoryInfo;-><init>()V

    invoke-static {v0}, Landroid/os/Debug;->getMemoryInfo(Landroid/os/Debug$MemoryInfo;)V

    invoke-virtual {v0}, Landroid/os/Debug$MemoryInfo;->getMemoryStats()Ljava/util/Map;

    move-result-object v0

    const-string v1, "memInfo.memoryStats"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/ArrayList;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    new-instance v3, Lcom/mapbox/common/Metrics;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "mapbox/common/tracker/android/"

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    const-string v5, "it.value"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/mapbox/common/MemoryMetricsSource;->toMetricValue(Ljava/lang/String;)Lcom/mapbox/bindgen/Value;

    move-result-object v2

    invoke-direct {v3, v4, v2}, Lcom/mapbox/common/Metrics;-><init>(Ljava/lang/String;Lcom/mapbox/bindgen/Value;)V

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method
