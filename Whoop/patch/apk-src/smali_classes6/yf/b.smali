.class public final Lyf/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lyf/m;


# instance fields
.field public final w:Lne3/j0;


# direct methods
.method public constructor <init>(Lne3/j0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf/b;->w:Lne3/j0;

    return-void
.end method


# virtual methods
.method public final c0(Lyf/k;J)J
    .locals 2

    const-string v0, "Okio operation failed: "

    const-string v1, "sink"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_0
    iget-object v1, p0, Lyf/b;->w:Lne3/j0;

    iget-object p1, p1, Lyf/k;->w:Lne3/h;

    invoke-virtual {v1, p1, p2, p3}, Lne3/j0;->h1(Lne3/h;J)J

    move-result-wide p1
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-wide p1

    :catch_0
    move-exception p1

    goto :goto_0

    :catch_1
    move-exception p1

    goto :goto_1

    :goto_0
    new-instance p2, Ljava/io/IOException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {p1, p3}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p2

    :goto_1
    new-instance p2, Laws/smithy/kotlin/runtime/io/EOFException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    invoke-direct {p2, p3, p1}, Laws/smithy/kotlin/runtime/io/EOFException;-><init>(Ljava/lang/String;Ljava/io/EOFException;)V

    throw p2
.end method

.method public final close()V
    .locals 4

    const-string v0, "Okio operation failed: "

    :try_start_0
    iget-object v1, p0, Lyf/b;->w:Lne3/j0;

    invoke-virtual {v1}, Lne3/j0;->close()V
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    new-instance v2, Laws/smithy/kotlin/runtime/io/EOFException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Laws/smithy/kotlin/runtime/io/EOFException;-><init>(Ljava/lang/String;Ljava/io/EOFException;)V

    throw v2
.end method

.method public final isOpen()Z
    .locals 1

    iget-object v0, p0, Lyf/b;->w:Lne3/j0;

    invoke-virtual {v0}, Lne3/j0;->isOpen()Z

    move-result v0

    return v0
.end method

.method public final n()[B
    .locals 4

    const-string v0, "Okio operation failed: "

    :try_start_0
    iget-object v1, p0, Lyf/b;->w:Lne3/j0;

    invoke-virtual {v1}, Lne3/j0;->n()[B

    move-result-object v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    new-instance v2, Laws/smithy/kotlin/runtime/io/EOFException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Laws/smithy/kotlin/runtime/io/EOFException;-><init>(Ljava/lang/String;Ljava/io/EOFException;)V

    throw v2
.end method

.method public final o()Z
    .locals 4

    const-string v0, "Okio operation failed: "

    :try_start_0
    iget-object v1, p0, Lyf/b;->w:Lne3/j0;

    invoke-virtual {v1}, Lne3/j0;->o()Z

    move-result v0
    :try_end_0
    .catch Ljava/io/EOFException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :catch_0
    move-exception v1

    goto :goto_0

    :catch_1
    move-exception v1

    goto :goto_1

    :goto_0
    new-instance v2, Ljava/io/IOException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v1, v3}, Lc13/a;->h(Ljava/io/IOException;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v2

    :goto_1
    new-instance v2, Laws/smithy/kotlin/runtime/io/EOFException;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v2, v0, v1}, Laws/smithy/kotlin/runtime/io/EOFException;-><init>(Ljava/lang/String;Ljava/io/EOFException;)V

    throw v2
.end method

.method public final read(Ljava/nio/ByteBuffer;)I
    .locals 1

    const-string v0, "dst"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lyf/b;->w:Lne3/j0;

    invoke-virtual {v0, p1}, Lne3/j0;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    return p1
.end method
