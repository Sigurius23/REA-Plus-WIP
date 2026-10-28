.class final Lcom/whoop/bot/view/AiConversationFragment$e;
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
    c = "com.whoop.bot.view.AiConversationFragment$onCreateView$1$3$1$1$1"
    f = "AiConversationFragment.kt"
    l = {
        0x9a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lsl0/q2;

.field final synthetic z:Lcom/whoop/bot/view/AiConversationFragment;


# direct methods
.method public constructor <init>(Lsl0/q2;Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsl0/q2;",
            "Lcom/whoop/bot/view/AiConversationFragment;",
            "Lp1/t2;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/view/AiConversationFragment$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->y:Lsl0/q2;

    iput-object p2, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->z:Lcom/whoop/bot/view/AiConversationFragment;

    iput-object p3, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->E:Lp1/t2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance p1, Lcom/whoop/bot/view/AiConversationFragment$e;

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->y:Lsl0/q2;

    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->z:Lcom/whoop/bot/view/AiConversationFragment;

    iget-object v2, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->E:Lp1/t2;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/bot/view/AiConversationFragment$e;-><init>(Lsl0/q2;Lcom/whoop/bot/view/AiConversationFragment;Lp1/t2;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/view/AiConversationFragment$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/bot/view/AiConversationFragment$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->y:Lsl0/q2;

    instance-of p1, p1, Lsl0/q2$a;

    if-eqz p1, :cond_2

    const-string p1, "camera"

    goto :goto_0

    :cond_2
    const-string p1, "picker"

    :goto_0
    iget-object v1, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->z:Lcom/whoop/bot/view/AiConversationFragment;

    invoke-static {v1}, Lcom/whoop/bot/view/AiConversationFragment;->Q(Lcom/whoop/bot/view/AiConversationFragment;)Lxk0/a;

    move-result-object v1

    iget-object v3, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->E:Lp1/t2;

    invoke-static {v3}, Lcom/whoop/bot/view/AiConversationFragment;->U(Lp1/t2;)Lnl0/f;

    move-result-object v3

    invoke-virtual {v3}, Lnl0/f;->c()Lnl0/a;

    move-result-object v3

    invoke-virtual {v3}, Lnl0/a;->e()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x0

    iput-object v4, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->w:Ljava/lang/Object;

    iput v2, p0, Lcom/whoop/bot/view/AiConversationFragment$e;->x:I

    invoke-virtual {v1, v3, p1, p0}, Lxk0/a;->P(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
