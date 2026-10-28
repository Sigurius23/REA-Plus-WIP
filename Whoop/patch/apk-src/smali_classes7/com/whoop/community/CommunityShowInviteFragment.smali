.class public final Lcom/whoop/community/CommunityShowInviteFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0003J\u000f\u0010\u0014\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0003J\u000f\u0010\u0015\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0003J\u000f\u0010\u0016\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0003J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0003R\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u0016\u0010\'\u001a\u00020$8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u00081\u00102\u001a\u0004\u00083\u00104R$\u0010;\u001a\u0010\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020807\u0018\u0001068\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u00089\u0010:R\u001b\u0010A\u001a\u00020<8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008=\u0010>\u001a\u0004\u0008?\u0010@R+\u0010J\u001a\u00020B2\u0006\u0010C\u001a\u00020B8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008D\u0010E\u001a\u0004\u0008F\u0010G\"\u0004\u0008H\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008L\u0010 \u001a\u0004\u0008M\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u0010 \u001a\u0004\u0008R\u0010SR\u0014\u0010V\u001a\u00020,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010.R\u0016\u0010X\u001a\u00020W8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010LR\u0016\u0010Z\u001a\u00020W8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Y\u0010L\u00a8\u0006["
    }
    d2 = {
        "Lcom/whoop/community/CommunityShowInviteFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onStart",
        "onResume",
        "L",
        "i0",
        "R",
        "Y",
        "c0",
        "a0",
        "Lrq0/f1;",
        "state",
        "X",
        "(Lrq0/f1;)V",
        "P",
        "Lrq0/e1;",
        "w",
        "Ll83/h;",
        "W",
        "()Lrq0/e1;",
        "viewModel",
        "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;",
        "x",
        "Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;",
        "scrollBehavior",
        "Lrq0/a1;",
        "y",
        "Lrq0/a1;",
        "listAdapter",
        "",
        "z",
        "Z",
        "teamLoaded",
        "",
        "E",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Landroidx/lifecycle/p0;",
        "Lib/n;",
        "Lcom/whoop/domain/model/teams/TeamUser;",
        "F",
        "Landroidx/lifecycle/p0;",
        "observedDataSource",
        "Lxp0/x;",
        "G",
        "Leb/i;",
        "S",
        "()Lxp0/x;",
        "args",
        "Leq0/b2;",
        "<set-?>",
        "H",
        "Lcom/whoop/ui/b;",
        "T",
        "()Leq0/b2;",
        "h0",
        "(Leq0/b2;)V",
        "binding",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "I",
        "U",
        "()Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lnq0/r;",
        "J",
        "V",
        "()Lnq0/r;",
        "navigationHelper",
        "K",
        "isInternationalizedTeamViews",
        "",
        "originalCloseButtonTopMargin",
        "M",
        "originalDeclineButtonBottomMargin",
        "community_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field static final synthetic N:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final O:I


# instance fields
.field private final E:Ljava/lang/String;

.field private F:Landroidx/lifecycle/p0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/p0;"
        }
    .end annotation
.end field

.field private final G:Leb/i;

.field private final H:Lcom/whoop/ui/b;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Z

.field private L:I

.field private M:I

.field private final w:Ll83/h;

.field private x:Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;

.field private y:Lrq0/a1;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/community/CommunityShowInviteFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/community/databinding/FragmentTeamsShowInviteBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/community/CommunityShowInviteFragment;->N:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/community/CommunityShowInviteFragment;->O:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    new-instance v0, Lcom/whoop/community/CommunityShowInviteFragment$f;

    invoke-direct {v0, p0}, Lcom/whoop/community/CommunityShowInviteFragment$f;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/community/CommunityShowInviteFragment$g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/community/CommunityShowInviteFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->w:Ll83/h;

    const-string v0, "CommunityShowInviteFragment"

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->E:Ljava/lang/String;

    new-instance v0, Leb/i;

    const-class v1, Lxp0/x;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lcom/whoop/community/CommunityShowInviteFragment$e;

    invoke-direct {v2, p0}, Lcom/whoop/community/CommunityShowInviteFragment$e;-><init>(Landroidx/fragment/app/m0;)V

    invoke-direct {v0, v1, v2}, Leb/i;-><init>(Lj93/d;Lc93/a;)V

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->G:Leb/i;

    const/4 v0, 0x1

    invoke-static {p0, v3, v0, v3}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->H:Lcom/whoop/ui/b;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/community/CommunityShowInviteFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/community/CommunityShowInviteFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->I:Ll83/h;

    new-instance v1, Lcom/whoop/community/CommunityShowInviteFragment$d;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/community/CommunityShowInviteFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->J:Ll83/h;

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->U()Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object v0

    const-string v1, "internationalized-team-views"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    iput-boolean v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->K:Z

    return-void
.end method

