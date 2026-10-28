.class public final Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;
.super Landroidx/fragment/app/m0;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u000f\u0010\t\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\n\u0010\u0003J+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016\u00a2\u0006\u0004\u0008\u0010\u0010\u0011R\u001b\u0010\u0017\u001a\u00020\u00128BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u0014\u001a\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;",
        "Landroidx/fragment/app/m0;",
        "<init>",
        "()V",
        "Landroid/os/Bundle;",
        "savedInstanceState",
        "Ll83/a0;",
        "onCreate",
        "(Landroid/os/Bundle;)V",
        "onResume",
        "onPause",
        "Landroid/view/LayoutInflater;",
        "inflater",
        "Landroid/view/ViewGroup;",
        "container",
        "Landroidx/compose/ui/platform/ComposeView;",
        "onCreateView",
        "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;",
        "Ldp0/g;",
        "w",
        "Ll83/h;",
        "B",
        "()Ldp0/g;",
        "globalCoachManager",
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


# instance fields
.field private final w:Ll83/h;


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Landroidx/fragment/app/m0;-><init>()V

    sget-object v0, Ll83/i;->w:Ll83/i;

    new-instance v1, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2, v2}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment$a;-><init>(Landroid/content/ComponentCallbacks;Lvf3/a;Lc93/a;)V

    invoke-static {v0, v1}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->w:Ll83/h;

    return-void
.end method

.method public static synthetic A(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Ly31/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->E(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Ly31/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final B()Ldp0/g;
    .locals 1

    iget-object v0, p0, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->w:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldp0/g;

    return-object v0
.end method

.method private static final C(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p2, v3

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_5

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-nez p2, :cond_1

    if-ne v0, v1, :cond_2

    :cond_1
    new-instance v0, Lh02/n0;

    const/4 p2, 0x7

    invoke-direct {v0, p0, p2}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    check-cast v0, Lc93/a;

    invoke-virtual {p1, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez p2, :cond_3

    if-ne v3, v1, :cond_4

    :cond_3
    new-instance v3, Lhb2/c;

    const/4 p2, 0x0

    invoke-direct {v3, p0, p2}, Lhb2/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3, p1, v2}, Lhb2/d;->m(Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/squareup/wire/n;->z(Landroidx/fragment/app/m0;)Leb/a0;

    move-result-object p0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Ly31/a;)Ll83/a0;
    .locals 21

    const-string v0, "button"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ly31/a;->a()Lcom/whoop/navigation/AiAction;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v1}, Lcom/whoop/navigation/AiAction;->getEntrypointExperience()Lcom/whoop/navigation/ChatEntrypointExperience;

    move-result-object v0

    sget-object v2, Lcom/whoop/navigation/ChatEntrypointExperience;->FAB_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    if-ne v0, v2, :cond_0

    sget-object v16, Lcom/whoop/navigation/ChatEntrypointExperience;->QUICK_VOICE:Lcom/whoop/navigation/ChatEntrypointExperience;

    const v19, 0x1bfff

    const/16 v20, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v1 .. v20}, Lcom/whoop/navigation/AiAction;->copy$default(Lcom/whoop/navigation/AiAction;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/ChatEntrypointExperience;Ljava/util/Map;Lcom/whoop/navigation/DrawerPresentation;ILjava/lang/Object;)Lcom/whoop/navigation/AiAction;

    move-result-object v1

    :cond_0
    invoke-direct/range {p0 .. p0}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->B()Ldp0/g;

    move-result-object v2

    const/4 v0, 0x1

    invoke-static {v1, v0}, Lcom/whoop/coacheverywherecommon/models/a;->b(Lcom/whoop/navigation/AiAction;Z)Lep0/j;

    move-result-object v6

    const/4 v7, 0x3

    const/4 v8, 0x0

    const-wide/16 v3, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Ldp0/g;->f(Ldp0/g;JLjava/lang/String;Lep0/j;ILjava/lang/Object;)V

    :cond_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static synthetic y(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->D(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic z(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->C(Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public onCreate(Landroid/os/Bundle;)V
    .locals 0

    invoke-super {p0, p1}, Landroidx/fragment/app/m0;->onCreate(Landroid/os/Bundle;)V

    invoke-static {p0}, Lor2/g0;->l(Landroidx/fragment/app/m0;)V

    return-void
.end method

.method public bridge synthetic onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
    .locals 1

    const-string p2, "inflater"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    new-instance p1, Lej1/h;

    const/16 p2, 0x1d

    invoke-direct {p1, p0, p2}, Lej1/h;-><init>(Ljava/lang/Object;I)V

    .line 3
    new-instance p2, Lx1/b;

    const/4 p3, 0x1

    const v0, 0x5f6f4103

    invoke-direct {p2, p1, p3, v0}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    .line 4
    invoke-static {p0, p2}, Lkd1/b0;->c(Landroidx/fragment/app/m0;Lc93/m;)Landroidx/compose/ui/platform/ComposeView;

    move-result-object p1

    return-object p1
.end method

.method public onPause()V
    .locals 3

    invoke-super {p0}, Landroidx/fragment/app/m0;->onPause()V

    invoke-direct {p0}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->B()Ldp0/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-static {v0, v1, v2, v1}, Ldp0/g;->A(Ldp0/g;Ljava/lang/String;ILjava/lang/Object;)V

    return-void
.end method

.method public onResume()V
    .locals 4

    invoke-super {p0}, Landroidx/fragment/app/m0;->onResume()V

    invoke-direct {p0}, Lcom/whoop/settings/debug/AiChatTalkTextCardDebugFragment;->B()Ldp0/g;

    move-result-object v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x1

    invoke-static {v0, v3, v1, v2, v1}, Ldp0/g;->k(Ldp0/g;ZLep0/j;ILjava/lang/Object;)V

    return-void
.end method
