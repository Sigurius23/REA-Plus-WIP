.class public final Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/api/state/QueryChannelsState;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a0\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0010\"\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u000f\n\u0002\u0018\u0002\n\u0002\u0008\u0013\u0008\u0000\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0018\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\u000c0\u000b\u0012\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00110\u00100\u000b\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0015\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b\u00a2\u0006\u0004\u0008 \u0010\u001fJ\u0015\u0010#\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020!\u00a2\u0006\u0004\u0008#\u0010$J\u0015\u0010&\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u001b\u00a2\u0006\u0004\u0008&\u0010\u001fJ\u0015\u0010(\u001a\u00020\u001d2\u0006\u0010\'\u001a\u00020\u001b\u00a2\u0006\u0004\u0008(\u0010\u001fJ\u0015\u0010+\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020)\u00a2\u0006\u0004\u0008+\u0010,J!\u0010.\u001a\u00020\u001d2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000c\u00a2\u0006\u0004\u0008.\u0010/J#\u00102\u001a\u00020\u001d2\u0006\u00100\u001a\u00020\u00042\u000c\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0004\u00082\u00103J\u001b\u00106\u001a\u00020\u001d2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\r04\u00a2\u0006\u0004\u00086\u00107J\r\u00108\u001a\u00020\u001d\u00a2\u0006\u0004\u00088\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010:\u001a\u0004\u0008;\u0010<R\u001a\u0010>\u001a\u0008\u0012\u0004\u0012\u00020\u00040=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008>\u0010?R \u0010@\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00070\u00060=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008@\u0010?R\u0016\u0010B\u001a\u00020A8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008B\u0010CR,\u0010D\u001a\u0018\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000c\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008D\u0010?R(\u0010E\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000c0\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008E\u0010FR\u001e\u0010G\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008G\u0010?R\u001e\u0010H\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010?R\u001e\u0010I\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008I\u0010?R\"\u0010J\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00100\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008J\u0010FR \u0010K\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010!\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008K\u0010?R\u001e\u0010L\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008L\u0010?R\u001e\u0010M\u001a\n\u0012\u0004\u0012\u00020)\u0018\u00010=8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010?R \u0010N\u001a\u0008\u0012\u0004\u0012\u00020)0\u000b8\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008N\u0010F\u001a\u0004\u0008O\u0010PR$\u0010R\u001a\u0004\u0018\u00010Q8\u0016@\u0016X\u0096\u000e\u00a2\u0006\u0012\n\u0004\u0008R\u0010S\u001a\u0004\u0008T\u0010U\"\u0004\u0008V\u0010WR \u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\'\u0010F\u001a\u0004\u0008X\u0010PR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]R\"\u0010_\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008_\u0010F\u001a\u0004\u0008`\u0010PR \u0010a\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008a\u0010F\u001a\u0004\u0008b\u0010PR \u0010c\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008c\u0010F\u001a\u0004\u0008d\u0010PR \u0010e\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008e\u0010F\u001a\u0004\u0008f\u0010PR(\u0010g\u001a\u0010\u0012\u000c\u0012\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00100\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008g\u0010F\u001a\u0004\u0008h\u0010PR \u0010j\u001a\u0008\u0012\u0004\u0012\u00020i0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008j\u0010F\u001a\u0004\u0008k\u0010PR\"\u0010l\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u000b8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008l\u0010F\u001a\u0004\u0008m\u0010PR\u0014\u00100\u001a\u00020\u00048VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008n\u0010oR\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u0008p\u0010qR@\u0010v\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000c2\u0014\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u000c8@@BX\u0080\u000e\u00a2\u0006\u000c\u001a\u0004\u0008s\u0010t\"\u0004\u0008u\u0010/R\u0014\u0010y\u001a\u00020A8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008w\u0010xR\u001a\u0010{\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u000b8@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008z\u0010P\u00a8\u0006|"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "Lio/getstream/chat/android/models/FilterObject;",
        "initialFilter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "initialSort",
        "Lbc3/c0;",
        "scope",
        "Lec3/f2;",
        "",
        "",
        "Lio/getstream/chat/android/models/User;",
        "latestUsers",
        "",
        "Lio/getstream/chat/android/models/Location;",
        "activeLiveLocations",
        "<init>",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "event",
        "cachedChannel",
        "Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "handleChatEvent",
        "(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;",
        "",
        "isLoading",
        "Ll83/a0;",
        "setLoadingMore",
        "(Z)V",
        "setLoadingFirstPage",
        "Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;",
        "request",
        "setCurrentRequest",
        "(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V",
        "isEnd",
        "setEndOfChannels",
        "recoveryNeeded",
        "setRecoveryNeeded",
        "",
        "offset",
        "setChannelsOffset",
        "(I)V",
        "channelsMap",
        "setChannels",
        "(Ljava/util/Map;)V",
        "filter",
        "sort",
        "applyResolvedSpec",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V",
        "",
        "cids",
        "setCids",
        "(Ljava/util/Set;)V",
        "destroy",
        "()V",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "getIdentifier",
        "()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "Lec3/p1;",
        "_filter",
        "Lec3/p1;",
        "_sort",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "_querySpec",
        "Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "_channels",
        "mapChannels",
        "Lec3/f2;",
        "_loading",
        "_loadingMore",
        "_endOfChannels",
        "sortedChannels",
        "_currentRequest",
        "_recoveryNeeded",
        "_channelsOffset",
        "channelsOffset",
        "getChannelsOffset$stream_chat_android_client_release",
        "()Lec3/f2;",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "chatEventHandlerFactory",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "getChatEventHandlerFactory",
        "()Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;",
        "setChatEventHandlerFactory",
        "(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V",
        "getRecoveryNeeded",
        "Lio/getstream/chat/android/client/api/event/ChatEventHandler;",
        "eventHandler$delegate",
        "Ll83/h;",
        "getEventHandler",
        "()Lio/getstream/chat/android/client/api/event/ChatEventHandler;",
        "eventHandler",
        "currentRequest",
        "getCurrentRequest",
        "loading",
        "getLoading",
        "loadingMore",
        "getLoadingMore",
        "endOfChannels",
        "getEndOfChannels",
        "channels",
        "getChannels",
        "Lio/getstream/chat/android/client/api/state/ChannelsStateData;",
        "channelsStateData",
        "getChannelsStateData",
        "nextPageRequest",
        "getNextPageRequest",
        "getFilter",
        "()Lio/getstream/chat/android/models/FilterObject;",
        "getSort",
        "()Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "value",
        "getRawChannels$stream_chat_android_client_release",
        "()Ljava/util/Map;",
        "setRawChannels",
        "rawChannels",
        "getQueryChannelsSpec$stream_chat_android_client_release",
        "()Lio/getstream/chat/android/client/query/QueryChannelsSpec;",
        "queryChannelsSpec",
        "getCurrentLoading$stream_chat_android_client_release",
        "currentLoading",
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
.field private _channels:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _channelsOffset:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _currentRequest:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _endOfChannels:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _filter:Lec3/p1;
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

