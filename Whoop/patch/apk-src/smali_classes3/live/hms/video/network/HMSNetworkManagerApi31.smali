.class public final Llive/hms/video/network/HMSNetworkManagerApi31;
.super Llive/hms/video/network/HMSNetworkManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\n\u001a\u00020\tH\u0017\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000f\u0010\u000c\u001a\u00020\tH\u0017\u00a2\u0006\u0004\u0008\u000c\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001f\u00a8\u0006 "
    }
    d2 = {
        "Llive/hms/video/network/HMSNetworkManagerApi31;",
        "Llive/hms/video/network/HMSNetworkManager;",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "",
        "getConnectedNetworkType",
        "()Ljava/lang/String;",
        "Ll83/a0;",
        "start",
        "()V",
        "stop",
        "Landroid/telephony/TelephonyManager;",
        "telephonyManager",
        "Landroid/telephony/TelephonyManager;",
        "Ljava/util/concurrent/ExecutorService;",
        "exec",
        "Ljava/util/concurrent/ExecutorService;",
        "Landroid/telephony/TelephonyCallback;",
        "callback",
        "Landroid/telephony/TelephonyCallback;",
        "",
        "networkType",
        "Ljava/lang/Integer;",
        "getNetworkType",
        "()Ljava/lang/Integer;",
        "setNetworkType",
        "(Ljava/lang/Integer;)V",
        "",
        "isRegistered",
        "Z",
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
.field private final callback:Landroid/telephony/TelephonyCallback;

.field private final exec:Ljava/util/concurrent/ExecutorService;

.field private isRegistered:Z

.field private networkType:Ljava/lang/Integer;

.field private final telephonyManager:Landroid/telephony/TelephonyManager;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/network/HMSNetworkManager;-><init>(Landroid/content/Context;)V

    const-string v0, "phone"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.telephony.TelephonyManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/telephony/TelephonyManager;

    iput-object p1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->telephonyManager:Landroid/telephony/TelephonyManager;

    invoke-static {}, Ljava/util/concurrent/Executors;->newSingleThreadExecutor()Ljava/util/concurrent/ExecutorService;

    move-result-object p1

    const-string v0, "newSingleThreadExecutor(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->exec:Ljava/util/concurrent/ExecutorService;

    new-instance p1, Llive/hms/video/network/HMSNetworkManagerApi31$callback$1;

    invoke-direct {p1, p0}, Llive/hms/video/network/HMSNetworkManagerApi31$callback$1;-><init>(Llive/hms/video/network/HMSNetworkManagerApi31;)V

    iput-object p1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->callback:Landroid/telephony/TelephonyCallback;

    return-void
.end method


# virtual methods
.method public getConnectedNetworkType()Ljava/lang/String;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    invoke-virtual {p0}, Llive/hms/video/network/HMSNetworkManager;->isConnectedOverWifi()Z

    move-result v1

    if-eqz v1, :cond_0

    const-string v0, "wifi"

    return-object v0

    :cond_0
    const/16 v1, 0x1f

    if-lt v0, v1, :cond_1

    sget-object v0, Llive/hms/video/utils/TelephonyUtil;->INSTANCE:Llive/hms/video/utils/TelephonyUtil;

    iget-object v1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->networkType:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Llive/hms/video/utils/TelephonyUtil;->getNetworkType(Ljava/lang/Integer;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_1
    const-string v0, "cellular"

    return-object v0
.end method

.method public final getNetworkType()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->networkType:Ljava/lang/Integer;

    return-object v0
.end method

.method public final setNetworkType(Ljava/lang/Integer;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->networkType:Ljava/lang/Integer;

    return-void
.end method

.method public start()V
    .locals 5

    iget-boolean v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->isRegistered:Z

    const-string v1, "HMSNetworkManager"

    if-nez v0, :cond_0

    :try_start_0
    iget-object v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->telephonyManager:Landroid/telephony/TelephonyManager;

    iget-object v2, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->exec:Ljava/util/concurrent/ExecutorService;

    check-cast v2, Ljava/util/concurrent/Executor;

    iget-object v3, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->callback:Landroid/telephony/TelephonyCallback;

    invoke-virtual {v0, v2, v3}, Landroid/telephony/TelephonyManager;->registerTelephonyCallback(Ljava/util/concurrent/Executor;Landroid/telephony/TelephonyCallback;)V

    const/4 v0, 0x1

    iput-boolean v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->isRegistered:Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    sget-object v2, Llive/hms/video/utils/HMSLogger;->INSTANCE:Llive/hms/video/utils/HMSLogger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Failed to register TelephonyCallback: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v1, v3, v0}, Llive/hms/video/utils/HMSLogger;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void

    :cond_0
    const-string v0, "TelephonyCallback already registered, skipping re-registering"

    invoke-static {v1, v0}, Llive/hms/video/utils/HMSLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public stop()V
    .locals 2

    iget-boolean v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->isRegistered:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->isRegistered:Z

    iget-object v0, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->telephonyManager:Landroid/telephony/TelephonyManager;

    iget-object v1, p0, Llive/hms/video/network/HMSNetworkManagerApi31;->callback:Landroid/telephony/TelephonyCallback;

    invoke-virtual {v0, v1}, Landroid/telephony/TelephonyManager;->unregisterTelephonyCallback(Landroid/telephony/TelephonyCallback;)V

    :cond_0
    return-void
.end method
