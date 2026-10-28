.class public final Lmh1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmh1/a;",
        "",
        "Ljh1/b;",
        "analytics",
        "<init>",
        "(Ljh1/b;)V",
        "Lnh1/a$l;",
        "event",
        "Lnh1/a;",
        "a",
        "(Lnh1/a$l;)Lnh1/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Lnh1/a;",
        "actionEvent",
        "c",
        "(Lnh1/a;)Lnh1/a;",
        "Ljh1/b;",
        "gifting_release"
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
.field private final a:Ljh1/b;


# direct methods
.method public constructor <init>(Ljh1/b;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmh1/a;->a:Ljh1/b;

    return-void
.end method

.method private final a(Lnh1/a$l;)Lnh1/a;
    .locals 3

    invoke-virtual {p1}, Lnh1/a$l;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/whoopaction/domain/models/Action;

    if-eqz v0, :cond_0

    new-instance v0, Lnh1/a$o;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/Action;

    invoke-direct {v0, p1}, Lnh1/a$o;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object v0

    :cond_0
    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_4

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->c()Lcom/whoop/whoopaction/domain/models/Action;

    move-result-object v0

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object v1

    if-eqz v0, :cond_1

    new-instance p1, Lnh1/a$o;

    invoke-direct {p1, v0}, Lnh1/a$o;-><init>(Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_1
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    sget-object v2, Lcom/whoop/navigation/AppScreen$g6;->w:Lcom/whoop/navigation/AppScreen$g6;

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p1

    const-string v0, "membership-gifting-checkout-button"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lnh1/a$m;

    invoke-direct {p1, v1}, Lnh1/a$m;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_2
    new-instance p1, Lnh1/a$c;

    invoke-direct {p1, v1}, Lnh1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object p1

    :cond_3
    sget-object p1, Lnh1/a$j;->a:Lnh1/a$j;

    return-object p1

    :cond_4
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_5

    new-instance v0, Lnh1/a$b;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Lnh1/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_5
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_6

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lmh1/a;->b(Lcom/whoop/navigation/e;)Lnh1/a;

    move-result-object p1

    return-object p1

    :cond_6
    instance-of v0, p1, Lq31/b;

    if-eqz v0, :cond_7

    new-instance v0, Lnh1/a$r;

    check-cast p1, Lq31/b;

    invoke-virtual {p1}, Lq31/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnh1/a$r;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_7
    instance-of v0, p1, Lqh1/b;

    if-eqz v0, :cond_8

    new-instance v0, Lnh1/a$p;

    check-cast p1, Lqh1/b;

    invoke-virtual {p1}, Lqh1/b;->a()I

    move-result p1

    invoke-direct {v0, p1}, Lnh1/a$p;-><init>(I)V

    return-object v0

    :cond_8
    instance-of v0, p1, Lr51/b;

    if-eqz v0, :cond_9

    sget-object p1, Lnh1/a$g;->a:Lnh1/a$g;

    return-object p1

    :cond_9
    instance-of v0, p1, Lr51/c;

    if-eqz v0, :cond_a

    new-instance v0, Lnh1/a$h;

    check-cast p1, Lr51/c;

    invoke-virtual {p1}, Lr51/c;->a()Lr51/g;

    move-result-object p1

    invoke-virtual {p1}, Lr51/g;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnh1/a$h;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_a
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Lnh1/a;
    .locals 1

    new-instance v0, Lnh1/a$c;

    invoke-direct {v0, p1}, Lnh1/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lnh1/a;)Lnh1/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnh1/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmh1/a;->a:Ljh1/b;

    move-object v1, p1

    check-cast v1, Lnh1/a$a;

    invoke-virtual {v0, v1}, Ljh1/b;->c(Lnh1/a$a;)V

    :cond_0
    instance-of v0, p1, Lnh1/a$l;

    if-eqz v0, :cond_1

    check-cast p1, Lnh1/a$l;

    invoke-direct {p0, p1}, Lmh1/a;->a(Lnh1/a$l;)Lnh1/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
