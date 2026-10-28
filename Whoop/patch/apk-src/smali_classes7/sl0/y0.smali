.class public final Lsl0/y0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r0\u000b2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lsl0/y0;",
        "",
        "<init>",
        "()V",
        "viewEvent",
        "",
        "index",
        "Lnl0/f;",
        "viewState",
        "Lm91/u;",
        "itemViewState",
        "Lkotlin/Function1;",
        "Lnl0/d;",
        "Ll83/a0;",
        "onViewEvent",
        "Lml0/a;",
        "onNavigationEvent",
        "a",
        "(Ljava/lang/Object;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V",
        "bot_release"
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


# virtual methods
.method public final a(Ljava/lang/Object;ILnl0/f;Lm91/u;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "I",
            "Lnl0/f;",
            "Lm91/u;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "viewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewState"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;->DISMISS:Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    if-ne p1, v0, :cond_0

    sget-object p1, Lnl0/d$q;->a:Lnl0/d$q;

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    instance-of v0, p1, Loz0/c;

    if-eqz v0, :cond_5

    invoke-virtual {p3}, Lnl0/f;->c()Lnl0/a;

    move-result-object p4

    invoke-virtual {p4}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object v4

    check-cast p1, Loz0/c;

    invoke-virtual {p1}, Loz0/c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p3}, Lnl0/f;->c()Lnl0/a;

    move-result-object p1

    invoke-virtual {p1}, Lnl0/a;->f()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of p3, p1, Ljava/util/Collection;

    const/4 p4, 0x0

    if-eqz p3, :cond_2

    move-object p3, p1

    check-cast p3, Ljava/util/Collection;

    invoke-interface {p3}, Ljava/util/Collection;->isEmpty()Z

    move-result p3

    if-eqz p3, :cond_2

    :cond_1
    move v3, p4

    goto :goto_1

    :cond_2
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lnl0/c;

    invoke-virtual {p3}, Lnl0/c;->g()Lnl0/b;

    move-result-object p3

    sget-object p6, Lnl0/b;->USER:Lnl0/b;

    if-ne p3, p6, :cond_3

    add-int/lit8 p4, p4, 0x1

    if-ltz p4, :cond_4

    goto :goto_0

    :cond_4
    invoke-static {}, Lwb3/f;->c0()V

    const/4 p1, 0x0

    throw p1

    :goto_1
    new-instance v0, Lnl0/d$m;

    const/16 v7, 0x30

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move v2, p2

    invoke-direct/range {v0 .. v8}, Lnl0/d$m;-><init>(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lfl0/l;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p5, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_5
    instance-of p2, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    if-eqz p2, :cond_6

    new-instance p2, Lml0/a$a;

    check-cast p1, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    invoke-direct {p2, p1}, Lml0/a$a;-><init>(Lcom/whoop/design/models/items/ArticleTileModelEvent;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_6
    instance-of p2, p1, Lcom/whoop/navigation/e;

    if-eqz p2, :cond_9

    instance-of p2, p4, Lj01/d;

    if-nez p2, :cond_8

    instance-of p2, p4, Lk01/e;

    if-eqz p2, :cond_7

    goto :goto_2

    :cond_7
    new-instance p2, Lml0/a$f;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p2, p1}, Lml0/a$f;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_8
    :goto_2
    new-instance p2, Lml0/a$h;

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p2, p1}, Lml0/a$h;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_9
    instance-of p2, p1, Lcom/whoop/design/models/items/ArticleTileCarouselEventEnum;

    if-eqz p2, :cond_a

    sget-object p1, Lml0/a$g;->a:Lml0/a$g;

    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_a
    instance-of p2, p1, Lc41/l5;

    if-eqz p2, :cond_b

    new-instance p2, Lnl0/d$c;

    check-cast p1, Lc41/l5;

    invoke-virtual {p1}, Lc41/l5;->a()Ljava/util/UUID;

    move-result-object p1

    invoke-direct {p2, p1}, Lnl0/d$c;-><init>(Ljava/util/UUID;)V

    invoke-interface {p5, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_b
    instance-of p2, p1, Lxl0/d;

    if-eqz p2, :cond_c

    new-instance p2, Lml0/a$d;

    check-cast p1, Lxl0/d;

    invoke-virtual {p1}, Lxl0/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lml0/a$d;-><init>(Ljava/lang/String;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_c
    instance-of p2, p1, Lml0/a$g;

    if-eqz p2, :cond_d

    sget-object p1, Lml0/a$g;->a:Lml0/a$g;

    invoke-interface {p6, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_d
    instance-of p2, p1, Lnl0/d$l;

    if-eqz p2, :cond_e

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_e
    instance-of p2, p1, Lnl0/d$a;

    if-eqz p2, :cond_f

    invoke-interface {p5, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_f
    instance-of p2, p1, Lny0/h;

    if-eqz p2, :cond_10

    new-instance p2, Lml0/a$f;

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Lml0/a$f;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p6, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_10
    return-void
.end method
