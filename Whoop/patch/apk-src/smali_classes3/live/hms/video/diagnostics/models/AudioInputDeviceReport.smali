.class public final Llive/hms/video/diagnostics/models/AudioInputDeviceReport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0004\u0010\u0006\"\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/AudioInputDeviceReport;",
        "",
        "<init>",
        "()V",
        "isPassed",
        "",
        "()Z",
        "setPassed",
        "(Z)V",
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
.field private isPassed:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final isPassed()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;->isPassed:Z

    return v0
.end method

.method public final setPassed(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/models/AudioInputDeviceReport;->isPassed:Z

    return-void
.end method
