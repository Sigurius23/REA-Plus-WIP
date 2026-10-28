.class public final Lk4/a;
.super Lj4/g;
.source "SourceFile"


# instance fields
.field public final synthetic n0:I

.field public final o0:F


# direct methods
.method public synthetic constructor <init>(Le4/s;I)V
    .locals 0

    iput p2, p0, Lk4/a;->n0:I

    const/4 p2, 0x4

    invoke-direct {p0, p1, p2}, Lj4/g;-><init>(Le4/s;I)V

    const/high16 p1, 0x3f000000    # 0.5f

    iput p1, p0, Lk4/a;->o0:F

    return-void
.end method


# virtual methods
.method public final apply()V
    .locals 5

    iget v0, p0, Lk4/a;->n0:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lj4/g;->k0:Le4/s;

    invoke-virtual {v3, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    invoke-virtual {v2}, Lj4/b;->h()V

    iget-object v3, p0, Lj4/b;->R:Ljava/lang/Object;

    if-eqz v3, :cond_1

    invoke-virtual {v2, v3}, Lj4/b;->p(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    iget-object v3, p0, Lj4/b;->S:Ljava/lang/Object;

    if-eqz v3, :cond_2

    const/16 v4, 0xa

    iput v4, v2, Lj4/b;->j0:I

    iput-object v3, v2, Lj4/b;->S:Ljava/lang/Object;

    goto :goto_1

    :cond_2
    invoke-virtual {v2, v0}, Lj4/b;->p(Ljava/lang/Object;)V

    :goto_1
    iget-object v3, p0, Lj4/b;->U:Ljava/lang/Object;

    if-eqz v3, :cond_3

    const/16 v4, 0xc

    iput v4, v2, Lj4/b;->j0:I

    iput-object v3, v2, Lj4/b;->U:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v3, p0, Lj4/b;->V:Ljava/lang/Object;

    if-eqz v3, :cond_4

    invoke-virtual {v2, v3}, Lj4/b;->e(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v2, v0}, Lj4/b;->e(Ljava/lang/Object;)V

    :goto_2
    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, p0, Lk4/a;->o0:F

    cmpl-float v3, v4, v3

    if-eqz v3, :cond_0

    iput v4, v2, Lj4/b;->i:F

    goto :goto_0

    :cond_5
    return-void

    :pswitch_0
    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-object v1, p0, Lj4/g;->m0:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_6
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    iget-object v3, p0, Lj4/g;->k0:Le4/s;

    invoke-virtual {v3, v2}, Le4/s;->b(Ljava/lang/Object;)Lj4/b;

    move-result-object v2

    invoke-virtual {v2}, Lj4/b;->g()V

    iget-object v3, p0, Lj4/b;->N:Ljava/lang/Object;

    if-eqz v3, :cond_7

    invoke-virtual {v2, v3}, Lj4/b;->o(Ljava/lang/Object;)V

    goto :goto_4

    :cond_7
    iget-object v3, p0, Lj4/b;->O:Ljava/lang/Object;

    if-eqz v3, :cond_8

    const/4 v4, 0x6

    iput v4, v2, Lj4/b;->j0:I

    iput-object v3, v2, Lj4/b;->O:Ljava/lang/Object;

    goto :goto_4

    :cond_8
    invoke-virtual {v2, v0}, Lj4/b;->o(Ljava/lang/Object;)V

    :goto_4
    iget-object v3, p0, Lj4/b;->P:Ljava/lang/Object;

    if-eqz v3, :cond_9

    const/4 v4, 0x7

    iput v4, v2, Lj4/b;->j0:I

    iput-object v3, v2, Lj4/b;->P:Ljava/lang/Object;

    goto :goto_5

    :cond_9
    iget-object v3, p0, Lj4/b;->Q:Ljava/lang/Object;

    if-eqz v3, :cond_a

    invoke-virtual {v2, v3}, Lj4/b;->i(Ljava/lang/Object;)V

    goto :goto_5

    :cond_a
    invoke-virtual {v2, v0}, Lj4/b;->i(Ljava/lang/Object;)V

    :goto_5
    const/high16 v3, 0x3f000000    # 0.5f

    iget v4, p0, Lk4/a;->o0:F

    cmpl-float v3, v4, v3

    if-eqz v3, :cond_6

    iput v4, v2, Lj4/b;->h:F

    goto :goto_3

    :cond_b
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
