.class public final Llive/hms/video/connection/models/HMSIceCandidate;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llive/hms/video/connection/models/HMSIceCandidate$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u0008\u0080\u0008\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0006\u0010\u000e\u001a\u00020\u000fJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\'\u0010\u0013\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u001a"
    }
    d2 = {
        "Llive/hms/video/connection/models/HMSIceCandidate;",
        "",
        "candidate",
        "",
        "sdpMLineIndex",
        "",
        "sdpMid",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getCandidate",
        "()Ljava/lang/String;",
        "getSdpMLineIndex",
        "()I",
        "getSdpMid",
        "native",
        "Lhms/webrtc/IceCandidate;",
        "component1",
        "component2",
        "component3",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "Companion",
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


# static fields
.field public static final Companion:Llive/hms/video/connection/models/HMSIceCandidate$Companion;


# instance fields
.field private final candidate:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "candidate"
    .end annotation
.end field

.field private final sdpMLineIndex:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdpMLineIndex"
    .end annotation
.end field

.field private final sdpMid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sdpMid"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llive/hms/video/connection/models/HMSIceCandidate$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Llive/hms/video/connection/models/HMSIceCandidate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Llive/hms/video/connection/models/HMSIceCandidate;->Companion:Llive/hms/video/connection/models/HMSIceCandidate$Companion;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdpMid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    iput p2, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    iput-object p3, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/connection/models/HMSIceCandidate;Ljava/lang/String;ILjava/lang/String;ILjava/lang/Object;)Llive/hms/video/connection/models/HMSIceCandidate;
    .locals 0

    and-int/lit8 p5, p4, 0x1

    if-eqz p5, :cond_0

    iget-object p1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    :cond_0
    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_1

    iget p2, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    :cond_1
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_2

    iget-object p3, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    :cond_2
    invoke-virtual {p0, p1, p2, p3}, Llive/hms/video/connection/models/HMSIceCandidate;->copy(Ljava/lang/String;ILjava/lang/String;)Llive/hms/video/connection/models/HMSIceCandidate;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;ILjava/lang/String;)Llive/hms/video/connection/models/HMSIceCandidate;
    .locals 1

    const-string v0, "candidate"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sdpMid"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/connection/models/HMSIceCandidate;

    invoke-direct {v0, p1, p2, p3}, Llive/hms/video/connection/models/HMSIceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/connection/models/HMSIceCandidate;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/connection/models/HMSIceCandidate;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    iget v3, p1, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v2

    :cond_4
    return v0
.end method

.method public final getCandidate()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    return-object v0
.end method

.method public final getSdpMLineIndex()I
    .locals 1

    iget v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    return v0
.end method

.method public final getSdpMid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final native()Lhms/webrtc/IceCandidate;
    .locals 4

    new-instance v0, Lhms/webrtc/IceCandidate;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    iget v2, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    iget-object v3, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    invoke-direct {v0, v1, v2, v3}, Lhms/webrtc/IceCandidate;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSIceCandidate(candidate="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->candidate:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sdpMLineIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMLineIndex:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", sdpMid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/connection/models/HMSIceCandidate;->sdpMid:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
