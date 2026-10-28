.class public abstract Lri0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u001a\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u001a%\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a/\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lri0/h;",
        "Lri0/b;",
        "d",
        "(Lri0/h;)Lri0/b;",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onEvent",
        "a",
        "(Lri0/h;Lkotlin/jvm/functions/Function1;)V",
        "fallback",
        "b",
        "(Lri0/h;Lkotlin/jvm/functions/Function1;Lri0/b;)V",
        "arch-v2_release"
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
.method public static final a(Lri0/h;Lkotlin/jvm/functions/Function1;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri0/h;",
            "Lkotlin/jvm/functions/Function1;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lri0/h;->b()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lri0/b$g;

    invoke-direct {v1, v0}, Lri0/b$g;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {p0}, Lri0/g;->d(Lri0/h;)Lri0/b;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public static final b(Lri0/h;Lkotlin/jvm/functions/Function1;Lri0/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lri0/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Lri0/b;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "fallback"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lri0/h;->b()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance v1, Lri0/b$g;

    invoke-direct {v1, v0}, Lri0/b$g;-><init>(Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-static {p0}, Lri0/g;->d(Lri0/h;)Lri0/b;

    move-result-object p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    move-object p2, p0

    :goto_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic c(Lri0/h;Lkotlin/jvm/functions/Function1;Lri0/b;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    new-instance p2, Lri0/b$h;

    const/4 p3, 0x1

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3, p4}, Lri0/b$h;-><init>(Lj02/s;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :cond_0
    invoke-static {p0, p1, p2}, Lri0/g;->b(Lri0/h;Lkotlin/jvm/functions/Function1;Lri0/b;)V

    return-void
.end method

.method public static final d(Lri0/h;)Lri0/b;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lri0/h;->a()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    if-eqz v0, :cond_0

    new-instance p0, Lri0/b$p;

    invoke-direct {p0, v0}, Lri0/b$p;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p0

    :cond_0
    invoke-interface {p0}, Lri0/h;->e()Lcom/whoop/navigation/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    new-instance p0, Lri0/b$c;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {p0, v0, v2, v3, v1}, Lri0/b$c;-><init>(Lcom/whoop/navigation/e;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object p0

    :cond_1
    invoke-interface {p0}, Lri0/h;->d()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v0

    if-eqz v0, :cond_2

    new-instance v2, Lri0/b$s;

    invoke-direct {v2, v0}, Lri0/b$s;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    goto :goto_0

    :cond_2
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_3

    return-object v2

    :cond_3
    invoke-interface {p0}, Lri0/h;->c()Lj02/s;

    move-result-object p0

    if-eqz p0, :cond_4

    new-instance v0, Lri0/b$h;

    invoke-direct {v0, p0}, Lri0/b$h;-><init>(Lj02/s;)V

    return-object v0

    :cond_4
    return-object v1
.end method
