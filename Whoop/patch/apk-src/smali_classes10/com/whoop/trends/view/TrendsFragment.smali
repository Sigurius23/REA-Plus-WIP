.class public final Lcom/whoop/trends/view/TrendsFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b8\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u001b\u0010#\u001a\u00020\u001e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001f\u0010 \u001a\u0004\u0008!\u0010\"R\u001b\u0010(\u001a\u00020$8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008%\u0010 \u001a\u0004\u0008&\u0010\'R\u001b\u0010-\u001a\u00020)8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008*\u0010 \u001a\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010 \u001a\u0004\u00080\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u0010 \u001a\u0004\u00085\u00106R\u001b\u0010<\u001a\u0002088BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00089\u0010 \u001a\u0004\u0008:\u0010;R\u001b\u0010A\u001a\u00020=8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008>\u0010 \u001a\u0004\u0008?\u0010@R\u001b\u0010F\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010 \u001a\u0004\u0008D\u0010ER\u001b\u0010K\u001a\u00020G8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008H\u0010 \u001a\u0004\u0008I\u0010JR\u001a\u0010Q\u001a\u00020L8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008M\u0010N\u001a\u0004\u0008O\u0010PR\u001b\u0010U\u001a\u00020R8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010 \u001a\u0004\u0008N\u0010TR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150V8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008W\u0010XR\"\u0010_\u001a\u0010\u0012\u000c\u0012\n \\*\u0004\u0018\u00010[0[0Z8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008]\u0010^\u00a8\u0006c\u00b2\u0006\u000c\u0010a\u001a\u00020`8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010b\u001a\u00020L8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/trends/view/TrendsFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "args",
        "Lcom/whoop/util/TrendKey;",
        "r0",
        "(Landroid/os/Bundle;)Lcom/whoop/util/TrendKey;",
        "",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lcm2/z;",
        "x",
        "Ll83/h;",
        "d0",
        "()Lcm2/z;",
        "viewModel",
        "Lor2/y;",
        "y",
        "getExternalLinkNavigator",
        "()Lor2/y;",
        "externalLinkNavigator",
        "Ltl2/a;",
        "z",
        "W",
        "()Ltl2/a;",
        "analytics",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "E",
        "Y",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "ffChecker",
        "Lcom/whoop/data/repositories/LanguageRepository;",
        "F",
        "a0",
        "()Lcom/whoop/data/repositories/LanguageRepository;",
        "languageRepository",
        "Lj02/o0;",
        "G",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "Lor2/u0;",
        "H",
        "b0",
        "()Lor2/u0;",
        "localizedDateTimeFormatter",
        "Lzr2/a;",
        "I",
        "X",
        "()Lzr2/a;",
        "dateAndTimeProvider",
        "Lzl2/a;",
        "J",
        "c0",
        "()Lzl2/a;",
        "trendArgumentsParser",
        "",
        "K",
        "Z",
        "getShowBottomNavigationBar",
        "()Z",
        "showBottomNavigationBar",
        "Lyl2/c;",
        "L",
        "()Lyl2/c;",
        "fragmentNavigationHandler",
        "Lkotlin/Function0;",
        "M",
        "Lc93/a;",
        "checkForEducationFragmentResult",
        "Lj/d;",
        "Landroid/content/Intent;",
        "kotlin.jvm.PlatformType",
        "N",
        "Lj/d;",
        "videoActivityResultLauncher",
        "Lcm2/a0;",
        "viewState",
        "isExerciseDetailsV2ExperimentEnabled",
        "trends_release"
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

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Z

.field private final L:Ll83/h;

.field private final M:Lc93/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lc93/a;"
        }
    .end annotation
.end field

.field private final N:Lj/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lj/d;"
        }
    .end annotation
.end field

