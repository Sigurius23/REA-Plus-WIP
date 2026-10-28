.class public interface abstract Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008f\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002H\u00a7@\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t\u00c0\u0006\u0003"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/services/network/MemberDataExportServiceApi;",
        "",
        "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
        "getMemberDataExportDetailsForUser",
        "(Lq83/d;)Ljava/lang/Object;",
        "Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;",
        "body",
        "submitMemberDataExportRequestForUser",
        "(Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;Lq83/d;)Ljava/lang/Object;",
        "member-data-export_release"
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
.method public abstract getMemberDataExportDetailsForUser(Lq83/d;)Ljava/lang/Object;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/f;
        value = "/member-data-export-service/v1/member-data-export-details"
    .end annotation
.end method

.method public abstract submitMemberDataExportRequestForUser(Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;Lq83/d;)Ljava/lang/Object;
    .param p1    # Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;
        .annotation runtime Lwg3/a;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/memberdataexport/models/SubmitMemberDataDto;",
            "Lq83/d<",
            "-",
            "Lcom/whoop/memberdataexport/models/IntermediateMemberDataExportDto;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .annotation runtime Lwg3/o;
        value = "/member-data-export-service/v1/member-data-export-details"
    .end annotation
.end method
