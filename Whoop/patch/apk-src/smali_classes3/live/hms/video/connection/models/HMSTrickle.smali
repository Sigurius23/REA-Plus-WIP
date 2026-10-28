.class public final Llive/hms/video/connection/models/HMSTrickle;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J)\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u0007H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSTrickle;",
        "",
        "candidate",
        "Llive/hms/video/connection/models/HMSIceCandidate;",
        "role",
        "Llive/hms/video/connection/models/HMSConnectionRole;",
        "sfuNodeId",
        "",
        "<init>",
        "(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V",
        "getCandidate",
        "()Llive/hms/video/connection/models/HMSIceCandidate;",
        "getRole",
        "()Llive/hms/video/connection/models/HMSConnectionRole;",
        "getSfuNodeId",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
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
.field private final candidate:Llive/hms/video/connection/models/HMSIceCandidate;

.field private final role:Llive/hms/video/connection/models/HMSConnectionRole;

.field private final sfuNodeId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    iput-object p2, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    iput-object p3, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/models/HMSTrickle;Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/connection/models/HMSTrickle;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget-object p2, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/models/HMSTrickle;->copy(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)Llive/hms/video/connection/models/HMSTrickle;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Llive/hms/video/connection/models/HMSIceCandidate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    return-object v0
.end method

.method public final component2()Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)Llive/hms/video/connection/models/HMSTrickle;
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/connection/models/HMSTrickle;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/connection/models/HMSTrickle;-><init>(Llive/hms/video/connection/models/HMSIceCandidate;Llive/hms/video/connection/models/HMSConnectionRole;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/models/HMSTrickle;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/models/HMSTrickle;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    iget-object v3, p1, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    iget-object v3, p1, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCandidate()Llive/hms/video/connection/models/HMSIceCandidate;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    return-object v0
.end method

.method public final getRole()Llive/hms/video/connection/models/HMSConnectionRole;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    return-object v0
.end method

.method public final getSfuNodeId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    invoke-virtual {v0}, Llive/hms/video/connection/models/HMSIceCandidate;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSTrickle(candidate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->candidate:Llive/hms/video/connection/models/HMSIceCandidate;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->role:Llive/hms/video/connection/models/HMSConnectionRole;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sfuNodeId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSTrickle;->sfuNodeId:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
