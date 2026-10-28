.class public final Llive/hms/video/sdk/models/PeerSearchResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B?\u0008\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB\u0019\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0014R\u001a\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u0015R\u0017\u0010\u0008\u001a\u00020\u00078\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u0017\u0010\u000b\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u0019\u001a\u0004\u0008\u001c\u0010\u001bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001fR!\u0010%\u001a\u0008\u0012\u0004\u0012\u00020 0\u00048FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Llive/hms/video/sdk/models/PeerSearchResponse;",
        "",
        "Llive/hms/video/sdk/SDKStore;",
        "store",
        "",
        "Llive/hms/video/sdk/models/SearchPeerResponse;",
        "_peers",
        "",
        "eof",
        "",
        "offset",
        "count",
        "",
        "limit",
        "<init>",
        "(Llive/hms/video/sdk/SDKStore;Ljava/util/List;ZJJI)V",
        "sdkStore",
        "Llive/hms/video/sdk/models/PeerNameSearchResponse;",
        "peerNameSearchResponse",
        "(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/PeerNameSearchResponse;)V",
        "Llive/hms/video/sdk/SDKStore;",
        "Ljava/util/List;",
        "Z",
        "getEof",
        "()Z",
        "J",
        "getOffset",
        "()J",
        "getCount",
        "I",
        "getLimit",
        "()I",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peers$delegate",
        "Ll83/h;",
        "getPeers",
        "()Ljava/util/List;",
        "peers",
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
.field private final _peers:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;"
        }
    .end annotation
.end field

.field private final count:J

.field private final eof:Z

.field private final limit:I

.field private final offset:J

.field private final peers$delegate:Ll83/h;

.field private final store:Llive/hms/video/sdk/SDKStore;


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/SDKStore;Ljava/util/List;ZJJI)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llive/hms/video/sdk/SDKStore;",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/SearchPeerResponse;",
            ">;ZJJI)V"
        }
    .end annotation

    const-string v0, "store"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "_peers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->store:Llive/hms/video/sdk/SDKStore;

    .line 3
    iput-object p2, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->_peers:Ljava/util/List;

    .line 4
    iput-boolean p3, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->eof:Z

    .line 5
    iput-wide p4, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->offset:J

    .line 6
    iput-wide p6, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->count:J

    .line 7
    iput p8, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->limit:I

    .line 8
    new-instance p1, Llive/hms/video/connection/degredation/a;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->peers$delegate:Ll83/h;

    return-void
.end method

.method public constructor <init>(Llive/hms/video/sdk/SDKStore;Llive/hms/video/sdk/models/PeerNameSearchResponse;)V
    .locals 10

    const-string v0, "sdkStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "peerNameSearchResponse"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    invoke-virtual {p2}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->getPeers()Ljava/util/List;

    move-result-object v3

    .line 10
    invoke-virtual {p2}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->getEof()Z

    move-result v4

    .line 11
    invoke-virtual {p2}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->getOffset()J

    move-result-wide v5

    .line 12
    invoke-virtual {p2}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->getCount()J

    move-result-wide v7

    .line 13
    invoke-virtual {p2}, Llive/hms/video/sdk/models/PeerNameSearchResponse;->getLimit()I

    move-result v9

    move-object v1, p0

    move-object v2, p1

    .line 14
    invoke-direct/range {v1 .. v9}, Llive/hms/video/sdk/models/PeerSearchResponse;-><init>(Llive/hms/video/sdk/SDKStore;Ljava/util/List;ZJJI)V

    return-void
.end method

.method public static synthetic a(Llive/hms/video/sdk/models/PeerSearchResponse;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Llive/hms/video/sdk/models/PeerSearchResponse;->peers_delegate$lambda$1(Llive/hms/video/sdk/models/PeerSearchResponse;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static final peers_delegate$lambda$1(Llive/hms/video/sdk/models/PeerSearchResponse;)Ljava/util/List;
    .locals 4

    const-string v0, "this$0"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->_peers:Ljava/util/List;

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llive/hms/video/sdk/models/SearchPeerResponse;

    iget-object v3, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->store:Llive/hms/video/sdk/SDKStore;

    invoke-virtual {v2, v3}, Llive/hms/video/sdk/models/SearchPeerResponse;->toPeer(Llive/hms/video/sdk/SDKStore;)Llive/hms/video/sdk/models/HMSPeer;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    return-object v1
.end method


# virtual methods
.method public final getCount()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->count:J

    return-wide v0
.end method

.method public final getEof()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->eof:Z

    return v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->limit:I

    return v0
.end method

.method public final getOffset()J
    .locals 2

    iget-wide v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->offset:J

    return-wide v0
.end method

.method public final getPeers()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerSearchResponse;->peers$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    return-object v0
.end method
