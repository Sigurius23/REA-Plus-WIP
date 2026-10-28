.class public final Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerControllerKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u000e\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u0002\u001a\u000c\u0010\u0003\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0004"
    }
    d2 = {
        "sourceUriString",
        "",
        "Lio/getstream/chat/android/models/Attachment;",
        "attachmentKey",
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
.method public static final synthetic access$attachmentKey(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerControllerKt;->attachmentKey(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final attachmentKey(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/feature/messages/composer/MessageComposerControllerKt;->sourceUriString(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_2

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    if-nez v0, :cond_0

    move-object v0, v1

    :cond_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result p0

    const-string v2, "fallback:"

    const-string v3, ":"

    invoke-static {v2, v0, v3, v1, v3}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method private static final sourceUriString(Lio/getstream/chat/android/models/Attachment;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p0

    const-string v0, "io.getstream.sourceUri"

    invoke-interface {p0, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method
