.class public Lcom/whoop/ui/views/LiveHeartRateView;
.super Landroid/widget/FrameLayout;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/views/LiveHeartRateView$h;,
        Lcom/whoop/ui/views/LiveHeartRateView$f;,
        Lcom/whoop/ui/views/LiveHeartRateView$g;,
        Lcom/whoop/ui/views/LiveHeartRateView$e;
    }
.end annotation


# instance fields
.field E:Landroid/view/View;

.field F:Landroid/view/View;

.field G:Landroid/widget/TextView;

.field H:Landroid/widget/TextView;

.field I:Landroid/widget/TextView;

.field J:Lcom/whoop/ui/old/Battery;

.field K:Landroid/widget/TextView;

.field L:Landroid/view/View;

.field M:Landroid/view/View;

.field N:Landroid/view/View;

.field O:Landroid/widget/TextView;

.field private P:I

.field private Q:I

.field private R:I

.field private final S:Landroid/os/Handler;

.field private T:Z

.field private U:Z

.field private V:Z

.field private W:Lcom/whoop/ui/views/LiveHeartRateView$f;

.field private a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

.field private b0:Lcom/whoop/ui/l;

.field private final c0:Ltr2/n;

.field private d0:Z

.field private final e0:Ltd1/b;

.field private final f0:Lrd1/d;

.field private final g0:Ljava/lang/Runnable;

.field private final h0:Ljava/lang/Runnable;

.field w:Landroid/view/View;

.field x:Landroid/widget/ImageView;

.field y:Landroid/widget/ViewFlipper;

