.class public final Lho2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001dR\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010!\u00a8\u0006\""
    }
    d2 = {
        "Lho2/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "Liy1/c;",
        "metricWriter",
        "Ltr2/n;",
        "logger",
        "Lj02/l0;",
        "navigationReporter",
        "Ljo2/e;",
        "stripeFlowControllerManager",
        "<init>",
        "(Lfi0/a;Liy1/c;Ltr2/n;Lj02/l0;Ljo2/e;)V",
        "Lpo2/a$o;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lpo2/a$o;)V",
        "",
        "paymentMethod",
        "",
        "c",
        "(Ljava/lang/String;)Z",
        "Lpo2/a$a;",
        "a",
        "(Lpo2/a$a;)V",
        "Lfi0/a;",
        "Liy1/c;",
        "Ltr2/n;",
        "d",
        "Lj02/l0;",
        "e",
        "Ljo2/e;",
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
.field private final a:Lfi0/a;

.field private final b:Liy1/c;

.field private final c:Ltr2/n;

.field private final d:Lj02/l0;

.field private final e:Ljo2/e;


# direct methods
.method public constructor <init>(Lfi0/a;Liy1/c;Ltr2/n;Lj02/l0;Ljo2/e;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigationReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "stripeFlowControllerManager"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lho2/a;->a:Lfi0/a;

    iput-object p2, p0, Lho2/a;->b:Liy1/c;

    iput-object p3, p0, Lho2/a;->c:Ltr2/n;

    iput-object p4, p0, Lho2/a;->d:Lj02/l0;

    iput-object p5, p0, Lho2/a;->e:Ljo2/e;

    return-void
.end method

.method private final b(Lpo2/a$o;)V
    .locals 0

    return-void
.end method

.method private final c(Ljava/lang/String;)Z
    .locals 3

    iget-object v0, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v0}, Ljo2/e;->t()Lq20/e;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lq20/e;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v2, 0x1

    invoke-static {v0, p1, v2}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result p1

    if-ne p1, v2, :cond_0

    return v2

    :cond_0
    return v1
.end method


# virtual methods
.method public final a(Lpo2/a$a;)V
    .locals 8

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lpo2/a$l0;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$l0;

    invoke-virtual {p1}, Lpo2/a$l0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$l0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->r(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_0
    instance-of v0, p1, Lpo2/a$f0;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$f0;

    invoke-virtual {p1}, Lpo2/a$f0;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$f0;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpo2/a$f0;->b()Ljava/util/Map;

    move-result-object v3

    invoke-static {v0, v1, v2, v3}, Lho2/b;->h(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    iget-object v0, p0, Lho2/a;->b:Liy1/c;

    invoke-static {v0}, Lho2/b;->i(Liy1/c;)V

    iget-object v0, p0, Lho2/a;->c:Ltr2/n;

    invoke-virtual {p1}, Lpo2/a$f0;->a()Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_1

    const-string p1, "Unknown stripe error"

    :cond_1
    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_2
    instance-of v0, p1, Lpo2/a$j;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$j;

    invoke-virtual {p1}, Lpo2/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lho2/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lpo2/a$y;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$y;

    invoke-virtual {p1}, Lpo2/a$y;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$y;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->l(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_4
    instance-of v0, p1, Lpo2/a$z;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$z;

    invoke-virtual {p1}, Lpo2/a$z;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$z;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->m(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_5
    instance-of v0, p1, Lpo2/a$a0;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$a0;

    invoke-virtual {p1}, Lpo2/a$a0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$a0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->n(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_6
    instance-of v0, p1, Lpo2/a$b0;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$b0;

    invoke-virtual {p1}, Lpo2/a$b0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$b0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->f(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_7
    instance-of v0, p1, Lpo2/a$d0;

    if-eqz v0, :cond_8

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$d0;

    invoke-virtual {p1}, Lpo2/a$d0;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$d0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->g(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_8
    instance-of v0, p1, Lpo2/a$e0;

    if-eqz v0, :cond_9

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$e0;

    invoke-virtual {p1}, Lpo2/a$e0;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$e0;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lpo2/a$e0;->b()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lho2/b;->o(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_9
    instance-of v0, p1, Lpo2/a$m0;

    const/4 v1, 0x0

    if-eqz v0, :cond_b

    check-cast p1, Lpo2/a$m0;

    invoke-virtual {p1}, Lpo2/a$m0;->b()Lq20/e;

    move-result-object v0

    iget-object v2, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v2}, Ljo2/e;->r()Lq20/e;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lpo2/a$m0;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v3}, Ljo2/e;->t()Lq20/e;

    move-result-object v3

    if-eqz v3, :cond_a

    invoke-virtual {v3}, Lq20/e;->b()Ljava/lang/String;

    move-result-object v1

    :cond_a
    invoke-virtual {p1}, Lpo2/a$m0;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v2, v1, p1}, Lho2/b;->q(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_b
    instance-of v0, p1, Lpo2/a$w;

    if-eqz v0, :cond_f

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$w;

    invoke-virtual {p1}, Lpo2/a$w;->b()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v3}, Ljo2/e;->t()Lq20/e;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lq20/e;->b()Ljava/lang/String;

    move-result-object v1

    :cond_c
    iget-object v3, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v3}, Ljo2/e;->w()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lpo2/a$w;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v2, v1, v3, p1}, Lho2/b;->k(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    const-string p1, "Klarna"

    invoke-direct {p0, p1}, Lho2/a;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_d

    iget-object p1, p0, Lho2/a;->d:Lj02/l0;

    invoke-static {p1}, Lho2/b;->d(Lj02/l0;)V

    return-void

    :cond_d
    const-string p1, "Affirm"

    invoke-direct {p0, p1}, Lho2/a;->c(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lho2/a;->d:Lj02/l0;

    invoke-static {p1}, Lho2/b;->c(Lj02/l0;)V

    :cond_e
    return-void

    :cond_f
    instance-of v0, p1, Lpo2/a$v;

    if-eqz v0, :cond_12

    check-cast p1, Lpo2/a$v;

    invoke-virtual {p1}, Lpo2/a$v;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_10

    const-string v0, "Unknown error"

    :cond_10
    move-object v4, v0

    iget-object v2, p0, Lho2/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lpo2/a$v;->c()Ljava/lang/String;

    move-result-object v3

    iget-object v0, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v0}, Ljo2/e;->t()Lq20/e;

    move-result-object v0

    if-eqz v0, :cond_11

    invoke-virtual {v0}, Lq20/e;->b()Ljava/lang/String;

    move-result-object v1

    :cond_11
    move-object v5, v1

    iget-object v0, p0, Lho2/a;->e:Ljo2/e;

    invoke-virtual {v0}, Ljo2/e;->w()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p1}, Lpo2/a$v;->b()Ljava/util/Map;

    move-result-object v7

    invoke-static/range {v2 .. v7}, Lho2/b;->e(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_12
    instance-of v0, p1, Lpo2/a$t;

    if-eqz v0, :cond_13

    iget-object v0, p0, Lho2/a;->a:Lfi0/a;

    check-cast p1, Lpo2/a$t;

    invoke-virtual {p1}, Lpo2/a$t;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lpo2/a$t;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lho2/b;->j(Lfi0/a;Ljava/lang/String;Ljava/util/Map;)V

    return-void

    :cond_13
    instance-of v0, p1, Lpo2/a$o;

    if-eqz v0, :cond_14

    check-cast p1, Lpo2/a$o;

    invoke-direct {p0, p1}, Lho2/a;->b(Lpo2/a$o;)V

    return-void

    :cond_14
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
