.class public interface abstract Lio/getstream/chat/android/client/api/state/ThreadState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008f\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R \u0010\u000b\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u00070\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\t\u0010\nR\u001a\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\nR\u001a\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\nR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\nR\u001c\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\nR\u001c\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00080\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\n\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u0017\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "",
        "",
        "getParentId",
        "()Ljava/lang/String;",
        "parentId",
        "Lec3/f2;",
        "",
        "Lio/getstream/chat/android/models/Message;",
        "getMessages",
        "()Lec3/f2;",
        "messages",
        "",
        "getLoading",
        "loading",
        "getEndOfOlderMessages",
        "endOfOlderMessages",
        "getEndOfNewerMessages",
        "endOfNewerMessages",
        "getOldestInThread",
        "oldestInThread",
        "getNewestInThread",
        "newestInThread",
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


# virtual methods
.method public abstract getEndOfNewerMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getEndOfOlderMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoading()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getMessages()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getNewestInThread()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getOldestInThread()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getParentId()Ljava/lang/String;
.end method
