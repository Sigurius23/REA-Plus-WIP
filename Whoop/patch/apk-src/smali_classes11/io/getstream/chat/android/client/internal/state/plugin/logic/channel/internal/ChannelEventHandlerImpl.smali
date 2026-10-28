.class public final Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n\u0012\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u001f\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0017\u0010 \u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u0017\u0010#\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\"H\u0016\u00a2\u0006\u0004\u0008#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\'R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010(R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010)R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008+\u0010,\u00a8\u0006-"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandler;",
        "",
        "cid",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "state",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "globalState",
        "Lbc3/c0;",
        "coroutineScope",
        "Lkotlin/Function0;",
        "getCurrentUserId",
        "",
        "now",
        "<init>",
        "(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;)V",
        "Lio/getstream/chat/android/client/events/CidEvent;",
        "event",
        "Ll83/a0;",
        "handleCidEvent",
        "(Lio/getstream/chat/android/client/events/CidEvent;)V",
        "messageId",
        "Lio/getstream/chat/android/models/MessageReminder;",
        "reminder",
        "updateReminder",
        "(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V",
        "deleteReminder",
        "(Ljava/lang/String;)V",
        "Lio/getstream/chat/android/models/Message;",
        "message",
        "updateMessageWithReaction",
        "(Lio/getstream/chat/android/models/Message;)V",
        "enrichWithOwnReactions",
        "(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;",
        "Lio/getstream/chat/android/client/events/ChatEvent;",
        "handle",
        "(Lio/getstream/chat/android/client/events/ChatEvent;)V",
        "Ljava/lang/String;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
        "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
        "Lbc3/c0;",
        "Lc93/a;",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;",
        "typingEventPruner",
        "Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;",
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
.field private final cid:Ljava/lang/String;

.field private final coroutineScope:Lbc3/c0;

.field private final getCurrentUserId:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

.field private final now:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

