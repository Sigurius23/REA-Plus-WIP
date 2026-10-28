.class public final Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u0018\u0010\u0006\u001a\u00020\u0007*\u00020\u00088@X\u0080\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\t\"\u0017\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000b\u0010\u000c\"\u0017\u0010\r\u001a\u0004\u0018\u00010\u000e*\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010\u0010\"\u0017\u0010\u0011\u001a\u0004\u0018\u00010\u0012*\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0013\u0010\u0014\"\u001d\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u0016*\u00020\u00088F\u00a2\u0006\u0006\u001a\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "ATTACHMENT_TYPE_IMAGE",
        "",
        "ATTACHMENT_TYPE_FILE",
        "EXTRA_UPLOAD_ID",
        "EXTRA_DURATION",
        "EXTRA_WAVEFORM_DATA",
        "isImage",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "(Lio/getstream/chat/android/models/Attachment;)Z",
        "uploadId",
        "getUploadId",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;",
        "duration",
        "",
        "getDuration",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;",
        "durationInMs",
        "",
        "getDurationInMs",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Integer;",
        "waveformData",
        "",
        "getWaveformData",
        "(Lio/getstream/chat/android/models/Attachment;)Ljava/util/List;",
        "stream-chat-android-client_release"
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
.field public static final ATTACHMENT_TYPE_FILE:Ljava/lang/String; = "file"

.field public static final ATTACHMENT_TYPE_IMAGE:Ljava/lang/String; = "image"

.field public static final EXTRA_DURATION:Ljava/lang/String; = "duration"

.field public static final EXTRA_UPLOAD_ID:Ljava/lang/String; = "uploadId"

.field public static final EXTRA_WAVEFORM_DATA:Ljava/lang/String; = "waveform_data"


# direct methods
.method public static final getDuration(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p0

    const-string v0, "duration"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/lang/Number;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ljava/lang/Number;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method

.method public static final getDurationInMs(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Integer;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0}, Lio/getstream/chat/android/client/extensions/AttachmentExtensionsKt;->getDuration(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/Float;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Float;->floatValue()F

    move-result p0

    const/16 v0, 0x3e8

    int-to-float v0, v0

    mul-float/2addr p0, v0

    float-to-int p0, p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final getUploadId(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p0

    const-string v0, "uploadId"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method public static final getWaveformData(Lio/getstream/chat/android/models/Attachment;)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lio/getstream/chat/android/models/Attachment;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p0

    const-string v0, "waveform_data"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ljava/util/List;

    if-eqz v0, :cond_0

    check-cast p0, Ljava/util/List;

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final isImage(Lio/getstream/chat/android/models/Attachment;)Z
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    const-string v1, "image"

    invoke-static {p0, v1, v0}, Lyb3/y;->O(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    return p0

    :cond_0
    return v0
.end method
