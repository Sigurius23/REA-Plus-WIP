.class public final Lse3/a;
.super Lvp/c;
.source "SourceFile"


# instance fields
.field public w:I

.field public final synthetic x:Lse3/b;


# direct methods
.method public constructor <init>(Lse3/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lse3/a;->x:Lse3/b;

    const/4 p1, 0x0

    iput p1, p0, Lse3/a;->w:I

    return-void
.end method


# virtual methods
.method public final j(Laf3/a0;)V
    .locals 11

    iget v0, p0, Lse3/a;->w:I

    if-nez v0, :cond_7

    iget-object v0, p1, Laf3/a0;->g:Ljava/lang/String;

    invoke-virtual {p1}, Laf3/t;->e()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf3/y;

    goto :goto_0

    :cond_0
    move-object v1, v4

    :goto_0
    iget-object v2, p0, Lse3/a;->x:Lse3/b;

    iget-object v2, v2, Lse3/b;->a:La33/d;

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    if-eqz v0, :cond_6

    new-instance v3, Lcg3/b;

    new-instance v5, Lcg3/a;

    invoke-direct {v5, v2, v0}, Lcg3/a;-><init>(La33/d;Ljava/lang/CharSequence;)V

    invoke-direct {v3, v0, v5}, Lcg3/b;-><init>(Ljava/lang/CharSequence;Lcg3/a;)V

    move-object v2, p1

    :goto_1
    invoke-virtual {v3}, Lcg3/b;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-virtual {v3}, Lcg3/b;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcg3/d;

    if-ne v2, p1, :cond_1

    invoke-virtual {v3}, Lcg3/b;->hasNext()Z

    move-result v6

    if-nez v6, :cond_1

    instance-of v6, v5, Ldg3/a;

    if-nez v6, :cond_1

    goto :goto_2

    :cond_1
    invoke-interface {v5}, Lcg3/d;->getBeginIndex()I

    move-result v6

    invoke-interface {v5}, Lcg3/d;->getEndIndex()I

    move-result v7

    invoke-virtual {v0, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v8

    new-instance v9, Laf3/a0;

    invoke-direct {v9, v8}, Laf3/a0;-><init>(Ljava/lang/String;)V

    if-eqz v1, :cond_2

    sub-int/2addr v7, v6

    iget v8, v1, Laf3/y;->a:I

    new-instance v10, Laf3/y;

    invoke-direct {v10, v8, v6, v7}, Laf3/y;-><init>(III)V

    invoke-virtual {v9, v10}, Laf3/t;->b(Laf3/y;)V

    :cond_2
    instance-of v6, v5, Ldg3/a;

    if-eqz v6, :cond_4

    check-cast v5, Ldg3/a;

    iget-object v6, v9, Laf3/a0;->g:Ljava/lang/String;

    iget-object v5, v5, Ldg3/a;->w:Lcg3/c;

    sget-object v7, Lcg3/c;->x:Lcg3/c;

    if-ne v5, v7, :cond_3

    const-string v5, "mailto:"

    invoke-static {v5, v6}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    :cond_3
    new-instance v5, Laf3/p;

    invoke-direct {v5, v6, v4}, Laf3/p;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v9}, Laf3/t;->c(Laf3/t;)V

    invoke-virtual {v9}, Laf3/t;->e()Ljava/util/List;

    move-result-object v6

    invoke-virtual {v5, v6}, Laf3/t;->h(Ljava/util/List;)V

    invoke-virtual {v2, v5}, Laf3/t;->f(Laf3/t;)V

    move-object v2, v5

    goto :goto_1

    :cond_4
    invoke-virtual {v2, v9}, Laf3/t;->f(Laf3/t;)V

    move-object v2, v9

    goto :goto_1

    :cond_5
    invoke-virtual {p1}, Laf3/t;->j()V

    return-void

    :cond_6
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "input must not be null"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_7
    :goto_2
    return-void
.end method

.method public final r(Laf3/p;)V
    .locals 1

    iget v0, p0, Lse3/a;->w:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, Lse3/a;->w:I

    invoke-virtual {p0, p1}, Lvp/c;->r0(Laf3/t;)V

    iget p1, p0, Lse3/a;->w:I

    add-int/lit8 p1, p1, -0x1

    iput p1, p0, Lse3/a;->w:I

    return-void
.end method
