.class public final Lab/y;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Z

.field public d:Z

.field public e:Ljava/lang/Object;

.field public f:I


# direct methods
.method public constructor <init>(II)V
    .locals 1

    iput p2, p0, Lab/y;->a:I

    packed-switch p2, :pswitch_data_0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p1, p0, Lab/y;->b:I

    const/16 p1, 0x83

    .line 3
    new-array p1, p1, [B

    iput-object p1, p0, Lab/y;->e:Ljava/lang/Object;

    const/4 p2, 0x2

    const/4 v0, 0x1

    .line 4
    aput-byte v0, p1, p2

    return-void

    .line 5
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput p1, p0, Lab/y;->b:I

    const/16 p1, 0x83

    .line 7
    new-array p1, p1, [B

    iput-object p1, p0, Lab/y;->e:Ljava/lang/Object;

    const/4 p2, 0x2

    const/4 v0, 0x1

    .line 8
    aput-byte v0, p1, p2

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public constructor <init>(Lb9/c1;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lab/y;->a:I

    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    iput-object p1, p0, Lab/y;->e:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public a([BII)V
    .locals 4

    iget v0, p0, Lab/y;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lab/y;->c:Z

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    sub-int/2addr p3, p2

    iget-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    check-cast v0, [B

    array-length v1, v0

    iget v2, p0, Lab/y;->f:I

    add-int v3, v2, p3

    if-ge v1, v3, :cond_1

    add-int/2addr v2, p3

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    :cond_1
    iget-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    check-cast v0, [B

    iget v1, p0, Lab/y;->f:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lab/y;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lab/y;->f:I

    :goto_0
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lab/y;->c:Z

    if-nez v0, :cond_2

    goto :goto_1

    :cond_2
    sub-int/2addr p3, p2

    iget-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    check-cast v0, [B

    array-length v1, v0

    iget v2, p0, Lab/y;->f:I

    add-int v3, v2, p3

    if-ge v1, v3, :cond_3

    add-int/2addr v2, p3

    mul-int/lit8 v2, v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    iput-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    :cond_3
    iget-object v0, p0, Lab/y;->e:Ljava/lang/Object;

    check-cast v0, [B

    iget v1, p0, Lab/y;->f:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iget p1, p0, Lab/y;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lab/y;->f:I

    :goto_1
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public b(I)Z
    .locals 2

    iget v0, p0, Lab/y;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lab/y;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget v0, p0, Lab/y;->f:I

    sub-int/2addr v0, p1

    iput v0, p0, Lab/y;->f:I

    iput-boolean v1, p0, Lab/y;->c:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lab/y;->d:Z

    :goto_0
    return v1

    :pswitch_0
    iget-boolean v0, p0, Lab/y;->c:Z

    const/4 v1, 0x0

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    iget v0, p0, Lab/y;->f:I

    sub-int/2addr v0, p1

    iput v0, p0, Lab/y;->f:I

    iput-boolean v1, p0, Lab/y;->c:Z

    const/4 v1, 0x1

    iput-boolean v1, p0, Lab/y;->d:Z

    :goto_1
    return v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public c(I)V
    .locals 2

    iget-boolean v0, p0, Lab/y;->c:Z

    if-lez p1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    or-int/2addr v0, v1

    iput-boolean v0, p0, Lab/y;->c:Z

    iget v0, p0, Lab/y;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lab/y;->b:I

    return-void
.end method

.method public d()V
    .locals 1

    iget v0, p0, Lab/y;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/y;->c:Z

    iput-boolean v0, p0, Lab/y;->d:Z

    return-void

    :pswitch_0
    const/4 v0, 0x0

    iput-boolean v0, p0, Lab/y;->c:Z

    iput-boolean v0, p0, Lab/y;->d:Z

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public e(I)V
    .locals 3

    iget v0, p0, Lab/y;->a:I

    packed-switch v0, :pswitch_data_0

    iget-boolean v0, p0, Lab/y;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Llo/a;->i(Z)V

    iget v0, p0, Lab/y;->b:I

    const/4 v2, 0x0

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    iput-boolean v1, p0, Lab/y;->c:Z

    if-eqz v1, :cond_1

    const/4 p1, 0x3

    iput p1, p0, Lab/y;->f:I

    iput-boolean v2, p0, Lab/y;->d:Z

    :cond_1
    return-void

    :pswitch_0
    iget-boolean v0, p0, Lab/y;->c:Z

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Lva3/g;->i(Z)V

    iget v0, p0, Lab/y;->b:I

    const/4 v2, 0x0

    if-ne p1, v0, :cond_2

    goto :goto_1

    :cond_2
    move v1, v2

    :goto_1
    iput-boolean v1, p0, Lab/y;->c:Z

    if-eqz v1, :cond_3

    const/4 p1, 0x3

    iput p1, p0, Lab/y;->f:I

    iput-boolean v2, p0, Lab/y;->d:Z

    :cond_3
    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