.field private _loadingMore:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private _querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

.field private _recoveryNeeded:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final _sort:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final channels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelsOffset:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channelsStateData:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

.field private final currentRequest:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final endOfChannels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final eventHandler$delegate:Ll83/h;

.field private final identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

.field private final loading:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final loadingMore:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final mapChannels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final nextPageRequest:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final recoveryNeeded:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final sortedChannels:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;",
            "Lbc3/c0;",
            "Lec3/f2;",
            "Lec3/f2;",
            ")V"
        }
    .end annotation

    move-object/from16 v2, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialFilter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "initialSort"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestUsers"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    invoke-static {p2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_filter:Lec3/p1;

    invoke-static {v2}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v12

    iput-object v12, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_sort:Lec3/p1;

    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    if-eqz v0, :cond_0

    new-instance p1, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    invoke-direct {p1, p2, v2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    goto :goto_0

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-eqz v0, :cond_1

    new-instance v0, Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    check-cast p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getName()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getFilterValues()Ljava/util/Map;

    move-result-object v5

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;->getSortValues()Ljava/util/Map;

    move-result-object v6

    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-direct/range {v0 .. v8}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_0
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    const/4 p1, 0x0

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channels:Lec3/p1;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->mapChannels:Lec3/f2;

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loading:Lec3/p1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loadingMore:Lec3/p1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_endOfChannels:Lec3/p1;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$sortedChannels$1;

    const/4 v2, 0x5

    invoke-direct {v1, v2, p1}, Ls83/i;-><init>(ILq83/d;)V

    invoke-static {p2, v10, v11, v12, v1}, Lec3/v;->o(Lec3/l;Lec3/l;Lec3/l;Lec3/l;Lc93/o;)Landroidx/room/y;

    move-result-object p2

    sget-object v1, Lec3/z1;->a:Lec3/b2;

    invoke-static {p2, v9, v1, p1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->sortedChannels:Lec3/f2;

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v2

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_currentRequest:Lec3/p1;

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_recoveryNeeded:Lec3/p1;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channelsOffset:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channelsOffset:Lec3/f2;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_recoveryNeeded:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->recoveryNeeded:Lec3/f2;

    new-instance v2, Lh02/n0;

    const/16 v3, 0x19

    invoke-direct {v2, p0, v3}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-static {v2}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v2

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->eventHandler$delegate:Ll83/h;

    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_currentRequest:Lec3/p1;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->currentRequest:Lec3/f2;

    iget-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loading:Lec3/p1;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v3, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loading:Lec3/f2;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loadingMore:Lec3/p1;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loadingMore:Lec3/f2;

    iget-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_endOfChannels:Lec3/p1;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iput-object v4, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->endOfChannels:Lec3/f2;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channels:Lec3/f2;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$channelsStateData$1;

    const/4 v5, 0x3

    invoke-direct {v4, v5, p1}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v6, Lec3/l1;

    const/4 v7, 0x1

    invoke-direct {v6, v3, p2, v4, v7}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    sget-object p2, Lio/getstream/chat/android/client/api/state/ChannelsStateData$NoQueryActive;->INSTANCE:Lio/getstream/chat/android/client/api/state/ChannelsStateData$NoQueryActive;

    invoke-static {v6, v9, v1, p2}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p2

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channelsStateData:Lec3/f2;

    new-instance p2, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState$nextPageRequest$1;

    invoke-direct {p2, v5, p1}, Ls83/i;-><init>(ILq83/d;)V

    new-instance v3, Lec3/l1;

    const/4 v4, 0x1

    invoke-direct {v3, v2, v0, p2, v4}, Lec3/l1;-><init>(Lec3/l;Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v3, v9, v1, p1}, Lec3/v;->M(Lec3/l;Lbc3/c0;Lec3/a2;Ljava/lang/Object;)Lec3/r1;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->nextPageRequest:Lec3/f2;

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic a(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;)Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->eventHandler_delegate$lambda$0(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;

    move-result-object p0

    check-cast p0, Lio/getstream/chat/android/client/api/event/DefaultChatEventHandler;

    return-object p0
.end method

.method private static final eventHandler_delegate$lambda$0(Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    if-nez v0, :cond_0

    new-instance v0, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v2, v1, v2}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;-><init>(Lio/getstream/chat/android/client/setup/state/ClientState;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->mapChannels:Lec3/f2;

    invoke-virtual {v0, p0}, Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;->chatEventHandler(Lec3/f2;)Lio/getstream/chat/android/client/api/event/ChatEventHandler;

    move-result-object p0

    return-object p0
.end method

.method private final getEventHandler()Lio/getstream/chat/android/client/api/event/ChatEventHandler;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->eventHandler$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/api/event/ChatEventHandler;

    return-object v0
.end method

.method private final setRawChannels(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channels:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0, p1}, Lec3/h2;->j(Ljava/lang/Object;)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final applyResolvedSpec(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

    instance-of v0, v0, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-nez v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_filter:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_sort:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {v0, v1, p2}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    invoke-virtual {v0, p1, p2}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->copy(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    return-void
.end method

.method public final destroy()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channels:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loading:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loadingMore:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_endOfChannels:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_currentRequest:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_recoveryNeeded:Lec3/p1;

    iput-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channelsOffset:Lec3/p1;

    return-void
.end method

.method public final getChannels()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channels:Lec3/f2;

    return-object v0
.end method

.method public final getChannelsOffset$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channelsOffset:Lec3/f2;

    return-object v0
.end method

.method public final getChannelsStateData()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channelsStateData:Lec3/f2;

    return-object v0
.end method

.method public final getChatEventHandlerFactory()Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    return-object v0
.end method

.method public final getCurrentLoading$stream_chat_android_client_release()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->channels:Lec3/f2;

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loadingMore:Lec3/f2;

    return-object v0

    :cond_1
    :goto_0
    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loading:Lec3/f2;

    return-object v0
.end method

.method public final getCurrentRequest()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->currentRequest:Lec3/f2;

    return-object v0
.end method

.method public final getEndOfChannels()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->endOfChannels:Lec3/f2;

    return-object v0
.end method

.method public final getFilter()Lio/getstream/chat/android/models/FilterObject;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_filter:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/FilterObject;

    return-object v0
.end method

.method public final getIdentifier()Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->identifier:Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;

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

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loading:Lec3/f2;

    return-object v0
.end method

.method public final getLoadingMore()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->loadingMore:Lec3/f2;

    return-object v0
.end method

.method public final getNextPageRequest()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->nextPageRequest:Lec3/f2;

    return-object v0
.end method

.method public final getQueryChannelsSpec$stream_chat_android_client_release()Lio/getstream/chat/android/client/query/QueryChannelsSpec;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    return-object v0
.end method

.method public final getRawChannels$stream_chat_android_client_release()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channels:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final getRecoveryNeeded()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->recoveryNeeded:Lec3/f2;

    return-object v0
.end method

.method public final getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_sort:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/querysort/QuerySorter;

    return-object v0
.end method

.method public final handleChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getEventHandler()Lio/getstream/chat/android/client/api/event/ChatEventHandler;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    invoke-interface {v0, p1, v1, p2}, Lio/getstream/chat/android/client/api/event/ChatEventHandler;->handleChatEvent(Lio/getstream/chat/android/client/events/ChatEvent;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/Channel;)Lio/getstream/chat/android/client/api/event/EventHandlingResult;

    move-result-object p1

    return-object p1
.end method

.method public final setChannels(Ljava/util/Map;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)V"
        }
    .end annotation

    const-string v0, "channelsMap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->setRawChannels(Ljava/util/Map;)V

    return-void
.end method

.method public final setChannelsOffset(I)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_channelsOffset:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setChatEventHandlerFactory(Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;)V
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->chatEventHandlerFactory:Lio/getstream/chat/android/client/api/event/ChatEventHandlerFactory;

    return-void
.end method

.method public final setCids(Ljava/util/Set;)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    const-string v0, "cids"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    const/16 v8, 0x3b

    const/4 v9, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v4, p1

    invoke-static/range {v1 .. v9}, Lio/getstream/chat/android/client/query/QueryChannelsSpec;->copy$default(Lio/getstream/chat/android/client/query/QueryChannelsSpec;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/Set;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;ILjava/lang/Object;)Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_querySpec:Lio/getstream/chat/android/client/query/QueryChannelsSpec;

    return-void
.end method

.method public final setCurrentRequest(Lio/getstream/chat/android/client/api/models/QueryChannelsRequest;)V
    .locals 2

    const-string v0, "request"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_currentRequest:Lec3/p1;

    if-eqz v0, :cond_0

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setEndOfChannels(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_endOfChannels:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingFirstPage(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loading:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setLoadingMore(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_loadingMore:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method

.method public final setRecoveryNeeded(Z)V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->_recoveryNeeded:Lec3/p1;

    if-eqz v0, :cond_0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    check-cast v0, Lec3/h2;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, p1}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
