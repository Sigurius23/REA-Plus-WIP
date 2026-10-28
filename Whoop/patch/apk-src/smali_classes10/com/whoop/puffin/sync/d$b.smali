.class final Lcom/whoop/puffin/sync/d$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/puffin/sync/d;->a(Lec3/l;Lc52/d;)Lec3/l;
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
        "Lcom/whoop/puffin/sync/f;",
        "state",
        "Llt0/k;",
        "parsedPacket",
        "<anonymous>",
        "(Lcom/whoop/puffin/sync/f;Llt0/k;)Lcom/whoop/puffin/sync/f;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.puffin.sync.BatterySyncInteractorImpl$sendPuffinEvents$1"
    f = "BatterySyncInteractor.kt"
    l = {
        0x2c
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lcom/whoop/puffin/sync/d;

.field final synthetic F:Lc52/d;

.field w:Ljava/lang/Object;

.field x:I

.field synthetic y:Ljava/lang/Object;

.field synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lcom/whoop/puffin/sync/d;Lc52/d;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/d;",
            "Lc52/d;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/d$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    iput-object p2, p0, Lcom/whoop/puffin/sync/d$b;->F:Lc52/d;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/puffin/sync/f;Llt0/k;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/puffin/sync/f;",
            "Llt0/k;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/puffin/sync/f;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/puffin/sync/d$b;

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    iget-object v2, p0, Lcom/whoop/puffin/sync/d$b;->F:Lc52/d;

    invoke-direct {v0, v1, v2, p3}, Lcom/whoop/puffin/sync/d$b;-><init>(Lcom/whoop/puffin/sync/d;Lc52/d;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/puffin/sync/d$b;->y:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/puffin/sync/d$b;->z:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/puffin/sync/d$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/puffin/sync/f;

    check-cast p2, Llt0/k;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/puffin/sync/d$b;->f(Lcom/whoop/puffin/sync/f;Llt0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$b;->y:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/puffin/sync/f;

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->z:Ljava/lang/Object;

    check-cast v1, Llt0/k;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/puffin/sync/d$b;->x:I

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    iget-object v0, p0, Lcom/whoop/puffin/sync/d$b;->w:Ljava/lang/Object;

    check-cast v0, Llt0/c;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {v1}, Llt0/k;->b()Llt0/c;

    move-result-object p1

    instance-of v3, p1, Lfk0/f;

    if-eqz v3, :cond_3

    instance-of v1, v0, Lcom/whoop/puffin/sync/f$a;

    if-eqz v1, :cond_2

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    invoke-static {v1}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v1

    const-string v2, "got PuffinHistoryStartMetadataPacket, creating new open burst"

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v1, v2, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    check-cast v0, Lcom/whoop/puffin/sync/f$a;

    check-cast p1, Lfk0/f;

    iget-object v2, p0, Lcom/whoop/puffin/sync/d$b;->F:Lc52/d;

    invoke-static {v1, v0, p1, v2}, Lcom/whoop/puffin/sync/d;->c(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/f$a;Lfk0/f;Lc52/d;)Lcom/whoop/puffin/sync/f$a;

    move-result-object v0

    goto/16 :goto_1

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Received history start packet while not actively syncing"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    instance-of v3, p1, Lfk0/d;

    if-eqz v3, :cond_5

    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    check-cast p1, Lfk0/d;

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/whoop/puffin/sync/d$b;->y:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/puffin/sync/d$b;->z:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/puffin/sync/d$b;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/puffin/sync/d$b;->x:I

    invoke-static {v1, v0, p1, p0}, Lcom/whoop/puffin/sync/d;->h(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/f;Lfk0/d;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_4

    return-object v2

    :cond_4
    :goto_0
    move-object v0, p1

    check-cast v0, Lcom/whoop/puffin/sync/f;

    goto :goto_1

    :cond_5
    instance-of v2, p1, Lfk0/c;

    if-eqz v2, :cond_6

    iget-object p1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    invoke-static {p1, v0}, Lcom/whoop/puffin/sync/d;->i(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/f;)Lcom/whoop/puffin/sync/f$b$c;

    move-result-object v0

    goto :goto_1

    :cond_6
    instance-of v2, p1, Lot0/a;

    if-eqz v2, :cond_8

    iget-object v2, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    invoke-static {v2}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received event "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v3, v5, [Lqr2/a$a;

    invoke-interface {v2, p1, v3}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    instance-of p1, v0, Lcom/whoop/puffin/sync/f$a;

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    check-cast v0, Lcom/whoop/puffin/sync/f$a;

    invoke-static {p1, v0, v1}, Lcom/whoop/puffin/sync/d;->b(Lcom/whoop/puffin/sync/d;Lcom/whoop/puffin/sync/f$a;Llt0/k;)Lcom/whoop/puffin/sync/f$a;

    move-result-object v0

    goto :goto_1

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Check failed."

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    iget-object v1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    invoke-static {v1}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object v1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Received unexpected packet "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {v1, p1, v2}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :goto_1
    iget-object p1, p0, Lcom/whoop/puffin/sync/d$b;->E:Lcom/whoop/puffin/sync/d;

    invoke-static {p1}, Lcom/whoop/puffin/sync/d;->g(Lcom/whoop/puffin/sync/d;)Ltr2/n;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Current historical Pull State: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v5, [Lqr2/a$a;

    invoke-interface {p1, v1, v2}, Ltr2/n;->j(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v0
.end method
