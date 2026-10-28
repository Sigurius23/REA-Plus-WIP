.class final Lcom/whoop/bot/view/AiConversationFragment$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/bot/view/AiConversationFragment;->onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroidx/compose/ui/platform/ComposeView;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$2$1"
    f = "AiConversationFragment.kt"
    l = {
        0x76
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lcom/whoop/bot/view/AiConversationFragment;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/bot/view/AiConversationFragment;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/view/AiConversationFragment$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p2, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->z:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lcom/whoop/bot/view/AiConversationFragment$d;

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->z:Lp1/c1;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/bot/view/AiConversationFragment$d;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/view/AiConversationFragment$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->w:Ljava/lang/Object;

    check-cast v0, Lp1/c1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->z:Lp1/c1;

    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->x:I

    invoke-static {v1, p0}, Lcom/whoop/bot/view/AiConversationFragment;->X(Lcom/whoop/bot/view/AiConversationFragment;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_2

    return-object v0

    :cond_2
    move-object v0, p1

    move-object p1, v1

    :goto_0
    check-cast p1, Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lcom/whoop/bot/view/AiConversationFragment;->W(Lp1/c1;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {p1}, Lcom/whoop/bot/view/AiConversationFragment;->S(Lcom/whoop/bot/view/AiConversationFragment;)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object p1

    const-string v0, "whoop-coach-weather-gps-android"

    invoke-interface {p1, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p1

    if-nez p1, :cond_3

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {p1}, Lcom/whoop/bot/view/AiConversationFragment;->T(Lcom/whoop/bot/view/AiConversationFragment;)Lnl0/e;

    move-result-object p1

    new-instance v0, Lnl0/d$h;

    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v1}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v1

    invoke-virtual {v1}, Lsl0/n0;->b()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v2}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v2

    invoke-virtual {v2}, Lsl0/n0;->c()Ljava/lang/String;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v3}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v3

    invoke-virtual {v3}, Lsl0/n0;->n()Ljava/lang/String;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v4}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v4

    invoke-virtual {v4}, Lsl0/n0;->i()Ljava/lang/String;

    move-result-object v4

    iget-object v5, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v5}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v5

    invoke-virtual {v5}, Lsl0/n0;->h()Z

    move-result v5

    iget-object v6, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v6}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v6

    invoke-virtual {v6}, Lsl0/n0;->l()Ljava/lang/String;

    move-result-object v7

    iget-object v6, p0, Lcom/whoop/bot/view/AiConversationFragment$d;->y:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v6}, Lcom/whoop/bot/view/AiConversationFragment;->P(Lcom/whoop/bot/view/AiConversationFragment;)Lsl0/n0;

    move-result-object v6

    invoke-virtual {v6}, Lsl0/n0;->a()Ljava/util/Map;

    move-result-object v8

    const/16 v9, 0x20

    const/4 v10, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v10}, Lnl0/d$h;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p1, v0}, Lnl0/e;->o(Lnl0/d;)V

    :cond_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
