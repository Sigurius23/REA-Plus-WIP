.class public final Lt30/n;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# instance fields
.field public final E:Lq30/k;

.field public final F:Lr30/j;

.field public final G:Lq30/n0;

.field public H:Lr30/e;

.field public final I:Ll83/p;

.field public final J:Landroidx/lifecycle/y1;

.field public final K:Ll83/p;

.field public L:Lk30/b;

.field public final M:Ll83/p;

.field public final N:Ll83/p;

.field public final O:Ll83/p;

.field public final P:Ll83/p;

.field public final Q:Ll83/p;

.field public final w:Lm30/h;

.field public final x:Lq30/g0;

.field public final y:Lq30/v0;

.field public final z:Ln30/d;


# direct methods
.method public constructor <init>(Lm30/h;Lq30/g0;Lq30/v0;Ln30/d;Lq30/k;Lr30/j;Lq30/n0;)V
    .locals 1

    const-string v0, "uiCustomization"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "transactionTimer"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorRequestExecutor"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "errorReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeActionHandler"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "intentData"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x7f0d064b

    invoke-direct {p0, v0}, Landroidx/fragment/app/m0;-><init>(I)V

    iput-object p1, p0, Lt30/n;->w:Lm30/h;

    iput-object p2, p0, Lt30/n;->x:Lq30/g0;

    iput-object p3, p0, Lt30/n;->y:Lq30/v0;

    iput-object p4, p0, Lt30/n;->z:Ln30/d;

    iput-object p5, p0, Lt30/n;->E:Lq30/k;

    iput-object p6, p0, Lt30/n;->F:Lr30/j;

    iput-object p7, p0, Lt30/n;->G:Lq30/n0;

    new-instance p1, Lt30/j;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->I:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    const-class p2, Lt30/g;

    sget-object p3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p3, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    new-instance p3, Lt30/m;

    const/4 p4, 0x0

    invoke-direct {p3, p0, p4}, Lt30/m;-><init>(Lt30/n;I)V

    new-instance p4, Lt30/m;

    const/4 p5, 0x1

    invoke-direct {p4, p0, p5}, Lt30/m;-><init>(Lt30/n;I)V

    new-instance p5, Landroidx/lifecycle/y1;

    invoke-direct {p5, p2, p3, p1, p4}, Landroidx/lifecycle/y1;-><init>(Lj93/d;Lc93/a;Lc93/a;Lc93/a;)V

    iput-object p5, p0, Lt30/n;->J:Landroidx/lifecycle/y1;

    new-instance p1, Lt30/j;

    const/4 p2, 0x4

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->K:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->M:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->N:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x7

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->O:Ll83/p;

    new-instance p1, Lt30/j;

    const/16 p2, 0x8

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->P:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object p1

    iput-object p1, p0, Lt30/n;->Q:Ll83/p;

    new-instance p1, Lt30/j;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lt30/j;-><init>(Lt30/n;I)V

    invoke-static {p1}, Lq83/g;->H(Lc93/a;)Ll83/p;

    return-void
.end method


# virtual methods
.method public final A()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lt30/n;->H:Lr30/e;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lr30/e;->E:Lr30/j;

    if-nez v0, :cond_0

    const/4 v0, -0x1

    goto :goto_0

    :cond_0
    sget-object v1, Lt30/l;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    :goto_0
    const/4 v1, 0x1

    if-eq v0, v1, :cond_3

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x3

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const-string v0, ""

    return-object v0

    :cond_1
    iget-object v0, p0, Lt30/n;->Q:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/v;

    invoke-virtual {v0}, Lt30/v;->getUserEntry()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_2
    iget-object v0, p0, Lt30/n;->P:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/t;

    invoke-virtual {v0}, Lt30/t;->getUserEntry()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_3
    iget-object v0, p0, Lt30/n;->O:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/u;

    invoke-virtual {v0}, Lt30/u;->getUserEntry()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_4
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method public final B()Lk30/b;
    .locals 2

    iget-object v0, p0, Lt30/n;->L:Lk30/b;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Required value was null."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final C()Lt30/g;
    .locals 1

    iget-object v0, p0, Lt30/n;->J:Landroidx/lifecycle/y1;

    invoke-virtual {v0}, Landroidx/lifecycle/y1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lt30/g;

    return-object v0
