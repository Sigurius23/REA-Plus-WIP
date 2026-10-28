.class public final Llive/hms/video/sdk/models/PeerListIteratorOptions;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BG\u0012\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u001c\u0008\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\"\u0010\u0016\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003JN\u0010\u0018\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u001c\u0008\u0002\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001\u00a2\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\tH\u00d6\u0001J\t\u0010\u001e\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\'\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0007j\n\u0012\u0004\u0012\u00020\u0003\u0018\u0001`\u0006\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\u0008\u000f\u0010\u0010R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "",
        "byGroupName",
        "",
        "byRoleName",
        "byPeerIds",
        "Lkotlin/collections/ArrayList;",
        "Ljava/util/ArrayList;",
        "limit",
        "",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V",
        "getByGroupName",
        "()Ljava/lang/String;",
        "getByRoleName",
        "getByPeerIds",
        "()Ljava/util/ArrayList;",
        "Ljava/util/ArrayList;",
        "getLimit",
        "()I",
        "component1",
        "component2",
        "component3",
        "component4",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "equals",
        "",
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
.field private final byGroupName:Ljava/lang/String;

.field private final byPeerIds:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final byRoleName:Ljava/lang/String;

.field private final limit:I


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    const/16 v5, 0xf

    const/4 v6, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Llive/hms/video/sdk/models/PeerListIteratorOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    .line 6
    iput p4, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p5, 0x1

    const/4 v0, 0x0

    if-eqz p6, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    move-object p2, v0

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    move-object p3, v0

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    const/16 p4, 0xa

    .line 7
    :cond_3
    invoke-direct {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/PeerListIteratorOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V

    return-void
.end method

.method public static synthetic copy$default(Llive/hms/video/sdk/models/PeerListIteratorOptions;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;IILjava/lang/Object;)Llive/hms/video/sdk/models/PeerListIteratorOptions;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget p4, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Llive/hms/video/sdk/models/PeerListIteratorOptions;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    return v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)Llive/hms/video/sdk/models/PeerListIteratorOptions;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;I)",
            "Llive/hms/video/sdk/models/PeerListIteratorOptions;"
        }
    .end annotation

    new-instance v0, Llive/hms/video/sdk/models/PeerListIteratorOptions;

    invoke-direct {v0, p1, p2, p3, p4}, Llive/hms/video/sdk/models/PeerListIteratorOptions;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    iget-object v3, p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    iget-object v3, p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    iget p1, p1, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    if-eq v1, p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getByGroupName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    return-object v0
.end method

.method public final getByPeerIds()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final getByRoleName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    return v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    if-nez v2, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/util/ArrayList;->hashCode()I

    move-result v1

    :goto_2
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "PeerListIteratorOptions(byGroupName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byGroupName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", byRoleName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byRoleName:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", byPeerIds="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->byPeerIds:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", limit="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Llive/hms/video/sdk/models/PeerListIteratorOptions;->limit:I

    const/16 v2, 0x29

    invoke-static {v0, v1, v2}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
