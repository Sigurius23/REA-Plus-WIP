.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/state/ThreadState;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0010\"\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0015\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000e\u0010\u000cJ\u0017\u0010\u0011\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0013\u0010\u000cJ\u0017\u0010\u0014\u001a\u00020\n2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\u0004\u0008\u0014\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0015\u0010\u0012J\u001b\u0010\u0018\u001a\u00020\n2\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\n\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010 \u001a\u0004\u0008!\u0010\"R*\u0010%\u001a\u0016\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0$\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u001e\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\'\u0010&R\u001e\u0010(\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008(\u0010&R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0008\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008)\u0010&R \u0010*\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008*\u0010&R \u0010+\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0018\u00010#8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008+\u0010&R)\u0010-\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000f0$0,8\u0006\u00a2\u0006\u000c\n\u0004\u0008-\u0010.\u001a\u0004\u0008/\u00100R&\u0010\u0017\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000f0\u00160,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010.\u001a\u0004\u00081\u00100R \u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00080,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00082\u0010.\u001a\u0004\u00083\u00100R \u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00080,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00084\u0010.\u001a\u0004\u00085\u00100R \u00106\u001a\u0008\u0012\u0004\u0012\u00020\u00080,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00086\u0010.\u001a\u0004\u00087\u00100R\"\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u00088\u0010.\u001a\u0004\u00089\u00100R\"\u0010:\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0,8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008:\u0010.\u001a\u0004\u0008;\u00100R\u001a\u0010?\u001a\u0008\u0012\u0004\u0012\u00020\u00020<8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008=\u0010>R\u0013\u0010B\u001a\u0004\u0018\u00010\u000f8F\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010A\u00a8\u0006C"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "",
        "parentId",
        "Lbc3/c0;",
        "scope",
        "<init>",
        "(Ljava/lang/String;Lbc3/c0;)V",
        "",
        "isLoading",
        "Ll83/a0;",
        "setLoading",
        "(Z)V",
        "isEnd",
        "setEndOfOlderMessages",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "setOldestInThread",
        "(Lio/getstream/chat/android/models/Message;)V",
        "setEndOfNewerMessages",
        "setNewestInThread",
        "deleteMessage",
        "",
        "messages",
        "upsertMessages",
        "(Ljava/util/List;)V",
        "Lio/getstream/chat/android/models/Poll;",
        "poll",
        "updateParentMessagePoll",
        "(Lio/getstream/chat/android/models/Poll;)V",
        "destroy",
        "()V",
        "Ljava/lang/String;",
        "getParentId",
        "()Ljava/lang/String;",
        "Lec3/p1;",
        "",
        "_messages",
        "Lec3/p1;",
        "_loading",
        "_endOfOlderMessages",
        "_endOfNewerMessages",
        "_oldestInThread",
        "_newestInThread",
        "Lec3/f2;",
        "rawMessage",
        "Lec3/f2;",
        "getRawMessage",
        "()Lec3/f2;",
        "getMessages",
        "loading",
        "getLoading",
        "endOfOlderMessages",
        "getEndOfOlderMessages",
        "endOfNewerMessages",
        "getEndOfNewerMessages",
        "oldestInThread",
        "getOldestInThread",
        "newestInThread",
        "getNewestInThread",
        "",
        "getDeletedMessagesIds",
        "()Ljava/util/Set;",
        "deletedMessagesIds",
        "getParentMessage",
        "()Lio/getstream/chat/android/models/Message;",
        "parentMessage",
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
.field private _endOfNewerMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _endOfOlderMessages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _loading:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _messages:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _newestInThread:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _oldestInThread:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final endOfNewerMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final endOfOlderMessages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loading:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final messages:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final newestInThread:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final oldestInThread:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final parentId:Ljava/lang/String;

