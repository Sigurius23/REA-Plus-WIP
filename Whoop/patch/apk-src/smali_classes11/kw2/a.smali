.class public final Lkw2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0014"
    }
    d2 = {
        "Lkw2/a;",
        "",
        "Leb/a0;",
        "navController",
        "Lj02/o0;",
        "navigator",
        "Lgw2/a;",
        "analytics",
        "<init>",
        "(Leb/a0;Lj02/o0;Lgw2/a;)V",
        "Lkw2/b;",
        "event",
        "Ll83/a0;",
        "a",
        "(Lkw2/b;)V",
        "Leb/a0;",
        "b",
        "Lj02/o0;",
        "c",
        "Lgw2/a;",
        "what-to-expect_release"
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
.field private final a:Leb/a0;

.field private final b:Lj02/o0;

.field private final c:Lgw2/a;


# direct methods
.method public constructor <init>(Leb/a0;Lj02/o0;Lgw2/a;)V
    .locals 1

    const-string v0, "navController"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navigator"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analytics"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkw2/a;->a:Leb/a0;

    iput-object p2, p0, Lkw2/a;->b:Lj02/o0;

    iput-object p3, p0, Lkw2/a;->c:Lgw2/a;

    return-void
.end method


# virtual methods
.method public final a(Lkw2/b;)V
    .locals 3

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lkw2/b$b;

    if-eqz v0, :cond_0

    iget-object p1, p0, Lkw2/a;->a:Leb/a0;

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lkw2/b$a;

    if-eqz v0, :cond_2

    check-cast p1, Lkw2/b$a;

    invoke-virtual {p1}, Lkw2/b$a;->c()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lkw2/a;->c:Lgw2/a;

    const/4 v1, 0x1

    invoke-virtual {p1}, Lkw2/b$a;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Lgw2/a;->a(ZLjava/lang/String;)V

    goto :goto_0

    :cond_1
    iget-object v0, p0, Lkw2/a;->c:Lgw2/a;

    invoke-virtual {p1}, Lkw2/b$a;->b()Lcom/whoop/navigation/e;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/navigation/AppScreen;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lgw2/a;->b(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Lkw2/a;->b:Lj02/o0;

    invoke-virtual {p1}, Lkw2/b$a;->b()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
