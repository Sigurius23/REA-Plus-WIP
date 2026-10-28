.class public final Lcom/whoop/settings/about/AboutFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0008\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ+\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00132\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u0003R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u001b\u0010(\u001a\u00020#8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008$\u0010%\u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010%\u001a\u0004\u0008+\u0010,\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/settings/about/AboutFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "U",
        "J",
        "Lcom/whoop/settings/about/a;",
        "event",
        "R",
        "(Lcom/whoop/settings/about/a;)V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onResume",
        "Lgb2/a;",
        "<set-?>",
        "w",
        "Lcom/whoop/ui/b;",
        "G",
        "()Lgb2/a;",
        "T",
        "(Lgb2/a;)V",
        "binding",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "x",
        "Ll83/h;",
        "H",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lfa2/c;",
        "y",
        "I",
        "()Lfa2/c;",
        "navigationRouter",
        "settings_release"
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
.field public static final E:I

.field static final synthetic z:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Lcom/whoop/ui/b;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/settings/about/AboutFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/settings/databinding/FragmentAboutLandingBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/settings/about/AboutFragment;->z:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/settings/about/AboutFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->w:Lcom/whoop/ui/b;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/settings/about/AboutFragment$a;

    invoke-direct {v2, p0, v1, v1}, Lcom/whoop/settings/about/AboutFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    iput-object v2, p0, Lcom/whoop/settings/about/AboutFragment;->x:Ll83/h;

    new-instance v2, Lcom/whoop/settings/about/AboutFragment$b;

    invoke-direct {v2, p0, v1, v1}, Lcom/whoop/settings/about/AboutFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->O(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->L(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->Q(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->P(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/settings/about/AboutFragment;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->S(Lcom/whoop/settings/about/AboutFragment;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->K(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final G()Lgb2/a;
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->w:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/settings/about/AboutFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgb2/a;

    return-object v0
.end method

.method private final H()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final I()Lfa2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfa2/c;

    return-object v0
.end method

.method private final J()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object v0

    iget-object v1, v0, Lgb2/a;->c:Lcom/whoop/ui/WhoopNewToolbar;

    new-instance v2, Lfa2/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-virtual {v1, v2}, Lcom/whoop/ui/WhoopNewToolbar;->n(Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgb2/a;->t:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "termOfServiceLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfa2/a;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgb2/a;->l:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "privacyPolicyLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfa2/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgb2/a;->f:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "openSourceLicensesLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfa2/a;

    const/4 v3, 0x3

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgb2/a;->i:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "patentsLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfa2/a;

    const/4 v3, 0x4

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgb2/a;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "regulatoryLabelsLayout"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lfa2/a;

    const/4 v3, 0x5

    invoke-direct {v2, p0, v3}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lgb2/a;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "safetyRegulatoryLayout"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lfa2/a;

    const/4 v2, 0x6

    invoke-direct {v1, p0, v2}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final K(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$f;->a:Lcom/whoop/settings/about/a$f;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$c;->a:Lcom/whoop/settings/about/a$c;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$a;->a:Lcom/whoop/settings/about/a$a;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$b;->a:Lcom/whoop/settings/about/a$b;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$d;->a:Lcom/whoop/settings/about/a$d;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Lcom/whoop/settings/about/a$e;->a:Lcom/whoop/settings/about/a$e;

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->R(Lcom/whoop/settings/about/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final R(Lcom/whoop/settings/about/a;)V
    .locals 7

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->I()Lfa2/c;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v2

    const-string v1, "requireActivity(...)"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v4, Lfa2/a;

    const/4 v1, 0x7

    invoke-direct {v4, p0, v1}, Lfa2/a;-><init>(Lcom/whoop/settings/about/AboutFragment;I)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v0 .. v6}, Lfa2/c;->b(Lfa2/c;Lcom/whoop/settings/about/a;Landroid/app/Activity;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    return-void
.end method

.method private static final S(Lcom/whoop/settings/about/AboutFragment;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "deepLink"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lor2/g0;->o(Landroidx/fragment/app/m0;)Lor2/s;

    move-result-object p0

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p0, p1}, Lor2/s;->d(Landroid/net/Uri;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final T(Lgb2/a;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/settings/about/AboutFragment;->w:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/settings/about/AboutFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final U()V
    .locals 6

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->H()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v1

    const-string v2, "device-settings-regulatory-tiles-android"

    invoke-interface {v1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    iget-object v2, v0, Lgb2/a;->o:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v3, "regulatoryLabelsLayout"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->H()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    const-string v4, "regulatory-labels-android"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/navigation/d;->i(Leb/a0;)Z

    move-result v4

    invoke-static {v3, v4, v1}, Lfa2/b;->a(ZZZ)Z

    move-result v3

    const/16 v4, 0x8

    const/4 v5, 0x0

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, v0, Lgb2/a;->q:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "safetyRegulatoryLayout"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez v1, :cond_1

    move v4, v5

    :cond_1
    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public static synthetic y(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->N(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->M(Lcom/whoop/settings/about/AboutFragment;Landroid/view/View;)Ll83/a0;

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
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lgb2/a;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgb2/a;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/settings/about/AboutFragment;->T(Lgb2/a;)V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object p1

    invoke-virtual {p1}, Lgb2/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

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

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 8

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object p1

    invoke-virtual {p1}, Lgb2/a;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    const-string p1, "getRoot(...)"

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object p1

    iget-object p1, p1, Lgb2/a;->c:Lcom/whoop/ui/WhoopNewToolbar;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->G()Lgb2/a;

    move-result-object p1

    iget-object p1, p1, Lgb2/a;->b:Landroidx/constraintlayout/widget/ConstraintLayout;

    invoke-static {p1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const/16 v6, 0x18

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v7}, Lor2/g0;->h(Landroidx/fragment/app/m0;Landroid/view/View;Ljava/util/List;Ljava/util/List;IIILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->U()V

    invoke-direct {p0}, Lcom/whoop/settings/about/AboutFragment;->J()V

    return-void
.end method
