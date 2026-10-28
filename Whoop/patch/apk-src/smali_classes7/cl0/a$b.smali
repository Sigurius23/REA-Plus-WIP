.class final Lcl0/a$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl0/a;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lbc3/c0;",
        "Lu02/h;",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "<anonymous>",
        "(Lbc3/c0;)Lu02/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.bot.domain.active.ActiveResponseApiInteractor$getLatestMessage$apiResult$1"
    f = "ActiveResponseApiInteractor.kt"
    l = {
        0x21,
        0x3c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcl0/a;

.field final synthetic F:Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lcl0/a;Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcl0/a;",
            "Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;",
            "Lq83/d<",
            "-",
            "Lcl0/a$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcl0/a$b;->E:Lcl0/a;

    iput-object p2, p0, Lcl0/a$b;->F:Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

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

    new-instance p1, Lcl0/a$b;

    iget-object v0, p0, Lcl0/a$b;->E:Lcl0/a;

    iget-object v1, p0, Lcl0/a$b;->F:Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

    invoke-direct {p1, v0, v1, p2}, Lcl0/a$b;-><init>(Lcl0/a;Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;Lq83/d;)V

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
            "Lu02/h<",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcl0/a$b;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcl0/a$b;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcl0/a$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcl0/a$b;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcl0/a$b;->z:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcl0/a$b;->x:Ljava/lang/Object;

    check-cast v0, Lf63/c;

    iget-object v0, p0, Lcl0/a$b;->w:Ljava/lang/Object;

    check-cast v0, Lf63/c;

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

    iget-object p1, p0, Lcl0/a$b;->E:Lcl0/a;

    invoke-static {p1}, Lcl0/a;->a(Lcl0/a;)Lu02/c;

    move-result-object p1

    iget-object v1, p0, Lcl0/a$b;->F:Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

    const-class v4, Ll83/a0;

    invoke-static {v4}, Lkotlin/jvm/internal/h0;->b(Ljava/lang/Class;)Lj93/a0;

    move-result-object v5

    invoke-static {v5}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v6

    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    invoke-static {v4, v5, v6}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v4

    iput v3, p0, Lcl0/a$b;->z:I

    invoke-virtual {p1, v1, v4, p0}, Lu02/c;->d(Lz02/a;Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lf63/c;

    invoke-virtual {p1}, Lf63/c;->a()Lw53/b;

    move-result-object p1

    const-class v1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    invoke-static {v1}, Lkotlin/jvm/internal/h0;->d(Ljava/lang/Class;)Lj93/a0;

    move-result-object v3

    invoke-static {v3}, Lj93/l0;->B(Lj93/a0;)Ljava/lang/reflect/Type;

    move-result-object v4

    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    invoke-static {v1, v3, v4}, Lge3/g;->Y(Lj93/d;Lj93/a0;Ljava/lang/reflect/Type;)Ls63/a;

    move-result-object v1

    const/4 v3, 0x0

    iput-object v3, p0, Lcl0/a$b;->w:Ljava/lang/Object;

    iput-object v3, p0, Lcl0/a$b;->x:Ljava/lang/Object;

    const/4 v3, 0x0

    iput v3, p0, Lcl0/a$b;->y:I

    iput v2, p0, Lcl0/a$b;->z:I

    invoke-virtual {p1, v1, p0}, Lw53/b;->a(Ls63/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    if-eqz p1, :cond_5

    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    new-instance v0, Lu02/h;

    invoke-direct {v0, p1}, Lu02/h;-><init>(Ljava/lang/Object;)V

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type com.whoop.bot.models.conversation.AiChatMessage"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
