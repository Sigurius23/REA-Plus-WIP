.class final Lvd2/c$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lvd2/c;->k(Lec3/l;)Lec3/l;
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
        "Lvd2/b;",
        "prevDomainState",
        "Lvd2/a;",
        "domainAction",
        "<anonymous>",
        "(Lvd2/b;Lvd2/a;)Lvd2/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.shepherd.feature.notificationhistory.domain.ShepherdNotificationHistoryInteractor$interact$1"
    f = "ShepherdNotificationHistoryInteractor.kt"
    l = {
        0x1d,
        0x20,
        0x37,
        0x4e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lvd2/c;


# direct methods
.method public constructor <init>(Lvd2/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/c;",
            "Lq83/d<",
            "-",
            "Lvd2/c$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvd2/b;Lvd2/a;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvd2/b;",
            "Lvd2/a;",
            "Lq83/d<",
            "-",
            "Lvd2/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lvd2/c$i;

    iget-object v1, p0, Lvd2/c$i;->z:Lvd2/c;

    invoke-direct {v0, v1, p3}, Lvd2/c$i;-><init>(Lvd2/c;Lq83/d;)V

    iput-object p1, v0, Lvd2/c$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lvd2/c$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lvd2/c$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvd2/b;

    check-cast p2, Lvd2/a;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lvd2/c$i;->f(Lvd2/b;Lvd2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    iget-object v0, p0, Lvd2/c$i;->x:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Lvd2/b;

    iget-object v0, p0, Lvd2/c$i;->y:Ljava/lang/Object;

    check-cast v0, Lvd2/a;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lvd2/c$i;->w:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v7, :cond_3

    if-eq v3, v6, :cond_2

    if-eq v3, v5, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p1, Lvd2/a$g;->a:Lvd2/a$g;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const/4 v3, 0x0

    if-eqz p1, :cond_6

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    iput-object v3, p0, Lvd2/c$i;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvd2/c$i;->y:Ljava/lang/Object;

    iput v7, p0, Lvd2/c$i;->w:I

    invoke-static {p1, v1, p0}, Lvd2/c;->d(Lvd2/c;Lvd2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_5

    goto/16 :goto_3

    :cond_5
    :goto_0
    check-cast p1, Lvd2/b;

    return-object p1

    :cond_6
    sget-object p1, Lvd2/a$c;->a:Lvd2/a$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_7

    sget-object v2, Lvd2/d$f;->a:Lvd2/d$f;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_7
    sget-object p1, Lvd2/a$h;->a:Lvd2/a$h;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_8

    const/16 v6, 0xb

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_8
    instance-of p1, v0, Lvd2/a$f;

    if-eqz p1, :cond_a

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    check-cast v0, Lvd2/a$f;

    invoke-virtual {v0}, Lvd2/a$f;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Lvd2/c$i;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvd2/c$i;->y:Ljava/lang/Object;

    iput v6, p0, Lvd2/c$i;->w:I

    invoke-static {p1, v1, v0, p0}, Lvd2/c;->c(Lvd2/c;Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_9

    goto/16 :goto_3

    :cond_9
    :goto_1
    check-cast p1, Lvd2/b;

    return-object p1

    :cond_a
    sget-object p1, Lvd2/a$d;->a:Lvd2/a$d;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string v6, "Clear Full History"

    const-string v7, "Click"

    const-string v8, "ANF"

    if-eqz p1, :cond_b

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    invoke-static {p1}, Lvd2/c;->e(Lvd2/c;)Lfi0/a;

    move-result-object p1

    invoke-interface {p1, v8, v7, v6, v8}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lvd2/d$a;->a:Lvd2/d$a;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_b
    sget-object p1, Lvd2/a$i;->a:Lvd2/a$i;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    const-string v9, "Confirm"

    if-eqz p1, :cond_c

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    invoke-static {p1}, Lvd2/c;->e(Lvd2/c;)Lfi0/a;

    move-result-object p1

    invoke-interface {p1, v8, v9, v6, v8}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    sget-object v2, Lvd2/d$h;->a:Lvd2/d$h;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_c
    sget-object p1, Lvd2/a$a;->a:Lvd2/a$a;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    iput-object v3, p0, Lvd2/c$i;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvd2/c$i;->y:Ljava/lang/Object;

    iput v5, p0, Lvd2/c$i;->w:I

    invoke-static {p1, v1, p0}, Lvd2/c;->a(Lvd2/c;Lvd2/b;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_d

    goto :goto_3

    :cond_d
    :goto_2
    check-cast p1, Lvd2/b;

    return-object p1

    :cond_e
    instance-of p1, v0, Lvd2/a$e;

    const-string v5, "Clear Date History"

    if-eqz p1, :cond_f

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    invoke-static {p1}, Lvd2/c;->e(Lvd2/c;)Lfi0/a;

    move-result-object p1

    invoke-interface {p1, v8, v7, v5, v8}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lvd2/d$b;

    check-cast v0, Lvd2/a$e;

    invoke-virtual {v0}, Lvd2/a$e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvd2/d$b;-><init>(Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_f
    instance-of p1, v0, Lvd2/a$j;

    if-eqz p1, :cond_10

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    invoke-static {p1}, Lvd2/c;->e(Lvd2/c;)Lfi0/a;

    move-result-object p1

    invoke-interface {p1, v8, v9, v5, v8}, Lfi0/a;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    new-instance v2, Lvd2/d$i;

    check-cast v0, Lvd2/a$j;

    invoke-virtual {v0}, Lvd2/a$j;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v2, p1}, Lvd2/d$i;-><init>(Ljava/lang/String;)V

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lvd2/b;->b(Lvd2/b;Lvd2/d;Lcom/whoop/shepherd/feature/notificationhistory/domain/models/ShepherdNotificationHistoryResponse;ZLjava/lang/String;ILjava/lang/Object;)Lvd2/b;

    move-result-object p1

    return-object p1

    :cond_10
    instance-of p1, v0, Lvd2/a$b;

    if-eqz p1, :cond_12

    iget-object p1, p0, Lvd2/c$i;->z:Lvd2/c;

    check-cast v0, Lvd2/a$b;

    invoke-virtual {v0}, Lvd2/a$b;->a()Ljava/lang/String;

    move-result-object v0

    iput-object v3, p0, Lvd2/c$i;->x:Ljava/lang/Object;

    iput-object v3, p0, Lvd2/c$i;->y:Ljava/lang/Object;

    iput v4, p0, Lvd2/c$i;->w:I

    invoke-static {p1, v1, v0, p0}, Lvd2/c;->b(Lvd2/c;Lvd2/b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_11

    :goto_3
    return-object v2

    :cond_11
    :goto_4
    check-cast p1, Lvd2/b;

    return-object p1

    :cond_12
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
