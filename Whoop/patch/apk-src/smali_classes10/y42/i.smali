.class public abstract Ly42/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Ly42/a;",
        "Lc52/b;",
        "a",
        "(Ly42/a;Lq83/d;)Ljava/lang/Object;",
        "puffin_release"
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
.method public static final a(Ly42/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly42/a;",
            "Lq83/d<",
            "-",
            "Lc52/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p0}, Ly42/a;->l()Lec3/t1;

    move-result-object p0

    new-instance v0, Ly42/i$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ly42/i$a;-><init>(Lq83/d;)V

    invoke-static {p0, v0, p1}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
