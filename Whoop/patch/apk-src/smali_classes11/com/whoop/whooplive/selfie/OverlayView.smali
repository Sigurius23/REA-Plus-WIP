.class public Lcom/whoop/whooplive/selfie/OverlayView;
.super Landroid/widget/ViewFlipper;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/whooplive/selfie/OverlayView$a;,
        Lcom/whoop/whooplive/selfie/OverlayView$b;
    }
.end annotation


# instance fields
.field private E:I

.field private F:I

.field private G:I

.field private H:I

.field private I:I

.field private J:Ltr2/n;

.field private K:Lcom/whoop/service/network/model/cycles/Cycle;

.field private L:Luz2/b;

.field private M:Z

.field private N:Z

.field private O:Z

.field private P:Ljava/lang/String;

.field private Q:Ljava/lang/String;

.field private R:Ljava/lang/String;

.field private S:Ljava/lang/String;

.field private T:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private U:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private V:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private W:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field

.field private a0:Z

.field private b0:Z

.field private c0:Ljava/lang/Integer;

.field private d0:Lbh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/b;"
        }
    .end annotation
.end field

.field private e0:Lbh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lbh3/b;"
        }
    .end annotation
.end field

.field private w:Lmh3/c;

.field private x:Lcom/whoop/whooplive/selfie/OverlayView$b;

.field private y:Landroid/view/GestureDetector;

