.class public final Lt60/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lt60/a;",
        "",
        "Lk60/b;",
        "analytics",
        "<init>",
        "(Lk60/b;)V",
        "Lu60/a$f;",
        "event",
        "Lu60/a;",
        "a",
        "(Lu60/a$f;)Lu60/a;",
        "Lm91/u;",
        "itemViewState",
        "b",
        "(Lm91/u;)Lu60/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "c",
        "(Lcom/whoop/navigation/e;)Lu60/a;",
        "actionEvent",
        "d",
        "(Lu60/a;)Lu60/a;",
        "Lk60/b;",
        "achievements_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lk60/b;


# direct methods
.method public constructor <init>(Lk60/b;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt60/a;->a:Lk60/b;

    return-void
.end method

.method private final a(Lu60/a$f;)Lu60/a;
    .locals 3

    invoke-virtual {p1}, Lu60/a$f;->c()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/whoop/design/item/DesignItemInteraction;

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/design/item/DesignItemInteraction;

    invoke-virtual {v0}, Lcom/whoop/design/item/DesignItemInteraction;->getActionArgument()Ljava/lang/Object;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v1, 0x2

    invoke-static {p1, v0, v2, v1, v2}, Lu60/a$f;->b(Lu60/a$f;Ljava/lang/Object;Lm91/u;ILjava/lang/Object;)Lu60/a$f;

    move-result-object p1

    invoke-direct {p0, p1}, Lt60/a;->a(Lu60/a$f;)Lu60/a;

    move-result-object p1

    return-object p1

    :cond_0
    return-object v2

    :cond_1
    instance-of p1, v0, Lm91/u;

    if-eqz p1, :cond_2

    check-cast v0, Lm91/u;

    invoke-direct {p0, v0}, Lt60/a;->b(Lm91/u;)Lu60/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of p1, v0, Lcom/whoop/navigation/e;

    if-eqz p1, :cond_3

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-direct {p0, v0}, Lt60/a;->c(Lcom/whoop/navigation/e;)Lu60/a;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v2
.end method

.method private final b(Lm91/u;)Lu60/a;
    .locals 1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p0, p1}, Lt60/a;->c(Lcom/whoop/navigation/e;)Lu60/a;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lcom/whoop/navigation/e;)Lu60/a;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lu60/a$c;

    invoke-direct {v0, p1}, Lu60/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object p1, Lu60/a$d;->a:Lu60/a$d;

    return-object p1
.end method


# virtual methods
.method public final d(Lu60/a;)Lu60/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lu60/a$b;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt60/a;->a:Lk60/b;

    move-object v1, p1

    check-cast v1, Lu60/a$b;

    invoke-virtual {v0, v1}, Lk60/b;->c(Lu60/a$b;)V

    :cond_0
    instance-of v0, p1, Lu60/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Lu60/a$f;

    invoke-direct {p0, p1}, Lt60/a;->a(Lu60/a$f;)Lu60/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
