.class Lhms/webrtc/NetworkMonitor$2;
.super Lhms/webrtc/NetworkChangeDetector$Observer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lhms/webrtc/NetworkMonitor;->createNetworkChangeDetector(Landroid/content/Context;Ljava/lang/String;)Lhms/webrtc/NetworkChangeDetector;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/NetworkMonitor;

.field final synthetic val$fieldTrialsString:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lhms/webrtc/NetworkMonitor;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/NetworkMonitor$2;->this$0:Lhms/webrtc/NetworkMonitor;

    iput-object p2, p0, Lhms/webrtc/NetworkMonitor$2;->val$fieldTrialsString:Ljava/lang/String;

    invoke-direct {p0}, Lhms/webrtc/NetworkChangeDetector$Observer;-><init>()V

    return-void
.end method


# virtual methods
.method public getFieldTrialsString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lhms/webrtc/NetworkMonitor$2;->val$fieldTrialsString:Ljava/lang/String;

    return-object v0
.end method

.method public onConnectionTypeChanged(Lhms/webrtc/NetworkChangeDetector$ConnectionType;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/NetworkMonitor$2;->this$0:Lhms/webrtc/NetworkMonitor;

    invoke-static {v0, p1}, Lhms/webrtc/NetworkMonitor;->d(Lhms/webrtc/NetworkMonitor;Lhms/webrtc/NetworkChangeDetector$ConnectionType;)V

    return-void
.end method

.method public onNetworkConnect(Lhms/webrtc/NetworkChangeDetector$NetworkInformation;)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/NetworkMonitor$2;->this$0:Lhms/webrtc/NetworkMonitor;

    invoke-static {v0, p1}, Lhms/webrtc/NetworkMonitor;->a(Lhms/webrtc/NetworkMonitor;Lhms/webrtc/NetworkChangeDetector$NetworkInformation;)V

    return-void
.end method

.method public onNetworkDisconnect(J)V
    .locals 1

    iget-object v0, p0, Lhms/webrtc/NetworkMonitor$2;->this$0:Lhms/webrtc/NetworkMonitor;

    invoke-static {v0, p1, p2}, Lhms/webrtc/NetworkMonitor;->b(Lhms/webrtc/NetworkMonitor;J)V

    return-void
.end method

.method public onNetworkPreference(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lhms/webrtc/NetworkChangeDetector$ConnectionType;",
            ">;I)V"
        }
    .end annotation

    iget-object v0, p0, Lhms/webrtc/NetworkMonitor$2;->this$0:Lhms/webrtc/NetworkMonitor;

    invoke-static {v0, p1, p2}, Lhms/webrtc/NetworkMonitor;->c(Lhms/webrtc/NetworkMonitor;Ljava/util/List;I)V

    return-void
.end method
