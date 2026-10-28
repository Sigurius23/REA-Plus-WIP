.class public final Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0016B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "onResume",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Lko0/b;",
        "w",
        "Ll83/h;",
        "B",
        "()Lko0/b;",
        "navRouter",
        "x",
        "a",
        "clinician-in-the-loop_release"
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
.field public static final x:Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$a;

.field public static final y:I


# instance fields
.field private final w:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->x:Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->y:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/16 v1, 0x19

    invoke-direct {v0, p0, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->D(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Lko0/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lko0/b;

    return-object v0
.end method

.method private static final C(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;)Luf3/a;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object v0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

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

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_6

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_1

    const-string v1, "appointmentId"

    invoke-virtual {p2, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-nez p2, :cond_2

    const-string p2, ""

    :cond_2
    invoke-virtual {p1, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast p2, Ljava/lang/String;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_4

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v2, Llc0/c;

    const/16 v0, 0x1c

    invoke-direct {v2, p0, v0}, Llc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 p0, 0x6

    invoke-static {p2, v2, p1, p0}, Lno0/s;->l(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_6
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Llo0/j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->B()Lko0/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lko0/b;->e(Llo0/j;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->C(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Llo0/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->E(Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;Llo0/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/clinicianintheloop/view/ClinicianSchedulingConfirmationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0xc

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x7f8ef3ac

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method
