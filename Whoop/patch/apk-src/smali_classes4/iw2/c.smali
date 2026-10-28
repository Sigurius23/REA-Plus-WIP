.class public final Liw2/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0086@\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Liw2/c;",
        "",
        "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;",
        "api",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;)V",
        "Lq83/j;",
        "coroutineContext",
        "Liw2/d;",
        "c",
        "(Lq83/j;Lq83/d;)Ljava/lang/Object;",
        "a",
        "Lcom/whoop/whattoexpect/domain/WhatToExpectApi;",
        "b",
        "Ltr2/n;",
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


# direct methods
.method public constructor <init>(Lcom/whoop/whattoexpect/domain/WhatToExpectApi;Ltr2/n;)V
    .locals 1

    const-string v0, "api"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Liw2/c;->a:Lcom/whoop/whattoexpect/domain/WhatToExpectApi;

    iput-object p2, p0, Liw2/c;->b:Ltr2/n;

    return-void
.end method

.method public static final synthetic a(Liw2/c;)Lcom/whoop/whattoexpect/domain/WhatToExpectApi;
    .locals 0

    iget-object p0, p0, Liw2/c;->a:Lcom/whoop/whattoexpect/domain/WhatToExpectApi;

    return-object p0
.end method

.method public static final synthetic b(Liw2/c;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Liw2/c;->b:Ltr2/n;

    return-object p0
.end method


# virtual methods
.method public final c(Lq83/j;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/j;",
            "Lq83/d<",
            "-",
            "Liw2/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liw2/c$a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Liw2/c$a;-><init>(Liw2/c;Lq83/d;)V

    invoke-static {p1, v0, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
