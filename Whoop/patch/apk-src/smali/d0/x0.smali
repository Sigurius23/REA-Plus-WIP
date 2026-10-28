.class public final synthetic Ld0/x0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Ld0/f1;


# direct methods
.method public synthetic constructor <init>(Ld0/f1;I)V
    .locals 0

    iput p2, p0, Ld0/x0;->w:I

    iput-object p1, p0, Ld0/x0;->x:Ld0/f1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    iget v0, p0, Ld0/x0;->w:I

    check-cast p1, Ljava/lang/Long;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Ld0/x0;->x:Ld0/f1;

    iget-wide v2, p1, Ld0/f1;->M:J

    sub-long v2, v0, v2

    iput-wide v0, p1, Ld0/f1;->M:J

    long-to-double v0, v2

    iget v2, p1, Ld0/f1;->Q:F

    float-to-double v2, v2

    div-double/2addr v0, v2

    invoke-static {v0, v1}, Le93/b;->Y(D)J

    move-result-wide v0

    iget-object v2, p1, Ld0/f1;->N:La0/q0;

    invoke-virtual {v2}, La0/q0;->h()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_4

    iget-object v3, v2, La0/q0;->a:[Ljava/lang/Object;

    iget v5, v2, La0/q0;->b:I

    const/4 v6, 0x0

    move v7, v6

    :goto_0
    if-ge v7, v5, :cond_0

    aget-object v8, v3, v7

    check-cast v8, Ld0/y0;

    invoke-static {v8, v0, v1}, Ld0/f1;->N0(Ld0/y0;J)V

    const/4 v9, 0x1

    invoke-virtual {v8, v9}, Ld0/y0;->j(Z)V

    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :cond_0
    iget-object v3, p1, Ld0/f1;->F:Ld0/z1;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ld0/z1;->o()V

    :cond_1
    iget v3, v2, La0/q0;->b:I

    iget-object v5, v2, La0/q0;->a:[Ljava/lang/Object;

    invoke-static {v6, v3}, Le93/b;->i0(II)Li93/j;

    move-result-object v7

    iget v8, v7, Li93/h;->w:I

    iget v7, v7, Li93/h;->x:I

    if-gt v8, v7, :cond_3

    :goto_1
    sub-int v9, v8, v6

    aget-object v10, v5, v8

    aput-object v10, v5, v9

    aget-object v9, v5, v8

    check-cast v9, Ld0/y0;

    invoke-virtual {v9}, Ld0/y0;->h()Z

    move-result v9

    if-eqz v9, :cond_2

    add-int/lit8 v6, v6, 0x1

    :cond_2
    if-eq v8, v7, :cond_3

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_3
    sub-int v7, v3, v6

    invoke-static {v7, v3, v4, v5}, Lm83/n;->n0(IILjava/lang/Object;[Ljava/lang/Object;)V

    iget v3, v2, La0/q0;->b:I

    sub-int/2addr v3, v6

    iput v3, v2, La0/q0;->b:I

    :cond_4
    iget-object v2, p1, Ld0/f1;->O:Ld0/y0;

    if-eqz v2, :cond_6

    iget-wide v5, p1, Ld0/f1;->G:J

    invoke-virtual {v2, v5, v6}, Ld0/y0;->k(J)V

    invoke-static {v2, v0, v1}, Ld0/f1;->N0(Ld0/y0;J)V

    invoke-virtual {v2}, Ld0/y0;->g()F

    move-result v0

    invoke-virtual {p1, v0}, Ld0/f1;->Q0(F)V

    invoke-virtual {v2}, Ld0/y0;->g()F

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    cmpg-float v0, v0, v1

    if-nez v0, :cond_5

    iput-object v4, p1, Ld0/f1;->O:Ld0/y0;

    :cond_5
    invoke-virtual {p1}, Ld0/f1;->P0()V

    :cond_6
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    iget-object p1, p0, Ld0/x0;->x:Ld0/f1;

    iput-wide v0, p1, Ld0/f1;->M:J

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
