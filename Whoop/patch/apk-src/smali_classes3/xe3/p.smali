.class public final Lxe3/p;
.super Lcf3/a;
.source "SourceFile"


# instance fields
.field public final a:Laf3/w;

.field public final b:Lxe3/l;


# direct methods
.method public constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Laf3/w;

    invoke-direct {v0}, Laf3/t;-><init>()V

    iput-object v0, p0, Lxe3/p;->a:Laf3/w;

    new-instance v0, Lxe3/l;

    invoke-direct {v0}, Lxe3/l;-><init>()V

    iput-object v0, p0, Lxe3/p;->b:Lxe3/l;

    return-void
.end method


# virtual methods
.method public final a(Lbf3/d;)V
    .locals 9

    iget-object v0, p0, Lxe3/p;->b:Lxe3/l;

    iget-object v1, v0, Lxe3/l;->b:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    iget v2, v0, Lxe3/l;->a:I

    const/4 v3, 0x6

    if-ne v2, v3, :cond_0

    goto/16 :goto_5

    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    new-instance p1, Lab/l0;

    invoke-direct {p1, v2}, Lab/l0;-><init>(Ljava/util/List;)V

    :cond_1
    :goto_0
    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-eqz v2, :cond_19

    iget v2, v0, Lxe3/l;->a:I

    invoke-static {v2}, Le4/p;->e(I)I

    move-result v2

    const/4 v4, 0x2

    const/16 v5, 0xa

    if-eqz v2, :cond_16

    const/4 v6, 0x3

    const/4 v7, 0x1

    if-eq v2, v7, :cond_10

    const/4 v8, 0x4

    if-eq v2, v4, :cond_b

    if-eq v2, v6, :cond_6

    if-ne v2, v8, :cond_5

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v2

    iget-char v4, v0, Lxe3/l;->g:C

    invoke-static {p1, v4}, Ls2/h;->o(Lab/l0;C)Z

    move-result v4

    if-nez v4, :cond_2

    goto/16 :goto_4

    :cond_2
    iget-object v4, v0, Lxe3/l;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v6

    invoke-virtual {p1, v2, v6}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_3

    iget-object v2, v0, Lxe3/l;->h:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_3
    invoke-virtual {p1}, Lab/l0;->i()V

    invoke-virtual {p1}, Lab/l0;->o()I

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-eqz v2, :cond_4

    goto/16 :goto_4

    :cond_4
    iput-boolean v7, v0, Lxe3/l;->i:Z

    invoke-virtual {v0}, Lxe3/l;->a()V

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    iput v7, v0, Lxe3/l;->a:I

    goto :goto_0

    :cond_5
    new-instance p1, Ljava/lang/IllegalStateException;

    iget v0, v0, Lxe3/l;->a:I

    packed-switch v0, :pswitch_data_0

    const-string v0, "null"

    goto :goto_1

    :pswitch_0
    const-string v0, "PARAGRAPH"

    goto :goto_1

    :pswitch_1
    const-string v0, "TITLE"

    goto :goto_1

    :pswitch_2
    const-string v0, "START_TITLE"

    goto :goto_1

    :pswitch_3
    const-string v0, "DESTINATION"

    goto :goto_1

    :pswitch_4
    const-string v0, "LABEL"

    goto :goto_1

    :pswitch_5
    const-string v0, "START_DEFINITION"

    :goto_1
    const-string v1, "Unknown parsing state: "

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    invoke-virtual {p1}, Lab/l0;->o()I

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_7

    iput v7, v0, Lxe3/l;->a:I

    goto/16 :goto_0

    :cond_7
    const/4 v2, 0x0

    iput-char v2, v0, Lxe3/l;->g:C

    invoke-virtual {p1}, Lab/l0;->l()C

    move-result v2

    const/16 v4, 0x22

    if-eq v2, v4, :cond_9

    const/16 v4, 0x27

    if-eq v2, v4, :cond_9

    const/16 v4, 0x28

    if-eq v2, v4, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0x29

    iput-char v2, v0, Lxe3/l;->g:C

    goto :goto_2

    :cond_9
    iput-char v2, v0, Lxe3/l;->g:C

    :goto_2
    iget-char v2, v0, Lxe3/l;->g:C

    if-eqz v2, :cond_a

    const/4 v2, 0x5

    iput v2, v0, Lxe3/l;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v2, v0, Lxe3/l;->h:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->i()V

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, Lxe3/l;->h:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_a
    invoke-virtual {v0}, Lxe3/l;->a()V

    iput v7, v0, Lxe3/l;->a:I

    goto/16 :goto_0

    :cond_b
    invoke-virtual {p1}, Lab/l0;->o()I

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v2

    invoke-static {p1}, Ls2/h;->l(Lab/l0;)Z

    move-result v4

    if-nez v4, :cond_c

    goto/16 :goto_4

    :cond_c
    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v4

    invoke-virtual {p1, v2, v4}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v2

    const-string v4, "<"

    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_d

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v4

    sub-int/2addr v4, v7

    invoke-virtual {v2, v7, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v2

    :cond_d
    iput-object v2, v0, Lxe3/l;->f:Ljava/lang/String;

    invoke-virtual {p1}, Lab/l0;->o()I

    move-result v2

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v4

    if-nez v4, :cond_e

    iput-boolean v7, v0, Lxe3/l;->i:Z

    invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V

    goto :goto_3

    :cond_e
    if-nez v2, :cond_f

    goto/16 :goto_4

    :cond_f
    :goto_3
    iput v8, v0, Lxe3/l;->a:I

    goto/16 :goto_0

    :cond_10
    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v2

    invoke-static {p1}, Ls2/h;->n(Lab/l0;)Z

    move-result v4

    if-nez v4, :cond_11

    goto :goto_4

    :cond_11
    iget-object v4, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->m()Lc9/k;

    move-result-object v7

    invoke-virtual {p1, v2, v7}, Lab/l0;->d(Lc9/k;Lc9/k;)Laa3/u0;

    move-result-object v2

    invoke-virtual {v2}, Laa3/u0;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_12

    iget-object v2, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_12
    const/16 v2, 0x5d

    invoke-virtual {p1, v2}, Lab/l0;->j(C)Z

    move-result v2

    if-eqz v2, :cond_17

    const/16 v2, 0x3a

    invoke-virtual {p1, v2}, Lab/l0;->j(C)Z

    move-result v2

    if-nez v2, :cond_13

    goto :goto_4

    :cond_13
    iget-object v2, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    move-result v2

    const/16 v4, 0x3e7

    if-le v2, v4, :cond_14

    goto :goto_4

    :cond_14
    iget-object v2, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lze3/b;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_15

    goto :goto_4

    :cond_15
    iput v6, v0, Lxe3/l;->a:I

    invoke-virtual {p1}, Lab/l0;->o()I

    goto/16 :goto_0

    :cond_16
    invoke-virtual {p1}, Lab/l0;->o()I

    const/16 v2, 0x5b

    invoke-virtual {p1, v2}, Lab/l0;->j(C)Z

    move-result v2

    if-nez v2, :cond_18

    :cond_17
    :goto_4
    iput v3, v0, Lxe3/l;->a:I

    return-void

    :cond_18
    iput v4, v0, Lxe3/l;->a:I

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v2, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lab/l0;->e()Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, v0, Lxe3/l;->e:Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    goto/16 :goto_0

    :cond_19
    :goto_5
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Laf3/y;)V
    .locals 1

    iget-object v0, p0, Lxe3/p;->b:Lxe3/l;

    iget-object v0, v0, Lxe3/l;->d:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public final e()V
    .locals 3

    iget-object v0, p0, Lxe3/p;->b:Lxe3/l;

    iget-object v1, v0, Lxe3/l;->b:Ljava/util/ArrayList;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v1

    iget-object v2, p0, Lxe3/p;->a:Laf3/w;

    if-eqz v1, :cond_0

    invoke-virtual {v2}, Laf3/t;->j()V

    return-void

    :cond_0
    iget-object v0, v0, Lxe3/l;->d:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Laf3/t;->h(Ljava/util/List;)V

    return-void
.end method

.method public final f()Laf3/a;
    .locals 1

    iget-object v0, p0, Lxe3/p;->a:Laf3/w;

    return-object v0
.end method

.method public final h(Lxe3/k;)V
    .locals 3

    iget-object v0, p0, Lxe3/p;->b:Lxe3/l;

    iget-object v0, v0, Lxe3/l;->b:Ljava/util/ArrayList;

    new-instance v1, Laa3/u0;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Laa3/u0;-><init>(I)V

    iget-object v2, v1, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lxe3/p;->a:Laf3/w;

    invoke-virtual {p1, v1, v0}, Lxe3/k;->e(Laa3/u0;Laf3/t;)V

    :cond_0
    return-void
.end method

.method public final i(Lxe3/g;)Lha/h;
    .locals 1

    iget-boolean v0, p1, Lxe3/g;->i:Z

    if-nez v0, :cond_0

    iget p1, p1, Lxe3/g;->c:I

    invoke-static {p1}, Lha/h;->a(I)Lha/h;

    move-result-object p1

    return-object p1

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method
