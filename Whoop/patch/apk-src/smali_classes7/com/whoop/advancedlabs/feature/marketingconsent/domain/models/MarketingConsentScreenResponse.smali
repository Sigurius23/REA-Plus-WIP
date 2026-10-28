.class public final Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$$serializer;,
        Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0010\n\u0002\u0010\u000b\n\u0002\u0008\r\u0008\u0087\u0008\u0018\u0000 02\u00020\u0001:\u000212B\'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0008\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\t\u0010\nBC\u0008\u0010\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0004\u0008\t\u0010\u000fJ\'\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001eJ8\u0010 \u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0006H\u00c6\u0001\u00a2\u0006\u0004\u0008 \u0010!J\u0010\u0010\"\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u0008\"\u0010\u001aJ\u0010\u0010#\u001a\u00020\u000bH\u00d6\u0001\u00a2\u0006\u0004\u0008#\u0010$J\u001a\u0010\'\u001a\u00020&2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010)\u001a\u0004\u0008*\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010+\u001a\u0004\u0008,\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010-\u001a\u0004\u0008.\u0010\u001eR\u0017\u0010\u0008\u001a\u00020\u00068\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010-\u001a\u0004\u0008/\u0010\u001e\u00a8\u00063"
    }
    d2 = {
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;",
        "",
        "",
        "headerImageUrl",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;",
        "consentStep",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;",
        "optedInConfirmation",
        "skippedConfirmation",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)V",
        "",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$advanced_labs_release",
        "(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "component1",
        "()Ljava/lang/String;",
        "component2",
        "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;",
        "component3",
        "()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;",
        "component4",
        "copy",
        "(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Ljava/lang/String;",
        "getHeaderImageUrl",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;",
        "getConsentStep",
        "Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;",
        "getOptedInConfirmation",
        "getSkippedConfirmation",
        "Companion",
        "$serializer",
        "a",
        "advanced-labs_release"
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

.field public static final Companion:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;


# instance fields
.field private final consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

.field private final headerImageUrl:Ljava/lang/String;

.field private final optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

.field private final skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->Companion:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$a;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->$stable:I

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 1

    and-int/lit8 p6, p1, 0xf

    const/16 v0, 0xf

    if-eq v0, p6, :cond_0

    .line 1
    sget-object p6, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$$serializer;

    invoke-virtual {p6}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse$$serializer;->getDescriptor()Lyc3/g;

    move-result-object p6

    invoke-static {p1, v0, p6}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    iput-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    iput-object p5, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)V
    .locals 1

    const-string v0, "headerImageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consentStep"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optedInConfirmation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skippedConfirmation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    .line 4
    iput-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    .line 5
    iput-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    .line 6
    iput-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;ILjava/lang/Object;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;
    .locals 0

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    iget-object p1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    :cond_0
    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_1

    iget-object p2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    :cond_1
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_2

    iget-object p3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    :cond_2
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_3

    iget-object p4, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    :cond_3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->copy(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic write$Self$advanced_labs_release(Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;Lzc3/c;Lyc3/g;)V
    .locals 3

    const/4 v0, 0x0

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v1}, Lzc3/c;->encodeStringElement(Lyc3/g;ILjava/lang/String;)V

    sget-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    const/4 v2, 0x1

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep$$serializer;->INSTANCE:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep$$serializer;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    const/4 v2, 0x2

    invoke-interface {p1, p2, v2, v0, v1}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v1, 0x3

    iget-object p0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    invoke-interface {p1, p2, v1, v0, p0}, Lzc3/c;->encodeSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    return-object v0
.end method

.method public final component3()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-object v0
.end method

.method public final component4()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;
    .locals 1

    const-string v0, "headerImageUrl"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "consentStep"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "optedInConfirmation"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "skippedConfirmation"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    invoke-direct {v0, p1, p2, p3, p4}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;-><init>(Ljava/lang/String;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    iget-object v3, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    iget-object p1, p1, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    return v2

    :cond_5
    return v0
.end method

.method public final getConsentStep()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    return-object v0
.end method

.method public final getHeaderImageUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptedInConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-object v0
.end method

.method public final getSkippedConfirmation()Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;
    .locals 1

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    invoke-virtual {v0}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    invoke-virtual {v1}, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 6

    iget-object v0, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->headerImageUrl:Ljava/lang/String;

    iget-object v1, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->consentStep:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConsentStep;

    iget-object v2, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->optedInConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    iget-object v3, p0, Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/MarketingConsentScreenResponse;->skippedConfirmation:Lcom/whoop/advancedlabs/feature/marketingconsent/domain/models/ConfirmationStep;

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "MarketingConsentScreenResponse(headerImageUrl="

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", consentStep="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", optedInConfirmation="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", skippedConfirmation="

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
