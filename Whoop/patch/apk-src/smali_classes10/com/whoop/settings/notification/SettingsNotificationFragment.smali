.class public final Lcom/whoop/settings/notification/SettingsNotificationFragment;
.super Lhj0/m;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0006\u0010\u0003J+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0008\u001a\u00020\u00072\u0008\u0010\n\u001a\u0004\u0018\u00010\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000bH\u0016\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0003R\u001a\u0010\u0016\u001a\u00020\u00118\u0016X\u0096D\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0014\u0010\u0015R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0018\u0010\u0019\u001a\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001f\u00b2\u0006\u000c\u0010\u001e\u001a\u00020\u001d8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/settings/notification/SettingsNotificationFragment;",
        "Lhj0/m;",
        "<init>",
        "()V",
        "Ll83/a0;",
        "M",
        "N",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Landroid/view/View;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;",
        "onResume",
        "",
        "w",
        "Ljava/lang/String;",
        "getLogTag",
        "()Ljava/lang/String;",
        "logTag",
        "Lcom/whoop/settings/notification/e;",
        "x",
        "Ll83/h;",
        "L",
        "()Lcom/whoop/settings/notification/e;",
        "viewModel",
        "Lic2/g;",
        "viewState",
        "settings_release"
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
.field private final w:Ljava/lang/String;

