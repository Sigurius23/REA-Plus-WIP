.class public final Lcom/whoop/profile/view/ProfileFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0012\u0010\u0003R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u0015\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/profile/view/ProfileFragment;",
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
        "onResume",
        "Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "actionRouter$delegate",
        "Ll83/h;",
        "getActionRouter",
        "()Lcom/whoop/profile/navigation/ProfileActionRouter;",
        "actionRouter",
        "Lj02/o0;",
        "navigator$delegate",
        "getNavigator",
        "()Lj02/o0;",
        "navigator",
        "profile_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final actionRouter$delegate:Ll83/h;

.field private final navigator$delegate:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 4

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/profile/view/ProfileFragment$special$$inlined$inject$default$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/profile/view/ProfileFragment$special$$inlined$inject$default$1;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v1

    iput-object v1, p0, Lcom/whoop/profile/view/ProfileFragment;->actionRouter$delegate:Ll83/h;

    new-instance v1, La1/j;

    const/16 v3, 0x12

    invoke-direct {v1, p0, v3}, La1/j;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lcom/whoop/profile/view/ProfileFragment$special$$inlined$inject$default$2;

    invoke-direct {v3, p0, v2, v1}, Lcom/whoop/profile/view/ProfileFragment$special$$inlined$inject$default$2;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/profile/view/ProfileFragment;->navigator$delegate:Ll83/h;

    return-void
.end method

.method private final getActionRouter()Lcom/whoop/profile/navigation/ProfileActionRouter;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragment;->actionRouter$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/profile/navigation/ProfileActionRouter;

    return-object v0
.end method

.method private final getNavigator()Lj02/o0;
    .locals 1

    iget-object v0, p0, Lcom/whoop/profile/view/ProfileFragment;->navigator$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj02/o0;

    return-object v0
.end method

.method private static final navigator_delegate$lambda$0(Lcom/whoop/profile/view/ProfileFragment;)Luf3/a;
    .locals 0

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->requireActivity()Landroidx/fragment/app/r0;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final onCreateView$lambda$0(Lcom/whoop/profile/view/ProfileFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v13, p1

    check-cast v13, Lp1/q;

    invoke-virtual {v13, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    const-string v3, "source"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lor2/o1;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_3

    :cond_2
    move-object v0, v1

    :cond_3
    if-nez v0, :cond_4

    const-string v0, "unknown_source"

    :cond_4
    move-object v9, v0

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    const/4 v3, -0x1

    if-eqz v0, :cond_5

    const-string v4, "targetUserId"

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eq v0, v3, :cond_5

    move-object v10, v4

    goto :goto_2

    :cond_5
    move-object v10, v1

    :goto_2
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_6

    const-string v4, "communityId"

    invoke-virtual {v0, v4, v3}, Landroid/os/BaseBundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    if-eq v0, v3, :cond_6

    move-object v11, v4

    goto :goto_3

    :cond_6
    move-object v11, v1

    :goto_3
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getArguments()Landroid/os/Bundle;

    move-result-object v0

    if-eqz v0, :cond_7

    const-string v3, "educationType"

    invoke-virtual {v0, v3}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    move-object v12, v0

    goto :goto_4

    :cond_7
    move-object v12, v1

    :goto_4
    const-string v0, "ProfileNavHost"

    const/4 v3, 0x6

    invoke-static {v0, v1, v13, v3, v2}, Lj02/a1;->a(Ljava/lang/String;Lj02/l0;Landroidx/compose/runtime/Composer;II)Leb/u0;

    move-result-object v5

    new-instance v3, Lcom/whoop/profile/navigation/ProfileNavigationRouter;

    invoke-static/range {p0 .. p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object v0

    invoke-direct/range {p0 .. p0}, Lcom/whoop/profile/view/ProfileFragment;->getNavigator()Lj02/o0;

    move-result-object v1

    sget-object v2, Ltr2/n;->a:Ltr2/n$a;

    const-string v4, "ProfileNavigationRouter"

    invoke-virtual {v2, v4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v4

    invoke-direct {v3, v5, v0, v1, v4}, Lcom/whoop/profile/navigation/ProfileNavigationRouter;-><init>(Leb/u0;Leb/a0;Lj02/o0;Ltr2/n;)V

    invoke-direct/range {p0 .. p0}, Lcom/whoop/profile/view/ProfileFragment;->getActionRouter()Lcom/whoop/profile/navigation/ProfileActionRouter;

    move-result-object v4

    const-string v0, "ProfileScreen"

    invoke-virtual {v2, v0}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    move-result-object v8

    const/4 v14, 0x0

    const/16 v15, 0x10

    const/4 v7, 0x0

    invoke-static/range {v3 .. v15}, Lcom/whoop/profile/view/navigation/ProfileNavHostKt;->ProfileNavHost(Lcom/whoop/profile/navigation/ProfileNavigationRouter;Lcom/whoop/profile/navigation/ProfileActionRouter;Leb/u0;Ltr2/n;Ljava/lang/String;Landroidx/fragment/app/r0;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_8
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/profile/view/ProfileFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/profile/view/ProfileFragment;->onCreateView$lambda$0(Lcom/whoop/profile/view/ProfileFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/profile/view/ProfileFragment;)Luf3/a;
    .locals 0

    invoke-static {p0}, Lcom/whoop/profile/view/ProfileFragment;->navigator_delegate$lambda$0(Lcom/whoop/profile/view/ProfileFragment;)Luf3/a;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/profile/view/ProfileFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lci0/a;

    const/4 p2, 0x5

    invoke-direct {p1, p0, p2}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x1ebe2bc7

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onResume()V
    .locals 0

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 1

    const-string v0, "view"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-super {p0, p1, p2}, Landroidx/fragment/app/m0;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    invoke-virtual {p0}, Landroidx/fragment/app/m0;->getActivity()Landroidx/fragment/app/r0;

    return-void
.end method
