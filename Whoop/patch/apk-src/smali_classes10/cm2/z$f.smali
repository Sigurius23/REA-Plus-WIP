.class final Lcm2/z$f;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcm2/z;->D(Lcm2/y;)Lbc3/k1;
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
    c = "com.whoop.trends.viewmodel.TrendsViewModel$sendViewEvent$11"
    f = "TrendsViewModel.kt"
    l = {
        0xd9
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:I

.field final synthetic x:Lcm2/z;

.field final synthetic y:Lcm2/y;


# direct methods
.method public constructor <init>(Lcm2/z;Lcm2/y;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcm2/z;",
            "Lcm2/y;",
            "Lq83/d<",
            "-",
            "Lcm2/z$f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcm2/z$f;->x:Lcm2/z;

    iput-object p2, p0, Lcm2/z$f;->y:Lcm2/y;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

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

    new-instance p1, Lcm2/z$f;

    iget-object v0, p0, Lcm2/z$f;->x:Lcm2/z;

    iget-object v1, p0, Lcm2/z$f;->y:Lcm2/y;

    invoke-direct {p1, v0, v1, p2}, Lcm2/z$f;-><init>(Lcm2/z;Lcm2/y;Lq83/d;)V

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
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcm2/z$f;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lcm2/z$f;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lcm2/z$f;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lcm2/z$f;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lcm2/z$f;->w:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcm2/z$f;->x:Lcm2/z;

    invoke-virtual {p1}, Lcm2/z;->v()Ltl2/a;

    move-result-object p1

    iget-object v1, p0, Lcm2/z$f;->y:Lcm2/y;

    check-cast v1, Lcm2/y$b;

    invoke-virtual {v1}, Lcm2/y$b;->a()Lbm2/f0;

    move-result-object v1

    invoke-virtual {p1, v1}, Ltl2/a;->y(Lbm2/f0;)V

    iget-object p1, p0, Lcm2/z$f;->x:Lcm2/z;

    invoke-static {p1}, Lcm2/z;->l(Lcm2/z;)Lec3/o1;

    move-result-object p1

    new-instance v1, Lvl2/s$b;

    iget-object v3, p0, Lcm2/z$f;->y:Lcm2/y;

    check-cast v3, Lcm2/y$b;

    invoke-virtual {v3}, Lcm2/y$b;->a()Lbm2/f0;

    move-result-object v3

    invoke-direct {v1, v3}, Lvl2/s$b;-><init>(Lbm2/f0;)V

    iput v2, p0, Lcm2/z$f;->w:I

    invoke-interface {p1, v1, p0}, Lec3/o1;->emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_2

    return-object v0

    :cond_2
    :goto_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
