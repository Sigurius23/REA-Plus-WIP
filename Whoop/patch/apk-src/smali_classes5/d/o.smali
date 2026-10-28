.class public final Ld/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/a1;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    iput p2, p0, Ld/o;->a:I

    iput-object p1, p0, Ld/o;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b()Ld/b1;
    .locals 7

    iget v0, p0, Ld/o;->a:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, Ld/o;->b:Ljava/lang/Object;

    check-cast v0, Lab/h0;

    new-instance v1, Ld/a0;

    new-instance v2, Ld/v0;

    invoke-direct {v2, v0}, Ld/v0;-><init>(Lab/h0;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x1000

    new-array v4, v3, [B

    :goto_0
    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v3}, Ld/v0;->read([BII)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual {v0, v4, v5, v6}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ld/a0;-><init>([B[Ld/x0;)V

    return-object v1

    :pswitch_0
    new-instance v0, Ld/l;

    iget-object v1, p0, Ld/o;->b:Ljava/lang/Object;

    check-cast v1, Ld/c;

    invoke-virtual {v1}, Ld/c;->h()[B

    move-result-object v1

    invoke-direct {v0, v1}, Ld/x0;-><init>([B)V

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/io/InputStream;
    .locals 2

    iget v0, p0, Ld/o;->a:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ld/v0;

    iget-object v1, p0, Ld/o;->b:Ljava/lang/Object;

    check-cast v1, Lab/h0;

    invoke-direct {v0, v1}, Ld/v0;-><init>(Lab/h0;)V

    return-object v0

    :pswitch_0
    iget-object v0, p0, Ld/o;->b:Ljava/lang/Object;

    check-cast v0, Ld/c;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()Ld/b1;
    .locals 7

    iget v0, p0, Ld/o;->a:I

    packed-switch v0, :pswitch_data_0

    :try_start_0
    iget-object v0, p0, Ld/o;->b:Ljava/lang/Object;

    check-cast v0, Lab/h0;

    new-instance v1, Ld/a0;

    new-instance v2, Ld/v0;

    invoke-direct {v2, v0}, Ld/v0;-><init>(Lab/h0;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v3, 0x1000

    new-array v4, v3, [B

    :goto_0
    const/4 v5, 0x0

    invoke-virtual {v2, v4, v5, v3}, Ld/v0;->read([BII)I

    move-result v6

    if-ltz v6, :cond_0

    invoke-virtual {v0, v4, v5, v6}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Ld/a0;-><init>([B[Ld/x0;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v1

    :goto_1
    new-instance v1, La/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException converting stream to byte array: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1

    :pswitch_0
    :try_start_1
    invoke-virtual {p0}, Ld/o;->b()Ld/b1;

    move-result-object v0
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    return-object v0

    :catch_1
    move-exception v0

    new-instance v1, La/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException converting stream to byte array: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
