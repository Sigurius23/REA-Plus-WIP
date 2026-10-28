.class public interface abstract Lcom/whoop/labfileupload/domain/LabFileUploadApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008f\u0018\u00002\u00020\u0001J0\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\t\u0010\nJ0\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00072\u000e\u0008\u0001\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u000c\u0010\n\u00a8\u0006\r\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/labfileupload/domain/LabFileUploadApi;",
        "",
        "",
        "Lud3/i0;",
        "files",
        "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
        "metadata",
        "Lpg3/v0;",
        "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;",
        "uploadFiles",
        "(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;",
        "",
        "uploadAccessFiles",
        "lab-file-upload_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract uploadAccessFiles(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;
        .annotation runtime Lwg3/q;
            value = "metadata"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lud3/i0;",
            ">;",
            "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Ljava/lang/String;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "advanced-labs-service/v1/advanced-labs/access/upload"
    .end annotation
.end method

.method public abstract uploadFiles(Ljava/util/List;Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;Lq83/d;)Ljava/lang/Object;
    .param p1    # Ljava/util/List;
        .annotation runtime Lwg3/q;
        .end annotation
    .end param
    .param p2    # Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;
        .annotation runtime Lwg3/q;
            value = "metadata"
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lud3/i0;",
            ">;",
            "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadMetadata;",
            "Lq83/d<",
            "-",
            "Lpg3/v0<",
            "Lcom/whoop/labfileupload/domain/models/ExternalDataUploadResponse;",
            ">;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/l;
    .end annotation

    .annotation runtime Lwg3/o;
        value = "advanced-labs-service/v1/advanced-labs/upload"
    .end annotation
.end method
