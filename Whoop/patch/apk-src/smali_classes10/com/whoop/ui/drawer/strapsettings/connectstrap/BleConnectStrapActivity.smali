.class public final Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;
.super Lhj0/s;
.source "SourceFile"

# interfaces
.implements Lbc3/c0;
.implements Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$a;,
        Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$b;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0002\u00a7\u0001\u0008\u0007\u0018\u0000 \u00b1\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u00b2\u0001\u00b3\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000b\u0010\u0005J\u000f\u0010\u000c\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u0005J\u000f\u0010\r\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\r\u0010\u0005J\u0017\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0005J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0014\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0016\u0010\u0005J\u000f\u0010\u0017\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0018\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u0011J\u000f\u0010\u001b\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0005J\u000f\u0010\u001d\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001d\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001e\u0010\u0011J\u0017\u0010\u001f\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008 \u0010\u0005J\u0017\u0010#\u001a\u00020\u00082\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\u0008#\u0010$J\u000f\u0010%\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008%\u0010\u0005J\u000f\u0010&\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008&\u0010\u0005J\u000f\u0010\'\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\'\u0010\u0005J\u000f\u0010(\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0005JA\u00100\u001a\u00020\u00082\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010+2\u0008\u0010.\u001a\u0004\u0018\u00010-2\u0006\u0010/\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u00080\u00101J\u000f\u00102\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00082\u0010\u0005J/\u00103\u001a\u00020\u00082\u0008\u0010*\u001a\u0004\u0018\u00010)2\u0014\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0013\u0018\u00010+H\u0002\u00a2\u0006\u0004\u00083\u00104J\u000f\u00105\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00085\u0010\u0005J\u000f\u00106\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00086\u0010\u0005J\u000f\u00107\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00087\u0010\u0005J\u000f\u00108\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00088\u0010\u0005J\u000f\u00109\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00089\u0010\u0005J\u000f\u0010:\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008:\u0010\u0005J\u000f\u0010;\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008;\u0010\u0005J\u0011\u0010=\u001a\u0004\u0018\u00010<H\u0002\u00a2\u0006\u0004\u0008=\u0010>R\u0016\u0010B\u001a\u00020?8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008@\u0010AR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008D\u0010ER\u0016\u0010I\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008H\u0010@R\u0016\u0010K\u001a\u00020G8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008J\u0010@R\u0016\u0010O\u001a\u00020L8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008M\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008Q\u0010RR\u0014\u0010W\u001a\u00020T8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008U\u0010VR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008X\u0010YR\u0016\u0010\\\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008Z\u0010[R\"\u0010d\u001a\u00020]8\u0006@\u0006X\u0086.\u00a2\u0006\u0012\n\u0004\u0008^\u0010_\u001a\u0004\u0008`\u0010a\"\u0004\u0008b\u0010cR\u001b\u0010j\u001a\u00020e8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008f\u0010g\u001a\u0004\u0008h\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008l\u0010g\u001a\u0004\u0008m\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008q\u0010g\u001a\u0004\u0008r\u0010sR\u0014\u0010x\u001a\u00020u8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008v\u0010wR\u0014\u0010|\u001a\u00020y8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008z\u0010{R\u0019\u0010\u0080\u0001\u001a\u0004\u0018\u00010}8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008~\u0010\u007fR\u0018\u0010\u0082\u0001\u001a\u00020<8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0007\n\u0005\u0008\u0081\u0001\u0010[R\u0017\u0010\u0085\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008[\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0087\u0001\u0010\u0088\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008b\u0001\u0010\u008c\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R\u0018\u0010\u0095\u0001\u001a\u00030\u0092\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0093\u0001\u0010\u0094\u0001R\u0018\u0010\u0099\u0001\u001a\u00030\u0096\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u0097\u0001\u0010\u0098\u0001R\u001f\u0010\u009d\u0001\u001a\u00020<8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u009a\u0001\u0010g\u001a\u0006\u0008\u009b\u0001\u0010\u009c\u0001R\u001f\u0010\u00a2\u0001\u001a\n\u0012\u0005\u0012\u00030\u009f\u00010\u009e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a0\u0001\u0010\u00a1\u0001R\u001a\u0010\u00a6\u0001\u001a\u00030\u00a3\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00a4\u0001\u0010\u00a5\u0001R\u0018\u0010\u00aa\u0001\u001a\u00030\u00a7\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a8\u0001\u0010\u00a9\u0001R\u0018\u0010\u00ae\u0001\u001a\u00030\u00ab\u00018VX\u0096\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00ac\u0001\u0010\u00ad\u0001R\u0016\u0010\u00b0\u0001\u001a\u00020\u00138BX\u0082\u0004\u00a2\u0006\u0007\u001a\u0005\u0008\u00af\u0001\u0010\u0015\u00a8\u0006\u00b4\u0001"
    }
    d2 = {
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;",
        "Lhj0/s;",
        "Lbc3/c0;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onStart",
        "onStop",
        "onDestroy",
        "Ljk0/d;",
        "whoopStrap",
        "C",
        "(Ljk0/d;)V",
        "q",
        "",
        "p",
        "()Ljava/lang/String;",
        "u0",
        "g1",
        "L0",
        "strap",
        "c1",
        "i1",
        "R0",
        "t1",
        "T0",
        "M0",
        "Z0",
        "Lst0/i;",
        "error",
        "W0",
        "(Lst0/i;)V",
        "X0",
        "o1",
        "G0",
        "n1",
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "onboardingInfo",
        "",
        "eventMetadata",
        "Lst0/v;",
        "strapGen",
        "serialNumber",
        "l1",
        "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;Ljava/lang/String;)V",
        "J0",
        "I0",
        "(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;)V",
        "x0",
        "Y0",
        "w0",
        "e1",
        "j1",
        "r1",
        "F0",
        "",
        "H0",
        "()Ljava/lang/Boolean;",
        "Lqm2/m;",
        "I",
        "Lqm2/m;",
        "selectedBluetoothDevice",
        "Ltr2/n;",
        "J",
        "Ltr2/n;",
        "log",
        "",
        "K",
        "indexConnecting",
        "L",
        "indexConnected",
        "Ln73/b;",
        "M",
        "Ln73/b;",
        "serviceConnectionDisposable",
        "Lmh3/c;",
        "N",
        "Lmh3/c;",
        "compositeSubscription",
        "Ln73/a;",
        "O",
        "Ln73/a;",
        "compositeDisposable",
        "P",
        "Ljk0/d;",
        "Q",
        "Z",
        "movingToDialog",
        "Lqm2/o;",
        "R",
        "Lqm2/o;",
        "B0",
        "()Lqm2/o;",
        "f1",
        "(Lqm2/o;)V",
        "intentBuilder",
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
        "S",
        "Ll83/h;",
        "E0",
        "()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;",
        "viewModel",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "T",
        "A0",
        "()Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Lfi0/a;",
        "U",
        "y0",
        "()Lfi0/a;",
        "analytics",
        "Lbc3/u;",
        "V",
        "Lbc3/u;",
        "job",
        "Lin2/d;",
        "W",
        "Lin2/d;",
        "dispatcherFactory",
        "Lbc3/k1;",
        "X",
        "Lbc3/k1;",
        "timeoutJob",
        "Y",
        "serviceHasWhoopStrap",
        "Lz82/j;",
        "Lz82/j;",
        "onboardingTracker",
        "Lrr2/c;",
        "a0",
        "Lrr2/c;",
        "crashReporter",
        "Lor2/j0;",
        "b0",
        "Lor2/j0;",
        "idleIndicator",
        "Lq92/h;",
        "c0",
        "Lq92/h;",
        "whoopStrapSharedPrefs",
        "Lmi1/d;",
        "d0",
        "Lmi1/d;",
        "hapticsWrapper",
        "Lci2/b;",
        "e0",
        "Lci2/b;",
        "whoopStrapProvider",
        "f0",
        "D0",
        "()Z",
        "strapUnlockEnabled",
        "Llh3/e;",
        "Lqm2/l;",
        "g0",
        "Llh3/e;",
        "newBleConnectStrapViewEvents",
        "Lii0/c;",
        "h0",
        "Lii0/c;",
        "binding",
        "com/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e",
        "i0",
        "Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;",
        "serviceConnection",
        "Lq83/j;",
        "getCoroutineContext",
        "()Lq83/j;",
        "coroutineContext",
        "C0",
        "strapGenerationForAnalytic",
        "j0",
        "b",
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
.field public static final j0:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$a;

.field public static final k0:I


# instance fields
.field private I:Lqm2/m;

.field private final J:Ltr2/n;

.field private K:I

.field private L:I

.field private M:Ln73/b;

.field private final N:Lmh3/c;

.field private final O:Ln73/a;

.field private P:Ljk0/d;

.field private Q:Z

.field public R:Lqm2/o;

.field private final S:Ll83/h;

.field private final T:Ll83/h;

.field private final U:Ll83/h;

.field private final V:Lbc3/u;

.field private final W:Lin2/d;

.field private volatile X:Lbc3/k1;

.field private Y:Z

.field private final Z:Lz82/j;

.field private final a0:Lrr2/c;

.field private final b0:Lor2/j0;

.field private final c0:Lq92/h;

.field private final d0:Lmi1/d;

.field private final e0:Lci2/b;

.field private final f0:Ll83/h;

.field private final g0:Llh3/e;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/e;"
        }
    .end annotation
