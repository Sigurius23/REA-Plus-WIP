.class final La03/c$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = La03/c;->interact(Lec3/l;)Lec3/l;
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
        "La03/d;",
        "previousResult",
        "La03/a;",
        "action",
        "<anonymous>",
        "(La03/d;La03/a;)La03/d;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.whoopstatus.domain.WhoopStatusInteractor$interact$1"
    f = "WhoopStatusInteractor.kt"
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

.field final synthetic z:La03/c;


# direct methods
.method public constructor <init>(La03/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La03/c;",
            "Lq83/d<",
            "-",
            "La03/c$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, La03/c$a;->z:La03/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(La03/d;La03/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "La03/d;",
            "La03/a;",
            "Lq83/d<",
            "-",
            "La03/d;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, La03/c$a;

    iget-object v1, p0, La03/c$a;->z:La03/c;

    invoke-direct {v0, v1, p3}, La03/c$a;-><init>(La03/c;Lq83/d;)V

    iput-object p1, v0, La03/c$a;->x:Ljava/lang/Object;

    iput-object p2, v0, La03/c$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, La03/c$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, La03/d;

    check-cast p2, La03/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, La03/c$a;->f(La03/d;La03/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget-object v0, p0, La03/c$a;->x:Ljava/lang/Object;

    check-cast v0, La03/d;

    iget-object v1, p0, La03/c$a;->y:Ljava/lang/Object;

    check-cast v1, La03/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, La03/c$a;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v10, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    instance-of p1, v1, La03/a$b;

    if-eqz p1, :cond_7

    sget-object v5, Lu02/a;->a:Lu02/a$a;

    iget-object p1, p0, La03/c$a;->z:La03/c;

    invoke-static {p1}, La03/c;->d(La03/c;)Ltr2/n;

    move-result-object v6

    new-instance v9, La03/c$a$a;

    iget-object p1, p0, La03/c$a;->z:La03/c;

    const/4 v0, 0x0

    invoke-direct {v9, p1, v0}, La03/c$a$a;-><init>(La03/c;Lq83/d;)V

    iput-object v0, p0, La03/c$a;->x:Ljava/lang/Object;

    iput-object v1, p0, La03/c$a;->y:Ljava/lang/Object;

    iput v4, p0, La03/c$a;->w:I

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x6

    const/4 v12, 0x0

    move-object v10, p0

    invoke-static/range {v5 .. v12}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    check-cast p1, Lu02/a;

    instance-of v0, p1, Lu02/a$b$a;

    if-nez v0, :cond_6

    instance-of v0, p1, Lu02/a$b$b;

    if-eqz v0, :cond_3

    goto :goto_1

    :cond_3
    instance-of v0, p1, Lu02/a$c;

    if-eqz v0, :cond_5

    check-cast p1, Lu02/a$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;

    invoke-virtual {v0}, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;->getActiveMaintenance()Z

    move-result v0

    iget-object v2, v10, La03/c$a;->z:La03/c;

    if-eqz v0, :cond_4

    invoke-static {v2}, La03/c;->c(La03/c;)La03/b;

    move-result-object v0

    check-cast v1, La03/a$b;

    invoke-virtual {v1}, La03/a$b;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Alert Viewable"

    invoke-virtual {v0, v1, v2}, La03/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    :cond_4
    new-instance v0, La03/d$c;

    invoke-virtual {p1}, Lu02/a$c;->a()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;

    invoke-direct {v0, p1}, La03/d$c;-><init>(Lcom/whoop/whoopstatus/domain/model/WhoopStatusResponse;)V

    return-object v0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    :goto_1
    sget-object p1, La03/d$a;->a:La03/d$a;

    return-object p1

    :cond_7
    move-object v10, p0

    instance-of p1, v1, La03/a$a;

    if-eqz p1, :cond_8

    iget-object p1, v10, La03/c$a;->z:La03/c;

    invoke-static {p1}, La03/c;->c(La03/c;)La03/b;

    move-result-object p1

    check-cast v1, La03/a$a;

    invoke-virtual {v1}, La03/a$a;->a()Ljava/lang/String;

    move-result-object v1

    const-string v2, "Alert Tapped"

    invoke-virtual {p1, v1, v2}, La03/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
