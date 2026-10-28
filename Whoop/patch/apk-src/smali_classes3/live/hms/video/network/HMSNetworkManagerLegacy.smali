.class public final Llive/hms/video/network/HMSNetworkManagerLegacy;
.super Llive/hms/video/network/HMSNetworkManager;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\u0008\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Llive/hms/video/network/HMSNetworkManagerLegacy;",
        "Llive/hms/video/network/HMSNetworkManager;",
        "context",
        "Landroid/content/Context;",
        "<init>",
        "(Landroid/content/Context;)V",
        "getConnectedNetworkType",
        "",
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


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Llive/hms/video/network/HMSNetworkManager;-><init>(Landroid/content/Context;)V

    return-void
.end method


# virtual methods
.method public getConnectedNetworkType()Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Llive/hms/video/network/HMSNetworkManager;->isConnectedOverWifi()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "wifi"

    return-object v0

    :cond_0
    const-string v0, "cellular"

    return-object v0
.end method
