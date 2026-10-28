.class public final Lmj/p;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lcom/amplitude/android/engagement/a;

.field public final b:Lcom/amplitude/android/engagement/types/Nudge;

.field public c:I

.field public final d:Luj/m;

.field public final e:Lmj/a;

.field public f:Z

.field public g:Ljava/lang/ref/WeakReference;

.field public final h:Lmj/l;

.field public i:Landroidx/compose/ui/platform/ComposeView;

.field public j:Landroid/view/ViewGroup;

.field public final k:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lcom/amplitude/android/engagement/a;Lcom/amplitude/android/engagement/types/Nudge;ILuj/m;Lmj/a;)V
    .locals 1

    sget-object v0, Lhj/u;->w:Lhj/u;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lmj/p;->a:Lcom/amplitude/android/engagement/a;

    iput-object p2, p0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    iput p3, p0, Lmj/p;->c:I

    iput-object p4, p0, Lmj/p;->d:Luj/m;

    iput-object p5, p0, Lmj/p;->e:Lmj/a;

    new-instance p1, Lmj/l;

    invoke-direct {p1, p0}, Lmj/l;-><init>(Lmj/p;)V

    iput-object p1, p0, Lmj/p;->h:Lmj/l;

    invoke-virtual {v0}, Lhj/u;->a()Landroid/app/Activity;

    move-result-object p2

    if-eqz p2, :cond_0

    new-instance p3, Ljava/lang/ref/WeakReference;

    invoke-direct {p3, p2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const/4 p3, 0x0

    :goto_0
    iput-object p3, p0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    sget-object p2, Lhj/u;->y:Ljava/util/HashSet;

    invoke-virtual {p2, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lmj/p;->k:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 3

    iget-boolean v0, p0, Lmj/p;->f:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "NudgeViewManager#dispose -- already disposed! variantId="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v2, p0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v2}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return-void

    :cond_0
    invoke-virtual {p0}, Lmj/p;->d()V

    iget-object v0, p0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->clear()V

    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    iput-object v0, p0, Lmj/p;->j:Landroid/view/ViewGroup;

    iput-object v0, p0, Lmj/p;->i:Landroidx/compose/ui/platform/ComposeView;

    iget-object v0, p0, Lmj/p;->k:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    sget-object v0, Lhj/u;->w:Lhj/u;

    iget-object v0, p0, Lmj/p;->h:Lmj/l;

    sget-object v1, Lhj/u;->y:Ljava/util/HashSet;

    invoke-virtual {v1, v0}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmj/p;->f:Z

    return-void
.end method

.method public final b(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lmj/m;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmj/m;

    iget v1, v0, Lmj/m;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmj/m;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lmj/m;

    invoke-direct {v0, p0, p2}, Lmj/m;-><init>(Lmj/p;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lmj/m;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lmj/m;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    const/4 v2, 0x0

    if-eqz p2, :cond_3

    invoke-virtual {p2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/Activity;

    goto :goto_1

    :cond_3
    move-object p2, v2

    :goto_1
    if-eqz p2, :cond_6

    iput v3, v0, Lmj/m;->y:I

    sget-object v3, Lnj/c;->a:[Lj93/z;

    sget-object v3, Lbc3/q0;->a:Lkc3/e;

    sget-object v3, Lhc3/o;->a:Lbc3/w1;

    new-instance v4, Landroidx/room/e;

    const/16 v5, 0x1b

    invoke-direct {v4, p2, p1, v2, v5}, Landroidx/room/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v3, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_2
    check-cast p2, Ljava/util/List;

    if-nez p2, :cond_5

    goto :goto_3

    :cond_5
    return-object p2

    :cond_6
    :goto_3
    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1
.end method

.method public final c()V
    .locals 7

    iget-boolean v0, p0, Lmj/p;->f:Z

    if-eqz v0, :cond_0

    sget-object v0, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    const-string v1, "NudgeViewManager used after being disposed"

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/crypto/tink/internal/l0;->m0([Ljava/lang/Object;)V

    return-void

    :cond_0
    iget-object v0, p0, Lmj/p;->g:Ljava/lang/ref/WeakReference;

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/Activity;

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_2

    return-void

    :cond_2
    sget-object v2, Lmj/r;->a:Lp1/u2;

    const v2, 0x1020002

    invoke-virtual {v0, v2}, Landroid/app/Activity;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/view/ViewGroup;

    :goto_1
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v3

    instance-of v4, v3, Landroid/view/ViewGroup;

    if-eqz v4, :cond_3

    check-cast v3, Landroid/view/ViewGroup;

    goto :goto_2

    :cond_3
    move-object v3, v1

    :goto_2
    if-eqz v3, :cond_4

    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v2

    const-string v3, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Landroid/view/ViewGroup;

    goto :goto_1

    :cond_4
    new-instance v3, Landroidx/compose/ui/platform/ComposeView;

    const/4 v4, 0x6

    invoke-direct {v3, v0, v1, v4}, Landroidx/compose/ui/platform/ComposeView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    new-instance v1, Lmj/o;

    const/4 v4, 0x3

    invoke-direct {v1, p0, v4}, Lmj/o;-><init>(Lmj/p;I)V

    new-instance v4, Lx1/b;

    const/4 v5, 0x1

    const v6, 0xe01ca1d

    invoke-direct {v4, v1, v5, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v3, v4}, Landroidx/compose/ui/platform/ComposeView;->setContent(Lc93/m;)V

    invoke-virtual {p0}, Lmj/p;->d()V

    new-instance v1, Lvj/a;

    invoke-direct {v1, v2, v0}, Lvj/a;-><init>(Landroid/view/ViewGroup;Landroid/app/Activity;)V

    iget-object v0, v1, Lvj/a;->w:Lpb/e;

    iget-object v4, v0, Lpb/e;->b:Lpb/d;

    iget-object v4, v4, Lpb/d;->a:Lrb/a;

    iget-boolean v4, v4, Lrb/a;->g:Z

    if-nez v4, :cond_5

    iget-object v4, v1, Lvj/a;->x:Landroid/os/Bundle;

    invoke-virtual {v0, v4}, Lpb/e;->a(Landroid/os/Bundle;)V

    sget-object v0, Landroidx/lifecycle/v;->ON_CREATE:Landroidx/lifecycle/v;

    iget-object v4, v1, Lvj/a;->z:Landroidx/lifecycle/i0;

    invoke-virtual {v4, v0}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    sget-object v0, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    invoke-virtual {v4, v0}, Landroidx/lifecycle/i0;->g(Landroidx/lifecycle/v;)V

    :cond_5
    invoke-static {v2}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    iget-object v4, v1, Lvj/a;->y:Landroid/view/View;

    if-nez v0, :cond_7

    invoke-static {v4}, Landroidx/lifecycle/o1;->g(Landroid/view/View;)Landroidx/lifecycle/g0;

    move-result-object v0

    if-nez v0, :cond_6

    move-object v0, v1

    :cond_6
    invoke-static {v2, v0}, Landroidx/lifecycle/o1;->n(Landroid/view/View;Landroidx/lifecycle/g0;)V

    :cond_7
    invoke-static {v2}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object v0

    if-nez v0, :cond_9

    invoke-static {v4}, Landroidx/lifecycle/o1;->h(Landroid/view/View;)Landroidx/lifecycle/f2;

    move-result-object v0

    if-nez v0, :cond_8

    move-object v0, v1

    :cond_8
    invoke-static {v2, v0}, Landroidx/lifecycle/o1;->o(Landroid/view/View;Landroidx/lifecycle/f2;)V

    :cond_9
    invoke-static {v2}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object v0

    if-nez v0, :cond_b

    invoke-static {v4}, Lts/o;->t(Landroid/view/View;)Lpb/f;

    move-result-object v0

    if-nez v0, :cond_a

    move-object v0, v1

    :cond_a
    invoke-static {v2, v0}, Lts/o;->G(Landroid/view/View;Lpb/f;)V

    :cond_b
    invoke-static {v2}, Landroidx/room/c1;->t(Landroid/view/View;)Lg/b0;

    move-result-object v0

    if-nez v0, :cond_d

    invoke-static {v4}, Landroidx/room/c1;->t(Landroid/view/View;)Lg/b0;

    move-result-object v0

    if-nez v0, :cond_c

    goto :goto_3

    :cond_c
    move-object v1, v0

    :goto_3
    invoke-static {v2, v1}, Landroidx/room/c1;->M(Landroid/view/View;Lg/b0;)V

    :cond_d
    invoke-virtual {v2, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    iput-object v2, p0, Lmj/p;->j:Landroid/view/ViewGroup;

    iput-object v3, p0, Lmj/p;->i:Landroidx/compose/ui/platform/ComposeView;

    return-void
.end method

.method public final d()V
    .locals 4

    iget-object v0, p0, Lmj/p;->i:Landroidx/compose/ui/platform/ComposeView;

    if-eqz v0, :cond_1

    sget-object v1, Lcom/amplitude/android/engagement/a;->o:Lcom/google/crypto/tink/internal/l0;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "NudgeViewManager#unmounting -- variantId="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, p0, Lmj/p;->b:Lcom/amplitude/android/engagement/types/Nudge;

    invoke-virtual {v3}, Lcom/amplitude/android/engagement/types/Nudge;->getVariantId()I

    move-result v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/google/crypto/tink/internal/l0;->I([Ljava/lang/Object;)V

    iget-object v1, p0, Lmj/p;->j:Landroid/view/ViewGroup;

    if-eqz v1, :cond_0

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_0
    const/4 v0, 0x0

    iput-object v0, p0, Lmj/p;->i:Landroidx/compose/ui/platform/ComposeView;

    iput-object v0, p0, Lmj/p;->j:Landroid/view/ViewGroup;

    :cond_1
    return-void
.end method
