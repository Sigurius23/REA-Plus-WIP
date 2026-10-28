.class public final Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/plugin/video/HMSVideoPluginAnalytics$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0000\u0018\u0000 32\u00020\u0001:\u00013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\'\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0014\u0010\u000fJ#\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J%\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0019\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u00192\u000c\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0015\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008 \u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010\u0005R2\u0010\'\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(R2\u0010)\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00190%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0019`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010(R2\u0010+\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010(R2\u0010-\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010(R2\u0010.\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020*`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008.\u0010(R2\u0010/\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,0%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020,`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008/\u0010(R2\u00101\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002000%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u000200`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00081\u0010(R2\u00102\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00080%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0008`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00082\u0010(R2\u0010\n\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00080%j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0008`&8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\n\u0010(\u00a8\u00064"
    }
    d2 = {
        "Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;",
        "",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "analyticsEventsService",
        "<init>",
        "(Llive/hms/video/events/AnalyticsEventsService;)V",
        "",
        "name",
        "",
        "inputFrameRate",
        "pluginFrameRate",
        "Ll83/a0;",
        "added",
        "(Ljava/lang/String;ILjava/lang/Integer;)V",
        "removed",
        "(Ljava/lang/String;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "failure",
        "(Ljava/lang/String;Llive/hms/video/error/HMSException;)V",
        "addPluginSuccess",
        "Lkotlin/Function0;",
        "processFn",
        "processWithTime",
        "(Ljava/lang/String;Lc93/a;)V",
        "",
        "timeWithML",
        "timeWithoutML",
        "processTime",
        "(Ljava/lang/String;JJ)V",
        "timeInMs",
        "(Lc93/a;)J",
        "clean",
        "Llive/hms/video/events/AnalyticsEventsService;",
        "getAnalyticsEventsService",
        "()Llive/hms/video/events/AnalyticsEventsService;",
        "setAnalyticsEventsService",
        "Ljava/util/HashMap;",
        "Lkotlin/collections/HashMap;",
        "initTime",
        "Ljava/util/HashMap;",
        "addedTimestamps",
        "Llive/hms/video/utils/RunningAverage;",
        "processingAvgsWithMl",
        "",
        "peakValueWithMl",
        "processingAvgsWithoutMl",
        "peakValueWithoutMl",
        "",
        "pluginAdded",
        "pluginInputFrameRate",
        "Companion",
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
.field public static final Companion:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics$Companion;

.field public static final TAG:Ljava/lang/String; = "HMSVideoPluginAnalytics"


# instance fields
.field private addedTimestamps:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

.field private initTime:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field

.field private peakValueWithMl:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private peakValueWithoutMl:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation
.end field

.field private pluginAdded:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private pluginFrameRate:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private pluginInputFrameRate:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field private processingAvgsWithMl:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/utils/RunningAverage;",
            ">;"
        }
    .end annotation
.end field

