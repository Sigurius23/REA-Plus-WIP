.class public final Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u001b\u0010\u001f\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001c\u0010\u0013\u001a\u0004\u0008\u001d\u0010\u001eR\u001b\u0010$\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\u0013\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u0013\u001a\u0004\u0008\'\u0010(\u00a8\u0006,\u00b2\u0006\u000c\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "w",
        "Ll83/h;",
        "H",
        "()Ljava/lang/String;",
        "phase",
        "Li2/x;",
        "x",
        "Li2/x;",
        "statusColor",
        "Lso1/f0;",
        "y",
        "J",
        "()Lso1/f0;",
        "viewModel",
        "Lyn1/b;",
        "z",
        "G",
        "()Lyn1/b;",
        "analyticsHelper",
        "Lro1/k;",
        "E",
        "I",
        "()Lro1/k;",
        "router",
        "Lso1/g0;",
        "viewState",
        "hormonal-insights_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final E:Ll83/h;

.field private final w:Ll83/h;

.field private x:Li2/x;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lvo1/u;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lvo1/u;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->y:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->z:Ll83/h;

    new-instance v1, Lvo1/u;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lvo1/u;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V

    new-instance v2, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$c;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->P(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->K(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->Q(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lto1/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->M(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lto1/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic E(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Lyn1/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->G()Lyn1/b;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic F(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->H()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final G()Lyn1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyn1/b;

    return-object v0
.end method

.method private final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final I()Lro1/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lro1/k;

    return-object v0
.end method

.method private final J()Lso1/f0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lso1/f0;

    return-object v0
.end method

.method private static final K(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v1

    move-object v7, p1

    check-cast v7, Lp1/q;

    invoke-virtual {v7, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_e

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->J()Lso1/f0;

    move-result-object p1

    invoke-virtual {p1}, Lso1/f0;->getViewState()Lec3/l;

    move-result-object v4

    sget-object v5, Lso1/g0$b;->b:Lso1/g0$b;

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->L(Lp1/t2;)Lso1/g0;

    move-result-object p2

    instance-of v0, p2, Lso1/g0$c;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    check-cast p2, Lso1/g0$c;

    goto :goto_1

    :cond_1
    move-object p2, v1

    :goto_1
    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lso1/g0$c;->b()Ly81/e;

    move-result-object p2

    goto :goto_2

    :cond_2
    move-object p2, v1

    :goto_2
    if-nez p2, :cond_3

    const p2, -0x4a34f603

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move-object p2, v1

    goto :goto_3

    :cond_3
    const v0, 0x47edc684

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-interface {p2, v7, v2}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v7, v2, v4, v5}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object p2

    :goto_3
    iput-object p2, p0, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->x:Li2/x;

    if-eqz p2, :cond_4

    iget-wide v4, p2, Li2/x;->a:J

    const p2, 0x3e99999a    # 0.3f

    invoke-static {p2, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    invoke-static {v4, v5}, Li2/w0;->H(J)I

    move-result p2

    invoke-static {p0, p2, v2, v3, v1}, Lor2/g0;->k(Landroidx/fragment/app/m0;IIILjava/lang/Object;)V

    :cond_4
    invoke-static {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->L(Lp1/t2;)Lso1/g0;

    move-result-object p2

    instance-of p2, p2, Lso1/g0$c;

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz p2, :cond_7

    const p2, -0x4a31d6ab

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->H()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_5

    if-ne v4, v0, :cond_6

    :cond_5
    new-instance v4, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$a;

    invoke-direct {v4, p0, v1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment$a;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lq83/d;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lc93/m;

    invoke-static {v7, v4, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_7
    const p2, -0x4a2dac8f

    invoke-virtual {v7, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_4
    invoke-static {p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->L(Lp1/t2;)Lso1/g0;

    move-result-object v4

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_8

    if-ne p2, v0, :cond_9

    :cond_8
    new-instance p2, Lvo1/v;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lvo1/v;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v5, p2

    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_a

    if-ne p2, v0, :cond_b

    :cond_a
    new-instance p2, Lvo1/v;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lvo1/v;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v6, p2

    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_c

    if-ne p2, v0, :cond_d

    :cond_c
    new-instance p2, Lvo1/v;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lvo1/v;-><init>(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;I)V

    invoke-virtual {v7, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast p2, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v8, v7

    move-object v7, p2

    invoke-static/range {v4 .. v10}, Lvo1/x;->w(Lso1/g0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_5
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lp1/t2;)Lso1/g0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lso1/g0;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso1/g0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lto1/m;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->J()Lso1/f0;

    move-result-object p0

    invoke-virtual {p0, p1}, Lso1/f0;->n(Lto1/m;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lro1/j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->I()Lro1/k;

    move-result-object p0

    invoke-virtual {p0, p1}, Lro1/k;->a(Lro1/j;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->G()Lyn1/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyn1/b;->M(Lyn1/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "phase"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "MENSTRUAL"

    return-object p0
.end method

.method private static final Q(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;)Luf3/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->O(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lro1/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->N(Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;Lro1/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Ltx0/a;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x3bdcdb0f

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-static {p0}, Lhj0/p;->a(Landroidx/fragment/app/m0;)Lsm2/a;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->J()Lso1/f0;

    move-result-object p1

    new-instance p2, Lto1/m$a;

    invoke-direct {p0}, Lcom/whoop/hormonalinsights/menstrualcycleinsights/view/PhaseCoachingFragment;->H()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lto1/m$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lso1/f0;->n(Lto1/m;)V

    return-void
.end method
