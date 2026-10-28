.class public final Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;
.super Landroidx/fragment/app/y;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u001b\u0010\u0012\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;",
        "Landroidx/fragment/app/y;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "",
        "w",
        "Ll83/h;",
        "E",
        "()Ljava/lang/String;",
        "subscriptionType",
        "Lxc2/c;",
        "x",
        "F",
        "()Lxc2/c;",
        "viewModel",
        "Lxc2/d;",
        "viewState",
        "settings_release"
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

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/y;-><init>()V

    new-instance v0, Lsc0/c;

    const/16 v1, 0x8

    invoke-direct {v0, p0, v1}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->G(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lp1/t2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->J(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lp1/t2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->K(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic D(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;)Ljava/lang/String;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->E()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final G(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_7

    invoke-virtual {p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->F()Lxc2/c;

    move-result-object p1

    invoke-virtual {p1}, Lxc2/c;->n()Lec3/t1;

    move-result-object v1

    sget-object v2, Lxc2/d$c;->a:Lxc2/d$c;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->E()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$a;

    const/4 v0, 0x0

    invoke-direct {v1, p0, v0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment$a;-><init>(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lq83/d;)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/m;

    invoke-static {v4, v1, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {p1}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->H(Lp1/t2;)Lxc2/d;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_3

    if-ne v0, v2, :cond_4

    :cond_3
    new-instance v0, Lrq0/x;

    const/16 p2, 0x13

    invoke-direct {v0, p0, p2}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr p2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_5

    if-ne v3, v2, :cond_6

    :cond_5
    new-instance v3, Ls51/f;

    const/16 p2, 0xf

    invoke-direct {v3, p2, p0, p1}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lyc2/c;->G(Lxc2/d;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/t2;)Lxc2/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lxc2/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lxc2/d;

    return-object p0
.end method

.method private static final I(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lxc2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->F()Lxc2/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lxc2/c;->o(Lxc2/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lp1/t2;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    invoke-static {p1}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->H(Lp1/t2;)Lxc2/d;

    move-result-object p1

    instance-of p1, p1, Lxc2/d$d;

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getParentFragmentManager()Landroidx/fragment/app/o1;

    move-result-object p0

    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const-string v0, "switch_plan_dialog_fragment_success_result"

    invoke-virtual {p0, p1, v0}, Landroidx/fragment/app/o1;->f0(Landroid/os/Bundle;Ljava/lang/String;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "subscriptionType"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    const-string p0, ""

    :cond_0
    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lxc2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->I(Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;Lxc2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final F()Lxc2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxc2/c;

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/settings/switchPlan/SwitchPlanDialogFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lr12/a;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0xca5643b

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
