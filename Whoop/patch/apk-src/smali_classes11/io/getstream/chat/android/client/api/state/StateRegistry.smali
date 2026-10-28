.class public final Lio/getstream/chat/android/client/api/state/StateRegistry;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00d6\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u00020\u0001B\u008d\u0001\u0008\u0007\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00050\u0002\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u0002\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u000c\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0014\u0008\u0002\u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00080\u0002\u0012\u0008\u0008\u0002\u0010\u0017\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001f\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ#\u0010%\u001a\u00020$2\u0006\u0010 \u001a\u00020\u001f2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\"0!\u00a2\u0006\u0004\u0008%\u0010&J\u0017\u0010%\u001a\u00020$2\u0006\u0010(\u001a\u00020\'H\u0007\u00a2\u0006\u0004\u0008%\u0010)J\u001d\u0010+\u001a\u00020*2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006\u00a2\u0006\u0004\u0008+\u0010,J\u001f\u00100\u001a\u00020-2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008.\u0010/J\u001f\u00104\u001a\u0002012\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u00082\u00103J\u001f\u00107\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u00085\u00106J\'\u0010<\u001a\u0002092\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u0002080!H\u0000\u00a2\u0006\u0004\u0008:\u0010;J\'\u0010@\u001a\u00020=2\u0008\u0010 \u001a\u0004\u0018\u00010\u001f2\u000c\u0010#\u001a\u0008\u0012\u0004\u0012\u0002080!H\u0000\u00a2\u0006\u0004\u0008>\u0010?J\u0015\u0010C\u001a\u00020B2\u0006\u0010A\u001a\u00020\u0006\u00a2\u0006\u0004\u0008C\u0010DJ\u0017\u0010H\u001a\u00020E2\u0006\u0010A\u001a\u00020\u0006H\u0000\u00a2\u0006\u0004\u0008F\u0010GJ\u0015\u0010K\u001a\u0008\u0012\u0004\u0012\u00020*0\u0008H\u0000\u00a2\u0006\u0004\u0008I\u0010JJ\r\u0010L\u001a\u00020\u001c\u00a2\u0006\u0004\u0008L\u0010MJ\u0017\u0010R\u001a\u00020\u001c2\u0006\u0010O\u001a\u00020NH\u0000\u00a2\u0006\u0004\u0008P\u0010QR\u001c\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0004\u0010SR(\u0010\u0007\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00050\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010SR \u0010\n\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u00080\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\n\u0010SR\u0014\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010TR\u001a\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010UR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010VR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010WR \u0010\u0015\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00140\u00080\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010SR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010XR\u001b\u0010^\u001a\u00020Y8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Z\u0010[\u001a\u0004\u0008\\\u0010]R \u0010%\u001a\u000e\u0012\u0004\u0012\u00020\'\u0012\u0004\u0012\u00020`0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008%\u0010aR,\u0010c\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060b\u0012\u0004\u0012\u00020-0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008c\u0010aR,\u0010d\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060b\u0012\u0004\u0012\u0002010_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008d\u0010aR4\u0010<\u001a\"\u0012\u0018\u0012\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001f\u0012\n\u0012\u0008\u0012\u0004\u0012\u0002080!0b\u0012\u0004\u0012\u00020=0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008<\u0010aR \u0010e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020E0_8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008e\u0010a\u00a8\u0006f"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/state/StateRegistry;",
        "",
        "Lec3/f2;",
        "Lio/getstream/chat/android/models/User;",
        "userStateFlow",
        "",
        "",
        "latestUsers",
        "",
        "Lio/getstream/chat/android/models/Location;",
        "activeLiveLocations",
        "Lbc3/k1;",
        "job",
        "Lkotlin/Function0;",
        "",
        "now",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
        "messageLimitConfig",
        "Lio/getstream/chat/android/models/Mute;",
        "mutedUsers",
        "",
        "useLegacyChannelState",
        "<init>",
        "(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;Z)V",
        "channelType",
        "channelId",
        "Ll83/a0;",
        "removeChanel",
        "(Ljava/lang/String;Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "Lio/getstream/chat/android/models/Channel;",
        "sort",
        "Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "queryChannels",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
        "identifier",
        "(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;",
        "Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "channel",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "legacyChannelState$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
        "legacyChannelState",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "channelState$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "channelState",
        "isActiveChannel$stream_chat_android_client_release",
        "(Ljava/lang/String;Ljava/lang/String;)Z",
        "isActiveChannel",
        "Lio/getstream/chat/android/models/Thread;",
        "Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "queryThreads$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryThreadsState;",
        "queryThreads",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
        "mutableQueryThreads$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
        "mutableQueryThreads",
        "messageId",
        "Lio/getstream/chat/android/client/api/state/ThreadState;",
        "thread",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/api/state/ThreadState;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
        "mutableThread$stream_chat_android_client_release",
        "(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
        "mutableThread",
        "getActiveChannelStates$stream_chat_android_client_release",
        "()Ljava/util/List;",
        "getActiveChannelStates",
        "clear",
        "()V",
        "Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;",
        "batchEvent",
        "handleBatchEvent$stream_chat_android_client_release",
        "(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V",
        "handleBatchEvent",
        "Lec3/f2;",
        "Lbc3/k1;",
        "Lc93/a;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
        "Z",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;",
        "Ljava/util/concurrent/ConcurrentHashMap;",
        "Ll83/k;",
        "legacyChannels",
        "channels",
        "threads",
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
.field private final activeLiveLocations:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final channels:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ll83/k;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final job:Lbc3/k1;

