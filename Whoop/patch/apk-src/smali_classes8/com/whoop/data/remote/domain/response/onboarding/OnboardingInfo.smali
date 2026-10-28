.class public final Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000e\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0000\n\u0002\u0008\u0010\u0008\u0087\u0008\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000cH\u00c2\u0003\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0012\u0010\u0011J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001aJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\"JZ\u0010#\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010&\u001a\u00020%H\u00d6\u0001\u00a2\u0006\u0004\u0008&\u0010\'J\u0010\u0010(\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008(\u0010\u0011J\u001a\u0010+\u001a\u00020\u00022\u0008\u0010*\u001a\u0004\u0018\u00010)H\u00d6\u0003\u00a2\u0006\u0004\u0008+\u0010,R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010-\u001a\u0004\u0008.\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010-\u001a\u0004\u0008/\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010-\u001a\u0004\u0008\u0005\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u0010\u001eR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u00085\u0010\"R\u0014\u0010\r\u001a\u00020\u000c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\r\u00106R\u0017\u00107\u001a\u00020\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u00087\u00106\u001a\u0004\u00088\u0010\u0011\u00a8\u00069"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "Landroid/os/Parcelable;",
        "",
        "requireCreditCard",
        "requireTeamCode",
        "isUsedStrap",
        "Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;",
        "strapMembershipStatus",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;",
        "teamInfo",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;",
        "pairedTextOverride",
        "",
        "numTrialMonths",
        "<init>",
        "(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V",
        "component7",
        "()I",
        "describeContents",
        "Landroid/os/Parcel;",
        "dest",
        "flags",
        "Ll83/a0;",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "component1",
        "()Z",
        "component2",
        "component3",
        "component4",
        "()Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;",
        "component5",
        "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;",
        "component6",
        "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;",
        "copy",
        "(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getRequireCreditCard",
        "getRequireTeamCode",
        "Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;",
        "getStrapMembershipStatus",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;",
        "getTeamInfo",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;",
        "getPairedTextOverride",
        "I",
        "numScooterTrialMonths",
        "getNumScooterTrialMonths",
        "core_release"
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
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final isUsedStrap:Z

.field private final numScooterTrialMonths:I

.field private final numTrialMonths:I

.field private final pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

.field private final requireCreditCard:Z

.field private final requireTeamCode:Z

.field private final strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

.field private final teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo$Creator;

    invoke-direct {v0}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo$Creator;-><init>()V

    sput-object v0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V
    .locals 1

    const-string v0, "strapMembershipStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    iput-boolean p2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    iput-boolean p3, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    iput-object p4, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    iput p7, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    if-eqz p3, :cond_0

    sget-object p1, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;->ELITE:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    if-eq p4, p1, :cond_0

    sget-object p1, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;->ELITE_GIFT:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    if-ne p4, p1, :cond_1

    :cond_0
    const/4 p7, 0x0

    :cond_1
    iput p7, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numScooterTrialMonths:I

    return-void
.end method

.method private final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    return v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;IILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-boolean p1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-boolean p2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-boolean p3, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move p4, p2

    move p5, p3

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->copy(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    return v0
.end method

.method public final component2()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    return v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    return v0
.end method

.method public final component4()Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    return-object v0
.end method

.method public final component5()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    return-object v0
.end method

.method public final component6()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    return-object v0
.end method

.method public final copy(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
    .locals 9

    const-string v0, "strapMembershipStatus"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    move v2, p1

    move v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    move/from16 v8, p7

    invoke-direct/range {v1 .. v8}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;-><init>(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V

    return-object v1
.end method

.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    iget p1, p1, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getNumScooterTrialMonths()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numScooterTrialMonths:I

    return v0
.end method

.method public final getPairedTextOverride()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    return-object v0
.end method

.method public final getRequireCreditCard()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    return v0
.end method

.method public final getRequireTeamCode()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    return v0
.end method

.method public final getStrapMembershipStatus()Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    return-object v0
.end method

.method public final getTeamInfo()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    const/4 v3, 0x0

    if-nez v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v2, v3

    mul-int/2addr v2, v1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    add-int/2addr v0, v2

    return v0
.end method

.method public final isUsedStrap()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    iget-object v3, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    iget v6, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    const-string v7, ", requireTeamCode="

    const-string v8, ", isUsedStrap="

    const-string v9, "OnboardingInfo(requireCreditCard="

    invoke-static {v9, v7, v8, v0, v1}, Ldc/b;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZ)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", strapMembershipStatus="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", teamInfo="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", pairedTextOverride="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", numTrialMonths="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-static {v0, v6, v1}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 3

    const-string v0, "dest"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireCreditCard:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->requireTeamCode:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->isUsedStrap:Z

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeInt(I)V

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->strapMembershipStatus:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    invoke-virtual {v0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-nez v0, :cond_0

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_0
    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    if-nez v0, :cond_1

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->writeInt(I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeInt(I)V

    invoke-virtual {v0, p1, p2}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;->writeToParcel(Landroid/os/Parcel;I)V

    :goto_1
    iget p2, p0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;->numTrialMonths:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
