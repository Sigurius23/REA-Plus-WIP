.class public final synthetic Lq0/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lc93/a;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lq0/y;


# direct methods
.method public synthetic constructor <init>(Lq0/y;I)V
    .locals 0

    iput p2, p0, Lq0/c;->w:I

    iput-object p1, p0, Lq0/c;->x:Lq0/y;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 5

    iget v0, p0, Lq0/c;->w:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lq0/c;->x:Lq0/y;

    iget-object v1, v0, Lq0/y;->s:Lp1/h1;

    iget-object v2, v0, Lq0/y;->k:Lh0/d0;

    invoke-virtual {v2}, Lh0/d0;->b()Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_1

    invoke-virtual {v1}, Lp1/h1;->x()I

    move-result v1

    goto :goto_0

    :cond_1
    iget-object v1, v0, Lq0/y;->d:Ll9/o;

    iget-object v1, v1, Ll9/o;->d:Ljava/lang/Object;

    check-cast v1, Lp1/g1;

    invoke-virtual {v1}, Lp1/g1;->x()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v1

    iget-object v2, v0, Lq0/y;->q:Ly3/c;

    sget v3, Lq0/c0;->a:F

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v2

    invoke-virtual {v0}, Lq0/y;->n()I

    move-result v3

    int-to-float v3, v3

    const/high16 v4, 0x40000000    # 2.0f

    div-float/2addr v3, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(FF)F

    move-result v2

    invoke-virtual {v0}, Lq0/y;->n()I

    move-result v3

    int-to-float v3, v3

    div-float/2addr v2, v3

    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    move-result v2

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_3

    iget-object v1, v0, Lq0/y;->H:Lp1/k1;

    invoke-virtual {v1}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, v0, Lq0/y;->e:I

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_2
    iget v1, v0, Lq0/y;->e:I

    goto :goto_0

    :cond_3
    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v1

    :goto_0
    invoke-virtual {v0, v1}, Lq0/y;->j(I)I

    move-result v0

    :goto_1
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lq0/c;->x:Lq0/y;

    iget-object v1, v0, Lq0/y;->k:Lh0/d0;

    invoke-virtual {v1}, Lh0/d0;->b()Z

    move-result v1

    if-eqz v1, :cond_4

    iget-object v0, v0, Lq0/y;->t:Lp1/h1;

    invoke-virtual {v0}, Lp1/h1;->x()I

    move-result v0

    goto :goto_2

    :cond_4
    invoke-virtual {v0}, Lq0/y;->k()I

    move-result v0

    :goto_2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :pswitch_1
    iget-object v0, p0, Lq0/c;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    goto :goto_1

    :pswitch_2
    iget-object v0, p0, Lq0/c;->x:Lq0/y;

    invoke-virtual {v0}, Lq0/y;->m()I

    move-result v0

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
