.class public final Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0086\u0008\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\t\u0010\u000e\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J7\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\n\u00a8\u0006\u0019"
    }
    d2 = {
        "Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;",
        "",
        "hash",
        "",
        "peerid",
        "userid",
        "username",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getHash",
        "()Ljava/lang/String;",
        "getPeerid",
        "getUserid",
        "getUsername",
        "component1",
        "component2",
        "component3",
        "component4",
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
.field private final hash:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "hash"
    .end annotation
.end field

.field private final peerid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peerid"
    .end annotation
.end field

.field private final userid:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "userid"
    .end annotation
.end field

.field private final username:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "username"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "hash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;
    .locals 1

    const-string v0, "hash"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    iget-object p1, p1, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getHash()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeerid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserid()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    return-object v0
.end method

.method public final getUsername()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "HMSPollResponsePeerInfo(hash="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->hash:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", peerid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->peerid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", userid="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->userid:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", username="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/polls/models/network/HMSPollResponsePeerInfo;->username:Ljava/lang/String;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
