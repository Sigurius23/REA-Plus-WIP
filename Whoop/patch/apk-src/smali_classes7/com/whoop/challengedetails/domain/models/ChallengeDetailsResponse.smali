.class public final Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$$serializer;,
        Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008#\u0008\u0081\u0008\u0018\u0000 Z2\u00020\u0001:\u0002[ZBo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015B\u0097\u0001\u0008\u0010\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u000c\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u00a2\u0006\u0004\u0008\u0014\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008!\u0010\u001cJ\u0010\u0010\"\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010\u001cJ\u0016\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\nH\u00c6\u0003\u00a2\u0006\u0004\u0008#\u0010$J\u0010\u0010%\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001cJ\u0010\u0010&\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\u001cJ\u0010\u0010\'\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010\u001cJ\u0010\u0010(\u001a\u00020\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010*\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010\u001cJ\u0010\u0010+\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008+\u0010\u001cJ\u0090\u0001\u0010,\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\t\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00102\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0013\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008,\u0010-J\u0010\u0010.\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008.\u0010\u001eJ\u0010\u0010/\u001a\u00020\u0016H\u00d6\u0001\u00a2\u0006\u0004\u0008/\u00100J\u001a\u00102\u001a\u00020\u00062\u0008\u00101\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u00082\u00103J\'\u0010<\u001a\u0002092\u0006\u00104\u001a\u00020\u00002\u0006\u00106\u001a\u0002052\u0006\u00108\u001a\u000207H\u0001\u00a2\u0006\u0004\u0008:\u0010;R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0003\u0010=\u0012\u0004\u0008?\u0010@\u001a\u0004\u0008>\u0010\u001cR \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0005\u0010A\u0012\u0004\u0008C\u0010@\u001a\u0004\u0008B\u0010\u001eR \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010D\u0012\u0004\u0008E\u0010@\u001a\u0004\u0008\u0007\u0010 R\"\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010=\u0012\u0004\u0008G\u0010@\u001a\u0004\u0008F\u0010\u001cR \u0010\t\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010=\u0012\u0004\u0008I\u0010@\u001a\u0004\u0008H\u0010\u001cR&\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000c\u0010J\u0012\u0004\u0008L\u0010@\u001a\u0004\u0008K\u0010$R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010=\u0012\u0004\u0008N\u0010@\u001a\u0004\u0008M\u0010\u001cR \u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000e\u0010=\u0012\u0004\u0008P\u0010@\u001a\u0004\u0008O\u0010\u001cR \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000f\u0010=\u0012\u0004\u0008R\u0010@\u001a\u0004\u0008Q\u0010\u001cR \u0010\u0011\u001a\u00020\u00108\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0011\u0010S\u0012\u0004\u0008U\u0010@\u001a\u0004\u0008T\u0010)R \u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010=\u0012\u0004\u0008W\u0010@\u001a\u0004\u0008V\u0010\u001cR \u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0013\u0010=\u0012\u0004\u0008Y\u0010@\u001a\u0004\u0008X\u0010\u001c\u00a8\u0006\\"
    }
    d2 = {
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;",
        "",
        "Lcom/whoop/design/util/TextResource;",
        "toolbarTitle",
        "",
        "headerImageUrl",
        "",
        "isMemberEligible",
        "ineligibleText",
        "challengeTitle",
        "",
        "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
        "challengeCardItems",
        "descriptionTitle",
        "descriptionText",
        "ctaText",
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
        "style",
        "savingText",
        "savingSubText",
        "<init>",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "component1",
        "()Lcom/whoop/design/util/TextResource;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "()Z",
        "component4",
        "component5",
        "component6",
        "()Ljava/util/List;",
        "component7",
        "component8",
        "component9",
        "component10",
        "()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
        "component11",
        "component12",
        "copy",
        "(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$challenge_details_release",
        "(Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Lcom/whoop/design/util/TextResource;",
        "getToolbarTitle",
        "getToolbarTitle$annotations",
        "()V",
        "Ljava/lang/String;",
        "getHeaderImageUrl",
        "getHeaderImageUrl$annotations",
        "Z",
        "isMemberEligible$annotations",
        "getIneligibleText",
        "getIneligibleText$annotations",
        "getChallengeTitle",
        "getChallengeTitle$annotations",
        "Ljava/util/List;",
        "getChallengeCardItems",
        "getChallengeCardItems$annotations",
        "getDescriptionTitle",
        "getDescriptionTitle$annotations",
        "getDescriptionText",
        "getDescriptionText$annotations",
        "getCtaText",
        "getCtaText$annotations",
        "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
        "getStyle",
        "getStyle$annotations",
        "getSavingText",
        "getSavingText$annotations",
        "getSavingSubText",
        "getSavingSubText$annotations",
        "Companion",
        "$serializer",
        "challenge-details_release"
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
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final $stable:I

.field public static final Companion:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;


# instance fields
.field private final challengeCardItems:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "challenge_card_items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
            ">;"
        }
    .end annotation