.field private final rawMessage:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lbc3/c0;)V
    .locals 2

    const-string v0, "parentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->parentId:Ljava/lang/String;

    sget-object p1, Lm83/z;->w:Lm83/z;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_loading:Lec3/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfOlderMessages:Lec3/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfNewerMessages:Lec3/p1;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_oldestInThread:Lec3/p1;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_newestInThread:Lec3/p1;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->rawMessage:Lec3/f2;

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState$special$$inlined$map$1;

    invoke-direct {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState$special$$inlined$map$1;-><init>(Lec3/l;)V

    new-instance p1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState$special$$inlined$map$2;

    invoke-direct {p1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState$special$$inlined$map$2;-><init>(Lec3/l;)V

    sget-object v0, Lec3/z1;->a:Lec3/b2;

    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {p1, p2, v0, v1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->messages:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_loading:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->loading:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfOlderMessages:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->endOfOlderMessages:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfNewerMessages:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->endOfNewerMessages:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_oldestInThread:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->oldestInThread:Lec3/f2;

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_newestInThread:Lec3/p1;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->newestInThread:Lec3/f2;

    return-void
.end method

.method private final getDeletedMessagesIds()Ljava/util/Set;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    if-eqz v0, :cond_4

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

    if-eqz v0, :cond_4

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Message;

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    goto :goto_1

    :cond_1
    move-object v2, v4

    :goto_1
    if-eqz v2, :cond_2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    :cond_2
    if-eqz v4, :cond_0

    invoke-interface {v1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    return-object v0

    :cond_4
    sget-object v0, Lm83/a0;->w:Lm83/a0;

    return-object v0
.end method


# virtual methods
.method public final deleteMessage(Lio/getstream/chat/android/models/Message;)V
    .locals 2

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lm83/g0;->Z(Ljava/lang/Object;Ljava/util/Map;)Ljava/util/Map;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_loading:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfOlderMessages:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_oldestInThread:Lec3/p1;

    return-void
.end method

.method public final getEndOfNewerMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->endOfNewerMessages:Lec3/f2;

    return-object v0
.end method

.method public final getEndOfOlderMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->endOfOlderMessages:Lec3/f2;

    return-object v0
.end method

.method public final getLoading()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->loading:Lec3/f2;

    return-object v0
.end method

.method public final getMessages()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->messages:Lec3/f2;

    return-object v0
.end method

.method public final getNewestInThread()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->newestInThread:Lec3/f2;

    return-object v0
.end method

.method public final getOldestInThread()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->oldestInThread:Lec3/f2;

    return-object v0
.end method

.method public final getParentId()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->parentId:Ljava/lang/String;

    return-object v0
.end method

.method public final getParentMessage()Lio/getstream/chat/android/models/Message;
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->parentId:Ljava/lang/String;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRawMessage()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->rawMessage:Lec3/f2;

    return-object v0
.end method

.method public final setEndOfNewerMessages(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfNewerMessages:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setEndOfOlderMessages(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_endOfOlderMessages:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoading(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_loading:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setNewestInThread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_newestInThread:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final setOldestInThread(Lio/getstream/chat/android/models/Message;)V
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_oldestInThread:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public final updateParentMessagePoll(Lio/getstream/chat/android/models/Poll;)V
    .locals 53

    invoke-virtual/range {p0 .. p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getParentMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    if-eqz p1, :cond_3

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Poll;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    return-void

    :cond_3
    :goto_1
    const v51, 0xfbff

    const/16 v52, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    move-object/from16 v44, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object/from16 v1, p0

    invoke-virtual {v1, v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->upsertMessages(Ljava/util/List;)V

    return-void
.end method

.method public final upsertMessages(Ljava/util/List;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Message;",
            ">;)V"
        }
    .end annotation

    const-string v0, "messages"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->_messages:Lec3/p1;

    if-eqz v0, :cond_2

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map;

    check-cast p1, Ljava/lang/Iterable;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_0

    move v2, v3

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->getDeletedMessagesIds()Ljava/util/Set;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {v3, p1}, Lm83/g0;->a0(Ljava/util/Map;Ljava/lang/Iterable;)Ljava/util/Map;

    move-result-object p1

    invoke-static {v1, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p1

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_2
    return-void
.end method
