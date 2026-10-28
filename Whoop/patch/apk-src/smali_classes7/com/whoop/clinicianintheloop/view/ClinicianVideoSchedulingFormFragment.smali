.class public final Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001bB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J+\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0007\u001a\u00020\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016\u00a2\u0006\u0004\u0008\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010\u0011\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u001c"
    }
    d2 = {
        "Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;",
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
        "Lko0/c;",
        "w",
        "Ll83/h;",
        "D",
        "()Lko0/c;",
        "navRouter",
        "Lio0/a;",
        "x",
        "C",
        "()Lio0/a;",
        "analyticsHelper",
        "y",
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
.field public static final y:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$a;

.field public static final z:I


# instance fields
.field private final w:Ll83/h;

.field private final x:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->y:Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->z:I

    return-void
.end method

.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Llive/hms/video/connection/degredation/a;

    const/16 v1, 0x1a

    invoke-direct {v0, p0, v1}, Llive/hms/video/connection/degredation/a;-><init>(Ljava/lang/Object;I)V

    sget-object v1, Ll83/i;->w:Ll83/i;

    new-instance v2, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$b;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$b;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->w:Ll83/h;

    new-instance v0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$c;

    invoke-direct {v0, p0, v3, v3}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v1, v0}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->H(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Llo0/r;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->G(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Llo0/r;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Lio0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio0/a;

    return-object v0
.end method

.method private final D()Lko0/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lko0/c;

    return-object v0
.end method

.method private static final E(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;)Luf3/a;
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

.method private static final F(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 9

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

    move-object v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    const-string p2, ""

    const/4 v0, 0x0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p1, v1, :cond_3

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v2, "usState"

    invoke-virtual {p1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v0

    :goto_1
    if-nez p1, :cond_2

    move-object p1, p2

    :cond_2
    invoke-virtual {v6, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast p1, Ljava/lang/String;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_6

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    if-eqz v2, :cond_4

    const-string v3, "intakeResponses"

    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_4
    move-object v2, v0

    :goto_2
    if-nez v2, :cond_5

    goto :goto_3

    :cond_5
    move-object p2, v2

    :goto_3
    invoke-virtual {v6, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, p2

    :cond_6
    check-cast v2, Ljava/lang/String;

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p2

    if-eqz p2, :cond_7

    const-string v0, "rescheduleAppointmentId"

    invoke-virtual {p2, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :cond_7
    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object p2, v0

    :cond_8
    move-object v3, p2

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_9

    if-ne v0, v1, :cond_a

    :cond_9
    new-instance v0, Lno0/u;

    const/4 p2, 0x0

    invoke-direct {v0, p0, p2}, Lno0/u;-><init>(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object v4, v0

    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez p2, :cond_b

    if-ne v0, v1, :cond_c

    :cond_b
    new-instance v0, Lno0/u;

    const/4 p2, 0x1

    invoke-direct {v0, p0, p2}, Lno0/u;-><init>(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v5, v0

    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/16 v7, 0x1b6

    const/4 v8, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v8}, Lno0/w;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_d
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final G(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Llo0/r;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->D()Lko0/c;

    move-result-object p0

    invoke-virtual {p0, p1}, Lko0/c;->b(Llo0/r;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Lcom/whoop/analytics/AnalyticEventModel;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->C()Lio0/a;

    move-result-object p0

    invoke-virtual {p0, p1}, Lio0/a;->b(Lcom/whoop/analytics/AnalyticEventModel;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->E(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->F(Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/clinicianintheloop/view/ClinicianVideoSchedulingFormFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lmw1/a;

    const/16 p2, 0xd

    invoke-direct {p1, p0, p2}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5bb2e0dc

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
