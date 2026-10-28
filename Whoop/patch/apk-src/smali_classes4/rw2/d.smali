.class public final Lrw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lrw2/a;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0018\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u000eJ\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0018\u001a\u0008\u0012\u0004\u0012\u00020\u000c0\u00152\u000c\u0010\u0017\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u0015H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001d\u0010\u001eR(\u0010%\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020!0 0\u001f8\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008\u001a\u0010$\u00a8\u0006&"
    }
    d2 = {
        "Lrw2/d;",
        "Lrw2/a;",
        "Lu02/c;",
        "apiClient",
        "Lad3/c;",
        "json",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lu02/c;Lad3/c;Ltr2/n;)V",
        "Lcom/whoop/whoopaction/domain/models/PollingAction;",
        "action",
        "Lqw2/b;",
        "h",
        "(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/navigation/models/GenericInteraction;",
        "i",
        "Lf63/c;",
        "response",
        "g",
        "(Lf63/c;Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Lqw2/a;",
        "upstream",
        "b",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lu02/c;",
        "Lad3/c;",
        "c",
        "Ltr2/n;",
        "",
        "Lj93/d;",
        "Lcom/whoop/whoopaction/domain/models/Action;",
        "d",
        "Ljava/util/Set;",
        "()Ljava/util/Set;",
        "actionTypes",
        "whoop-action_release"
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

.field private final b:Lad3/c;

.field private final c:Ltr2/n;

