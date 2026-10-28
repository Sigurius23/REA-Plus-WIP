.class public final Lab/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lxn/e;
.implements Lqa/e;


# instance fields
.field public final synthetic w:I

.field public final x:Ljava/util/List;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;)V
    .locals 1

    const/4 v0, 0x3

    iput v0, p0, Lab/g;->w:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lab/g;->x:Ljava/util/List;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;I)V
    .locals 0

    .line 1
    iput p2, p0, Lab/g;->w:I

    iput-object p1, p0, Lab/g;->x:Ljava/util/List;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lab/h0;)Ljava/util/List;
    .locals 11

    new-instance v0, Lx8/n;

    iget-object p1, p1, Lab/h0;->z:Ljava/lang/Object;

    check-cast p1, [B

    invoke-direct {v0, p1}, Lx8/n;-><init>([B)V

    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    :goto_0
    invoke-virtual {v0}, Lx8/n;->a()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v1

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v2

    iget v3, v0, Lx8/n;->b:I

    add-int/2addr v3, v2

    const/16 v2, 0x86

    if-ne v1, v2, :cond_5

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v1

    and-int/lit8 v1, v1, 0x1f

    const/4 v2, 0x0

    move v4, v2

    :goto_1
    if-ge v4, v1, :cond_5

    const/4 v5, 0x3

    sget-object v6, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v5, v6}, Lx8/n;->r(ILjava/nio/charset/Charset;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v6

    and-int/lit16 v7, v6, 0x80

    const/4 v8, 0x1

    if-eqz v7, :cond_0

    move v7, v8

    goto :goto_2

    :cond_0
    move v7, v2

    :goto_2
    if-eqz v7, :cond_1

    and-int/lit8 v6, v6, 0x3f

    const-string v9, "application/cea-708"

    goto :goto_3

    :cond_1
    const-string v9, "application/cea-608"

    move v6, v8

    :goto_3
    invoke-virtual {v0}, Lx8/n;->t()I

    move-result v10

    int-to-byte v10, v10

    invoke-virtual {v0, v8}, Lx8/n;->G(I)V

    if-eqz v7, :cond_4

    and-int/lit8 v7, v10, 0x40

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_4

    :cond_2
    move v7, v2

    :goto_4
    sget-object v10, Lx8/b;->a:[B

    if-eqz v7, :cond_3

    new-array v7, v8, [B

    aput-byte v8, v7, v2

    goto :goto_5

    :cond_3
    new-array v7, v8, [B

    aput-byte v2, v7, v2

    :goto_5
    invoke-static {v7}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    goto :goto_6

    :cond_4
    const/4 v7, 0x0

    :goto_6
    new-instance v8, Lu8/o;

    invoke-direct {v8}, Lu8/o;-><init>()V

    invoke-static {v9}, Lu8/d0;->o(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    iput-object v9, v8, Lu8/o;->m:Ljava/lang/String;

    iput-object v5, v8, Lu8/o;->d:Ljava/lang/String;

    iput v6, v8, Lu8/o;->H:I

    iput-object v7, v8, Lu8/o;->p:Ljava/util/List;

    new-instance v5, Lu8/p;

    invoke-direct {v5, v8}, Lu8/p;-><init>(Lu8/o;)V

    invoke-virtual {p1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_5
    invoke-virtual {v0, v3}, Lx8/n;->F(I)V

    goto/16 :goto_0

    :cond_6
    return-object p1
.end method

.method public b(J)I
    .locals 2

    iget v0, p0, Lab/g;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/4 p1, -0x1

    return p1

    :pswitch_1
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-gez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    const/4 p1, -0x1

    :goto_0
    return p1

    :pswitch_2
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-gez p1, :cond_1

    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    const/4 p1, -0x1

    :goto_1
    return p1

    :pswitch_3
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-gez p1, :cond_2

    const/4 p1, 0x0

    goto :goto_2

    :cond_2
    const/4 p1, -0x1

    :goto_2
    return p1

    :pswitch_4
    const/4 p1, -0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public d(J)Ljava/util/List;
    .locals 2

    iget v0, p0, Lab/g;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    return-object p1

    :pswitch_1
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_0

    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    goto :goto_0

    :cond_0
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_0
    return-object p1

    :pswitch_2
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_1

    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_1
    return-object p1

    :pswitch_3
    const-wide/16 v0, 0x0

    cmp-long p1, p1, v0

    if-ltz p1, :cond_2

    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    goto :goto_2

    :cond_2
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_2
    return-object p1

    :pswitch_4
    iget-object p1, p0, Lab/g;->x:Ljava/util/List;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public h(I)J
    .locals 2

    iget v0, p0, Lab/g;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const-wide/16 v0, 0x0

    return-wide v0

    :pswitch_1
    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Llo/a;->e(Z)V

    :goto_1
    const-wide/16 v0, 0x0

    return-wide v0

    :pswitch_2
    if-nez p1, :cond_1

    const/4 p1, 0x1

    goto :goto_2

    :cond_1
    const/4 p1, 0x0

    :goto_2
    invoke-static {p1}, Lva3/g;->d(Z)V

    goto :goto_1

    :pswitch_3
    if-nez p1, :cond_2

    const/4 p1, 0x1

    goto :goto_3

    :cond_2
    const/4 p1, 0x0

    :goto_3
    invoke-static {p1}, Llo/a;->e(Z)V

    goto :goto_1

    :pswitch_4
    const-wide/16 v0, 0x0

    return-wide v0

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public j()I
    .locals 1

    iget v0, p0, Lab/g;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    const/4 v0, 0x1

    return v0

    :pswitch_1
    const/4 v0, 0x1

    return v0

    :pswitch_2
    const/4 v0, 0x1

    return v0

    :pswitch_3
    const/4 v0, 0x1

    return v0

    :pswitch_4
    const/4 v0, 0x1

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_0
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method
