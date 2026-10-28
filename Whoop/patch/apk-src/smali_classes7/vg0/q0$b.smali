.class final Lvg0/q0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/q0;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/r0;",
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
    c = "com.whoop.ai.chat.domain.interactors.StartNewConversationInteractor$interact$1$1"
    f = "StartNewConversationInteractor.kt"
    l = {
        0x29,
        0x2d,
        0x35,
        0x37,
        0x3b
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field private synthetic E:Ljava/lang/Object;

.field final synthetic F:Lvg0/q0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:I


# direct methods
.method public constructor <init>(Lvg0/q0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/q0;",
            "Lq83/d<",
            "-",
            "Lvg0/q0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/q0$b;->F:Lvg0/q0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance v0, Lvg0/q0$b;

    iget-object v1, p0, Lvg0/q0$b;->F:Lvg0/q0;

    invoke-direct {v0, v1, p2}, Lvg0/q0$b;-><init>(Lvg0/q0;Lq83/d;)V

    iput-object p1, v0, Lvg0/q0$b;->E:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/q0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/q0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/q0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/q0$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Lec3/m;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v0, p0, Lvg0/q0$b;->z:I

    const/4 v10, 0x5

    const/4 v11, 0x4

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v12, 0x3

    const/4 v13, 0x0

    if-eqz v0, :cond_4

    if-eq v0, v2, :cond_3

    if-eq v0, v1, :cond_2

    if-eq v0, v12, :cond_1

    if-eq v0, v11, :cond_1

    if-ne v0, v10, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v0, p0, Lvg0/q0$b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AIConversation;

    :goto_0
    iget-object v0, p0, Lvg0/q0$b;->x:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_2
    iget-object v0, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto :goto_2

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v0, Lvg0/r0$b;->a:Lvg0/r0$b;

    iput-object v8, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    iput v2, p0, Lvg0/q0$b;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_1
    new-instance v0, Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;

    invoke-direct {v0, v13, v13, v12, v13}, Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v2, Lu02/a;->a:Lu02/a$a;

    iget-object v3, p0, Lvg0/q0$b;->F:Lvg0/q0;

    invoke-static {v3}, Lvg0/q0;->d(Lvg0/q0;)Ltr2/n;

    move-result-object v3

    new-instance v4, Lvg0/q0$b$a;

    iget-object v6, p0, Lvg0/q0$b;->F:Lvg0/q0;

    invoke-direct {v4, v6, v0, v13}, Lvg0/q0$b$a;-><init>(Lvg0/q0;Lcom/whoop/ai/chat/api/AiStartNewConversationRequestBody;Lq83/d;)V

    iput-object v8, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    iput v1, p0, Lvg0/q0$b;->z:I

    move-object v0, v2

    const/4 v2, 0x0

    move-object v1, v3

    const/4 v3, 0x0

    const/4 v6, 0x6

    const/4 v7, 0x0

    move-object v5, p0

    invoke-static/range {v0 .. v7}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    check-cast v0, Lu02/a;

    instance-of v1, v0, Lu02/a$c;

    if-eqz v1, :cond_8

    check-cast v0, Lu02/a$c;

    invoke-virtual {v0}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lpg3/v0;

    iget-object v0, v0, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AIConversation;

    if-eqz v0, :cond_7

    new-instance v1, Lvg0/r0$c;

    invoke-direct {v1, v0}, Lvg0/r0$c;-><init>(Lcom/whoop/ai/chat/models/AIConversation;)V

    iput-object v13, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->x:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->y:Ljava/lang/Object;

    iput v12, p0, Lvg0/q0$b;->z:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_7
    new-instance v0, Lvg0/r0$a;

    const-string v1, "Response body is null"

    invoke-direct {v0, v1}, Lvg0/r0$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->x:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->y:Ljava/lang/Object;

    iput v11, p0, Lvg0/q0$b;->z:I

    invoke-interface {v8, v0, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    goto :goto_3

    :cond_8
    instance-of v1, v0, Lu02/a$b;

    if-eqz v1, :cond_a

    new-instance v1, Lvg0/r0$a;

    check-cast v0, Lu02/a$b;

    invoke-virtual {v0}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lvg0/r0$a;-><init>(Ljava/lang/String;)V

    iput-object v13, p0, Lvg0/q0$b;->E:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->w:Ljava/lang/Object;

    iput-object v13, p0, Lvg0/q0$b;->x:Ljava/lang/Object;

    iput v10, p0, Lvg0/q0$b;->z:I

    invoke-interface {v8, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v9, :cond_9

    :goto_3
    return-object v9

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method