.end field

.field private final challengeTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "challenge_title"
    .end annotation
.end field

.field private final ctaText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "cta_text"
    .end annotation
.end field

.field private final descriptionText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_text"
    .end annotation
.end field

.field private final descriptionTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "description_title"
    .end annotation
.end field

.field private final headerImageUrl:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "header_image_url"
    .end annotation
.end field

.field private final ineligibleText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "ineligible_text"
    .end annotation
.end field

.field private final isMemberEligible:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "is_member_eligible"
    .end annotation
.end field

.field private final savingSubText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "saving_sub_text"
    .end annotation
.end field

.field private final savingText:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "saving_text"
    .end annotation
.end field

.field private final style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "style"
    .end annotation
.end field

.field private final toolbarTitle:Lcom/whoop/design/util/TextResource;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "toolbar_title"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->Companion:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->$stable:I

    sget-object v2, Ll83/i;->x:Ll83/i;

    new-instance v3, Lkg2/d;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lkg2/d;-><init>(I)V

    invoke-static {v2, v3}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v3

    new-instance v5, Lkg2/d;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Lkg2/d;-><init>(I)V

    invoke-static {v2, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-array v5, v6, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v5, v6

    const/4 v6, 0x1

    aput-object v1, v5, v6

    const/4 v6, 0x2

    aput-object v1, v5, v6

    const/4 v6, 0x3

    aput-object v1, v5, v6

    const/4 v6, 0x4

    aput-object v1, v5, v6

    const/4 v6, 0x5

    aput-object v3, v5, v6

    const/4 v3, 0x6

    aput-object v1, v5, v3

    const/4 v3, 0x7

    aput-object v1, v5, v3

    aput-object v1, v5, v0

    const/16 v0, 0x9

    aput-object v2, v5, v0

    const/16 v0, 0xa

    aput-object v1, v5, v0

    aput-object v1, v5, v4

    sput-object v5, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit16 p14, p1, 0xfff

    const/16 v0, 0xfff

    if-eq v0, p14, :cond_0

    .line 1
    sget-object p14, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$$serializer;->INSTANCE:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$$serializer;

    invoke-virtual {p14}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p14

    invoke-static {p1, v0, p14}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    iput-object p3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    iput-boolean p4, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    iput-object p5, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    iput-object p6, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    iput-object p7, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    iput-object p8, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    iput-object p9, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    iput-object p10, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iput-object p11, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    iput-object p12, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    iput-object p13, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            ")V"
        }
    .end annotation

    const-string v0, "toolbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerImageUrl"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeTitle"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeCardItems"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionTitle"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionText"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    invoke-static {p10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savingText"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savingSubText"

    invoke-static {p12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    .line 4
    iput-object p2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    .line 6
    iput-object p4, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    .line 7
    iput-object p5, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    .line 8
    iput-object p6, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    .line 9
    iput-object p7, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    .line 10
    iput-object p8, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    .line 11
    iput-object p9, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    .line 12
    iput-object p10, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    .line 13
    iput-object p11, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    .line 14
    iput-object p12, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 2

    new-instance v0, Lkotlinx/serialization/internal/ArrayListSerializer;

    sget-object v1, Lcom/whoop/challengedetails/domain/models/ChallengeCardItem$$serializer;->INSTANCE:Lcom/whoop/challengedetails/domain/models/ChallengeCardItem$$serializer;

    invoke-direct {v0, v1}, Lkotlinx/serialization/internal/ArrayListSerializer;-><init>(Lwc3/c;)V

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->Companion:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;

    invoke-virtual {v0}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILjava/lang/Object;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-object p4, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget-object p5, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-object p6, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-object p7, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-object p10, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-object p11, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    :cond_b
    move-object p13, p11

    move-object p14, p12

    move-object p11, p9

    move-object p12, p10

    move-object p9, p7

    move-object p10, p8

    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getChallengeCardItems$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "challenge_card_items"
    .end annotation

    return-void
.end method

.method public static synthetic getChallengeTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "challenge_title"
    .end annotation

    return-void
.end method

.method public static synthetic getCtaText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "cta_text"
    .end annotation

    return-void
.end method

.method public static synthetic getDescriptionText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_text"
    .end annotation

    return-void
.end method

.method public static synthetic getDescriptionTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "description_title"
    .end annotation

    return-void
.end method

.method public static synthetic getHeaderImageUrl$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "header_image_url"
    .end annotation

    return-void
.end method

.method public static synthetic getIneligibleText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "ineligible_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSavingSubText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "saving_sub_text"
    .end annotation

    return-void
.end method

.method public static synthetic getSavingText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "saving_text"
    .end annotation

    return-void
.end method

.method public static synthetic getStyle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "style"
    .end annotation

    return-void
.end method

.method public static synthetic getToolbarTitle$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "toolbar_title"
    .end annotation

    return-void
.end method

.method public static synthetic isMemberEligible$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "is_member_eligible"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$challenge_details_release(Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;Lzc3/c;Lyc3/g;)V
    .locals 5

    sget-object v0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->$childSerializers:[Ll83/h;

    sget-object v1, Lmd1/a;->a:Lmd1/a;

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x1

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v2, 0x2

    iget-boolean v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    invoke-interface {p1, p2, v2, v3}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/4 v2, 0x3

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x4

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x5

    aget-object v3, v0, v2

    invoke-interface {v3}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwc3/j;

    iget-object v4, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    invoke-interface {p1, p2, v2, v3, v4}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x6

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v2, 0x7

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x8

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v2, v1, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v2, 0x9

    aget-object v0, v0, v2

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-interface {p1, p2, v2, v0, v3}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xa

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, v2}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    iget-object p0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    invoke-interface {p1, p2, v0, v1, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component10()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    return-object v0
.end method

.method public final component11()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component12()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    return v0
.end method

.method public final component4()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component5()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component8()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final component9()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final copy(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/lang/String;",
            "Z",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
            ">;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            ")",
            "Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;"
        }
    .end annotation

    const-string v0, "toolbarTitle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "headerImageUrl"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeTitle"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "challengeCardItems"

    move-object/from16 v7, p6

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionTitle"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "descriptionText"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "ctaText"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "style"

    move-object/from16 v11, p10

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savingText"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "savingSubText"

    move-object/from16 v13, p12

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    move-object v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    invoke-direct/range {v1 .. v13}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/String;ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    iget-boolean v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    iget-object v3, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    iget-object p1, p1, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getChallengeCardItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/challengedetails/domain/models/ChallengeCardItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    return-object v0
.end method

.method public final getChallengeTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getCtaText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDescriptionText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getDescriptionTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getHeaderImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getIneligibleText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSavingSubText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getSavingText()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public final getStyle()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    return-object v0
.end method

.method public final getToolbarTitle()Lcom/whoop/design/util/TextResource;
    .locals 1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    invoke-static {v0, v2, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    invoke-static {v2, v0, v1}, Lr80/c;->a(ILcom/whoop/design/util/TextResource;I)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isMemberEligible()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 15

    iget-object v0, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->toolbarTitle:Lcom/whoop/design/util/TextResource;

    iget-object v1, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->headerImageUrl:Ljava/lang/String;

    iget-boolean v2, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->isMemberEligible:Z

    iget-object v3, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ineligibleText:Lcom/whoop/design/util/TextResource;

    iget-object v4, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeTitle:Lcom/whoop/design/util/TextResource;

    iget-object v5, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->challengeCardItems:Ljava/util/List;

    iget-object v6, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionTitle:Lcom/whoop/design/util/TextResource;

    iget-object v7, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->descriptionText:Lcom/whoop/design/util/TextResource;

    iget-object v8, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->ctaText:Lcom/whoop/design/util/TextResource;

    iget-object v9, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->style:Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    iget-object v10, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingText:Lcom/whoop/design/util/TextResource;

    iget-object v11, p0, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsResponse;->savingSubText:Lcom/whoop/design/util/TextResource;

    const-string v12, ", headerImageUrl="

    const-string v13, ", isMemberEligible="

    const-string v14, "ChallengeDetailsResponse(toolbarTitle="

    invoke-static {v14, v0, v12, v1, v13}, Lq63/c;->o(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", ineligibleText="

    const-string v12, ", challengeTitle="

    invoke-static {v3, v1, v12, v0, v2}, Ljh3/c;->o(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    const-string v1, ", challengeCardItems="

    const-string v2, ", descriptionTitle="

    invoke-static {v4, v1, v2, v0, v5}, Ljh3/c;->n(Lcom/whoop/design/util/TextResource;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Ljava/util/List;)V

    const-string v1, ", descriptionText="

    const-string v2, ", ctaText="

    invoke-static {v0, v6, v1, v7, v2}, Lq63/c;->y(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)V

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", style="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", savingText="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", savingSubText="

    const-string v2, ")"

    invoke-static {v0, v10, v1, v11, v2}, Lte0/d;->n(Ljava/lang/StringBuilder;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
