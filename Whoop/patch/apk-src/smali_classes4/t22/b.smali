.class public final Lt22/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J3\u0010\u000b\u001a\u00020\n2\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0008H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u0014R\u001a\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lt22/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "",
        "source",
        "",
        "analyticsProperties",
        "Ll83/a0;",
        "a",
        "(Ljava/lang/String;Ljava/util/Map;)V",
        "Lx22/a$m;",
        "event",
        "d",
        "(Lx22/a$m;)V",
        "Lx22/a$a;",
        "c",
        "(Lx22/a$a;)V",
        "Lfi0/a;",
        "Lec3/p1;",
        "Lt22/a;",
        "b",
        "Lec3/p1;",
        "_analyticsContext",
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
.field private final a:Lfi0/a;

.field private final b:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lfi0/a;)V
    .locals 2

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt22/b;->a:Lfi0/a;

    new-instance p1, Lt22/a;

    const/4 v0, 0x0

    const/4 v1, 0x3

    invoke-direct {p1, v0, v0, v1, v0}, Lt22/a;-><init>(Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object p1

    iput-object p1, p0, Lt22/b;->b:Lec3/p1;

    return-void
.end method

.method private final a(Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, Lt22/b;->b:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lt22/a;

    if-nez p1, :cond_1

    invoke-virtual {v3}, Lt22/a;->c()Ljava/lang/String;

    move-result-object v4

    goto :goto_0

    :cond_1
    move-object v4, p1

    :goto_0
    if-nez p2, :cond_2

    invoke-virtual {v3}, Lt22/a;->b()Ljava/util/Map;

    move-result-object v5

    goto :goto_1

    :cond_2
    move-object v5, p2

    :goto_1
    invoke-virtual {v3, v4, v5}, Lt22/a;->a(Ljava/lang/String;Ljava/util/Map;)Lt22/a;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-void
.end method

.method public static synthetic b(Lt22/b;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V
    .locals 1

    and-int/lit8 p4, p3, 0x1

    const/4 v0, 0x0

    if-eqz p4, :cond_0

    move-object p1, v0

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    move-object p2, v0

    :cond_1
    invoke-direct {p0, p1, p2}, Lt22/b;->a(Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final d(Lx22/a$m;)V
    .locals 0

    iget-object p1, p0, Lt22/b;->b:Lec3/p1;

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt22/a;

    return-void
.end method


# virtual methods
.method public final c(Lx22/a$a;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lx22/a$q;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lt22/b;->a:Lfi0/a;

    check-cast p1, Lx22/a$q;

    invoke-virtual {p1}, Lx22/a$q;->a()Ljava/util/Map;

    move-result-object p1

    invoke-static {v0, p1}, Lt22/c;->e(Lfi0/a;Ljava/util/Map;)V

    return-void

    :cond_0
    instance-of v0, p1, Lx22/a$l;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p1, Lx22/a$l;

    invoke-virtual {p1}, Lx22/a$l;->a()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x2

    invoke-static {p0, p1, v1, v0, v1}, Lt22/b;->b(Lt22/b;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    return-void

    :cond_1
    instance-of v0, p1, Lx22/a$p;

    if-eqz v0, :cond_2

    check-cast p1, Lx22/a$p;

    invoke-virtual {p1}, Lx22/a$p;->a()Ljava/util/Map;

    move-result-object p1

    const/4 v0, 0x1

    invoke-static {p0, v1, p1, v0, v1}, Lt22/b;->b(Lt22/b;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    iget-object v0, p0, Lt22/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt22/a;

    invoke-virtual {v0}, Lt22/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lt22/c;->g(Lfi0/a;Ljava/util/Map;)V

    return-void

    :cond_2
    sget-object v0, Lx22/a$c;->a:Lx22/a$c;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    iget-object v0, p0, Lt22/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt22/a;

    invoke-virtual {v0}, Lt22/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lt22/c;->f(Lfi0/a;Ljava/util/Map;)V

    return-void

    :cond_3
    sget-object v0, Lx22/a$k;->a:Lx22/a$k;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    iget-object v0, p0, Lt22/b;->b:Lec3/p1;

    check-cast v0, Lec3/h2;

    invoke-virtual {v0}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt22/a;

    invoke-virtual {v0}, Lt22/a;->b()Ljava/util/Map;

    move-result-object v0

    invoke-static {p1, v0}, Lt22/c;->a(Lfi0/a;Ljava/util/Map;)V

    return-void

    :cond_4
    sget-object v0, Lx22/a$i;->a:Lx22/a$i;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    invoke-static {p1}, Lt22/c;->d(Lfi0/a;)V

    return-void

    :cond_5
    sget-object v0, Lx22/a$h;->a:Lx22/a$h;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    invoke-static {p1}, Lt22/c;->c(Lfi0/a;)V

    return-void

    :cond_6
    sget-object v0, Lx22/a$f;->a:Lx22/a$f;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object p1, p0, Lt22/b;->a:Lfi0/a;

    invoke-static {p1}, Lt22/c;->b(Lfi0/a;)V

    return-void

    :cond_7
    instance-of v0, p1, Lx22/a$m;

    if-eqz v0, :cond_8

    check-cast p1, Lx22/a$m;

    invoke-direct {p0, p1}, Lt22/b;->d(Lx22/a$m;)V

    return-void

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
