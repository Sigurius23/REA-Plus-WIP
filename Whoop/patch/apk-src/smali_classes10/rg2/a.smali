.class public abstract Lrg2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a;\u0010\t\u001a\u00020\u00082\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00060\u0005H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "internalName",
        "",
        "Lrg2/j;",
        "recentActivityItems",
        "",
        "Lha0/d;",
        "allActivitiesByInternalName",
        "Lrg2/u;",
        "a",
        "(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/u;",
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
.method public static final a(Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)Lrg2/u;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lrg2/j;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lha0/d;",
            ">;)",
            "Lrg2/u;"
        }
    .end annotation

    const-string v0, "recentActivityItems"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "allActivitiesByInternalName"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    const/4 v1, 0x0

    if-eqz p0, :cond_5

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lrg2/j;

    invoke-virtual {v3}, Lrg2/j;->d()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move-object v1, v2

    :cond_2
    check-cast v1, Lrg2/j;

    if-eqz v1, :cond_3

    new-instance p0, Lrg2/u;

    invoke-virtual {v1}, Lrg2/j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1}, Lrg2/j;->b()Z

    move-result p2

    invoke-direct {p0, p1, p2}, Lrg2/u;-><init>(Ljava/lang/String;Z)V

    return-object p0

    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lha0/d;

    if-eqz p1, :cond_4

    new-instance p0, Lrg2/u;

    invoke-virtual {p1}, Lha0/d;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1}, Lha0/d;->d()Z

    move-result p1

    invoke-direct {p0, p2, p1}, Lrg2/u;-><init>(Ljava/lang/String;Z)V

    return-object p0

    :cond_4
    new-instance p1, Lrg2/u;

    invoke-direct {p1, p0, v0}, Lrg2/u;-><init>(Ljava/lang/String;Z)V

    return-object p1

    :cond_5
    :goto_0
    new-instance p0, Lrg2/u;

    const/4 p1, 0x3

    invoke-direct {p0, v1, v0, p1, v1}, Lrg2/u;-><init>(Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0
.end method