.field z:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 2

    invoke-direct {p0, p1, p2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    invoke-static {}, Lse/b;->J()Landroid/os/Handler;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    new-instance v0, Lcom/whoop/ui/l;

    invoke-direct {v0}, Lcom/whoop/ui/l;-><init>()V

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    const-string v0, "LiveHeartRateView"

    invoke-static {v0}, Ltr2/n;->d(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const-class v0, Ltd1/b;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ltd1/b;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    const-class v0, Lrd1/d;

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lrd1/d;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->f0:Lrd1/d;

    new-instance v0, Lcom/whoop/ui/views/LiveHeartRateView$b;

    invoke-direct {v0, p0}, Lcom/whoop/ui/views/LiveHeartRateView$b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;)V

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->g0:Ljava/lang/Runnable;

    new-instance v0, Lcom/whoop/ui/views/LiveHeartRateView$c;

    invoke-direct {v0, p0}, Lcom/whoop/ui/views/LiveHeartRateView$c;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;)V

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->h0:Ljava/lang/Runnable;

    sget-object v0, Lvu1/j;->p:[I

    invoke-virtual {p1, p2, v0}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->q(Landroid/content/res/TypedArray;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method

.method private A()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->I()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->Q:I

    invoke-virtual {v0, v2}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    sget-object v2, Ltd1/e;->NONE:Ltd1/e;

    if-eq v0, v2, :cond_1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    sget-object v2, Ltd1/e;->CONNECTION_FAILED:Ltd1/e;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const-string v2, "Displaying \"Disabled\" message in the Real Time HR UI circle"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v1, Lvu1/h;->f:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void

    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const-string v2, "Displaying \"Disconnected\" message in the Real Time HR UI circle"

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v1, Lvu1/h;->d:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private B()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->P:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    return-void
.end method

.method private E()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Showing OffBody"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->o()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->Q:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v1, Lvu1/h;->h:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private F()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->R:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->G()V

    return-void
.end method

.method private G()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->j()V

    :cond_0
    return-void
.end method

.method private H()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->g()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->j()V

    :cond_0
    return-void
.end method

.method private I()V
    .locals 1

    new-instance v0, Lcom/whoop/ui/views/LiveHeartRateView$a;

    invoke-direct {v0, p0}, Lcom/whoop/ui/views/LiveHeartRateView$a;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;)V

    invoke-static {v0}, Lse/b;->b0(Ljava/lang/Runnable;)V

    return-void
.end method

.method private J()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    monitor-enter v0

    const/4 v1, 0x0

    :try_start_0
    iput-boolean v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->T:Z

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->g0:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->h0:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private K()V
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->V:Z

    if-eqz v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->B()V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->H()V

    return-void

    :cond_0
    const-class v0, Lc92/a;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc92/a;

    invoke-virtual {v0}, Lc92/a;->f()Z

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->y()V

    return-void

    :cond_1
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->A()Ltd1/e;

    move-result-object v0

    invoke-virtual {v0}, Ltd1/e;->isReady()Z

    move-result v0

    if-nez v0, :cond_2

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->A()V

    return-void

    :cond_2
    iget-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->U:Z

    if-eqz v0, :cond_3

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->B()V

    return-void

    :cond_3
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->f0:Lrd1/d;

    invoke-virtual {v0}, Lrd1/d;->M()Lrd1/b;

    move-result-object v0

    sget-object v1, Lcom/whoop/ui/views/LiveHeartRateView$d;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v1, v0

    const/4 v1, 0x1

    if-eq v0, v1, :cond_6

    const/4 v1, 0x2

    if-eq v0, v1, :cond_4

    return-void

    :cond_4
    invoke-static {}, Lcom/whoop/service/rearchitect/c;->u3()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_5

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->E()V

    return-void

    :cond_5
    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->z()V

    return-void

    :cond_6
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "LiveHeartRateView"

    const-string v3, "Real time state is unexpectedly disabled."

    invoke-interface {v0, v2, v3, v1}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->A()V

    return-void
.end method

.method public static synthetic a(Lcom/whoop/ui/views/LiveHeartRateView;Ljava/lang/Byte;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->t(Ljava/lang/Byte;)V

    return-void
.end method

.method public static synthetic b(Lcom/whoop/ui/views/LiveHeartRateView;Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->r(Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic c(Lcom/whoop/ui/views/LiveHeartRateView;Lkk0/b;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/views/LiveHeartRateView;->v(Lkk0/b;)V

    return-void
.end method

.method public static bridge synthetic d(Lcom/whoop/ui/views/LiveHeartRateView;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->T:Z

    return p0
.end method

.method public static bridge synthetic e(Lcom/whoop/ui/views/LiveHeartRateView;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->h0:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic f(Lcom/whoop/ui/views/LiveHeartRateView;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->g0:Ljava/lang/Runnable;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/whoop/ui/views/LiveHeartRateView;)Landroid/os/Handler;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    return-object p0
.end method

.method public static bridge synthetic h(Lcom/whoop/ui/views/LiveHeartRateView;)V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->T:Z

    return-void
.end method

.method private o()V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->J()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->M:Landroid/view/View;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private q(Landroid/content/res/TypedArray;)V
    .locals 5

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, Lvu1/g;->a:I

    invoke-virtual {v0, v1, p0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    sget v0, Lvu1/e;->g:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v0, Lvu1/e;->j:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    sget v0, Lvu1/e;->h:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ViewFlipper;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    sget v0, Lvu1/e;->k:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->z:Landroid/widget/ImageView;

    sget v0, Lvu1/e;->n:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->E:Landroid/view/View;

    sget v0, Lvu1/e;->l:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->F:Landroid/view/View;

    sget v0, Lvu1/e;->m:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v0, Lvu1/e;->i:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->H:Landroid/widget/TextView;

    sget v0, Lvu1/e;->f:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->I:Landroid/widget/TextView;

    sget v0, Lvu1/e;->a:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/old/Battery;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->J:Lcom/whoop/ui/old/Battery;

    sget v0, Lvu1/e;->d:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->K:Landroid/widget/TextView;

    sget v0, Lvu1/e;->b:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->L:Landroid/view/View;

    sget v0, Lvu1/e;->e:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->M:Landroid/view/View;

    sget v0, Lvu1/e;->c:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->N:Landroid/view/View;

    sget v0, Lvu1/e;->o:I

    invoke-virtual {p0, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->O:Landroid/widget/TextView;

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->P:I

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->F:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->Q:I

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->E:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    move-result v0

    iput v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->R:I

    new-instance v0, Lcom/whoop/ui/views/LiveHeartRateView$h;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$h;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V

    new-instance v2, Lcom/whoop/ui/views/LiveHeartRateView$f;

    iget-object v3, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    iget-object v4, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    invoke-direct {v2, v3, v0, v4}, Lcom/whoop/ui/views/LiveHeartRateView$f;-><init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V

    iput-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    new-instance v2, Lcom/whoop/ui/views/LiveHeartRateView$g;

    iget-object v3, p0, Lcom/whoop/ui/views/LiveHeartRateView;->S:Landroid/os/Handler;

    iget-object v4, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    invoke-direct {v2, v3, v0, v4}, Lcom/whoop/ui/views/LiveHeartRateView$g;-><init>(Landroid/os/Handler;Lcom/whoop/ui/views/LiveHeartRateView$h;Landroid/view/View;)V

    iput-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->n()V

    const/4 v0, 0x1

    if-eqz p1, :cond_8

    move v2, v1

    :goto_0
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->getIndexCount()I

    move-result v3

    if-ge v2, v3, :cond_8

    invoke-virtual {p1, v2}, Landroid/content/res/TypedArray;->getIndex(I)I

    move-result v3

    sget v4, Lvu1/j;->q:I

    if-ne v3, v4, :cond_0

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->m()V

    goto :goto_1

    :cond_0
    sget v4, Lvu1/j;->r:I

    if-ne v3, v4, :cond_1

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->n()V

    goto :goto_1

    :cond_1
    sget v4, Lvu1/j;->u:I

    if-ne v3, v4, :cond_2

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v3

    invoke-virtual {p0, v3}, Lcom/whoop/ui/views/LiveHeartRateView;->setIconResource(I)V

    goto :goto_1

    :cond_2
    sget v4, Lvu1/j;->t:I

    if-ne v3, v4, :cond_3

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->p()V

    goto :goto_1

    :cond_3
    sget v4, Lvu1/j;->w:I

    if-ne v3, v4, :cond_5

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v4

    if-eqz v4, :cond_4

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->C()V

    :cond_4
    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->D()V

    goto :goto_1

    :cond_5
    sget v4, Lvu1/j;->s:I

    if-ne v3, v4, :cond_6

    invoke-virtual {p1, v3, v1}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    invoke-virtual {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->D()V

    goto :goto_1

    :cond_6
    sget v4, Lvu1/j;->v:I

    if-ne v3, v4, :cond_7

    invoke-virtual {p1, v3, v0}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v3

    iput-boolean v3, p0, Lcom/whoop/ui/views/LiveHeartRateView;->d0:Z

    :cond_7
    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_8
    const/high16 p1, 0x3f800000    # 1.0f

    invoke-virtual {p0, p1}, Landroid/view/View;->setAlpha(F)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    iget-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->N:Landroid/view/View;

    iget-boolean v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->d0:Z

    invoke-static {p1, v1}, Lse/h;->T(Landroid/view/View;Z)V

    iget-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->O:Landroid/widget/TextView;

    iget-boolean v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->d0:Z

    xor-int/2addr v0, v1

    invoke-static {p1, v0}, Lse/h;->T(Landroid/view/View;Z)V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result p1

    if-eqz p1, :cond_9

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->u()V

    :cond_9
    return-void
.end method

.method private synthetic r(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->K()V

    return-void
.end method

.method private setRingDrawable(I)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$e;->i(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$f;->i(I)V

    return-void
.end method

.method private t(Ljava/lang/Byte;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->J:Lcom/whoop/ui/old/Battery;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/old/Battery;->setBatteryLevelPct(Ljava/lang/Byte;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->K:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lvu1/h;->a:I

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {v1, v2, p1}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method private u()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->H:Landroid/widget/TextView;

    const-string v1, "65"

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    const/16 v1, 0x41

    invoke-virtual {v0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$f;->l(I)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->F()V

    return-void
.end method

.method private v(Lkk0/b;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->L:Landroid/view/View;

    invoke-virtual {p1}, Lkk0/b;->d()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, 0x4

    :goto_0
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private x()V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->J()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->M:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method private y()V
    .locals 2

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->x()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->Q:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v1, Lvu1/h;->b:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    return-void
.end method

.method private z()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->c0:Ltr2/n;

    const/4 v1, 0x0

    new-array v2, v1, [Lqr2/a$a;

    const-string v3, "Showing Calibrating"

    invoke-interface {v0, v3, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->I()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->y:Landroid/widget/ViewFlipper;

    iget v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->Q:I

    invoke-virtual {v0, v1}, Landroid/widget/ViewAnimator;->setDisplayedChild(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->G:Landroid/widget/TextView;

    sget v1, Lvu1/h;->c:I

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->H()V

    return-void
.end method


# virtual methods
.method public C()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->V:Z

    return-void
.end method

.method public D()V
    .locals 2

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->d0:Z

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->I:Landroid/widget/TextView;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->N:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public i()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->c:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    sget v0, Lvu1/c;->r:I

    invoke-direct {p0, v0}, Lcom/whoop/ui/views/LiveHeartRateView;->setRingDrawable(I)V

    return-void
.end method

.method public j()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->a:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    sget v1, Lvu1/c;->q:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$f;->i(I)V

    return-void
.end method

.method public k()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->b:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    sget v1, Lvu1/c;->p:I

    invoke-virtual {v0, v1}, Lcom/whoop/ui/views/LiveHeartRateView$f;->i(I)V

    return-void
.end method

.method public l()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    sget v0, Lvu1/c;->p:I

    invoke-direct {p0, v0}, Lcom/whoop/ui/views/LiveHeartRateView;->setRingDrawable(I)V

    return-void
.end method

.method public m()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->d:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    sget v0, Lvu1/c;->p:I

    invoke-direct {p0, v0}, Lcom/whoop/ui/views/LiveHeartRateView;->setRingDrawable(I)V

    return-void
.end method

.method public n()V
    .locals 2

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->w:Landroid/view/View;

    sget v1, Lvu1/c;->e:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    sget v0, Lvu1/c;->p:I

    invoke-direct {p0, v0}, Lcom/whoop/ui/views/LiveHeartRateView;->setRingDrawable(I)V

    return-void
.end method

.method public onAttachedToWindow()V
    .locals 4

    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v1}, Ltd1/b;->b()Lkk0/a;

    move-result-object v1

    invoke-virtual {v1}, Lkk0/a;->j()Lxg3/g;

    move-result-object v1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v1

    new-instance v2, Lkn2/b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lkn2/b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v1}, Ltd1/b;->n()Lkk0/b;

    move-result-object v1

    invoke-virtual {v1}, Lkk0/b;->f()Lxg3/g;

    move-result-object v1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v1

    new-instance v2, Lkn2/b;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lkn2/b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->f0:Lrd1/d;

    invoke-virtual {v1}, Lrd1/d;->P()Lxg3/g;

    move-result-object v1

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v1

    new-instance v2, Lkn2/b;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lkn2/b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V

    invoke-virtual {v1, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    new-instance v0, Lkn2/b;

    const/4 v1, 0x3

    invoke-direct {v0, p0, v1}, Lkn2/b;-><init>(Lcom/whoop/ui/views/LiveHeartRateView;I)V

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object v2

    invoke-virtual {v2}, Le50/b;->f()Lrd1/d;

    move-result-object v2

    invoke-virtual {v2}, Lrd1/d;->Q()Lxg3/g;

    move-result-object v2

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v3

    invoke-virtual {v2, v3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lsk/a;->a(Landroid/content/Context;)Lxg3/g;

    move-result-object v2

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v3

    invoke-virtual {v2, v3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    iget-object v1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    iget-object v2, p0, Lcom/whoop/ui/views/LiveHeartRateView;->e0:Ltd1/b;

    invoke-interface {v2}, Ltd1/b;->i()Lxg3/g;

    move-result-object v2

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object v3

    invoke-virtual {v2, v3}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v2

    invoke-virtual {v2, v0}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    :cond_0
    return-void
.end method

.method public onDetachedFromWindow()V
    .locals 1

    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->b0:Lcom/whoop/ui/l;

    invoke-virtual {v0}, Lcom/whoop/ui/l;->b()V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->J()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->a0:Lcom/whoop/ui/views/LiveHeartRateView$g;

    invoke-virtual {v0}, Lcom/whoop/ui/views/LiveHeartRateView$e;->k()V

    return-void
.end method

.method public p()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->U:Z

    return-void
.end method

.method public s(Lsj0/a;)V
    .locals 2

    if-eqz p1, :cond_2

    invoke-static {}, Lcom/whoop/service/rearchitect/c;->u3()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->E()V

    return-void

    :cond_0
    invoke-virtual {p1}, Lsj0/a;->getHeartRate()I

    move-result v0

    if-nez v0, :cond_1

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->z()V

    return-void

    :cond_1
    invoke-virtual {p1}, Lsj0/a;->getHeartRate()I

    move-result p1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->H:Landroid/widget/TextView;

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->W:Lcom/whoop/ui/views/LiveHeartRateView$f;

    invoke-virtual {v0, p1}, Lcom/whoop/ui/views/LiveHeartRateView$f;->l(I)V

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->F()V

    return-void

    :cond_2
    invoke-static {}, Lcom/whoop/service/rearchitect/c;->u3()Ljava/util/concurrent/atomic/AtomicBoolean;

    move-result-object p1

    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->E()V

    return-void

    :cond_3
    invoke-direct {p0}, Lcom/whoop/ui/views/LiveHeartRateView;->z()V

    return-void
.end method

.method public setIconResource(I)V
    .locals 1

    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->z:Landroid/widget/ImageView;

    invoke-virtual {v0, p1}, Landroid/widget/ImageView;->setImageResource(I)V

    return-void

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->x:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lin2/j;->e(ILandroid/widget/ImageView;)V

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->z:Landroid/widget/ImageView;

    invoke-static {p1, v0}, Lin2/j;->e(ILandroid/widget/ImageView;)V

    return-void
.end method

.method public setZone(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->O:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public w(II)V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/views/LiveHeartRateView;->O:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(I)V

    iget-object p1, p0, Lcom/whoop/ui/views/LiveHeartRateView;->O:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0, p2}, Ls4/c;->getColor(Landroid/content/Context;I)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method
