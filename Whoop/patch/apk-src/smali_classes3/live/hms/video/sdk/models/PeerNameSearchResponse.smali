.class public final Llive/hms/video/sdk/models/PeerNameSearchResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0015\n\u0002\u0010\u000e\n\u0000\u0008\u0080\u0008\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\u0008H\u00c6\u0003J\u000f\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003JA\u0010\u001c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00082\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020\u0006H\u00d6\u0001J\t\u0010 \u001a\u00020!H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0014R\u001c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\""
    }
    d2 = {
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "",
        "count",
        "",
        "offset",
        "limit",
        "",
        "eof",
        "",
        "peers",
        "",
        "Llive/hms/video/sdk/models/SearchPeerResponse;",
        "<init>",
        "(JJIZLjava/util/List;)V",
        "getCount",
        "()J",
        "getOffset",
        "getLimit",
        "()I",
        "getEof",
        "()Z",
        "getPeers",
        "()Ljava/util/List;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "other",
        "hashCode",
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
.field private final count:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "count"
    .end annotation
.end field

.field private final eof:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "eof"
    .end annotation
.end field

.field private final limit:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "limit"
    .end annotation
.end field

.field private final offset:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "offset"
    .end annotation
.end field

.field private final peers:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "peers"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(JJIZLjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJIZ",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;)V"
        }
    .end annotation

    const-string v0, "peers"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    iput-wide p3, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    iput p5, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    iput-boolean p6, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    iput-object p7, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/PeerNameSearchResponse;JJIZLjava/util/List;ILjava/lang/Object;)Llive/hms/video/sdk/models/PeerNameSearchResponse;
    .locals 8

    and-int/lit8 v0, p8, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p8, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p8, 0x4

    if-eqz p1, :cond_2

    iget p5, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    :cond_2
    move v5, p5

    and-int/lit8 p1, p8, 0x8

    if-eqz p1, :cond_3

    iget-boolean p6, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    :cond_3
    move v6, p6

    and-int/lit8 p1, p8, 0x10

    if-eqz p1, :cond_4

    iget-object p7, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    :cond_4
    move-object v0, p0

    move-object v7, p7

    invoke-virtual/range {v0 .. v7}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->copy(JJIZLjava/util/List;)Llive/hms/video/sdk/models/PeerNameSearchResponse;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    return-wide v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    return-wide v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    return v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    return-object v0
.end method

.method public final copy(JJIZLjava/util/List;)Llive/hms/video/sdk/models/PeerNameSearchResponse;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JJIZ",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;)",
            "Llive/hms/video/sdk/models/PeerNameSearchResponse;"
        }
    .end annotation

    const-string v0, "peers"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Llive/hms/video/sdk/models/PeerNameSearchResponse;

    move-wide v2, p1

    move-wide v4, p3

    move v6, p5

    move v7, p6

    invoke-direct/range {v1 .. v8}, Llive/hms/video/sdk/models/PeerNameSearchResponse;-><init>(JJIZLjava/util/List;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;

    iget-wide v3, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    iget-wide v5, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    iget v3, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    iget-boolean v3, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    iget-object p1, p1, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCount()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    return-wide v0
.end method

.method public final getEof()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    return v0
.end method

.method public final getOffset()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    return-wide v0
.end method

.method public final getPeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    invoke-static {v0, v2, v3, v1}, Ld;->e(IJI)I

    move-result v0

    iget v2, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PeerNameSearchResponse(count="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->count:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", offset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->offset:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->limit:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", eof="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->eof:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", peers="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerNameSearchResponse;->peers:Ljava/util/List;

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
