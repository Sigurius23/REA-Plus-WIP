.class public final Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u00c1\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\'\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\u0011JM\u0010\u001c\u001a\u00020\u00162\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00082\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00142\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00160\u00182\n\u0008\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;",
        "",
        "<init>",
        "()V",
        "Landroid/graphics/Bitmap;",
        "bitmap",
        "Landroid/net/Uri;",
        "uri",
        "Landroid/content/Context;",
        "context",
        "correctImageOrientation",
        "(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;",
        "",
        "degrees",
        "rotateBitmap",
        "(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;",
        "flipBitmapHorizontal",
        "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;",
        "flipBitmapVertical",
        "selectedImageUri",
        "Lkotlin/Function1;",
        "Lcom/whoop/profile/presentation/edit/EditProfileEvent$ViewEvent;",
        "Ll83/a0;",
        "onEvent",
        "Lkotlin/Function0;",
        "onDismiss",
        "Landroid/graphics/Rect;",
        "cropBounds",
        "processAndUploadAvatar",
        "(Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/graphics/Rect;)V",
        "profile_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    invoke-direct {v0}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;-><init>()V

    sput-object v0, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final correctImageOrientation(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;
    .locals 1

    :try_start_0
    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p2, :cond_6

    :try_start_1
    new-instance p3, Lk6/g;

    invoke-direct {p3, p2}, Lk6/g;-><init>(Ljava/io/InputStream;)V

    invoke-virtual {p3}, Lk6/g;->c()I

    move-result p3

    const/4 v0, 0x2

    if-eq p3, v0, :cond_4

    const/4 v0, 0x3

    if-eq p3, v0, :cond_3

    const/4 v0, 0x4

    if-eq p3, v0, :cond_2

    const/4 v0, 0x6

    if-eq p3, v0, :cond_1

    const/16 v0, 0x8

    if-eq p3, v0, :cond_0

    move-object p3, p1

    goto :goto_0

    :cond_0
    sget-object p3, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    const/high16 v0, 0x43870000    # 270.0f

    invoke-direct {p3, p1, v0}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->rotateBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_0

    :catchall_0
    move-exception p3

    goto :goto_1

    :cond_1
    sget-object p3, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    const/high16 v0, 0x42b40000    # 90.0f

    invoke-direct {p3, p1, v0}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->rotateBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_0

    :cond_2
    sget-object p3, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    invoke-direct {p3, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->flipBitmapVertical(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_0

    :cond_3
    sget-object p3, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    const/high16 v0, 0x43340000    # 180.0f

    invoke-direct {p3, p1, v0}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->rotateBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;

    move-result-object p3

    goto :goto_0

    :cond_4
    sget-object p3, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    invoke-direct {p3, p1}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->flipBitmapHorizontal(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;

    move-result-object p3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :goto_0
    :try_start_2
    invoke-interface {p2}, Ljava/io/Closeable;->close()V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    if-nez p3, :cond_5

    goto :goto_2

    :cond_5
    return-object p3

    :goto_1
    :try_start_3
    throw p3
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    :try_start_4
    invoke-static {p2, p3}, Lva3/l;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    throw v0
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    :catch_0
    :cond_6
    :goto_2
    return-object p1
.end method

.method private final flipBitmapHorizontal(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, -0x40800000    # -1.0f

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "createBitmap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method private final flipBitmapVertical(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;
    .locals 7

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    const/high16 v0, 0x3f800000    # 1.0f

    const/high16 v1, -0x40800000    # -1.0f

    invoke-virtual {v5, v0, v1}, Landroid/graphics/Matrix;->preScale(FF)Z

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string v0, "createBitmap(...)"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method

.method public static synthetic processAndUploadAvatar$default(Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/graphics/Rect;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_0

    const/4 p5, 0x0

    :cond_0
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    invoke-virtual/range {v0 .. v5}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->processAndUploadAvatar(Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/graphics/Rect;)V

    return-void
.end method

.method private final rotateBitmap(Landroid/graphics/Bitmap;F)Landroid/graphics/Bitmap;
    .locals 7

    new-instance v5, Landroid/graphics/Matrix;

    invoke-direct {v5}, Landroid/graphics/Matrix;-><init>()V

    invoke-virtual {v5, p2}, Landroid/graphics/Matrix;->postRotate(F)Z

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    const/4 v6, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v6}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap;

    move-result-object p1

    const-string p2, "createBitmap(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1
.end method


# virtual methods
.method public final processAndUploadAvatar(Landroid/net/Uri;Landroid/content/Context;Lkotlin/jvm/functions/Function1;Lc93/a;Landroid/graphics/Rect;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/net/Uri;",
            "Landroid/content/Context;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroid/graphics/Rect;",
            ")V"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p1, :cond_7

    :try_start_0
    invoke-virtual {p2}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object v0

    invoke-static {v0}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v1

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    :cond_0
    if-eqz v1, :cond_6

    sget-object v0, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;

    invoke-direct {v0, v1, p1, p2}, Lcom/whoop/profile/view/edit/avatar/AvatarUploadUtils;->correctImageOrientation(Landroid/graphics/Bitmap;Landroid/net/Uri;Landroid/content/Context;)Landroid/graphics/Bitmap;

    move-result-object p1

    if-eqz p5, :cond_2

    new-instance p2, Landroid/graphics/Rect;

    iget v0, p5, Landroid/graphics/Rect;->left:I

    const/4 v2, 0x0

    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v3, p5, Landroid/graphics/Rect;->top:I

    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v3

    iget v4, p5, Landroid/graphics/Rect;->right:I

    invoke-static {v3, v4}, Ljava/lang/Math;->min(II)I

    move-result v3

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    iget p5, p5, Landroid/graphics/Rect;->bottom:I

    invoke-static {v4, p5}, Ljava/lang/Math;->min(II)I

    move-result p5

    invoke-direct {p2, v0, v2, v3, p5}, Landroid/graphics/Rect;-><init>(IIII)V

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result p5

    if-lez p5, :cond_1

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p5

    if-lez p5, :cond_1

    iget p5, p2, Landroid/graphics/Rect;->left:I

    iget v0, p2, Landroid/graphics/Rect;->top:I

    invoke-virtual {p2}, Landroid/graphics/Rect;->width()I

    move-result v2

    invoke-virtual {p2}, Landroid/graphics/Rect;->height()I

    move-result p2

    invoke-static {p1, p5, v0, v2, p2}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;

    move-result-object p2

    goto :goto_0

    :cond_1
    move-object p2, p1

    :goto_0
    if-nez p2, :cond_3

    :cond_2
    move-object p2, p1

    :cond_3
    sget-object p5, Lcom/whoop/profile/view/edit/avatar/ImageProcessingUtils;->INSTANCE:Lcom/whoop/profile/view/edit/avatar/ImageProcessingUtils;

    const/16 v0, 0x200

    invoke-virtual {p5, p2, v0, v0}, Lcom/whoop/profile/view/edit/avatar/ImageProcessingUtils;->resizeBitmap(Landroid/graphics/Bitmap;II)Landroid/graphics/Bitmap;

    move-result-object v0

    const/16 v2, 0x55

    invoke-virtual {p5, v0, v2}, Lcom/whoop/profile/view/edit/avatar/ImageProcessingUtils;->bitmapToByteArray(Landroid/graphics/Bitmap;I)[B

    move-result-object p5

    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    new-instance v2, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;

    invoke-direct {v2, p5}, Lcom/whoop/profile/presentation/edit/EditProfileEvent$UploadAvatar;-><init>([B)V

    invoke-interface {p3, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v1}, Landroid/graphics/Bitmap;->recycle()V

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_4

    invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V

    :cond_4
    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->recycle()V

    :cond_5
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->recycle()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_6
    :goto_1
    return-void

    :cond_7
    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method
