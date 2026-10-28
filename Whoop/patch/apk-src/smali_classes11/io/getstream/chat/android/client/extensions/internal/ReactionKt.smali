.class public final Lio/getstream/chat/android/client/extensions/internal/ReactionKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u001a3\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a1\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001f\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\n\u0010\r\u001a\u0006\u0012\u0002\u0008\u00030\u000cH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u001b\u0010\u0012\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u001a3\u0010\u0019\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "",
        "Lio/getstream/chat/android/models/Reaction;",
        "",
        "",
        "Lio/getstream/chat/android/models/User;",
        "userMap",
        "updateByUsers",
        "(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Collection;",
        "recentReactions",
        "cachedReactions",
        "mergeReactions",
        "(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;",
        "Ln23/h;",
        "result",
        "updateSyncStatus",
        "(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;",
        "Ln23/e;",
        "error",
        "updateFailedReactionSyncStatus",
        "(Lio/getstream/chat/android/models/Reaction;Ln23/e;)Lio/getstream/chat/android/models/Reaction;",
        "currentUser",
        "",
        "isOnline",
        "enforceUnique",
        "skipPush",
        "enrichWithDataBeforeSending",
        "(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;",
        "stream-chat-android-client_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final enrichWithDataBeforeSending(Lio/getstream/chat/android/models/Reaction;Lio/getstream/chat/android/models/User;ZZZ)Lio/getstream/chat/android/models/Reaction;
    .locals 18
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "currentUser"

    move-object/from16 v5, p1

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v6

    if-eqz p2, :cond_0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->IN_PROGRESS:Lio/getstream/chat/android/models/SyncStatus;

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :goto_1
    const/16 v16, 0x25e7

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    move/from16 v13, p3

    move/from16 v14, p4

    invoke-static/range {v1 .. v17}, Lio/getstream/chat/android/models/Reaction;->copy$default(Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    return-object v0
.end method

.method public static final mergeReactions(Ljava/util/Collection;Ljava/util/Collection;)Ljava/util/Collection;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;)",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "recentReactions"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cachedReactions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Iterable;

    const/16 v0, 0xa

    invoke-static {p1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-static {v1}, Lm83/g0;->W(I)I

    move-result v1

    const/16 v2, 0x10

    if-ge v1, v2, :cond_0

    move v1, v2

    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v4, v1

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p1

    invoke-static {p1}, Lm83/g0;->W(I)I

    move-result p1

    if-ge p1, v2, :cond_2

    goto :goto_1

    :cond_2
    move v2, p1

    :goto_1
    new-instance p1, Ljava/util/LinkedHashMap;

    invoke-direct {p1, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Reaction;->getType()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    invoke-static {v3, p1}, Lm83/g0;->d0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    move-result-object p0

    return-object p0
.end method

.method public static final updateByUsers(Ljava/util/Collection;Ljava/util/Map;)Ljava/util/Collection;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lio/getstream/chat/android/models/User;",
            ">;)",
            "Ljava/util/Collection<",
            "Lio/getstream/chat/android/models/Reaction;",
            ">;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v2, "<this>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "userMap"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v2, v0

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_0
    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v5}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    invoke-interface {v3, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_3

    return-object v0

    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v1, v4}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    new-instance v0, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_9

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lio/getstream/chat/android/models/Reaction;

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    if-eqz v3, :cond_5

    invoke-virtual {v3}, Lio/getstream/chat/android/models/User;->getId()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_6

    :cond_5
    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v3

    :cond_6
    invoke-interface {v1, v3}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getUserId()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lio/getstream/chat/android/models/User;

    if-nez v3, :cond_7

    invoke-virtual {v4}, Lio/getstream/chat/android/models/Reaction;->getUser()Lio/getstream/chat/android/models/User;

    move-result-object v3

    :cond_7
    move-object v8, v3

    const/16 v19, 0x3ff7

    const/16 v20, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

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

    invoke-static/range {v4 .. v20}, Lio/getstream/chat/android/models/Reaction;->copy$default(Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v4

    :cond_8
    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_9
    return-object v0
.end method

.method private static final updateFailedReactionSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/e;)Lio/getstream/chat/android/models/Reaction;
    .locals 18

    invoke-static/range {p1 .. p1}, Lio/getstream/chat/android/client/errors/ChatErrorKt;->isPermanent(Ln23/e;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->FAILED_PERMANENTLY:Lio/getstream/chat/android/models/SyncStatus;

    :goto_0
    move-object v11, v0

    goto :goto_1

    :cond_0
    sget-object v0, Lio/getstream/chat/android/models/SyncStatus;->SYNC_NEEDED:Lio/getstream/chat/android/models/SyncStatus;

    goto :goto_0

    :goto_1
    const/16 v16, 0x3dff

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v1, p0

    invoke-static/range {v1 .. v17}, Lio/getstream/chat/android/models/Reaction;->copy$default(Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    return-object v0
.end method

.method public static final updateSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/h;)Lio/getstream/chat/android/models/Reaction;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Reaction;",
            "Ln23/h;",
            ")",
            "Lio/getstream/chat/android/models/Reaction;"
        }
    .end annotation

    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    const-string v2, "<this>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "result"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v2, v0, Ln23/g;

    if-eqz v2, :cond_0

    sget-object v11, Lio/getstream/chat/android/models/SyncStatus;->COMPLETED:Lio/getstream/chat/android/models/SyncStatus;

    const/16 v16, 0x3dff

    const/16 v17, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v1 .. v17}, Lio/getstream/chat/android/models/Reaction;->copy$default(Lio/getstream/chat/android/models/Reaction;Ljava/lang/String;Ljava/lang/String;ILio/getstream/chat/android/models/User;Ljava/lang/String;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Lio/getstream/chat/android/models/SyncStatus;Ljava/util/Map;ZZLjava/lang/String;ILjava/lang/Object;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    return-object v0

    :cond_0
    instance-of v2, v0, Ln23/f;

    if-eqz v2, :cond_1

    check-cast v0, Ln23/f;

    iget-object v0, v0, Ln23/f;->a:Ln23/e;

    invoke-static {v1, v0}, Lio/getstream/chat/android/client/extensions/internal/ReactionKt;->updateFailedReactionSyncStatus(Lio/getstream/chat/android/models/Reaction;Ln23/e;)Lio/getstream/chat/android/models/Reaction;

    move-result-object v0

    return-object v0

    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
