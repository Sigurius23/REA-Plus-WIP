.class public final Lw02/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001e\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\n\u0010\n\u001a\u00060\u0008j\u0002`\tH\u0086@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ2\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\u0004\u0008\u0000\u0010\u000e2\n\u0010\n\u001a\u00060\u0008j\u0002`\t2\u000c\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00028\u00000\u000fH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lw02/a;",
        "",
        "Lad3/c;",
        "json",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lad3/c;Ltr2/n;)V",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "error",
        "",
        "b",
        "(Ljava/lang/Exception;Lq83/d;)Ljava/lang/Object;",
        "T",
        "Lwc3/b;",
        "deserializer",
        "a",
        "(Ljava/lang/Exception;Lwc3/b;Lq83/d;)Ljava/lang/Object;",
        "Lad3/c;",
        "Ltr2/n;",
        "network_release"
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
.field private final a:Lad3/c;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Lad3/c;Ltr2/n;)V
    .locals 1

    const-string v0, "json"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lw02/a;->a:Lad3/c;

    .line 3
    iput-object p2, p0, Lw02/a;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Lad3/c;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    .line 4
    invoke-static {}, Lu82/k;->c()Lad3/c;

    move-result-object p1

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "ErrorBodyParser"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_1
    invoke-direct {p0, p1, p2}, Lw02/a;-><init>(Lad3/c;Ltr2/n;)V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Exception;Lwc3/b;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Exception;",
            "Lwc3/b;",
            "Lq83/d<",
            "-TT;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v0, ". Body: "

    const-string v1, "Failed to parse error response body: "

    instance-of v2, p3, Lw02/a$a;

    if-eqz v2, :cond_0

    move-object v2, p3

    check-cast v2, Lw02/a$a;

    iget v3, v2, Lw02/a$a;->E:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lw02/a$a;->E:I

    goto :goto_0

    :cond_0
    new-instance v2, Lw02/a$a;

    invoke-direct {v2, p0, p3}, Lw02/a$a;-><init>(Lw02/a;Lq83/d;)V

    :goto_0
    iget-object p3, v2, Lw02/a$a;->y:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lw02/a$a;->E:I

    const/4 v5, 0x1

    const/4 v6, 0x0

    if-eqz v4, :cond_2

    if-ne v4, v5, :cond_1

    iget-object p1, v2, Lw02/a$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lwc3/b;

    iget-object p1, v2, Lw02/a$a;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object v6, v2, Lw02/a$a;->w:Ljava/lang/Object;

    iput-object p2, v2, Lw02/a$a;->x:Ljava/lang/Object;

    iput v5, v2, Lw02/a$a;->E:I

    invoke-virtual {p0, p1, v2}, Lw02/a;->b(Ljava/lang/Exception;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v3, :cond_3

    return-object v3

    :cond_3
    :goto_1
    check-cast p3, Ljava/lang/String;

    if-nez p3, :cond_4

    return-object v6

    :cond_4
    const/4 p1, 0x0

    :try_start_0
    iget-object v2, p0, Lw02/a;->a:Lad3/c;

    invoke-virtual {v2, p2, p3}, Lad3/c;->b(Lwc3/b;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catch Lkotlinx/serialization/SerializationException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p1

    :catch_0
    move-exception p2

    goto :goto_2

    :catch_1
    move-exception p2

    goto :goto_3

    :goto_2
    iget-object v2, p0, Lw02/a;->b:Ltr2/n;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v2, p3, p2, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_4

    :goto_3
    iget-object v2, p0, Lw02/a;->b:Ltr2/n;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0, p3}, Lr80/c;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    new-array p1, p1, [Lqr2/a$a;

    invoke-interface {v2, p3, p2, p1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_4
    return-object v6
.end method

.method public final b(Ljava/lang/Exception;Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Exception;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p2, Lw02/a$b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lw02/a$b;

    iget v1, v0, Lw02/a$b;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lw02/a$b;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lw02/a$b;

    invoke-direct {v0, p0, p2}, Lw02/a$b;-><init>(Lw02/a;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lw02/a$b;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lw02/a$b;->z:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lw02/a$b;->w:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Exception;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p2, p1, Lio/ktor/client/plugins/ResponseException;

    if-eqz p2, :cond_4

    check-cast p1, Lio/ktor/client/plugins/ResponseException;

    iget-object p1, p1, Lio/ktor/client/plugins/ResponseException;->w:Lf63/c;

    iput-object v4, v0, Lw02/a$b;->w:Ljava/lang/Object;

    iput v3, v0, Lw02/a$b;->z:I

    sget-object p2, Lyb3/a;->a:Ljava/nio/charset/Charset;

    invoke-static {p1, p2, v0}, Lj93/l0;->k(Lf63/c;Ljava/nio/charset/Charset;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/String;

    goto :goto_2

    :cond_4
    instance-of p2, p1, Lretrofit2/HttpException;

    if-eqz p2, :cond_5

    check-cast p1, Lretrofit2/HttpException;

    iget-object p1, p1, Lretrofit2/HttpException;->y:Lpg3/v0;

    if-eqz p1, :cond_5

    iget-object p1, p1, Lpg3/v0;->c:Lud3/a1;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lud3/a1;->m()Ljava/lang/String;

    move-result-object p2

    goto :goto_2

    :cond_5
    move-object p2, v4

    :goto_2
    if-eqz p2, :cond_7

    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result p1

    if-nez p1, :cond_6

    goto :goto_3

    :cond_6
    return-object p2

    :cond_7
    :goto_3
    iget-object p1, p0, Lw02/a;->b:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Error body is null or empty, cannot deserialize."

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v4
.end method
