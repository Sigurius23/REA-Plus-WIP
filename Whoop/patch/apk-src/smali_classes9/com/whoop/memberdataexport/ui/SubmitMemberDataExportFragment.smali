.class public final Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;
.super Lcom/whoop/settings/i;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003R\u001a\u0010\u0018\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001e\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010$\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\u00a8\u0006\'\u00b2\u0006\u000c\u0010&\u001a\u00020%8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;",
        "Lcom/whoop/settings/i;",
        "<init>",
        "()V",
        "Lnv1/h;",
        "unavailableBodyArgs",
        "Ll83/a0;",
        "M",
        "(Lnv1/h;)V",
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
        "",
        "x",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lov1/b;",
        "y",
        "Ll83/h;",
        "J",
        "()Lov1/b;",
        "viewModel",
        "Lnv1/f;",
        "z",
        "Leb/i;",
        "I",
        "()Lnv1/f;",
        "args",
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
.field private final x:Ljava/lang/String;

.field private final y:Ll83/h;

.field private final z:Leb/i;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/settings/i;-><init>()V

    const-string v0, "SubmitMemberDataExportFragment"

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->x:Ljava/lang/String;

    new-instance v0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->y:Ll83/h;

    new-instance v0, Leb/i;

    const-class v1, Lnv1/f;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$b;

    invoke-direct {v2, p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$b;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->z:Leb/i;

    return-void
.end method

.method public static synthetic G(Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->K(Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic H(Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;Lnv1/h;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->M(Lnv1/h;)V

    return-void
.end method

.method private final I()Lnv1/f;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->z:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnv1/f;

    return-object v0
.end method

.method private final J()Lov1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lov1/b;

    return-object v0
.end method

.method private static final K(Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->J()Lov1/b;

    move-result-object p1

    invoke-virtual {p1}, Lov1/b;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->I()Lnv1/f;

    move-result-object p1

    invoke-virtual {p1}, Lnv1/f;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->I()Lnv1/f;

    move-result-object p2

    invoke-virtual {p2}, Lnv1/f;->c()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p2

    invoke-direct {v2, p1, p2}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, p1, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p2

    invoke-static {p2}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->L(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->J()Lov1/b;

    move-result-object v0

    new-instance v1, Lov1/a$b;

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->I()Lnv1/f;

    move-result-object v2

    invoke-virtual {v2}, Lnv1/f;->a()Ljava/lang/String;

    move-result-object v2

    const-string v3, "getEmail(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v1, v2}, Lov1/a$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lov1/b;->n(Lov1/a;)Lbc3/k1;

    :cond_1
    invoke-static {p2}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->L(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->I()Lnv1/f;

    move-result-object v0

    invoke-virtual {v0}, Lnv1/f;->c()Ljava/lang/String;

    move-result-object v0

    const-string v1, "getSubmissionSuccessDisplay(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_3

    :cond_2
    new-instance v2, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$a;

    invoke-direct {v2, p0}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment$a;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v2, Lj93/g;

    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {p2, v0, v2, v4, p1}, Lnv1/g;->h(Lcom/whoop/memberdataexport/models/MemberDataExportModel;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lp1/t2;)Lcom/whoop/memberdataexport/models/MemberDataExportModel;
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

.method private final M(Lnv1/h;)V
    .locals 4

    invoke-virtual {p1}, Lnv1/h;->e()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lnv1/h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lnv1/h;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1}, Lnv1/h;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1}, Lnv1/h;->c()Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, v1, v2, v3, p1}, Lcom/whoop/memberdataexport/ui/b;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/memberdataexport/ui/b$a;

    move-result-object p1

    const-string v0, "memberdataexportActionMe\u2026sioncompletefragment(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object v0

    invoke-virtual {v0, p1}, Lor2/s;->f(Leb/p0;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->x:Ljava/lang/String;

    return-object v0
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/memberdataexport/ui/SubmitMemberDataExportFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0x13

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x11effe73

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
