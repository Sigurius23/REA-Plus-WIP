.class public final Llive/hms/video/utils/NetworkConnectionHelper$start$2;
.super Landroid/net/ConnectivityManager$NetworkCallback;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llive/hms/video/utils/NetworkConnectionHelper;->start(Lkotlin/jvm/functions/Function1;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "live/hms/video/utils/NetworkConnectionHelper$start$2",
        "Landroid/net/ConnectivityManager$NetworkCallback;",
        "Landroid/net/Network;",
        "network",
        "Ll83/a0;",
        "onAvailable",
        "(Landroid/net/Network;)V",
        "onLost",
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
.field final synthetic $onStatusChange:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field final synthetic this$0:Llive/hms/video/utils/NetworkConnectionHelper;


# direct methods
.method public constructor <init>(Llive/hms/video/utils/NetworkConnectionHelper;Lkotlin/jvm/functions/Function1;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/utils/NetworkConnectionHelper;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    iput-object p2, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->$onStatusChange:Lkotlin/jvm/functions/Function1;

    invoke-direct {p0}, Landroid/net/ConnectivityManager$NetworkCallback;-><init>()V

    return-void
.end method


# virtual methods
.method public onAvailable(Landroid/net/Network;)V
    .locals 2

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onAvailable(Landroid/net/Network;)V

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {v0}, Llive/hms/video/utils/NetworkConnectionHelper;->access$isConnected(Llive/hms/video/utils/NetworkConnectionHelper;)Z

    move-result v0

    iget-object v1, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {v1, p1}, Llive/hms/video/utils/NetworkConnectionHelper;->access$updateNetworkInfo(Llive/hms/video/utils/NetworkConnectionHelper;Landroid/net/Network;)V

    if-nez v0, :cond_0

    iget-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {p1}, Llive/hms/video/utils/NetworkConnectionHelper;->access$isConnected(Llive/hms/video/utils/NetworkConnectionHelper;)Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->$onStatusChange:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {v0}, Llive/hms/video/utils/NetworkConnectionHelper;->access$isConnected(Llive/hms/video/utils/NetworkConnectionHelper;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    return-void
.end method

.method public onLost(Landroid/net/Network;)V
    .locals 1

    const-string v0, "network"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroid/net/ConnectivityManager$NetworkCallback;->onLost(Landroid/net/Network;)V

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {v0, p1}, Llive/hms/video/utils/NetworkConnectionHelper;->access$updateNetworkInfo(Llive/hms/video/utils/NetworkConnectionHelper;Landroid/net/Network;)V

    iget-object p1, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->$onStatusChange:Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Llive/hms/video/utils/NetworkConnectionHelper$start$2;->this$0:Llive/hms/video/utils/NetworkConnectionHelper;

    invoke-static {v0}, Llive/hms/video/utils/NetworkConnectionHelper;->access$isConnected(Llive/hms/video/utils/NetworkConnectionHelper;)Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
