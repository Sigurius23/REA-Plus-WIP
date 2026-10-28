.class public final Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;
.super Lpq/l;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 %2\u00020\u0001:\u0001&B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\n2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0019\u001a\u0004\u0008\u001f\u0010 R\u001d\u0010$\u001a\u0004\u0018\u00010\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\"\u0010\u0019\u001a\u0004\u0008#\u0010 \u00a8\u0006)\u00b2\u0006\u000c\u0010(\u001a\u00020\'8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;",
        "Lpq/l;",
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
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "",
        "getTheme",
        "()I",
        "Lge1/c;",
        "w",
        "Ll83/h;",
        "K",
        "()Lge1/c;",
        "viewModel",
        "",
        "x",
        "I",
        "()Ljava/lang/String;",
        "date",
        "y",
        "J",
        "drawerTitle",
        "z",
        "a",
        "Lge1/d;",
        "viewState",
        "add-activity_release"
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

.field public static final z:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$a;


# instance fields
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->z:Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lpq/l;-><init>()V

    new-instance v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$d;

    invoke-direct {v0, p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->w:Ll83/h;

    new-instance v0, Lhe1/c;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhe1/c;-><init>(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->x:Ll83/h;

    new-instance v0, Lhe1/c;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lhe1/c;-><init>(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->H(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Lge1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->O(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Lge1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->G(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->M(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->L(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static final synthetic F(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Lge1/c;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->K()Lge1/c;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "date"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    const-string p0, ""

    :cond_1
    return-object p0
.end method

.method private static final H(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "title"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method private final I()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final J()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final K()Lge1/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lge1/c;

    return-object v0
.end method

.method private static final L(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroid/content/DialogInterface;)V
    .locals 2

    const-string v0, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lpq/k;

    const v0, 0x7f0a03ba

    invoke-virtual {p1, v0}, Lm/c0;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    if-eqz p1, :cond_0

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->O(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->W(I)V

    const/4 v0, 0x1

    iput-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J:Z

    iput-boolean v0, p1, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->K:Z

    new-instance v0, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$b;-><init>(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    :cond_0
    return-void
.end method

.method private static final M(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->K()Lge1/c;

    move-result-object p1

    invoke-virtual {p1}, Lge1/c;->getViewState()Lec3/l;

    move-result-object v1

    sget-object v2, Lge1/d$f;->a:Lge1/d$f;

    const/16 v5, 0x30

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->J()Ljava/lang/String;

    move-result-object v2

    invoke-static {p1}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->N(Lp1/t2;)Lge1/d;

    move-result-object v3

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_2

    :cond_1
    new-instance p2, Lhb2/c;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast p2, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x0

    const/4 v7, 0x1

    const/4 v1, 0x0

    move-object v5, v4

    move-object v4, p2

    invoke-static/range {v1 .. v7}, Lhe1/a;->H(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lge1/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/t2;)Lge1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lge1/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lge1/d;

    return-object p0
.end method

.method private static final O(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Lge1/b;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->K()Lge1/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lge1/c;->p(Lge1/b;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getTheme()I
    .locals 1

    sget v0, Lgy0/g;->a:I

    return v0
.end method

.method public onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 2

    new-instance p1, Lpq/k;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lpq/k;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lhe1/b;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lhe1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lhb2/f;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x538825ad

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->K()Lge1/c;

    move-result-object p1

    new-instance p2, Lge1/b$e;

    invoke-direct {p0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;->I()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lge1/b$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lge1/c;->p(Lge1/b;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object p1

    const-string p2, "getViewLifecycleOwner(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object p1

    new-instance p2, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$c;

    const/4 v0, 0x0

    invoke-direct {p2, p0, v0}, Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment$c;-><init>(Lcom/whoop/editactivities/view/EditActivitiesDrawerFragment;Lq83/d;)V

    const/4 v1, 0x3

    invoke-static {p1, v0, v0, p2, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method