.field private final typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;",
            "Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;",
            "Lbc3/c0;",
            "Lc93/a;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "cid"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "state"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "globalState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "coroutineScope"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "getCurrentUserId"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->cid:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    .line 4
    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    .line 5
    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->coroutineScope:Lbc3/c0;

    .line 6
    iput-object p5, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    .line 7
    iput-object p6, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->now:Lc93/a;

    .line 8
    new-instance v1, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    .line 9
    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->cidToTypeAndId(Ljava/lang/String;)Ll83/k;

    move-result-object p1

    .line 10
    iget-object p1, p1, Ll83/k;->x:Ljava/lang/Object;

    .line 11
    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    .line 12
    new-instance v6, Lhb2/f;

    const/16 p1, 0xd

    invoke-direct {v6, p0, p1}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    const/4 v7, 0x4

    const/4 v8, 0x0

    const-wide/16 v4, 0x0

    move-object v3, p4

    .line 13
    invoke-direct/range {v1 .. v8}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;-><init>(Ljava/lang/String;Lbc3/c0;JLc93/m;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 7

    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_0

    .line 14
    new-instance p6, Lio/getstream/chat/android/client/k;

    const/4 p7, 0x5

    invoke-direct {p6, p7}, Lio/getstream/chat/android/client/k;-><init>(I)V

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    .line 15
    invoke-direct/range {v0 .. v6}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;-><init>(Ljava/lang/String;Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;Lbc3/c0;Lc93/a;Lc93/a;)V

    return-void
.end method

.method private static final _init_$lambda$0()J
    .locals 2

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic a(Lio/getstream/chat/android/models/MessageReminder;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateReminder$lambda$4(Lio/getstream/chat/android/models/MessageReminder;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateMessageWithReaction$lambda$6(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->typingEventPruner$lambda$1(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)Ll83/a0;

    return-void
.end method

.method public static synthetic d(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->deleteReminder$lambda$5(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object p0

    return-object p0
.end method

.method private final deleteReminder(Ljava/lang/String;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    new-instance v1, Lio/getstream/chat/android/client/api/state/a;

    const/16 v2, 0x16

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api/state/a;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final deleteReminder$lambda$5(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 53

    const-string v0, "message"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v51, 0xefff

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method private final enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 54

    move-object/from16 v0, p0

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    if-nez v1, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v20

    const v52, 0xffff

    const/16 v53, 0x0

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const v51, -0x20001

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v53}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v1

    return-object v1
.end method

.method private final handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;)V
    .locals 57

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-eqz v2, :cond_7

    check-cast v1, Lio/getstream/chat/android/client/events/NewMessageEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v5}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getCreatedLocallyAt()Ljava/util/Date;

    move-result-object v4

    :cond_0
    move-object/from16 v28, v4

    const v55, 0xffff

    const/16 v56, 0x0

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v54, -0x400001

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    :goto_0
    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v5

    invoke-virtual {v4, v5, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v4

    if-nez v4, :cond_2

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    :cond_2
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NewMessageEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_3

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessageCount(I)V

    :cond_3
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getInsideSearch()Lec3/f2;

    move-result-object v1

    invoke-interface {v1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->trimOldestMessages()V

    :goto_1
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->now:Lc93/a;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v3

    if-nez v3, :cond_6

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v3

    invoke-interface {v1}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v5

    cmp-long v1, v3, v5

    if-gez v1, :cond_5

    goto :goto_2

    :cond_5
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessage(Lio/getstream/chat/android/models/Message;)V

    :cond_6
    :goto_2
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removePendingMessage(Ljava/lang/String;)V

    return-void

    :cond_7
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    if-eqz v2, :cond_b

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v2, v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateCurrentUserRead(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v2

    if-nez v2, :cond_8

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    :cond_8
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateLastMessageAt(Lio/getstream/chat/android/models/Message;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getInsideSearch()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_9

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedMessage(Lio/getstream/chat/android/models/Message;)V

    goto :goto_3

    :cond_9
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->trimOldestMessages()V

    :goto_3
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->now:Lc93/a;

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v4

    if-eqz v4, :cond_3e

    invoke-static {v2}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v4

    if-nez v4, :cond_3e

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    move-result-wide v4

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    cmp-long v2, v4, v2

    if-gez v2, :cond_a

    goto/16 :goto_a

    :cond_a
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    if-eqz v2, :cond_12

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getMessageById(Ljava/lang/String;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v5

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v3

    if-nez v3, :cond_d

    if-eqz v2, :cond_c

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v4

    :cond_c
    move-object/from16 v48, v4

    goto :goto_4

    :cond_d
    move-object/from16 v48, v3

    :goto_4
    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_e

    goto :goto_6

    :cond_e
    :goto_5
    move-object/from16 v23, v2

    goto :goto_7

    :cond_f
    :goto_6
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v2

    goto :goto_5

    :goto_7
    const v55, 0xfbff

    const/16 v56, 0x0

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const v54, -0x20001

    invoke-static/range {v5 .. v56}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateQuotedMessageReferences(Lio/getstream/chat/android/models/Message;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->now:Lc93/a;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v5

    if-eqz v5, :cond_11

    invoke-static {v3}, Lio/getstream/chat/android/client/utils/message/MessageUtils;->isDeleted(Lio/getstream/chat/android/models/Message;)Z

    move-result v5

    if-nez v5, :cond_11

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getPinExpires()Ljava/util/Date;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Ljava/util/Date;->getTime()J

    move-result-wide v5

    invoke-interface {v4}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v3

    cmp-long v3, v5, v3

    if-gez v3, :cond_10

    goto :goto_8

    :cond_10
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addPinnedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_11
    :goto_8
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageUpdatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deletePinnedMessage(Ljava/lang/String;)V

    return-void

    :cond_12
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    if-eqz v2, :cond_16

    check-cast v1, Lio/getstream/chat/android/client/events/MessageDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getHardDelete()Z

    move-result v2

    if-eqz v2, :cond_13

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMessage(Ljava/lang/String;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteQuotedMessageReferences(Ljava/lang/String;)V

    goto :goto_9

    :cond_13
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-direct {v0, v2}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->enrichWithOwnReactions(Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateQuotedMessageReferences(Lio/getstream/chat/android/models/Message;)V

    :goto_9
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getChannelMessageCount()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_14

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-virtual {v3, v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMessageCount(I)V

    :cond_14
    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getPinned()Z

    move-result v2

    if-eqz v2, :cond_15

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deletePinnedMessage(Ljava/lang/String;)V

    :cond_15
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removePendingMessage(Ljava/lang/String;)V

    return-void

    :cond_16
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    if-eqz v2, :cond_19

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShowInChannel()Z

    move-result v2

    if-eqz v2, :cond_3e

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Message;->getShadowed()Z

    move-result v2

    if-nez v2, :cond_17

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    :cond_17
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->getInsideSearch()Lec3/f2;

    move-result-object v2

    invoke-interface {v2}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    if-eqz v2, :cond_18

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertCachedMessage(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_18
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationThreadMessageNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMessage(Lio/getstream/chat/android/models/Message;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->trimOldestMessages()V

    return-void

    :cond_19
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    if-eqz v2, :cond_1a

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionNewEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionNewEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateMessageWithReaction(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_1a
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    if-eqz v2, :cond_1b

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionUpdateEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateMessageWithReaction(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_1b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    if-eqz v2, :cond_1c

    check-cast v1, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReactionDeletedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateMessageWithReaction(Lio/getstream/chat/android/models/Message;)V

    return-void

    :cond_1c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    if-eqz v2, :cond_1d

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberAddedEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addMember(Lio/getstream/chat/android/client/events/MemberAddedEvent;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberAddedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMembership(Lio/getstream/chat/android/models/Member;)V

    return-void

    :cond_1d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    if-eqz v2, :cond_1e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMember(Lio/getstream/chat/android/models/Member;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberUpdatedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMembership(Lio/getstream/chat/android/models/Member;)V

    return-void

    :cond_1e
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    if-eqz v2, :cond_1f

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/MemberRemovedEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMember(Lio/getstream/chat/android/client/events/MemberRemovedEvent;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MemberRemovedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Member;->getUserId()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3e

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMembership()V

    return-void

    :cond_1f
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    if-eqz v2, :cond_20

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationAddedToChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMembers(Ljava/util/List;)V

    return-void

    :cond_20
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    if-eqz v2, :cond_21

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getMemberCount()I

    move-result v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMemberCount(I)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getMembers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMembers(Ljava/util/List;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Channel;->getWatchers()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationRemovedFromChannelEvent;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getWatcherCount()I

    move-result v1

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setWatchers(Ljava/util/List;I)V

    return-void

    :cond_21
    instance-of v2, v1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    if-eqz v2, :cond_22

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/UserStartWatchingEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->addWatcher(Lio/getstream/chat/android/client/events/UserStartWatchingEvent;)V

    return-void

    :cond_22
    instance-of v2, v1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    if-eqz v2, :cond_23

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/UserStopWatchingEvent;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeWatcher(Lio/getstream/chat/android/client/events/UserStopWatchingEvent;)V

    return-void

    :cond_23
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUpdatedEvent;

    if-eqz v2, :cond_24

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_24
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUpdatedByUserEvent;

    if-eqz v2, :cond_25

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_25
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    const/4 v5, 0x1

    const/4 v6, 0x2

    if-eqz v2, :cond_26

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v2, v5}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getClearHistory()Z

    move-result v2

    if-eqz v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelHiddenEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-static {v2, v1, v4, v6, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    return-void

    :cond_26
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelVisibleEvent;

    if-eqz v2, :cond_27

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setHidden(Z)V

    return-void

    :cond_27
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    if-eqz v2, :cond_28

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    invoke-static {v2, v3, v4, v6, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteChannel(Ljava/util/Date;)V

    return-void

    :cond_28
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    if-eqz v2, :cond_29

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/ChannelTruncatedEvent;->getMessage()Lio/getstream/chat/android/models/Message;

    move-result-object v3

    invoke-virtual {v2, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore(Ljava/util/Date;Lio/getstream/chat/android/models/Message;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_29
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    if-eqz v2, :cond_2a

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationChannelTruncatedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object v3

    invoke-static {v2, v3, v4, v6, v4}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMessagesBefore$default(Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;Ljava/util/Date;Lio/getstream/chat/android/models/Message;ILjava/lang/Object;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_2a
    instance-of v2, v1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    if-eqz v2, :cond_2b

    check-cast v1, Lio/getstream/chat/android/client/events/TypingStartEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStartEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->processEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    return-void

    :cond_2b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    if-eqz v2, :cond_2c

    check-cast v1, Lio/getstream/chat/android/client/events/TypingStopEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStopEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v2

    invoke-virtual {v2}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->typingEventPruner:Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/TypingStopEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/TypingEventPruner;->processEvent(Ljava/lang/String;Lio/getstream/chat/android/client/events/TypingStartEvent;)V

    return-void

    :cond_2c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    if-eqz v2, :cond_2d

    check-cast v1, Lio/getstream/chat/android/client/events/MessageReadEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/MessageReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v2

    if-nez v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MessageReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_2d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    if-eqz v2, :cond_2e

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;->getThread()Lio/getstream/chat/android/models/ThreadInfo;

    move-result-object v2

    if-nez v2, :cond_3e

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_2e
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    if-eqz v2, :cond_2f

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/NotificationMarkUnreadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_2f
    instance-of v2, v1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    if-eqz v2, :cond_30

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/MessageDeliveredEvent;

    invoke-static {v1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MessageDeliveredEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateDelivered(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_30
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    if-eqz v2, :cond_31

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;

    invoke-virtual {v3}, Lio/getstream/chat/android/client/events/NotificationInviteAcceptedEvent;->getMember()Lio/getstream/chat/android/models/Member;

    move-result-object v3

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertMember(Lio/getstream/chat/android/models/Member;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_31
    instance-of v2, v1, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    if-eqz v2, :cond_32

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    move-object v3, v1

    check-cast v3, Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;

    invoke-virtual {v2, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->removeMember(Lio/getstream/chat/android/client/events/NotificationInviteRejectedEvent;)V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/HasChannel;

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateChannelData(Lio/getstream/chat/android/client/events/HasChannel;)V

    return-void

    :cond_32
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    if-eqz v2, :cond_33

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getExpiration()Ljava/util/Date;

    move-result-object v4

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserBannedEvent;->getShadow()Z

    move-result v1

    invoke-virtual {v2, v3, v5, v4, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMemberBan(Ljava/lang/String;ZLjava/util/Date;Z)V

    return-void

    :cond_33
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    if-eqz v2, :cond_34

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ChannelUserUnbannedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1, v3, v4, v3}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMemberBan(Ljava/lang/String;ZLjava/util/Date;Z)V

    return-void

    :cond_34
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    if-eqz v2, :cond_35

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/PollClosedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$3;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$3;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollClosedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_35
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    if-eqz v2, :cond_36

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/PollUpdatedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$4;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$4;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/PollUpdatedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_36
    instance-of v2, v1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    if-eqz v2, :cond_37

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/PollDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/PollDeletedEvent;->getPoll()Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deletePoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_37
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    if-eqz v2, :cond_38

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteCastedEvent;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$5;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$5;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteCastedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_38
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    if-eqz v2, :cond_39

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteChangedEvent;

    iget-object v3, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->getCurrentUserId:Lc93/a;

    invoke-interface {v3}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    new-instance v4, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$6;

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v4, v5}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$6;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3, v4}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteChangedEvent;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_39
    instance-of v2, v1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    if-eqz v2, :cond_3a

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/VoteRemovedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$7;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$7;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/VoteRemovedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_3a
    instance-of v2, v1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    if-eqz v2, :cond_3b

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast v1, Lio/getstream/chat/android/client/events/AnswerCastedEvent;

    new-instance v3, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$8;

    iget-object v4, v0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-direct {v3, v4}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl$handleCidEvent$8;-><init>(Ljava/lang/Object;)V

    invoke-static {v1, v3}, Lio/getstream/chat/android/client/extensions/internal/PollKt;->processPoll(Lio/getstream/chat/android/client/events/AnswerCastedEvent;Lkotlin/jvm/functions/Function1;)Lio/getstream/chat/android/models/Poll;

    move-result-object v1

    invoke-virtual {v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertPoll(Lio/getstream/chat/android/models/Poll;)V

    return-void

    :cond_3b
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    if-eqz v2, :cond_3c

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderCreatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V

    return-void

    :cond_3c
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    if-eqz v2, :cond_3d

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderUpdatedEvent;->getReminder()Lio/getstream/chat/android/models/MessageReminder;

    move-result-object v1

    invoke-direct {v0, v2, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V

    return-void

    :cond_3d
    instance-of v2, v1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    if-eqz v2, :cond_3e

    check-cast v1, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/events/ReminderDeletedEvent;->getMessageId()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->deleteReminder(Ljava/lang/String;)V

    :cond_3e
    :goto_a
    return-void
.end method

.method private static final typingEventPruner$lambda$1(Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;Ljava/util/Map;Lio/getstream/chat/android/models/TypingEvent;)Ll83/a0;
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "typingEvent"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setTyping(Lio/getstream/chat/android/models/TypingEvent;)V

    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->globalState:Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->cid:Ljava/lang/String;

    invoke-virtual {p1, p0, p2}, Lio/getstream/chat/android/client/internal/state/plugin/state/global/internal/MutableGlobalState;->tryEmitTypingEvent(Ljava/lang/String;Lio/getstream/chat/android/models/TypingEvent;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final updateMessageWithReaction(Lio/getstream/chat/android/models/Message;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    new-instance v1, Lio/getstream/chat/android/client/api2/d;

    const/4 v2, 0x7

    invoke-direct {v1, v2}, Lio/getstream/chat/android/client/api2/d;-><init>(I)V

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageFromEvent(Lio/getstream/chat/android/models/Message;Lc93/m;)V

    return-void
.end method

.method private static final updateMessageWithReaction$lambda$6(Lio/getstream/chat/android/models/Message;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 53

    const-string v0, "old"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "new"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Message;->getOwnReactions()Ljava/util/List;

    move-result-object v19

    const v51, 0xffff

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const v50, -0x20001

    move-object/from16 v1, p1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method

.method private final updateReminder(Ljava/lang/String;Lio/getstream/chat/android/models/MessageReminder;)V
    .locals 3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    new-instance v1, Lhb2/c;

    const/16 v2, 0x12

    invoke-direct {v1, p2, v2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateMessageById(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final updateReminder$lambda$4(Lio/getstream/chat/android/models/MessageReminder;Lio/getstream/chat/android/models/Message;)Lio/getstream/chat/android/models/Message;
    .locals 53

    const-string v0, "message"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lio/getstream/chat/android/client/extensions/internal/MessageReminderKt;->toMessageReminderInfo(Lio/getstream/chat/android/models/MessageReminder;)Lio/getstream/chat/android/models/MessageReminderInfo;

    move-result-object v46

    const v51, 0xefff

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

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, -0x1

    invoke-static/range {v1 .. v52}, Lio/getstream/chat/android/models/Message;->copy$default(Lio/getstream/chat/android/models/Message;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lio/getstream/chat/android/models/SyncStatus;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/Map;ZZLjava/util/Map;ZLio/getstream/chat/android/models/ChannelInfo;Lio/getstream/chat/android/models/Message;Ljava/lang/String;ZLjava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/User;Ljava/util/List;ZZLio/getstream/chat/android/models/MessageModerationDetails;Lio/getstream/chat/android/models/Moderation;Ljava/util/Date;Lio/getstream/chat/android/models/Poll;Ljava/util/List;Lio/getstream/chat/android/models/MessageReminderInfo;Lio/getstream/chat/android/models/Location;Ljava/lang/String;ZIILjava/lang/Object;)Lio/getstream/chat/android/models/Message;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final handle(Lio/getstream/chat/android/client/events/ChatEvent;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lio/getstream/chat/android/client/events/CidEvent;

    if-eqz v0, :cond_0

    check-cast p1, Lio/getstream/chat/android/client/events/CidEvent;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->handleCidEvent(Lio/getstream/chat/android/client/events/CidEvent;)V

    return-void

    :cond_0
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast p1, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserPresenceChangedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertUserPresence(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_1
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast p1, Lio/getstream/chat/android/client/events/UserUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserUpdatedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->upsertUserPresence(Lio/getstream/chat/android/models/User;)V

    return-void

    :cond_2
    instance-of v0, p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast p1, Lio/getstream/chat/android/client/events/MarkAllReadEvent;

    invoke-static {p1}, Lio/getstream/chat/android/client/internal/state/event/handler/internal/utils/ChatEventUtilsKt;->toChannelUserRead(Lio/getstream/chat/android/client/events/MarkAllReadEvent;)Lio/getstream/chat/android/models/ChannelUserRead;

    move-result-object p1

    invoke-virtual {v0, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->updateRead(Lio/getstream/chat/android/models/ChannelUserRead;)V

    return-void

    :cond_3
    instance-of v0, p1, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    if-eqz v0, :cond_8

    check-cast p1, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/NotificationChannelMutesUpdatedEvent;->getMe()Lio/getstream/chat/android/models/User;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/models/User;->getChannelMutes()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_4

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_1

    :cond_4
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_5
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/ChannelMute;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/ChannelMute;->getChannel()Lio/getstream/chat/android/models/Channel;

    move-result-object v0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_6
    const/4 v0, 0x0

    :goto_0
    iget-object v2, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->cid:Ljava/lang/String;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/4 v1, 0x1

    :cond_7
    :goto_1
    iget-object p1, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    invoke-virtual {p1, v1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->setMuted(Z)V

    return-void

    :cond_8
    instance-of v0, p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/plugin/logic/channel/internal/ChannelEventHandlerImpl;->state:Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;

    check-cast p1, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getHardDelete()Z

    move-result v2

    invoke-virtual {p1}, Lio/getstream/chat/android/client/events/UserMessagesDeletedEvent;->getCreatedAt()Ljava/util/Date;

    move-result-object p1

    invoke-virtual {v0, v1, v2, p1}, Lio/getstream/chat/android/client/internal/state/plugin/state/channel/internal/ChannelStateImpl;->deleteMessagesFromUser(Ljava/lang/String;ZLjava/util/Date;)V

    :cond_9
    return-void
.end method
