.class public final Lkl/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwk/j;


# static fields
.field public static final f:Ljc/a;

.field public static final g:Laj/c;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/util/ArrayList;

.field public final c:Laj/c;

.field public final d:Ljc/a;

.field public final e:Lcom/google/crypto/tink/internal/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ljc/a;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Ljc/a;-><init>(I)V

    sput-object v0, Lkl/a;->f:Ljc/a;

    new-instance v0, Laj/c;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Laj/c;-><init>(IB)V

    sput-object v0, Lkl/a;->g:Laj/c;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/util/ArrayList;Lal/b;Lal/g;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object p1

    iput-object p1, p0, Lkl/a;->a:Landroid/content/Context;

    iput-object p2, p0, Lkl/a;->b:Ljava/util/ArrayList;

    sget-object p1, Lkl/a;->f:Ljc/a;

    iput-object p1, p0, Lkl/a;->d:Ljc/a;

    new-instance p1, Lcom/google/crypto/tink/internal/l0;

    const/16 p2, 0x18

    const/4 v0, 0x0

    invoke-direct {p1, p3, p4, v0, p2}, Lcom/google/crypto/tink/internal/l0;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZI)V

    iput-object p1, p0, Lkl/a;->e:Lcom/google/crypto/tink/internal/l0;

    sget-object p1, Lkl/a;->g:Laj/c;

    iput-object p1, p0, Lkl/a;->c:Laj/c;

    return-void
.end method

