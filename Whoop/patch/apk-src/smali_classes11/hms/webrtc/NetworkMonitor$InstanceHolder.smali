.class Lhms/webrtc/NetworkMonitor$InstanceHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lhms/webrtc/NetworkMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "InstanceHolder"
.end annotation


# static fields
.field static final instance:Lhms/webrtc/NetworkMonitor;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lhms/webrtc/NetworkMonitor;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lhms/webrtc/NetworkMonitor;-><init>(I)V

    sput-object v0, Lhms/webrtc/NetworkMonitor$InstanceHolder;->instance:Lhms/webrtc/NetworkMonitor;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method
