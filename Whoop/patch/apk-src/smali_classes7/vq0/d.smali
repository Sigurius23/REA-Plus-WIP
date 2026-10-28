.class public final Lvq0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\r\u001a\u0004\u0008\u000e\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u0010\u0011\u001a\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lvq0/d;",
        "",
        "Ljava/io/File;",
        "filesDir",
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Landroid/net/Uri;",
        "uri",
        "<init>",
        "(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;)V",
        "Landroid/graphics/Bitmap;",
        "a",
        "()Landroid/graphics/Bitmap;",
        "Ljava/io/File;",
        "getFilesDir",
        "()Ljava/io/File;",
        "b",
        "Landroid/content/ContentResolver;",
        "getContentResolver",
        "()Landroid/content/ContentResolver;",
        "c",
        "Landroid/net/Uri;",
        "getUri",
        "()Landroid/net/Uri;",
        "Ltr2/o;",
        "d",
        "Ltr2/o;",
        "getLogger",
        "()Ltr2/o;",
        "logger",
        "community_release"
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
.field private final a:Ljava/io/File;

.field private final b:Landroid/content/ContentResolver;

.field private final c:Landroid/net/Uri;

.field private final d:Ltr2/o;


# direct methods
.method public constructor <init>(Ljava/io/File;Landroid/content/ContentResolver;Landroid/net/Uri;)V
    .locals 7

    const-string v0, "filesDir"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "contentResolver"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "uri"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvq0/d;->a:Ljava/io/File;

    iput-object p2, p0, Lvq0/d;->b:Landroid/content/ContentResolver;

    iput-object p3, p0, Lvq0/d;->c:Landroid/net/Uri;

    new-instance v1, Ltr2/o;

    invoke-static {}, Le50/b;->a()Le50/b;

    move-result-object p1

    invoke-virtual {p1}, Le50/b;->d()Ltr2/n;

    move-result-object v2

    const-string p1, "getLogger(...)"

    invoke-static {v2, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const-string v3, "PickedImageReceiver"

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Ltr2/o;-><init>(Ltr2/n;Ljava/lang/String;Ljava/lang/Boolean;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v1, p0, Lvq0/d;->d:Ltr2/o;

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/Bitmap;
    .locals 8
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetWorldWritable"
        }
    .end annotation

    iget-object v0, p0, Lvq0/d;->b:Landroid/content/ContentResolver;

    iget-object v1, p0, Lvq0/d;->c:Landroid/net/Uri;

    invoke-virtual {v0, v1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    const-string v0, "decodeStream(...)"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lk6/g;

    iget-object v2, p0, Lvq0/d;->b:Landroid/content/ContentResolver;

    iget-object v3, p0, Lvq0/d;->c:Landroid/net/Uri;

    invoke-virtual {v2, v3}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v2

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-direct {v0, v2}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {v0}, Lk6/g;->c()I

    move-result v0

    const/4 v2, 0x1

    if-ne v0, v2, :cond_0

    return-object v1

    :cond_0
    new-instance v6, Landroid/graphics/Matrix;

    invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V

    const/4 v2, 0x3

    if-eq v0, v2, :cond_3

    const/4 v2, 0x6

    if-eq v0, v2, :cond_2

    const/16 v2, 0x8

    if-eq v0, v2, :cond_1

    const/4 v0, 0x0

    goto :goto_0

    :cond_1
    const/high16 v0, 0x43870000    # 270.0f

    goto :goto_0

    :cond_2
    const/high16 v0, 0x42b40000    # 90.0f

    goto :goto_0

    :cond_3
    const/high16 v0, 0x43340000    # 180.0f

    :goto_0
    invoke-virtual {v6, v0}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v4

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v5

    const/4 v7, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object v0

    const-string v1, "createBitmap(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method
