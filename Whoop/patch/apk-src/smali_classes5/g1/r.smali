.class public final Lg1/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lec3/m;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lkotlin/jvm/internal/g0;

.field public final synthetic y:Lbc3/c0;

.field public final synthetic z:Lc93/m;


# direct methods
.method public synthetic constructor <init>(Lkotlin/jvm/internal/g0;Lbc3/c0;Lc93/m;I)V
    .locals 0

    iput p4, p0, Lg1/r;->w:I

    iput-object p1, p0, Lg1/r;->x:Lkotlin/jvm/internal/g0;

    iput-object p2, p0, Lg1/r;->y:Lbc3/c0;

    iput-object p3, p0, Lg1/r;->z:Lc93/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final emit(Ljava/lang/Object;Lq83/d;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lg1/r;->w:I

    packed-switch v0, :pswitch_data_0

    instance-of v0, p2, Lm1/b;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm1/b;

    iget v1, v0, Lm1/b;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm1/b;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm1/b;

    invoke-direct {v0, p0, p2}, Lm1/b;-><init>(Lg1/r;Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lm1/b;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm1/b;->E:I

    iget-object v3, p0, Lg1/r;->x:Lkotlin/jvm/internal/g0;

    const/4 v4, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v4, :cond_1

    iget-object p1, v0, Lm1/b;->w:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_3

    new-instance v2, Landroidx/compose/material3/internal/AnchoredDragFinishedSignal;

    invoke-direct {v2}, Landroidx/compose/material3/internal/AnchoredDragFinishedSignal;-><init>()V

    invoke-interface {p2, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p1, v0, Lm1/b;->w:Ljava/lang/Object;

    iput-object p2, v0, Lm1/b;->x:Lbc3/k1;

    iput v4, v0, Lm1/b;->E:I

    invoke-interface {p2, v0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    goto :goto_2

    :cond_3
    :goto_1
    move-object v7, p1

    sget-object p1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, Lg1/p;

    iget-object v6, p0, Lg1/r;->z:Lc93/m;

    const/4 v10, 0x1

    iget-object v8, p0, Lg1/r;->y:Lbc3/c0;

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v10}, Lg1/p;-><init>(Lc93/m;Ljava/lang/Object;Lbc3/c0;Lq83/d;I)V

    invoke-static {v8, v9, p1, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v1

    :pswitch_0
    instance-of v0, p2, Lg1/q;

    if-eqz v0, :cond_4

    move-object v0, p2

    check-cast v0, Lg1/q;

    iget v1, v0, Lg1/q;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_4

    sub-int/2addr v1, v2

    iput v1, v0, Lg1/q;->E:I

    goto :goto_3

    :cond_4
    new-instance v0, Lg1/q;

    invoke-direct {v0, p0, p2}, Lg1/q;-><init>(Lg1/r;Lq83/d;)V

    :goto_3
    iget-object p2, v0, Lg1/q;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lg1/q;->E:I

    iget-object v3, p0, Lg1/r;->x:Lkotlin/jvm/internal/g0;

    const/4 v4, 0x1

    if-eqz v2, :cond_6

    if-ne v2, v4, :cond_5

    iget-object p1, v0, Lg1/q;->w:Ljava/lang/Object;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Lbc3/k1;

    if-eqz p2, :cond_7

    new-instance v2, Landroidx/compose/material/AnchoredDragFinishedSignal;

    invoke-direct {v2}, Landroidx/compose/material/AnchoredDragFinishedSignal;-><init>()V

    invoke-interface {p2, v2}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    iput-object p1, v0, Lg1/q;->w:Ljava/lang/Object;

    iput-object p2, v0, Lg1/q;->x:Lbc3/k1;

    iput v4, v0, Lg1/q;->E:I

    invoke-interface {p2, v0}, Lbc3/k1;->join(Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    move-object v7, p1

    sget-object p1, Lbc3/d0;->z:Lbc3/d0;

    new-instance v5, Lg1/p;

    iget-object v6, p0, Lg1/r;->z:Lc93/m;

    const/4 v10, 0x0

    iget-object v8, p0, Lg1/r;->y:Lbc3/c0;

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v10}, Lg1/p;-><init>(Lc93/m;Ljava/lang/Object;Lbc3/c0;Lq83/d;I)V

    invoke-static {v8, v9, p1, v5, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p1

    iput-object p1, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
