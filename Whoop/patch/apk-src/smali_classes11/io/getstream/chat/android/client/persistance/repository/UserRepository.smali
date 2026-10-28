.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/UserRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0005\u0008g\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u00a6@\u00a2\u0006\u0004\u0008\u000b\u0010\nJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\r\u001a\u00020\u000cH\u00a6@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ$\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00102\u000c\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u0010H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J!\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00030\u00150\u0014H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H\u00a6@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001a\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "",
        "",
        "Lio/getstream/chat/android/models/User;",
        "users",
        "Ll83/a0;",
        "insertUsers",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "user",
        "insertUser",
        "(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "insertCurrentUser",
        "",
        "userId",
        "selectUser",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "selectUsers",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "Lec3/f2;",
        "",
        "observeLatestUsers",
        "()Lec3/f2;",
        "clear",
        "(Lq83/d;)Ljava/lang/Object;",
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
.method public abstract clear(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertCurrentUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertUser(Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertUsers(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/User;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract observeLatestUsers()Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation
.end method

.method public abstract selectUser(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectUsers(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/User;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
