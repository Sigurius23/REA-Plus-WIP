.class public interface abstract Ldq0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008f\u0018\u00002\u00020\u0001J%\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ%\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\n\u0010\tJ\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00062\u0006\u0010\u000b\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0011\u0010\u000f\u001a\u0004\u0018\u00010\u0002H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J%\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J-\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00062\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000cH&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001e\u00a8\u0006\u001f\u00c0\u0006\u0003"
    }
    d2 = {
        "Ldq0/b;",
        "",
        "Lio/getstream/chat/android/models/User;",
        "user",
        "",
        "token",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/ConnectionData;",
        "c",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;",
        "a",
        "messageId",
        "Lio/getstream/chat/android/models/Message;",
        "d",
        "(Ljava/lang/String;)Lo23/d;",
        "getCurrentUser",
        "()Lio/getstream/chat/android/models/User;",
        "channelType",
        "channelId",
        "Ll83/a0;",
        "b",
        "(Ljava/lang/String;Ljava/lang/String;)Lo23/d;",
        "e",
        "()V",
        "message",
        "sendMessage",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelClient;",
        "f",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract a(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract b(Ljava/lang/String;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract c(Lio/getstream/chat/android/models/User;Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract d(Ljava/lang/String;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method

.method public abstract e()V
.end method

.method public abstract f(Ljava/lang/String;)Lio/getstream/chat/android/client/channel/ChannelClient;
.end method

.method public abstract getCurrentUser()Lio/getstream/chat/android/models/User;
.end method

.method public abstract sendMessage(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/Message;)Lo23/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            ")",
            "Lo23/d;"
        }
    .end annotation
.end method
