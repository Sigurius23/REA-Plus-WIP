.class final Lxq2/c1$c;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lxq2/c1;->R(Lmq2/b;IIIILkotlin/jvm/functions/Function1;Lxq2/f0;Lbc3/c0;Landroidx/compose/runtime/Composer;I)V
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
    c = "com.whoop.user.journey.view.components.steps.inreviewdesignitem.userjourneydesigncomponents.YearInReviewTimelineKt$TimelineNavEffects$1$1"
    f = "YearInReviewTimeline.kt"
    l = {
        0x16d,
        0x175
    }
    m = "invokeSuspend"
    v = 0x2
.end annotation


# instance fields
.field E:I

.field final synthetic F:Lmq2/b;

.field final synthetic G:I

.field final synthetic H:I

.field final synthetic I:Lp1/t2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lp1/t2;"
        }
    .end annotation
.end field

.field final synthetic J:Lxq2/f0;

.field final synthetic K:I

.field final synthetic L:Lbc3/c0;

.field final synthetic M:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation
.end field

.field w:Ljava/lang/Object;

.field x:I

.field y:I

.field z:I


# direct methods
.method public constructor <init>(Lmq2/b;IILp1/t2;Lxq2/f0;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lq83/d;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmq2/b;",
            "II",
            "Lp1/t2;",
            "Lxq2/f0;",
            "I",
            "Lbc3/c0;",
            "Lkotlin/jvm/functions/Function1;",
            "Lq83/d<",
            "-",
            "Lxq2/c1$c;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lxq2/c1$c;->F:Lmq2/b;

    iput p2, p0, Lxq2/c1$c;->G:I

    iput p3, p0, Lxq2/c1$c;->H:I

    iput-object p4, p0, Lxq2/c1$c;->I:Lp1/t2;

    iput-object p5, p0, Lxq2/c1$c;->J:Lxq2/f0;

    iput p6, p0, Lxq2/c1$c;->K:I

    iput-object p7, p0, Lxq2/c1$c;->L:Lbc3/c0;

    iput-object p8, p0, Lxq2/c1$c;->M:Lkotlin/jvm/functions/Function1;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p9}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;ILmq2/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/c1$c;->h(Lkotlin/jvm/functions/Function1;ILmq2/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;ILmq2/b;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p2}, Lmq2/b;->g()V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 10
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

    new-instance v0, Lxq2/c1$c;

    iget-object v1, p0, Lxq2/c1$c;->F:Lmq2/b;

    iget v2, p0, Lxq2/c1$c;->G:I

    iget v3, p0, Lxq2/c1$c;->H:I

    iget-object v4, p0, Lxq2/c1$c;->I:Lp1/t2;

    iget-object v5, p0, Lxq2/c1$c;->J:Lxq2/f0;

    iget v6, p0, Lxq2/c1$c;->K:I

    iget-object v7, p0, Lxq2/c1$c;->L:Lbc3/c0;

    iget-object v8, p0, Lxq2/c1$c;->M:Lkotlin/jvm/functions/Function1;

    move-object v9, p2

    invoke-direct/range {v0 .. v9}, Lxq2/c1$c;-><init>(Lmq2/b;IILp1/t2;Lxq2/f0;ILbc3/c0;Lkotlin/jvm/functions/Function1;Lq83/d;)V

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
    invoke-virtual {p0, p1, p2}, Lxq2/c1$c;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lxq2/c1$c;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lxq2/c1$c;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 2
    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lxq2/c1$c;->invoke(Lbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lxq2/c1$c;->E:I

    const/4 v2, 0x2

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v4, :cond_1

    if-ne v1, v2, :cond_0

    iget-object v0, p0, Lxq2/c1$c;->w:Ljava/lang/Object;

    check-cast v0, Lxq2/t;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-object v3

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    iget-object v1, p0, Lxq2/c1$c;->w:Ljava/lang/Object;

    check-cast v1, Lxq2/t;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lxq2/c1$c;->F:Lmq2/b;

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lmq2/b;->f()Lp1/c1;

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Lxq2/t;

    if-nez v1, :cond_4

    :cond_3
    :goto_0
    move-object v13, p0

    goto/16 :goto_4

    :cond_4
    sget-object p1, Lxq2/t;->FORWARD:Lxq2/t;

    if-eq v1, p1, :cond_5

    sget-object p1, Lxq2/t;->BACKWARD:Lxq2/t;

    if-eq v1, p1, :cond_5

    goto :goto_0

    :cond_5
    iget p1, p0, Lxq2/c1$c;->G:I

    if-lez p1, :cond_3

    iget p1, p0, Lxq2/c1$c;->H:I

    if-gtz p1, :cond_6

    goto :goto_0

    :cond_6
    iput-object v1, p0, Lxq2/c1$c;->w:Ljava/lang/Object;

    iput v4, p0, Lxq2/c1$c;->E:I

    const-wide/16 v5, 0xc8

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    move-object v13, p0

    goto :goto_3

    :cond_7
    :goto_1
    sget-object p1, Lxq2/t;->FORWARD:Lxq2/t;

    if-ne v1, p1, :cond_8

    iget p1, p0, Lxq2/c1$c;->G:I

    goto :goto_2

    :cond_8
    iget p1, p0, Lxq2/c1$c;->G:I

    neg-int p1, p1

    :goto_2
    iget-object v1, p0, Lxq2/c1$c;->I:Lp1/t2;

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    add-int/2addr v1, p1

    iget v5, p0, Lxq2/c1$c;->H:I

    sub-int/2addr v5, v4

    const/4 v4, 0x0

    invoke-static {v1, v4, v5}, Le93/b;->n(III)I

    move-result v1

    iget v4, p0, Lxq2/c1$c;->G:I

    iget v5, p0, Lxq2/c1$c;->H:I

    invoke-static {v1, v4, v5}, Lxq2/c1;->i0(III)I

    move-result v7

    iget-object v4, p0, Lxq2/c1$c;->I:Lp1/t2;

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    if-eq v7, v4, :cond_a

    iget-object v4, p0, Lxq2/c1$c;->J:Lxq2/f0;

    invoke-virtual {v4}, Lxq2/f0;->e()Lbc3/k1;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_9

    invoke-interface {v4, v5}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_9
    iget-object v6, p0, Lxq2/c1$c;->J:Lxq2/f0;

    iget v8, p0, Lxq2/c1$c;->K:I

    iget-object v4, p0, Lxq2/c1$c;->M:Lkotlin/jvm/functions/Function1;

    iget-object v9, p0, Lxq2/c1$c;->F:Lmq2/b;

    new-instance v10, Lxq2/e1;

    invoke-direct {v10, v4, v7, v9}, Lxq2/e1;-><init>(Lkotlin/jvm/functions/Function1;ILmq2/b;)V

    iget-object v12, p0, Lxq2/c1$c;->L:Lbc3/c0;

    iput-object v5, p0, Lxq2/c1$c;->w:Ljava/lang/Object;

    iput p1, p0, Lxq2/c1$c;->x:I

    iput v1, p0, Lxq2/c1$c;->y:I

    iput v7, p0, Lxq2/c1$c;->z:I

    iput v2, p0, Lxq2/c1$c;->E:I

    const/4 v9, 0x1

    const/4 v11, 0x1

    move-object v13, p0

    invoke-virtual/range {v6 .. v13}, Lxq2/f0;->g(IIZLc93/a;ZLbc3/c0;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_b

    :goto_3
    return-object v0

    :cond_a
    move-object v13, p0

    iget-object p1, v13, Lxq2/c1$c;->F:Lmq2/b;

    invoke-virtual {p1}, Lmq2/b;->g()V

    :cond_b
    :goto_4
    return-object v3
.end method
