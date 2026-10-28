.class public final Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u0008J\'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\u00062\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J+\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0015\u001a\u00020\u00142\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u0003R\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008!\u0010\"\u001a\u0004\u0008#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\'\u0010\"\u001a\u0004\u0008(\u0010)\u00a8\u0006-\u00b2\u0006\u000c\u0010,\u001a\u00020+8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "url",
        "Ll83/a0;",
        "J",
        "(Ljava/lang/String;)V",
        "uriStr",
        "E",
        "email",
        "submissionLoadingDisplay",
        "submissionSuccessDisplay",
        "I",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
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
        "onResume",
        "Ltr2/n;",
        "w",
        "Ltr2/n;",
        "log",
        "Lov1/b;",
        "x",
        "Ll83/h;",
        "D",
        "()Lov1/b;",
        "viewModel",
        "Lor2/y;",
        "y",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "viewState",
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
.field private final w:Ltr2/n;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "MemberDataExportFragment"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->w:Ltr2/n;

    new-instance v0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$e;

    invoke-direct {v0, p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$e;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$f;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->x:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$d;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->y:Ll83/h;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->E(Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic B(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final synthetic C(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->J(Ljava/lang/String;)V

    return-void
.end method

.method private final D()Lov1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lov1/b;

    return-object v0
.end method

.method private final E(Ljava/lang/String;)V
    .locals 3

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    const-string v1, "uri"

    const/4 v2, 0x0

    invoke-static {v0, v1, v0, v2, v2}, Ld13/a;->f(Landroid/net/Uri;Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;)Leb/k0;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-virtual {v1}, Leb/a0;->k()Leb/r0;

    move-result-object v1

    invoke-virtual {v1, v0}, Leb/r0;->j(Leb/k0;)Leb/l0;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p1

    invoke-virtual {p1, v0}, Leb/a0;->s(Leb/k0;)V

    return-void

    :cond_0
    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-virtual {v0}, Leb/a0;->z()Z

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->w:Ltr2/n;

    const-string v1, "Deep Link not found: "

    invoke-static {v1, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void
.end method

.method private static final F(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

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

    if-eqz p1, :cond_a

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->D()Lov1/b;

    move-result-object p1

    invoke-virtual {p1}, Lov1/b;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;->INSTANCE:Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v7, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->G(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object p2

    instance-of p2, p2, Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->D()Lov1/b;

    move-result-object p2

    sget-object v0, Lov1/a$a;->a:Lov1/a$a;

    invoke-virtual {p2, v0}, Lov1/b;->n(Lov1/a;)Lbc3/k1;

    :cond_1
    invoke-static {p1}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->G(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_2

    if-ne p2, v0, :cond_3

    :cond_2
    new-instance p2, Lnr0/e;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v2, p2

    check-cast v2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_4

    if-ne p2, v0, :cond_5

    :cond_4
    new-instance p2, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$a;

    invoke-direct {p2, p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast p2, Lj93/g;

    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_6

    if-ne p2, v0, :cond_7

    :cond_6
    new-instance p2, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$b;

    invoke-direct {p2, p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast p2, Lj93/g;

    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_8

    if-ne v5, v0, :cond_9

    :cond_8
    new-instance v5, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$c;

    invoke-direct {v5, p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment$c;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lj93/g;

    check-cast v5, Lkotlin/jvm/functions/Function3;

    move-object v6, v4

    move-object v4, p2

    invoke-static/range {v1 .. v7}, Lnv1/c;->s(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Lc93/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_a
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;
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

.method private static final H(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final I(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    invoke-static {p1, p2, p3}, Lcom/whoop/memberdataexport/ui/a;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/ui/a$a;

    move-result-object p1

    const-string p2, "memberdataexportActionMe\u2026ortSubmitmdefragment(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p2

    invoke-virtual {p2, p1}, Lor2/s;->f(Leb/p0;)V

    return-void
.end method

.method private final J(Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->getExternalLinkNavigator()Lor2/y;

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

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->F(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->H(Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;)Ll83/a0;

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

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/memberdataexport/ui/MemberDataExportFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0x11

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x7cdbc703

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
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
