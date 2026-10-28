.class public final Lpc0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lpc0/a;",
        "",
        "<init>",
        "()V",
        "Lqc0/a$e;",
        "event",
        "Lqc0/a;",
        "a",
        "(Lqc0/a$e;)Lqc0/a;",
        "Lm91/u;",
        "itemViewState",
        "b",
        "(Lm91/u;)Lqc0/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "c",
        "(Lcom/whoop/navigation/e;)Lqc0/a;",
        "actionEvent",
        "d",
        "(Lqc0/a;)Lqc0/a;",
        "advanced-labs_release"
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

.method private final a(Lqc0/a$e;)Lqc0/a;
    .locals 1

    invoke-virtual {p1}, Lqc0/a$e;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_0

    new-instance v0, Lqc0/a$g;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, p1}, Lqc0/a$g;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v0, :cond_1

    new-instance v0, Lqc0/a$h;

    check-cast p1, Lcom/whoop/design/models/modal/AnyModal;

    invoke-direct {v0, p1}, Lqc0/a$h;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_2

    check-cast p1, Lm91/u;

    invoke-direct {p0, p1}, Lpc0/a;->b(Lm91/u;)Lqc0/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_3

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lpc0/a;->c(Lcom/whoop/navigation/e;)Lqc0/a;

    move-result-object p1

    return-object p1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lm91/u;)Lqc0/a;
    .locals 4

    instance-of v0, p1, Lny0/h;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->e()Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/design/models/modal/AnyModal;

    if-eqz v3, :cond_0

    move-object v1, v2

    check-cast v1, Lcom/whoop/design/models/modal/AnyModal;

    :cond_0
    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz v0, :cond_1

    new-instance p1, Lqc0/a$g;

    invoke-direct {p1, v0}, Lqc0/a$g;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_1
    if-eqz v1, :cond_2

    new-instance p1, Lqc0/a$h;

    invoke-direct {p1, v1}, Lqc0/a$h;-><init>(Lcom/whoop/design/models/modal/AnyModal;)V

    return-object p1

    :cond_2
    invoke-direct {p0, p1}, Lpc0/a;->c(Lcom/whoop/navigation/e;)Lqc0/a;

    move-result-object p1

    return-object p1

    :cond_3
    return-object v1
.end method

.method private final c(Lcom/whoop/navigation/e;)Lqc0/a;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lqc0/a$a;

    invoke-direct {v0, p1}, Lqc0/a$a;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object p1, Lqc0/a$d;->a:Lqc0/a$d;

    return-object p1
.end method


# virtual methods
.method public final d(Lqc0/a;)Lqc0/a;
    .locals 1

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lqc0/a$e;

    if-eqz v0, :cond_0

    check-cast p1, Lqc0/a$e;

    invoke-direct {p0, p1}, Lpc0/a;->a(Lqc0/a$e;)Lqc0/a;

    move-result-object p1

    :cond_0
    return-object p1
.end method
