.class final Lug1/c$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n\u00a2\u0006\u0004\u0008\u0005\u0010\u0006"
    }
    d2 = {
        "Lvk0/k;",
        "serviceState",
        "Lug1/i;",
        "action",
        "Lug1/j;",
        "<anonymous>",
        "(Lvk0/k;Lug1/i;)Lug1/j;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$interact$1"
    f = "DfuUpdateStrategy.kt"
    l = {
        0x5a
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/c;


# direct methods
.method public constructor <init>(Lug1/c;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/c;",
            "Lq83/d<",
            "-",
            "Lug1/c$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/c$f;->z:Lug1/c;

    const/4 p1, 0x3

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final f(Lvk0/k;Lug1/i;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvk0/k;",
            "Lug1/i;",
            "Lq83/d<",
            "-",
            "Lug1/j;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    new-instance v0, Lug1/c$f;

    iget-object v1, p0, Lug1/c$f;->z:Lug1/c;

    invoke-direct {v0, v1, p3}, Lug1/c$f;-><init>(Lug1/c;Lq83/d;)V

    iput-object p1, v0, Lug1/c$f;->x:Ljava/lang/Object;

    iput-object p2, v0, Lug1/c$f;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lug1/c$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, Lvk0/k;

    check-cast p2, Lug1/i;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug1/c$f;->f(Lvk0/k;Lug1/i;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lug1/c$f;->x:Ljava/lang/Object;

    check-cast v0, Lvk0/k;

    iget-object v1, p0, Lug1/c$f;->y:Ljava/lang/Object;

    check-cast v1, Lug1/i;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, p0, Lug1/c$f;->w:I

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

    sget-object p1, Lvk0/k$c;->a:Lvk0/k$c;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    sget-object p1, Lug1/j$i;->b:Lug1/j$i;

    return-object p1

    :cond_2
    instance-of p1, v1, Lug1/i$a;

    if-eqz p1, :cond_4

    iget-object p1, p0, Lug1/c$f;->z:Lug1/c;

    check-cast v1, Lug1/i$a;

    invoke-virtual {v1}, Lug1/i$a;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v0

    const/4 v1, 0x0

    iput-object v1, p0, Lug1/c$f;->x:Ljava/lang/Object;

    iput-object v1, p0, Lug1/c$f;->y:Ljava/lang/Object;

    iput v4, p0, Lug1/c$f;->w:I

    invoke-static {p1, v0, p0}, Lug1/c;->k(Lug1/c;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v2, :cond_3

    return-object v2

    :cond_3
    :goto_0
    check-cast p1, Lug1/j;

    return-object p1

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Invalid action "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " only Start is allowed"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
