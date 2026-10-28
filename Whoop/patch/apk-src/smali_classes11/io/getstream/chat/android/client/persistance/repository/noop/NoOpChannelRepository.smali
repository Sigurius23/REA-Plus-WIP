.class public final Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u001e\u0010\u000b\u001a\u00020\u00062\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00040\tH\u0096@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0018\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\"\u0010\u0016\u001a\u00020\u00062\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0015\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u0008\u0018\u0010\u0014J\u0016\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ$\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00192\u000c\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\r0\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001a\u0010\u001f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u0008\u001f\u0010\u0010J\u001e\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00192\u0006\u0010!\u001a\u00020 H\u0096@\u00a2\u0006\u0004\u0008\"\u0010#J\u001e\u0010$\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00192\u0006\u0010!\u001a\u00020 H\u0096@\u00a2\u0006\u0004\u0008$\u0010#J \u0010\'\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010&\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J(\u0010,\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020%H\u0096@\u00a2\u0006\u0004\u0008,\u0010-J \u0010,\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010*\u001a\u00020)H\u0096@\u00a2\u0006\u0004\u0008,\u0010.J\u001e\u00100\u001a\u0008\u0012\u0004\u0012\u00020/0\u00192\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u00080\u0010\u0010J&\u00102\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020/0\u0019H\u0096@\u00a2\u0006\u0004\u00082\u00103J \u00105\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u00104\u001a\u00020\u0011H\u0096@\u00a2\u0006\u0004\u00085\u00106J\u0018\u00107\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0096@\u00a2\u0006\u0004\u00087\u0010\u0010J\u0010\u00108\u001a\u00020\u0006H\u0096@\u00a2\u0006\u0004\u00088\u0010\u001b\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "<init>",
        "()V",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Ll83/a0;",
        "insertChannel",
        "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;",
        "",
        "channels",
        "insertChannels",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "",
        "cid",
        "deleteChannel",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "deleteChannelMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "userId",
        "deleteAllChannelUserMessages",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "updateChannelMessage",
        "",
        "selectAllCids",
        "(Lq83/d;)Ljava/lang/Object;",
        "channelCIDs",
        "selectChannels",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "selectChannel",
        "",
        "limit",
        "selectChannelCidsBySyncNeeded",
        "(ILq83/d;)Ljava/lang/Object;",
        "selectChannelsSyncNeeded",
        "Ljava/util/Date;",
        "deletedAt",
        "setChannelDeletedAt",
        "(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "",
        "hidden",
        "hideMessagesBefore",
        "setHiddenForChannel",
        "(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "Lio/getstream/chat/android/models/Member;",
        "selectMembersForChannel",
        "members",
        "updateMembersForChannel",
        "(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "lastMessage",
        "updateLastMessageForChannel",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "evictChannel",
        "clear",
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


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;->INSTANCE:Lio/getstream/chat/android/client/persistance/repository/noop/NoOpChannelRepository;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 0
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

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Channel;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final selectAllCids(Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 p1, 0x0

    return-object p1
.end method

.method public final selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljava/util/Date;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Message;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
