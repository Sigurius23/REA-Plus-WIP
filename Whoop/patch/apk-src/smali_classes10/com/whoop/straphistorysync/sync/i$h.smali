.class final Lcom/whoop/straphistorysync/sync/i$h;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/straphistorysync/sync/i;->j(Ljk0/d;Lvk0/i;Lq83/d;)Ljava/lang/Object;
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
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lcom/whoop/straphistorysync/sync/f;",
        "state",
        "Ll83/a0;",
        "<anonymous>",
        "(Lcom/whoop/straphistorysync/sync/f;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.straphistorysync.sync.SensorSyncHolder$invokeAndGetTerminalState$3"
    f = "SensorSyncHolder.kt"
    l = {
        0x94,
        0x98,
        0x9b,
        0xa2,
        0xa9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field final synthetic y:Lcom/whoop/straphistorysync/sync/i;

.field final synthetic z:Lvk0/i;


# direct methods
.method public constructor <init>(Lcom/whoop/straphistorysync/sync/i;Lvk0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/i;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/i$h;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3
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

    new-instance v0, Lcom/whoop/straphistorysync/sync/i$h;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    invoke-direct {v0, v1, v2, p2}, Lcom/whoop/straphistorysync/sync/i$h;-><init>(Lcom/whoop/straphistorysync/sync/i;Lvk0/i;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    return-object v0
.end method

.method public final f(Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/f;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$h;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/straphistorysync/sync/i$h;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/i$h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/straphistorysync/sync/f;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$h;->f(Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/straphistorysync/sync/f;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x5

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    const/4 v9, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v8, :cond_2

    if-eq v2, v7, :cond_1

    if-eq v2, v6, :cond_1

    if-eq v2, v5, :cond_1

    if-ne v2, v4, :cond_0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    :goto_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v10, "HPS state: "

    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    new-array v10, v9, [Lqr2/a$a;

    invoke-interface {p1, v2, v10}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->d(Lcom/whoop/straphistorysync/sync/i;)Lec3/p1;

    move-result-object p1

    iput-object v0, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    iput v8, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    check-cast p1, Lec3/h2;

    invoke-virtual {p1, v0, p0}, Lec3/h2;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    if-ne v3, v1, :cond_4

    goto/16 :goto_2

    :cond_4
    :goto_1
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$a;

    const/4 v2, 0x0

    if-eqz p1, :cond_5

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    check-cast v0, Lcom/whoop/straphistorysync/sync/f$a;

    iget-object v4, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    iput-object v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    iput v7, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    invoke-static {p1, v0, v4, p0}, Lcom/whoop/straphistorysync/sync/i;->e(Lcom/whoop/straphistorysync/sync/i;Lcom/whoop/straphistorysync/sync/f$a;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_2

    :cond_5
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$b$e;

    if-eqz p1, :cond_6

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    iput-object v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    iput v6, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    invoke-static {p1, v0, p0}, Lcom/whoop/straphistorysync/sync/i;->b(Lcom/whoop/straphistorysync/sync/i;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto/16 :goto_2

    :cond_6
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$b$a;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sensor HPS ended due to BLE disconnect: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v9, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_7
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$b$c;

    if-eqz p1, :cond_8

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    iput-object v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    iput v5, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    invoke-static {p1, v0, p0}, Lcom/whoop/straphistorysync/sync/i;->b(Lcom/whoop/straphistorysync/sync/i;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    goto :goto_2

    :cond_8
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$b$d;

    if-eqz p1, :cond_9

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Sensor HPS completed successfully: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v9, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_3

    :cond_9
    instance-of p1, v0, Lcom/whoop/straphistorysync/sync/f$b$b;

    if-eqz p1, :cond_b

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "Sensor HPS ended with error: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v5, v9, [Lqr2/a$a;

    invoke-interface {p1, v0, v5}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$h;->y:Lcom/whoop/straphistorysync/sync/i;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$h;->z:Lvk0/i;

    iput-object v2, p0, Lcom/whoop/straphistorysync/sync/i$h;->x:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/straphistorysync/sync/i$h;->w:I

    invoke-static {p1, v0, p0}, Lcom/whoop/straphistorysync/sync/i;->b(Lcom/whoop/straphistorysync/sync/i;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_2
    return-object v1

    :cond_a
    :goto_3
    return-object v3

    :cond_b
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
