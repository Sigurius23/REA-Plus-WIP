.class final Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->sendMapLoadEvent()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x7,
        0x1
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.mapbox.maps.module.telemetry.MapTelemetryImpl$sendMapLoadEvent$1"
    f = "MapTelemetryImpl.kt"
    l = {}
    m = "invokeSuspend"
.end annotation


# instance fields
.field label:I

.field final synthetic this$0:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;


# direct methods
.method public constructor <init>(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;",
            "Lq83/d<",
            "-",
            "Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->this$0:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;

    iget-object v0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->this$0:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;

    invoke-direct {p1, v0, p2}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;-><init>(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->label:I

    if-nez v0, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_0
    sget-object p1, Lcom/mapbox/maps/module/telemetry/MapEventFactory;->INSTANCE:Lcom/mapbox/maps/module/telemetry/MapEventFactory;

    new-instance v0, Lcom/mapbox/maps/module/telemetry/PhoneState;

    iget-object v1, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->this$0:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;

    invoke-static {v1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->access$getAppContext$p(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;)Landroid/content/Context;

    move-result-object v1

    invoke-direct {v0, v1}, Lcom/mapbox/maps/module/telemetry/PhoneState;-><init>(Landroid/content/Context;)V

    invoke-virtual {p1, v0}, Lcom/mapbox/maps/module/telemetry/MapEventFactory;->buildMapLoadEvent(Lcom/mapbox/maps/module/telemetry/PhoneState;)Lcom/mapbox/maps/module/telemetry/MapLoadEvent;

    move-result-object p1

    iget-object v0, p0, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl$sendMapLoadEvent$1;->this$0:Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;

    new-instance v1, Lcom/google/gson/Gson;

    invoke-direct {v1}, Lcom/google/gson/Gson;-><init>()V

    invoke-virtual {v1, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "Gson().toJson(mapLoadEvent)"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;->access$sendEvent(Lcom/mapbox/maps/module/telemetry/MapTelemetryImpl;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "sendMapLoadEvent error: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "MapTelemetryImpl"

    invoke-static {v0, p1}, Lcom/mapbox/maps/MapboxLogger;->logW(Ljava/lang/String;Ljava/lang/String;)V

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
