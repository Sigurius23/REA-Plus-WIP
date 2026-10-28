.class public final Lof0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0015\u0010\u000c\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lof0/a;",
        "",
        "Lfi0/a;",
        "analytics",
        "<init>",
        "(Lfi0/a;)V",
        "Lsf0/a$f;",
        "event",
        "Ll83/a0;",
        "b",
        "(Lsf0/a$f;)V",
        "Lsf0/a$b;",
        "a",
        "(Lsf0/a$b;)V",
        "Lfi0/a;",
        "advanced-labs-join_release"
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

    iput-object p1, p0, Lof0/a;->a:Lfi0/a;

    return-void
.end method

.method private final b(Lsf0/a$f;)V
    .locals 2

    invoke-virtual {p1}, Lsf0/a$f;->a()Lm91/u;

    move-result-object v0

    instance-of v1, v0, Li01/h;

    if-eqz v1, :cond_0

    invoke-virtual {p1}, Lsf0/a$f;->b()Ljava/lang/Object;

    move-result-object v0

    instance-of v0, v0, Li01/b;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lsf0/a$f;->b()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Li01/b;

    invoke-virtual {p1}, Li01/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lof0/b;->d(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v1, v0, Lq31/f;

    if-eqz v1, :cond_2

    invoke-virtual {p1}, Lsf0/a$f;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lq31/b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    check-cast p1, Lq31/b;

    invoke-virtual {p1}, Lq31/b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lof0/b;->d(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Li01/b;

    if-eqz v0, :cond_7

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    check-cast p1, Li01/b;

    invoke-virtual {p1}, Li01/b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lof0/b;->d(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v1, v0, Lsz0/h0;

    if-eqz v1, :cond_3

    iget-object p1, p0, Lof0/a;->a:Lfi0/a;

    invoke-static {p1}, Lof0/b;->h(Lfi0/a;)V

    return-void

    :cond_3
    instance-of v1, v0, Lq11/e;

    if-eqz v1, :cond_4

    invoke-virtual {p1}, Lsf0/a$f;->b()Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, Lq11/a$b;

    if-eqz v0, :cond_7

    check-cast p1, Lq11/a$b;

    invoke-virtual {p1}, Lq11/a$b;->c()Z

    move-result v0

    if-eqz v0, :cond_7

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    invoke-virtual {p1}, Lq11/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lof0/b;->g(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_4
    instance-of v0, v0, Lc41/p2;

    if-eqz v0, :cond_7

    invoke-virtual {p1}, Lsf0/a$f;->a()Lm91/u;

    move-result-object p1

    check-cast p1, Lc41/p2;

    invoke-virtual {p1}, Lc41/p2;->c()Ljava/util/Map;

    move-result-object p1

    if-eqz p1, :cond_5

    const-string v0, "region"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-nez p1, :cond_6

    :cond_5
    const-string p1, "unknown"

    :cond_6
    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    invoke-static {v0, p1}, Lof0/b;->b(Lfi0/a;Ljava/lang/String;)V

    :cond_7
    return-void
.end method


# virtual methods
.method public final a(Lsf0/a$b;)V
    .locals 2

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lsf0/a$a;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    check-cast p1, Lsf0/a$a;

    invoke-virtual {p1}, Lsf0/a$a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsf0/a$a;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lof0/b;->f(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_0
    instance-of v0, p1, Lsf0/a$f;

    if-eqz v0, :cond_1

    check-cast p1, Lsf0/a$f;

    invoke-direct {p0, p1}, Lof0/a;->b(Lsf0/a$f;)V

    return-void

    :cond_1
    instance-of v0, p1, Lsf0/a$j;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    check-cast p1, Lsf0/a$j;

    invoke-virtual {p1}, Lsf0/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Lof0/b;->a(Lfi0/a;Ljava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lsf0/a$k;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lof0/a;->a:Lfi0/a;

    check-cast p1, Lsf0/a$k;

    invoke-virtual {p1}, Lsf0/a$k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lsf0/a$k;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lof0/b;->e(Lfi0/a;Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
