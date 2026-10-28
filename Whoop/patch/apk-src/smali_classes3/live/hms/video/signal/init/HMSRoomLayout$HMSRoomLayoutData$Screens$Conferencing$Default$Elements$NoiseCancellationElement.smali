.class public final Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "NoiseCancellationElement"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\t\u0010\u0008\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\t\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\n\u001a\u00020\u00032\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000c\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u000fH\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0010"
    }
    d2 = {
        "Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;",
        "",
        "enabled",
        "",
        "<init>",
        "(Z)V",
        "getEnabled",
        "()Z",
        "component1",
        "copy",
        "equals",
        "other",
        "hashCode",
        "",
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
.field private final enabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled_by_default"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Z)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;ZILjava/lang/Object;)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-boolean p1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    :cond_0
    invoke-virtual {p0, p1}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->copy(Z)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    return v0
.end method

.method public final copy(Z)Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;
    .locals 1

    new-instance v0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;

    invoke-direct {v0, p1}, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;-><init>(Z)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;

    iget-boolean v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    iget-boolean p1, p1, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    if-eq v1, p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public final getEnabled()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "NoiseCancellationElement(enabled="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Llive/hms/video/signal/init/HMSRoomLayout$HMSRoomLayoutData$Screens$Conferencing$Default$Elements$NoiseCancellationElement;->enabled:Z

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lb9/y;->r(Ljava/lang/StringBuilder;ZC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