.field private final w:Ljava/lang/String;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "TrendsFragment"

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->w:Ljava/lang/String;

    new-instance v0, Lcom/whoop/trends/view/TrendsFragment$j;

    invoke-direct {v0, p0}, Lcom/whoop/trends/view/TrendsFragment$j;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/trends/view/TrendsFragment$k;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/trends/view/TrendsFragment$k;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->x:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$b;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$c;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->z:Ll83/h;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$d;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->E:Ll83/h;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$e;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->F:Ll83/h;

    new-instance v1, Lam2/z;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    new-instance v2, Lcom/whoop/trends/view/TrendsFragment$f;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/trends/view/TrendsFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->G:Ll83/h;

    new-instance v1, Lam2/z;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    new-instance v2, Lcom/whoop/trends/view/TrendsFragment$g;

    invoke-direct {v2, p0, v3, v1}, Lcom/whoop/trends/view/TrendsFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->H:Ll83/h;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$h;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/trends/view/TrendsFragment;->I:Ll83/h;

    new-instance v1, Lcom/whoop/trends/view/TrendsFragment$i;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/trends/view/TrendsFragment$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->J:Ll83/h;

    new-instance v0, Lam2/z;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->L:Ll83/h;

    new-instance v0, Lam2/z;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->M:Lc93/a;

    new-instance v0, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;

    invoke-direct {v0}, Landroidx/activity/result/contract/ActivityResultContracts$StartActivityForResult;-><init>()V

    new-instance v1, Lam2/c0;

    invoke-direct {v1, p0}, Lam2/c0;-><init>(Lcom/whoop/trends/view/TrendsFragment;)V

    invoke-virtual {p0, v0, v1}, Landroidx/fragment/app/m0;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    const-string v1, "registerForActivityResult(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->N:Lj/d;

    return-void
.end method

