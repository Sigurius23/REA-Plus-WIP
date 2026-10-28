.class public final Lby0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0014\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lby0/a;",
        "",
        "Lxx0/a;",
        "analytics",
        "<init>",
        "(Lxx0/a;)V",
        "Lcy0/a$f;",
        "event",
        "Lcy0/a;",
        "a",
        "(Lcy0/a$f;)Lcy0/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "",
        "source",
        "Lm91/u;",
        "itemViewState",
        "Lcy0/a$c;",
        "b",
        "(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;",
        "actionEvent",
        "c",
        "(Lcy0/a;)Lcy0/a;",
        "Lxx0/a;",
        "deep-dive_release"
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
.field private final a:Lxx0/a;


# direct methods
.method public constructor <init>(Lxx0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lby0/a;->a:Lxx0/a;

    return-void
.end method

.method private final a(Lcy0/a$f;)Lcy0/a;
    .locals 3

    invoke-virtual {p1}, Lcy0/a$f;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lm91/u;

    if-eqz v1, :cond_0

    new-instance v1, Lcy0/a$b;

    check-cast v0, Lm91/u;

    invoke-virtual {p1}, Lcy0/a$f;->c()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, v0, p1}, Lcy0/a$b;-><init>(Lm91/u;Ljava/lang/String;)V

    return-object v1

    :cond_0
    instance-of v1, v0, Lcom/whoop/navigation/e;

    if-eqz v1, :cond_1

    check-cast v0, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcy0/a$f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$f;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lby0/a;->b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;

    move-result-object p1

    return-object p1

    :cond_1
    instance-of v1, v0, Lim2/a$b;

    if-eqz v1, :cond_2

    check-cast v0, Lim2/a$b;

    invoke-virtual {v0}, Lim2/a$b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lcy0/a$f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$f;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lby0/a;->b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v1, v0, Lqu1/c$d;

    if-eqz v1, :cond_5

    move-object v1, v0

    check-cast v1, Lqu1/c$d;

    instance-of v2, v1, Lqu1/c$c;

    if-eqz v2, :cond_3

    new-instance p1, Lcy0/a$d;

    check-cast v0, Lqu1/c$c;

    invoke-virtual {v0}, Lqu1/c$c;->a()Ltu1/a;

    move-result-object v0

    invoke-direct {p1, v0}, Lcy0/a$d;-><init>(Ltu1/a;)V

    return-object p1

    :cond_3
    instance-of v1, v1, Lqu1/c$b;

    if-eqz v1, :cond_4

    check-cast v0, Lqu1/c$b;

    invoke-virtual {v0}, Lqu1/c$b;->a()Lcom/whoop/navigation/e;

    move-result-object v0

    invoke-virtual {p1}, Lcy0/a$f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcy0/a$f;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, v0, v1, p1}, Lby0/a;->b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;

    move-result-object p1

    return-object p1

    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_5
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)Lcy0/a$c;
    .locals 1

    new-instance v0, Lcy0/a$c;

    invoke-direct {v0, p1, p2, p3}, Lcy0/a$c;-><init>(Lcom/whoop/navigation/e;Ljava/lang/String;Lm91/u;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lcy0/a;)Lcy0/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcy0/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lby0/a;->a:Lxx0/a;

    move-object v1, p1

    check-cast v1, Lcy0/a$a;

    invoke-virtual {v0, v1}, Lxx0/a;->a(Lcy0/a$a;)V

    :cond_0
    instance-of v0, p1, Lcy0/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Lcy0/a$f;

    invoke-direct {p0, p1}, Lby0/a;->a(Lcy0/a$f;)Lcy0/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