.field private final x:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Lhj0/m;-><init>()V

    const-string v0, "SettingsNotificationFragment"

    iput-object v0, p0, Lcom/whoop/settings/notification/SettingsNotificationFragment;->w:Ljava/lang/String;

    new-instance v0, Lcom/whoop/settings/notification/SettingsNotificationFragment$b;

    invoke-direct {v0, p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment$b;-><init>(Landroid/content/ComponentCallbacks;)V

    sget-object v1, Ll83/i;->y:Ll83/i;

    new-instance v2, Lcom/whoop/settings/notification/SettingsNotificationFragment$c;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v3, v0, v3}, Lcom/whoop/settings/notification/SettingsNotificationFragment$c;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;Lc93/a;)V

    invoke-static {v1, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/notification/SettingsNotificationFragment;->x:Ll83/h;

    return-void
.end method

.method public static synthetic E(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;ZZ)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->S(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;ZZ)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic F(Lcom/whoop/settings/notification/SettingsNotificationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->O(Lcom/whoop/settings/notification/SettingsNotificationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic G(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->Q(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic H(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->R(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic I(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->T(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic J(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->U(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic K(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Lcom/whoop/settings/notification/e;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->L()Lcom/whoop/settings/notification/e;

    move-result-object p0

    return-object p0
.end method

.method private final L()Lcom/whoop/settings/notification/e;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/notification/SettingsNotificationFragment;->x:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/settings/notification/e;

    return-object v0
.end method

.method private final M()V
    .locals 3

    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.settings.APP_NOTIFICATION_SETTINGS"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v1

    const-string v2, "android.provider.extra.APP_PACKAGE"

    invoke-virtual {v0, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    const-string v1, "putExtra(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Landroidx/fragment/app/m0;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method private final N()V
    .locals 2

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    const-string v1, "android-app://com.whoop/settings/shepherdNotificationHistoryFragment"

    invoke-static {v1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v1

    invoke-virtual {v0, v1}, Leb/a0;->q(Landroid/net/Uri;)V

    return-void
.end method

.method private static final O(Lcom/whoop/settings/notification/SettingsNotificationFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p1, :cond_b

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->L()Lcom/whoop/settings/notification/e;

    move-result-object p1

    invoke-virtual {p1}, Lcom/whoop/settings/notification/e;->getViewState()Lec3/l;

    move-result-object v1

    new-instance v2, Lic2/g;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object v5, v2

    invoke-direct/range {v5 .. v11}, Lic2/g;-><init>(ZLjava/util/List;Lic2/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x0

    const/4 v6, 0x2

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->P(Lp1/t2;)Lic2/g;

    move-result-object v1

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-nez p1, :cond_1

    if-ne p2, v0, :cond_2

    :cond_1
    new-instance p2, Lic2/d;

    const/4 p1, 0x0

    invoke-direct {p2, p0, p1}, Lic2/d;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v2, p2

    check-cast v2, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_3

    if-ne p2, v0, :cond_4

    :cond_3
    new-instance p2, Lic2/c;

    const/4 p1, 0x1

    invoke-direct {p2, p0, p1}, Lic2/c;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    move-object v3, p2

    check-cast v3, Lc93/m;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p1, :cond_5

    if-ne p2, v0, :cond_6

    :cond_5
    new-instance p2, Lb30/a1;

    const/16 p1, 0x14

    invoke-direct {p2, p0, p1}, Lb30/a1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p2, Lkotlin/jvm/functions/Function3;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez p1, :cond_7

    if-ne v5, v0, :cond_8

    :cond_7
    new-instance v5, Lic2/d;

    const/4 p1, 0x1

    invoke-direct {v5, p0, p1}, Lic2/d;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v5, Lc93/a;

    invoke-virtual {v4, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez p1, :cond_9

    if-ne v6, v0, :cond_a

    :cond_9
    new-instance v6, Lic2/d;

    const/4 p1, 0x2

    invoke-direct {v6, p0, p1}, Lic2/d;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lc93/a;

    const/4 v8, 0x0

    move-object v7, v4

    move-object v4, p2

    invoke-static/range {v1 .. v8}, Lic2/f;->r(Lic2/g;Lc93/a;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_b
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lp1/t2;)Lic2/g;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lic2/g;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lic2/g;

    return-object p0
.end method

.method private static final Q(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final R(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;Z)Ll83/a0;
    .locals 1

    const-string v0, "namespace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->L()Lcom/whoop/settings/notification/e;

    move-result-object p0

    new-instance v0, Lcom/whoop/settings/notification/d$b;

    invoke-direct {v0, p1, p2}, Lcom/whoop/settings/notification/d$b;-><init>(Ljava/lang/String;Z)V

    invoke-virtual {p0, v0}, Lcom/whoop/settings/notification/e;->o(Lcom/whoop/settings/notification/d;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final S(Lcom/whoop/settings/notification/SettingsNotificationFragment;Ljava/lang/String;ZZ)Ll83/a0;
    .locals 1

    const-string v0, "namespace"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->L()Lcom/whoop/settings/notification/e;

    move-result-object p0

    new-instance v0, Lcom/whoop/settings/notification/d$c;

    invoke-direct {v0, p1, p2, p3}, Lcom/whoop/settings/notification/d$c;-><init>(Ljava/lang/String;ZZ)V

    invoke-virtual {p0, v0}, Lcom/whoop/settings/notification/e;->o(Lcom/whoop/settings/notification/d;)Lbc3/k1;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final T(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->M()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final U(Lcom/whoop/settings/notification/SettingsNotificationFragment;)Ll83/a0;
    .locals 0

    invoke-direct {p0}, Lcom/whoop/settings/notification/SettingsNotificationFragment;->N()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public getLogTag()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/notification/SettingsNotificationFragment;->w:Ljava/lang/String;

    return-object v0
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p1, Lic2/c;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Lic2/c;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;I)V

    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, -0x429c6b93

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getViewLifecycleOwner()Landroidx/lifecycle/g0;

    move-result-object v0

    const-string v1, "getViewLifecycleOwner(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Landroidx/lifecycle/o1;->j(Landroidx/lifecycle/g0;)Landroidx/lifecycle/b0;

    move-result-object v0

    new-instance v1, Lcom/whoop/settings/notification/SettingsNotificationFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/settings/notification/SettingsNotificationFragment$a;-><init>(Lcom/whoop/settings/notification/SettingsNotificationFragment;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
