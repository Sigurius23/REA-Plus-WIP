.class public interface abstract Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;
    }
.end annotation

.annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010 \n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008g\u0018\u0000 72\u00020\u0001:\u00017J\u0018\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u00a6@\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001e\u0010\t\u001a\u00020\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0007H\u00a6@\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0018\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\"\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0013\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u0008\u0016\u0010\u0012J\u0016\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0017H\u00a6@\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J$\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00172\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0017H\u00a6@\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008\u001d\u0010\u000eJ \u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00172\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u00a6@\u00a2\u0006\u0004\u0008 \u0010!J \u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u00172\u0008\u0008\u0002\u0010\u001f\u001a\u00020\u001eH\u00a6@\u00a2\u0006\u0004\u0008\"\u0010!J \u0010%\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020#H\u00a6@\u00a2\u0006\u0004\u0008%\u0010&J(\u0010*\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\'2\u0006\u0010)\u001a\u00020#H\u00a6@\u00a2\u0006\u0004\u0008*\u0010+J \u0010*\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\'H\u00a6@\u00a2\u0006\u0004\u0008*\u0010,J\u001e\u0010.\u001a\u0008\u0012\u0004\u0012\u00020-0\u00172\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u0008.\u0010\u000eJ&\u00100\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010/\u001a\u0008\u0012\u0004\u0012\u00020-0\u0017H\u00a6@\u00a2\u0006\u0004\u00080\u00101J \u00103\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u00102\u001a\u00020\u000fH\u00a6@\u00a2\u0006\u0004\u00083\u00104J\u0018\u00105\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u000bH\u00a6@\u00a2\u0006\u0004\u00085\u0010\u000eJ\u0010\u00106\u001a\u00020\u0004H\u00a6@\u00a2\u0006\u0004\u00086\u0010\u0019\u00f8\u0001\u0000\u0082\u0002\u0006\n\u0004\u0008!0\u0001\u00a8\u00068\u00c0\u0006\u0001"
    }
    d2 = {
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "",
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
        "Companion",
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
.field public static final synthetic Companion:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;->$$INSTANCE:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;

    sput-object v0, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->Companion:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository$Companion;

    return-void
.end method

.method public static synthetic selectChannelCidsBySyncNeeded$default(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, -0x1

    :cond_0
    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectChannelCidsBySyncNeeded"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static synthetic selectChannelsSyncNeeded$default(Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    if-nez p4, :cond_1

    and-int/lit8 p3, p3, 0x1

    if-eqz p3, :cond_0

    const/4 p1, -0x1

    :cond_0
    invoke-interface {p0, p1, p2}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Super calls with default arguments not supported in this target, function: selectChannelsSyncNeeded"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


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

.method public abstract deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectAllCids(Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
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
.end method

.method public abstract updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
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
.end method
