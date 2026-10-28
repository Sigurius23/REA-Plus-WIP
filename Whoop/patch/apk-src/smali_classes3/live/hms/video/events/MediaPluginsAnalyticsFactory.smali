.class public final Llive/hms/video/events/MediaPluginsAnalyticsFactory;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007JN\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/events/MediaPluginsAnalyticsFactory;",
        "",
        "<init>",
        "()V",
        "failure",
        "Llive/hms/video/events/AnalyticsEvent;",
        "pluginName",
        "",
        "error",
        "Llive/hms/video/error/HMSException;",
        "added",
        "stats",
        "duration",
        "",
        "loadTime",
        "avgProcessingTimeWithMl",
        "",
        "avgProcessingTimeWithoutMl",
        "peakValueWithMl",
        "peakValueWithoutMl",
        "inputFrameRate",
        "",
        "pluginFrameRate",
        "lib_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Llive/hms/video/events/MediaPluginsAnalyticsFactory;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/events/MediaPluginsAnalyticsFactory;

    invoke-direct {v0}, Llive/hms/video/events/MediaPluginsAnalyticsFactory;-><init>()V

    sput-object v0, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->INSTANCE:Llive/hms/video/events/MediaPluginsAnalyticsFactory;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final added(Ljava/lang/String;)Llive/hms/video/events/AnalyticsEvent;
    .locals 4

    const-string v0, "pluginName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;->INFO:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "plugin_name"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Llive/hms/video/events/AnalyticsEvent;

    const/4 v2, 0x0

    const-string v3, "mediaPlugin.added"

    invoke-direct {p1, v3, v0, v2, v1}, Llive/hms/video/events/AnalyticsEvent;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;ZLjava/util/HashMap;)V

    return-object p1
.end method

.method public final failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;
    .locals 3

    const-string v0, "pluginName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;->ERROR:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "plugin_name"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Llive/hms/video/error/HMSException;->toAnalyticsProperties()Ljava/util/HashMap;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    new-instance p1, Llive/hms/video/events/AnalyticsEvent;

    const/4 p2, 0x0

    const-string v2, "mediaPlugin.failed"

    invoke-direct {p1, v2, v0, p2, v1}, Llive/hms/video/events/AnalyticsEvent;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;ZLjava/util/HashMap;)V

    return-object p1
.end method

.method public final stats(Ljava/lang/String;JJDDDDII)Llive/hms/video/events/AnalyticsEvent;
    .locals 3

    const-string v0, "pluginName"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;->INFO:Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    const-string v2, "plugin_name"

    invoke-interface {v1, v2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "duration"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const-string p2, "load_time"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p6, p7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "avg_processing_time"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p8, p9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "avg_processing_time_withoutML"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p10, p11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "peak_processing_time"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p12 .. p13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    const-string p2, "peak_processing_time_withoutML"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p14 .. p14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "input_frame_rate"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static/range {p15 .. p15}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    const-string p2, "plugin_frame_rate"

    invoke-interface {v1, p2, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p1, Llive/hms/video/events/AnalyticsEvent;

    const/4 p2, 0x0

    const-string p3, "mediaPlugin.stats"

    invoke-direct {p1, p3, v0, p2, v1}, Llive/hms/video/events/AnalyticsEvent;-><init>(Ljava/lang/String;Llive/hms/video/sdk/models/enums/HMSAnalyticsEventLevel;ZLjava/util/HashMap;)V

    return-object p1
.end method
