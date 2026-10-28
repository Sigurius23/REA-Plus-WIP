.class public final Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/mapbox/maps/module/MapTelemetry;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 +2\u00020\u0001:\u0001+B\u0011\u0008\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005B1\u0008\u0011\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0004\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001c\u0010\u0011J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u0019\u0010!\u001a\u00020\u000f2\u0008\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016\u00a2\u0006\u0004\u0008!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010$R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010%R\u0014\u0010&\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008)\u0010*\u00a8\u0006,"
    }
    d2 = {
        "Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;",
        "Lcom/mapbox/maps/module/MapTelemetry;",
        "Landroid/content/Context;",
        "appContext",
        "<init>",
        "(Landroid/content/Context;)V",
        "Lcom/mapbox/common/EventsServiceInterface;",
        "eventsService",
        "Lcom/mapbox/common/TelemetryService;",
        "telemetryService",
        "Lcom/mapbox/common/EventsServerOptions;",
        "eventsServerOptions",
        "Lbc3/z;",
        "defaultCoroutineDispatcher",
        "(Landroid/content/Context;Lcom/mapbox/common/EventsServiceInterface;Lcom/mapbox/common/TelemetryService;Lcom/mapbox/common/EventsServerOptions;Lbc3/z;)V",
        "Ll83/a0;",
        "sendMapLoadEvent",
        "()V",
        "",
        "shouldSendEvents",
        "()Z",
        "",
        "event",
        "sendEvent",
        "(Ljava/lang/String;)V",
        "enabled",
        "enableTelemetryCollection",
        "(Z)V",
        "onAppUserTurnstileEvent",
        "setUserTelemetryRequestState",
        "disableTelemetrySession",
        "Landroid/os/Bundle;",
        "data",
        "onPerformanceEvent",
        "(Landroid/os/Bundle;)V",
        "Landroid/content/Context;",
        "Lcom/mapbox/common/EventsServiceInterface;",
        "Lcom/mapbox/common/TelemetryService;",
        "eventsServiceOptions",
        "Lcom/mapbox/common/EventsServerOptions;",
        "Lbc3/c0;",
        "bgScope",
        "Lbc3/c0;",
        "Companion",
        "module-telemetry_release"
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
.field private static final Companion:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;

.field private static final TAG:Ljava/lang/String; = "MapTelemetryImpl"
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation
.end field


# instance fields
.field private final appContext:Landroid/content/Context;

.field private final bgScope:Lbc3/c0;

.field private final eventsService:Lcom/mapbox/common/EventsServiceInterface;

.field private final eventsServiceOptions:Lcom/mapbox/common/EventsServerOptions;

.field private final telemetryService:Lcom/mapbox/common/TelemetryService;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->Companion:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 4

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->appContext:Landroid/content/Context;

    .line 3
    new-instance p1, Lcom/mapbox/common/EventsServerOptions;

    .line 4
    new-instance v0, Lcom/mapbox/common/SdkInformation;

    const-string v1, "mapbox-maps-android"

    const-string v2, "11.13.4"

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/mapbox/common/SdkInformation;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 5
    invoke-direct {p1, v0, v3}, Lcom/mapbox/common/EventsServerOptions;-><init>(Lcom/mapbox/common/SdkInformation;Lcom/mapbox/common/DeferredDeliveryServiceOptions;)V

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsServiceOptions:Lcom/mapbox/common/EventsServerOptions;

    .line 6
    invoke-static {p1}, Lcom/mapbox/common/EventsService;->getOrCreate(Lcom/mapbox/common/EventsServerOptions;)Lcom/mapbox/common/EventsService;

    move-result-object p1

    const-string v0, "getOrCreate(eventsServiceOptions)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsService:Lcom/mapbox/common/EventsServiceInterface;

    .line 7
    invoke-static {}, Lcom/mapbox/common/TelemetryService;->getOrCreate()Lcom/mapbox/common/TelemetryService;

    move-result-object p1

    const-string v0, "getOrCreate()"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->telemetryService:Lcom/mapbox/common/TelemetryService;

    .line 8
    new-instance p1, Lbc3/b0;

    const-string v0, "MapTelemetryImpl"

    invoke-direct {p1, v0}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    invoke-virtual {p1, v0}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    .line 9
    sget-object v0, Lkc3/d;->w:Lkc3/d;

    .line 10
    invoke-interface {p1, v0}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->bgScope:Lbc3/c0;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/mapbox/common/EventsServiceInterface;Lcom/mapbox/common/TelemetryService;Lcom/mapbox/common/EventsServerOptions;Lbc3/z;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventsService"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "telemetryService"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "eventsServerOptions"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "defaultCoroutineDispatcher"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->appContext:Landroid/content/Context;

    .line 13
    iput-object p2, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsService:Lcom/mapbox/common/EventsServiceInterface;

    .line 14
    iput-object p3, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->telemetryService:Lcom/mapbox/common/TelemetryService;

    .line 15
    iput-object p4, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsServiceOptions:Lcom/mapbox/common/EventsServerOptions;

    .line 16
    new-instance p1, Lbc3/b0;

    const-string p2, "MapTelemetryImpl"

    invoke-direct {p1, p2}, Lbc3/b0;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object p2

    invoke-virtual {p1, p2}, Lq83/a;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-interface {p1, p5}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->b(Lq83/j;)Lhc3/d;

    move-result-object p1

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->bgScope:Lbc3/c0;

    return-void
.end method

.method public static synthetic a(Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->sendEvent$lambda$2(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static final synthetic access$getAppContext$p(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->appContext:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic access$sendEvent(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->sendEvent(Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->onAppUserTurnstileEvent$lambda$0(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method public static synthetic c(Lcom/mapbox/bindgen/Expected;)V
    .locals 0

    invoke-static {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->enableTelemetryCollection$lambda$3(Lcom/mapbox/bindgen/Expected;)V

    return-void
.end method

.method private final enableTelemetryCollection(Z)V
    .locals 2

    new-instance v0, Lcom/mapbox/maps/l;

    const/16 v1, 0xc

    invoke-direct {v0, v1}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-static {p1, v0}, Lcom/mapbox/common/TelemetryUtils;->setEventsCollectionState(ZLcom/mapbox/common/TelemetryUtilsResponseCallback;)V

    return-void
.end method

.method private static final enableTelemetryCollection$lambda$3(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "setEventsCollectionState error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MapTelemetryImpl"

    invoke-static {v0, p0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private static final onAppUserTurnstileEvent$lambda$0(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sendTurnstileEvent error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MapTelemetryImpl"

    invoke-static {v0, p0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final sendEvent(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Lcom/mapbox/bindgen/Value;->fromJson(Ljava/lang/String;)Lcom/mapbox/bindgen/Expected;

    move-result-object p1

    const-string v0, "fromJson(event)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/mapbox/bindgen/Expected;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/mapbox/bindgen/Value;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    new-instance v1, Lcom/mapbox/common/Event;

    sget-object v2, Lcom/mapbox/common/EventPriority;->QUEUED:Lcom/mapbox/common/EventPriority;

    invoke-direct {v1, v2, p1, v0}, Lcom/mapbox/common/Event;-><init>(Lcom/mapbox/common/EventPriority;Lcom/mapbox/bindgen/Value;Lcom/mapbox/common/DeferredDeliveryRequestOptions;)V

    move-object v0, v1

    :cond_0
    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsService:Lcom/mapbox/common/EventsServiceInterface;

    new-instance v1, Lcom/mapbox/maps/l;

    const/16 v2, 0xb

    invoke-direct {v1, v2}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-interface {p1, v0, v1}, Lcom/mapbox/common/EventsServiceInterface;->sendEvent(Lcom/mapbox/common/Event;Lcom/mapbox/common/EventsServiceResponseCallback;)V

    :cond_1
    return-void
.end method

.method private static final sendEvent$lambda$2(Lcom/mapbox/bindgen/Expected;)V
    .locals 2

    const-string v0, "response"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->isError()Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sendEvent error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/mapbox/bindgen/Expected;->getError()Ljava/lang/Object;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "MapTelemetryImpl"

    invoke-static {v0, p0}, Lcom/mapbox/maps/MapboxLogger;->logE(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final sendMapLoadEvent()V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->bgScope:Lbc3/c0;

    new-instance v1, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;-><init>(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final shouldSendEvents()Z
    .locals 2

    invoke-static {}, Lcom/mapbox/common/TelemetryUtils;->getClientServerEventsCollectionState()Lcom/mapbox/common/TelemetryCollectionState;

    move-result-object v0

    sget-object v1, Lcom/mapbox/common/TelemetryCollectionState;->TURNSTILE_EVENTS_ONLY:Lcom/mapbox/common/TelemetryCollectionState;

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method


# virtual methods
.method public disableTelemetrySession()V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->enableTelemetryCollection(Z)V

    return-void
.end method

.method public onAppUserTurnstileEvent()V
    .locals 4

    iget-object v0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->eventsService:Lcom/mapbox/common/EventsServiceInterface;

    new-instance v1, Lcom/mapbox/common/TurnstileEvent;

    sget-object v2, Lcom/mapbox/common/UserSKUIdentifier;->MAPS_MAUS:Lcom/mapbox/common/UserSKUIdentifier;

    invoke-direct {v1, v2}, Lcom/mapbox/common/TurnstileEvent;-><init>(Lcom/mapbox/common/UserSKUIdentifier;)V

    new-instance v2, Lcom/mapbox/maps/l;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-interface {v0, v1, v2}, Lcom/mapbox/common/EventsServiceInterface;->sendTurnstileEvent(Lcom/mapbox/common/TurnstileEvent;Lcom/mapbox/common/EventsServiceResponseCallback;)V

    invoke-direct {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->shouldSendEvents()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->sendMapLoadEvent()V

    :cond_0
    return-void
.end method

.method public onPerformanceEvent(Landroid/os/Bundle;)V
    .locals 3

    invoke-direct {p0}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->shouldSendEvents()Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lcom/mapbox/maps/module/telemetry/MapEventFactory;->INSTANCE:Lcom/mapbox/maps/module/telemetry/MapEventFactory;

    new-instance v1, Lcom/mapbox/maps/module/telemetry/PhoneState;

    iget-object v2, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->appContext:Landroid/content/Context;

    invoke-direct {v1, v2}, Lcom/mapbox/maps/module/telemetry/PhoneState;-><init>(Landroid/content/Context;)V

    const-string v2, "randomUUID().toString()"

    invoke-static {v2}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-nez p1, :cond_0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    :cond_0
    invoke-virtual {v0, v1, v2, p1}, Lcom/mapbox/maps/module/telemetry/MapEventFactory;->buildPerformanceEvent(Lcom/mapbox/maps/module/telemetry/PhoneState;Ljava/lang/String;Landroid/os/Bundle;)Lcom/mapbox/maps/module/telemetry/PerformanceEvent;

    move-result-object p1

    new-instance v0, Lcom/google/gson/Gson;

    invoke-direct {v0}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v0, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v0, "Gson().toJson(performanceEvent)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->sendEvent(Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public setUserTelemetryRequestState(Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->enableTelemetryCollection(Z)V

    return-void
.end method
