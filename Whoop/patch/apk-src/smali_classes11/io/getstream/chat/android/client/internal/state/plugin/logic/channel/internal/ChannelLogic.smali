.class public interface abstract Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0014\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008`\u0018\u00002\u00020\u0001J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J%\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ(\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J&\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J(\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000f\u001a\u00020\u000eH\u00a6@\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u001e\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0015\u001a\u00020\u0014H\u00a6@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0015\u001a\u00020\u0014H&\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0017\u0010!\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008!\u0010 J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u001bH&\u00a2\u0006\u0004\u0008\"\u0010 J\u001d\u0010&\u001a\u00020\u00042\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020$0#H&\u00a2\u0006\u0004\u0008&\u0010\'J\u0017\u0010)\u001a\u00020\u00042\u0006\u0010(\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008)\u0010*J\u0017\u0010-\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&\u00a2\u0006\u0004\u0008-\u0010.J\u0017\u0010/\u001a\u00020\u00042\u0006\u0010,\u001a\u00020+H&\u00a2\u0006\u0004\u0008/\u0010.J\u0017\u00102\u001a\u00020\u00042\u0006\u00101\u001a\u000200H&\u00a2\u0006\u0004\u00082\u00103J\u0019\u00104\u001a\u00020\u00042\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001bH&\u00a2\u0006\u0004\u00084\u0010 J\u000f\u00105\u001a\u00020\u0010H&\u00a2\u0006\u0004\u00085\u00106J\u000f\u00107\u001a\u00020\u0010H&\u00a2\u0006\u0004\u00087\u00106J\u0011\u00108\u001a\u0004\u0018\u00010+H&\u00a2\u0006\u0004\u00088\u00109J\u0019\u0010:\u001a\u00020\u00042\u0008\u0010,\u001a\u0004\u0018\u00010+H&\u00a2\u0006\u0004\u0008:\u0010.J\u0019\u0010;\u001a\u00020\u00042\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0014H&\u00a2\u0006\u0004\u0008;\u0010<JH\u0010C\u001a\u00020\u00042\u0006\u0010=\u001a\u00020\n2\u0006\u0010>\u001a\u00020\u000e2\u0008\u0008\u0002\u0010?\u001a\u00020\u00102\u0008\u0008\u0002\u0010@\u001a\u00020\u00102\u0008\u0008\u0002\u0010A\u001a\u00020\u00102\u0008\u0008\u0002\u0010B\u001a\u00020\u0010H\u00a6@\u00a2\u0006\u0004\u0008C\u0010DJ\u001d\u0010G\u001a\u00020\u00042\u000c\u0010F\u001a\u0008\u0012\u0004\u0012\u00020E0#H&\u00a2\u0006\u0004\u0008G\u0010\'J\u0017\u0010I\u001a\u00020\u00042\u0006\u0010H\u001a\u00020EH&\u00a2\u0006\u0004\u0008I\u0010JR\u0014\u0010M\u001a\u00020\u00148&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008K\u0010LR\u0014\u0010Q\u001a\u00020N8&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008O\u0010P\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u0006R\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;",
        "",
        "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
        "query",
        "Ll83/a0;",
        "updateStateFromDatabase",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;",
        "setPaginationDirection",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "onQueryChannelResult",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V",
        "",
        "limit",
        "",
        "userPresence",
        "watch",
        "(IZLq83/d;)Ljava/lang/Object;",
        "",
        "messageId",
        "loadAfter",
        "(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;",
        "loadBefore",
        "loadAround",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;",
        "message",
        "upsertMessage",
        "(Lio/getstream/chat/android/models/Message;)V",
        "updateLastMessageAt",
        "deleteMessage",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "members",
        "upsertMembers",
        "(Ljava/util/List;)V",
        "hidden",
        "setHidden",
        "(Z)V",
        "Ljava/util/Date;",
        "date",
        "hideMessagesBefore",
        "(Ljava/util/Date;)V",
        "removeMessagesBefore",
        "Lio/getstream/chat/android/models/PushPreference;",
        "preference",
        "setPushPreference",
        "(Lio/getstream/chat/android/models/PushPreference;)V",
        "setRepliedMessage",
        "markRead",
        "()Z",
        "typingEventsEnabled",
        "getLastStartTypingEvent",
        "()Ljava/util/Date;",
        "setLastStartTypingEvent",
        "setKeystrokeParentMessageId",
        "(Ljava/lang/String;)V",
        "channel",
        "messageLimit",
        "shouldRefreshMessages",
        "scrollUpdate",
        "isNotificationUpdate",
        "isChannelsStateUpdate",
        "updateDataForChannel",
        "(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "events",
        "handleEvents",
        "event",
        "handleEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "getCid",
        "()Ljava/lang/String;",
        "cid",
        "Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "getMessagesUpdateLogic",
        "()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;",
        "messagesUpdateLogic",
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


# direct methods
.method public static synthetic updateDataForChannel$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    if-nez p9, :cond_4

    and-int/lit8 p9, p8, 0x4

    const/4 v0, 0x0

    if-eqz p9, :cond_0

    move p3, v0

    :cond_0
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_1

    move p4, v0

    :cond_1
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_2

    move p5, v0

    :cond_2
    and-int/lit8 p8, p8, 0x20

    if-eqz p8, :cond_3

    move p6, v0

    :cond_3
    invoke-interface/range {p0 .. p7}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_4
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: updateDataForChannel"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic watch$default(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;IZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p5, :cond_1

    and-int/lit8 p4, p4, 0x1

    if-eqz p4, :cond_0

    const/16 p1, 0x1e

    :cond_0
    invoke-interface {p0, p1, p2, p3}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelLogic;->watch(IZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: watch"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public abstract deleteMessage(Lio/getstream/chat/android/models/Message;)V
.end method

.method public abstract getCid()Ljava/lang/String;
.end method

.method public abstract getLastStartTypingEvent()Ljava/util/Date;
.end method

.method public abstract getMessage(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;
.end method

.method public abstract getMessagesUpdateLogic()Lio/getstream/chat/android/client/channel/ChannelMessagesUpdateLogic;
.end method

.method public abstract handleEvent(Lio/getstream/chat/android/client/events/ChatEvent;)V
.end method

.method public abstract handleEvents(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Lio/getstream/chat/android/client/events/ChatEvent;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract hideMessagesBefore(Ljava/util/Date;)V
.end method

.method public abstract loadAfter(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract loadAround(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract loadBefore(Ljava/lang/String;ILq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract markRead()Z
.end method

.method public abstract onQueryChannelResult(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Ln23/h;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Ln23/h;",
            ")V"
        }
    .end annotation
.end method

.method public abstract removeMessagesBefore(Ljava/util/Date;)V
.end method

.method public abstract setHidden(Z)V
.end method

.method public abstract setKeystrokeParentMessageId(Ljava/lang/String;)V
.end method

.method public abstract setLastStartTypingEvent(Ljava/util/Date;)V
.end method

.method public abstract setPaginationDirection(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;)V
.end method

.method public abstract setPushPreference(Lio/getstream/chat/android/models/PushPreference;)V
.end method

.method public abstract setRepliedMessage(Lio/getstream/chat/android/models/Message;)V
.end method

.method public abstract typingEventsEnabled()Z
.end method

.method public abstract updateDataForChannel(Lio/getstream/chat/android/models/Channel;IZZZZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "IZZZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V
.end method

.method public abstract updateStateFromDatabase(Lio/getstream/chat/android/client/api/models/QueryChannelRequest;Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/api/models/QueryChannelRequest;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method

.method public abstract upsertMembers(Ljava/util/List;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)V"
        }
    .end annotation
.end method

.method public abstract upsertMessage(Lio/getstream/chat/android/models/Message;)V
.end method

.method public abstract watch(IZLq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IZ",
            "Lq83/d<",
            "-",
            "Ln23/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation
.end method