.method public static synthetic E(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->f0(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/trends/view/TrendsFragment;Lj/a;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->s0(Lcom/whoop/trends/view/TrendsFragment;Lj/a;)V

    return-void
.end method

.method public static synthetic G(Lcom/whoop/trends/view/TrendsFragment;)Lcom/whoop/util/TrendKey;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->U(Lcom/whoop/trends/view/TrendsFragment;)Lcom/whoop/util/TrendKey;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/trends/view/TrendsFragment;)Lyl2/c;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->V(Lcom/whoop/trends/view/TrendsFragment;)Lyl2/c;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/trends/view/TrendsFragment;Lyl2/k;Lyl2/g;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/trends/view/TrendsFragment;->m0(Lcom/whoop/trends/view/TrendsFragment;Lyl2/k;Lyl2/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/trends/view/TrendsFragment;Lcm2/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->l0(Lcom/whoop/trends/view/TrendsFragment;Lcm2/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/trends/view/TrendsFragment;Ljava/lang/Object;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/trends/view/TrendsFragment;->o0(Lcom/whoop/trends/view/TrendsFragment;Ljava/lang/Object;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->j0(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->p0(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->q0(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic O(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->k0(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic P(Lcom/whoop/trends/view/TrendsFragment;Lcm2/w;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->n0(Lcom/whoop/trends/view/TrendsFragment;Lcm2/w;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Q(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/trends/view/TrendsFragment;->e0(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic R(Lcom/whoop/trends/view/TrendsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/trends/view/TrendsFragment;->g0(Lcom/whoop/trends/view/TrendsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic S(Lcom/whoop/trends/view/TrendsFragment;)Ltl2/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic T(Lcom/whoop/trends/view/TrendsFragment;)Lcm2/z;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object p0

    return-object p0
.end method

.method private static final U(Lcom/whoop/trends/view/TrendsFragment;)Lcom/whoop/util/TrendKey;
    .locals 2

    sget-object v0, Lcom/whoop/util/TrendKey;->Companion:Lcom/whoop/util/TrendKey$a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->h()Leb/q;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Leb/q;->b()Landroidx/lifecycle/k1;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v1, "EDUCATION_FRAGMENT_RESULT_TREND_NAME"

    invoke-virtual {p0, v1}, Landroidx/lifecycle/k1;->b(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-virtual {v0, p0}, Lcom/whoop/util/TrendKey$a;->b(Ljava/lang/String;)Lcom/whoop/util/TrendKey;

    move-result-object p0

    return-object p0
.end method

.method private static final V(Lcom/whoop/trends/view/TrendsFragment;)Lyl2/c;
    .locals 7

    new-instance v0, Lyl2/c;

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->getExternalLinkNavigator()Lor2/y;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/trends/view/TrendsFragment;->N:Lj/d;

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Y()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->getNavigator()Lj02/o0;

    move-result-object v5

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->a0()Lcom/whoop/data/repositories/LanguageRepository;

    move-result-object v6

    move-object v1, p0

    invoke-direct/range {v0 .. v6}, Lyl2/c;-><init>(Landroidx/fragment/app/m0;Lor2/y;Lj/d;Lcom/whoop/data/repositories/FeatureFlagChecker;Lj02/o0;Lcom/whoop/data/repositories/LanguageRepository;)V

    return-object v0
.end method

.method private final W()Ltl2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltl2/a;

    return-object v0
.end method

.method private final X()Lzr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzr2/a;

    return-object v0
.end method

.method private final Y()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final Z()Lyl2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->L:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyl2/c;

    return-object v0
.end method

.method private final a0()Lcom/whoop/data/repositories/LanguageRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/LanguageRepository;

    return-object v0
.end method

.method private final b0()Lor2/u0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/u0;

    return-object v0
.end method

.method private final c0()Lzl2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzl2/a;

    return-object v0
.end method

.method private final d0()Lcm2/z;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcm2/z;

    return-object v0
.end method

.method private static final e0(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f0(Lcom/whoop/trends/view/TrendsFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g0(Lcom/whoop/trends/view/TrendsFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 20

    move-object/from16 v0, p0

    and-int/lit8 v1, p2, 0x3

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    if-eq v1, v4, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    and-int/lit8 v3, p2, 0x1

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    invoke-virtual {v8, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    invoke-direct {v0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object v1

    invoke-virtual {v1}, Lcm2/z;->getViewState()Lec3/l;

    move-result-object v5

    new-instance v6, Lcm2/a0$c;

    sget-object v1, Lor2/h0;->NONE:Lor2/h0;

    const/4 v3, 0x0

    invoke-direct {v6, v1, v3, v4, v3}, Lcm2/a0$c;-><init>(Lor2/h0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-direct {v0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object v5

    invoke-virtual {v5}, Lcm2/z;->B()Lec3/f2;

    move-result-object v5

    invoke-static {v5, v8, v2}, Lp1/x;->o(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    const-string v5, "TrendsNavHost"

    const/4 v6, 0x6

    invoke-static {v5, v3, v8, v6, v4}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v5

    invoke-direct {v0}, Lcom/whoop/trends/view/TrendsFragment;->getNavigator()Lj02/o0;

    move-result-object v3

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_1

    if-ne v6, v7, :cond_2

    :cond_1
    new-instance v6, Lam2/z;

    const/4 v4, 0x4

    invoke-direct {v6, v0, v4}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v6, Lc93/a;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_3

    if-ne v9, v7, :cond_4

    :cond_3
    new-instance v9, Lam2/z;

    const/4 v4, 0x5

    invoke-direct {v9, v0, v4}, Lam2/z;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lc93/a;

    new-instance v4, Lyl2/k;

    invoke-direct {v4, v3, v5, v6, v9}, Lyl2/k;-><init>(Lj02/o0;Leb/a0;Lc93/a;Lc93/a;)V

    invoke-static {v1}, Lcom/whoop/trends/view/TrendsFragment;->h0(Lp1/t2;)Lcm2/a0;

    move-result-object v6

    invoke-direct {v0}, Lcom/whoop/trends/view/TrendsFragment;->X()Lzr2/a;

    move-result-object v1

    invoke-direct {v0}, Lcom/whoop/trends/view/TrendsFragment;->b0()Lor2/u0;

    move-result-object v3

    invoke-static {v2}, Lcom/whoop/trends/view/TrendsFragment;->i0(Lp1/t2;)Z

    move-result v15

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v2, :cond_5

    if-ne v9, v7, :cond_6

    :cond_5
    new-instance v9, Lam2/a0;

    const/4 v2, 0x3

    invoke-direct {v9, v0, v2}, Lam2/a0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v2, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v2, :cond_7

    if-ne v10, v7, :cond_8

    :cond_7
    new-instance v10, La20/g;

    const/4 v2, 0x6

    invoke-direct {v10, v2, v0, v4}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_9

    if-ne v4, v7, :cond_a

    :cond_9
    new-instance v4, Lam2/a0;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lam2/a0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v11, v4

    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_b

    if-ne v4, v7, :cond_c

    :cond_b
    new-instance v4, Lam2/b0;

    const/4 v2, 0x0

    invoke-direct {v4, v0, v2}, Lam2/b0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v12, v4

    check-cast v12, Lc93/m;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_d

    if-ne v4, v7, :cond_e

    :cond_d
    new-instance v4, Lam2/a0;

    const/4 v2, 0x1

    invoke-direct {v4, v0, v2}, Lam2/a0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_f

    if-ne v4, v7, :cond_10

    :cond_f
    new-instance v4, Lam2/a0;

    const/4 v2, 0x2

    invoke-direct {v4, v0, v2}, Lam2/a0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v14, v4

    check-cast v14, Lkotlin/jvm/functions/Function1;

    sget v0, Lor2/u0;->d:I

    shl-int/lit8 v17, v0, 0x9

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object v7, v1

    move-object/from16 v16, v8

    move-object v8, v3

    invoke-static/range {v5 .. v19}, Lyl2/f;->h(Leb/u0;Lcm2/a0;Lzr2/a;Lor2/u0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private final getExternalLinkNavigator()Lor2/y;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/y;

    return-object v0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method private static final h0(Lp1/t2;)Lcm2/a0;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcm2/a0;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcm2/a0;

    return-object p0
.end method

.method private static final i0(Lp1/t2;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final j0(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Z()Lyl2/c;

    move-result-object p0

    invoke-virtual {p0}, Lyl2/c;->f()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k0(Lcom/whoop/trends/view/TrendsFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l0(Lcom/whoop/trends/view/TrendsFragment;Lcm2/y;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {v0, p1, v1, v2, v1}, Ltl2/a;->t(Ltl2/a;Lcm2/y;Ljava/lang/String;ILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object p0

    invoke-virtual {p0, p1}, Lcm2/z;->D(Lcm2/y;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m0(Lcom/whoop/trends/view/TrendsFragment;Lyl2/k;Lyl2/g;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lyl2/g$c;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    move-object v1, p2

    check-cast v1, Lyl2/g$c;

    invoke-virtual {v0, v1}, Ltl2/a;->e(Lyl2/g$c;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Lyl2/g$a;

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    invoke-virtual {v0, p2}, Ltl2/a;->s(Lyl2/g;)V

    goto :goto_0

    :cond_1
    instance-of v0, p2, Lyl2/g$d;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    invoke-virtual {v0}, Ltl2/a;->g()V

    :goto_0
    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Y()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    const-string v0, "android-trends-route-v2"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_2

    invoke-virtual {p1, p2}, Lyl2/k;->E(Lyl2/g;)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1, p2}, Lyl2/k;->r(Lyl2/g;)Lyl2/k$b;

    move-result-object p0

    invoke-virtual {p0}, Lyl2/k$b;->a()Lc93/a;

    move-result-object p0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final n0(Lcom/whoop/trends/view/TrendsFragment;Lcm2/w;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Ltl2/a;->p(Lcm2/w;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o0(Lcom/whoop/trends/view/TrendsFragment;Ljava/lang/Object;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 1

    const-string v0, "clickEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "trendKey"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ltl2/a;->i(Ljava/lang/Object;Lcom/whoop/util/TrendKey;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Z()Lyl2/c;

    move-result-object p0

    invoke-virtual {p0, p1, p2}, Lyl2/c;->c(Ljava/lang/Object;Lcom/whoop/util/TrendKey;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p0(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 1

    const-string v0, "trendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Z()Lyl2/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyl2/c;->b(Lcom/whoop/util/TrendKey;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q0(Lcom/whoop/trends/view/TrendsFragment;Lcom/whoop/util/TrendKey;)Ll83/a0;
    .locals 1

    const-string v0, "trendKey"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->Z()Lyl2/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lyl2/c;->e(Lcom/whoop/util/TrendKey;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final r0(Landroid/os/Bundle;)Lcom/whoop/util/TrendKey;
    .locals 2

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object v0

    invoke-virtual {v0}, Lcm2/z;->w()Lec3/f2;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/util/TrendKey;

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    if-eqz v0, :cond_1

    move-object v1, v0

    :cond_1
    if-nez v1, :cond_3

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->M:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/util/TrendKey;

    if-nez v0, :cond_2

    sget-object v0, Lcom/whoop/util/TrendKey;->Companion:Lcom/whoop/util/TrendKey$a;

    const-string v1, "trendKey"

    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/whoop/util/TrendKey$a;->a(Ljava/lang/String;)Lcom/whoop/util/TrendKey;

    move-result-object p1

    return-object p1

    :cond_2
    return-object v0

    :cond_3
    return-object v1
.end method

.method private static final s0(Lcom/whoop/trends/view/TrendsFragment;Lj/a;)V
    .locals 7

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object v0

    iget-object v1, p1, Lj/a;->x:Landroid/content/Intent;

    iget-object p1, p1, Lj/a;->x:Landroid/content/Intent;

    const-string v2, "ARTICLE_TITLE"

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v3

    :goto_0
    const-string v4, "TREND_NAME"

    if-eqz p1, :cond_1

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1

    :cond_1
    move-object v5, v3

    :goto_1
    const/4 v6, 0x1

    invoke-virtual {v0, v1, v5, v6}, Ltl2/a;->q(Ljava/lang/String;Ljava/lang/String;Z)V

    if-eqz p1, :cond_4

    const-string v0, "USER_VIEWED_FULL_VIDEO"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    move-result v0

    if-ne v0, v6, :cond_4

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object p0

    if-eqz p1, :cond_2

    invoke-virtual {p1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_2

    :cond_2
    move-object v0, v3

    :goto_2
    if-eqz p1, :cond_3

    invoke-virtual {p1, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    invoke-virtual {p0, v0, v3, v1}, Ltl2/a;->q(Ljava/lang/String;Ljava/lang/String;Z)V

    :cond_4
    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/trends/view/TrendsFragment;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getShowBottomNavigationBar()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/trends/view/TrendsFragment;->K:Z

    return v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lhj0/m;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/trends/view/TrendsFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lam2/b0;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lam2/b0;-><init>(Lcom/whoop/trends/view/TrendsFragment;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x396a084e

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance p2, Lcom/whoop/trends/view/TrendsFragment$a;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/whoop/trends/view/TrendsFragment$a;-><init>(Lcom/whoop/trends/view/TrendsFragment;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/trends/view/TrendsFragment;->r0(Landroid/os/Bundle;)Lcom/whoop/util/TrendKey;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->c0()Lzl2/a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lzl2/a;->b(Landroid/os/Bundle;)Lvl2/k;

    move-result-object v0

    new-instance v1, Lcm2/y$n;

    invoke-virtual {p2}, Lcom/whoop/util/TrendKey;->toGraphKey()Lor2/h0;

    move-result-object v2

    invoke-virtual {v0}, Lvl2/k;->b()Lvl2/a;

    move-result-object v3

    invoke-virtual {v0}, Lvl2/k;->a()Ljava/lang/String;

    move-result-object v4

    const-string p2, "sendTileProperties"

    const/4 v5, 0x0

    invoke-virtual {p1, p2, v5}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v5

    const/16 v8, 0x30

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lcm2/y$n;-><init>(Lor2/h0;Lvl2/a;Ljava/lang/String;ZLcm2/d;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->W()Ltl2/a;

    move-result-object p1

    invoke-virtual {v0}, Lvl2/k;->c()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Ltl2/a;->A(Ljava/lang/String;)V

    invoke-virtual {v0}, Lvl2/k;->d()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v1, p2}, Ltl2/a;->r(Lcm2/y;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/trends/view/TrendsFragment;->d0()Lcm2/z;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcm2/z;->D(Lcm2/y;)Lbc3/k1;

    :cond_0
    return-void
.end method
