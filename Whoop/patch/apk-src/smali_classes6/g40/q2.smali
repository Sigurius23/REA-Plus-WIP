.class public final Lg40/q2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg40/s3;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/String;

.field public final synthetic c:Lg40/l3;


# direct methods
.method public synthetic constructor <init>(Lg40/l3;Ljava/lang/String;I)V
    .locals 0

    iput p3, p0, Lg40/q2;->a:I

    iput-object p1, p0, Lg40/q2;->c:Lg40/l3;

    iput-object p2, p0, Lg40/q2;->b:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Z
    .locals 1

    iget v0, p0, Lg40/q2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/q2;->b:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    :pswitch_0
    iget-object v0, p0, Lg40/q2;->b:Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(ZZ)Z
    .locals 1

    iget v0, p0, Lg40/q2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lg40/q2;->f()Lg40/h1;

    move-result-object p1

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1

    :pswitch_0
    invoke-virtual {p0}, Lg40/q2;->f()Lg40/h1;

    move-result-object v0

    if-eqz v0, :cond_2

    if-eqz p1, :cond_1

    if-eqz p2, :cond_2

    :cond_1
    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Z
    .locals 2

    iget v0, p0, Lg40/q2;->a:I

    packed-switch v0, :pswitch_data_0

    const/4 v0, 0x0

    return v0

    :pswitch_0
    iget-object v0, p0, Lg40/q2;->b:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    iget-object v1, p0, Lg40/q2;->c:Lg40/l3;

    check-cast v1, Lg40/r2;

    iget-object v1, v1, Lg40/r2;->E:Lg40/p2;

    iget v1, v1, Lg40/p2;->b:I

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f()Lg40/h1;
    .locals 8

    iget v0, p0, Lg40/q2;->a:I

    packed-switch v0, :pswitch_data_0

    invoke-virtual {p0}, Lg40/q2;->isValid()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lg40/f1;

    const v2, 0x7f140fce

    invoke-direct {v0, v2, v1}, Lg40/f1;-><init>(ILjava/util/List;)V

    move-object v1, v0

    :goto_0
    return-object v1

    :pswitch_0
    iget-object v0, p0, Lg40/q2;->c:Lg40/l3;

    check-cast v0, Lg40/r2;

    iget-object v1, v0, Lg40/r2;->E:Lg40/p2;

    iget-object v0, v0, Lg40/r2;->y:Ljava/lang/String;

    iget-object v2, p0, Lg40/q2;->b:Ljava/lang/String;

    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    const v4, 0x7f140fa9

    const-string v5, "US"

    const/4 v6, 0x0

    if-nez v3, :cond_2

    invoke-virtual {p0}, Lg40/q2;->isValid()Z

    move-result v3

    if-nez v3, :cond_2

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, v1, Lg40/p2;->a:I

    if-ge v0, v1, :cond_1

    new-instance v0, Lg40/f1;

    const v1, 0x7f140fa8

    invoke-direct {v0, v1, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    :goto_1
    move-object v6, v0

    goto :goto_2

    :cond_1
    new-instance v0, Lg40/f1;

    invoke-direct {v0, v4, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    goto :goto_1

    :cond_2
    invoke-static {v2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    const v7, 0x7f140fa1

    if-nez v3, :cond_4

    invoke-virtual {p0}, Lg40/q2;->isValid()Z

    move-result v3

    if-nez v3, :cond_4

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v0

    iget v1, v1, Lg40/p2;->a:I

    if-ge v0, v1, :cond_3

    new-instance v0, Lg40/f1;

    const v1, 0x7f140fa0

    invoke-direct {v0, v1, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    goto :goto_1

    :cond_3
    new-instance v0, Lg40/f1;

    invoke-direct {v0, v7, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    goto :goto_1

    :cond_4
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p0}, Lg40/q2;->isValid()Z

    move-result v1

    if-nez v1, :cond_6

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Lg40/f1;

    invoke-direct {v0, v4, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    goto :goto_1

    :cond_5
    new-instance v0, Lg40/f1;

    invoke-direct {v0, v7, v6}, Lg40/f1;-><init>(ILjava/util/List;)V

    goto :goto_1

    :cond_6
    :goto_2
    return-object v6

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final isValid()Z
    .locals 7

    iget v0, p0, Lg40/q2;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Lg40/q2;->c:Lg40/l3;

    check-cast v0, Lg40/d3;

    iget-boolean v0, v0, Lg40/d3;->E:Z

    iget-object v1, p0, Lg40/q2;->b:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {v1}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    :goto_0
    const/4 v0, 0x1

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    return v0

    :pswitch_0
    iget-object v0, p0, Lg40/q2;->c:Lg40/l3;

    check-cast v0, Lg40/r2;

    iget-object v1, v0, Lg40/r2;->E:Lg40/p2;

    iget-boolean v0, v0, Lg40/r2;->z:Z

    const/4 v2, 0x0

    const/4 v3, 0x1

    iget-object v4, p0, Lg40/q2;->b:Ljava/lang/String;

    if-eqz v0, :cond_2

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v3

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    instance-of v5, v1, Lg40/n2;

    if-eqz v5, :cond_3

    if-nez v0, :cond_4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_3

    :cond_3
    if-nez v0, :cond_4

    iget v0, v1, Lg40/p2;->a:I

    iget v5, v1, Lg40/p2;->b:I

    invoke-virtual {v4}, Ljava/lang/String;->length()I

    move-result v6

    if-gt v0, v6, :cond_5

    if-gt v6, v5, :cond_5

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_5

    iget-object v0, v1, Lg40/p2;->c:Lyb3/p;

    invoke-virtual {v0, v4}, Lyb3/p;->e(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_4
    :goto_3
    move v2, v3

    :cond_5
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
