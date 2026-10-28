.class public final Lio/getstream/chat/android/client/api/ChatClientConfig;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u0008\n\u0002\u0008\u0013\u0008\u0086\u0008\u0018\u00002\u00020\u0001Bo\u0008\u0007\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\t\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b\u0012\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0016\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u0015J\u0010\u0010\u001a\u001a\u00020\tH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u0015J\u0010\u0010!\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u0015Jv\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b2\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010%J\u0010\u0010\'\u001a\u00020&H\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00022\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u0015R\u001d\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010.\u001a\u0004\u0008/\u0010\u0017R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010,\u001a\u0004\u00080\u0010\u0015R\u0017\u0010\u0008\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010,\u001a\u0004\u0008\u0008\u0010\u0015R\u0017\u0010\n\u001a\u00020\t8\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00101\u001a\u0004\u00082\u0010\u001bR\u001d\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000b8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00103\u001a\u0004\u00084\u0010\u001dR\u0017\u0010\u000f\u001a\u00020\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u00105\u001a\u0004\u00086\u0010\u001fR\u0017\u0010\u0010\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010,\u001a\u0004\u00087\u0010\u0015R\u0017\u0010\u0011\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010,\u001a\u0004\u00088\u0010\u0015\u00a8\u00069"
    }
    d2 = {
        "Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "",
        "",
        "offlineEnabled",
        "",
        "",
        "ignoredOfflineChannelTypes",
        "userPresence",
        "isAutomaticSyncOnReconnectEnabled",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "syncMaxThreshold",
        "Lkotlin/Function0;",
        "",
        "now",
        "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
        "messageLimitConfig",
        "useLegacyChannelLogic",
        "fastEventParsing",
        "<init>",
        "(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)V",
        "component1",
        "()Z",
        "component2",
        "()Ljava/util/Set;",
        "component3",
        "component4",
        "component5",
        "()Lio/getstream/chat/android/models/TimeDuration;",
        "component6",
        "()Lc93/a;",
        "component7",
        "()Lio/getstream/chat/android/client/api/MessageLimitConfig;",
        "component8",
        "component9",
        "copy",
        "(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)Lio/getstream/chat/android/client/api/ChatClientConfig;",
        "toString",
        "()Ljava/lang/String;",
        "",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getOfflineEnabled",
        "Ljava/util/Set;",
        "getIgnoredOfflineChannelTypes",
        "getUserPresence",
        "Lio/getstream/chat/android/models/TimeDuration;",
        "getSyncMaxThreshold",
        "Lc93/a;",
        "getNow",
        "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
        "getMessageLimitConfig",
        "getUseLegacyChannelLogic",
        "getFastEventParsing",
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
.field private final fastEventParsing:Z

.field private final ignoredOfflineChannelTypes:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final isAutomaticSyncOnReconnectEnabled:Z

.field private final messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final offlineEnabled:Z

.field private final syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

.field private final useLegacyChannelLogic:Z

.field private final userPresence:Z


# direct methods
.method public constructor <init>()V
    .locals 12

    .line 1
    const/16 v10, 0x1ff

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 12

    .line 2
    const/16 v10, 0x1fe

    const/4 v11, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v0, p0

    move v1, p1

    invoke-direct/range {v0 .. v11}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1fc

    const/4 v12, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 4
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1f8

    const/4 v12, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZ)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ)V"
        }
    .end annotation

    .line 5
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1f0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            ")V"
        }
    .end annotation

    .line 6
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1e0

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    .line 7
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x1c0

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            ")V"
        }
    .end annotation

    .line 8
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

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

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;Z)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            "Z)V"
        }
    .end annotation

    .line 9
    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v11, 0x100

    const/4 v12, 0x0

    const/4 v10, 0x0

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v9, p8

    invoke-direct/range {v1 .. v12}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            "ZZ)V"
        }
    .end annotation

    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    iput-boolean p1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    .line 12
    iput-object p2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    .line 13
    iput-boolean p3, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    .line 14
    iput-boolean p4, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    .line 15
    iput-object p5, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    .line 16
    iput-object p6, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    .line 17
    iput-object p7, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    .line 18
    iput-boolean p8, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    .line 19
    iput-boolean p9, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    return-void
.end method

