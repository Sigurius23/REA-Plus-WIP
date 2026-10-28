.class public final Lio/getstream/chat/android/models/Attachment$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/getstream/chat/android/models/Attachment;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Builder"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010\u0008\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0008\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003B\u0011\u0008\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0002\u0010\u0006J\u0010\u0010!\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008J\u0010\u0010\"\u001a\u00020\u00002\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008J\u0010\u0010#\u001a\u00020\u00002\u0008\u0010\n\u001a\u0004\u0018\u00010\u0008J\u0010\u0010$\u001a\u00020\u00002\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u0008J\u0010\u0010%\u001a\u00020\u00002\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u0008J\u0010\u0010&\u001a\u00020\u00002\u0008\u0010\r\u001a\u0004\u0018\u00010\u0008J\u0010\u0010\'\u001a\u00020\u00002\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0008J\u0010\u0010(\u001a\u00020\u00002\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0008J\u000e\u0010)\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010*\u001a\u00020\u00002\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0008J\u0010\u0010+\u001a\u00020\u00002\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0008J\u0010\u0010,\u001a\u00020\u00002\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0008J\u0010\u0010-\u001a\u00020\u00002\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0008J\u0010\u0010.\u001a\u00020\u00002\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0008J\u0010\u0010/\u001a\u00020\u00002\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0008J\u0015\u00100\u001a\u00020\u00002\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u00101J\u0015\u00102\u001a\u00020\u00002\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0002\u00101J\u0010\u00103\u001a\u00020\u00002\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001cJ\u0010\u00104\u001a\u00020\u00002\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eJ\u001a\u00105\u001a\u00020\u00002\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010 J\u0006\u00106\u001a\u00020\u0005R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000c\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u0019R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00067"
    }
    d2 = {
        "Lio/getstream/chat/android/models/Attachment$Builder;",
        "",
        "<init>",
        "()V",
        "attachment",
        "Lio/getstream/chat/android/models/Attachment;",
        "(Lio/getstream/chat/android/models/Attachment;)V",
        "authorName",
        "",
        "authorLink",
        "titleLink",
        "thumbUrl",
        "imageUrl",
        "assetUrl",
        "ogUrl",
        "mimeType",
        "fileSize",
        "",
        "title",
        "text",
        "type",
        "image",
        "name",
        "fallback",
        "originalHeight",
        "Ljava/lang/Integer;",
        "originalWidth",
        "upload",
        "Ljava/io/File;",
        "uploadState",
        "Lio/getstream/chat/android/models/Attachment$UploadState;",
        "extraData",
        "",
        "withAuthorName",
        "withAuthorLink",
        "withTitleLink",
        "withThumbUrl",
        "withImageUrl",
        "withAssetUrl",
        "withOgUrl",
        "withMimeType",
        "withFileSize",
        "withTitle",
        "withText",
        "withType",
        "withImage",
        "withName",
        "withFallback",
        "withOriginalHeight",
        "(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Attachment$Builder;",
        "withOriginalWidth",
        "withUpload",
        "withUploadState",
        "withExtraData",
        "build",
        "stream-chat-android-core"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private assetUrl:Ljava/lang/String;

.field private authorLink:Ljava/lang/String;

.field private authorName:Ljava/lang/String;

.field private extraData:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private fallback:Ljava/lang/String;

.field private fileSize:I

.field private image:Ljava/lang/String;

.field private imageUrl:Ljava/lang/String;

.field private mimeType:Ljava/lang/String;

.field private name:Ljava/lang/String;

.field private ogUrl:Ljava/lang/String;

.field private originalHeight:Ljava/lang/Integer;

.field private originalWidth:Ljava/lang/Integer;

.field private text:Ljava/lang/String;

.field private thumbUrl:Ljava/lang/String;

.field private title:Ljava/lang/String;

.field private titleLink:Ljava/lang/String;

.field private type:Ljava/lang/String;

.field private upload:Ljava/io/File;

.field private uploadState:Lio/getstream/chat/android/models/Attachment$UploadState;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    sget-object v0, Lm83/z;->w:Lm83/z;

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->extraData:Ljava/util/Map;

    return-void
.end method

.method public constructor <init>(Lio/getstream/chat/android/models/Attachment;)V
    .locals 1

    const-string v0, "attachment"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Lio/getstream/chat/android/models/Attachment$Builder;-><init>()V

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAuthorName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->authorName:Ljava/lang/String;

    .line 5
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAuthorLink()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->authorLink:Ljava/lang/String;

    .line 6
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitleLink()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->titleLink:Ljava/lang/String;

    .line 7
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getThumbUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->thumbUrl:Ljava/lang/String;

    .line 8
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->imageUrl:Ljava/lang/String;

    .line 9
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->assetUrl:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOgUrl()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->ogUrl:Ljava/lang/String;

    .line 11
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getMimeType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->mimeType:Ljava/lang/String;

    .line 12
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFileSize()I

    move-result v0

    iput v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->fileSize:I

    .line 13
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getTitle()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->title:Ljava/lang/String;

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getText()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->text:Ljava/lang/String;

    .line 15
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getType()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->type:Ljava/lang/String;

    .line 16
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getImage()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->image:Ljava/lang/String;

    .line 17
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->name:Ljava/lang/String;

    .line 18
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getFallback()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->fallback:Ljava/lang/String;

    .line 19
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOriginalHeight()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->originalHeight:Ljava/lang/Integer;

    .line 20
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getOriginalWidth()Ljava/lang/Integer;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->originalWidth:Ljava/lang/Integer;

    .line 21
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->upload:Ljava/io/File;

    .line 22
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getUploadState()Lio/getstream/chat/android/models/Attachment$UploadState;

    move-result-object v0

    iput-object v0, p0, Lio/getstream/chat/android/models/Attachment$Builder;->uploadState:Lio/getstream/chat/android/models/Attachment$UploadState;

    .line 23
    invoke-virtual {p1}, Lio/getstream/chat/android/models/Attachment;->getExtraData()Ljava/util/Map;

    move-result-object p1

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->extraData:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final build()Lio/getstream/chat/android/models/Attachment;
    .locals 23

    move-object/from16 v0, p0

    new-instance v1, Lio/getstream/chat/android/models/Attachment;

    iget-object v2, v0, Lio/getstream/chat/android/models/Attachment$Builder;->authorName:Ljava/lang/String;

    iget-object v3, v0, Lio/getstream/chat/android/models/Attachment$Builder;->authorLink:Ljava/lang/String;

    iget-object v4, v0, Lio/getstream/chat/android/models/Attachment$Builder;->titleLink:Ljava/lang/String;

    iget-object v5, v0, Lio/getstream/chat/android/models/Attachment$Builder;->thumbUrl:Ljava/lang/String;

    iget-object v6, v0, Lio/getstream/chat/android/models/Attachment$Builder;->imageUrl:Ljava/lang/String;

    iget-object v7, v0, Lio/getstream/chat/android/models/Attachment$Builder;->assetUrl:Ljava/lang/String;

    iget-object v8, v0, Lio/getstream/chat/android/models/Attachment$Builder;->ogUrl:Ljava/lang/String;

    iget-object v9, v0, Lio/getstream/chat/android/models/Attachment$Builder;->mimeType:Ljava/lang/String;

    iget v10, v0, Lio/getstream/chat/android/models/Attachment$Builder;->fileSize:I

    iget-object v11, v0, Lio/getstream/chat/android/models/Attachment$Builder;->title:Ljava/lang/String;

    iget-object v12, v0, Lio/getstream/chat/android/models/Attachment$Builder;->text:Ljava/lang/String;

    iget-object v13, v0, Lio/getstream/chat/android/models/Attachment$Builder;->type:Ljava/lang/String;

    iget-object v14, v0, Lio/getstream/chat/android/models/Attachment$Builder;->image:Ljava/lang/String;

    iget-object v15, v0, Lio/getstream/chat/android/models/Attachment$Builder;->name:Ljava/lang/String;

    move-object/from16 v16, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->fallback:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->originalHeight:Ljava/lang/Integer;

    move-object/from16 v18, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->originalWidth:Ljava/lang/Integer;

    move-object/from16 v19, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->upload:Ljava/io/File;

    move-object/from16 v20, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->uploadState:Lio/getstream/chat/android/models/Attachment$UploadState;

    move-object/from16 v21, v1

    iget-object v1, v0, Lio/getstream/chat/android/models/Attachment$Builder;->extraData:Ljava/util/Map;

    move-object/from16 v22, v21

    move-object/from16 v21, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v18

    move-object/from16 v18, v19

    move-object/from16 v19, v20

    move-object/from16 v20, v22

    invoke-direct/range {v1 .. v21}, Lio/getstream/chat/android/models/Attachment;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/io/File;Lio/getstream/chat/android/models/Attachment$UploadState;Ljava/util/Map;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public final withAssetUrl(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->assetUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final withAuthorLink(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->authorLink:Ljava/lang/String;

    return-object p0
.end method

.method public final withAuthorName(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->authorName:Ljava/lang/String;

    return-object p0
.end method

.method public final withExtraData(Ljava/util/Map;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "+",
            "Ljava/lang/Object;",
            ">;)",
            "Lio/getstream/chat/android/models/Attachment$Builder;"
        }
    .end annotation

    const-string v0, "extraData"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->extraData:Ljava/util/Map;

    return-object p0
.end method

.method public final withFallback(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->fallback:Ljava/lang/String;

    return-object p0
.end method

.method public final withFileSize(I)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->fileSize:I

    return-object p0
.end method

.method public final withImage(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->image:Ljava/lang/String;

    return-object p0
.end method

.method public final withImageUrl(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->imageUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final withMimeType(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->mimeType:Ljava/lang/String;

    return-object p0
.end method

.method public final withName(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->name:Ljava/lang/String;

    return-object p0
.end method

.method public final withOgUrl(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->ogUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final withOriginalHeight(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->originalHeight:Ljava/lang/Integer;

    return-object p0
.end method

.method public final withOriginalWidth(Ljava/lang/Integer;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->originalWidth:Ljava/lang/Integer;

    return-object p0
.end method

.method public final withText(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->text:Ljava/lang/String;

    return-object p0
.end method

.method public final withThumbUrl(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->thumbUrl:Ljava/lang/String;

    return-object p0
.end method

.method public final withTitle(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->title:Ljava/lang/String;

    return-object p0
.end method

.method public final withTitleLink(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->titleLink:Ljava/lang/String;

    return-object p0
.end method

.method public final withType(Ljava/lang/String;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->type:Ljava/lang/String;

    return-object p0
.end method

.method public final withUpload(Ljava/io/File;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->upload:Ljava/io/File;

    return-object p0
.end method

.method public final withUploadState(Lio/getstream/chat/android/models/Attachment$UploadState;)Lio/getstream/chat/android/models/Attachment$Builder;
    .locals 0

    iput-object p1, p0, Lio/getstream/chat/android/models/Attachment$Builder;->uploadState:Lio/getstream/chat/android/models/Attachment$UploadState;

    return-object p0
.end method
