.class public final Lcom/whoop/referafriend/domain/models/Promotion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/referafriend/domain/models/Promotion$$serializer;,
        Lcom/whoop/referafriend/domain/models/Promotion$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0012\u0008\u0087\u0008\u0018\u0000 42\u00020\u0001:\u000254B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bBA\u0008\u0010\u0012\u0006\u0010\r\u001a\u00020\u000c\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\u0008\n\u0010\u0010J\'\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J<\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008H\u00c6\u0001\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010%\u001a\u00020$H\u00d6\u0001\u00a2\u0006\u0004\u0008%\u0010&J\u0010\u0010\'\u001a\u00020\u000cH\u00d6\u0001\u00a2\u0006\u0004\u0008\'\u0010(J\u001a\u0010*\u001a\u00020\u00022\u0008\u0010)\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010,\u001a\u0004\u0008-\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010.\u001a\u0004\u0008/\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00100\u001a\u0004\u00081\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00102\u001a\u0004\u00083\u0010!\u00a8\u00066"
    }
    d2 = {
        "Lcom/whoop/referafriend/domain/models/Promotion;",
        "",
        "",
        "complete",
        "Lcom/whoop/referafriend/domain/models/PromotionCard;",
        "card",
        "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;",
        "reward",
        "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;",
        "terms",
        "<init>",
        "(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(IZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$refer_a_friend_release",
        "(Lcom/whoop/referafriend/domain/models/Promotion;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Z",
        "component2",
        "()Lcom/whoop/referafriend/domain/models/PromotionCard;",
        "component3",
        "()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;",
        "component4",
        "()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;",
        "copy",
        "(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)Lcom/whoop/referafriend/domain/models/Promotion;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Z",
        "getComplete",
        "Lcom/whoop/referafriend/domain/models/PromotionCard;",
        "getCard",
        "Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;",
        "getReward",
        "Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;",
        "getTerms",
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

.field public static final Companion:Lcom/whoop/referafriend/domain/models/Promotion$Companion;


# instance fields
.field private final card:Lcom/whoop/referafriend/domain/models/PromotionCard;

.field private final complete:Z

.field private final reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

.field private final terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/referafriend/domain/models/Promotion$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/referafriend/domain/models/Promotion$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/referafriend/domain/models/Promotion;->Companion:Lcom/whoop/referafriend/domain/models/Promotion$Companion;

    sget v0, Lcom/whoop/navigation/e;->d:I

    sput v0, Lcom/whoop/referafriend/domain/models/Promotion;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(IZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/referafriend/domain/models/Promotion$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/Promotion$$serializer;

    invoke-virtual {p6}, Lcom/whoop/referafriend/domain/models/Promotion$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p2, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    iput-object p5, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    return-void
.end method

.method public constructor <init>(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V
    .locals 1

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-boolean p1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    .line 4
    iput-object p2, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    .line 5
    iput-object p3, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    .line 6
    iput-object p4, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/referafriend/domain/models/Promotion;ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;ILjava/lang/Object;)Lcom/whoop/referafriend/domain/models/Promotion;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-boolean p1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/referafriend/domain/models/Promotion;->copy(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)Lcom/whoop/referafriend/domain/models/Promotion;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$refer_a_friend_release(Lcom/whoop/referafriend/domain/models/Promotion;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-boolean v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/PromotionCard$$serializer;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel$$serializer;

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel$$serializer;->INSTANCE:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel$$serializer;

    iget-object p0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    const/4 v1, 0x3

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    return v0
.end method

.method public final component2()Lcom/whoop/referafriend/domain/models/PromotionCard;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    return-object v0
.end method

.method public final component3()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    return-object v0
.end method

.method public final component4()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    return-object v0
.end method

.method public final copy(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)Lcom/whoop/referafriend/domain/models/Promotion;
    .locals 1

    const-string v0, "card"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/referafriend/domain/models/Promotion;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/referafriend/domain/models/Promotion;-><init>(ZLcom/whoop/referafriend/domain/models/PromotionCard;Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/referafriend/domain/models/Promotion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/referafriend/domain/models/Promotion;

    iget-boolean v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    iget-boolean v3, p1, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    iget-object v3, p1, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    iget-object p1, p1, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getCard()Lcom/whoop/referafriend/domain/models/PromotionCard;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    return-object v0
.end method

.method public final getComplete()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    return v0
.end method

.method public final getReward()Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    return-object v0
.end method

.method public final getTerms()Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;
    .locals 1

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    iget-boolean v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    invoke-static {v0}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    invoke-virtual {v1}, Lcom/whoop/referafriend/domain/models/PromotionCard;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    const/4 v2, 0x0

    if-nez v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;->hashCode()I

    move-result v0

    :goto_0
    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    if-nez v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v1, v2

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-boolean v0, p0, Lcom/whoop/referafriend/domain/models/Promotion;->complete:Z

    iget-object v1, p0, Lcom/whoop/referafriend/domain/models/Promotion;->card:Lcom/whoop/referafriend/domain/models/PromotionCard;

    iget-object v2, p0, Lcom/whoop/referafriend/domain/models/Promotion;->reward:Lcom/whoop/referafriend/domain/models/PromotionRewardModalContentModel;

    iget-object v3, p0, Lcom/whoop/referafriend/domain/models/Promotion;->terms:Lcom/whoop/referafriend/domain/models/PromotionTermsModalContentModel;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Promotion(complete="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", card="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", reward="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", terms="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
