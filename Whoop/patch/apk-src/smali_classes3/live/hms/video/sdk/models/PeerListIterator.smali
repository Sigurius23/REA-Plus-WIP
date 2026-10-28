.class public final Llive/hms/video/sdk/models/PeerListIterator;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u000c\u0018\u00002\u00020\u0001B\u0011\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0015\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u000eR$\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008 \u0010!\"\u0004\u0008\"\u0010#R\"\u0010$\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008$\u0010\u001f\u001a\u0004\u0008%\u0010!\"\u0004\u0008&\u0010#R\u0016\u0010\'\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010(\u00a8\u0006)"
    }
    d2 = {
        "Llive/hms/video/sdk/models/PeerListIterator;",
        "",
        "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "peerListIteratorOptions",
        "<init>",
        "(Llive/hms/video/sdk/models/PeerListIteratorOptions;)V",
        "",
        "hasNext",
        "()Z",
        "Llive/hms/video/sdk/listeners/PeerListResultListener;",
        "peerListResultListener",
        "Ll83/a0;",
        "next",
        "(Llive/hms/video/sdk/listeners/PeerListResultListener;)V",
        "Llive/hms/video/sdk/models/PeerListIteratorOptions;",
        "Llive/hms/video/sdk/IPeerListIterator;",
        "iteratorImpl",
        "Llive/hms/video/sdk/IPeerListIterator;",
        "getIteratorImpl$lib_release",
        "()Llive/hms/video/sdk/IPeerListIterator;",
        "setIteratorImpl$lib_release",
        "(Llive/hms/video/sdk/IPeerListIterator;)V",
        "",
        "iteratorId",
        "Ljava/lang/String;",
        "getIteratorId$lib_release",
        "()Ljava/lang/String;",
        "setIteratorId$lib_release",
        "(Ljava/lang/String;)V",
        "",
        "limit",
        "I",
        "getLimit",
        "()I",
        "setLimit",
        "(I)V",
        "totalCount",
        "getTotalCount",
        "setTotalCount",
        "eof",
        "Z",
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
.field private eof:Z

.field private iteratorId:Ljava/lang/String;

.field private iteratorImpl:Llive/hms/video/sdk/IPeerListIterator;

.field private limit:I

.field private final peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

.field private totalCount:I


# direct methods
.method public constructor <init>(Llive/hms/video/sdk/models/PeerListIteratorOptions;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

    const/16 p1, 0xa

    iput p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->limit:I

    return-void
.end method

.method public static final synthetic access$setEof$p(Llive/hms/video/sdk/models/PeerListIterator;Z)V
    .locals 0

    iput-boolean p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->eof:Z

    return-void
.end method


# virtual methods
.method public final getIteratorId$lib_release()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorId:Ljava/lang/String;

    return-object v0
.end method

.method public final getIteratorImpl$lib_release()Llive/hms/video/sdk/IPeerListIterator;
    .locals 1

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorImpl:Llive/hms/video/sdk/IPeerListIterator;

    return-object v0
.end method

.method public final getLimit()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->limit:I

    return v0
.end method

.method public final getTotalCount()I
    .locals 1

    iget v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->totalCount:I

    return v0
.end method

.method public final hasNext()Z
    .locals 1

    iget-boolean v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->eof:Z

    xor-int/lit8 v0, v0, 0x1

    return v0
.end method

.method public final next(Llive/hms/video/sdk/listeners/PeerListResultListener;)V
    .locals 4

    const-string v0, "peerListResultListener"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorImpl:Llive/hms/video/sdk/IPeerListIterator;

    if-eqz v0, :cond_2

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorId:Ljava/lang/String;

    if-nez v1, :cond_0

    iget-object v1, p0, Llive/hms/video/sdk/models/PeerListIterator;->peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

    new-instance v2, Llive/hms/video/sdk/models/PeerListIterator$next$1$1;

    invoke-direct {v2, p0, p1, v0}, Llive/hms/video/sdk/models/PeerListIterator$next$1$1;-><init>(Llive/hms/video/sdk/models/PeerListIterator;Llive/hms/video/sdk/listeners/PeerListResultListener;Llive/hms/video/sdk/IPeerListIterator;)V

    invoke-interface {v0, v1, v2}, Llive/hms/video/sdk/IPeerListIterator;->findPeers(Llive/hms/video/sdk/models/PeerListIteratorOptions;Llive/hms/video/sdk/FindPeerListener;)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v2, p0, Llive/hms/video/sdk/models/PeerListIterator;->peerListIteratorOptions:Llive/hms/video/sdk/models/PeerListIteratorOptions;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Llive/hms/video/sdk/models/PeerListIteratorOptions;->getLimit()I

    move-result v2

    goto :goto_0

    :cond_1
    const/16 v2, 0xa

    :goto_0
    new-instance v3, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;

    invoke-direct {v3, p0, p1, v0}, Llive/hms/video/sdk/models/PeerListIterator$next$1$2;-><init>(Llive/hms/video/sdk/models/PeerListIterator;Llive/hms/video/sdk/listeners/PeerListResultListener;Llive/hms/video/sdk/IPeerListIterator;)V

    invoke-interface {v0, v1, v2, v3}, Llive/hms/video/sdk/IPeerListIterator;->peerIteratorNext(Ljava/lang/String;ILlive/hms/video/sdk/FindPeerListener;)V

    :cond_2
    return-void
.end method

.method public final setIteratorId$lib_release(Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorId:Ljava/lang/String;

    return-void
.end method

.method public final setIteratorImpl$lib_release(Llive/hms/video/sdk/IPeerListIterator;)V
    .locals 0

    iput-object p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->iteratorImpl:Llive/hms/video/sdk/IPeerListIterator;

    return-void
.end method

.method public final setLimit(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->limit:I

    return-void
.end method

.method public final setTotalCount(I)V
    .locals 0

    iput p1, p0, Llive/hms/video/sdk/models/PeerListIterator;->totalCount:I

    return-void
.end method
