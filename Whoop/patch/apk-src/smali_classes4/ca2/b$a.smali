.class final Lca2/b$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lca2/b;-><init>(Lzr2/a;Ltr2/n;Lbc3/c0;Ldt0/d;)V
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
        "Lca2/a;",
        "previousDomainResult",
        "Lca2/d;",
        "action",
        "<anonymous>",
        "(Lca2/a;Lca2/d;)Lca2/a;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.service.sync.DataCatchingUpHelper$dataCatchingUpDomainResultFlow$3"
    f = "DataCatchingUpHelper.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lca2/b;


# direct methods
.method public constructor <init>(Lca2/b;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca2/b;",
            "Lq83/d<",
            "-",
            "Lca2/b$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lca2/b$a;->z:Lca2/b;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lca2/a;Lca2/d;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lca2/a;",
            "Lca2/d;",
            "Lq83/d<",
            "-",
            "Lca2/a;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lca2/b$a;

    iget-object v1, p0, Lca2/b$a;->z:Lca2/b;

    invoke-direct {v0, v1, p3}, Lca2/b$a;-><init>(Lca2/b;Lq83/d;)V

    iput-object p1, v0, Lca2/b$a;->x:Ljava/lang/Object;

    iput-object p2, v0, Lca2/b$a;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lca2/b$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lca2/a;

    check-cast p2, Lca2/d;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lca2/b$a;->f(Lca2/a;Lca2/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lca2/b$a;->x:Ljava/lang/Object;

    check-cast v0, Lca2/a;

    iget-object v1, p0, Lca2/b$a;->y:Ljava/lang/Object;

    check-cast v1, Lca2/d;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lca2/b$a;->w:I

    if-nez v2, :cond_6

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v0}, Lca2/a;->c()Lca2/c;

    move-result-object p1

    invoke-virtual {v1}, Lca2/d;->b()Lca2/c;

    move-result-object v2

    sget-object v3, Lca2/c;->CATCHING_UP:Lca2/c;

    if-ne v2, v3, :cond_1

    invoke-virtual {v0}, Lca2/a;->a()Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object v2, p0, Lca2/b$a;->z:Lca2/b;

    invoke-virtual {v1}, Lca2/d;->a()Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object v4

    invoke-static {v2, v4}, Lca2/b;->d(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2, p1}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lca2/b$a;->z:Lca2/b;

    invoke-static {v2}, Lca2/b;->c(Lca2/b;)Lca2/a;

    move-result-object v2

    invoke-virtual {v0, v2}, Lca2/a;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p1, p0, Lca2/b$a;->z:Lca2/b;

    invoke-virtual {v1}, Lca2/d;->a()Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object v0

    invoke-static {p1, v0}, Lca2/b;->d(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    :goto_0
    new-instance v0, Lca2/a;

    iget-object v1, p0, Lca2/b$a;->z:Lca2/b;

    invoke-static {v1, p1}, Lca2/b;->a(Lca2/b;Lorg/joda/time/DateTime;)I

    move-result v1

    const/4 v2, 0x1

    invoke-direct {v0, v2, p1, v3, v1}, Lca2/a;-><init>(ZLorg/joda/time/DateTime;Lca2/c;I)V

    return-object v0

    :cond_1
    const/4 v0, 0x0

    if-ne p1, v3, :cond_2

    sget-object v3, Lca2/c;->CAUGHT_UP:Lca2/c;

    if-ne v2, v3, :cond_2

    new-instance p1, Lca2/a;

    iget-object v2, p0, Lca2/b$a;->z:Lca2/b;

    invoke-virtual {v1}, Lca2/d;->a()Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object v1

    invoke-static {v2, v1}, Lca2/b;->d(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-direct {p1, v0, v1, v3, v0}, Lca2/a;-><init>(ZLorg/joda/time/DateTime;Lca2/c;I)V

    return-object p1

    :cond_2
    sget-object v3, Lca2/c;->STANDBY:Lca2/c;

    if-ne p1, v3, :cond_3

    sget-object v4, Lca2/c;->CAUGHT_UP:Lca2/c;

    if-eq v2, v4, :cond_4

    :cond_3
    sget-object v4, Lca2/c;->CAUGHT_UP:Lca2/c;

    if-ne p1, v4, :cond_5

    if-ne v2, v4, :cond_5

    :cond_4
    new-instance p1, Lca2/a;

    iget-object v2, p0, Lca2/b$a;->z:Lca2/b;

    invoke-virtual {v1}, Lca2/d;->a()Lcom/whoop/domain/model/MetricsProcessedTime;

    move-result-object v1

    invoke-static {v2, v1}, Lca2/b;->d(Lca2/b;Lcom/whoop/domain/model/MetricsProcessedTime;)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-direct {p1, v0, v1, v3, v0}, Lca2/a;-><init>(ZLorg/joda/time/DateTime;Lca2/c;I)V

    return-object p1

    :cond_5
    iget-object v1, p0, Lca2/b$a;->z:Lca2/b;

    invoke-static {v1}, Lca2/b;->e(Lca2/b;)Ltr2/n;

    move-result-object v1

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Old state: "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " and New State: "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v1, p1, v0}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Illegal Data Catching Up State"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
