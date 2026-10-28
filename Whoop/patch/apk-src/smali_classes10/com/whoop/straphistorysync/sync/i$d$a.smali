.class final Lcom/whoop/straphistorysync/sync/i$d$a;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/straphistorysync/sync/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
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
    c = "com.whoop.straphistorysync.sync.SensorSyncHolder$doWork$2$syncJob$1"
    f = "SensorSyncHolder.kt"
    l = {
        0x48
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcom/whoop/straphistorysync/sync/i;

.field final synthetic y:Ljk0/d;

.field final synthetic z:Lvk0/i;


# direct methods
.method public constructor <init>(Lcom/whoop/straphistorysync/sync/i;Ljk0/d;Lvk0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/straphistorysync/sync/i;",
            "Ljk0/d;",
            "Lvk0/i;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/i$d$a;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->x:Lcom/whoop/straphistorysync/sync/i;

    iput-object p2, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->y:Ljk0/d;

    iput-object p3, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->z:Lvk0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcom/whoop/straphistorysync/sync/i$d$a;

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->x:Lcom/whoop/straphistorysync/sync/i;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->y:Ljk0/d;

    iget-object v2, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->z:Lvk0/i;

    invoke-direct {p1, v0, v1, v2, p2}, Lcom/whoop/straphistorysync/sync/i$d$a;-><init>(Lcom/whoop/straphistorysync/sync/i;Ljk0/d;Lvk0/i;Lq83/d;)V

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
            "Lcom/whoop/straphistorysync/sync/f$b;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$d$a;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/straphistorysync/sync/i$d$a;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/straphistorysync/sync/i$d$a;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/straphistorysync/sync/i$d$a;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->x:Lcom/whoop/straphistorysync/sync/i;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->y:Ljk0/d;

    iget-object v3, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->z:Lvk0/i;

    iput v2, p0, Lcom/whoop/straphistorysync/sync/i$d$a;->w:I

    invoke-static {p1, v1, v3, p0}, Lcom/whoop/straphistorysync/sync/i;->f(Lcom/whoop/straphistorysync/sync/i;Ljk0/d;Lvk0/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
