.class public interface abstract Lio/getstream/chat/android/models/UserEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/UserEntity$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J\u0008\u0010\u0006\u001a\u00020\u0007H\u0016R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0004\u0010\u0005\u0082\u0001\u0003\u0008\t\n\u00a8\u0006\u000b\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/models/UserEntity;",
        "",
        "user",
        "Lio/getstream/chat/android/models/User;",
        "getUser",
        "()Lio/getstream/chat/android/models/User;",
        "getUserId",
        "",
        "Lio/getstream/chat/android/models/ChannelUserRead;",
        "Lio/getstream/chat/android/models/Member;",
        "Lio/getstream/chat/android/models/ThreadParticipant;",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic access$getUserId$jd(Lio/getstream/chat/android/models/UserEntity;)Ljava/lang/String;
    .locals 0

    invoke-super {p0}, Lio/getstream/chat/android/models/UserEntity;->getUserId()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getUser()Lio/getstream/chat/android/models/User;
.end method

.method public getUserId()Ljava/lang/String;
    .locals 1

    invoke-interface {p0}, Lio/getstream/chat/android/models/UserEntity;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v0

    invoke-virtual {v0}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