.field private latestUsers:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ll83/k;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;",
            ">;"
        }
    .end annotation
.end field

.field private final logger$delegate:Ll83/h;

.field private final messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

.field private final mutedUsers:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final queryChannels:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;",
            ">;"
        }
    .end annotation
.end field

.field private final queryThreads:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ll83/k;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;",
            ">;"
        }
    .end annotation
.end field

.field private final scope:Lbc3/c0;

.field private final threads:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;",
            ">;"
        }
    .end annotation
.end field

.field private final useLegacyChannelState:Z

.field private final userStateFlow:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lbc3/k1;",
            "Lc93/a;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "userStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x180

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/state/StateRegistry;-><init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lbc3/k1;",
            "Lc93/a;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            "Lec3/f2;",
            ")V"
        }
    .end annotation

    .line 2
    const-string v0, "userStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutedUsers"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/state/StateRegistry;-><init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lec3/f2;",
            "Lbc3/k1;",
            "Lc93/a;",
            "Lbc3/c0;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            "Lec3/f2;",
            "Z)V"
        }
    .end annotation

    const-string v0, "userStateFlow"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "latestUsers"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "activeLiveLocations"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scope"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "mutedUsers"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->userStateFlow:Lec3/f2;

    .line 5
    iput-object p2, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->latestUsers:Lec3/f2;

    .line 6
    iput-object p3, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->activeLiveLocations:Lec3/f2;

    .line 7
    iput-object p4, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->job:Lbc3/k1;

    .line 8
    iput-object p5, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->now:Lc93/a;

    .line 9
    iput-object p6, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->scope:Lbc3/c0;

    .line 10
    iput-object p7, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    .line 11
    iput-object p8, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutedUsers:Lec3/f2;

    .line 12
    iput-boolean p9, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->useLegacyChannelState:Z

    .line 13
    const-string p1, "Chat:StateRegistry"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->logger$delegate:Ll83/h;

    .line 14
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    .line 16
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public synthetic constructor <init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 12

    move/from16 v0, p10

    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_0

    .line 19
    sget-object v1, Lm83/y;->w:Lm83/y;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v1

    move-object v10, v1

    goto :goto_0

    :cond_0
    move-object/from16 v10, p8

    :goto_0
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_1

    const/4 v0, 0x1

    move v11, v0

    :goto_1
    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-object/from16 v6, p4

    move-object/from16 v7, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    goto :goto_2

    :cond_1
    move/from16 v11, p9

    goto :goto_1

    .line 20
    :goto_2
    invoke-direct/range {v2 .. v11}, Lio/getstream/chat/android/client/api/state/StateRegistry;-><init>(Lec3/f2;Lec3/f2;Lec3/f2;Lbc3/k1;Lc93/a;Lbc3/c0;Lio/getstream/chat/android/client/api/MessageLimitConfig;Lec3/f2;Z)V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method

