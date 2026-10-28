.class final Lvg0/s$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/s;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/t;",
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
    c = "com.whoop.ai.chat.domain.interactors.CreateTurnInteractor$interact$1$1"
    f = "CreateTurnInteractor.kt"
    l = {
        0x39,
        0x3f,
        0x41,
        0x4b,
        0x53,
        0x55,
        0x59
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field private synthetic F:Ljava/lang/Object;

.field final synthetic G:Lvg0/r;

.field final synthetic H:Lvg0/s;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:Ljava/lang/Object;

.field z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/r;Lvg0/s;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/r;",
            "Lvg0/s;",
            "Lq83/d<",
            "-",
            "Lvg0/s$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    iput-object p2, p0, Lvg0/s$b;->H:Lvg0/s;

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

    new-instance v0, Lvg0/s$b;

    iget-object v1, p0, Lvg0/s$b;->G:Lvg0/r;

    iget-object v2, p0, Lvg0/s$b;->H:Lvg0/s;

    invoke-direct {v0, v1, v2, p2}, Lvg0/s$b;-><init>(Lvg0/r;Lvg0/s;Lq83/d;)V

    iput-object p1, v0, Lvg0/s$b;->F:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/s$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/s$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/s$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/s$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lvg0/s$b;->F:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvg0/s$b;->E:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    :pswitch_0
    iget-object v0, p0, Lvg0/s$b;->y:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    iget-object v0, p0, Lvg0/s$b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    iget-object v0, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, Lvg0/s$b;->z:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AITurn;

    goto :goto_0

    :pswitch_2
    iget-object v2, p0, Lvg0/s$b;->x:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    iget-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_4

    :pswitch_3
    iget-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :pswitch_4
    iget-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/ai/chat/models/AITurn;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-virtual {p1}, Lvg0/r;->d()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lvg0/t$a;

    const-string v2, "Conversation fingerprint is missing"

    invoke-direct {p1, v2}, Lvg0/t$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/s$b;->F:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lvg0/s$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_1
    move-object v11, p0

    goto/16 :goto_5

    :cond_0
    move-object v11, p0

    goto/16 :goto_6

    :cond_1
    iget-object p1, p0, Lvg0/s$b;->H:Lvg0/s;

    iget-object v2, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-static {p1, v2}, Lvg0/s;->e(Lvg0/s;Lvg0/r;)Lcom/whoop/ai/chat/models/AITurn;

    move-result-object v2

    new-instance p1, Lvg0/t$c;

    invoke-direct {p1, v2}, Lvg0/t$c;-><init>(Lcom/whoop/ai/chat/models/AITurn;)V

    iput-object v0, p0, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    const/4 v5, 0x2

    iput v5, p0, Lvg0/s$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_2
    sget-object p1, Lvg0/t$b;->a:Lvg0/t$b;

    iput-object v0, p0, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    const/4 v5, 0x3

    iput v5, p0, Lvg0/s$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_3
    iget-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-virtual {p1}, Lvg0/r;->b()Ljava/lang/String;

    move-result-object v6

    sget-object p1, Lnl0/b;->USER:Lnl0/b;

    invoke-virtual {p1}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v7

    iget-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-virtual {p1}, Lvg0/r;->c()Ljava/util/List;

    move-result-object v9

    iget-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-virtual {p1}, Lvg0/r;->e()Ljava/lang/Long;

    move-result-object v8

    iget-object p1, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-virtual {p1}, Lvg0/r;->f()Z

    move-result v11

    new-instance v5, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;

    const/16 v12, 0x10

    const/4 v13, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v5 .. v13}, Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Lcom/whoop/ai/chat/api/AiTrackingCapabilities;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v6, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lvg0/s$b;->H:Lvg0/s;

    invoke-static {p1}, Lvg0/s;->d(Lvg0/s;)Ltr2/n;

    move-result-object v7

    new-instance v10, Lvg0/s$b$a;

    iget-object p1, p0, Lvg0/s$b;->H:Lvg0/s;

    iget-object v8, p0, Lvg0/s$b;->G:Lvg0/r;

    invoke-direct {v10, p1, v8, v5, v4}, Lvg0/s$b$a;-><init>(Lvg0/s;Lvg0/r;Lcom/whoop/ai/chat/api/AiCreateTurnRequestBody;Lq83/d;)V

    iput-object v0, p0, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v2, p0, Lvg0/s$b;->w:Ljava/lang/Object;

    iput-object v4, p0, Lvg0/s$b;->x:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lvg0/s$b;->E:I

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x6

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_5

    :cond_4
    :goto_4
    check-cast p1, Lu02/a;

    instance-of v5, p1, Lu02/a$c;

    if-eqz v5, :cond_6

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/models/AITurn;

    if-eqz p1, :cond_5

    new-instance v5, Lvg0/t$d;

    invoke-virtual {v2}, Lcom/whoop/ai/chat/models/AITurn;->getId()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v5, v2, p1}, Lvg0/t$d;-><init>(Ljava/lang/String;Lcom/whoop/ai/chat/models/AITurn;)V

    iput-object v4, v11, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->w:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->x:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->y:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->z:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, v11, Lvg0/s$b;->E:I

    invoke-interface {v0, v5, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_5
    new-instance p1, Lvg0/t$a;

    const-string v2, "Response body is null"

    invoke-direct {p1, v2}, Lvg0/t$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v11, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->w:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->x:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->y:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->z:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v11, Lvg0/s$b;->E:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_6
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_8

    new-instance v2, Lvg0/t$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvg0/t$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v11, Lvg0/s$b;->F:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->w:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->x:Ljava/lang/Object;

    iput-object v4, v11, Lvg0/s$b;->y:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, v11, Lvg0/s$b;->E:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_5
    return-object v1

    :cond_7
    :goto_6
    return-object v3

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
