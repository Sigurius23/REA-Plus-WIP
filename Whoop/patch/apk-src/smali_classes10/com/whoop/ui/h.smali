.class public Lcom/whoop/ui/h;
.super Lhj0/g;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/ui/h$d;,
        Lcom/whoop/ui/h$e;
    }
.end annotation


# instance fields
.field private F:Lor2/j0;

.field private G:Z

.field private H:Lcom/whoop/ui/h$e;

.field private I:Landroid/animation/ObjectAnimator;

.field private J:Llh3/b;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Llh3/b;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lhj0/g;-><init>()V

    const-class v0, Lor2/j0;

    const/4 v1, 0x0

    invoke-static {v0, v1, v1}, Lge3/g;->y(Ljava/lang/Class;Lvf3/a;Lc93/a;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lor2/j0;

    iput-object v0, p0, Lcom/whoop/ui/h;->F:Lor2/j0;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lcom/whoop/ui/h;->G:Z

    invoke-static {v1, v0}, Llh3/b;->Y(Ljava/lang/Object;Z)Llh3/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/h;->J:Llh3/b;

    return-void
.end method

.method public static synthetic E(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/ui/h;->R(Ljava/lang/Boolean;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/h;->Q(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static bridge synthetic G(Lcom/whoop/ui/h;)Llh3/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/ui/h;->J:Llh3/b;

    return-object p0
.end method

.method public static bridge synthetic H(Lcom/whoop/ui/h;)V
    .locals 1

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Lcom/whoop/ui/h;->U(Z)V

    return-void
.end method

.method public static bridge synthetic I(Lcom/whoop/ui/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/h;->V(Ljava/lang/String;)V

    return-void
.end method

.method public static bridge synthetic J(Lcom/whoop/ui/h;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/ui/h;->W(Ljava/lang/String;)V

    return-void
.end method

.method public static L(Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/ui/l;Lxg3/g;Lbh3/c;Lbh3/c;)Lcom/whoop/ui/h;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/fragment/app/o1;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/whoop/ui/l;",
            "Lxg3/g<",
            "TT;>;",
            "Lbh3/c;",
            "Lbh3/c;",
            ")",
            "Lcom/whoop/ui/h;"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V

    :cond_0
    new-instance v0, Lcom/whoop/ui/h$d;

    invoke-direct {v0}, Lcom/whoop/ui/h$d;-><init>()V

    invoke-virtual {v0, p2}, Lcom/whoop/ui/h$d;->d(Ljava/lang/String;)Lcom/whoop/ui/h$d;

    move-result-object p2

    invoke-virtual {p2, p3}, Lcom/whoop/ui/h$d;->c(Ljava/lang/String;)Lcom/whoop/ui/h$d;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/ui/h$d;->a()Lcom/whoop/ui/h$d;

    move-result-object p2

    invoke-virtual {p2}, Lcom/whoop/ui/h$d;->b()Lcom/whoop/ui/h;

    move-result-object v3

    invoke-virtual {v3, p0, p1}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    invoke-direct {v3}, Lcom/whoop/ui/h;->T()Lxg3/g;

    move-result-object v1

    const/4 p0, 0x1

    iput-boolean p0, v3, Lcom/whoop/ui/h;->G:Z

    invoke-virtual {v1, p5}, Lxg3/g;->S(Lxg3/g;)Lxg3/g;

    move-result-object p0

    new-instance p1, Lcom/whoop/ui/h$a;

    invoke-direct {p1, v3}, Lcom/whoop/ui/h$a;-><init>(Lcom/whoop/ui/h;)V

    invoke-virtual {p0, p1}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    move-result-object p0

    invoke-virtual {p4, p0}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    new-instance p0, Lcom/mapbox/maps/l;

    const/16 p1, 0xd

    invoke-direct {p0, p1}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-static {p5, v1, p0}, Lxg3/g;->f(Lxg3/g;Lxg3/g;Lbh3/h;)Lxg3/g;

    move-result-object p0

    invoke-static {}, Lzg3/a;->a()Leh3/j;

    move-result-object p1

    invoke-virtual {p0, p1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object p0

    new-instance v0, Lcom/whoop/ui/h$b;

    move-object v4, p4

    move-object v5, p6

    move-object v2, p7

    invoke-direct/range {v0 .. v5}, Lcom/whoop/ui/h$b;-><init>(Lxg3/g;Lbh3/c;Lcom/whoop/ui/h;Lcom/whoop/ui/l;Lbh3/c;)V

    invoke-virtual {p0, v0}, Lxg3/g;->M(Lxg3/h;)Lxg3/t;

    move-result-object p0

    invoke-virtual {v4, p0}, Lcom/whoop/ui/l;->a(Lxg3/t;)V

    return-object v3
.end method

.method private M()Z
    .locals 3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "animOnStart"

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    return v0
.end method

.method private N()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "subtext"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private O()Ljava/lang/String;
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static P(Landroidx/fragment/app/o1;Ljava/lang/String;)Lcom/whoop/ui/h;
    .locals 0

    invoke-virtual {p0, p1}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object p0

    check-cast p0, Lcom/whoop/ui/h;

    return-object p0
.end method

.method private static synthetic Q(Ljava/lang/Object;Ljava/lang/Boolean;)Ljava/lang/Object;
    .locals 0

    return-object p0
.end method

.method private static synthetic R(Ljava/lang/Boolean;)Ljava/lang/Boolean;
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public static S()Lcom/whoop/ui/h;
    .locals 1

    new-instance v0, Lcom/whoop/ui/h;

    invoke-direct {v0}, Lcom/whoop/ui/h;-><init>()V

    return-object v0
.end method

.method private T()Lxg3/g;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lxg3/g<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/ui/h;->J:Llh3/b;

    new-instance v1, Lcom/mapbox/maps/l;

    const/16 v2, 0xe

    invoke-direct {v1, v2}, Lcom/mapbox/maps/l;-><init>(I)V

    invoke-virtual {v0, v1}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object v0

    return-object v0
.end method

.method private U(Z)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "animOnStart"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    return-void
.end method

.method private V(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "subtext"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private W(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const-string v1, "title"

    invoke-virtual {v0, v1, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public K()V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/h;->H:Lcom/whoop/ui/h$e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lcom/whoop/ui/h$e;->a:Lcom/whoop/ui/LoadingDial;

    const/4 v1, 0x2

    new-array v1, v1, [F

    fill-array-data v1, :array_0

    const-string v2, "progress"

    invoke-static {v0, v2, v1}, Landroid/animation/ObjectAnimator;->ofFloat(Ljava/lang/Object;Ljava/lang/String;[F)Landroid/animation/ObjectAnimator;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/h;->I:Landroid/animation/ObjectAnimator;

    const-wide/16 v1, 0x3e8

    invoke-virtual {v0, v1, v2}, Landroid/animation/ObjectAnimator;->setDuration(J)Landroid/animation/ObjectAnimator;

    iget-boolean v0, p0, Lcom/whoop/ui/h;->G:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/ui/h;->I:Landroid/animation/ObjectAnimator;

    const/16 v1, 0x64

    invoke-virtual {v0, v1}, Landroid/animation/ValueAnimator;->setRepeatCount(I)V

    :cond_0
    iget-object v0, p0, Lcom/whoop/ui/h;->I:Landroid/animation/ObjectAnimator;

    new-instance v1, Lcom/whoop/ui/h$c;

    invoke-direct {v1, p0}, Lcom/whoop/ui/h$c;-><init>(Lcom/whoop/ui/h;)V

    invoke-virtual {v0, v1}, Landroid/animation/Animator;->addListener(Landroid/animation/Animator$AnimatorListener;)V

    iget-object v0, p0, Lcom/whoop/ui/h;->I:Landroid/animation/ObjectAnimator;

    invoke-virtual {v0}, Landroid/animation/ObjectAnimator;->start()V

    :cond_1
    return-void

    :array_0
    .array-data 4
        0x0
        0x3f800000    # 1.0f
    .end array-data
.end method

.method public X(Landroidx/fragment/app/o1;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p1, p2}, Landroidx/fragment/app/o1;->E(Ljava/lang/String;)Landroidx/fragment/app/m0;

    move-result-object v0

    check-cast v0, Lcom/whoop/ui/h;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroidx/fragment/app/y;->dismiss()V

    :cond_0
    new-instance v0, Lcom/whoop/ui/h$d;

    invoke-direct {v0}, Lcom/whoop/ui/h$d;-><init>()V

    invoke-virtual {v0, p3}, Lcom/whoop/ui/h$d;->d(Ljava/lang/String;)Lcom/whoop/ui/h$d;

    move-result-object p3

    invoke-virtual {p3, p4}, Lcom/whoop/ui/h$d;->c(Ljava/lang/String;)Lcom/whoop/ui/h$d;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/ui/h$d;->a()Lcom/whoop/ui/h$d;

    move-result-object p3

    invoke-virtual {p3}, Lcom/whoop/ui/h$d;->b()Lcom/whoop/ui/h;

    move-result-object p3

    invoke-virtual {p3, p1, p2}, Landroidx/fragment/app/y;->show(Landroidx/fragment/app/o1;Ljava/lang/String;)V

    return-void
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    invoke-super {p0, p1}, Lhj0/g;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/view/Window;->requestFeature(I)Z

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroidx/fragment/app/y;->setCancelable(Z)V

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    sget p3, Lnf1/f;->a:I

    const/4 v0, 0x0

    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method

.method public onDestroyView()V
    .locals 1

    invoke-super {p0}, Lhj0/g;->onDestroyView()V

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/whoop/ui/h;->H:Lcom/whoop/ui/h$e;

    iget-object v0, p0, Lcom/whoop/ui/h;->I:Landroid/animation/ObjectAnimator;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/animation/Animator;->cancel()V

    :cond_0
    return-void
.end method

.method public onStart()V
    .locals 1

    invoke-super {p0}, Landroidx/fragment/app/y;->onStart()V

    iget-object v0, p0, Lcom/whoop/ui/h;->F:Lor2/j0;

    invoke-interface {v0}, Lor2/j0;->a()V

    return-void
.end method

.method public onStop()V
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/h;->F:Lor2/j0;

    invoke-interface {v0}, Lor2/j0;->b()V

    invoke-super {p0}, Landroidx/fragment/app/y;->onStop()V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    new-instance p2, Lcom/whoop/ui/h$e;

    invoke-direct {p2, p1}, Lcom/whoop/ui/h$e;-><init>(Landroid/view/View;)V

    iput-object p2, p0, Lcom/whoop/ui/h;->H:Lcom/whoop/ui/h$e;

    iget-object p1, p2, Lcom/whoop/ui/h$e;->a:Lcom/whoop/ui/LoadingDial;

    invoke-direct {p0}, Lcom/whoop/ui/h;->O()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p0}, Lcom/whoop/ui/h;->N()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p2, v0}, Lcom/whoop/ui/LoadingDial;->b(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    invoke-direct {p0}, Lcom/whoop/ui/h;->M()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {p0}, Lcom/whoop/ui/h;->K()V

    :cond_0
    return-void
.end method
