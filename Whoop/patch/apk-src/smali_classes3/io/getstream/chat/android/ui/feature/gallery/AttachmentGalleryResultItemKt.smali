.class public final Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItemKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a4\u0010\u0003\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"
    }
    d2 = {
        "toAttachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;",
        "toAttachmentGalleryResultItem",
        "messageId",
        "",
        "parentId",
        "cid",
        "userName",
        "isMine",
        "",
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


# direct methods
.method public static final toAttachment(Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;)Lio/getstream/chat/android/models/Attachment;
    .locals 24

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getAuthorName()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getAuthorLink()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getImageUrl()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getAssetUrl()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getImage()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getType()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getText()Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getTitle()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getFileSize()I

    move-result v10

    invoke-virtual {v1}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;->getMimeType()Ljava/lang/String;

    move-result-object v9

    new-instance v1, Lio/getstream/chat/android/models/Attachment;

    const v22, 0xfc04c

    const/16 v23, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v1 .. v23}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public static final toAttachmentGalleryResultItem(Lio/getstream/chat/android/models/Attachment;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;
    .locals 20

    const-string v0, "<this>"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "messageId"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "cid"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userName"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v1}, Lio/getstream/chat/android/models/Attachment;->getAuthorLink()Ljava/lang/String;

    move-result-object v8

    new-instance v1, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;

    const/16 v18, 0x7e20

    const/16 v19, 0x0

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v3, p2

    move/from16 v6, p5

    invoke-direct/range {v1 .. v19}, Lio/getstream/chat/android/ui/feature/gallery/AttachmentGalleryResultItem;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
