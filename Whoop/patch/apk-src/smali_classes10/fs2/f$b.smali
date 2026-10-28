.class public final Lfs2/f$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Llive/hms/video/sdk/HMSPreviewListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfs2/f;->h(Lfs2/c;)Lfs2/f$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J%\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001f\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "fs2/f$b",
        "Llive/hms/video/sdk/HMSPreviewListener;",
        "Llive/hms/video/sdk/models/HMSRoom;",
        "room",
        "",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "localTracks",
        "Ll83/a0;",
        "onPreview",
        "(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V",
        "Llive/hms/video/error/HMSException;",
        "error",
        "onError",
        "(Llive/hms/video/error/HMSException;)V",
        "Llive/hms/video/sdk/models/enums/HMSPeerUpdate;",
        "type",
        "Llive/hms/video/sdk/models/HMSPeer;",
        "peer",
        "onPeerUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V",
        "Llive/hms/video/sdk/models/enums/HMSRoomUpdate;",
        "hmsRoom",
        "onRoomUpdate",
        "(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V",
        "video-call_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lfs2/f;

.field final synthetic x:Lfs2/c;


# direct methods
.method public constructor <init>(Lfs2/f;Lfs2/c;)V
    .locals 0

    iput-object p1, p0, Lfs2/f$b;->w:Lfs2/f;

    iput-object p2, p0, Lfs2/f$b;->x:Lfs2/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onError(Llive/hms/video/error/HMSException;)V
    .locals 4

    const-string v0, "error"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lfs2/f$b;->w:Lfs2/f;

    iget-object v1, p0, Lfs2/f$b;->x:Lfs2/c;

    const-string v2, "preview"

    invoke-static {v0, v1, v2}, Lfs2/f;->c(Lfs2/f;Lfs2/c;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p1}, Llive/hms/video/error/HMSException;->isTerminal()Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_1

    iget-object v0, p0, Lfs2/f$b;->w:Lfs2/f;

    invoke-static {v0}, Lfs2/f;->a(Lfs2/f;)Ltr2/n;

    move-result-object v0

    invoke-static {p1}, Lfs2/g;->a(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object p1

    const-string v2, "Preview continuing after non-terminal error: "

    invoke-static {v2, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    iget-object v0, p0, Lfs2/f$b;->w:Lfs2/f;

    invoke-static {v0}, Lfs2/f;->a(Lfs2/f;)Ltr2/n;

    move-result-object v0

    invoke-static {p1}, Lfs2/g;->a(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object v2

    const-string v3, "Preview failed: "

    invoke-static {v3, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lfs2/f$b;->w:Lfs2/f;

    invoke-static {v0}, Lfs2/f;->b(Lfs2/f;)Lec3/p1;

    move-result-object v0

    new-instance v1, Lfs2/b$b;

    invoke-static {p1}, Lfs2/g;->a(Llive/hms/video/error/HMSException;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lfs2/b$b;-><init>(Ljava/lang/String;)V

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x0

    invoke-virtual {v0, p1, v1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public onPeerUpdate(Llive/hms/video/sdk/models/enums/HMSPeerUpdate;Llive/hms/video/sdk/models/HMSPeer;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "peer"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge onPermissionsRequested(Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1}, Llive/hms/video/sdk/HMSPreviewListener$DefaultImpls;->onPermissionsRequested(Llive/hms/video/sdk/HMSPreviewListener;Ljava/util/List;)V

    return-void
.end method

.method public onPreview(Llive/hms/video/sdk/models/HMSRoom;[Llive/hms/video/media/tracks/HMSTrack;)V
    .locals 1

    const-string v0, "room"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "localTracks"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lfs2/f$b;->w:Lfs2/f;

    iget-object p2, p0, Lfs2/f$b;->x:Lfs2/c;

    const-string v0, "preview"

    invoke-static {p1, p2, v0}, Lfs2/f;->c(Lfs2/f;Lfs2/c;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, Lfs2/f$b;->w:Lfs2/f;

    invoke-static {p1}, Lfs2/f;->b(Lfs2/f;)Lec3/p1;

    move-result-object p1

    sget-object p2, Lfs2/b$c;->a:Lfs2/b$c;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, p2}, Lec3/h2;->j(Ljava/lang/Object;)V

    return-void
.end method

.method public onRoomUpdate(Llive/hms/video/sdk/models/enums/HMSRoomUpdate;Llive/hms/video/sdk/models/HMSRoom;)V
    .locals 1

    const-string v0, "type"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "hmsRoom"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public bridge peerListUpdated(Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/sdk/models/HMSPeer;",
            ">;)V"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Llive/hms/video/sdk/HMSPreviewListener$DefaultImpls;->peerListUpdated(Llive/hms/video/sdk/HMSPreviewListener;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-void
.end method
