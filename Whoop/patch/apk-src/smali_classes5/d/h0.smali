.class public final Ld/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/q;
.implements Ld/f;


# instance fields
.field public final synthetic a:I

.field public final b:Lab/h0;


# direct methods
.method public synthetic constructor <init>(Lab/h0;I)V
    .locals 0

    iput p2, p0, Ld/h0;->a:I

    iput-object p1, p0, Ld/h0;->b:Lab/h0;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ld/b1;
    .locals 5

    iget v0, p0, Ld/h0;->a:I

    const/4 v1, -0x1

    const/4 v2, 0x1

    iget-object v3, p0, Ld/h0;->b:Lab/h0;

    packed-switch v0, :pswitch_data_0

    invoke-virtual {v3}, Lab/h0;->c()Ld/s;

    move-result-object v0

    sget-object v3, Ld/w0;->a:Ld/x;

    iget v3, v0, Ld/s;->a:I

    if-ge v3, v2, :cond_0

    sget-object v0, Ld/w0;->b:Ld/z;

    goto :goto_0

    :cond_0
    new-instance v2, Ld/z;

    invoke-direct {v2, v0}, Ld/z;-><init>(Ld/s;)V

    iput v1, v2, Ld/z;->d:I

    move-object v0, v2

    :goto_0
    return-object v0

    :pswitch_0
    :try_start_0
    new-instance v0, Ld/u0;

    new-instance v4, Ld/x;

    invoke-virtual {v3}, Lab/h0;->c()Ld/s;

    move-result-object v3

    invoke-direct {v4, v3, v2}, Ld/x;-><init>(Ld/s;I)V

    iput v1, v4, Ld/x;->c:I

    invoke-direct {v0, v4}, Ld/u0;-><init>(Ld/x;)V
    :try_end_0
    .catch Ljava/lang/IllegalArgumentException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/h;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/h;-><init>(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    throw v1

    :pswitch_1
    invoke-virtual {v3}, Lab/h0;->c()Ld/s;

    move-result-object v0

    sget-object v3, Ld/w0;->a:Ld/x;

    iget v3, v0, Ld/s;->a:I

    if-ge v3, v2, :cond_1

    sget-object v0, Ld/w0;->a:Ld/x;

    goto :goto_1

    :cond_1
    new-instance v3, Ld/x;

    invoke-direct {v3, v0, v2}, Ld/x;-><init>(Ld/s;I)V

    iput v1, v3, Ld/x;->c:I

    move-object v0, v3

    :goto_1
    return-object v0

    :pswitch_2
    new-instance v0, Ld/k0;

    invoke-virtual {v3}, Lab/h0;->c()Ld/s;

    move-result-object v1

    invoke-direct {v0, v1}, Ld/a;-><init>(Ld/s;)V

    return-object v0

    :pswitch_3
    new-instance v0, Ld/e0;

    invoke-virtual {v3}, Lab/h0;->c()Ld/s;

    move-result-object v1

    invoke-direct {v0, v1}, Ld/h1;-><init>(Ld/s;)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ld/b1;
    .locals 3

    iget v0, p0, Ld/h0;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    invoke-virtual {p0}, Ld/h0;->b()Ld/b1;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

    new-instance v1, La/v;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1

    :pswitch_0
    const-string v0, "unable to get DER object"

    :try_start_1
    invoke-virtual {p0}, Ld/h0;->b()Ld/b1;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v1

    new-instance v2, La/v;

    invoke-direct {v2, v1, v0}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v2

    :catch_2
    move-exception v1

    new-instance v2, La/v;

    invoke-direct {v2, v1, v0}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v2

    :pswitch_1
    :try_start_2
    invoke-virtual {p0}, Ld/h0;->b()Ld/b1;

    move-result-object v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_3

    return-object v0

    :catch_3
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_2
    :try_start_3
    iget-object v0, p0, Ld/h0;->b:Lab/h0;

    new-instance v1, Ld/k0;

    invoke-virtual {v0}, Lab/h0;->c()Ld/s;

    move-result-object v0

    invoke-direct {v1, v0}, Ld/a;-><init>(Ld/s;)V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_4

    return-object v1

    :catch_4
    move-exception v0

    new-instance v1, La/v;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1

    :pswitch_3
    :try_start_4
    iget-object v0, p0, Ld/h0;->b:Lab/h0;

    new-instance v1, Ld/e0;

    invoke-virtual {v0}, Lab/h0;->c()Ld/s;

    move-result-object v0

    invoke-direct {v1, v0}, Ld/h1;-><init>(Ld/s;)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_5

    return-object v1

    :catch_5
    move-exception v0

    new-instance v1, Ljava/lang/IllegalStateException;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
