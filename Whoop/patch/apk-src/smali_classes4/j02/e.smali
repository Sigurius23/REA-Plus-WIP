.class public final Lj02/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001a\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u000cR\u001d\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u000b\u0010\u0011R\u001a\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00138\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0007\u0010\u0015R\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00178\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u000f\u0010\u001a\u00a8\u0006\u001c"
    }
    d2 = {
        "Lj02/e;",
        "",
        "<init>",
        "()V",
        "Lj02/d;",
        "event",
        "Ll83/a0;",
        "c",
        "(Lj02/d;)V",
        "Lec3/p1;",
        "Lj02/f;",
        "a",
        "Lec3/p1;",
        "_navInput",
        "Lec3/f2;",
        "b",
        "Lec3/f2;",
        "()Lec3/f2;",
        "navInput",
        "Lec3/o1;",
        "",
        "Lec3/o1;",
        "_unknownTabRequests",
        "Lec3/t1;",
        "d",
        "Lec3/t1;",
        "()Lec3/t1;",
        "unknownTabRequests",
        "navigation_release"
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
.field private final a:Lec3/p1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/p1;"
        }
    .end annotation
.end field

.field private final b:Lec3/f2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/f2;"
        }
    .end annotation
.end field

.field private final c:Lec3/o1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/o1;"
        }
    .end annotation
.end field

.field private final d:Lec3/t1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lec3/t1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 6

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lj02/f;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/f;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v0

    iput-object v0, p0, Lj02/e;->a:Lec3/p1;

    invoke-static {v0}, Lec3/v;->h(Lec3/p1;)Lec3/r1;

    move-result-object v0

    iput-object v0, p0, Lj02/e;->b:Lec3/f2;

    const/4 v0, 0x1

    sget-object v1, Ldc3/a;->x:Ldc3/a;

    invoke-static {v2, v0, v1, v0}, Lec3/v;->b(IILdc3/a;I)Lec3/w1;

    move-result-object v0

    iput-object v0, p0, Lj02/e;->c:Lec3/o1;

    invoke-static {v0}, Lec3/v;->g(Lec3/o1;)Lec3/q1;

    move-result-object v0

    iput-object v0, p0, Lj02/e;->d:Lec3/t1;

    return-void
.end method


# virtual methods
.method public final a()Lec3/f2;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/f2;"
        }
    .end annotation

    iget-object v0, p0, Lj02/e;->b:Lec3/f2;

    return-object v0
.end method

.method public final b()Lec3/t1;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lec3/t1;"
        }
    .end annotation

    iget-object v0, p0, Lj02/e;->d:Lec3/t1;

    return-object v0
.end method

.method public final c(Lj02/d;)V
    .locals 9

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lj02/d$d;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lj02/e;->a:Lec3/p1;

    :cond_0
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj02/f;

    move-object v4, p1

    check-cast v4, Lj02/d$d;

    invoke-virtual {v4}, Lj02/d$d;->a()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x6

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lj02/f;->b(Lj02/f;Ljava/lang/String;ZZILjava/lang/Object;)Lj02/f;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lj02/d$c;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lj02/e;->a:Lec3/p1;

    :cond_2
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj02/f;

    move-object v4, p1

    check-cast v4, Lj02/d$c;

    invoke-virtual {v4}, Lj02/d$c;->a()Z

    move-result v5

    const/4 v7, 0x1

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Lj02/f;->b(Lj02/f;Ljava/lang/String;ZZILjava/lang/Object;)Lj02/f;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    :cond_3
    instance-of v0, p1, Lj02/d$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lj02/e;->a:Lec3/p1;

    :cond_4
    move-object v1, v0

    check-cast v1, Lec3/h2;

    invoke-virtual {v1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lj02/f;

    move-object v4, p1

    check-cast v4, Lj02/d$a;

    invoke-virtual {v4}, Lj02/d$a;->a()Z

    move-result v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lj02/f;->b(Lj02/f;Ljava/lang/String;ZZILjava/lang/Object;)Lj02/f;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Lec3/h2;->i(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    :goto_0
    return-void

    :cond_5
    instance-of v0, p1, Lj02/d$e;

    if-eqz v0, :cond_6

    iget-object v0, p0, Lj02/e;->c:Lec3/o1;

    check-cast p1, Lj02/d$e;

    invoke-virtual {p1}, Lj02/d$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-interface {v0, p1}, Lec3/o1;->a(Ljava/lang/Object;)Z

    return-void

    :cond_6
    instance-of p1, p1, Lj02/d$b;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lj02/e;->a:Lec3/p1;

    new-instance v0, Lj02/f;

    const/4 v4, 0x7

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lj02/f;-><init>(Ljava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
