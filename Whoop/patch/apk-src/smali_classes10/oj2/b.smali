.class public abstract Loj2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a)\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "",
        "Lcom/whoop/stress/domain/BreathingEvent;",
        "breathingEvents",
        "Lorg/joda/time/DateTime;",
        "finalBreathingEventUpperTime",
        "a",
        "(Ljava/util/List;Lorg/joda/time/DateTime;)Ljava/util/List;",
        "stress_release"
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
.method public static final a(Ljava/util/List;Lorg/joda/time/DateTime;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;",
            "Lorg/joda/time/DateTime;",
            ")",
            "Ljava/util/List<",
            "Lcom/whoop/stress/domain/BreathingEvent;",
            ">;"
        }
    .end annotation

    const-string v0, "breathingEvents"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "finalBreathingEventUpperTime"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v2, 0x0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_1

    check-cast v3, Lcom/whoop/stress/domain/BreathingEvent;

    invoke-static {p0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    if-ne v2, v5, :cond_0

    new-instance v2, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v3}, Lcom/whoop/stress/domain/BreathingEvent;->getTimes()Ljava/lang/String;

    move-result-object v5

    invoke-direct {v2, v5}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Ljava/lang/String;)V

    new-instance v6, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getLower()Lorg/joda/time/DateTime;

    move-result-object v7

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, p1

    invoke-direct/range {v6 .. v12}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Lcom/whoop/data/remote/domain/dto/BoundType;Lcom/whoop/data/remote/domain/dto/BoundType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getDuring()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v3}, Lcom/whoop/stress/domain/BreathingEvent;->getType()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Lcom/whoop/stress/domain/BreathingEvent;

    invoke-direct {v3, p1, v2}, Lcom/whoop/stress/domain/BreathingEvent;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_1

    :cond_0
    move-object v8, p1

    :goto_1
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    move-object p1, v8

    goto :goto_0

    :cond_1
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_2
    return-object v1
.end method
