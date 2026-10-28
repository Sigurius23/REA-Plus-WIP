.class public abstract Lkw1/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aQ\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "",
        "event",
        "Liw1/k$d;",
        "viewState",
        "Lkotlin/Function1;",
        "Liw1/j;",
        "Ll83/a0;",
        "onViewEvent",
        "Lhw1/a;",
        "onNavigationEvent",
        "Lew1/a;",
        "analyticsHelper",
        "a",
        "(Ljava/lang/Object;Liw1/k$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;)V",
        "membership_release"
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
.method public static final a(Ljava/lang/Object;Liw1/k$d;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lew1/a;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Liw1/k$d;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lew1/a;",
            ")V"
        }
    .end annotation

    const-string v0, "event"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ljx1/v;

    const-string v1, ""

    if-eqz v0, :cond_2

    if-eqz p4, :cond_1

    move-object p3, p0

    check-cast p3, Ljx1/v;

    invoke-virtual {p3}, Ljx1/v;->j()Ljava/lang/String;

    move-result-object p3

    invoke-virtual {p1}, Liw1/k$d;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Liw1/k$d;->f()I

    move-result p1

    invoke-static {p1, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    move-object v1, p1

    :goto_0
    invoke-virtual {p4, p3, v1}, Lew1/a;->o(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    new-instance p1, Liw1/j$d;

    check-cast p0, Ljx1/v;

    invoke-direct {p1, p0}, Liw1/j$d;-><init>(Ljx1/v;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_2
    instance-of v0, p0, Liw1/j$e;

    if-eqz v0, :cond_4

    if-eqz p4, :cond_3

    invoke-virtual {p1}, Liw1/k$d;->g()Ljava/util/List;

    move-result-object p1

    move-object p3, p0

    check-cast p3, Liw1/j$e;

    invoke-virtual {p3}, Liw1/j$e;->a()I

    move-result p3

    invoke-interface {p1, p3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    invoke-virtual {p4, p1}, Lew1/a;->q(Ljava/lang/String;)V

    :cond_3
    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_4
    instance-of v0, p0, Liw1/j;

    if-eqz v0, :cond_5

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    instance-of v0, p0, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_6

    new-instance p1, Lhw1/a$b;

    check-cast p0, Lcom/whoop/navigation/e;

    invoke-direct {p1, p0}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    instance-of v0, p0, Lny0/h;

    if-eqz v0, :cond_12

    invoke-virtual {p1}, Liw1/k$d;->g()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1}, Liw1/k$d;->f()I

    move-result v2

    invoke-static {v2, v0}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-nez v0, :cond_7

    move-object v0, v1

    :cond_7
    invoke-virtual {p1}, Liw1/k$d;->h()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Liw1/k$c;

    invoke-virtual {v3}, Liw1/k$c;->a()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_1

    :cond_8
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_9
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    instance-of v4, v3, Ljx1/v;

    if-eqz v4, :cond_9

    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_a
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_b
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_c

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljx1/v;

    invoke-virtual {v3}, Ljx1/v;->f()Z

    move-result v3

    if-eqz v3, :cond_b

    goto :goto_3

    :cond_c
    const/4 v2, 0x0

    :goto_3
    check-cast v2, Ljx1/v;

    if-eqz p4, :cond_10

    move-object p1, p0

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->j()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_d

    move-object p1, v1

    :cond_d
    if-eqz v2, :cond_f

    invoke-virtual {v2}, Ljx1/v;->j()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_e

    goto :goto_4

    :cond_e
    move-object v1, v3

    :cond_f
    :goto_4
    invoke-virtual {p4, p1, v0, v1}, Lew1/a;->l(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    :cond_10
    check-cast p0, Lny0/h;

    invoke-virtual {p0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    sget-object p4, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {p1, p4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    new-instance p1, Lhw1/a$b;

    invoke-virtual {p0}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p0

    invoke-direct {p1, p0}, Lhw1/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p3, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_11
    if-eqz v2, :cond_12

    new-instance p0, Liw1/j$b;

    invoke-direct {p0, v2}, Liw1/j$b;-><init>(Ljx1/v;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_12
    return-void
.end method
