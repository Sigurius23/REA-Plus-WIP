.class final Lug1/c$b;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lug1/c;->c(Lq83/d;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ls83/i;",
        "Lkotlin/jvm/functions/Function1;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "Lzj0/h;",
        "<anonymous>",
        "()Lzj0/h;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.firmwareUpdateService.strategy.DfuUpdateStrategy$abortRealtimeStreamsAndHistorySync$2"
    f = "DfuUpdateStrategy.kt"
    l = {
        0x11a,
        0x124,
        0x12e
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lug1/c;

.field final synthetic F:Lst0/v;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lug1/c;Lst0/v;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lug1/c;",
            "Lst0/v;",
            "Lq83/d<",
            "-",
            "Lug1/c$b;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lug1/c$b;->E:Lug1/c;

    iput-object p2, p0, Lug1/c$b;->F:Lst0/v;

    const/4 p1, 0x1

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "*>;)",
            "Lq83/d<",
            "Ll83/a0;",
            ">;"
        }
    .end annotation

    new-instance v0, Lug1/c$b;

    iget-object v1, p0, Lug1/c$b;->E:Lug1/c;

    iget-object v2, p0, Lug1/c$b;->F:Lst0/v;

    invoke-direct {v0, v1, v2, p1}, Lug1/c$b;-><init>(Lug1/c;Lst0/v;Lq83/d;)V

    return-object v0
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lug1/c$b;->invoke(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invoke(Lq83/d;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lzj0/h;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 2
    invoke-virtual {p0, p1}, Lug1/c$b;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lug1/c$b;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lug1/c$b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lug1/c$b;->z:I

    const/4 v2, 0x3

    const/4 v3, 0x1

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v3, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lug1/c$b;->x:Ljava/lang/Object;

    check-cast v0, Lxj0/b;

    iget-object v0, p0, Lug1/c$b;->w:Ljava/lang/Object;

    check-cast v0, Lec3/p1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lug1/c$b;->x:Ljava/lang/Object;

    check-cast v1, Lxj0/b;

    iget-object v1, p0, Lug1/c$b;->w:Ljava/lang/Object;

    check-cast v1, Lec3/p1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lug1/c$b;->x:Ljava/lang/Object;

    check-cast v1, Lxj0/b;

    iget-object v1, p0, Lug1/c$b;->w:Ljava/lang/Object;

    check-cast v1, Lec3/p1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lug1/c$b;->E:Lug1/c;

    invoke-virtual {p1}, Lug1/c;->l()Lec3/p1;

    move-result-object p1

    new-instance v1, Lxj0/l1;

    invoke-direct {v1, v5, v6, v4, v6}, Lxj0/l1;-><init>(ZLst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v7, Lch/i;

    const/4 v8, 0x2

    invoke-direct {v7, p1, v8}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lug1/c$b$a;

    invoke-direct {p1, v7, v1}, Lug1/c$b$a;-><init>(Lec3/l;Lxj0/b;)V

    iput-object v6, p0, Lug1/c$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lug1/c$b;->x:Ljava/lang/Object;

    iput v5, p0, Lug1/c$b;->y:I

    iput v3, p0, Lug1/c$b;->z:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_0
    iget-object p1, p0, Lug1/c$b;->E:Lug1/c;

    invoke-virtual {p1}, Lug1/c;->l()Lec3/p1;

    move-result-object p1

    new-instance v1, Lxj0/h1;

    invoke-direct {v1, v5, v6, v4, v6}, Lxj0/h1;-><init>(ZLst0/v;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lch/i;

    const/4 v7, 0x2

    invoke-direct {v3, p1, v7}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lug1/c$b$b;

    invoke-direct {p1, v3, v1}, Lug1/c$b$b;-><init>(Lec3/l;Lxj0/b;)V

    iput-object v6, p0, Lug1/c$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lug1/c$b;->x:Ljava/lang/Object;

    iput v5, p0, Lug1/c$b;->y:I

    iput v4, p0, Lug1/c$b;->z:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_2

    :cond_5
    :goto_1
    iget-object p1, p0, Lug1/c$b;->E:Lug1/c;

    invoke-virtual {p1}, Lug1/c;->l()Lec3/p1;

    move-result-object p1

    new-instance v1, Lxj0/s;

    iget-object v3, p0, Lug1/c$b;->F:Lst0/v;

    invoke-direct {v1, v3}, Lxj0/s;-><init>(Lst0/v;)V

    new-instance v3, Lch/i;

    const/4 v4, 0x2

    invoke-direct {v3, p1, v4}, Lch/i;-><init>(Lec3/l;I)V

    new-instance p1, Lug1/c$b$c;

    invoke-direct {p1, v3, v1}, Lug1/c$b$c;-><init>(Lec3/l;Lxj0/b;)V

    iput-object v6, p0, Lug1/c$b;->w:Ljava/lang/Object;

    iput-object v6, p0, Lug1/c$b;->x:Ljava/lang/Object;

    iput v5, p0, Lug1/c$b;->y:I

    iput v2, p0, Lug1/c$b;->z:I

    invoke-static {p1, p0}, Lec3/v;->A(Lec3/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_6

    :goto_2
    return-object v0

    :cond_6
    return-object p1
.end method
