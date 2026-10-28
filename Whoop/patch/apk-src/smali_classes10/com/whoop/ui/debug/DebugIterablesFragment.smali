.class public final Lcom/whoop/ui/debug/DebugIterablesFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eJ!\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000c2\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0017\u001a\u00020\u00128\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001d\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001cR+\u0010&\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001e8B@BX\u0082\u008e\u0002\u00a2\u0006\u0012\n\u0004\u0008 \u0010!\u001a\u0004\u0008\"\u0010#\"\u0004\u0008$\u0010%\u00a8\u0006\'"
    }
    d2 = {
        "Lcom/whoop/ui/debug/DebugIterablesFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "K",
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
        "Ln92/b;",
        "x",
        "Ll83/h;",
        "J",
        "()Ln92/b;",
        "handler",
        "Lii0/m;",
        "<set-?>",
        "y",
        "Lcom/whoop/ui/b;",
        "I",
        "()Lii0/m;",
        "P",
        "(Lii0/m;)V",
        "binding",
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


# static fields
.field public static final E:I

.field static final synthetic z:[Lj93/z;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lj93/z;"
        }
    .end annotation
.end field


# instance fields
.field private final w:Ljava/lang/String;

.field private final x:Ll83/h;

.field private final y:Lcom/whoop/ui/b;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lkotlin/jvm/internal/q;

    const-class v1, Lcom/whoop/ui/debug/DebugIterablesFragment;

    const-string v2, "binding"

    const-string v3, "getBinding()Lcom/whoop/android/databinding/FragmentDebugIterableBinding;"

    const/4 v4, 0x0

    invoke-direct {v0, v1, v2, v3, v4}, Lkotlin/jvm/internal/q;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->mutableProperty1(Lkotlin/jvm/internal/p;)Lj93/l;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Lj93/z;

    aput-object v0, v1, v4

    sput-object v1, Lcom/whoop/ui/debug/DebugIterablesFragment;->z:[Lj93/z;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/ui/debug/DebugIterablesFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "DebugIterablesFragment"

    iput-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->w:Ljava/lang/String;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/ui/debug/DebugIterablesFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/ui/debug/DebugIterablesFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->x:Ll83/h;

    const/4 v0, 0x1

    invoke-static {p0, v2, v0, v2}, Lcom/whoop/ui/c;->c(Landroidx/fragment/app/m0;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Lcom/whoop/ui/b;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->y:Lcom/whoop/ui/b;

    return-void
.end method

.method public static synthetic E(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/DebugIterablesFragment;->M(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/DebugIterablesFragment;->O(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/DebugIterablesFragment;->L(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/ui/debug/DebugIterablesFragment;->N(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final I()Lii0/m;
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->y:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/ui/debug/DebugIterablesFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1}, Lcom/whoop/ui/b;->e(Landroidx/fragment/app/m0;Lj93/z;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lii0/m;

    return-object v0
.end method

.method private final J()Ln92/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ln92/b;

    return-object v0
.end method

.method private final K()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->I()Lii0/m;

    move-result-object v0

    iget-object v1, v0, Lii0/m;->e:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "healthMonitorIterable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmm2/a;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3}, Lmm2/a;-><init>(Lcom/whoop/ui/debug/DebugIterablesFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lii0/m;->a:Landroid/widget/ImageView;

    const-string v2, "backIcon"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmm2/a;

    const/4 v3, 0x1

    invoke-direct {v2, p0, v3}, Lmm2/a;-><init>(Lcom/whoop/ui/debug/DebugIterablesFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v1, v0, Lii0/m;->c:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v2, "coachingLandingIterable"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lmm2/a;

    const/4 v3, 0x2

    invoke-direct {v2, p0, v3}, Lmm2/a;-><init>(Lcom/whoop/ui/debug/DebugIterablesFragment;I)V

    invoke-static {v1, v2}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, v0, Lii0/m;->j:Landroidx/constraintlayout/widget/ConstraintLayout;

    const-string v1, "strengthTrainerIterable"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lmm2/a;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lmm2/a;-><init>(Lcom/whoop/ui/debug/DebugIterablesFragment;I)V

    invoke-static {v0, v1}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    return-void
.end method

.method private static final L(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->J()Ln92/b;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "HealthMonitor"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ln92/b;->u(Ln92/b;Ljava/lang/String;ZLj02/o0;ILjava/lang/Object;)Ln92/a;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final M(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->J()Ln92/b;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "Coaching"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ln92/b;->u(Ln92/b;Ljava/lang/String;ZLj02/o0;ILjava/lang/Object;)Ln92/a;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lcom/whoop/ui/debug/DebugIterablesFragment;Landroid/view/View;)Ll83/a0;
    .locals 7

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->J()Ln92/b;

    move-result-object v1

    const/4 v5, 0x6

    const/4 v6, 0x0

    const-string v2, "StrengthTrainer"

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Ln92/b;->u(Ln92/b;Ljava/lang/String;ZLj02/o0;ILjava/lang/Object;)Ln92/a;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final P(Lii0/m;)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->y:Lcom/whoop/ui/b;

    sget-object v1, Lcom/whoop/ui/debug/DebugIterablesFragment;->z:[Lj93/z;

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-virtual {v0, p0, v1, p1}, Lcom/whoop/ui/b;->f(Landroidx/fragment/app/m0;Lj93/z;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/ui/debug/DebugIterablesFragment;->w:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    const-string p3, "inflater"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    const/4 p3, 0x0

    invoke-static {p1, p2, p3}, Lii0/m;->c(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lii0/m;

    move-result-object p1

    const-string p2, "inflate(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, Lcom/whoop/ui/debug/DebugIterablesFragment;->P(Lii0/m;)V

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->I()Lii0/m;

    move-result-object p1

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

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

    invoke-direct {p0}, Lcom/whoop/ui/debug/DebugIterablesFragment;->K()V

    return-void
.end method
