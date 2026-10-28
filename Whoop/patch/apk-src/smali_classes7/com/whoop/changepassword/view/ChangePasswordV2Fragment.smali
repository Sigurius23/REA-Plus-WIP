.class public final Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00042\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001aR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001d\u0010\u0018\u001a\u0004\u0008\u001e\u0010\u001fR\u001b\u0010%\u001a\u00020!8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0018\u001a\u0004\u0008#\u0010$\u00a8\u0006(\u00b2\u0006\u000c\u0010\'\u001a\u00020&8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "G",
        "C",
        "Landroid/content/Context;",
        "context",
        "onAttach",
        "(Landroid/content/Context;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "contaier",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lzn0/b;",
        "w",
        "Ll83/h;",
        "F",
        "()Lzn0/b;",
        "viewModel",
        "Lor2/e;",
        "x",
        "D",
        "()Lor2/e;",
        "authAnalytics",
        "Ltn0/b;",
        "y",
        "E",
        "()Ltn0/b;",
        "changePasswordAnalytics",
        "Lzn0/c;",
        "viewState",
        "change-password_release"
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


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->x:Ll83/h;

    new-instance v1, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Ltn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->L(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Ltn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Lzn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->J(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Lzn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()V
    .locals 1

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object v0

    invoke-virtual {v0}, Lor2/s;->i()Z

    return-void
.end method

.method private final D()Lor2/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/e;

    return-object v0
.end method

.method private final E()Ltn0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltn0/b;

    return-object v0
.end method

.method private final F()Lzn0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzn0/b;

    return-object v0
.end method

.method private final G()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method private static final H(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 25

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p2, 0x1

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    invoke-direct {v0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->F()Lzn0/b;

    move-result-object v1

    invoke-virtual {v1}, Lzn0/b;->getViewState()Lec3/l;

    move-result-object v3

    new-instance v4, Lzn0/c;

    const/16 v23, 0x7fff

    const/16 v24, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object v7, v4

    invoke-direct/range {v7 .. v24}, Lzn0/c;-><init>(ZZZZLqz0/c;Lq3/g0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;ZLcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->I(Lp1/t2;)Lzn0/c;

    move-result-object v3

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_1

    if-ne v2, v4, :cond_2

    :cond_1
    new-instance v2, Ldo0/g;

    const/4 v1, 0x0

    invoke-direct {v2, v0, v1}, Ldo0/g;-><init>(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;I)V

    invoke-virtual {v6, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_3

    if-ne v5, v4, :cond_4

    :cond_3
    new-instance v5, Ld1/i;

    const/16 v1, 0x9

    invoke-direct {v5, v0, v1}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lc93/a;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_5

    if-ne v7, v4, :cond_6

    :cond_5
    new-instance v7, Ldo0/g;

    const/4 v1, 0x1

    invoke-direct {v7, v0, v1}, Ldo0/g;-><init>(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v4, v7

    move-object v7, v6

    move-object v6, v4

    move-object v4, v2

    invoke-static/range {v3 .. v9}, Ldo0/d;->k(Lzn0/c;Lkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final I(Lp1/t2;)Lzn0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lzn0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzn0/c;

    return-object p0
.end method

.method private static final J(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Lzn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->F()Lzn0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lzn0/b;->n(Lzn0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->C()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Ltn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->E()Ltn0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Ltn0/b;->a(Ltn0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->H(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->K(Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onAttach(Landroid/content/Context;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onAttach(Landroid/content/Context;)V

    sget-object p1, Ltr2/n;->a:Ltr2/n$a;

    const-string v0, "ChangePasswordV2Fragment"

    invoke-virtual {p1, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p1

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    return-void
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->D()Lor2/e;

    move-result-object p1

    sget-object v0, Lor2/d$e;->a:Lor2/d$e;

    invoke-virtual {p1, v0}, Lor2/e;->c(Lor2/d;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->G()V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-direct {p0}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->F()Lzn0/b;

    move-result-object p1

    sget-object v0, Lzn0/a$e;->a:Lzn0/a$e;

    invoke-virtual {p1, v0}, Lzn0/b;->n(Lzn0/a;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/changepassword/view/ChangePasswordV2Fragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/16 p2, 0x19

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x1739643f

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
