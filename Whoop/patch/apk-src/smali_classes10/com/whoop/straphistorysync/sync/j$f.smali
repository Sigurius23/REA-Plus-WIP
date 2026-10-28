.class final Lcom/whoop/straphistorysync/sync/j$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/straphistorysync/sync/j;->a(Lec3/l;)Lec3/l;
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
        "Lcom/whoop/straphistorysync/sync/b;",
        "acc",
        "Llt0/k;",
        "parsedPacket",
        "<anonymous>",
        "(Lcom/whoop/straphistorysync/sync/b;Llt0/k;)Lcom/whoop/straphistorysync/sync/b;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.straphistorysync.sync.SensorSyncProcessorImpl$processPackets$2"
    f = "SensorSyncProcessor.kt"
    l = {
        0x44
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lcom/whoop/straphistorysync/sync/j;


# direct methods
.method public constructor <init>(Lcom/whoop/straphistorysync/sync/j;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/j;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/j$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/j$f;->z:Lcom/whoop/straphistorysync/sync/j;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/b;",
            "Llt0/k;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/straphistorysync/sync/j$f;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/j$f;->z:Lcom/whoop/straphistorysync/sync/j;

    invoke-direct {v0, v1, p3}, Lcom/whoop/straphistorysync/sync/j$f;-><init>(Lcom/whoop/straphistorysync/sync/j;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/straphistorysync/sync/j$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/straphistorysync/sync/j$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/straphistorysync/sync/j$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lcom/whoop/straphistorysync/sync/b;

    check-cast p2, Llt0/k;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/straphistorysync/sync/j$f;->f(Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/j$f;->x:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/straphistorysync/sync/b;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/j$f;->y:Ljava/lang/Object;

    check-cast v1, Llt0/k;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/straphistorysync/sync/j$f;->w:I

    const/4 v4, 0x1

    if-eqz v3, :cond_1

    if-ne v3, v4, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/j$f;->z:Lcom/whoop/straphistorysync/sync/j;

    const/4 v3, 0x0

    iput-object v3, p0, Lcom/whoop/straphistorysync/sync/j$f;->x:Ljava/lang/Object;

    iput-object v3, p0, Lcom/whoop/straphistorysync/sync/j$f;->y:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/straphistorysync/sync/j$f;->w:I

    invoke-static {p1, v0, v1, p0}, Lcom/whoop/straphistorysync/sync/j;->c(Lcom/whoop/straphistorysync/sync/j;Lcom/whoop/straphistorysync/sync/b;Llt0/k;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    return-object p1
.end method
