.class public final Lcom/whoop/share/view/WhoopShareFragment;
.super Lpq/l;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0019\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0015\u001a\u0004\u0008\u001a\u0010\u0017\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/share/view/WhoopShareFragment;",
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
        "Landroid/app/Dialog;",
        "onCreateDialog",
        "(Landroid/os/Bundle;)Landroid/app/Dialog;",
        "",
        "getTheme",
        "()I",
        "",
        "w",
        "Ll83/h;",
        "F",
        "()Ljava/lang/String;",
        "path",
        "x",
        "G",
        "source",
        "share_release"
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lpq/l;-><init>()V

    new-instance v0, Lid2/o;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lid2/o;-><init>(Lcom/whoop/share/view/WhoopShareFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/share/view/WhoopShareFragment;->w:Ll83/h;

    new-instance v0, Lid2/o;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lid2/o;-><init>(Lcom/whoop/share/view/WhoopShareFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/share/view/WhoopShareFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/share/view/WhoopShareFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/share/view/WhoopShareFragment;->J(Lcom/whoop/share/view/WhoopShareFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/share/view/WhoopShareFragment;->L(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lcom/whoop/share/view/WhoopShareFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/share/view/WhoopShareFragment;->I(Lcom/whoop/share/view/WhoopShareFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic D(Lcom/whoop/share/view/WhoopShareFragment;Landroid/content/DialogInterface;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/share/view/WhoopShareFragment;->H(Lcom/whoop/share/view/WhoopShareFragment;Landroid/content/DialogInterface;)V

    return-void
.end method

.method public static synthetic E(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/share/view/WhoopShareFragment;->K(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/share/view/WhoopShareFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final G()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/share/view/WhoopShareFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final H(Lcom/whoop/share/view/WhoopShareFragment;Landroid/content/DialogInterface;)V
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

    new-instance v0, Lcom/whoop/share/view/WhoopShareFragment$a;

    invoke-direct {v0, p0}, Lcom/whoop/share/view/WhoopShareFragment$a;-><init>(Lcom/whoop/share/view/WhoopShareFragment;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->I(Lpq/c;)V

    :cond_0
    return-void
.end method

.method private static final I(Lcom/whoop/share/view/WhoopShareFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

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

    invoke-direct {p0}, Lcom/whoop/share/view/WhoopShareFragment;->F()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0}, Lcom/whoop/share/view/WhoopShareFragment;->G()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_1

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p2, p1, :cond_2

    :cond_1
    new-instance p2, Lid2/o;

    const/4 p1, 0x2

    invoke-direct {p2, p0, p1}, Lid2/o;-><init>(Lcom/whoop/share/view/WhoopShareFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v3, p2

    check-cast v3, Lc93/a;

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v6}, Lid2/t;->R(Ljava/lang/String;Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lcom/whoop/share/view/WhoopShareFragment;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lpq/l;->dismissAllowingStateLoss()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_1

    const-string v0, "path"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    return-object p0

    :cond_1
    :goto_0
    const-string p0, ""

    return-object p0
.end method

.method private static final L(Lcom/whoop/share/view/WhoopShareFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "source"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

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

    invoke-virtual {p0}, Lcom/whoop/share/view/WhoopShareFragment;->getTheme()I

    move-result v1

    invoke-direct {p1, v0, v1}, Lpq/k;-><init>(Landroid/content/Context;I)V

    new-instance v0, Lid2/p;

    invoke-direct {v0, p0}, Lid2/p;-><init>(Lcom/whoop/share/view/WhoopShareFragment;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lid2/l;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lid2/l;-><init>(Ljava/lang/Object;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x21591829

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
