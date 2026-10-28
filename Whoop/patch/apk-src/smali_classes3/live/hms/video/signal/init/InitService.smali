.class public final Llive/hms/video/signal/init/InitService;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ4\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0086@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Llive/hms/video/signal/init/InitService;",
        "",
        "<init>",
        "()V",
        "",
        "endpoint",
        "token",
        "region",
        "Llive/hms/video/utils/HMSAgentOs;",
        "hmsAgentOs",
        "Lud3/o0;",
        "makeInitRequest",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;",
        "Llive/hms/video/signal/init/InitConfig;",
        "fetchInitConfig",
        "(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
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
.field public static final INSTANCE:Llive/hms/video/signal/init/InitService;

.field private static final TAG:Ljava/lang/String; = "InitService"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Llive/hms/video/signal/init/InitService;

    invoke-direct {v0}, Llive/hms/video/signal/init/InitService;-><init>()V

    sput-object v0, Llive/hms/video/signal/init/InitService;->INSTANCE:Llive/hms/video/signal/init/InitService;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic fetchInitConfig$default(Llive/hms/video/signal/init/InitService;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const-string p2, ""

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_1

    const-string p4, "https://prod-init.100ms.live/init"

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Llive/hms/video/signal/init/InitService;->fetchInitConfig(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final makeInitRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;
    .locals 1

    invoke-virtual {p4}, Llive/hms/video/utils/HMSAgentOs;->getUserAgentUrlEncoded()Ljava/lang/String;

    move-result-object p4

    const/16 v0, 0x3f

    invoke-static {v0, p1, p4}, Ldc/b;->k(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p4}, Ljava/lang/String;->length()I

    move-result p4

    if-lez p4, :cond_0

    const-string p4, "&region="

    invoke-static {p1, p4}, Le4/p;->d(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-static {p3}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object p3

    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance p3, Lud3/n0;

    invoke-direct {p3}, Lud3/n0;-><init>()V

    invoke-virtual {p3, p1}, Lud3/n0;->f(Ljava/lang/String;)V

    new-instance p1, Ljava/lang/StringBuilder;

    const-string p4, "Bearer "

    invoke-direct {p1, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "Authorization"

    invoke-virtual {p3, p2, p1}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    const-string p1, "Accept-Type"

    const-string p2, "application/json"

    invoke-virtual {p3, p1, p2}, Lud3/n0;->a(Ljava/lang/String;Ljava/lang/String;)V

    new-instance p1, Lud3/o0;

    invoke-direct {p1, p3}, Lud3/o0;-><init>(Lud3/n0;)V

    new-instance p2, Ljava/lang/StringBuilder;

    const-string p3, "makeInitRequest: request="

    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "InitService"

    invoke-static {p3, p2}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic makeInitRequest$default(Llive/hms/video/signal/init/InitService;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;ILjava/lang/Object;)Lud3/o0;
    .locals 0

    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_0

    const-string p3, ""

    :cond_0
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/signal/init/InitService;->makeInitRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final fetchInitConfig(Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Llive/hms/video/utils/HMSAgentOs;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Llive/hms/video/signal/init/InitConfig;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0, p4, p1, p2, p3}, Llive/hms/video/signal/init/InitService;->makeInitRequest(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/utils/HMSAgentOs;)Lud3/o0;

    move-result-object p1

    invoke-static {}, Lbc3/f0;->a()Lbc3/t;

    move-result-object p2

    sget-object p3, Llive/hms/video/factories/OkHttpFactory;->INSTANCE:Llive/hms/video/factories/OkHttpFactory;

    invoke-virtual {p3}, Llive/hms/video/factories/OkHttpFactory;->getClient()Lud3/l0;

    move-result-object p3

    invoke-virtual {p3, p1}, Lud3/l0;->b(Lud3/o0;)Lzd3/o;

    move-result-object p1

    new-instance p3, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;

    invoke-direct {p3, p2}, Llive/hms/video/signal/init/InitService$fetchInitConfig$2;-><init>(Lbc3/s;)V

    invoke-virtual {p1, p3}, Lzd3/o;->d(Lud3/k;)V

    invoke-virtual {p2, p5}, Lbc3/t1;->m(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    return-object p1
.end method
