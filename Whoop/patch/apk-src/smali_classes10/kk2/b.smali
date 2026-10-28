.class public abstract Lkk2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lcom/whoop/activitysession/PauseSegment;",
        "",
        "sessionStartTimeMs",
        "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
        "a",
        "(Ljava/util/List;J)Ljava/util/List;",
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
.method public static final a(Ljava/util/List;J)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/activitysession/PauseSegment;",
            ">;J)",
            "Ljava/util/List<",
            "Lcom/whoop/addactivity/network/CreateActivityPauseSegment;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/activitysession/PauseSegment;

    invoke-virtual {v1}, Lcom/whoop/activitysession/PauseSegment;->getEndTimeMs()Ljava/lang/Long;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/Number;->longValue()J

    move-result-wide v2

    new-instance v4, Lcom/whoop/addactivity/network/CreateActivityPauseSegment;

    invoke-virtual {v1}, Lcom/whoop/activitysession/PauseSegment;->getStartTimeMs()J

    move-result-wide v5

    add-long/2addr v5, p1

    invoke-static {v5, v6}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v1

    const-string v5, "ofEpochMilli(...)"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lkk2/a;->a(Ljava/time/Instant;)Ljava/lang/String;

    move-result-object v1

    add-long/2addr v2, p1

    invoke-static {v2, v3}, Ljava/time/Instant;->ofEpochMilli(J)Ljava/time/Instant;

    move-result-object v2

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lkk2/a;->a(Ljava/time/Instant;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v4, v1, v2}, Lcom/whoop/addactivity/network/CreateActivityPauseSegment;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object v2, v4

    :cond_1
    if-eqz v2, :cond_0

    invoke-interface {v0, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_3

    return-object v0

    :cond_3
    return-object v2
.end method