.method private final removeChanel(Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->useLegacyChannelState:Z

    const/4 v1, 0x0

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->destroy$stream_chat_android_client_release()V

    goto :goto_0

    :cond_0
    move-object v2, v1

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v3, Ll83/k;

    invoke-direct {v3, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->destroy()V

    :goto_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/api/state/StateRegistry;->getLogger()Lb23/k;

    move-result-object v0

    iget-object v3, v0, Lb23/k;->c:Lb23/e;

    iget-object v4, v0, Lb23/k;->a:Ljava/lang/String;

    sget-object v5, Lb23/g;->z:Lb23/g;

    invoke-interface {v3, v5, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    iget-object v0, v0, Lb23/k;->b:Lb23/j;

    const-string v3, ", "

    const-string v6, "): "

    const-string v7, "[removeChanel] removed channel("

    invoke-static {v7, p1, v3, p2, v6}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, v5, v4, p1, v1}, Lb23/j;->log(Lb23/g;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_2
    return-void
.end method


# virtual methods
.method public final channel(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/channel/state/ChannelState;
    .locals 1

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->useLegacyChannelState:Z

    if-eqz v0, :cond_0

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    move-result-object p1

    return-object p1

    :cond_0
    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->channelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-result-object p1

    return-object p1
.end method

.method public final channelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;
    .locals 14

    move-object/from16 v2, p2

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/api/MessageLimitConfig;->getChannelMessageLimits()Ljava/util/Set;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v3, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/client/api/ChannelMessageLimit;

    invoke-virtual {v4}, Lio/getstream/chat/android/client/api/ChannelMessageLimit;->getChannelType()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    goto :goto_0

    :cond_1
    move-object v1, v3

    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/api/ChannelMessageLimit;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/api/ChannelMessageLimit;->getBaseLimit()I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    :cond_2
    move-object v7, v3

    iget-object v12, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v13, Ll83/k;

    invoke-direct {v13, p1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v12, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_4

    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    iget-object v3, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->userStateFlow:Lec3/f2;

    iget-object v4, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->latestUsers:Lec3/f2;

    iget-object v5, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutedUsers:Lec3/f2;

    iget-object v6, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->activeLiveLocations:Lec3/f2;

    const/16 v10, 0x180

    const/4 v11, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/MessagesPaginationManager;Lio/getstream/chat/android/client/internal/state/message/attachments/internal/AttachmentUrlValidator;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v12, v13, v0}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    goto :goto_1

    :cond_3
    move-object v0, p1

    :cond_4
    :goto_1
    check-cast v0, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    return-object v0
.end method

.method public final clear()V
    .locals 2

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->job:Lbc3/k1;

    invoke-static {v0}, Lbc3/f0;->k(Lbc3/k1;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;->destroy()V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;->destroy$stream_chat_android_client_release()V

    goto :goto_1

    :cond_1
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->destroy()V

    goto :goto_2

    :cond_2
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;->destroy$stream_chat_android_client_release()V

    goto :goto_3

    :cond_3
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;->destroy()V

    goto :goto_4

    :cond_4
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    return-void
.end method

.method public final getActiveChannelStates$stream_chat_android_client_release()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/client/channel/state/ChannelState;",
            ">;"
        }
    .end annotation

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->useLegacyChannelState:Z

    const-string v1, "<get-values>(...)"

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final handleBatchEvent$stream_chat_android_client_release(Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;)V
    .locals 2

    const-string v0, "batchEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/batch/BatchEvent;->getSortedEvents()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/client/events/ChatEvent;

    instance-of v1, v0, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v1, :cond_1

    check-cast v0, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getChannelType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getChannelId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/client/api/state/StateRegistry;->removeChanel(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    if-eqz v1, :cond_0

    check-cast v0, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getChannelType()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/client/events/NotificationChannelDeletedEvent;->getChannelId()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v1, v0}, Lio/getstream/chat/android/client/api/state/StateRegistry;->removeChanel(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final isActiveChannel$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->useLegacyChannelState:Z

    if-eqz v0, :cond_0

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_0
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->channels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final legacyChannelState$stream_chat_android_client_release(Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;
    .locals 13

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->legacyChannels:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_4

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/MessageLimitConfig;->getChannelMessageLimits()Ljava/util/Set;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lio/getstream/chat/android/client/api/ChannelMessageLimit;

    invoke-virtual {v5}, Lio/getstream/chat/android/client/api/ChannelMessageLimit;->getChannelType()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    goto :goto_0

    :cond_1
    move-object v3, v4

    :goto_0
    check-cast v3, Lio/getstream/chat/android/client/api/ChannelMessageLimit;

    if-eqz v3, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/client/api/ChannelMessageLimit;->getBaseLimit()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    :cond_2
    move-object v11, v4

    new-instance v5, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    iget-object v8, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->userStateFlow:Lec3/f2;

    iget-object v9, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->latestUsers:Lec3/f2;

    iget-object v10, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->activeLiveLocations:Lec3/f2;

    iget-object v12, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->now:Lc93/a;

    move-object v6, p1

    move-object v7, p2

    invoke-direct/range {v5 .. v12}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;-><init>(Ljava/lang/String;Ljava/lang/String;Lec3/f2;Lec3/f2;Lec3/f2;Ljava/lang/Integer;Lc93/a;)V

    invoke-interface {v0, v1, v5}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_3

    move-object v2, v5

    goto :goto_1

    :cond_3
    move-object v2, p1

    :cond_4
    :goto_1
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateLegacyImpl;

    return-object v2
.end method

.method public final mutableQueryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryThreads:Ljava/util/concurrent/ConcurrentHashMap;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_1

    new-instance v2, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    invoke-direct {v2, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    invoke-interface {v0, v1, v2}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v2, p1

    :cond_1
    :goto_0
    check-cast v2, Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    return-object v2
.end method

.method public final mutableThread$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;
    .locals 3

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->threads:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_1

    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    iget-object v2, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->scope:Lbc3/c0;

    invoke-direct {v1, p1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;-><init>(Ljava/lang/String;Lbc3/c0;)V

    invoke-interface {v0, p1, v1}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :cond_1
    :goto_0
    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    return-object v1
.end method

.method public final queryChannels(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;
    .locals 11
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "identifier"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    iget-object v0, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels:Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    if-nez v1, :cond_3

    .line 4
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getFilter()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;->getSort()Lio/getstream/chat/android/models/querysort/QuerySorter;

    move-result-object v1

    .line 5
    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    .line 6
    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Predefined;

    if-eqz v1, :cond_2

    invoke-static {}, Lio/getstream/chat/android/models/Filters;->neutral()Lio/getstream/chat/android/models/FilterObject;

    move-result-object v1

    new-instance v2, Lio/getstream/chat/android/models/querysort/QuerySortByField;

    invoke-direct {v2}, Lio/getstream/chat/android/models/querysort/QuerySortByField;-><init>()V

    .line 7
    new-instance v3, Ll83/k;

    invoke-direct {v3, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 8
    :goto_0
    iget-object v1, v3, Ll83/k;->w:Ljava/lang/Object;

    .line 9
    move-object v6, v1

    check-cast v6, Lio/getstream/chat/android/models/FilterObject;

    .line 10
    iget-object v1, v3, Ll83/k;->x:Ljava/lang/Object;

    .line 11
    move-object v7, v1

    check-cast v7, Lio/getstream/chat/android/models/querysort/QuerySorter;

    .line 12
    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;

    .line 13
    iget-object v8, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->scope:Lbc3/c0;

    .line 14
    iget-object v9, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->latestUsers:Lec3/f2;

    .line 15
    iget-object v10, p0, Lio/getstream/chat/android/client/api/state/StateRegistry;->activeLiveLocations:Lec3/f2;

    move-object v5, p1

    .line 16
    invoke-direct/range {v4 .. v10}, Lio/getstream/chat/android/client/internal/state/plugin/state/querychannels/internal/QueryChannelsMutableState;-><init>(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Lbc3/c0;Lec3/f2;Lec3/f2;)V

    .line 17
    invoke-interface {v0, v5, v4}, Ljava/util/concurrent/ConcurrentMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_1

    move-object v1, v4

    goto :goto_1

    :cond_1
    move-object v1, p1

    goto :goto_1

    .line 18
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 19
    :cond_3
    :goto_1
    check-cast v1, Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    return-object v1
.end method

.method public final queryChannels(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Channel;",
            ">;)",
            "Lio/getstream/chat/android/client/api/state/QueryChannelsState;"
        }
    .end annotation

    const-string v0, "filter"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    new-instance v0, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;

    invoke-direct {v0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier$Standard;-><init>(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)V

    invoke-virtual {p0, v0}, Lio/getstream/chat/android/client/api/state/StateRegistry;->queryChannels(Lio/getstream/chat/android/client/internal/state/plugin/QueryChannelsIdentifier;)Lio/getstream/chat/android/client/api/state/QueryChannelsState;

    move-result-object p1

    return-object p1
.end method

.method public final queryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/api/state/QueryThreadsState;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Thread;",
            ">;)",
            "Lio/getstream/chat/android/client/api/state/QueryThreadsState;"
        }
    .end annotation

    const-string v0, "sort"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutableQueryThreads$stream_chat_android_client_release(Lio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;)Lio/getstream/chat/android/client/internal/state/plugin/state/querythreads/internal/QueryThreadsMutableState;

    move-result-object p1

    return-object p1
.end method

.method public final thread(Ljava/lang/String;)Lio/getstream/chat/android/client/api/state/ThreadState;
    .locals 1

    const-string v0, "messageId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lio/getstream/chat/android/client/api/state/StateRegistry;->mutableThread$stream_chat_android_client_release(Ljava/lang/String;)Lio/getstream/chat/android/client/internal/state/plugin/state/channel/thread/internal/ThreadMutableState;

    move-result-object p1

    return-object p1
.end method
