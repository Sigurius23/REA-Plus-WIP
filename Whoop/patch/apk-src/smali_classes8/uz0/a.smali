.class public abstract Luz0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luz0/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Luz0/b;",
        "intensityStyle",
        "Li2/x;",
        "a",
        "(Luz0/b;Landroidx/compose/runtime/Composer;I)J",
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
.method public static final a(Luz0/b;Landroidx/compose/runtime/Composer;I)J
    .locals 4

    const-string p2, "intensityStyle"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Luz0/a$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x1

    const/4 v0, 0x6

    const/4 v1, 0x0

    if-eq p0, p2, :cond_3

    const/4 p2, 0x2

    if-eq p0, p2, :cond_2

    const/4 p2, 0x3

    if-eq p0, p2, :cond_1

    const/4 p2, 0x4

    if-ne p0, p2, :cond_0

    check-cast p1, Lp1/q;

    const p0, 0x6ed1e629

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-static {p0, p1, v0, v1}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide p0

    goto :goto_1

    :cond_0
    const p0, 0x6ed1c086

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, 0x6ed1dd2d

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    :goto_0
    move-wide p0, v2

    goto :goto_1

    :cond_2
    check-cast p1, Lp1/q;

    const p0, 0x6ed1d338

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->c0()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_3
    check-cast p1, Lp1/q;

    const p0, 0x6ed1c955

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    goto :goto_0

    :goto_1
    return-wide p0
.end method
