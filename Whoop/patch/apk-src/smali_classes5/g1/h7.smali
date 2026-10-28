.class public final Lg1/h7;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ld0/l;

.field public final synthetic F:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public synthetic y:Ljava/lang/Object;

.field public final synthetic z:F


# direct methods
.method public constructor <init>(FLd0/l;Lkotlin/jvm/internal/d0;Lq83/d;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lg1/h7;->w:I

    .line 1
    iput p1, p0, Lg1/h7;->z:F

    iput-object p2, p0, Lg1/h7;->E:Ld0/l;

    iput-object p3, p0, Lg1/h7;->F:Ljava/lang/Object;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;FLd0/l;Lq83/d;I)V
    .locals 0

    .line 2
    iput p5, p0, Lg1/h7;->w:I

    iput-object p1, p0, Lg1/h7;->F:Ljava/lang/Object;

    iput p2, p0, Lg1/h7;->z:F

    iput-object p3, p0, Lg1/h7;->E:Ld0/l;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 8

    iget v0, p0, Lg1/h7;->w:I

    packed-switch v0, :pswitch_data_0

    new-instance v1, Lg1/h7;

    iget-object v0, p0, Lg1/h7;->F:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Lkotlin/jvm/internal/d0;

    iget-object v0, p0, Lg1/h7;->E:Ld0/l;

    move-object v4, v0

    check-cast v4, Ld0/i1;

    const/4 v6, 0x2

    iget v3, p0, Lg1/h7;->z:F

    move-object v5, p2

    invoke-direct/range {v1 .. v6}, Lg1/h7;-><init>(Ljava/lang/Object;FLd0/l;Lq83/d;I)V

    iput-object p1, v1, Lg1/h7;->y:Ljava/lang/Object;

    return-object v1

    :pswitch_0
    move-object v5, p2

    new-instance p2, Lg1/h7;

    iget-object v0, p0, Lg1/h7;->F:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    iget v1, p0, Lg1/h7;->z:F

    iget-object v2, p0, Lg1/h7;->E:Ld0/l;

    invoke-direct {p2, v1, v2, v0, v5}, Lg1/h7;-><init>(FLd0/l;Lkotlin/jvm/internal/d0;Lq83/d;)V

    iput-object p1, p2, Lg1/h7;->y:Ljava/lang/Object;

    return-object p2

    :pswitch_1
    move-object v5, p2

    new-instance v2, Lg1/h7;

    iget-object p2, p0, Lg1/h7;->F:Ljava/lang/Object;

    move-object v3, p2

    check-cast v3, Lg1/n7;

    move-object v6, v5

    iget-object v5, p0, Lg1/h7;->E:Ld0/l;

    const/4 v7, 0x0

    iget v4, p0, Lg1/h7;->z:F

    invoke-direct/range {v2 .. v7}, Lg1/h7;-><init>(Ljava/lang/Object;FLd0/l;Lq83/d;I)V

    iput-object p1, v2, Lg1/h7;->y:Ljava/lang/Object;

    return-object v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lg1/h7;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lh0/e0;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/h7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/h7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/h7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    check-cast p1, Lh0/k2;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/h7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/h7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/h7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lh0/g1;

    check-cast p2, Lq83/d;

    invoke-virtual {p0, p1, p2}, Lg1/h7;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lg1/h7;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lg1/h7;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 13

    iget v0, p0, Lg1/h7;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg1/h7;->F:Ljava/lang/Object;

    check-cast v0, Lkotlin/jvm/internal/d0;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lg1/h7;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    if-ne v2, v3, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, p0

    goto :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lg1/h7;->y:Ljava/lang/Object;

    check-cast p1, Lh0/e0;

    iget v2, v0, Lkotlin/jvm/internal/d0;->w:F

    const/4 v4, 0x0

    const/16 v5, 0x1e

    invoke-static {v2, v4, v5}, Ld0/f;->b(FFI)Ld0/m;

    move-result-object v6

    new-instance v7, Ljava/lang/Float;

    iget v2, p0, Lg1/h7;->z:F

    invoke-direct {v7, v2}, Ljava/lang/Float;-><init>(F)V

    iget-object v2, p0, Lg1/h7;->E:Ld0/l;

    move-object v8, v2

    check-cast v8, Ld0/i1;

    new-instance v10, Lfd3/a;

    const/16 v2, 0x1c

    invoke-direct {v10, v2, v0, p1}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v3, p0, Lg1/h7;->x:I

    const/4 v9, 0x0

    const/4 v12, 0x4

    move-object v11, p0

    invoke-static/range {v6 .. v12}, Ld0/f;->i(Ld0/m;Ljava/lang/Float;Ld0/l;ZLkotlin/jvm/functions/Function1;Ls83/c;I)Ljava/lang/Object;

    move-result-object p1

    move-object v6, v11

    if-ne p1, v1, :cond_2

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_1
    return-object v1

    :pswitch_0
    move-object v6, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v6, Lg1/h7;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_4

    if-ne v1, v2, :cond_3

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v6, Lg1/h7;->y:Ljava/lang/Object;

    check-cast p1, Lh0/k2;

    iget-object v1, v6, Lg1/h7;->F:Ljava/lang/Object;

    check-cast v1, Lkotlin/jvm/internal/d0;

    new-instance v5, Lf01/f;

    const/16 v3, 0x15

    invoke-direct {v5, v3, v1, p1}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    iput v2, v6, Lg1/h7;->x:I

    const/4 v2, 0x0

    iget v3, v6, Lg1/h7;->z:F

    iget-object v4, v6, Lg1/h7;->E:Ld0/l;

    const/4 v7, 0x4

    invoke-static/range {v2 .. v7}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_5

    goto :goto_3

    :cond_5
    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v0

    :pswitch_1
    move-object v6, p0

    iget-object v0, v6, Lg1/h7;->F:Ljava/lang/Object;

    check-cast v0, Lg1/n7;

    iget-object v1, v0, Lg1/n7;->d:Lp1/k1;

    iget-object v8, v0, Lg1/n7;->h:Lp1/k1;

    sget-object v9, Lr83/a;->w:Lr83/a;

    iget v2, v6, Lg1/h7;->x:I

    const/4 v10, 0x0

    const/4 v3, 0x1

    if-eqz v2, :cond_7

    if-ne v2, v3, :cond_6

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_6
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v6, Lg1/h7;->y:Ljava/lang/Object;

    check-cast p1, Lh0/g1;

    new-instance v2, Lkotlin/jvm/internal/d0;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    iget-object v0, v0, Lg1/n7;->g:Lp1/g1;

    invoke-virtual {v0}, Lp1/g1;->x()F

    move-result v0

    iput v0, v2, Lkotlin/jvm/internal/d0;->w:F

    new-instance v0, Ljava/lang/Float;

    iget v4, v6, Lg1/h7;->z:F

    invoke-direct {v0, v4}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {v8, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    :try_start_1
    iget v0, v2, Lkotlin/jvm/internal/d0;->w:F

    invoke-static {v0}, Ld0/f;->a(F)Ld0/e;

    move-result-object v0

    move v5, v3

    new-instance v3, Ljava/lang/Float;

    invoke-direct {v3, v4}, Ljava/lang/Float;-><init>(F)V

    iget-object v4, v6, Lg1/h7;->E:Ld0/l;

    move v7, v5

    new-instance v5, Lg1/a6;

    const/4 v11, 0x1

    invoke-direct {v5, p1, v2, v11}, Lg1/a6;-><init>(Lh0/g1;Lkotlin/jvm/internal/d0;I)V

    iput v7, v6, Lg1/h7;->x:I

    const/4 v7, 0x4

    move-object v2, v0

    invoke-static/range {v2 .. v7}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v9, :cond_8

    goto :goto_5

    :cond_8
    :goto_4
    check-cast p1, Ld0/j;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v8, v10}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, p1}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v9, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v9

    :goto_6
    invoke-virtual {v8, v10}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    throw p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
