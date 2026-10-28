.class public final Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0002\u0008\u000e\n\u0002\u0010 \n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u0011\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u00a1\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\"\u0010\u000b\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012$\u0010\u000f\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006\u0012\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u0010\u0012\u0008\u0008\u0002\u0010\u0014\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001e\u0010\u001e\u001a\u00020\u00192\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001cH\u0096@\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0018\u0010!\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008!\u0010\"J\u0018\u0010$\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008$\u0010%J\"\u0010\'\u001a\u00020\u00192\u0008\u0010 \u001a\u0004\u0018\u00010\u00072\u0006\u0010&\u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008\'\u0010(J\u0018\u0010)\u001a\u00020\u00192\u0006\u0010#\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008)\u0010%J\u001a\u0010*\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008*\u0010\"J$\u0010-\u001a\u0008\u0012\u0004\u0012\u00020\u00170+2\u000c\u0010,\u001a\u0008\u0012\u0004\u0012\u00020\u00070+H\u0096@\u00a2\u0006\u0004\u0008-\u0010.J\u0016\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00070+H\u0096@\u00a2\u0006\u0004\u0008/\u00100J\u001e\u00102\u001a\u0008\u0012\u0004\u0012\u00020\u00070+2\u0006\u00101\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u00082\u00103J\u001e\u00104\u001a\u0008\u0012\u0004\u0012\u00020\u00170+2\u0006\u00101\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u00084\u00103J \u00107\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u00106\u001a\u000205H\u0096@\u00a2\u0006\u0004\u00087\u00108J(\u0010<\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010:\u001a\u0002092\u0006\u0010;\u001a\u000205H\u0096@\u00a2\u0006\u0004\u0008<\u0010=J \u0010<\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010:\u001a\u000209H\u0096@\u00a2\u0006\u0004\u0008<\u0010>J\u001e\u0010@\u001a\u0008\u0012\u0004\u0012\u00020?0+2\u0006\u0010 \u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008@\u0010\"J&\u0010B\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u000c\u0010A\u001a\u0008\u0012\u0004\u0012\u00020?0+H\u0096@\u00a2\u0006\u0004\u0008B\u0010CJ \u0010E\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u000cH\u0096@\u00a2\u0006\u0004\u0008E\u0010FJ\u0018\u0010G\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0096@\u00a2\u0006\u0004\u0008G\u0010\"J\u0010\u0010H\u001a\u00020\u0019H\u0096@\u00a2\u0006\u0004\u0008H\u00100J#\u0010J\u001a\u00020\u00192\u0012\u0010\u001d\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00170I\"\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008J\u0010KJ\u001d\u0010J\u001a\u00020\u00192\u000c\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00170\u001cH\u0002\u00a2\u0006\u0004\u0008J\u0010LJ\u0017\u0010M\u001a\u00020\u00192\u0006\u0010&\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008M\u0010NJ\u001f\u0010\'\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\'\u0010OJ\u001b\u0010Q\u001a\u00020\u0017*\u00020\u00172\u0006\u0010P\u001a\u00020\u0017H\u0002\u00a2\u0006\u0004\u0008Q\u0010RJ\u001d\u0010T\u001a\u000209*\u00020\u000c2\u0008\u0010S\u001a\u0004\u0018\u000105H\u0002\u00a2\u0006\u0004\u0008T\u0010UJ\u0017\u0010V\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008V\u0010NR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010WR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010XR0\u0010\u000b\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010YR2\u0010\r\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000c0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010YR2\u0010\u000f\u001a \u0008\u0001\u0012\u0004\u0012\u00020\u0007\u0012\u000c\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u0008\u0012\u0006\u0012\u0004\u0018\u00010\n0\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010YR\u001a\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010ZR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\\\u0010]\u001a\u0004\u0008^\u0010_R \u0010b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00170a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008b\u0010cR\u0014\u0010e\u001a\u00020d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010f\u00a8\u0006g"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "channelDao",
        "Lkotlin/Function2;",
        "",
        "Lq83/d;",
        "Lio/getstream/chat/android/models/User;",
        "",
        "getUser",
        "Lio/getstream/chat/android/models/Message;",
        "getMessage",
        "Lio/getstream/chat/android/models/DraftMessage;",
        "getDraftMessage",
        "Lkotlin/Function0;",
        "",
        "now",
        "",
        "cacheSize",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;I)V",
        "Lio/getstream/chat/android/models/Channel;",
        "channel",
        "Ll83/a0;",
        "insertChannel",
        "(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;",
        "",
        "channels",
        "insertChannels",
        "(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;",
        "cid",
        "deleteChannel",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "message",
        "deleteChannelMessage",
        "(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;",
        "userId",
        "deleteAllChannelUserMessages",
        "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "updateChannelMessage",
        "selectChannel",
        "",
        "channelCIDs",
        "selectChannels",
        "(Ljava/util/List;Lq83/d;)Ljava/lang/Object;",
        "selectAllCids",
        "(Lq83/d;)Ljava/lang/Object;",
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
        "",
        "cacheChannel",
        "([Lio/getstream/chat/android/models/Channel;)V",
        "(Ljava/util/Collection;)V",
        "deleteAllUserMessages",
        "(Ljava/lang/String;)V",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "cachedChannel",
        "combine",
        "(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;",
        "date",
        "after",
        "(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z",
        "removeFromCache",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
        "Lc93/m;",
        "Lc93/a;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Landroid/util/LruCache;",
        "channelCache",
        "Landroid/util/LruCache;",
        "Lmc3/a;",
        "dbMutex",
        "Lmc3/a;",
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
.field private final channelCache:Landroid/util/LruCache;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/LruCache<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation
.end field

