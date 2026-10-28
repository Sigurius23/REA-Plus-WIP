.class public abstract Lio/seon/androidsdk/service/e1;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public final f:I

.field public final g:Ljava/lang/Object;


# direct methods
.method public constructor <init>(II)V
    .locals 3

    const/4 v0, 0x0

    iput v0, p0, Lio/seon/androidsdk/service/e1;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput v0, p0, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, p0, Lio/seon/androidsdk/service/e1;->c:I

    iput v0, p0, Lio/seon/androidsdk/service/e1;->d:I

    iput p2, p0, Lio/seon/androidsdk/service/e1;->f:I

    iput p1, p0, Lio/seon/androidsdk/service/e1;->e:I

    const/4 v1, 0x2

    new-array v1, v1, [I

    const/4 v2, 0x1

    aput p2, v1, v2

    aput p1, v1, v0

    sget-object p1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    invoke-static {p1, v1}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, [[F

    iput-object p1, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ljava/nio/ByteBuffer;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lio/seon/androidsdk/service/e1;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    .line 3
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result v0

    .line 4
    iput v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    .line 5
    invoke-virtual {p1}, Ljava/nio/Buffer;->limit()I

    move-result p1

    .line 6
    iput p1, p0, Lio/seon/androidsdk/service/e1;->f:I

    return-void
.end method


# virtual methods
.method public a([F)V
    .locals 3

    array-length v0, p1

    iget v1, p0, Lio/seon/androidsdk/service/e1;->f:I

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, [[F

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([FI)[F

    move-result-object p1

    aput-object p1, v0, v2

    iget p1, p0, Lio/seon/androidsdk/service/e1;->c:I

    add-int/lit8 p1, p1, 0x1

    iget v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    rem-int/2addr p1, v0

    iput p1, p0, Lio/seon/androidsdk/service/e1;->c:I

    iget p1, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-ge p1, v0, :cond_0

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lio/seon/androidsdk/service/e1;->d:I

    return-void

    :cond_0
    iget p1, p0, Lio/seon/androidsdk/service/e1;->b:I

    add-int/lit8 p1, p1, 0x1

    rem-int/2addr p1, v0

    iput p1, p0, Lio/seon/androidsdk/service/e1;->b:I

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Element size does not match buffer array size"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public b(I)V
    .locals 3

    iget v0, p0, Lio/seon/androidsdk/service/e1;->c:I

    add-int v1, v0, p1

    if-ltz p1, :cond_0

    iget v2, p0, Lio/seon/androidsdk/service/e1;->e:I

    if-gt v1, v2, :cond_0

    iput v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    return-void

    :cond_0
    iget v1, p0, Lio/seon/androidsdk/service/e1;->e:I

    sub-int/2addr v1, v0

    invoke-static {p1, v1}, Ls30/b;->d(II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public c(I)V
    .locals 3

    iget v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    iget v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    const/4 v2, 0x0

    if-lt p1, v1, :cond_2

    if-lt p1, v0, :cond_1

    if-ne p1, v0, :cond_0

    iput p1, p0, Lio/seon/androidsdk/service/e1;->c:I

    return-void

    :cond_0
    sub-int/2addr p1, v1

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ls30/b;->d(II)V

    throw v2

    :cond_1
    iput p1, p0, Lio/seon/androidsdk/service/e1;->c:I

    return-void

    :cond_2
    sub-int/2addr p1, v1

    sub-int/2addr v0, v1

    invoke-static {p1, v0}, Ls30/b;->d(II)V

    throw v2
.end method

.method public d(I)V
    .locals 3

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget v0, p0, Lio/seon/androidsdk/service/e1;->b:I

    add-int v1, v0, p1

    if-ltz p1, :cond_1

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    if-gt v1, v2, :cond_1

    iput v1, p0, Lio/seon/androidsdk/service/e1;->b:I

    return-void

    :cond_1
    iget v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v1, v0

    invoke-static {p1, v1}, Ls30/b;->e(II)V

    const/4 p1, 0x0

    throw p1
.end method

.method public e(I)V
    .locals 2

    if-ltz p1, :cond_2

    iget v0, p0, Lio/seon/androidsdk/service/e1;->b:I

    if-gt p1, v0, :cond_1

    iput p1, p0, Lio/seon/androidsdk/service/e1;->b:I

    iget v0, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-le v0, p1, :cond_0

    iput p1, p0, Lio/seon/androidsdk/service/e1;->d:I

    :cond_0
    return-void

    :cond_1
    const-string v0, "newReadPosition shouldn\'t be ahead of the read position: "

    const-string v1, " > "

    invoke-static {p1, v0, v1}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    iget v0, p0, Lio/seon/androidsdk/service/e1;->b:I

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    const-string v0, "newReadPosition shouldn\'t be negative: "

    invoke-static {p1, v0}, Lb9/y;->h(ILjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public f()V
    .locals 4

    iget v0, p0, Lio/seon/androidsdk/service/e1;->f:I

    add-int/lit8 v0, v0, -0x8

    iget v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    if-lt v0, v1, :cond_0

    iput v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    return-void

    :cond_0
    const/4 v2, 0x0

    if-ltz v0, :cond_3

    iget v3, p0, Lio/seon/androidsdk/service/e1;->d:I

    if-lt v0, v3, :cond_2

    iget v3, p0, Lio/seon/androidsdk/service/e1;->b:I

    if-ne v3, v1, :cond_1

    iput v0, p0, Lio/seon/androidsdk/service/e1;->e:I

    iput v0, p0, Lio/seon/androidsdk/service/e1;->b:I

    iput v0, p0, Lio/seon/androidsdk/service/e1;->c:I

    return-void

    :cond_1
    invoke-static {p0}, Ls30/b;->h(Lio/seon/androidsdk/service/e1;)V

    throw v2

    :cond_2
    invoke-static {p0}, Ls30/b;->i(Lio/seon/androidsdk/service/e1;)V

    throw v2

    :cond_3
    invoke-static {p0}, Ls30/b;->g(Lio/seon/androidsdk/service/e1;)V

    throw v2
.end method

.method public final toString()Ljava/lang/String;
    .locals 8

    iget v0, p0, Lio/seon/androidsdk/service/e1;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Buffer("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lio/seon/androidsdk/service/e1;->c:I

    iget v2, p0, Lio/seon/androidsdk/service/e1;->b:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " used, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/seon/androidsdk/service/e1;->e:I

    iget v2, p0, Lio/seon/androidsdk/service/e1;->c:I

    sub-int/2addr v1, v2

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " free, "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lio/seon/androidsdk/service/e1;->d:I

    iget v2, p0, Lio/seon/androidsdk/service/e1;->e:I

    iget v3, p0, Lio/seon/androidsdk/service/e1;->f:I

    sub-int v2, v3, v2

    add-int/2addr v2, v1

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, " reserved of "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-static {v0, v3, v1}, Ldc/b;->r(Ljava/lang/StringBuilder;IC)Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_0
    iget-object v0, p0, Lio/seon/androidsdk/service/e1;->g:Ljava/lang/Object;

    check-cast v0, [[F

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    array-length v4, v0

    if-ge v3, v4, :cond_1

    aget-object v4, v0, v3

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    move v6, v2

    :goto_1
    array-length v7, v4

    if-ge v6, v7, :cond_0

    aget v7, v4, v6

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v6, v6, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
