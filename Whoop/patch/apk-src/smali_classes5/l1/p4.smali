.class public final Ll1/p4;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Ll1/q4;

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ll1/q4;FLq83/d;I)V
    .locals 0

    iput p4, p0, Ll1/p4;->w:I

    iput-object p1, p0, Ll1/p4;->y:Ll1/q4;

    iput p2, p0, Ll1/p4;->z:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Ll1/p4;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Ll1/p4;

    iget v0, p0, Ll1/p4;->z:F

    const/4 v1, 0x1

    iget-object v2, p0, Ll1/p4;->y:Ll1/q4;

    invoke-direct {p1, v2, v0, p2, v1}, Ll1/p4;-><init>(Ll1/q4;FLq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Ll1/p4;

    iget v0, p0, Ll1/p4;->z:F

    const/4 v1, 0x0

    iget-object v2, p0, Ll1/p4;->y:Ll1/q4;

    invoke-direct {p1, v2, v0, p2, v1}, Ll1/p4;-><init>(Ll1/q4;FLq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Ll1/p4;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Ll1/p4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/p4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/p4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Ll1/p4;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Ll1/p4;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Ll1/p4;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    iget v0, p0, Ll1/p4;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Ll1/p4;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Ll1/p4;->y:Ll1/q4;

    iget-object v3, p1, Ll1/q4;->S:Ld0/e;

    if-eqz v3, :cond_4

    new-instance v4, Ljava/lang/Float;

    iget v1, p0, Ll1/p4;->z:F

    invoke-direct {v4, v1}, Ljava/lang/Float;-><init>(F)V

    iget-boolean v1, p1, Ll1/q4;->R:Z

    if-eqz v1, :cond_2

    sget-object p1, Landroidx/compose/material3/d;->f:Ld0/g1;

    :goto_0
    move-object v5, p1

    goto :goto_1

    :cond_2
    iget-object p1, p1, Ll1/q4;->Q:Ld0/i1;

    goto :goto_0

    :goto_1
    iput v2, p0, Ll1/p4;->x:I

    const/4 v6, 0x0

    const/16 v8, 0xc

    move-object v7, p0

    invoke-static/range {v3 .. v8}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, v7

    if-ne p1, v0, :cond_3

    goto :goto_4

    :cond_3
    :goto_2
    check-cast p1, Ld0/j;

    goto :goto_3

    :cond_4
    move-object v5, p0

    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_0
    move-object v5, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Ll1/p4;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_6

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v5, Ll1/p4;->y:Ll1/q4;

    iget-object v1, p1, Ll1/q4;->T:Ld0/e;

    if-eqz v1, :cond_9

    move v3, v2

    new-instance v2, Ljava/lang/Float;

    iget v4, v5, Ll1/p4;->z:F

    invoke-direct {v2, v4}, Ljava/lang/Float;-><init>(F)V

    iget-boolean v4, p1, Ll1/q4;->R:Z

    if-eqz v4, :cond_7

    sget-object p1, Landroidx/compose/material3/d;->f:Ld0/g1;

    goto :goto_5

    :cond_7
    iget-object p1, p1, Ll1/q4;->Q:Ld0/i1;

    :goto_5
    iput v3, v5, Ll1/p4;->x:I

    const/4 v4, 0x0

    const/16 v6, 0xc

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Ld0/e;->d(Ld0/e;Ljava/lang/Object;Ld0/l;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_8

    goto :goto_7

    :cond_8
    :goto_6
    check-cast p1, Ld0/j;

    :cond_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_7
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
