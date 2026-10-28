.class public final synthetic Lf1/v;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Lf1/v;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lf1/q0;)Lf1/u;
    .locals 9

    iget v0, p0, Lf1/v;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-interface {p1}, Lf1/q0;->i()Lf1/u;

    move-result-object v0

    if-nez v0, :cond_0

    sget-object v0, Lf1/w;->c:Lf1/w;

    invoke-static {p1, v0}, Lf1/y0;->i(Lf1/q0;Lf1/f;)Lf1/u;

    move-result-object v0

    goto/16 :goto_a

    :cond_0
    iget-object v1, v0, Lf1/u;->b:Lf1/t;

    iget-object v2, v0, Lf1/u;->a:Lf1/t;

    invoke-interface {p1}, Lf1/q0;->a()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {p1}, Lf1/q0;->k()Lf1/r;

    move-result-object v3

    invoke-static {p1, v3, v2}, Lf1/y0;->m(Lf1/q0;Lf1/r;Lf1/t;)Lf1/t;

    move-result-object v3

    move-object v4, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v4

    goto :goto_0

    :cond_1
    invoke-interface {p1}, Lf1/q0;->j()Lf1/r;

    move-result-object v3

    invoke-static {p1, v3, v1}, Lf1/y0;->m(Lf1/q0;Lf1/r;Lf1/t;)Lf1/t;

    move-result-object v3

    move-object v4, v3

    :goto_0
    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    goto/16 :goto_a

    :cond_2
    invoke-interface {p1}, Lf1/q0;->e()Lf1/g;

    move-result-object v0

    sget-object v1, Lf1/g;->w:Lf1/g;

    if-eq v0, v1, :cond_4

    invoke-interface {p1}, Lf1/q0;->e()Lf1/g;

    move-result-object v0

    sget-object v1, Lf1/g;->y:Lf1/g;

    if-ne v0, v1, :cond_3

    iget v0, v2, Lf1/t;->b:I

    iget v1, v3, Lf1/t;->b:I

    if-le v0, v1, :cond_3

    goto :goto_1

    :cond_3
    const/4 v0, 0x0

    goto :goto_2

    :cond_4
    :goto_1
    const/4 v0, 0x1

    :goto_2
    new-instance v1, Lf1/u;

    invoke-direct {v1, v2, v3, v0}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    const/4 v0, 0x0

    const/4 v2, 0x1

    iget-object v3, v1, Lf1/u;->a:Lf1/t;

    iget-wide v4, v3, Lf1/t;->c:J

    iget-object v6, v1, Lf1/u;->b:Lf1/t;

    iget-wide v7, v6, Lf1/t;->c:J

    cmp-long v4, v4, v7

    if-nez v4, :cond_6

    iget v3, v3, Lf1/t;->b:I

    iget v4, v6, Lf1/t;->b:I

    if-ne v3, v4, :cond_5

    move v3, v2

    goto :goto_5

    :cond_5
    :goto_3
    move v3, v0

    goto :goto_5

    :cond_6
    iget-boolean v4, v1, Lf1/u;->c:Z

    if-eqz v4, :cond_7

    move-object v5, v3

    goto :goto_4

    :cond_7
    move-object v5, v6

    :goto_4
    iget v5, v5, Lf1/t;->b:I

    if-eqz v5, :cond_8

    goto :goto_3

    :cond_8
    if-eqz v4, :cond_9

    move-object v3, v6

    :cond_9
    invoke-interface {p1}, Lf1/q0;->c()Lf1/r;

    move-result-object v4

    iget-object v4, v4, Lf1/r;->f:Ll3/r0;

    iget-object v4, v4, Ll3/r0;->a:Ll3/q0;

    iget-object v4, v4, Ll3/q0;->a:Ll3/g;

    iget-object v4, v4, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v4

    iget v3, v3, Lf1/t;->b:I

    if-eq v4, v3, :cond_a

    goto :goto_3

    :cond_a
    new-instance v3, Lkotlin/jvm/internal/b0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    iput-boolean v2, v3, Lkotlin/jvm/internal/b0;->w:Z

    new-instance v4, Lf0/u;

    const/4 v5, 0x1

    invoke-direct {v4, v3, v5}, Lf0/u;-><init>(Lkotlin/jvm/internal/b0;I)V

    invoke-interface {p1, v4}, Lf1/q0;->g(Lkotlin/jvm/functions/Function1;)V

    iget-boolean v3, v3, Lkotlin/jvm/internal/b0;->w:Z

    :goto_5
    if-nez v3, :cond_b

    goto/16 :goto_9

    :cond_b
    invoke-interface {p1}, Lf1/q0;->b()Lf1/r;

    move-result-object v3

    iget-object v3, v3, Lf1/r;->f:Ll3/r0;

    iget-object v3, v3, Ll3/r0;->a:Ll3/q0;

    iget-object v3, v3, Ll3/q0;->a:Ll3/g;

    iget-object v3, v3, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {p1}, Lf1/q0;->getSize()I

    move-result v4

    if-gt v4, v2, :cond_15

    invoke-interface {p1}, Lf1/q0;->i()Lf1/u;

    move-result-object v4

    if-eqz v4, :cond_15

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-nez v3, :cond_c

    move v3, v2

    goto :goto_6

    :cond_c
    move v3, v0

    :goto_6
    if-eqz v3, :cond_d

    goto/16 :goto_9

    :cond_d
    invoke-interface {p1}, Lf1/q0;->b()Lf1/r;

    move-result-object v3

    iget-object v4, v3, Lf1/r;->f:Ll3/r0;

    iget-object v4, v4, Ll3/r0;->a:Ll3/q0;

    iget-object v4, v4, Ll3/q0;->a:Ll3/g;

    iget-object v4, v4, Ll3/g;->x:Ljava/lang/String;

    iget v5, v3, Lf1/r;->c:I

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-nez v5, :cond_f

    invoke-static {v0, v4}, Lu0/n0;->m(ILjava/lang/String;)I

    move-result v4

    invoke-interface {p1}, Lf1/q0;->a()Z

    move-result p1

    if-eqz p1, :cond_e

    iget-object p1, v1, Lf1/u;->a:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, p1, v8, v2, v7}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    :goto_7
    move-object v0, p1

    goto :goto_a

    :cond_e
    iget-object p1, v1, Lf1/u;->b:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, v8, p1, v0, v2}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    goto :goto_7

    :cond_f
    if-ne v5, v6, :cond_11

    invoke-static {v6, v4}, Lu0/n0;->p(ILjava/lang/String;)I

    move-result v4

    invoke-interface {p1}, Lf1/q0;->a()Z

    move-result p1

    if-eqz p1, :cond_10

    iget-object p1, v1, Lf1/u;->a:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, p1, v8, v0, v7}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    goto :goto_7

    :cond_10
    iget-object p1, v1, Lf1/u;->b:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, v8, p1, v2, v2}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    goto :goto_7

    :cond_11
    invoke-interface {p1}, Lf1/q0;->i()Lf1/u;

    move-result-object v6

    if-eqz v6, :cond_12

    iget-boolean v6, v6, Lf1/u;->c:Z

    if-ne v6, v2, :cond_12

    move v0, v2

    :cond_12
    invoke-interface {p1}, Lf1/q0;->a()Z

    move-result v6

    xor-int/2addr v6, v0

    if-eqz v6, :cond_13

    invoke-static {v5, v4}, Lu0/n0;->p(ILjava/lang/String;)I

    move-result v4

    goto :goto_8

    :cond_13
    invoke-static {v5, v4}, Lu0/n0;->m(ILjava/lang/String;)I

    move-result v4

    :goto_8
    invoke-interface {p1}, Lf1/q0;->a()Z

    move-result p1

    if-eqz p1, :cond_14

    iget-object p1, v1, Lf1/u;->a:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, p1, v8, v0, v7}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    goto :goto_7

    :cond_14
    iget-object p1, v1, Lf1/u;->b:Lf1/t;

    invoke-static {p1, v3, v4}, Lf1/y0;->p(Lf1/t;Lf1/r;I)Lf1/t;

    move-result-object p1

    invoke-static {v1, v8, p1, v0, v2}, Lf1/u;->a(Lf1/u;Lf1/t;Lf1/t;ZI)Lf1/u;

    move-result-object p1

    goto :goto_7

    :cond_15
    :goto_9
    move-object v0, v1

    :goto_a
    return-object v0

    :pswitch_0
    sget-object v0, Lf1/w;->b:Lf1/w;

    invoke-static {p1, v0}, Lf1/y0;->i(Lf1/q0;Lf1/f;)Lf1/u;

    move-result-object p1

    return-object p1

    :pswitch_1
    sget-object v0, Lf1/w;->c:Lf1/w;

    invoke-static {p1, v0}, Lf1/y0;->i(Lf1/q0;Lf1/f;)Lf1/u;

    move-result-object p1

    return-object p1

    :pswitch_2
    new-instance v0, Lf1/u;

    invoke-interface {p1}, Lf1/q0;->k()Lf1/r;

    move-result-object v1

    invoke-interface {p1}, Lf1/q0;->k()Lf1/r;

    move-result-object v2

    iget v2, v2, Lf1/r;->c:I

    invoke-virtual {v1, v2}, Lf1/r;->a(I)Lf1/t;

    move-result-object v1

    invoke-interface {p1}, Lf1/q0;->j()Lf1/r;

    move-result-object v2

    invoke-interface {p1}, Lf1/q0;->j()Lf1/r;

    move-result-object v3

    iget v3, v3, Lf1/r;->d:I

    invoke-virtual {v2, v3}, Lf1/r;->a(I)Lf1/t;

    move-result-object v2

    invoke-interface {p1}, Lf1/q0;->e()Lf1/g;

    move-result-object p1

    sget-object v3, Lf1/g;->w:Lf1/g;

    if-ne p1, v3, :cond_16

    const/4 p1, 0x1

    goto :goto_b

    :cond_16
    const/4 p1, 0x0

    :goto_b
    invoke-direct {v0, v1, v2, p1}, Lf1/u;-><init>(Lf1/t;Lf1/t;Z)V

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
