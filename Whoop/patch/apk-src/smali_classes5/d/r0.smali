.class public final Ld/r0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld/j;


# instance fields
.field public final a:Ld/c;

.field public b:I


# direct methods
.method public constructor <init>(Ld/c;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, Ld/r0;->b:I

    iput-object p1, p0, Ld/r0;->a:Ld/c;

    return-void
.end method


# virtual methods
.method public final a()Ljava/io/InputStream;
    .locals 4

    iget-object v0, p0, Ld/r0;->a:Ld/c;

    iget v1, v0, Ld/c;->z:I

    const/4 v2, 0x1

    if-lt v1, v2, :cond_3

    invoke-virtual {v0}, Ld/c;->read()I

    move-result v2

    iput v2, p0, Ld/r0;->b:I

    if-lez v2, :cond_2

    const/4 v3, 0x2

    if-lt v1, v3, :cond_1

    const/4 v1, 0x7

    if-gt v2, v1, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "pad bits cannot be greater than 7 or less than 0"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "zero length data with non-zero pad bits"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    :goto_0
    return-object v0

    :cond_3
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "content octets cannot be empty"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final b()Ld/b1;
    .locals 1

    iget-object v0, p0, Ld/r0;->a:Ld/c;

    invoke-virtual {v0}, Ld/c;->h()[B

    move-result-object v0

    invoke-static {v0}, Ld/g;->l([B)Ld/g;

    move-result-object v0

    return-object v0
.end method

.method public final d()Ld/b1;
    .locals 4

    :try_start_0
    invoke-virtual {p0}, Ld/r0;->b()Ld/b1;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v0

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

    iget v0, p0, Ld/r0;->b:I

    return v0
.end method
