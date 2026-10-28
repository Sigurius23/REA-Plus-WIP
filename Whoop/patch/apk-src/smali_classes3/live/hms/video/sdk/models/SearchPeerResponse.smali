.class public final Llive/hms/video/sdk/models/SearchPeerResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0080\u0008\u0018\u00002\u00020\u0001B+\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J5\u0010\u0018\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/sdk/models/SearchPeerResponse;",
        "",
        "peerId",
        "",
        "role",
        "name",
        "type",
        "Llive/hms/video/sdk/models/HMSPeerType;",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V",
        "getPeerId",
        "()Ljava/lang/String;",
        "getRole",
        "getName",
        "getType",
        "()Llive/hms/video/sdk/models/HMSPeerType;",
        "toPeer",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "store",
        "Llive/hms/video/sdk/SDKStore;",
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
.field private final name:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "name"
    .end annotation
.end field

.field private final peerId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peer_id"
    .end annotation
.end field

.field private final role:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "role"
    .end annotation
.end field

.field private final type:Llive/hms/video/sdk/models/HMSPeerType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "type"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V
    .locals 1

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    iput-object p2, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    iput-object p3, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    iput-object p4, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/SearchPeerResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;ILjava/lang/Object;)Llive/hms/video/sdk/models/SearchPeerResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/SearchPeerResponse;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)Llive/hms/video/sdk/models/SearchPeerResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Llive/hms/video/sdk/models/HMSPeerType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)Llive/hms/video/sdk/models/SearchPeerResponse;
    .locals 1

    const-string v0, "role"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llive/hms/video/sdk/models/SearchPeerResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/SearchPeerResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/SearchPeerResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/SearchPeerResponse;

    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    iget-object p1, p1, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getPeerId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    return-object v0
.end method

.method public final getRole()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Llive/hms/video/sdk/models/HMSPeerType;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v3, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    invoke-static {v0, v2, v3}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    return v0
.end method

.method public final toPeer(Llive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/HMSPeer;
    .locals 14

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return-object v1

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getLocalPeerId()Ljava/lang/String;

    move-result-object v0

    iget-object v2, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getRolesMap()Ljava/util/Map;

    move-result-object v2

    iget-object v3, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    invoke-interface {v2, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Llive/hms/video/sdk/models/role/HMSRole;

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Llive/hms/video/sdk/SDKStore;->getLocalPeer()Llive/hms/video/sdk/models/HMSLocalPeer;

    move-result-object p1

    return-object p1

    :cond_1
    if-eqz v7, :cond_3

    new-instance v3, Llive/hms/video/sdk/models/HMSRemotePeer;

    iget-object v4, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    iget-object v6, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    iget-object p1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    if-nez p1, :cond_2

    sget-object p1, Llive/hms/video/sdk/models/HMSPeerType;->REGULAR:Llive/hms/video/sdk/models/HMSPeerType;

    :cond_2
    move-object v11, p1

    const/16 v12, 0x20

    const/4 v13, 0x0

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v3 .. v13}, Llive/hms/video/sdk/models/HMSRemotePeer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Llive/hms/video/sdk/models/role/HMSRole;JLjava/lang/String;Llive/hms/video/sdk/models/HMSPeerType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v3

    :cond_3
    return-object v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SearchPeerResponse(peerId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->peerId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", role="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->role:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->name:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", type="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/SearchPeerResponse;->type:Llive/hms/video/sdk/models/HMSPeerType;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
