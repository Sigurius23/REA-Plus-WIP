.class final Lbm2/q$d;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lbm2/q;->h(Landroidx/compose/ui/Modifier;Lbm2/r;Lcom/whoop/util/TrendKey;Lor2/h0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.trends.view.component.InterTrendNavigationKt$InterTrendNavigation$1$4$4$1"
    f = "InterTrendNavigation.kt"
    l = {
        0xab
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lbm2/r;

.field final synthetic F:Ln0/u;

.field w:I

.field x:I

.field final synthetic y:Lcom/whoop/util/TrendKey;

.field final synthetic z:Lor2/h0;


# direct methods
.method public constructor <init>(Lcom/whoop/util/TrendKey;Lor2/h0;Lbm2/r;Ln0/u;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/util/TrendKey;",
            "Lor2/h0;",
            "Lbm2/r;",
            "Ln0/u;",
            "Lq83/d<",
            "-",
            "Lbm2/q$d;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lbm2/q$d;->y:Lcom/whoop/util/TrendKey;

    iput-object p2, p0, Lbm2/q$d;->z:Lor2/h0;

    iput-object p3, p0, Lbm2/q$d;->E:Lbm2/r;

    iput-object p4, p0, Lbm2/q$d;->F:Ln0/u;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6
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

    new-instance v0, Lbm2/q$d;

    iget-object v1, p0, Lbm2/q$d;->y:Lcom/whoop/util/TrendKey;

    iget-object v2, p0, Lbm2/q$d;->z:Lor2/h0;

    iget-object v3, p0, Lbm2/q$d;->E:Lbm2/r;

    iget-object v4, p0, Lbm2/q$d;->F:Ln0/u;

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lbm2/q$d;-><init>(Lcom/whoop/util/TrendKey;Lor2/h0;Lbm2/r;Ln0/u;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lbm2/q$d;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lbm2/q$d;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lbm2/q$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lbm2/q$d;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lbm2/q$d;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lbm2/q$d;->y:Lcom/whoop/util/TrendKey;

    invoke-virtual {p1}, Lcom/whoop/util/TrendKey;->isRecovery()Z

    move-result p1

    const/4 v1, -0x1

    const/4 v3, 0x0

    if-nez p1, :cond_7

    iget-object p1, p0, Lbm2/q$d;->z:Lor2/h0;

    invoke-virtual {p1}, Lor2/h0;->isRecovery()Z

    move-result p1

    if-eqz p1, :cond_2

    goto :goto_1

    :cond_2
    iget-object p1, p0, Lbm2/q$d;->y:Lcom/whoop/util/TrendKey;

    invoke-virtual {p1}, Lcom/whoop/util/TrendKey;->isSleep()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lbm2/q$d;->z:Lor2/h0;

    invoke-virtual {p1}, Lor2/h0;->isSleep()Z

    move-result p1

    if-nez p1, :cond_5

    iget-object p1, p0, Lbm2/q$d;->z:Lor2/h0;

    invoke-virtual {p1}, Lor2/h0;->isOther()Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lbm2/q$d;->y:Lcom/whoop/util/TrendKey;

    invoke-virtual {p1}, Lcom/whoop/util/TrendKey;->isStrain()Z

    move-result p1

    if-nez p1, :cond_4

    iget-object p1, p0, Lbm2/q$d;->z:Lor2/h0;

    invoke-virtual {p1}, Lor2/h0;->isStrain()Z

    move-result p1

    :cond_4
    move v1, v3

    goto :goto_4

    :cond_5
    :goto_0
    iget-object p1, p0, Lbm2/q$d;->E:Lbm2/r;

    invoke-virtual {p1}, Lbm2/r;->b()Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v4

    invoke-interface {p1, v4}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p1

    :cond_6
    invoke-interface {p1}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {p1}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lm91/u;

    instance-of v4, v4, Lhy0/e;

    if-eqz v4, :cond_6

    invoke-interface {p1}, Ljava/util/ListIterator;->nextIndex()I

    move-result v1

    goto :goto_4

    :cond_7
    :goto_1
    iget-object p1, p0, Lbm2/q$d;->E:Lbm2/r;

    invoke-virtual {p1}, Lbm2/r;->b()Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/lang/Iterable;

    invoke-static {p1, v2}, Lm83/s;->z0(Ljava/lang/Iterable;I)Ljava/util/List;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    move v4, v3

    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm91/u;

    instance-of v5, v5, Lhy0/e;

    if-eqz v5, :cond_8

    move v1, v4

    goto :goto_3

    :cond_8
    add-int/lit8 v4, v4, 0x1

    goto :goto_2

    :cond_9
    :goto_3
    add-int/2addr v1, v2

    :cond_a
    :goto_4
    iget-object p1, p0, Lbm2/q$d;->F:Ln0/u;

    iput v1, p0, Lbm2/q$d;->w:I

    iput v2, p0, Lbm2/q$d;->x:I

    sget-object v2, Ln0/u;->x:Lp0/n0;

    invoke-virtual {p1, v1, v3, p0}, Ln0/u;->j(IILq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    return-object v0

    :cond_b
    :goto_5
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
