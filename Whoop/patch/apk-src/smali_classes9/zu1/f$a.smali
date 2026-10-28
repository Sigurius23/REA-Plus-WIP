.class final Lzu1/f$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lzu1/f;->e(Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lc93/m;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0002\u0010\u0003"
    }
    d2 = {
        "Lbc3/c0;",
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.limitedtimeoffer.domain.LtoDismissHandler$dismiss$1"
    f = "LtoDismissHandler.kt"
    l = {
        0x25,
        0x2c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lzu1/f;

.field final synthetic z:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lzu1/f;Ljava/lang/String;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzu1/f;",
            "Ljava/lang/String;",
            "Lq83/d<",
            "-",
            "Lzu1/f$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lzu1/f$a;->y:Lzu1/f;

    iput-object p2, p0, Lzu1/f$a;->z:Ljava/lang/String;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance p1, Lzu1/f$a;

    iget-object v0, p0, Lzu1/f$a;->y:Lzu1/f;

    iget-object v1, p0, Lzu1/f$a;->z:Ljava/lang/String;

    invoke-direct {p1, v0, v1, p2}, Lzu1/f$a;-><init>(Lzu1/f;Ljava/lang/String;Lq83/d;)V

    return-object p1
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lzu1/f$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lzu1/f$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lzu1/f$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lzu1/f$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lzu1/f$a;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lzu1/f$a;->w:Ljava/lang/Object;

    check-cast v0, Lu02/a;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, Lzu1/f$a;->y:Lzu1/f;

    invoke-static {p1}, Lzu1/f;->b(Lzu1/f;)Ltr2/n;

    move-result-object v6

    new-instance v9, Lzu1/f$a$a;

    iget-object p1, p0, Lzu1/f$a;->y:Lzu1/f;

    iget-object v1, p0, Lzu1/f$a;->z:Ljava/lang/String;

    invoke-direct {v9, p1, v1, v4}, Lzu1/f$a$a;-><init>(Lzu1/f;Ljava/lang/String;Lq83/d;)V

    iput v3, p0, Lzu1/f$a;->x:I

    const/4 v7, 0x0

    const-string v8, "dismissHomeLtoTile"

    const/4 v11, 0x2

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v1, p1, Lu02/a$c;

    if-nez v1, :cond_8

    instance-of v1, p1, Lu02/a$b;

    if-eqz v1, :cond_7

    iget-object v1, v10, Lzu1/f$a;->y:Lzu1/f;

    invoke-static {v1}, Lzu1/f;->b(Lzu1/f;)Ltr2/n;

    move-result-object v1

    iget-object v3, v10, Lzu1/f$a;->z:Ljava/lang/String;

    const-string v5, "Failed to dismiss LTO offer on server, offerId="

    invoke-static {v5, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    check-cast p1, Lu02/a$b;

    invoke-virtual {p1}, Lu02/a$b;->b()Ljava/lang/Exception;

    move-result-object p1

    const/4 v5, 0x0

    new-array v5, v5, [Lqr2/a$a;

    invoke-interface {v1, v3, p1, v5}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    iget-object p1, v10, Lzu1/f$a;->y:Lzu1/f;

    invoke-static {p1}, Lzu1/f;->d(Lzu1/f;)Lz92/a;

    move-result-object p1

    iput-object v4, v10, Lzu1/f$a;->w:Ljava/lang/Object;

    iput v2, v10, Lzu1/f$a;->x:I

    invoke-interface {p1, p0}, Lz92/a;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    :goto_1
    return-object v0

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/domain/model/User;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/domain/model/User;->getId()I

    move-result p1

    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v4

    :cond_5
    if-nez v4, :cond_6

    const-string v4, ""

    :cond_6
    iget-object p1, v10, Lzu1/f$a;->y:Lzu1/f;

    invoke-static {p1}, Lzu1/f;->c(Lzu1/f;)Lu92/c;

    move-result-object p1

    iget-object v0, v10, Lzu1/f$a;->z:Ljava/lang/String;

    invoke-virtual {p1, v4, v0}, Lu92/c;->c(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_3

    :cond_7
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_8
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
