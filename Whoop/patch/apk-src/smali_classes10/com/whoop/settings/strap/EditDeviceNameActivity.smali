.class public final Lcom/whoop/settings/strap/EditDeviceNameActivity;
.super Lhj0/i;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/settings/strap/EditDeviceNameActivity$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0003\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J\u0019\u0010\t\u001a\u00020\u00042\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0014\u00a2\u0006\u0004\u0008\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0014X\u0094D\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0014\u001a\u00020\u00118\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u001a\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0017\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/whoop/settings/strap/EditDeviceNameActivity;",
        "Lhj0/i;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "S",
        "M",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "",
        "E",
        "Ljava/lang/String;",
        "v",
        "()Ljava/lang/String;",
        "logTag",
        "Lii0/e;",
        "F",
        "Lii0/e;",
        "binding",
        "Lsc2/d;",
        "G",
        "Ll83/h;",
        "L",
        "()Lsc2/d;",
        "viewModel",
        "H",
        "a",
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
.field public static final H:Lcom/whoop/settings/strap/EditDeviceNameActivity$a;

.field public static final I:I


# instance fields
.field private final E:Ljava/lang/String;

.field private F:Lii0/e;

.field private final G:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/settings/strap/EditDeviceNameActivity$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/settings/strap/EditDeviceNameActivity$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->H:Lcom/whoop/settings/strap/EditDeviceNameActivity$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->I:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/i;-><init>()V

    const-string v0, "EditDeviceNameFragment"

    iput-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->E:Ljava/lang/String;

    new-instance v0, Lcom/whoop/settings/strap/EditDeviceNameActivity$d;

    invoke-direct {v0, p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity$d;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/settings/strap/EditDeviceNameActivity$e;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/settings/strap/EditDeviceNameActivity$e;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->G:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->Q(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p0

    return p0
.end method

.method public static synthetic B(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->U(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic D(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->N(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic E(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->V(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V

    return-void
.end method

.method public static synthetic F(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->W(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    return-void
.end method

.method public static synthetic G(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->X(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V

    return-void
.end method

.method public static synthetic H(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->T(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic I(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->R(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->O(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K(Lcom/whoop/settings/strap/EditDeviceNameActivity;)Lsc2/d;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object p0

    return-object p0
.end method

.method private final L()Lsc2/d;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->G:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lsc2/d;

    return-object v0
.end method

.method private final M()V
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClickableViewAccessibility"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    const/4 v1, 0x0

    const-string v2, "binding"

    if-eqz v0, :cond_6

    iget-object v0, v0, Lii0/e;->f:Landroid/widget/TextView;

    const-string v3, "editDeviceNameSave"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lsc2/a;

    const/4 v4, 0x0

    invoke-direct {v3, p0, v4}, Lsc2/a;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-static {v0, v3}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_5

    iget-object v0, v0, Lii0/e;->b:Landroid/widget/TextView;

    const-string v3, "editDeviceNameDefault"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lsc2/a;

    const/4 v4, 0x1

    invoke-direct {v3, p0, v4}, Lsc2/a;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-static {v0, v3}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_4

    iget-object v0, v0, Lii0/e;->i:Landroid/view/View;

    const-string v3, "editDeviceNameTransparentToolbarSpace"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lsc2/a;

    const/4 v4, 0x2

    invoke-direct {v3, p0, v4}, Lsc2/a;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-static {v0, v3}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_3

    iget-object v0, v0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    new-instance v3, Lsc2/b;

    invoke-direct {v3, p0}, Lsc2/b;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;)V

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_2

    iget-object v0, v0, Lii0/e;->g:Landroid/widget/ImageView;

    const-string v3, "editDeviceNameSheetHandleIv"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v3, Lsc2/a;

    const/4 v4, 0x3

    invoke-direct {v3, p0, v4}, Lsc2/a;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-static {v0, v3}, Las2/c;->a(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_1

    iget-object v0, v0, Lii0/e;->h:Landroid/widget/TextView;

    new-instance v3, Lcom/whoop/settings/strap/EditDeviceNameActivity$c;

    invoke-direct {v3, p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity$c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz v0, :cond_0

    iget-object v0, v0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    const-string v1, "editDeviceNameInput"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/settings/strap/EditDeviceNameActivity$b;

    invoke-direct {v1, p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity$b;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;)V

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    return-void

    :cond_0
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_1
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_2
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_3
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_4
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_5
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1

    :cond_6
    invoke-static {v2}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v1
.end method

.method private static final N(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p1, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p1, :cond_0

    iget-object p1, p1, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p1}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object p0

    invoke-virtual {p0, p1}, Lsc2/d;->L(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final O(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object p0

    const-string p1, ""

    invoke-virtual {p0, p1}, Lsc2/d;->L(Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x4

    if-ne p2, p1, :cond_1

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object p1

    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lsc2/d;->L(Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method private static final R(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private final S()V
    .locals 3

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lsc2/d;->C()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lsc2/c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lsc2/c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-virtual {p0, v0, v1}, Lhj0/i;->y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lsc2/d;->B()Lor2/s0;

    move-result-object v0

    new-instance v1, Lsc2/c;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lsc2/c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-virtual {p0, v0, v1}, Lhj0/i;->y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lsc2/d;->E()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lsc2/c;

    const/4 v2, 0x2

    invoke-direct {v1, p0, v2}, Lsc2/c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-virtual {p0, v0, v1}, Lhj0/i;->y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lsc2/d;->D()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lsc2/c;

    const/4 v2, 0x3

    invoke-direct {v1, p0, v2}, Lsc2/c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-virtual {p0, v0, v1}, Lhj0/i;->y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object v0

    invoke-virtual {v0}, Lsc2/d;->F()Landroidx/lifecycle/p0;

    move-result-object v0

    new-instance v1, Lsc2/c;

    const/4 v2, 0x4

    invoke-direct {v1, p0, v2}, Lsc2/c;-><init>(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V

    invoke-virtual {p0, v0, v1}, Lhj0/i;->y(Landroidx/lifecycle/p0;Landroidx/lifecycle/v0;)V

    return-void
.end method

.method private static final T(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void

    :cond_0
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final U(Lcom/whoop/settings/strap/EditDeviceNameActivity;Ljava/lang/String;)V
    .locals 2

    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0}, Landroid/content/Intent;-><init>()V

    const-string v1, "deviceNameExtra"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    const/4 p1, -0x1

    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->setResult(ILandroid/content/Intent;)V

    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    return-void
.end method

.method private static final V(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V
    .locals 2

    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    const/4 p1, 0x0

    const-string v0, "binding"

    if-eqz p0, :cond_2

    iget-object v1, p0, Lii0/e;->f:Landroid/widget/TextView;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lii0/e;->c:Lcom/google/android/material/textfield/TextInputEditText;

    invoke-virtual {p0}, Landroidx/appcompat/widget/AppCompatEditText;->getText()Landroid/text/Editable;

    move-result-object p0

    const/4 p1, 0x0

    if-eqz p0, :cond_0

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    const/4 v0, 0x1

    xor-int/2addr p0, v0

    if-ne p0, v0, :cond_0

    move p1, v0

    :cond_0
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setEnabled(Z)V

    return-void

    :cond_1
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw p1
.end method

.method private static final W(Lcom/whoop/settings/strap/EditDeviceNameActivity;I)V
    .locals 1

    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    invoke-virtual {p0, p1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    const-string p1, ""

    :goto_0
    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p0, :cond_1

    iget-object p0, p0, Lii0/e;->d:Lcom/google/android/material/textfield/TextInputLayout;

    invoke-virtual {p0, p1}, Lcom/google/android/material/textfield/TextInputLayout;->setError(Ljava/lang/CharSequence;)V

    return-void

    :cond_1
    const-string p0, "binding"

    invoke-static {p0}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    const/4 p0, 0x0

    throw p0
.end method

.method private static final X(Lcom/whoop/settings/strap/EditDeviceNameActivity;Z)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "binding"

    if-eqz p1, :cond_1

    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p0, :cond_0

    iget-object p0, p0, Lii0/e;->e:Landroid/widget/ProgressBar;

    const/4 p1, 0x0

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_0
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object p0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    if-eqz p0, :cond_2

    iget-object p0, p0, Lii0/e;->e:Landroid/widget/ProgressBar;

    const/16 p1, 0x8

    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    invoke-static {v1}, Lkotlin/jvm/internal/k;->q(Ljava/lang/String;)V

    throw v0
.end method

.method public static synthetic z(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->P(Lcom/whoop/settings/strap/EditDeviceNameActivity;Landroid/view/View;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 1

    invoke-super {p0, p1}, Lhj0/i;->onCreate(Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object p1

    invoke-static {p1}, Lii0/e;->c(Landroid/view/LayoutInflater;)Lii0/e;

    move-result-object p1

    const-string v0, "inflate(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->F:Lii0/e;

    invoke-virtual {p1}, Landroidx/databinding/a0;->getRoot()Landroid/view/View;

    move-result-object p1

    invoke-virtual {p0, p1}, Lm/m;->setContentView(Landroid/view/View;)V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->S()V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->M()V

    invoke-direct {p0}, Lcom/whoop/settings/strap/EditDeviceNameActivity;->L()Lsc2/d;

    move-result-object p1

    invoke-virtual {p1}, Lsc2/d;->I()V

    return-void
.end method

.method public v()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/strap/EditDeviceNameActivity;->E:Ljava/lang/String;

    return-object v0
.end method
