.class public final Lib/e;
.super Lib/k;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lib/n;


# direct methods
.method public synthetic constructor <init>(Lib/n;I)V
    .locals 0

    iput p2, p0, Lib/e;->a:I

    iput-object p1, p0, Lib/e;->b:Lib/n;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(ILib/l;)V
    .locals 12

    iget v0, p0, Lib/e;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lib/e;->b:Lib/n;

    check-cast v0, Lib/c0;

    iget-object v1, v0, Lib/n;->y:Lib/m;

    iget-object v2, v0, Lib/n;->z:Lib/r;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lib/l;->e:Lib/l;

    const/4 v4, 0x0

    if-ne p2, v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    iget v5, p2, Lib/l;->d:I

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Lib/n;->d()V

    goto/16 :goto_4

    :cond_1
    iget-object v3, v0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_4

    :cond_2
    if-eqz p1, :cond_4

    const/4 v3, 0x3

    if-ne p1, v3, :cond_3

    goto :goto_1

    :cond_3
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected resultType"

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :cond_4
    :goto_1
    iget-object p1, p2, Lib/l;->a:Ljava/util/List;

    iget-object v3, v2, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    if-nez v3, :cond_7

    iget v3, p2, Lib/l;->b:I

    iget p2, p2, Lib/l;->c:I

    iget v1, v1, Lib/m;->a:I

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/lit8 v7, v1, -0x1

    add-int/2addr v7, v6

    div-int/2addr v7, v1

    move v6, v4

    :goto_2
    if-ge v6, v7, :cond_6

    mul-int v8, v6, v1

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v9

    add-int/lit8 v10, v6, 0x1

    mul-int v11, v10, v1

    invoke-static {v9, v11}, Ljava/lang/Math;->min(II)I

    move-result v9

    invoke-interface {p1, v8, v9}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v9

    if-nez v6, :cond_5

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v6

    add-int/2addr v6, p2

    invoke-interface {v9}, Ljava/util/List;->size()I

    move-result v8

    sub-int/2addr v6, v8

    invoke-virtual {v2, v3, v6, v5, v9}, Lib/r;->f(IIILjava/util/List;)V

    goto :goto_3

    :cond_5
    add-int/2addr v8, v3

    const/4 v6, 0x0

    invoke-virtual {v2, v8, v9, v6}, Lib/r;->g(ILjava/util/List;Lib/q;)V

    :goto_3
    move v6, v10

    goto :goto_2

    :cond_6
    invoke-virtual {v2}, Lib/r;->size()I

    move-result p1

    invoke-virtual {v0, v4, p1}, Lib/n;->q(II)V

    goto :goto_4

    :cond_7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget-object p2, v2, Lib/r;->x:Ljava/util/ArrayList;

    invoke-virtual {v2, v5, p1, v0}, Lib/r;->g(ILjava/util/List;Lib/q;)V

    :goto_4
    return-void

    :pswitch_0
    iget-object v0, p0, Lib/e;->b:Lib/n;

    check-cast v0, Lib/g;

    iget-object v1, v0, Lib/n;->z:Lib/r;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Lib/l;->e:Lib/l;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne p2, v2, :cond_8

    move v2, v4

    goto :goto_5

    :cond_8
    move v2, v3

    :goto_5
    iget v5, p2, Lib/l;->d:I

    iget v6, p2, Lib/l;->b:I

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lib/n;->d()V

    goto/16 :goto_7

    :cond_9
    iget-object v2, v0, Lib/n;->I:Ljava/util/concurrent/atomic/AtomicBoolean;

    invoke-virtual {v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    move-result v2

    if-eqz v2, :cond_a

    goto/16 :goto_7

    :cond_a
    iget-object v2, p2, Lib/l;->a:Ljava/util/List;

    const/4 v7, 0x2

    const/4 v8, -0x1

    if-nez p1, :cond_b

    iget p1, p2, Lib/l;->c:I

    invoke-virtual {v1, v6, p1, v5, v2}, Lib/r;->f(IIILjava/util/List;)V

    invoke-virtual {v1}, Lib/r;->size()I

    move-result p1

    invoke-virtual {v0, v3, p1}, Lib/n;->q(II)V

    iget p1, v1, Lib/r;->w:I

    iget p1, v0, Lib/n;->E:I

    if-ne p1, v8, :cond_17

    add-int/2addr v6, v5

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p1

    div-int/2addr p1, v7

    add-int/2addr p1, v6

    iput p1, v0, Lib/n;->E:I

    goto/16 :goto_7

    :cond_b
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-ne p1, v4, :cond_11

    iget-object p1, v1, Lib/r;->x:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_c

    iput v7, v0, Lib/g;->N:I

    goto/16 :goto_7

    :cond_c
    iget v5, v1, Lib/r;->F:I

    if-lez v5, :cond_e

    invoke-static {p1, v4}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    iget v5, v1, Lib/r;->F:I

    if-ne v4, v5, :cond_d

    if-le p2, v5, :cond_e

    :cond_d
    iput v8, v1, Lib/r;->F:I

    :cond_e
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget p1, v1, Lib/r;->E:I

    add-int/2addr p1, p2

    iput p1, v1, Lib/r;->E:I

    iget p1, v1, Lib/r;->y:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int v2, p2, p1

    if-eqz p1, :cond_f

    iget v4, v1, Lib/r;->y:I

    sub-int/2addr v4, p1

    iput v4, v1, Lib/r;->y:I

    :cond_f
    iget v4, v1, Lib/r;->H:I

    add-int/2addr v4, p2

    iput v4, v1, Lib/r;->H:I

    iget v4, v1, Lib/r;->w:I

    iget v1, v1, Lib/r;->E:I

    add-int/2addr v4, v1

    sub-int/2addr v4, p2

    iget p2, v0, Lib/g;->P:I

    sub-int/2addr p2, p1

    sub-int/2addr p2, v2

    iput p2, v0, Lib/g;->P:I

    iput v3, v0, Lib/g;->N:I

    if-lez p2, :cond_10

    invoke-virtual {v0}, Lib/g;->t()V

    :cond_10
    invoke-virtual {v0, v4, p1}, Lib/n;->p(II)V

    add-int/2addr v4, p1

    invoke-virtual {v0, v4, v2}, Lib/n;->q(II)V

    goto :goto_7

    :cond_11
    if-ne p1, v7, :cond_18

    iget-object p1, v1, Lib/r;->x:Ljava/util/ArrayList;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result p2

    if-nez p2, :cond_12

    iput v7, v0, Lib/g;->M:I

    goto :goto_7

    :cond_12
    iget v5, v1, Lib/r;->F:I

    if-lez v5, :cond_14

    if-eq p2, v5, :cond_14

    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ne v5, v4, :cond_13

    iget v4, v1, Lib/r;->F:I

    if-le p2, v4, :cond_13

    iput p2, v1, Lib/r;->F:I

    goto :goto_6

    :cond_13
    iput v8, v1, Lib/r;->F:I

    :cond_14
    :goto_6
    invoke-virtual {p1, v3, v2}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    iget p1, v1, Lib/r;->E:I

    add-int/2addr p1, p2

    iput p1, v1, Lib/r;->E:I

    iget p1, v1, Lib/r;->w:I

    invoke-static {p1, p2}, Ljava/lang/Math;->min(II)I

    move-result p1

    sub-int v2, p2, p1

    if-eqz p1, :cond_15

    iget v4, v1, Lib/r;->w:I

    sub-int/2addr v4, p1

    iput v4, v1, Lib/r;->w:I

    :cond_15
    iget v4, v1, Lib/r;->z:I

    sub-int/2addr v4, v2

    iput v4, v1, Lib/r;->z:I

    iget v4, v1, Lib/r;->G:I

    add-int/2addr v4, p2

    iput v4, v1, Lib/r;->G:I

    iget p2, v1, Lib/r;->w:I

    iget v1, v0, Lib/g;->O:I

    sub-int/2addr v1, p1

    sub-int/2addr v1, v2

    iput v1, v0, Lib/g;->O:I

    iput v3, v0, Lib/g;->M:I

    if-lez v1, :cond_16

    invoke-virtual {v0}, Lib/g;->u()V

    :cond_16
    invoke-virtual {v0, p2, p1}, Lib/n;->p(II)V

    invoke-virtual {v0, v3, v2}, Lib/n;->q(II)V

    iget p1, v0, Lib/n;->E:I

    add-int/2addr p1, v2

    iput p1, v0, Lib/n;->E:I

    iget p1, v0, Lib/n;->G:I

    add-int/2addr p1, v2

    iput p1, v0, Lib/n;->G:I

    iget p1, v0, Lib/n;->H:I

    add-int/2addr p1, v2

    iput p1, v0, Lib/n;->H:I

    :cond_17
    :goto_7
    return-void

    :cond_18
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v0, "unexpected resultType "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
