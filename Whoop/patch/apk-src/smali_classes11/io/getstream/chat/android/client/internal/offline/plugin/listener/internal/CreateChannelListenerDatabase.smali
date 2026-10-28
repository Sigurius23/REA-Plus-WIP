.class public final Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001e\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ0\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J<\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000c2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0019H\u0096@\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ5\u0010\u001e\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u00192\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001a\u00020\u00102\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u00100\u000cH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0005\u0010!R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\"\u00a8\u0006#"
    }
    d2 = {
        "Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;",
        "Lio/getstream/chat/android/client/plugin/listeners/CreateChannelListener;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "clientState",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "channelRepository",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
        "userRepository",
        "<init>",
        "(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V",
        "Lio/getstream/chat/android/client/query/CreateChannelParams;",
        "params",
        "",
        "Lio/getstream/chat/android/models/Member;",
        "getMembers",
        "(Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;",
        "",
        "channelType",
        "channelId",
        "Lio/getstream/chat/android/models/User;",
        "currentUser",
        "Ll83/a0;",
        "onCreateChannelRequest",
        "(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;",
        "memberIds",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Channel;",
        "result",
        "onCreateChannelResult",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;",
        "onCreateChannelPrecondition",
        "(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;",
        "Lio/getstream/chat/android/client/setup/state/ClientState;",
        "Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;",
        "Lio/getstream/chat/android/client/persistance/repository/UserRepository;",
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

.field private final userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/setup/state/ClientState;Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;Lio/getstream/chat/android/client/persistance/repository/UserRepository;)V
    .locals 1

    const-string v0, "clientState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelRepository"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userRepository"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    iput-object p2, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object p3, p0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    return-void
.end method

