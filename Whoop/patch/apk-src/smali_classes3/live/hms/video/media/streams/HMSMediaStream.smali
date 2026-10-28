.class public abstract Llive/hms/video/media/streams/HMSMediaStream;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\t\u001a\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000f\u0010\u0010R\u001d\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00118\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Llive/hms/video/media/streams/HMSMediaStream;",
        "",
        "Lhms/webrtc/MediaStream;",
        "nativeStream",
        "<init>",
        "(Lhms/webrtc/MediaStream;)V",
        "Ll83/a0;",
        "stop",
        "()V",
        "Lhms/webrtc/MediaStream;",
        "getNativeStream",
        "()Lhms/webrtc/MediaStream;",
        "",
        "id",
        "Ljava/lang/String;",
        "getId",
        "()Ljava/lang/String;",
        "Ljava/util/ArrayList;",
        "Llive/hms/video/media/tracks/HMSTrack;",
        "tracks",
        "Ljava/util/ArrayList;",
        "getTracks",
        "()Ljava/util/ArrayList;",
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
.field private final id:Ljava/lang/String;

.field private final nativeStream:Lhms/webrtc/MediaStream;

.field private final tracks:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lhms/webrtc/MediaStream;)V
    .locals 1

    const-string v0, "nativeStream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/streams/HMSMediaStream;->nativeStream:Lhms/webrtc/MediaStream;

    invoke-virtual {p1}, Lhms/webrtc/MediaStream;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "getId(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Llive/hms/video/media/streams/HMSMediaStream;->id:Ljava/lang/String;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Llive/hms/video/media/streams/HMSMediaStream;->tracks:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final getId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/streams/HMSMediaStream;->id:Ljava/lang/String;

    return-object v0
.end method

.method public final getNativeStream()Lhms/webrtc/MediaStream;
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/streams/HMSMediaStream;->nativeStream:Lhms/webrtc/MediaStream;

    return-object v0
.end method

.method public final getTracks()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Llive/hms/video/media/tracks/HMSTrack;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Llive/hms/video/media/streams/HMSMediaStream;->tracks:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final stop()V
    .locals 1

    iget-object v0, p0, Llive/hms/video/media/streams/HMSMediaStream;->nativeStream:Lhms/webrtc/MediaStream;

    invoke-virtual {v0}, Lhms/webrtc/MediaStream;->dispose()V

    return-void
.end method
