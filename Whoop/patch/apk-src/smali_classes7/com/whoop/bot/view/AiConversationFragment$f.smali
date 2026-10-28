.class final Lcom/whoop/bot/view/AiConversationFragment$f;
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
    c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$9$1$1"
    f = "AiConversationFragment.kt"
    l = {
        0xb1,
        0xb3
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/bot/view/AiConversationFragment;

.field final synthetic y:Lp1/c1;
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
            "Lcom/whoop/bot/view/AiConversationFragment$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p2, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->y:Lp1/c1;

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

    new-instance p1, Lcom/whoop/bot/view/AiConversationFragment$f;

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->y:Lp1/c1;

    invoke-direct {p1, v0, v1, p2}, Lcom/whoop/bot/view/AiConversationFragment$f;-><init>(Lcom/whoop/bot/view/AiConversationFragment;Lp1/c1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/view/AiConversationFragment$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->w:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->x:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {p1}, Lcom/whoop/bot/view/AiConversationFragment;->R(Lcom/whoop/bot/view/AiConversationFragment;)La6/g;

    move-result-object p1

    invoke-static {}, Lsl0/l0;->a()Lf6/d;

    move-result-object v1

    iput v3, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->w:I

    const-string v4, "true"

    invoke-static {p1, v1, v4, p0}, Lkh2/a;->c(La6/g;Lf6/d;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->y:Lp1/c1;

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {p1, v1}, Lcom/whoop/bot/view/AiConversationFragment;->W(Lp1/c1;Ljava/lang/Boolean;)V

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->x:Lcom/whoop/bot/view/AiConversationFragment;

    iput v2, p0, Lcom/whoop/bot/view/AiConversationFragment$f;->w:I

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p1, v1, p0, v3, v2}, Lcom/whoop/bot/view/AiConversationFragment;->d0(Lcom/whoop/bot/view/AiConversationFragment;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
