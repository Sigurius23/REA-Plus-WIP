.class public abstract Lor2/d0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a-\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\u0008\u0000\u0010\u0000*\u0008\u0012\u0004\u0012\u00028\u00000\u00012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "T",
        "Landroidx/lifecycle/p0;",
        "Lq83/j;",
        "immediateContext",
        "Lec3/l;",
        "a",
        "(Landroidx/lifecycle/p0;Lq83/j;)Lec3/l;",
        "feature_release"
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
.method public static final a(Landroidx/lifecycle/p0;Lq83/j;)Lec3/l;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/lifecycle/p0;",
            "Lq83/j;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "immediateContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lor2/d0$a;

    const/4 v1, 0x0

    invoke-direct {v0, p1, p0, v1}, Lor2/d0$a;-><init>(Lq83/j;Landroidx/lifecycle/p0;Lq83/d;)V

    invoke-static {v0}, Lec3/v;->j(Lc93/m;)Lec3/c;

    move-result-object p0

    const/4 p1, -0x1

    const/4 v0, 0x2

    invoke-static {p0, p1, v0}, Lec3/v;->i(Lec3/l;II)Lec3/l;

    move-result-object p0

    return-object p0
.end method
