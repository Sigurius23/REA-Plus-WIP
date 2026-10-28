.class public final Lmp0/e;
.super Lhj0/k;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R+\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00178B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\"\u0004\u0008\u001d\u0010\u001eR\u001b\u0010#\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001b\u0010!\u001a\u0004\u0008\u0019\u0010\"\u00a8\u0006$"
    }
    d2 = {
        "Lmp0/e;",
        "Lhj0/k;",
        "<init>",
        "()V",
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
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "",
        "G",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lgf2/e;",
        "<set-?>",
        "H",
        "Lcom/whoop/ui/b;",
        "I",
        "()Lgf2/e;",
        "L",
        "(Lgf2/e;)V",
        "binding",
        "Lmp0/f;",
        "Ll83/h;",
        "()Lmp0/f;",
        "alarmTurnOffTutorialViewModel",
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


# static fields
.field static final synthetic J:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final K:I


# instance fields
.field private final G:Ljava/lang/String;

.field private final H:Lcom/whoop/ui/b;

.field private final I:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lmp0/e;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachDialogAlarmTurnOffInfoBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lmp0/e;->J:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lmp0/e;->K:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/k;-><init>()V

    const-string v0, "AlarmTurnOffTutorialDialog"

    iput-object v0, p0, Lmp0/e;->G:Ljava/lang/String;

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, v0, v1}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lmp0/e;->H:Lcom/whoop/ui/b;

    new-instance v0, Lmp0/e$a;

    invoke-direct {v0, p0}, Lmp0/e$a;-><init>(Landroidx/fragment/app/m0;)V

    sget-object v2, Ll83/i;->y:Ll83/i;

    new-instance v3, Lmp0/e$b;

    invoke-direct {v3, p0, v1, v0, v1}, Lmp0/e$b;-><init>(Landroidx/fragment/app/m0;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lmp0/e;->I:Ll83/h;

    return-void
.end method

.method public static synthetic F(Lmp0/e;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/e;->J(Lmp0/e;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lmp0/e;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/e;->K(Lmp0/e;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final H()Lmp0/f;
    .locals 1

    iget-object v0, p0, Lmp0/e;->I:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lmp0/f;

    return-object v0
.end method

.method private final I()Lgf2/e;
    .locals 3

    iget-object v0, p0, Lmp0/e;->H:Lcom/whoop/ui/b;

    sget-object v1, Lmp0/e;->J:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgf2/e;

    return-object v0
.end method

.method private static final J(Lmp0/e;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmp0/e;->H()Lmp0/f;

    move-result-object p1

    sget-object v0, Lmp0/j;->GOT_IT_DISMISS:Lmp0/j;

    invoke-virtual {p1, v0}, Lmp0/f;->z(Lmp0/j;)V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lmp0/e;Landroid/view/View;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lmp0/e;->H()Lmp0/f;

    move-result-object p1

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p1, v0, v1, v0}, Lmp0/f;->A(Lmp0/f;Lmp0/j;ILjava/lang/Object;)V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->dismiss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final L(Lgf2/e;)V
    .locals 3

    iget-object v0, p0, Lmp0/e;->H:Lcom/whoop/ui/b;

    sget-object v1, Lmp0/e;->J:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp0/e;->G:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p3, 0x0

    invoke-virtual {p0, p3}, Landroidx/fragment/app/y;->setCancelable(Z)V

    invoke-static {p1, p2, p3}, Lgf2/e;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lgf2/e;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lmp0/e;->L(Lgf2/e;)V

    invoke-direct {p0}, Lmp0/e;->I()Lgf2/e;

    move-result-object p1

    invoke-virtual {p1}, Lgf2/e;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object p1

    const-string p2, "getRoot(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Lhj0/k;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/y;->requireDialog()Landroid/app/Dialog;

    move-result-object p1

    invoke-virtual {p1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p1

    if-eqz p1, :cond_0

    new-instance p2, Landroid/graphics/drawable/ColorDrawable;

    const/4 v0, 0x0

    invoke-direct {p2, v0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, p2}, Landroid/view/Window;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    :cond_0
    invoke-direct {p0}, Lmp0/e;->I()Lgf2/e;

    move-result-object p1

    iget-object p2, p1, Lgf2/e;->c:Lcom/whoop/ui/pills/StrokedPillButton;

    const-string v0, "alarmTurnOffGotIt"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmp0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lmp0/d;-><init>(Lmp0/e;I)V

    invoke-static {p2, v0}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object p1, p1, Lgf2/e;->d:Landroid/widget/ImageView;

    const-string p2, "closeIcon"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lmp0/d;

    const/4 v0, 0x1

    invoke-direct {p2, p0, v0}, Lmp0/d;-><init>(Lmp0/e;I)V

    invoke-static {p1, p2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method
