.class public final Ld/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/j;


# instance fields
.field public final a:Lab/h0;

.field public b:Ld/t0;


# direct methods
.method public constructor <init>(Lab/h0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld/w;->a:Lab/h0;

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 2

    new-instance v0, Ld/t0;

    iget-object v1, p0, Ld/w;->a:Lab/h0;

    invoke-direct {v0, v1}, Ld/t0;-><init>(Lab/h0;)V

    iput-object v0, p0, Ld/w;->b:Ld/t0;

    return-object v0
.end method

.method public final b()Ld/b1;
    .locals 6

    new-instance v0, Ld/t0;

    iget-object v1, p0, Ld/w;->a:Lab/h0;

    invoke-direct {v0, v1}, Ld/t0;-><init>(Lab/h0;)V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x1000

    new-array v3, v2, [B

    :goto_0
    const/4 v4, 0x0

    invoke-virtual {v0, v3, v4, v2}, Ld/t0;->read([BII)I

    move-result v5

    if-ltz v5, :cond_0

    invoke-virtual {v1, v3, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v1

    iget v0, v0, Ld/t0;->y:I

    new-instance v2, Ld/t;

    invoke-direct {v2, v1, v0}, Ld/t;-><init>([BI)V

    return-object v2
.end method

.method public final d()Ld/b1;
    .locals 6

    :try_start_0
    iget-object v0, p0, Ld/w;->a:Lab/h0;

    new-instance v1, Ld/t0;

    invoke-direct {v1, v0}, Ld/t0;-><init>(Lab/h0;)V

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v2, 0x1000

    new-array v3, v2, [B

    :goto_0
    const/4 v4, 0x0

    invoke-virtual {v1, v3, v4, v2}, Ld/t0;->read([BII)I

    move-result v5

    if-ltz v5, :cond_0

    invoke-virtual {v0, v3, v4, v5}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v0

    iget v1, v1, Ld/t0;->y:I

    new-instance v2, Ld/t;

    invoke-direct {v2, v0, v1}, Ld/t;-><init>([BI)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v2

    :goto_1
    new-instance v1, La/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "IOException converting stream to byte array: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0, v2}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1
.end method

.method public final e()I
    .locals 1

    iget-object v0, p0, Ld/w;->b:Ld/t0;

    iget v0, v0, Ld/t0;->y:I

    return v0
.end method
