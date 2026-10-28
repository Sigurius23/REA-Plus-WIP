.class public final Lcom/whoop/referafriend/domain/models/PromotionCard;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;,
        Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 62\u00020\u0001:\u000276B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000bBS\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u0005\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\n\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010\u001aJN\u0010!\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008!\u0010\"J\u0010\u0010#\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010\u001aJ\u0010\u0010$\u001a\u00020\u0005H\u00d6\u0001\u00a2\u0006\u0004\u0008$\u0010\u001dJ\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u0010)\u001a\u0004\u0008+\u0010\u001aR \u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0006\u0010,\u0012\u0004\u0008.\u0010/\u001a\u0004\u0008-\u0010\u001dR \u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0007\u0010,\u0012\u0004\u00081\u0010/\u001a\u0004\u00080\u0010\u001dR \u0010\u0008\u001a\u00020\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0008\u0010)\u0012\u0004\u00083\u0010/\u001a\u0004\u00082\u0010\u001aR\"\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010)\u0012\u0004\u00085\u0010/\u001a\u0004\u00084\u0010\u001a\u00a8\u00068"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/PromotionCard;",
        "",
        "",
        "title",
        "body",
        "",
        "referralsCompleted",
        "referralsNeeded",
        "referralProgressText",
        "daysLeftText",
        "<init>",
        "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$refer_a_friend_release",
        "(Lcom/whoop/referafriend/domain/models/PromotionCard;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "component3",
        "()I",
        "component4",
        "component5",
        "component6",
        "copy",
        "(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/PromotionCard;",
        "toString",
        "hashCode",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getTitle",
        "getBody",
        "I",
        "getReferralsCompleted",
        "getReferralsCompleted$annotations",
        "()V",
        "getReferralsNeeded",
        "getReferralsNeeded$annotations",
        "getReferralProgressText",
        "getReferralProgressText$annotations",
        "getDaysLeftText",
        "getDaysLeftText$annotations",
        "Companion",
        "$serializer",
        "refer-a-friend_release"
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
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;


# instance fields
.field private final body:Ljava/lang/String;

.field private final daysLeftText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "days_left_text"
    .end annotation
.end field

.field private final referralProgressText:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "referral_progress_text"
    .end annotation
.end field

.field private final referralsCompleted:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "referrals_completed"
    .end annotation
.end field

.field private final referralsNeeded:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "referrals_needed"
    .end annotation
.end field

.field private final title:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/domain/models/PromotionCard;->Companion:Lcom/whoop/referafriend/domain/models/PromotionCard$Companion;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p8, p1, 0x3f

    const/16 v0, 0x3f

    if-eq v0, p8, :cond_0

    .line 1
    sget-object p8, Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;

    invoke-virtual {p8}, Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p8

    invoke-static {p1, v0, p8}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    iput p4, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    iput p5, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    iput-object p6, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referralProgressText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    .line 5
    iput p3, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    .line 6
    iput p4, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    .line 7
    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    .line 8
    iput-object p6, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/referafriend/domain/models/PromotionCard;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/referafriend/domain/models/PromotionCard;
    .locals 0

    and-int/lit8 p8, p7, 0x1

    if-eqz p8, :cond_0

    iget-object p1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    :cond_0
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_1

    iget-object p2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    :cond_1
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_2

    iget p3, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    :cond_2
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_3

    iget p4, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    :cond_3
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_4

    iget-object p5, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    :cond_4
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_5

    iget-object p6, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    :cond_5
    move-object p7, p5

    move-object p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p8}, Lcom/whoop/referafriend/domain/models/PromotionCard;->copy(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/PromotionCard;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic getDaysLeftText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "days_left_text"
    .end annotation

    return-void
.end method

.method public static synthetic getReferralProgressText$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "referral_progress_text"
    .end annotation

    return-void
.end method

.method public static synthetic getReferralsCompleted$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "referrals_completed"
    .end annotation

    return-void
.end method

.method public static synthetic getReferralsNeeded$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "referrals_needed"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$refer_a_friend_release(Lcom/whoop/referafriend/domain/models/PromotionCard;Lzc3/c;Lyc3/g;)V
    .locals 2

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x1

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    const/4 v0, 0x2

    iget v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x3

    iget v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeIntElement(Lyc3/g;II)V

    const/4 v0, 0x4

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object p0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    const/4 v1, 0x5

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    return v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)Lcom/whoop/referafriend/domain/models/PromotionCard;
    .locals 8

    const-string v0, "title"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "body"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "referralProgressText"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/referafriend/domain/models/PromotionCard;

    move-object v2, p1

    move-object v3, p2

    move v4, p3

    move v5, p4

    move-object v6, p5

    move-object v7, p6

    invoke-direct/range {v1 .. v7}, Lcom/whoop/referafriend/domain/models/PromotionCard;-><init>(Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/referafriend/domain/models/PromotionCard;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    iget v3, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    iget v3, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getBody()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    return-object v0
.end method

.method public final getDaysLeftText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferralProgressText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    return-object v0
.end method

.method public final getReferralsCompleted()I
    .locals 1

    iget v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    return v0
.end method

.method public final getReferralsNeeded()I
    .locals 1

    iget v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    return v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget v2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 9

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->title:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->body:Ljava/lang/String;

    iget v2, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsCompleted:I

    iget v3, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralsNeeded:I

    iget-object v4, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->referralProgressText:Ljava/lang/String;

    iget-object v5, p0, Lcom/whoop/referafriend/domain/models/PromotionCard;->daysLeftText:Ljava/lang/String;

    const-string v6, ", body="

    const-string v7, ", referralsCompleted="

    const-string v8, "PromotionCard(title="

    invoke-static {v8, v0, v6, v1, v7}, Ldc/b;->t(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", referralsNeeded="

    const-string v6, ", referralProgressText="

    invoke-static {v0, v2, v1, v3, v6}, Lr;->v(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    const-string v1, ", daysLeftText="

    const-string v2, ")"

    invoke-static {v0, v4, v1, v5, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
