.class public final Lcom/mapbox/maps/MapboxTracing;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\r\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J\r\u0010\u0008\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0008\u0010\u0003R\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T\u00a2\u0006\u0006\n\u0004\u0008\n\u0010\u000bR\"\u0010\r\u001a\u00020\u000c8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/mapbox/maps/MapboxTracing;",
        "",
        "<init>",
        "()V",
        "Ll83/a0;",
        "enableAll",
        "enablePlatform",
        "enableCore",
        "disableAll",
        "",
        "MAPBOX_TRACE_ID",
        "Ljava/lang/String;",
        "",
        "platformTracingEnabled",
        "Z",
        "getPlatformTracingEnabled$maps_sdk_release",
        "()Z",
        "setPlatformTracingEnabled$maps_sdk_release",
        "(Z)V",
        "maps-sdk_release"
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
.field public static final INSTANCE:Lcom/mapbox/maps/MapboxTracing;

.field public static final MAPBOX_TRACE_ID:Ljava/lang/String; = "mbx"

.field private static platformTracingEnabled:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/mapbox/maps/MapboxTracing;

    invoke-direct {v0}, Lcom/mapbox/maps/MapboxTracing;-><init>()V

    sput-object v0, Lcom/mapbox/maps/MapboxTracing;->INSTANCE:Lcom/mapbox/maps/MapboxTracing;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final disableAll()V
    .locals 1

    const/4 v0, 0x0

    sput-boolean v0, Lcom/mapbox/maps/MapboxTracing;->platformTracingEnabled:Z

    sget-object v0, Lcom/mapbox/maps/TracingBackendType;->NOOP:Lcom/mapbox/maps/TracingBackendType;

    invoke-static {v0}, Lcom/mapbox/maps/Tracing;->setTracingBackendType(Lcom/mapbox/maps/TracingBackendType;)V

    return-void
.end method

.method public final enableAll()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/mapbox/maps/MapboxTracing;->platformTracingEnabled:Z

    sget-object v0, Lcom/mapbox/maps/TracingBackendType;->PLATFORM:Lcom/mapbox/maps/TracingBackendType;

    invoke-static {v0}, Lcom/mapbox/maps/Tracing;->setTracingBackendType(Lcom/mapbox/maps/TracingBackendType;)V

    return-void
.end method

.method public final enableCore()V
    .locals 1

    sget-object v0, Lcom/mapbox/maps/TracingBackendType;->PLATFORM:Lcom/mapbox/maps/TracingBackendType;

    invoke-static {v0}, Lcom/mapbox/maps/Tracing;->setTracingBackendType(Lcom/mapbox/maps/TracingBackendType;)V

    return-void
.end method

.method public final enablePlatform()V
    .locals 1

    const/4 v0, 0x1

    sput-boolean v0, Lcom/mapbox/maps/MapboxTracing;->platformTracingEnabled:Z

    return-void
.end method

.method public final getPlatformTracingEnabled$maps_sdk_release()Z
    .locals 1

    sget-boolean v0, Lcom/mapbox/maps/MapboxTracing;->platformTracingEnabled:Z

    return v0
.end method

.method public final setPlatformTracingEnabled$maps_sdk_release(Z)V
    .locals 0

    sput-boolean p1, Lcom/mapbox/maps/MapboxTracing;->platformTracingEnabled:Z

    return-void
.end method
