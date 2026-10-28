.class public final Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u00c0\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u000c\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008R\u001b\u0010\u000f\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010\u000c\u001a\u0004\u0008\r\u0010\u000e\u00a8\u0006\u0010"
    }
    d2 = {
        "Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;",
        "",
        "<init>",
        "()V",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/Message;",
        "result",
        "verifyAttachments$stream_chat_android_client_release",
        "(Ln23/h;)Ln23/h;",
        "verifyAttachments",
        "Lb23/k;",
        "logger$delegate",
        "Ll83/h;",
        "getLogger",
        "()Lb23/k;",
        "logger",
        "stream-chat-android-client_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

.field private static final logger$delegate:Ll83/h;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->INSTANCE:Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;

    const-string v1, "Chat:AttachmentVerifier"

    invoke-static {v0, v1}, Landroidx/room/c1;->S(Ljava/lang/Object;Ljava/lang/String;)Ll83/p;

    move-result-object v0

    sput-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->logger$delegate:Ll83/h;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final getLogger()Lb23/k;
    .locals 1

    sget-object v0, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->logger$delegate:Ll83/h;

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lb23/k;

    return-object v0
.end method


# virtual methods
.method public final verifyAttachments$stream_chat_android_client_release(Ln23/h;)Ln23/h;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ln23/h;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "result"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ln23/h;->b()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lio/getstream/chat/android/models/Message;

    if-nez v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->getLogger()Lb23/k;

    move-result-object v1

    invoke-virtual {v1}, Lb23/k;->c()Lb23/e;

    move-result-object v2

    sget-object v3, Lb23/g;->y:Lb23/g;

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v2, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v1}, Lb23/k;->a()Lb23/j;

    move-result-object v2

    invoke-virtual {v1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[verifyAttachments] #uploader; uploadedAttachments: "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v3, v1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getAttachments()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Lio/getstream/chat/android/models/Attachment;

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Attachment;->getUpload()Ljava/io/File;

    move-result-object v4

    if-eqz v4, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Attachment;->getImageUrl()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lio/getstream/chat/android/models/Attachment;->getAssetUrl()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_2

    goto :goto_0

    :cond_3
    const/4 v2, 0x0

    :goto_0
    check-cast v2, Lio/getstream/chat/android/models/Attachment;

    if-nez v2, :cond_4

    :goto_1
    return-object p1

    :cond_4
    invoke-direct {p0}, Lio/getstream/chat/android/client/attachment/AttachmentsVerifier;->getLogger()Lb23/k;

    move-result-object p1

    invoke-virtual {p1}, Lb23/k;->c()Lb23/e;

    move-result-object v1

    sget-object v3, Lb23/g;->F:Lb23/g;

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v1, v3, v4}, Lb23/e;->isLoggable(Lb23/g;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {p1}, Lb23/k;->a()Lb23/j;

    move-result-object v1

    invoke-virtual {p1}, Lb23/k;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "[verifyAttachments] #uploader; message("

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, ") has corrupted attachment: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v3, p1, v4}, Lvp/c;->g0(Lb23/j;Lb23/g;Ljava/lang/String;Ljava/lang/String;)V

    :cond_5
    new-instance p1, Ln23/f;

    new-instance v1, Ln23/a;

    invoke-virtual {v0}, Lio/getstream/chat/android/models/Message;->getId()Ljava/lang/String;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Message("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ") contains corrupted attachment: "

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ln23/a;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, v1}, Ln23/f;-><init>(Ln23/e;)V

    return-object p1
.end method
