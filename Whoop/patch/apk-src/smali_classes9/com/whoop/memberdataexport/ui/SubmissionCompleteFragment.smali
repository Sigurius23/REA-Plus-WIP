.class public final Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;
.super Lcom/whoop/settings/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0003J+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00048\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#R\u001b\u0010)\u001a\u00020%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008&\u0010\u001b\u001a\u0004\u0008\'\u0010(\u00a8\u0006,\u00b2\u0006\u000c\u0010+\u001a\u00020*8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;",
        "Lcom/whoop/settings/i;",
        "<init>",
        "()V",
        "",
        "url",
        "Ll83/a0;",
        "Q",
        "(Ljava/lang/String;)V",
        "K",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "onResume",
        "x",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lov1/b;",
        "y",
        "Ll83/h;",
        "M",
        "()Lov1/b;",
        "viewModel",
        "Lnv1/d;",
        "z",
        "Leb/i;",
        "L",
        "()Lnv1/d;",
        "args",
        "Lor2/y;",
        "E",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "mdeModel",
        "member-data-export_release"
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

.field private final x:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Leb/i;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/settings/i;-><init>()V

    const-string v0, "SubmissionCompleteFragment"

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->x:Ljava/lang/String;

    new-instance v0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->y:Ll83/h;

    new-instance v0, Leb/i;

    const-class v1, Lnv1/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$d;

    invoke-direct {v2, p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$d;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->z:Leb/i;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->E:Ll83/h;

    return-void
.end method

.method public static synthetic G(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->N(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->P(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic I(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->K()V

    return-void
.end method

.method public static final synthetic J(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->Q(Ljava/lang/String;)V

    return-void
.end method

.method private final K()V
    .locals 3

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    sget v1, Ljv1/a;->c:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Leb/a0;->A(IZ)Z

    return-void
.end method

.method private final L()Lnv1/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->z:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnv1/d;

    return-object v0
.end method

.method private final M()Lov1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lov1/b;

    return-object v0
.end method

.method private static final N(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

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

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    invoke-virtual {p1}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p2

    const-string v0, "getViewLifecycleOwner(...)"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$a;-><init>(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)V

    invoke-virtual {p1, p2, v0}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->M()Lov1/b;

    move-result-object p1

    invoke-virtual {p1}, Lov1/b;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->L()Lnv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/d;->e()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->L()Lnv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/d;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->L()Lnv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->L()Lnv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/d;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->L()Lnv1/d;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/d;->c()Ljava/lang/String;

    move-result-object v10

    const-string p1, "getHelpLink(...)"

    invoke-static {v10, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, v2

    invoke-direct/range {v5 .. v10}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, p1, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->O(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object p2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_1

    if-ne v1, v2, :cond_2

    :cond_1
    new-instance v1, Lnr0/e;

    const/4 v0, 0x3

    invoke-direct {v1, p0, v0}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v1, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_3

    if-ne v3, v2, :cond_4

    :cond_3
    new-instance v3, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$b;

    invoke-direct {v3, p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lj93/g;

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v1, v3, v4, p1}, Lnv1/e;->b(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/memberdataexport/models/MemberDataExportModel;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    return-object p0
.end method

.method private static final P(Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->K()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final Q(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v1

    const-string v2, "requireActivity(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x1

    invoke-virtual {v0, v1, p1, v2}, Lor2/y;->x(Landroid/app/Activity;Ljava/lang/String;Z)V

    return-void
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->x:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/memberdataexport/ui/SubmissionCompleteFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0x12

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x6c1289dd

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Lcom/whoop/settings/i;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
