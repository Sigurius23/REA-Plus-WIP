.class public final Lpi1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000c\u001a\u00020\u0008*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u000f\u001a\u00020\u0008*\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0008*\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\u00020\u0008*\u00020\u0014H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lpi1/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lcj1/g$l;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lcj1/g$l;)V",
        "Lc41/w1;",
        "c",
        "(Lc41/w1;Lcj1/g$l;)V",
        "Ll01/n;",
        "f",
        "(Ll01/n;Lcj1/g$l;)V",
        "Lfj1/c;",
        "e",
        "(Lfj1/c;)V",
        "Lf01/o0;",
        "d",
        "(Lf01/o0;)V",
        "Lcj1/g$a;",
        "a",
        "(Lcj1/g$a;)V",
        "Lfi0/a;",
        "health_release"
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


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpi1/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lcj1/g$l;)V
    .locals 2

    invoke-virtual {p1}, Lcj1/g$l;->a()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Lf01/o0;

    if-eqz v1, :cond_0

    check-cast v0, Lf01/o0;

    invoke-direct {p0, v0}, Lpi1/a;->d(Lf01/o0;)V

    return-void

    :cond_0
    instance-of v1, v0, Lc41/l2;

    if-eqz v1, :cond_1

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->e(Lfi0/a;)V

    return-void

    :cond_1
    instance-of v1, v0, Lfj1/m;

    if-eqz v1, :cond_2

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->j(Lfi0/a;)V

    return-void

    :cond_2
    instance-of v1, v0, Lcj1/v;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->g(Lfi0/a;)V

    return-void

    :cond_3
    instance-of v1, v0, Lfj1/c;

    if-eqz v1, :cond_4

    check-cast v0, Lfj1/c;

    invoke-direct {p0, v0}, Lpi1/a;->e(Lfj1/c;)V

    return-void

    :cond_4
    instance-of v1, v0, Ll01/n;

    if-eqz v1, :cond_5

    check-cast v0, Ll01/n;

    invoke-direct {p0, v0, p1}, Lpi1/a;->f(Ll01/n;Lcj1/g$l;)V

    return-void

    :cond_5
    instance-of v1, v0, Lc41/w1;

    if-eqz v1, :cond_6

    check-cast v0, Lc41/w1;

    invoke-direct {p0, v0, p1}, Lpi1/a;->c(Lc41/w1;Lcj1/g$l;)V

    :cond_6
    return-void
.end method

.method private final c(Lc41/w1;Lcj1/g$l;)V
    .locals 0

    invoke-virtual {p2}, Lcj1/g$l;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of p2, p1, Lcom/whoop/navigation/e;

    if-eqz p2, :cond_0

    check-cast p1, Lcom/whoop/navigation/e;

    invoke-virtual {p1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object p1

    instance-of p1, p1, Lcom/whoop/navigation/AppScreen$a0;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->h(Lfi0/a;)V

    :cond_0
    return-void
.end method

.method private final d(Lf01/o0;)V
    .locals 2

    invoke-virtual {p1}, Lf01/o0;->e()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const v1, 0x27f45f0a

    if-eq v0, v1, :cond_4

    const v1, 0x531457a6

    if-eq v0, v1, :cond_2

    const v1, 0x5d7d41af

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "STRESS_MONITOR"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->k(Lfi0/a;)V

    return-void

    :cond_2
    const-string v0, "HEALTHSPAN"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->f(Lfi0/a;)V

    return-void

    :cond_4
    const-string v0, "BLOOD_PRESSURE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    :goto_0
    return-void

    :cond_5
    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->d(Lfi0/a;)V

    return-void
.end method

.method private final e(Lfj1/c;)V
    .locals 7

    new-instance v0, Ll83/k;

    const-string v1, "ENTITLEMENT_HEALTH_MONITOR"

    const-string v2, "health_monitor"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "ENTITLEMENT_STRESS_MONITOR"

    const-string v3, "stress_monitor"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "ENTITLEMENT_HEART_SCREENER"

    const-string v4, "heart_screener"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "ENTITLEMENT_HEALTHSPAN"

    const-string v5, "healthspan"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "ENTITLEMENT_BLOOD_PRESSURE"

    const-string v6, "blood_pressure_monitor"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-virtual {p1}, Lfj1/c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object v0, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {v0, p1}, Lpi1/b;->i(Lfi0/a;Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method private final f(Ll01/n;Lcj1/g$l;)V
    .locals 2

    invoke-virtual {p2}, Lcj1/g$l;->b()Ljava/lang/Object;

    move-result-object p2

    instance-of v0, p2, Ll01/i;

    const-string v1, "toLowerCase(...)"

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ll01/n;->r()Ll01/t;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lpi1/a;->a:Lfi0/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lpi1/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of p2, p2, Lcom/whoop/navigation/e;

    if-eqz p2, :cond_3

    invoke-virtual {p1}, Ll01/n;->e()Lny0/h;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lny0/h;->f()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p2

    goto :goto_0

    :cond_1
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_2

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1, p2}, Lfi0/b;->a(Lfi0/a;Lcom/whoop/analytics/AnalyticEventModel;)V

    return-void

    :cond_2
    invoke-virtual {p1}, Ll01/n;->r()Ll01/t;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object p2, p0, Lpi1/a;->a:Lfi0/a;

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, p1}, Lpi1/b;->l(Lfi0/a;Ljava/lang/String;)V

    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Lcj1/g$a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcj1/g$l;

    if-eqz v0, :cond_0

    check-cast p1, Lcj1/g$l;

    invoke-direct {p0, p1}, Lpi1/a;->b(Lcj1/g$l;)V

    return-void

    :cond_0
    instance-of v0, p1, Lcj1/g$k;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lpi1/a;->a:Lfi0/a;

    check-cast p1, Lcj1/g$k;

    invoke-virtual {p1}, Lcj1/g$k;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lcj1/g$k;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lcj1/g$k;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lpi1/b;->m(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of p1, p1, Lcj1/g$o;

    if-eqz p1, :cond_2

    iget-object p1, p0, Lpi1/a;->a:Lfi0/a;

    invoke-static {p1}, Lpi1/b;->c(Lfi0/a;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
