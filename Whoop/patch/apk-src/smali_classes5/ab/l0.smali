.class public final Lab/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;

.field public c:I

.field public d:I

.field public e:I

.field public f:Ljava/lang/Object;


# direct methods
.method public constructor <init>(IIIB)V
    .locals 0

    iput p3, p0, Lab/l0;->a:I

    packed-switch p3, :pswitch_data_0

    const/high16 p3, -0x80000000

    const/4 p4, 0x0

    .line 14
    invoke-direct {p0, p3, p1, p2, p4}, Lab/l0;-><init>(IIII)V

    return-void

    :pswitch_0
    const/high16 p3, -0x80000000

    const/4 p4, 0x1

    .line 15
    invoke-direct {p0, p3, p1, p2, p4}, Lab/l0;-><init>(IIII)V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(IIII)V
    .locals 3

    iput p4, p0, Lab/l0;->a:I

    packed-switch p4, :pswitch_data_0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    const-string p4, ""

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_0

    const-string v1, "/"

    .line 18
    invoke-static {p1, v1}, Lr80/c;->k(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p4

    .line 19
    :goto_0
    iput-object p1, p0, Lab/l0;->b:Ljava/lang/Object;

    .line 20
    iput p2, p0, Lab/l0;->c:I

    .line 21
    iput p3, p0, Lab/l0;->d:I

    .line 22
    iput v0, p0, Lab/l0;->e:I

    .line 23
    iput-object p4, p0, Lab/l0;->f:Ljava/lang/Object;

    return-void

    .line 24
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    const-string p4, ""

    const/high16 v0, -0x80000000

    if-eq p1, v0, :cond_1

    new-instance v1, Ljava/lang/StringBuilder;

    const/16 v2, 0xc

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(I)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, "/"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, p4

    :goto_1
    iput-object p1, p0, Lab/l0;->b:Ljava/lang/Object;

    .line 26
    iput p2, p0, Lab/l0;->c:I

    .line 27
    iput p3, p0, Lab/l0;->d:I

    .line 28
    iput v0, p0, Lab/l0;->e:I

    .line 29
    iput-object p4, p0, Lab/l0;->f:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    const/4 v0, 0x2

    iput v0, p0, Lab/l0;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lbf3/d;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    .line 3
    iput-object v0, p0, Lab/l0;->f:Ljava/lang/Object;

    const/4 v0, 0x0

    .line 4
    iput v0, p0, Lab/l0;->e:I

    .line 5
    iput-object p1, p0, Lab/l0;->b:Ljava/lang/Object;

    .line 6
    iput v0, p0, Lab/l0;->c:I

    .line 7
    iput v0, p0, Lab/l0;->d:I

    .line 8
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 9
    invoke-virtual {p0, v0, v0}, Lab/l0;->a(II)V

    .line 10
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf3/d;

    .line 11
    iput-object p1, p0, Lab/l0;->f:Ljava/lang/Object;

    .line 12
    iget-object p1, p1, Lbf3/d;->a:Ljava/lang/CharSequence;

    .line 13
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Lab/l0;->e:I

    :cond_0
    return-void
.end method


# virtual methods
.method public a(II)V
    .locals 3

    iget-object v0, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    if-ltz p1, :cond_1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v1

    if-ge p1, v1, :cond_1

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf3/d;

    if-ltz p2, :cond_0

    iget-object v0, p1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-gt p2, v0, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Index "

    const-string v2, " out of range, line length: "

    invoke-static {p2, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p2

    iget-object p1, p1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance p2, Ljava/lang/IllegalArgumentException;

    const-string v1, "Line index "

    const-string v2, " out of range, number of lines: "

    invoke-static {p1, v1, v2}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public b(C)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v1

    if-nez v1, :cond_0

    const/4 p1, -0x1

    return p1

    :cond_0
    if-ne v1, p1, :cond_1

    return v0

    :cond_1
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0
.end method

.method public c()V
    .locals 3

    iget v0, p0, Lab/l0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lab/l0;->e:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_0

    iget v0, p0, Lab/l0;->c:I

    goto :goto_0

    :cond_0
    iget v1, p0, Lab/l0;->d:I

    add-int/2addr v0, v1

    :goto_0
    iput v0, p0, Lab/l0;->e:I

    iget-object v1, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    const/16 v2, 0xb

    invoke-static {v2, v1}, Lq63/c;->b(ILjava/lang/String;)I

    move-result v2

    invoke-static {v2, v0, v1}, Lr80/c;->j(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lab/l0;->f:Ljava/lang/Object;

    return-void

    :pswitch_0
    iget v0, p0, Lab/l0;->e:I

    const/high16 v1, -0x80000000

    if-ne v0, v1, :cond_1

    iget v0, p0, Lab/l0;->c:I

    goto :goto_1

    :cond_1
    iget v1, p0, Lab/l0;->d:I

    add-int/2addr v0, v1

    :goto_1
    iput v0, p0, Lab/l0;->e:I

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lab/l0;->e:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lab/l0;->f:Ljava/lang/Object;

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public d(Lc9/k;Lc9/k;)Laa3/u0;
    .locals 7

    iget-object v0, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget v1, p1, Lc9/k;->x:I

    iget p1, p1, Lc9/k;->y:I

    iget v2, p2, Lc9/k;->x:I

    iget p2, p2, Lc9/k;->y:I

    if-ne v1, v2, :cond_1

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbf3/d;

    iget-object v1, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1, p1, p2}, Ljava/lang/CharSequence;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object p2

    iget-object v0, v0, Lbf3/d;->b:Laf3/y;

    if-eqz v0, :cond_0

    iget v1, v0, Laf3/y;->a:I

    iget v0, v0, Laf3/y;->b:I

    add-int/2addr v0, p1

    invoke-interface {p2}, Ljava/lang/CharSequence;->length()I

    move-result p1

    new-instance v2, Laf3/y;

    invoke-direct {v2, v1, v0, p1}, Laf3/y;-><init>(III)V

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    new-instance p1, Lbf3/d;

    invoke-direct {p1, p2, v2}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    new-instance p2, Laa3/u0;

    const/4 v0, 0x2

    invoke-direct {p2, v0}, Laa3/u0;-><init>(I)V

    iget-object v0, p2, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object p2

    :cond_1
    new-instance v3, Laa3/u0;

    const/4 v4, 0x2

    invoke-direct {v3, v4}, Laa3/u0;-><init>(I)V

    iget-object v4, v3, Laa3/u0;->a:Ljava/util/ArrayList;

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lbf3/d;

    iget-object v6, v5, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v6}, Ljava/lang/CharSequence;->length()I

    move-result v6

    invoke-virtual {v5, p1, v6}, Lbf3/d;->a(II)Lbf3/d;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    if-ge v1, v2, :cond_2

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf3/d;

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf3/d;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, p2}, Lbf3/d;->a(II)Lbf3/d;

    move-result-object p1

    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v3