.field private final channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

.field private final dbMutex:Lmc3/a;

.field private final getDraftMessage:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getMessage:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final getUser:Lc93/m;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/m;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/m;",
            "Lc93/a;",
            "I)V"
        }
    .end annotation

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelDao"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getUser"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getMessage"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getDraftMessage"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getUser:Lc93/m;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getMessage:Lc93/m;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getDraftMessage:Lc93/m;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->now:Lc93/a;

    .line 8
    const-string p1, "Chat:ChannelRepository"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->logger$delegate:Ll83/h;

    .line 9
    new-instance p1, Landroid/util/LruCache;

    invoke-direct {p1, p7}, Landroid/util/LruCache;-><init>(I)V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    .line 10
    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    return-void
.end method

.method public synthetic constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 10

    and-int/lit8 v0, p8, 0x20

    if-eqz v0, :cond_0

    .line 11
    new-instance v0, Lio/getstream/chat/android/client/k;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/k;-><init>(I)V

    move-object v8, v0

    goto :goto_0

    :cond_0
    move-object/from16 v8, p6

    :goto_0
    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_1

    const/16 v0, 0x3e8

    move v9, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object v6, p4

    move-object v7, p5

    goto :goto_2

    :cond_1
    move/from16 v9, p7

    goto :goto_1

    .line 12
    :goto_2
    invoke-direct/range {v2 .. v9}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;-><init>(Lbc3/c0;Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lc93/m;Lc93/m;Lc93/m;Lc93/a;I)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static final synthetic access$getChannelDao$p(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final after(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z
    .locals 1

    if-eqz p2, :cond_0

    invoke-static {}, Lio/getstream/chat/android/client/extensions/internal/MessageKt;->getNEVER()Ljava/util/Date;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/client/extensions/MessageExtensionsKt;->getCreatedAtOrDefault(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Ljava/util/Date;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p1

    return p1

    :cond_0
    const/4 p1, 0x1

    return p1
.end method

.method private final cacheChannel(Ljava/util/Collection;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/Iterable;

    .line 2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Channel;

    .line 3
    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2, v0}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final varargs cacheChannel([Lio/getstream/chat/android/models/Channel;)V
    .locals 5

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    .line 5
    iget-object v3, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Landroid/util/LruCache;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private final combine(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;
    .locals 41

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Channel;->getHiddenMessagesBefore()Ljava/util/Date;

    move-result-object v2

    filled-new-array {v1, v2}, [Ljava/util/Date;

    move-result-object v1

    invoke-static {v1}, Lio/getstream/chat/android/core/utils/date/DateUtils;->minOf([Ljava/util/Date;)Ljava/util/Date;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-direct {v0, v5, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->after(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-direct {v0, v6, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->after(Lio/getstream/chat/android/models/Message;Ljava/util/Date;)Z

    move-result v6

    if-eqz v6, :cond_2

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    invoke-static {v3, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$combine$$inlined$sortedBy$1;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    invoke-static {v4, v2}, Lm83/s;->u1(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    move-result-object v14

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/util/Collection;

    invoke-virtual/range {p2 .. p2}, Lio/getstream/chat/android/models/Channel;->getRead()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v2

    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_6
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/ChannelUserRead;

    invoke-virtual {v6}, Lio/getstream/chat/android/models/ChannelUserRead;->getUserId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v3, v6}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v15

    const/16 v39, 0x7

    const/16 v40, 0x0

    const/4 v3, 0x0

    move-object/from16 v17, v4

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

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

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

    const v38, -0x105801

    move-object/from16 v2, p1

    move-object/from16 v23, v1

    invoke-static/range {v2 .. v40}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    const/4 v2, 0x1

    invoke-static {v1, v3, v2, v3}, Lio/getstream/chat/android/client/extensions/ChannelExtensionKt;->syncUnreadCountWithReads$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    return-object v1
.end method

.method private final deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;)V
    .locals 42

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    .line 4
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    move-object/from16 v3, p1

    invoke-virtual {v2, v3}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    if-eqz v3, :cond_4

    .line 5
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 6
    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    .line 7
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    .line 8
    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_0

    .line 9
    invoke-interface {v15, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 11
    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 12
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Lio/getstream/chat/android/models/Message;

    .line 13
    invoke-virtual {v6}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v6

    invoke-virtual {v6}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 14
    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_3
    const/16 v40, 0x7

    const/16 v41, 0x0

    move-object/from16 v27, v4

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

    const v39, -0x800801

    .line 15
    invoke-static/range {v3 .. v41}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    .line 16
    filled-new-array {v1}, [Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel([Lio/getstream/chat/android/models/Channel;)V

    :cond_4
    return-void
.end method

.method private final deleteAllUserMessages(Ljava/lang/String;)V
    .locals 5

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v0}, Landroid/util/LruCache;->snapshot()Ljava/util/Map;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v0

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

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_1

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_0

    :cond_1
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v4

    invoke-virtual {v4}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-direct {p0, v1, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final removeFromCache(Ljava/lang/String;)V
    .locals 5

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[removeFromCache] cid: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x0

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v0, p1}, Landroid/util/LruCache;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final clear(Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;

    invoke-direct {v0, p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->label:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget-object v0, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->I$0:I

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->L$0:Ljava/lang/Object;

    check-cast v5, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v5

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->I$0:I

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->label:I

    invoke-interface {p1, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_2

    :cond_4
    move v2, v3

    :goto_1
    :try_start_1
    iget-object v5, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    iput-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->L$0:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->I$0:I

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->I$1:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$clear$1;->label:I

    invoke-interface {v5, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->deleteAll(Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne v0, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    move-object v0, p1

    :goto_3
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :catchall_1
    move-exception v0

    move-object v7, v0

    move-object v0, p1

    move-object p1, v7

    :goto_4
    invoke-interface {v0, v6}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
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

    if-eqz p1, :cond_0

    .line 1
    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->deleteAllChannelUserMessages(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    .line 2
    :cond_0
    invoke-direct {p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->deleteAllUserMessages(Ljava/lang/String;)V

    .line 3
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v1, v0, Lb23/k;->c:Lb23/e;

    sget-object v2, Lb23/g;->x:Lb23/g;

    iget-object v3, v0, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v1, v2, v3}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    const/4 v4, 0x0

    if-eqz v1, :cond_0

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v1, "[deleteChannel] cid: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v2, v3, v1, v4}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->removeFromCache(Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$deleteChannel$3;

    invoke-direct {v2, p0, p1, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$deleteChannel$3;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, v2, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_1

    return-object p1

    :cond_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final deleteChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 41
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

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v5

    const-string v6, "[deleteChannelMessage] message.id: "

    const-string v7, ", message.text: "

    invoke-static {v6, v2, v7, v5}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    const/4 v5, 0x0

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1

    invoke-virtual {v14, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v2}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    const/16 v39, 0x7

    const/16 v40, 0x0

    move-object/from16 v26, v3

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

    const v38, -0x800801

    invoke-static/range {v2 .. v40}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    filled-new-array {v1}, [Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel([Lio/getstream/chat/android/models/Channel;)V

    :cond_5
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final evictChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object p2

    iget-object v0, p2, Lb23/k;->c:Lb23/e;

    sget-object v1, Lb23/g;->x:Lb23/g;

    iget-object v2, p2, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v0, v1, v2}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p2, p2, Lb23/k;->b:Lb23/j;

    const-string v0, "[evictChannel] cid: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    invoke-interface {p2, v1, v2, v0, v3}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->removeFromCache(Ljava/lang/String;)V

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

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final insertChannels(Ljava/util/Collection;Lq83/d;)Ljava/lang/Object;
    .locals 8
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

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_0

    return-object v1

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Channel;

    if-eqz v4, :cond_2

    invoke-direct {p0, v3, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->combine(Lio/getstream/chat/android/models/Channel;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/models/Channel;

    move-result-object v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    move-object v3, v4

    :cond_2
    :goto_1
    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lio/getstream/chat/android/models/Channel;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    invoke-static {v6, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-interface {p1, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance v3, Ljava/util/ArrayList;

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_6

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lio/getstream/chat/android/models/Channel;

    invoke-static {v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt;->toEntity(Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-direct {p0, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel(Ljava/util/Collection;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    new-instance v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;

    const/4 v5, 0x0

    invoke-direct {v4, p0, v3, v0, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$insertChannels$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/util/List;Ljava/util/List;Lq83/d;)V

    invoke-static {p1, v2, v4, p2}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_7

    return-object p1

    :cond_7
    return-object v1
.end method

.method public final selectAllCids(Lq83/d;)Ljava/lang/Object;
    .locals 1
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->selectAllCids(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 6
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {p2, p1}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-nez p2, :cond_7

    iget-object p2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->L$0:Ljava/lang/Object;

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->label:I

    invoke-interface {p2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->select(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    if-eqz p2, :cond_6

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getUser:Lc93/m;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getMessage:Lc93/m;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getDraftMessage:Lc93/m;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannel$1;->label:I

    invoke-static {p2, p1, v2, v4, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-eqz p2, :cond_6

    filled-new-array {p2}, [Lio/getstream/chat/android/models/Channel;

    move-result-object p1

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel([Lio/getstream/chat/android/models/Channel;)V

    return-object p2

    :cond_6
    return-object v5

    :cond_7
    return-object p2
.end method

.method public final selectChannelCidsBySyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 6
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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move v2, p1

    move-object v3, p2

    invoke-static/range {v0 .. v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->selectCidsBySyncNeeded$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 13
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->label:I

    const/16 v3, 0xa

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    iget p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->I$1:I

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->I$0:I

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$10:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$9:Ljava/lang/Object;

    check-cast v5, Ljava/util/Collection;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$8:Ljava/lang/Object;

    check-cast v8, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    iget-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$6:Ljava/lang/Object;

    check-cast v8, Ljava/util/Iterator;

    iget-object v9, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$5:Ljava/lang/Object;

    check-cast v9, Ljava/util/Collection;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$4:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$3:Ljava/lang/Object;

    check-cast v10, Ljava/lang/Iterable;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$2:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$1:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    iget-object v10, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$0:Ljava/lang/Object;

    check-cast v10, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$3:Ljava/lang/Object;

    check-cast p1, Ljava/util/Collection;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$2:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/util/List;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ljava/lang/Iterable;

    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_4
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual {v9, v8}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lio/getstream/chat/android/models/Channel;

    if-eqz v8, :cond_4

    invoke-virtual {p2, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v2, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_2
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lio/getstream/chat/android/models/Channel;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    invoke-static {v2}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lm83/s;->c1(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p1

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$2:Ljava/lang/Object;

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$3:Ljava/lang/Object;

    iput v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->label:I

    invoke-interface {v2, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->select(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    move-object v12, p2

    move-object p2, p1

    move-object p1, v12

    :goto_3
    check-cast p2, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move-object v5, p1

    move-object v8, p2

    move-object v3, v2

    move p1, v6

    move v2, p1

    :goto_4
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getUser:Lc93/m;

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getMessage:Lc93/m;

    iget-object v11, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getDraftMessage:Lc93/m;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$0:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$1:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$2:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$3:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$4:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$5:Ljava/lang/Object;

    iput-object v8, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$6:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$7:Ljava/lang/Object;

    iput-object v7, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$8:Ljava/lang/Object;

    iput-object v5, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$9:Ljava/lang/Object;

    iput-object v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->L$10:Ljava/lang/Object;

    iput v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->I$0:I

    iput p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->I$1:I

    iput v6, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->I$2:I

    iput v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannels$1;->label:I

    invoke-static {p2, v9, v10, v11, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_5
    return-object v1

    :cond_8
    move-object v9, v3

    :goto_6
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-interface {v3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v3, v9

    goto :goto_4

    :cond_9
    check-cast v3, Ljava/util/List;

    move-object p1, v3

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel(Ljava/util/Collection;)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v5, v3}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method public final selectChannelsSyncNeeded(ILq83/d;)Ljava/lang/Object;
    .locals 12
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->label:I

    :goto_0
    move-object v4, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->result:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->label:I

    const/4 v7, 0x2

    const/4 v2, 0x1

    const/4 v8, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v2, :cond_2

    if-ne v1, v7, :cond_1

    iget p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$2:I

    iget v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$1:I

    iget v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$0:I

    iget-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$6:Ljava/lang/Object;

    check-cast v3, Ljava/util/Collection;

    iget-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$5:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    iget-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/util/Iterator;

    iget-object v6, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$2:Ljava/lang/Object;

    check-cast v6, Ljava/util/Collection;

    iget-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    iget-object v9, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Iterable;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$0:I

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelDao:Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;

    iput p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$0:I

    iput v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->label:I

    const/4 v2, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    move v3, p1

    invoke-static/range {v1 .. v6}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;->selectSyncNeeded$default(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelDao;Lio/getstream/chat/android/models/SyncStatus;ILq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_4

    goto :goto_4

    :cond_4
    move p1, v3

    :goto_2
    check-cast p2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p2, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    move v2, p1

    move-object v5, p2

    move-object v3, v1

    move p1, v8

    move v1, p1

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;

    iget-object v6, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getUser:Lc93/m;

    iget-object v9, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getMessage:Lc93/m;

    iget-object v10, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getDraftMessage:Lc93/m;

    const/4 v11, 0x0

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$0:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$1:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$2:Ljava/lang/Object;

    iput-object v5, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$3:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$4:Ljava/lang/Object;

    iput-object v11, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$5:Ljava/lang/Object;

    iput-object v3, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->L$6:Ljava/lang/Object;

    iput v2, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$0:I

    iput v1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$1:I

    iput p1, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$2:I

    iput v8, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->I$3:I

    iput v7, v4, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectChannelsSyncNeeded$1;->label:I

    invoke-static {p2, v6, v9, v10, v4}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelMapperKt;->toModel(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/ChannelEntity;Lc93/m;Lc93/m;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    :goto_4
    return-object v0

    :cond_5
    move-object v6, v3

    :goto_5
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    invoke-interface {v3, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move-object v3, v6

    goto :goto_3

    :cond_6
    check-cast v3, Ljava/util/List;

    return-object v3
.end method

.method public final selectMembersForChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    instance-of v0, p2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;

    iget v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;

    invoke-direct {v0, p0, p2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p2, 0x0

    iput-object p2, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->L$0:Ljava/lang/Object;

    iput v3, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$selectMembersForChannel$1;->label:I

    invoke-virtual {p0, p1, v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lio/getstream/chat/android/models/Channel;

    if-eqz p2, :cond_5

    invoke-virtual {p2}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    return-object p1

    :cond_5
    :goto_2
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final setChannelDeletedAt(Ljava/lang/String;Ljava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 4
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

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->removeFromCache(Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setChannelDeletedAt$2;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, p2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setChannelDeletedAt$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/lang/String;Ljava/util/Date;Lq83/d;)V

    invoke-static {v0, v1, v2, p3}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLjava/util/Date;Lq83/d;)Ljava/lang/Object;
    .locals 8
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
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->removeFromCache(Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setHiddenForChannel$2;

    const/4 v7, 0x0

    move-object v3, p0

    move-object v4, p1

    move v5, p2

    move-object v6, p3

    invoke-direct/range {v2 .. v7}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setHiddenForChannel$2;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/lang/String;ZLjava/util/Date;Lq83/d;)V

    invoke-static {v0, v1, v2, p4}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final setHiddenForChannel(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 4
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

    .line 3
    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->removeFromCache(Ljava/lang/String;)V

    .line 4
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->scope:Lbc3/c0;

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->dbMutex:Lmc3/a;

    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setHiddenForChannel$4;

    const/4 v3, 0x0

    invoke-direct {v2, p0, p1, p2, v3}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$setHiddenForChannel$4;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Ljava/lang/String;ZLq83/d;)V

    invoke-static {v0, v1, v2, p3}, Lio/getstream/chat/android/client/internal/offline/extensions/CoroutineScopeExtensionsKt;->launchWithMutex(Lbc3/c0;Lmc3/a;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public final updateChannelMessage(Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 45
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

    move-object/from16 v0, p0

    invoke-direct {v0}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->getLogger()Lb23/k;

    move-result-object v1

    iget-object v2, v1, Lb23/k;->c:Lb23/e;

    sget-object v3, Lb23/g;->x:Lb23/g;

    iget-object v4, v1, Lb23/k;->a:Ljava/lang/String;

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    const/4 v5, 0x0

    if-eqz v2, :cond_0

    iget-object v1, v1, Lb23/k;->b:Lb23/j;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getText()Ljava/lang/String;

    move-result-object v6

    const-string v7, "[updateChannelMessage] message.id: "

    const-string v8, ", message.text: "

    invoke-static {v7, v2, v8, v6}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v3, v4, v2, v5}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->channelCache:Landroid/util/LruCache;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getCid()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/models/Channel;

    if-eqz v6, :cond_8

    invoke-virtual {v6}, Lio/getstream/chat/android/models/Channel;->getMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object/from16 v3, p1

    :cond_1
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-virtual {v6}, Lio/getstream/chat/android/models/Channel;->getPinnedMessages()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_7

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lio/getstream/chat/android/models/Message;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    const/4 v8, 0x1

    if-ne v7, v8, :cond_6

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->now:Lc93/a;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v7

    if-nez v7, :cond_5

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Ljava/util/Date;->getTime()J

    move-result-wide v7

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    move-result-wide v9

    cmp-long v4, v7, v9

    if-gez v4, :cond_4

    goto :goto_2

    :cond_4
    move-object/from16 v4, p1

    goto :goto_3

    :cond_5
    :goto_2
    move-object v4, v5

    :cond_6
    :goto_3
    if-eqz v4, :cond_3

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_7
    const/16 v43, 0x7

    const/16 v44, 0x0

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

    const v42, -0x800801

    move-object/from16 v18, v2

    move-object/from16 v30, v3

    invoke-static/range {v6 .. v44}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    filled-new-array {v1}, [Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->cacheChannel([Lio/getstream/chat/android/models/Channel;)V

    :cond_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final updateLastMessageForChannel(Ljava/lang/String;Lio/getstream/chat/android/models/Message;Lq83/d;)Ljava/lang/Object;
    .locals 48
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

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Message;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v4, Lio/getstream/chat/android/models/Message;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v47, v4

    move-object v4, v1

    move-object/from16 v1, v47

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->label:I

    move-object/from16 v4, p1

    invoke-virtual {v0, v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    move-object v8, v4

    check-cast v8, Lio/getstream/chat/android/models/Channel;

    if-eqz v8, :cond_5

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v45, 0x7

    const/16 v46, 0x0

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

    const/16 v44, -0x801

    invoke-static/range {v8 .. v46}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateLastMessageForChannel$1;->label:I

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    :goto_2
    return-object v3

    :cond_5
    :goto_3
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final updateMembersForChannel(Ljava/lang/String;Ljava/util/List;Lq83/d;)Ljava/lang/Object;
    .locals 48
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

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;-><init>(Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->label:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$2:Ljava/lang/Object;

    check-cast v3, Lio/getstream/chat/android/models/Channel;

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/List;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/util/List;

    iget-object v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v47, v4

    move-object v4, v1

    move-object/from16 v1, v47

    goto :goto_1

    :cond_3
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    move-object/from16 v1, p2

    iput-object v1, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    iput v6, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->label:I

    move-object/from16 v4, p1

    invoke-virtual {v0, v4, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->selectChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_4

    goto/16 :goto_3

    :cond_4
    :goto_1
    move-object v8, v4

    check-cast v8, Lio/getstream/chat/android/models/Channel;

    if-eqz v8, :cond_7

    check-cast v1, Ljava/util/Collection;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v1, v4}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4}, Ljava/util/HashSet;-><init>()V

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    move-object v10, v9

    check-cast v10, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v10}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v4, v10}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_5

    invoke-virtual {v6, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_6
    const/16 v45, 0x7

    const/16 v46, 0x0

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

    const/16 v44, -0x1001

    move-object/from16 v21, v6

    invoke-static/range {v8 .. v46}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$1:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->L$2:Ljava/lang/Object;

    const/4 v4, 0x0

    iput v4, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->I$0:I

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository$updateMembersForChannel$1;->label:I

    invoke-virtual {v0, v1, v2}, Lio/getstream/chat/android/client/internal/offline/repository/domain/channel/internal/DatabaseChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_7

    :goto_3
    return-object v3

    :cond_7
    :goto_4
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method
