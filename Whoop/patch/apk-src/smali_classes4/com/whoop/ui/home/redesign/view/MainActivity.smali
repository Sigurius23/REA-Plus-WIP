.class public final Lcom/whoop/ui/home/redesign/view/MainActivity;
.super Lm/m;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;
.implements Ll80/u;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/home/redesign/view/MainActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b2\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0002\u00c2\u0001\u0008\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\u00082\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u0005J\u000f\u0010\u000c\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u000c\u0010\u0005J\u0017\u0010\u000f\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0014\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0011\u0010\u0005J\u000f\u0010\u0012\u001a\u00020\u0008H\u0014\u00a2\u0006\u0004\u0008\u0012\u0010\u0005J\u0017\u0010\u0015\u001a\u00020\u00082\u0006\u0010\u0014\u001a\u00020\u0013H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0005J\u0017\u0010\u001a\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u0005J\u0018\u0010\u001d\u001a\u00020\u00082\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008!\u0010\"J\u0017\u0010#\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008#\u0010\"J\u0017\u0010$\u001a\u00020\u00082\u0006\u0010 \u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008$\u0010\"J\u0010\u0010%\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\'\u0010&J\u000f\u0010(\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008(\u0010\u0005J\u000f\u0010)\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008)\u0010\u0005J\u0017\u0010,\u001a\u00020\u00082\u0006\u0010+\u001a\u00020*H\u0002\u00a2\u0006\u0004\u0008,\u0010-J\u0019\u0010.\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0019\u001a\u00020\u0018H\u0002\u00a2\u0006\u0004\u0008.\u0010\u001bJ\u0010\u0010/\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008/\u0010&J(\u00104\u001a\u00020\u00082\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0018H\u0082@\u00a2\u0006\u0004\u00084\u00105J\u000f\u00106\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u00086\u0010\u0005J\u0019\u00107\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u00087\u0010\u0010J\u0019\u00108\u001a\u00020\u00082\u0008\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002\u00a2\u0006\u0004\u00088\u0010\u0010J\u0017\u00109\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u00089\u0010\u0010J\u0017\u0010:\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008:\u0010\u0010J\u0017\u0010;\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008;\u0010\u0010J\u0010\u0010<\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008<\u0010&J\u0013\u0010>\u001a\u00020\u0008*\u00020=H\u0002\u00a2\u0006\u0004\u0008>\u0010?J\u000f\u0010@\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008@\u0010\u0005J\u000f\u0010A\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008A\u0010\u0005R\u001b\u0010G\u001a\u00020B8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008C\u0010D\u001a\u0004\u0008E\u0010FR\u001b\u0010L\u001a\u00020H8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008I\u0010D\u001a\u0004\u0008J\u0010KR\u001b\u0010Q\u001a\u00020M8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008N\u0010D\u001a\u0004\u0008O\u0010PR\u001b\u0010V\u001a\u00020R8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008S\u0010D\u001a\u0004\u0008T\u0010UR\u001b\u0010[\u001a\u00020W8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008X\u0010D\u001a\u0004\u0008Y\u0010ZR\u001b\u0010`\u001a\u00020\\8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008]\u0010D\u001a\u0004\u0008^\u0010_R\u001b\u0010e\u001a\u00020a8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008b\u0010D\u001a\u0004\u0008c\u0010dR\u001b\u0010j\u001a\u00020f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008g\u0010D\u001a\u0004\u0008h\u0010iR\u001b\u0010o\u001a\u00020k8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008l\u0010D\u001a\u0004\u0008m\u0010nR\u001b\u0010t\u001a\u00020p8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008q\u0010D\u001a\u0004\u0008r\u0010sR\u001b\u0010y\u001a\u00020u8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008v\u0010D\u001a\u0004\u0008w\u0010xR\u001b\u0010~\u001a\u00020z8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008{\u0010D\u001a\u0004\u0008|\u0010}R\u001f\u0010\u0083\u0001\u001a\u00020\u007f8BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0080\u0001\u0010D\u001a\u0006\u0008\u0081\u0001\u0010\u0082\u0001R \u0010\u0088\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0085\u0001\u0010D\u001a\u0006\u0008\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u008b\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0089\u0001\u0010\u008a\u0001R\u0019\u0010\u008d\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008c\u0001\u0010\u008a\u0001R\u0018\u0010\u0091\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u008f\u0001\u0010\u0090\u0001R \u0010\u0096\u0001\u001a\u00030\u0092\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0093\u0001\u0010D\u001a\u0006\u0008\u0094\u0001\u0010\u0095\u0001R \u0010\u009b\u0001\u001a\u00030\u0097\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u0098\u0001\u0010D\u001a\u0006\u0008\u0099\u0001\u0010\u009a\u0001R \u0010\u00a0\u0001\u001a\u00030\u009c\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u009d\u0001\u0010D\u001a\u0006\u0008\u009e\u0001\u0010\u009f\u0001R \u0010\u00a5\u0001\u001a\u00030\u00a1\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000f\n\u0005\u0008\u00a2\u0001\u0010D\u001a\u0006\u0008\u00a3\u0001\u0010\u00a4\u0001R\u0018\u0010\u00a9\u0001\u001a\u00030\u00a6\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00a7\u0001\u0010\u00a8\u0001R\u001a\u0010\u00ad\u0001\u001a\u00030\u00aa\u00018\u0002@\u0002X\u0082.\u00a2\u0006\u0008\n\u0006\u0008\u00ab\u0001\u0010\u00ac\u0001R\u001a\u0010\u00b1\u0001\u001a\u00030\u00ae\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00af\u0001\u0010\u00b0\u0001R\u0019\u0010\u00b3\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00b2\u0001\u0010\u008a\u0001R\u001c\u0010\u00b6\u0001\u001a\u0005\u0018\u00010\u00b4\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u008a\u0001\u0010\u00b5\u0001R\u001f\u0010\u00ba\u0001\u001a\u00030\u00b7\u00018BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008#\u0010D\u001a\u0006\u0008\u00b8\u0001\u0010\u00b9\u0001R\u001e\u0010\u00bd\u0001\u001a\u00020\u001f8BX\u0082\u0084\u0002\u00a2\u0006\u000e\n\u0004\u0008$\u0010D\u001a\u0006\u0008\u00bb\u0001\u0010\u00bc\u0001R\u001c\u0010\u00c1\u0001\u001a\u0005\u0018\u00010\u00be\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u00bf\u0001\u0010\u00c0\u0001R\u0018\u0010\u00c5\u0001\u001a\u00030\u00c2\u00018\u0002X\u0082\u0004\u00a2\u0006\u0008\n\u0006\u0008\u00c3\u0001\u0010\u00c4\u0001R\u0018\u0010\u00c9\u0001\u001a\u00030\u00c6\u00018@X\u0080\u0004\u00a2\u0006\u0008\u001a\u0006\u0008\u00c7\u0001\u0010\u00c8\u0001\u00a8\u0006\u00ca\u0001"
    }
    d2 = {
        "Lcom/whoop/ui/home/redesign/view/MainActivity;",
        "Lm/m;",
        "Lcom/whoop/service/rearchitect/BleWhoopStrapService$c;",
        "Ll80/u;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "i",
        "onResume",
        "Landroid/content/Intent;",
        "intent",
        "onNewIntent",
        "(Landroid/content/Intent;)V",
        "onPause",
        "onDestroy",
        "Ljk0/d;",
        "whoopStrap",
        "C",
        "(Ljk0/d;)V",
        "q",
        "",
        "isFirstCreate",
        "Y0",
        "(Z)V",
        "Z0",
        "Q0",
        "(ZLq83/d;)Ljava/lang/Object;",
        "Lbc3/c0;",
        "scope",
        "e0",
        "(Lbc3/c0;)V",
        "a0",
        "b0",
        "X0",
        "(Lq83/d;)Ljava/lang/Object;",
        "k0",
        "N0",
        "H0",
        "Landroid/animation/ValueAnimator;",
        "valueAnimator",
        "S0",
        "(Landroid/animation/ValueAnimator;)V",
        "T0",
        "W0",
        "Lj02/m0;",
        "screen",
        "asTabRoot",
        "homeFlashFixEnabled",
        "P0",
        "(Lj02/m0;ZZLq83/d;)Ljava/lang/Object;",
        "G0",
        "J0",
        "I0",
        "M0",
        "K0",
        "L0",
        "O0",
        "Landroid/widget/VideoView;",
        "g0",
        "(Landroid/widget/VideoView;)V",
        "b1",
        "c1",
        "Lod1/a0;",
        "w",
        "Ll83/h;",
        "C0",
        "()Lod1/a0;",
        "userSessionManager",
        "Lhj0/e;",
        "x",
        "q0",
        "()Lhj0/e;",
        "applicationLifecycleListener",
        "Lll1/b;",
        "y",
        "A0",
        "()Lll1/b;",
        "requiredPermissionTracker",
        "Lq92/h;",
        "z",
        "F0",
        "()Lq92/h;",
        "whoopStrapSharedPrefs",
        "Lym2/g;",
        "E",
        "E0",
        "()Lym2/g;",
        "whoopSplashState",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "F",
        "t0",
        "()Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lcom/whoop/service/push/a;",
        "G",
        "o0",
        "()Lcom/whoop/service/push/a;",
        "appNotificationInitializer",
        "Ldp0/g;",
        "H",
        "u0",
        "()Ldp0/g;",
        "globalCoachManager",
        "Lei0/a;",
        "I",
        "l0",
        "()Lei0/a;",
        "amplitudeEngagementClient",
        "Lh92/a;",
        "J",
        "getDeepLinkParser",
        "()Lh92/a;",
        "deepLinkParser",
        "Lj02/s0;",
        "K",
        "x0",
        "()Lj02/s0;",
        "pairingCompletionNavigator",
        "Lzs0/a;",
        "L",
        "s0",
        "()Lzs0/a;",
        "companionDeviceInteractor",
        "Lvm2/b;",
        "M",
        "m0",
        "()Lvm2/b;",
        "appDestinationHelper",
        "Lvm2/j;",
        "N",
        "v0",
        "()Lvm2/j;",
        "launchRedirectGate",
        "O",
        "Z",
        "launchHadDeepLink",
        "P",
        "appNavigatorReady",
        "Lmc3/a;",
        "Q",
        "Lmc3/a;",
        "appNavigatorSetupMutex",
        "Lj02/e;",
        "R",
        "r0",
        "()Lj02/e;",
        "bffBottomNavTabEventPublisher",
        "Lvm2/d;",
        "S",
        "n0",
        "()Lvm2/d;",
        "appNavigator",
        "Lm32/c;",
        "T",
        "y0",
        "()Lm32/c;",
        "requiredPermissionHelper",
        "Lwm2/b;",
        "U",
        "D0",
        "()Lwm2/b;",
        "viewModel",
        "Ltr2/n;",
        "V",
        "Ltr2/n;",
        "logger",
        "Lii0/g;",
        "W",
        "Lii0/g;",
        "activityBinding",
        "Ln73/b;",
        "X",
        "Ln73/b;",
        "serviceConnectionDisposable",
        "Y",
        "serviceHasWhoopStrap",
        "Landroid/os/Vibrator;",
        "Landroid/os/Vibrator;",
        "vibrator",
        "Lyr2/a;",
        "B0",
        "()Lyr2/a;",
        "splashVideoHelper",
        "p0",
        "()Lbc3/c0;",
        "applicationCoroutineScope",
        "Lbc3/k1;",
        "c0",
        "Lbc3/k1;",
        "deepLinkJob",
        "com/whoop/ui/home/redesign/view/MainActivity$r",
        "d0",
        "Lcom/whoop/ui/home/redesign/view/MainActivity$r;",
        "serviceConnection",
        "Lj02/o0;",
        "w0",
        "()Lj02/o0;",
        "navigator",
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


# instance fields
.field private final E:Ll83/h;

.field private final F:Ll83/h;

.field private final G:Ll83/h;

.field private final H:Ll83/h;

.field private final I:Ll83/h;

.field private final J:Ll83/h;

.field private final K:Ll83/h;

.field private final L:Ll83/h;

.field private final M:Ll83/h;

.field private final N:Ll83/h;

.field private O:Z

.field private volatile P:Z

.field private final Q:Lmc3/a;

.field private final R:Ll83/h;

.field private final S:Ll83/h;

.field private final T:Ll83/h;

.field private final U:Ll83/h;

.field private final V:Ltr2/n;

.field private W:Lii0/g;

.field private X:Ln73/b;

.field private Y:Z

.field private Z:Landroid/os/Vibrator;

.field private final a0:Ll83/h;

.field private final b0:Ll83/h;

.field private c0:Lbc3/k1;

.field private final d0:Lcom/whoop/ui/home/redesign/view/MainActivity$r;

.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Lm/m;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e0;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$e0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->w:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$f0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$f0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->x:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$g0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$g0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->y:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$h0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$h0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->z:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$i0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$i0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->E:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$j0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$j0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->F:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$k0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$k0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->G:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$l0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$l0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->H:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$m0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$m0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->I:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$u;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$u;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->J:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$v;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$v;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->K:Ll83/h;

    new-instance v1, Lym2/b;

    const/4 v3, 0x0

    invoke-direct {v1, p0, v3}, Lym2/b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V

    new-instance v3, Lcom/whoop/ui/home/redesign/view/MainActivity$w;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$w;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->L:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$x;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$x;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->M:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$y;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$y;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->N:Ll83/h;

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q:Lmc3/a;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$z;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$z;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->R:Ll83/h;

    new-instance v1, Lym2/b;

    const/4 v3, 0x1

    invoke-direct {v1, p0, v3}, Lym2/b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V

    new-instance v3, Lcom/whoop/ui/home/redesign/view/MainActivity$a0;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$a0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->S:Ll83/h;

    new-instance v1, Lvf3/c;

    const-string v3, "required-permissions-helper"

    invoke-direct {v1, v3}, Lvf3/c;-><init>(Ljava/lang/String;)V

    new-instance v3, Lym2/b;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lym2/b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V

    new-instance v4, Lcom/whoop/ui/home/redesign/view/MainActivity$b0;

    invoke-direct {v4, p0, v1, v3}, Lcom/whoop/ui/home/redesign/view/MainActivity$b0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->T:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$n0;

    invoke-direct {v1, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity$n0;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v3, Ll83/i;->y:Ll83/i;

    new-instance v4, Lcom/whoop/ui/home/redesign/view/MainActivity$o0;

    invoke-direct {v4, p0, v2, v1, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$o0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v3, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->U:Ll83/h;

    sget-object v1, Ltr2/n;->a:Ltr2/n$a;

    const-string v3, "MainActivity"

    invoke-virtual {v1, v3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    sget-object v1, Lq73/d;->w:Lq73/d;

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->X:Ln73/b;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$c0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$c0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->a0:Ll83/h;

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$d0;

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d0;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->b0:Ll83/h;

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$r;

    invoke-direct {v0, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity$r;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    iput-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->d0:Lcom/whoop/ui/home/redesign/view/MainActivity$r;

    return-void
.end method

.method public static final synthetic A(Lcom/whoop/ui/home/redesign/view/MainActivity;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->b0(Lbc3/c0;)V

    return-void
.end method

.method private final A0()Lll1/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lll1/b;

    return-object v0
.end method

.method public static final synthetic B(Lcom/whoop/ui/home/redesign/view/MainActivity;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->e0(Lbc3/c0;)V

    return-void
.end method

.method private final B0()Lyr2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->a0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lyr2/a;

    return-object v0
.end method

.method private final C0()Lod1/a0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lod1/a0;

    return-object v0
.end method

.method public static final synthetic D(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->k0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final D0()Lwm2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->U:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwm2/b;

    return-object v0
.end method

.method public static final synthetic E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    return-object p0
.end method

.method private final E0()Lym2/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->E:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lym2/g;

    return-object v0
.end method

.method public static final synthetic F(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lvm2/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p0

    return-object p0
.end method

.method private final F0()Lq92/h;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lq92/h;

    return-object v0
.end method

.method public static final synthetic G(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lj02/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->r0()Lj02/e;

    move-result-object p0

    return-object p0
.end method

.method private final G0()V
    .locals 8

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->t0()Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object v0

    const-string v1, "pop-to-home-graph"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget v1, Lhi0/e;->E2:I

    goto :goto_0

    :cond_0
    sget v1, Lhi0/e;->D2:I

    :goto_0
    iget-object v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "POP_TO_HOME_GRAPH enabled="

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", popUpToId="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v3, 0x0

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {v2, v0, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object v0

    new-instance v2, Lj02/m0$d;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lj02/m0$d;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v0, v2}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    return-void
.end method

.method public static final synthetic H(Lcom/whoop/ui/home/redesign/view/MainActivity;)Ldp0/g;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->u0()Ldp0/g;

    move-result-object p0

    return-object p0
.end method

.method private final H0()V
    .locals 1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->s0()Lzs0/a;

    move-result-object v0

    invoke-interface {v0}, Lzs0/a;->c()V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->G0()V

    return-void
.end method

.method public static final synthetic I(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lvm2/j;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->v0()Lvm2/j;

    move-result-object p0

    return-object p0
.end method

.method private final I0(Landroid/content/Intent;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->c0:Lbc3/k1;

    if-eqz v0, :cond_1

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    sget-object v0, Lvm2/h;->a:Lvm2/h;

    invoke-virtual {v0, p1}, Lvm2/h;->a(Landroid/content/Intent;)Lvm2/i;

    move-result-object v0

    const/4 v1, -0x1

    if-nez v0, :cond_2

    move v0, v1

    goto :goto_0

    :cond_2
    sget-object v2, Lcom/whoop/ui/home/redesign/view/MainActivity$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v2, v0

    :goto_0
    if-eq v0, v1, :cond_7

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_7

    const/4 v1, 0x3

    if-eq v0, v1, :cond_5

    const/4 v1, 0x4

    if-eq v0, v1, :cond_4

    const/4 v1, 0x5

    if-ne v0, v1, :cond_3

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->M0(Landroid/content/Intent;)V

    return-void

    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_4
    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->L0(Landroid/content/Intent;)V

    return-void

    :cond_5
    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->K0(Landroid/content/Intent;)V

    return-void

    :cond_6
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->l0()Lei0/a;

    move-result-object v0

    invoke-interface {v0, p1}, Lei0/a;->b(Landroid/content/Intent;)V

    :cond_7
    :goto_1
    return-void
.end method

.method public static final synthetic J(Lcom/whoop/ui/home/redesign/view/MainActivity;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    return-object p0
.end method

.method private final J0(Landroid/content/Intent;)V
    .locals 3

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$f;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$f;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/content/Intent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final synthetic K(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lm32/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->y0()Lm32/c;

    move-result-object p0

    return-object p0
.end method

.method private final K0(Landroid/content/Intent;)V
    .locals 8

    const-string v0, "iterableNavType"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    sget p1, Lhi0/e;->Q1:I

    invoke-static {p0, p1}, Ldt/b;->r(Landroid/app/Activity;I)Leb/a0;

    move-result-object v3

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p1

    const-class v0, Ln92/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ln92/b;

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object v5

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Ln92/b;->t(Ln92/b;Ljava/lang/String;Leb/a0;ZLj02/o0;ILjava/lang/Object;)Ln92/a;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "forwarded iterable navigation resulted in "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, p1, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic L(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lcom/whoop/ui/home/redesign/view/MainActivity$r;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->d0:Lcom/whoop/ui/home/redesign/view/MainActivity$r;

    return-object p0
.end method

.method private final L0(Landroid/content/Intent;)V
    .locals 3

    const-string v0, "pairing_completion_destination"

    invoke-virtual {p1, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->x0()Lj02/s0;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object v0

    invoke-virtual {p1, v1, v0}, Lj02/s0;->a(Ljava/lang/String;Lj02/o0;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static final synthetic M(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Y:Z

    return p0
.end method

.method private final M0(Landroid/content/Intent;)V
    .locals 5

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_2

    :cond_0
    invoke-virtual {v0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_6

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    const v4, -0x48659701

    if-eq v3, v4, :cond_4

    const v4, -0x3a083c83

    if-eq v3, v4, :cond_1

    goto :goto_0

    :cond_1
    const-string v3, "stress-session"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_0

    :cond_2
    const-string v1, "sessionType"

    invoke-virtual {p1, v1}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-virtual {v0, v1}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    :cond_3
    if-eqz v3, :cond_a

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object v0

    new-instance v1, Lj02/m0$z4;

    invoke-direct {v1, v3}, Lj02/m0$z4;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    invoke-virtual {p1, v2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    return-void

    :cond_4
    const-string v3, "/strava_integration"

    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    goto :goto_0

    :cond_5
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->D0()Lwm2/b;

    move-result-object v0

    new-instance v1, Lxm2/b$a;

    invoke-virtual {p1}, Landroid/content/Intent;->getData()Landroid/net/Uri;

    move-result-object p1

    invoke-direct {v1, p1}, Lxm2/b$a;-><init>(Landroid/net/Uri;)V

    invoke-virtual {v0, v1}, Lwm2/b;->o(Lxm2/b;)V

    return-void

    :cond_6
    :goto_0
    sget-object v1, Lcom/whoop/domain/model/WhoopUri;->Companion:Lcom/whoop/domain/model/WhoopUri$Companion;

    invoke-virtual {v1, v0}, Lcom/whoop/domain/model/WhoopUri$Companion;->parse(Landroid/net/Uri;)Lcom/whoop/domain/model/AndroidUri;

    move-result-object v0

    if-eqz v0, :cond_a

    sget-object v1, Lh92/a;->e:Lh92/a$a;

    invoke-virtual {v1, v0}, Lh92/a$a;->a(Lcom/whoop/domain/model/WhoopUri;)Z

    move-result v1

    if-eqz v1, :cond_9

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const-string v3, "activityBinding"

    if-eqz v1, :cond_8

    iget-object v1, v1, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v4, "splashView"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x8

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v1, :cond_7

    iget-object v1, v1, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v3, "splashVideoView"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_1

    :cond_7
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_8
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_9
    :goto_1
    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v1

    new-instance v3, Lcom/whoop/ui/home/redesign/view/MainActivity$g;

    invoke-direct {v3, p0, v0, p1, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$g;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lcom/whoop/domain/model/AndroidUri;Landroid/content/Intent;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v2, v2, v3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->c0:Lbc3/k1;

    :cond_a
    :goto_2
    return-void
.end method

.method public static final synthetic N(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lyr2/a;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->B0()Lyr2/a;

    move-result-object p0

    return-object p0
.end method

.method private final N0()V
    .locals 2

    invoke-virtual {p0}, Lg/l;->getOnBackPressedDispatcher()Lg/z;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$h;

    invoke-direct {v1, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity$h;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    invoke-virtual {v0, p0, v1}, Lg/z;->a(Landroidx/lifecycle/g0;Lg/t;)V

    return-void
.end method

.method public static final synthetic O(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lwm2/b;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->D0()Lwm2/b;

    move-result-object p0

    return-object p0
.end method

.method private final O0(Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->A0()Lll1/b;

    move-result-object v0

    invoke-virtual {v0}, Lll1/b;->b()Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$i;

    invoke-direct {v1, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity$i;-><init>(Lec3/l;)V

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$j;

    invoke-direct {v0, p0}, Lcom/whoop/ui/home/redesign/view/MainActivity$j;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    invoke-interface {v1, v0, p1}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static final synthetic P(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lym2/g;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E0()Lym2/g;

    move-result-object p0

    return-object p0
.end method

.method private final P0(Lj02/m0;ZZLq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lj02/m0;",
            "ZZ",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    if-eqz p2, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lvm2/d;->M(Lj02/m0;)Lj02/p0;

    goto :goto_0

    :cond_0
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p2

    invoke-virtual {p2, p1}, Lvm2/d;->b(Lj02/m0;)Lj02/p0;

    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    if-eqz p3, :cond_3

    new-instance p2, Lbc3/m;

    invoke-static {p4}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p3

    const/4 p4, 0x1

    invoke-direct {p2, p4, p3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p2}, Lbc3/m;->s()V

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lii0/g;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p3

    new-instance p4, Lcom/whoop/ui/home/redesign/view/MainActivity$k;

    invoke-direct {p4, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity$k;-><init>(Lbc3/k;)V

    invoke-virtual {p3, p4}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    invoke-virtual {p2}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p2

    sget-object p3, Lr83/a;->w:Lr83/a;

    if-ne p2, p3, :cond_1

    return-object p2

    :cond_1
    return-object p1

    :cond_2
    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1

    :cond_3
    return-object p1
.end method

.method public static final synthetic Q(Lcom/whoop/ui/home/redesign/view/MainActivity;)Lq92/h;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->F0()Lq92/h;

    move-result-object p0

    return-object p0
.end method

.method private final Q0(ZLq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$l;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$l;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;ZLq83/d;)V

    new-instance p1, Lbc3/d2;

    invoke-interface {p2}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    const/4 v2, 0x0

    invoke-direct {p1, v1, p2, v2}, Lbc3/d2;-><init>(Lq83/j;Lq83/d;I)V

    const/4 p2, 0x1

    invoke-static {p1, p2, p1, v0}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lr83/a;->w:Lr83/a;

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static final synthetic R(Lcom/whoop/ui/home/redesign/view/MainActivity;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->H0()V

    return-void
.end method

.method private static final R0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p0

    const/4 p2, 0x0

    invoke-static {p0, p2, p1, v1, v3}, Lzm2/a;->c(Lvm2/d;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic S(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/content/Intent;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->I0(Landroid/content/Intent;)V

    return-void
.end method

.method private final S0(Landroid/animation/ValueAnimator;)V
    .locals 2

    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->getAnimatedFraction()F

    move-result p1

    const/high16 v0, 0x3f800000    # 1.0f

    cmpg-float p1, p1, v0

    if-nez p1, :cond_0

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->U0(Lcom/whoop/ui/home/redesign/view/MainActivity;ZILjava/lang/Object;)V

    :cond_0
    return-void
.end method

.method public static final synthetic T(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->O0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final T0(Z)V
    .locals 5

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E0()Lym2/g;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {v0, v1}, Lym2/g;->b(Z)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->C0()Lod1/a0;

    move-result-object v0

    invoke-interface {v0}, Lod1/a0;->q()Lcom/whoop/domain/model/Session;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->H0()V

    return-void

    :cond_0
    const/4 v0, 0x3

    const/4 v1, 0x0

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->t0()Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object v2

    sget-object v3, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v2, v3}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v2, Lcom/whoop/ui/home/redesign/view/MainActivity$o;

    invoke-direct {v2, p0, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$o;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    invoke-static {p1, v1, v1, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    iget-object v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const-string v3, "activityBinding"

    if-eqz v2, :cond_4

    iget-object v2, v2, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v4, "splashView"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v4, 0x8

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v2, :cond_3

    iget-object v2, v2, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v3, "splashVideoView"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    if-eqz p1, :cond_2

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance v2, Lcom/whoop/ui/home/redesign/view/MainActivity$p;

    invoke-direct {v2, p0, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$p;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    invoke-static {p1, v1, v1, v2, v0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_2
    return-void

    :cond_3
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v3}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public static final synthetic U(Lcom/whoop/ui/home/redesign/view/MainActivity;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q0(ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic U0(Lcom/whoop/ui/home/redesign/view/MainActivity;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->T0(Z)V

    return-void
.end method

.method public static final synthetic V(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->W0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private static final V0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 3

    invoke-virtual {p0}, Lg/l;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v1, Lrl1/a;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {p0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lrl1/a;

    invoke-virtual {p0}, Lrl1/a;->a()Ljava/util/List;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic W(Lcom/whoop/ui/home/redesign/view/MainActivity;Ln73/b;)V
    .locals 0

    iput-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->X:Ln73/b;

    return-void
.end method

.method private final W0(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/ui/home/redesign/view/MainActivity$q;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;

    iget v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;

    invoke-direct {v0, p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity$q;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->x:Ljava/lang/Object;

    check-cast v0, Lj02/m0;

    :goto_1
    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v0, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->x:Ljava/lang/Object;

    check-cast v0, Lvm2/g;

    goto :goto_1

    :cond_3
    iget-boolean v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->w:Z

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_2
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->t0()Lcom/whoop/data/repositories/FeatureFlagRepository;

    move-result-object p1

    sget-object v2, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->FIX_HOME_FLASH_ON_REENTRY:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p1, v2}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v2

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->m0()Lvm2/b;

    move-result-object p1

    iput-boolean v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->w:Z

    iput v6, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    invoke-virtual {p1, v0}, Lvm2/b;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_4

    :cond_5
    :goto_2
    check-cast p1, Lvm2/g;

    const/4 v7, 0x0

    const/4 v8, 0x0

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lvm2/g;->a()Lj02/m0;

    move-result-object v3

    invoke-virtual {p1}, Lvm2/g;->b()Z

    move-result p1

    iput-object v8, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->x:Ljava/lang/Object;

    iput-boolean v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->w:Z

    iput v7, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->y:I

    iput v4, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    invoke-direct {p0, v3, p1, v2, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->P0(Lj02/m0;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    if-ne p1, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_3
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->v0()Lvm2/j;

    move-result-object p1

    invoke-virtual {p1}, Lvm2/j;->c()V

    return-object v5

    :cond_7
    :try_start_3
    iget-boolean p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->O:Z

    if-eqz p1, :cond_8

    goto :goto_3

    :cond_8
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p1

    invoke-static {p1, v8, v6, v8}, Lvm2/d;->u(Lvm2/d;Leb/n0;ILjava/lang/Object;)Lj02/m0;

    move-result-object p1

    if-eqz p1, :cond_6

    iput-object v8, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->x:Ljava/lang/Object;

    iput-boolean v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->w:Z

    iput v7, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->y:I

    iput v3, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$q;->F:I

    invoke-direct {p0, p1, v6, v2, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->P0(Lj02/m0;ZZLq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    if-ne p1, v1, :cond_6

    :goto_4
    return-object v1

    :goto_5
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->v0()Lvm2/j;

    move-result-object v0

    invoke-virtual {v0}, Lvm2/j;->c()V

    throw p1
.end method

.method public static final synthetic X(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->X0(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final X0(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/ui/home/redesign/view/MainActivity$s;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;

    iget v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;

    invoke-direct {v0, p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity$s;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz p1, :cond_4

    iget-object p1, p1, Lii0/g;->b:Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {p1}, Landroidx/fragment/app/FragmentContainerView;->getFragment()Landroidx/fragment/app/m0;

    move-result-object p1

    iput v3, v0, Lcom/whoop/ui/home/redesign/view/MainActivity$s;->y:I

    invoke-static {p1, v0}, Lhj0/a;->a(Landroidx/fragment/app/m0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object p1

    invoke-virtual {p1}, Lvm2/d;->D()V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->N0()V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_4
    const-string p1, "activityBinding"

    invoke-static {p1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method

.method public static final synthetic Y(Lcom/whoop/ui/home/redesign/view/MainActivity;Z)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Y0(Z)V

    return-void
.end method

.method private final Y0(Z)V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->E0()Lym2/g;

    move-result-object v0

    invoke-interface {v0}, Lym2/g;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->T0(Z)V

    return-void

    :cond_0
    :try_start_0
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->B0()Lyr2/a;

    move-result-object p1

    invoke-interface {p1}, Lyr2/a;->d()Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->b1()V

    goto :goto_0

    :cond_1
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z0()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z0()V

    :goto_0
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->p0()Lbc3/c0;

    move-result-object p1

    new-instance v0, Lcom/whoop/ui/home/redesign/view/MainActivity$t;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity$t;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {p1, v1, v1, v0, v2}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private static final Z(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final Z0()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const/4 v1, 0x0

    const-string v2, "activityBinding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v3, "splashVideoView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    new-instance v1, Lqi/s;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lqi/s;-><init>(Ljava/lang/Object;I)V

    iget-object v0, v0, Lcom/airbnb/lottie/LottieAnimationView;->E:Lqi/w;

    iget-object v0, v0, Lqi/w;->x:Ldj/e;

    invoke-virtual {v0, v1}, Ldj/e;->addUpdateListener(Landroid/animation/ValueAnimator$AnimatorUpdateListener;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private final a0(Lbc3/c0;)V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->C0()Lod1/a0;

    move-result-object v0

    invoke-interface {v0}, Lod1/a0;->b()Lec3/t1;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v2, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private static final a1(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/animation/ValueAnimator;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->S0(Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method private final b0(Lbc3/c0;)V
    .locals 5

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v1, Li92/d;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v2, v1, v2}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li92/d;

    invoke-virtual {v0}, Li92/d;->b()Lec3/l;

    move-result-object v0

    new-instance v1, Lym2/b;

    const/4 v3, 0x3

    invoke-direct {v1, p0, v3}, Lym2/b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V

    new-instance v3, Lym2/b;

    const/4 v4, 0x4

    invoke-direct {v3, p0, v4}, Lym2/b;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;I)V

    invoke-static {v0, v1, v3}, Lym2/f;->a(Lec3/l;Lc93/a;Lc93/a;)Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$c;

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$c;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v2, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private final b1()V
    .locals 5

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const/4 v1, 0x0

    const-string v2, "activityBinding"

    if-eqz v0, :cond_3

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v3, "splashVideoView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v4, 0x0

    invoke-virtual {v0, v4}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->g0(Landroid/widget/VideoView;)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    invoke-virtual {v0}, Landroid/widget/VideoView;->start()V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    const-string v3, "Splash video started"

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {v0, v3, v4}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v1, "splashView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

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
.end method

.method private static final c0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z
    .locals 2

    invoke-static {p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object p0

    const-class v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {p0, v1, v0, v1}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    sget-object v0, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->MFA_DOUBLE_POP:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result p0

    return p0
.end method

.method private final c1()V
    .locals 8

    const/4 v0, 0x0

    :try_start_0
    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->B0()Lyr2/a;

    move-result-object v1

    invoke-interface {v1}, Lyr2/a;->a()Ljava/util/List;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z:Landroid/os/Vibrator;

    if-eqz v2, :cond_2

    move-object v3, v1

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v3, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll83/k;

    iget-object v6, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-interface {v4, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catch_0
    move-exception v1

    goto :goto_2

    :cond_0
    invoke-static {v4}, Lm83/s;->E1(Ljava/util/Collection;)[J

    move-result-object v3

    check-cast v1, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v1, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ll83/k;

    iget-object v5, v5, Ll83/k;->x:Ljava/lang/Object;

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_1
    invoke-static {v4}, Lm83/s;->C1(Ljava/util/Collection;)[I

    move-result-object v1

    const/4 v4, -0x1

    invoke-static {v3, v1, v4}, Landroid/os/VibrationEffect;->createWaveform([J[II)Landroid/os/VibrationEffect;

    move-result-object v1

    invoke-virtual {v2, v1}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    :cond_2
    iget-object v1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    const-string v2, "Haptics triggered for splash video"

    new-array v3, v0, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :goto_2
    iget-object v2, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    const-string v3, "Failed to trigger haptics for splash video"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v3, v1, v0}, Ltr2/n;->i(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    return-void
.end method

.method private static final d0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z
    .locals 2

    sget v0, Lhi0/e;->Q1:I

    const-string v1, "<this>"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, v0}, Ldt/b;->r(Landroid/app/Activity;I)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->i()Leb/n0;

    move-result-object p0

    if-eqz p0, :cond_0

    iget p0, p0, Leb/n0;->H:I

    sget v0, Lhi0/e;->e3:I

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final e0(Lbc3/c0;)V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->D0()Lwm2/b;

    move-result-object v0

    invoke-virtual {v0}, Lwm2/b;->l()Lec3/l;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$d;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/ui/home/redesign/view/MainActivity$d;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    new-instance v2, Lec3/j1;

    const/4 v3, 0x0

    invoke-direct {v2, v0, v1, v3}, Lec3/j1;-><init>(Ljava/lang/Object;Ll83/e;I)V

    invoke-static {v2, p1}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    return-void
.end method

.method private static final f0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 1

    const-class v0, Landroid/companion/CompanionDeviceManager;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final g0(Landroid/widget/VideoView;)V
    .locals 4

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    const/4 v0, 0x1

    invoke-virtual {p1, v0}, Landroid/view/View;->setHapticFeedbackEnabled(Z)V

    new-instance v0, Lym2/c;

    invoke-direct {v0, p0}, Lym2/c;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setOnErrorListener(Landroid/media/MediaPlayer$OnErrorListener;)V

    new-instance v0, Lym2/d;

    invoke-direct {v0, p0}, Lym2/d;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setOnCompletionListener(Landroid/media/MediaPlayer$OnCompletionListener;)V

    new-instance v0, Lym2/e;

    invoke-direct {v0, p0}, Lym2/e;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setOnInfoListener(Landroid/media/MediaPlayer$OnInfoListener;)V

    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    sget v1, Lhi0/i;->i:I

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "android.resource://"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "/"

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/widget/VideoView;->setVideoURI(Landroid/net/Uri;)V

    return-void
.end method

.method private static final h0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x1

    invoke-static {p0, p2, p3, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->U0(Lcom/whoop/ui/home/redesign/view/MainActivity;ZILjava/lang/Object;)V

    return p3
.end method

.method private static final i0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;)V
    .locals 2

    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z:Landroid/os/Vibrator;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Landroid/os/Vibrator;->cancel()V

    :cond_0
    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->U0(Lcom/whoop/ui/home/redesign/view/MainActivity;ZILjava/lang/Object;)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->B0()Lyr2/a;

    move-result-object p0

    const-string p1, "complete"

    invoke-interface {p0, p1}, Lyr2/a;->c(Ljava/lang/String;)V

    return-void
.end method

.method private static final j0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z
    .locals 0

    const/4 p1, 0x3

    if-ne p2, p1, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->c1()V

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method private final k0(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    instance-of v1, p1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;

    if-eqz v1, :cond_0

    move-object v1, p1

    check-cast v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;

    iget v2, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    goto :goto_0

    :cond_0
    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;

    invoke-direct {v1, p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity$e;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    :goto_0
    iget-object p1, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->z:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    const/4 v4, 0x0

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v3, :cond_3

    if-eq v3, v6, :cond_2

    if-ne v3, v5, :cond_1

    iget-object v1, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->w:Ljava/lang/Object;

    check-cast v1, Lmc3/a;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    :catchall_0
    move-exception p1

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget v3, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->x:I

    iget-object v8, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->w:Ljava/lang/Object;

    check-cast v8, Lmc3/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object p1, v8

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-boolean p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->P:Z

    if-eqz p1, :cond_4

    return-object v0

    :cond_4
    iget-object p1, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Q:Lmc3/a;

    iput-object p1, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->w:Ljava/lang/Object;

    iput v4, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->x:I

    iput v6, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    invoke-interface {p1, v1}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_5

    goto :goto_2

    :cond_5
    move v3, v4

    :goto_1
    :try_start_1
    iget-boolean v8, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->P:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-eqz v8, :cond_6

    invoke-interface {p1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :cond_6
    :try_start_2
    iput-object p1, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->w:Ljava/lang/Object;

    iput v3, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->x:I

    iput v4, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->y:I

    iput v5, v1, Lcom/whoop/ui/home/redesign/view/MainActivity$e;->F:I

    invoke-direct {p0, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->X0(Lq83/d;)Ljava/lang/Object;

    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    if-ne v1, v2, :cond_7

    :goto_2
    return-object v2

    :cond_7
    move-object v1, p1

    :goto_3
    :try_start_3
    iput-boolean v6, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->P:Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    return-object v0

    :catchall_1
    move-exception v0

    move-object v1, p1

    move-object p1, v0

    :goto_4
    invoke-interface {v1, v7}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method

.method private final l0()Lei0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lei0/a;

    return-object v0
.end method

.method private final m0()Lvm2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->M:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvm2/b;

    return-object v0
.end method

.method private final n0()Lvm2/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->S:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvm2/d;

    return-object v0
.end method

.method public static synthetic o(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/ui/home/redesign/view/MainActivity;->h0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method private final o0()Lcom/whoop/service/push/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/push/a;

    return-object v0
.end method

.method public static synthetic p(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/ui/home/redesign/view/MainActivity;->j0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;II)Z

    move-result p0

    return p0
.end method

.method private final p0()Lbc3/c0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->b0:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbc3/c0;

    return-object v0
.end method

.method private final q0()Lhj0/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lhj0/e;

    return-object v0
.end method

.method public static synthetic r(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->V0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final r0()Lj02/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->R:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/e;

    return-object v0
.end method

.method public static synthetic s(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/ui/home/redesign/view/MainActivity;->R0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final s0()Lzs0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->L:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzs0/a;

    return-object v0
.end method

.method public static synthetic t(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->d0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z

    move-result p0

    return p0
.end method

.method private final t0()Lcom/whoop/data/repositories/FeatureFlagRepository;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->F:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagRepository;

    return-object v0
.end method

.method public static synthetic u(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->f0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final u0()Ldp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->H:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    return-object v0
.end method

.method public static synthetic v(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->i0(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/media/MediaPlayer;)V

    return-void
.end method

.method private final v0()Lvm2/j;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->N:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvm2/j;

    return-object v0
.end method

.method public static synthetic w(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/animation/ValueAnimator;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->a1(Lcom/whoop/ui/home/redesign/view/MainActivity;Landroid/animation/ValueAnimator;)V

    return-void
.end method

.method public static synthetic x(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z(Lcom/whoop/ui/home/redesign/view/MainActivity;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private final x0()Lj02/s0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->K:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/s0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->c0(Lcom/whoop/ui/home/redesign/view/MainActivity;)Z

    move-result p0

    return p0
.end method

.method private final y0()Lm32/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->T:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm32/c;

    return-object v0
.end method

.method public static final synthetic z(Lcom/whoop/ui/home/redesign/view/MainActivity;Lbc3/c0;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->a0(Lbc3/c0;)V

    return-void
.end method


# virtual methods
.method public C(Ljk0/d;)V
    .locals 1

    const-string v0, "whoopStrap"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p1}, Lst0/l;->O()V

    return-void
.end method

.method public i()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const/4 v1, 0x0

    const-string v2, "activityBinding"

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/g;->e:Lcom/airbnb/lottie/LottieAnimationView;

    const-string v3, "splashView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v3, 0x8

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v1, "splashVideoView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 6

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-nez p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x1f

    if-lt v3, v4, :cond_1

    new-instance v3, Ld5/c;

    invoke-direct {v3, p0}, Ld5/c;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;)V

    goto :goto_1

    :cond_1
    new-instance v3, Laj/d;

    invoke-direct {v3, p0}, Laj/d;-><init>(Ljava/lang/Object;)V

    :goto_1
    invoke-virtual {v3}, Laj/d;->p()V

    invoke-super {p0, p1}, Landroidx/fragment/app/r0;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    new-instance v3, Lhj0/r;

    iget-object v4, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->V:Ltr2/n;

    invoke-direct {v3, v4}, Lhj0/r;-><init>(Ltr2/n;)V

    invoke-virtual {p1, v3}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    const/4 p1, 0x0

    if-eqz v2, :cond_2

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->r0()Lj02/e;

    move-result-object v3

    sget-object v4, Lj02/d$b;->a:Lj02/d$b;

    invoke-virtual {v3, v4}, Lj02/e;->c(Lj02/d;)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->v0()Lvm2/j;

    move-result-object v3

    invoke-virtual {v3}, Lvm2/j;->b()V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->u0()Ldp0/g;

    move-result-object v3

    invoke-interface {v3, p1}, Ldp0/g;->z(Lj02/m0;)V

    :cond_2
    if-eqz v2, :cond_3

    sget-object v3, Lvm2/h;->a:Lvm2/h;

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v4

    const-string v5, "getIntent(...)"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v3, v4}, Lvm2/h;->a(Landroid/content/Intent;)Lvm2/i;

    move-result-object v3

    if-eqz v3, :cond_3

    sget-object v4, Lvm2/i;->AMP_PREVIEW:Lvm2/i;

    if-eq v3, v4, :cond_3

    move v0, v1

    :cond_3
    iput-boolean v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->O:Z

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    invoke-static {v0}, Lii0/g;->c(Landroid/view/LayoutInflater;)Lii0/g;

    move-result-object v0

    const-string v3, "inflate(...)"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object v3

    invoke-virtual {p0, v3}, Lm/m;->setContentView(Landroid/view/View;)V

    iput-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const-class v0, Landroid/os/Vibrator;

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Vibrator;

    iput-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z:Landroid/os/Vibrator;

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v3, Lcom/whoop/ui/home/redesign/view/MainActivity$m;

    invoke-direct {v3, p0, v2, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity$m;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;ZLq83/d;)V

    invoke-virtual {v0, v3}, Landroidx/lifecycle/b0;->a(Lc93/m;)Lbc3/c2;

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const-string v2, "activityBinding"

    if-eqz v0, :cond_5

    iget-object v0, v0, Lii0/g;->a:Landroidx/compose/ui/platform/ComposeView;

    const-string v3, "floatingNavComposeView"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lc41/l3;

    const/16 v4, 0xe

    invoke-direct {v3, p0, v4}, Lc41/l3;-><init>(Ljava/lang/Object;I)V

    new-instance v4, Lx1/b;

    const v5, -0x55b87e45

    invoke-direct {v4, v3, v1, v5}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {v0, v4}, Ld91/b;->c(Landroidx/compose/ui/platform/ComposeView;Lc93/m;)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lii0/g;->c:Landroidx/compose/ui/platform/ComposeView;

    const-string v1, "globalCoachOverlayComposeView"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Lym2/a;->a:Lym2/a;

    invoke-virtual {v1}, Lym2/a;->b()Lc93/m;

    move-result-object v1

    invoke-static {v0, v1}, Ld91/b;->c(Landroidx/compose/ui/platform/ComposeView;Lc93/m;)V

    invoke-virtual {p0}, Lg/l;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->y0()Lm32/c;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-static {p0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/ui/home/redesign/view/MainActivity$n;

    invoke-direct {v1, p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity$n;-><init>(Lcom/whoop/ui/home/redesign/view/MainActivity;Lq83/d;)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/b0;->b(Lc93/m;)V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->o0()Lcom/whoop/service/push/a;

    move-result-object p1

    invoke-virtual {p1, p0}, Lcom/whoop/service/push/a;->a(Landroid/content/Context;)V

    return-void

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p1
.end method

.method public onDestroy()V
    .locals 1

    invoke-super {p0}, Lm/m;->onDestroy()V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->X:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    return-void
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1

    const-string v0, "intent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1}, Lg/l;->onNewIntent(Landroid/content/Intent;)V

    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->J0(Landroid/content/Intent;)V

    return-void
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/r0;->onPause()V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->q0()Lhj0/e;

    move-result-object v0

    invoke-interface {v0, p0}, Lhj0/e;->onActivityPaused(Landroid/app/Activity;)V

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->W:Lii0/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/g;->d:Landroid/widget/VideoView;

    const-string v2, "splashVideoView"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/home/redesign/view/MainActivity;->Z:Landroid/os/Vibrator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/os/Vibrator;->cancel()V

    :cond_0
    const/4 v0, 0x0

    const/4 v2, 0x1

    invoke-static {p0, v0, v2, v1}, Lcom/whoop/ui/home/redesign/view/MainActivity;->U0(Lcom/whoop/ui/home/redesign/view/MainActivity;ZILjava/lang/Object;)V

    :cond_1
    return-void

    :cond_2
    const-string v0, "activityBinding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method public onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/r0;->onResume()V

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->q0()Lhj0/e;

    move-result-object v0

    invoke-interface {v0, p0}, Lhj0/e;->onActivityResumed(Landroid/app/Activity;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->J0(Landroid/content/Intent;)V

    return-void
.end method

.method public q()V
    .locals 0

    return-void
.end method

.method public final w0()Lj02/o0;
    .locals 1

    invoke-direct {p0}, Lcom/whoop/ui/home/redesign/view/MainActivity;->n0()Lvm2/d;

    move-result-object v0

    return-object v0
.end method
