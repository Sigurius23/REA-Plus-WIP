.class public final Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJs\u0010\u001a\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\u00192\u0012\u0010\r\u001a\u000e\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u000c0\u000b0\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00162\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u000bH\u0016\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u001eR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;",
        "Lio/getstream/chat/android/client/errorhandler/QueryMembersErrorHandler;",
        "Lbc3/c0;",
        "scope",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "<init>",
        "(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V",
        "Lo23/d;",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "originalCall",
        "",
        "channelType",
        "channelId",
        "",
        "offset",
        "limit",
        "Lio/getstream/chat/android/models/FilterObject;",
        "filter",
        "Lio/getstream/chat/android/models/querysort/QuerySorter;",
        "sort",
        "members",
        "Lo23/q;",
        "onQueryMembersError",
        "(Lo23/d;Ljava/lang/String;Ljava/lang/String;IILio/getstream/chat/android/models/FilterObject;Lio/getstream/chat/android/models/querysort/QuerySorter;Ljava/util/List;)Lo23/q;",
        "Lbc3/c0;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
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
.field private final channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

.field private final clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

.field private final logger$delegate:Ll83/h;

.field private final scope:Lbc3/c0;


# direct methods
.method public constructor <init>(Lbc3/c0;Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;)V
    .locals 1

    const-string v0, "scope"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clientState"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->scope:Lbc3/c0;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    const-string p1, "QueryMembersError"

    invoke-static {p0, p1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->logger$delegate:Ll83/h;

    return-void
.end method

.method public static final synthetic access$getChannelRepository$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    return-object p0
.end method

.method public static final synthetic access$getClientState$p(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lio/getstream/chat/android/client/setup/state/ClientState;
    .locals 0

    iget-object p0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;)Lb23/k;
    .locals 0

    invoke-direct {p0}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->getLogger()Lb23/k;

    move-result-object p0

    return-object p0
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
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

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sort"

    move-object/from16 v7, p7

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "members"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;->scope:Lbc3/c0;

    new-instance v1, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;

    const/4 v9, 0x0

    move-object v2, p0

    move-object v8, p1

    move-object v5, p2

    move-object v6, p3

    move v3, p4

    move v4, p5

    invoke-direct/range {v1 .. v9}, Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl$onQueryMembersError$1;-><init>(Lio/getstream/chat/android/client/internal/state/errorhandler/internal/QueryMembersErrorHandlerImpl;IILjava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/models/querysort/QuerySorter;Lo23/d;Lq83/d;)V

    invoke-static {p1, v0, v1}, Lo23/f;->h(Lo23/d;Lbc3/c0;Lc93/m;)Lo23/q;

    move-result-object p1

    return-object p1
.end method
