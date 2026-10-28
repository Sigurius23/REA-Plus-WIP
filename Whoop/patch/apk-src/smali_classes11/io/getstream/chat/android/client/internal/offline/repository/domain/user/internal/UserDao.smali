.class public interface abstract Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\n\u0008a\u0018\u00002\u00020\u0001J\u001e\u0010\u0006\u001a\u00020\u00052\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u0003H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ$\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0002H\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u0007J\u001a\u0010\r\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000e\u001a\u00020\u000bH\u00a7@\u00a2\u0006\u0004\u0008\r\u0010\u000fJ%\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\'\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J-\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0010H\'\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006\u001a\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserDao;",
        "",
        "",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
        "users",
        "Ll83/a0;",
        "insertMany",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "userEntity",
        "insert",
        "(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;",
        "",
        "ids",
        "select",
        "id",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "limit",
        "offset",
        "selectAllUser",
        "(II)Ljava/util/List;",
        "searchString",
        "selectUsersLikeName",
        "(Ljava/lang/String;II)Ljava/util/List;",
        "deleteAll",
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
.method public abstract deleteAll(Lq83/d;)Ljava/lang/Object;
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

.method public abstract insert(Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract insertMany(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract selectAllUser(II)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(II)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;"
        }
    .end annotation
.end method

.method public abstract selectUsersLikeName(Ljava/lang/String;II)Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "II)",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/user/internal/UserEntity;",
            ">;"
        }
    .end annotation
.end method
