.class public final Lio/getstream/chat/android/client/api2/mapping/UploadFileResponseMappingKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u000c\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000\u00a8\u0006\u0003"
    }
    d2 = {
        "toUploadedFile",
        "Lio/getstream/chat/android/models/UploadedFile;",
        "Lio/getstream/chat/android/client/api/models/UploadFileResponse;",
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


# direct methods
.method public static final toUploadedFile(Lio/getstream/chat/android/client/api/models/UploadFileResponse;)Lio/getstream/chat/android/models/UploadedFile;
    .locals 7

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lio/getstream/chat/android/models/UploadedFile;

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/UploadFileResponse;->getFile()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0}, Lio/getstream/chat/android/client/api/models/UploadFileResponse;->getThumb_url()Ljava/lang/String;

    move-result-object v3

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    invoke-direct/range {v1 .. v6}, Lio/getstream/chat/android/models/UploadedFile;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