.method public static d(Luk/c;II)I
    .locals 5

    invoke-virtual {p0}, Luk/c;->a()I

    move-result v0

    div-int/2addr v0, p2

    invoke-virtual {p0}, Luk/c;->d()I

    move-result v1

    div-int/2addr v1, p1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    :goto_0
    const/4 v1, 0x1

    invoke-static {v1, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    const/4 v2, 0x2

    const-string v3, "BufferGifDecoder"

    invoke-static {v3, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v2

    if-eqz v2, :cond_1

    if-le v0, v1, :cond_1

    const-string v1, "Downsampling GIF, sampleSize: "

    const-string v2, ", target dimens: ["

    const-string v4, "x"

    invoke-static {v0, p1, v1, v2, v4}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p1

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p2, "], actual dimens: ["

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Luk/c;->d()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Luk/c;->a()I

    move-result p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_1
    return v0
.end method


# virtual methods
.method public final a(Ljava/lang/Object;IILwk/h;)Lzk/z;
    .locals 7

    move-object v2, p1

    check-cast v2, Ljava/nio/ByteBuffer;

    iget-object p1, p0, Lkl/a;->c:Laj/c;

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Laj/c;->x:Ljava/lang/Object;

    check-cast v0, Ljava/util/ArrayDeque;

    invoke-virtual {v0}, Ljava/util/ArrayDeque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luk/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_4

    if-nez v0, :cond_0

    :try_start_1
    new-instance v0, Luk/d;

    invoke-direct {v0}, Luk/d;-><init>()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_0
    move-object v5, v0

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object p2, v0

    move-object v1, p0

    goto :goto_2

    :goto_0
    :try_start_2
    invoke-virtual {v5, v2}, Luk/d;->g(Ljava/nio/ByteBuffer;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    monitor-exit p1

    move-object v1, p0

    move v3, p2

    move v4, p3

    move-object v6, p4

    :try_start_3
    invoke-virtual/range {v1 .. v6}, Lkl/a;->c(Ljava/nio/ByteBuffer;IILuk/d;Lwk/h;)Lil/b;

    move-result-object p1
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    iget-object p2, v1, Lkl/a;->c:Laj/c;

    monitor-enter p2

    :try_start_4
    invoke-virtual {v5}, Luk/d;->a()V

    iget-object p3, p2, Laj/c;->x:Ljava/lang/Object;

    check-cast p3, Ljava/util/ArrayDeque;

    invoke-virtual {p3, v5}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    monitor-exit p2

    return-object p1

    :catchall_1
    move-exception v0

    move-object p1, v0

    :try_start_5
    monitor-exit p2
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    throw p1

    :catchall_2
    move-exception v0

    move-object p1, v0

    iget-object p2, v1, Lkl/a;->c:Laj/c;

    monitor-enter p2

    :try_start_6
    invoke-virtual {v5}, Luk/d;->a()V

    iget-object p3, p2, Laj/c;->x:Ljava/lang/Object;

    check-cast p3, Ljava/util/ArrayDeque;

    invoke-virtual {p3, v5}, Ljava/util/ArrayDeque;->offer(Ljava/lang/Object;)Z
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    monitor-exit p2

    throw p1

    :catchall_3
    move-exception v0

    move-object p1, v0

    :try_start_7
    monitor-exit p2
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    throw p1

    :catchall_4
    move-exception v0

    move-object v1, p0

    :goto_1
    move-object p2, v0

    :goto_2
    :try_start_8
    monitor-exit p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    throw p2

    :catchall_5
    move-exception v0

    goto :goto_1
.end method

.method public final b(Ljava/lang/Object;Lwk/h;)Z
    .locals 1

    check-cast p1, Ljava/nio/ByteBuffer;

    sget-object v0, Lkl/h;->b:Lwk/g;

    invoke-virtual {p2, v0}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p2

    if-nez p2, :cond_0

    iget-object p2, p0, Lkl/a;->b:Ljava/util/ArrayList;

    invoke-static {p2, p1}, Ls4/b;->l(Ljava/util/ArrayList;Ljava/nio/ByteBuffer;)Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    move-result-object p1

    sget-object p2, Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;->GIF:Lcom/bumptech/glide/load/ImageHeaderParser$ImageType;

    if-ne p1, p2, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final c(Ljava/nio/ByteBuffer;IILuk/d;Lwk/h;)Lil/b;
    .locals 16

    move-object/from16 v1, p0

    const-string v2, "Decoded GIF from stream in "

    const-string v3, "BufferGifDecoder"

    invoke-static {}, Ltl/g;->b()J

    move-result-wide v4

    const/4 v6, 0x2

    :try_start_0
    invoke-virtual/range {p4 .. p4}, Luk/d;->c()Luk/c;

    move-result-object v0

    invoke-virtual {v0}, Luk/c;->b()I

    move-result v7

    const/4 v8, 0x0

    if-lez v7, :cond_4

    invoke-virtual {v0}, Luk/c;->c()I

    move-result v7

    if-eqz v7, :cond_0

    goto/16 :goto_3

    :cond_0
    sget-object v7, Lkl/h;->a:Lwk/g;

    move-object/from16 v9, p5

    invoke-virtual {v9, v7}, Lwk/h;->c(Lwk/g;)Ljava/lang/Object;

    move-result-object v7

    sget-object v9, Lwk/b;->x:Lwk/b;

    if-ne v7, v9, :cond_1

    sget-object v7, Landroid/graphics/Bitmap$Config;->RGB_565:Landroid/graphics/Bitmap$Config;

    :goto_0
    move/from16 v12, p2

    move/from16 v13, p3

    goto :goto_1

    :catchall_0
    move-exception v0

    goto/16 :goto_4

    :cond_1
    sget-object v7, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    goto :goto_0

    :goto_1
    invoke-static {v0, v12, v13}, Lkl/a;->d(Luk/c;II)I

    move-result v9

    iget-object v10, v1, Lkl/a;->d:Ljc/a;

    iget-object v11, v1, Lkl/a;->e:Lcom/google/crypto/tink/internal/l0;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v10, Luk/e;

    move-object/from16 v14, p1

    invoke-direct {v10, v11, v0, v14, v9}, Luk/e;-><init>(Lcom/google/crypto/tink/internal/l0;Luk/c;Ljava/nio/ByteBuffer;I)V

    invoke-virtual {v10, v7}, Luk/e;->d(Landroid/graphics/Bitmap$Config;)V

    invoke-virtual {v10}, Luk/e;->a()V

    invoke-virtual {v10}, Luk/e;->c()Landroid/graphics/Bitmap;

    move-result-object v15
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-nez v15, :cond_2

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    :goto_2
    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    return-object v8

    :cond_2
    :try_start_1
    sget-object v14, Lfl/a;->b:Lfl/a;

    new-instance v0, Lkl/b;

    iget-object v7, v1, Lkl/a;->a:Landroid/content/Context;

    new-instance v8, Lar/a;

    new-instance v9, Lkl/g;

    invoke-static {v7}, Lcom/bumptech/glide/b;->c(Landroid/content/Context;)Lcom/bumptech/glide/b;

    move-result-object v7

    move-object v11, v10

    move-object v10, v7

    invoke-direct/range {v9 .. v15}, Lkl/g;-><init>(Lcom/bumptech/glide/b;Luk/e;IILfl/a;Landroid/graphics/Bitmap;)V

    const/4 v7, 0x2

    invoke-direct {v8, v9, v7}, Lar/a;-><init>(Ljava/lang/Object;I)V

    invoke-direct {v0, v8}, Lkl/b;-><init>(Lar/a;)V

    new-instance v7, Lil/b;

    const/4 v8, 0x1

    invoke-direct {v7, v8, v0}, Lil/b;-><init>(ILandroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_3

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v0, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v3, v0}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_3
    return-object v7

    :cond_4
    :goto_3
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v0

    if-eqz v0, :cond_5

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_5
    return-object v8

    :goto_4
    invoke-static {v3, v6}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v6

    if-eqz v6, :cond_6

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v4, v5}, Ltl/g;->a(J)D

    move-result-wide v4

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    :cond_6
    throw v0
.end method