.method public static final synthetic access$getMembers(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->getMembers(Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final getMembers(Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Lio/getstream/chat/android/models/Member;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;

    iget v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;

    invoke-direct {v2, v0, v1}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->label:I

    const/4 v5, 0x1

    const/16 v6, 0xa

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/util/Map;

    iget-object v2, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lio/getstream/chat/android/client/query/CreateChannelParams;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lio/getstream/chat/android/client/query/CreateChannelParams;->getMembers()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-static {v4}, Lm83/g0;->W(I)I

    move-result v4

    const/16 v7, 0x10

    if-ge v4, v7, :cond_3

    move v4, v7

    :cond_3
    new-instance v7, Ljava/util/LinkedHashMap;

    invoke-direct {v7, v4}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v8, v4

    check-cast v8, Lio/getstream/chat/android/models/MemberData;

    invoke-virtual {v8}, Lio/getstream/chat/android/models/MemberData;->getUserId()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_4
    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->userRepository:Lio/getstream/chat/android/client/persistance/repository/UserRepository;

    invoke-virtual {v7}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v4}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v4

    const/4 v8, 0x0

    iput-object v8, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->L$0:Ljava/lang/Object;

    iput-object v7, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->L$1:Ljava/lang/Object;

    iput v5, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$getMembers$1;->label:I

    invoke-interface {v1, v4, v2}, Lio/getstream/chat/android/client/persistance/repository/UserRepository;->selectUsers(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    return-object v3

    :cond_5
    move-object v3, v7

    :goto_2
    check-cast v1, Ljava/util/List;

    invoke-interface {v3}, Ljava/util/Map;->keySet()Ljava/util/Set;

    move-result-object v2

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lio/getstream/chat/android/models/User;

    invoke-virtual {v7}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_6
    invoke-static {v4}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-static {v2, v4}, Ldt/b;->z(Ljava/util/Set;Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v7, Lm83/z;->w:Lm83/z;

    if-eqz v5, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Lio/getstream/chat/android/models/User;

    new-instance v8, Lio/getstream/chat/android/models/Member;

    invoke-virtual {v9}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v3, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/MemberData;

    if-eqz v5, :cond_8

    invoke-virtual {v5}, Lio/getstream/chat/android/models/MemberData;->getExtraData()Ljava/util/Map;

    move-result-object v5

    if-nez v5, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v23, v5

    goto :goto_6

    :cond_8
    :goto_5
    move-object/from16 v23, v7

    :goto_6
    const/16 v24, 0x3ffe

    const/16 v25, 0x0

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

    invoke-direct/range {v8 .. v25}, Lio/getstream/chat/android/models/Member;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_9
    check-cast v2, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v1, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v9, v5

    check-cast v9, Ljava/lang/String;

    new-instance v5, Lio/getstream/chat/android/models/Member;

    new-instance v8, Lio/getstream/chat/android/models/User;

    const v34, 0x1fffffe

    const/16 v35, 0x0

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

    invoke-direct/range {v8 .. v35}, Lio/getstream/chat/android/models/User;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lio/getstream/chat/android/PrivacySettings;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/List;ZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;IIILjava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/lang/Long;Lio/getstream/chat/android/models/PushPreference;Ljava/util/Map;Ljava/util/Date;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lio/getstream/chat/android/models/MemberData;

    if-eqz v6, :cond_b

    invoke-virtual {v6}, Lio/getstream/chat/android/models/MemberData;->getExtraData()Ljava/util/Map;

    move-result-object v6

    if-nez v6, :cond_a

    goto :goto_8

    :cond_a
    move-object/from16 v25, v6

    goto :goto_9

    :cond_b
    :goto_8
    move-object/from16 v25, v7

    :goto_9
    const/16 v26, 0x3ffe

    const/16 v27, 0x0

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

    move-object v10, v5

    move-object v11, v8

    invoke-direct/range {v10 .. v27}, Lio/getstream/chat/android/models/Member;-><init>(Lio/getstream/chat/android/models/User;Ljava/util/Date;Ljava/util/Date;Ljava/lang/Boolean;Ljava/util/Date;Ljava/util/Date;ZZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_c
    invoke-static {v4, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    return-object v1
.end method


# virtual methods
.method public final onCreateChannelPrecondition(Lio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/List;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/User;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "memberIds"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Either channelId or memberIds cannot be empty!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_0
    if-nez p1, :cond_1

    new-instance p1, Ln23/f;

    new-instance p2, Ln23/a;

    const-string p3, "Current user is null!"

    invoke-direct {p2, p3}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1

    :cond_1
    new-instance p1, Ln23/g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-direct {p1, p2}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p1
.end method

.method public final onCreateChannelRequest(Ljava/lang/String;Ljava/lang/String;Lio/getstream/chat/android/client/query/CreateChannelParams;Lio/getstream/chat/android/models/User;Lq83/d;)Ljava/lang/Object;
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/client/query/CreateChannelParams;",
            "Lio/getstream/chat/android/models/User;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    move-object/from16 v2, p5

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->label:I

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v5, :cond_3

    if-eq v5, v7, :cond_2

    if-ne v5, v6, :cond_1

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$3:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/User;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$2:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_9

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$3:Ljava/lang/Object;

    check-cast v5, Lio/getstream/chat/android/models/User;

    iget-object v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$2:Ljava/lang/Object;

    check-cast v7, Lio/getstream/chat/android/client/query/CreateChannelParams;

    iget-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, v1

    move-object/from16 v26, v5

    move-object v1, v7

    move-object v11, v9

    goto :goto_1

    :cond_3
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/client/query/CreateChannelParams;->getMemberIds()Ljava/util/List;

    move-result-object v2

    move-object/from16 v5, p2

    invoke-static {v5, v2}, Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;->generateChannelIdIfNeeded(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, p1

    iput-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$1:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$2:Ljava/lang/Object;

    move-object/from16 v9, p4

    iput-object v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$3:Ljava/lang/Object;

    iput-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$4:Ljava/lang/Object;

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->label:I

    invoke-direct {v0, v1, v3}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->getMembers(Lio/getstream/chat/android/client/query/CreateChannelParams;Lq83/d;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_4

    goto/16 :goto_8

    :cond_4
    move-object v10, v2

    move-object v11, v5

    move-object v2, v7

    move-object/from16 v26, v9

    :goto_1
    move-object/from16 v22, v2

    check-cast v22, Ljava/util/List;

    invoke-virtual {v1}, Lio/getstream/chat/android/client/query/CreateChannelParams;->getExtraData()Ljava/util/Map;

    move-result-object v2

    invoke-static {v2}, Lm83/g0;->l0(Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object v44

    new-instance v16, Ljava/util/Date;

    invoke-direct/range {v16 .. v16}, Ljava/util/Date;-><init>()V

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->clientState:Lio/getstream/chat/android/client/setup/state/ClientState;

    invoke-interface {v2}, Lio/getstream/chat/android/client/setup/state/ClientState;->isOnline()Z

    move-result v2

    if-eqz v2, :cond_5

    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    :goto_2
    move-object/from16 v19, v2

    goto :goto_3

    :cond_5
    sget-object v2, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_2

    :goto_3
    invoke-virtual {v1}, Lio/getstream/chat/android/client/query/CreateChannelParams;->getExtraData()Ljava/util/Map;

    move-result-object v2

    const-string v5, "name"

    invoke-interface {v2, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v5, v2, Ljava/lang/String;

    if-eqz v5, :cond_6

    check-cast v2, Ljava/lang/String;

    goto :goto_4

    :cond_6
    move-object v2, v8

    :goto_4
    const-string v5, ""

    if-nez v2, :cond_7

    move-object v12, v5

    goto :goto_5

    :cond_7
    move-object v12, v2

    :goto_5
    invoke-virtual {v1}, Lio/getstream/chat/android/client/query/CreateChannelParams;->getExtraData()Ljava/util/Map;

    move-result-object v1

    const-string v2, "image"

    invoke-interface {v1, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Ljava/lang/String;

    if-eqz v2, :cond_8

    check-cast v1, Ljava/lang/String;

    goto :goto_6

    :cond_8
    move-object v1, v8

    :goto_6
    if-nez v1, :cond_9

    move-object v13, v5

    goto :goto_7

    :cond_9
    move-object v13, v1

    :goto_7
    new-instance v9, Lio/getstream/chat/android/models/Channel;

    const/16 v46, 0x3

    const/16 v47, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

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

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const v45, -0x11250

    invoke-direct/range {v9 .. v47}, Lio/getstream/chat/android/models/Channel;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v1, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$0:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$1:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$2:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$3:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$4:Ljava/lang/Object;

    iput-object v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->L$5:Ljava/lang/Object;

    iput v6, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelRequest$1;->label:I

    invoke-interface {v1, v9, v3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    :goto_8
    return-object v4

    :cond_a
    :goto_9
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method

.method public final onCreateChannelResult(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ln23/h;Lq83/d;)Ljava/lang/Object;
    .locals 51
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;",
            "Ln23/h;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v2, p5

    instance-of v3, v2, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;

    iget v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;

    invoke-direct {v3, v0, v2}, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;-><init>(Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;Lq83/d;)V

    :goto_0
    iget-object v2, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->result:Ljava/lang/Object;

    sget-object v4, Lr83/a;->w:Lr83/a;

    iget v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    const/4 v7, 0x4

    const/4 v8, 0x3

    const/4 v9, 0x2

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eqz v5, :cond_5

    if-eq v5, v10, :cond_4

    if-eq v5, v9, :cond_1

    if-eq v5, v8, :cond_3

    if-ne v5, v7, :cond_2

    :cond_1
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v6

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast v1, Ln23/h;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_4
    iget-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$5:Ljava/lang/Object;

    check-cast v1, Lio/getstream/chat/android/models/Channel;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ln23/h;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ljava/util/List;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_1

    :cond_5
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-static/range {p2 .. p3}, Lio/getstream/chat/android/client/utils/channel/ChannelUtilsKt;->generateChannelIdIfNeeded(Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;

    move-result-object v2

    const-string v5, ":"

    move-object/from16 v12, p1

    invoke-static {v12, v5, v2}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    instance-of v5, v1, Ln23/g;

    if-eqz v5, :cond_7

    check-cast v1, Ln23/g;

    iget-object v1, v1, Ln23/g;->a:Ljava/lang/Object;

    move-object v12, v1

    check-cast v12, Lio/getstream/chat/android/models/Channel;

    sget-object v22, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const/16 v49, 0x7

    const/16 v50, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

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

    const/16 v48, -0x201

    invoke-static/range {v12 .. v50}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Channel;->getCid()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$5:Ljava/lang/Object;

    iput v10, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    invoke-interface {v5, v2, v3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->deleteChannel(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_1
    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$5:Ljava/lang/Object;

    iput v9, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    goto/16 :goto_5

    :cond_7
    instance-of v5, v1, Ln23/f;

    if-eqz v5, :cond_b

    iget-object v5, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    invoke-static {v2}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v1, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    iput v8, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    invoke-interface {v5, v2, v3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->selectChannels(Ljava/util/List;Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_8

    goto/16 :goto_5

    :cond_8
    :goto_2
    check-cast v2, Ljava/util/List;

    invoke-static {v2}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v2

    move-object v12, v2

    check-cast v12, Lio/getstream/chat/android/models/Channel;

    if-eqz v12, :cond_a

    iget-object v2, v0, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase;->channelRepository:Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;

    check-cast v1, Ln23/f;

    iget-object v1, v1, Ln23/f;->a:Ln23/e;

    invoke-static {v1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    :goto_3
    move-object/from16 v22, v1

    goto :goto_4

    :cond_9
    sget-object v1, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_3

    :goto_4
    const/16 v49, 0x7

    const/16 v50, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

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

    const/16 v48, -0x201

    invoke-static/range {v12 .. v50}, Lio/getstream/chat/android/models/Channel;->copy$default(Lio/getstream/chat/android/models/Channel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZLjava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;ILjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lio/getstream/chat/android/models/Config;Lio/getstream/chat/android/models/User;ILjava/lang/String;Ljava/lang/Boolean;Ljava/util/Date;ILjava/util/List;Ljava/util/List;Ljava/util/Set;Lio/getstream/chat/android/models/Member;Ljava/util/List;ZLio/getstream/chat/android/models/DraftMessage;Ljava/util/List;Ljava/lang/Integer;Lio/getstream/chat/android/models/PushPreference;Ljava/util/List;Ljava/util/Date;Ljava/util/Map;IILjava/lang/Object;)Lio/getstream/chat/android/models/Channel;

    move-result-object v1

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$0:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$1:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$2:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$3:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$4:Ljava/lang/Object;

    iput-object v11, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->L$5:Ljava/lang/Object;

    const/4 v5, 0x0

    iput v5, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->I$0:I

    iput v7, v3, Lio/getstream/chat/android/client/internal/offline/plugin/listener/internal/CreateChannelListenerDatabase$onCreateChannelResult$1;->label:I

    invoke-interface {v2, v1, v3}, Lio/getstream/chat/android/client/persistance/repository/ChannelRepository;->insertChannel(Lio/getstream/chat/android/models/Channel;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v4, :cond_a

    :goto_5
    return-object v4

    :cond_a
    return-object v6

    :cond_b
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
.end method
