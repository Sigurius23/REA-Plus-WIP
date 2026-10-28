.class public final Lfl0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lfl0/g;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u000e\n\u0002\u0008\u0004\u0008\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u001f\u0010\u000c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J \u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0012\u001a\u00020\u000fH\u0096@\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u0008H\u0096@\u00a2\u0006\u0004\u0008\u0016\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Lfl0/d;",
        "Lfl0/g;",
        "Landroid/content/Context;",
        "context",
        "Ltr2/n;",
        "logger",
        "<init>",
        "(Landroid/content/Context;Ltr2/n;)V",
        "Landroid/net/Uri;",
        "uri",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "g",
        "(Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;",
        "Ll83/k;",
        "",
        "c",
        "(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;",
        "sampleSize",
        "a",
        "(Landroid/net/Uri;ILq83/d;)Ljava/lang/Object;",
        "",
        "b",
        "Landroid/content/Context;",
        "Ltr2/n;",
        "bot_release"
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
    iput-object p1, p0, Lfl0/d;->a:Landroid/content/Context;

    .line 3
    iput-object p2, p0, Lfl0/d;->b:Ltr2/n;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ltr2/n;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    .line 4
    sget-object p2, Ltr2/n;->a:Ltr2/n$a;

    const-string p3, "FileSystemProvider"

    invoke-virtual {p2, p3}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object p2

    .line 5
    :cond_0
    invoke-direct {p0, p1, p2}, Lfl0/d;-><init>(Landroid/content/Context;Ltr2/n;)V

    return-void
.end method

.method public static final synthetic d(Lfl0/d;Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 0

    invoke-direct {p0, p1, p2}, Lfl0/d;->g(Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic e(Lfl0/d;)Landroid/content/Context;
    .locals 0

    iget-object p0, p0, Lfl0/d;->a:Landroid/content/Context;

    return-object p0
.end method

.method public static final synthetic f(Lfl0/d;)Ltr2/n;
    .locals 0

    iget-object p0, p0, Lfl0/d;->b:Ltr2/n;

    return-object p0
.end method

.method private final g(Landroid/net/Uri;Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 8

    iget-object v0, p0, Lfl0/d;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p1

    if-eqz p1, :cond_5

    :try_start_0
    new-instance v0, Lk6/g;

    invoke-direct {v0, p1}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lk6/g;->c()I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-interface {p1}, Ljava/io/Closeable;->close()V

    sget-object p1, Lfl0/f;->a:Lfl0/f;

    invoke-virtual {p1, v0}, Lfl0/f;->a(I)Lfl0/f$a;

    move-result-object p1

    invoke-virtual {p1}, Lfl0/f$a;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p2

    :cond_0
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {p1}, Lfl0/f$a;->c()F

    move-result v0

    const/4 v1, 0x0

    cmpg-float v0, v0, v1

    if-nez v0, :cond_1

    goto :goto_0

    :cond_1
    invoke-virtual {p1}, Lfl0/f$a;->c()F

    move-result v0

    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    :goto_0
    invoke-virtual {p1}, Lfl0/f$a;->a()Z

    move-result v0

    const/high16 v1, 0x3f800000    # 1.0f

    const/high16 v2, -0x40800000    # -1.0f

    if-eqz v0, :cond_2

    invoke-virtual {v6, v2, v1}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_2
    invoke-virtual {p1}, Lfl0/f$a;->b()Z

    move-result p1

    if-eqz p1, :cond_3

    invoke-virtual {v6, v1, v2}, Landroid/graphics/Matrix;->postScale(FF)Z

    :cond_3
    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v1, p2

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    return-object p1

    :catchall_0
    move-exception v0

    move-object p2, v0

    :try_start_1
    throw p2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception v0

    invoke-static {p1, p2}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0

    :cond_5
    move-object v1, p2

    iget-object p1, p0, Lfl0/d;->b:Ltr2/n;

    const/4 p2, 0x0

    new-array p2, p2, [Lqr2/a$a;

    const-string v0, "Failed to open input stream for EXIF orientation read; returning bitmap unmodified"

    invoke-interface {p1, v0, p2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v1
.end method


# virtual methods
.method public a(Landroid/net/Uri;ILq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "I",
            "Lq83/d<",
            "-",
            "Landroid/graphics/Bitmap;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lfl0/d$a;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, p2, v2}, Lfl0/d$a;-><init>(Lfl0/d;Landroid/net/Uri;ILq83/d;)V

    invoke-static {v0, v1, p3}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public b(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lfl0/d$b;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p0, v2}, Lfl0/d$b;-><init>(Landroid/net/Uri;Lfl0/d;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public c(Landroid/net/Uri;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Lq83/d<",
            "-",
            "Ll83/k;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    sget-object v0, Lbc3/q0;->a:Lkc3/e;

    sget-object v0, Lkc3/d;->w:Lkc3/d;

    new-instance v1, Lfl0/d$c;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lfl0/d$c;-><init>(Lfl0/d;Landroid/net/Uri;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
