.class final Liw2/e$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Liw2/e;->e(Lec3/l;)Lec3/l;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Liw2/b;",
        "accumulator",
        "Liw2/a;",
        "action",
        "<anonymous>",
        "(Liw2/b;Liw2/a;)Liw2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whattoexpect.domain.WhatToExpectInteractor$interact$1"
    f = "WhatToExpectInteractor.kt"
    l = {
        0x13
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Liw2/e;


# direct methods
.method public constructor <init>(Liw2/e;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw2/e;",
            "Lq83/d<",
            "-",
            "Liw2/e$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Liw2/e$a;->z:Liw2/e;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Liw2/b;Liw2/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Liw2/b;",
            "Liw2/a;",
            "Lq83/d<",
            "-",
            "Liw2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Liw2/e$a;

    iget-object v1, p0, Liw2/e$a;->z:Liw2/e;

    invoke-direct {v0, v1, p3}, Liw2/e$a;-><init>(Liw2/e;Lq83/d;)V

    iput-object p1, v0, Liw2/e$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Liw2/e$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Liw2/e$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Liw2/b;

    check-cast p2, Liw2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Liw2/e$a;->f(Liw2/b;Liw2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Liw2/e$a;->x:Ljava/lang/Object;

    check-cast v0, Liw2/b;

    iget-object v1, p0, Liw2/e$a;->y:Ljava/lang/Object;

    check-cast v1, Liw2/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Liw2/e$a;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, Liw2/a$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Liw2/e$a;->z:Liw2/e;

    const/4 v0, 0x0

    iput-object v0, p0, Liw2/e$a;->x:Ljava/lang/Object;

    iput-object v1, p0, Liw2/e$a;->y:Ljava/lang/Object;

    iput v4, p0, Liw2/e$a;->w:I

    invoke-static {p1, p0}, Liw2/e;->c(Liw2/e;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    iget-object v0, p0, Liw2/e$a;->z:Liw2/e;

    check-cast p1, Liw2/b;

    check-cast v1, Liw2/a$a;

    invoke-virtual {v1}, Liw2/a$a;->a()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-static {v0}, Liw2/e;->a(Liw2/e;)Lgw2/a;

    move-result-object v0

    invoke-virtual {v0}, Lgw2/a;->c()V

    :cond_3
    return-object p1

    :cond_4
    instance-of p1, v1, Liw2/a$b;

    if-eqz p1, :cond_6

    check-cast v1, Liw2/a$b;

    invoke-virtual {v1}, Liw2/a$b;->a()Ls21/h;

    move-result-object p1

    if-eqz p1, :cond_5

    iget-object v2, p0, Liw2/e$a;->z:Liw2/e;

    invoke-static {v2}, Liw2/e;->a(Liw2/e;)Lgw2/a;

    move-result-object v2

    const/4 v3, 0x0

    invoke-virtual {p1}, Ls21/h;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, v3, p1}, Lgw2/a;->a(ZLjava/lang/String;)V

    :cond_5
    iget-object p1, p0, Liw2/e$a;->z:Liw2/e;

    invoke-static {p1, v0, v1}, Liw2/e;->d(Liw2/e;Liw2/b;Liw2/a$b;)Liw2/b;

    move-result-object p1

    return-object p1

    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
