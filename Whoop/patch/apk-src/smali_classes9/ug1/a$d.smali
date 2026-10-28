.class public final Lug1/a$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/a;->interact(Lec3/l;)Lec3/l;
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
        "\u0000\u0010\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\u0008\u0000\u0010\u0000\"\u0004\u0008\u0001\u0010\u0001*\u0008\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"
    }
    d2 = {
        "R",
        "T",
        "Lec3/m;",
        "it",
        "Ll83/a0;",
        "<anonymous>"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.BatteryPackUpdateStrategy$interact$$inlined$flatMapLatest$1"
    f = "BatteryPackUpdateStrategy.kt"
    l = {
        0xbd
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field private synthetic x:Ljava/lang/Object;

.field synthetic y:Ljava/lang/Object;

.field final synthetic z:Lug1/a;


# direct methods
.method public constructor <init>(Lq83/d;Lug1/a;)V
    .locals 0

    iput-object p2, p0, Lug1/a$d;->z:Lug1/a;

    const/4 p2, 0x3

    invoke-direct {p0, p2, p1}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lec3/m;",
            "Lug1/j;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lug1/a$d;

    iget-object v1, p0, Lug1/a$d;->z:Lug1/a;

    invoke-direct {v0, p3, v1}, Lug1/a$d;-><init>(Lq83/d;Lug1/a;)V

    iput-object p1, v0, Lug1/a$d;->x:Ljava/lang/Object;

    iput-object p2, v0, Lug1/a$d;->y:Ljava/lang/Object;

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {v0, p1}, Lug1/a$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lec3/m;

    check-cast p3, Lq83/d;

    invoke-virtual {p0, p1, p2, p3}, Lug1/a$d;->invoke(Lec3/m;Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/a$d;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lug1/a$d;->x:Ljava/lang/Object;

    check-cast v0, Lec3/m;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug1/a$d;->x:Ljava/lang/Object;

    check-cast p1, Lec3/m;

    iget-object v1, p0, Lug1/a$d;->y:Ljava/lang/Object;

    check-cast v1, Lug1/j;

    instance-of v3, v1, Lug1/j$h;

    if-eqz v3, :cond_2

    iget-object v3, p0, Lug1/a$d;->z:Lug1/a;

    invoke-virtual {v3}, Lug1/a;->h()Ltr2/n;

    move-result-object v3

    const/4 v4, 0x0

    new-array v4, v4, [Lqr2/a$a;

    const-string v5, "Started sending FW packets"

    invoke-interface {v3, v5, v4}, Ltr2/n;->g(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v3, p0, Lug1/a$d;->z:Lug1/a;

    check-cast v1, Lug1/j$h;

    invoke-virtual {v1}, Lug1/j$h;->b()Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Lug1/a;->w(Lug1/a;Ljava/lang/String;)V

    iget-object v3, p0, Lug1/a$d;->z:Lug1/a;

    invoke-static {v3}, Lug1/a;->g(Lug1/a;)Lgt0/d;

    move-result-object v4

    sget-object v5, Lgt0/b;->BINARY_TRANSFER:Lgt0/b;

    sget-object v6, Lgt0/c;->TRIGGERED:Lgt0/c;

    iget-object v3, p0, Lug1/a$d;->z:Lug1/a;

    invoke-static {v3}, Lug1/a;->n(Lug1/a;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1}, Lug1/j$h;->b()Ljava/lang/String;

    move-result-object v9

    const/16 v11, 0x20

    const/4 v12, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    invoke-static/range {v4 .. v12}, Lgt0/d;->a(Lgt0/d;Lgt0/b;Lgt0/c;Lgt0/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    iget-object v3, p0, Lug1/a$d;->z:Lug1/a;

    invoke-virtual {v1}, Lug1/j$h;->a()Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;

    move-result-object v4

    invoke-virtual {v1}, Lug1/j$h;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v4, v1}, Lug1/a;->v(Lug1/a;Lcom/whoop/connectivityCore/firmware/models/WhoopFwDevice;Ljava/lang/String;)Lec3/l;

    move-result-object v1

    goto :goto_1

    :cond_2
    instance-of v3, v1, Lug1/j$b;

    if-nez v3, :cond_4

    sget-object v3, Lug1/j$a;->b:Lug1/j$a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Lug1/j$e;->b:Lug1/j$e;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Lug1/j$i;->b:Lug1/j$i;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4

    sget-object v3, Lug1/j$c;->b:Lug1/j$c;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    goto :goto_0

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "Invalid state "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    :goto_0
    new-instance v3, La6/u;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4}, La6/u;-><init>(Ljava/lang/Object;I)V

    move-object v1, v3

    :goto_1
    const/4 v3, 0x0

    iput-object v3, p0, Lug1/a$d;->x:Ljava/lang/Object;

    iput-object v3, p0, Lug1/a$d;->y:Ljava/lang/Object;

    iput v2, p0, Lug1/a$d;->w:I

    invoke-static {p1, v1, p0}, Lec3/v;->w(Lec3/m;Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    return-object v0

    :cond_5
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
