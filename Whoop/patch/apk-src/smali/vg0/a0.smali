.class public final Lvg0/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\t\u001a\u00020\u0008H\u0082@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ*\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u00080\n2\u0006\u0010\t\u001a\u00020\u00082\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lvg0/a0;",
        "",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V",
        "",
        "fingerprint",
        "",
        "c",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "timeoutMs",
        "d",
        "(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/ai/chat/api/AiChatApi;",
        "b",
        "Ltr2/n;",
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
.field private final a:Lcom/whoop/ai/chat/api/AiChatApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lvg0/a0;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    .line 3
    iput-object p2, p0, Lvg0/a0;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "GetSuggestionsInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lvg0/a0;-><init>(Lcom/whoop/ai/chat/api/AiChatApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic a(Lvg0/a0;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lvg0/a0;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic b(Lvg0/a0;)Lcom/whoop/ai/chat/api/AiChatApi;
    .locals 0

    iget-object p0, p0, Lvg0/a0;->a:Lcom/whoop/ai/chat/api/AiChatApi;

    return-object p0
.end method

.method private final c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lvg0/a0$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lvg0/a0$a;

    iget v1, v0, Lvg0/a0$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg0/a0$a;->z:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lvg0/a0$a;

    invoke-direct {v0, p0, p2}, Lvg0/a0$a;-><init>(Lvg0/a0;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lvg0/a0$a;->x:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lvg0/a0$a;->z:I

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lvg0/a0$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p2, v2

    iget-object v2, p0, Lvg0/a0;->b:Ltr2/n;

    new-instance v5, Lvg0/a0$b;

    const/4 v3, 0x0

    invoke-direct {v5, p0, p1, v3}, Lvg0/a0$b;-><init>(Lvg0/a0;Ljava/lang/String;Lq83/d;)V

    iput-object v3, v6, Lvg0/a0$a;->w:Ljava/lang/Object;

    iput p2, v6, Lvg0/a0$a;->z:I

    const/4 v4, 0x0

    const/4 v7, 0x6

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p2, Lu02/a;

    instance-of p1, p2, Lu02/a$c;

    sget-object v0, Lm83/y;->w:Lm83/y;

    if-eqz p1, :cond_6

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lpg3/v0;

    iget-object p1, p1, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/ai/chat/api/AiSuggestionsResponse;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/ai/chat/api/AiSuggestionsResponse;->getSuggestions()Ljava/util/List;

    move-result-object p1

    if-nez p1, :cond_4

    goto :goto_3

    :cond_4
    return-object p1

    :cond_5
    :goto_3
    return-object v0

    :cond_6
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lvg0/a0;->b:Ltr2/n;

    check-cast p2, Lu02/a$b;

    invoke-virtual {p2}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object p2

    const-string v1, "Failed to fetch suggestions: "

    invoke-static {v1, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p1, p2, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public static synthetic e(Lvg0/a0;Ljava/lang/String;Ljava/lang/Long;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Lvg0/a0;->d(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final d(Ljava/lang/String;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lvg0/a0$c;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lvg0/a0$c;

    iget v1, v0, Lvg0/a0$c;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lvg0/a0$c;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lvg0/a0$c;

    invoke-direct {v0, p0, p3}, Lvg0/a0$c;-><init>(Lvg0/a0;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lvg0/a0$c;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lvg0/a0$c;->E:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lvg0/a0$c;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Ljava/lang/Long;

    iget-object p1, v0, Lvg0/a0$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lvg0/a0$c;->x:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Long;

    iget-object p1, v0, Lvg0/a0$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p3, 0x0

    if-nez p2, :cond_5

    iput-object p3, v0, Lvg0/a0$c;->w:Ljava/lang/Object;

    iput-object p3, v0, Lvg0/a0$c;->x:Ljava/lang/Object;

    iput v4, v0, Lvg0/a0$c;->E:I

    invoke-direct {p0, p1, v0}, Lvg0/a0;->c(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_1

    :cond_4
    return-object p1

    :cond_5
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    new-instance v2, Lvg0/a0$d;

    invoke-direct {v2, p0, p1, p3}, Lvg0/a0$d;-><init>(Lvg0/a0;Ljava/lang/String;Lq83/d;)V

    iput-object p3, v0, Lvg0/a0$c;->w:Ljava/lang/Object;

    iput-object p2, v0, Lvg0/a0$c;->x:Ljava/lang/Object;

    iput v3, v0, Lvg0/a0$c;->E:I

    invoke-static {v4, v5, v2, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    :goto_1
    return-object v1

    :cond_6
    :goto_2
    check-cast p3, Ljava/util/List;

    if-nez p3, :cond_7

    iget-object p1, p0, Lvg0/a0;->b:Ltr2/n;

    new-instance p3, Ljava/lang/StringBuilder;

    const-string v0, "Timed out fetching suggestions after "

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p2, "ms"

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 p3, 0x0

    new-array p3, p3, [Lqr2/a$a;

    invoke-interface {p1, p2, p3}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_7
    return-object p3
.end method