.field private z:Lcom/whoop/whooplive/selfie/OverlayView$a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    invoke-direct {p0, p1, p2}, Landroid/widget/ViewFlipper;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    new-instance p1, Lmh3/c;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    new-instance p1, Lcom/whoop/whooplive/selfie/OverlayView$a;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lcom/whoop/whooplive/selfie/OverlayView$a;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->z:Lcom/whoop/whooplive/selfie/OverlayView$a;

    sget-object p1, Luz2/a;->DARK:Luz2/a;

    const/4 v0, 0x1

    invoke-static {p1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-static {p1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->U:Llh3/b;

    const-string p1, ""

    invoke-static {p1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    sget-object p1, Lrz2/a;->Normal:Lrz2/a;

    invoke-static {p1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->W:Llh3/b;

    iput-boolean p2, p0, Lcom/whoop/whooplive/selfie/OverlayView;->a0:Z

    iput-boolean v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->b0:Z

    new-instance p1, Luz2/c;

    const/4 p2, 0x2

    invoke-direct {p1, p0, p2}, Luz2/c;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->d0:Lbh3/b;

    new-instance p1, Luz2/c;

    const/4 p2, 0x3

    invoke-direct {p1, p0, p2}, Luz2/c;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->e0:Lbh3/b;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->m()V

    return-void
.end method

.method private A()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->K:Lcom/whoop/service/network/model/cycles/Cycle;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Luz2/a;->TINTED:Luz2/a;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->d:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->l:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    return-void

    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->K:Lcom/whoop/service/network/model/cycles/Cycle;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Cycle;->getRecovery()Lcom/whoop/service/network/model/cycles/Recovery;

    move-result-object v1

    invoke-static {v0, v1}, Lxz2/b;->b(Landroid/content/Context;Lcom/whoop/service/network/model/cycles/Recovery;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/OverlayView$b;->d:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v1}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/OverlayView$b;->l:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v1}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/whoop/ui/ProgressDial;->setFillColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->H:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillStartColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->I:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillEndColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->H:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillStartColor(I)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v0}, Lcom/whoop/ui/ProgressDialLayout;->getProgressDial()Lcom/whoop/ui/ProgressDial;

    move-result-object v0

    iget v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->I:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/ProgressDial;->setFillEndColor(I)V

    :cond_1
    return-void
.end method

.method private B()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->W:Llh3/b;

    invoke-virtual {v1}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lrz2/a;

    invoke-virtual {v0, v1}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->i(Lrz2/a;)V

    return-void
.end method

.method private C(Luz2/a;)V
    .locals 1

    sget-object v0, Luz2/a;->TINTED:Luz2/a;

    if-ne p1, v0, :cond_2

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    sget-object v0, Luz2/b;->RECOVERY:Luz2/b;

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->K:Lcom/whoop/service/network/model/cycles/Cycle;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->K:Lcom/whoop/service/network/model/cycles/Cycle;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Cycle;->getRecovery()Lcom/whoop/service/network/model/cycles/Recovery;

    move-result-object v0

    invoke-static {p1, v0}, Lxz2/b;->b(Landroid/content/Context;Lcom/whoop/service/network/model/cycles/Recovery;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    sget-object v0, Luz2/b;->SLEEP:Luz2/b;

    if-ne p1, v0, :cond_1

    iget p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->G:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    goto :goto_0

    :cond_1
    iget p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->F:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    goto :goto_0

    :cond_2
    iget p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    :goto_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->U:Llh3/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/whooplive/selfie/OverlayView;Luz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->p(Luz2/a;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/whooplive/selfie/OverlayView;Lrz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->q(Lrz2/a;)V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/whooplive/selfie/OverlayView;Ljava/lang/Float;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->o(Ljava/lang/Float;)V

    return-void
.end method

.method public static synthetic d(Lcom/whoop/whooplive/selfie/OverlayView;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->n(Landroid/util/Pair;)V

    return-void
.end method

.method public static bridge synthetic e(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/whoop/whooplive/selfie/OverlayView;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->W:Llh3/b;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/whoop/whooplive/selfie/OverlayView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->a0:Z

    return p0
.end method

.method public static bridge synthetic h(Lcom/whoop/whooplive/selfie/OverlayView;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->r()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic i(Lcom/whoop/whooplive/selfie/OverlayView;)Z
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->s()Z

    move-result p0

    return p0
.end method

.method public static bridge synthetic j(Lcom/whoop/whooplive/selfie/OverlayView;Luz2/a;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->C(Luz2/a;)V

    return-void
.end method

.method private m()V
    .locals 4

    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/a;->b:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->F:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/a;->e:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->G:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnf1/b;->c:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->H:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lnf1/b;->b:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->I:I

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/a;->u:I

    invoke-static {v1, v2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result v1

    iput v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->E:I

    const-string v1, "OverlayView"

    invoke-static {v1}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->J:Ltr2/n;

    new-instance v1, Landroid/view/GestureDetector;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->z:Lcom/whoop/whooplive/selfie/OverlayView$a;

    invoke-direct {v1, v2, v3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->y:Landroid/view/GestureDetector;

    sget v1, Lpz2/g;->h:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->P:Ljava/lang/String;

    sget v1, Lpz2/g;->f:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->Q:Ljava/lang/String;

    sget v1, Lpz2/g;->g:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->R:Ljava/lang/String;

    sget v1, Lpz2/g;->e:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->S:Ljava/lang/String;

    return-void
.end method

.method private synthetic n(Landroid/util/Pair;)V
    .locals 5

    iget-object v0, p1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object p1, p1, Landroid/util/Pair;->second:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v3

    instance-of v4, v3, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    if-nez v4, :cond_0

    goto :goto_1

    :cond_0
    check-cast v3, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->u()Z

    move-result v4

    if-nez v4, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v3, v0, p1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->x(II)V

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private synthetic o(Ljava/lang/Float;)V
    .locals 4

    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_2

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v2

    instance-of v3, v2, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    if-nez v3, :cond_0

    goto :goto_1

    :cond_0
    check-cast v2, Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->u()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result v3

    invoke-virtual {v2, v3}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->y(F)V

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method private synthetic p(Luz2/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->A()V

    return-void
.end method

.method private synthetic q(Lrz2/a;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->B()V

    return-void
.end method

.method private r()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    sget-object v1, Luz2/b;->LIVE:Luz2/b;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method private s()Z
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    sget-object v1, Luz2/b;->STRAIN:Luz2/b;

    if-eq v0, v1, :cond_1

    sget-object v1, Luz2/b;->RECOVERY:Luz2/b;

    if-eq v0, v1, :cond_1

    sget-object v1, Luz2/b;->SLEEP:Luz2/b;

    if-ne v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    return v0

    :cond_1
    :goto_0
    const/4 v0, 0x1

    return v0
.end method

.method private setOverlayViews(Lcom/whoop/service/network/model/cycles/Cycle;)V
    .locals 5

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Cycle;->getStrain()Lcom/whoop/service/network/model/cycles/Strain;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/OverlayView;->J:Ltr2/n;

    const-string v3, "Loading strain"

    new-array v4, v1, [Lqr2/a$a;

    invoke-interface {v2, v3, v4}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Cycle;->getStrain()Lcom/whoop/service/network/model/cycles/Strain;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/service/network/model/cycles/Strain;->getScorePercent()D

    move-result-wide v2

    double-to-float v2, v2

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v3, v2}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v3, v2}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Strain;->getScore()D

    move-result-wide v2

    invoke-static {v2, v3}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->j:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->c:Landroid/widget/TextView;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    invoke-virtual {v2, v0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->c(Lcom/whoop/service/network/model/cycles/Strain;)V

    :cond_0
    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Cycle;->getRecovery()Lcom/whoop/service/network/model/cycles/Recovery;

    move-result-object v0

    const-string v2, "Loading recovery"

    if-eqz v0, :cond_1

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Recovery;->hasScore()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Recovery;->getActivityState()Lcom/whoop/domain/model/ActivityState;

    move-result-object v3

    sget-object v4, Lcom/whoop/domain/model/ActivityState;->INCOMPLETE:Lcom/whoop/domain/model/ActivityState;

    if-eq v3, v4, :cond_1

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Recovery;->isCurrentlyBlackedOut()Z

    move-result v3

    if-nez v3, :cond_1

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->J:Ltr2/n;

    new-array v4, v1, [Lqr2/a$a;

    invoke-interface {v3, v2, v4}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Recovery;->getScore()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x42c80000    # 100.0f

    div-float/2addr v3, v4

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v4, v4, Lcom/whoop/whooplive/selfie/OverlayView$b;->l:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v4, v3}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    iget-object v4, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v4, v4, Lcom/whoop/whooplive/selfie/OverlayView$b;->d:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {v4, v3}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Recovery;->getScore()I

    move-result v0

    invoke-static {v3, v0}, Lcom/whoop/ui/f;->f(Landroid/content/Context;I)Landroid/text/Spannable;

    move-result-object v0

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->m:Landroid/widget/TextView;

    sget-object v4, Landroid/widget/TextView$BufferType;->SPANNABLE:Landroid/widget/TextView$BufferType;

    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    iget-object v3, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v3, v3, Lcom/whoop/whooplive/selfie/OverlayView$b;->e:Landroid/widget/TextView;

    invoke-virtual {v3, v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;Landroid/widget/TextView$BufferType;)V

    :cond_1
    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Cycle;->getSleep()Lcom/whoop/service/network/model/cycles/Sleep;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Sleep;->getActivityState()Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    sget-object v3, Lcom/whoop/domain/model/ActivityState;->COMPLETE:Lcom/whoop/domain/model/ActivityState;

    if-ne v0, v3, :cond_2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->J:Ltr2/n;

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Sleep;->getQualityDuration()Lor2/z1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/ui/f;->c(Lor2/z1;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->g:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->p:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_2
    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->O:Z

    return-void
.end method


# virtual methods
.method public getColorMode()Luz2/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luz2/a;

    return-object v0
.end method

.method public getMode()Luz2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    return-object v0
.end method

.method public getTintColor()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->c0:Ljava/lang/Integer;

    return-object v0
.end method

.method public k()Z
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    filled-new-array {v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lse/a;->O([Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method public l()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->d()V

    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/widget/ViewFlipper;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    invoke-virtual {v0}, Lmh3/c;->d()V

    return-void
.end method

.method public onFinishInflate()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onFinishInflate()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Lcom/whoop/whooplive/selfie/OverlayView$b;

    invoke-direct {v0, p0}, Lcom/whoop/whooplive/selfie/OverlayView$b;-><init>(Landroid/view/View;)V

    iput-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    new-instance v2, Luz2/c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Luz2/c;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->W:Llh3/b;

    new-instance v2, Luz2/c;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Luz2/c;-><init>(Lcom/whoop/whooplive/selfie/OverlayView;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lmh3/c;->c(Lxg3/t;)V

    return-void
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->y:Landroid/view/GestureDetector;

    invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p1

    return p1
.end method

.method public setCycle(Lcom/whoop/service/network/model/cycles/Cycle;)V
    .locals 3

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->K:Lcom/whoop/service/network/model/cycles/Cycle;

    if-eqz p1, :cond_0

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->setOverlayViews(Lcom/whoop/service/network/model/cycles/Cycle;)V

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/OverlayView$b;->i:Lcom/whoop/ui/ProgressDialLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object p1, p1, Lcom/whoop/whooplive/selfie/OverlayView$b;->b:Lcom/whoop/ui/ProgressDialLayout;

    invoke-virtual {p1, v0}, Lcom/whoop/ui/ProgressDialLayout;->setProgress(F)V

    float-to-double v0, v0

    invoke-static {v0, v1}, Lcom/whoop/ui/f;->h(D)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->j:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->c:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->O:Z

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->N:Z

    :goto_0
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->h:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->v()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/OverlayView$b;->k:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->v()Lxg3/g;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/OverlayView$b;->n:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->v()Lxg3/g;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lxg3/g;->z(Lxg3/g;Lxg3/g;Lxg3/g;)Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->d0:Lbh3/b;

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmh3/c;->c(Lxg3/t;)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->w:Lmh3/c;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->h:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v0}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->w()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v1, v1, Lcom/whoop/whooplive/selfie/OverlayView$b;->k:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v1}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->w()Lxg3/g;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v2, v2, Lcom/whoop/whooplive/selfie/OverlayView$b;->n:Lcom/whoop/whooplive/selfie/DraggableViewGroup;

    invoke-virtual {v2}, Lcom/whoop/whooplive/selfie/DraggableViewGroup;->w()Lxg3/g;

    move-result-object v2

    invoke-static {v0, v1, v2}, Lxg3/g;->z(Lxg3/g;Lxg3/g;Lxg3/g;)Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->e0:Lbh3/b;

    invoke-virtual {v0, v1}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    invoke-virtual {p1, v0}, Lmh3/c;->c(Lxg3/t;)V

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->A()V

    return-void
.end method

.method public setMode(Luz2/b;)V
    .locals 2

    iput-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->b0:Z

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    add-int/lit8 p1, p1, -0x1

    :goto_0
    invoke-virtual {p0, p1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->L:Luz2/b;

    sget-object v0, Luz2/b;->STRAIN:Luz2/b;

    if-ne p1, v0, :cond_1

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->M:Z

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->P:Ljava/lang/String;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    sget-object v0, Luz2/b;->RECOVERY:Luz2/b;

    if-ne p1, v0, :cond_2

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->N:Z

    if-eqz v0, :cond_2

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->Q:Ljava/lang/String;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    sget-object v0, Luz2/b;->SLEEP:Luz2/b;

    if-ne p1, v0, :cond_3

    iget-boolean v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->O:Z

    if-eqz v0, :cond_3

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->R:Ljava/lang/String;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    sget-object v0, Luz2/b;->OVERVIEW:Luz2/b;

    if-ne p1, v0, :cond_5

    iget-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->O:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->N:Z

    if-nez p1, :cond_4

    iget-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->M:Z

    if-eqz p1, :cond_5

    :cond_4
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->S:Ljava/lang/String;

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    const-string v0, ""

    invoke-virtual {p1, v0}, Llh3/b;->onNext(Ljava/lang/Object;)V

    :goto_1
    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->A()V

    iget-object p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-virtual {p1}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Luz2/a;

    invoke-direct {p0}, Lcom/whoop/whooplive/selfie/OverlayView;->s()Z

    move-result v0

    if-nez v0, :cond_6

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-virtual {v0}, Llh3/b;->Z()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Luz2/a;->TINTED:Luz2/a;

    if-ne v0, v1, :cond_6

    sget-object p1, Luz2/a;->DARK:Luz2/a;

    :cond_6
    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    invoke-virtual {v0, p1}, Llh3/b;->onNext(Ljava/lang/Object;)V

    invoke-direct {p0, p1}, Lcom/whoop/whooplive/selfie/OverlayView;->C(Luz2/a;)V

    return-void
.end method

.method public setVideoEnabled(Z)V
    .locals 0

    iput-boolean p1, p0, Lcom/whoop/whooplive/selfie/OverlayView;->b0:Z

    return-void
.end method

.method public t()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Luz2/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->T:Llh3/b;

    return-object v0
.end method

.method public u()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Lrz2/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->W:Llh3/b;

    return-object v0
.end method

.method public v()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->V:Llh3/b;

    return-object v0
.end method

.method public w()Lxg3/g;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->U:Llh3/b;

    return-object v0
.end method

.method public x()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->e()V

    return-void
.end method

.method public y()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    invoke-virtual {v0}, Lcom/whoop/whooplive/live/views/LiveOverlayView;->e()V

    return-void
.end method

.method public z()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/whooplive/selfie/OverlayView;->x:Lcom/whoop/whooplive/selfie/OverlayView$b;

    iget-object v0, v0, Lcom/whoop/whooplive/selfie/OverlayView$b;->q:Lcom/whoop/whooplive/live/views/LiveOverlayView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method
