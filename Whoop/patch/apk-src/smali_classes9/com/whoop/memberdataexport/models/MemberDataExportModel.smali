.class public abstract Lcom/whoop/memberdataexport/models/MemberDataExportModel;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;,
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;,
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;,
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;,
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;,
        Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u00087\u0018\u00002\u00020\u0001:\u0006\u000c\r\u000e\u000f\u0010\u0011B\t\u0008\u0004\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007R\u0014\u0010\u0008\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0007R\u0014\u0010\n\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u0007\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "",
        "<init>",
        "()V",
        "screenTitleDisplay",
        "Lcom/whoop/design/util/TextResource;",
        "getScreenTitleDisplay",
        "()Lcom/whoop/design/util/TextResource;",
        "headlineDisplay",
        "getHeadlineDisplay",
        "bodyDisplay",
        "getBodyDisplay",
        "LoadingEmptyMemberDataExportModel",
        "AvailableMemberDataExportModel",
        "SubmittingMemberDataExportModel",
        "UnavailableMemberDataExportModel",
        "SubmissionComplete",
        "ErrorMemberDataExportModel",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$AvailableMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$ErrorMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$LoadingEmptyMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$UnavailableMemberDataExportModel;",
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


# static fields
.field public static final $stable:I


# instance fields
.field private final bodyDisplay:Lcom/whoop/design/util/TextResource;

.field private final headlineDisplay:Lcom/whoop/design/util/TextResource;

.field private final screenTitleDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->$stable:I

    return-void
.end method

.method private constructor <init>()V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    .line 4
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    .line 5
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/memberdataexport/models/MemberDataExportModel;-><init>()V

    return-void
.end method


# virtual methods
.method public getBodyDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getHeadlineDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getScreenTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method
