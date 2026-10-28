.class public final Ltw2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ltw2/c;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J \u0010\u000c\u001a\u0004\u0018\u00010\u000b*\u00020\u00082\u0008\u0010\n\u001a\u0004\u0018\u00010\tH\u0082@\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001b\u0010\u0010\u001a\u00020\u000b*\u00020\u00082\u0006\u0010\u000f\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u0008*\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u001c\u0010\u0019\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u001b\u0010\u001b\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u000eH\u0002\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\"\u0010 \u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0015\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u001eH\u0096@\u00a2\u0006\u0004\u0008 \u0010!R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008 \u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Ltw2/d;",
        "Ltw2/c;",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "Landroid/graphics/Bitmap;",
        "",
        "maxBytes",
        "",
        "j",
        "(Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;",
        "",
        "quality",
        "o",
        "(Landroid/graphics/Bitmap;I)[B",
        "l",
        "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;",
        "Landroid/net/Uri;",
        "uri",
        "maxEdge",
        "m",
        "(Landroid/net/Uri;I)I",
        "i",
        "(Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "n",
        "(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;",
        "",
        "Ltw2/b;",
        "bounds",
        "a",
        "(Ljava/lang/String;Ltw2/b;Lq83/d;)Ljava/lang/Object;",
        "Landroid/content/Context;",
        "b",
        "Ltr2/n;",
        "whoop-action_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Ltr2/n;


# direct methods
.method public constructor <init>(Landroid/content/Context;Ltr2/n;)V
    .locals 1

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "logger"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Ltw2/d;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Ltw2/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "UploadMediaPreparer"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Ltw2/d;-><init>(Landroid/content/Context;Ltr2/n;)V

    return-void
.end method

