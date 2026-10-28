.class public final Lmp0/h;
.super Lmp0/k0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0003J+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J!\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000e2\u0008\u0010\r\u001a\u0004\u0018\u00010\u000cH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R+\u0010\"\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008\u001c\u0010\u001d\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!\u00a8\u0006#"
    }
    d2 = {
        "Lmp0/h;",
        "Lmp0/k0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "N",
        "T",
        "S",
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
        "z",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lgf2/f;",
        "<set-?>",
        "E",
        "Lcom/whoop/ui/b;",
        "M",
        "()Lgf2/f;",
        "R",
        "(Lgf2/f;)V",
        "binding",
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
.field static final synthetic F:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field

.field public static final G:I


# instance fields
.field private final E:Lcom/whoop/ui/b;

.field private final z:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lmp0/h;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/sleep/coach/databinding/SleepCoachFragmentAlarmTypeWizardBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lmp0/h;->F:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lmp0/h;->G:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lmp0/k0;-><init>()V

    const-string v0, "AlarmTypeWizardFragment"

    iput-object v0, p0, Lmp0/h;->z:Ljava/lang/String;

    const/4 v0, 0x0

    const/4 v1, 0x1

    invoke-static {p0, v0, v1, v0}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lmp0/h;->E:Lcom/whoop/ui/b;

    return-void
.end method

.method public static synthetic J(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/h;->P(Lmp0/h;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic K(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/h;->Q(Lmp0/h;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic L(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmp0/h;->O(Lmp0/h;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final M()Lgf2/f;
    .locals 3

    iget-object v0, p0, Lmp0/h;->E:Lcom/whoop/ui/b;

    sget-object v1, Lmp0/h;->F:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lgf2/f;

    return-object v0
.end method

.method private final N()V
    .locals 4

    invoke-direct {p0}, Lmp0/h;->M()Lgf2/f;

    move-result-object v0

    iget-object v1, v0, Lgf2/f;->b:Landroid/view/View;

    const-string v2, "exactTimeBg"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmp0/g;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lmp0/g;-><init>(Lmp0/h;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lgf2/f;->l:Landroid/view/View;

    const-string v2, "sleepGoalBg"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmp0/g;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lmp0/g;-><init>(Lmp0/h;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lgf2/f;->h:Landroid/view/View;

    const-string v1, "inTheGreenBg"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmp0/g;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lmp0/g;-><init>(Lmp0/h;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final O(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p0

    sget-object p1, Lnp0/a;->EXACT_TIME:Lnp0/a;

    invoke-virtual {p0, p1}, Lmp0/b1;->M(Lnp0/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/b1;->Z()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p0

    sget-object p1, Lnp0/a;->SLEEP_GOAL:Lnp0/a;

    invoke-virtual {p0, p1}, Lmp0/b1;->M(Lnp0/a;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lmp0/h;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/b1;->Z()Z

    move-result p1

    if-nez p1, :cond_0

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p0

    sget-object p1, Lnp0/a;->IN_THE_GREEN:Lnp0/a;

    invoke-virtual {p0, p1}, Lmp0/b1;->M(Lnp0/a;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final R(Lgf2/f;)V
    .locals 3

    iget-object v0, p0, Lmp0/h;->E:Lcom/whoop/ui/b;

    sget-object v1, Lmp0/h;->F:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method

.method private final S()V
    .locals 5

    invoke-direct {p0}, Lmp0/h;->M()Lgf2/f;

    move-result-object v0

    iget-object v1, v0, Lgf2/f;->j:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lgf2/f;->h:Landroid/view/View;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lqe2/d;->h:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lgf2/f;->i:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lvu1/a;->R:I

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v0, Lgf2/f;->k:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lvu1/a;->R:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method

.method private final T()V
    .locals 5

    invoke-direct {p0}, Lmp0/h;->M()Lgf2/f;

    move-result-object v0

    iget-object v1, v0, Lgf2/f;->n:Landroid/widget/ImageView;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    iget-object v1, v0, Lgf2/f;->l:Landroid/view/View;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lqe2/d;->h:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    iget-object v1, v0, Lgf2/f;->m:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lvu1/a;->R:I

    invoke-virtual {v2, v3, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    iget-object v0, v0, Lgf2/f;->o:Landroid/widget/TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lvu1/a;->R:I

    invoke-virtual {v1, v2, v4}, Landroid/content/res/Resources;->getColor(ILandroid/content/res/Resources$Theme;)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lmp0/h;->z:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lgf2/f;->c(Landroid/view/LayoutInflater;)Lgf2/f;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lmp0/h;->R(Lgf2/f;)V

    invoke-direct {p0}, Lmp0/h;->M()Lgf2/f;

    move-result-object p1

    invoke-virtual {p1}, Lgf2/f;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

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

    invoke-virtual {p0}, Lmp0/k0;->F()Lmp0/b1;

    move-result-object p1

    invoke-virtual {p1}, Lmp0/b1;->Z()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-direct {p0}, Lmp0/h;->T()V

    invoke-direct {p0}, Lmp0/h;->S()V

    :cond_0
    invoke-direct {p0}, Lmp0/h;->N()V

    return-void
.end method
