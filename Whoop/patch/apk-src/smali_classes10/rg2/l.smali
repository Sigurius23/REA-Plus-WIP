.class public abstract Lrg2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "internalName",
        "",
        "Lha0/h;",
        "recentDtos",
        "",
        "Lha0/d;",
        "allActivitiesByInternalName",
        "Lrg2/j;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/j;",
        "start-activity_release"
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
.method public static final a(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/j;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lha0/h;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lha0/d;",
            ">;)",
            "Lrg2/j;"
        }
    .end annotation

    const-string v0, "internalName"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recentDtos"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allActivitiesByInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lha0/d;

    if-eqz p2, :cond_0

    new-instance v0, Lrg2/j;

    invoke-virtual {p2}, Lha0/d;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p2}, Lha0/d;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lha0/d;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lha0/d;->d()Z

    move-result v4

    invoke-virtual {p2}, Lha0/d;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v5

    invoke-direct/range {v0 .. v5}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    return-object v0

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    move-object v1, p2

    check-cast v1, Lha0/h;

    invoke-virtual {v1}, Lha0/h;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_2
    move-object p2, v0

    :goto_0
    check-cast p2, Lha0/h;

    if-nez p2, :cond_3

    return-object v0

    :cond_3
    new-instance v1, Lrg2/j;

    invoke-virtual {p2}, Lha0/h;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Lha0/h;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Lha0/h;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p2}, Lha0/h;->d()Z

    move-result v5

    invoke-virtual {p2}, Lha0/h;->g()Lcom/whoop/addactivity/network/model/ScoreType;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lrg2/j;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/addactivity/network/model/ScoreType;)V

    return-object v1
.end method
