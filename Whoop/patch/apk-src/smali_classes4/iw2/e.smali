.class public final Liw2/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\n\u0008\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nH\u0082@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\n0\u00122\u000c\u0010\u0014\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u0012\u00a2\u0006\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0019\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Liw2/e;",
        "",
        "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "Lgw2/a;",
        "analyticsHelper",
        "<init>",
        "(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;Lgw2/a;)V",
        "Liw2/b;",
        "accumulator",
        "Liw2/a$b;",
        "action",
        "g",
        "(Liw2/b;Liw2/a$b;)Liw2/b;",
        "f",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lec3/l;",
        "Liw2/a;",
        "upstream",
        "e",
        "(Lec3/l;)Lec3/l;",
        "a",
        "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;",
        "b",
        "Ltr2/n;",
        "c",
        "Lgw2/a;",
        "what-to-expect_release"
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
.field private final a:Lcom/whoop/whattoexpect/domain/WhatToExpectApi;

.field private final b:Ltr2/n;

.field private final c:Lgw2/a;


# direct methods
.method public constructor <init>(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;Lgw2/a;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "analyticsHelper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Liw2/e;->a:Lcom/whoop/whattoexpect/domain/WhatToExpectApi;

    .line 3
    iput-object p2, p0, Liw2/e;->b:Ltr2/n;

    .line 4
    iput-object p3, p0, Liw2/e;->c:Lgw2/a;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;Lgw2/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    .line 5
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p4, "WhatToExpectInteractor"

    invoke-virtual {p2, p4}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 6
    :cond_0
    invoke-direct {p0, p1, p2, p3}, Liw2/e;-><init>(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;Lgw2/a;)V

    return-void
.end method

.method public static final synthetic a(Liw2/e;)Lgw2/a;
    .locals 0

    iget-object p0, p0, Liw2/e;->c:Lgw2/a;

    return-object p0
.end method

.method public static final synthetic b(Liw2/e;)Lcom/whoop/whattoexpect/domain/WhatToExpectApi;
    .locals 0

    iget-object p0, p0, Liw2/e;->a:Lcom/whoop/whattoexpect/domain/WhatToExpectApi;

    return-object p0
.end method

.method public static final synthetic c(Liw2/e;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Liw2/e;->f(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Liw2/e;Liw2/b;Liw2/a$b;)Liw2/b;
    .locals 0

    invoke-direct {p0, p1, p2}, Liw2/e;->g(Liw2/b;Liw2/a$b;)Liw2/b;

    move-result-object p0

    return-object p0
.end method

.method private final f(Lq83/d;)Ljava/lang/Object;
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Liw2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Liw2/e$b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Liw2/e$b;

    iget v1, v0, Liw2/e$b;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Liw2/e$b;->y:I

    :goto_0
    move-object v6, v0

    goto :goto_1

    :cond_0
    new-instance v0, Liw2/e$b;

    invoke-direct {v0, p0, p1}, Liw2/e$b;-><init>(Liw2/e;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v6, Liw2/e$b;->w:Ljava/lang/Object;

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Liw2/e$b;->y:I

    const/4 v2, 0x1

    const/4 v9, 0x0

    if-eqz v1, :cond_2

    if-ne v1, v2, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v1, Lu02/a;->a:Lu02/a$a;

    move p1, v2

    iget-object v2, p0, Liw2/e;->b:Ltr2/n;

    new-instance v5, Liw2/e$c;

    invoke-direct {v5, p0, v9}, Liw2/e$c;-><init>(Liw2/e;Lq83/d;)V

    iput p1, v6, Liw2/e$b;->y:I

    const/4 v3, 0x0

    const-string v4, "Failed to get What to Expect data"

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-static/range {v1 .. v8}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    return-object v0

    :cond_3
    :goto_2
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_4

    new-instance v0, Liw2/b$c;

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;

    const/4 v1, 0x2

    invoke-direct {v0, p1, v9, v1, v9}, Liw2/b$c;-><init>(Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;Ls21/h;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0

    :cond_4
    instance-of p1, p1, Lu02/a$b;

    if-eqz p1, :cond_5

    sget-object p1, Liw2/b$a;->a:Liw2/b$a;

    return-object p1

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method private final g(Liw2/b;Liw2/a$b;)Liw2/b;
    .locals 2

    instance-of v0, p1, Liw2/b$c;

    if-eqz v0, :cond_0

    check-cast p1, Liw2/b$c;

    invoke-virtual {p2}, Liw2/a$b;->a()Ls21/h;

    move-result-object p2

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p1, v1, p2, v0, v1}, Liw2/b$c;->b(Liw2/b$c;Lcom/whoop/whattoexpect/domain/models/WhatToExpectResponse;Ls21/h;ILjava/lang/Object;)Liw2/b$c;

    move-result-object p1

    :cond_0
    return-object p1
.end method


# virtual methods
.method public final e(Lec3/l;)Lec3/l;
    .locals 3
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

    sget-object v0, Liw2/b$b;->a:Liw2/b$b;

    new-instance v1, Liw2/e$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Liw2/e$a;-><init>(Liw2/e;Lq83/d;)V

    new-instance v2, Lec3/l1;

    invoke-direct {v2, v0, p1, v1}, Lec3/l1;-><init>(Ljava/lang/Object;Lec3/l;Lkotlin/jvm/functions/Function3;)V

    return-object v2
.end method
