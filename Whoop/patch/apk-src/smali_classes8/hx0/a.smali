.class public abstract Lhx0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a/\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0000*\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "",
        "Ljava/nio/ByteBuffer;",
        "",
        "maxChunkSize",
        "Ltr2/n;",
        "logger",
        "Lud3/v0;",
        "a",
        "(Ljava/util/List;ILtr2/n;)Ljava/util/List;",
        "data-sync-service_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(Ljava/util/List;ILtr2/n;)Ljava/util/List;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "+",
            "Ljava/nio/ByteBuffer;",
            ">;I",
            "Ltr2/n;",
            ")",
            "Ljava/util/List<",
            "Lud3/v0;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    new-instance v2, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v2, v1}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 v3, 0x0

    :try_start_0
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move v4, v3

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1

    const-string v6, "application/octet-stream"

    if-eqz v5, :cond_1

    :try_start_1
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/nio/ByteBuffer;

    if-lt v4, p1, :cond_0

    invoke-virtual {v2}, Ljava/util/zip/GZIPOutputStream;->finish()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object v4

    sget-object v7, Lud3/v0;->Companion:Lud3/u0;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v8, Lud3/h0;->e:Lyb3/p;

    invoke-static {v6}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v6

    array-length v8, v4

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v6, v4, v3, v8}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object v4

    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    new-instance v4, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v4}, Ljava/io/ByteArrayOutputStream;-><init>()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    :try_start_2
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v4}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    move-object v2, v1

    move-object v1, v4

    move v4, v3

    goto :goto_1

    :catch_0
    move-exception p0

    move-object v1, v4

    goto :goto_2

    :catch_1
    move-exception p0

    goto :goto_2

    :cond_0
    :goto_1
    :try_start_3
    invoke-virtual {v5}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v6

    invoke-virtual {v2, v6}, Ljava/io/OutputStream;->write([B)V

    invoke-virtual {v5}, Ljava/nio/Buffer;->limit()I

    move-result v5

    add-int/2addr v4, v5

    goto :goto_0

    :cond_1
    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p0

    sget-object p1, Lud3/v0;->Companion:Lud3/u0;

    invoke-static {p0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    sget-object v4, Lud3/h0;->e:Lyb3/p;

    invoke-static {v6}, Landroidx/room/c1;->J(Ljava/lang/String;)Lud3/h0;

    move-result-object v4

    array-length v5, p0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v4, p0, v3, v5}, Lud3/u0;->c(Lud3/h0;[BII)Lud3/t0;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    return-object v0

    :goto_2
    const-string p1, "Caught an exception when trying to gzip raw data into request bodies"

    new-array v3, v3, [Lqr2/a$a;

    invoke-interface {p2, p1, p0, v3}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V

    invoke-virtual {v2}, Ljava/io/OutputStream;->close()V

    return-object v0
.end method
