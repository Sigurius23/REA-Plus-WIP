.class public final Lu02/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lu02/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003JX\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u000e\"\u0004\u0008\u0001\u0010\u00042\u0006\u0010\u0006\u001a\u00020\u00052\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u001c\u0010\r\u001a\u0018\u0008\u0001\u0012\n\u0012\u0008\u0012\u0004\u0012\u00028\u00010\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u000bH\u0086@\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lu02/a$a;",
        "",
        "<init>",
        "()V",
        "T",
        "Ltr2/n;",
        "logger",
        "Lrr2/c;",
        "crashReporter",
        "",
        "errorPrefix",
        "Lkotlin/Function1;",
        "Lq83/d;",
        "apiCall",
        "Lu02/a;",
        "a",
        "(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;",
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


# static fields
.field static final synthetic a:Lu02/a$a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lu02/a$a;

    invoke-direct {v0}, Lu02/a$a;-><init>()V

    sput-object v0, Lu02/a$a;->a:Lu02/a$a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 6

    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    const-string p3, ""

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lu02/a$a;->a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final a(Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ltr2/n;",
            "Lrr2/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lu02/a<",
            "+TT;>;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p5, Lu02/a$a$a;

    if-eqz v0, :cond_0

    move-object v0, p5

    check-cast v0, Lu02/a$a$a;

    iget v1, v0, Lu02/a$a$a;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lu02/a$a$a;->G:I

    :goto_0
    move-object p5, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lu02/a$a$a;

    invoke-direct {v0, p0, p5}, Lu02/a$a$a;-><init>(Lu02/a$a;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, p5, Lu02/a$a$a;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p5, Lu02/a$a$a;->G:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, p5, Lu02/a$a$a;->z:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/functions/Function1;

    iget-object p1, p5, Lu02/a$a$a;->y:Ljava/lang/Object;

    move-object p3, p1

    check-cast p3, Ljava/lang/String;

    iget-object p1, p5, Lu02/a$a$a;->x:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lrr2/c;

    iget-object p1, p5, Lu02/a$a$a;->w:Ljava/lang/Object;

    check-cast p1, Ltr2/n;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object p4, v0

    move-object v1, p4

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iput-object p1, p5, Lu02/a$a$a;->w:Ljava/lang/Object;

    iput-object p2, p5, Lu02/a$a$a;->x:Ljava/lang/Object;

    iput-object p3, p5, Lu02/a$a$a;->y:Ljava/lang/Object;

    const/4 v0, 0x0

    iput-object v0, p5, Lu02/a$a$a;->z:Ljava/lang/Object;

    iput v3, p5, Lu02/a$a$a;->G:I

    invoke-interface {p4, p5}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    instance-of p4, v0, Lpg3/v0;

    if-eqz p4, :cond_5

    move-object p4, v0

    check-cast p4, Lpg3/v0;

    iget-object p4, p4, Lpg3/v0;->a:Lud3/x0;

    iget-boolean p4, p4, Lud3/x0;->Q:Z

    if-eqz p4, :cond_4

    new-instance p4, Lu02/a$c;

    invoke-direct {p4, v0}, Lu02/a$c;-><init>(Ljava/lang/Object;)V

    return-object p4

    :cond_4
    new-instance p4, Lretrofit2/HttpException;

    check-cast v0, Lpg3/v0;

    invoke-direct {p4, v0}, Lretrofit2/HttpException;-><init>(Lpg3/v0;)V

    throw p4

    :cond_5
    new-instance p4, Lu02/a$c;

    invoke-direct {p4, v0}, Lu02/a$c;-><init>(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p4

    :goto_3
    invoke-interface {p5}, Lq83/d;->getContext()Lq83/j;

    move-result-object p4

    invoke-static {p4}, Lbc3/f0;->o(Lq83/j;)V

    invoke-static {v1, p3, p1, p2}, Lw02/b;->a(Ljava/lang/Throwable;Ljava/lang/String;Ltr2/n;Lrr2/c;)Ljava/lang/String;

    move-result-object v2

    instance-of p1, v1, Ljava/io/IOException;

    const/4 p2, 0x0

    if-eqz p1, :cond_6

    new-instance p1, Lu02/a$b$b;

    invoke-direct {p1, v1, v2, p2}, Lu02/a$b$b;-><init>(Ljava/lang/Exception;Ljava/lang/String;Z)V

    goto :goto_4

    :cond_6
    instance-of p1, v1, Lretrofit2/HttpException;

    if-eqz p1, :cond_7

    new-instance p1, Lu02/a$b$a;

    move-object p3, v1

    check-cast p3, Lretrofit2/HttpException;

    iget p3, p3, Lretrofit2/HttpException;->w:I

    invoke-direct {p1, v1, v2, p3, p2}, Lu02/a$b$a;-><init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V

    goto :goto_4

    :cond_7
    instance-of p1, v1, Lio/ktor/client/plugins/ResponseException;

    if-eqz p1, :cond_8

    new-instance p1, Lu02/a$b$a;

    move-object p3, v1

    check-cast p3, Lio/ktor/client/plugins/ResponseException;

    iget-object p3, p3, Lio/ktor/client/plugins/ResponseException;->w:Lf63/c;

    invoke-virtual {p3}, Lf63/c;->e()Li63/v;

    move-result-object p3

    iget p3, p3, Li63/v;->a:I

    invoke-direct {p1, v1, v2, p3, p2}, Lu02/a$b$a;-><init>(Ljava/lang/Exception;Ljava/lang/String;IZ)V

    goto :goto_4

    :cond_8
    instance-of p1, v1, Lkotlinx/serialization/SerializationException;

    if-eqz p1, :cond_9

    new-instance v0, Lu02/a$b$a$a;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v0 .. v6}, Lu02/a$b$a$a;-><init>(Ljava/lang/Exception;Ljava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object p1, v0

    :goto_4
    return-object p1

    :cond_9
    throw v1
.end method
