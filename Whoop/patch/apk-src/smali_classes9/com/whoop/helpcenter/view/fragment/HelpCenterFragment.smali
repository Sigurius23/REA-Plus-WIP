.class public final Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0013\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0013\u001a\u0004\u0008#\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onResume",
        "Lal1/c;",
        "w",
        "Ll83/h;",
        "D",
        "()Lal1/c;",
        "viewModel",
        "Lor2/y;",
        "x",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lj02/o0;",
        "y",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lbl1/b;",
        "z",
        "C",
        "()Lbl1/b;",
        "analyticsHelper",
        "help-center_release"
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

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->x:Ll83/h;

    new-instance v1, Lcl1/a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcl1/a;-><init>(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;I)V

    new-instance v2, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$b;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->z:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Ldp0/g;Lzk1/c;Lcom/whoop/navigation/AiAction;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->G(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Ldp0/g;Lzk1/c;Lcom/whoop/navigation/AiAction;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->F(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lbl1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbl1/b;

    return-object v0
.end method

.method private final D()Lal1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lal1/c;

    return-object v0
.end method

.method private static final E(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final F(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 18

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v1, v3, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    const/4 v1, 0x0

    const/4 v2, 0x6

    const-string v4, "HelpCenterNavHost"

    invoke-static {v4, v1, v9, v2, v3}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v6

    new-instance v5, Lzk1/c;

    invoke-direct {v0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v1

    invoke-virtual {v0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    const-string v3, "requireActivity(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->getNavigator()Lj02/o0;

    move-result-object v3

    invoke-direct {v5, v6, v1, v2, v3}, Lzk1/c;-><init>(Leb/u0;Lor2/y;Lg/l;Lj02/o0;)V

    invoke-direct {v0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->D()Lal1/c;

    move-result-object v1

    new-instance v10, Lbl1/a$h;

    const/16 v16, 0x1f

    const/16 v17, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-direct/range {v10 .. v17}, Lbl1/a$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1, v10}, Lal1/c;->n(Lbl1/a;)V

    invoke-static {}, Ldp0/h;->c()Lp1/t1;

    move-result-object v1

    invoke-virtual {v9, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ldp0/g;

    invoke-direct {v0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->D()Lal1/c;

    move-result-object v4

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_1

    if-ne v3, v7, :cond_2

    :cond_1
    new-instance v3, Lq;

    const/16 v2, 0x11

    invoke-direct {v3, v0, v1, v5, v2}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_3

    if-ne v2, v7, :cond_4

    :cond_3
    new-instance v2, Lcl1/a;

    const/4 v1, 0x1

    invoke-direct {v2, v0, v1}, Lcl1/a;-><init>(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v8, v2

    check-cast v8, Lc93/a;

    const/4 v10, 0x0

    move-object v7, v3

    invoke-static/range {v4 .. v10}, Lzk1/a;->j(Lal1/c;Lzk1/c;Leb/u0;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final G(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;Ldp0/g;Lzk1/c;Lcom/whoop/navigation/AiAction;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->C()Lbl1/b;

    move-result-object p0

    invoke-static {p3, p0, p1, p2}, Lcl1/b;->a(Lcom/whoop/navigation/AiAction;Lbl1/b;Ldp0/g;Lzk1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->E(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;->H(Lcom/whoop/helpcenter/view/fragment/HelpCenterFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lci0/a;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x78d82b16

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
