.class public final Lm40/k;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Ls83/c;)Ljava/lang/Object;
    .locals 2

    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    :try_start_0
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    const-string p2, "openConnection(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p2, 0x2710

    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    invoke-virtual {p1, p2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    invoke-virtual {p1}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;

    move-result-object p1

    const-string p2, "getInputStream(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ls;

    invoke-direct {p2, p0, p1}, Ls;-><init>(Landroid/graphics/BitmapFactory$Options;Ljava/io/InputStream;)V

    invoke-virtual {v0, p2}, Lbc3/m;->u(Lkotlin/jvm/functions/Function1;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    :try_start_1
    invoke-static {p1, p2, p0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;

    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    if-eqz v1, :cond_0

    new-instance p2, Lm40/i;

    iget-object p0, p0, Landroid/graphics/BitmapFactory$Options;->outMimeType:Ljava/lang/String;

    const-string p1, "outMimeType"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p2, p0, v1}, Lm40/i;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto :goto_0

    :catchall_1
    move-exception p0

    :try_start_3
    throw p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    :catchall_2
    move-exception p2

    :try_start_4
    invoke-static {p1, p0}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    :goto_0
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p2

    :cond_0
    :goto_1
    invoke-static {p2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object p0

    if-nez p0, :cond_1

    check-cast p2, Lm40/i;

    invoke-virtual {v0, p2}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    invoke-static {p0}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object p0

    invoke-virtual {v0, p0}, Lbc3/m;->resumeWith(Ljava/lang/Object;)V

    :goto_2
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/net/URL;IILs83/c;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p4, Lm40/j;

    if-eqz v0, :cond_0

    move-object v0, p4

    check-cast v0, Lm40/j;

    iget v1, v0, Lm40/j;->H:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lm40/j;->H:I

    goto :goto_0

    :cond_0
    new-instance v0, Lm40/j;

    invoke-direct {v0, p0, p4}, Lm40/j;-><init>(Lm40/k;Ls83/c;)V

    :goto_0
    iget-object p4, v0, Lm40/j;->F:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lm40/j;->H:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p3, v0, Lm40/j;->E:I

    iget p2, v0, Lm40/j;->z:I

    iget-object p1, v0, Lm40/j;->y:Landroid/graphics/BitmapFactory$Options;

    iget-object v2, v0, Lm40/j;->x:Ljava/net/URL;

    iget-object v5, v0, Lm40/j;->w:Lm40/k;

    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p4}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance p4, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {p4}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    iput-boolean v4, p4, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iput-object p0, v0, Lm40/j;->w:Lm40/k;

    iput-object p1, v0, Lm40/j;->x:Ljava/net/URL;

    iput-object p4, v0, Lm40/j;->y:Landroid/graphics/BitmapFactory$Options;

    iput p2, v0, Lm40/j;->z:I

    iput p3, v0, Lm40/j;->E:I

    iput v4, v0, Lm40/j;->H:I

    invoke-static {p4, p1, v0}, Lm40/k;->b(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Ls83/c;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_4

    goto :goto_3

    :cond_4
    move-object v5, p0

    move-object v2, p1

    move-object p1, p4

    :goto_1
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    iget p4, p1, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    iget v5, p1, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    if-gt p4, p3, :cond_5

    if-le v5, p2, :cond_6

    :cond_5
    div-int/2addr p4, v3

    div-int/2addr v5, v3

    :goto_2
    div-int v6, p4, v4

    if-lt v6, p3, :cond_6

    div-int v6, v5, v4

    if-lt v6, p2, :cond_6

    mul-int/lit8 v4, v4, 0x2

    goto :goto_2

    :cond_6
    iput v4, p1, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I

    const/4 p2, 0x0

    iput-boolean p2, p1, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    const/4 p2, 0x0

    iput-object p2, v0, Lm40/j;->w:Lm40/k;

    iput-object p2, v0, Lm40/j;->x:Ljava/net/URL;

    iput-object p2, v0, Lm40/j;->y:Landroid/graphics/BitmapFactory$Options;

    iput v3, v0, Lm40/j;->H:I

    invoke-static {p1, v2, v0}, Lm40/k;->b(Landroid/graphics/BitmapFactory$Options;Ljava/net/URL;Ls83/c;)Ljava/lang/Object;

    move-result-object p4

    if-ne p4, v1, :cond_7

    :goto_3
    return-object v1

    :cond_7
    :goto_4
    check-cast p4, Lm40/i;

    return-object p4
.end method
