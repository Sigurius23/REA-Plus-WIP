.class public abstract Lj91/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0015\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Ly81/i;",
        "Li2/t;",
        "brushFactory",
        "Lj91/b;",
        "b",
        "(Lkotlin/jvm/functions/Function1;)Lj91/b;",
        "brush",
        "a",
        "(Li2/t;)Lj91/b;",
        "design_release"
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
.method public static final a(Li2/t;)Lj91/b;
    .locals 1

    const-string v0, "brush"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj91/a;

    invoke-direct {v0, p0}, Lj91/a;-><init>(Li2/t;)V

    return-object v0
.end method

.method public static final b(Lkotlin/jvm/functions/Function1;)Lj91/b;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            ")",
            "Lj91/b;"
        }
    .end annotation

    const-string v0, "brushFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lj91/d;

    invoke-direct {v0, p0}, Lj91/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
