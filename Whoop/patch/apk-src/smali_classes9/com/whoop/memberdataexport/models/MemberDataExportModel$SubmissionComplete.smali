.class public final Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;
.super Lcom/whoop/memberdataexport/models/MemberDataExportModel;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/memberdataexport/models/MemberDataExportModel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "SubmissionComplete"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0008H\u00c6\u0003J;\u0010\u0017\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0008H\u00c6\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\u0008\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u00d6\u0083\u0004J\n\u0010\u001c\u001a\u00020\u001dH\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0008H\u00d6\u0081\u0004R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0014\u0010\u0004\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0014\u0010\u0005\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000cR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u000cR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;",
        "Lcom/whoop/memberdataexport/models/MemberDataExportModel;",
        "screenTitleDisplay",
        "Lcom/whoop/design/util/TextResource;",
        "headlineDisplay",
        "bodyDisplay",
        "helpLinkTextDisplay",
        "helpLink",
        "",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "getScreenTitleDisplay",
        "()Lcom/whoop/design/util/TextResource;",
        "getHeadlineDisplay",
        "getBodyDisplay",
        "getHelpLinkTextDisplay",
        "getHelpLink",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "copy",
        "equals",
        "",
        "other",
        "",
        "hashCode",
        "",
        "toString",
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

.field private final helpLink:Ljava/lang/String;

.field private final helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

.field private final screenTitleDisplay:Lcom/whoop/design/util/TextResource;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->$stable:I

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 1

    const-string v0, "screenTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headlineDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpLinkTextDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lcom/whoop/memberdataexport/models/MemberDataExportModel;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object p1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;
    .locals 0

    and-int/lit8 p7, p6, 0x1

    if-eqz p7, :cond_0

    iget-object p1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p7, p6, 0x2

    if-eqz p7, :cond_1

    iget-object p2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_2

    iget-object p3, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p7, p6, 0x8

    if-eqz p7, :cond_3

    iget-object p4, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p6, p6, 0x10

    if-eqz p6, :cond_4

    iget-object p5, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    :cond_4
    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p7}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;
    .locals 7

    const-string v0, "screenTitleDisplay"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headlineDisplay"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "bodyDisplay"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpLinkTextDisplay"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "helpLink"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    invoke-direct/range {v1 .. v6}, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public getBodyDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getHeadlineDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getHelpLink()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    return-object v0
.end method

.method public final getHelpLinkTextDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public getScreenTitleDisplay()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 8

    iget-object v0, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->screenTitleDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->headlineDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->bodyDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLinkTextDisplay:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/memberdataexport/models/MemberDataExportModel$SubmissionComplete;->helpLink:Ljava/lang/String;

    const-string v5, ", headlineDisplay="

    const-string v6, ", bodyDisplay="

    const-string v7, "SubmissionComplete(screenTitleDisplay="

    invoke-static {v7, v0, v5, v1, v6}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", helpLinkTextDisplay="

    const-string v5, ", helpLink="

    invoke-static {v0, v2, v1, v3, v5}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v4, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
