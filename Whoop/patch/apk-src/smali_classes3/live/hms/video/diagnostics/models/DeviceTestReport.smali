.class public final Llive/hms/video/diagnostics/models/DeviceTestReport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u000c\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/DeviceTestReport;",
        "",
        "<init>",
        "()V",
        "audioInputReport",
        "Llive/hms/video/diagnostics/models/AudioInputDeviceReport;",
        "getAudioInputReport",
        "()Llive/hms/video/diagnostics/models/AudioInputDeviceReport;",
        "audioOutputReport",
        "Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;",
        "getAudioOutputReport",
        "()Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;",
        "videoInputReport",
        "Llive/hms/video/diagnostics/models/VideoInputDeviceReport;",
        "getVideoInputReport",
        "()Llive/hms/video/diagnostics/models/VideoInputDeviceReport;",
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
.field private final audioInputReport:Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

.field private final audioOutputReport:Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

.field private final videoInputReport:Llive/hms/video/diagnostics/models/VideoInputDeviceReport;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->audioInputReport:Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

    new-instance v0, Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->audioOutputReport:Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

    new-instance v0, Llive/hms/video/diagnostics/models/VideoInputDeviceReport;

    invoke-direct {v0}, Llive/hms/video/diagnostics/models/VideoInputDeviceReport;-><init>()V

    iput-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->videoInputReport:Llive/hms/video/diagnostics/models/VideoInputDeviceReport;

    return-void
.end method


# virtual methods
.method public final getAudioInputReport()Llive/hms/video/diagnostics/models/AudioInputDeviceReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->audioInputReport:Llive/hms/video/diagnostics/models/AudioInputDeviceReport;

    return-object v0
.end method

.method public final getAudioOutputReport()Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->audioOutputReport:Llive/hms/video/diagnostics/models/AudioOutputDeviceReport;

    return-object v0
.end method

.method public final getVideoInputReport()Llive/hms/video/diagnostics/models/VideoInputDeviceReport;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/DeviceTestReport;->videoInputReport:Llive/hms/video/diagnostics/models/VideoInputDeviceReport;

    return-object v0
.end method
