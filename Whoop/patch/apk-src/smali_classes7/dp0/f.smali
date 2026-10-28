.class public abstract Ldp0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "Lep0/j;",
        "context",
        "",
        "isScreenOverlayVisible",
        "b",
        "(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;",
        "coach-everywhere-common_release"
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
.method public static synthetic a(Lep0/j;Ltr2/n;ZLdp0/g;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ldp0/f;->c(Lep0/j;Ltr2/n;ZLdp0/g;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lep0/j;ZLandroidx/compose/runtime/Composer;II)Landroidx/compose/ui/Modifier;
    .locals 7
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ComposableModifierFactory",
            "This is actually the standard moving forward, but lint disagrees and the agents will keep trying to change it"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p5, p5, 0x2

    const/4 v0, 0x0

    if-eqz p5, :cond_0

    move v4, v0

    goto :goto_0

    :cond_0
    move v4, p2

    :goto_0
    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object p2

    check-cast p3, Lp1/q;

    invoke-virtual {p3, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    move-object v5, p2

    check-cast v5, Ldp0/g;

    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p5, "CoachEverywhereModifier"

    invoke-virtual {p2, p5}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p2

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    invoke-virtual {p3, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr p5, v1

    and-int/lit16 v1, p4, 0x380

    xor-int/lit16 v1, v1, 0x180

    const/16 v2, 0x100

    if-le v1, v2, :cond_1

    invoke-virtual {p3, v4}, Lp1/q;->h(Z)Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    and-int/lit16 p4, p4, 0x180

    if-ne p4, v2, :cond_3

    :cond_2
    const/4 v0, 0x1

    :cond_3
    or-int p4, p5, v0

    invoke-virtual {p3, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    or-int/2addr p4, p5

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p5

    if-nez p4, :cond_5

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-ne p5, p4, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, p1

    goto :goto_2

    :cond_5
    :goto_1
    new-instance v1, Lch0/e;

    const/4 v6, 0x3

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lch0/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-virtual {p3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p5, v1

    :goto_2
    check-cast p5, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, p2, p5, p3}, Lp1/x;->d(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    sget-object p1, Lb2/t;->w:Lb2/t;

    invoke-interface {p0, p1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Lep0/j;Ltr2/n;ZLdp0/g;Lp1/i0;)Lp1/h0;
    .locals 3

    const-string v0, "$this$DisposableEffect"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lep0/j;->p()Ljava/lang/String;

    move-result-object p4

    goto :goto_0

    :cond_0
    const/4 p4, 0x0

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "DisposableEffect: registerCoachEverywhere - screenId: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", context: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    invoke-interface {p1, v0, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    if-eqz p4, :cond_2

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lep0/j;->x()Z

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_1

    if-nez p2, :cond_1

    move v1, v2

    :cond_1
    invoke-interface {p3, v1, p0}, Ldp0/g;->t(ZLep0/j;)V

    :cond_2
    new-instance p2, Ldp0/f$a;

    invoke-direct {p2, p1, p4, p0, p3}, Ldp0/f$a;-><init>(Ltr2/n;Ljava/lang/String;Lep0/j;Ldp0/g;)V

    return-object p2
.end method
