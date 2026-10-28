.class final Lcom/whoop/straphistorysync/sync/i$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/straphistorysync/sync/i;->h(Ljk0/d;Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/straphistorysync/sync/f$b;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/straphistorysync/sync/f$b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.straphistorysync.sync.SensorSyncHolder$doWork$2"
    f = "SensorSyncHolder.kt"
    l = {
        0x4a,
        0x4d
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lvk0/i;

.field final synthetic F:Ljk0/d;

.field final synthetic G:Lcom/whoop/straphistorysync/sync/i;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lvk0/i;Ljk0/d;Lcom/whoop/straphistorysync/sync/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/i;",
            "Ljk0/d;",
            "Lcom/whoop/straphistorysync/sync/i;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/i$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/i$d;->E:Lvk0/i;

    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/i$d;->F:Ljk0/d;

    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/i$d;->G:Lcom/whoop/straphistorysync/sync/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 4
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

    new-instance v0, Lcom/whoop/straphistorysync/sync/i$d;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$d;->E:Lvk0/i;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/i$d;->F:Ljk0/d;

    iget-object v3, p0, Lcom/whoop/straphistorysync/sync/i$d;->G:Lcom/whoop/straphistorysync/sync/i;

    invoke-direct {v0, v1, v2, v3, p2}, Lcom/whoop/straphistorysync/sync/i$d;-><init>(Lvk0/i;Ljk0/d;Lcom/whoop/straphistorysync/sync/i;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/straphistorysync/sync/i$d;->z:Ljava/lang/Object;

    return-object v0
.end method

.method public final invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbc3/c0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/straphistorysync/sync/i$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lcom/whoop/straphistorysync/sync/i$d;->y:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_2

    if-eq v2, v4, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d;->x:Ljava/lang/Object;

    check-cast v0, Lzj0/h;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, p0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d;->w:Ljava/lang/Object;

    check-cast v0, Lbc3/i0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast p1, Ll83/n;

    iget-object p1, p1, Ll83/n;->w:Ljava/lang/Object;

    move-object v11, p0

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p1, Lcom/whoop/straphistorysync/sync/i$d$a;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/i$d;->G:Lcom/whoop/straphistorysync/sync/i;

    iget-object v6, p0, Lcom/whoop/straphistorysync/sync/i$d;->F:Ljk0/d;

    iget-object v7, p0, Lcom/whoop/straphistorysync/sync/i$d;->E:Lvk0/i;

    invoke-direct {p1, v2, v6, v7, v5}, Lcom/whoop/straphistorysync/sync/i$d$a;-><init>(Lcom/whoop/straphistorysync/sync/i;Ljk0/d;Lvk0/i;Lq83/d;)V

    const/4 v2, 0x3

    invoke-static {v0, v5, p1, v2}, Lbc3/f0;->e(Lbc3/c0;Lq83/j;Lc93/m;I)Lbc3/j0;

    move-result-object v0

    iget-object v6, p0, Lcom/whoop/straphistorysync/sync/i$d;->E:Lvk0/i;

    new-instance v7, Lxj0/t;

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$d;->F:Ljk0/d;

    invoke-interface {p1}, Ljk0/d;->w0()Lst0/v;

    move-result-object p1

    invoke-direct {v7, p1}, Lxj0/t;-><init>(Lst0/v;)V

    iput-object v5, p0, Lcom/whoop/straphistorysync/sync/i$d;->z:Ljava/lang/Object;

    iput-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d;->w:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/straphistorysync/sync/i$d;->y:I

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x6

    const/4 v13, 0x0

    move-object v11, p0

    invoke-static/range {v6 .. v13}, Lvk0/i;->r0(Lvk0/i;Lvk0/g;JZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    instance-of v2, p1, Ll83/m;

    if-eqz v2, :cond_4

    move-object p1, v5

    :cond_4
    check-cast p1, Lzj0/h;

    const/4 v2, 0x0

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lzj0/h;->W()Z

    move-result p1

    if-ne p1, v4, :cond_6

    iget-object p1, v11, Lcom/whoop/straphistorysync/sync/i$d;->G:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    const-string v4, "Send history command accepted, beginning sensor sync"

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {p1, v4, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v5, v11, Lcom/whoop/straphistorysync/sync/i$d;->z:Ljava/lang/Object;

    iput-object v5, v11, Lcom/whoop/straphistorysync/sync/i$d;->w:Ljava/lang/Object;

    iput-object v5, v11, Lcom/whoop/straphistorysync/sync/i$d;->x:Ljava/lang/Object;

    iput v3, v11, Lcom/whoop/straphistorysync/sync/i$d;->y:I

    invoke-interface {v0, p0}, Lbc3/i0;->await(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_1
    return-object v1

    :cond_5
    :goto_2
    check-cast p1, Lcom/whoop/straphistorysync/sync/f$b;

    return-object p1

    :cond_6
    check-cast v0, Lbc3/t1;

    invoke-virtual {v0, v5}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iget-object p1, v11, Lcom/whoop/straphistorysync/sync/i$d;->G:Lcom/whoop/straphistorysync/sync/i;

    invoke-static {p1}, Lcom/whoop/straphistorysync/sync/i;->c(Lcom/whoop/straphistorysync/sync/i;)Ltr2/n;

    move-result-object p1

    const-string v0, "Send history command failed"

    new-array v1, v2, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance v2, Lcom/whoop/straphistorysync/sync/f$b$b;

    sget-object v3, Lbi2/a;->SendCommandException:Lbi2/a;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/straphistorysync/sync/f$b$b;-><init>(Lbi2/a;Lbi2/l;ILbi2/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v2
.end method
