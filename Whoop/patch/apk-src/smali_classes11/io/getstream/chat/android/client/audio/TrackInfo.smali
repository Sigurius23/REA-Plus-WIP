.class public final Lio/getstream/chat/android/client/audio/TrackInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lio/getstream/chat/android/client/audio/TrackInfo;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008\u0000\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0000H\u0096\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/audio/TrackInfo;",
        "",
        "url",
        "",
        "hash",
        "",
        "positionInt",
        "<init>",
        "(Ljava/lang/String;II)V",
        "getUrl",
        "()Ljava/lang/String;",
        "getHash",
        "()I",
        "compareTo",
        "other",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final hash:I

.field private final positionInt:I

.field private final url:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->url:Ljava/lang/String;

    iput p2, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->hash:I

    iput p3, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->positionInt:I

    return-void
.end method


# virtual methods
.method public final compareTo(Lio/getstream/chat/android/client/audio/TrackInfo;)I
    .locals 1

    const-string v0, "other"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget v0, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->positionInt:I

    iget p1, p1, Lio/getstream/chat/android/client/audio/TrackInfo;->positionInt:I

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->k(II)I

    move-result p1

    return p1
.end method

.method public final bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Lio/getstream/chat/android/client/audio/TrackInfo;

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/audio/TrackInfo;->compareTo(Lio/getstream/chat/android/client/audio/TrackInfo;)I

    move-result p1

    return p1
.end method

.method public final getHash()I
    .locals 1

    iget v0, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->hash:I

    return v0
.end method

.method public final getUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/audio/TrackInfo;->url:Ljava/lang/String;

    return-object v0
.end method
