.class public final Lh0/u2;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic E:Ljava/lang/Object;

.field public final synthetic w:I

.field public x:I

.field public final synthetic y:F

.field public final synthetic z:F


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;FFLq83/d;I)V
    .locals 0

    iput p5, p0, Lh0/u2;->w:I

    iput-object p1, p0, Lh0/u2;->E:Ljava/lang/Object;

    iput p2, p0, Lh0/u2;->y:F

    iput p3, p0, Lh0/u2;->z:F

    const/4 p1, 0x2

    invoke-direct {p0, p1, p4}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 7

    iget p1, p0, Lh0/u2;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance v0, Lh0/u2;

    iget-object p1, p0, Lh0/u2;->E:Ljava/lang/Object;

    move-object v1, p1

    check-cast v1, Lz7/a;

    iget v3, p0, Lh0/u2;->z:F

    const/4 v5, 0x1

    iget v2, p0, Lh0/u2;->y:F

    move-object v4, p2

    invoke-direct/range {v0 .. v5}, Lh0/u2;-><init>(Ljava/lang/Object;FFLq83/d;I)V

    return-object v0

    :pswitch_0
    move-object v4, p2

    new-instance v1, Lh0/u2;

    iget-object p1, p0, Lh0/u2;->E:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Lh0/w2;

    move-object v5, v4

    iget v4, p0, Lh0/u2;->z:F

    const/4 v6, 0x0

    iget v3, p0, Lh0/u2;->y:F

    invoke-direct/range {v1 .. v6}, Lh0/u2;-><init>(Ljava/lang/Object;FFLq83/d;I)V

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lh0/u2;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lh0/u2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/u2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/u2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lh0/u2;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lh0/u2;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lh0/u2;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

    iget v0, p0, Lh0/u2;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lh0/u2;->E:Ljava/lang/Object;

    check-cast v0, Lz7/a;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, p0, Lh0/u2;->x:I

    const/4 v3, 0x0

    iget v4, p0, Lh0/u2;->z:F

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v7, :cond_2

    if-eq v2, v6, :cond_1

    if-ne v2, v5, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 p1, 0x0

    iput p1, v0, Lz7/a;->a:I

    iput v7, p0, Lh0/u2;->x:I

    iget p1, p0, Lh0/u2;->y:F

    invoke-static {v0, p1, v4, p0}, Lz7/a;->a(Lz7/a;FFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_3

    :cond_4
    :goto_0
    iput v6, p0, Lh0/u2;->x:I

    const-wide/16 v6, 0x32

    invoke-static {v6, v7, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    iput v5, p0, Lh0/u2;->x:I

    invoke-static {v0, v4, v3, p0}, Lz7/a;->a(Lz7/a;FFLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    iget-object p1, v0, Lz7/a;->b:Ljava/lang/Object;

    check-cast p1, Lec3/h2;

    new-instance v0, Ljava/lang/Float;

    invoke-direct {v0, v3}, Ljava/lang/Float;-><init>(F)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v1, 0x0

    invoke-virtual {p1, v1, v0}, Lec3/h2;->k(Ljava/lang/Object;Ljava/lang/Object;)Z

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    :goto_3
    return-object v1

    :pswitch_0
    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lh0/u2;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_8

    if-ne v1, v2, :cond_7

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_8
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lh0/u2;->E:Ljava/lang/Object;

    check-cast p1, Lh0/w2;

    iget-object p1, p1, Lh0/w2;->e0:Lh0/c3;

    iget v1, p0, Lh0/u2;->y:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    iget v1, p0, Lh0/u2;->z:F

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    const/16 v1, 0x20

    shl-long/2addr v3, v1

    const-wide v7, 0xffffffffL

    and-long/2addr v5, v7

    or-long/2addr v3, v5

    iput v2, p0, Lh0/u2;->x:I

    invoke-static {p1, v3, v4, p0}, Landroidx/compose/foundation/gestures/b;->a(Lh0/c3;JLs83/c;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_9

    goto :goto_5

    :cond_9
    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_5
    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
