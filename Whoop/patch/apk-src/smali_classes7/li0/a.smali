.class public abstract Lli0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "T",
        "Lec3/t1;",
        "initial",
        "a",
        "(Lec3/t1;Ljava/lang/Object;)Lec3/t1;",
        "core_release"
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
.method public static final a(Lec3/t1;Ljava/lang/Object;)Lec3/t1;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lec3/t1;",
            "TT;)",
            "Lec3/t1;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lli0/a$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lli0/a$a;-><init>(Ljava/lang/Object;Lq83/d;)V

    new-instance p1, Lec3/m2;

    invoke-direct {p1, p0, v0}, Lec3/m2;-><init>(Lec3/t1;Lc93/m;)V

    return-object p1
.end method
