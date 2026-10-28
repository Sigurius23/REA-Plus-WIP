.class final Lmq2/g$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lmq2/g;->f(Lmq2/b;ZILc93/a;Lc93/m;Landroidx/compose/runtime/Composer;II)V
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
    c = "com.whoop.user.journey.view.components.animation.ChronologicalCardAnimatorKt$ChronologicalCardAnimator$4$1"
    f = "ChronologicalCardAnimator.kt"
    l = {}
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field final synthetic E:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic F:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field

.field final synthetic G:I

.field w:I

.field private synthetic x:Ljava/lang/Object;

.field final synthetic y:Lmq2/b;

.field final synthetic z:Lp1/c1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/c1;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lmq2/b;Lp1/c1;Lp1/c1;Lp1/c1;ILq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq2/b;",
            "Lp1/c1;",
            "Lp1/c1;",
            "Lp1/c1;",
            "I",
            "Lq83/d<",
            "-",
            "Lmq2/g$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lmq2/g$c;->y:Lmq2/b;

    iput-object p2, p0, Lmq2/g$c;->z:Lp1/c1;

    iput-object p3, p0, Lmq2/g$c;->E:Lp1/c1;

    iput-object p4, p0, Lmq2/g$c;->F:Lp1/c1;

    iput p5, p0, Lmq2/g$c;->G:I

    const/4 p1, 0x2

    invoke-direct {p0, p1, p6}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7
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

    new-instance v0, Lmq2/g$c;

    iget-object v1, p0, Lmq2/g$c;->y:Lmq2/b;

    iget-object v2, p0, Lmq2/g$c;->z:Lp1/c1;

    iget-object v3, p0, Lmq2/g$c;->E:Lp1/c1;

    iget-object v4, p0, Lmq2/g$c;->F:Lp1/c1;

    iget v5, p0, Lmq2/g$c;->G:I

    move-object v6, p2

    invoke-direct/range {v0 .. v6}, Lmq2/g$c;-><init>(Lmq2/b;Lp1/c1;Lp1/c1;Lp1/c1;ILq83/d;)V

    iput-object p1, v0, Lmq2/g$c;->x:Ljava/lang/Object;

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
    invoke-virtual {p0, p1, p2}, Lmq2/g$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lmq2/g$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lmq2/g$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lmq2/g$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    iget-object v0, p0, Lmq2/g$c;->x:Ljava/lang/Object;

    check-cast v0, Lbc3/c0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lmq2/g$c;->w:I

    if-nez v1, :cond_8

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lmq2/g$c;->y:Lmq2/b;

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lmq2/b;->f()Lp1/c1;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lxq2/t;

    goto :goto_0

    :cond_0
    move-object p1, v1

    :goto_0
    sget-object v2, Lxq2/t;->FORWARD:Lxq2/t;

    if-eq p1, v2, :cond_4

    sget-object v2, Lxq2/t;->BACKWARD:Lxq2/t;

    if-ne p1, v2, :cond_1

    goto :goto_1

    :cond_1
    if-nez p1, :cond_7

    iget-object p1, p0, Lmq2/g$c;->E:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->H(Lp1/c1;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-interface {p1, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_2
    iget-object p1, p0, Lmq2/g$c;->E:Lp1/c1;

    invoke-static {p1, v1}, Lmq2/g;->I(Lp1/c1;Lbc3/k1;)V

    iget-object p1, p0, Lmq2/g$c;->F:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->N(Lp1/c1;)Lmq2/d;

    move-result-object p1

    sget-object v0, Lmq2/d;->WAITING_TO_EXIT:Lmq2/d;

    if-eq p1, v0, :cond_3

    iget-object p1, p0, Lmq2/g$c;->F:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->N(Lp1/c1;)Lmq2/d;

    move-result-object p1

    sget-object v0, Lmq2/d;->EXITING:Lmq2/d;

    if-ne p1, v0, :cond_7

    :cond_3
    iget-object p1, p0, Lmq2/g$c;->F:Lp1/c1;

    sget-object v0, Lmq2/d;->ENTERED:Lmq2/d;

    invoke-static {p1, v0}, Lmq2/g;->O(Lp1/c1;Lmq2/d;)V

    goto :goto_2

    :cond_4
    :goto_1
    iget-object p1, p0, Lmq2/g$c;->z:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->E(Lp1/c1;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-interface {p1, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_5
    iget-object p1, p0, Lmq2/g$c;->E:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->H(Lp1/c1;)Lbc3/k1;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1, v1}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_6
    iget-object p1, p0, Lmq2/g$c;->F:Lp1/c1;

    invoke-static {p1}, Lmq2/g;->N(Lp1/c1;)Lmq2/d;

    move-result-object p1

    sget-object v2, Lmq2/d;->ENTERED:Lmq2/d;

    if-ne p1, v2, :cond_7

    iget-object p1, p0, Lmq2/g$c;->F:Lp1/c1;

    sget-object v2, Lmq2/d;->WAITING_TO_EXIT:Lmq2/d;

    invoke-static {p1, v2}, Lmq2/g;->O(Lp1/c1;Lmq2/d;)V

    iget-object p1, p0, Lmq2/g$c;->E:Lp1/c1;

    new-instance v2, Lmq2/g$c$a;

    iget v3, p0, Lmq2/g$c;->G:I

    iget-object v4, p0, Lmq2/g$c;->F:Lp1/c1;

    invoke-direct {v2, v3, v4, v1}, Lmq2/g$c$a;-><init>(ILp1/c1;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v1, v1, v2, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    invoke-static {p1, v0}, Lmq2/g;->I(Lp1/c1;Lbc3/k1;)V

    :cond_7
    :goto_2
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :cond_8
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
