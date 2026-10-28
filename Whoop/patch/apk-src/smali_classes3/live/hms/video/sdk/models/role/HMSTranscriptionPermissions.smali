.class public final Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\t\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R(\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008\"\u0004\u0008\t\u0010\nR$\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R$\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b@@X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000e\"\u0004\u0008\u0013\u0010\u0010\u00a8\u0006\u0014"
    }
    d2 = {
        "Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;",
        "",
        "<init>",
        "()V",
        "value",
        "Llive/hms/video/sdk/models/TranscriptionsMode;",
        "mode",
        "getMode",
        "()Llive/hms/video/sdk/models/TranscriptionsMode;",
        "setMode$lib_release",
        "(Llive/hms/video/sdk/models/TranscriptionsMode;)V",
        "",
        "admin",
        "getAdmin",
        "()Z",
        "setAdmin$lib_release",
        "(Z)V",
        "read",
        "getRead",
        "setRead$lib_release",
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
.field private admin:Z

.field private mode:Llive/hms/video/sdk/models/TranscriptionsMode;

.field private read:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final getAdmin()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->admin:Z

    return v0
.end method

.method public final getMode()Llive/hms/video/sdk/models/TranscriptionsMode;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-object v0
.end method

.method public final getRead()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->read:Z

    return v0
.end method

.method public final setAdmin$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->admin:Z

    return-void
.end method

.method public final setMode$lib_release(Llive/hms/video/sdk/models/TranscriptionsMode;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->mode:Llive/hms/video/sdk/models/TranscriptionsMode;

    return-void
.end method

.method public final setRead$lib_release(Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/role/HMSTranscriptionPermissions;->read:Z

    return-void
.end method
