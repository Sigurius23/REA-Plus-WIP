.class public final Lcom/whoop/ui/debug/PushDebugFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/debug/PushDebugFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00c4\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u0000 |2\u00020\u0001:\u0001}B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ!\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J?\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\"\u0010\u0003R\u001a\u0010\'\u001a\u00020\u00138\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&R\u001b\u0010-\u001a\u00020(8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010*\u001a\u0004\u0008+\u0010,R\u001b\u00102\u001a\u00020.8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008/\u0010*\u001a\u0004\u00080\u00101R\u001b\u00107\u001a\u0002038BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00084\u0010*\u001a\u0004\u00085\u00106R+\u0010@\u001a\u0002082\u0006\u00109\u001a\u0002088B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008:\u0010;\u001a\u0004\u0008<\u0010=\"\u0004\u0008>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008B\u0010*\u001a\u0004\u0008C\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008G\u0010*\u001a\u0004\u0008H\u0010IR\u001b\u0010O\u001a\u00020K8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008L\u0010*\u001a\u0004\u0008M\u0010NR\u001b\u0010T\u001a\u00020P8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008Q\u0010*\u001a\u0004\u0008R\u0010SR\u001b\u0010Y\u001a\u00020U8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008V\u0010*\u001a\u0004\u0008W\u0010XR\u001b\u0010^\u001a\u00020Z8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008[\u0010*\u001a\u0004\u0008\\\u0010]R\u001b\u0010c\u001a\u00020_8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008`\u0010*\u001a\u0004\u0008a\u0010bR\u001b\u0010h\u001a\u00020d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008e\u0010*\u001a\u0004\u0008f\u0010gR\u001b\u0010m\u001a\u00020i8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008j\u0010*\u001a\u0004\u0008k\u0010lR\u001b\u0010r\u001a\u00020n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008o\u0010*\u001a\u0004\u0008p\u0010qR\u001b\u0010w\u001a\u00020s8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008t\u0010*\u001a\u0004\u0008u\u0010vR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008y\u0010z\u00a8\u0006~"
    }
    d2 = {
        "Lcom/whoop/ui/debug/PushDebugFragment;",
        "Lhj0/m;",
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
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "title",
        "body",
        "deeplink",
        "channelId",
        "channelName",
        "sourceId",
        "T0",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "Lm92/f;",
        "data",
        "Lm92/e;",
        "push",
        "U0",
        "(Lm92/f;Lm92/e;)V",
        "e0",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lrr2/c;",
        "x",
        "Ll83/h;",
        "A",
        "()Lrr2/c;",
        "crashReporter",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "y",
        "p0",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lcom/whoop/data/repositories/NotificationRepository;",
        "z",
        "s0",
        "()Lcom/whoop/data/repositories/NotificationRepository;",
        "notificationRepository",
        "Lii0/q;",
        "<set-?>",
        "E",
        "Lcom/whoop/ui/b;",
        "k0",
        "()Lii0/q;",
        "V0",
        "(Lii0/q;)V",
        "binding",
        "Lwm0/a;",
        "F",
        "t0",
        "()Lwm0/a;",
        "scopeCoordinator",
        "Lo92/c0;",
        "G",
        "l0",
        "()Lo92/c0;",
        "bodyGetter",
        "Lz82/k;",
        "H",
        "g0",
        "()Lz82/k;",
        "analyticsManager",
        "Lx82/i;",
        "I",
        "j0",
        "()Lx82/i;",
        "batteryMonitor",
        "Lwe1/g;",
        "J",
        "o0",
        "()Lwe1/g;",
        "entitlementsRepository",
        "Lcom/whoop/data/remote/AppConfigurationRepository;",
        "K",
        "h0",
        "()Lcom/whoop/data/remote/AppConfigurationRepository;",
        "appConfigurationRepository",
        "Liy1/c;",
        "L",
        "r0",
        "()Liy1/c;",
        "metricWriter",
        "Ldp0/g;",
        "M",
        "q0",
        "()Ldp0/g;",
        "globalCoachManager",
        "Lhj0/d;",
        "N",
        "i0",
        "()Lhj0/d;",
        "appLifecycle",
        "Lwe1/a;",
        "O",
        "n0",
        "()Lwe1/a;",
        "entitlementChecker",
        "Lyp0/a;",
        "P",
        "m0",
        "()Lyp0/a;",
        "communityAccessChecker",
        "Lo92/s;",
        "Q",
        "Lo92/s;",
        "pushContext",
        "R",
        "a",
        "app_prodStandardRelease"
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
.field public static final R:Lcom/whoop/ui/debug/PushDebugFragment$a;

.field static final synthetic S:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final T:I


# instance fields
.field private final E:Lcom/whoop/ui/b;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Ll83/h;

.field private final L:Ll83/h;

.field private final M:Ll83/h;

.field private final N:Ll83/h;

.field private final O:Ll83/h;

.field private final P:Ll83/h;

.field private final Q:Lo92/s;

.field private final w:Ljava/lang/String;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/ui/debug/PushDebugFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/android/databinding/FragmentPushDebugBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/ui/debug/PushDebugFragment;->S:[Lj93/z;

    new-instance v0, Lcom/whoop/ui/debug/PushDebugFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/debug/PushDebugFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/debug/PushDebugFragment;->R:Lcom/whoop/ui/debug/PushDebugFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ui/debug/PushDebugFragment;->T:I

    return-void
.end method

.method public constructor <init>()V
    .locals 8

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "PushDebugFragment"

    iput-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->w:Ljava/lang/String;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$g;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$g;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->x:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$h;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->y:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$i;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->z:Ll83/h;

    const/4 v1, 0x1

    invoke-static {p0, v2, v1, v2}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->E:Lcom/whoop/ui/b;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$j;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$j;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->F:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$k;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$k;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->G:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$l;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$l;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->H:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$m;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$m;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->I:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$n;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$n;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->J:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$o;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$o;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->K:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$b;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->L:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$c;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->M:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$d;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$d;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->N:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$e;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->O:Ll83/h;

    new-instance v1, Lcom/whoop/ui/debug/PushDebugFragment$f;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/PushDebugFragment$f;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->P:Ll83/h;

    new-instance v0, Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->A()Lrr2/c;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->p0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->s0()Lcom/whoop/data/repositories/NotificationRepository;

    move-result-object v4

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v5

    const-class v6, Lbc3/c0;

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v6}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v6

    invoke-virtual {v5, v2, v6, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lbc3/c0;

    invoke-direct {v0, v1, v3, v4, v2}, Lo92/s;-><init>(Lrr2/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/data/repositories/NotificationRepository;Lbc3/c0;)V

    iput-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    return-void
.end method

.method private final A()Lrr2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    return-object v0
.end method

.method private static final A0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "whoop_labs"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Whoop Labs"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "New campaign available!"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "campaignId"

    const-string v5, "149"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/n;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/n;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "whoop_labs"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Whoop Labs"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "New session available!"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "campaignId"

    const-string v5, "149"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "sessionId"

    const-string v6, "37"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/n;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/n;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "toString(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "CITL Home (Arch v2)"

    const-string v2, "Tap to land on the arch-v2 CITL Home screen"

    const-string v3, "https://app.whoop.com/navigation/mobile/v1/citl-home"

    const-string v4, "08000_DebugGenericChannelA"

    const-string v5, "Debug Generic Channel A"

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "toString(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "CITL Intake Scheduled Ahead (Arch v1)"

    const-string v2, "Tap to land on the arch-v1 CITL intake screen"

    const-string v3, "https://app.whoop.com/navigation/mobile/v1/citl-intake-scheduled-ahead"

    const-string v4, "08000_DebugGenericChannelA"

    const-string v5, "Debug Generic Channel A"

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->K0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final E0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 p1, 0x3e8

    int-to-long v2, p1

    rem-long/2addr v0, v2

    const-string p1, "Arch V2 \u2014 distinct id "

    invoke-static {v0, v1, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string p1, "toString(...)"

    invoke-static {p1}, Ldc/b;->n(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    const-string v4, "Tap again \u2014 each push should appear separately in the tray"

    const-string v5, "https://app.whoop.com/navigation/mobile/v1/citl-home"

    const-string v6, "08000_DebugGenericChannelA"

    const-string v7, "Debug Generic Channel A"

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->E0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final F0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 9

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/16 p1, 0x3e8

    int-to-long v2, p1

    rem-long/2addr v0, v2

    const-string p1, "Arch V2 \u2014 replace-in-place tap "

    invoke-static {v0, v1, p1}, Ldc/b;->m(JLjava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v7, "Debug Generic Channel A"

    const-string v8, "debug-arch-v2-replace-in-place"

    const-string v4, "Tap repeatedly \u2014 should update the existing notification, not stack"

    const-string v5, "https://app.whoop.com/navigation/mobile/v1/citl-home"

    const-string v6, "08000_DebugGenericChannelA"

    move-object v2, p0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->M0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final G0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/w;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->o0()Lwe1/g;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->h0()Lcom/whoop/data/remote/AppConfigurationRepository;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo92/w;-><init>(Lo92/s;Lwe1/g;Lcom/whoop/data/remote/AppConfigurationRepository;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->G0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final H0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "toString(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Arch V2 \u2014 Channel B"

    const-string v2, "Should register a new \'Channel B\' visible in system notification settings"

    const-string v3, "https://app.whoop.com/navigation/mobile/v1/citl-home"

    const-string v4, "08100_DebugGenericChannelB"

    const-string v5, "Debug Generic Channel B"

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->P0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final I0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v6

    const-string p1, "toString(...)"

    invoke-static {v6, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "Arch V2 \u2014 malformed deeplink"

    const-string v2, "Tap should open the app without crashing (graceful degradation)"

    const-string v3, "not-a-url"

    const-string v4, "08000_DebugGenericChannelA"

    const-string v5, "Debug Generic Channel A"

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/whoop/ui/debug/PushDebugFragment;->T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->J0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final J0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "FollowerInvite"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "New follower request"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Someone wants to follow you"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "invite_id"

    const-string v5, "1"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "sending_user_id"

    const-string v6, "111"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "receiving_user_id"

    const-string v7, "222"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v5}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/g;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->n0()Lwe1/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->m0()Lyp0/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/service/push/notifications/g;-><init>(Lo92/s;Lwe1/a;Lyp0/a;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic K(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->F0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "FollowerInviteAccepted"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Follow request accepted"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "You\'re now following them"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "sending_user_id"

    const-string v5, "111"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "receiving_user_id"

    const-string v6, "222"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/f;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->n0()Lwe1/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->m0()Lyp0/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/service/push/notifications/f;-><init>(Lo92/s;Lwe1/a;Lyp0/a;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic L(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->I0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final L0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 11

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "JoinCommunity"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Community invite"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "You\'ve been invited to join a community"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "community_id"

    const-string v5, "1"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v6, "invite_id"

    invoke-direct {v4, v6, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string v6, "community_name"

    const-string v7, "Test Community"

    invoke-direct {v5, v6, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string v7, "community_icon_url"

    const-string v8, "https://cdn.whoop.com/test.png"

    invoke-direct {v6, v7, v8}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string v8, "sender_id"

    const-string v9, "2"

    invoke-direct {v7, v8, v9}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v8, Ll83/k;

    const-string v9, "sender_username"

    const-string v10, "tester"

    invoke-direct {v8, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v0 .. v8}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/i;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->n0()Lwe1/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->m0()Lyp0/a;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lcom/whoop/service/push/notifications/i;-><init>(Lo92/s;Lwe1/a;Lyp0/a;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic M(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->y0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final M0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 4

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/z;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->t0()Lwm0/a;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->r0()Liy1/c;

    move-result-object v3

    invoke-direct {v0, v1, v2, v3}, Lo92/z;-><init>(Lo92/s;Lwm0/a;Liy1/c;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic N(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->L0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final N0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "SleepCoachV2"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Peak day tomorrow."

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Your Sleep Need is 8:26 hours of sleep. Spend time in bed from 10:55PM to 7:55PM."

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/j;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->j0()Lx82/i;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->g0()Lz82/k;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->l0()Lo92/c0;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whoop/service/push/notifications/j;-><init>(Lo92/s;Lx82/i;Lz82/k;Lo92/c0;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic O(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->Q0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final O0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "BloodworkImageUploadReview"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Test Results Ready"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Your blood work results are ready for review"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "navigation"

    const-string v5, "{\"screen\":\"ADVANCED_LABS_EDIT_BIOMARKERS\",\"parameters\":{\"test_id\":\"2cf2c1f6-cae7-47bf-b3b7-f7d343cf9b44\",\"is_ai_confirmation\":false}}"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/a;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/a;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic P(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->x0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "BloodworkImageUploadReview"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Upload Failed"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "There was an issue processing your test. Please try uploading again."

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "navigation"

    const-string v5, "{\"screen\":\"ADVANCED_LABS_UPLOAD_TEST\"}"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/a;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/a;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic Q(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->N0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "DataStreakRestorationAvailable"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Restore your 60 day streak!"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Wear your WHOOP Strap for 7 days straight, keep your streak going. You can do this!"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/i0;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lo92/i0;-><init>(Lo92/s;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic R(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->v0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final R0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "DataStreakRestorationReminders"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "\ud83e\udd76 Your 14 day streak has been frozen"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Wear WHOOP for 3 days straight to reclaim your impressive day streak."

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/h0;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lo92/h0;-><init>(Lo92/s;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic S(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->C0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final S0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "DataStreakRestoration"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "\ud83d\udd25 Streak restore started"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Wear your WHOOP for 3 days straight to restore your streak."

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/g0;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lo92/g0;-><init>(Lo92/s;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic T(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->R0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final T0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 8

    new-instance v0, Lm92/f;

    new-instance v1, Ll83/k;

    const-string v2, "notificationType"

    const-string v3, "GENERIC"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "source_id"

    invoke-direct {v2, v3, p6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string p6, "title"

    invoke-direct {v3, p6, p1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string p1, "body"

    invoke-direct {v4, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v5, Ll83/k;

    const-string p1, "deep_link"

    invoke-direct {v5, p1, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Ll83/k;

    const-string p1, "channel_id"

    invoke-direct {v6, p1, p4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v7, Ll83/k;

    const-string p1, "channel_name"

    invoke-direct {v7, p1, p5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array/range {v1 .. v7}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-direct {v0, p1}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance p1, Lcom/whoop/service/push/notifications/c;

    iget-object p2, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->r0()Liy1/c;

    move-result-object p3

    invoke-direct {p1, p2, p3}, Lcom/whoop/service/push/notifications/c;-><init>(Lo92/s;Liy1/c;)V

    invoke-direct {p0, v0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    return-void
.end method

.method public static synthetic U(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->H0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final U0(Lm92/f;Lm92/e;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "requireContext(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p2, p1, v0}, Lm92/e;->a(Lm92/f;Landroid/content/Context;)V

    return-void
.end method

.method public static synthetic V(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->D0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final V0(Lii0/q;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->E:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/ui/debug/PushDebugFragment;->S:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic W(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->u0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic X(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->B0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Y(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->z0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic Z(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->w0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->O0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->A0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/debug/PushDebugFragment;->f0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->S0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final e0()V
    .locals 3

    new-instance v0, Lmm/d;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->k0()Lii0/q;

    move-result-object v1

    invoke-virtual {v1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void
.end method

.method private static final f0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 2

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "windowInsets"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x7

    iget-object p2, p2, Lh5/q1;->a:Lh5/o1;

    invoke-virtual {p2, p1}, Lh5/o1;->g(I)Lv4/b;

    move-result-object p1

    const-string p2, "getInsets(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->k0()Lii0/q;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p0

    const-string p2, "getRoot(...)"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iget p2, p1, Lv4/b;->b:I

    iget p1, p1, Lv4/b;->d:I

    invoke-virtual {p0}, Landroid/view/View;->getPaddingLeft()I

    move-result v0

    invoke-virtual {p0}, Landroid/view/View;->getPaddingRight()I

    move-result v1

    invoke-virtual {p0, v0, p2, v1, p1}, Landroid/view/View;->setPadding(IIII)V

    sget-object p0, Lh5/q1;->b:Lh5/q1;

    return-object p0
.end method

.method private final g0()Lz82/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/k;

    return-object v0
.end method

.method private final h0()Lcom/whoop/data/remote/AppConfigurationRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/remote/AppConfigurationRepository;

    return-object v0
.end method

.method private final i0()Lhj0/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->N:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/d;

    return-object v0
.end method

.method private final j0()Lx82/i;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lx82/i;

    return-object v0
.end method

.method private final k0()Lii0/q;
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->E:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/ui/debug/PushDebugFragment;->S:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii0/q;

    return-object v0
.end method

.method private final l0()Lo92/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo92/c0;

    return-object v0
.end method

.method private final m0()Lyp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->P:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyp0/a;

    return-object v0
.end method

.method private final n0()Lwe1/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->O:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe1/a;

    return-object v0
.end method

.method private final o0()Lwe1/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->J:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwe1/g;

    return-object v0
.end method

.method private final p0()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final q0()Ldp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->M:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    return-object v0
.end method

.method private final r0()Liy1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->L:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Liy1/c;

    return-object v0
.end method

.method private final s0()Lcom/whoop/data/repositories/NotificationRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/NotificationRepository;

    return-object v0
.end method

.method private final t0()Lwm0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwm0/a;

    return-object v0
.end method

.method private static final u0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 8

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v1, Lo92/h;

    iget-object v2, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v3

    const-string v0, "requireContext(...)"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->p0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    const/16 v6, 0x8

    const/4 v7, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lo92/h;-><init>(Lo92/s;Landroid/content/Context;Lcom/whoop/data/repositories/FeatureFlagChecker;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v1}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    sget-object v0, Lm83/z;->w:Lm83/z;

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/n;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->t0()Lwm0/a;

    move-result-object v2

    invoke-direct {v0, v1, v2}, Lo92/n;-><init>(Lo92/s;Lwm0/a;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "TimezoneChangeSleepInsight"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Timezone Change Detected"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "Your sleep patterns may be affected by the timezone change"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "meta_data"

    const-string v5, "{\"destination\":{\"screen\":\"HOME\",\"parameters\":{\"ai_action\":{\"screen_id\":\"HOME\",\"source\":\"TIMEZONE_CHANGE_GPS_INSIGHTS\",\"source_type\":\"CHAT_WITH_AGENT\",\"source_id\":\"new-agent-name\",\"conversation_seed_id\":\"test-conversation-seed-123\"}}}}"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/h;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/h;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 6

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "AI_AGENT_MESSAGE"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "You Got a Push - Aren\'t you cool?"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "AiAgentPush test push"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "destination"

    const-string v5, "{\"screen\":\"HOME\",\"parameters\":{\"ai_action\":{\"screen_id\":\"HOME\",\"source\":\"WCE_HOME\",\"source_type\":\"CHAT_WITH_AGENT\",\"source_id\":\"wce-push-test-agent\",\"fingerprint\":\"RANDOM_UUID_FINGERPRINT_TEST_1000\",\"agent_id\":\"wce-push-test-agent\",\"should_open_full_size\":\"true\"}}}"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/b;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->q0()Ldp0/g;

    move-result-object v2

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->r0()Liy1/c;

    move-result-object v3

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->i0()Lhj0/d;

    move-result-object v4

    invoke-direct {v0, v1, v2, v3, v4}, Lcom/whoop/service/push/notifications/b;-><init>(Lo92/s;Ldp0/g;Liy1/c;Lhj0/d;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "CHAT_WITH_AGENT"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Chat With Agent"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "This is a test notification with a longer body to verify BigTextStyle expansion. When the notification is collapsed, this text will be truncated. When expanded, you should be able to read the full message without any truncation."

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Ll83/k;

    const-string v4, "source_id"

    const-string v5, "test-agent"

    invoke-direct {v3, v4, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v4, Ll83/k;

    const-string v5, "conversation_seed_id"

    const-string v6, "test-seed-123"

    invoke-direct {v4, v5, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2, v3, v4}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lo92/c;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v1, v2, v3, v2}, Lo92/c;-><init>(Lo92/s;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z0(Lcom/whoop/ui/debug/PushDebugFragment;Landroid/view/View;)Ll83/a0;
    .locals 5

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lm92/f;

    new-instance v0, Ll83/k;

    const-string v1, "notificationType"

    const-string v2, "whoop_labs"

    invoke-direct {v0, v1, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Ll83/k;

    const-string v2, "title"

    const-string v3, "Whoop Labs"

    invoke-direct {v1, v2, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Ll83/k;

    const-string v3, "body"

    const-string v4, "New studies available!"

    invoke-direct {v2, v3, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v0, v1, v2}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object v0

    invoke-direct {p1, v0}, Lm92/f;-><init>(Ljava/util/Map;)V

    new-instance v0, Lcom/whoop/service/push/notifications/n;

    iget-object v1, p0, Lcom/whoop/ui/debug/PushDebugFragment;->Q:Lo92/s;

    invoke-direct {v0, v1}, Lcom/whoop/service/push/notifications/n;-><init>(Lo92/s;)V

    invoke-direct {p0, p1, v0}, Lcom/whoop/ui/debug/PushDebugFragment;->U0(Lm92/f;Lm92/e;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/PushDebugFragment;->w:Ljava/lang/String;

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Lhj0/m;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lii0/q;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/q;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/debug/PushDebugFragment;->V0(Lii0/q;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->k0()Lii0/q;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->k0()Lii0/q;

    move-result-object v0

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/PushDebugFragment;->e0()V

    iget-object p1, v0, Lii0/q;->k:Landroid/widget/Button;

    const-string p2, "sendDeadBattery"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x0

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->p:Landroid/widget/Button;

    const-string p2, "sendMciOverviewSilentPush"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x2

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->q:Landroid/widget/Button;

    const-string p2, "sendRefreshEntitlementsSilentPush"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x8

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->r:Landroid/widget/Button;

    const-string p2, "sendRefreshPendingFollowerInvites"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x9

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->s:Landroid/widget/Button;

    const-string p2, "sendSleepNeed"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xa

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->b:Landroid/widget/Button;

    const-string p2, "sendAdvancedLabsUploadSuccess"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xc

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->a:Landroid/widget/Button;

    const-string p2, "sendAdvancedLabsUploadFailure"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xd

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->v:Landroid/widget/Button;

    const-string p2, "sendStreakRestoreAvailable"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xe

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->u:Landroid/widget/Button;

    const-string p2, "sendStreakRestorationReminder"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xf

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->t:Landroid/widget/Button;

    const-string p2, "sendStreakRestoration"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x10

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->n:Landroid/widget/Button;

    const-string p2, "sendGpsInsights"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0xb

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->j:Landroid/widget/Button;

    const-string p2, "sendCoachEverywhere"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x11

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->i:Landroid/widget/Button;

    const-string p2, "sendChatWithAgent"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x12

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->w:Landroid/widget/Button;

    const-string p2, "sendWhoopLabs"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x13

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->x:Landroid/widget/Button;

    const-string p2, "sendWhoopLabsToCampaign"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x14

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->y:Landroid/widget/Button;

    const-string p2, "sendWhoopLabsToSession"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x15

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->d:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericCitlHome"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x16

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->e:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericCitlIntake"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x17

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->f:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericDistinctIds"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/16 v1, 0x18

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->h:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericReplaceInPlace"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x1

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->c:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericChannelB"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x3

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->g:Landroid/widget/Button;

    const-string p2, "sendArchV2GenericMalformedDeeplink"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x4

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->l:Landroid/widget/Button;

    const-string p2, "sendFollowerInvite"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x5

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->m:Landroid/widget/Button;

    const-string p2, "sendFollowerInviteAccepted"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v1, 0x6

    invoke-direct {p2, p0, v1}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, v0, Lii0/q;->o:Landroid/widget/Button;

    const-string p2, "sendInviteToJoinCommunity"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmm2/e;

    const/4 v0, 0x7

    invoke-direct {p2, p0, v0}, Lmm2/e;-><init>(Lcom/whoop/ui/debug/PushDebugFragment;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
