.class public final Lmp0/v;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001a\u0010\u001d\u001a\u00020\u00188\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u001f\u0010 R\u001b\u0010\'\u001a\u00020\"8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008%\u0010&\u00a8\u0006("
    }
    d2 = {
        "Lmp0/v;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "N",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "view",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "",
        "x",
        "Z",
        "getShowBottomNavigationBar",
        "()Z",
        "showBottomNavigationBar",
        "Lgf2/g;",
        "y",
        "Lgf2/g;",
        "binding",
        "Lmp0/w;",
        "z",
        "Ll83/h;",
        "J",
        "()Lmp0/w;",
        "sleepCoachAlarmSetReminderViewModel",
        "sleep-coach_release"
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
.field private final w:Ljava/lang/String;

.field private final x:Z

.field private y:Lgf2/g;

.field private final z:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "SleepCoachAlarmSetReminderFragment"

    iput-object v0, p0, Lmp0/v;->w:Ljava/lang/String;

    new-instance v0, Lmp0/v$b;

    invoke-direct {v0, p0}, Lmp0/v$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lmp0/v$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lmp0/v$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lmp0/v;->z:Ll83/h;

    return-void
.end method

.method public static synthetic E(Lmp0/v;Lmp0/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/v;->K(Lmp0/v;Lmp0/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lmp0/v;Lmp0/p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/v;->L(Lmp0/v;Lmp0/p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lmp0/v;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/v;->M(Lmp0/v;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmp0/v;->O(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lmp0/v;->P(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final J()Lmp0/w;
    .locals 1

    iget-object v0, p0, Lmp0/v;->z:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp0/w;

    return-object v0
.end method

.method private static final K(Lmp0/v;Lmp0/c;)Ll83/a0;
    .locals 3

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmp0/c;->b()Lmp0/b;

    move-result-object p1

    sget-object v0, Lmp0/b;->ALARM_SET_REMINDER_FLOW:Lmp0/b;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lmp0/v;->y:Lgf2/g;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lgf2/g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p0

    invoke-virtual {p0}, Lmp0/w;->t()V

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object p0, p0, Lmp0/v;->y:Lgf2/g;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lgf2/g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final L(Lmp0/v;Lmp0/p;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lmp0/p;->b()Lmp0/o;

    move-result-object p1

    sget-object v0, Lmp0/o;->ALARM_SET_REMINDER_ON_BACK_PRESS:Lmp0/o;

    if-ne p1, v0, :cond_1

    iget-object p1, p0, Lmp0/v;->y:Lgf2/g;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lgf2/g;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p0

    invoke-virtual {p0}, Lmp0/w;->p()V

    goto :goto_0

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lmp0/v;Z)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p0

    invoke-virtual {p0, p1}, Lmp0/w;->n(Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final N()V
    .locals 4

    iget-object v0, p0, Lmp0/v;->y:Lgf2/g;

    if-eqz v0, :cond_0

    iget-object v1, v0, Lgf2/g;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v2, "saveAndSetButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmp0/u;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, v3}, Lmp0/u;-><init>(Lmp0/v;Lgf2/g;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgf2/g;->f:Landroid/widget/TextView;

    const-string v2, "saveWakeTimeButton"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmp0/u;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v0, v3}, Lmp0/u;-><init>(Lmp0/v;Lgf2/g;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void

    :cond_0
    const-string v0, "binding"

    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 v0, 0x0

    throw v0
.end method

.method private static final O(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p2

    const/4 v0, 0x1

    invoke-virtual {p2, v0}, Lmp0/w;->o(Z)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p0

    iget-object p1, p1, Lgf2/g;->e:Lcom/whoop/ui/pills/StrokedPillButton;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmp0/w;->r(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lmp0/v;Lgf2/g;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p2

    const/4 v0, 0x0

    invoke-virtual {p2, v0}, Lmp0/w;->o(Z)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p0

    iget-object p1, p1, Lgf2/g;->f:Landroid/widget/TextView;

    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Lmp0/w;->r(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp0/v;->w:Ljava/lang/String;

    return-object v0
.end method

.method public getShowBottomNavigationBar()Z
    .locals 1

    iget-boolean v0, p0, Lmp0/v;->x:Z

    return v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lgf2/g;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/g;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lmp0/v;->y:Lgf2/g;

    invoke-virtual {p1}, Lgf2/g;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/m;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/w;->g()Landroidx/lifecycle/p0;

    move-result-object p1

    new-instance p2, Lmp0/t;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lmp0/t;-><init>(Lmp0/v;I)V

    new-instance v0, Lmp0/v$a;

    invoke-direct {v0, p2}, Lmp0/v$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v0}, Lhj0/m;->observe(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/w;->j()Landroidx/lifecycle/p0;

    move-result-object p1

    new-instance p2, Lmp0/t;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lmp0/t;-><init>(Lmp0/v;I)V

    new-instance v0, Lmp0/v$a;

    invoke-direct {v0, p2}, Lmp0/v$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v0}, Lhj0/m;->observe(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lmp0/v;->J()Lmp0/w;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/w;->l()Landroidx/lifecycle/p0;

    move-result-object p1

    new-instance p2, Lmp0/t;

    const/4 v0, 0x2

    invoke-direct {p2, p0, v0}, Lmp0/t;-><init>(Lmp0/v;I)V

    new-instance v0, Lmp0/v$a;

    invoke-direct {v0, p2}, Lmp0/v$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, p1, v0}, Lhj0/m;->observe(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lmp0/v;->N()V

    return-void
.end method