.end method

.method public final onDestroyView()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lt30/n;->L:Lk30/b;

    return-void
.end method

.method public final onPause()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onPause()V

    iget-object v0, p0, Lt30/n;->H:Lr30/e;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    sget-object v0, Lr30/j;->y:Lng3/o;

    return-void

    :cond_0
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final onResume()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    iget-object v0, p0, Lt30/n;->H:Lr30/e;

    if-eqz v0, :cond_1

    if-eqz v0, :cond_0

    sget-object v0, Lr30/j;->y:Lng3/o;

    return-void

    :cond_0
    const-string v0, "cresData"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0

    :cond_1
    return-void
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 10

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    const-string v1, "arg_cres"

    const-class v2, Lr30/e;

    invoke-static {p2, v2, v1}, Ldt/b;->u(Landroid/os/Bundle;Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr30/e;

    goto :goto_0

    :cond_0
    move-object p2, v0

    :goto_0
    if-nez p2, :cond_1

    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Could not start challenge screen. Challenge response data was null."

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lt30/n;->C()Lt30/g;

    move-result-object p2

    new-instance v0, Lq30/x;

    iget-object v1, p0, Lt30/n;->F:Lr30/j;

    iget-object v2, p0, Lt30/n;->G:Lq30/n0;

    invoke-direct {v0, p1, v1, v2}, Lq30/x;-><init>(Ljava/lang/Throwable;Lr30/j;Lq30/n0;)V

    iget-object p1, p2, Lt30/g;->I:Landroidx/lifecycle/u0;

    invoke-virtual {p1, v0}, Landroidx/lifecycle/u0;->postValue(Ljava/lang/Object;)V

    return-void

    :cond_1
    iput-object p2, p0, Lt30/n;->H:Lr30/e;

    const p2, 0x7f0a020d

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    if-eqz v1, :cond_2e

    const p2, 0x7f0a020e

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    if-eqz v2, :cond_2e

    const p2, 0x7f0a020f

    invoke-static {p1, p2}, Ltx/f;->J(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    if-eqz v3, :cond_2e

    new-instance p2, Lk30/b;

    check-cast p1, Landroid/widget/ScrollView;

    invoke-direct {p2, p1, v1, v2, v3}, Lk30/b;-><init>(Landroid/widget/ScrollView;Lcom/stripe/android/stripe3ds2/views/BrandZoneView;Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;Lcom/stripe/android/stripe3ds2/views/InformationZoneView;)V

    iput-object p2, p0, Lt30/n;->L:Lk30/b;

    invoke-virtual {p0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    iget-object p1, p1, Lt30/g;->K:Landroidx/lifecycle/u0;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p2

    new-instance v1, Lt30/i;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lt30/i;-><init>(Lt30/n;I)V

    new-instance v2, Lt30/d;

    const/4 v3, 0x1

    invoke-direct {v2, v1, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    iget-object p1, p1, Lt30/g;->F:Landroidx/lifecycle/u0;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p2

    new-instance v1, Lt30/i;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lt30/i;-><init>(Lt30/n;I)V

    new-instance v2, Lt30/d;

    invoke-direct {v2, v1, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lt30/n;->C()Lt30/g;

    move-result-object p1

    iget-object p1, p1, Lt30/g;->M:Lt30/f;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p2

    new-instance v1, Lt30/i;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lt30/i;-><init>(Lt30/n;I)V

    new-instance v2, Lt30/d;

    invoke-direct {v2, v1, v3}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p1, p2, v2}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    invoke-virtual {p0}, Lt30/n;->B()Lk30/b;

    move-result-object p1

    iget-object p1, p1, Lk30/b;->b:Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;->getIssuerImageView$3ds2sdk_release()Landroid/widget/ImageView;

    move-result-object p2

    iget-object v1, p0, Lt30/n;->H:Lr30/e;

    const-string v2, "cresData"

    if-eqz v1, :cond_2d

    iget-object v1, v1, Lr30/e;->O:Lr30/d;

    new-instance v3, Ll83/k;

    invoke-direct {v3, p2, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;->getPaymentSystemImageView$3ds2sdk_release()Landroid/widget/ImageView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_2c

    iget-object p2, p2, Lr30/e;->U:Lr30/d;

    new-instance v1, Ll83/k;

    invoke-direct {v1, p1, p2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v1}, [Ll83/k;

    move-result-object p1

    invoke-static {p1}, Lm83/g0;->Y([Ll83/k;)Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/util/Map$Entry;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/ImageView;

    invoke-interface {p2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lr30/d;

    invoke-virtual {p0}, Lt30/n;->C()Lt30/g;

    move-result-object v3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v4

    iget v4, v4, Landroid/util/DisplayMetrics;->densityDpi:I

    new-instance v5, Ll1/v0;

    invoke-direct {v5, v3, p2, v4, v0}, Ll1/v0;-><init>(Lt30/g;Lr30/d;ILq83/d;)V

    sget-object p2, Lq83/k;->w:Lq83/k;

    invoke-static {p2, v5}, Landroidx/lifecycle/x1;->c(Lq83/j;Lc93/m;)Landroidx/lifecycle/j;

    move-result-object p2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v3

    new-instance v4, Lrq0/x;

    const/16 v5, 0x11

    invoke-direct {v4, v1, v5}, Lrq0/x;-><init>(Ljava/lang/Object;I)V

    new-instance v1, Lt30/d;

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5}, Lt30/d;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {p2, v3, v1}, Landroidx/lifecycle/p0;->observe(Landroidx/lifecycle/g0;Landroidx/lifecycle/v0;)V

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lt30/n;->O:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lt30/u;

    iget-object p2, p0, Lt30/n;->P:Ll83/p;

    invoke-virtual {p2}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lt30/t;

    iget-object v1, p0, Lt30/n;->Q:Ll83/p;

    invoke-virtual {v1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lt30/v;

    iget-object v3, p0, Lt30/n;->H:Lr30/e;

    if-eqz v3, :cond_2b

    iget-object v3, v3, Lr30/e;->E:Lr30/j;

    if-nez v3, :cond_3

    const/4 v3, -0x1

    goto :goto_2

    :cond_3
    sget-object v4, Lt30/l;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    :goto_2
    const/4 v4, 0x1

    const/16 v5, 0x8

    iget-object v6, p0, Lt30/n;->w:Lm30/h;

    const/4 v7, 0x0

    if-eq v3, v4, :cond_9

    const/4 p1, 0x2

    if-eq v3, p1, :cond_7

    const/4 p1, 0x3

    if-eq v3, p1, :cond_7

    const/4 p1, 0x4

    if-eq v3, p1, :cond_6

    const/4 p1, 0x5

    if-eq v3, p1, :cond_4

    goto/16 :goto_3

    :cond_4
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_5

    iget-object p2, p2, Lr30/e;->T:Ljava/lang/String;

    sget-object v1, Lm30/j;->x:Lm30/j;

    invoke-virtual {v6, v1}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->b(Ljava/lang/String;Lm30/b;)V

    goto/16 :goto_3

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_6
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v0, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->a(Ljava/lang/String;Lm30/e;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, v0, v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->b(Ljava/lang/String;Lm30/b;)V

    new-instance p1, Lt30/k;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lt30/k;-><init>(Lt30/n;I)V

    invoke-virtual {v1, p1}, Lt30/v;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    iget-object p1, p0, Lt30/n;->N:Ll83/p;

    invoke-virtual {p1}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/stripe/android/stripe3ds2/views/BrandZoneView;

    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_3

    :cond_7
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_8

    iget-object p2, p2, Lr30/e;->X:Ljava/lang/String;

    sget-object v1, Lm30/j;->y:Lm30/j;

    invoke-virtual {v6, v1}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->b(Ljava/lang/String;Lm30/b;)V

    goto :goto_3

    :cond_8
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_9
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setChallengeEntryView(Landroid/view/View;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_2a

    iget-object p2, p2, Lr30/e;->X:Ljava/lang/String;

    sget-object v1, Lm30/j;->w:Lm30/j;

    invoke-virtual {v6, v1}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v1

    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->b(Ljava/lang/String;Lm30/b;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_29

    iget-object p2, p2, Lr30/e;->V:Ljava/lang/String;

    sget-object v1, Lm30/j;->E:Lm30/j;

    invoke-virtual {v6, v1}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v1

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->E:Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;

    if-eqz p2, :cond_b

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_a

    goto :goto_3

    :cond_a
    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    invoke-virtual {p1, v1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;->setButtonCustomization(Lm30/b;)V

    :cond_b
    :goto_3
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_28

    iget-object p2, p2, Lr30/e;->G:Ljava/lang/String;

    iget-object v1, v6, Lm30/h;->x:Lm30/e;

    iget-object v3, v6, Lm30/h;->x:Lm30/e;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;

    if-eqz p2, :cond_d

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_4

    :cond_c
    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;->d(Ljava/lang/String;Lm30/e;)V

    goto :goto_5

    :cond_d
    :goto_4
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    :goto_5
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_27

    iget-object p2, p2, Lr30/e;->I:Ljava/lang/String;

    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->a(Ljava/lang/String;Lm30/e;)V

    iget-object p1, p0, Lt30/n;->H:Lr30/e;

    if-eqz p1, :cond_26

    iget-object p1, p1, Lr30/e;->E:Lr30/j;

    sget-object p2, Lr30/j;->G:Lr30/j;

    if-ne p1, p2, :cond_11

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_10

    iget-object p2, p2, Lr30/e;->H:Ljava/lang/String;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->y:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    if-eqz p2, :cond_f

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_e

    goto :goto_6

    :cond_e
    invoke-virtual {p1, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    goto :goto_7

    :cond_f
    :goto_6
    invoke-virtual {p1, v5}, Landroid/view/View;->setVisibility(I)V

    goto :goto_7

    :cond_10
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_11
    :goto_7
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_25

    iget-boolean p2, p2, Lr30/e;->K:Z

    if-eqz p2, :cond_12

    const p2, 0x7f080797

    goto :goto_8

    :cond_12
    move p2, v7

    :goto_8
    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setInfoTextIndicator(I)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_24

    iget-object p2, p2, Lr30/e;->Y:Ljava/lang/String;

    sget-object v4, Lm30/j;->F:Lm30/j;

    invoke-virtual {v6, v4}, Lm30/h;->b(Lm30/j;)Lm30/b;

    move-result-object v4

    iget-object v5, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->F:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    iget-object p1, p1, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->G:Landroid/widget/RadioGroup;

    if-eqz p2, :cond_1c

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-eqz v8, :cond_13

    goto/16 :goto_d

    :cond_13
    invoke-virtual {v5, p2, v1}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    if-eqz v4, :cond_1b

    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    move-result p2

    invoke-static {v7, p2}, Le93/b;->i0(II)Li93/j;

    move-result-object p2

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p2}, Li93/h;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_14
    :goto_9
    move-object v8, p2

    check-cast v8, Li93/i;

    iget-boolean v8, v8, Li93/i;->y:Z

    if-eqz v8, :cond_16

    move-object v8, p2

    check-cast v8, Lm83/e0;

    invoke-virtual {v8}, Lm83/e0;->nextInt()I

    move-result v8

    invoke-virtual {p1, v8}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    instance-of v9, v8, Landroid/widget/RadioButton;

    if-eqz v9, :cond_15

    check-cast v8, Landroid/widget/RadioButton;

    goto :goto_a

    :cond_15
    move-object v8, v0

    :goto_a
    if-eqz v8, :cond_14

    invoke-virtual {v1, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_9

    :cond_16
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_17
    :goto_b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1b

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/widget/RadioButton;

    move-object v8, v4

    check-cast v8, Lm30/d;

    iget-object v8, v8, Lm30/d;->z:Ljava/lang/String;

    if-eqz v8, :cond_19

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_18

    goto :goto_c

    :cond_18
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-static {v8}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v8

    invoke-virtual {v1, v8}, Landroid/widget/CompoundButton;->setButtonTintList(Landroid/content/res/ColorStateList;)V

    :cond_19
    :goto_c
    move-object v8, v4

    check-cast v8, Lm30/a;

    iget-object v8, v8, Lm30/a;->x:Ljava/lang/String;

    if-eqz v8, :cond_17

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v9

    if-eqz v9, :cond_1a

    goto :goto_b

    :cond_1a
    invoke-static {v8}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v8

    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setTextColor(I)V

    goto :goto_b

    :cond_1b
    invoke-virtual {v5, v7}, Landroid/view/View;->setVisibility(I)V

    invoke-virtual {p1, v7}, Landroid/view/View;->setVisibility(I)V

    :cond_1c
    :goto_d
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    new-instance p2, Lt30/k;

    const/4 v1, 0x1

    invoke-direct {p2, p0, v1}, Lt30/k;-><init>(Lt30/n;I)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setSubmitButtonClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object p1

    new-instance p2, Lt30/k;

    const/4 v1, 0x2

    invoke-direct {p2, p0, v1}, Lt30/k;-><init>(Lt30/n;I)V

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->setResendButtonClickListener(Landroid/view/View$OnClickListener;)V

    invoke-virtual {p0}, Lt30/n;->B()Lk30/b;

    move-result-object p1

    iget-object p1, p1, Lk30/b;->d:Lcom/stripe/android/stripe3ds2/views/InformationZoneView;

    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_23

    iget-object v1, p2, Lr30/e;->Z:Ljava/lang/String;

    iget-object p2, p2, Lr30/e;->a0:Ljava/lang/String;

    if-eqz v1, :cond_1e

    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_1d

    goto :goto_e

    :cond_1d
    iget-object v4, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->w:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {v4, v1, v3}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->y:Landroid/widget/LinearLayout;

    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->x:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {v1, p2, v3}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    :cond_1e
    :goto_e
    iget-object p2, p0, Lt30/n;->H:Lr30/e;

    if-eqz p2, :cond_22

    iget-object v0, p2, Lr30/e;->M:Ljava/lang/String;

    iget-object p2, p2, Lr30/e;->N:Ljava/lang/String;

    if-eqz v0, :cond_20

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_f

    :cond_1f
    iget-object v1, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->E:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {v1, v0, v3}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    iget-object v0, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->G:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p1, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->F:Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;

    invoke-virtual {v0, p2, v3}, Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;->d(Ljava/lang/String;Lm30/e;)V

    :cond_20
    :goto_f
    iget-object p2, v6, Lm30/h;->F:Ljava/lang/String;

    if-eqz p2, :cond_21

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/stripe/android/stripe3ds2/views/InformationZoneView;->setToggleColor$3ds2sdk_release(I)V

    :cond_21
    return-void

    :cond_22
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_23
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_24
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_25
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_26
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_27
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_28
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_29
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2a
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2b
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2c
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2d
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_2e
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final y()Lq30/h;
    .locals 4

    iget-object v0, p0, Lt30/n;->H:Lr30/e;

    const-string v1, "cresData"

    const/4 v2, 0x0

    if-eqz v0, :cond_6

    iget-object v0, v0, Lr30/e;->Y:Ljava/lang/String;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lt30/n;->z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    move-result-object v0

    invoke-virtual {v0}, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;->getWhitelistingSelection$3ds2sdk_release()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :cond_1
    :goto_0
    move-object v0, v2

    :goto_1
    iget-object v3, p0, Lt30/n;->H:Lr30/e;

    if-eqz v3, :cond_5

    iget-object v1, v3, Lr30/e;->E:Lr30/j;

    if-nez v1, :cond_2

    const/4 v1, -0x1

    goto :goto_2

    :cond_2
    sget-object v2, Lt30/l;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    :goto_2
    const/4 v2, 0x4

    if-eq v1, v2, :cond_4

    const/4 v2, 0x5

    if-eq v1, v2, :cond_3

    new-instance v1, Lq30/e;

    invoke-virtual {p0}, Lt30/n;->A()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v2, v0}, Lq30/e;-><init>(Ljava/lang/String;Ljava/lang/Boolean;)V

    return-object v1

    :cond_3
    new-instance v1, Lq30/f;

    invoke-direct {v1, v0}, Lq30/f;-><init>(Ljava/lang/Boolean;)V

    return-object v1

    :cond_4
    new-instance v0, Lq30/d;

    invoke-virtual {p0}, Lt30/n;->A()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lq30/d;-><init>(Ljava/lang/String;)V

    return-object v0

    :cond_5
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2

    :cond_6
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v2
.end method

.method public final z()Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;
    .locals 1

    iget-object v0, p0, Lt30/n;->M:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;

    return-object v0
.end method