.method public static synthetic E(Lcom/whoop/community/CommunityShowInviteFragment;Lrq0/f1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->Z(Lcom/whoop/community/CommunityShowInviteFragment;Lrq0/f1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/community/CommunityShowInviteFragment;Lib/n;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->b0(Lcom/whoop/community/CommunityShowInviteFragment;Lib/n;)V

    return-void
.end method

.method public static synthetic G(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->f0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->e0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->g0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/community/CommunityShowInviteFragment;->Q(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(F)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->d0(F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final L()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v0, v0, Leq0/b2;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/community/CommunityShowInviteFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/community/CommunityShowInviteFragment$a;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic M(Lcom/whoop/community/CommunityShowInviteFragment;)Leq0/b2;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic N(Lcom/whoop/community/CommunityShowInviteFragment;)Lrq0/e1;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic O(Lcom/whoop/community/CommunityShowInviteFragment;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->i0()V

    return-void
.end method

.method private final P()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v0

    new-instance v1, Lrm/p;

    const/16 v2, 0x12

    invoke-direct {v1, p0, v2}, Lrm/p;-><init>(Ljava/lang/Object;I)V

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v0, v1}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void
.end method

.method private static final Q(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 5

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "windowInsets"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p2, Lh5/q1;->a:Lh5/o1;

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Lh5/o1;->g(I)Lv4/b;

    move-result-object v0

    const-string v1, "getInsets(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v2, 0x2

    invoke-virtual {p1, v2}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p1

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v1

    iget-object v1, v1, Leq0/b2;->i:Landroid/widget/ImageView;

    const-string v2, "showInviteToolbar"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    if-eqz v2, :cond_1

    check-cast v2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, v0, Lv4/b;->b:I

    iget v4, p0, Lcom/whoop/community/CommunityShowInviteFragment;->L:I

    add-int/2addr v0, v4

    iput v0, v2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    invoke-virtual {v1, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v0, v0, Leq0/b2;->b:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v1, "declineButton"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    if-eqz v1, :cond_0

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget p1, p1, Lv4/b;->d:I

    iget p0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->M:I

    add-int/2addr p1, p0

    iput p1, v1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    return-object p2

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v3}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private final R()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/community/CommunityShowInviteFragment$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/community/CommunityShowInviteFragment$b;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final S()Lxp0/x;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->G:Leb/i;

    invoke-virtual {v0}, Leb/i;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lxp0/x;

    return-object v0
.end method

.method private final T()Leq0/b2;
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->H:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/community/CommunityShowInviteFragment;->N:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Leq0/b2;

    return-object v0
.end method

.method private final U()Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object v0
.end method

.method private final V()Lnq0/r;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lnq0/r;

    return-object v0
.end method

.method private final W()Lrq0/e1;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrq0/e1;

    return-object v0
.end method

.method private final X(Lrq0/f1;)V
    .locals 2

    invoke-virtual {p1}, Lrq0/f1;->i()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p1}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/teams/Team;->getBannerUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-static {v1}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v1

    invoke-virtual {v1, p0}, Lml/g;->g(Landroidx/fragment/app/m0;)Lcom/bumptech/glide/h;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v1

    iget-object v1, v1, Leq0/b2;->g:Leq0/s2;

    iget-object v1, v1, Leq0/s2;->b:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lrq0/e1;->Q(Z)V

    :cond_0
    invoke-virtual {p1}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/domain/model/teams/Team;->getIconUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lcom/bumptech/glide/b;->d(Landroid/content/Context;)Lml/g;

    move-result-object v0

    invoke-virtual {v0, p0}, Lml/g;->g(Landroidx/fragment/app/m0;)Lcom/bumptech/glide/h;

    move-result-object v0

    invoke-virtual {v0, p1}, Lcom/bumptech/glide/h;->m(Ljava/lang/String;)Lcom/bumptech/glide/f;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v0, v0, Leq0/b2;->g:Leq0/s2;

    iget-object v0, v0, Leq0/s2;->a:Lde/hdodenhof/circleimageview/CircleImageView;

    invoke-virtual {p1, v0}, Lcom/bumptech/glide/f;->y(Landroid/widget/ImageView;)Lql/k;

    :cond_1
    return-void
.end method

.method private final Y()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/e1;->L()Le50/c;

    move-result-object v0

    new-instance v1, Lxp0/w;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lxp0/w;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;I)V

    invoke-virtual {v0, p0, v1}, Le50/c;->c(Landroidx/lifecycle/g0;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final Z(Lcom/whoop/community/CommunityShowInviteFragment;Lrq0/f1;)Ll83/a0;
    .locals 4

    const-string v0, "state"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->X(Lrq0/f1;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v1, v0, Leq0/b2;->g:Leq0/s2;

    iget-object v1, v1, Leq0/s2;->d:Landroid/widget/TextView;

    invoke-virtual {p1}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/domain/model/teams/Team;->getName()Ljava/lang/String;

    move-result-object v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1}, Lrq0/f1;->x()Z

    move-result v1

    const/4 v2, 0x0

    const/16 v3, 0x8

    if-nez v1, :cond_1

    iget-object p1, v0, Leq0/b2;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v0, Leq0/b2;->j:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v0, Leq0/b2;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p1, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v0, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p1, v0, Leq0/b2;->f:Landroid/widget/TextView;

    sget v0, Lxp0/d0;->a1:I

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->getString(I)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_1
    iget-boolean v1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->z:Z

    if-nez v1, :cond_2

    invoke-virtual {p1}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->c0()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->z:Z

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lrq0/f1;->s()I

    move-result p0

    if-nez p0, :cond_3

    iget-object p0, v0, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Leq0/b2;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Leq0/b2;->e:Landroid/widget/LinearLayout;

    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Leq0/b2;->j:Lcom/whoop/ui/ThrobberView;

    invoke-virtual {p0}, Lcom/whoop/ui/ThrobberView;->f()V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object p0

    if-eqz p0, :cond_4

    iget-object p0, v0, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    invoke-virtual {p0, v2}, Landroid/view/View;->setVisibility(I)V

    iget-object p0, v0, Leq0/b2;->d:Landroid/widget/RelativeLayout;

    invoke-virtual {p0, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_4
    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final a0()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->F:Landroidx/lifecycle/p0;

    if-eqz v0, :cond_0

    invoke-virtual {v0, p0}, Landroidx/lifecycle/p0;->removeObservers(Landroidx/lifecycle/g0;)V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v0

    invoke-virtual {v0}, Lrq0/e1;->H()Landroidx/lifecycle/p0;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->F:Landroidx/lifecycle/p0;

    if-eqz v0, :cond_1

    new-instance v1, Lcom/whoop/ui/a;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, p0, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    :cond_1
    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->y:Lrq0/a1;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroidx/recyclerview/widget/i1;->notifyDataSetChanged()V

    return-void

    :cond_2
    const-string v0, "listAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final b0(Lcom/whoop/community/CommunityShowInviteFragment;Lib/n;)V
    .locals 0

    iget-object p0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->y:Lrq0/a1;

    if-eqz p0, :cond_0

    invoke-virtual {p0, p1}, Lib/p;->c(Lib/n;)V

    return-void

    :cond_0
    const-string p0, "listAdapter"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private final c0()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v0, v0, Leq0/b2;->g:Leq0/s2;

    iget-object v0, v0, Leq0/s2;->a:Lde/hdodenhof/circleimageview/CircleImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lde/hdodenhof/circleimageview/CircleImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    new-instance v0, Lrq0/a1;

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v2

    iget-boolean v3, p0, Lcom/whoop/community/CommunityShowInviteFragment;->K:Z

    invoke-direct {v0, v1, v2, v3}, Lrq0/a1;-><init>(Lrq0/z0;Lrq0/a1$b;Z)V

    iput-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->y:Lrq0/a1;

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object v0

    iget-object v0, v0, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    iget-object v2, p0, Lcom/whoop/community/CommunityShowInviteFragment;->y:Lrq0/a1;

    if-eqz v2, :cond_0

    invoke-virtual {v0, v2}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/i1;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->a0()V

    return-void

    :cond_0
    const-string v0, "listAdapter"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final d0(F)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->L()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->R()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g0(Lcom/whoop/community/CommunityShowInviteFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final h0(Leq0/b2;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->H:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/community/CommunityShowInviteFragment;->N:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final i0()V
    .locals 4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lxp0/d0;->d1:I

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v3

    invoke-virtual {v3}, Lrq0/e1;->L()Le50/c;

    move-result-object v3

    invoke-virtual {v3}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lrq0/f1;

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lrq0/f1;->k()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/whoop/domain/model/teams/DrawerDisplayInvite;->getCommunityName()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    :cond_0
    const-string v3, ""

    :cond_1
    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "getString(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v1}, Lin2/i;->d(Landroid/content/Context;Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->V()Lnq0/r;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v1

    invoke-virtual {v0, v1}, Lnq0/r;->a(Leb/a0;)Z

    move-result v0

    if-nez v0, :cond_2

    return-void

    :cond_2
    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object v0

    const/4 v1, 0x1

    const-string v2, "DAILY"

    invoke-static {v1, v2}, Lcom/whoop/community/k;->a(ILjava/lang/String;)Lcom/whoop/community/k$a;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v2

    invoke-virtual {v2}, Lrq0/e1;->L()Le50/c;

    move-result-object v2

    invoke-virtual {v2}, Landroidx/lifecycle/p0;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lrq0/f1;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lrq0/f1;->b()Lcom/whoop/domain/model/teams/Team;

    move-result-object v2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1, v2}, Lcom/whoop/community/k$a;->k(Lcom/whoop/domain/model/teams/Team;)Lcom/whoop/community/k$a;

    move-result-object v1

    const-string v2, "setTeam(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lor2/s;->f(Leb/p0;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/community/CommunityShowInviteFragment;->E:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Leq0/b2;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Leq0/b2;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/community/CommunityShowInviteFragment;->h0(Leq0/b2;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public onStart()V
    .locals 2

    invoke-super {p0}, Lhj0/m;->onStart()V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lrq0/e1;->Q(Z)V

    iput-boolean v1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->z:Z

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->Y()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 7

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object p1

    iget-object p1, p1, Leq0/b2;->i:Landroid/widget/ImageView;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_0

    :cond_0
    move-object p1, v0

    :goto_0
    const/4 p2, 0x0

    if-eqz p1, :cond_1

    iget p1, p1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    goto :goto_1

    :cond_1
    move p1, p2

    :goto_1
    iput p1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->L:I

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object p1

    iget-object p1, p1, Leq0/b2;->b:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p1

    instance-of v1, p1, Landroid/view/ViewGroup$MarginLayoutParams;

    if-eqz v1, :cond_2

    check-cast p1, Landroid/view/ViewGroup$MarginLayoutParams;

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    if-eqz p1, :cond_3

    iget p2, p1, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    :cond_3
    iput p2, p0, Lcom/whoop/community/CommunityShowInviteFragment;->M:I

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->P()V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->S()Lxp0/x;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/x;->c()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lhj0/o;->u(Ljava/lang/String;)V

    :cond_4
    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->T()Leq0/b2;

    move-result-object p1

    new-instance v1, Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;

    iget-object v2, p1, Leq0/b2;->h:Landroidx/recyclerview/widget/RecyclerView;

    const-string p2, "recyclerView"

    invoke-static {v2, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Leq0/b2;->g:Leq0/s2;

    invoke-virtual {p2}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v3

    const-string p2, "getRoot(...)"

    invoke-static {v3, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p2, p1, Leq0/b2;->g:Leq0/s2;

    iget-object p2, p2, Leq0/s2;->e:Landroid/view/View;

    invoke-virtual {p2}, Landroid/view/View;->getHeight()I

    move-result v4

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v5

    const-string p2, "requireContext(...)"

    invoke-static {v5, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v6, Lxl0/b;

    const/4 p2, 0x3

    invoke-direct {v6, p2}, Lxl0/b;-><init>(I)V

    invoke-direct/range {v1 .. v6}, Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;-><init>(Landroidx/core/view/ScrollingView;Landroid/view/View;ILandroid/content/Context;Lkotlin/jvm/functions/Function1;)V

    iput-object v1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->x:Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;

    iget-object p2, p1, Leq0/b2;->g:Leq0/s2;

    invoke-virtual {p2}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    const-string v1, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lq4/e;

    iget-object v1, p0, Lcom/whoop/community/CommunityShowInviteFragment;->x:Lcom/whoop/community/presentation/ui/ParallaxHeaderBehavior;

    if-eqz v1, :cond_7

    invoke-virtual {p2, v1}, Lq4/e;->b(Lq4/b;)V

    sget v1, Lxp0/a0;->T5:I

    iput-object v0, p2, Lq4/e;->l:Landroid/view/View;

    iput-object v0, p2, Lq4/e;->k:Landroid/view/View;

    iput v1, p2, Lq4/e;->f:I

    const/4 v0, 0x3

    iput v0, p2, Lq4/e;->d:I

    iput v0, p2, Lq4/e;->c:I

    iget-object p2, p1, Leq0/b2;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v0, "joinButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxp0/w;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lxp0/w;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;I)V

    invoke-static {p2, v0}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p2, p1, Leq0/b2;->b:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v0, "declineButton"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lxp0/w;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lxp0/w;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;I)V

    invoke-static {p2, v0}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p1, Leq0/b2;->i:Landroid/widget/ImageView;

    const-string p2, "showInviteToolbar"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lxp0/w;

    const/4 v0, 0x3

    invoke-direct {p2, p0, v0}, Lxp0/w;-><init>(Lcom/whoop/community/CommunityShowInviteFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->S()Lxp0/x;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/x;->a()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lrq0/e1;->M(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V

    :cond_5
    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->S()Lxp0/x;

    move-result-object p1

    invoke-virtual {p1}, Lxp0/x;->b()Lcom/whoop/domain/model/teams/DrawerDisplayInvite;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-direct {p0}, Lcom/whoop/community/CommunityShowInviteFragment;->W()Lrq0/e1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lrq0/e1;->N(Lcom/whoop/domain/model/teams/DrawerDisplayInvite;)V

    :cond_6
    return-void

    :cond_7
    const-string p1, "scrollBehavior"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method
