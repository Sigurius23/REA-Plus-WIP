.class public final Laf1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0017\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0011\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Laf1/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lef1/a$a$c;",
        "event",
        "Ll83/a0;",
        "d",
        "(Lef1/a$a$c;)V",
        "Lef1/a$a$b;",
        "c",
        "(Lef1/a$a$b;)V",
        "Lef1/a$a$a;",
        "b",
        "(Lef1/a$a$a;)V",
        "Lef1/a$a;",
        "a",
        "(Lef1/a$a;)V",
        "Lfi0/a;",
        "exercise-progress-mini-arch_release"
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

    iput-object p1, p0, Laf1/b;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lef1/a$a$a;)V
    .locals 6

    iget-object v0, p0, Laf1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lef1/a$a$a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v1, 0x0

    :cond_0
    move-object v3, v1

    const-string v1, "Time Period"

    invoke-virtual {p1}, Lef1/a$a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Lr80/c;->u(Ljava/lang/String;Ljava/lang/String;)Ljava/util/Map;

    move-result-object v5

    const-string v1, "Exercise Details"

    const-string v2, "Change Time Period"

    const-string v4, "Workout Builder"

    invoke-interface/range {v0 .. v5}, Lfi0/a;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method private final c(Lef1/a$a$b;)V
    .locals 8

    invoke-virtual {p1}, Lef1/a$a$b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lef1/a$a$b;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "Press Previous Date"

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_0
    invoke-virtual {p1}, Lef1/a$a$b;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lef1/a$a$b;->d()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, "Press Next Date"

    goto :goto_0

    :goto_1
    iget-object v1, p0, Laf1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lef1/a$a$b;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    move-object v0, v4

    :cond_1
    invoke-virtual {p1}, Lef1/a$a$b;->f()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v6, v4

    goto :goto_2

    :cond_2
    move-object v6, v2

    :goto_2
    invoke-virtual {p1}, Lef1/a$a$b;->g()Ljava/lang/String;

    move-result-object v2

    new-instance v4, Ll83/k;

    const-string v5, "Start Date"

    invoke-direct {v4, v5, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lef1/a$a$b;->b()Ljava/lang/String;

    move-result-object v2

    new-instance v5, Ll83/k;

    const-string v7, "End Date"

    invoke-direct {v5, v7, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lef1/a$a$b;->h()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v7, "Time Period"

    invoke-direct {v2, v7, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v4, v5, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v7

    const-string v2, "Exercise Details"

    const-string v5, "Workout Builder"

    move-object v4, v0

    invoke-interface/range {v1 .. v7}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    :cond_3
    return-void
.end method

.method private final d(Lef1/a$a$c;)V
    .locals 7

    iget-object v0, p0, Laf1/b;->a:Lfi0/a;

    invoke-virtual {p1}, Lef1/a$a$c;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    move-object v1, v3

    :cond_0
    invoke-virtual {p1}, Lef1/a$a$c;->c()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1

    move-object v5, v3

    goto :goto_0

    :cond_1
    move-object v5, v2

    :goto_0
    invoke-virtual {p1}, Lef1/a$a$c;->d()Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ll83/k;

    const-string v4, "Time Period"

    invoke-direct {v3, v4, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lef1/a$a$c;->b()Ljava/lang/String;

    move-result-object p1

    new-instance v2, Ll83/k;

    const-string v4, "Exercise Type"

    invoke-direct {v2, v4, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v2}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v6

    move-object v3, v1

    const-string v1, "Exercise Details"

    const-string v2, "Scrub"

    const-string v4, "Workout Builder"

    invoke-interface/range {v0 .. v6}, Lfi0/a;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method


# virtual methods
.method public final a(Lef1/a$a;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lef1/a$a$c;

    if-eqz v0, :cond_0

    check-cast p1, Lef1/a$a$c;

    invoke-direct {p0, p1}, Laf1/b;->d(Lef1/a$a$c;)V

    return-void

    :cond_0
    instance-of v0, p1, Lef1/a$a$b;

    if-eqz v0, :cond_1

    check-cast p1, Lef1/a$a$b;

    invoke-direct {p0, p1}, Laf1/b;->c(Lef1/a$a$b;)V

    return-void

    :cond_1
    instance-of v0, p1, Lef1/a$a$a;

    if-eqz v0, :cond_2

    check-cast p1, Lef1/a$a$a;

    invoke-direct {p0, p1}, Laf1/b;->b(Lef1/a$a$a;)V

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
