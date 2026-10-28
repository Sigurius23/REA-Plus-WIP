.class public final Lbj1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0015\u0010\u000c\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0008\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lbj1/c;",
        "",
        "Lj02/o0;",
        "navigator",
        "<init>",
        "(Lj02/o0;)V",
        "Lm91/u;",
        "Ll83/a0;",
        "a",
        "(Lm91/u;)V",
        "Lcj1/g$n;",
        "event",
        "b",
        "(Lcj1/g$n;)V",
        "Lj02/o0;",
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
.field private final a:Lj02/o0;


# direct methods
.method public constructor <init>(Lj02/o0;)V
    .locals 1

    const-string v0, "navigator"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lbj1/c;->a:Lj02/o0;

    return-void
.end method

.method private final a(Lm91/u;)V
    .locals 2

    instance-of v0, p1, Lcj1/e;

    if-eqz v0, :cond_0

    check-cast p1, Lcj1/e;

    invoke-virtual {p1}, Lcj1/e;->c()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lbj1/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, La11/r;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lbj1/c;->a:Lj02/o0;

    new-instance v1, Lj02/m0$r0;

    check-cast p1, La11/r;

    invoke-virtual {p1}, La11/r;->c()La11/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Lj02/m0$r0;-><init>(Ljava/lang/String;)V

    invoke-interface {v0, v1}, Lj02/o0;->b(Lj02/m0;)Lj02/p0;

    return-void

    :cond_1
    instance-of v0, p1, Lc41/i5;

    if-eqz v0, :cond_2

    check-cast p1, Lc41/i5;

    invoke-virtual {p1}, Lc41/i5;->f()Lcom/whoop/navigation/e;

    move-result-object p1

    if-eqz p1, :cond_3

    iget-object v0, p0, Lbj1/c;->a:Lj02/o0;

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_2
    instance-of v0, p1, Lny0/h;

    if-eqz v0, :cond_3

    iget-object v0, p0, Lbj1/c;->a:Lj02/o0;

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    :cond_3
    return-void
.end method


# virtual methods
.method public final b(Lcj1/g$n;)V
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcj1/g$c;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lbj1/c;->a:Lj02/o0;

    check-cast p1, Lcj1/g$c;

    invoke-virtual {p1}, Lcj1/g$c;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {v0, p1}, Lj02/o0;->a(Lcom/whoop/navigation/e;)Lj02/p0;

    return-void

    :cond_0
    instance-of v0, p1, Lcj1/g$b;

    if-eqz v0, :cond_1

    check-cast p1, Lcj1/g$b;

    invoke-virtual {p1}, Lcj1/g$b;->a()Lm91/u;

    move-result-object p1

    invoke-direct {p0, p1}, Lbj1/c;->a(Lm91/u;)V

    return-void

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
