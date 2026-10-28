.class public final Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u0014\u001a\u0004\u0008\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u0014\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006$\u00b2\u0006\u000c\u0010#\u001a\u00020\"8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Landroid/view/View;",
        "view",
        "Ll83/a0;",
        "onViewCreated",
        "(Landroid/view/View;Landroid/os/Bundle;)V",
        "Lue2/c;",
        "w",
        "Ll83/h;",
        "E",
        "()Lue2/c;",
        "viewModel",
        "",
        "x",
        "C",
        "()Ljava/lang/String;",
        "notificationId",
        "Lre2/b;",
        "y",
        "D",
        "()Lre2/b;",
        "turnoffAlarmWarningAnalyticHelper",
        "Lue2/a;",
        "viewState",
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
.field private final w:Ll83/h;

.field private final x:Ll83/h;

.field private final y:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    new-instance v0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->w:Ll83/h;

    new-instance v0, Lsc0/c;

    const/16 v1, 0x1b

    invoke-direct {v0, p0, v1}, Lsc0/c;-><init>(Ljava/lang/Object;I)V

    invoke-static {v0}, Lq83/g;->H(Lc93/a;)Ll83/p;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->x:Ll83/h;

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$a;

    invoke-direct {v1, p0, v3, v3}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->y:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lte2/a;Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lte2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->I(Lte2/a;Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lte2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic B(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lre2/a$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->J(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lre2/a$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final C()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    return-object v0
.end method

.method private final D()Lre2/b;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->y:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lre2/b;

    return-object v0
.end method

.method private final E()Lue2/c;
    .locals 1

    iget-object v0, p0, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lue2/c;

    return-object v0
.end method

.method private static final F(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireArguments()Landroid/os/Bundle;

    move-result-object p0

    const-string v0, "notificationTileId"

    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final G(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

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

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->E()Lue2/c;

    move-result-object p1

    invoke-virtual {p1}, Lue2/c;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lue2/a$b;

    const/16 v10, 0xf

    const/4 v11, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lue2/a$b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, p1, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    new-instance p2, Lte2/a;

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct {p2, v0}, Lte2/a;-><init>(Leb/a0;)V

    invoke-static {p1}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->H(Lp1/t2;)Lue2/a;

    move-result-object v1

    invoke-virtual {v4, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr p1, v0

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne v0, v2, :cond_2

    :cond_1
    new-instance v0, Lum0/b;

    const/4 p1, 0x6

    invoke-direct {v0, p1, p2, p0}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v4, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v2, :cond_4

    :cond_3
    new-instance p2, Luo1/b;

    const/16 p1, 0x8

    invoke-direct {p2, p0, p1}, Luo1/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p2

    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v2, v0

    invoke-static/range {v1 .. v6}, Lve2/b;->g(Lue2/a;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/t2;)Lue2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lue2/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lue2/a;

    return-object p0
.end method

.method private static final I(Lte2/a;Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lte2/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lte2/b$a;

    if-eqz v0, :cond_0

    check-cast p2, Lte2/b$a;

    invoke-virtual {p0, p2}, Lte2/a;->a(Lte2/b$a;)V

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lte2/b$b;

    if-eqz p0, :cond_1

    invoke-direct {p1}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->E()Lue2/c;

    move-result-object p0

    check-cast p2, Lte2/b$b;

    invoke-virtual {p0, p2}, Lue2/c;->o(Lte2/b$b;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final J(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Lre2/a$a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->D()Lre2/b;

    move-result-object p0

    invoke-virtual {p0, p1}, Lre2/b;->a(Lre2/a$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic y(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->G(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->F(Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Ltx0/a;

    const/16 p2, 0x14

    invoke-direct {p1, p0, p2}, Ltx0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x44d42720

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    invoke-direct {p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->E()Lue2/c;

    move-result-object p1

    new-instance p2, Lte2/b$b$b;

    invoke-direct {p0}, Lcom/whoop/sleep/coach/alarmWarning/view/TurnoffAlarmWarningFragment;->C()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p2, v0}, Lte2/b$b$b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Lue2/c;->o(Lte2/b$b;)V

    return-void
.end method
