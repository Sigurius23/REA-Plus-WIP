.class public abstract Li91/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Li91/a;",
        "Li91/h;",
        "a",
        "(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;",
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
.method public static final a(Li91/a;Landroidx/compose/runtime/Composer;I)Li91/h;
    .locals 3

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p2, p0, Li91/d;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Lp1/q;

    const p2, 0x758d4ae3

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    new-instance p2, Li91/e;

    check-cast p0, Li91/d;

    invoke-virtual {p0}, Li91/d;->b()Lj91/b;

    move-result-object p0

    invoke-interface {p0, p1, v0}, Lj91/b;->a(Landroidx/compose/runtime/Composer;I)Li2/t;

    move-result-object p0

    invoke-direct {p2, p0}, Li91/e;-><init>(Li2/t;)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p2

    :cond_0
    instance-of p2, p0, Li91/f;

    if-eqz p2, :cond_1

    check-cast p1, Lp1/q;

    const p2, 0x758d5483

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    new-instance p2, Li91/g;

    check-cast p0, Li91/f;

    invoke-virtual {p0}, Li91/f;->b()Ly81/e;

    move-result-object p0

    invoke-interface {p0, p1, v0}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v1

    const/4 p0, 0x0

    invoke-direct {p2, v1, v2, p0}, Li91/g;-><init>(JLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p2

    :cond_1
    const p0, 0x758d465a

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0
.end method
