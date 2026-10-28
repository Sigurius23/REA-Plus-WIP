.class public final Llive/hms/video/diagnostics/models/ConnectivityCheckResult;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0008\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u00100\u001a\u000201H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0080\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\"\u0004\u0008\u000c\u0010\tR\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u000eX\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R*\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0013@@X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0019\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R$\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0012\u001a\u00020\u001a@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020!\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010#R\u0011\u0010$\u001a\u00020%\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010(\u001a\u00020)\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0017\u0010,\u001a\u0008\u0012\u0004\u0012\u00020.0-\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u0011\u00a8\u00062"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/ConnectivityCheckResult;",
        "",
        "<init>",
        "()V",
        "isPublishICEConnected",
        "",
        "isPublishICEConnected$lib_release",
        "()Z",
        "setPublishICEConnected$lib_release",
        "(Z)V",
        "isSubscribeICEConnected",
        "isSubscribeICEConnected$lib_release",
        "setSubscribeICEConnected$lib_release",
        "networkQualityValues",
        "",
        "",
        "getNetworkQualityValues$lib_release",
        "()Ljava/util/List;",
        "value",
        "",
        "testTimestamp",
        "getTestTimestamp",
        "()Ljava/lang/Long;",
        "setTestTimestamp$lib_release",
        "(Ljava/lang/Long;)V",
        "Ljava/lang/Long;",
        "Llive/hms/video/diagnostics/models/ConnectivityState;",
        "connectivityState",
        "getConnectivityState",
        "()Llive/hms/video/diagnostics/models/ConnectivityState;",
        "setConnectivityState$lib_release",
        "(Llive/hms/video/diagnostics/models/ConnectivityState;)V",
        "signallingReport",
        "Llive/hms/video/diagnostics/models/SignallingReport;",
        "getSignallingReport",
        "()Llive/hms/video/diagnostics/models/SignallingReport;",
        "mediaServerReport",
        "Llive/hms/video/diagnostics/models/MediaServerReport;",
        "getMediaServerReport",
        "()Llive/hms/video/diagnostics/models/MediaServerReport;",
        "deviceTestReport",
        "Llive/hms/video/diagnostics/models/DeviceTestReport;",
        "getDeviceTestReport",
        "()Llive/hms/video/diagnostics/models/DeviceTestReport;",
        "errors",
        "",
        "Llive/hms/video/error/HMSException;",
        "getErrors",
        "toString",
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


# instance fields
.field private connectivityState:Llive/hms/video/diagnostics/models/ConnectivityState;

.field private final deviceTestReport:Llive/hms/video/diagnostics/models/DeviceTestReport;

.field private final errors:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/error/HMSException;",
            ">;"
        }
    .end annotation
.end field

.field private isPublishICEConnected:Z

.field private isSubscribeICEConnected:Z

.field private final mediaServerReport:Llive/hms/video/diagnostics/models/MediaServerReport;

.field private final networkQualityValues:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation
.end field

.field private final signallingReport:Llive/hms/video/diagnostics/models/SignallingReport;

.field private testTimestamp:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->networkQualityValues:Ljava/util/List;

    sget-object v0, Llive/hms/video/diagnostics/models/ConnectivityState;->STARTING:Llive/hms/video/diagnostics/models/ConnectivityState;

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->connectivityState:Llive/hms/video/diagnostics/models/ConnectivityState;

    new-instance v0, Llive/hms/video/diagnostics/models/SignallingReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/SignallingReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->signallingReport:Llive/hms/video/diagnostics/models/SignallingReport;

    new-instance v0, Llive/hms/video/diagnostics/models/MediaServerReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/MediaServerReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->mediaServerReport:Llive/hms/video/diagnostics/models/MediaServerReport;

    new-instance v0, Llive/hms/video/diagnostics/models/DeviceTestReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/DeviceTestReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->deviceTestReport:Llive/hms/video/diagnostics/models/DeviceTestReport;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->errors:Ljava/util/List;

    return-void
.end method


# virtual methods
.method public final getConnectivityState()Llive/hms/video/diagnostics/models/ConnectivityState;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->connectivityState:Llive/hms/video/diagnostics/models/ConnectivityState;

    return-object v0
.end method

.method public final getDeviceTestReport()Llive/hms/video/diagnostics/models/DeviceTestReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->deviceTestReport:Llive/hms/video/diagnostics/models/DeviceTestReport;

    return-object v0
.end method

.method public final getErrors()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/error/HMSException;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->errors:Ljava/util/List;

    return-object v0
.end method

.method public final getMediaServerReport()Llive/hms/video/diagnostics/models/MediaServerReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->mediaServerReport:Llive/hms/video/diagnostics/models/MediaServerReport;

    return-object v0
.end method

.method public final getNetworkQualityValues$lib_release()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->networkQualityValues:Ljava/util/List;

    return-object v0
.end method

.method public final getSignallingReport()Llive/hms/video/diagnostics/models/SignallingReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->signallingReport:Llive/hms/video/diagnostics/models/SignallingReport;

    return-object v0
.end method

.method public final getTestTimestamp()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->testTimestamp:Ljava/lang/Long;

    return-object v0
.end method

.method public final isPublishICEConnected$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isPublishICEConnected:Z

    return v0
.end method

.method public final isSubscribeICEConnected$lib_release()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isSubscribeICEConnected:Z

    return v0
.end method

.method public final setConnectivityState$lib_release(Llive/hms/video/diagnostics/models/ConnectivityState;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->connectivityState:Llive/hms/video/diagnostics/models/ConnectivityState;

    return-void
.end method

.method public final setPublishICEConnected$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isPublishICEConnected:Z

    return-void
.end method

.method public final setSubscribeICEConnected$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->isSubscribeICEConnected:Z

    return-void
.end method

.method public final setTestTimestamp$lib_release(Ljava/lang/Long;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->testTimestamp:Ljava/lang/Long;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "ConnectivityCheckResult(testTimestamp="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->testTimestamp:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", connectivityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->connectivityState:Llive/hms/video/diagnostics/models/ConnectivityState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", signallingReport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->signallingReport:Llive/hms/video/diagnostics/models/SignallingReport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", mediaServerReport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->mediaServerReport:Llive/hms/video/diagnostics/models/MediaServerReport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", deviceTestReport="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->deviceTestReport:Llive/hms/video/diagnostics/models/DeviceTestReport;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", errors="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/ConnectivityCheckResult;->errors:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
