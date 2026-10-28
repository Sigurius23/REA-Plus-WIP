.class public abstract Lx90/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a!\u0010\u0004\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001f\u0010\u0006\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0005\"\u001b\u0010\n\u001a\u00020\u0007*\u0008\u0012\u0004\u0012\u00020\u00010\u00008F\u00a2\u0006\u0006\u001a\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "Lcom/whoop/activitysession/PauseSegment;",
        "",
        "sessionElapsedMs",
        "c",
        "(Ljava/util/List;J)J",
        "a",
        "",
        "b",
        "(Ljava/util/List;)Z",
        "isCurrentlyPaused",
        "activity-session_release"
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
.method public static final a(Ljava/util/List;J)J
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;J)J"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/16 v0, 0x0

    cmp-long v2, p1, v0

    if-gez v2, :cond_0

    move-wide v2, v0

    goto :goto_0

    :cond_0
    move-wide v2, p1

    :goto_0
    invoke-static {p0, p1, p2}, Lx90/h;->c(Ljava/util/List;J)J

    move-result-wide p0

    sub-long/2addr v2, p0

    cmp-long p0, v2, v0

    if-gez p0, :cond_1

    return-wide v0

    :cond_1
    return-wide v2
.end method

.method public static final b(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;)Z"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p0}, Lm83/s;->P0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/activitysession/PauseSegment;

    invoke-virtual {p0}, Lcom/whoop/activitysession/PauseSegment;->getEndTimeMs()Ljava/lang/Long;

    move-result-object p0

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private static final c(Ljava/util/List;J)J
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;J)J"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const-wide/16 v0, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/activitysession/PauseSegment;

    invoke-virtual {v2}, Lcom/whoop/activitysession/PauseSegment;->getEndTimeMs()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    move-result-wide v3

    goto :goto_1

    :cond_0
    move-wide v3, p1

    :goto_1
    invoke-virtual {v2}, Lcom/whoop/activitysession/PauseSegment;->getStartTimeMs()J

    move-result-wide v5

    sub-long/2addr v3, v5

    add-long/2addr v0, v3

    goto :goto_0

    :cond_1
    return-wide v0
.end method
