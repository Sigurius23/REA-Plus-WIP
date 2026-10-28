.class final Lsl0/u2$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lsl0/u2;->z(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.bot.view.MessageFeedbackViewKt$FeedbackV2SheetContent$1$1"
    f = "MessageFeedbackView.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lz1/p;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lz1/p;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Ljava/lang/String;

.field final synthetic z:Lcom/whoop/bot/models/feedback/AiMessageFeedback;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lz1/p;Lp1/c1;Lp1/c1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/feedback/AiMessageFeedback;",
            "Lz1/p;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lq83/d<",
            "-",
            "Lsl0/u2$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lsl0/u2$b;->y:Ljava/lang/String;

    iput-object p2, p0, Lsl0/u2$b;->z:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iput-object p3, p0, Lsl0/u2$b;->E:Lz1/p;

    iput-object p4, p0, Lsl0/u2$b;->F:Lp1/c1;

    iput-object p5, p0, Lsl0/u2$b;->G:Lp1/c1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lsl0/u2$b;

    iget-object v1, p0, Lsl0/u2$b;->y:Ljava/lang/String;

    iget-object v2, p0, Lsl0/u2$b;->z:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    iget-object v3, p0, Lsl0/u2$b;->E:Lz1/p;

    iget-object v4, p0, Lsl0/u2$b;->F:Lp1/c1;

    iget-object v5, p0, Lsl0/u2$b;->G:Lp1/c1;

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lsl0/u2$b;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/feedback/AiMessageFeedback;Lz1/p;Lp1/c1;Lp1/c1;Lq83/d;)V

    iput-object p1, v0, Lsl0/u2$b;->x:Ljava/lang/Object;

    return-object v0
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
    invoke-virtual {p0, p1, p2}, Lsl0/u2$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lsl0/u2$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lsl0/u2$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lsl0/u2$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lsl0/u2$b;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lsl0/u2$b;->w:I

    if-nez v0, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lsl0/u2$b;->y:Ljava/lang/String;

    if-eqz p1, :cond_0

    iget-object p1, p0, Lsl0/u2$b;->E:Lz1/p;

    iget-object v0, p0, Lsl0/u2$b;->F:Lp1/c1;

    iget-object v1, p0, Lsl0/u2$b;->G:Lp1/c1;

    const/4 v2, 0x0

    invoke-static {v0, v2}, Lsl0/u2;->P(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    const-string v0, ""

    invoke-static {v1, v0}, Lsl0/u2;->Q(Lp1/c1;Ljava/lang/String;)V

    invoke-virtual {p1}, Lz1/p;->clear()V

    :cond_0
    iget-object p1, p0, Lsl0/u2$b;->z:Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    if-eqz p1, :cond_2

    iget-object v0, p0, Lsl0/u2$b;->E:Lz1/p;

    iget-object v1, p0, Lsl0/u2$b;->F:Lp1/c1;

    iget-object v2, p0, Lsl0/u2$b;->G:Lp1/c1;

    invoke-virtual {p1}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackType()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/bot/models/feedback/AiFeedbackTypeKt;->feedbackFromString(Ljava/lang/String;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v3

    invoke-static {v1, v3}, Lsl0/u2;->P(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    invoke-virtual {p1}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackResponse()Ljava/lang/String;

    move-result-object v1

    invoke-static {v2, v1}, Lsl0/u2;->Q(Lp1/c1;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackReasons()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p1, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-static {v2}, Lcom/whoop/bot/models/feedback/FeedbackReason;->valueOf(Ljava/lang/String;)Lcom/whoop/bot/models/feedback/FeedbackReason;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Lp1/x;->J(Ljava/util/Collection;)Lz1/p;

    move-result-object p1

    invoke-virtual {v0, p1}, Lz1/p;->addAll(Ljava/util/Collection;)Z

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lsl0/u2$b;->F:Lp1/c1;

    sget-object v0, Lcom/whoop/bot/models/feedback/AiFeedbackType;->BETTER:Lcom/whoop/bot/models/feedback/AiFeedbackType;

    invoke-static {p1, v0}, Lsl0/u2;->P(Lp1/c1;Lcom/whoop/bot/models/feedback/AiFeedbackType;)V

    :goto_1
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
