.class public final Lmh0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lod1/g;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lmh0/a$a;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lod1/g<",
        "Lmh0/f;",
        "Lmh0/e;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ#\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u000f2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Lmh0/a;",
        "Lod1/g;",
        "Lmh0/f;",
        "Lmh0/e;",
        "Lcom/whoop/bot/api/StartTurnApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;)V",
        "Lcom/whoop/navigation/models/ApiRequest;",
        "request",
        "Lmh0/a$a;",
        "e",
        "(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "upstream",
        "interact",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/bot/api/StartTurnApi;",
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
.field private final a:Lcom/whoop/bot/api/StartTurnApi;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lmh0/a;->a:Lcom/whoop/bot/api/StartTurnApi;

    .line 3
    iput-object p2, p0, Lmh0/a;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "StartTurnButtonInteractor"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lmh0/a;-><init>(Lcom/whoop/bot/api/StartTurnApi;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lmh0/a;Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lmh0/a;->e(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lmh0/a;)Lcom/whoop/bot/api/StartTurnApi;
    .locals 0

    iget-object p0, p0, Lmh0/a;->a:Lcom/whoop/bot/api/StartTurnApi;

    return-object p0
.end method

.method private final e(Lcom/whoop/navigation/models/ApiRequest;Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/navigation/models/ApiRequest;",
            "Lq83/d<",
            "-",
            "Lmh0/a$a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lmh0/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lmh0/a$b;

    iget v1, v0, Lmh0/a$b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lmh0/a$b;->E:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lmh0/a$b;

    invoke-direct {v0, p0, p2}, Lmh0/a$b;-><init>(Lmh0/a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p2, v6, Lmh0/a$b;->y:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lmh0/a$b;->E:I

    const/4 v9, 0x0

    const-string v10, "StartTurnButton"

    const/4 v2, 0x1

    const/4 v11, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    iget-object p1, v6, Lmh0/a$b;->x:Ljava/lang/Object;

    check-cast p1, Lkotlinx/serialization/json/JsonElement;

    iget-object p1, v6, Lmh0/a$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/navigation/models/ApiRequest;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getMethod()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object p2

    sget-object v1, Lcom/whoop/navigation/models/GenericHttpMethod;->POST:Lcom/whoop/navigation/models/GenericHttpMethod;

    if-eq p2, v1, :cond_3

    iget-object p2, p0, Lmh0/a;->b:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getMethod()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "startTurn request must use POST. path="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " method="

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v9, [Lqr2/a$a;

    invoke-interface {p2, v10, p1, v0}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lmh0/a$a$b;->a:Lmh0/a$a$b;

    return-object p1

    :cond_3
    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object p2

    if-nez p2, :cond_4

    new-instance p2, Lkotlinx/serialization/json/JsonObject;

    sget-object v1, Lm83/z;->w:Lm83/z;

    invoke-direct {p2, v1}, Lkotlinx/serialization/json/JsonObject;-><init>(Ljava/util/Map;)V

    :cond_4
    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move v3, v2

    iget-object v2, p0, Lmh0/a;->b:Ltr2/n;

    new-instance v5, Lmh0/a$c;

    invoke-direct {v5, p0, p1, p2, v11}, Lmh0/a$c;-><init>(Lmh0/a;Lcom/whoop/navigation/models/ApiRequest;Lkotlinx/serialization/json/JsonElement;Lq83/d;)V

    iput-object p1, v6, Lmh0/a$b;->w:Ljava/lang/Object;

    iput-object v11, v6, Lmh0/a$b;->x:Ljava/lang/Object;

    iput v3, v6, Lmh0/a$b;->E:I

    const/4 v3, 0x0

    const-string v4, "StartTurnButton fire failed"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    check-cast p2, Lu02/a;

    instance-of v0, p2, Lu02/a$c;

    if-eqz v0, :cond_8

    check-cast p2, Lu02/a$c;

    invoke-virtual {p2}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lpg3/v0;

    iget-object p2, p2, Lpg3/v0;->b:Ljava/lang/Object;

    check-cast p2, Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;

    if-eqz p2, :cond_6

    invoke-virtual {p2}, Lcom/whoop/ai/chat/view/startturnbutton/StartTurnResponse;->getTurnId()Ljava/lang/String;

    move-result-object v11

    :cond_6
    if-eqz v11, :cond_7

    new-instance p1, Lmh0/a$a$d;

    invoke-direct {p1, v11}, Lmh0/a$a$d;-><init>(Ljava/lang/String;)V

    return-object p1

    :cond_7
    iget-object p2, p0, Lmh0/a;->b:Ltr2/n;

    invoke-virtual {p1}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object p1

    const-string v0, "startTurn returned no turn_id. path="

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v9, [Lqr2/a$a;

    invoke-interface {p2, v10, p1, v0}, Ltr2/n;->p(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lmh0/a$a$b;->a:Lmh0/a$a$b;

    return-object p1

    :cond_8
    instance-of p1, p2, Lu02/a$b;

    if-eqz p1, :cond_9

    sget-object p1, Lmh0/a$a$b;->a:Lmh0/a$a$b;

    return-object p1

    :cond_9
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method


# virtual methods
.method public interact(Lec3/l;)Lec3/l;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    const-string v0, "upstream"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmh0/a$d;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Lmh0/a$d;-><init>(Lq83/d;Lmh0/a;)V

    invoke-static {p1, v0}, Lec3/v;->P(Lec3/l;Lkotlin/jvm/functions/Function3;)Lfc3/k;

    move-result-object p1

    new-instance v0, Lmh0/e;

    const/4 v2, 0x0

    const/4 v3, 0x3

    invoke-direct {v0, v2, v1, v3, v1}, Lmh0/e;-><init>(ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v2, Lmh0/a$f;

    invoke-direct {v2, v1}, Lmh0/a$f;-><init>(Lq83/d;)V

    new-instance v1, Lec3/l1;

    invoke-direct {v1, v0, p1, v2}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v1
.end method
