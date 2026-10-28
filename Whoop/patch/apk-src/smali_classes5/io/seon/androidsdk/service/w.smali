.class public final Lio/seon/androidsdk/service/w;
.super Lio/seon/androidsdk/service/g;
.source "SourceFile"


# static fields
.field public static final h:[Ljava/lang/String;

.field public static final i:Lbu/c;


# instance fields
.field public e:Landroid/content/Context;

.field public f:Landroid/net/ConnectivityManager;

.field public g:Landroid/net/wifi/WifiManager;


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    const-string v4, "proxy_address"

    const-string v5, "wifi_private_ip"

    const-string v0, "wifi_mac_address"

    const-string v1, "wifi_ssid"

    const-string v2, "vpn_state"

    const-string v3, "proxy_state"

    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lio/seon/androidsdk/service/w;->h:[Ljava/lang/String;

    new-instance v0, Lbu/c;

    const-class v1, Lio/seon/androidsdk/service/w;

    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lbu/c;-><init>(Ljava/lang/Object;)V

    sput-object v0, Lio/seon/androidsdk/service/w;->i:Lbu/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 6

    sget-object v0, Lio/seon/androidsdk/service/g;->d:Lbu/c;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    new-instance v2, Lio/seon/androidsdk/service/v;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lio/seon/androidsdk/service/v;-><init>(Lio/seon/androidsdk/service/w;I)V

    invoke-static {v2}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "wifi_mac_address"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v2, Lio/seon/androidsdk/service/v;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lio/seon/androidsdk/service/v;-><init>(Lio/seon/androidsdk/service/w;I)V

    invoke-static {v2}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v2

    const-string v3, "wifi_ssid"

    invoke-virtual {v1, v3, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x3

    const/4 v3, 0x0

    :try_start_0
    iget-object v4, p0, Lio/seon/androidsdk/service/w;->f:Landroid/net/ConnectivityManager;

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getActiveNetwork()Landroid/net/Network;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/net/ConnectivityManager;->getNetworkCapabilities(Landroid/net/Network;)Landroid/net/NetworkCapabilities;

    move-result-object v4

    const/4 v5, 0x4

    invoke-virtual {v4, v5}, Landroid/net/NetworkCapabilities;->hasTransport(I)Z

    move-result v4

    if-eqz v4, :cond_0

    sget-object v4, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->CONNECTED:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;

    goto :goto_1

    :cond_0
    sget-object v4, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->NOT_CONNECTED:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catch_0
    :cond_1
    :try_start_1
    sget-object v4, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->UNKNOWN:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    :goto_0
    move-object v4, v3

    goto :goto_1

    :catch_1
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_0

    :goto_1
    const-string v5, "vpn_state"

    invoke-virtual {v1, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_2
    iget-object v4, p0, Lio/seon/androidsdk/service/w;->f:Landroid/net/ConnectivityManager;

    if-eqz v4, :cond_3

    invoke-virtual {v4}, Landroid/net/ConnectivityManager;->getDefaultProxy()Landroid/net/ProxyInfo;

    move-result-object v4

    if-eqz v4, :cond_2

    sget-object v0, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->CONNECTED:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;

    goto :goto_3

    :cond_2
    sget-object v0, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->NOT_CONNECTED:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_3

    :catch_2
    :cond_3
    :try_start_3
    sget-object v0, Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;->UNKNOWN:Lio/seon/androidsdk/service/NetworkProbe$NetworkEnum;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    goto :goto_3

    :catchall_1
    :goto_2
    move-object v0, v3

    goto :goto_3

    :catch_3
    move-exception v4

    invoke-virtual {v0, v2, v4}, Lbu/c;->L(ILjava/lang/Exception;)V

    goto :goto_2

    :goto_3
    const-string v2, "proxy_state"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_4
    iget-object v0, p0, Lio/seon/androidsdk/service/w;->f:Landroid/net/ConnectivityManager;

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getDefaultProxy()Landroid/net/ProxyInfo;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0}, Landroid/net/ProxyInfo;->getHost()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ":"

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Landroid/net/ProxyInfo;->getPort()I

    move-result v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_4

    :catch_4
    :catchall_2
    :cond_4
    move-object v0, v3

    :goto_4
    const-string v2, "proxy_address"

    invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :try_start_5
    iget-object v0, p0, Lio/seon/androidsdk/service/w;->g:Landroid/net/wifi/WifiManager;

    invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getIpAddress()I

    move-result v0

    invoke-static {v0}, Lio/seon/androidsdk/service/o;->a(I)Ljava/lang/String;

    move-result-object v3
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    :catch_5
    :catchall_3
    const-string v0, "wifi_private_ip"

    invoke-virtual {v1, v0, v3}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v1
.end method

.method public final b()Ljava/util/Map;
    .locals 3

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    const/4 v1, 0x0

    :try_start_0
    iget-object v2, p0, Lio/seon/androidsdk/service/w;->g:Landroid/net/wifi/WifiManager;

    invoke-virtual {v2}, Landroid/net/wifi/WifiManager;->getDhcpInfo()Landroid/net/DhcpInfo;

    move-result-object v2

    iget v2, v2, Landroid/net/DhcpInfo;->gateway:I

    invoke-static {v2}, Lio/seon/androidsdk/service/o;->a(I)Ljava/lang/String;

    move-result-object v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catch_0
    :catchall_0
    const-string v2, "wifi_gw"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lio/seon/androidsdk/service/v;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lio/seon/androidsdk/service/v;-><init>(Lio/seon/androidsdk/service/w;I)V

    invoke-static {v1}, Lio/seon/androidsdk/service/g;->d(Lio/seon/androidsdk/service/t0;)Ljava/lang/Object;

    move-result-object v1

    const-string v2, "nw_if_list"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public final c(Lio/seon/androidsdk/service/f1;)V
    .locals 1

    iget-object v0, p1, Lio/seon/androidsdk/service/f1;->a:Landroid/content/Context;

    iput-object v0, p0, Lio/seon/androidsdk/service/w;->e:Landroid/content/Context;

    iput-object p1, p0, Lio/seon/androidsdk/service/g;->b:Lio/seon/androidsdk/service/f1;

    sget-object p1, Lio/seon/androidsdk/service/o;->a:Ljava/util/concurrent/atomic/AtomicInteger;

    :try_start_0
    iget-object p1, p0, Lio/seon/androidsdk/service/w;->e:Landroid/content/Context;

    const-string v0, "connectivity"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/ConnectivityManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/w;->f:Landroid/net/ConnectivityManager;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :try_start_1
    iget-object p1, p0, Lio/seon/androidsdk/service/w;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    const-string v0, "wifi"

    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/net/wifi/WifiManager;

    iput-object p1, p0, Lio/seon/androidsdk/service/w;->g:Landroid/net/wifi/WifiManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    return-void
.end method
