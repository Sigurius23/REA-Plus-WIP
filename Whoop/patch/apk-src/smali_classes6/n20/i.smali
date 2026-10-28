.class public final Ln20/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lh20/d2;


# instance fields
.field public final a:Lbc3/c0;

.field public final b:Landroidx/lifecycle/g0;

.field public final c:Lpg3/p;

.field public final d:Lh20/s;

.field public final e:Lh20/c4;

.field public final f:Landroid/content/Context;

.field public final g:Lk20/a;

.field public final h:Ln20/u;

.field public final i:Ln20/k;

.field public final j:Lu00/e;

.field public final k:Lh20/x;

.field public final l:Lxz/f0;

.field public final m:Lwz/r0;

.field public final n:Lwz/r0;

.field public final o:Z

.field public final p:Ljava/util/Set;

.field public final q:Ln20/p;

.field public final r:Lb20/f;

.field public final s:Z

.field public final t:Ljava/lang/String;

.field public final u:Lj/d;

.field public final v:Lj/d;


# direct methods
.method public constructor <init>(Lbc3/c0;Landroidx/lifecycle/g0;Lpg3/p;Lh20/s;Lh20/c4;Lj/c;Lj/k;Landroid/content/Context;Lk20/a;Ln20/u;Ln20/k;Lu00/e;Lh20/x;Lxz/f0;Lwz/r0;Lwz/r0;ZLjava/util/Set;Ln20/p;Lb20/f;ZLjava/lang/String;)V
    .locals 16

    move-object/from16 v0, p1

    move-object/from16 v8, p2

    move-object/from16 v1, p3

    move-object/from16 v3, p4

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p8

    move-object/from16 v7, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    const-string v2, "viewModelScope"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "lifecycleOwner"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentOptionFactory"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentOptionResultCallback"

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentResultCallback"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "activityResultCaller"

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "activityResultRegistryOwner"

    move-object/from16 v5, p7

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v6, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "eventReporter"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "viewModel"

    invoke-static {v9, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "confirmationHandler"

    invoke-static {v10, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkGateFactory"

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkHandler"

    invoke-static {v12, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "linkAccountHolder"

    invoke-static {v13, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "flowControllerLinkLauncher"

    invoke-static {v14, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "walletsButtonLinkLauncher"

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "productUsage"

    move-object/from16 v5, p18

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "configurationHandler"

    move-object/from16 v5, p19

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "errorReporter"

    move-object/from16 v5, p20

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "paymentElementCallbackIdentifier"

    move-object/from16 v5, p22

    invoke-static {v5, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct/range {p0 .. p0}, Ljava/lang/Object;-><init>()V

    move-object/from16 v2, p0

    iput-object v0, v2, Ln20/i;->a:Lbc3/c0;

    iput-object v8, v2, Ln20/i;->b:Landroidx/lifecycle/g0;

    iput-object v1, v2, Ln20/i;->c:Lpg3/p;

    iput-object v3, v2, Ln20/i;->d:Lh20/s;

    iput-object v4, v2, Ln20/i;->e:Lh20/c4;

    iput-object v6, v2, Ln20/i;->f:Landroid/content/Context;

    iput-object v7, v2, Ln20/i;->g:Lk20/a;

    iput-object v9, v2, Ln20/i;->h:Ln20/u;

    iput-object v10, v2, Ln20/i;->i:Ln20/k;

    iput-object v11, v2, Ln20/i;->j:Lu00/e;

    iput-object v12, v2, Ln20/i;->k:Lh20/x;

    iput-object v13, v2, Ln20/i;->l:Lxz/f0;

    iput-object v14, v2, Ln20/i;->m:Lwz/r0;

    iput-object v15, v2, Ln20/i;->n:Lwz/r0;

    move/from16 v0, p17

    iput-boolean v0, v2, Ln20/i;->o:Z

    move-object/from16 v0, p18

    iput-object v0, v2, Ln20/i;->p:Ljava/util/Set;

    move-object/from16 v0, p19

    iput-object v0, v2, Ln20/i;->q:Ln20/p;

    move-object/from16 v0, p20

    iput-object v0, v2, Ln20/i;->r:Lb20/f;

    move/from16 v0, p21

    iput-boolean v0, v2, Ln20/i;->s:Z

    iput-object v5, v2, Ln20/i;->t:Ljava/lang/String;

    iget-object v0, v10, Ln20/k;->b:Le10/r0;

    move-object/from16 v5, p6

    invoke-virtual {v0, v5, v8}, Le10/r0;->f(Lj/c;Landroidx/lifecycle/g0;)V

    new-instance v0, Lcom/stripe/android/paymentsheet/PaymentOptionContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/PaymentOptionContract;-><init>()V

    new-instance v1, Ln20/g;

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Ln20/g;-><init>(Ln20/i;I)V

    invoke-interface {v5, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    iput-object v0, v2, Ln20/i;->u:Lj/d;

    new-instance v0, Lcom/stripe/android/paymentsheet/ui/SepaMandateContract;

    invoke-direct {v0}, Lcom/stripe/android/paymentsheet/ui/SepaMandateContract;-><init>()V

    new-instance v1, Ln20/g;

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Ln20/g;-><init>(Ln20/i;I)V

    invoke-interface {v5, v0, v1}, Lj/c;->registerForActivityResult(Lk/b;Lj/b;)Lj/d;

    move-result-object v0

    iput-object v0, v2, Ln20/i;->v:Lj/d;

    invoke-interface/range {p7 .. p7}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v9

    new-instance v0, Lm7/l0;

    const/4 v6, 0x0

    const/16 v7, 0x18

    const/4 v1, 0x1

    const-class v3, Ln20/i;

    const-string v4, "onLinkResultFromFlowController"

    const-string v5, "onLinkResultFromFlowController(Lcom/stripe/android/link/LinkActivityResult;)V"

    invoke-direct/range {v0 .. v7}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    const-string v1, "LinkPaymentLauncher_DefaultFlowController"

    invoke-virtual {v14, v1, v9, v0}, Lwz/r0;->c(Ljava/lang/String;Lj/j;Lkotlin/jvm/functions/Function1;)V

    invoke-interface/range {p7 .. p7}, Lj/k;->getActivityResultRegistry()Lj/j;

    move-result-object v0

    new-instance v1, Lm7/l0;

    const/4 v2, 0x0

    const/16 v3, 0x19

    const/4 v4, 0x1

    const-class v5, Ln20/i;

    const-string v6, "onLinkResultFromWalletsButton"

    const-string v7, "onLinkResultFromWalletsButton(Lcom/stripe/android/link/LinkActivityResult;)V"

    move-object/from16 p5, p0

    move-object/from16 p3, v1

    move/from16 p9, v2

    move/from16 p10, v3

    move/from16 p4, v4

    move-object/from16 p6, v5

    move-object/from16 p7, v6

    move-object/from16 p8, v7

    invoke-direct/range {p3 .. p10}, Lm7/l0;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    move-object/from16 v2, p5

    const-string v3, "LinkPaymentLauncher_WalletsButton"

    invoke-virtual {v15, v3, v0, v1}, Lwz/r0;->c(Ljava/lang/String;Lj/j;Lkotlin/jvm/functions/Function1;)V

    invoke-interface {v8}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    new-instance v1, Le10/q0;

    const/4 v3, 0x5

    invoke-direct {v1, v2, v3}, Le10/q0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    invoke-static {v8}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lkd/f;

    const/16 v3, 0x9

    const/4 v4, 0x0

    invoke-direct {v1, v2, v4, v3}, Lkd/f;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v3, 0x3

    invoke-static {v0, v4, v4, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static final a(Ln20/i;Le10/x;)V
    .locals 10

    instance-of v0, p1, Le10/w;

    if-eqz v0, :cond_1

    iget-object v0, p0, Ln20/i;->h:Ln20/u;

    iget-object v0, v0, Ln20/u;->E:Lq20/y;

    if-eqz v0, :cond_0

    iget-object v1, p0, Ln20/i;->g:Lk20/a;

    move-object v2, p1

    check-cast v2, Le10/w;

    iget-object v3, v2, Le10/w;->b:Ln10/c0;

    iget-object v2, v2, Le10/w;->a:Ly00/c8;

    invoke-interface {v2}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v0, v3, v2}, Lk20/a;->p(Lq20/y;Ln10/c0;Ljava/lang/String;)V

    :cond_0
    sget-object v5, Lg20/t;->w:Lg20/t;

    check-cast p1, Le10/w;

    iget-object v6, p1, Le10/w;->b:Ln10/c0;

    iget-boolean v8, p1, Le10/w;->c:Z

    iget-object p1, p1, Le10/w;->a:Ly00/c8;

    invoke-interface {p1}, Ly00/c8;->getId()Ljava/lang/String;

    move-result-object v9

    const/4 v7, 0x0

    move-object v4, p0

    invoke-virtual/range {v4 .. v9}, Ln20/i;->d(Lg20/v;Ln10/c0;ZZLjava/lang/String;)V

    return-void

    :cond_1
    move-object v4, p0

    instance-of p0, p1, Le10/v;

    const/16 v0, 0x18

    if-eqz p0, :cond_3

    check-cast p1, Le10/v;

    invoke-static {p1}, Lds/q;->I(Le10/v;)Lk20/h;

    move-result-object p0

    if-eqz p0, :cond_2

    iget-object v1, v4, Ln20/i;->h:Ln20/u;

    iget-object v1, v1, Ln20/u;->E:Lq20/y;

    if-eqz v1, :cond_2

    iget-object v2, v4, Ln20/i;->g:Lk20/a;

    invoke-virtual {v2, v1, p0}, Lk20/a;->m(Lq20/y;Lk20/h;)V

    :cond_2
    new-instance p0, Lg20/u;

    iget-object p1, p1, Le10/v;->a:Ljava/lang/Throwable;

    invoke-direct {p0, p1}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v4, p0, v0}, Ln20/i;->e(Ln20/i;Lg20/v;I)V

    return-void

    :cond_3
    instance-of p0, p1, Le10/n;

    if-eqz p0, :cond_7

    check-cast p1, Le10/n;

    iget-object p0, p1, Le10/n;->a:Le10/m;

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    if-eqz p0, :cond_6

    const/4 p1, 0x1

    if-eq p0, p1, :cond_5

    const/4 p1, 0x2

    if-ne p0, p1, :cond_4

    return-void

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_5
    invoke-virtual {v4}, Ln20/i;->f()V

    return-void

    :cond_6
    sget-object p0, Lg20/s;->w:Lg20/s;

    invoke-static {v4, p0, v0}, Ln20/i;->e(Ln20/i;Lg20/v;I)V

    return-void

    :cond_7
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static synthetic e(Ln20/i;Lg20/v;I)V
    .locals 6

    and-int/lit8 p2, p2, 0x4

    if-eqz p2, :cond_0

    const/4 p2, 0x1

    :goto_0
    move v3, p2

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    goto :goto_0

    :goto_1
    const/4 v4, 0x1

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object v0, p0

    move-object v1, p1

    invoke-virtual/range {v0 .. v5}, Ln20/i;->d(Lg20/v;Ln10/c0;ZZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final b(Lh20/u2;Lh20/x1;Ljo2/d;)V
    .locals 7

    new-instance v2, La30/q0;

    invoke-direct {v2, p1}, La30/q0;-><init>(Lh20/u2;)V

    if-nez p2, :cond_0

    iget-object p1, p0, Ln20/i;->f:Landroid/content/Context;

    invoke-static {p1}, Lse/h;->z(Landroid/content/Context;)Lh20/x1;

    move-result-object p2

    :cond_0
    move-object v3, p2

    iget-object v1, p0, Ln20/i;->q:Ln20/p;

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const-string p1, "scope"

    iget-object p2, p0, Ln20/i;->a:Lbc3/c0;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, v1, Ln20/p;->f:Ljava/util/concurrent/atomic/AtomicReference;

    new-instance v0, Ld33/t0;

    const/4 v6, 0x0

    iget-boolean v4, p0, Ln20/i;->s:Z

    move-object v5, p3

    invoke-direct/range {v0 .. v6}, Ld33/t0;-><init>(Ln20/p;La30/q0;Lh20/x1;ZLjo2/d;Lq83/d;)V

    const/4 p3, 0x3

    const/4 v1, 0x0

    invoke-static {p2, v1, v1, v0, p3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p2

    invoke-virtual {p1, p2}, Ljava/util/concurrent/atomic/AtomicReference;->getAndSet(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbc3/k1;

    if-eqz p1, :cond_1

    invoke-interface {p1, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_1
    return-void
.end method

.method public final c()V
    .locals 15

    iget-object v0, p0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v0}, Ln20/u;->g()Ln20/h;

    move-result-object v0

    const/16 v1, 0x1e

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling confirm()."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v2, Lg20/u;

    invoke-direct {v2, v0}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p0, v2, v1}, Ln20/i;->e(Ln20/i;Lg20/v;I)V

    return-void

    :cond_0
    iget-object v2, p0, Ln20/i;->q:Ln20/p;

    iget-object v3, v2, Ln20/p;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lbc3/k1;->isCompleted()Z

    move-result v3

    xor-int/2addr v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    if-nez v3, :cond_2

    iget-boolean v2, v2, Ln20/p;->g:Z

    if-nez v2, :cond_2

    move v4, v5

    :cond_2
    if-nez v4, :cond_3

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "FlowController.confirm() can only be called if the most recent call to configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() has completed successfully."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    new-instance v2, Lg20/u;

    invoke-direct {v2, v0}, Lg20/u;-><init>(Ljava/lang/Throwable;)V

    invoke-static {p0, v2, v1}, Ln20/i;->e(Ln20/i;Lg20/v;I)V

    return-void

    :cond_3
    iget-object v1, p0, Ln20/i;->h:Ln20/u;

    iget-object v3, v1, Ln20/u;->E:Lq20/y;

    instance-of v1, v3, Lq20/m;

    const/4 v8, 0x3

    const-string v2, "state"

    const/4 v6, 0x0

    if-nez v1, :cond_4

    instance-of v1, v3, Lq20/j;

    if-nez v1, :cond_4

    instance-of v1, v3, Lq20/i;

    if-nez v1, :cond_4

    instance-of v1, v3, Lq20/g;

    if-nez v1, :cond_4

    instance-of v1, v3, Lq20/t;

    if-nez v1, :cond_4

    instance-of v1, v3, Lq20/x;

    if-nez v1, :cond_4

    if-nez v3, :cond_5

    :cond_4
    move-object v5, p0

    goto :goto_1

    :cond_5
    instance-of v1, v3, Lq20/w;

    if-eqz v1, :cond_7

    move-object v10, v3

    check-cast v10, Lq20/w;

    iget-object v11, v0, Ln20/h;->w:La30/f1;

    iget-object v0, v10, Lq20/w;->x:Ly00/o4;

    iget-object v0, v0, Ly00/o4;->E:Ly00/f4;

    sget-object v1, Ly00/f4;->L:Ly00/f4;

    if-ne v0, v1, :cond_6

    iget-object v0, p0, Ln20/i;->h:Ln20/u;

    iget-object v0, v0, Ln20/u;->E:Lq20/y;

    if-eqz v0, :cond_6

    iget-boolean v0, v0, Lq20/y;->w:Z

    if-nez v0, :cond_6

    iget-object v0, p0, Ln20/i;->v:Lj/d;

    new-instance v1, Lb30/x5;

    iget-object v2, v11, La30/f1;->w:Lmy/a;

    iget-object v2, v2, Lmy/a;->w:Ljava/lang/String;

    invoke-direct {v1, v2}, Lb30/x5;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1, v6}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V

    return-void

    :cond_6
    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Ln20/i;->a:Lbc3/c0;

    new-instance v9, Lb2/y;

    const/16 v14, 0x12

    move-object v12, p0

    move-object v13, v6

    invoke-direct/range {v9 .. v14}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v5, v12

    invoke-static {v0, v6, v6, v9, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_7
    move-object v5, p0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :goto_1
    iget-object v4, v0, Ln20/h;->w:La30/f1;

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, v5, Ln20/i;->a:Lbc3/c0;

    new-instance v2, Lb2/y;

    const/16 v7, 0x12

    invoke-direct/range {v2 .. v7}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v0, v6, v6, v2, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final d(Lg20/v;Ln10/c0;ZZLjava/lang/String;)V
    .locals 2

    if-eqz p3, :cond_1

    instance-of p3, p1, Lg20/t;

    if-eqz p3, :cond_0

    iget-object p3, p0, Ln20/i;->h:Ln20/u;

    iget-object p3, p3, Ln20/u;->E:Lq20/y;

    if-eqz p3, :cond_1

    iget-object v0, p0, Ln20/i;->g:Lk20/a;

    invoke-virtual {v0, p3, p2, p5}, Lk20/a;->p(Lq20/y;Ln10/c0;Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    instance-of p2, p1, Lg20/u;

    if-eqz p2, :cond_1

    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iget-object p2, p2, Ln20/u;->E:Lq20/y;

    if-eqz p2, :cond_1

    iget-object p3, p0, Ln20/i;->g:Lk20/a;

    new-instance p5, Lk20/g;

    move-object v0, p1

    check-cast v0, Lg20/u;

    iget-object v0, v0, Lg20/u;->w:Ljava/lang/Throwable;

    invoke-direct {p5, v0}, Lk20/g;-><init>(Ljava/lang/Throwable;)V

    invoke-virtual {p3, p2, p5}, Lk20/a;->m(Lq20/y;Lk20/h;)V

    :cond_1
    :goto_0
    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iget-object p2, p2, Ln20/u;->E:Lq20/y;

    iget-object p3, p0, Ln20/i;->h:Ln20/u;

    invoke-virtual {p3}, Ln20/u;->g()Ln20/h;

    move-result-object p3

    const/4 p5, 0x0

    const/4 v0, 0x0

    if-eqz p3, :cond_3

    iget-object p3, p3, Ln20/h;->w:La30/f1;

    iget-object p3, p3, La30/f1;->E:Lv00/c0;

    iget-object p3, p3, Lv00/c0;->l0:La30/l0;

    if-eqz p3, :cond_2

    iget-object p3, p3, La30/l0;->w:Lwz/g0;

    goto :goto_1

    :cond_2
    move-object p3, p5

    :goto_1
    if-eqz p3, :cond_3

    iget-boolean p3, p3, Lwz/g0;->P:Z

    const/4 v1, 0x1

    if-ne p3, v1, :cond_3

    move v0, v1

    :cond_3
    instance-of p3, p1, Lg20/t;

    if-eqz p3, :cond_4

    if-eqz p2, :cond_4

    invoke-static {p2}, Lug/m;->G(Lq20/y;)Z

    move-result p2

    if-eqz p2, :cond_4

    if-nez v0, :cond_4

    iget-object p2, p0, Ln20/i;->k:Lh20/x;

    invoke-virtual {p2}, Lh20/x;->b()V

    :cond_4
    if-eqz p3, :cond_5

    if-eqz p4, :cond_5

    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iput-object p5, p2, Ln20/u;->E:Lq20/y;

    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iget-object p2, p2, Ln20/u;->x:Landroidx/lifecycle/k1;

    const-string p3, "state"

    invoke-virtual {p2, p5, p3}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    :cond_5
    iget-object p2, p0, Ln20/i;->a:Lbc3/c0;

    new-instance p3, Landroidx/room/e;

    const/16 p4, 0x18

    invoke-direct {p3, p0, p1, p5, p4}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    const/4 p1, 0x3

    invoke-static {p2, p5, p5, p3, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final f()V
    .locals 2

    new-instance v0, Ln20/f;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ln20/f;-><init>(Ln20/i;I)V

    invoke-virtual {p0, v0}, Ln20/i;->j(Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method public final g(Ln20/h;Lq20/y;)V
    .locals 11

    iget-object v0, p1, Ln20/h;->w:La30/f1;

    const/4 v1, 0x0

    const/16 v2, 0x1b

    invoke-static {v0, v1, p2, v1, v2}, La30/f1;->b(La30/f1;La30/a;Lq20/y;Lv00/c0;I)La30/f1;

    move-result-object v4

    iget-object v5, p1, Ln20/h;->x:Lh20/x1;

    iget-object p1, p0, Ln20/i;->l:Lxz/f0;

    iget-object p1, p1, Lxz/f0;->b:Lec3/r1;

    iget-object p1, p1, Lec3/r1;->w:Lec3/f2;

    invoke-interface {p1}, Lec3/f2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Lwz/d;

    iget-object p1, p0, Ln20/i;->h:Ln20/u;

    iget-boolean v8, p1, Ln20/u;->z:Z

    new-instance v3, Lh20/f0;

    iget-boolean v7, p0, Ln20/i;->o:Z

    iget-object v9, p0, Ln20/i;->p:Ljava/util/Set;

    iget-object v10, p0, Ln20/i;->t:Ljava/lang/String;

    invoke-direct/range {v3 .. v10}, Lh20/f0;-><init>(La30/f1;Lh20/x1;Lwz/d;ZZLjava/util/Set;Ljava/lang/String;)V

    iget-object p1, p1, Landroidx/lifecycle/b;->w:Landroid/app/Application;

    const-string p2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    const p2, 0x7f01005d

    const v0, 0x7f01005e

    invoke-static {p1, p2, v0}, Landroidx/core/app/ActivityOptionsCompat;->makeCustomAnimation(Landroid/content/Context;II)Landroidx/core/app/ActivityOptionsCompat;

    move-result-object p1

    const-string p2, "makeCustomAnimation(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object p2, p0, Ln20/i;->u:Lj/d;

    invoke-virtual {p2, v3, p1}, Lj/d;->a(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v0

    move-object p1, v0

    iget-object p2, p0, Ln20/i;->b:Landroidx/lifecycle/g0;

    invoke-interface {p2}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p2

    invoke-virtual {p2}, Landroidx/lifecycle/x;->b()Landroidx/lifecycle/w;

    move-result-object p2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "The host activity is not in a valid state ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, ")."

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    new-instance v0, Lh20/a4;

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-direct {v1, p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    iget-object p1, p0, Ln20/i;->e:Lh20/c4;

    invoke-interface {p1, v0}, Lh20/c4;->a(Lh20/b4;)V

    return-void
.end method

.method public final h(Lwz/e;)V
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    iget-object v2, v0, Ln20/i;->l:Lxz/f0;

    invoke-static {v1, v2}, Ls3/d;->u(Lwz/e;Lxz/f0;)V

    instance-of v2, v1, Lwz/d;

    if-eqz v2, :cond_6

    iget-object v2, v0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v2}, Ln20/u;->g()Ln20/h;

    move-result-object v3

    if-nez v3, :cond_0

    goto/16 :goto_2

    :cond_0
    iget-object v4, v3, Ln20/h;->w:La30/f1;

    iget-object v4, v4, La30/f1;->E:Lv00/c0;

    check-cast v1, Lwz/d;

    iget-object v1, v1, Lwz/d;->w:Ld00/l;

    if-eqz v1, :cond_1

    iget-object v1, v1, Ld00/l;->L:Ld00/f;

    if-nez v1, :cond_2

    :cond_1
    sget-object v1, Ld00/c;->a:Ld00/c;

    :cond_2
    iget-object v5, v4, Lv00/c0;->U:La30/m0;

    instance-of v6, v5, La30/l0;

    if-eqz v6, :cond_3

    check-cast v5, La30/l0;

    invoke-static {v1}, Lx43/j;->X(Ld00/f;)La30/k0;

    move-result-object v1

    iget-object v6, v5, La30/l0;->w:Lwz/g0;

    iget-object v5, v5, La30/l0;->y:La30/j0;

    const-string v7, "configuration"

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "signupModeResult"

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v7, La30/l0;

    invoke-direct {v7, v6, v1, v5}, La30/l0;-><init>(Lwz/g0;La30/k0;La30/j0;)V

    move-object/from16 v25, v7

    goto :goto_1

    :cond_3
    instance-of v1, v5, La30/f0;

    if-nez v1, :cond_5

    if-nez v5, :cond_4

    goto :goto_0

    :cond_4
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_5
    :goto_0
    move-object/from16 v25, v5

    :goto_1
    iget-object v5, v4, Lv00/c0;->w:Ly00/c8;

    iget-object v6, v4, Lv00/c0;->x:Lh20/l1;

    iget-boolean v7, v4, Lv00/c0;->y:Z

    iget-boolean v8, v4, Lv00/c0;->z:Z

    iget-boolean v9, v4, Lv00/c0;->E:Z

    iget-object v10, v4, Lv00/c0;->F:Ljava/util/List;

    iget-object v11, v4, Lv00/c0;->G:Ljava/util/List;

    iget-object v12, v4, Lv00/c0;->H:Lw30/c;

    iget-object v13, v4, Lv00/c0;->I:Ljava/lang/String;

    iget-object v14, v4, Lv00/c0;->J:Ljava/lang/String;

    iget-object v15, v4, Lv00/c0;->K:Lh20/i1;

    iget-object v1, v4, Lv00/c0;->L:Li20/b;

    iget-object v0, v4, Lv00/c0;->M:Ljava/util/List;

    move-object/from16 v17, v0

    iget-object v0, v4, Lv00/c0;->N:Ljava/util/List;

    move-object/from16 v18, v0

    iget-object v0, v4, Lv00/c0;->O:Ljava/util/List;

    move-object/from16 v19, v0

    iget-object v0, v4, Lv00/c0;->P:Lv00/p;

    move-object/from16 v20, v0

    iget-boolean v0, v4, Lv00/c0;->Q:Z

    move/from16 v21, v0

    iget-object v0, v4, Lv00/c0;->R:Lh20/w2;

    move-object/from16 v16, v1

    iget-object v1, v4, Lv00/c0;->S:Lv00/i0;

    move/from16 v22, v7

    iget-object v7, v4, Lv00/c0;->T:Ly00/p2;

    move-object/from16 v24, v7

    iget-object v7, v4, Lv00/c0;->V:Lq20/c;

    move-object/from16 v26, v7

    iget-object v7, v4, Lv00/c0;->W:Lf20/b;

    move-object/from16 v27, v7

    iget-object v7, v4, Lv00/c0;->X:Lux/a;

    move/from16 v23, v8

    iget-object v8, v4, Lv00/c0;->Y:Lux/b;

    move/from16 v28, v9

    iget-object v9, v4, Lv00/c0;->Z:Ljava/util/Map;

    move-object/from16 v29, v10

    iget-boolean v10, v4, Lv00/c0;->a0:Z

    move/from16 v31, v10

    iget-object v10, v4, Lv00/c0;->b0:Ly00/c3;

    move-object/from16 v32, v10

    iget-boolean v10, v4, Lv00/c0;->c0:Z

    move/from16 v33, v10

    iget-object v10, v4, Lv00/c0;->d0:Ly00/n;

    move-object/from16 v30, v14

    iget-boolean v14, v4, Lv00/c0;->e0:Z

    move/from16 v35, v14

    iget-object v14, v4, Lv00/c0;->f0:Lh20/h1;

    move-object/from16 v34, v15

    iget-object v15, v4, Lv00/c0;->g0:Ljava/lang/String;

    move-object/from16 v37, v15

    iget-object v15, v4, Lv00/c0;->h0:Lv00/a0;

    move-object/from16 v42, v2

    iget-object v2, v4, Lv00/c0;->i0:Lv00/n;

    move-object/from16 v43, v3

    iget-object v3, v4, Lv00/c0;->j0:Ly00/r1;

    iget-boolean v4, v4, Lv00/c0;->k0:Z

    move-object/from16 v40, v3

    const-string v3, "stripeIntent"

    invoke-static {v5, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "billingDetailsCollectionConfiguration"

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentMethodOrder"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cbcEligibility"

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "merchantName"

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "linkConfiguration"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "paymentMethodSaveConsentBehavior"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardBrandFilter"

    invoke-static {v7, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "cardFundingFilter"

    invoke-static {v8, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "termsDisplay"

    invoke-static {v9, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "clientAttributionMetadata"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "appearance"

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "integrationMetadata"

    invoke-static {v15, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "analyticsMetadata"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move/from16 v41, v4

    new-instance v4, Lv00/c0;

    move-object/from16 v39, v2

    move-object/from16 v36, v14

    move-object/from16 v38, v15

    move-object/from16 v14, v30

    move-object/from16 v15, v34

    move-object/from16 v30, v9

    move-object/from16 v34, v10

    move/from16 v9, v28

    move-object/from16 v10, v29

    move-object/from16 v28, v7

    move-object/from16 v29, v8

    move/from16 v7, v22

    move/from16 v8, v23

    move-object/from16 v22, v0

    move-object/from16 v23, v1

    invoke-direct/range {v4 .. v41}, Lv00/c0;-><init>(Ly00/c8;Lh20/l1;ZZZLjava/util/List;Ljava/util/List;Lw30/c;Ljava/lang/String;Ljava/lang/String;Lh20/i1;Li20/b;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lv00/p;ZLh20/w2;Lv00/i0;Ly00/p2;La30/m0;Lq20/c;Lf20/b;Lux/a;Lux/b;Ljava/util/Map;ZLy00/c3;ZLy00/n;ZLh20/h1;Ljava/lang/String;Lv00/a0;Lv00/n;Ly00/r1;Z)V

    const/4 v0, 0x0

    const/4 v1, 0x3

    move-object/from16 v2, v43

    invoke-static {v2, v0, v4, v1}, Ln20/h;->f(Ln20/h;La30/a;Lv00/c0;I)Ln20/h;

    move-result-object v0

    move-object/from16 v1, v42

    iget-object v1, v1, Ln20/u;->x:Landroidx/lifecycle/k1;

    const-string v2, "state"

    invoke-virtual {v1, v0, v2}, Landroidx/lifecycle/k1;->e(Ljava/lang/Object;Ljava/lang/String;)V

    return-void

    :cond_6
    sget-object v0, Lwz/b;->w:Lwz/b;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    :goto_2
    return-void

    :cond_7
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method public final i(Lwz/u0;Z)V
    .locals 5

    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iget-object p2, p2, Ln20/u;->E:Lq20/y;

    instance-of v0, p2, Lq20/m;

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    check-cast p2, Lq20/m;

    invoke-static {p2, p1}, Lq20/m;->h(Lq20/m;Lwz/u0;)Lq20/m;

    move-result-object p1

    goto :goto_5

    :cond_0
    iget-object p1, p0, Ln20/i;->h:Ln20/u;

    invoke-virtual {p1}, Ln20/u;->g()Ln20/h;

    move-result-object p1

    if-eqz p1, :cond_7

    iget-object p1, p1, Ln20/h;->w:La30/f1;

    if-eqz p1, :cond_7

    iget-object p2, p1, La30/f1;->x:La30/a;

    if-nez p2, :cond_1

    goto :goto_4

    :cond_1
    iget-object p1, p1, La30/f1;->E:Lv00/c0;

    iget-object p1, p1, Lv00/c0;->P:Lv00/p;

    const/4 v1, 0x0

    if-eqz p1, :cond_2

    iget-boolean p1, p1, Lv00/p;->z:Z

    goto :goto_0

    :cond_2
    move p1, v1

    :goto_0
    if-eqz p1, :cond_6

    iget-object p1, p2, La30/a;->w:Ljava/util/List;

    check-cast p1, Ljava/lang/Iterable;

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ly00/o4;

    iget-object v4, p2, La30/a;->x:Ljava/lang/String;

    if-eqz v4, :cond_4

    iget-object v3, v3, Ly00/o4;->w:Ljava/lang/String;

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/4 v3, 0x1

    goto :goto_1

    :cond_4
    move v3, v1

    :goto_1
    if-eqz v3, :cond_3

    goto :goto_2

    :cond_5
    move-object v2, v0

    :goto_2
    check-cast v2, Ly00/o4;

    goto :goto_3

    :cond_6
    iget-object p1, p2, La30/a;->w:Ljava/util/List;

    invoke-static {p1}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ly00/o4;

    :goto_3
    if-eqz v2, :cond_7

    new-instance p1, Lq20/w;

    invoke-direct {p1, v2, v0, v0}, Lq20/w;-><init>(Ly00/o4;Lq20/u;Ly00/u5;)V

    goto :goto_5

    :cond_7
    :goto_4
    move-object p1, v0

    :goto_5
    iget-object p2, p0, Ln20/i;->h:Ln20/u;

    iput-object p1, p2, Ln20/u;->E:Lq20/y;

    if-eqz p1, :cond_8

    iget-object p2, p0, Ln20/i;->c:Lpg3/p;

    invoke-virtual {p2, p1}, Lpg3/p;->f(Lq20/y;)Lq20/e;

    move-result-object v0

    :cond_8
    iget-object p1, p0, Ln20/i;->d:Lh20/s;

    iget-object p1, p1, Lh20/s;->a:Lp1/c1;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lh20/e0;

    invoke-interface {p1, v0}, Lh20/e0;->a(Lq20/e;)V

    :cond_9
    return-void
.end method

.method public final j(Lkotlin/jvm/functions/Function1;)V
    .locals 6

    iget-object v0, p0, Ln20/i;->h:Ln20/u;

    invoke-virtual {v0}, Ln20/u;->g()Ln20/h;

    move-result-object v0

    iget-object v1, p0, Ln20/i;->e:Lh20/c4;

    if-nez v0, :cond_0

    new-instance p1, Lh20/a4;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "FlowController must be successfully initialized using configureWithPaymentIntent(), configureWithSetupIntent() or configureWithIntentConfiguration() before calling presentPaymentOptions()."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v1, p1}, Lh20/c4;->a(Lh20/b4;)V

    return-void

    :cond_0
    iget-object v2, p0, Ln20/i;->q:Ln20/p;

    iget-object v3, v2, Ln20/p;->f:Ljava/util/concurrent/atomic/AtomicReference;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicReference;->get()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lbc3/k1;

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v3, :cond_1

    invoke-interface {v3}, Lbc3/k1;->isCompleted()Z

    move-result v3

    xor-int/2addr v3, v5

    goto :goto_0

    :cond_1
    move v3, v4

    :goto_0
    if-nez v3, :cond_2

    iget-boolean v2, v2, Ln20/p;->g:Z

    if-nez v2, :cond_2

    move v4, v5

    :cond_2
    if-nez v4, :cond_3

    new-instance p1, Lh20/a4;

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "FlowController is not configured, or has a configuration update in flight."

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v0}, Lh20/a4;-><init>(Ljava/lang/Throwable;)V

    invoke-interface {v1, p1}, Lh20/c4;->a(Lh20/b4;)V

    return-void

    :cond_3
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
