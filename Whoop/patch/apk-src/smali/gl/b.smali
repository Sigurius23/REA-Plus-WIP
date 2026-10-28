.class public final Lgl/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/k;


# static fields
.field public static final x:Lwk/g;

.field public static final y:Lwk/g;


# instance fields
.field public final w:Lal/g;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    const/16 v0, 0x5a

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    const-string v1, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality"

    invoke-static {v0, v1}, Lwk/g;->a(Ljava/lang/Object;Ljava/lang/String;)Lwk/g;

    move-result-object v0

    sput-object v0, Lgl/b;->x:Lwk/g;

    new-instance v0, Lwk/g;

    const/4 v1, 0x0

    sget-object v2, Lwk/g;->e:Ljc/a;

    const-string v3, "com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat"

    invoke-direct {v0, v3, v1, v2}, Lwk/g;-><init>(Ljava/lang/String;Ljava/lang/Object;Lwk/f;)V

    sput-object v0, Lgl/b;->y:Lwk/g;

    return-void
.end method

.method public constructor <init>(Lal/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lgl/b;->w:Lal/g;

    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/io/File;Lwk/h;)Z
    .locals 9

    check-cast p1, Lzk/z;

    iget-object v0, p0, Lgl/b;->w:Lal/g;

    const-string v1, "BitmapEncoder"

    invoke-interface {p1}, Lzk/z;->get()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/Bitmap;

    sget-object v2, Lgl/b;->y:Lwk/g;

    invoke-virtual {p3, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/graphics/Bitmap$CompressFormat;

    if-eqz v3, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result v3

    if-eqz v3, :cond_1

    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    goto :goto_0

    :cond_1
    sget-object v3, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    :goto_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    invoke-static {}, Ltl/g;->b()J

    move-result-wide v4

    sget-object v6, Lgl/b;->x:Lwk/g;

    invoke-virtual {p3, v6}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    const/4 v7, 0x0

    :try_start_0
    new-instance v8, Ljava/io/FileOutputStream;

    invoke-direct {v8, p2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    new-instance v7, Lxk/c;

    invoke-direct {v7, v8, v0}, Lxk/c;-><init>(Ljava/io/FileOutputStream;Lal/g;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    :try_start_2
    invoke-virtual {p1, v3, v6, v7}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :try_start_3
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto/16 :goto_5

    :catch_0
    :goto_1
    const/4 p2, 0x1

    goto :goto_3

    :catchall_1
    move-exception p1

    goto :goto_4

    :catch_1
    move-exception p2

    goto :goto_2

    :catchall_2
    move-exception p1

    move-object v7, v8

    goto :goto_4

    :catch_2
    move-exception p2

    move-object v7, v8

    :goto_2
    const/4 v0, 0x3

    :try_start_4
    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_2

    const-string v0, "Failed to encode Bitmap"

    invoke-static {v1, v0, p2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    :cond_2
    if-eqz v7, :cond_3

    :try_start_5
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    :catch_3
    :cond_3
    const/4 p2, 0x0

    :goto_3
    const/4 v0, 0x2

    invoke-static {v1, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v6, "Compressed with type: "

    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " of size "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1}, Ltl/l;->c(Landroid/graphics/Bitmap;)I

    move-result v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v3, " in "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v3

    invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v3, ", options format: "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v2}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object p3

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p3, ", hasAlpha: "

    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->hasAlpha()Z

    move-result p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {v1, p1}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_4
    return p2

    :goto_4
    if-eqz v7, :cond_5

    :try_start_6
    invoke-virtual {v7}, Ljava/io/OutputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    goto :goto_6

    :goto_5
    throw p1

    :catch_4
    :cond_5
    :goto_6
    throw p1
.end method

.method public final e(Lwk/h;)I
    .locals 0

    const/4 p1, 0x2

    return p1
.end method