.field private processingAvgsWithoutMl:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Llive/hms/video/utils/RunningAverage;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->Companion:Llive/hms/video/plugin/video/HMSVideoPluginAnalytics$Companion;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/events/AnalyticsEventsService;)V
    .locals 1

    const-string v0, "analyticsEventsService"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->initTime:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->addedTimestamps:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithoutMl:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginAdded:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginInputFrameRate:Ljava/util/HashMap;

    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginFrameRate:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final addPluginSuccess(Ljava/lang/String;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginAdded:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v1, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->INSTANCE:Llive/hms/video/events/MediaPluginsAnalyticsFactory;

    invoke-virtual {v1, p1}, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->added(Ljava/lang/String;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p1

    invoke-virtual {v0, p1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p1

    invoke-virtual {p1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    return-void

    :goto_0
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    return-void
.end method

.method public final added(Ljava/lang/String;ILjava/lang/Integer;)V
    .locals 3

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginAdded:Ljava/util/HashMap;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->addedTimestamps:Ljava/util/HashMap;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    new-instance v1, Llive/hms/video/utils/RunningAverage;

    invoke-direct {v1}, Llive/hms/video/utils/RunningAverage;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithoutMl:Ljava/util/HashMap;

    new-instance v1, Llive/hms/video/utils/RunningAverage;

    invoke-direct {v1}, Llive/hms/video/utils/RunningAverage;-><init>()V

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    const-wide/16 v1, 0x0

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginInputFrameRate:Ljava/util/HashMap;

    invoke-interface {v1, p1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p3, :cond_0

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginFrameRate:Ljava/util/HashMap;

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    iget-object p3, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginFrameRate:Ljava/util/HashMap;

    invoke-interface {p3, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final clean(Ljava/lang/String;)V
    .locals 1

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->addedTimestamps:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->initTime:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithoutMl:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginAdded:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginInputFrameRate:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginFrameRate:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V
    .locals 2

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "error"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    sget-object v1, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->INSTANCE:Llive/hms/video/events/MediaPluginsAnalyticsFactory;

    invoke-virtual {v1, p1, p2}, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)Llive/hms/video/events/AnalyticsEvent;

    move-result-object p2

    invoke-virtual {v0, p2}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object p2

    invoke-virtual {p2}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    invoke-virtual {p0, p1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->clean(Ljava/lang/String;)V

    return-void
.end method

.method public final getAnalyticsEventsService()Llive/hms/video/events/AnalyticsEventsService;
    .locals 1

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-object v0
.end method

.method public final processTime(Ljava/lang/String;JJ)V
    .locals 4

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p2, v0

    if-lez v2, :cond_1

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/utils/RunningAverage;

    if-eqz v2, :cond_0

    invoke-virtual {v2, p2, p3}, Llive/hms/video/utils/RunningAverage;->add(J)V

    :cond_0
    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    invoke-virtual {v2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v2

    long-to-double p2, p2

    cmpg-double v2, v2, p2

    if-gez v2, :cond_1

    iget-object v2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    invoke-static {p2, p3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p2

    invoke-interface {v2, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    cmp-long p2, p4, v0

    if-lez p2, :cond_3

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithoutMl:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Llive/hms/video/utils/RunningAverage;

    if-eqz p2, :cond_2

    invoke-virtual {p2, p4, p5}, Llive/hms/video/utils/RunningAverage;->add(J)V

    :cond_2
    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_3

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-virtual {p2, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->doubleValue()D

    move-result-wide p2

    long-to-double p4, p4

    cmpg-double p2, p2, p4

    if-gez p2, :cond_3

    iget-object p2, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-static {p4, p5}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p3

    invoke-interface {p2, p1, p3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_3
    return-void
.end method

.method public final processWithTime(Ljava/lang/String;Lc93/a;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "name"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "processFn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    invoke-virtual {p0, p2}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->timeInMs(Lc93/a;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2
    :try_end_0
    .catch Llive/hms/video/error/HMSException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    iget-object v0, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Llive/hms/video/utils/RunningAverage;

    if-eqz p1, :cond_0

    invoke-virtual {p2}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Llive/hms/video/utils/RunningAverage;->add(J)V

    :cond_0
    return-void

    :catch_0
    move-exception p2

    sget-object v0, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->INSTANCE:Llive/hms/video/error/ErrorFactory$MediaPluginErrors;

    sget-object v1, Llive/hms/video/error/HMSAction;->VIDEO_PLUGINS:Llive/hms/video/error/HMSAction;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed during processing of plugin"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, Llive/hms/video/error/HMSException;->getMessage()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v0, v1, p2}, Llive/hms/video/error/ErrorFactory$MediaPluginErrors;->ProcessingFailed(Llive/hms/video/error/HMSAction;Ljava/lang/String;)Llive/hms/video/error/HMSException;

    move-result-object p2

    const-string v0, "HMSVideoPluginAnalytics"

    invoke-virtual {p2}, Llive/hms/video/error/HMSException;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->failure(Ljava/lang/String;Llive/hms/video/error/HMSException;)V

    throw p2
.end method

.method public final removed(Ljava/lang/String;)V
    .locals 24

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const-string v1, "name"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginAdded:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    iget-object v1, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->addedTimestamps:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    sub-long/2addr v3, v5

    const/16 v1, 0x3e8

    int-to-long v5, v1

    div-long/2addr v3, v5

    iget-object v1, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->initTime:Ljava/util/HashMap;

    invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    iget-object v5, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithMl:Ljava/util/HashMap;

    invoke-virtual {v5, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Llive/hms/video/utils/RunningAverage;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Llive/hms/video/utils/RunningAverage;->getAvg()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    iget-object v7, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->processingAvgsWithoutMl:Ljava/util/HashMap;

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Llive/hms/video/utils/RunningAverage;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Llive/hms/video/utils/RunningAverage;->getAvg()D

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v6

    :cond_1
    iget-object v7, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginInputFrameRate:Ljava/util/HashMap;

    invoke-virtual {v7, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Integer;

    iget-object v8, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->pluginFrameRate:Ljava/util/HashMap;

    invoke-virtual {v8, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Integer;

    sget-object v9, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    const-string v10, "pluginName = "

    const-string v11, ", duration = "

    invoke-static {v10, v2, v3, v4, v11}, Ldc/b;->s(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v10

    const-string v11, ", loadTime = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", avgProcesstimeWithMl = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", avgProcesstimeWithoutMl = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", inputFR = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v11, ", pluginFr = "

    invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    const-string v11, "HMSVideoPluginAnalytics"

    invoke-virtual {v9, v11, v10}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    move-object v10, v1

    sget-object v1, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->INSTANCE:Llive/hms/video/events/MediaPluginsAnalyticsFactory;

    if-eqz v10, :cond_2

    invoke-virtual {v10}, Ljava/lang/Long;->longValue()J

    move-result-wide v12

    goto :goto_1

    :cond_2
    const-wide/16 v12, 0x0

    :goto_1
    const-wide/16 v14, 0x0

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v16

    goto :goto_2

    :cond_3
    move-wide/from16 v16, v14

    :goto_2
    if-eqz v6, :cond_4

    invoke-virtual {v6}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    goto :goto_3

    :cond_4
    move-wide v5, v14

    :goto_3
    iget-object v10, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithMl:Ljava/util/HashMap;

    invoke-virtual {v10, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    if-eqz v10, :cond_5

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v18

    goto :goto_4

    :cond_5
    move-wide/from16 v18, v14

    :goto_4
    iget-object v10, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->peakValueWithoutMl:Ljava/util/HashMap;

    invoke-virtual {v10, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Double;

    if-eqz v10, :cond_6

    invoke-virtual {v10}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v14

    :cond_6
    const/4 v10, 0x0

    if-eqz v7, :cond_7

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_5

    :cond_7
    move v7, v10

    :goto_5
    if-eqz v8, :cond_8

    invoke-virtual {v8}, Ljava/lang/Integer;->intValue()I

    move-result v10

    :cond_8
    move-object/from16 v20, v9

    move-object/from16 v21, v11

    move-wide/from16 v22, v14

    move v15, v7

    move-wide/from16 v7, v16

    move/from16 v16, v10

    move-wide v9, v5

    move-wide v5, v12

    move-wide/from16 v13, v22

    move-wide/from16 v11, v18

    invoke-virtual/range {v1 .. v16}, Llive/hms/video/events/MediaPluginsAnalyticsFactory;->stats(Ljava/lang/String;JJDDDDII)Llive/hms/video/events/AnalyticsEvent;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "event got = "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, ", sending to service "

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v3, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, v20

    move-object/from16 v4, v21

    invoke-virtual {v3, v4, v2}, Llive/hms/video/utils/HMSLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    iget-object v2, v0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    invoke-virtual {v2, v1}, Llive/hms/video/events/AnalyticsEventsService;->queue(Llive/hms/video/events/AnalyticsEvent;)Llive/hms/video/events/AnalyticsEventsService;

    move-result-object v1

    invoke-virtual {v1}, Llive/hms/video/events/AnalyticsEventsService;->flush()V

    invoke-virtual/range {p0 .. p1}, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->clean(Ljava/lang/String;)V

    :cond_9
    return-void
.end method

.method public final setAnalyticsEventsService(Llive/hms/video/events/AnalyticsEventsService;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/plugin/video/HMSVideoPluginAnalytics;->analyticsEventsService:Llive/hms/video/events/AnalyticsEventsService;

    return-void
.end method

.method public final timeInMs(Lc93/a;)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            ")J"
        }
    .end annotation

    const-string v0, "processFn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    return-wide v2
.end method