.end method

.method public e()Z
    .locals 3

    iget v0, p0, Lab/l0;->d:I

    iget v1, p0, Lab/l0;->e:I

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    return v2

    :cond_0
    iget v0, p0, Lab/l0;->c:I

    iget-object v1, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    sub-int/2addr v1, v2

    if-ge v0, v1, :cond_1

    return v2

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public f(Lze3/a;)I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v1

    iget-object v2, p1, Lze3/a;->a:Ljava/util/BitSet;

    invoke-virtual {v2, v1}, Ljava/util/BitSet;->get(I)Z

    move-result v1

    if-eqz v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public g(C)I
    .locals 2

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v1

    if-ne v1, p1, :cond_0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    :cond_0
    return v0
.end method

.method public h()V
    .locals 2

    iget v0, p0, Lab/l0;->a:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lab/l0;->e:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "generateNewId() must be called before retrieving ids."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget v0, p0, Lab/l0;->e:I

    const/high16 v1, -0x80000000

    if-eq v0, v1, :cond_1

    return-void

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "generateNewId() must be called before retrieving ids."

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public i()V
    .locals 3

    iget-object v0, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v0, Ljava/util/List;

    iget v1, p0, Lab/l0;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lab/l0;->d:I

    iget v2, p0, Lab/l0;->e:I

    if-le v1, v2, :cond_1

    iget v1, p0, Lab/l0;->c:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lab/l0;->c:I

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_0

    iget v1, p0, Lab/l0;->c:I

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbf3/d;

    iput-object v0, p0, Lab/l0;->f:Ljava/lang/Object;

    iget-object v0, v0, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Lab/l0;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbf3/d;

    const-string v1, ""

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lbf3/d;-><init>(Ljava/lang/CharSequence;Laf3/y;)V

    iput-object v0, p0, Lab/l0;->f:Ljava/lang/Object;

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    iput v0, p0, Lab/l0;->e:I

    :goto_0
    const/4 v0, 0x0

    iput v0, p0, Lab/l0;->d:I

    :cond_1
    return-void
