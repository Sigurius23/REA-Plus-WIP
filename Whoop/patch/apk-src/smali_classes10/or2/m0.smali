.class public abstract Lor2/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001aO\u0010\u000b\u001a\u00020\u0008*\u00020\u00002\u000e\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\"\u0010\n\u001a\u001e\u0008\u0001\u0012\u0004\u0012\u00020\u0000\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\u00080\u0007\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lbc3/c0;",
        "Lec3/p1;",
        "Lbc3/k1;",
        "job",
        "Lq83/j;",
        "context",
        "Lkotlin/Function2;",
        "Lq83/d;",
        "Ll83/a0;",
        "",
        "runJob",
        "a",
        "(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;)V",
        "essentials_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lec3/p1;",
            "Lq83/j;",
            "Lc93/m;",
            ")V"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "job"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "runJob"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lec3/h2;

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lbc3/k1;->isActive()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    invoke-virtual {p1}, Lec3/h2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/k1;

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    new-instance v0, Lor2/m0$a;

    invoke-direct {v0, p3, v1}, Lor2/m0$a;-><init>(Lc93/m;Lq83/d;)V

    const/4 p3, 0x2

    invoke-static {p0, p2, v1, v0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    invoke-virtual {p1, v1, p0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    return-void
.end method

.method public static synthetic b(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    sget-object p2, Lq83/k;->w:Lq83/k;

    :cond_0
    invoke-static {p0, p1, p2, p3}, Lor2/m0;->a(Lbc3/c0;Lec3/p1;Lq83/j;Lc93/m;)V

    return-void
.end method
