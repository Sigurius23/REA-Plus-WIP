.class public final Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008%\u0008\u0087\u0008\u0018\u0000 @2\u00020\u0001:\u0002A@BM\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\u000e\u0010\u000fB_\u0008\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u000c\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\u0004\u0008\u000e\u0010\u0013J\'\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\r\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010!J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010!J\u0012\u0010$\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+Jb\u0010,\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00082\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000cH\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0006H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010%J\u0010\u0010/\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008/\u0010+J\u001a\u00101\u001a\u00020\u00022\u0008\u00100\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00081\u00102R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00103\u001a\u0004\u00084\u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00103\u001a\u0004\u00085\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u00103\u001a\u0004\u0008\u0005\u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00106\u001a\u0004\u00087\u0010%R\"\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u00108\u0012\u0004\u0008:\u0010;\u001a\u0004\u00089\u0010\'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000b\u0010<\u001a\u0004\u0008=\u0010)R\u001a\u0010\r\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\r\u0010>\u001a\u0004\u0008?\u0010+\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;",
        "",
        "",
        "requireCreditCard",
        "requireTeamCode",
        "isUsedStrap",
        "",
        "strapMembershipStatus",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;",
        "teamInfo",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;",
        "pairedTextOverride",
        "",
        "numTrialMonths",
        "<init>",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "toOnboardingInfoResponse",
        "()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;",
        "component1",
        "()Ljava/lang/Boolean;",
        "component2",
        "component3",
        "component4",
        "()Ljava/lang/String;",
        "component5",
        "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;",
        "component6",
        "()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;",
        "component7",
        "()I",
        "copy",
        "(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;",
        "toString",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/Boolean;",
        "getRequireCreditCard",
        "getRequireTeamCode",
        "Ljava/lang/String;",
        "getStrapMembershipStatus",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;",
        "getTeamInfo",
        "getTeamInfo$annotations",
        "()V",
        "Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;",
        "getPairedTextOverride",
        "I",
        "getNumTrialMonths",
        "Companion",
        "$serializer",
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

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field public static final Companion:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;


# instance fields
.field private final isUsedStrap:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_used_strap"
    .end annotation
.end field

.field private final numTrialMonths:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "num_trial_months"
    .end annotation
.end field

.field private final pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "paired_text_override"
    .end annotation
.end field

.field private final requireCreditCard:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "require_credit_card"
    .end annotation
.end field

.field private final requireTeamCode:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "require_team_code"
    .end annotation
.end field

.field private final strapMembershipStatus:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "strap_membership_status"
    .end annotation
.end field

.field private final teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "team"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->Companion:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p9, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p9, :cond_0

    .line 1
    sget-object p9, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$$serializer;

    invoke-virtual {p9}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p9

    invoke-static {p1, v0, p9}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    and-int/lit8 p1, p1, 0x40

    if-nez p1, :cond_1

    const/4 p1, 0x0

    iput p1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    return-void

    :cond_1
    iput p8, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    .line 9
    iput p7, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p8, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    move v8, v0

    :goto_0
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move-object v7, p6

    goto :goto_1

    :cond_0
    move/from16 v8, p7

    goto :goto_0

    .line 10
    :goto_1
    invoke-direct/range {v1 .. v8}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;IILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;
    .locals 0

    and-int/lit8 p9, p8, 0x1

    if-eqz p9, :cond_0

    iget-object p1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    :cond_0
    and-int/lit8 p9, p8, 0x2

    if-eqz p9, :cond_1

    iget-object p2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    :cond_1
    and-int/lit8 p9, p8, 0x4

    if-eqz p9, :cond_2

    iget-object p3, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    :cond_2
    and-int/lit8 p9, p8, 0x8

    if-eqz p9, :cond_3

    iget-object p4, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    :cond_3
    and-int/lit8 p9, p8, 0x10

    if-eqz p9, :cond_4

    iget-object p5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    :cond_4
    and-int/lit8 p9, p8, 0x20

    if-eqz p9, :cond_5

    iget-object p6, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    :cond_5
    and-int/lit8 p8, p8, 0x40

    if-eqz p8, :cond_6

    iget p7, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    :cond_6
    move-object p8, p6

    move p9, p7

    move-object p6, p4

    move-object p7, p5

    move-object p4, p2

    move-object p5, p3

    move-object p2, p0

    move-object p3, p1

    invoke-virtual/range {p2 .. p9}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getTeamInfo$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "team"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;Lzc3/c;Lyc3/g;)V
    .locals 3

    sget-object v0, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    const/4 v2, 0x0

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v1, v0, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    const/4 v2, 0x3

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    const/4 v2, 0x4

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto$$serializer;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    const/4 v2, 0x5

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v0, 0x6

    invoke-interface {p1, p2, v0}, Lzc3/c;->shouldEncodeElementDefault(Lyc3/g;I)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    if-eqz v1, :cond_1

    :goto_0
    iget p0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    invoke-interface {p1, p2, v0, p0}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    :cond_1
    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component2()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component3()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    return-object v0
.end method

.method public final component6()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    return-object v0
.end method

.method public final component7()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    return v0
.end method

.method public final copy(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;
    .locals 8

    new-instance v0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;-><init>(Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;I)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    iget p1, p1, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    if-eq v1, p1, :cond_8

    return v2

    :cond_8
    return v0
.end method

.method public final getNumTrialMonths()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    return v0
.end method

.method public final getPairedTextOverride()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    return-object v0
.end method

.method public final getRequireCreditCard()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getRequireTeamCode()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getStrapMembershipStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    return-object v0
.end method

.method public final getTeamInfo()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    if-nez v2, :cond_1

    move v2, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    if-nez v2, :cond_2

    move v2, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    if-nez v2, :cond_4

    move v2, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    if-nez v2, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;->hashCode()I

    move-result v1

    :goto_5
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isUsedStrap()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final toOnboardingInfoResponse()Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;
    .locals 8

    new-instance v0, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    invoke-static {v1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    sget-object v4, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;->Companion:Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus$Companion;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    invoke-virtual {v4, v5}, Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus$Companion;->fromStringOrDefault(Ljava/lang/String;)Lcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;

    move-result-object v4

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;->toOnboardingTeamInfo()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    iget-object v7, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    if-eqz v7, :cond_1

    invoke-virtual {v7}, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;->toOnboardingPairedTextOverride()Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;

    move-result-object v6

    :cond_1
    iget v7, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    invoke-direct/range {v0 .. v7}, Lcom/whoop/data/remote/domain/response/onboarding/OnboardingInfo;-><init>(ZZZLcom/whoop/data/remote/domain/response/onboarding/StrapMembershipStatus;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfo;Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverride;I)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireCreditCard:Ljava/lang/Boolean;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->requireTeamCode:Ljava/lang/Boolean;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->isUsedStrap:Ljava/lang/Boolean;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->strapMembershipStatus:Ljava/lang/String;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->teamInfo:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingTeamInfoDto;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->pairedTextOverride:Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingPairedTextOverrideDto;

    iget v6, p0, Lcom/whoop/data/remote/domain/dto/onboarding/OnboardingInfoDto;->numTrialMonths:I

    new-instance v7, Ljava/lang/StringBuilder;

    const-string v8, "OnboardingInfoDto(requireCreditCard="

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", requireTeamCode="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", isUsedStrap="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", strapMembershipStatus="

    const-string v1, ", teamInfo="

    invoke-static {v2, v0, v3, v1, v7}, Lev/n;->w(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", pairedTextOverride="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numTrialMonths="

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-static {v7, v6, v0}, Lih0/d0;->l(Ljava/lang/StringBuilder;ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
