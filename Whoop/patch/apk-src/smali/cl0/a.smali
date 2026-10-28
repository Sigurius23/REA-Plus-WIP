.class public final Lcl0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u0008\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0015R\u0014\u0010\t\u001a\u00020\u00088\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u000e8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0018\u00a8\u0006\u001a"
    }
    d2 = {
        "Lcl0/a;",
        "",
        "Lu02/c;",
        "apiClient",
        "Lxk0/a;",
        "analyticsHelper",
        "Lor2/x1;",
        "uuidGenerator",
        "Lq83/j;",
        "ioDispatcher",
        "<init>",
        "(Lu02/c;Lxk0/a;Lor2/x1;Lq83/j;)V",
        "",
        "id",
        "Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "c",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lu02/c;",
        "b",
        "Lxk0/a;",
        "Lor2/x1;",
        "d",
        "Lq83/j;",
        "()Lcom/whoop/bot/models/conversation/AiChatMessage;",
        "errorChatMessage",
        "bot_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lu02/c;

.field private final b:Lxk0/a;

.field private final c:Lor2/x1;

.field private final d:Lq83/j;


# direct methods
.method public constructor <init>(Lu02/c;Lxk0/a;Lor2/x1;Lq83/j;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uuidGenerator"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ioDispatcher"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcl0/a;->a:Lu02/c;

    iput-object p2, p0, Lcl0/a;->b:Lxk0/a;

    iput-object p3, p0, Lcl0/a;->c:Lor2/x1;

    iput-object p4, p0, Lcl0/a;->d:Lq83/j;

    return-void
.end method

.method public static final synthetic a(Lcl0/a;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lcl0/a;->a:Lu02/c;

    return-object p0
.end method

.method private final b()Lcom/whoop/bot/models/conversation/AiChatMessage;
    .locals 15

    new-instance v0, Lcom/whoop/bot/models/conversation/AiChatMessage;

    sget-object v2, Lcom/whoop/bot/models/conversation/AiMessageStatus;->FAILED:Lcom/whoop/bot/models/conversation/AiMessageStatus;

    sget-object v1, Lnl0/b;->ASSISTANT:Lnl0/b;

    invoke-virtual {v1}, Lnl0/b;->getValue()Ljava/lang/String;

    move-result-object v3

    iget-object v1, p0, Lcl0/a;->c:Lor2/x1;

    invoke-interface {v1}, Lor2/x1;->a()Ljava/util/UUID;

    move-result-object v1

    invoke-virtual {v1}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v1, "toString(...)"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v13, 0xff0

    const/4 v14, 0x0

    const-string v1, ""

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v0 .. v14}, Lcom/whoop/bot/models/conversation/AiChatMessage;-><init>(Ljava/lang/String;Lcom/whoop/bot/models/conversation/AiMessageStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method


# virtual methods
.method public final c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/bot/models/conversation/AiChatMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lcl0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcl0/a$a;

    iget v1, v0, Lcl0/a$a;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcl0/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcl0/a$a;

    invoke-direct {v0, p0, p2}, Lcl0/a$a;-><init>(Lcl0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lcl0/a$a;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcl0/a$a;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcl0/a$a;->x:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

    iget-object p1, v0, Lcl0/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p2, Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;

    invoke-direct {p2, p1}, Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;-><init>(Ljava/lang/String;)V

    :try_start_1
    iget-object p1, p0, Lcl0/a;->d:Lq83/j;

    new-instance v2, Lcl0/a$b;

    const/4 v4, 0x0

    invoke-direct {v2, p0, p2, v4}, Lcl0/a$b;-><init>(Lcl0/a;Lcom/whoop/bot/models/conversation/AiActiveResponseRequest;Lq83/d;)V

    iput-object v4, v0, Lcl0/a$a;->w:Ljava/lang/Object;

    iput-object v4, v0, Lcl0/a$a;->x:Ljava/lang/Object;

    iput v3, v0, Lcl0/a$a;->E:I

    invoke-static {p1, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lu02/g;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lcl0/a;->b:Lxk0/a;

    const-string v0, "get_latest_message"

    invoke-virtual {p2, p1, v0}, Lxk0/a;->M(Ljava/lang/Exception;Ljava/lang/String;)V

    new-instance p2, Lu02/e;

    sget-object v0, Lu02/d;->c:Lu02/d$a;

    invoke-virtual {v0, p1}, Lu02/d$a;->a(Ljava/lang/Throwable;)Lu02/d;

    move-result-object p1

    invoke-direct {p2, p1}, Lu02/e;-><init>(Lu02/d;)V

    :goto_3
    instance-of p1, p2, Lu02/h;

    if-eqz p1, :cond_4

    check-cast p2, Lu02/h;

    invoke-virtual {p2}, Lu02/h;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/bot/models/conversation/AiChatMessage;

    goto :goto_4

    :cond_4
    instance-of p1, p2, Lu02/e;

    if-eqz p1, :cond_5

    invoke-direct {p0}, Lcl0/a;->b()Lcom/whoop/bot/models/conversation/AiChatMessage;

    move-result-object p1

    :goto_4
    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
