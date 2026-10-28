.class public interface abstract Lio/getstream/chat/android/models/CustomObject;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/models/CustomObject$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0008v\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0002H\u0008\"\u0004\u0008\u0000\u0010\u00082\u0006\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u0002H\u0008H\u0016\u00a2\u0006\u0002\u0010\u000bR\u001e\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0005\u0010\u0006\u0082\u0001\n\u000c\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u00a8\u0006\u0016\u00c0\u0006\u0003"
    }
    d2 = {
        "Lio/getstream/chat/android/models/CustomObject;",
        "",
        "extraData",
        "",
        "",
        "getExtraData",
        "()Ljava/util/Map;",
        "getExtraValue",
        "T",
        "key",
        "default",
        "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/models/Channel;",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "Lio/getstream/chat/android/models/Member;",
        "Lio/getstream/chat/android/models/MemberData;",
        "Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/models/Reaction;",
        "Lio/getstream/chat/android/models/Thread;",
        "Lio/getstream/chat/android/models/ThreadInfo;",
        "Lio/getstream/chat/android/models/User;",
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
.method public static synthetic access$getExtraValue$jd(Lio/getstream/chat/android/models/CustomObject;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    invoke-super {p0, p1, p2}, Lio/getstream/chat/android/models/CustomObject;->getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public abstract getExtraData()Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end method

.method public getExtraValue(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "TT;)TT;"
        }
    .end annotation

    const-string v0, "key"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lio/getstream/chat/android/models/CustomObject;->getExtraData()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p0}, Lio/getstream/chat/android/models/CustomObject;->getExtraData()Ljava/util/Map;

    move-result-object p2

    invoke-interface {p2, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :cond_0
    return-object p2
.end method
