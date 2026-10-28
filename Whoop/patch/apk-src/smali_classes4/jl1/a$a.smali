.class public final Ljl1/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ljl1/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u000b\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\t\u001a\u0004\u0018\u00010\u0004*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ)\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u000e*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\u0012*\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0011\u0010\u0015\u001a\u00020\u0012*\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J!\u0010\u0017\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J!\u0010\u0019\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u0019\u0010\u0018J\u001f\u0010\u001b\u001a\u00020\u0008*\u00020\u00082\u000c\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000e\u00a2\u0006\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Ljl1/a$a;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/navigation/e;",
        "Ljl1/d;",
        "g",
        "(Lcom/whoop/navigation/e;)Ljl1/d;",
        "Ljl1/a;",
        "c",
        "(Ljl1/a;)Lcom/whoop/navigation/e;",
        "",
        "screen",
        "identifier",
        "",
        "a",
        "(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;",
        "destination",
        "",
        "e",
        "(Ljl1/a;Lcom/whoop/navigation/e;)Z",
        "d",
        "(Ljl1/a;)Z",
        "f",
        "(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljl1/a;",
        "b",
        "newDestinations",
        "h",
        "(Ljl1/a;Ljava/util/List;)Ljl1/a;",
        "home_release"
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
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljl1/a$a;-><init>()V

    return-void
.end method

.method private final a(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl1/a;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljl1/d;",
            ">;"
        }
    .end annotation

    invoke-virtual {p1}, Ljl1/a;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    instance-of v1, v0, Ljava/util/Collection;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljl1/d;

    invoke-virtual {v1}, Ljl1/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Ljl1/d;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1}, Ljl1/a;->e()Ljava/util/List;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_0
    invoke-virtual {p1}, Ljl1/a;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    new-instance v0, Ljl1/d;

    invoke-direct {v0, p2, p3}, Ljl1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-static {v0, p1}, Lm83/s;->f1(Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/ArrayList;

    move-result-object p1

    return-object p1
.end method

.method private final c(Ljl1/a;)Lcom/whoop/navigation/e;
    .locals 4

    invoke-virtual {p1}, Ljl1/a;->c()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/whoop/navigation/e;

    sget-object v3, Ljl1/a;->d:Ljl1/a$a;

    invoke-virtual {v3, p1, v2}, Ljl1/a$a;->e(Ljl1/a;Lcom/whoop/navigation/e;)Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_1
    const/4 v1, 0x0

    :goto_0
    check-cast v1, Lcom/whoop/navigation/e;

    return-object v1
.end method

.method private final g(Lcom/whoop/navigation/e;)Ljl1/d;
    .locals 2

    new-instance v0, Ljl1/d;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljl1/c;->a(Lcom/whoop/navigation/e;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Ljl1/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method


# virtual methods
.method public final b(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljl1/a;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identifier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Ljl1/a$a;->a(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Ljl1/a;->b(Ljl1/a;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ljl1/a;

    move-result-object p1

    return-object p1
.end method

.method public final d(Ljl1/a;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljl1/a;->d()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    sget-object v0, Lcom/whoop/navigation/AppScreen$w1;->w:Lcom/whoop/navigation/AppScreen$w1;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final e(Ljl1/a;Lcom/whoop/navigation/e;)Z
    .locals 4

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "destination"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2}, Ljl1/a$a;->g(Lcom/whoop/navigation/e;)Ljl1/d;

    move-result-object p2

    invoke-virtual {p1}, Ljl1/a;->e()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    instance-of v0, p1, Ljava/util/Collection;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljl1/d;

    invoke-virtual {v0}, Ljl1/d;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p2}, Ljl1/d;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v0}, Ljl1/d;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p2}, Ljl1/d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_2
    return v1
.end method

.method public final f(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljl1/a;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "screen"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "identifier"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3}, Ljl1/a$a;->a(Ljl1/a;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    const/4 v5, 0x5

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v6}, Ljl1/a;->b(Ljl1/a;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ljl1/a;

    move-result-object p1

    invoke-direct {p0, p1}, Ljl1/a$a;->c(Ljl1/a;)Lcom/whoop/navigation/e;

    move-result-object v4

    const/4 v5, 0x1

    invoke-static/range {v1 .. v6}, Ljl1/a;->b(Ljl1/a;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ljl1/a;

    move-result-object p1

    return-object p1
.end method

.method public final h(Ljl1/a;Ljava/util/List;)Ljl1/a;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljl1/a;",
            "Ljava/util/List<",
            "Lcom/whoop/navigation/e;",
            ">;)",
            "Ljl1/a;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "newDestinations"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    move-object v2, p2

    invoke-static/range {v1 .. v6}, Ljl1/a;->b(Ljl1/a;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ljl1/a;

    move-result-object v7

    invoke-direct {p0, v7}, Ljl1/a$a;->c(Ljl1/a;)Lcom/whoop/navigation/e;

    move-result-object v10

    const/4 v11, 0x3

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Ljl1/a;->b(Ljl1/a;Ljava/util/List;Ljava/util/List;Lcom/whoop/navigation/e;ILjava/lang/Object;)Ljl1/a;

    move-result-object p1

    return-object p1
.end method