.field private final d:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lu02/c;Lad3/c;Ltr2/n;)V
    .locals 1

    const-string v0, "apiClient"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "json"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lrw2/d;->a:Lu02/c;

    .line 3
    iput-object p2, p0, Lrw2/d;->b:Lad3/c;

    .line 4
    iput-object p3, p0, Lrw2/d;->c:Ltr2/n;

    .line 5
    const-class p1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    .line 6
    sget-object p2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {p2, p1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p1

    .line 7
    invoke-static {p1}, Ldt/b;->S(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object p1

    iput-object p1, p0, Lrw2/d;->d:Ljava/util/Set;

    return-void
.end method

.method public synthetic constructor <init>(Lu02/c;Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    .line 8
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p2

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    .line 9
    sget-object p3, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "PollingActionHandler"

    invoke-virtual {p3, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p3

    .line 10
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lrw2/d;-><init>(Lu02/c;Lad3/c;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic c(Lrw2/d;Lf63/c;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrw2/d;->g(Lf63/c;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Lrw2/d;Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrw2/d;->h(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lrw2/d;)Lu02/c;
    .locals 0

    iget-object p0, p0, Lrw2/d;->a:Lu02/c;

    return-object p0
.end method

.method public static final synthetic f(Lrw2/d;Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lrw2/d;->i(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final g(Lf63/c;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf63/c;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lrw2/d$a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrw2/d$a;

    iget v1, v0, Lrw2/d$a;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrw2/d$a;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrw2/d$a;

    invoke-direct {v0, p0, p2}, Lrw2/d$a;-><init>(Lrw2/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrw2/d$a;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrw2/d$a;->z:I

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lrw2/d$a;->w:Ljava/lang/Object;

    check-cast p1, Lf63/c;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object v5, v0, Lrw2/d$a;->w:Ljava/lang/Object;

    iput v4, v0, Lrw2/d$a;->z:I

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {p1, p2, v0}, Lj93/l0;->k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_4

    goto :goto_2

    :cond_4
    :try_start_2
    iget-object p1, p0, Lrw2/d;->b:Lad3/c;

    sget-object v0, Lcom/whoop/whoopaction/domain/models/GenericPollingResult;->Companion:Lcom/whoop/whoopaction/domain/models/GenericPollingResult$Companion;

    invoke-virtual {v0}, Lcom/whoop/whoopaction/domain/models/GenericPollingResult$Companion;->serializer()Lwc3/c;

    move-result-object v0

    check-cast v0, Lwc3/b;

    invoke-virtual {p1, v0, p2}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopaction/domain/models/GenericPollingResult;
    :try_end_2
    .catch Lkotlinx/serialization/SerializationException; {:try_start_2 .. :try_end_2} :catch_1

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/GenericPollingResult;->getInteraction()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/navigation/models/GenericInteraction;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_5

    return-object p1

    :cond_5
    :goto_2
    return-object v5

    :catch_1
    move-exception p1

    iget-object p2, p0, Lrw2/d;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Polling response body is not a GenericPollingResult: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v5

    :goto_3
    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p2

    invoke-static {p2}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p2, p0, Lrw2/d;->c:Ltr2/n;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "Failed to read polling response body: "

    invoke-static {v0, p1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-array v0, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v5
.end method

.method private final h(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/PollingAction;",
            "Lq83/d<",
            "-",
            "Lqw2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lrw2/d$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lrw2/d$b;

    iget v1, v0, Lrw2/d$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lrw2/d$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lrw2/d$b;

    invoke-direct {v0, p0, p2}, Lrw2/d$b;-><init>(Lrw2/d;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lrw2/d$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lrw2/d$b;->z:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lrw2/d$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lrw2/d$b;->w:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/whoopaction/domain/models/PollingAction;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object p2

    if-eqz p2, :cond_5

    invoke-virtual {p1}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object p2

    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    new-instance p2, Lrw2/d$c;

    const/4 v5, 0x0

    invoke-direct {p2, p0, p1, v5}, Lrw2/d$c;-><init>(Lrw2/d;Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)V

    iput-object p1, v0, Lrw2/d$b;->w:Ljava/lang/Object;

    iput v4, v0, Lrw2/d$b;->z:I

    invoke-static {v2, v3, p2, v0}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_1
    check-cast p2, Lcom/whoop/navigation/models/GenericInteraction;

    :goto_2
    move-object v2, p1

    goto :goto_5

    :cond_5
    iput-object p1, v0, Lrw2/d$b;->w:Ljava/lang/Object;

    iput v3, v0, Lrw2/d$b;->z:I

    invoke-direct {p0, p1, v0}, Lrw2/d;->i(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    :goto_3
    return-object v1

    :cond_6
    :goto_4
    check-cast p2, Lcom/whoop/navigation/models/GenericInteraction;

    goto :goto_2

    :goto_5
    if-eqz p2, :cond_7

    new-instance p1, Lqw2/b$b;

    invoke-direct {p1, p2, v2}, Lqw2/b$b;-><init>(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getOnTimeout()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance p1, Lqw2/b$b;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getOnTimeout()Lcom/whoop/navigation/models/GenericInteraction;

    move-result-object p2

    invoke-direct {p1, p2, v2}, Lqw2/b$b;-><init>(Lcom/whoop/navigation/models/GenericInteraction;Lcom/whoop/whoopaction/domain/models/Action;)V

    return-object p1

    :cond_8
    new-instance v0, Lqw2/b$a;

    invoke-virtual {v2}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getTimeoutMillis()Ljava/lang/Long;

    move-result-object p1

    new-instance p2, Ljava/lang/StringBuilder;

    const-string v1, "PollingAction timed out after "

    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "ms"

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lqw2/b$a;-><init>(Ljava/lang/String;Lcom/whoop/whoopaction/domain/models/Action;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method

.method private final i(Lcom/whoop/whoopaction/domain/models/PollingAction;Lq83/d;)Ljava/lang/Object;
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/whoopaction/domain/models/PollingAction;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/navigation/models/GenericInteraction;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lrw2/d$e;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lrw2/d$e;

    iget v3, v2, Lrw2/d$e;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lrw2/d$e;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lrw2/d$e;

    invoke-direct {v2, v0, v1}, Lrw2/d$e;-><init>(Lrw2/d;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lrw2/d$e;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lrw2/d$e;->E:I

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v4, :cond_4

    if-eq v4, v6, :cond_3

    if-ne v4, v5, :cond_2

    iget-object v4, v2, Lrw2/d$e;->x:Ljava/lang/Object;

    check-cast v4, Lu02/a;

    iget-object v4, v2, Lrw2/d$e;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/PollingAction;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object v13, v2

    move-object v1, v4

    goto :goto_1

    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_3
    iget-object v4, v2, Lrw2/d$e;->w:Ljava/lang/Object;

    check-cast v4, Lcom/whoop/whoopaction/domain/models/PollingAction;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    move-object v13, v2

    :goto_1
    invoke-interface {v13}, Lq83/d;->getContext()Lq83/j;

    move-result-object v2

    invoke-static {v2}, Lbc3/f0;->x(Lq83/j;)Z

    move-result v2

    if-eqz v2, :cond_9

    sget-object v8, Lu02/a;->a:Lu02/a$a;

    iget-object v9, v0, Lrw2/d;->c:Ltr2/n;

    new-instance v12, Lrw2/d$f;

    invoke-direct {v12, v1, v0, v7}, Lrw2/d$f;-><init>(Lcom/whoop/whoopaction/domain/models/PollingAction;Lrw2/d;Lq83/d;)V

    iput-object v1, v13, Lrw2/d$e;->w:Ljava/lang/Object;

    iput-object v7, v13, Lrw2/d$e;->x:Ljava/lang/Object;

    iput v6, v13, Lrw2/d$e;->E:I

    const/4 v10, 0x0

    const-string v11, "PollingAction failed"

    const/4 v14, 0x2

    const/4 v15, 0x0

    invoke-static/range {v8 .. v15}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v3, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, v1

    move-object v1, v2

    move-object v2, v13

    :goto_2
    check-cast v1, Lu02/a;

    instance-of v8, v1, Lu02/a$c;

    if-eqz v8, :cond_6

    check-cast v1, Lu02/a$c;

    invoke-virtual {v1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/navigation/models/GenericInteraction;

    if-eqz v1, :cond_7

    return-object v1

    :cond_6
    instance-of v8, v1, Lu02/a$b;

    if-eqz v8, :cond_8

    iget-object v8, v0, Lrw2/d;->c:Ltr2/n;

    check-cast v1, Lu02/a$b;

    invoke-virtual {v1}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v1

    const-string v9, "Polling iteration failed; will retry: "

    invoke-static {v9, v1}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const/4 v9, 0x0

    new-array v9, v9, [Lqr2/a$a;

    invoke-interface {v8, v1, v9}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    invoke-virtual {v4}, Lcom/whoop/whoopaction/domain/models/PollingAction;->getFrequencyMillis()J

    move-result-wide v8

    iput-object v4, v2, Lrw2/d$e;->w:Ljava/lang/Object;

    iput-object v7, v2, Lrw2/d$e;->x:Ljava/lang/Object;

    iput v5, v2, Lrw2/d$e;->E:I

    invoke-static {v8, v9, v2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    :goto_3
    return-object v3

    :cond_8
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1

    :cond_9
    return-object v7
.end method


# virtual methods
.method public a()Ljava/util/Set;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lj93/d;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lrw2/d;->d:Ljava/util/Set;

    return-object v0
.end method

.method public b(Lec3/l;)Lec3/l;
    .locals 2
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

    new-instance v0, Lrw2/d$d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lrw2/d$d;-><init>(Lrw2/d;Lq83/d;)V

    invoke-static {v0, p1}, Lec3/v;->D(Lc93/m;Lec3/l;)Lch/o;

    move-result-object p1

    return-object p1
.end method

.method public bridge interact(Lec3/l;)Lec3/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/l;",
            ")",
            "Lec3/l;"
        }
    .end annotation

    invoke-super {p0, p1}, Lrw2/a;->interact(Lec3/l;)Lec3/l;

    move-result-object p1

    return-object p1
.end method
