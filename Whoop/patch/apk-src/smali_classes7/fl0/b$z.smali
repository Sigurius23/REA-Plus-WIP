.class final Lfl0/b$z;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lfl0/b;->T()Lec3/l;
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
    c = "com.whoop.bot.domain.conversation.AiConversationInteractor$stopGeneratingFlow$1"
    f = "AiConversationInteractor.kt"
    l = {
        0x2dd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lfl0/b;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lfl0/b;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lfl0/b;",
            "Ljava/lang/String;",
            "Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;",
            "Lq83/d<",
            "-",
            "Lfl0/b$z;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lfl0/b$z;->y:Lfl0/b;

    iput-object p2, p0, Lfl0/b$z;->z:Ljava/lang/String;

    iput-object p3, p0, Lfl0/b$z;->E:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lfl0/b$z;

    iget-object v1, p0, Lfl0/b$z;->y:Lfl0/b;

    iget-object v2, p0, Lfl0/b$z;->z:Ljava/lang/String;

    iget-object v3, p0, Lfl0/b$z;->E:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    invoke-direct {v0, v1, v2, v3, p2}, Lfl0/b$z;-><init>(Lfl0/b;Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;Lq83/d;)V

    iput-object p1, v0, Lfl0/b$z;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lfl0/b$z;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lfl0/b$z;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lfl0/b$z;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lfl0/b$z;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const-class v0, Ll83/a0;

    iget-object v1, p0, Lfl0/b$z;->x:Ljava/lang/Object;

    check-cast v1, Lbc3/c0;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lfl0/b$z;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_2

    :catch_0
    move-exception p1

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lfl0/b$z;->y:Lfl0/b;

    invoke-static {p1}, Lfl0/b;->n(Lfl0/b;)Lu02/c;

    move-result-object p1

    new-instance v3, Lcom/whoop/bot/models/conversation/StopGeneratingRequest;

    iget-object v5, p0, Lfl0/b$z;->z:Ljava/lang/String;

    iget-object v6, p0, Lfl0/b$z;->E:Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;

    invoke-direct {v3, v5, v6}, Lcom/whoop/bot/models/conversation/StopGeneratingRequest;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiChatMessageRequestBody;)V

    invoke-static {v0}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    invoke-static {v0, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v0

    iput-object v1, p0, Lfl0/b$z;->x:Ljava/lang/Object;

    iput v4, p0, Lfl0/b$z;->w:I

    invoke-virtual {p1, v3, v0, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p1, v2, :cond_5

    return-object v2

    :goto_0
    invoke-static {v1}, Lbc3/f0;->n(Lbc3/c0;)V

    iget-object v0, p0, Lfl0/b$z;->y:Lfl0/b;

    invoke-static {v0}, Lfl0/b;->l(Lfl0/b;)Lxk0/a;

    move-result-object v0

    const-string v1, "stop_generating"

    invoke-virtual {v0, p1, v1}, Lxk0/a;->M(Ljava/lang/Exception;Ljava/lang/String;)V

    instance-of v0, p1, Lio/ktor/client/plugins/ResponseException;

    if-eqz v0, :cond_2

    move-object v0, p1

    check-cast v0, Lio/ktor/client/plugins/ResponseException;

    iget-object v0, v0, Lio/ktor/client/plugins/ResponseException;->w:Lf63/c;

    invoke-virtual {v0}, Lf63/c;->e()Li63/v;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_3

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    iget-object v0, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v1, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    const-string v3, "Failed to stop generating: "

    if-eqz v1, :cond_4

    iget-object v1, p0, Lfl0/b$z;->y:Lfl0/b;

    invoke-static {v1}, Lfl0/b;->s(Lfl0/b;)Ltr2/n;

    move-result-object v1

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v1, v0, p1, v2}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_2

    :cond_4
    iget-object p1, p0, Lfl0/b$z;->y:Lfl0/b;

    invoke-static {p1}, Lfl0/b;->s(Lfl0/b;)Ltr2/n;

    move-result-object p1

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
