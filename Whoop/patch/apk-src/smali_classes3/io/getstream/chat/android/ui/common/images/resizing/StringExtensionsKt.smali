.class public final Lio/getstream/chat/android/ui/common/images/resizing/StringExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\u0004"
    }
    d2 = {
        "applyStreamCdnImageResizingIfEnabled",
        "",
        "streamCdnImageResizing",
        "Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;",
        "stream-chat-android-ui-common_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final applyStreamCdnImageResizingIfEnabled(Ljava/lang/String;Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;)Ljava/lang/String;
    .locals 3
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "streamCdnImageResizing"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->getImageResizingEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->getResizedWidthPercentage()F

    move-result v0

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->getResizedHeightPercentage()F

    move-result v1

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->getResizeMode()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;

    move-result-object v2

    invoke-virtual {p1}, Lio/getstream/chat/android/ui/common/images/resizing/StreamCdnImageResizing;->getCropMode()Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;

    move-result-object p1

    invoke-static {p0, v1, v0, v2, p1}, Lio/getstream/chat/android/client/extensions/StringExtensionsKt;->createResizedStreamCdnImageUrl(Ljava/lang/String;FFLio/getstream/chat/android/models/streamcdn/image/StreamCdnResizeImageMode;Lio/getstream/chat/android/models/streamcdn/image/StreamCdnCropImageMode;)Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method
