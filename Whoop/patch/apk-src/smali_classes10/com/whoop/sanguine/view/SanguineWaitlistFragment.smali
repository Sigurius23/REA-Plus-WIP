.class public final Lcom/whoop/sanguine/view/SanguineWaitlistFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010\u0015\u001a\u0004\u0008 \u0010!R\u001b\u0010%\u001a\u00020\u00048BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u0015\u001a\u0004\u0008$\u0010\u0006R\u001b\u0010)\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010\u0015\u001a\u0004\u0008\'\u0010(\u00a8\u0006*"
    }
    d2 = {
        "Lcom/whoop/sanguine/view/SanguineWaitlistFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "G",
        "()Z",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lw72/f;",
        "w",
        "Ll83/h;",
        "I",
        "()Lw72/f;",
        "viewModel",
        "Lr72/b;",
        "x",
        "E",
        "()Lr72/b;",
        "analyticsInteractor",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "z",
        "F",
        "signUpOnEntry",
        "",
        "H",
        "()Ljava/lang/String;",
        "source",
        "sanguine_release"
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

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->x:Ll83/h;

    new-instance v1, Lz72/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lz72/b;-><init>(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;I)V

    new-instance v2, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$b;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->y:Ll83/h;

    new-instance v0, Lz72/b;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lz72/b;-><init>(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->z:Ll83/h;

    new-instance v0, Lz72/b;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lz72/b;-><init>(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Lr72/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->L(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Lr72/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->N(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Z

    move-result p0

    return p0
.end method

.method public static synthetic C(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->O(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->K(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final E()Lr72/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lr72/b;

    return-object v0
.end method

.method private final F()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final G()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "signUpOnEntry"

    invoke-virtual {v0, v2, v1}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0

    :cond_0
    return v1
.end method

.method private final H()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final I()Lw72/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lw72/f;

    return-object v0
.end method

.method private static final J(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final K(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->getNavigator()Lj02/o0;

    move-result-object p2

    new-instance v0, Lv72/e;

    invoke-direct {v0, p2, p1}, Lv72/e;-><init>(Lj02/o0;Leb/a0;)V

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->I()Lw72/f;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->H()Ljava/lang/String;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->F()Z

    move-result v3

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v4, :cond_2

    :cond_1
    new-instance p2, Lx30/h1;

    const/16 p1, 0xc

    invoke-direct {p2, p0, p1}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-nez p0, :cond_3

    if-ne p1, v4, :cond_4

    :cond_3
    new-instance p1, Lx30/h1;

    const/16 p0, 0xd

    invoke-direct {p1, v0, p0}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v5, p1

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lz72/g;->j0(Lw72/f;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;Lr72/a;)Ll83/a0;
    .locals 1

    const-string v0, "analyticsEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->E()Lr72/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lr72/b;->a(Lr72/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lv72/e;Lv72/d;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lv72/e;->a(Lv72/d;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->G()Z

    move-result p0

    return p0
.end method

.method private static final O(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, "health_tab"

    return-object p0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lv72/e;Lv72/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->M(Lv72/e;Lv72/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->J(Lcom/whoop/sanguine/view/SanguineWaitlistFragment;)Luf3/a;

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
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/sanguine/view/SanguineWaitlistFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lw20/q;

    const/16 p2, 0x18

    invoke-direct {p1, p0, p2}, Lw20/q;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5ed5ed4c

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
