.class public final Lcom/whoop/mfa/setup/view/MfaSetupFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/mfa/setup/view/MfaSetupFragment$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001eB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010\u0016\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001c\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0016\u001a\u0004\u0008\u001b\u0010\u0018\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/mfa/setup/view/MfaSetupFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Ltr2/n;",
        "w",
        "Ltr2/n;",
        "logger",
        "",
        "x",
        "Ll83/h;",
        "F",
        "()Ljava/lang/String;",
        "source",
        "y",
        "E",
        "enforcementTag",
        "z",
        "a",
        "mfa_release"
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

.field public static final z:Lcom/whoop/mfa/setup/view/MfaSetupFragment$a;


# instance fields
.field private final w:Ltr2/n;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/mfa/setup/view/MfaSetupFragment$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/mfa/setup/view/MfaSetupFragment$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->z:Lcom/whoop/mfa/setup/view/MfaSetupFragment$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->E:I

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "MfaSetupFragment"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->w:Ltr2/n;

    new-instance v0, Laz1/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Laz1/d;-><init>(Lcom/whoop/mfa/setup/view/MfaSetupFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->x:Ll83/h;

    new-instance v0, Laz1/d;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Laz1/d;-><init>(Lcom/whoop/mfa/setup/view/MfaSetupFragment;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lyy1/d;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->H(Lyy1/d;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/mfa/setup/view/MfaSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->G(Lcom/whoop/mfa/setup/view/MfaSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic C(Lyy1/d;Lyy1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->I(Lyy1/d;Lyy1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final D(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "enforcementTag"

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

.method private final E()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final F()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private static final G(Lcom/whoop/mfa/setup/view/MfaSetupFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 17

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v7, Lyy1/d;

    invoke-static/range {p0 .. p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v9

    const-string v0, "requireContext(...)"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    const-class v3, Ljs0/c;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    const/4 v4, 0x0

    invoke-virtual {v0, v4, v3, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v10, v0

    check-cast v10, Ljs0/c;

    invoke-static/range {p0 .. p0}, Lpf/c;->A(Landroid/content/ComponentCallbacks;)Lxf3/c;

    move-result-object v0

    const-class v3, Lpy1/a;

    invoke-virtual {v2, v3}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    invoke-virtual {v0, v4, v2, v4}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v0

    move-object v11, v0

    check-cast v11, Lpy1/a;

    invoke-direct/range {p0 .. p0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->F()Ljava/lang/String;

    move-result-object v13

    invoke-direct/range {p0 .. p0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->E()Ljava/lang/String;

    move-result-object v14

    const/16 v15, 0x10

    const/16 v16, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v7 .. v16}, Lyy1/d;-><init>(Leb/a0;Landroid/content/Context;Ljs0/c;Lpy1/a;Ltr2/n;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v0, v7

    :cond_1
    check-cast v0, Lyy1/d;

    invoke-direct/range {p0 .. p0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->F()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2

    if-ne v4, v1, :cond_3

    :cond_2
    new-instance v4, Laz1/e;

    const/4 v3, 0x0

    invoke-direct {v4, v0, v3}, Laz1/e;-><init>(Lyy1/d;I)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_4

    if-ne v5, v1, :cond_5

    :cond_4
    new-instance v5, Laz1/e;

    const/4 v1, 0x1

    invoke-direct {v5, v0, v1}, Laz1/e;-><init>(Lyy1/d;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v3, 0x0

    invoke-static/range {v2 .. v8}, Laz1/n;->x(Ljava/lang/String;Lj02/l0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_6
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final H(Lyy1/d;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lyy1/c$e;

    invoke-direct {v0, p1}, Lyy1/c$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lyy1/d;->d(Lyy1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lyy1/d;Lyy1/c;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lyy1/d;->d(Lyy1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object p0

    if-eqz p0, :cond_0

    const-string v0, "source"

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

.method public static synthetic y(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->D(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->J(Lcom/whoop/mfa/setup/view/MfaSetupFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    iget-object p1, p0, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->w:Ltr2/n;

    invoke-static {p0, p1}, Lor2/g0;->f(Landroidx/fragment/app/m0;Ltr2/n;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/mfa/setup/view/MfaSetupFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, La80/c;

    const/4 p2, 0x6

    invoke-direct {p1, p0, p2}, La80/c;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x51d4da77

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method
