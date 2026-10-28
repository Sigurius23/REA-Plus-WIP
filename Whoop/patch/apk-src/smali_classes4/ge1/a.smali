.class public final Lge1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\t\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J1\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J#\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\t2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00110\tH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u001d\u0010\u0019\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\tH\u0002\u00a2\u0006\u0004\u0008\u0019\u0010\u0017J5\u0010\u001d\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ%\u0010!\u001a\u00020\u00152\u000c\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J+\u0010\'\u001a\u0004\u0018\u00010#2\u0008\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010%\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\u0008\'\u0010(J\u0015\u0010*\u001a\u00020)2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008*\u0010+\u00a8\u0006,"
    }
    d2 = {
        "Lge1/a;",
        "",
        "<init>",
        "()V",
        "Lde1/b;",
        "domainState",
        "Lge1/d$e;",
        "i",
        "(Lde1/b;)Lge1/d$e;",
        "",
        "Lc41/r;",
        "activities",
        "",
        "",
        "selectedIds",
        "a",
        "(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;",
        "",
        "d",
        "(Ljava/util/List;)Ljava/util/List;",
        "selectedIndices",
        "",
        "e",
        "(Ljava/util/List;)Z",
        "selectedActivities",
        "b",
        "isConsecutive",
        "maxSelectionExceeded",
        "durationExceeded",
        "c",
        "(Ljava/util/List;ZZZ)Z",
        "",
        "maxDurationHours",
        "f",
        "(Ljava/util/List;J)Z",
        "Lm91/u;",
        "footerState",
        "deleteEnabled",
        "mergeEnabled",
        "g",
        "(Lm91/u;ZZ)Lm91/u;",
        "Lge1/d;",
        "h",
        "(Lde1/b;)Lge1/d;",
        "add-activity_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p1

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lc41/r;

    invoke-virtual {v3}, Lc41/r;->c()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, p2

    invoke-interface {v4, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v15

    const/16 v17, 0x17ff

    const/16 v18, 0x0

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

    const/16 v16, 0x0

    invoke-static/range {v3 .. v18}, Lc41/r;->b(Lc41/r;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Ljava/lang/String;ZLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/models/ActivityTileSelectionState;ZLjava/lang/String;ILjava/lang/Object;)Lc41/r;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    return-object v1
.end method

.method private final b(Ljava/util/List;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;)Z"
        }
    .end annotation

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/lit8 p1, p1, 0x1

    return p1
.end method

.method private final c(Ljava/util/List;ZZZ)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;ZZZ)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    const/4 v0, 0x2

    const/4 v1, 0x0

    if-ge p1, v0, :cond_0

    return v1

    :cond_0
    if-nez p2, :cond_1

    return v1

    :cond_1
    if-eqz p3, :cond_2

    return v1

    :cond_2
    if-eqz p4, :cond_3

    return v1

    :cond_3
    const/4 p1, 0x1

    return p1
.end method

.method private final d(Ljava/util/List;)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    const/4 v4, 0x0

    if-ltz v1, :cond_2

    check-cast v2, Lc41/r;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2}, Lc41/r;->o()Z

    move-result v2

    if-eqz v2, :cond_0

    move-object v4, v1

    :cond_0
    if-eqz v4, :cond_1

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    :cond_1
    move v1, v3

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    throw v4

    :cond_3
    return-object v0
.end method

