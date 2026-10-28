.class public abstract Lb5/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;
    .locals 0

    invoke-static {p0}, Landroid/graphics/drawable/Icon;->createWithAdaptiveBitmapContentUri(Landroid/net/Uri;)Landroid/graphics/drawable/Icon;

    move-result-object p0

    return-object p0
.end method

.method public static b(I)V
    .locals 0

    invoke-static {p0}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    return-void
.end method

.method public static final c(Landroid/media/MediaMetadataRetriever;JILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    new-instance v0, Landroid/media/MediaMetadataRetriever$BitmapParams;

    invoke-direct {v0}, Landroid/media/MediaMetadataRetriever$BitmapParams;-><init>()V

    invoke-virtual {v0, p4}, Landroid/media/MediaMetadataRetriever$BitmapParams;->setPreferredConfig(Landroid/graphics/Bitmap$Config;)V

    invoke-virtual {p0, p1, p2, p3, v0}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, Landroid/media/MediaMetadataRetriever;->getFrameAtTime(JI)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroid/media/MediaMetadataRetriever;JIIILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x1e

    if-lt v0, v1, :cond_0

    move-object v0, p6

    new-instance p6, Landroid/media/MediaMetadataRetriever$BitmapParams;

    invoke-direct {p6}, Landroid/media/MediaMetadataRetriever$BitmapParams;-><init>()V

    invoke-virtual {p6, v0}, Landroid/media/MediaMetadataRetriever$BitmapParams;->setPreferredConfig(Landroid/graphics/Bitmap$Config;)V

    invoke-virtual/range {p0 .. p6}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIIILandroid/media/MediaMetadataRetriever$BitmapParams;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0

    :cond_0
    move p6, p5

    move p5, p4

    move p4, p3

    move-wide p2, p1

    move-object p1, p0

    invoke-virtual/range {p1 .. p6}, Landroid/media/MediaMetadataRetriever;->getScaledFrameAtTime(JIII)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static e(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;
    .locals 2

    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object p0

    new-instance v0, Landroid/content/Intent;

    const-string v1, "androidx.activity.result.contract.action.PICK_IMAGES"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 v1, 0x110000

    invoke-virtual {p0, v0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;

    move-result-object p0

    return-object p0
.end method

.method public static f(Lk/f;)Ljava/lang/String;
    .locals 1

    instance-of v0, p0, Lk/d;

    if-eqz v0, :cond_0

    const-string p0, "image/*"

    return-object p0

    :cond_0
    instance-of v0, p0, Lk/e;

    if-eqz v0, :cond_1

    const-string p0, "video/*"

    return-object p0

    :cond_1
    instance-of p0, p0, Lk/c;

    if-eqz p0, :cond_2

    const/4 p0, 0x0

    return-object p0

    :cond_2
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static g()Z
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x21

    if-lt v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/16 v1, 0x1e

    if-lt v0, v1, :cond_1

    invoke-static {v1}, Landroid/os/ext/SdkExtensions;->getExtensionVersion(I)I

    move-result v0

    const/4 v1, 0x2

    if-lt v0, v1, :cond_1

    :goto_0
    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x0

    return v0
.end method

.method public static h(Landroid/graphics/Canvas;FFFF)Z
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Landroid/graphics/Canvas;->quickReject(FFFF)Z

    move-result p0

    return p0
.end method

.method public static i(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->quickReject(Landroid/graphics/Path;)Z

    move-result p0

    return p0
.end method

.method public static j(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z
    .locals 0

    invoke-virtual {p0, p1}, Landroid/graphics/Canvas;->quickReject(Landroid/graphics/RectF;)Z

    move-result p0

    return p0
.end method

.method public static k(Landroid/view/Window;Z)V
    .locals 2

    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0}, Landroid/view/View;->getSystemUiVisibility()I

    move-result v1

    if-eqz p1, :cond_0

    and-int/lit16 v1, v1, -0x101

    goto :goto_0

    :cond_0
    or-int/lit16 v1, v1, 0x100

    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setSystemUiVisibility(I)V

    invoke-virtual {p0, p1}, Landroid/view/Window;->setDecorFitsSystemWindows(Z)V

    return-void
.end method

.method public static l(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;)V
    .locals 1

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Landroid/view/inputmethod/EditorInfo;->setInitialSurroundingSubText(Ljava/lang/CharSequence;I)V

    return-void
.end method

.method public static m(Landroid/graphics/Outline;Li2/s0;)V
    .locals 1

    instance-of v0, p1, Li2/j;

    if-eqz v0, :cond_0

    check-cast p1, Li2/j;

    iget-object p1, p1, Li2/j;->a:Landroid/graphics/Path;

    invoke-virtual {p0, p1}, Landroid/graphics/Outline;->setPath(Landroid/graphics/Path;)V

    return-void

    :cond_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    const-string p1, "Unable to obtain android.graphics.Path"

    invoke-direct {p0, p1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static n(Landroid/view/Surface;F)V
    .locals 1

    const/4 v0, 0x0

    cmpl-float v0, p1, v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/4 v0, 0x1

    :goto_0
    :try_start_0
    invoke-virtual {p0, p1, v0}, Landroid/view/Surface;->setFrameRate(FI)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0

    return-void

    :catch_0
    move-exception p0

    const-string p1, "VideoFrameReleaseHelper"

    const-string v0, "Failed to call Surface.setFrameRate"

    invoke-static {p1, v0, p0}, Lx8/a;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    return-void
.end method
