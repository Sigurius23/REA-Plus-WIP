.class public abstract Le81/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le81/g0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Le81/i0;",
        "Li2/x;",
        "a",
        "(Le81/i0;Landroidx/compose/runtime/Composer;I)J",
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
.method public static final a(Le81/i0;Landroidx/compose/runtime/Composer;I)J
    .locals 4

    const-string p2, "<this>"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Le81/g0$a;->a:[I

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

    const p0, -0x43268eb7

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    const p0, 0x3f4ccccd    # 0.8f

    const/16 p1, 0x10

    const/high16 p2, 0x3e800000    # 0.25f

    const v0, 0x3e851eb8    # 0.26f

    invoke-static {p2, v0, v0, p0, p1}, Li2/w0;->f(FFFFI)J

    move-result-wide p0

    return-wide p0

    :cond_0
    const p0, -0x4326acd8

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_1
    check-cast p1, Lp1/q;

    const p0, -0x432694a4

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->f()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-wide v2

    :cond_2
    check-cast p1, Lp1/q;

    const p0, -0x43269d48

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->q0()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-wide v2

    :cond_3
    check-cast p1, Lp1/q;

    const p0, -0x4326a624

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->j()J

    move-result-wide v2

    invoke-virtual {p1, v1}, Lp1/q;->q(Z)V

    return-wide v2
.end method
