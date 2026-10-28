.class public final Llive/hms/video/sdk/models/FindPeerResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0018\u0008\u0080\u0008\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000cj\u0008\u0012\u0004\u0012\u00020\u000b`\n\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003J\u001e\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000cj\u0008\u0012\u0004\u0012\u00020\u000b`\nH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0017JP\u0010\u001e\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0018\u0008\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000cj\u0008\u0012\u0004\u0012\u00020\u000b`\nH\u00c6\u0001\u00a2\u0006\u0002\u0010\u001fJ\u0013\u0010 \u001a\u00020\u00082\u0008\u0010!\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00d6\u0001J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R(\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u000cj\u0008\u0012\u0004\u0012\u00020\u000b`\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0018\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006$"
    }
    d2 = {
        "Llive/hms/video/sdk/models/FindPeerResponse;",
        "",
        "iteratorId",
        "",
        "limit",
        "",
        "total",
        "eof",
        "",
        "peers",
        "Lkotlin/collections/ArrayList;",
        "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
        "Ljava/util/ArrayList;",
        "<init>",
        "(Ljava/lang/String;IIZLjava/util/ArrayList;)V",
        "getIteratorId",
        "()Ljava/lang/String;",
        "getLimit",
        "()I",
        "getTotal",
        "getEof",
        "()Z",
        "getPeers",
        "()Ljava/util/ArrayList;",
        "Ljava/util/ArrayList;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "(Ljava/lang/String;IIZLjava/util/ArrayList;)Llive/hms/video/sdk/models/FindPeerResponse;",
        "equals",
        "other",
        "hashCode",
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
.field private final eof:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "eof"
    .end annotation
.end field

.field private final iteratorId:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "iterator"
    .end annotation
.end field

.field private final limit:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "limit"
    .end annotation
.end field

.field private final peers:Ljava/util/ArrayList;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;"
        }
    .end annotation
.end field

.field private final total:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "total"
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;IIZLjava/util/ArrayList;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIZ",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;)V"
        }
    .end annotation

    const-string v0, "iteratorId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peers"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    iput p2, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    iput p3, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    iput-boolean p4, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    iput-object p5, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/FindPeerResponse;Ljava/lang/String;IIZLjava/util/ArrayList;ILjava/lang/Object;)Llive/hms/video/sdk/models/FindPeerResponse;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget p2, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget p3, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-boolean p4, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    :cond_4
    move p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Llive/hms/video/sdk/models/FindPeerResponse;->copy(Ljava/lang/String;IIZLjava/util/ArrayList;)Llive/hms/video/sdk/models/FindPeerResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    return v0
.end method

.method public final component5()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;IIZLjava/util/ArrayList;)Llive/hms/video/sdk/models/FindPeerResponse;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "IIZ",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;)",
            "Llive/hms/video/sdk/models/FindPeerResponse;"
        }
    .end annotation

    const-string v0, "iteratorId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peers"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/FindPeerResponse;

    move-object v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Llive/hms/video/sdk/models/FindPeerResponse;-><init>(Ljava/lang/String;IIZLjava/util/ArrayList;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/FindPeerResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/FindPeerResponse;

    iget-object v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    iget v3, p1, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    iget v3, p1, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    iget-object p1, p1, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getEof()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    return v0
.end method

.method public final getIteratorId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    return v0
.end method

.method public final getPeers()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSNotifications$Peer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getTotal()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "FindPeerResponse(iteratorId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->iteratorId:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", total="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->total:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eof="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->eof:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", peers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/FindPeerResponse;->peers:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
