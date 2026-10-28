.class public final Lio/getstream/chat/android/ui/common/utils/extensions/AttachmentKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u001a\u000c\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0010\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0011\u001a\u00020\u000f*\u00020\u0002\u001a\n\u0010\u0012\u001a\u00020\u000f*\u00020\u0002\" \u0010\u0003\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u0004\u0010\u0005\u001a\u0004\u0008\u0006\u0010\u0007\" \u0010\u0008\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\t\u0010\u0005\u001a\u0004\u0008\n\u0010\u0007\" \u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00028FX\u0087\u0004\u00a2\u0006\u000c\u0012\u0004\u0008\u000c\u0010\u0005\u001a\u0004\u0008\r\u0010\u0007\u00a8\u0006\u0013"
    }
    d2 = {
        "getDisplayableName",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "linkPreviewImageUrl",
        "getLinkPreviewImageUrl$annotations",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "getLinkPreviewImageUrl",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;",
        "linkUrl",
        "getLinkUrl$annotations",
        "getLinkUrl",
        "giphyFallbackPreviewUrl",
        "getGiphyFallbackPreviewUrl$annotations",
        "getGiphyFallbackPreviewUrl",
        "isAnyFileType",
        "",
        "isUploading",
        "isFailed",
        "hasLink",
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
.method public static final getDisplayableName(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lio/getstream/chat/android/ui/common/utils/StringUtils;->INSTANCE:Lio/getstream/chat/android/ui/common/utils/StringUtils;

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :cond_1
    :goto_0
    const-string p0, "HHmmssSSS"

    invoke-virtual {v0, v1, p0}, Lio/getstream/chat/android/ui/common/utils/StringUtils;->removeTimePrefix(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final getGiphyFallbackPreviewUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static synthetic getGiphyFallbackPreviewUrl$annotations(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static final getLinkPreviewImageUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static synthetic getLinkPreviewImageUrl$annotations(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static final getLinkUrl(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    return-object v0
.end method

.method public static synthetic getLinkUrl$annotations(Lio/getstream/chat/android/models/Attachment;)V
    .locals 0
    .annotation runtime Lio/getstream/chat/android/core/internal/InternalStreamChatApi;
    .end annotation

    return-void
.end method

.method public static final hasLink(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isAnyFileType(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isFile(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isVideo(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudio(Lio/getstream/chat/android/models/Attachment;)Z

    move-result v0

    if-nez v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/utils/attachment/AttachmentUtilsKt;->isAudioRecording(Lio/getstream/chat/android/models/Attachment;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method

.method public static final isFailed(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/models/Attachment$UploadState$Failed;

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final isUploading(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/models/Attachment$UploadState$InProgress;

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v0

    instance-of v0, v0, Lio/getstream/chat/android/models/Attachment$UploadState$Idle;

    if-eqz v0, :cond_1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method
