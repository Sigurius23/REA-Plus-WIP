.class public final Lc9/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcg3/d;
.implements Lng3/l;


# instance fields
.field public final synthetic w:I

.field public x:I

.field public y:I


# direct methods
.method public synthetic constructor <init>()V
    .locals 1

    .line 1
    const/4 v0, 0x2

    iput v0, p0, Lc9/k;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(III)V
    .locals 0

    .line 2
    iput p3, p0, Lc9/k;->w:I

    iput p1, p0, Lc9/k;->x:I

    iput p2, p0, Lc9/k;->y:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(ILjg3/a;)V
    .locals 1

    const/16 v0, 0x9

    iput v0, p0, Lc9/k;->w:I

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    const-string v0, "dayOfWeek"

    invoke-static {p2, v0}, Lcom/squareup/wire/n;->V(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    iput p1, p0, Lc9/k;->x:I

    .line 11
    invoke-virtual {p2}, Ljg3/a;->k()I

    move-result p1

    iput p1, p0, Lc9/k;->y:I

    return-void
.end method

.method public constructor <init>(Lc9/k;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lc9/k;->w:I

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iget v0, p1, Lc9/k;->x:I

    .line 5
    iput v0, p0, Lc9/k;->x:I

    .line 6
    iget p1, p1, Lc9/k;->y:I

    .line 7
    iput p1, p0, Lc9/k;->y:I

    return-void
.end method


# virtual methods
.method public a()I
    .locals 2

    iget v0, p0, Lc9/k;->w:I

    packed-switch v0, :pswitch_data_0

    iget v0, p0, Lc9/k;->y:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_5

    const/4 v1, 0x5

    if-eq v0, v1, :cond_4

    const/16 v1, 0x1d

    if-eq v0, v1, :cond_3

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_2

    const/16 v1, 0x16

    if-eq v0, v1, :cond_1

    const/16 v1, 0x17

    if-eq v0, v1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0xf

    goto :goto_0

    :cond_1
    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_0

    :cond_2
    const/16 v0, 0x10

    goto :goto_0

    :cond_3
    const/16 v0, 0xc

    goto :goto_0

    :cond_4
    const/16 v0, 0xb

    goto :goto_0

    :cond_5
    const/16 v0, 0xa

    :goto_0
    return v0

    :pswitch_0
    iget v0, p0, Lc9/k;->y:I

    const/4 v1, 0x2

    if-eq v0, v1, :cond_b

    const/4 v1, 0x5

    if-eq v0, v1, :cond_a

    const/16 v1, 0x1d

    if-eq v0, v1, :cond_9

    const/16 v1, 0x2a

    if-eq v0, v1, :cond_8

    const/16 v1, 0x16

    if-eq v0, v1, :cond_7

    const/16 v1, 0x17

    if-eq v0, v1, :cond_6

    const/4 v0, 0x0

    goto :goto_1

    :cond_6
    const/16 v0, 0xf

    goto :goto_1

    :cond_7
    const/high16 v0, 0x40000000    # 2.0f

    goto :goto_1

    :cond_8
    const/16 v0, 0x10

    goto :goto_1

    :cond_9
    const/16 v0, 0xc

    goto :goto_1

    :cond_a
    const/16 v0, 0xb

    goto :goto_1

    :cond_b
    const/16 v0, 0xa

    :goto_1
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_0
    .end packed-switch
.end method

.method public e(Lng3/j;)Lng3/j;
    .locals 4

    iget v0, p0, Lc9/k;->y:I

    sget-object v1, Lng3/a;->R:Lng3/a;

    invoke-interface {p1, v1}, Lng3/k;->f(Lng3/m;)I

    move-result v1

    iget v2, p0, Lc9/k;->x:I

    const/4 v3, 0x2

    if-ge v2, v3, :cond_0

    if-ne v1, v0, :cond_0

    return-object p1

    :cond_0
    and-int/lit8 v2, v2, 0x1

    if-nez v2, :cond_2

    sub-int/2addr v1, v0

    if-ltz v1, :cond_1

    rsub-int/lit8 v0, v1, 0x7

    :goto_0
    int-to-long v0, v0

    goto :goto_1

    :cond_1
    neg-int v0, v1

    goto :goto_0

    :goto_1
    sget-object v2, Lng3/b;->y:Lng3/b;

    invoke-interface {p1, v0, v1, v2}, Lng3/j;->c(JLng3/r;)Lng3/j;

    move-result-object p1

    return-object p1

    :cond_2
    sub-int/2addr v0, v1

    if-ltz v0, :cond_3

    rsub-int/lit8 v0, v0, 0x7

    :goto_2
    int-to-long v0, v0

    goto :goto_3

    :cond_3
    neg-int v0, v0

    goto :goto_2

    :goto_3
    sget-object v2, Lng3/b;->y:Lng3/b;

    invoke-interface {p1, v0, v1, v2}, Lng3/j;->i(JLng3/r;)Lng3/j;

    move-result-object p1

    return-object p1
.end method

.method public getBeginIndex()I
    .locals 1

    iget v0, p0, Lc9/k;->x:I

    return v0
.end method

.method public getEndIndex()I
    .locals 1

    iget v0, p0, Lc9/k;->y:I

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    iget v0, p0, Lc9/k;->w:I

    packed-switch v0, :pswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Span{beginIndex="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lc9/k;->x:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", endIndex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lc9/k;->y:I

    const-string v2, "}"

    invoke-static {v0, v1, v2}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method
