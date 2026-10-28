.class public final Lcl0/c$c$a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcl0/c$c;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Lec3/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field final synthetic w:Lec3/m;

.field final synthetic x:Lcl0/c;


# direct methods
.method public constructor <init>(Lec3/m;Lcl0/c;)V
    .locals 0

    iput-object p1, p0, Lcl0/c$c$a;->w:Lec3/m;

    iput-object p2, p0, Lcl0/c$c$a;->x:Lcl0/c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 13

    instance-of v0, p2, Lcl0/c$c$a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcl0/c$c$a$a;

    iget v1, v0, Lcl0/c$c$a$a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcl0/c$c$a$a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcl0/c$c$a$a;

    invoke-direct {v0, p0, p2}, Lcl0/c$c$a$a;-><init>(Lcl0/c$c$a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcl0/c$c$a$a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcl0/c$c$a$a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcl0/c$c$a$a;->G:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object p1, v0, Lcl0/c$c$a$a;->E:Ljava/lang/Object;

    check-cast p1, Lcl0/c$c$a$a;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, p0, Lcl0/c$c$a;->w:Lec3/m;

    move-object v5, p1

    check-cast v5, Lcom/whoop/bot/models/conversation/AiChatConversation;

    invoke-static {v5}, Lcom/whoop/bot/models/conversation/AiChatConversationKt;->getLatestAssistantResponse(Lcom/whoop/bot/models/conversation/AiChatConversation;)Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object p1

    const/4 v2, 0x0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/bot/models/conversation/AiChatMessage;->getMessageStatus()Lcom/whoop/bot/models/conversation/AiMessageStatus;

    move-result-object p1

    goto :goto_1

    :cond_3
    move-object p1, v2

    :goto_1
    sget-object v4, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    if-ne p1, v4, :cond_4

    iget-object p1, p0, Lcl0/c$c$a;->x:Lcl0/c;

    invoke-static {p1}, Lcl0/c;->a(Lcl0/c;)Lxk0/a;

    move-result-object p1

    invoke-virtual {v5}, Lcom/whoop/bot/models/conversation/AiChatConversation;->getId()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4, v3}, Lxk0/a;->h(Ljava/lang/String;Z)V

    sget-object p1, Lfl0/j;->ERROR:Lfl0/j;

    :goto_2
    move-object v6, p1

    goto :goto_3

    :cond_4
    sget-object p1, Lfl0/j;->SUCCESS:Lfl0/j;

    goto :goto_2

    :goto_3
    new-instance v4, Lfl0/c;

    const/16 v11, 0x3c

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v4 .. v12}, Lfl0/c;-><init>(Lcom/whoop/bot/models/conversation/AiChatConversation;Lfl0/j;Lnl0/m;Lfl0/k;ZLjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v0, Lcl0/c$c$a$a;->y:Ljava/lang/Object;

    iput-object v2, v0, Lcl0/c$c$a$a;->E:Ljava/lang/Object;

    iput-object v2, v0, Lcl0/c$c$a$a;->F:Ljava/lang/Object;

    iput-object v2, v0, Lcl0/c$c$a$a;->G:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcl0/c$c$a$a;->H:I

    iput v3, v0, Lcl0/c$c$a$a;->x:I

    invoke-interface {p2, v4, v0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    return-object v1

    :cond_5
    :goto_4
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
