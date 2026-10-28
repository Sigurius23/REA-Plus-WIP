.class public final Lcd2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001d\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000b\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcd2/b;",
        "",
        "Lfi0/a;",
        "analytics",
        "Liy1/c;",
        "metricWriter",
        "<init>",
        "(Lfi0/a;Liy1/c;)V",
        "Lcd2/a;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lcd2/a;)V",
        "",
        "durationNanos",
        "Lfd2/e;",
        "result",
        "d",
        "(JLfd2/e;)V",
        "Lfd2/a;",
        "action",
        "Lfd2/b;",
        "b",
        "(Lfd2/a;Lfd2/b;)V",
        "Lfd2/c;",
        "c",
        "(Lfd2/c;)V",
        "Lfi0/a;",
        "Liy1/c;",
        "share_release"
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


# direct methods
.method public constructor <init>(Lfi0/a;Liy1/c;)V
    .locals 1

    const-string v0, "analytics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcd2/b;->a:Lfi0/a;

    iput-object p2, p0, Lcd2/b;->b:Liy1/c;

    return-void
.end method


# virtual methods
.method public final a(Lcd2/a;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcd2/a$f;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$f;

    invoke-virtual {p1}, Lcd2/a$f;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$f;->b()Z

    move-result p1

    invoke-static {v0, v1, p1}, Lcd2/c;->h(Lfi0/a;Ljava/util/Map;Z)V

    return-void

    :cond_0
    instance-of v0, p1, Lcd2/a$b;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$b;

    invoke-virtual {p1}, Lcd2/a$b;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$b;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcd2/a$b;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcd2/c;->d(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V

    return-void

    :cond_1
    instance-of v0, p1, Lcd2/a$c;

    if-eqz v0, :cond_2

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$c;

    invoke-virtual {p1}, Lcd2/a$c;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$c;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcd2/a$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcd2/c;->e(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V

    return-void

    :cond_2
    instance-of v0, p1, Lcd2/a$d;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$d;

    invoke-virtual {p1}, Lcd2/a$d;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$d;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcd2/a$d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcd2/c;->f(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V

    return-void

    :cond_3
    instance-of v0, p1, Lcd2/a$e;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$e;

    invoke-virtual {p1}, Lcd2/a$e;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$e;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcd2/a$e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcd2/c;->g(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V

    return-void

    :cond_4
    instance-of v0, p1, Lcd2/a$a;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lcd2/b;->a:Lfi0/a;

    check-cast p1, Lcd2/a$a;

    invoke-virtual {p1}, Lcd2/a$a;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lcd2/a$a;->c()Z

    move-result v2

    invoke-virtual {p1}, Lcd2/a$a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, p1}, Lcd2/c;->c(Lfi0/a;Ljava/util/Map;ZLjava/lang/String;)V

    return-void

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final b(Lfd2/a;Lfd2/b;)V
    .locals 1

    const-string v0, "action"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcd2/b;->b:Liy1/c;

    invoke-static {v0, p1, p2}, Lfd2/d;->a(Liy1/c;Lfd2/a;Lfd2/b;)V

    return-void
.end method

.method public final c(Lfd2/c;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcd2/b;->b:Liy1/c;

    invoke-static {v0, p1}, Lfd2/d;->b(Liy1/c;Lfd2/c;)V

    return-void
.end method

.method public final d(JLfd2/e;)V
    .locals 1

    const-string v0, "result"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lcd2/b;->b:Liy1/c;

    invoke-static {v0, p1, p2, p3}, Lfd2/d;->c(Liy1/c;JLfd2/e;)V

    return-void
.end method
