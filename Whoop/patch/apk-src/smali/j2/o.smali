.class public final synthetic Lj2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lj2/i;


# instance fields
.field public final synthetic w:I

.field public final synthetic x:Lj2/r;


# direct methods
.method public synthetic constructor <init>(Lj2/r;I)V
    .locals 0

    iput p2, p0, Lj2/o;->w:I

    iput-object p1, p0, Lj2/o;->x:Lj2/r;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final i(D)D
    .locals 19

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    iget v3, v0, Lj2/o;->w:I

    iget-object v6, v0, Lj2/o;->x:Lj2/r;

    packed-switch v3, :pswitch_data_0

    iget-wide v7, v6, Lj2/r;->b:D

    iget-wide v9, v6, Lj2/r;->c:D

    iget-wide v11, v6, Lj2/r;->d:D

    iget-wide v13, v6, Lj2/r;->e:D

    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    iget-wide v4, v6, Lj2/r;->f:D

    move-wide/from16 v17, v4

    iget-wide v3, v6, Lj2/r;->g:D

    iget-wide v5, v6, Lj2/r;->a:D

    mul-double/2addr v13, v11

    cmpl-double v13, v1, v13

    if-ltz v13, :cond_0

    sub-double v1, v1, v17

    div-double v4, v15, v5

    invoke-static {v1, v2, v4, v5}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    sub-double/2addr v1, v9

    div-double/2addr v1, v7

    goto :goto_0

    :cond_0
    sub-double/2addr v1, v3

    div-double/2addr v1, v11

    :goto_0
    return-wide v1

    :pswitch_0
    const-wide/high16 v15, 0x3ff0000000000000L    # 1.0

    iget-wide v3, v6, Lj2/r;->b:D

    iget-wide v7, v6, Lj2/r;->c:D

    iget-wide v9, v6, Lj2/r;->d:D

    iget-wide v11, v6, Lj2/r;->e:D

    iget-wide v5, v6, Lj2/r;->a:D

    mul-double/2addr v11, v9

    cmpl-double v11, v1, v11

    if-ltz v11, :cond_1

    div-double v5, v15, v5

    invoke-static {v1, v2, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    sub-double/2addr v1, v7

    div-double/2addr v1, v3

    goto :goto_1

    :cond_1
    div-double/2addr v1, v9

    :goto_1
    return-wide v1

    :pswitch_1
    sget-object v3, Lj2/d;->a:[F

    invoke-static {v6, v1, v2}, Lj2/d;->d(Lj2/r;D)D

    move-result-wide v1

    return-wide v1

    :pswitch_2
    sget-object v3, Lj2/d;->a:[F

    invoke-static {v6, v1, v2}, Lj2/d;->b(Lj2/r;D)D

    move-result-wide v1

    return-wide v1

    :pswitch_3
    iget-wide v3, v6, Lj2/r;->b:D

    iget-wide v7, v6, Lj2/r;->c:D

    iget-wide v9, v6, Lj2/r;->d:D

    iget-wide v11, v6, Lj2/r;->e:D

    iget-wide v13, v6, Lj2/r;->f:D

    move-wide v15, v3

    iget-wide v3, v6, Lj2/r;->g:D

    iget-wide v5, v6, Lj2/r;->a:D

    cmpl-double v11, v1, v11

    if-ltz v11, :cond_2

    mul-double v3, v15, v1

    add-double/2addr v3, v7

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    add-double/2addr v1, v13

    goto :goto_2

    :cond_2
    mul-double/2addr v9, v1

    add-double v1, v9, v3

    :goto_2
    return-wide v1

    :pswitch_4
    iget-wide v3, v6, Lj2/r;->b:D

    iget-wide v7, v6, Lj2/r;->c:D

    iget-wide v9, v6, Lj2/r;->d:D

    iget-wide v11, v6, Lj2/r;->e:D

    iget-wide v5, v6, Lj2/r;->a:D

    cmpl-double v11, v1, v11

    if-ltz v11, :cond_3

    mul-double/2addr v3, v1

    add-double/2addr v3, v7

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->pow(DD)D

    move-result-wide v1

    goto :goto_3

    :cond_3
    mul-double/2addr v1, v9

    :goto_3
    return-wide v1

    :pswitch_5
    sget-object v3, Lj2/d;->a:[F

    invoke-static {v6, v1, v2}, Lj2/d;->c(Lj2/r;D)D

    move-result-wide v1

    return-wide v1

    :pswitch_6
    sget-object v3, Lj2/d;->a:[F

    invoke-static {v6, v1, v2}, Lj2/d;->a(Lj2/r;D)D

    move-result-wide v1

    return-wide v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
