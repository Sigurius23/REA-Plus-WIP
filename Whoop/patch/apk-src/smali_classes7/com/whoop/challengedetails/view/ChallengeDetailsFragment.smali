.class public final Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00042\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0013\u001a\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001e\u00b2\u0006\u000c\u0010\u001d\u001a\u00020\u001c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "F",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Lmn0/b;",
        "w",
        "Ll83/h;",
        "E",
        "()Lmn0/b;",
        "viewModel",
        "Lhn0/a;",
        "x",
        "D",
        "()Lhn0/a;",
        "analyticsHelper",
        "Lmn0/c;",
        "viewState",
        "challenge-details_release"
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

    new-instance v0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$c;

    invoke-direct {v0, p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$c;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$d;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->w:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Lmn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->I(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Lmn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic B(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;)Lhn0/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->D()Lhn0/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic C(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;)Lmn0/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->E()Lmn0/b;

    move-result-object p0

    return-object p0
.end method

.method private final D()Lhn0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhn0/a;

    return-object v0
.end method

.method private final E()Lmn0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmn0/b;

    return-object v0
.end method

.method private final F()V
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method private static final G(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

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

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    if-eqz p1, :cond_9

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v0, "name"

    invoke-virtual {p1, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_2

    :cond_1
    const-string p1, ""

    :cond_2
    invoke-direct {p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->E()Lmn0/b;

    move-result-object v0

    invoke-virtual {v0}, Lmn0/b;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lmn0/c;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lmn0/c;-><init>(ZZLnn0/a;Ljn0/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    new-instance v1, Lln0/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v2

    invoke-direct {v1, v2}, Lln0/a;-><init>(Leb/a0;)V

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v2, :cond_3

    if-ne v3, v5, :cond_4

    :cond_3
    new-instance v3, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$a;

    const/4 v2, 0x0

    invoke-direct {v3, p0, p1, v2}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment$a;-><init>(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lc93/m;

    invoke-static {v4, v3, p2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->H(Lp1/t2;)Lmn0/c;

    move-result-object v0

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_5

    if-ne v3, v5, :cond_6

    :cond_5
    new-instance v3, Lpf/b;

    const/4 v2, 0x5

    invoke-direct {v3, p0, v2}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p0, :cond_7

    if-ne v2, v5, :cond_8

    :cond_7
    new-instance v2, Lpf/b;

    const/4 p0, 0x6

    invoke-direct {v2, v1, p0}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v1, v0

    move-object v5, v4

    move-object v4, v2

    move-object v2, p1

    invoke-static/range {v1 .. v7}, Lqn0/f;->f(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-object p2

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    return-object p2
.end method

.method private static final H(Lp1/t2;)Lmn0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmn0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmn0/c;

    return-object p0
.end method

.method private static final I(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Lmn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->E()Lmn0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lmn0/b;->n(Lmn0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lln0/a;Lln0/b;)Ll83/a0;
    .locals 1

    const-string v0, "navEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lln0/a;->a(Lln0/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lln0/a;Lln0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->J(Lln0/a;Lln0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->G(Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->F()V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/challengedetails/view/ChallengeDetailsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Loe2/c;

    const/16 p2, 0x12

    invoke-direct {p1, p0, p2}, Loe2/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x4513f3fb

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
