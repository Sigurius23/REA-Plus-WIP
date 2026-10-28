.class public final Lcom/mapbox/maps/module/TelemetryEvent;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/module/TelemetryEvent$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0011\u0008\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/mapbox/maps/module/TelemetryEvent;",
        "",
        "",
        "name",
        "<init>",
        "(Ljava/lang/String;)V",
        "Ll83/a0;",
        "increment",
        "()V",
        "Ljava/lang/String;",
        "Lcom/mapbox/common/FeatureTelemetryCounter;",
        "counter",
        "Lcom/mapbox/common/FeatureTelemetryCounter;",
        "Companion",
        "sdk-base_release"
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
.field public static final Companion:Lcom/mapbox/maps/module/TelemetryEvent$Companion;


# instance fields
.field private final counter:Lcom/mapbox/common/FeatureTelemetryCounter;

.field private final name:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/module/TelemetryEvent$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/module/TelemetryEvent$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/module/TelemetryEvent;->Companion:Lcom/mapbox/maps/module/TelemetryEvent$Companion;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/mapbox/maps/module/TelemetryEvent;->name:Ljava/lang/String;

    .line 4
    :try_start_0
    invoke-static {p1}, Lcom/mapbox/common/FeatureTelemetryCounter;->create(Ljava/lang/String;)Lcom/mapbox/common/FeatureTelemetryCounter;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    const/4 p1, 0x0

    .line 5
    :goto_0
    iput-object p1, p0, Lcom/mapbox/maps/module/TelemetryEvent;->counter:Lcom/mapbox/common/FeatureTelemetryCounter;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/mapbox/maps/module/TelemetryEvent;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final increment()V
    .locals 1

    iget-object v0, p0, Lcom/mapbox/maps/module/TelemetryEvent;->counter:Lcom/mapbox/common/FeatureTelemetryCounter;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/mapbox/common/FeatureTelemetryCounter;->increment()V

    :cond_0
    return-void
.end method