.method private final e(Ljava/util/List;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/Integer;",
            ">;)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    check-cast p1, Ljava/util/Collection;

    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->a1(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-static {v0}, Lm83/s;->W0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    sub-int/2addr v0, v1

    add-int/2addr v0, v2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result p1

    if-ne v0, p1, :cond_1

    return v2

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method private final f(Ljava/util/List;J)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lc41/r;",
            ">;J)Z"
        }
    .end annotation

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v0

    const/4 v1, 0x2

    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc41/r;

    invoke-virtual {v3}, Lc41/r;->k()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-interface {v0, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    invoke-static {v0}, Lm83/s;->X0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_3

    return v2

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lc41/r;

    invoke-virtual {v3}, Lc41/r;->e()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_4

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_5
    invoke-static {v1}, Lm83/s;->S0(Ljava/lang/Iterable;)Ljava/lang/Comparable;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_6

    return v2

    :cond_6
    :try_start_0
    invoke-static {v0}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    move-result-object v0

    invoke-static {p1}, Ljava/time/Instant;->parse(Ljava/lang/CharSequence;)Ljava/time/Instant;

    move-result-object p1

    invoke-static {v0, p1}, Ljava/time/Duration;->between(Ljava/time/temporal/Temporal;Ljava/time/temporal/Temporal;)Ljava/time/Duration;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    invoke-static {p2, p3}, Ljava/time/Duration;->ofHours(J)Ljava/time/Duration;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/time/Duration;->compareTo(Ljava/time/Duration;)I

    move-result p1

    if-lez p1, :cond_7

    const/4 p1, 0x1

    return p1

    :catch_0
    :cond_7
    return v2
.end method

.method private final g(Lm91/u;ZZ)Lm91/u;
    .locals 33

    move-object/from16 v0, p1

    instance-of v1, v0, Lc41/e5;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lc41/e5;

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object v3, v2

    :goto_0
    if-nez v3, :cond_1

    return-object v0

    :cond_1
    invoke-virtual {v3}, Lc41/e5;->f()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lny0/h;

    if-eqz v1, :cond_2

    check-cast v0, Lny0/h;

    move-object v4, v0

    goto :goto_1

    :cond_2
    move-object v4, v2

    :goto_1
    invoke-virtual {v3}, Lc41/e5;->c()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lny0/h;

    if-eqz v1, :cond_3

    move-object v2, v0

    check-cast v2, Lny0/h;

    :cond_3
    if-eqz v4, :cond_4

    const v30, 0x1feffff

    const/16 v31, 0x0

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

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    move/from16 v21, p2

    invoke-static/range {v4 .. v31}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    if-eqz v0, :cond_4

    :goto_2
    move-object v4, v0

    goto :goto_3

    :cond_4
    invoke-virtual {v3}, Lc41/e5;->f()Lm91/u;

    move-result-object v0

    goto :goto_2

    :goto_3
    if-eqz v2, :cond_5

    const v31, 0x1feffff

    const/16 v32, 0x0

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

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move/from16 v22, p3

    move-object v5, v2

    invoke-static/range {v5 .. v32}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v0

    if-eqz v0, :cond_5

    :goto_4
    move-object v5, v0

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Lc41/e5;->c()Lm91/u;

    move-result-object v0

    goto :goto_4

    :goto_5
    const/4 v7, 0x4

    const/4 v8, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lc41/e5;->b(Lc41/e5;Lm91/u;Lm91/u;ZILjava/lang/Object;)Lc41/e5;

    move-result-object v0

    return-object v0
.end method

.method private final i(Lde1/b;)Lge1/d$e;
    .locals 9

    invoke-virtual {p1}, Lde1/b;->k()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-static {v0}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v0

    invoke-virtual {p1}, Lde1/b;->c()Ljava/util/List;

    move-result-object v1

    invoke-direct {p0, v1, v0}, Lge1/a;->a(Ljava/util/List;Ljava/util/Set;)Ljava/util/List;

    move-result-object v3

    move-object v0, v3

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lc41/r;

    invoke-virtual {v4}, Lc41/r;->o()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-direct {p0, v3}, Lge1/a;->d(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-direct {p0, v0}, Lge1/a;->e(Ljava/util/List;)Z

    move-result v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-virtual {p1}, Lde1/b;->f()I

    move-result v4

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-lt v2, v4, :cond_2

    move v2, v5

    goto :goto_1

    :cond_2
    move v2, v6

    :goto_1
    invoke-virtual {p1}, Lde1/b;->g()J

    move-result-wide v7

    invoke-direct {p0, v1, v7, v8}, Lge1/a;->f(Ljava/util/List;J)Z

    move-result v4

    invoke-direct {p0, v1}, Lge1/a;->b(Ljava/util/List;)Z

    move-result v7

    invoke-direct {p0, v1, v0, v2, v4}, Lge1/a;->c(Ljava/util/List;ZZZ)Z

    move-result v0

    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_4

    :cond_3
    move v5, v6

    goto :goto_2

    :cond_4
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lc41/r;

    invoke-virtual {v8}, Lc41/r;->n()Z

    move-result v8

    if-eqz v8, :cond_5

    :goto_2
    invoke-virtual {p1}, Lde1/b;->d()Lm91/u;

    move-result-object v1

    invoke-direct {p0, v1, v7, v0}, Lge1/a;->g(Lm91/u;ZZ)Lm91/u;

    move-result-object v1

    invoke-virtual {p1}, Lde1/b;->e()Lm91/u;

    move-result-object v6

    const/4 v7, 0x0

    if-eqz v5, :cond_6

    move-object v5, v6

    goto :goto_3

    :cond_6
    move-object v5, v7

    :goto_3
    invoke-virtual {p1}, Lde1/b;->h()Lm91/u;

    move-result-object v6

    if-eqz v4, :cond_7

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    move-object v6, v7

    :goto_4
    invoke-virtual {p1}, Lde1/b;->i()Lm91/u;

    move-result-object v0

    if-eqz v2, :cond_8

    move-object v7, v0

    :cond_8
    invoke-virtual {p1}, Lde1/b;->m()Z

    move-result v8

    new-instance v2, Lge1/d$e;

    move-object v4, v1

    invoke-direct/range {v2 .. v8}, Lge1/d$e;-><init>(Ljava/util/List;Lm91/u;Lm91/u;Lm91/u;Lm91/u;Z)V

    return-object v2
.end method


# virtual methods
.method public final h(Lde1/b;)Lge1/d;
    .locals 2

    const-string v0, "domainState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lde1/b;->j()Lde1/d;

    move-result-object v0

    instance-of v1, v0, Lde1/d$f;

    if-eqz v1, :cond_0

    sget-object p1, Lge1/d$f;->a:Lge1/d$f;

    return-object p1

    :cond_0
    instance-of v1, v0, Lde1/d$e;

    if-eqz v1, :cond_1

    invoke-direct {p0, p1}, Lge1/a;->i(Lde1/b;)Lge1/d$e;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, Lde1/d$d;

    if-eqz v1, :cond_2

    sget-object p1, Lge1/d$d;->a:Lge1/d$d;

    return-object p1

    :cond_2
    instance-of v1, v0, Lde1/d$b;

    if-eqz v1, :cond_3

    sget-object p1, Lge1/d$b;->a:Lge1/d$b;

    return-object p1

    :cond_3
    instance-of v1, v0, Lde1/d$c;

    if-eqz v1, :cond_4

    sget-object p1, Lge1/d$c;->a:Lge1/d$c;

    return-object p1

    :cond_4
    instance-of v1, v0, Lde1/d$a;

    if-eqz v1, :cond_5

    new-instance v0, Lge1/d$a;

    invoke-virtual {p1}, Lde1/b;->j()Lde1/d;

    move-result-object v1

    check-cast v1, Lde1/d$a;

    invoke-virtual {v1}, Lde1/d$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lde1/b;->j()Lde1/d;

    move-result-object p1

    check-cast p1, Lde1/d$a;

    invoke-virtual {p1}, Lde1/d$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lge1/d$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_5
    instance-of v1, v0, Lde1/d$h;

    if-eqz v1, :cond_6

    sget-object p1, Lge1/d$h;->a:Lge1/d$h;

    return-object p1

    :cond_6
    instance-of v1, v0, Lde1/d$i;

    if-eqz v1, :cond_7

    sget-object p1, Lge1/d$i;->a:Lge1/d$i;

    return-object p1

    :cond_7
    instance-of v0, v0, Lde1/d$g;

    if-eqz v0, :cond_8

    new-instance v0, Lge1/d$g;

    invoke-virtual {p1}, Lde1/b;->j()Lde1/d;

    move-result-object v1

    check-cast v1, Lde1/d$g;

    invoke-virtual {v1}, Lde1/d$g;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lde1/b;->j()Lde1/d;

    move-result-object p1

    check-cast p1, Lde1/d$g;

    invoke-virtual {p1}, Lde1/d$g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lge1/d$g;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