.end field

.field private h0:Lii0/c;

.field private final i0:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->j0:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->k0:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/s;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "BleConnectStrapActivity"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v0, 0x1

    iput v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->K:I

    sget-object v0, Lq73/d;->w:Lq73/d;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M:Ln73/b;

    new-instance v0, Lmh3/c;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N:Lmh3/c;

    new-instance v0, Ln73/a;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O:Ln73/a;

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$j;

    invoke-direct {v0, p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$j;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$k;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$k;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->S:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$h;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$h;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->T:Ll83/h;

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$i;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$i;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->U:Ll83/h;

    invoke-static {}, Lbc3/f0;->d()Lbc3/e2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->V:Lbc3/u;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v2, Lin2/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lin2/d;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W:Lin2/d;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lz82/j;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lz82/j;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Z:Lz82/j;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lrr2/c;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrr2/c;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a0:Lrr2/c;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lor2/j0;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/j0;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b0:Lor2/j0;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lq92/h;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq92/h;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->c0:Lq92/h;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lmi1/d;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v3, v2, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmi1/d;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0:Lmi1/d;

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v2, Lci2/b;

    invoke-virtual {v1, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-virtual {v0, v3, v1, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lci2/b;

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e0:Lci2/b;

    new-instance v0, Lqm2/h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lqm2/h;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->f0:Ll83/h;

    invoke-static {}, Llh3/e;->Y()Llh3/e;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0:Llh3/e;

    new-instance v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;

    invoke-direct {v0, p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->i0:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;

    return-void
.end method

.method private final A0()Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->T:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-object v0
.end method

.method private final C0()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lqm2/m;->d()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    const-string v0, "selectedBluetoothDevice"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    const-string v0, ""

    return-object v0
.end method

.method private final D0()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->f0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    return v0
.end method

.method private final E0()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->S:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    return-object v0
.end method

.method private final F0()V
    .locals 0

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method private final G0()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_6

    iget-object v0, v0, Lii0/c;->q:Landroid/widget/ImageView;

    const-string v3, "whoopLogo"

    invoke-virtual {v0, v3}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lii0/c;->e:Leq0/f2;

    invoke-virtual {v0}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v3, "backArrow"

    invoke-virtual {v0, v3}, Landroid/view/View;->setTransitionName(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lii0/c;->e:Leq0/f2;

    invoke-virtual {v0}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lii0/c;->j:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/c;->n:Landroid/widget/ViewFlipper;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setTransitionGroup(Z)V

    new-instance v0, Landroid/transition/Slide;

    const v4, 0x800005

    invoke-direct {v0, v4}, Landroid/transition/Slide;-><init>(I)V

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v4, :cond_1

    iget-object v4, v4, Lii0/c;->q:Landroid/widget/ImageView;

    invoke-virtual {v0, v4, v3}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v4, :cond_0

    iget-object v1, v4, Lii0/c;->e:Leq0/f2;

    invoke-virtual {v1}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-virtual {v0, v1, v3}, Landroid/transition/Transition;->excludeTarget(Landroid/view/View;Z)Landroid/transition/Transition;

    const v1, 0x1020030

    invoke-virtual {v0, v1, v3}, Landroid/transition/Transition;->excludeTarget(IZ)Landroid/transition/Transition;

    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/Window;->setEnterTransition(Landroid/transition/Transition;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static synthetic H(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->u1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Z

    move-result p0

    return p0
.end method

.method private final H0()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Z:Lz82/j;

    invoke-virtual {v0}, Lz82/j;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public static synthetic I(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->K0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method

.method private final I0(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1, p2}, Lz82/e;->z0(Ljava/util/Map;)V

    :cond_0
    return-void
.end method

.method public static synthetic J(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/f;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->U0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final J0()V
    .locals 6

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v2, :cond_1

    invoke-interface {v2}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v2

    goto :goto_1

    :cond_1
    move-object v2, v1

    :goto_1
    new-instance v3, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;

    invoke-direct {v3}, Lcom/whoop/pairing/membershipAdjustment/MembershipAdjustmentFragment;-><init>()V

    new-instance v4, Landroid/os/Bundle;

    invoke-direct {v4}, Landroid/os/Bundle;-><init>()V

    const-string v5, "strapSerial"

    invoke-virtual {v4, v5, v0}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string v0, "strapSignature"

    invoke-virtual {v4, v0, v2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Landroidx/fragment/app/m0;->setArguments(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    invoke-static {v0, v0}, Lr;->g(Landroidx/fragment/app/o1;Landroidx/fragment/app/o1;)Landroidx/fragment/app/a;

    move-result-object v0

    sget v2, Lhi0/e;->Y:I

    invoke-virtual {v0, v2, v3, v1}, Landroidx/fragment/app/c2;->e(ILandroidx/fragment/app/m0;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Landroidx/fragment/app/c2;->c(Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/fragment/app/a;->j()I

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->getSupportFragmentManager()Landroidx/fragment/app/o1;

    move-result-object v0

    new-instance v1, Lqm2/j;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqm2/j;-><init>(Ljava/lang/Object;I)V

    const-string v2, "membership_adjustment_fragment_cancel_result"

    invoke-virtual {v0, v2, p0, v1}, Landroidx/fragment/app/o1;->g0(Ljava/lang/String;Landroidx/lifecycle/g0;Landroidx/fragment/app/w1;)V

    return-void
.end method

.method public static synthetic K(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->v0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;

    move-result-object p0

    return-object p0
.end method

.method private static final K0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N:Lmh3/c;

    invoke-virtual {p1}, Lmh3/c;->d()V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O:Ln73/a;

    invoke-virtual {p1}, Ln73/a;->d()V

    const/4 p1, -0x1

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public static synthetic L(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lmk0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lmk0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final L0()V
    .locals 4

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$c;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic M(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/Throwable;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/Throwable;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final M0(Ljk0/d;)V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O:Ln73/a;

    invoke-interface {p1}, Ljk0/d;->x()Ll73/h;

    move-result-object p1

    new-instance v1, Lqm2/i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lqm2/i;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    new-instance v2, Lmm/d;

    const/16 v3, 0x16

    invoke-direct {v2, v1, v3}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lqm2/i;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Lqm2/i;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    new-instance v3, Lmm/d;

    const/16 v4, 0x17

    invoke-direct {v3, v1, v4}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v1, Lt73/a;

    invoke-direct {v1, v2, v3}, Lt73/a;-><init>(Lmm/d;Lmm/d;)V

    :try_start_0
    check-cast p1, Lw73/i;

    iget-object p1, p1, Lw73/i;->a:Lg83/i;

    new-instance v2, Lw73/h;

    invoke-direct {v2, v1}, Lw73/h;-><init>(Lt73/a;)V

    invoke-virtual {p1, v2}, Ll73/c;->c(Ll73/d;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v1}, Ln73/a;->a(Ln73/b;)Z

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lbi/g;->a0(Ljava/lang/Throwable;)V

    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "subscribeActual failed"

    invoke-direct {v0, v1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/Throwable;->initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;

    throw v0

    :catch_0
    move-exception p1

    throw p1
.end method

.method public static synthetic N(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->p1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private static final N0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lmk0/a;)Ll83/a0;
    .locals 2

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->w0()V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v0

    invoke-virtual {p1}, Lmk0/a;->toFailureMessage()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->C0()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->H0()Ljava/lang/Boolean;

    move-result-object p0

    invoke-virtual {v0, p1, v1, p0}, Lz82/e;->b0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic O(Lqm2/i;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final O0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic P(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lqm2/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->S0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lqm2/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final P0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljava/lang/Throwable;)Ll83/a0;
    .locals 2

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Something went wrong observing latest strap error"

    invoke-interface {p0, v1, p1, v0}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic Q(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->k1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final Q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic R(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V

    return-void
.end method

.method private final R0()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->E0()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->z()Landroidx/lifecycle/u0;

    move-result-object v0

    new-instance v1, Lqm2/i;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lqm2/i;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    new-instance v2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/c$a;

    invoke-direct {v2, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p0, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method public static synthetic S(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;Ljk0/d;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;Ljk0/d;)V

    return-void
.end method

.method private static final S0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lqm2/q;)Ll83/a0;
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b0:Lor2/j0;

    invoke-interface {v0}, Lor2/j0;->b()V

    instance-of v0, p1, Lqm2/u;

    if-eqz v0, :cond_2

    check-cast p1, Lqm2/u;

    invoke-virtual {p1}, Lqm2/u;->b()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move-result-object v0

    invoke-virtual {p1}, Lqm2/u;->a()Ljava/util/Map;

    move-result-object v1

    invoke-virtual {p1}, Lqm2/u;->c()Lst0/v;

    move-result-object p1

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    :cond_0
    const-string v2, ""

    :cond_1
    invoke-direct {p0, v0, v1, p1, v2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->l1(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    instance-of v0, p1, Lqm2/r;

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->r1()V

    goto :goto_0

    :cond_3
    instance-of p1, p1, Lqm2/a;

    if-eqz p1, :cond_4

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->j1()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic T(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->m1(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V

    return-void
.end method

.method private final T0(Ljk0/d;)V
    .locals 4

    new-instance v0, Lq92/c;

    invoke-direct {v0}, Lq92/c;-><init>()V

    invoke-interface {p1, v0}, Lst0/l;->M(Lc83/a;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N:Lmh3/c;

    invoke-virtual {v0}, Lq92/c;->c()Lxg3/g;

    move-result-object v0

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lqm2/i;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lqm2/i;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    new-instance v2, Lo52/m0;

    const/16 v3, 0xd

    invoke-direct {v2, v1, v3}, Lo52/m0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method public static synthetic U(Lqm2/i;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Q0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private static final U0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/f;)Ll83/a0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e1()V

    sget-object v0, Lst0/n;->a:Lst0/n;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Z0()V

    goto :goto_0

    :cond_0
    sget-object v0, Lst0/g;->a:Lst0/g;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X0()V

    goto :goto_0

    :cond_1
    instance-of v0, p1, Lst0/i;

    if-eqz v0, :cond_2

    check-cast p1, Lst0/i;

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W0(Lst0/i;)V

    goto :goto_0

    :cond_2
    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->n1()V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic V(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->s1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public static synthetic W(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V

    return-void
.end method

.method private final W0(Lst0/i;)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    invoke-virtual {p1}, Lst0/i;->b()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Received connection error: "

    invoke-static {v2, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lst0/i;->a()I

    move-result v0

    const/16 v1, 0x43

    if-ne v0, v1, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->o1()V

    return-void

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->w0()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    invoke-virtual {p1}, Lst0/i;->a()I

    move-result p1

    const-string v1, "Failing due to error "

    invoke-static {p1, v1}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y0()V

    return-void
.end method

.method public static synthetic X(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->q1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V

    return-void
.end method

.method private final X0()V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->w0()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y0()V

    return-void
.end method

.method public static synthetic Y(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V

    return-void
.end method

.method private final Y0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "onFailure"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Q:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Q:Z

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const-string v2, "Moving to Connection Failed Dialog"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O:Ln73/a;

    invoke-virtual {v0}, Ln73/a;->d()V

    const/16 v0, 0x65

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    :cond_0
    return-void
.end method

.method public static synthetic Z(Lqm2/i;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->V0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final Z0()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b0:Lor2/j0;

    invoke-interface {v0}, Lor2/j0;->a()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0:Llh3/e;

    new-instance v1, Lqm2/t;

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    invoke-interface {v2}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v2

    goto :goto_0

    :cond_0
    move-object v2, v3

    :goto_0
    iget-object v4, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v4, :cond_1

    invoke-interface {v4}, Ljk0/d;->w0()Lst0/v;

    move-result-object v4

    goto :goto_1

    :cond_1
    move-object v4, v3

    :goto_1
    invoke-direct {v1, v2, v4}, Lqm2/t;-><init>(Lcom/whoop/domain/model/WhoopStrapInfo;Lst0/v;)V

    invoke-virtual {v0, v1}, Llh3/e;->onNext(Ljava/lang/Object;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v0, :cond_2

    invoke-interface {v0}, Lst0/l;->C()I

    move-result v0

    goto :goto_2

    :cond_2
    const/4 v0, 0x0

    :goto_2
    const/4 v1, 0x2

    if-nez v0, :cond_3

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a0:Lrr2/c;

    new-instance v2, Lcom/whoop/domain/exception/ConnectivityException;

    const-string v4, "No MTU Negotiated!"

    invoke-direct {v2, v4, v3, v1, v3}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v2, v3, v1, v3}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_3
    const/16 v2, 0xb4

    if-ge v0, v2, :cond_4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a0:Lrr2/c;

    new-instance v2, Lcom/whoop/domain/exception/ConnectivityException;

    const-string v4, "Negotiated MTU < 180!"

    invoke-direct {v2, v4, v3, v1, v3}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v2, v3, v1, v3}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    return-void

    :cond_4
    const/16 v2, 0xf7

    if-ge v0, v2, :cond_5

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->a0:Lrr2/c;

    new-instance v2, Lcom/whoop/domain/exception/ConnectivityException;

    const-string v4, "Negotiated MTU < 247"

    invoke-direct {v2, v4, v3, v1, v3}, Lcom/whoop/domain/exception/ConnectivityException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v0, v2, v3, v1, v3}, Lrr2/c;->e(Lrr2/c;Ljava/lang/Throwable;Ljava/lang/String;ILjava/lang/Object;)V

    :cond_5
    return-void
.end method

.method public static final synthetic a0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lin2/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W:Lin2/d;

    return-object p0
.end method

.method private static final a1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->n1()V

    return-void
.end method

.method public static final synthetic b0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/data/repositories/FeatureFlagChecker;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->A0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    return-object p0
.end method

.method private static final b1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;Ljk0/d;)V
    .locals 1

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0:Llh3/e;

    new-instance v0, Lqm2/t;

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object p1

    invoke-interface {p2}, Ljk0/d;->w0()Lst0/v;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lqm2/t;-><init>(Lcom/whoop/domain/model/WhoopStrapInfo;Lst0/v;)V

    invoke-virtual {p0, v0}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic c0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lmi1/d;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->d0:Lmi1/d;

    return-object p0
.end method

.method private final c1(Ljk0/d;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lqm2/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lst0/l;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "Whoop strap received is different than what the user wants to connect!"

    invoke-interface {p1, v1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lst0/l;->a()Ljava/lang/String;

    move-result-object v1

    :cond_1
    invoke-interface {p1}, Lst0/l;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-void

    :cond_2
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y:Z

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M0(Ljk0/d;)V

    new-instance v0, Lio/sentry/android/core/r0;

    const/16 v1, 0x1c

    invoke-direct {v0, v1, p0, p1}, Lio/sentry/android/core/r0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    return-void

    :cond_3
    const-string p1, "selectedBluetoothDevice"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic d0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    return-object p0
.end method

.method private static final d1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V
    .locals 2

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0:Llh3/e;

    new-instance v0, Lqm2/t;

    invoke-interface {p1}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v1

    invoke-interface {p1}, Ljk0/d;->w0()Lst0/v;

    move-result-object p1

    invoke-direct {v0, v1, p1}, Lqm2/t;-><init>(Lcom/whoop/domain/model/WhoopStrapInfo;Lst0/v;)V

    invoke-virtual {p0, v0}, Llh3/e;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static final synthetic e0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lqm2/m;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    return-object p0
.end method

.method private final e1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X:Lbc3/k1;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W:Lin2/d;

    invoke-interface {v0}, Lin2/d;->getDefault()Lq83/j;

    move-result-object v0

    new-instance v2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;

    invoke-direct {v2, p0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$d;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    const/4 v3, 0x2

    invoke-static {p0, v0, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X:Lbc3/k1;

    return-void
.end method

.method public static final synthetic f0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y:Z

    return p0
.end method

.method public static final synthetic g0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lbc3/k1;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X:Lbc3/k1;

    return-object p0
.end method

.method private final g1()V
    .locals 4

    sget-object v0, Lcom/whoop/service/rearchitect/BleWhoopStrapService;->K:Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->i0:Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$e;

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->c0:Lq92/h;

    invoke-virtual {v2}, Lq92/h;->a()Landroid/bluetooth/BluetoothDevice;

    move-result-object v2

    invoke-virtual {v0, p0, v1, v2}, Lcom/whoop/service/rearchitect/BleWhoopStrapService$b;->a(Landroid/content/Context;Landroid/content/ServiceConnection;Landroid/bluetooth/BluetoothDevice;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->t1()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->e:Leq0/f2;

    invoke-virtual {v0}, Leq0/f2;->b()Landroid/widget/FrameLayout;

    move-result-object v0

    new-instance v1, Ljo/j;

    const/16 v2, 0xc

    invoke-direct {v1, p0, v2}, Ljo/j;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->E0()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->B0()Lqm2/o;

    move-result-object v1

    invoke-virtual {v1}, Lqm2/o;->y()Z

    move-result v1

    xor-int/lit8 v1, v1, 0x1

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g0:Llh3/e;

    invoke-virtual {v2}, Lxg3/g;->E()Lxg3/g;

    move-result-object v2

    const-string v3, "onBackpressureBuffer(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v1, v2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->A(ZLxg3/g;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->G0()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->n1()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->R0()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->L0()V

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->i1()V

    return-void

    :cond_1
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic h0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->E0()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object p0

    return-object p0
.end method

.method private static final h1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V
    .locals 0

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setResult(I)V

    invoke-virtual {p0}, Landroidx/fragment/app/r0;->supportFinishAfterTransition()V

    return-void
.end method

.method public static final synthetic i0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Lci2/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e0:Lci2/b;

    return-object p0
.end method

.method private final i1()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/c;->c:Landroid/widget/ImageView;

    sget v1, Lhi0/d;->i:I

    invoke-static {p0, v1}, Ls4/c;->getDrawable(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public static final synthetic j0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ljava/lang/Boolean;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->H0()Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final j1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    sget-object v3, Lqm2/p;->ACCOUNT_ERROR:Lqm2/p;

    invoke-virtual {v0, v3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;->setErrorState(Lqm2/p;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    new-instance v1, Lqm2/h;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lqm2/h;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    invoke-virtual {v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;->setRetryClickListener(Lc93/a;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic k0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J0()V

    return-void
.end method

.method private static final k1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->x0()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final synthetic l0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lst0/i;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W0(Lst0/i;)V

    return-void
.end method

.method private final l1(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;Lst0/v;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lst0/v;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p3, :cond_0

    sget-object v1, Lst0/v;->Companion:Lst0/v$a;

    invoke-virtual {v1, p3}, Lst0/v$a;->b(Lst0/v;)Ljava/lang/String;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, v0

    :goto_0
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$f;

    invoke-direct {v2, p0, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$f;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v1, v0, v0, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->H0()Ljava/lang/Boolean;

    move-result-object v2

    invoke-virtual {v1, p3, v2, p4}, Lz82/e;->c0(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I0(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Ljava/util/Map;)V

    iget-object p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Z:Lz82/j;

    invoke-virtual {p2}, Lz82/j;->d()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p2

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p2, p3, v1, p4}, Lz82/e;->Y(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V

    :cond_1
    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->w0()V

    const/4 p2, -0x1

    invoke-virtual {p0, p2}, Landroid/app/Activity;->setResult(I)V

    const-string p2, "binding"

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getNumScooterTrialMonths()I

    move-result p3

    if-lez p3, :cond_5

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->A0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p3

    sget-object p4, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HIDE_SCOOTER_TRIAL_TEXT_OVERRIDE:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p3, p4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p3

    if-nez p3, :cond_5

    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_4

    iget-object p3, p3, Lii0/c;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Lm/m;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    sget v1, Lhi0/h;->a:I

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getNumScooterTrialMonths()I

    move-result v2

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->getNumScooterTrialMonths()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    filled-new-array {v3}, [Ljava/lang/Object;

    move-result-object v3

    invoke-virtual {p4, v1, v2, v3}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_3

    iget-object p3, p3, Lii0/c;->i:Landroid/widget/TextView;

    sget p4, Lhi0/j;->M0:I

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_2

    iget-object p3, p3, Lii0/c;->f:Landroid/widget/Button;

    sget p4, Lhi0/j;->L0:I

    invoke-virtual {p0, p4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_3
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_4
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_5
    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_b

    iget-object p3, p3, Lii0/c;->k:Landroid/widget/TextView;

    sget p4, Lhi0/j;->i:I

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Lqm2/m;->c()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, p4, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_9

    iget-object p3, p3, Lii0/c;->i:Landroid/widget/TextView;

    sget p4, Lhi0/j;->h:I

    invoke-virtual {p3, p4}, Landroid/widget/TextView;->setText(I)V

    :goto_1
    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_8

    iget-object p3, p3, Lii0/c;->f:Landroid/widget/Button;

    const/4 p4, 0x0

    invoke-virtual {p3, p4}, Landroid/view/View;->setVisibility(I)V

    iget-object p3, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p3, :cond_7

    iget-object p3, p3, Lii0/c;->f:Landroid/widget/Button;

    new-instance p4, Lb13/a;

    const/16 v1, 0x9

    invoke-direct {p4, v1, p1, p0}, Lb13/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p3, p4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p1, :cond_6

    iget-object p1, p1, Lii0/c;->n:Landroid/widget/ViewFlipper;

    iget p2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->L:I

    invoke-virtual {p1, p2}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    invoke-virtual {p0}, Lhj0/f;->s()Lz82/e;

    move-result-object p1

    invoke-virtual {p1}, Lz82/e;->B0()V

    return-void

    :cond_6
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_7
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_a
    const-string p1, "selectedBluetoothDevice"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_b
    invoke-static {p2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public static final synthetic m0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X0()V

    return-void
.end method

.method private static final m1(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;)V
    .locals 1

    if-eqz p0, :cond_0

    invoke-direct {p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->F0()V

    return-void

    :cond_0
    invoke-static {p1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p0

    new-instance p2, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;

    const/4 v0, 0x0

    invoke-direct {p2, p1, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity$g;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {p0, v0, v0, p2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic n0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y0()V

    return-void
.end method

.method private final n1()V
    .locals 12

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    const-string v1, "selectedBluetoothDevice"

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    invoke-virtual {v0}, Lqm2/m;->c()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lhi0/j;->o1:I

    invoke-virtual {v3, v4}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->y0()Lfi0/a;

    move-result-object v3

    const/16 v10, 0x34

    const/4 v11, 0x0

    const-string v4, "Connectivity"

    const-string v5, "Pairing"

    const/4 v6, 0x0

    const-string v7, "Null Bluetooth Device name"

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v3 .. v11}, Lfi0/a;->i(Lfi0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)V

    :cond_0
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/app/Activity;->setResult(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    const-string v3, "binding"

    if-eqz v0, :cond_5

    iget-object v0, v0, Lii0/c;->k:Landroid/widget/TextView;

    sget v4, Lhi0/j;->k:I

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lii0/c;->i:Landroid/widget/TextView;

    sget v4, Lhi0/j;->j:I

    iget-object v5, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    if-eqz v5, :cond_3

    invoke-virtual {v5}, Lqm2/m;->c()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {p0, v4, v1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/c;->f:Landroid/widget/Button;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->n:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->K:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    return-void

    :cond_1
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_2
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_3
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_5
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public static final synthetic o0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->c1(Ljk0/d;)V

    return-void
.end method

.method private final o1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Showing invalid strap dialog"

    invoke-interface {v0, v3, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lm/i;

    invoke-direct {v0, p0}, Lm/i;-><init>(Landroid/content/Context;)V

    sget v2, Lhi0/j;->u:I

    invoke-virtual {v0, v2}, Lm/i;->b(I)V

    sget v2, Lhi0/j;->t:I

    invoke-virtual {v0, v2}, Lm/i;->a(I)V

    iget-object v2, v0, Lm/i;->a:Lm/e;

    iput-boolean v1, v2, Lm/e;->m:Z

    sget v1, Lhi0/j;->z:I

    new-instance v2, Lqm2/k;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lqm2/k;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    invoke-virtual {v0, v1, v2}, Lm/i;->setPositiveButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    sget v1, Lhi0/j;->y:I

    new-instance v2, Lqm2/k;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lqm2/k;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    invoke-virtual {v0, v1, v2}, Lm/i;->setNegativeButton(ILandroid/content/DialogInterface$OnClickListener;)Lm/i;

    move-result-object v0

    invoke-virtual {v0}, Lm/i;->c()Lm/j;

    return-void
.end method

.method public static final synthetic p0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e1()V

    return-void
.end method

.method private static final p1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V
    .locals 1

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class p2, Lur2/a;

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2, v0}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lur2/a;

    invoke-virtual {p1, p0}, Lur2/a;->n(Landroid/content/Context;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public static final synthetic q0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ln73/b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M:Ln73/b;

    return-void
.end method

.method private static final q1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/content/DialogInterface;I)V
    .locals 0

    invoke-virtual {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->B0()Lqm2/o;

    move-result-object p1

    invoke-virtual {p1}, Lqm2/o;->y()Z

    move-result p1

    if-nez p1, :cond_0

    new-instance p1, Landroid/content/Intent;

    const-class p2, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p1, p0, p2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 p2, 0x24000000

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    const-string p2, "https://whoop.com/LOG_IN"

    invoke-static {p2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    :cond_0
    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public static final synthetic r0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y:Z

    return-void
.end method

.method private final r1()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    const/4 v3, 0x0

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    sget-object v3, Lqm2/p;->NO_NETWORK:Lqm2/p;

    invoke-virtual {v0, v3}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;->setErrorState(Lqm2/p;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    new-instance v1, Lqm2/h;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lqm2/h;-><init>(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;I)V

    invoke-virtual {v0, v1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;->setRetryClickListener(Lc93/a;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic s0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Ljk0/d;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    return-void
.end method

.method private static final s1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Ll83/a0;
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/c;->o:Lcom/whoop/ui/drawer/strapsettings/connectstrap/ConnectStrapNetworkErrorView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->x0()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final synthetic t0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->n1()V

    return-void
.end method

.method private final t1()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/c;->p:Landroid/widget/RelativeLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private final u0()V
    .locals 3

    new-instance v0, Lmm/d;

    const/16 v1, 0x18

    invoke-direct {v0, p0, v1}, Lmm/d;-><init>(Ljava/lang/Object;I)V

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v1

    sget-object v2, Lh5/p0;->a:Ljava/util/WeakHashMap;

    invoke-static {v1, v0}, Lh5/h0;->l(Landroid/view/View;Lh5/u;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final u1(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->A0()Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p0

    invoke-static {p0}, Lst0/u;->a(Lcom/whoop/data/repositories/FeatureFlagChecker;)Z

    move-result p0

    return p0
.end method

.method private static final v0(Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;Landroid/view/View;Lh5/q1;)Lh5/q1;
    .locals 1

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

    iget-object p0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lii0/c;->g:Landroid/widget/LinearLayout;

    const-string p2, "connectStrapContainer"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object p2

    if-eqz p2, :cond_0

    check-cast p2, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v0, p1, Lv4/b;->b:I

    iput v0, p2, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    iget p1, p1, Lv4/b;->d:I

    iput p1, p2, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    invoke-virtual {p0, p2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    sget-object p0, Lh5/q1;->b:Lh5/q1;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private final w0()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->X:Lbc3/k1;

    if-eqz v0, :cond_0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    return-void
.end method

.method private final x0()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    if-eqz v0, :cond_4

    invoke-interface {v0}, Ljk0/d;->f()Lcom/whoop/domain/model/WhoopStrapInfo;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->b0:Lor2/j0;

    invoke-interface {v2}, Lor2/j0;->a()V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->E0()Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;

    move-result-object v2

    const-string v3, ""

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getSerialNumber()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_1

    :cond_0
    move-object v4, v3

    :cond_1
    if-eqz v1, :cond_3

    invoke-virtual {v1}, Lcom/whoop/domain/model/WhoopStrapInfo;->getStrapSignature()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    move-object v3, v1

    :cond_3
    :goto_0
    invoke-interface {v0}, Ljk0/d;->w0()Lst0/v;

    move-result-object v0

    invoke-virtual {v2, v4, v3, v0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/e;->y(Ljava/lang/String;Ljava/lang/String;Lst0/v;)V

    :cond_4
    return-void
.end method

.method private final y0()Lfi0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->U:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lfi0/a;

    return-object v0
.end method


# virtual methods
.method public final B0()Lqm2/o;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->R:Lqm2/o;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "intentBuilder"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public C(Ljk0/d;)V
    .locals 6

    const-string v0, "whoopStrap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const-string v1, "onServiceReady"

    const/4 v2, 0x0

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lqm2/m;->a()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1}, Lst0/l;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const-string v0, "Whoop strap received from service class is different than what the user wants to connect!"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y:Z

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    invoke-interface {p1}, Lst0/l;->getConnectionState()Lst0/f;

    move-result-object v0

    sget-object v1, Lst0/n;->a:Lst0/n;

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    new-instance v0, Llr/e;

    const/16 v1, 0xc

    invoke-direct {v0, p0, v1}, Llr/e;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    invoke-interface {p1}, Lst0/l;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-static {p1}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    move-result v3

    const-string v4, "Sending connect command to "

    const-string v5, " "

    invoke-static {v3, v4, v1, v5}, Lm4/a;->g(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-interface {p1}, Lst0/l;->O()V

    goto :goto_0

    :cond_2
    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    invoke-interface {p1}, Lst0/l;->getConnectionState()Lst0/f;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Showing CONNECTED on screen because current connection state: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Landroidx/fragment/app/d;

    const/16 v1, 0x13

    invoke-direct {v0, p0, p1, p1, v1}, Landroidx/fragment/app/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    :goto_0
    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->T0(Ljk0/d;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M0(Ljk0/d;)V

    return-void

    :cond_3
    const-string p1, "selectedBluetoothDevice"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public final f1(Lqm2/o;)V
    .locals 1

    const-string v0, "<set-?>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->R:Lqm2/o;

    return-void
.end method

.method public getCoroutineContext()Lq83/j;
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->W:Lin2/d;

    invoke-interface {v0}, Lin2/d;->a()Lq83/j;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->V:Lbc3/u;

    invoke-interface {v0, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v0

    return-object v0
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 5

    new-instance v0, Lg/d0;

    sget-object v1, Lg/c0;->y:Lg/c0;

    const/4 v2, 0x0

    const/4 v3, 0x2

    invoke-direct {v0, v2, v2, v3, v1}, Lg/d0;-><init>(IIILkotlin/jvm/functions/Function1;)V

    new-instance v4, Lg/d0;

    invoke-direct {v4, v2, v2, v3, v1}, Lg/d0;-><init>(IIILkotlin/jvm/functions/Function1;)V

    invoke-static {p0, v0, v4}, Lg/n;->a(Lm/m;Lg/d0;Lg/d0;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const-string v1, "onCreate"

    new-array v3, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-super {p0, p1}, Lhj0/s;->onCreate(Landroid/os/Bundle;)V

    new-instance p1, Lqm2/o;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p1, p0, v0}, Lqm2/o;-><init>(Landroid/content/Context;Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->f1(Lqm2/o;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lii0/c;->c(Landroid/view/LayoutInflater;)Lii0/c;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    :try_start_0
    invoke-static {p0}, Lug/m;->B(Landroid/content/ComponentCallbacks;)Lnf3/a;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p1, p1, Lnf3/a;->a:Lwf3/a;

    const-string v0, "connectStrapScopeId"

    iget-object p1, p1, Lwf3/a;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxf3/c;

    if-eqz p1, :cond_0

    const-string v0, "bleStrap"

    new-instance v1, Lvf3/c;

    invoke-direct {v1, v0}, Lvf3/c;-><init>(Ljava/lang/String;)V

    const-class v0, Ljava/util/concurrent/atomic/AtomicReference;

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v4, 0x0

    invoke-virtual {p1, v4, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object p1

    const-string v0, "get(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lqm2/m;

    iput-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->I:Lqm2/m;
    :try_end_0
    .catch Lorg/koin/core/error/ScopeNotCreatedException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->g1()V

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v0, Lj02/l0;

    invoke-virtual {v3, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-virtual {p1, v4, v0, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lj02/l0;

    const-string v0, "BleConnectStrapActivity"

    invoke-interface {p1, v0}, Lj02/l0;->J(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->u0()V

    return-void

    :cond_0
    :try_start_1
    new-instance p1, Lorg/koin/core/error/ScopeNotCreatedException;

    const-string v0, "No scope found for id \'connectStrapScopeId\'"

    invoke-direct {p1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw p1
    :try_end_1
    .catch Lorg/koin/core/error/ScopeNotCreatedException; {:try_start_1 .. :try_end_1} :catch_0

    :catch_0
    iget-object p1, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const-string v0, "Scope connectStrapScopeId does not exist; redirecting to Home activity"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->q(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Landroid/content/Intent;

    const-class v0, Lcom/whoop/ui/home/redesign/view/MainActivity;

    invoke-direct {p1, p0, v0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    const/high16 v0, 0x4000000

    invoke-virtual {p1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    invoke-virtual {p0}, Lhj0/f;->finish()V

    return-void
.end method

.method public onDestroy()V
    .locals 3

    invoke-super {p0}, Lhj0/f;->onDestroy()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onDestroy"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->h0:Lii0/c;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/c;->l:Lcom/whoop/ui/views/ConnectingAnimationView;

    invoke-virtual {v0}, Lcom/whoop/ui/views/ConnectingAnimationView;->f()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->M:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public onStart()V
    .locals 3

    invoke-super {p0}, Lm/m;->onStart()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onStart"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->e1()V

    return-void
.end method

.method public onStop()V
    .locals 3

    invoke-super {p0}, Lm/m;->onStop()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->J:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "onStop"

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->w0()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->N:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    iget-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->O:Ln73/a;

    invoke-virtual {v0}, Ln73/a;->d()V

    return-void
.end method

.method public p()Ljava/lang/String;
    .locals 1

    const-string v0, "Pairing"

    return-object v0
.end method

.method public q()V
    .locals 1

    invoke-direct {p0}, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->D0()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->Y:Z

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/drawer/strapsettings/connectstrap/BleConnectStrapActivity;->P:Ljk0/d;

    return-void
.end method
