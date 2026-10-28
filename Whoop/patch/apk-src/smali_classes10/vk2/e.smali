.class public abstract Lvk2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001b\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Lvk2/b;",
        "",
        "sessionElapsedMs",
        "c",
        "(Lvk2/b;J)Lvk2/b;",
        "d",
        "track-activity_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final synthetic a(Lvk2/b;J)Lvk2/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lvk2/e;->c(Lvk2/b;J)Lvk2/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lvk2/b;J)Lvk2/b;
    .locals 0

    invoke-static {p0, p1, p2}, Lvk2/e;->d(Lvk2/b;J)Lvk2/b;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lvk2/b;J)Lvk2/b;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lx90/h;->b(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_0
    invoke-virtual/range {p0 .. p0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    new-instance v1, Lcom/whoop/activitysession/PauseSegment;

    const/4 v5, 0x2

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-wide/from16 v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/whoop/activitysession/PauseSegment;-><init>(JLjava/lang/Long;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    const/16 v15, 0x3f7

    const/16 v16, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v16}, Lvk2/b;->b(Lvk2/b;JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;ZILjava/lang/Object;)Lvk2/b;

    move-result-object v0

    return-object v0
.end method

.method private static final d(Lvk2/b;J)Lvk2/b;
    .locals 17

    invoke-virtual/range {p0 .. p0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/activitysession/PauseSegment;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/whoop/activitysession/PauseSegment;->getEndTimeMs()Ljava/lang/Long;

    move-result-object v1

    if-nez v1, :cond_0

    :goto_0
    move-object v1, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    if-nez v1, :cond_1

    goto :goto_2

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lvk2/b;->f()Ljava/util/List;

    move-result-object v0

    const/4 v2, 0x1

    invoke-static {v2, v0}, Lm83/s;->A0(ILjava/util/List;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    invoke-static/range {p1 .. p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-wide/16 v2, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/activitysession/PauseSegment;->copy$default(Lcom/whoop/activitysession/PauseSegment;JLjava/lang/Long;ILjava/lang/Object;)Lcom/whoop/activitysession/PauseSegment;

    move-result-object v1

    invoke-static {v1, v0}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object v8

    const/16 v15, 0x3f7

    const/16 v16, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v16}, Lvk2/b;->b(Lvk2/b;JJLjava/lang/String;Ljava/util/List;Lmk2/e;Lwk2/b;Lwk2/k;Lxk2/f;Lwk2/f;ZILjava/lang/Object;)Lvk2/b;

    move-result-object v0

    return-object v0

    :cond_2
    :goto_2
    return-object p0
.end method