.end method

.method public j(C)Z
    .locals 1

    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v0

    if-ne v0, p1, :cond_0

    invoke-virtual {p0}, Lab/l0;->i()V

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public k(Ljava/lang/String;)Z
    .locals 4

    iget v0, p0, Lab/l0;->d:I

    iget v1, p0, Lab/l0;->e:I

    const/4 v2, 0x0

    if-ge v0, v1, :cond_2

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v0

    iget v0, p0, Lab/l0;->e:I

    if-gt v1, v0, :cond_2

    move v0, v2

    :goto_0
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_1

    iget-object v1, p0, Lab/l0;->f:Ljava/lang/Object;

    check-cast v1, Lbf3/d;

    iget-object v1, v1, Lbf3/d;->a:Ljava/lang/CharSequence;

    iget v3, p0, Lab/l0;->d:I

    add-int/2addr v3, v0

    invoke-interface {v1, v3}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v1

    invoke-virtual {p1, v0}, Ljava/lang/String;->charAt(I)C

    move-result v3

    if-eq v1, v3, :cond_0

    goto :goto_1

    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    iget v0, p0, Lab/l0;->d:I

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    add-int/2addr p1, v0

    iput p1, p0, Lab/l0;->d:I

    const/4 p1, 0x1

    return p1

    :cond_2
    :goto_1
    return v2
.end method

.method public l()C
    .locals 2

    iget v0, p0, Lab/l0;->d:I

    iget v1, p0, Lab/l0;->e:I

    if-ge v0, v1, :cond_0

    iget-object v1, p0, Lab/l0;->f:Ljava/lang/Object;

    check-cast v1, Lbf3/d;

    iget-object v1, v1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {v1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    return v0

    :cond_0
    iget v0, p0, Lab/l0;->c:I

    iget-object v1, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast v1, Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    if-ge v0, v1, :cond_1

    const/16 v0, 0xa

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public m()Lc9/k;
    .locals 4

    new-instance v0, Lc9/k;

    iget v1, p0, Lab/l0;->c:I

    iget v2, p0, Lab/l0;->d:I

    const/16 v3, 0xc

    invoke-direct {v0, v1, v2, v3}, Lc9/k;-><init>(III)V

    return-object v0
.end method

.method public n(Lc9/k;)V
    .locals 1

    iget v0, p1, Lc9/k;->x:I

    iget p1, p1, Lc9/k;->y:I

    invoke-virtual {p0, v0, p1}, Lab/l0;->a(II)V

    iput v0, p0, Lab/l0;->c:I

    iput p1, p0, Lab/l0;->d:I

    iget-object p1, p0, Lab/l0;->b:Ljava/lang/Object;

    check-cast p1, Ljava/util/List;

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lbf3/d;

    iput-object p1, p0, Lab/l0;->f:Ljava/lang/Object;

    iget-object p1, p1, Lbf3/d;->a:Ljava/lang/CharSequence;

    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result p1

    iput p1, p0, Lab/l0;->e:I

    return-void
.end method

.method public o()I
    .locals 3

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {p0}, Lab/l0;->l()C

    move-result v1

    const/16 v2, 0x20

    if-eq v1, v2, :cond_0

    packed-switch v1, :pswitch_data_0

    return v0

    :cond_0
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lab/l0;->i()V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method
