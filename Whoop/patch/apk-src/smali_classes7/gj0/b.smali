.class public final Lgj0/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Log/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J+\u0010\u0017\u001a\u00020\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0013J+\u0010\u0018\u001a\u00020\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0010\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000fH\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001b"
    }
    d2 = {
        "Lgj0/b;",
        "Log/g;",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Ltr2/n;)V",
        "Log/b;",
        "level",
        "Lgj0/a;",
        "a",
        "(Log/b;)Lgj0/a;",
        "",
        "t",
        "Lkotlin/Function0;",
        "",
        "Laws/smithy/kotlin/runtime/telemetry/logging/MessageSupplier;",
        "msg",
        "Ll83/a0;",
        "u",
        "(Ljava/lang/Throwable;Lc93/a;)V",
        "",
        "j",
        "(Log/b;)Z",
        "s",
        "n",
        "w",
        "Ltr2/n;",
        "auth_release"
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
.field private final w:Ltr2/n;


# direct methods
.method public constructor <init>(Ltr2/n;)V
    .locals 1

    const-string v0, "logger"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgj0/b;->w:Ltr2/n;

    return-void
.end method


# virtual methods
.method public a(Log/b;)Lgj0/a;
    .locals 2

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgj0/a;

    iget-object v1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-direct {v0, v1, p1}, Lgj0/a;-><init>(Ltr2/n;Log/b;)V

    return-object v0
.end method

.method public bridge synthetic g(Log/b;)Log/e;
    .locals 0

    invoke-virtual {p0, p1}, Lgj0/b;->a(Log/b;)Lgj0/a;

    move-result-object p1

    return-object p1
.end method

.method public j(Log/b;)Z
    .locals 1

    const-string v0, "level"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x1

    return p1
.end method

.method public n(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p2, p1, v0}, Ltr2/n;->c(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_0
    iget-object p1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public s(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p2, p1, v0}, Ltr2/n;->s(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_0
    iget-object p1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method public u(Ljava/lang/Throwable;Lc93/a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Throwable;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "msg"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    iget-object v1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p2, p1, v0}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void

    :cond_0
    iget-object p1, p0, Lgj0/b;->w:Ltr2/n;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {p1, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method
