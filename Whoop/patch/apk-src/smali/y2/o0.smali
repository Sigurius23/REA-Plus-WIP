.class public final Ly2/o0;
.super Ly2/i1;
.source "SourceFile"


# instance fields
.field public final synthetic x:I

.field public final y:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ly2/o0;->x:I

    iput-object p1, p0, Ly2/o0;->y:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public b(Ly2/o;)F
    .locals 8

    iget v0, p0, Ly2/o0;->x:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0, p1}, Ly2/i1;->b(Ly2/o;)F

    move-result p1

    return p1

    :pswitch_0
    iget-object v0, p1, Ly2/o;->a:Lc93/m;

    const/high16 v1, 0x7fc00000    # Float.NaN

    if-eqz v0, :cond_0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {v0, p0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    goto/16 :goto_4

    :cond_0
    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, La3/w0;

    iget-boolean v2, v0, La3/w0;->K:Z

    if-eqz v2, :cond_1

    goto/16 :goto_4

    :cond_1
    move-object v2, v0

    :goto_0
    iget-object v3, v2, La3/w0;->M:La3/i2;

    if-eqz v3, :cond_3

    iget-object v4, v3, La3/i2;->b:Ljava/lang/Object;

    check-cast v4, [Ly2/o;

    invoke-static {v4, p1}, Lm83/n;->z0([Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v4

    if-gez v4, :cond_2

    goto :goto_1

    :cond_2
    iget-object v3, v3, La3/i2;->c:Ljava/lang/Object;

    check-cast v3, [F

    aget v3, v3, v4

    goto :goto_2

    :cond_3
    :goto_1
    move v3, v1

    :goto_2
    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v4

    if-nez v4, :cond_4

    invoke-virtual {v0}, La3/w0;->N0()La3/n0;

    move-result-object v1

    invoke-virtual {v2, v1, p1}, La3/w0;->C0(La3/n0;Ly2/o;)V

    invoke-virtual {v2}, La3/w0;->L0()Ly2/y;

    move-result-object v1

    invoke-virtual {v0}, La3/w0;->L0()Ly2/y;

    move-result-object v0

    iget p1, p1, Ly2/o;->b:I

    packed-switch p1, :pswitch_data_1

    invoke-interface {v1}, Ly2/y;->n()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int p1, v4

    int-to-float p1, p1

    const/high16 v2, 0x40000000    # 2.0f

    div-float/2addr p1, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p1

    int-to-long v4, p1

    const/16 p1, 0x20

    shl-long/2addr v2, p1

    and-long/2addr v4, v6

    or-long/2addr v2, v4

    invoke-interface {v0, v1, v2, v3}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    shr-long/2addr v0, p1

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    :goto_3
    move v1, p1

    goto :goto_4

    :pswitch_1
    invoke-interface {v1}, Ly2/y;->n()J

    move-result-wide v4

    const/16 p1, 0x20

    shr-long/2addr v4, p1

    long-to-int v2, v4

    int-to-float v2, v2

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v2, v4

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v4, p1

    const-wide v6, 0xffffffffL

    and-long/2addr v2, v6

    or-long/2addr v2, v4

    invoke-interface {v0, v1, v2, v3}, Ly2/y;->k(Ly2/y;J)J

    move-result-wide v0

    and-long/2addr v0, v6

    long-to-int p1, v0

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    goto :goto_3

    :cond_4
    invoke-virtual {v2}, La3/w0;->P0()La3/w0;

    move-result-object v3

    if-nez v3, :cond_5

    invoke-virtual {v0}, La3/w0;->N0()La3/n0;

    move-result-object v0

    invoke-virtual {v2, v0, p1}, La3/w0;->C0(La3/n0;Ly2/o;)V

    :goto_4
    return v1

    :cond_5
    move-object v2, v3

    goto/16 :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch
.end method

.method public final c()Ly3/m;
    .locals 1

    iget v0, p0, Ly2/o0;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getLayoutDirection()Ly3/m;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, La3/w0;

    invoke-interface {v0}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v0

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e()I
    .locals 1

    iget v0, p0, Ly2/o0;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getRoot()La3/n0;

    move-result-object v0

    invoke-virtual {v0}, La3/n0;->J()I

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, La3/w0;

    invoke-virtual {v0}, Ly2/j1;->j0()I

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final getDensity()F
    .locals 1

    iget v0, p0, Ly2/o0;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getDensity()Ly3/c;

    move-result-object v0

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, La3/w0;

    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final m0()F
    .locals 1

    iget v0, p0, Ly2/o0;->x:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, Landroidx/compose/ui/platform/AndroidComposeView;

    invoke-interface {v0}, Landroidx/compose/ui/node/Owner;->getDensity()Ly3/c;

    move-result-object v0

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Ly2/o0;->y:Ljava/lang/Object;

    check-cast v0, La3/w0;

    invoke-interface {v0}, Ly3/c;->m0()F

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
