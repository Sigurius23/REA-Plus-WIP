.class final Llj0/i$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Llj0/i;->q()V
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
        "Ll83/a0;",
        "<anonymous>",
        "(Lbc3/c0;)V"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.ble.analytics.PacketSnifferAnalytics$startSniffingDataPacketsForAnalytics$1"
    f = "PacketSnifferAnalytics.kt"
    l = {
        0x57
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Llj0/i;

.field w:Ljava/lang/Object;

.field x:Ljava/lang/Object;

.field y:I

.field private synthetic z:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Llj0/i;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Llj0/i;",
            "Lq83/d<",
            "-",
            "Llj0/i$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Llj0/i$d;->E:Llj0/i;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 2
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

    new-instance v0, Llj0/i$d;

    iget-object v1, p0, Llj0/i$d;->E:Llj0/i;

    invoke-direct {v0, v1, p2}, Llj0/i$d;-><init>(Llj0/i;Lq83/d;)V

    iput-object p1, v0, Llj0/i$d;->z:Ljava/lang/Object;

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Llj0/i$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Llj0/i$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Llj0/i$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Llj0/i$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    iget-object v0, p0, Llj0/i$d;->z:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Llj0/i$d;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    iget-object v0, p0, Llj0/i$d;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/k1;

    iget-object v0, p0, Llj0/i$d;->w:Ljava/lang/Object;

    check-cast v0, Lec3/t1;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Llj0/i$d;->E:Llj0/i;

    invoke-static {p1}, Llj0/i;->e(Llj0/i;)Lec3/t1;

    move-result-object p1

    iget-object v2, p0, Llj0/i$d;->E:Llj0/i;

    invoke-static {v2}, Llj0/i;->c(Llj0/i;)Lbc3/c0;

    move-result-object v2

    invoke-static {p1, v2}, Lec3/v;->H(Lec3/l;Lbc3/c0;)Lbc3/k1;

    move-result-object v2

    iget-object v4, p0, Llj0/i$d;->E:Llj0/i;

    invoke-static {v4}, Llj0/i;->a(Llj0/i;)Lhj0/d;

    move-result-object v4

    invoke-virtual {v4}, Lhj0/d;->d()Lec3/f2;

    move-result-object v4

    iget-object v5, p0, Llj0/i$d;->E:Llj0/i;

    new-instance v6, Llj0/i$d$b;

    invoke-direct {v6, v4, v5}, Llj0/i$d$b;-><init>(Lec3/l;Llj0/i;)V

    new-instance v4, Llj0/i$d$a;

    iget-object v5, p0, Llj0/i$d;->E:Llj0/i;

    invoke-direct {v4, p1, v5, v2, v0}, Llj0/i$d$a;-><init>(Lec3/t1;Llj0/i;Lbc3/k1;Lbc3/c0;)V

    const/4 p1, 0x0

    iput-object p1, p0, Llj0/i$d;->z:Ljava/lang/Object;

    iput-object p1, p0, Llj0/i$d;->w:Ljava/lang/Object;

    iput-object p1, p0, Llj0/i$d;->x:Ljava/lang/Object;

    iput v3, p0, Llj0/i$d;->y:I

    invoke-interface {v6, v4, p0}, Lec3/l;->collect(Lec3/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_2

    return-object v1

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
