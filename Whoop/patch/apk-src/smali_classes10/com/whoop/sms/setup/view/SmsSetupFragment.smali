.class public final Lcom/whoop/sms/setup/view/SmsSetupFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0019\u0010\u000b\u001a\u00020\u00062\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001e\u001a\u00020\u001a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0016\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/sms/setup/view/SmsSetupFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Lcg2/a;",
        "event",
        "Ll83/a0;",
        "D",
        "(Lcg2/a;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Ldg2/a;",
        "w",
        "Ll83/h;",
        "C",
        "()Ldg2/a;",
        "viewModel",
        "Ljs0/c;",
        "x",
        "B",
        "()Ljs0/c;",
        "configurationRepository",
        "sms_release"
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

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/sms/setup/view/SmsSetupFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/sms/setup/view/SmsSetupFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/sms/setup/view/SmsSetupFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/sms/setup/view/SmsSetupFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sms/setup/view/SmsSetupFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/sms/setup/view/SmsSetupFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/sms/setup/view/SmsSetupFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sms/setup/view/SmsSetupFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->G(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Ljs0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sms/setup/view/SmsSetupFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljs0/c;

    return-object v0
.end method

.method private final C()Ldg2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sms/setup/view/SmsSetupFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldg2/a;

    return-object v0
.end method

.method private final D(Lcg2/a;)V
    .locals 7

    instance-of v0, p1, Lcg2/a$a;

    if-eqz v0, :cond_0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_0
    instance-of v0, p1, Lcg2/a$b;

    if-eqz v0, :cond_1

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1}, Leb/a0;->z()Z

    return-void

    :cond_1
    instance-of p1, p1, Lcg2/a$c;

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->B()Ljs0/c;

    move-result-object p1

    sget-object v0, Lcom/whoop/data/repositories/SmsSupportUrl;->INSTANCE:Lcom/whoop/data/repositories/SmsSupportUrl;

    invoke-virtual {p1}, Ljs0/c;->getConfigurations()Ljs0/b;

    move-result-object p1

    invoke-virtual {v0}, Ljs0/a;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Ljs0/a;->getDefaultValue()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_2

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    goto/16 :goto_0

    :cond_2
    sget-object v5, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/y;->R(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v6

    goto :goto_0

    :cond_3
    sget-object v5, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/x;->y(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v6

    goto :goto_0

    :cond_4
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/x;->x(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v6

    goto :goto_0

    :cond_5
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {v2, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    if-eqz p1, :cond_8

    invoke-static {p1}, Lyb3/r;->N0(Ljava/lang/String;)Ljava/lang/Boolean;

    move-result-object v6

    goto :goto_0

    :cond_6
    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {p1, v1}, Ljs0/b;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    goto :goto_0

    :cond_7
    move-object v6, v0

    :cond_8
    :goto_0
    if-nez v6, :cond_9

    goto :goto_1

    :cond_9
    move-object v0, v6

    :goto_1
    if-eqz v0, :cond_a

    check-cast v0, Ljava/lang/String;

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.VIEW"

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-direct {p1, v1, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {p0, p1}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void

    :cond_a
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.String"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private static final E(Lcom/whoop/sms/setup/view/SmsSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object p2

    invoke-virtual {p1, p2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v0, "sms-onboarding-v2"

    invoke-interface {p2, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz p2, :cond_3

    const p2, -0xe10ac16

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-direct {p0}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->C()Ldg2/a;

    move-result-object p2

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    if-ne v2, v0, :cond_2

    :cond_1
    new-instance v2, Leg2/c;

    const/4 v0, 0x0

    invoke-direct {v2, p0, v0}, Leg2/c;-><init>(Lcom/whoop/sms/setup/view/SmsSetupFragment;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v2, p1, v3, v3}, Leg2/j;->O(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_3
    const p2, -0xe0d6f14

    invoke-virtual {p1, p2}, Lp1/q;->e0(I)V

    invoke-direct {p0}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->C()Ldg2/a;

    move-result-object p2

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v2, Leg2/c;

    const/4 v0, 0x1

    invoke-direct {v2, p0, v0}, Leg2/c;-><init>(Lcom/whoop/sms/setup/view/SmsSetupFragment;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v2, p1, v3, v3}, Leg2/i;->w(Ldg2/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p1, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->D(Lcg2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->D(Lcg2/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/sms/setup/view/SmsSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->E(Lcom/whoop/sms/setup/view/SmsSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->F(Lcom/whoop/sms/setup/view/SmsSetupFragment;Lcg2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/sms/setup/view/SmsSetupFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x20f02e38

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
