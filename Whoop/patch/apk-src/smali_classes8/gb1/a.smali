.class public abstract Lgb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lgb1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lcom/whoop/design/models/AchievementsBackgroundStyle;",
        "style",
        "a",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/AchievementsBackgroundStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;",
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
.method public static final a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/models/AchievementsBackgroundStyle;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lgb1/a$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x0

    packed-switch p1, :pswitch_data_0

    const p0, 0x76a76eab

    check-cast p2, Lp1/q;

    invoke-static {p0, p2, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :pswitch_0
    check-cast p2, Lp1/q;

    const p1, 0x76a7fb40

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    sget-object p1, Ly81/f;->PLATINUM:Ly81/f;

    invoke-static {p0, p1}, Lgb1/b0;->G(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_1
    check-cast p2, Lp1/q;

    const p1, 0x76a7ee7c

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    sget-object p1, Ly81/f;->GOLD:Ly81/f;

    invoke-static {p0, p1}, Lgb1/b0;->G(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_2
    check-cast p2, Lp1/q;

    const p1, 0x76a7e1fe

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    sget-object p1, Ly81/f;->SILVER:Ly81/f;

    invoke-static {p0, p1}, Lgb1/b0;->G(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_3
    check-cast p2, Lp1/q;

    const p1, 0x76a7d53e

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    sget-object p1, Ly81/f;->BRONZE:Ly81/f;

    invoke-static {p0, p1}, Lgb1/b0;->G(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_4
    check-cast p2, Lp1/q;

    const p1, 0x76a7cb28

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    and-int/lit8 p1, p3, 0xe

    invoke-static {p0, p2, p1}, Lgb1/b0;->a0(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_0

    :pswitch_5
    check-cast p2, Lp1/q;

    const p1, 0x76a7c066

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->j0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto/16 :goto_0

    :pswitch_6
    check-cast p2, Lp1/q;

    const p1, 0x76a7b644

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->V(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_7
    check-cast p2, Lp1/q;

    const p1, 0x76a7a722

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->w0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_8
    check-cast p2, Lp1/q;

    const p1, 0x76a7988d

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    sget-object p1, Ly81/f;->RECOVERY_LOW_RECOVERY:Ly81/f;

    invoke-static {p0, p1}, Lgb1/b0;->G(Landroidx/compose/ui/Modifier;Ly81/f;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_9
    check-cast p2, Lp1/q;

    const p1, 0x76a78c89

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->u0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_a
    check-cast p2, Lp1/q;

    const p1, 0x76a78321

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->v0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_b
    check-cast p2, Lp1/q;

    const p1, 0x76a77a21

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->e0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    goto :goto_0

    :pswitch_c
    check-cast p2, Lp1/q;

    const p1, 0x76a77140

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    invoke-static {p0}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :goto_0
    return-object p0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
