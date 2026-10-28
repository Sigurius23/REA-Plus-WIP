.class final Lcom/whoop/straphistorysync/sync/i$i;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


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
        "Lkotlin/jvm/functions/Function3;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u0010\u0004\u001a\u00020\u0003*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n\u00a2\u0006\u0004\u0008\u0004\u0010\u0005"
    }
    d2 = {
        "Lec3/m;",
        "Lcom/whoop/straphistorysync/sync/f;",
        "state",
        "",
        "<anonymous>",
        "(Lec3/m;Lcom/whoop/straphistorysync/sync/f;)Z"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.straphistorysync.sync.SensorSyncHolder$invokeAndGetTerminalState$4"
    f = "SensorSyncHolder.kt"
    l = {
        0xae
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lkotlin/jvm/internal/g0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/internal/g0;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lkotlin/jvm/internal/g0;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/internal/g0;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/straphistorysync/sync/i$i;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/i$i;->z:Lkotlin/jvm/internal/g0;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lec3/m;Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lcom/whoop/straphistorysync/sync/f;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lcom/whoop/straphistorysync/sync/i$i;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$i;->z:Lkotlin/jvm/internal/g0;

    invoke-direct {v0, v1, p3}, Lcom/whoop/straphistorysync/sync/i$i;-><init>(Lkotlin/jvm/internal/g0;Lq83/d;)V

    iput-object p1, v0, Lcom/whoop/straphistorysync/sync/i$i;->x:Ljava/lang/Object;

    iput-object p2, v0, Lcom/whoop/straphistorysync/sync/i$i;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lcom/whoop/straphistorysync/sync/i$i;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lec3/m;

    check-cast p2, Lcom/whoop/straphistorysync/sync/f;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lcom/whoop/straphistorysync/sync/i$i;->f(Lec3/m;Lcom/whoop/straphistorysync/sync/f;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lcom/whoop/straphistorysync/sync/i$i;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    iget-object v1, p0, Lcom/whoop/straphistorysync/sync/i$i;->y:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/straphistorysync/sync/f;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lcom/whoop/straphistorysync/sync/i$i;->w:I

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

    const/4 p1, 0x0

    iput-object p1, p0, Lcom/whoop/straphistorysync/sync/i$i;->x:Ljava/lang/Object;

    iput-object v1, p0, Lcom/whoop/straphistorysync/sync/i$i;->y:Ljava/lang/Object;

    iput v4, p0, Lcom/whoop/straphistorysync/sync/i$i;->w:I

    invoke-interface {v0, v1, p0}, Lec3/m;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_2

    return-object v2

    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/whoop/straphistorysync/sync/i$i;->z:Lkotlin/jvm/internal/g0;

    iput-object v1, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    instance-of p1, v1, Lcom/whoop/straphistorysync/sync/f$b;

    xor-int/2addr p1, v4

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method
