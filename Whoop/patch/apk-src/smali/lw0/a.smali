.class public final Llw0/a;
.super Lhj0/n;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001e\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u0018\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@\u00a2\u0006\u0004\u0008\u0018\u0010\u0016J\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0080@\u00a2\u0006\u0004\u0008\u0019\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001f"
    }
    d2 = {
        "Llw0/a;",
        "Lhj0/n;",
        "Lcom/whoop/core/details/network/api/CoreDetailsApi;",
        "coreDetailsApi",
        "Ltr2/n;",
        "logger",
        "Lin2/d;",
        "dispatcherFactory",
        "Lrr2/c;",
        "crashReporter",
        "<init>",
        "(Lcom/whoop/core/details/network/api/CoreDetailsApi;Ltr2/n;Lin2/d;Lrr2/c;)V",
        "Lud3/a1;",
        "e",
        "Lcom/whoop/core/details/network/model/sleep/ErrorMessage;",
        "i",
        "(Lud3/a1;)Lcom/whoop/core/details/network/model/sleep/ErrorMessage;",
        "",
        "sleepIdV2",
        "Lcom/whoop/data/remote/commons/Resource;",
        "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
        "j",
        "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;",
        "",
        "h",
        "k",
        "a",
        "Lcom/whoop/core/details/network/api/CoreDetailsApi;",
        "b",
        "Lcom/whoop/core/details/network/model/sleep/ErrorMessage;",
        "defaultErrorMessage",
        "core-details_release"
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
.field private final a:Lcom/whoop/core/details/network/api/CoreDetailsApi;

.field private final b:Lcom/whoop/core/details/network/model/sleep/ErrorMessage;


# direct methods
.method public constructor <init>(Lcom/whoop/core/details/network/api/CoreDetailsApi;Ltr2/n;Lin2/d;Lrr2/c;)V
    .locals 2

    const-string v0, "coreDetailsApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p2, p4, p3}, Lhj0/n;-><init>(Ltr2/n;Lrr2/c;Lin2/d;)V

    iput-object p1, p0, Llw0/a;->a:Lcom/whoop/core/details/network/api/CoreDetailsApi;

    new-instance p1, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    new-instance p2, Lcom/whoop/design/util/TextResource$b;

    sget p3, Lvv0/b;->z:I

    const/4 p4, 0x0

    const/4 v0, 0x2

    invoke-direct {p2, p3, p4, v0, p4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance p3, Lcom/whoop/design/util/TextResource$b;

    sget v1, Lvv0/b;->B:I

    invoke-direct {p3, v1, p4, v0, p4}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p1, p2, p3}, Lcom/whoop/core/details/network/model/sleep/ErrorMessage;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    iput-object p1, p0, Llw0/a;->b:Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    return-void
.end method

.method public static final synthetic e(Llw0/a;)Lcom/whoop/core/details/network/api/CoreDetailsApi;
    .locals 0

    iget-object p0, p0, Llw0/a;->a:Lcom/whoop/core/details/network/api/CoreDetailsApi;

    return-object p0
.end method

.method public static final synthetic f(Llw0/a;)Lrr2/c;
    .locals 0

    invoke-virtual {p0}, Lhj0/n;->getCrashReporter()Lrr2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic g(Llw0/a;)Ltr2/n;
    .locals 0

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method private final i(Lud3/a1;)Lcom/whoop/core/details/network/model/sleep/ErrorMessage;
    .locals 3

    :try_start_0
    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p1

    const-class v0, Lcom/whoop/core/details/network/model/sleep/ErrorMessageModel;

    invoke-static {p1, v0}, Lor2/i0;->e(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/core/details/network/model/sleep/ErrorMessageModel;

    invoke-virtual {p1}, Lcom/whoop/core/details/network/model/sleep/ErrorMessageModel;->toErrorMessage()Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p1

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "Backend contract violation, could not serialize following error message"

    invoke-interface {v0, v2, p1, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, p0, Llw0/a;->b:Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    return-object p1
.end method


# virtual methods
.method public final h(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llw0/a$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llw0/a$a;

    iget v1, v0, Llw0/a$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llw0/a$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llw0/a$a;

    invoke-direct {v0, p0, p2}, Llw0/a$a;-><init>(Llw0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llw0/a$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llw0/a$a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Llw0/a$a;->w:Ljava/lang/Object;

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

    :try_start_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_4

    iget-object p2, p0, Llw0/a;->a:Lcom/whoop/core/details/network/api/CoreDetailsApi;

    const/4 v2, 0x0

    iput-object v2, v0, Llw0/a$a;->w:Ljava/lang/Object;

    iput v4, v0, Llw0/a$a;->z:I

    invoke-interface {p2, p1, v0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->deleteSleep(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lpg3/v0;

    iget-object p1, p2, Lpg3/v0;->a:Lud3/x0;

    iget-boolean v3, p1, Lud3/x0;->Q:Z
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :goto_2
    const-string p2, "failed to delete sleep"

    invoke-virtual {p0, p1, p2}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    :cond_4
    :goto_3
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final j(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/remote/commons/Resource<",
            "Lcom/whoop/core/details/network/model/sleep/SleepDetailsModel;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0}, Lhj0/n;->getDispatcherFactory()Lin2/d;

    move-result-object v0

    invoke-interface {v0}, Lin2/d;->b()Lq83/j;

    move-result-object v0

    new-instance v1, Llw0/a$b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Llw0/a$b;-><init>(Llw0/a;Ljava/lang/String;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final k(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/core/details/network/model/sleep/ErrorMessage;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Llw0/a$c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Llw0/a$c;

    iget v1, v0, Llw0/a$c;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Llw0/a$c;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Llw0/a$c;

    invoke-direct {v0, p0, p2}, Llw0/a$c;-><init>(Llw0/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Llw0/a$c;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Llw0/a$c;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Llw0/a$c;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p2

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_5

    iget-object p2, p0, Llw0/a;->a:Lcom/whoop/core/details/network/api/CoreDetailsApi;

    iput-object p1, v0, Llw0/a$c;->w:Ljava/lang/Object;

    iput v3, v0, Llw0/a$c;->z:I

    invoke-interface {p2, p1, v0}, Lcom/whoop/core/details/network/api/CoreDetailsApi;->napToSleep(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lpg3/v0;

    iget-object p2, p2, Lpg3/v0;->c:Lud3/a1;

    if-eqz p2, :cond_4

    invoke-direct {p0, p2}, Llw0/a;->i(Lud3/a1;)Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1

    :cond_5
    iget-object p1, p0, Llw0/a;->b:Lcom/whoop/core/details/network/model/sleep/ErrorMessage;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "failed to convert nap "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, " to sleep"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    iget-object p1, p0, Llw0/a;->b:Lcom/whoop/core/details/network/model/sleep/ErrorMessage;

    return-object p1
.end method
