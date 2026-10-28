.class final Lcom/whoop/realtime/presentation/k$e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/whoop/realtime/presentation/k;->R(Lq83/d;)Ljava/lang/Object;
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
        "Lcom/whoop/service/network/model/SportList;",
        "<anonymous>",
        "(Lbc3/c0;)Lcom/whoop/service/network/model/SportList;"
    }
    k = 0x3
    mv = {
        0x2,
        0x3,
        0x0
    }
.end annotation

.annotation runtime Ls83/e;
    c = "com.whoop.realtime.presentation.SelectActivityViewModel$obtainSports$2"
    f = "SelectActivityViewModel.kt"
    l = {
        0x129
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field final synthetic z:Lcom/whoop/realtime/presentation/k;


# direct methods
.method public constructor <init>(Lcom/whoop/realtime/presentation/k;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/realtime/presentation/k;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/realtime/presentation/k$e;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/whoop/realtime/presentation/k$e;->z:Lcom/whoop/realtime/presentation/k;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p2}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 1
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

    new-instance p1, Lcom/whoop/realtime/presentation/k$e;

    iget-object v0, p0, Lcom/whoop/realtime/presentation/k$e;->z:Lcom/whoop/realtime/presentation/k;

    invoke-direct {p1, v0, p2}, Lcom/whoop/realtime/presentation/k$e;-><init>(Lcom/whoop/realtime/presentation/k;Lq83/d;)V

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
            "Lcom/whoop/service/network/model/SportList;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/k$e;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcom/whoop/realtime/presentation/k$e;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcom/whoop/realtime/presentation/k$e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcom/whoop/realtime/presentation/k$e;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcom/whoop/realtime/presentation/k$e;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lcom/whoop/realtime/presentation/k$e;->w:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/realtime/presentation/k;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/realtime/presentation/k$e;->z:Lcom/whoop/realtime/presentation/k;

    iput-object p1, p0, Lcom/whoop/realtime/presentation/k$e;->w:Ljava/lang/Object;

    const/4 v1, 0x0

    iput v1, p0, Lcom/whoop/realtime/presentation/k$e;->x:I

    iput v2, p0, Lcom/whoop/realtime/presentation/k$e;->y:I

    new-instance v1, Lbc3/m;

    invoke-static {p0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v3

    invoke-direct {v1, v2, v3}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v1}, Lbc3/m;->s()V

    invoke-static {p1}, Lcom/whoop/realtime/presentation/k;->z(Lcom/whoop/realtime/presentation/k;)Lod1/s;

    move-result-object v3

    invoke-virtual {v3}, Lod1/s;->f()Llh3/b;

    move-result-object v3

    invoke-virtual {v3, v2}, Lxg3/g;->R(I)Lxg3/g;

    move-result-object v2

    new-instance v3, Lcom/whoop/realtime/presentation/k$e$b;

    invoke-direct {v3, v1}, Lcom/whoop/realtime/presentation/k$e$b;-><init>(Lbc3/k;)V

    new-instance v4, Lcom/whoop/realtime/presentation/l$a;

    invoke-direct {v4, v3}, Lcom/whoop/realtime/presentation/l$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    new-instance v3, Lcom/whoop/realtime/presentation/k$e$c;

    invoke-direct {v3, v1}, Lcom/whoop/realtime/presentation/k$e$c;-><init>(Lbc3/k;)V

    invoke-virtual {v2, v4, v3}, Lxg3/g;->L(Lbh3/b;Lbh3/b;)Lxg3/t;

    move-result-object v2

    invoke-static {p1}, Lcom/whoop/realtime/presentation/k;->A(Lcom/whoop/realtime/presentation/k;)Lmh3/c;

    move-result-object p1

    invoke-virtual {p1, v2}, Lmh3/c;->c(Lxg3/t;)V

    new-instance p1, Lcom/whoop/realtime/presentation/k$e$a;

    invoke-direct {p1, v2}, Lcom/whoop/realtime/presentation/k$e$a;-><init>(Lxg3/t;)V

    invoke-virtual {v1, p1}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v1}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    return-object p1
.end method
