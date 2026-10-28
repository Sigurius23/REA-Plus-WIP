.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/ErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;
.implements Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\'\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\n\u0010\u000bJ6\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\r0\u00122\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0096\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014JV\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00122\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u000c2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u000f0\u00182\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u001b0\u001aH\u0096\u0001\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJt\u0010(\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u00180\u00122\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u001f0\u00180\u000c2\u0006\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u000f2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u000c\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\u001f0%2\u000c\u0010\'\u001a\u0008\u0012\u0004\u0012\u00020\u001f0\u0018H\u0096\u0001\u00a2\u0006\u0004\u0008(\u0010)JD\u00101\u001a\u0008\u0012\u0004\u0012\u00020*0\u00122\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020*0\u000c2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0096\u0001\u00a2\u0006\u0004\u00081\u00102R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u00103R\u0014\u0010\u0007\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u00104R\u0014\u0010\u0008\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u00105R\u0014\u0010\t\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u00106R\u0014\u00109\u001a\u00020 8VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u00108\u00a8\u0006:"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/ErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "deleteReactionErrorHandler",
        "createChannelErrorHandler",
        "queryMembersErrorHandler",
        "sendReactionErrorHandler",
        "<init>",
        "(Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;)V",
        "Lo23/d;",
        "Lio/getstream/chat/android/models/Message;",
        "originalCall",
        "",
        "cid",
        "messageId",
        "Lo23/q;",
        "onDeleteReactionError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;",
        "Lio/getstream/chat/android/models/Channel;",
        "channelType",
        "channelId",
        "",
        "memberIds",
        "",
        "",
        "extraData",
        "onCreateChannelError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;",
        "Lio/getstream/chat/android/models/Member;",
        "",
        "offset",
        "limit",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "members",
        "onQueryMembersError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;",
        "Lio/getstream/chat/android/models/Reaction;",
        "reaction",
        "",
        "enforceUnique",
        "skipPush",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "onSendReactionError",
        "(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;",
        "Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;",
        "Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;",
        "getPriority",
        "()I",
        "priority",
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
.field private final createChannelErrorHandler:Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;

.field private final deleteReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;

.field private final queryMembersErrorHandler:Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;

.field private final sendReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;)V
    .locals 1

    const-string v0, "deleteReactionErrorHandler"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "createChannelErrorHandler"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "queryMembersErrorHandler"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sendReactionErrorHandler"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->deleteReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->createChannelErrorHandler:Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->queryMembersErrorHandler:Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;

    iput-object p4, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->sendReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;

    return-void
.end method


# virtual methods
.method public final getPriority()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final onCreateChannelError(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberIds"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "extraData"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->createChannelErrorHandler:Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/errorhandler/CreateChannelErrorHandler;->onCreateChannelError(Lo23/d;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lo23/q;

    move-result-object p1

    return-object p1
.end method

.method public final onDeleteReactionError(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->deleteReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;

    invoke-interface {v0, p1, p2, p3}, Lio/getstream/chat/android/client/errorhandler/DeleteReactionErrorHandler;->onDeleteReactionError(Lo23/d;Ljava/lang/String;Ljava/lang/String;)Lo23/q;

    move-result-object p1

    return-object p1
.end method

.method public final onQueryMembersError(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "II",
            "Lio/getstream/chat/android/models/FilterObject;",
            "Lio/getstream/chat/android/models/querysort/QuerySorter<",
            "Lio/getstream/chat/android/models/Member;",
            ">;",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;)",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelType"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "filter"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->queryMembersErrorHandler:Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p4

    move v6, p5

    invoke-interface/range {v1 .. v9}, Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;->onQueryMembersError(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;

    move-result-object p1

    return-object p1
.end method

.method public final onSendReactionError(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo23/d;",
            "Lio/getstream/chat/android/models/Reaction;",
            "ZZ",
            "Lio/getstream/chat/android/models/User;",
            ")",
            "Lo23/q;"
        }
    .end annotation

    const-string v0, "originalCall"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "reaction"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/StateErrorHandler;->sendReactionErrorHandler:Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    invoke-interface/range {v1 .. v6}, Lio/getstream/chat/android/client/errorhandler/SendReactionErrorHandler;->onSendReactionError(Lo23/d;Lio/getstream/chat/android/models/Reaction;ZZLio/getstream/chat/android/models/User;)Lo23/q;

    move-result-object p1

    return-object p1
.end method
