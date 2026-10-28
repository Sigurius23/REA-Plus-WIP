.class public final Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;
.super Lcom/whoop/memberdataexport/models/MemberDataExportModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/memberdataexport/models/MemberDataExportModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SubmittingMemberDataExportModel"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u000b\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000c\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0014\u0010\r\u001a\u00020\u000e2\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00d6\u0083\u0004J\n\u0010\u0011\u001a\u00020\u0012H\u00d6\u0081\u0004J\n\u0010\u0013\u001a\u00020\u0014H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0007\u0010\u0008R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u0008\u00a8\u0006\u0015"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "submissionLoadingTextDisplay",
        "Lcom/whoop/design/util/TextResource;",
        "submissionSuccessTextDisplay",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
        "getSubmissionLoadingTextDisplay",
        "()Lcom/whoop/design/util/TextResource;",
        "getSubmissionSuccessTextDisplay",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
        "",
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
.field private final submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

.field private final submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1

    const-string v0, "submissionLoadingTextDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submissionSuccessTextDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/memberdataexport/models/MemberDataExportModel;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;
    .locals 1

    const-string v0, "submissionLoadingTextDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "submissionSuccessTextDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    invoke-direct {v0, p1, p2}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public final getSubmissionLoadingTextDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSubmissionSuccessTextDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 5

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionLoadingTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmittingMemberDataExportModel;->submissionSuccessTextDisplay:Lcom/whoop/design/util/TextResource;

    const-string v2, ", submissionSuccessTextDisplay="

    const-string v3, ")"

    const-string v4, "SubmittingMemberDataExportModel(submissionLoadingTextDisplay="

    invoke-static {v4, v0, v2, v1, v3}, Lnh3/a;->e(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
