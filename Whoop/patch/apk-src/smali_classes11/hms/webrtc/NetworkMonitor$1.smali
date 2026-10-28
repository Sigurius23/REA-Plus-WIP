.class Lhms/webrtc/NetworkMonitor$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhms/webrtc/NetworkChangeDetectorFactory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/NetworkMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lhms/webrtc/NetworkMonitor;


# direct methods
.method public constructor <init>(Lhms/webrtc/NetworkMonitor;)V
    .locals 0

    iput-object p1, p0, Lhms/webrtc/NetworkMonitor$1;->this$0:Lhms/webrtc/NetworkMonitor;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public create(Lhms/webrtc/NetworkChangeDetector$Observer;Landroid/content/Context;)Lhms/webrtc/NetworkChangeDetector;
    .locals 1

    new-instance v0, Lhms/webrtc/NetworkMonitorAutoDetect;

    invoke-direct {v0, p1, p2}, Lhms/webrtc/NetworkMonitorAutoDetect;-><init>(Lhms/webrtc/NetworkChangeDetector$Observer;Landroid/content/Context;)V

    return-object v0
.end method
