.class public final Lui/e;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic E:Z

.field public final synthetic F:F

.field public final synthetic G:Lui/o;

.field public final synthetic H:Lqi/i;

.field public final synthetic I:F

.field public final synthetic J:Z

.field public final synthetic K:Z

.field public final synthetic L:I

.field public w:I

.field public final synthetic x:Lui/i;

.field public final synthetic y:I

.field public final synthetic z:I


# direct methods
.method public constructor <init>(Lui/i;IIZFLui/o;Lqi/i;FZZILq83/d;)V
    .locals 0

    iput-object p1, p0, Lui/e;->x:Lui/i;

    iput p2, p0, Lui/e;->y:I

    iput p3, p0, Lui/e;->z:I

    iput-boolean p4, p0, Lui/e;->E:Z

    iput p5, p0, Lui/e;->F:F

    iput-object p6, p0, Lui/e;->G:Lui/o;

    iput-object p7, p0, Lui/e;->H:Lqi/i;

    iput p8, p0, Lui/e;->I:F

    iput-boolean p9, p0, Lui/e;->J:Z

    iput-boolean p10, p0, Lui/e;->K:Z

    iput p11, p0, Lui/e;->L:I

    const/4 p1, 0x1

    invoke-direct {p0, p1, p12}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Lq83/d;)Lq83/d;
    .locals 13

    new-instance v0, Lui/e;

    iget-boolean v10, p0, Lui/e;->K:Z

    iget v11, p0, Lui/e;->L:I

    iget-object v1, p0, Lui/e;->x:Lui/i;

    iget v2, p0, Lui/e;->y:I

    iget v3, p0, Lui/e;->z:I

    iget-boolean v4, p0, Lui/e;->E:Z

    iget v5, p0, Lui/e;->F:F

    iget-object v6, p0, Lui/e;->G:Lui/o;

    iget-object v7, p0, Lui/e;->H:Lqi/i;

    iget v8, p0, Lui/e;->I:F

    iget-boolean v9, p0, Lui/e;->J:Z

    move-object v12, p1

    invoke-direct/range {v0 .. v12}, Lui/e;-><init>(Lui/i;IIZFLui/o;Lqi/i;FZZILq83/d;)V

    return-object v0
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Lq83/d;

    invoke-virtual {p0, p1}, Lui/e;->create(Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lui/e;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, v0}, Lui/e;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lui/e;->w:I

    sget-object v2, Ll83/a0;->a:Ll83/a0;

    const/4 v3, 0x0

    const/4 v4, 0x1

    iget-object v5, p0, Lui/e;->x:Lui/i;

    if-eqz v1, :cond_1

    if-ne v1, v4, :cond_0

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto/16 :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget p1, p0, Lui/e;->y:I

    invoke-virtual {v5, p1}, Lui/i;->m(I)V

    iget-object p1, v5, Lui/i;->w:Lp1/k1;

    iget-object v1, v5, Lui/i;->y:Lp1/k1;

    iget v6, p0, Lui/e;->z:I

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v1, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v5, Lui/i;->z:Lp1/k1;

    iget-boolean v7, p0, Lui/e;->E:Z

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-virtual {v1, v7}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v5, Lui/i;->F:Lp1/k1;

    iget v7, p0, Lui/e;->F:F

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v1, v8}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, p0, Lui/e;->G:Lui/o;

    iget-object v8, v5, Lui/i;->E:Lp1/k1;

    invoke-virtual {v8, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v1, v5, Lui/i;->I:Lp1/k1;

    iget-object v8, p0, Lui/e;->H:Lqi/i;

    invoke-virtual {v1, v8}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget v1, p0, Lui/e;->I:F

    invoke-virtual {v5, v1}, Lui/i;->n(F)V

    iget-object v1, v5, Lui/i;->G:Lp1/k1;

    iget-boolean v9, p0, Lui/e;->J:Z

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    invoke-virtual {v1, v9}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-boolean v1, p0, Lui/e;->K:Z

    if-nez v1, :cond_2

    iget-object v1, v5, Lui/i;->L:Lp1/k1;

    const-wide/high16 v9, -0x8000000000000000L

    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v9

    invoke-virtual {v1, v9}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :cond_2
    if-nez v8, :cond_3

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    return-object v2

    :cond_3
    invoke-static {v7}, Ljava/lang/Float;->isInfinite(F)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v5}, Lui/i;->g()F

    move-result v0

    invoke-virtual {v5, v0}, Lui/i;->n(F)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {p1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    invoke-virtual {v5, v6}, Lui/i;->m(I)V

    return-object v2

    :cond_4
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {p1, v1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :try_start_1
    iget p1, p0, Lui/e;->L:I

    invoke-static {p1}, Le4/p;->e(I)I

    move-result p1

    if-eqz p1, :cond_6

    if-ne p1, v4, :cond_5

    sget-object p1, Lbc3/y1;->w:Lbc3/y1;

    goto :goto_0

    :cond_5
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_6
    sget-object p1, Lq83/k;->w:Lq83/k;

    :goto_0
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    invoke-static {v1}, Lbc3/f0;->s(Lq83/j;)Lbc3/k1;

    move-result-object v8

    new-instance v6, Lui/d;

    iget v7, p0, Lui/e;->L:I

    iget v9, p0, Lui/e;->z:I

    iget v10, p0, Lui/e;->y:I

    iget-object v11, p0, Lui/e;->x:Lui/i;

    const/4 v12, 0x0

    invoke-direct/range {v6 .. v12}, Lui/d;-><init>(ILbc3/k1;IILui/i;Lq83/d;)V

    iput v4, p0, Lui/e;->w:I

    invoke-static {p1, v6, p0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    return-object v0

    :cond_7
    :goto_1
    invoke-interface {p0}, Lq83/d;->getContext()Lq83/j;

    move-result-object p1

    invoke-static {p1}, Lbc3/f0;->o(Lq83/j;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v5, v3}, Lui/i;->c(Lui/i;Z)V

    return-object v2

    :goto_2
    invoke-static {v5, v3}, Lui/i;->c(Lui/i;Z)V

    throw p1
.end method