.method public synthetic constructor <init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 1

    and-int/lit8 p11, p10, 0x1

    const/4 v0, 0x1

    if-eqz p11, :cond_0

    move p1, v0

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    .line 20
    sget-object p2, Lm83/a0;->w:Lm83/a0;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    move p3, v0

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    move p4, v0

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    .line 21
    sget-object p5, Lio/getstream/chat/android/models/TimeDuration;->Companion:Lio/getstream/chat/android/models/TimeDuration$Companion;

    const/16 p11, 0xc

    invoke-virtual {p5, p11}, Lio/getstream/chat/android/models/TimeDuration$Companion;->hours(I)Lio/getstream/chat/android/models/TimeDuration;

    move-result-object p5

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    .line 22
    new-instance p6, Lim1/l0;

    const/4 p11, 0x6

    invoke-direct {p6, p11}, Lim1/l0;-><init>(I)V

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    .line 23
    new-instance p7, Lio/getstream/chat/android/client/api/MessageLimitConfig;

    const/4 p11, 0x3

    const/4 v0, 0x0

    invoke-direct {p7, v0, v0, p11, v0}, Lio/getstream/chat/android/client/api/MessageLimitConfig;-><init>(Ljava/util/Set;Lio/getstream/chat/android/client/api/MessageBufferConfig;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_6
    and-int/lit16 p11, p10, 0x80

    const/4 v0, 0x0

    if-eqz p11, :cond_7

    move p8, v0

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    move p10, v0

    :goto_0
    move p9, p8

    move-object p8, p7

    move-object p7, p6

    move-object p6, p5

    move p5, p4

    move p4, p3

    move-object p3, p2

    move p2, p1

    move-object p1, p0

    goto :goto_1

    :cond_8
    move p10, p9

    goto :goto_0

    .line 24
    :goto_1
    invoke-direct/range {p1 .. p10}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic copy$default(Lio/getstream/chat/android/client/api/ChatClientConfig;ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZILjava/lang/Object;)Lio/getstream/chat/android/client/api/ChatClientConfig;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-boolean p1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-boolean p3, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-boolean p4, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-boolean p8, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-boolean p9, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    :cond_8
    move p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move p6, p4

    move-object p7, p5

    move-object p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lio/getstream/chat/android/client/api/ChatClientConfig;->copy(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)Lio/getstream/chat/android/client/api/ChatClientConfig;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    return v0
.end method

.method public final component2()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    return v0
.end method

.method public final component5()Lio/getstream/chat/android/models/TimeDuration;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    return-object v0
.end method

.method public final component6()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    return-object v0
.end method

.method public final component7()Lio/getstream/chat/android/client/api/MessageLimitConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    return v0
.end method

.method public final component9()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    return v0
.end method

.method public final copy(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)Lio/getstream/chat/android/client/api/ChatClientConfig;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;ZZ",
            "Lio/getstream/chat/android/models/TimeDuration;",
            "Lc93/a;",
            "Lio/getstream/chat/android/client/api/MessageLimitConfig;",
            "ZZ)",
            "Lio/getstream/chat/android/client/api/ChatClientConfig;"
        }
    .end annotation

    const-string v0, "ignoredOfflineChannelTypes"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "syncMaxThreshold"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageLimitConfig"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/client/api/ChatClientConfig;

    move v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lio/getstream/chat/android/client/api/ChatClientConfig;-><init>(ZLjava/util/Set;ZZLio/getstream/chat/android/models/TimeDuration;Lc93/a;Lio/getstream/chat/android/client/api/MessageLimitConfig;ZZ)V

    return-object v1
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lio/getstream/chat/android/client/api/ChatClientConfig;

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    iget-object v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    iget-boolean v3, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    iget-boolean p1, p1, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    if-eq v1, p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getFastEventParsing()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    return v0
.end method

.method public final getIgnoredOfflineChannelTypes()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    return-object v0
.end method

.method public final getMessageLimitConfig()Lio/getstream/chat/android/client/api/MessageLimitConfig;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    return-object v0
.end method

.method public final getNow()Lc93/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lc93/a;"
        }
    .end annotation

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    return-object v0
.end method

.method public final getOfflineEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    return v0
.end method

.method public final getSyncMaxThreshold()Lio/getstream/chat/android/models/TimeDuration;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    return-object v0
.end method

.method public final getUseLegacyChannelLogic()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    return v0
.end method

.method public final getUserPresence()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    return v0
.end method

.method public final hashCode()I
    .locals 3

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    invoke-static {v2, v0, v1}, Lm4/a;->a(Ljava/util/Set;II)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/TimeDuration;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    invoke-static {v2, v1, v0}, Lr;->d(IILc93/a;)I

    move-result v0

    iget-object v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/api/MessageLimitConfig;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isAutomaticSyncOnReconnectEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 11

    iget-boolean v0, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->offlineEnabled:Z

    iget-object v1, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->ignoredOfflineChannelTypes:Ljava/util/Set;

    iget-boolean v2, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->userPresence:Z

    iget-boolean v3, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->isAutomaticSyncOnReconnectEnabled:Z

    iget-object v4, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->syncMaxThreshold:Lio/getstream/chat/android/models/TimeDuration;

    iget-object v5, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->now:Lc93/a;

    iget-object v6, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->messageLimitConfig:Lio/getstream/chat/android/client/api/MessageLimitConfig;

    iget-boolean v7, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->useLegacyChannelLogic:Z

    iget-boolean v8, p0, Lio/getstream/chat/android/client/api/ChatClientConfig;->fastEventParsing:Z

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "ChatClientConfig(offlineEnabled="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", ignoredOfflineChannelTypes="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", userPresence="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isAutomaticSyncOnReconnectEnabled="

    const-string v1, ", syncMaxThreshold="

    invoke-static {v9, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", now="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", messageLimitConfig="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", useLegacyChannelLogic="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", fastEventParsing="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v9, v8, v0}, Lih0/d0;->m(Ljava/lang/StringBuilder;ZLjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
