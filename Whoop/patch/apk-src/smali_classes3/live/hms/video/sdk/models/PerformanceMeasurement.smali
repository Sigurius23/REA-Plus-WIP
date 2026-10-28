.class public final Llive/hms/video/sdk/models/PerformanceMeasurement;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/io/Closeable;
.implements Llive/hms/video/sdk/models/IRetryAttemptTracking;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001e\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ[\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0014`\u00152\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u001f\u0010 J \u0010#\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u000c2\u0006\u0010\"\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008#\u0010$J\u0017\u0010(\u001a\u00020\u00182\u0006\u0010%\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008&\u0010\'J\u000f\u0010*\u001a\u00020\u0018H\u0000\u00a2\u0006\u0004\u0008)\u0010\u001aJ\u0017\u0010-\u001a\u00020\u00182\u0006\u0010+\u001a\u00020\u0010H\u0000\u00a2\u0006\u0004\u0008,\u0010\'J\u000f\u0010.\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\u0008.\u0010\u001aR\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010/R\u0014\u0010\u0008\u001a\u00020\u00078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u00100R \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u00101R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u00101R \u00102\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u00101R\u0016\u00103\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00083\u00104R\u0016\u00105\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00085\u00106R\u001a\u00108\u001a\u0008\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00088\u00109R\u001a\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u0013078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008:\u00109\u00a8\u0006;"
    }
    d2 = {
        "Llive/hms/video/sdk/models/PerformanceMeasurement;",
        "Ljava/io/Closeable;",
        "Llive/hms/video/sdk/models/IRetryAttemptTracking;",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "Landroid/content/Context;",
        "applicationContext",
        "Llive/hms/video/network/HMSNetworkManager;",
        "hmsNetworkManager",
        "<init>",
        "(Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Llive/hms/video/network/HMSNetworkManager;)V",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Llive/hms/video/sdk/models/EVENT_TYPE;",
        "",
        "startTimes",
        "stopTimes",
        "",
        "isJoin",
        "Ljava/util/HashMap;",
        "",
        "",
        "Lkotlin/collections/HashMap;",
        "getPropertiesFromTimes",
        "(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Z)Ljava/util/HashMap;",
        "Ll83/a0;",
        "clearValues",
        "()V",
        "eventType",
        "start$lib_release",
        "(Llive/hms/video/sdk/models/EVENT_TYPE;)V",
        "start",
        "end$lib_release",
        "(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;",
        "end",
        "times",
        "numberedValue",
        "(Llive/hms/video/sdk/models/EVENT_TYPE;JLq83/d;)Ljava/lang/Object;",
        "success",
        "fireJoinPerformanceMeasurementEvent$lib_release",
        "(Z)V",
        "fireJoinPerformanceMeasurementEvent",
        "startPreview$lib_release",
        "startPreview",
        "eventSuccessful",
        "firePreviewPerformanceMeasurementEvent$lib_release",
        "firePreviewPerformanceMeasurementEvent",
        "close",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "Llive/hms/video/network/HMSNetworkManager;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "numberEvents",
        "previewStartTime",
        "J",
        "isPreviewCalled",
        "Z",
        "Ljava/util/HashSet;",
        "eventsThatWereEnded",
        "Ljava/util/HashSet;",
        "eventsThatWereStarted",
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


# instance fields
.field private analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private final eventsThatWereEnded:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final eventsThatWereStarted:Ljava/util/HashSet;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

.field private isPreviewCalled:Z

.field private final numberEvents:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private previewStartTime:J

.field private final startTimes:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private final stopTimes:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Llive/hms/video/events/AnalyticsEventsService;Landroid/content/Context;Llive/hms/video/network/HMSNetworkManager;)V
    .locals 1

    const-string v0, "analyticsEventsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationContext"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "hmsNetworkManager"

    invoke-static {p3, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    iput-object p3, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->numberEvents:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->eventsThatWereEnded:Ljava/util/HashSet;

    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->eventsThatWereStarted:Ljava/util/HashSet;

    return-void
.end method

.method private final clearValues()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->numberEvents:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method

.method private final getPropertiesFromTimes(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Z)Ljava/util/HashMap;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Ljava/lang/Long;",
            ">;",
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "Ljava/lang/Long;",
            ">;Z)",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    if-eqz p3, :cond_0

    sget-object p3, Llive/hms/video/sdk/models/EVENT_TYPE;->PREVIEW_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {p1, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2, p3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p1}, Ljava/util/Map;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Long;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmp-long v3, v3, v5

    if-ltz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v1}, Llive/hms/video/sdk/models/EVENT_TYPE;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_2
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-interface {v0, v1}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    iget-object p1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->numberEvents:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, p1}, Ljava/util/HashMap;->putAll(Ljava/util/Map;)V

    return-object p3
.end method


# virtual methods
.method public close()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->isPreviewCalled:Z

    invoke-direct {p0}, Llive/hms/video/sdk/models/PerformanceMeasurement;->clearValues()V

    return-void
.end method

.method public final end$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)Llive/hms/video/sdk/models/PerformanceMeasurement;
    .locals 2

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final fireJoinPerformanceMeasurementEvent$lib_release(Z)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->JOIN_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    const-string v1, "PerformanceJoinEvents"

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v2, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v3, 0x1

    invoke-direct {p0, v0, v2, v3}, Llive/hms/video/sdk/models/PerformanceMeasurement;->getPropertiesFromTimes(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Z)Ljava/util/HashMap;

    move-result-object v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->isPreviewCalled:Z

    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v2

    const-string v3, "is_preview_called"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->hmsNetworkManager:Llive/hms/video/network/HMSNetworkManager;

    invoke-virtual {v2}, Llive/hms/video/network/HMSNetworkManager;->getConnectedNetworkType()Ljava/lang/String;

    move-result-object v2

    const-string v3, "network_type"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Sending event: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v2, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v2, p1, v0}, Llive/hms/video/events/AnalyticsEventFactory;->joinStatusEvent(ZLjava/util/HashMap;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    invoke-virtual {v1, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    goto :goto_0

    :cond_0
    const-string p1, "Throwing away a flush since the measurement was wrong by not having a time at all"

    invoke-static {v1, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    invoke-direct {p0}, Llive/hms/video/sdk/models/PerformanceMeasurement;->clearValues()V

    return-void
.end method

.method public final firePreviewPerformanceMeasurementEvent$lib_release(Z)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    sget-object v1, Llive/hms/video/sdk/models/EVENT_TYPE;->PREVIEW_CALL:Llive/hms/video/sdk/models/EVENT_TYPE;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    iget-wide v2, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->previewStartTime:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    iget-object v1, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->stopTimes:Ljava/util/concurrent/ConcurrentHashMap;

    const/4 v2, 0x0

    invoke-direct {p0, v0, v1, v2}, Llive/hms/video/sdk/models/PerformanceMeasurement;->getPropertiesFromTimes(Ljava/util/concurrent/ConcurrentHashMap;Ljava/util/concurrent/ConcurrentHashMap;Z)Ljava/util/HashMap;

    move-result-object v0

    sget-object v1, Llive/hms/video/events/AnalyticsEventFactory;->INSTANCE:Llive/hms/video/events/AnalyticsEventFactory;

    invoke-virtual {v1, p1, v0}, Llive/hms/video/events/AnalyticsEventFactory;->previewStatusEvent(ZLjava/util/HashMap;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-virtual {v0, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v0

    invoke-virtual {v0}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Fire preview measurement: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "PerformanceJoinEvents"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public numberedValue(Llive/hms/video/sdk/models/EVENT_TYPE;JLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/models/EVENT_TYPE;",
            "J",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance p4, Ljava/lang/Long;

    invoke-direct {p4, p2, p3}, Ljava/lang/Long;-><init>(J)V

    iget-object p2, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->numberEvents:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Llive/hms/video/sdk/models/EVENT_TYPE;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p2, p1, p4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final start$lib_release(Llive/hms/video/sdk/models/EVENT_TYPE;)V
    .locals 3

    const-string v0, "eventType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->startTimes:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final startPreview$lib_release()V
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->previewStartTime:J

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/sdk/models/PerformanceMeasurement;->isPreviewCalled:Z

    return-void
.end method
