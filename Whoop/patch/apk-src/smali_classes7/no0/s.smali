.class public abstract Lno0/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001aG\u0010\u000c\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a+\u0010\u000f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u000e2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001b\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u001a\u000f\u0010\u0016\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a+\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0007\u00a8\u0006\u001b\u00b2\u0006\u000c\u0010\u001a\u001a\u00020\u00198\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "appointmentId",
        "Lkotlin/Function1;",
        "Llo0/j;",
        "Ll83/a0;",
        "onNavigationEvent",
        "l",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Llo0/n;",
        "viewState",
        "Llo0/k;",
        "onViewEvent",
        "m",
        "(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Llo0/n$c;",
        "x",
        "(Llo0/n$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "D",
        "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;",
        "v",
        "(Landroidx/compose/runtime/Composer;I)V",
        "s",
        "Llo0/m;",
        "viewModel",
        "clinician-in-the-loop_release"
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
.method private static final A(Llo0/l;Ll0/s1;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 0

    const-string p1, "clickType"

    invoke-static {p3, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lc31/c;->FILLED_BUTTON:Lc31/c;

    if-ne p3, p1, :cond_1

    invoke-virtual {p0}, Llo0/l;->d()Lc31/k;

    move-result-object p0

    invoke-virtual {p0}, Lc31/k;->o()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p1, Llo0/g;

    invoke-direct {p1, p0}, Llo0/g;-><init>(Lcom/whoop/navigation/models/GenericInteraction;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, Llo0/h;->a:Llo0/h;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Llo0/n$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lno0/s;->x(Llo0/n$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic C(Ll83/h;)Llo0/m;
    .locals 0

    invoke-static {p0}, Lno0/s;->n(Ll83/h;)Llo0/m;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lai1/b;

    const/16 v1, 0x19

    invoke-direct {v0, p1, p2, v1}, Lai1/b;-><init>(JI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final E(JLk2/e;)Ll83/a0;
    .locals 13

    const-string v2, "$this$drawBehind"

    invoke-static {p2, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Li2/t;->b:Li2/s;

    const v2, 0x3e4ccccd    # 0.2f

    invoke-static {v2, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v5

    new-instance v2, Li2/x;

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    const/4 v5, 0x0

    invoke-static {v5, p0, p1}, Li2/x;->c(FJ)J

    move-result-wide v0

    new-instance v5, Li2/x;

    invoke-direct {v5, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v5}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v1, v6

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long/2addr v6, v2

    and-long/2addr v0, v8

    or-long/2addr v6, v0

    invoke-interface {p2}, Lk2/e;->d()J

    move-result-wide v0

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    const/16 v9, 0x8

    invoke-static/range {v4 .. v9}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v4

    const/4 v11, 0x0

    const/16 v12, 0x7e

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v3, p2

    invoke-static/range {v3 .. v12}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lno0/s;->u(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lno0/s;->q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llo0/n$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lno0/s;->B(Llo0/n$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lno0/s;->w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lno0/s;->t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Llo0/l;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/s;->z(Llo0/l;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Llo0/l;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;
    .locals 1

    sget-object v0, Ll0/t1;->a:Ll0/t1;

    invoke-static {p0, v0, p1, p2}, Lno0/s;->A(Llo0/l;Ll0/s1;Lkotlin/jvm/functions/Function1;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lno0/s;->E(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Ll83/h;Llo0/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/s;->p(Ll83/h;Llo0/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/s;->r(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/s;->y(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "appointmentId"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x7837ed69

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    const/4 v0, 0x4

    if-nez p2, :cond_1

    invoke-virtual {v4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    move p2, v0

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v1, v2, :cond_4

    move v1, v7

    goto :goto_3

    :cond_4
    move v1, v8

    :goto_3
    and-int/lit8 v2, p2, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    const v1, -0x649fae96

    invoke-virtual {v4, v1}, Lp1/q;->f0(I)V

    sget-object v1, Lpf3/a;->b:Lnf3/a;

    if-eqz v1, :cond_c

    iget-object v1, v1, Lnf3/a;->a:Lwf3/a;

    iget-object v1, v1, Lwf3/a;->d:Lxf3/c;

    const v2, -0x649fad62

    const v3, -0x384098

    invoke-static {v4, v2, v4, v8, v3}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v2

    const/4 v9, 0x0

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v3, :cond_5

    if-ne v5, v10, :cond_6

    :cond_5
    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v5, Lno0/s$a;

    invoke-direct {v5, v1, v9, v9, v2}, Lno0/s$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v3, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    move-object v11, v5

    check-cast v11, Ll83/h;

    invoke-virtual {v4, v8}, Lp1/q;->q(Z)V

    invoke-static {v11}, Lno0/s;->n(Ll83/h;)Llo0/m;

    move-result-object v1

    invoke-virtual {v1}, Llo0/m;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Llo0/n$b;->b:Llo0/n$b;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    and-int/lit8 v3, p2, 0xe

    if-ne v3, v0, :cond_7

    goto :goto_4

    :cond_7
    move v7, v8

    :goto_4
    or-int v0, v2, v7

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_8

    if-ne v2, v10, :cond_9

    :cond_8
    new-instance v2, Lno0/s$b;

    invoke-direct {v2, p0, v11, v9}, Lno0/s$b;-><init>(Ljava/lang/String;Ll83/h;Lq83/d;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v2, Lc93/m;

    invoke-static {v4, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lno0/s;->o(Lp1/t2;)Llo0/n;

    move-result-object v0

    const-string v2, "healthcare_loop_appointment_scheduling_confirmation"

    const/16 v3, 0x30

    invoke-static {v0, v2, v4, v3}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1}, Lno0/s;->o(Lp1/t2;)Llo0/n;

    move-result-object v1

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_a

    if-ne v2, v10, :cond_b

    :cond_a
    new-instance v2, Lno0/q;

    const/4 v0, 0x0

    invoke-direct {v2, v11, v0}, Lno0/q;-><init>(Ll83/h;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v3, v2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, p2, 0x3

    and-int/lit8 v0, v0, 0x70

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x1c00

    or-int v6, v0, p2

    move-object v2, p0

    move-object v5, v4

    move-object v4, p1

    invoke-static/range {v1 .. v6}, Lno0/s;->m(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_c
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "KoinApplication has not been started"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_d
    move-object v2, p0

    move-object v5, v4

    move-object v4, p1

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_e

    new-instance p1, Lgh0/c;

    const/4 p2, 0x1

    invoke-direct {p1, v2, p3, p2, v4}, Lgh0/c;-><init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final m(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/n;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "appointmentId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p4, Lp1/q;

    const v0, -0x37627427

    invoke-virtual {p4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p4, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p5

    goto :goto_1

    :cond_1
    move v0, p5

    :goto_1
    and-int/lit8 v1, p5, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p5, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, p5, 0xc00

    if-nez v1, :cond_7

    invoke-virtual {p4, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_6

    const/16 v1, 0x800

    goto :goto_4

    :cond_6
    const/16 v1, 0x400

    :goto_4
    or-int/2addr v0, v1

    :cond_7
    and-int/lit16 v1, v0, 0x493

    const/16 v2, 0x492

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_8

    move v1, v3

    goto :goto_5

    :cond_8
    move v1, v4

    :goto_5
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_f

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->w:Lb2/m;

    invoke-static {v2, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v5, p4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {p4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {p4}, Lp1/q;->i0()V

    iget-boolean v8, p4, Lp1/q;->S:Z

    if-eqz v8, :cond_9

    invoke-virtual {p4, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {p4}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {p4, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {p4, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, p4, Lp1/q;->S:Z

    if-nez v6, :cond_a

    invoke-virtual {p4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_b

    :cond_a
    invoke-static {v5, p4, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {p4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    instance-of v1, p0, Llo0/n$c;

    if-eqz v1, :cond_c

    const v1, -0x55f91a03

    invoke-virtual {p4, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Llo0/n$c;

    and-int/lit8 v2, v0, 0xe

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    invoke-static {v1, p3, p4, v0}, Lno0/s;->x(Llo0/n$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_c
    sget-object v1, Llo0/n$a;->b:Llo0/n$a;

    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_d

    const v1, -0x55f90ac9

    invoke-virtual {p4, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x7e

    invoke-static {p1, p2, p4, v0}, Lno0/s;->s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    sget-object v0, Llo0/n$b;->b:Llo0/n$b;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_e

    const v0, -0x55f8fa5f

    invoke-virtual {p4, v0}, Lp1/q;->e0(I)V

    invoke-static {p4, v4}, Lno0/s;->v(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p4, v4}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {p4, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    const p0, -0x55f92571

    invoke-static {p0, p4, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_f
    invoke-virtual {p4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {p4}, Lp1/q;->u()Lp1/v1;

    move-result-object p4

    if-eqz p4, :cond_10

    new-instance v0, Lmh0/b;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move v5, p5

    invoke-direct/range {v0 .. v5}, Lmh0/b;-><init>(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    iput-object v0, p4, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final n(Ll83/h;)Llo0/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Llo0/m;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llo0/m;

    return-object p0
.end method

.method private static final o(Lp1/t2;)Llo0/n;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Llo0/n;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Llo0/n;

    return-object p0
.end method

.method private static final p(Ll83/h;Llo0/k;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lno0/s;->n(Ll83/h;)Llo0/m;

    move-result-object p0

    invoke-virtual {p0, p1}, Llo0/m;->n(Llo0/k;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lno0/s;->l(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lno0/s;->m(Llo0/n;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, -0x6bda2ea7

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    const/4 v5, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    move v3, v5

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v6, v2, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v15, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_9

    new-instance v16, Lsz0/p0$b;

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lgy0/f;->P1:I

    const/4 v11, 0x0

    invoke-direct {v6, v8, v11, v5, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x6

    const/16 v21, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v17, v6

    invoke-direct/range {v16 .. v21}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v8, Lgy0/f;->L1:I

    invoke-direct {v6, v8, v11, v5, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v8, v6

    new-instance v6, Lcom/whoop/design/util/TextResource$b;

    sget v12, Lgy0/f;->W1:I

    invoke-direct {v6, v12, v11, v5, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v5, v3, 0x70

    if-ne v5, v7, :cond_5

    move v5, v10

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    and-int/lit8 v3, v3, 0xe

    if-ne v3, v4, :cond_6

    move v9, v10

    :cond_6
    or-int v3, v5, v9

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_7

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_8

    :cond_7
    new-instance v4, Lno0/r;

    const/4 v3, 0x0

    invoke-direct {v4, v1, v0, v3}, Lno0/r;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v15, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v7, v4

    check-cast v7, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    sget v4, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v5, v4, 0x3

    or-int/2addr v3, v5

    shl-int/lit8 v4, v4, 0x9

    or-int/2addr v3, v4

    const/16 v17, 0x0

    const/16 v18, 0xfe4

    const/4 v5, 0x0

    move-object v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v22, v16

    move/from16 v16, v3

    move-object/from16 v3, v22

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_9
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_a

    new-instance v4, Lgh0/c;

    const/4 v5, 0x2

    invoke-direct {v4, v0, v2, v5, v1}, Lgh0/c;-><init>(Ljava/lang/String;IILkotlin/jvm/functions/Function1;)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Llo0/i;

    invoke-direct {v0, p1}, Llo0/i;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lno0/s;->s(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move/from16 v0, p1

    move-object/from16 v13, p0

    check-cast v13, Lp1/q;

    const v1, -0x27d3981d

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v13, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1

    sget-object v1, Lsz0/p0$c;->e:Lsz0/p0$c;

    sget v2, Lgy0/f;->Q1:I

    invoke-static {v13, v2}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lsz0/p0$c;->f:I

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v4, 0x3

    or-int v14, v3, v4

    const/4 v15, 0x0

    const/16 v16, 0xffc

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v1 .. v16}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_2

    new-instance v2, Lm22/t;

    const/4 v3, 0x5

    invoke-direct {v2, v0, v3}, Lm22/t;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final w(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lno0/s;->v(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Llo0/n$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llo0/n$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, 0xaa6ec64

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    move/from16 v16, v3

    and-int/lit8 v3, v16, 0x13

    const/16 v4, 0x12

    const/4 v9, 0x0

    if-eq v3, v4, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v9

    :goto_3
    and-int/lit8 v4, v16, 0x1

    invoke-virtual {v12, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1b

    invoke-virtual {v0}, Llo0/n$c;->b()Llo0/l;

    move-result-object v11

    invoke-virtual {v11}, Llo0/l;->b()Ly81/f;

    move-result-object v3

    if-nez v3, :cond_5

    const v3, -0x68ed7576    # -4.7350005E-25f

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto :goto_4

    :cond_5
    const v5, -0x3627fa9

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v12, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v5

    invoke-static {v12, v9, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v3

    :goto_4
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v3, :cond_6

    iget-wide v4, v3, Li2/x;->a:J

    invoke-static {v6, v4, v5}, Lno0/s;->D(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v3

    if-nez v3, :cond_7

    :cond_6
    move-object v3, v6

    :cond_7
    invoke-interface {v7, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-eqz v5, :cond_8

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v12, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v10, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_a

    :cond_9
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v12, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11}, Llo0/l;->a()Lkd1/o;

    move-result-object v3

    invoke-static {v3}, Lkd1/p;->f(Lkd1/o;)Z

    move-result v3

    if-eqz v3, :cond_b

    const v3, 0x25dba784

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Llo0/l;->a()Lkd1/o;

    move-result-object v3

    sget v7, Lkd1/o;->a:I

    move-object v10, v8

    const/4 v8, 0x3

    move-object/from16 v20, v4

    const/4 v4, 0x0

    move-object/from16 v21, v5

    const/4 v5, 0x0

    move-object v14, v6

    move-object v6, v12

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    invoke-static {v12, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->x:Lb2/m;

    sget-object v7, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v7, v4, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {}, Lno0/t;->a()F

    move-result v5

    invoke-static {v4, v5}, Lgb1/c;->e(Landroidx/compose/ui/Modifier;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v4, v11

    const/16 v11, 0x6030

    move/from16 v18, v12

    const/16 v12, 0x68

    move-object v7, v4

    const/4 v4, 0x0

    move-object v8, v10

    move-object v10, v6

    const/4 v6, 0x0

    move-object/from16 v22, v7

    sget-object v7, Ly2/j;->a:Ly2/b1;

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v17, v15

    move/from16 v15, v18

    move-object/from16 v1, v20

    move-object/from16 v0, v21

    move-object/from16 v2, v24

    const/4 v13, 0x0

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    move-object v1, v4

    move-object v0, v5

    move-object v14, v6

    move-object/from16 v23, v8

    move-object v2, v9

    move-object/from16 v22, v11

    move-object v6, v12

    move-object/from16 v17, v15

    const/4 v13, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const v3, 0x25e142b8

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v13}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->c:Ll0/g;

    sget-object v5, Lb2/e;->M:Lb2/k;

    invoke-static {v4, v5, v6, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v6, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    move-object/from16 v12, v23

    goto :goto_9

    :cond_e
    move-object/from16 v12, v23

    :goto_8
    move-object/from16 v4, v17

    goto :goto_a

    :goto_9
    invoke-static {v5, v6, v5, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v26

    const/4 v3, 0x1

    int-to-float v5, v3

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v28, v5, v7

    const/4 v5, 0x2

    int-to-float v5, v5

    mul-float v30, v5, v7

    const/16 v31, 0x5

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v26 .. v31}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v31, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v34

    const v48, 0xfffb

    const/16 v49, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v31 .. v49}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v8, v16, 0x70

    const/16 v9, 0x20

    if-ne v8, v9, :cond_f

    move v10, v3

    goto :goto_b

    :cond_f
    move v10, v13

    :goto_b
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_11

    if-ne v11, v13, :cond_10

    goto :goto_c

    :cond_10
    move-object/from16 v16, v14

    move-object/from16 v14, p1

    goto :goto_d

    :cond_11
    :goto_c
    new-instance v11, Lmf2/e;

    const/16 v10, 0x12

    move-object/from16 v16, v14

    move-object/from16 v14, p1

    invoke-direct {v11, v14, v10}, Lmf2/e;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v11, Lc93/a;

    sget v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    const/4 v15, 0x3

    shl-int/2addr v10, v15

    const/4 v14, 0x6

    or-int/2addr v10, v14

    move/from16 v19, v9

    move-object v9, v6

    move-object v6, v11

    const/16 v11, 0x34

    move/from16 v25, v3

    move-object v3, v5

    const/4 v5, 0x0

    move/from16 v20, v7

    const/4 v7, 0x0

    move/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v50, v4

    move/from16 v51, v21

    move/from16 v15, v25

    move/from16 v14, v30

    move-object/from16 v4, v31

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v9

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v3, v5

    const-wide/16 v7, 0x0

    cmpl-double v3, v3, v7

    if-lez v3, :cond_12

    goto :goto_e

    :cond_12
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    invoke-static {v5, v5, v15}, Ly00/t7;->d(FFZ)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v7, 0x0

    invoke-static {v3, v4, v7, v5, v7}, Lgb1/c;->i(Landroidx/compose/ui/Modifier;FLc93/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v4, v15, v7}, Lgb1/c;->f(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v5, Ll0/l1;

    invoke-direct {v5, v14, v14, v14, v14}, Ll0/l1;-><init>(FFFF)V

    sget-object v4, Lb2/e;->L:Lb2/l;

    invoke-static {v14, v4}, Ll0/m;->k(FLb2/g;)Ll0/k;

    move-result-object v4

    move-object/from16 v7, v22

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_13

    if-ne v9, v13, :cond_14

    :cond_13
    new-instance v9, Llc0/c;

    const/16 v8, 0x1d

    invoke-direct {v9, v7, v8}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v11, v9

    check-cast v11, Lkotlin/jvm/functions/Function1;

    move-object v8, v13

    const/16 v13, 0x6180

    const/16 v14, 0x1ea

    move-object v9, v6

    move-object v6, v4

    const/4 v4, 0x0

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object/from16 v23, v12

    move-object v12, v9

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move-object/from16 v15, v16

    move-object/from16 v52, v21

    invoke-static/range {v3 .. v14}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v12

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float v4, v4, v20

    const/4 v5, 0x5

    int-to-float v5, v5

    mul-float v5, v5, v20

    invoke-static {v3, v4, v4, v4, v5}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->b:Ll0/e;

    sget-object v5, Lb2/e;->J:Lb2/l;

    const/4 v7, 0x6

    invoke-static {v4, v5, v6, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_15

    invoke-virtual {v6, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_15
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    move-object/from16 v10, v23

    goto :goto_11

    :cond_17
    :goto_10
    move-object/from16 v4, v50

    goto :goto_12

    :goto_11
    invoke-static {v5, v6, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v6, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {v22 .. v22}, Llo0/l;->d()Lc31/k;

    move-result-object v0

    move-object/from16 v7, v22

    invoke-virtual {v6, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    move/from16 v2, v51

    const/16 v9, 0x20

    if-ne v2, v9, :cond_18

    const/4 v9, 0x1

    goto :goto_13

    :cond_18
    const/4 v9, 0x0

    :goto_13
    or-int/2addr v1, v9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1a

    move-object/from16 v8, v52

    if-ne v2, v8, :cond_19

    goto :goto_14

    :cond_19
    move-object/from16 v14, p1

    goto :goto_15

    :cond_1a
    :goto_14
    new-instance v2, Lno0/d;

    const/4 v1, 0x1

    move-object/from16 v14, p1

    invoke-direct {v2, v7, v14, v1}, Lno0/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v2, Lkotlin/jvm/functions/Function1;

    sget v1, Lc31/k;->r:I

    const/4 v13, 0x0

    invoke-static {v0, v2, v6, v1, v13}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v15, 0x1

    invoke-static {v6, v15, v15, v15}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_16

    :cond_1b
    move-object v14, v1

    move-object v6, v12

    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_16
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1c

    new-instance v1, Lmx1/i;

    const/16 v2, 0xb

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v1, v3, v14, v4, v2}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final y(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Llo0/h;->a:Llo0/h;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Llo0/l;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Llo0/l;->c()Ljava/util/List;

    move-result-object p0

    sget-object v0, Lno0/s$d;->w:Lno0/s$d;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lno0/s$e;

    invoke-direct {v2, v0, p0}, Lno0/s$e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lno0/s$f;

    invoke-direct {v0, p0}, Lno0/s$f;-><init>(Ljava/util/List;)V

    new-instance p0, Lx1/b;

    const/4 v3, 0x1

    const v4, 0x2fd4df92

    invoke-direct {p0, v0, v3, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p1, Ln0/f;

    const/4 v0, 0x0

    invoke-virtual {p1, v1, v0, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
