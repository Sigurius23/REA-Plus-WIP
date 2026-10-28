.class public abstract Luz0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Luz0/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Luz0/k;",
        "zoneStyle",
        "Li2/x;",
        "a",
        "(Luz0/k;Landroidx/compose/runtime/Composer;I)J",
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
.method public static final a(Luz0/k;Landroidx/compose/runtime/Composer;I)J
    .locals 3

    const-string p2, "zoneStyle"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Luz0/j$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, p2, p0

    const/4 p2, 0x6

    const/4 v0, 0x0

    packed-switch p0, :pswitch_data_0

    const p0, -0x7f4e8ba1

    check-cast p1, Lp1/q;

    invoke-static {p0, p1, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :pswitch_0
    check-cast p1, Lp1/q;

    const p0, -0x7f4e5690

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->q()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lp1/q;

    const p0, -0x7f4e5eec

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->p0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Lp1/q;

    const p0, -0x7f4e680c

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->o0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :pswitch_3
    check-cast p1, Lp1/q;

    const p0, -0x7f4e712c

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->n0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :pswitch_4
    check-cast p1, Lp1/q;

    const p0, -0x7f4e7a4c

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->m0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    goto :goto_0

    :pswitch_5
    check-cast p1, Lp1/q;

    const p0, -0x7f4e836c

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lx81/d;->a:Lx81/d;

    invoke-virtual {p0, p1, p2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object p0

    invoke-virtual {p0}, Ly81/i;->l0()J

    move-result-wide v1

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    :goto_0
    return-wide v1

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
