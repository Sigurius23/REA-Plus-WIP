.class public final Llive/hms/video/utils/NetworkConnectionHelper;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/utils/NetworkConnectionHelper$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ!\u0010\u000e\u001a\u00020\u00082\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00080\u000b\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001e\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u000c8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001f\u0010\u001d\u00a8\u0006!"
    }
    d2 = {
        "Llive/hms/video/utils/NetworkConnectionHelper;",
        "",
        "Landroid/content/Context;",
        "context",
        "<init>",
        "(Landroid/content/Context;)V",
        "Landroid/net/Network;",
        "network",
        "Ll83/a0;",
        "updateNetworkInfo",
        "(Landroid/net/Network;)V",
        "Lkotlin/Function1;",
        "",
        "onStatusChange",
        "start",
        "(Lkotlin/jvm/functions/Function1;)V",
        "stop",
        "()V",
        "Landroid/net/ConnectivityManager;",
        "manager",
        "Landroid/net/ConnectivityManager;",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "callback",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "",
        "wifiNetworkHandle",
        "Ljava/lang/String;",
        "cellularNetworkHandle",
        "isWifiConnected",
        "()Z",
        "isCellularConnected",
        "isConnected",
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
.field public static final Companion:Llive/hms/video/utils/NetworkConnectionHelper$Companion;

.field private static final TAG:Ljava/lang/String; = "NetworkConnectionHelper"


# instance fields
.field private callback:Landroid/net/ConnectivityManager$NetworkCallback;

.field private cellularNetworkHandle:Ljava/lang/String;

.field private final manager:Landroid/net/ConnectivityManager;

.field private wifiNetworkHandle:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/utils/NetworkConnectionHelper$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/utils/NetworkConnectionHelper$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/utils/NetworkConnectionHelper;->Companion:Llive/hms/video/utils/NetworkConnectionHelper$Companion;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    const-string v0, "null cannot be cast to non-null type android.net.ConnectivityManager"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->manager:Landroid/net/ConnectivityManager;

    const-string p1, ""

    iput-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->wifiNetworkHandle:Ljava/lang/String;

    iput-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->cellularNetworkHandle:Ljava/lang/String;

    return-void
.end method

.method public static final synthetic access$isConnected(Llive/hms/video/utils/NetworkConnectionHelper;)Z
    .locals 0

    invoke-direct {p0}, Llive/hms/video/utils/NetworkConnectionHelper;->isConnected()Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$updateNetworkInfo(Llive/hms/video/utils/NetworkConnectionHelper;Landroid/net/Network;)V
    .locals 0

    invoke-direct {p0, p1}, Llive/hms/video/utils/NetworkConnectionHelper;->updateNetworkInfo(Landroid/net/Network;)V

    return-void
.end method

.method private final isCellularConnected()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->cellularNetworkHandle:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final isConnected()Z
    .locals 1

    invoke-direct {p0}, Llive/hms/video/utils/NetworkConnectionHelper;->isWifiConnected()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Llive/hms/video/utils/NetworkConnectionHelper;->isCellularConnected()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private final isWifiConnected()Z
    .locals 1

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->wifiNetworkHandle:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method private final updateNetworkInfo(Landroid/net/Network;)V
    .locals 4

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->manager:Landroid/net/ConnectivityManager;

    invoke-virtual {v0, p1}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v0

    if-nez v0, :cond_1

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->wifiNetworkHandle:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Network;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_0

    iput-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->wifiNetworkHandle:Ljava/lang/String;

    :cond_0
    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->cellularNetworkHandle:Ljava/lang/String;

    invoke-virtual {p1}, Landroid/net/Network;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    iput-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->cellularNetworkHandle:Ljava/lang/String;

    return-void

    :cond_1
    invoke-virtual {v0}, Landroid/net/NetworkCapabilities;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "toString(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljava/util/Locale;->ENGLISH:Ljava/util/Locale;

    const-string v2, "ENGLISH"

    const-string v3, "toLowerCase(...)"

    invoke-static {v1, v2, v0, v1, v3}, Lr80/c;->q(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "wifi"

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Landroid/net/Network;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->wifiNetworkHandle:Ljava/lang/String;

    :cond_2
    const-string v1, "cellular"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contentEquals(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Landroid/net/Network;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->cellularNetworkHandle:Ljava/lang/String;

    :cond_3
    return-void
.end method


# virtual methods
.method public final start(Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "onStatusChange"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->callback:Landroid/net/ConnectivityManager$NetworkCallback;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Llive/hms/video/utils/NetworkConnectionHelper;->stop()V

    :cond_0
    new-instance v0, Landroid/net/NetworkRequest$Builder;

    invoke-direct {v0}, Landroid/net/NetworkRequest$Builder;-><init>()V

    invoke-virtual {v0}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    move-result-object v0

    new-instance v1, Llive/hms/video/utils/NetworkConnectionHelper$start$2;

    invoke-direct {v1, p0, p1}, Llive/hms/video/utils/NetworkConnectionHelper$start$2;-><init>(Llive/hms/video/utils/NetworkConnectionHelper;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->manager:Landroid/net/ConnectivityManager;

    invoke-virtual {p1, v0, v1}, Landroid/net/ConnectivityManager;->registerNetworkCallback(Landroid/net/NetworkRequest;Landroid/net/ConnectivityManager$NetworkCallback;)V

    iput-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->callback:Landroid/net/ConnectivityManager$NetworkCallback;

    return-void
.end method

.method public final stop()V
    .locals 2

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->manager:Landroid/net/ConnectivityManager;

    iget-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper;->callback:Landroid/net/ConnectivityManager$NetworkCallback;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->unregisterNetworkCallback(Landroid/net/ConnectivityManager$NetworkCallback;)V

    const/4 v0, 0x0

    iput-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper;->callback:Landroid/net/ConnectivityManager$NetworkCallback;

    return-void
.end method
