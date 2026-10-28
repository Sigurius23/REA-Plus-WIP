.class public abstract Ln91/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0004\u001a\u001d\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a!\u0010\u0007\u001a\u00020\u00012\u0012\u0010\u0006\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\u00020\u0005\"\u00020\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Ln91/a;",
        "Lm91/u;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;",
        "",
        "items",
        "b",
        "([Lm91/u;)Ln91/a;",
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
.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ln91/a;",
            ">;)",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ln91/a;

    invoke-interface {v1}, Ln91/a;->a()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v0, v1}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    return-object v0
.end method

.method public static final varargs b([Lm91/u;)Ln91/a;
    .locals 7

    const-string v0, "items"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln91/c;

    new-instance v1, Lkotlin/jvm/internal/k0;

    const/4 v2, 0x3

    invoke-direct {v1, v2}, Lkotlin/jvm/internal/k0;-><init>(I)V

    new-instance v2, Lm91/c0;

    const/16 v3, 0x10

    int-to-float v3, v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-direct {v2, v4, v3, v5, v6}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/k0;->e(Ljava/lang/Object;)V

    new-instance p0, Lm91/c0;

    invoke-direct {p0, v4, v3, v5, v6}, Lm91/c0;-><init>(FFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    iget-object p0, v1, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    new-array v1, v1, [Lm91/u;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    invoke-direct {v0, p0}, Ln91/c;-><init>(Ljava/util/List;)V

    return-object v0
.end method
