.class public final Lmp2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u000f\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lmp2/a;",
        "",
        "Lip2/a;",
        "analytics",
        "<init>",
        "(Lip2/a;)V",
        "Lnp2/a$m;",
        "event",
        "Lnp2/a;",
        "a",
        "(Lnp2/a$m;)Lnp2/a;",
        "Lcom/whoop/navigation/e;",
        "navAction",
        "b",
        "(Lcom/whoop/navigation/e;)Lnp2/a;",
        "actionEvent",
        "c",
        "(Lnp2/a;)Lnp2/a;",
        "Lip2/a;",
        "universal-checkout_release"
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
.field private final a:Lip2/a;


# direct methods
.method public constructor <init>(Lip2/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmp2/a;->a:Lip2/a;

    return-void
.end method

.method private final a(Lnp2/a$m;)Lnp2/a;
    .locals 8

    invoke-virtual {p1}, Lnp2/a$m;->a()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_0

    sget-object p1, Lnp2/a$r;->a:Lnp2/a$r;

    return-object p1

    :cond_0
    instance-of v0, p1, Lm91/u;

    if-eqz v0, :cond_1

    new-instance v0, Lnp2/a$b;

    check-cast p1, Lm91/u;

    invoke-direct {v0, p1}, Lnp2/a$b;-><init>(Lm91/u;)V

    return-object v0

    :cond_1
    instance-of v0, p1, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-direct {p0, p1}, Lmp2/a;->b(Lcom/whoop/navigation/e;)Lnp2/a;

    move-result-object p1

    return-object p1

    :cond_2
    instance-of v0, p1, Ljp2/c$b;

    if-eqz v0, :cond_3

    new-instance v0, Lnp2/a$q;

    check-cast p1, Ljp2/c$b;

    invoke-virtual {p1}, Ljp2/c$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Ljp2/c$b;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljp2/c$b;->b()Ljava/util/List;

    move-result-object p1

    invoke-direct {v0, v1, v2, p1}, Lnp2/a$q;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    return-object v0

    :cond_3
    instance-of v0, p1, Ljp2/i$c;

    if-eqz v0, :cond_4

    new-instance v1, Lnp2/a$s;

    check-cast p1, Ljp2/i$c;

    invoke-virtual {p1}, Ljp2/i$c;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljp2/i$c;->f()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljp2/i$c;->c()Ljava/lang/Integer;

    move-result-object v4

    invoke-virtual {p1}, Ljp2/i$c;->d()Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {p1}, Ljp2/i$c;->e()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Ljp2/i$c;->a()Ljava/lang/String;

    move-result-object v7

    invoke-direct/range {v1 .. v7}, Lnp2/a$s;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1

    :cond_4
    instance-of v0, p1, Ljp2/i$b;

    if-eqz v0, :cond_5

    new-instance v1, Lnp2/a$t;

    check-cast p1, Ljp2/i$b;

    invoke-virtual {p1}, Ljp2/i$b;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljp2/i$b;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljp2/i$b;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljp2/i$b;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljp2/i$b;->c()Ljava/lang/Integer;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lnp2/a$t;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v1

    :cond_5
    instance-of v0, p1, Ljp2/i$a;

    if-eqz v0, :cond_6

    new-instance v0, Lnp2/a$f;

    check-cast p1, Ljp2/i$a;

    invoke-virtual {p1}, Ljp2/i$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lnp2/a$f;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_6
    instance-of v0, p1, Ljp2/c$a;

    if-eqz v0, :cond_7

    new-instance v1, Lnp2/a$k;

    check-cast p1, Ljp2/c$a;

    invoke-virtual {p1}, Ljp2/c$a;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Ljp2/c$a;->e()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Ljp2/c$a;->d()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1}, Ljp2/c$a;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljp2/c$a;->c()Ljava/lang/Integer;

    move-result-object v6

    invoke-direct/range {v1 .. v6}, Lnp2/a$k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    return-object v1

    :cond_7
    const/4 p1, 0x0

    return-object p1
.end method

.method private final b(Lcom/whoop/navigation/e;)Lnp2/a;
    .locals 1

    new-instance v0, Lnp2/a$c;

    invoke-direct {v0, p1}, Lnp2/a$c;-><init>(Lcom/whoop/navigation/e;)V

    return-object v0
.end method


# virtual methods
.method public final c(Lnp2/a;)Lnp2/a;
    .locals 2

    const-string v0, "actionEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lnp2/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lmp2/a;->a:Lip2/a;

    move-object v1, p1

    check-cast v1, Lnp2/a$a;

    invoke-virtual {v0, v1}, Lip2/a;->a(Lnp2/a$a;)V

    :cond_0
    instance-of v0, p1, Lnp2/a$m;

    if-eqz v0, :cond_1

    check-cast p1, Lnp2/a$m;

    invoke-direct {p0, p1}, Lmp2/a;->a(Lnp2/a$m;)Lnp2/a;

    move-result-object p1

    :cond_1
    return-object p1
.end method
