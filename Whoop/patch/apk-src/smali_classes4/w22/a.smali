.class public final Lw22/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lw22/a;",
        "",
        "Lt22/b;",
        "analytics",
        "<init>",
        "(Lt22/b;)V",
        "Lx22/a$m;",
        "event",
        "Lx22/a;",
        "a",
        "(Lx22/a$m;)Lx22/a;",
        "Lm91/u;",
        "itemViewState",
        "b",
        "(Lm91/u;)Lx22/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "c",
        "(Lcom/whoop/navigation/e;)Lx22/a;",
        "actionEvent",
        "d",
        "(Lx22/a;)Lx22/a;",
        "Lt22/b;",
        "payments_release"
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
.field private final a:Lt22/b;


# direct methods
.method public constructor <init>(Lt22/b;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw22/a;->a:Lt22/b;

    return-void
.end method

.method private final a(Lx22/a$m;)Lx22/a;
    .locals 3

    invoke-virtual {p1}, Lx22/a$m;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_0

    new-instance v0, Lx22/a$s;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, p1}, Lx22/a$s;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_1

    check-cast p1, Lm91/u;

    invoke-direct {p0, p1}, Lw22/a;->b(Lm91/u;)Lx22/a;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lw22/a;->c(Lcom/whoop/navigation/e;)Lx22/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Le32/d;

    if-eqz v0, :cond_5

    move-object v0, p1

    check-cast v0, Le32/d;

    instance-of v1, v0, Le32/d$c;

    if-eqz v1, :cond_4

    check-cast p1, Le32/d$c;

    invoke-virtual {p1}, Le32/d$c;->a()Lb32/a;

    move-result-object v0

    new-instance v1, Lx22/a$r;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lb32/a;->a()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v0}, Lb32/a;->b()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Le32/d$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v2, v0, p1}, Lx22/a$r;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Payment method id is null"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    instance-of v0, v0, Le32/d$f;

    if-eqz v0, :cond_5

    new-instance v0, Lx22/a$d;

    check-cast p1, Le32/d$f;

    invoke-virtual {p1}, Le32/d$f;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lx22/a$d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lm91/u;)Lx22/a;
    .locals 1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_1

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz v0, :cond_0

    new-instance p1, Lx22/a$s;

    invoke-direct {p1, v0}, Lx22/a$s;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_0
    invoke-direct {p0, p1}, Lw22/a;->c(Lcom/whoop/navigation/e;)Lx22/a;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private final c(Lcom/whoop/navigation/e;)Lx22/a;
    .locals 2

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v1, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    new-instance v0, Lx22/a$b;

    invoke-direct {v0, p1}, Lx22/a$b;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0

    :cond_0
    sget-object p1, Lx22/a$j;->a:Lx22/a$j;

    return-object p1
.end method


# virtual methods
.method public final d(Lx22/a;)Lx22/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lx22/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lw22/a;->a:Lt22/b;

    move-object v1, p1

    check-cast v1, Lx22/a$a;

    invoke-virtual {v0, v1}, Lt22/b;->c(Lx22/a$a;)V

    :cond_0
    instance-of v0, p1, Lx22/a$g;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lw22/a;->a:Lt22/b;

    sget-object v1, Lx22/a$h;->a:Lx22/a$h;

    invoke-virtual {v0, v1}, Lt22/b;->c(Lx22/a$a;)V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lx22/a$e;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lw22/a;->a:Lt22/b;

    sget-object v1, Lx22/a$f;->a:Lx22/a$f;

    invoke-virtual {v0, v1}, Lt22/b;->c(Lx22/a$a;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lx22/a$m;

    if-eqz v0, :cond_3

    move-object v0, p1

    check-cast v0, Lx22/a$m;

    invoke-virtual {v0}, Lx22/a$m;->a()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Le32/d$a;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lw22/a;->a:Lt22/b;

    sget-object v1, Lx22/a$c;->a:Lx22/a$c;

    invoke-virtual {v0, v1}, Lt22/b;->c(Lx22/a$a;)V

    :cond_3
    :goto_0
    instance-of v0, p1, Lx22/a$m;

    if-eqz v0, :cond_4

    check-cast p1, Lx22/a$m;

    invoke-direct {p0, p1}, Lw22/a;->a(Lx22/a$m;)Lx22/a;

    move-result-object p1

    :cond_4
    return-object p1
.end method
