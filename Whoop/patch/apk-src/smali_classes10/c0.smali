.class public final Lc0;
.super Ls83/i;
.source "SourceFile"

# interfaces
.implements Lc93/m;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public final synthetic y:Le0;

.field public final synthetic z:Lp1/z0;


# direct methods
.method public synthetic constructor <init>(Le0;Lp1/z0;Lq83/d;I)V
    .locals 0

    iput p4, p0, Lc0;->w:I

    iput-object p1, p0, Lc0;->y:Le0;

    iput-object p2, p0, Lc0;->z:Lp1/z0;

    const/4 p1, 0x2

    invoke-direct {p0, p1, p3}, Ls83/i;-><init>(ILq83/d;)V

    return-void
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lq83/d;)Lq83/d;
    .locals 3

    iget p1, p0, Lc0;->w:I

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lc0;

    iget-object v0, p0, Lc0;->z:Lp1/z0;

    const/4 v1, 0x1

    iget-object v2, p0, Lc0;->y:Le0;

    invoke-direct {p1, v2, v0, p2, v1}, Lc0;-><init>(Le0;Lp1/z0;Lq83/d;I)V

    return-object p1

    :pswitch_0
    new-instance p1, Lc0;

    iget-object v0, p0, Lc0;->z:Lp1/z0;

    const/4 v1, 0x0

    iget-object v2, p0, Lc0;->y:Le0;

    invoke-direct {p1, v2, v0, p2, v1}, Lc0;-><init>(Le0;Lp1/z0;Lq83/d;I)V

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iget v0, p0, Lc0;->w:I

    check-cast p1, Lbc3/c0;

    check-cast p2, Lq83/d;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0, p1, p2}, Lc0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    :pswitch_0
    invoke-virtual {p0, p1, p2}, Lc0;->create(Ljava/lang/Object;Lq83/d;)Lq83/d;

    move-result-object p1

    check-cast p1, Lc0;

    sget-object p2, Ll83/a0;->a:Ll83/a0;

    invoke-virtual {p1, p2}, Lc0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Lc0;->w:I

    packed-switch v0, :pswitch_data_0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, p0, Lc0;->x:I

    const/4 v2, 0x2

    const/4 v3, 0x1

    iget-object v4, p0, Lc0;->y:Le0;

    if-eqz v1, :cond_2

    if-eq v1, v3, :cond_1

    if-ne v1, v2, :cond_0

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p0

    goto :goto_1

    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-wide v5, v4, Le0;->r:J

    iput v3, p0, Lc0;->x:I

    invoke-static {v5, v6, p0}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_3

    move-object v5, p0

    goto :goto_2

    :cond_3
    :goto_0
    iget p1, v4, Le0;->a:F

    const/4 v1, 0x0

    const/high16 v3, 0x42c80000    # 100.0f

    invoke-static {p1, v1, v3}, Le93/b;->m(FFF)F

    move-result v6

    iget p1, v4, Le0;->p:I

    const/4 v1, 0x0

    const/4 v3, 0x6

    const/4 v4, 0x0

    invoke-static {p1, v1, v4, v3}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v7

    new-instance v8, Lb0;

    const/4 p1, 0x1

    iget-object v1, p0, Lc0;->z:Lp1/z0;

    invoke-direct {v8, v1, p1}, Lb0;-><init>(Lp1/z0;I)V

    iput v2, p0, Lc0;->x:I

    const/4 v5, 0x0

    const/4 v10, 0x4

    move-object v9, p0

    invoke-static/range {v5 .. v10}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    move-object v5, v9

    if-ne p1, v0, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_2
    return-object v0

    :pswitch_0
    move-object v5, p0

    sget-object v0, Lr83/a;->w:Lr83/a;

    iget v1, v5, Lc0;->x:I

    const/4 v2, 0x1

    if-eqz v1, :cond_6

    if-ne v1, v2, :cond_5

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, v5, Lc0;->y:Le0;

    iget v1, p1, Le0;->s:F

    const/high16 v3, 0x40400000    # 3.0f

    mul-float/2addr v1, v3

    const/high16 v3, 0x42c80000    # 100.0f

    add-float/2addr v1, v3

    iget p1, p1, Le0;->q:I

    const/4 v3, 0x0

    const/4 v4, 0x6

    const/4 v6, 0x0

    invoke-static {p1, v3, v6, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v3

    new-instance v4, Lb0;

    const/4 p1, 0x0

    iget-object v6, v5, Lc0;->z:Lp1/z0;

    invoke-direct {v4, v6, p1}, Lb0;-><init>(Lp1/z0;I)V

    iput v2, v5, Lc0;->x:I

    move v2, v1

    const/4 v1, 0x0

    const/4 v6, 0x4

    invoke-static/range {v1 .. v6}, Ld0/f;->e(FFLd0/l;Lc93/m;Lq83/d;I)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v0, :cond_7

    goto :goto_4

    :cond_7
    :goto_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    :goto_4
    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
