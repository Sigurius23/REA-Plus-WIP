.class public final Lcom/whoop/stealthmode/view/StealthModeFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\u00082\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0003R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001b\u00b2\u0006\u000c\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/stealthmode/view/StealthModeFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Leb/u0;",
        "navController",
        "Lhh2/g;",
        "viewState",
        "Ll83/a0;",
        "K",
        "(Leb/u0;Lhh2/g;Landroidx/compose/runtime/Composer;I)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onResume",
        "Ljh2/a;",
        "w",
        "Ll83/h;",
        "X",
        "()Ljh2/a;",
        "viewModel",
        "stealth-mode_release"
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
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/stealthmode/view/StealthModeFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/stealthmode/view/StealthModeFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/stealthmode/view/StealthModeFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/stealthmode/view/StealthModeFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/stealthmode/view/StealthModeFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/u0;Lhh2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lcom/whoop/stealthmode/view/StealthModeFragment;->V(Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/u0;Lhh2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stealthmode/view/StealthModeFragment;->Q(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->R(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->S(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->N(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/stealthmode/view/StealthModeFragment;->P(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/s0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/stealthmode/view/StealthModeFragment;->L(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/s0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->T(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcom/whoop/stealthmode/view/StealthModeFragment;->M(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/stealthmode/view/StealthModeFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/stealthmode/view/StealthModeFragment;->Y(Lcom/whoop/stealthmode/view/StealthModeFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final K(Leb/u0;Lhh2/g;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x7471d33d

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, p4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    if-eq v5, v6, :cond_6

    const/4 v5, 0x1

    goto :goto_4

    :cond_6
    const/4 v5, 0x0

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v9, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_7

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_8

    :cond_7
    new-instance v6, Lh02/h;

    const/4 v5, 0x6

    invoke-direct {v6, v5, p2, p0}, Lh02/h;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    move-object v8, v6

    check-cast v8, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v10, v0, 0xe

    const-string v6, "HOME"

    const/4 v7, 0x0

    move-object v5, p1

    invoke-static/range {v5 .. v10}, Lhg3/i;->e(Leb/u0;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_9
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lh02/i;

    const/4 v5, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lh02/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final L(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/s0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$NavHost"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ll;

    const/16 v1, 0x1d

    invoke-direct {v0, v1, p0, p1}, Ll;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const v1, -0x6a6bada8

    invoke-direct {p0, v0, p1, v1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x6

    const-string v0, "HOME"

    const/4 v1, 0x0

    invoke-static {p2, v0, v1, p0, p1}, Le93/b;->u(Leb/s0;Ljava/lang/String;Ljava/util/List;Lx1/b;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lhh2/g;Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/q;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    sget-object p4, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_0

    if-ne p3, p4, :cond_1

    :cond_0
    new-instance p3, Lhh2/d;

    const/4 p2, 0x1

    invoke-direct {p3, p1, p2}, Lhh2/d;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v1, p3

    check-cast v1, Lc93/a;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_2

    if-ne p3, p4, :cond_3

    :cond_2
    new-instance p3, Lhh2/d;

    const/4 p2, 0x2

    invoke-direct {p3, p1, p2}, Lhh2/d;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p3

    check-cast v2, Lc93/a;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_4

    if-ne p3, p4, :cond_5

    :cond_4
    new-instance p3, Lhh2/e;

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lhh2/e;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, p3

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_6

    if-ne p3, p4, :cond_7

    :cond_6
    new-instance p3, Lhh2/e;

    const/4 p2, 0x1

    invoke-direct {p3, p1, p2}, Lhh2/e;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v4, p3

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_8

    if-ne p3, p4, :cond_9

    :cond_8
    new-instance p3, Lhh2/d;

    const/4 p2, 0x3

    invoke-direct {p3, p1, p2}, Lhh2/d;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v5, p3

    check-cast v5, Lc93/a;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_a

    if-ne p3, p4, :cond_b

    :cond_a
    new-instance p3, Lhh2/d;

    const/4 p2, 0x4

    invoke-direct {p3, p1, p2}, Lhh2/d;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    move-object v6, p3

    check-cast v6, Lc93/a;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_c

    if-ne p3, p4, :cond_d

    :cond_c
    new-instance p3, Lhh2/d;

    const/4 p2, 0x0

    invoke-direct {p3, p1, p2}, Lhh2/d;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v7, p3

    check-cast v7, Lc93/a;

    invoke-virtual {v9, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_e

    if-ne p3, p4, :cond_f

    :cond_e
    new-instance p3, Lhh2/c;

    const/4 p2, 0x1

    invoke-direct {p3, p1, p2}, Lhh2/c;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v8, p3

    check-cast v8, Lc93/m;

    const/4 v10, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v10}, Lih2/b;->F(Lhh2/g;Lc93/a;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/a;Lc93/a;Lc93/a;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Feature in development"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    new-instance v0, Lch2/a$d;

    invoke-direct {v0, p1}, Lch2/a$d;-><init>(Z)V

    invoke-virtual {p0, v0}, Ljh2/a;->q(Lch2/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/stealthmode/view/StealthModeFragment;Z)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    new-instance v0, Lch2/a$b;

    invoke-direct {v0, p1}, Lch2/a$b;-><init>(Z)V

    invoke-virtual {p0, v0}, Ljh2/a;->q(Lch2/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object p0

    const-string v0, "Feature in development"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    move-result-object p0

    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    sget-object v0, Lch2/a$a;->a:Lch2/a$a;

    invoke-virtual {p0, v0}, Ljh2/a;->q(Lch2/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 2

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    new-instance v0, Lch2/a$d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lch2/a$d;-><init>(Z)V

    invoke-virtual {p0, v0}, Ljh2/a;->q(Lch2/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lcom/whoop/stealthmode/view/StealthModeFragment;Leh2/a;Z)Ll83/a0;
    .locals 1

    const-string v0, "metricType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    new-instance v0, Lch2/a$c;

    invoke-direct {v0, p1, p2}, Lch2/a$c;-><init>(Leh2/a;Z)V

    invoke-virtual {p0, v0}, Ljh2/a;->q(Lch2/a;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final V(Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/u0;Lhh2/g;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-direct {p0, p1, p2, p4, p3}, Lcom/whoop/stealthmode/view/StealthModeFragment;->K(Leb/u0;Lhh2/g;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic W(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ljh2/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object p0

    return-object p0
.end method

.method private final X()Ljh2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/stealthmode/view/StealthModeFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljh2/a;

    return-object v0
.end method

.method private static final Y(Lcom/whoop/stealthmode/view/StealthModeFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    const-string v1, "StealthModeNavHost"

    const/4 v3, 0x0

    const/4 v5, 0x6

    invoke-static {v1, v3, v8, v5, v4}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v1

    invoke-direct {v0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->X()Ljh2/a;

    move-result-object v4

    invoke-virtual {v4}, Ljh2/a;->getViewState()Lec3/l;

    move-result-object v5

    new-instance v6, Lhh2/g;

    const/16 v14, 0xd

    const/4 v15, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v9, v6

    invoke-direct/range {v9 .. v15}, Lhh2/g;-><init>(ZZLhh2/f;Lhh2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v4

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v6, v5, :cond_2

    :cond_1
    new-instance v6, Lcom/whoop/stealthmode/view/StealthModeFragment$a;

    invoke-direct {v6, v0, v1, v3}, Lcom/whoop/stealthmode/view/StealthModeFragment$a;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;Leb/u0;Lq83/d;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lc93/m;

    const-string v3, "stealthModeNavigation"

    invoke-static {v8, v6, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Lcom/whoop/stealthmode/view/StealthModeFragment;->Z(Lp1/t2;)Lhh2/g;

    move-result-object v3

    invoke-direct {v0, v1, v3, v8, v2}, Lcom/whoop/stealthmode/view/StealthModeFragment;->K(Leb/u0;Lhh2/g;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final Z(Lp1/t2;)Lhh2/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lhh2/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhh2/g;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/stealthmode/view/StealthModeFragment;Leh2/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/stealthmode/view/StealthModeFragment;->U(Lcom/whoop/stealthmode/view/StealthModeFragment;Leh2/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/stealthmode/view/StealthModeFragment;->O(Lcom/whoop/stealthmode/view/StealthModeFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhh2/c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lhh2/c;-><init>(Lcom/whoop/stealthmode/view/StealthModeFragment;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x41864f78

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
