.class public final Llive/hms/video/events/HMSApiClient;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J)\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Llive/hms/video/events/HMSApiClient;",
        "",
        "<init>",
        "()V",
        "Llive/hms/video/database/entity/AnalyticsEntityModel;",
        "analyticsEntityModel",
        "",
        "token",
        "Llive/hms/video/utils/HMSAgentOs;",
        "hmsAgentOs",
        "Lud3/o0;",
        "makeEventRequest",
        "(Llive/hms/video/database/entity/AnalyticsEntityModel;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;",
        "Llive/hms/video/signal/init/TokenRequest;",
        "tokenRequest",
        "baseUrl",
        "makeTokenRequest$lib_release",
        "(Llive/hms/video/signal/init/TokenRequest;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;",
        "makeTokenRequest",
        "makeLayoutRequest$lib_release",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;",
        "makeLayoutRequest",
        "",
        "reportAnalyticsEvent",
        "(Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;",
        "TAG",
        "Ljava/lang/String;",
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
.field public static final INSTANCE:Llive/hms/video/events/HMSApiClient;

.field private static final TAG:Ljava/lang/String; = "HMSApiClient"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/events/HMSApiClient;

    invoke-direct {v0}, Llive/hms/video/events/HMSApiClient;-><init>()V

    sput-object v0, Llive/hms/video/events/HMSApiClient;->INSTANCE:Llive/hms/video/events/HMSApiClient;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final makeEventRequest(Llive/hms/video/database/entity/AnalyticsEntityModel;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;
    .locals 4

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUserAgent()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Llive/hms/video/database/entity/AnalyticsEntityModel;->isQa()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "https://event-nonprod.100ms.live/v2/client/report"

    goto :goto_0

    :cond_0
    const-string v1, "https://event.100ms.live/v2/client/report"

    :goto_0
    sget-object v2, Lud3/h0;->e:Lyb3/p;

    const-string v2, "application/json; charset=utf-8"

    invoke-static {v2}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v2

    sget-object v3, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v3}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v3

    invoke-virtual {v3, p1}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v3, Lud3/v0;->Companion:Lud3/u0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v2}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object p1

    new-instance v2, Lud3/n0;

    invoke-direct {v2}, Lud3/n0;-><init>()V

    invoke-virtual {v2, v1}, Lud3/n0;->f(Ljava/lang/String;)V

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUSER_AGENT_V2_NAME()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {v2, p3, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Bearer "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "Authorization"

    invoke-virtual {v2, p3, p2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "Accept-Type"

    const-string p3, "application/json"

    invoke-virtual {v2, p2, p3}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "POST"

    invoke-virtual {v2, p2, p1}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v2}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "makeEventRequest: request="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "HMSApiClient"

    invoke-static {p3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final makeLayoutRequest$lib_release(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;
    .locals 3

    const-string v0, "token"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsAgentOs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUserAgent()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    const-string v1, "application/json; charset=utf-8"

    invoke-static {v1}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string p2, "https://api.100ms.live"

    :cond_1
    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    const-string v2, "/v2/layouts/ui"

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lud3/n0;->f(Ljava/lang/String;)V

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUSER_AGENT_V2_NAME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "Bearer "

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "Authorization"

    invoke-virtual {v1, p2, p1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Accept-Type"

    const-string p2, "application/json"

    invoke-virtual {v1, p1, p2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method

.method public final makeTokenRequest$lib_release(Llive/hms/video/signal/init/TokenRequest;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;
    .locals 5

    const-string v0, "tokenRequest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "hmsAgentOs"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUserAgent()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lud3/h0;->e:Lyb3/p;

    const-string v1, "application/json; charset=utf-8"

    invoke-static {v1}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v1

    sget-object v2, Llive/hms/video/utils/GsonUtils;->INSTANCE:Llive/hms/video/utils/GsonUtils;

    invoke-virtual {v2}, Llive/hms/video/utils/GsonUtils;->getGson()Lcom/google/gson/Gson;

    move-result-object v2

    new-instance v3, Llive/hms/video/signal/init/ShortCodeInput;

    invoke-virtual {p1}, Llive/hms/video/signal/init/TokenRequest;->getRoomCode()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Llive/hms/video/signal/init/TokenRequest;->getUserId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v3, v4, p1}, Llive/hms/video/signal/init/ShortCodeInput;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v2, v3}, Lcom/google/gson/Gson;->toJson(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lud3/v0;->Companion:Lud3/u0;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lud3/u0;->b(Ljava/lang/String;Lud3/h0;)Lud3/t0;

    move-result-object p1

    if-eqz p2, :cond_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    const-string p2, "https://auth.100ms.live"

    :cond_1
    new-instance v1, Lud3/n0;

    invoke-direct {v1}, Lud3/n0;-><init>()V

    const-string v2, "/v2/token"

    invoke-virtual {p2, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2}, Lud3/n0;->f(Ljava/lang/String;)V

    invoke-virtual {p3}, Llive/hms/video/utils/HMSAgentOs;->getUSER_AGENT_V2_NAME()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v1, p2, v0}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "POST"

    invoke-virtual {v1, p2, p1}, Lud3/n0;->e(Ljava/lang/String;Lud3/v0;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, v1}, Lud3/o0;-><init>(Lud3/n0;)V

    return-object p1
.end method

.method public final reportAnalyticsEvent(Llive/hms/video/database/entity/AnalyticsEntityModel;Llive/hms/video/utils/HMSAgentOs;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/database/entity/AnalyticsEntityModel;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Llive/hms/video/database/entity/AnalyticsEntityModel;->getToken()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, p1, v0, p2}, Llive/hms/video/events/HMSApiClient;->makeEventRequest(Llive/hms/video/database/entity/AnalyticsEntityModel;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;

    move-result-object p1

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    :try_start_0
    sget-object v0, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {v0}, Llive/hms/video/factories/OkHttpFactory;->getClient()Lud3/l0;

    move-result-object v0

    invoke-virtual {v0, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    invoke-virtual {p1}, Lzd3/o;->e()Lud3/x0;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :try_start_1
    iget-boolean v0, p1, Lud3/x0;->Q:Z

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, v0}, Lbc3/t1;->L(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-virtual {p1}, Lud3/x0;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception p1

    goto :goto_2

    :goto_1
    :try_start_3
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v1

    :try_start_4
    invoke-static {p1, v0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v1
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :goto_2
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    const-string p1, "kotlin.Unit"

    const-string v0, "HMSApiClient"

    invoke-static {v0, p1}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p2, p1}, Lbc3/t1;->L(Ljava/lang/Object;)Z

    :goto_3
    invoke-virtual {p2, p3}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
