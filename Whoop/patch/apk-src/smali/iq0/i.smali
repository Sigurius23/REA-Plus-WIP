.class public abstract Liq0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\r\u0010\u0008\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroid/content/ContentResolver;",
        "contentResolver",
        "Landroid/net/Uri;",
        "imageUri",
        "Landroid/graphics/Bitmap;",
        "a",
        "(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;",
        "Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "b",
        "()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;",
        "community_release"
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
.method public static final a(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;
    .locals 5

    const-string v0, "contentResolver"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "imageUri"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Ltr2/n;->a:Ltr2/n$a;

    const-string v1, "getBitmapFromUri"

    invoke-virtual {v0, v1}, Ltr2/n$a;->a(Ljava/lang/String;)Ltr2/n;

    move-result-object v0

    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1d

    const/4 v3, 0x0

    const/4 v4, 0x0

    if-ge v1, v2, :cond_0

    :try_start_0
    invoke-static {p0, p1}, Landroid/provider/MediaStore$Images$Media;->getBitmap(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p0

    const-string p1, "Exception occurred while fetching bitmap on api less than 29"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {v0, p1, p0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Landroid/graphics/ImageDecoder;->createSource(Landroid/content/ContentResolver;Landroid/net/Uri;)Landroid/graphics/ImageDecoder$Source;

    move-result-object p0

    const-string p1, "createSource(...)"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    :try_start_1
    invoke-static {p0}, Landroid/graphics/ImageDecoder;->decodeBitmap(Landroid/graphics/ImageDecoder$Source;)Landroid/graphics/Bitmap;

    move-result-object v3
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_0

    :catch_1
    move-exception p0

    const-string p1, "Exception occurred while fetching bitmap on api >= than 29"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {v0, p1, p0, v1}, Ltr2/n;->v(Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :goto_0
    return-object v3
.end method

.method public static final b()Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;
    .locals 10

    new-instance v0, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;

    const/16 v8, 0x7e

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lio/getstream/chat/android/client/notifications/handler/NotificationConfig;-><init>(ZLkotlin/jvm/functions/Function1;Ljava/util/List;Lc93/a;Lc93/a;ZLio/getstream/chat/android/client/token/TokenProvider;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v0
.end method
