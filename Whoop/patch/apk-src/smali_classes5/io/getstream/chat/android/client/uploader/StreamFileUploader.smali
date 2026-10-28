.class public final Lio/getstream/chat/android/client/uploader/StreamFileUploader;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/getstream/chat/android/client/uploader/FileUploader;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0013\u0010\u0008\u001a\u00020\u0007*\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0008\u0010\tJ=\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J5\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0013\u0010\u0015J=\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0014J5\u0010\u0016\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0016\u0010\u0015J5\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ5\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\'\u0010\u001d\u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u001d\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u0019\u0010\u001fJ\'\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u000fH\u0016\u00a2\u0006\u0004\u0008 \u0010\u001eJ\u001d\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u00112\u0006\u0010\u0017\u001a\u00020\nH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008#\u0010$\u00a8\u0006%"
    }
    d2 = {
        "Lio/getstream/chat/android/client/uploader/StreamFileUploader;",
        "Lio/getstream/chat/android/client/uploader/FileUploader;",
        "Lio/getstream/chat/android/client/api/RetrofitCdnApi;",
        "retrofitCdnApi",
        "<init>",
        "(Lio/getstream/chat/android/client/api/RetrofitCdnApi;)V",
        "Ljava/io/File;",
        "Lud3/i0;",
        "asBodyPart",
        "(Ljava/io/File;)Lud3/i0;",
        "",
        "channelType",
        "channelId",
        "userId",
        "file",
        "Lio/getstream/chat/android/client/utils/ProgressCallback;",
        "callback",
        "Ln23/h;",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "sendFile",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ln23/h;",
        "sendImage",
        "url",
        "Ll83/a0;",
        "deleteFile",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;",
        "deleteImage",
        "progressCallback",
        "uploadFile",
        "(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;",
        "(Ljava/lang/String;)Ln23/h;",
        "uploadImage",
        "Lio/getstream/chat/android/client/api/RetrofitCdnApi;",
        "Lio/getstream/chat/android/client/uploader/FilenameSanitizer;",
        "filenameSanitizer",
        "Lio/getstream/chat/android/client/uploader/FilenameSanitizer;",
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


# instance fields
.field private final filenameSanitizer:Lio/getstream/chat/android/client/uploader/FilenameSanitizer;

.field private final retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;


# direct methods
.method public constructor <init>(Lio/getstream/chat/android/client/api/RetrofitCdnApi;)V
    .locals 1

    const-string v0, "retrofitCdnApi"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    new-instance p1, Lio/getstream/chat/android/client/uploader/FilenameSanitizer;

    invoke-direct {p1}, Lio/getstream/chat/android/client/uploader/FilenameSanitizer;-><init>()V

    iput-object p1, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->filenameSanitizer:Lio/getstream/chat/android/client/uploader/FilenameSanitizer;

    return-void
.end method

.method private final asBodyPart(Ljava/io/File;)Lud3/i0;
    .locals 3

    sget-object v0, Lud3/v0;->Companion:Lud3/u0;

    invoke-static {p1}, Lio/getstream/chat/android/client/extensions/FileExtensionsKt;->getMediaType(Ljava/io/File;)Lud3/h0;

    move-result-object v1

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p1, v1}, Lud3/u0;->a(Ljava/io/File;Lud3/h0;)Lud3/p0;

    move-result-object v0

    iget-object v1, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->filenameSanitizer:Lio/getstream/chat/android/client/uploader/FilenameSanitizer;

    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object p1

    const-string v2, "getName(...)"

    invoke-static {p1, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Lio/getstream/chat/android/client/uploader/FilenameSanitizer;->sanitize(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "file"

    invoke-static {v1, p1, v0}, Lrj/o;->o(Ljava/lang/String;Ljava/lang/String;Lud3/v0;)Lud3/i0;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final deleteFile(Ljava/lang/String;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->deleteFile(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "url"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-interface {p3, p1, p2, p4}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->deleteFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final deleteImage(Ljava/lang/String;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "url"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    iget-object v0, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-interface {v0, p1}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->deleteImage(Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "url"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-interface {p3, p1, p2, p4}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->deleteImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 2
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    invoke-virtual {p1}, Ln23/h;->d()Ln23/h;

    move-result-object p1

    return-object p1
.end method

.method public final sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "file"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    .line 12
    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p4

    const/4 v0, 0x0

    .line 13
    invoke-interface {p3, p1, p2, p4, v0}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->sendFile(Ljava/lang/String;Ljava/lang/String;Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    .line 15
    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    .line 16
    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    .line 17
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    .line 18
    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    .line 19
    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    .line 20
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final sendFile(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "file"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "callback"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    .line 2
    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p4

    .line 3
    invoke-interface {p3, p1, p2, p4, p5}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->sendFile(Ljava/lang/String;Ljava/lang/String;Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    .line 5
    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    .line 6
    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    .line 8
    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    .line 9
    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    .line 10
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "file"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    .line 12
    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p4

    const/4 v0, 0x0

    .line 13
    invoke-interface {p3, p1, p2, p4, v0}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->sendImage(Ljava/lang/String;Ljava/lang/String;Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    .line 15
    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    .line 16
    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    .line 17
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    .line 18
    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    .line 19
    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    .line 20
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final sendImage(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "channelType"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "channelId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userId"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "file"

    invoke-static {p4, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "callback"

    invoke-static {p5, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iget-object p3, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    .line 2
    invoke-direct {p0, p4}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p4

    .line 3
    invoke-interface {p3, p1, p2, p4, p5}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->sendImage(Ljava/lang/String;Ljava/lang/String;Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    .line 4
    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    .line 5
    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    .line 6
    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    .line 7
    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    .line 8
    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    .line 9
    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    .line 10
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final uploadFile(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->uploadFile(Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final uploadImage(Ljava/io/File;Lio/getstream/chat/android/client/utils/ProgressCallback;)Ln23/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/File;",
            "Lio/getstream/chat/android/client/utils/ProgressCallback;",
            ")",
            "Ln23/h;"
        }
    .end annotation

    const-string v0, "file"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->retrofitCdnApi:Lio/getstream/chat/android/client/api/RetrofitCdnApi;

    invoke-direct {p0, p1}, Lio/getstream/chat/android/client/uploader/StreamFileUploader;->asBodyPart(Ljava/io/File;)Lud3/i0;

    move-result-object p1

    invoke-interface {v0, p1, p2}, Lio/getstream/chat/android/client/api/RetrofitCdnApi;->uploadImage(Lud3/i0;Lio/getstream/chat/android/client/utils/ProgressCallback;)Lio/getstream/chat/android/client/call/RetrofitCall;

    move-result-object p1

    invoke-virtual {p1}, Lio/getstream/chat/android/client/call/RetrofitCall;->execute()Ln23/h;

    move-result-object p1

    instance-of p2, p1, Ln23/g;

    if-eqz p2, :cond_0

    check-cast p1, Ln23/g;

    invoke-virtual {p1}, Ln23/g;->e()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/getstream/chat/android/client/api/models/UploadFileResponse;

    invoke-static {p1}, Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;->toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;

    move-result-object p1

    new-instance p2, Ln23/g;

    invoke-direct {p2, p1}, Ln23/g;-><init>(Ljava/lang/Object;)V

    return-object p2

    :cond_0
    instance-of p2, p1, Ln23/f;

    if-eqz p2, :cond_1

    return-object p1

    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
