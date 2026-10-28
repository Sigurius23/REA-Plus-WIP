.class final Lp92/h$g;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lp92/h;->W(Lsj0/a;)V
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
    c = "com.whoop.service.realtime.RealTimeStrainController$onHRUpdate$1"
    f = "RealTimeStrainController.kt"
    l = {
        0xf1,
        0xfa
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field w:Ljava/lang/Object;

.field x:I

.field final synthetic y:Lp92/h;

.field final synthetic z:Lsj0/a;


# direct methods
.method public constructor <init>(Lp92/h;Lsj0/a;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp92/h;",
            "Lsj0/a;",
            "Lq83/d<",
            "-",
            "Lp92/h$g;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lp92/h$g;->y:Lp92/h;

    iput-object p2, p0, Lp92/h$g;->z:Lsj0/a;

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

    new-instance p1, Lp92/h$g;

    iget-object v0, p0, Lp92/h$g;->y:Lp92/h;

    iget-object v1, p0, Lp92/h$g;->z:Lsj0/a;

    invoke-direct {p1, v0, v1, p2}, Lp92/h$g;-><init>(Lp92/h;Lsj0/a;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lp92/h$g;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lp92/h$g;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lp92/h$g;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lp92/h$g;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lp92/h$g;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lp92/h$g;->w:Ljava/lang/Object;

    check-cast v0, Lze1/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lp92/h$g;->w:Ljava/lang/Object;

    check-cast v1, Lze1/d;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->u(Lp92/h;)I

    move-result p1

    iget-object v1, p0, Lp92/h$g;->y:Lp92/h;

    add-int/2addr p1, v3

    invoke-static {v1, p1}, Lp92/h;->z(Lp92/h;I)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->q(Lp92/h;)Lze1/d;

    move-result-object p1

    iget-object v1, p0, Lp92/h$g;->z:Lsj0/a;

    invoke-virtual {v1}, Lsj0/a;->getHeartRate()I

    move-result v1

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v4}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->r(Lp92/h;)Lg83/g;

    move-result-object p1

    iget-object v1, p0, Lp92/h$g;->z:Lsj0/a;

    invoke-virtual {v1}, Lsj0/a;->getHeartRate()I

    move-result v1

    new-instance v4, Ljava/lang/Integer;

    invoke-direct {v4, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v4}, Lg83/g;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->x(Lp92/h;)Lze1/d;

    move-result-object v1

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    iget-object v4, p0, Lp92/h$g;->z:Lsj0/a;

    iput-object v1, p0, Lp92/h$g;->w:Ljava/lang/Object;

    iput v3, p0, Lp92/h$g;->x:I

    invoke-static {p1, v4, p0}, Lp92/h;->h(Lp92/h;Lsj0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    goto :goto_1

    :cond_3
    :goto_0
    invoke-virtual {v1, p1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->p(Lp92/h;)Lze1/d;

    move-result-object p1

    iget-object v1, p0, Lp92/h$g;->y:Lp92/h;

    iget-object v3, p0, Lp92/h$g;->z:Lsj0/a;

    invoke-virtual {v3}, Lsj0/a;->getHeartRate()I

    move-result v3

    invoke-static {v1, v3}, Lp92/h;->o(Lp92/h;I)Ll83/k;

    move-result-object v1

    invoke-virtual {p1, v1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->i(Lp92/h;)Lze1/d;

    move-result-object p1

    iget-object v1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {v1}, Lp92/h;->j(Lp92/h;)D

    move-result-wide v3

    double-to-int v1, v3

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {p1, v3}, Llh3/j;->onNext(Ljava/lang/Object;)V

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->w(Lp92/h;)D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpl-double p1, v3, v5

    if-lez p1, :cond_4

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->m(Lp92/h;)Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->k(Lp92/h;)D

    move-result-wide v3

    invoke-static {v3, v4}, Lgi0/f;->j(D)D

    move-result-wide v3

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->w(Lp92/h;)D

    move-result-wide v5

    cmpl-double p1, v3, v5

    if-lez p1, :cond_4

    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->y(Lp92/h;)V

    :cond_4
    iget-object p1, p0, Lp92/h$g;->y:Lp92/h;

    invoke-static {p1}, Lp92/h;->t(Lp92/h;)Lze1/d;

    move-result-object p1

    iget-object v1, p0, Lp92/h$g;->y:Lp92/h;

    iget-object v3, p0, Lp92/h$g;->z:Lsj0/a;

    iput-object p1, p0, Lp92/h$g;->w:Ljava/lang/Object;

    iput v2, p0, Lp92/h$g;->x:I

    invoke-static {v1, v3, p0}, Lp92/h;->s(Lp92/h;Lsj0/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v0, :cond_5

    :goto_1
    return-object v0

    :cond_5
    move-object v0, p1

    move-object p1, v1

    :goto_2
    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->doubleValue()D

    move-result-wide v1

    const/16 p1, 0x64

    int-to-double v3, p1

    mul-double/2addr v1, v3

    double-to-int p1, v1

    new-instance v1, Ljava/lang/Integer;

    invoke-direct {v1, p1}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0, v1}, Llh3/j;->onNext(Ljava/lang/Object;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
