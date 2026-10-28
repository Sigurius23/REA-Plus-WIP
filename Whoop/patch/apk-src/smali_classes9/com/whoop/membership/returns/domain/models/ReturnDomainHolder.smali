.class public final Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0019\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u0008\u0081\u0008\u0018\u00002\u00020\u0001B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u0012\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u0012\u0006\u0010\u000c\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\"\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008H\u00c6\u0003J\u000f\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008H\u00c6\u0003J\t\u0010$\u001a\u00020\u0003H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u000fH\u00c6\u0003Jo\u0010\'\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00082\u000e\u0008\u0002\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00082\u0008\u0008\u0002\u0010\u000c\u001a\u00020\u00032\u0008\u0008\u0002\u0010\r\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000fH\u00c6\u0001J\u0014\u0010(\u001a\u00020)2\u0008\u0010*\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010+\u001a\u00020,H\u00d6\u0081\u0004J\n\u0010-\u001a\u00020\u000fH\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0013R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0013R\u0017\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u0018R\u0011\u0010\u000c\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u0013R\u0011\u0010\r\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u0013R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\u00a8\u0006."
    }
    d2 = {
        "Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;",
        "",
        "navbarTitle",
        "Lcom/whoop/design/util/TextResource;",
        "alertTitle",
        "alertSubtitle",
        "instructionsTitle",
        "instructions",
        "",
        "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
        "buttons",
        "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
        "footerText",
        "policyCtaText",
        "policyCtaUrl",
        "",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V",
        "getNavbarTitle",
        "()Lcom/whoop/design/util/TextResource;",
        "getAlertTitle",
        "getAlertSubtitle",
        "getInstructionsTitle",
        "getInstructions",
        "()Ljava/util/List;",
        "getButtons",
        "getFooterText",
        "getPolicyCtaText",
        "getPolicyCtaUrl",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "membership_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final alertSubtitle:Lcom/whoop/design/util/TextResource;

.field private final alertTitle:Lcom/whoop/design/util/TextResource;

.field private final buttons:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final footerText:Lcom/whoop/design/util/TextResource;

.field private final instructions:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
            ">;"
        }
    .end annotation
.end field

.field private final instructionsTitle:Lcom/whoop/design/util/TextResource;

.field private final navbarTitle:Lcom/whoop/design/util/TextResource;

.field private final policyCtaText:Lcom/whoop/design/util/TextResource;

.field private final policyCtaUrl:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, "navbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructionsTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaUrl"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iput-object p2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iput-object p4, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iput-object p5, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    iput-object p6, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    iput-object p7, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    iput-object p8, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget-object p1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-object p2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p3, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p4, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p5, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p6, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p7, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p11, p10, 0x80

    if-eqz p11, :cond_7

    iget-object p8, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    :cond_7
    and-int/lit16 p10, p10, 0x100

    if-eqz p10, :cond_8

    iget-object p9, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    :cond_8
    move-object p10, p8

    move-object p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component3()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
            ">;",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            ")",
            "Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;"
        }
    .end annotation

    const-string v0, "navbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertTitle"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "alertSubtitle"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructionsTitle"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "instructions"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "buttons"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "footerText"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "policyCtaUrl"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-direct/range {v1 .. v10}, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_a

    return v2

    :cond_a
    return v0
.end method

.method public final getAlertSubtitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getAlertTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getButtons()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/DownloadButtonDomainHolder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    return-object v0
.end method

.method public final getFooterText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getInstructions()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/membership/returns/domain/models/InstructionDomainHolder;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    return-object v0
.end method

.method public final getInstructionsTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getNavbarTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPolicyCtaText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getPolicyCtaUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-object v0, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->navbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertTitle:Lcom/whoop/design/util/TextResource;

    iget-object v2, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->alertSubtitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructionsTitle:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->instructions:Ljava/util/List;

    iget-object v5, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->buttons:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->footerText:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaText:Lcom/whoop/design/util/TextResource;

    iget-object v8, p0, Lcom/whoop/membership/returns/domain/models/ReturnDomainHolder;->policyCtaUrl:Ljava/lang/String;

    const-string v9, ", alertTitle="

    const-string v10, ", alertSubtitle="

    const-string v11, "ReturnDomainHolder(navbarTitle="

    invoke-static {v11, v0, v9, v1, v10}, Lte0/d;->q(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", instructionsTitle="

    const-string v9, ", instructions="

    invoke-static {v0, v2, v1, v3, v9}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ", buttons="

    const-string v2, ", footerText="

    invoke-static {v0, v4, v1, v5, v2}, Ljh3/c;->s(Ljava/lang/StringBuilder;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V

    const-string v1, ", policyCtaText="

    const-string v2, ", policyCtaUrl="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-static {v8, v1, v0}, Lm4/a;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
