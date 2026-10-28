.class public final Llive/hms/video/diagnostics/models/SignallingReport;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0012\u001a\u00020\u000cH\u0016R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\"\u0004\u0008\u0008\u0010\tR$\u0010\n\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\n\u0010\u0007\"\u0004\u0008\u000b\u0010\tR(\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u000c@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0013"
    }
    d2 = {
        "Llive/hms/video/diagnostics/models/SignallingReport;",
        "",
        "<init>",
        "()V",
        "value",
        "",
        "isConnected",
        "()Z",
        "setConnected$lib_release",
        "(Z)V",
        "isInitConnected",
        "setInitConnected$lib_release",
        "",
        "websocketUrl",
        "getWebsocketUrl",
        "()Ljava/lang/String;",
        "setWebsocketUrl$lib_release",
        "(Ljava/lang/String;)V",
        "toString",
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
.field private isConnected:Z

.field private isInitConnected:Z

.field private websocketUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getWebsocketUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/diagnostics/models/SignallingReport;->websocketUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final isConnected()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isConnected:Z

    return v0
.end method

.method public final isInitConnected()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isInitConnected:Z

    return v0
.end method

.method public final setConnected$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isConnected:Z

    return-void
.end method

.method public final setInitConnected$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isInitConnected:Z

    return-void
.end method

.method public final setWebsocketUrl$lib_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->websocketUrl:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SignallingReport(isConnected="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isConnected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", isInitConnected="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->isInitConnected:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", websocketUrl="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/diagnostics/models/SignallingReport;->websocketUrl:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
