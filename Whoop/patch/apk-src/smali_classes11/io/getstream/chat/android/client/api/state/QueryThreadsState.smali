.class public interface abstract Lio/getstream/chat/android/client/api/state/QueryThreadsState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0008\u0005\u0008f\u0018\u00002\u00020\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0003\u0010\u0004R\u001a\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\tR \u0010\u000f\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u000c0\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\r\u0010\u000eR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0011\u0010\u000eR\u001a\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u000eR\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0016\u0010\u000eR \u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00150\u00180\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0019\u0010\u000eR\u001a\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000b8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u001b\u0010\u000e\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001d\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "",
        "Lio/getstream/chat/android/models/FilterObject;",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Thread;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "Lec3/f2;",
        "",
        "getThreads",
        "()Lec3/f2;",
        "threads",
        "",
        "getLoading",
        "loading",
        "getLoadingMore",
        "loadingMore",
        "",
        "getNext",
        "next",
        "",
        "getUnseenThreadIds",
        "unseenThreadIds",
        "getLoadingError",
        "loadingError",
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
.method public abstract getFilter()Lio/getstream/chat/android/models/FilterObject;
.end method

.method public abstract getLoading()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoadingError()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getLoadingMore()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getNext()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;"
        }
    .end annotation
.end method

.method public abstract getThreads()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract getUnseenThreadIds()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method
