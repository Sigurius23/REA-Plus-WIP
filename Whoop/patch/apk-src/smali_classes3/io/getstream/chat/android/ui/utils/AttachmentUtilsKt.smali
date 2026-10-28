.class public final Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000\u001a\u0014\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0007H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0008"
    }
    d2 = {
        "FILE_THUMB_TRANSFORMATION",
        "Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;",
        "loadAttachmentThumb",
        "Lio/getstream/chat/android/ui/common/disposable/Disposable;",
        "Landroid/widget/ImageView;",
        "attachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
        "stream-chat-android-ui-components_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/4 v1, 0x3

    invoke-static {v1}, Lio/getstream/chat/android/ui/utils/extensions/IntKt;->dpToPxPrecise(I)F

    move-result v1

    invoke-direct {v0, v1}, Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;-><init>(F)V

    sput-object v0, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    return-void
.end method

.method public static final loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/models/Attachment;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getVideoThumbnailsEnabled()Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-static {v0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object v0

    invoke-static {p1, v0}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object v1

    :cond_1
    move-object v3, v1

    .line 3
    sget-object v5, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/16 v8, 0x1a

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    .line 4
    invoke-static/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_0
    move-object v0, p0

    .line 5
    invoke-static {p1}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isImage(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    if-eqz p0, :cond_5

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-static {p0}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_3

    goto :goto_1

    .line 6
    :cond_3
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_4

    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getStreamCdnImageResizing()Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;

    move-result-object p1

    invoke-static {p0, p1}, Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;->applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;

    move-result-object v1

    .line 7
    :cond_4
    sget-object v3, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/16 v6, 0x1a

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 8
    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    .line 9
    :cond_5
    :goto_1
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_7

    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object p0

    .line 10
    invoke-static {p1}, Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;->getDisplayableName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_6

    const/16 v1, 0x2e

    .line 11
    invoke-static {v1, v2, v2}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 12
    :cond_6
    invoke-virtual {p0, v1}, Landroid/webkit/MimeTypeMap;->getMimeTypeFromExtension(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_7
    if-eqz p0, :cond_8

    .line 13
    const-string v1, "image"

    const/4 v2, 0x0

    .line 14
    invoke-static {p0, v1, v2}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_8

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v1

    if-eqz v1, :cond_8

    .line 16
    new-instance p0, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;

    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 18
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    const-string v2, "getContext(...)"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {p0, v1, p1}, Lio/getstream/chat/android/ui/common/internal/file/ShareableUriProvider;->getUriForFile(Landroid/content/Context;Ljava/io/File;)Landroid/net/Uri;

    move-result-object v1

    .line 19
    sget-object v3, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/16 v6, 0x1a

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    .line 20
    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    .line 21
    :cond_8
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getMimeTypeIconProvider()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;

    move-result-object p1

    invoke-interface {p1, p0}, Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;->getIconRes(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method

.method public static final loadAttachmentThumb(Landroid/widget/ImageView;Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Lio/getstream/chat/android/ui/common/disposable/Disposable;
    .locals 10

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getType()Ljava/lang/String;

    move-result-object v0

    .line 23
    const-string v1, "video"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 24
    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v3

    .line 25
    sget-object v5, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/16 v8, 0x1a

    const/4 v9, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v2, p0

    .line 26
    invoke-static/range {v2 .. v9}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->loadVideoThumbnail$default(Landroid/widget/ImageView;Landroid/net/Uri;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_0
    move-object v2, p0

    .line 27
    const-string p0, "image"

    invoke-static {v0, p0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getUri()Landroid/net/Uri;

    move-result-object v1

    sget-object v3, Lio/getstream/chat/android/ui/utils/AttachmentUtilsKt;->FILE_THUMB_TRANSFORMATION:Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation$RoundedCorners;

    const/16 v6, 0x1a

    const/4 v7, 0x0

    move-object v0, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v0, v2

    .line 28
    invoke-static {}, Lio/getstream/chat/android/ui/ChatUI;->getMimeTypeIconProvider()Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;

    move-result-object p0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lio/getstream/chat/android/ui/helper/MimeTypeIconProvider;->getIconRes(Ljava/lang/String;)I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const/16 v6, 0x1e

    const/4 v7, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lio/getstream/chat/android/ui/utils/ImageUtilsKt;->load$default(Landroid/widget/ImageView;Ljava/lang/Object;Ljava/lang/Integer;Lio/getstream/chat/android/ui/common/images/internal/StreamImageLoader$ImageTransformation;Lc93/a;Lc93/a;ILjava/lang/Object;)Lio/getstream/chat/android/ui/common/disposable/Disposable;

    move-result-object p0

    return-object p0
.end method
