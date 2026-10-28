.class public final Lm40/w;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lqy/d;

.field public final b:Lla/b;

.field public final c:Lm40/k;

.field public final d:Lj43/g;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Landroid/content/Context;I)V
    .locals 4

    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    sget-object v0, Lqy/e;->a:Lqy/d;

    goto :goto_0

    :cond_0
    sget-object v0, Lqy/e;->b:Lqy/d;

    :goto_0
    new-instance v1, Lla/b;

    const/4 v2, 0x4

    const/4 v3, 0x0

    invoke-direct {v1, v2, v3}, Lla/b;-><init>(IB)V

    new-instance v2, Lm40/k;

    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    and-int/lit8 p2, p2, 0x10

    if-eqz p2, :cond_1

    new-instance p2, Lj43/g;

    invoke-direct {p2, p1}, Lj43/g;-><init>(Landroid/content/Context;)V

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    const-string v3, "context"

    invoke-static {p1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lm40/w;->a:Lqy/d;

    iput-object v1, p0, Lm40/w;->b:Lla/b;

    iput-object v2, p0, Lm40/w;->c:Lm40/k;

    iput-object p2, p0, Lm40/w;->d:Lj43/g;

    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object p1, p0, Lm40/w;->e:Ljava/util/concurrent/ConcurrentHashMap;

    return-void
.end method

.method public static final a(Lm40/w;Ljava/lang/String;)Ll83/n;
    .locals 7

    iget-object v0, p0, Lm40/w;->d:Lj43/g;

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    const-string v2, "key"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v2

    :try_start_0
    iget-object v0, v0, Lj43/g;->b:Ll83/p;

    invoke-virtual {v0}, Ll83/p;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Llu/c;

    if-eqz v0, :cond_0

    invoke-virtual {v0, v2}, Llu/c;->k(Ljava/lang/String;)Laj/a;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_2

    :catch_0
    move-exception v0

    move-object v2, v1

    goto :goto_1

    :cond_0
    move-object v0, v1

    :goto_0
    if-nez v0, :cond_1

    goto :goto_3

    :cond_1
    :try_start_1
    iget-object v2, v0, Laj/a;->x:Ljava/lang/Object;

    check-cast v2, [Ljava/io/InputStream;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    const-string v3, "getInputStream(...)"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Laj/a;->k()Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/io/BufferedInputStream;

    const/16 v5, 0x2000

    invoke-direct {v4, v2, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;I)V

    invoke-static {v4}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v2

    new-instance v4, Lm40/i;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v4, v3, v2}, Lm40/i;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    invoke-virtual {v0}, Laj/a;->close()V

    goto :goto_4

    :catchall_1
    move-exception p0

    move-object v1, v0

    goto :goto_2

    :catch_1
    move-exception v2

    move-object v6, v2

    move-object v2, v0

    move-object v0, v6

    :goto_1
    :try_start_2
    const-string v3, "stripe_image_disk_cache"

    const-string v4, "error getting bitmap from cache"

    invoke-static {v3, v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Laj/a;->close()V

    goto :goto_3

    :catchall_2
    move-exception p0

    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Laj/a;->close()V

    :cond_2
    throw p0

    :cond_3
    :goto_3
    move-object v4, v1

    :goto_4
    if-eqz v4, :cond_4

    const-string v0, "Image loaded from disk cache"

    invoke-virtual {p0, v0}, Lm40/w;->f(Ljava/lang/String;)V

    goto :goto_5

    :cond_4
    const-string v0, "Image not found on disk cache"

    invoke-virtual {p0, v0}, Lm40/w;->f(Ljava/lang/String;)V

    :goto_5
    if-eqz v4, :cond_6

    iget-object p0, p0, Lm40/w;->b:Lla/b;

    if-eqz p0, :cond_5

    invoke-virtual {p0, p1, v4}, Lla/b;->E(Ljava/lang/String;Lm40/i;)V

    :cond_5
    iget-object p0, v4, Lm40/i;->b:Landroid/graphics/Bitmap;

    new-instance v1, Ll83/n;

    invoke-direct {v1, p0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    :cond_6
    return-object v1
.end method

.method public static final b(Lm40/w;Ljava/lang/String;)Ll83/n;
    .locals 4

    iget-object v0, p0, Lm40/w;->b:Lla/b;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string v2, "key"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    monitor-enter v0

    :try_start_0
    iget-object v2, v0, Lla/b;->x:Ljava/lang/Object;

    check-cast v2, Lm40/d;

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v3

    invoke-static {v3}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/util/LruCache;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lm40/i;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    goto :goto_0

    :catchall_0
    move-exception p0

    monitor-exit v0

    throw p0

    :cond_0
    move-object v2, v1

    :goto_0
    if-eqz v2, :cond_1

    const-string v0, "Image loaded from memory cache"

    invoke-virtual {p0, v0}, Lm40/w;->f(Ljava/lang/String;)V

    goto :goto_1

    :cond_1
    const-string v0, "Image not found on memory cache"

    invoke-virtual {p0, v0}, Lm40/w;->f(Ljava/lang/String;)V

    :goto_1
    if-eqz v2, :cond_3

    iget-object p0, p0, Lm40/w;->d:Lj43/g;

    if-eqz p0, :cond_2

    invoke-virtual {p0, p1, v2}, Lj43/g;->e(Ljava/lang/String;Lm40/i;)V

    :cond_2
    iget-object p0, v2, Lm40/i;->b:Landroid/graphics/Bitmap;

    new-instance p1, Ll83/n;

    invoke-direct {p1, p0}, Ll83/n;-><init>(Ljava/lang/Object;)V

    return-object p1

    :cond_3
    return-object v1
.end method

.method public static final c(Lm40/w;Ljava/lang/String;IILs83/c;)Ljava/lang/Object;
    .locals 5

    const-string v0, "Image "

    instance-of v1, p4, Lm40/t;

    if-eqz v1, :cond_0

    move-object v1, p4

    check-cast v1, Lm40/t;

    iget v2, v1, Lm40/t;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lm40/t;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lm40/t;

    invoke-direct {v1, p0, p4}, Lm40/t;-><init>(Lm40/w;Ls83/c;)V

    :goto_0
    iget-object p4, v1, Lm40/t;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lm40/t;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lm40/t;->x:Ljava/lang/String;

    iget-object p0, v1, Lm40/t;->w:Lm40/w;

    :try_start_0
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " loading from internet ("

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " x "

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p0, p4}, Lm40/w;->f(Ljava/lang/String;)V

    iget-object p4, p0, Lm40/w;->c:Lm40/k;

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object p0, v1, Lm40/t;->w:Lm40/w;

    iput-object p1, v1, Lm40/t;->x:Ljava/lang/String;

    iput v4, v1, Lm40/t;->E:I

    invoke-virtual {p4, v0, p2, p3, v1}, Lm40/k;->a(Ljava/net/URL;IILs83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v2, :cond_3

    return-object v2

    :cond_3
    :goto_1
    check-cast p4, Lm40/i;

    if-eqz p4, :cond_6

    iget-object p2, p0, Lm40/w;->d:Lj43/g;

    if-eqz p2, :cond_4

    invoke-virtual {p2, p1, p4}, Lj43/g;->e(Ljava/lang/String;Lm40/i;)V

    :cond_4
    iget-object p2, p0, Lm40/w;->b:Lla/b;

    if-eqz p2, :cond_5

    invoke-virtual {p2, p1, p4}, Lla/b;->E(Ljava/lang/String;Lm40/i;)V

    :cond_5
    iget-object p1, p4, Lm40/i;->b:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :cond_6
    const/4 p1, 0x0

    goto :goto_3

    :goto_2
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_3
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_7

    iget-object p0, p0, Lm40/w;->a:Lqy/d;

    const-string p3, "StripeImageLoader: Could not load image from network"

    invoke-virtual {p0, p3, p2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_7
    return-object p1
.end method

.method public static final d(Lm40/w;Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 5

    const-string v0, "Image "

    instance-of v1, p2, Lm40/u;

    if-eqz v1, :cond_0

    move-object v1, p2

    check-cast v1, Lm40/u;

    iget v2, v1, Lm40/u;->E:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lm40/u;->E:I

    goto :goto_0

    :cond_0
    new-instance v1, Lm40/u;

    invoke-direct {v1, p0, p2}, Lm40/u;-><init>(Lm40/w;Ls83/c;)V

    :goto_0
    iget-object p2, v1, Lm40/u;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lm40/u;->E:I

    const/4 v4, 0x1

    if-eqz v3, :cond_2

    if-ne v3, v4, :cond_1

    iget-object p1, v1, Lm40/u;->x:Ljava/lang/String;

    iget-object p0, v1, Lm40/u;->w:Lm40/w;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p1

    goto :goto_3

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " loading from internet"

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p2}, Lm40/w;->f(Ljava/lang/String;)V

    iget-object p2, p0, Lm40/w;->c:Lm40/k;

    new-instance v0, Ljava/net/URL;

    invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    iput-object p0, v1, Lm40/u;->w:Lm40/w;

    iput-object p1, v1, Lm40/u;->x:Ljava/lang/String;

    iput v4, v1, Lm40/u;->E:I

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance p2, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p2}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    invoke-static {p2, v0, v1}, Lm40/k;->b(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v2, :cond_3

    goto :goto_1

    :cond_3
    check-cast p2, Lm40/i;

    :goto_1
    if-ne p2, v2, :cond_4

    return-object v2

    :cond_4
    :goto_2
    check-cast p2, Lm40/i;

    if-eqz p2, :cond_7

    iget-object v0, p0, Lm40/w;->d:Lj43/g;

    if-eqz v0, :cond_5

    invoke-virtual {v0, p1, p2}, Lj43/g;->e(Ljava/lang/String;Lm40/i;)V

    :cond_5
    iget-object v0, p0, Lm40/w;->b:Lla/b;

    if-eqz v0, :cond_6

    invoke-virtual {v0, p1, p2}, Lla/b;->E(Ljava/lang/String;Lm40/i;)V

    :cond_6
    iget-object p1, p2, Lm40/i;->b:Landroid/graphics/Bitmap;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_4

    :cond_7
    const/4 p1, 0x0

    goto :goto_4

    :goto_3
    invoke-static {p1}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p1

    :goto_4
    invoke-static {p1}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p2

    if-eqz p2, :cond_8

    iget-object p0, p0, Lm40/w;->a:Lqy/d;

    const-string v0, "StripeImageLoader: Could not load image from network"

    invoke-virtual {p0, v0, p2}, Lqy/d;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_8
    return-object p1
.end method

.method public static final e(Lm40/w;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ls83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p3, Lm40/v;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lm40/v;

    iget v1, v0, Lm40/v;->G:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm40/v;->G:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm40/v;

    invoke-direct {v0, p0, p3}, Lm40/v;-><init>(Lm40/w;Ls83/c;)V

    :goto_0
    iget-object p3, v0, Lm40/v;->E:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm40/v;->G:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lm40/v;->y:Ljava/lang/Object;

    check-cast p0, Lmc3/a;

    iget-object p1, v0, Lm40/v;->x:Ljava/lang/String;

    iget-object p2, v0, Lm40/v;->w:Lm40/w;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_4

    :catchall_0
    move-exception p1

    goto :goto_5

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    iget-object p0, v0, Lm40/v;->z:Lmc3/a;

    iget-object p1, v0, Lm40/v;->y:Ljava/lang/Object;

    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    iget-object p1, v0, Lm40/v;->x:Ljava/lang/String;

    iget-object v2, v0, Lm40/v;->w:Lm40/w;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v6, v2

    move-object v2, p0

    move-object p0, v6

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p3, p0, Lm40/w;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p3, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_5

    invoke-static {}, Lmc3/d;->a()Lmc3/c;

    move-result-object v2

    invoke-virtual {p3, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_4

    goto :goto_1

    :cond_4
    move-object v2, p3

    :cond_5
    :goto_1
    check-cast v2, Lmc3/a;

    iput-object p0, v0, Lm40/v;->w:Lm40/w;

    iput-object p1, v0, Lm40/v;->x:Ljava/lang/String;

    iput-object p2, v0, Lm40/v;->y:Ljava/lang/Object;

    iput-object v2, v0, Lm40/v;->z:Lmc3/a;

    iput v4, v0, Lm40/v;->G:I

    invoke-interface {v2, v0}, Lmc3/a;->b(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_2
    :try_start_1
    iput-object p0, v0, Lm40/v;->w:Lm40/w;

    iput-object p1, v0, Lm40/v;->x:Ljava/lang/String;

    iput-object v2, v0, Lm40/v;->y:Ljava/lang/Object;

    iput-object v5, v0, Lm40/v;->z:Lmc3/a;

    iput v3, v0, Lm40/v;->G:I

    invoke-interface {p2, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p3, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    move-object p2, p0

    move-object p0, v2

    :goto_4
    invoke-interface {p0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    iget-object p0, p2, Lm40/w;->e:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3

    :catchall_1
    move-exception p1

    move-object p0, v2

    :goto_5
    invoke-interface {p0, v5}, Lmc3/a;->i(Ljava/lang/Object;)V

    throw p1
.end method


# virtual methods
.method public final f(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "StripeImageLoader: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lm40/w;->a:Lqy/d;

    invoke-virtual {v0, p1}, Lqy/d;->a(Ljava/lang/String;)V

    return-void
.end method

.method public final g(Ljava/lang/String;IILs83/c;)Ljava/lang/Object;
    .locals 10

    instance-of v0, p4, Lm40/p;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lm40/p;

    iget v1, v0, Lm40/p;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm40/p;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm40/p;

    invoke-direct {v0, p0, p4}, Lm40/p;-><init>(Lm40/w;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lm40/p;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm40/p;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p4, Lbc3/q0;->a:Lkc3/e;

    sget-object p4, Lkc3/d;->w:Lkc3/d;

    new-instance v4, Lm40/r;

    const/4 v9, 0x0

    move-object v5, p0

    move-object v6, p1

    move v7, p2

    move v8, p3

    invoke-direct/range {v4 .. v9}, Lm40/r;-><init>(Lm40/w;Ljava/lang/String;IILq83/d;)V

    iput v3, v0, Lm40/p;->y:I

    invoke-static {p4, v4, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p4, Ll83/n;

    iget-object p1, p4, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method

.method public final h(Ljava/lang/String;Ls83/c;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lm40/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lm40/s;

    iget v1, v0, Lm40/s;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm40/s;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm40/s;

    invoke-direct {v0, p0, p2}, Lm40/s;-><init>(Lm40/w;Ls83/c;)V

    :goto_0
    iget-object p2, v0, Lm40/s;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm40/s;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lbc3/q0;->a:Lkc3/e;

    sget-object p2, Lkc3/d;->w:Lkc3/d;

    new-instance v2, Lh20/i0;

    const/4 v4, 0x0

    const/16 v5, 0x19

    invoke-direct {v2, p0, p1, v4, v5}, Lh20/i0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput v3, v0, Lm40/s;->y:I

    invoke-static {p2, v2, v0}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Ll83/n;

    iget-object p1, p2, Ll83/n;->w:Ljava/lang/Object;

    return-object p1
.end method
