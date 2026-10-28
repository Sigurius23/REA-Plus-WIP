.class public final Lio/getstream/chat/android/ui/common/helper/internal/StorageHelperKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "getTitleWithExtension",
        "",
        "Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;",
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
.method public static final synthetic access$getTitleWithExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Lio/getstream/chat/android/ui/common/helper/internal/StorageHelperKt;->getTitleWithExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final getTitleWithExtension(Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;)Ljava/lang/String;
    .locals 5

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const/16 v2, 0x2e

    invoke-static {v2, v0, v0}, Lyb3/r;->F0(CLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getTitle()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_1

    const-string v1, " "

    const-string v3, "_"

    const/4 v4, 0x0

    invoke-static {v2, v1, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, "("

    invoke-static {v1, v2, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const-string v2, ")"

    invoke-static {v1, v2, v3, v4}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    :cond_1
    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_4

    :cond_2
    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_3

    goto :goto_1

    :cond_3
    invoke-static {}, Landroid/webkit/MimeTypeMap;->getSingleton()Landroid/webkit/MimeTypeMap;

    move-result-object v0

    invoke-virtual {p0}, Lio/getstream/chat/android/ui/common/state/messages/composer/AttachmentMetaData;->getMimeType()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/webkit/MimeTypeMap;->getExtensionFromMimeType(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    const-string v0, "."

    invoke-static {v1, v0, p0}, Lih0/d0;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_4
    :goto_1
    if-nez v1, :cond_5

    const-string p0, ""

    return-object p0

    :cond_5
    return-object v1
.end method
