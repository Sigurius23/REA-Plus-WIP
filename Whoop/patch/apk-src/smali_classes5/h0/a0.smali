.class public final Lh0/a0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Lh0/k2;

.field public F:Ljava/lang/Object;

.field public final synthetic G:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:Lkotlin/jvm/internal/d0;

.field public y:I

.field public final synthetic z:F


# direct methods
.method public constructor <init>(FLh0/b0;Lh0/k2;Lq83/d;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lh0/a0;->w:I

    .line 1
    iput p1, p0, Lh0/a0;->z:F

    iput-object p2, p0, Lh0/a0;->G:Ljava/lang/Object;

    iput-object p3, p0, Lh0/a0;->E:Lh0/k2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public constructor <init>(Li0/g;FLkotlin/jvm/functions/Function1;Lh0/k2;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lh0/a0;->w:I

    .line 2
    iput-object p1, p0, Lh0/a0;->F:Ljava/lang/Object;

    iput p2, p0, Lh0/a0;->z:F

    iput-object p3, p0, Lh0/a0;->G:Ljava/lang/Object;

    iput-object p4, p0, Lh0/a0;->E:Lh0/k2;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p5}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 6

    iget p1, p0, Lh0/a0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lh0/a0;

    iget-object p1, p0, Lh0/a0;->F:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Li0/g;

    iget-object p1, p0, Lh0/a0;->G:Ljava/lang/Object;

    move-object v3, p1

    check-cast v3, Lkotlin/jvm/functions/Function1;

    iget-object v4, p0, Lh0/a0;->E:Lh0/k2;

    iget v2, p0, Lh0/a0;->z:F

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lh0/a0;-><init>(Li0/g;FLkotlin/jvm/functions/Function1;Lh0/k2;Lq83/d;)V

    return-object v0

    :pswitch_0
    move-object v5, p2

    new-instance p1, Lh0/a0;

    iget-object p2, p0, Lh0/a0;->G:Ljava/lang/Object;

    check-cast p2, Lh0/b0;

    iget-object v0, p0, Lh0/a0;->E:Lh0/k2;

    iget v1, p0, Lh0/a0;->z:F

    invoke-direct {p1, v1, p2, v0, v5}, Lh0/a0;-><init>(FLh0/b0;Lh0/k2;Lq83/d;)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/a0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh0/a0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/a0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/a0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/a0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/a0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    iget v0, p0, Lh0/a0;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh0/a0;->G:Ljava/lang/Object;

    move-object v6, v0

    check-cast v6, Lkotlin/jvm/functions/Function1;

    iget-object v0, p0, Lh0/a0;->F:Ljava/lang/Object;

    check-cast v0, Li0/g;

    iget-object v7, v0, Li0/g;->a:Li0/l;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/a0;->y:I

    const/4 v9, 0x0

    const/4 v10, 0x2

    const/4 v2, 0x1

    if-eqz v1, :cond_2

    if-eq v1, v2, :cond_1

    if-ne v1, v10, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v0, p1

    goto/16 :goto_2

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    iget-object v1, p0, Lh0/a0;->x:Lkotlin/jvm/internal/d0;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v11, v1

    move-object v1, p1

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object v1, v0, Li0/g;->b:Ld0/x;

    iget v3, p0, Lh0/a0;->z:F

    invoke-static {v1, v9, v3}, Ld0/f;->k(Ld0/x;FF)F

    move-result v1

    invoke-interface {v7, v3, v1}, Li0/l;->b(FF)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-eqz v4, :cond_3

    const-string v4, "calculateApproachOffset returned NaN. Please use a valid value."

    invoke-static {v4}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_3
    new-instance v11, Lkotlin/jvm/internal/d0;

    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    invoke-static {v3}, Ljava/lang/Math;->signum(F)F

    move-result v3

    mul-float/2addr v3, v1

    iput v3, v11, Lkotlin/jvm/internal/d0;->w:F

    new-instance v1, Ljava/lang/Float;

    invoke-direct {v1, v3}, Ljava/lang/Float;-><init>(F)V

    invoke-interface {v6, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    iget v1, v11, Lkotlin/jvm/internal/d0;->w:F

    new-instance v4, Li0/d;

    const/4 v3, 0x0

    invoke-direct {v4, v11, v6, v3}, Li0/d;-><init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;I)V

    iput-object v11, p0, Lh0/a0;->x:Lkotlin/jvm/internal/d0;

    iput v2, p0, Lh0/a0;->y:I

    move v2, v1

    iget-object v1, p0, Lh0/a0;->E:Lh0/k2;

    iget v3, p0, Lh0/a0;->z:F

    move-object v5, p0

    invoke-static/range {v0 .. v5}, Li0/g;->b(Li0/g;Lh0/k2;FFLi0/d;Ls83/c;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v8, :cond_4

    goto :goto_1

    :cond_4
    :goto_0
    check-cast v1, Ld0/m;

    invoke-virtual {v1}, Ld0/m;->a()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    invoke-interface {v7, v2}, Li0/l;->a(F)F

    move-result v2

    invoke-static {v2}, Ljava/lang/Float;->isNaN(F)Z

    move-result v3

    if-eqz v3, :cond_5

    const-string v3, "calculateSnapOffset returned NaN. Please use a valid value."

    invoke-static {v3}, Lk0/a;->c(Ljava/lang/String;)V

    :cond_5
    iput v2, v11, Lkotlin/jvm/internal/d0;->w:F

    const/16 v3, 0x1e

    invoke-static {v1, v9, v9, v3}, Ld0/f;->m(Ld0/m;FFI)Ld0/m;

    move-result-object v3

    iget-object v4, v0, Li0/g;->c:Ld0/l;

    new-instance v0, Li0/d;

    const/4 v1, 0x1

    invoke-direct {v0, v11, v6, v1}, Li0/d;-><init>(Lkotlin/jvm/internal/d0;Lkotlin/jvm/functions/Function1;I)V

    const/4 v1, 0x0

    iput-object v1, p0, Lh0/a0;->x:Lkotlin/jvm/internal/d0;

    iput v10, p0, Lh0/a0;->y:I

    move-object v1, v0

    iget-object v0, p0, Lh0/a0;->E:Lh0/k2;

    move-object v5, v1

    move v1, v2

    move-object v6, p0

    invoke-static/range {v0 .. v6}, Li0/k;->b(Lh0/k2;FFLd0/m;Ld0/l;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v8, :cond_6

    :goto_1
    move-object v0, v8

    :cond_6
    :goto_2
    return-object v0

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/a0;->y:I

    const/4 v2, 0x1

    if-eqz v1, :cond_8

    if-ne v1, v2, :cond_7

    iget-object v0, p0, Lh0/a0;->F:Ljava/lang/Object;

    check-cast v0, Ld0/m;

    iget-object v1, p0, Lh0/a0;->x:Lkotlin/jvm/internal/d0;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/util/concurrent/CancellationException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_3

    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget v1, p0, Lh0/a0;->z:F

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    cmpl-float v3, v3, v4

    if-lez v3, :cond_a

    new-instance v3, Lkotlin/jvm/internal/d0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput v1, v3, Lkotlin/jvm/internal/d0;->w:F

    new-instance v4, Lkotlin/jvm/internal/d0;

    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    const/4 v6, 0x0

    const/16 v7, 0x1c

    invoke-static {v6, v1, v7}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v1

    :try_start_1
    iget-object v6, p0, Lh0/a0;->G:Ljava/lang/Object;

    check-cast v6, Lh0/b0;

    iget-object v7, v6, Lh0/b0;->a:Ld0/x;

    iget-object v8, p0, Lh0/a0;->E:Lh0/k2;

    new-instance v9, Lep1/g;

    invoke-direct {v9, v4, v8, v3, v6}, Lep1/g;-><init>(Lkotlin/jvm/internal/d0;Lh0/k2;Lkotlin/jvm/internal/d0;Lh0/b0;)V

    iput-object v3, p0, Lh0/a0;->x:Lkotlin/jvm/internal/d0;

    iput-object v1, p0, Lh0/a0;->F:Ljava/lang/Object;

    iput v2, p0, Lh0/a0;->y:I

    const/4 v2, 0x0

    invoke-static {v1, v7, v2, v9, p0}, Ld0/f;->f(Ld0/m;Ld0/x;ZLkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;

    move-result-object v1
    :try_end_1
    .catch Ljava/util/concurrent/CancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne v1, v0, :cond_9

    goto :goto_4

    :cond_9
    move-object v1, v3

    goto :goto_3

    :catch_0
    move-object v0, v1

    move-object v1, v3

    :catch_1
    invoke-virtual {v0}, Ld0/m;->a()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    iput v0, v1, Lkotlin/jvm/internal/d0;->w:F

    :goto_3
    iget v1, v1, Lkotlin/jvm/internal/d0;->w:F

    :cond_a
    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, v1}, Ljava/lang/Float;-><init>(F)V

    :goto_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
