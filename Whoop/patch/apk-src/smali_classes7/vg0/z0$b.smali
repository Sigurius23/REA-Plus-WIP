.class final Lvg0/z0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/z0;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u0002*\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lec3/m;",
        "Lvg0/a1;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lec3/m;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ai.chat.domain.interactors.SubmitTurnFeedbackInteractor$interact$1$1"
    f = "SubmitTurnFeedbackInteractor.kt"
    l = {
        0x3c,
        0x60,
        0x62,
        0x63
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvg0/y0;

.field final synthetic G:Lvg0/z0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lvg0/y0;Lvg0/z0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/y0;",
            "Lvg0/z0;",
            "Lq83/d<",
            "-",
            "Lvg0/z0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/z0$b;->F:Lvg0/y0;

    iput-object p2, p0, Lvg0/z0$b;->G:Lvg0/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lvg0/z0$b;

    iget-object v1, p0, Lvg0/z0$b;->F:Lvg0/y0;

    iget-object v2, p0, Lvg0/z0$b;->G:Lvg0/z0;

    invoke-direct {v0, v1, v2, p2}, Lvg0/z0$b;-><init>(Lvg0/y0;Lvg0/z0;Lq83/d;)V

    iput-object p1, v0, Lvg0/z0$b;->E:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lvg0/z0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/z0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/z0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/z0$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 21

    move-object/from16 v5, p0

    iget-object v0, v5, Lvg0/z0$b;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, v5, Lvg0/z0$b;->z:I

    const/4 v10, 0x4

    const/4 v11, 0x3

    const/4 v12, 0x2

    const/4 v1, 0x1

    const/4 v13, 0x0

    if-eqz v0, :cond_5

    if-eq v0, v1, :cond_4

    if-eq v0, v12, :cond_3

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    iget-object v0, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    check-cast v0, Lvg0/a1;

    iget-object v0, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/TurnFeedbackBody;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_8

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    check-cast v0, Lvg0/a1;

    iget-object v1, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ai/chat/api/TurnFeedbackBody;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_2
    move-object v14, v0

    goto/16 :goto_6

    :cond_3
    iget-object v0, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    check-cast v0, Lvg0/a1;

    iget-object v1, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    check-cast v1, Lu02/a;

    iget-object v1, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/ai/chat/api/TurnFeedbackBody;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_4
    iget-object v0, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/TurnFeedbackBody;

    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p1

    goto :goto_0

    :cond_5
    invoke-static/range {p1 .. p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v0, Lcom/whoop/ai/chat/api/TurnFeedbackBody;

    iget-object v2, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v2}, Lvg0/y0;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v3}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackType()Ljava/lang/String;

    move-result-object v3

    iget-object v4, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v4}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackResponse()Ljava/lang/String;

    move-result-object v4

    iget-object v6, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v6}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v6

    invoke-virtual {v6}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackReasons()Ljava/util/List;

    move-result-object v6

    invoke-direct {v0, v2, v3, v4, v6}, Lcom/whoop/ai/chat/api/TurnFeedbackBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, v5, Lvg0/z0$b;->G:Lvg0/z0;

    invoke-static {v3}, Lvg0/z0;->d(Lvg0/z0;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lvg0/z0$b$a;

    iget-object v6, v5, Lvg0/z0$b;->G:Lvg0/z0;

    iget-object v7, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-direct {v4, v6, v7, v0, v13}, Lvg0/z0$b$a;-><init>(Lvg0/z0;Lvg0/y0;Lcom/whoop/ai/chat/api/TurnFeedbackBody;Lq83/d;)V

    iput-object v8, v5, Lvg0/z0$b;->E:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    iput v1, v5, Lvg0/z0$b;->z:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto/16 :goto_7

    :cond_6
    :goto_0
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    const/4 v2, 0x0

    if-eqz v1, :cond_9

    iget-object v0, v5, Lvg0/z0$b;->G:Lvg0/z0;

    invoke-static {v0}, Lvg0/z0;->d(Lvg0/z0;)Ltr2/n;

    move-result-object v0

    iget-object v1, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v1}, Lvg0/y0;->d()Ljava/lang/String;

    move-result-object v1

    const-string v3, "Turn feedback submitted successfully for turn "

    invoke-static {v3, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v0}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackType()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/bot/models/feedback/AiFeedbackTypeKt;->feedbackFromString(Ljava/lang/String;)Lcom/whoop/bot/models/feedback/AiFeedbackType;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;

    iget-object v2, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v2}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackResponse()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v3}, Lvg0/y0;->a()Lcom/whoop/bot/models/feedback/AiMessageFeedback;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/bot/models/feedback/AiMessageFeedback;->getFeedbackReasons()Ljava/util/List;

    move-result-object v3

    invoke-direct {v1, v0, v2, v3}, Lcom/whoop/ai/chat/models/TurnFeedbackResponse;-><init>(Lcom/whoop/bot/models/feedback/AiFeedbackType;Ljava/lang/String;Ljava/util/List;)V

    goto :goto_1

    :cond_7
    move-object v1, v13

    :goto_1
    new-instance v0, Lvg0/a1;

    iget-object v2, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v2}, Lvg0/y0;->d()Ljava/lang/String;

    move-result-object v2

    iget-object v3, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v3}, Lvg0/y0;->c()Z

    move-result v3

    iget-object v4, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v4}, Lvg0/y0;->c()Z

    move-result v4

    if-eqz v4, :cond_8

    sget-object v4, Lhl0/d$b;->a:Lhl0/d$b;

    goto :goto_2

    :cond_8
    move-object v4, v13

    :goto_2
    invoke-direct {v0, v2, v1, v3, v4}, Lvg0/a1;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;ZLhl0/d;)V

    goto :goto_4

    :cond_9
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_d

    iget-object v1, v5, Lvg0/z0$b;->G:Lvg0/z0;

    invoke-static {v1}, Lvg0/z0;->d(Lvg0/z0;)Ltr2/n;

    move-result-object v1

    iget-object v3, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v3}, Lvg0/y0;->d()Ljava/lang/String;

    move-result-object v3

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    const-string v4, "Failed to submit turn feedback for turn "

    const-string v6, ": "

    invoke-static {v4, v3, v6, v0}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v0, Lvg0/a1;

    iget-object v1, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v1}, Lvg0/y0;->d()Ljava/lang/String;

    move-result-object v1

    iget-object v2, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v2}, Lvg0/y0;->c()Z

    move-result v2

    iget-object v3, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v3}, Lvg0/y0;->c()Z

    move-result v3

    if-eqz v3, :cond_a

    sget-object v3, Lhl0/d$a;->a:Lhl0/d$a;

    goto :goto_3

    :cond_a
    move-object v3, v13

    :goto_3
    invoke-direct {v0, v1, v13, v2, v3}, Lvg0/a1;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;ZLhl0/d;)V

    :goto_4
    iput-object v8, v5, Lvg0/z0$b;->E:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    iput-object v0, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    iput v12, v5, Lvg0/z0$b;->z:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_b

    goto :goto_7

    :cond_b
    :goto_5
    iget-object v1, v5, Lvg0/z0$b;->F:Lvg0/y0;

    invoke-virtual {v1}, Lvg0/y0;->c()Z

    move-result v1

    if-eqz v1, :cond_c

    iput-object v8, v5, Lvg0/z0$b;->E:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    iput-object v0, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    iput v11, v5, Lvg0/z0$b;->z:I

    const-wide/16 v1, 0x5dc

    invoke-static {v1, v2, v5}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v9, :cond_2

    goto :goto_7

    :goto_6
    const/16 v19, 0x3

    const/16 v20, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Lvg0/a1;->b(Lvg0/a1;Ljava/lang/String;Lcom/whoop/ai/chat/models/TurnFeedbackResponse;ZLhl0/d;ILjava/lang/Object;)Lvg0/a1;

    move-result-object v0

    iput-object v13, v5, Lvg0/z0$b;->E:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->w:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->x:Ljava/lang/Object;

    iput-object v13, v5, Lvg0/z0$b;->y:Ljava/lang/Object;

    iput v10, v5, Lvg0/z0$b;->z:I

    invoke-interface {v8, v0, v5}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_c

    :goto_7
    return-object v9

    :cond_c
    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
