.class final Lvg0/w0$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvg0/w0;->interact(Lec3/l;)Lec3/l;
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
        "Lvg0/x0;",
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
    c = "com.whoop.ai.chat.domain.interactors.StopTurnInteractor$interact$1$1"
    f = "StopTurnInteractor.kt"
    l = {
        0x2c,
        0x30,
        0x34,
        0x36,
        0x3f,
        0x41,
        0x46
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvg0/v0;

.field final synthetic F:Lvg0/w0;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvg0/v0;Lvg0/w0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvg0/v0;",
            "Lvg0/w0;",
            "Lq83/d<",
            "-",
            "Lvg0/w0$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvg0/w0$b;->E:Lvg0/v0;

    iput-object p2, p0, Lvg0/w0$b;->F:Lvg0/w0;

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

    new-instance v0, Lvg0/w0$b;

    iget-object v1, p0, Lvg0/w0$b;->E:Lvg0/v0;

    iget-object v2, p0, Lvg0/w0$b;->F:Lvg0/w0;

    invoke-direct {v0, v1, v2, p2}, Lvg0/w0$b;-><init>(Lvg0/v0;Lvg0/w0;Lq83/d;)V

    iput-object p1, v0, Lvg0/w0$b;->z:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lvg0/w0$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lvg0/w0$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lvg0/w0$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lvg0/w0$b;->invoke(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, Lvg0/w0$b;->z:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lvg0/w0$b;->y:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :goto_0
    :pswitch_0
    iget-object v0, p0, Lvg0/w0$b;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_1
    iget-object v0, p0, Lvg0/w0$b;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/ai/chat/models/AITurn;

    goto :goto_0

    :pswitch_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto/16 :goto_3

    :pswitch_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_5
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :pswitch_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lvg0/w0$b;->E:Lvg0/v0;

    invoke-virtual {p1}, Lvg0/v0;->a()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lvg0/x0$a;

    const-string v2, "Conversation fingerprint is missing"

    invoke-direct {p1, v2}, Lvg0/x0$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/w0$b;->z:Ljava/lang/Object;

    const/4 v2, 0x1

    iput v2, p0, Lvg0/w0$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    :goto_1
    move-object v10, p0

    goto/16 :goto_4

    :cond_0
    move-object v10, p0

    goto/16 :goto_5

    :cond_1
    iget-object p1, p0, Lvg0/w0$b;->E:Lvg0/v0;

    invoke-virtual {p1}, Lvg0/v0;->b()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    new-instance p1, Lvg0/x0$a;

    const-string v2, "Turn ID is missing"

    invoke-direct {p1, v2}, Lvg0/x0$a;-><init>(Ljava/lang/String;)V

    iput-object v4, p0, Lvg0/w0$b;->z:Ljava/lang/Object;

    const/4 v2, 0x2

    iput v2, p0, Lvg0/w0$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_0

    goto :goto_1

    :cond_2
    sget-object p1, Lvg0/x0$b;->a:Lvg0/x0$b;

    iput-object v0, p0, Lvg0/w0$b;->z:Ljava/lang/Object;

    const/4 v2, 0x3

    iput v2, p0, Lvg0/w0$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_2
    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lvg0/w0$b;->F:Lvg0/w0;

    invoke-static {p1}, Lvg0/w0;->d(Lvg0/w0;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lvg0/w0$b$a;

    iget-object p1, p0, Lvg0/w0$b;->F:Lvg0/w0;

    iget-object v2, p0, Lvg0/w0$b;->E:Lvg0/v0;

    invoke-direct {v9, p1, v2, v4}, Lvg0/w0$b$a;-><init>(Lvg0/w0;Lvg0/v0;Lq83/d;)V

    iput-object v0, p0, Lvg0/w0$b;->z:Ljava/lang/Object;

    const/4 p1, 0x4

    iput p1, p0, Lvg0/w0$b;->y:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto/16 :goto_4

    :cond_4
    :goto_3
    check-cast p1, Lu02/a;

    instance-of v2, p1, Lu02/a$c;

    const/4 v5, 0x0

    if-eqz v2, :cond_6

    iget-object v2, v10, Lvg0/w0$b;->F:Lvg0/w0;

    invoke-static {v2}, Lvg0/w0;->d(Lvg0/w0;)Ltr2/n;

    move-result-object v2

    iget-object v6, v10, Lvg0/w0$b;->E:Lvg0/v0;

    invoke-virtual {v6}, Lvg0/v0;->b()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Turn Stopped using turnId:"

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/models/AITurn;

    if-eqz p1, :cond_5

    new-instance v2, Lvg0/x0$c;

    invoke-direct {v2, p1}, Lvg0/x0$c;-><init>(Lcom/whoop/ai/chat/models/AITurn;)V

    iput-object v4, v10, Lvg0/w0$b;->z:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/w0$b;->w:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/w0$b;->x:Ljava/lang/Object;

    const/4 p1, 0x5

    iput p1, v10, Lvg0/w0$b;->y:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_5
    new-instance p1, Lvg0/x0$a;

    const-string v2, "Response body is null"

    invoke-direct {p1, v2}, Lvg0/x0$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v10, Lvg0/w0$b;->z:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/w0$b;->w:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/w0$b;->x:Ljava/lang/Object;

    const/4 v2, 0x6

    iput v2, v10, Lvg0/w0$b;->y:I

    invoke-interface {v0, p1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    :cond_6
    instance-of v2, p1, Lu02/a$b;

    if-eqz v2, :cond_8

    iget-object v2, v10, Lvg0/w0$b;->F:Lvg0/w0;

    invoke-static {v2}, Lvg0/w0;->d(Lvg0/w0;)Ltr2/n;

    move-result-object v2

    iget-object v6, v10, Lvg0/w0$b;->E:Lvg0/v0;

    invoke-virtual {v6}, Lvg0/v0;->b()Ljava/lang/String;

    move-result-object v6

    const-string v7, "Failed to stop using turnId:"

    invoke-static {v7, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v2, v6, v5}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lvg0/x0$a;

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvg0/x0$a;-><init>(Ljava/lang/String;)V

    iput-object v4, v10, Lvg0/w0$b;->z:Ljava/lang/Object;

    iput-object v4, v10, Lvg0/w0$b;->w:Ljava/lang/Object;

    const/4 p1, 0x7

    iput p1, v10, Lvg0/w0$b;->y:I

    invoke-interface {v0, v2, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    :goto_4
    return-object v1

    :cond_7
    :goto_5
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