.method public static synthetic b(Lq83/j;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/g0;Ltw2/d;Ltw2/a;)[B
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltw2/d;->k(Lq83/j;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/g0;Ltw2/d;Ltw2/a;)[B

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Ltw2/d;Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltw2/d;->i(Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic d(Ltw2/d;Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Ltw2/d;->j(Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Ltw2/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Ltw2/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(Ltw2/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Ltw2/d;->b:Ltr2/n;

    return-object p0
.end method

.method public static final synthetic g(Ltw2/d;Landroid/net/Uri;I)I
    .locals 0

    invoke-direct {p0, p1, p2}, Ltw2/d;->m(Landroid/net/Uri;I)I

    move-result p0

    return p0
.end method

.method public static final synthetic h(Ltw2/d;Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0, p1, p2}, Ltw2/d;->n(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method private final i(Landroid/graphics/Bitmap;Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const/4 v1, 0x0

    :try_start_0
    iget-object v0, p0, Ltw2/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_0

    :try_start_1
    new-instance v0, Lk6/g;

    invoke-direct {v0, p2}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lk6/g;->l()I

    move-result v2

    new-instance v3, Ljava/lang/Integer;

    invoke-direct {v3, v2}, Ljava/lang/Integer;-><init>(I)V

    invoke-virtual {v0}, Lk6/g;->p()Z

    move-result v0

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    new-instance v2, Ll83/k;

    invoke-direct {v2, v3, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_3

    :catch_0
    move-exception v0

    move-object p2, v0

    goto :goto_2

    :goto_0
    move-object v2, v0

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_0

    :goto_1
    :try_start_3
    throw v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {p2, v2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, v1}, Ljava/lang/Integer;-><init>(I)V

    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, p2, v0}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    goto :goto_3

    :goto_2
    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object p3

    invoke-static {p3}, Lbc3/f0;->o(Lq83/j;)V

    iget-object p3, p0, Ltw2/d;->b:Ltr2/n;

    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p2

    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, p2}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p2

    invoke-interface {p2}, Lj93/d;->getSimpleName()Ljava/lang/String;

    move-result-object p2

    const-string v0, "No usable EXIF orientation, leaving the photo as decoded: "

    invoke-static {v0, p2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    new-array v0, v1, [Lqr2/a$a;

    invoke-interface {p3, p2, v0}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    new-instance p2, Ljava/lang/Integer;

    invoke-direct {p2, v1}, Ljava/lang/Integer;-><init>(I)V

    sget-object p3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    new-instance v2, Ll83/k;

    invoke-direct {v2, p2, p3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_3
    iget-object p2, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p2

    iget-object p3, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-nez p2, :cond_1

    if-nez p3, :cond_1

    return-object p1

    :cond_1
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    if-eqz p3, :cond_2

    const/high16 p3, -0x40800000    # -1.0f

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-virtual {v6, p3, v0}, Landroid/graphics/Matrix;->preScale(FF)Z

    :cond_2
    if-eqz p2, :cond_3

    int-to-float p2, p2

    invoke-virtual {v6, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    :cond_3
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p1

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final j(Landroid/graphics/Bitmap;Ljava/lang/Long;Lq83/d;)Ljava/lang/Object;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Bitmap;",
            "Ljava/lang/Long;",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-interface {p3}, Lq83/d;->getContext()Lq83/j;

    move-result-object v1

    new-instance v3, Lkotlin/jvm/internal/g0;

    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    const/4 p3, 0x0

    :try_start_0
    new-instance v0, Lry2/d;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/16 v5, 0x9

    move-object v4, p0

    move-object v2, p1

    :try_start_1
    invoke-direct/range {v0 .. v5}, Lry2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p2, v0}, Ltw2/f;->b(Ljava/lang/Long;Lkotlin/jvm/functions/Function1;)[B

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    iget-object p2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_1

    if-eq p2, v2, :cond_0

    move-object p3, p2

    :cond_0
    if-eqz p3, :cond_1

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_1
    return-object p1

    :catchall_0
    move-exception v0

    :goto_0
    move-object p1, v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v2, p1

    goto :goto_0

    :goto_1
    iget-object p2, v3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p2, Landroid/graphics/Bitmap;

    if-eqz p2, :cond_3

    if-eq p2, v2, :cond_2

    move-object p3, p2

    :cond_2
    if-eqz p3, :cond_3

    invoke-virtual {p3}, Landroid/graphics/Bitmap;->recycle()V

    :cond_3
    throw p1
.end method

.method private static final k(Lq83/j;Landroid/graphics/Bitmap;Lkotlin/jvm/internal/g0;Ltw2/d;Ltw2/a;)[B
    .locals 1

    const-string v0, "attempt"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lbc3/f0;->o(Lq83/j;)V

    invoke-virtual {p4}, Ltw2/a;->a()Z

    move-result p0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    iget-object p0, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    check-cast p0, Landroid/graphics/Bitmap;

    if-nez p0, :cond_1

    invoke-direct {p3, p1}, Ltw2/d;->l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p1

    iput-object p1, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object p1, p0

    :goto_0
    invoke-virtual {p4}, Ltw2/a;->b()I

    move-result p0

    invoke-direct {p3, p1, p0}, Ltw2/d;->o(Landroid/graphics/Bitmap;I)[B

    move-result-object p0

    return-object p0
.end method

.method private final l(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    div-int/lit8 v0, v0, 0x2

    const/4 v1, 0x1

    if-ge v0, v1, :cond_0

    move v0, v1

    :cond_0
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    div-int/lit8 v2, v2, 0x2

    if-ge v2, v1, :cond_1

    move v2, v1

    :cond_1
    invoke-static {p1, v0, v2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private final m(Landroid/net/Uri;I)I
    .locals 2

    new-instance v0, Landroid/graphics/BitmapFactory$Options;

    invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V

    const/4 v1, 0x1

    iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z

    iget-object v1, p0, Ltw2/d;->a:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v1

    invoke-virtual {v1, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_0

    const/4 v1, 0x0

    :try_start_0
    invoke-static {p1, v1, v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    goto :goto_0

    :catchall_0
    move-exception p2

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_0
    :goto_0
    iget p1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I

    iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I

    invoke-static {p1, v0}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p1, p2}, Ltw2/e;->a(II)I

    move-result p1

    return p1
.end method

.method private final n(Landroid/graphics/Bitmap;I)Landroid/graphics/Bitmap;
    .locals 3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gt v0, p2, :cond_0

    return-object p1

    :cond_0
    int-to-float p2, p2

    int-to-float v0, v0

    div-float/2addr p2, v0

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v0

    int-to-float v0, v0

    mul-float/2addr v0, p2

    float-to-int v0, v0

    const/4 v1, 0x1

    if-ge v0, v1, :cond_1

    move v0, v1

    :cond_1
    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v2

    int-to-float v2, v2

    mul-float/2addr v2, p2

    float-to-int p2, v2

    if-ge p2, v1, :cond_2

    move p2, v1

    :cond_2
    invoke-static {p1, v0, p2, v1}, Landroid/graphics/Bitmap;->createScaledBitmap(Landroid/graphics/Bitmap;IIZ)Landroid/graphics/Bitmap;

    move-result-object p1

    return-object p1
.end method

.method private final o(Landroid/graphics/Bitmap;I)[B
    .locals 3

    const-string v0, "JPEG encoding failed at quality "

    new-instance v1, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V

    :try_start_0
    sget-object v2, Landroid/graphics/Bitmap$CompressFormat;->JPEG:Landroid/graphics/Bitmap$CompressFormat;

    invoke-virtual {p1, v2, p2, v1}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {v1}, Ljava/io/Closeable;->close()V

    const-string p2, "use(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_0
    :try_start_1
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    new-instance p2, Ljava/lang/IllegalStateException;

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw p2
.end method


# virtual methods
.method public a(Ljava/lang/String;Ltw2/b;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ltw2/b;",
            "Lq83/d<",
            "-[B>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Ltw2/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, p0, v2}, Ltw2/d$a;-><init>(Ljava/lang/String;Ltw2/b;Ltw2/d;Lq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
