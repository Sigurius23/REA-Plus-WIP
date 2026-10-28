.class public final Lgb/i;
.super Leb/i1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Leb/i1;"
    }
.end annotation

.annotation runtime Leb/h1;
    value = "composable"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002B\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lgb/i;",
        "Leb/i1;",
        "Lgb/h;",
        "<init>",
        "()V",
        "navigation-compose_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x8,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final c:Lp1/k1;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    iput-object v0, p0, Lgb/i;->c:Lp1/k1;

    return-void
.end method


# virtual methods
.method public final a()Leb/n0;
    .locals 2

    new-instance v0, Lgb/h;

    sget-object v1, Lgb/c;->a:Lx1/b;

    invoke-direct {v0, p0, v1}, Lgb/h;-><init>(Lgb/i;Lx1/b;)V

    return-object v0
.end method

.method public final d(Ljava/util/List;Leb/x0;)V
    .locals 1

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Leb/q;

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p2}, Leb/t;->i(Leb/q;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lgb/i;->c:Lp1/k1;

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method public final i(Leb/q;Z)V
    .locals 1

    invoke-virtual {p0}, Leb/i1;->b()Leb/t;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Leb/t;->f(Leb/q;Z)V

    iget-object p1, p0, Lgb/i;->c:Lp1/k1;

    sget-object p2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, p2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-void
.end method
