.class public final Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "STUDY_NOT_STARTED",
        "Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "getSTUDY_NOT_STARTED",
        "()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;",
        "whooplabs_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final STUDY_NOT_STARTED:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    sget-object v5, Lcom/whoop/whooplabs/data/room/entity/StudyStatus;->NOT_STARTED:Lcom/whoop/whooplabs/data/room/entity/StudyStatus;

    const/4 v10, 0x1

    const/4 v11, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v6, -0x1

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v0 .. v11}, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;-><init>(ILorg/joda/time/DateTime;Lorg/joda/time/DateTime;ZLcom/whoop/whooplabs/data/room/entity/StudyStatus;ILjava/lang/String;IZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyKt;->STUDY_NOT_STARTED:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    return-void
.end method

.method public static final getSTUDY_NOT_STARTED()Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;
    .locals 1

    sget-object v0, Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudyKt;->STUDY_NOT_STARTED:Lcom/whoop/whooplabs/data/room/entity/WhoopLabsStudy;

    return-object v0
.end method
