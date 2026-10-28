.class public abstract Li71/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Li71/b;",
        "dataScrollerFactory",
        "Lh71/j;",
        "scrollableGraphState",
        "Li71/g;",
        "a",
        "(Li71/b;Lh71/j;Landroidx/compose/runtime/Composer;I)Li71/g;",
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
.method public static final a(Li71/b;Lh71/j;Landroidx/compose/runtime/Composer;I)Li71/g;
    .locals 3

    const-string v0, "dataScrollerFactory"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scrollableGraphState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lh71/j;->b()Li71/e;

    move-result-object v0

    and-int/lit8 v1, p3, 0xe

    xor-int/lit8 v1, v1, 0x6

    const/4 v2, 0x4

    if-le v1, v2, :cond_0

    move-object v1, p2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1

    :cond_0
    and-int/lit8 p3, p3, 0x6

    if-ne p3, v2, :cond_2

    :cond_1
    const/4 p3, 0x1

    goto :goto_0

    :cond_2
    const/4 p3, 0x0

    :goto_0
    check-cast p2, Lp1/q;

    invoke-virtual {p2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p3, v0

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne v0, p3, :cond_4

    :cond_3
    invoke-virtual {p1}, Lh71/j;->b()Li71/e;

    move-result-object p1

    invoke-virtual {p0, p1}, Li71/b;->a(Li71/e;)Li71/g;

    move-result-object v0

    invoke-virtual {p2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Li71/g;

    return-object v0
.end method
