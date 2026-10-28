.class public final Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J-\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138FX\u0086\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017\u00a8\u0006\u001b\u00b2\u0006\u000e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "",
        "shareMessage",
        "Ll83/a0;",
        "G",
        "(Ljava/lang/String;)V",
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
        "Lkc2/h;",
        "w",
        "Ll83/h;",
        "B",
        "()Lkc2/h;",
        "viewModel",
        "Lkc2/i;",
        "viewState",
        "user-journey_release"
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

    new-instance v0, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment$a;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->E(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final C(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->B()Lkc2/h;

    move-result-object p1

    invoke-virtual {p1}, Lkc2/h;->n()Lec3/t1;

    move-result-object v1

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->D(Lp1/t2;)Lkc2/i;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lnr0/e;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lnr0/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p2

    check-cast v2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lno0/e0;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v5, Lkc2/i;->e:I

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lnr2/a;->e(Lkc2/i;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/t2;)Lkc2/i;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkc2/i;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkc2/i;

    return-object p0
.end method

.method private static final E(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-virtual {p0}, Lor2/s;->i()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "message"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->G(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final G(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "android.intent.action.SEND"

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    const-string v1, "android.intent.extra.TEXT"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const-string p1, "text/plain"

    invoke-virtual {v0, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p1

    sget v1, Lea2/s;->R:I

    invoke-virtual {p1, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    invoke-static {v0, p1}, Landroid/content/Intent;->createChooser(Landroid/content/Intent;Ljava/lang/CharSequence;)Landroid/content/Intent;

    move-result-object p1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, p1, v1}, Ls4/c;->startActivity(Landroid/content/Context;Landroid/content/Intent;Landroid/os/Bundle;)V

    return-void
.end method

.method public static synthetic y(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->C(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->F(Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final B()Lkc2/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkc2/h;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lmw1/a;

    const/16 p2, 0x10

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x493e8bbf

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Lcom/whoop/user/journey/yearinreviewraf/YirRafFragment;->B()Lkc2/h;

    move-result-object v0

    new-instance v1, Lkc2/e$a;

    const-string v2, "YearInReview"

    invoke-direct {v1, v2}, Lkc2/e$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lkc2/h;->p(Lkc2/e;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
